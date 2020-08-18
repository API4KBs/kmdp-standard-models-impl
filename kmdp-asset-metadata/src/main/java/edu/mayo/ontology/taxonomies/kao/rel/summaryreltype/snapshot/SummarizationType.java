package edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot;

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
import edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.SummarizationTypeSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "SummarizationType")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( SummarizationType.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = SummarizationType.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = SummarizationType.JsonDeserializer.class )
public enum SummarizationType implements edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.SummarizationType {


    /* compact representation of */
    @javax.xml.bind.annotation.XmlEnumValue("compact-representation-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/compact-representation-of" )
    Compact_Representation_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/SummaryRelType#6a3e565f-581b-3e9a-9a82-3e3862d9b1e6", "6a3e565f-581b-3e9a-9a82-3e3862d9b1e6", "compact-representation-of", java.util.Arrays.asList( "compact-representation-of" ), "compact representation of", "https://www.omg.org/spec/API4KP/api4kp/compact-representation-of",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* summarization of */
    @javax.xml.bind.annotation.XmlEnumValue("summarization-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/summarization-of" )
    Summarization_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/SummaryRelType#bb7caa52-4202-38f0-b5b7-729602e2d459", "bb7caa52-4202-38f0-b5b7-729602e2d459", "summarization-of", java.util.Arrays.asList( "summarization-of" ), "summarization of", "https://www.omg.org/spec/API4KP/api4kp/summarization-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Compact_Representation_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Compact_Representation_Of,  } ) , 
   
    /* synopsis of */
    @javax.xml.bind.annotation.XmlEnumValue("synopsis-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/synopsis-of" )
    Synopsis_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/SummaryRelType#7d490997-4223-35bd-8c05-ec54bb4c8b68", "7d490997-4223-35bd-8c05-ec54bb4c8b68", "synopsis-of", java.util.Arrays.asList( "synopsis-of" ), "synopsis of", "https://www.omg.org/spec/API4KP/api4kp/synopsis-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Summarization_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Summarization_Of,  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Compact_Representation_Of,  } ) , 
   
    /* digest of */
    @javax.xml.bind.annotation.XmlEnumValue("digest-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/digest-of" )
    Digest_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/SummaryRelType#f896008d-227b-32d1-a8f9-ea74f4adab7f", "f896008d-227b-32d1-a8f9-ea74f4adab7f", "digest-of", java.util.Arrays.asList( "digest-of" ), "digest of", "https://www.omg.org/spec/API4KP/api4kp/digest-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Summarization_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Summarization_Of,  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Compact_Representation_Of,  } ) , 
   
    /* compression of */
    @javax.xml.bind.annotation.XmlEnumValue("compression-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/compression-of" )
    Compression_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/SummaryRelType#d156995d-4e23-36b9-823b-e6780cab563f", "d156995d-4e23-36b9-823b-e6780cab563f", "compression-of", java.util.Arrays.asList( "compression-of" ), "compression of", "https://www.omg.org/spec/API4KP/api4kp/compression-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Compact_Representation_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Compact_Representation_Of,  } ) , 
   
    /* abdridgement of */
    @javax.xml.bind.annotation.XmlEnumValue("abridgement-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/abridgement-of" )
    Abdridgement_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/SummaryRelType#fb08d593-c4b4-3e2c-b3e8-4a24d874c11d", "fb08d593-c4b4-3e2c-b3e8-4a24d874c11d", "abridgement-of", java.util.Arrays.asList( "abridgement-of" ), "abdridgement of", "https://www.omg.org/spec/API4KP/api4kp/abridgement-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Compact_Representation_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Compact_Representation_Of,  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/Rel/SummaryRelType" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/SummaryRelType/SNAPSHOT/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/SummaryRelType/SNAPSHOT/"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.SummarizationType.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.SummarizationType.SCHEME_ID )
      .withVersion( "20200816-213221" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, SummarizationType> index = indexByUUID(SummarizationType.values());

  private TermDescription description;
  private SummarizationTypeSeries series;

  public TermDescription getDescription() {
    return description;
  }

  SummarizationType(final String conceptId, final String conceptUUID,
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
  public SummarizationTypeSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.SummarizationType> asSeries() {
    return toSeries();
  }

  private SummarizationTypeSeries toSeries() {
    if (series == null) {
      series = (SummarizationTypeSeries) SummarizationTypeSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<SummarizationType> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<SummarizationType> {
    protected SummarizationType[] getValues() {
      return values();
    }
    @Override
    protected Optional<SummarizationType> resolveUUID(UUID uuid) {
      return SummarizationType.resolveUUID(uuid);
    }
  }


  public static Optional<SummarizationType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<SummarizationType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<SummarizationType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<SummarizationType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<SummarizationType> resolveTag(final String tag) {
    Optional<SummarizationType> l = resolveTerm(tag, SummarizationType.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, SummarizationType.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<SummarizationType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<SummarizationType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, SummarizationType.values(), Term::getConceptId);
  }

  public static Optional<SummarizationType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, SummarizationType.values(), Term::getRef);
  }

}
