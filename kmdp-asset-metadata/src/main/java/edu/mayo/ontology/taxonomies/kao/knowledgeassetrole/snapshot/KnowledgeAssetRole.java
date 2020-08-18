package edu.mayo.ontology.taxonomies.kao.knowledgeassetrole.snapshot;

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
import edu.mayo.ontology.taxonomies.kao.knowledgeassetrole.KnowledgeAssetRoleSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "KnowledgeAssetRole")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeAssetRole.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeAssetRole.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeAssetRole.JsonDeserializer.class )
public enum KnowledgeAssetRole implements edu.mayo.ontology.taxonomies.kao.knowledgeassetrole.KnowledgeAssetRole {


    /* Component Knowledge Asset */
    @javax.xml.bind.annotation.XmlEnumValue("ComponentKnowledgeAsset")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/ComponentKnowledgeAsset" )
    Component_Knowledge_Asset( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetRole#48783b85-1b63-3335-a298-a21d08767744", "48783b85-1b63-3335-a298-a21d08767744", "ComponentKnowledgeAsset", java.util.Arrays.asList( "ComponentKnowledgeAsset" ), "Component Knowledge Asset", "https://www.omg.org/spec/API4KP/api4kp-kao/ComponentKnowledgeAsset",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Constructive Definition of a (resolvable) Concept that specifies how to resolve that Concept in some context or situation.Some definitions have conditional applicability, limiting the class of situations in which they can be used */
    @javax.xml.bind.annotation.XmlEnumValue("OperationalConceptDefinition")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/OperationalConceptDefinition" )
    Operational_Concept_Definition( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetRole#383a42ba-5016-3450-a983-608bd7b56eef", "383a42ba-5016-3450-a983-608bd7b56eef", "OperationalConceptDefinition", java.util.Arrays.asList( "OperationalConceptDefinition" ), "Operational Concept Definition", "https://www.omg.org/spec/API4KP/api4kp-kao/OperationalConceptDefinition",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Composite Knowledge Asset */
    @javax.xml.bind.annotation.XmlEnumValue("CompositeKnowledgeAsset")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/CompositeKnowledgeAsset" )
    Composite_Knowledge_Asset( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetRole#5b7aac40-21d6-3190-ab54-bd22ef4d8497", "5b7aac40-21d6-3190-ab54-bd22ef4d8497", "CompositeKnowledgeAsset", java.util.Arrays.asList( "CompositeKnowledgeAsset" ), "Composite Knowledge Asset", "https://www.omg.org/spec/API4KP/api4kp-kao/CompositeKnowledgeAsset",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetRole" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetRole/SNAPSHOT/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetRole/SNAPSHOT/"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.knowledgeassetrole.KnowledgeAssetRole.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.knowledgeassetrole.KnowledgeAssetRole.SCHEME_ID )
      .withVersion( "20200816-213241" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, KnowledgeAssetRole> index = indexByUUID(KnowledgeAssetRole.values());

  private TermDescription description;
  private KnowledgeAssetRoleSeries series;

  public TermDescription getDescription() {
    return description;
  }

  KnowledgeAssetRole(final String conceptId, final String conceptUUID,
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
  public KnowledgeAssetRoleSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.knowledgeassetrole.KnowledgeAssetRole> asSeries() {
    return toSeries();
  }

  private KnowledgeAssetRoleSeries toSeries() {
    if (series == null) {
      series = (KnowledgeAssetRoleSeries) KnowledgeAssetRoleSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<KnowledgeAssetRole> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<KnowledgeAssetRole> {
    protected KnowledgeAssetRole[] getValues() {
      return values();
    }
    @Override
    protected Optional<KnowledgeAssetRole> resolveUUID(UUID uuid) {
      return KnowledgeAssetRole.resolveUUID(uuid);
    }
  }


  public static Optional<KnowledgeAssetRole> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeAssetRole> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeAssetRole> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeAssetRole> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeAssetRole> resolveTag(final String tag) {
    Optional<KnowledgeAssetRole> l = resolveTerm(tag, KnowledgeAssetRole.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, KnowledgeAssetRole.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeAssetRole> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeAssetRole> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeAssetRole.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeAssetRole> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeAssetRole.values(), Term::getRef);
  }

}
