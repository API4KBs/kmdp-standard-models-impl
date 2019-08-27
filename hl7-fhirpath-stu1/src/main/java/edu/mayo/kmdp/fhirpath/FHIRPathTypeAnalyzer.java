/**
 * Copyright © 2018 Mayo Clinic (RSTKNOWLEDGEMGMT@mayo.edu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package edu.mayo.kmdp.fhirpath;

import ca.uhn.fhir.context.FhirContext;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hl7.fhir.dstu3.hapi.ctx.HapiWorkerContext;
import org.hl7.fhir.dstu3.hapi.ctx.IValidationSupport;
import org.hl7.fhir.dstu3.hapi.validation.DefaultProfileValidationSupport;
import org.hl7.fhir.dstu3.model.ElementDefinition;
import org.hl7.fhir.dstu3.model.Enumerations;
import org.hl7.fhir.dstu3.model.Enumerations.DataType;
import org.hl7.fhir.dstu3.model.ExpressionNode;
import org.hl7.fhir.dstu3.model.ExpressionNode.Function;
import org.hl7.fhir.dstu3.model.ResourceType;
import org.hl7.fhir.dstu3.model.StructureDefinition;
import org.hl7.fhir.dstu3.utils.FHIRPathEngine;
import org.hl7.fhir.exceptions.FHIRException;

public class FHIRPathTypeAnalyzer {

  private static Logger logger = LogManager.getLogger(FHIRPathTypeAnalyzer.class);

  private IValidationSupport validator = new DefaultProfileValidationSupport();
  private FhirContext fhirContext = FhirContext.forDstu3();
  private FHIRPathEngine fhirPath3Engine = new FHIRPathEngine(
      new HapiWorkerContext(fhirContext, validator));

  public FHIRPathTypeAnalyzer() {
    validator.fetchAllStructureDefinitions(fhirContext);
  }

  public Optional<DataType> inferType(String pathExpression) {
    try {
      ExpressionNode rootNode = fhirPath3Engine.parse(pathExpression);
      return Optional.ofNullable(process(rootNode, null, ResourceType.Bundle));
    } catch (FHIRException fe) {
      logger.warn(fe.getMessage(), fe);
      return Optional.empty();
    }
  }

  private DataType process(
      ExpressionNode rootNode, Enumerations.DataType dataType, ResourceType resourceType) {
    if (rootNode == null) {
      return dataType;
    }
    switch (rootNode.getKind()) {
      case Name:
        return processStep(rootNode, dataType, resourceType);
      case Constant:
        throw new UnsupportedOperationException();
      case Function:
        return processFunction(rootNode.getFunction(), rootNode);
      case Group:
        throw new UnsupportedOperationException();
    }
    throw new UnsupportedOperationException();
  }

  private DataType processStep(ExpressionNode node,
      DataType dataType, ResourceType resourceType) {
    String step = node.getName();

    if (isResource(step)) {
      return process(node.getInner(), null, ResourceType.fromCode(step));
    } else if (resourceType == null && isDatatype(step)) {
      return DataType.fromCode(step);
    } else if (resourceType != null) {
      return processElement(node, step, resourceType);
    } else {
      throw new UnsupportedOperationException(" Unable to determine type for expression " + node);
    }
  }

  private DataType processElement(ExpressionNode node, String step,
      ResourceType resourceType) {
    ElementDefinition element = asElement(step, resourceType)
        .orElseThrow(UnsupportedOperationException::new);
    if (element.getType().size() > 1) {
      return process(node.getInner(), DataType.BACKBONEELEMENT, null);
    }
    String type = element.getTypeFirstRep().getCode();
    if (isResource(type)) {
      return process(node.getInner(), null, ResourceType.fromCode(type));
    } else if (isDatatype(type)) {
      return process(node.getInner(), DataType.fromCode(type), null);
    } else {
      throw new UnsupportedOperationException();
    }
  }

  private Optional<ElementDefinition> asElement(String step, ResourceType resourceType) {
    StructureDefinition schema = validator.fetchStructureDefinition(
        fhirContext, resourceType.name());
    if (schema == null) {
      return Optional.empty();
    }
    Optional<ElementDefinition> elem = tryGetElement(schema, resourceType, step);
    if (!elem.isPresent()) {
      elem = tryGetElement(schema, resourceType, step + "[x]");
    }
    return elem;
  }

  private Optional<ElementDefinition> tryGetElement(StructureDefinition schema,
      ResourceType resourceType, String step) {
    if (schema.getDifferential() == null || schema.getDifferential().getElement() == null) {
      return Optional.empty();
    }
    return schema.getDifferential().getElement().stream()
        .filter(elDef -> elDef.getPath() != null
            && elDef.getPath().equals(resourceType.name() + "." + step))
        .findFirst();
  }

  private boolean isResource(String code) {
    try {
      return ResourceType.fromCode(code) != null;
    } catch (FHIRException fe) {
      return false;
    }
  }

  private boolean isDatatype(String code) {
    try {
      return DataType.fromCode(code) != null;
    } catch (FHIRException fe) {
      return false;
    }
  }

  private DataType processFunction(Function function, ExpressionNode rootNode) {
    switch (function) {
      case Not:
        return DataType.BOOLEAN;
      case Empty:
        return DataType.BOOLEAN;
      case As:
        return process(rootNode.getParameters().get(0), null, null);
      default:
        return DataType.BOOLEAN;
    }
  }


}
