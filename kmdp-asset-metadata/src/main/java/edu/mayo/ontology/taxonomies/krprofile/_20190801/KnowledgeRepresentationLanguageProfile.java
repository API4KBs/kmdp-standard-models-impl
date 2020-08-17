package edu.mayo.ontology.taxonomies.krprofile._20190801;

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

import edu.mayo.ontology.taxonomies.krprofile.KnowledgeRepresentationLanguageProfileSeries;
import edu.mayo.kmdp.terms.impl.model.AnonymousConceptScheme;


@javax.xml.bind.annotation.XmlType(name = "KnowledgeRepresentationLanguageProfile")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeRepresentationLanguageProfile.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeRepresentationLanguageProfile.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeRepresentationLanguageProfile.JsonDeserializer.class )
public enum KnowledgeRepresentationLanguageProfile implements edu.mayo.ontology.taxonomies.krprofile.KnowledgeRepresentationLanguageProfile {


    /* API4KP Service Descriptors */
    @javax.xml.bind.annotation.XmlEnumValue("api")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/1.0/services" )
    API4KP_Service_Descriptors( "https://ontology.mayo.edu/taxonomies/KRProfile#8a5da52e-d126-347d-b59e-70c05721a8aa", "8a5da52e-d126-347d-b59e-70c05721a8aa", "api", java.util.Arrays.asList( "api" ), "API4KP Service Descriptors", "https://www.omg.org/spec/API4KP/1.0/services",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* API4KP Identifiers */
    @javax.xml.bind.annotation.XmlEnumValue("id")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/1.0/identifiers" )
    API4KP_Identifiers( "https://ontology.mayo.edu/taxonomies/KRProfile#b80bb774-0288-3da1-b201-890375a60c8f", "b80bb774-0288-3da1-b201-890375a60c8f", "id", java.util.Arrays.asList( "id" ), "API4KP Identifiers", "https://www.omg.org/spec/API4KP/1.0/identifiers",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* API4KP Datatypes */
    @javax.xml.bind.annotation.XmlEnumValue("dtt")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/1.0/datatypes" )
    API4KP_Datatypes( "https://ontology.mayo.edu/taxonomies/KRProfile#167313fa-37ef-38d7-a1f1-916936fc89a3", "167313fa-37ef-38d7-a1f1-916936fc89a3", "dtt", java.util.Arrays.asList( "dtt" ), "API4KP Datatypes", "https://www.omg.org/spec/API4KP/1.0/datatypes",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* OWL 2 Web Ontology Language, DL Profile */
    @javax.xml.bind.annotation.XmlEnumValue("DL")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/ns/owl-profile/DL" )
    OWL2_DL( "https://ontology.mayo.edu/taxonomies/KRProfile#f5ce9f5c-b682-31f8-a3d5-a8c51ac28683", "f5ce9f5c-b682-31f8-a3d5-a8c51ac28683", "DL", java.util.Arrays.asList( "DL" ), "OWL2 DL", "http://www.w3.org/ns/owl-profile/DL",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* OWL 2 Web Ontology Language, QL Profile */
    @javax.xml.bind.annotation.XmlEnumValue("QL")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/ns/owl-profile/QL" )
    OWL2_QL( "https://ontology.mayo.edu/taxonomies/KRProfile#49d494e9-aeb1-39ef-8ab3-194d2f507511", "49d494e9-aeb1-39ef-8ab3-194d2f507511", "QL", java.util.Arrays.asList( "QL" ), "OWL2 QL", "http://www.w3.org/ns/owl-profile/QL",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* UML 2 Resource Profile */
    @javax.xml.bind.annotation.XmlEnumValue("Res")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/UML/profiles/resource" )
    UML_Resource( "https://ontology.mayo.edu/taxonomies/KRProfile#05c35fe8-715b-3a62-aba3-4e48d36f7420", "05c35fe8-715b-3a62-aba3-4e48d36f7420", "Res", java.util.Arrays.asList( "Res" ), "UML Resource", "https://www.omg.org/spec/UML/profiles/resource",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* OWL 2 Web Ontology Language, EL Profile */
    @javax.xml.bind.annotation.XmlEnumValue("EL")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/ns/owl-profile/EL" )
    OWL2_EL( "https://ontology.mayo.edu/taxonomies/KRProfile#d4e8bee5-0f20-33fb-8ed5-daaf3c41980d", "d4e8bee5-0f20-33fb-8ed5-daaf3c41980d", "EL", java.util.Arrays.asList( "EL" ), "OWL2 EL", "http://www.w3.org/ns/owl-profile/EL",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* OWL 2 Web Ontology Language, RDF Semantics */
    @javax.xml.bind.annotation.XmlEnumValue("Full")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/ns/owl-profile/Full" )
    OWL2_Full( "https://ontology.mayo.edu/taxonomies/KRProfile#bbd47109-8902-39c0-9271-54db1af26c75", "bbd47109-8902-39c0-9271-54db1af26c75", "Full", java.util.Arrays.asList( "Full" ), "OWL2 Full", "http://www.w3.org/ns/owl-profile/Full",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* OWL 2 Web Ontology Language, RL Profile */
    @javax.xml.bind.annotation.XmlEnumValue("RL")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/ns/owl-profile/RL" )
    OWL2_RL( "https://ontology.mayo.edu/taxonomies/KRProfile#7f49bbe2-f0af-3edb-ac6c-ee353d3e204b", "7f49bbe2-f0af-3edb-ac6c-ee353d3e204b", "RL", java.util.Arrays.asList( "RL" ), "OWL2 RL", "http://www.w3.org/ns/owl-profile/RL",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Essential elements of CQL, scoped to simple expressions, used to evalute context variables */
    @javax.xml.bind.annotation.XmlEnumValue("cql-exx")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://kmdp.mayo.edu/CQL/1.3/essentials" )
    CQL_Essentials( "https://ontology.mayo.edu/taxonomies/KRProfile#c073ff1a-aacd-3993-a24c-022cd7a19e39", "c073ff1a-aacd-3993-a24c-022cd7a19e39", "cql-exx", java.util.Arrays.asList( "cql-exx" ), "CQL Essentials", "http://kmdp.mayo.edu/CQL/1.3/essentials",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset Surrogate Annotations */
    @javax.xml.bind.annotation.XmlEnumValue("ann")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/1.0/surrogate/annos" )
    Knowledge_Asset_Surrogate_Annotations( "https://ontology.mayo.edu/taxonomies/KRProfile#7e0d7f8a-5d96-324f-bcc8-40f31bce72b2", "7e0d7f8a-5d96-324f-bcc8-40f31bce72b2", "ann", java.util.Arrays.asList( "ann" ), "Knowledge Asset Surrogate Annotations", "https://www.omg.org/spec/API4KP/1.0/surrogate/annos",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KRProfile" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KRProfile/20190801/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KRProfile/20190801/"))
      .withLabel( edu.mayo.ontology.taxonomies.krprofile.KnowledgeRepresentationLanguageProfile.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.krprofile.KnowledgeRepresentationLanguageProfile.SCHEME_ID )
      .withVersion( "20190801" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2019-08-01") );

  public static final Map<UUID, KnowledgeRepresentationLanguageProfile> index = indexByUUID(KnowledgeRepresentationLanguageProfile.values());

  private TermDescription description;
  private KnowledgeRepresentationLanguageProfileSeries series;

  public TermDescription getDescription() {
    return description;
  }

  KnowledgeRepresentationLanguageProfile(final String conceptId, final String conceptUUID,
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
  public KnowledgeRepresentationLanguageProfileSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.krprofile.KnowledgeRepresentationLanguageProfile> asSeries() {
    return toSeries();
  }

  private KnowledgeRepresentationLanguageProfileSeries toSeries() {
    if (series == null) {
      series = (KnowledgeRepresentationLanguageProfileSeries) KnowledgeRepresentationLanguageProfileSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<KnowledgeRepresentationLanguageProfile> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<KnowledgeRepresentationLanguageProfile> {
    protected KnowledgeRepresentationLanguageProfile[] getValues() {
      return values();
    }
    @Override
    protected Optional<KnowledgeRepresentationLanguageProfile> resolveUUID(UUID uuid) {
      return KnowledgeRepresentationLanguageProfile.resolveUUID(uuid);
    }
  }


  public static Optional<KnowledgeRepresentationLanguageProfile> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageProfile> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageProfile> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageProfile> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageProfile> resolveTag(final String tag) {
    Optional<KnowledgeRepresentationLanguageProfile> l = resolveTerm(tag, KnowledgeRepresentationLanguageProfile.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, KnowledgeRepresentationLanguageProfile.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeRepresentationLanguageProfile> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageProfile> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeRepresentationLanguageProfile.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeRepresentationLanguageProfile> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeRepresentationLanguageProfile.values(), Term::getRef);
  }

}
