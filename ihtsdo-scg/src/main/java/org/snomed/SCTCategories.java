package org.snomed;

public enum SCTCategories {
  BODY_STRUCTURE("body structure"),
  CELL("cell"),
  CELL_STRUCTURE("cell structure"),
  MORPHOLOGIC_ABNORMALITY("morphologic abnormality"),
  FINDING("finding"),
  DISORDER("disorder"),
  ENVIRONMENT_LOCATION("environment / location"),
  ENVIRONMENT("environment"),
  GEOGRAPHIC_LOCATION("geographic location"),
  EVENT("event"),
  OBSERVABLE_ENTITY("observable entity"),
  ORGANISM("organism"),
  CLINICAL_DRUG("clinical drug"),
  MEDICINAL_PRODUCT("medicinal product"),
  MEDICINAL_PRODUCT_FORM("medicinal product form"),
  PHYSICAL_OBJECT("physical object"),
  PRODUCT("product"),
  PHYSICAL_FORCE("physical force"),
  PROCEDURE("procedure"),
  REGIME_THERAPY("regime/therapy"),
  QUALIFIER_VALUE("qualifier value"),
  ADMINISTRATION_METHOD("administration method"),
  BASIC_DOSE_FORM("basic dose form"),
  DISPOSITION("disposition"),
  DOSE_FORM("dose form"),
  INTENDED_SITE("intended site"),
  NUMBER("number"),
  PRODUCT_NAME("product name"),
  RELEASE_CHARACTERISTIC("release characteristic"),
  ROLE("role"),
  STATE_OF_MATTER("state of matter"),
  TRANSFORMATION("transformation"),
  SUPPLIER("supplier"),
  UNIT_OF_PRESENTATION("unit of presentation"),
  RECORD_ARTIFACT("record artifact"),
  SITUATION("situation"),
  ATTRIBUTE("attribute"),
  CORE_METADATA_CONCEPT("core metadata concept"),
  FOUNDATION_METADATA_CONCEPT("foundation metadata concept"),
  LINK_ASSERTION("link assertion"),
  LINKAGE_CONCEPT("linkage concept"),
  NAMESPACE_CONCEPT("namespace concept"),
  SOCIAL_CONCEPT("social concept"),
  ETHNIC_GROUP("ethnic group"),
  LIFE_STYLE("life style"),
  OCCUPATION("occupation"),
  PERSON("person"),
  RACIAL_GROUP("racial group"),
  RELIGION_PHILOSOPHY("religion/philosophy"),
  NAVIGATIONAL_CONCEPT("navigational concept"),
  SPECIMEN("specimen"),
  STAGING_SCALE("staging scale"),
  ASSESSMENT_SCALE("assessment scale"),
  TUMOR_STAGING("tumor staging"),
  SUBSTANCE("substance");

  private final String value;

  SCTCategories(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}

