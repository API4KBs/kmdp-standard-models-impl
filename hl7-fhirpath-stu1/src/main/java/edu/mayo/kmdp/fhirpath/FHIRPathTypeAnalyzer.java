/**
 * Copyright © 2018 Mayo Clinic (RSTKNOWLEDGEMGMT@mayo.edu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.mayo.kmdp.fhirpath;

import ca.uhn.fhir.context.FhirContext;
import java.util.Optional;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.hl7.fhir.dstu3.hapi.ctx.HapiWorkerContext;
import org.hl7.fhir.dstu3.hapi.ctx.IValidationSupport;
import org.hl7.fhir.dstu3.hapi.validation.DefaultProfileValidationSupport;
import org.hl7.fhir.dstu3.model.ElementDefinition;
import org.hl7.fhir.dstu3.model.Enumerations.DataType;
import org.hl7.fhir.dstu3.model.Enumerations.FHIRAllTypes;
import org.hl7.fhir.dstu3.model.ExpressionNode;
import org.hl7.fhir.dstu3.model.ExpressionNode.Function;
import org.hl7.fhir.dstu3.model.ResourceType;
import org.hl7.fhir.dstu3.model.StructureDefinition;
import org.hl7.fhir.dstu3.utils.FHIRPathEngine;
import org.hl7.fhir.exceptions.FHIRException;

public class FHIRPathTypeAnalyzer {

  private static Logger logger = LoggerFactory.getLogger(FHIRPathTypeAnalyzer.class);

  private IValidationSupport validator = new DefaultProfileValidationSupport();
  private FhirContext fhirContext = FhirContext.forDstu3();
  private FHIRPathEngine fhirPath3Engine = new FHIRPathEngine(
      new HapiWorkerContext(fhirContext, validator));

  public FHIRPathTypeAnalyzer() {
    validator.fetchAllStructureDefinitions(fhirContext);
  }

  public Optional<FHIRAllTypes> inferType(String pathExpression) {
    return inferType(pathExpression,true);
  }

  public Optional<FHIRAllTypes> inferType(String pathExpression, boolean lenient) {
    try {
      ExpressionNode rootNode = fhirPath3Engine.parse(pathExpression);
      FHIRAllTypes rootType =
          isResource(rootNode.getName())
              ? FHIRAllTypes.fromCode(rootNode.getName())
              : FHIRAllTypes.BUNDLE;
      return Optional.ofNullable(process(rootNode, rootType));
    } catch (FHIRException fe) {
      if (lenient) {
        logger.trace(fe.getMessage(), fe);
        return Optional.empty();
      } else {
        throw new IllegalStateException(fe);
      }
    }
  }

  private FHIRAllTypes process(
      ExpressionNode rootNode, FHIRAllTypes type) {
    if (rootNode == null) {
      return type;
    }
    switch (rootNode.getKind()) {
      case Name:
        return processStep(rootNode, type);
      case Constant:
        throw new UnsupportedOperationException();
      case Function:
        return processFunction(rootNode.getFunction(), rootNode, type);
      case Group:
        throw new UnsupportedOperationException();
    }
    throw new UnsupportedOperationException();
  }

  private FHIRAllTypes processStep(ExpressionNode node, FHIRAllTypes type) {
    String step = node.getName();

    if (isResource(step)) {
      return process(node.getInner(), FHIRAllTypes.fromCode(step));
    } else if (type == null && isDatatype(step)) {
      return FHIRAllTypes.fromCode(step);
    } else if (type != null) {
      return processElement(node, step, type);
    } else {
      throw new UnsupportedOperationException(" Unable to determine type for expression " + node);
    }
  }

  private FHIRAllTypes processElement(ExpressionNode node, String elementName, FHIRAllTypes type) {
    if ("resource".equals(elementName)) {
      return process(node.getInner(),FHIRAllTypes.RESOURCE);
    }
    ElementDefinition element = asElement(elementName, type)
        .orElseThrow(UnsupportedOperationException::new);
    if (element == null || element.getType().size() > 1) {
      return process(node.getInner(), FHIRAllTypes.BACKBONEELEMENT);
    }
    String typeStr = element.getTypeFirstRep().getCode();
    if (isResource(typeStr)) {
      return process(node.getInner(), FHIRAllTypes.fromCode(typeStr));
    } else if (isDatatype(typeStr)) {
      return process(node.getInner(), FHIRAllTypes.fromCode(typeStr));
    } else {
      throw new UnsupportedOperationException();
    }
  }

  private Optional<ElementDefinition> asElement(String step, FHIRAllTypes type) {
    StructureDefinition schema =
        validator.fetchStructureDefinition(fhirContext, type.toCode());
    if (schema == null) {
      return Optional.empty();
    }
    Optional<ElementDefinition> elem = tryGetElement(schema, type, step);
    if (!elem.isPresent()) {
      elem = tryGetElement(schema, type, step + "[x]");
    }
    return elem;
  }

  private Optional<ElementDefinition> tryGetElement(StructureDefinition schema,
      FHIRAllTypes resourceType, String step) {
    if (schema.getDifferential() == null || schema.getDifferential().getElement() == null) {
      return Optional.empty();
    }
    return schema.getDifferential().getElement().stream()
        .filter(elDef -> elDef.getPath() != null
            && elDef.getPath().equals(resourceType.toCode() + "." + step))
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

  private FHIRAllTypes processFunction(Function function, ExpressionNode rootNode, FHIRAllTypes type) {
    switch (function) {
      case Not:
      case Exists:
      case Empty:
        return FHIRAllTypes.BOOLEAN;
      case As:
        FHIRAllTypes castType = FHIRAllTypes.fromCode(rootNode.getParameters().get(0).toString());
        return process(rootNode.getInner(),castType);
      case First:
        return process(rootNode.getInner(),type);
      default:
        return FHIRAllTypes.NULL;
    }
  }


}
