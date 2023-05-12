package org.snomed;

import static org.snomed.SCTHelper.SNOMED_NS;

public enum SCTCategories {
  BODY_STRUCTURE("body structure", 123037004),
  CELL("cell", 4421005),

  CELL_STRUCTURE("cell structure", 4421005),

  MORPHOLOGIC_ABNORMALITY("morphologic abnormality", 49755003),

  FINDING("finding", 404684003),

  DISORDER("disorder", 64572001),

  ENVIRONMENT_LOCATION("environment / location", 308916002),

  ENVIRONMENT("environment", 276339004),

  GEOGRAPHIC_LOCATION("geographic location", 223496003),

  EVENT("event", 272379006),

  OBSERVABLE_ENTITY("observable entity", 363787002),

  ORGANISM("organism", 410607006),

  CLINICAL_DRUG("clinical drug", 763158003),

  MEDICINAL_PRODUCT("medicinal product", 763158003),

  MEDICINAL_PRODUCT_FORM("medicinal product form", 763158003),

  PHYSICAL_OBJECT("physical object", 260787004),

  PRODUCT("product", 373873005),

  PHYSICAL_FORCE("physical force", 78621006),

  PROCEDURE("procedure", 71388002),

  REGIME_THERAPY("regime/therapy", 243120004),

  QUALIFIER_VALUE("qualifier value", 362981000),

  ADMINISTRATION_METHOD("administration method", 736665006),

  BASIC_DOSE_FORM("basic dose form", 736478001),

  DISPOSITION("disposition", 726711005),

  DOSE_FORM("dose form", 736542009),

  INTENDED_SITE("intended site", 736479009),

  NUMBER("number", 410680006),

  PRODUCT_NAME("product name", 774167006),

  RELEASE_CHARACTERISTIC("release characteristic", 736480007),

  ROLE("role", 766940004),

  STATE_OF_MATTER("state of matter", 736471007),

  TRANSFORMATION("transformation", 61883002),

  SUPPLIER("supplier", 774164004),

  UNIT_OF_PRESENTATION("unit of presentation", 732935002),

  RECORD_ARTIFACT("record artifact", 419891008),

  SITUATION("situation", 243796009),

  ATTRIBUTE("attribute", 246061005),

  LINK_ASSERTION("link assertion", 416698001),

  LINKAGE_CONCEPT("linkage concept", 106237007),

  NAMESPACE_CONCEPT("namespace concept", 370136006),

  SOCIAL_CONCEPT("social concept", 48176007),

  ETHNIC_GROUP("ethnic group", 364699009),

  LIFE_STYLE("life style", 60134006),

  OCCUPATION("occupation", 14679004),

  PERSON("person", 125676002),

  RACIAL_GROUP("racial group", 415229000),

  RELIGION_PHILOSOPHY("religion/philosophy", 108334009),

  NAVIGATIONAL_CONCEPT("navigational concept", 363743006),

  SPECIMEN("specimen", 123038009),

  STAGING_SCALE("staging scale", 254291000),

  ASSESSMENT_SCALE("assessment scale", 273249006),

  TUMOR_STAGING("tumor staging", 254292007),

  SUBSTANCE("substance", 261217004);

  private final String semanticTag;
  private final int mappedCode;

  SCTCategories(String value, int code) {
    this.semanticTag = value;
    this.mappedCode = code;
  }

  public String getSemanticTag() {
    return semanticTag;
  }

  public String getMappedConcept() {
    return SNOMED_NS + mappedCode;
  }
}

