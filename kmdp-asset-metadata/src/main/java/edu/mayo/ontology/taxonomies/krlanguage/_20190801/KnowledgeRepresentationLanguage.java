package edu.mayo.ontology.taxonomies.krlanguage._20190801;

import static edu.mayo.kmdp.id.helper.DatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveTerm;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.versionOf;

import edu.mayo.kmdp.id.helper.DatatypeHelper;
import edu.mayo.kmdp.id.Identifier;
import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;
import edu.mayo.kmdp.terms.impl.model.TermImpl;
import edu.mayo.kmdp.util.DateTimeUtil;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;

import edu.mayo.ontology.taxonomies.krlanguage.KnowledgeRepresentationLanguageSeries;
import edu.mayo.kmdp.terms.impl.model.AnonymousConceptScheme;


@javax.xml.bind.annotation.XmlType(name = "KnowledgeRepresentationLanguage")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeRepresentationLanguage.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeRepresentationLanguage.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeRepresentationLanguage.JsonDeserializer.class )
public enum KnowledgeRepresentationLanguage implements edu.mayo.ontology.taxonomies.krlanguage.KnowledgeRepresentationLanguage {


    /* Decision Modelling Notation 1.1 */
    @javax.xml.bind.annotation.XmlEnumValue("dmn-v11")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/DMN/1.1/" )
    DMN_1_1( "https://ontology.mayo.edu/taxonomies/KRLanguage#4bae554d-5f3c-3ba7-8323-098d594c9c02", "4bae554d-5f3c-3ba7-8323-098d594c9c02", "dmn-v11", java.util.Arrays.asList( "dmn-v11" ), "DMN 1.1", "https://www.omg.org/spec/DMN/1.1/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset Surrogate Metamodel */
    @javax.xml.bind.annotation.XmlEnumValue("surr-v1")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/1.0/surrogate" )
    Knowledge_Asset_Surrogate( "https://ontology.mayo.edu/taxonomies/KRLanguage#784c8ea4-915f-32c0-9ea0-c2127c495207", "784c8ea4-915f-32c0-9ea0-c2127c495207", "surr-v1", java.util.Arrays.asList( "surr-v1" ), "Knowledge Asset Surrogate", "https://www.omg.org/spec/API4KP/1.0/surrogate",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Extensible Stylesheet Transformation 3.0 */
    @javax.xml.bind.annotation.XmlEnumValue("xslt-v3")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.w3.org/TR/xslt-30/" )
    XSLT_3_0( "https://ontology.mayo.edu/taxonomies/KRLanguage#9563e70e-40f2-3e95-9c35-2b47cd9b622b", "9563e70e-40f2-3e95-9c35-2b47cd9b622b", "xslt-v3", java.util.Arrays.asList( "xslt-v3" ), "XSLT 3.0", "https://www.w3.org/TR/xslt-30/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Case Modelling and Management Notation 1.1 */
    @javax.xml.bind.annotation.XmlEnumValue("cmmn-v11")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/CMMN/1.1/" )
    CMMN_1_1( "https://ontology.mayo.edu/taxonomies/KRLanguage#a995c317-45b1-3dca-ab12-d9aaa95b461b", "a995c317-45b1-3dca-ab12-d9aaa95b461b", "cmmn-v11", java.util.Arrays.asList( "cmmn-v11" ), "CMMN 1.1", "https://www.omg.org/spec/CMMN/1.1/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Cognitive Care Process Models Metamodel */
    @javax.xml.bind.annotation.XmlEnumValue("ccpm-v1")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://kmdp.mayo.edu/ccpm/1.0" )
    Cognitive_Care_Process_Model( "https://ontology.mayo.edu/taxonomies/KRLanguage#652be3e8-6c3c-3469-b272-f05d255a25f9", "652be3e8-6c3c-3469-b272-f05d255a25f9", "ccpm-v1", java.util.Arrays.asList( "ccpm-v1" ), "Cognitive Care Process Model", "http://kmdp.mayo.edu/ccpm/1.0",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* OpenAPI / Swagger v2.x */
    @javax.xml.bind.annotation.XmlEnumValue("openapi-v2")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://swagger.io/specification/2-0" )
    OpenAPI_2_X( "https://ontology.mayo.edu/taxonomies/KRLanguage#f0cc9199-907c-3daf-b7e7-9ce63159c5e5", "f0cc9199-907c-3daf-b7e7-9ce63159c5e5", "openapi-v2", java.util.Arrays.asList( "openapi-v2" ), "OpenAPI 2.x", "https://swagger.io/specification/2-0",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Decision Modelling Notation 1.2 */
    @javax.xml.bind.annotation.XmlEnumValue("dmn-v12")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/DMN/1.2/" )
    DMN_1_2( "https://ontology.mayo.edu/taxonomies/KRLanguage#0bf050a2-fbd6-38c2-a4ce-323fd91c7b24", "0bf050a2-fbd6-38c2-a4ce-323fd91c7b24", "dmn-v12", java.util.Arrays.asList( "dmn-v12" ), "DMN 1.2", "https://www.omg.org/spec/DMN/1.2/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Clinical Concept Glossary Metamodel */
    @javax.xml.bind.annotation.XmlEnumValue("ccg-v1")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://kmdp.mayo.edu/ccg/1.0" )
    Clinical_Concept_Glossary( "https://ontology.mayo.edu/taxonomies/KRLanguage#3ac7250a-6802-36c2-9bd7-8976de32bcf2", "3ac7250a-6802-36c2-9bd7-8976de32bcf2", "ccg-v1", java.util.Arrays.asList( "ccg-v1" ), "Clinical Concept Glossary", "http://kmdp.mayo.edu/ccg/1.0",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Clinical Quality Language 1.2 */
    @javax.xml.bind.annotation.XmlEnumValue("cql-v12")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://cql.hl7.org" )
    HL7_CQL( "https://ontology.mayo.edu/taxonomies/KRLanguage#55379a2a-a4f2-319e-becc-541ae9dab04b", "55379a2a-a4f2-319e-becc-541ae9dab04b", "cql-v12", java.util.Arrays.asList( "cql-v12" ), "HL7 CQL", "https://cql.hl7.org",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* API 4 Knowledge Platform Metamodel */
    @javax.xml.bind.annotation.XmlEnumValue("api4kp-v1")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/1.0/" )
    API4KP( "https://ontology.mayo.edu/taxonomies/KRLanguage#b6d3125b-15bc-3b01-a860-7f4602383e79", "b6d3125b-15bc-3b01-a860-7f4602383e79", "api4kp-v1", java.util.Arrays.asList( "api4kp-v1" ), "API4KP", "https://www.omg.org/spec/API4KP/1.0/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Unified Modelling Language 2.5 */
    @javax.xml.bind.annotation.XmlEnumValue("uml2-v25")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/UML/2.5/" )
    UML_2_5( "https://ontology.mayo.edu/taxonomies/KRLanguage#8e7da301-0184-31a1-9895-6c715335284a", "8e7da301-0184-31a1-9895-6c715335284a", "uml2-v25", java.util.Arrays.asList( "uml2-v25" ), "UML 2.5", "https://www.omg.org/spec/UML/2.5/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* X-HTML */
    @javax.xml.bind.annotation.XmlEnumValue("xhtml-v1")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.w3.org/TR/xhtml1/" )
    XHTML( "https://ontology.mayo.edu/taxonomies/KRLanguage#872183b3-366b-3ecb-ac1d-cc06a72dab2c", "872183b3-366b-3ecb-ac1d-cc06a72dab2c", "xhtml-v1", java.util.Arrays.asList( "xhtml-v1" ), "XHTML", "https://www.w3.org/TR/xhtml1/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* FHIRPath Path Language */
    @javax.xml.bind.annotation.XmlEnumValue("fhirpath-v1")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://hl7.org/fhirpath/" )
    FHIRPath_STU1( "https://ontology.mayo.edu/taxonomies/KRLanguage#e0a485a7-8bcd-32c7-a928-560a5d4d898d", "e0a485a7-8bcd-32c7-a928-560a5d4d898d", "fhirpath-v1", java.util.Arrays.asList( "fhirpath-v1" ), "FHIRPath STU1", "http://hl7.org/fhirpath/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Friendly Enough Expression Lanaguage 1.2 */
    @javax.xml.bind.annotation.XmlEnumValue("feel-v12")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/DMN/1.2/FEEL" )
    FEEL_1_2( "https://ontology.mayo.edu/taxonomies/KRLanguage#6d8a26a5-c655-3688-8522-58ac077cee84", "6d8a26a5-c655-3688-8522-58ac077cee84", "feel-v12", java.util.Arrays.asList( "feel-v12" ), "FEEL 1.2", "https://www.omg.org/spec/DMN/1.2/FEEL",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Friendly Enough Expression Lanaguage 1.1 */
    @javax.xml.bind.annotation.XmlEnumValue("feel-v11")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/DMN/1.1/FEEL" )
    FEEL_1_1( "https://ontology.mayo.edu/taxonomies/KRLanguage#b7d32dbb-7fc6-3892-9bae-0cd80746231a", "b7d32dbb-7fc6-3892-9bae-0cd80746231a", "feel-v11", java.util.Arrays.asList( "feel-v11" ), "FEEL 1.1", "https://www.omg.org/spec/DMN/1.1/FEEL",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* HTML 5 */
    @javax.xml.bind.annotation.XmlEnumValue("html-v52")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.w3.org/TR/html52/" )
    HTML( "https://ontology.mayo.edu/taxonomies/KRLanguage#1c0e2d66-362b-33b3-9276-f5bcff5b23aa", "1c0e2d66-362b-33b3-9276-f5bcff5b23aa", "html-v52", java.util.Arrays.asList( "html-v52" ), "HTML", "https://www.w3.org/TR/html52/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Darwin Information Technology Architecture 1.3 */
    @javax.xml.bind.annotation.XmlEnumValue("dita-v13")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://docs.oasis-open.org/dita/dita/v1.3/" )
    DITA( "https://ontology.mayo.edu/taxonomies/KRLanguage#500f5735-906c-3bdc-9f65-07e9436754cc", "500f5735-906c-3bdc-9f65-07e9436754cc", "dita-v13", java.util.Arrays.asList( "dita-v13" ), "DITA", "http://docs.oasis-open.org/dita/dita/v1.3/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Fast Healthcare Interoperability Resources DSTU2 */
    @javax.xml.bind.annotation.XmlEnumValue("fhir-v2")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://hl7.org/fhir/DSTU2" )
    FHIR_DSTU2( "https://ontology.mayo.edu/taxonomies/KRLanguage#0463e7bc-f436-33f1-af2a-8a141dc05cba", "0463e7bc-f436-33f1-af2a-8a141dc05cba", "fhir-v2", java.util.Arrays.asList( "fhir-v2" ), "FHIR DSTU2", "http://hl7.org/fhir/DSTU2",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Java 8 */
    @javax.xml.bind.annotation.XmlEnumValue("java-v8")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://jdk.java.net/8/" )
    Java_8( "https://ontology.mayo.edu/taxonomies/KRLanguage#d634b04c-227e-318c-8850-db74ade609aa", "d634b04c-227e-318c-8850-db74ade609aa", "java-v8", java.util.Arrays.asList( "java-v8" ), "Java 8", "https://jdk.java.net/8/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* HL7 Knowledge Artifact Metamodel 1.3 */
    @javax.xml.bind.annotation.XmlEnumValue("knart-v13")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://hl7.org/KNART/1.3" )
    KNART_1_3( "https://ontology.mayo.edu/taxonomies/KRLanguage#f534d2c5-2532-3ae9-87e6-08888be1acb2", "f534d2c5-2532-3ae9-87e6-08888be1acb2", "knart-v13", java.util.Arrays.asList( "knart-v13" ), "KNART 1.3", "http://hl7.org/KNART/1.3",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Common Logic */
    @javax.xml.bind.annotation.XmlEnumValue("cl-v1")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.iso.org/standard/66249" )
    Common_Logic( "https://ontology.mayo.edu/taxonomies/KRLanguage#dc56f597-3cc1-3b60-b0a7-31910b621c62", "dc56f597-3cc1-3b60-b0a7-31910b621c62", "cl-v1", java.util.Arrays.asList( "cl-v1" ), "Common Logic", "https://www.iso.org/standard/66249",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Web Ontology Language 2 */
    @javax.xml.bind.annotation.XmlEnumValue("owl2-v20121211")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2002/07/owl" )
    OWL_2( "https://ontology.mayo.edu/taxonomies/KRLanguage#dd63c16d-84a0-3d4d-a4f2-7bc073756048", "dd63c16d-84a0-3d4d-a4f2-7bc073756048", "owl2-v20121211", java.util.Arrays.asList( "owl2-v20121211" ), "OWL-2", "http://www.w3.org/2002/07/owl",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Business Process Modelling Notation 2.0 */
    @javax.xml.bind.annotation.XmlEnumValue("bpmn-v2")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/BPMN/2.0/" )
    BPMN_2_0( "https://ontology.mayo.edu/taxonomies/KRLanguage#9da31b47-b6d5-3ecc-9c97-41d817933457", "9da31b47-b6d5-3ecc-9c97-41d817933457", "bpmn-v2", java.util.Arrays.asList( "bpmn-v2" ), "BPMN 2.0", "https://www.omg.org/spec/BPMN/2.0/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* XML Schema Definition Language 1.1 */
    @javax.xml.bind.annotation.XmlEnumValue("xsd-v11")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.w3.org/TR/xmlschema11-1/" )
    XSD_1_1( "https://ontology.mayo.edu/taxonomies/KRLanguage#307d4526-5137-3eaf-9e2d-f7367dfe854e", "307d4526-5137-3eaf-9e2d-f7367dfe854e", "xsd-v11", java.util.Arrays.asList( "xsd-v11" ), "XSD 1.1", "https://www.w3.org/TR/xmlschema11-1/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Service Profile Metamodel */
    @javax.xml.bind.annotation.XmlEnumValue("sp-v1")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://kmdp.mayo.edu/serviceprofile/1.0" )
    Service_Profile( "https://ontology.mayo.edu/taxonomies/KRLanguage#86c85b46-431d-3514-a726-98cc9d83cf10", "86c85b46-431d-3514-a726-98cc9d83cf10", "sp-v1", java.util.Arrays.asList( "sp-v1" ), "Service Profile", "http://kmdp.mayo.edu/serviceprofile/1.0",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Mustache Templating Language */
    @javax.xml.bind.annotation.XmlEnumValue("mustache-v1")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://mustache.github.io/" )
    Mustache( "https://ontology.mayo.edu/taxonomies/KRLanguage#db570e59-b22b-3a7c-bad8-8ef4472a4760", "db570e59-b22b-3a7c-bad8-8ef4472a4760", "mustache-v1", java.util.Arrays.asList( "mustache-v1" ), "Mustache", "https://mustache.github.io/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Reaction RuleML 1.2 */
    @javax.xml.bind.annotation.XmlEnumValue("rruleml-v12")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://reaction.ruleml.org/1.02/" )
    Reaction_RuleML_1_2( "https://ontology.mayo.edu/taxonomies/KRLanguage#88808ccf-2900-3fb0-ad9f-a14d6934ec7b", "88808ccf-2900-3fb0-ad9f-a14d6934ec7b", "rruleml-v12", java.util.Arrays.asList( "rruleml-v12" ), "Reaction RuleML 1.2", "http://reaction.ruleml.org/1.02/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Clinical Quality Language, Expression Language Metamodel 1.2 */
    @javax.xml.bind.annotation.XmlEnumValue("elm-v12")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://hl7.org/ELM/1.2" )
    HL7_ELM( "https://ontology.mayo.edu/taxonomies/KRLanguage#a8c12d9b-3447-31ee-8d09-ca809b841e30", "a8c12d9b-3447-31ee-8d09-ca809b841e30", "elm-v12", java.util.Arrays.asList( "elm-v12" ), "HL7 ELM", "http://hl7.org/ELM/1.2",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Fast Healthcare Interoperability Resources STU3 */
    @javax.xml.bind.annotation.XmlEnumValue("fhir-v3")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://hl7.org/fhir/STU3" )
    FHIR_STU3( "https://ontology.mayo.edu/taxonomies/KRLanguage#c3b2c5f9-efcf-3754-ad64-c39e3dabc351", "c3b2c5f9-efcf-3754-ad64-c39e3dabc351", "fhir-v3", java.util.Arrays.asList( "fhir-v3" ), "FHIR STU3", "http://hl7.org/fhir/STU3",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* SPARQL Protocol and RDF Query Language */
    @javax.xml.bind.annotation.XmlEnumValue("sparql-v11")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.w3.org/TR/sparql11-query/" )
    SPARQL_1_1( "https://ontology.mayo.edu/taxonomies/KRLanguage#b40b4ed9-d956-3750-84f6-86b63b3b84c9", "b40b4ed9-d956-3750-84f6-86b63b3b84c9", "sparql-v11", java.util.Arrays.asList( "sparql-v11" ), "SPARQL 1.1", "https://www.w3.org/TR/sparql11-query/",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KRLanguage" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KRLanguage/20190801/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KRLanguage/20190801/"))
      .withLabel( edu.mayo.ontology.taxonomies.krlanguage.KnowledgeRepresentationLanguage.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.krlanguage.KnowledgeRepresentationLanguage.SCHEME_ID )
      .withVersion( "20190801" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2019-08-01") );

  public static final Map<UUID, KnowledgeRepresentationLanguage> index = indexByUUID(KnowledgeRepresentationLanguage.values());

  private TermDescription description;
  private KnowledgeRepresentationLanguageSeries series;

  public TermDescription getDescription() {
    return description;
  }

  KnowledgeRepresentationLanguage(final String conceptId, final String conceptUUID,
      final String code, final List<String> additionalCodes,
      final String displayName, final String referent,
      final Term[] ancestors,
      final Term[] closure) {
    this.description = new TermImpl(conceptId, conceptUUID, code, additionalCodes, displayName,
        referent, ancestors, closure);
    this.series = series;
  }

  @Override
  public NamespaceIdentifier getNamespace() {
    return namespace;
  }

  @Override
  public VersionedIdentifier getVersionIdentifier() {
    return new NamespaceIdentifier()
      .withId(getConceptId())
      .withLabel(getLabel())
      .withTag(getTag())
      .withVersion(namespace.getVersion())
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn(namespace.getEstablishedOn());
  }

  @Override
  public java.util.Date getEstablishedOn() {
    return namespace.getEstablishedOn();
  }

  @Override
  public String getVersionTag() {
    return namespace.getVersion();
  }

  @Override
  public KnowledgeRepresentationLanguageSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.krlanguage.KnowledgeRepresentationLanguage> asSeries() {
    return toSeries();
  }

  private KnowledgeRepresentationLanguageSeries toSeries() {
    if (series == null) {
      series = (KnowledgeRepresentationLanguageSeries) KnowledgeRepresentationLanguageSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<KnowledgeRepresentationLanguage> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<KnowledgeRepresentationLanguage> {
    protected KnowledgeRepresentationLanguage[] getValues() {
      return values();
    }
    @Override
    protected Optional<KnowledgeRepresentationLanguage> resolveUUID(UUID uuid) {
      return KnowledgeRepresentationLanguage.resolveUUID(uuid);
    }
  }


  public static Optional<KnowledgeRepresentationLanguage> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguage> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguage> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguage> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguage> resolveTag(final String tag) {
    Optional<KnowledgeRepresentationLanguage> l = resolveTerm(tag, KnowledgeRepresentationLanguage.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, KnowledgeRepresentationLanguage.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeRepresentationLanguage> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguage> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeRepresentationLanguage.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeRepresentationLanguage> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeRepresentationLanguage.values(), Term::getRef);
  }

}
