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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.support.DefaultProfileValidationSupport;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.hl7.fhir.dstu3.hapi.ctx.HapiWorkerContext;
import org.hl7.fhir.dstu3.model.Base;
import org.hl7.fhir.dstu3.model.BaseResource;
import org.hl7.fhir.dstu3.model.BooleanType;
import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Condition;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Dosage;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Enumerations;
import org.hl7.fhir.dstu3.model.Enumerations.AdministrativeGender;
import org.hl7.fhir.dstu3.model.Enumerations.FHIRAllTypes;
import org.hl7.fhir.dstu3.model.MedicationStatement;
import org.hl7.fhir.dstu3.model.Observation;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Quantity;
import org.hl7.fhir.dstu3.utils.FHIRPathEngine;
import org.junit.jupiter.api.Test;

class FhirPathEvaluatedAnalysisTest {

  private static final FHIRPathTypeAnalyzer analyzer = new FHIRPathTypeAnalyzer();
  private static final FhirPathProcessor processor = new FhirPathProcessor();
  
  @Test
  void testNonEmptyBundle() {
    Bundle bundle = new Bundle()
        .addEntry(new Bundle.BundleEntryComponent()
            .setResource(new Observation()).setFullUrl("/#Observation"));
    checkInferred(
        "entry.empty()",
        bundle,
        BooleanType.class);
  }

  @Test
  void testEmptyBundleNot() {
    Bundle bundle = new Bundle()
        .addEntry(new Bundle.BundleEntryComponent()
            .setResource(new Condition()).setFullUrl("/#Condition"));
    checkInferred(
        "empty().not()",
        bundle,
        BooleanType.class);
  }

  @Test
  void testBundleExists() {
    Bundle bundle = new Bundle();
    checkInferred(
        "Bundle.entry.exists()",
        bundle,
        BooleanType.class);
  }

  @Test
  void testBundleSingle() {
    Observation obs = new Observation();
    Bundle bundle = new Bundle()
        .addEntry(new Bundle.BundleEntryComponent().setResource(obs).setFullUrl("/url"));
    checkInferred(
        "entry.first().resource.as(Observation)",
        bundle,
        Observation.class);
  }

  @Test
  void testBundleSingleValue() {
    Observation obs = new Observation();
    obs.setValue(new Quantity().setValue(10));
    Bundle bundle = new Bundle()
        .addEntry(new Bundle.BundleEntryComponent().setResource(obs).setFullUrl("/#Observation"));

    checkInferred(
        "Bundle.entry.first().resource.as(Observation).value.as(Quantity)",
        bundle,
        Quantity.class);
  }


  @Test
  void testResourceTypeInBundle() {
    Observation obs = new Observation();
    Bundle bundle = new Bundle()
        .addEntry(new Bundle.BundleEntryComponent().setResource(obs).setFullUrl("/O1"));
    bundle.addEntry(new Bundle.BundleEntryComponent().setResource(obs).setFullUrl("/O2"));

    checkInferred(
        "entry.first().resource.as(Observation)",
        bundle,
        Observation.class);
  }

  @Test
  void testGetValue() {
    Observation obs = new Observation();
    BooleanType value = new BooleanType(false);
    obs.setValue(value);
    Bundle bundle = new Bundle()
        .addEntry(new Bundle.BundleEntryComponent().setResource(obs).setFullUrl("#O"));

    checkInferred(
        "entry.first().resource.as(Observation).value.as(boolean)",
        bundle,
        BooleanType.class);
  }


  @Test
  void testGetValueEmptyResourceBundle() {
    Bundle bundle = new Bundle();

    checkInferred(
        "entry.first().resource.empty()",
        bundle,
        BooleanType.class);
  }

  @Test
  void testGetFirstValue() {
    Observation obs = new Observation();
    BooleanType value = new BooleanType(false);
    obs.setValue(value);

    checkInferred(
        "Observation.value.as(boolean)",
        obs,
        BooleanType.class);
  }

  @Test
  void testGetCode() {
    Observation obs = new Observation();
    CodeableConcept code = new CodeableConcept();
    obs.setCode(code);

    checkInferred(
        "Observation.code",
        obs,
        CodeableConcept.class);
  }

  @Test
  void testGetGender() {
    Patient pt = new Patient();
    pt.setGender(Enumerations.AdministrativeGender.UNKNOWN);

    checkInferred(
        "Patient.gender",
        pt,
        AdministrativeGender.class);
  }

  @Test
  void testMedicationDosage() {
    MedicationStatement med = new MedicationStatement()
        .setDosage(Collections.singletonList(new Dosage()));
    checkInferred(
        "MedicationStatement.dosage",
        med,
        Dosage.class);
  }

  @Test
  void testConditionOnset() {
    Condition med = new Condition()
        .setOnset(new DateTimeType().setValue(new Date()));
    checkInferred(
        "Condition.onset.as(dateTime)",
        med,
        DateTimeType.class);
  }



  private void checkInferred(String fhirPath, Base bundle, Class<?> type) {
    checkMatch(
        processor.process(bundle, fhirPath),
        infer(fhirPath),
        type);
  }

  private FHIRAllTypes infer(String fhirPath) {
    Optional<FHIRAllTypes> inferredType = analyzer.inferType(fhirPath);
    assertTrue(inferredType.isPresent());
    return inferredType.orElse(null);
  }

  private void checkMatch(Base value, FHIRAllTypes inferredType, Class<?> expectedClass) {
    assertNotNull(value);
    assertNotNull(inferredType);

    // Check that the expression's resulting value on test data is an instance of the expected class
    if (expectedClass.isEnum()) {
      assertTrue(value instanceof Enumeration);
      Enumeration<?> e = (Enumeration<?>) value;
      assertTrue(Arrays.binarySearch(expectedClass.getEnumConstants(), e.getValue()) >= 0);
    } else {
      assertTrue(expectedClass.isInstance(value));
    }

    String fhirTypeName = value.fhirType();
    if (!expectedClass.isEnum()) {
      if (BaseResource.class.isAssignableFrom(expectedClass)) {
        ResourceDef rtd = expectedClass.getAnnotation(ResourceDef.class);
        assertNotNull(rtd);
        fhirTypeName = rtd.name();
      } else {
        DatatypeDef dtd = expectedClass.getAnnotation(DatatypeDef.class);
        assertNotNull(dtd);
        fhirTypeName = dtd.name();
      }
      assertEquals(fhirTypeName, value.fhirType());
    }

    assertEquals(fhirTypeName,
        inferredType.toCode());
  }
  
  
  private static class FhirPathProcessor {
    FhirContext ctx = FhirContext.forDstu3();
    private final FHIRPathEngine fhirPathEngine = new FHIRPathEngine(
        new HapiWorkerContext(ctx,
            new DefaultProfileValidationSupport(ctx)));

    Base process(Base resource, String fhirPath) {
      List<Base> r = this.fhirPathEngine.evaluate(resource, fhirPath);
      if (r.isEmpty()) {
        return null;
      } else if (r.size() == 1) {
        return r.get(0);
      } else {
        throw new IllegalStateException("Too many resources were returned - size = " + r.size());
      }
    }
  }
}