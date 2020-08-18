package edu.mayo.ontology.taxonomies.kao.languagerole.snapshot;

import static edu.mayo.kmdp.id.helper.DatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveTerm;

import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;
import edu.mayo.kmdp.terms.impl.model.TermImpl;
import edu.mayo.kmdp.util.DateTimeUtil;
import edu.mayo.ontology.taxonomies.kao.languagerole.KnowledgeRepresentationLanguageRoleSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "KnowledgeRepresentationLanguageRole")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeRepresentationLanguageRole.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeRepresentationLanguageRole.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeRepresentationLanguageRole.JsonDeserializer.class )
public enum KnowledgeRepresentationLanguageRole implements edu.mayo.ontology.taxonomies.kao.languagerole.KnowledgeRepresentationLanguageRole {


    /* rule language */
    @javax.xml.bind.annotation.XmlEnumValue("RuleLanguage")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/RuleLanguage" )
    Rule_Language( "https://ontology.mayo.edu/taxonomies/KAO/LanguageRole#8ece3a31-c40e-393d-8a62-c54c06a495ae", "8ece3a31-c40e-393d-8a62-c54c06a495ae", "RuleLanguage", java.util.Arrays.asList( "RuleLanguage" ), "rule language", "https://www.omg.org/spec/API4KP/api4kp-kao/RuleLanguage",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* annotation language */
    @javax.xml.bind.annotation.XmlEnumValue("AnnotationLanguage")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/AnnotationLanguage" )
    Annotation_Language( "https://ontology.mayo.edu/taxonomies/KAO/LanguageRole#5ff2b06f-9495-3901-ba4f-2937a23896fe", "5ff2b06f-9495-3901-ba4f-2937a23896fe", "AnnotationLanguage", java.util.Arrays.asList( "AnnotationLanguage" ), "annotation language", "https://www.omg.org/spec/API4KP/api4kp-kao/AnnotationLanguage",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* ontology language */
    @javax.xml.bind.annotation.XmlEnumValue("OntologyLanguage")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/OntologyLanguage" )
    Ontology_Language( "https://ontology.mayo.edu/taxonomies/KAO/LanguageRole#f4e0854a-4c95-333d-85da-c32eb5d67840", "f4e0854a-4c95-333d-85da-c32eb5d67840", "OntologyLanguage", java.util.Arrays.asList( "OntologyLanguage" ), "ontology language", "https://www.omg.org/spec/API4KP/api4kp-kao/OntologyLanguage",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* query language */
    @javax.xml.bind.annotation.XmlEnumValue("QueryLanguage")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/QueryLanguage" )
    Query_Language( "https://ontology.mayo.edu/taxonomies/KAO/LanguageRole#533ad380-6948-3b06-8f25-15a682c70645", "533ad380-6948-3b06-8f25-15a682c70645", "QueryLanguage", java.util.Arrays.asList( "QueryLanguage" ), "query language", "https://www.omg.org/spec/API4KP/api4kp-kao/QueryLanguage",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* schema language */
    @javax.xml.bind.annotation.XmlEnumValue("SchemaLanguage")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/SchemaLanguage" )
    Schema_Language( "https://ontology.mayo.edu/taxonomies/KAO/LanguageRole#58f764f9-c702-3219-a0ee-4b8d50824343", "58f764f9-c702-3219-a0ee-4b8d50824343", "SchemaLanguage", java.util.Arrays.asList( "SchemaLanguage" ), "schema language", "https://www.omg.org/spec/API4KP/api4kp-kao/SchemaLanguage",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* expression language */
    @javax.xml.bind.annotation.XmlEnumValue("ExpressionLanguage")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/ExpressionLanguage" )
    Expression_Language( "https://ontology.mayo.edu/taxonomies/KAO/LanguageRole#a5ab6baf-81bc-320a-baa8-4e55185f5978", "a5ab6baf-81bc-320a-baa8-4e55185f5978", "ExpressionLanguage", java.util.Arrays.asList( "ExpressionLanguage" ), "expression language", "https://www.omg.org/spec/API4KP/api4kp-kao/ExpressionLanguage",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/LanguageRole" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/LanguageRole/SNAPSHOT/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/LanguageRole/SNAPSHOT/"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.languagerole.KnowledgeRepresentationLanguageRole.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.languagerole.KnowledgeRepresentationLanguageRole.SCHEME_ID )
      .withVersion( "20200816-213256" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, KnowledgeRepresentationLanguageRole> index = indexByUUID(KnowledgeRepresentationLanguageRole.values());

  private TermDescription description;
  private KnowledgeRepresentationLanguageRoleSeries series;

  public TermDescription getDescription() {
    return description;
  }

  KnowledgeRepresentationLanguageRole(final String conceptId, final String conceptUUID,
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
  public KnowledgeRepresentationLanguageRoleSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.languagerole.KnowledgeRepresentationLanguageRole> asSeries() {
    return toSeries();
  }

  private KnowledgeRepresentationLanguageRoleSeries toSeries() {
    if (series == null) {
      series = (KnowledgeRepresentationLanguageRoleSeries) KnowledgeRepresentationLanguageRoleSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<KnowledgeRepresentationLanguageRole> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<KnowledgeRepresentationLanguageRole> {
    protected KnowledgeRepresentationLanguageRole[] getValues() {
      return values();
    }
    @Override
    protected Optional<KnowledgeRepresentationLanguageRole> resolveUUID(UUID uuid) {
      return KnowledgeRepresentationLanguageRole.resolveUUID(uuid);
    }
  }


  public static Optional<KnowledgeRepresentationLanguageRole> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageRole> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageRole> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageRole> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageRole> resolveTag(final String tag) {
    Optional<KnowledgeRepresentationLanguageRole> l = resolveTerm(tag, KnowledgeRepresentationLanguageRole.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, KnowledgeRepresentationLanguageRole.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeRepresentationLanguageRole> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageRole> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeRepresentationLanguageRole.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeRepresentationLanguageRole> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeRepresentationLanguageRole.values(), Term::getRef);
  }

}
