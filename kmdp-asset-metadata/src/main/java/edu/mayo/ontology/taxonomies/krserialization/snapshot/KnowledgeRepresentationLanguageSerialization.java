package edu.mayo.ontology.taxonomies.krserialization.snapshot;

import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.resolveTerm;

import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;
import edu.mayo.kmdp.terms.adapters.xml.LegacyTermsXMLAdapter;
import edu.mayo.kmdp.terms.impl.model.LegacyTermImpl;
import edu.mayo.kmdp.util.DateTimeUtil;
import edu.mayo.ontology.taxonomies.krserialization.KnowledgeRepresentationLanguageSerializationSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "KnowledgeRepresentationLanguageSerialization")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeRepresentationLanguageSerialization.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeRepresentationLanguageSerialization.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeRepresentationLanguageSerialization.JsonDeserializer.class )
public enum KnowledgeRepresentationLanguageSerialization implements edu.mayo.ontology.taxonomies.krserialization.KnowledgeRepresentationLanguageSerialization {


    /* GraphQL Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("graphql+txt")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://graphql.github.io/graphql-spec/June2018/#sec-Language" )
    GraphQL_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#93a468cf-67dd-3d99-a901-f8124dbdc830", "93a468cf-67dd-3d99-a901-f8124dbdc830", "graphql+txt", java.util.Arrays.asList( "graphql+txt" ), "GraphQL Syntax", "https://graphql.github.io/graphql-spec/June2018/#sec-Language",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* XSD XML 1.1 Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("xsd-v11+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2001/XMLSchema" )
    XSD_XML_1_1_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#9cbf10b9-1a71-3b31-909f-8f3098e474e1", "9cbf10b9-1a71-3b31-909f-8f3098e474e1", "xsd-v11+xml", java.util.Arrays.asList( "xsd-v11+xml" ), "XSD XML 1.1 Syntax", "http://www.w3.org/2001/XMLSchema",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* DMN 1.2 XML Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("dmn-v12+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.omg.org/spec/DMN/20180521/MODEL/" )
    DMN_1_2_XML_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#298f5832-5faa-30f0-9a3c-8cb0298b997d", "298f5832-5faa-30f0-9a3c-8cb0298b997d", "dmn-v12+xml", java.util.Arrays.asList( "dmn-v12+xml" ), "DMN 1.2 XML Syntax", "http://www.omg.org/spec/DMN/20180521/MODEL/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* OWL Functional Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("ofn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.w3.org/TR/2012/REC-owl2-syntax-20121211/" )
    OWL_Functional_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#9dbd1a52-262a-3397-aa6d-2748a90fb3a1", "9dbd1a52-262a-3397-aa6d-2748a90fb3a1", "ofn", java.util.Arrays.asList( "ofn" ), "OWL Functional Syntax", "https://www.w3.org/TR/2012/REC-owl2-syntax-20121211/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* FHIR DSTU2 JSON Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("fhir2+json")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://hl7.org/fhir/json" )
    FHIR_DSTU2_JSON_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#a0cde9ad-2544-3137-a452-0cc58916fb55", "a0cde9ad-2544-3137-a452-0cc58916fb55", "fhir2+json", java.util.Arrays.asList( "fhir2+json" ), "FHIR DSTU2 JSON Syntax", "http://hl7.org/fhir/json",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* BPMN 2.0 XML Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("bpmn-v2+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.omg.org/spec/BPMN/20100524/MODEL" )
    BPMN_2_0_XML_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#d4b1e15d-73d4-3033-95bf-86bd5c17f0b0", "d4b1e15d-73d4-3033-95bf-86bd5c17f0b0", "bpmn-v2+xml", java.util.Arrays.asList( "bpmn-v2+xml" ), "BPMN 2.0 XML Syntax", "http://www.omg.org/spec/BPMN/20100524/MODEL",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Terse RDF Triple Language */
    @javax.xml.bind.annotation.XmlEnumValue("ttl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.w3.org/TR/turtle/" )
    Turtle( "https://ontology.mayo.edu/taxonomies/KRSerialization#c431a442-5bc5-3080-8868-435c8d910f83", "c431a442-5bc5-3080-8868-435c8d910f83", "ttl", java.util.Arrays.asList( "ttl" ), "Turtle", "https://www.w3.org/TR/turtle/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* FHIR DSTU2 RDF Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("fhir2+rdf")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://hl7.org/fhir/rdf" )
    FHIR_DSTU2_RDF_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#0600a1a8-dcd0-33ed-bb5f-ccabda81aae4", "0600a1a8-dcd0-33ed-bb5f-ccabda81aae4", "fhir2+rdf", java.util.Arrays.asList( "fhir2+rdf" ), "FHIR DSTU2 RDF Syntax", "http://hl7.org/fhir/rdf",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* CQL/ELM 1.2 XML Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("cql+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "urn:hl7-org:elm:r1" )
    CQL_ELM_XML_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#c969eaaa-4c89-3cd0-8046-b7e5810e4348", "c969eaaa-4c89-3cd0-8046-b7e5810e4348", "cql+xml", java.util.Arrays.asList( "cql+xml" ), "CQL-ELM XML Syntax", "urn:hl7-org:elm:r1",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* FHIR DSTU2 XML Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("fhir2+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://hl7.org/fhir" )
    FHIR_DSTU2_XML_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#9216cb05-c223-3e7c-9a95-52b4f5aab890", "9216cb05-c223-3e7c-9a95-52b4f5aab890", "fhir2+xml", java.util.Arrays.asList( "fhir2+xml" ), "FHIR DSTU2 XML Syntax", "http://hl7.org/fhir",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* CMMN 1.1 XML Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("cmmn-v11+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.omg.org/spec/CMMN/20151109/MODEL" )
    CMMN_1_1_XML_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#1242068b-2a42-3b68-88be-d62cb7ee2a68", "1242068b-2a42-3b68-88be-d62cb7ee2a68", "cmmn-v11+xml", java.util.Arrays.asList( "cmmn-v11+xml" ), "CMMN 1.1 XML Syntax", "http://www.omg.org/spec/CMMN/20151109/MODEL",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* OpenAPI 2 YAML Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("openapi-v2+yaml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://swagger.io/specification/2-0/yaml" )
    OpenAPI_2_YAML_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#30ce25f9-22bb-3e6c-b364-68bdb95dba82", "30ce25f9-22bb-3e6c-b364-68bdb95dba82", "openapi-v2+yaml", java.util.Arrays.asList( "openapi-v2+yaml" ), "OpenAPI 2 YAML Syntax", "https://swagger.io/specification/2-0/yaml",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Common Logic XML Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("xcl/xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "urn:IEEE-1671:2010:Common" )
    XCL( "https://ontology.mayo.edu/taxonomies/KRSerialization#410694af-82c1-30f9-b2bd-f04b6d0d0873", "410694af-82c1-30f9-b2bd-f04b6d0d0873", "xcl/xml", java.util.Arrays.asList( "xcl/xml" ), "XCL", "urn:IEEE-1671:2010:Common",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset Surrogate 2.0 XML Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("surr-v2+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://kmdp.mayo.edu/metadata/v2/surrogate" )
    Knowledge_Asset_Surrogate_2_0_XML_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#679ead59-3678-32d6-aafc-9670b3a9dd04", "679ead59-3678-32d6-aafc-9670b3a9dd04", "surr-v2+xml", java.util.Arrays.asList( "surr-v2+xml" ), "Knowledge Asset Surrogate 2.0 XML Syntax", "http://kmdp.mayo.edu/metadata/v2/surrogate",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset Surrogate - Annotations - XML Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("ann+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://kmdp.mayo.edu/metadata/annotations" )
    Knowledge_Asset_Annotations_XML_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#1cd120a8-2a91-3b51-ac59-8edcd851ccd6", "1cd120a8-2a91-3b51-ac59-8edcd851ccd6", "ann+xml", java.util.Arrays.asList( "ann+xml" ), "Knowledge Asset Annotations XML Syntax", "http://kmdp.mayo.edu/metadata/annotations",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* KNART 1.3 XML Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("knart+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "urn:hl7-org:knowledgeartifact:r1" )
    KNART_XML_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#35f16e92-1007-31fa-bf79-7a2671958374", "35f16e92-1007-31fa-bf79-7a2671958374", "knart+xml", java.util.Arrays.asList( "knart+xml" ), "KNART XML Syntax", "urn:hl7-org:knowledgeartifact:r1",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset Surrogate JSON Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("surr+json")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://kmdp.mayo.edu/metadata/surrogate/json" )
    Knowledge_Asset_Surrogate_JSON_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#6d48d433-3672-3d69-87d1-1aaeccf9b5e2", "6d48d433-3672-3d69-87d1-1aaeccf9b5e2", "surr+json", java.util.Arrays.asList( "surr+json" ), "Knowledge Asset Surrogate JSON Syntax", "http://kmdp.mayo.edu/metadata/surrogate/json",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* DMN 1.1 XML Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("dmn-v11+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.omg.org/spec/DMN/20151101/dmn.xsd" )
    DMN_1_1_XML_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#ce16fd18-999f-3572-aba6-95317f86b2d6", "ce16fd18-999f-3572-aba6-95317f86b2d6", "dmn-v11+xml", java.util.Arrays.asList( "dmn-v11+xml" ), "DMN 1.1 XML Syntax", "http://www.omg.org/spec/DMN/20151101/dmn.xsd",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* CQL Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("cql+txt")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://cql.hl7.org/2018May/grammar" )
    CQL_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#8a0e2054-4997-35bd-bfa5-723abcdc6ea3", "8a0e2054-4997-35bd-bfa5-723abcdc6ea3", "cql+txt", java.util.Arrays.asList( "cql+txt" ), "CQL Syntax", "https://cql.hl7.org/2018May/grammar",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* API4KP JSON Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("api+json")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.omg.org/spec/API4KP/1.0/services/json" )
    API4KP_Service_JSON_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#fe93a90d-c9b2-36db-9451-563bf1c3326e", "fe93a90d-c9b2-36db-9451-563bf1c3326e", "api+json", java.util.Arrays.asList( "api+json" ), "API4KP Service JSON Syntax", "http://www.omg.org/spec/API4KP/1.0/services/json",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Conceptual Graph Interchange Format */
    @javax.xml.bind.annotation.XmlEnumValue("cgif")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.iso.org/standard/66249/cgif" )
    CGIF( "https://ontology.mayo.edu/taxonomies/KRSerialization#13b05fde-8d9b-3e80-96e9-325cd55a164f", "13b05fde-8d9b-3e80-96e9-325cd55a164f", "cgif", java.util.Arrays.asList( "cgif" ), "CGIF", "https://www.iso.org/standard/66249/cgif",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* OWL Manchester Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("ms")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.w3.org/TR/owl2-manchester-syntax/" )
    OWL_Manchester_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#ee33e909-372d-335d-990f-4fcb2a92d542", "ee33e909-372d-335d-990f-4fcb2a92d542", "ms", java.util.Arrays.asList( "ms" ), "OWL Manchester Syntax", "https://www.w3.org/TR/owl2-manchester-syntax/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Common Logic Interchange Format */
    @javax.xml.bind.annotation.XmlEnumValue("clif")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.iso.org/standard/66249/clif" )
    CLIF( "https://ontology.mayo.edu/taxonomies/KRSerialization#f15c041d-08ec-3a28-9457-201287406d0d", "f15c041d-08ec-3a28-9457-201287406d0d", "clif", java.util.Arrays.asList( "clif" ), "CLIF", "https://www.iso.org/standard/66249/clif",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* SPARQL Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("sparql-query")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.w3.org/TR/sparql11-query/#grammar" )
    SPARQL_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#bd9b3d03-ecb2-3d58-8162-deb82b6102fc", "bd9b3d03-ecb2-3d58-8162-deb82b6102fc", "sparql-query", java.util.Arrays.asList( "sparql-query" ), "SPARQL Syntax", "https://www.w3.org/TR/sparql11-query/#grammar",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* OWL XML Serialization */
    @javax.xml.bind.annotation.XmlEnumValue("xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2003/05/owl-xml" )
    OWL_XML_Serialization( "https://ontology.mayo.edu/taxonomies/KRSerialization#0f635d0e-0f38-34ff-b8b5-81c132e6c7a7", "0f635d0e-0f38-34ff-b8b5-81c132e6c7a7", "xml", java.util.Arrays.asList( "xml" ), "OWL XML Serialization", "http://www.w3.org/2003/05/owl-xml",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* RDF/XML Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("rdf/xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.w3.org/2000/07/rdf.xsd" )
    RDF_XML_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#2c64fb6e-29f6-33ba-b41c-80d2c2961fae", "2c64fb6e-29f6-33ba-b41c-80d2c2961fae", "rdf/xml", java.util.Arrays.asList( "rdf/xml" ), "RDF/XML Syntax", "https://www.w3.org/2000/07/rdf.xsd",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset Surrogate XML Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("surr+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://kmdp.mayo.edu/metadata/surrogate" )
    Knowledge_Asset_Surrogate_XML_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#612a6f25-1117-3901-9ecd-dbfccb99ba8d", "612a6f25-1117-3901-9ecd-dbfccb99ba8d", "surr+xml", java.util.Arrays.asList( "surr+xml" ), "Knowledge Asset Surrogate XML Syntax", "http://kmdp.mayo.edu/metadata/surrogate",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* API4KP XML Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("api+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.omg.org/spec/API4KP/1.0/services" )
    API4KP_Service_XML_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#af65d959-7a0b-3968-b9f3-74d9a0f48a1d", "af65d959-7a0b-3968-b9f3-74d9a0f48a1d", "api+xml", java.util.Arrays.asList( "api+xml" ), "API4KP Service XML Syntax", "http://www.omg.org/spec/API4KP/1.0/services",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* OpenAPI 2 JSON Syntax */
    @javax.xml.bind.annotation.XmlEnumValue("openapi-v2+json")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://swagger.io/specification/2-0/json" )
    OpenAPI_2_JSON_Syntax( "https://ontology.mayo.edu/taxonomies/KRSerialization#96b05d3a-78e8-3e34-8064-bdd050aed777", "96b05d3a-78e8-3e34-8064-bdd050aed777", "openapi-v2+json", java.util.Arrays.asList( "openapi-v2+json" ), "OpenAPI 2 JSON Syntax", "https://swagger.io/specification/2-0/json",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KRSerialization" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KRSerialization/SNAPSHOT/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KRSerialization/SNAPSHOT/"))
      .withLabel( edu.mayo.ontology.taxonomies.krserialization.KnowledgeRepresentationLanguageSerialization.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.krserialization.KnowledgeRepresentationLanguageSerialization.SCHEME_ID )
      .withVersion( "20200816-213241" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, KnowledgeRepresentationLanguageSerialization> index = indexByUUID(KnowledgeRepresentationLanguageSerialization.values());

  private TermDescription description;
  private KnowledgeRepresentationLanguageSerializationSeries series;

  public TermDescription getDescription() {
    return description;
  }

  KnowledgeRepresentationLanguageSerialization(final String conceptId, final String conceptUUID,
      final String code, final List<String> additionalCodes,
      final String displayName, final String referent,
      final Term[] ancestors,
      final Term[] closure) {
    this.description = new LegacyTermImpl(conceptId, conceptUUID, code, additionalCodes, displayName,
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
  public KnowledgeRepresentationLanguageSerializationSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.krserialization.KnowledgeRepresentationLanguageSerialization> asSeries() {
    return toSeries();
  }

  private KnowledgeRepresentationLanguageSerializationSeries toSeries() {
    if (series == null) {
      series = (KnowledgeRepresentationLanguageSerializationSeries) KnowledgeRepresentationLanguageSerializationSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<KnowledgeRepresentationLanguageSerialization> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<KnowledgeRepresentationLanguageSerialization> {
    protected KnowledgeRepresentationLanguageSerialization[] getValues() {
      return values();
    }
    @Override
    protected Optional<KnowledgeRepresentationLanguageSerialization> resolveUUID(UUID uuid) {
      return KnowledgeRepresentationLanguageSerialization.resolveUUID(uuid);
    }
  }


  public static Optional<KnowledgeRepresentationLanguageSerialization> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageSerialization> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageSerialization> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageSerialization> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageSerialization> resolveTag(final String tag) {
    Optional<KnowledgeRepresentationLanguageSerialization> l = resolveTerm(tag, KnowledgeRepresentationLanguageSerialization.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, KnowledgeRepresentationLanguageSerialization.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeRepresentationLanguageSerialization> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageSerialization> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeRepresentationLanguageSerialization.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeRepresentationLanguageSerialization> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeRepresentationLanguageSerialization.values(), Term::getRef);
  }

}
