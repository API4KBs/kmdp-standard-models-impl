package edu.mayo.ontology.taxonomies.kao.rel.summaryreltype;

import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.resolveTerm;

import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;
import edu.mayo.kmdp.terms.adapters.xml.LegacyTermsXMLAdapter;
import java.net.URI;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;

@javax.xml.bind.annotation.XmlType(name = "SummarizationTypeSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( SummarizationTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = SummarizationTypeSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = SummarizationTypeSeries.JsonDeserializer.class )
public enum SummarizationTypeSeries implements SummarizationType, Series<SummarizationType> {

    Compact_Representation_Of(  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Compact_Representation_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.summaryreltype._20190801.SummarizationType.Compact_Representation_Of    ) , 
       Digest_Of(  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Digest_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.summaryreltype._20190801.SummarizationType.Digest_Of    ) , 
       Compression_Of(  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Compression_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.summaryreltype._20190801.SummarizationType.Compression_Of    ) , 
       Abdridgement_Of(  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Abdridgement_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.summaryreltype._20190801.SummarizationType.Abdridgement_Of    ) , 
       Summarization_Of(  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Summarization_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.summaryreltype._20190801.SummarizationType.Summarization_Of    ) , 
       Synopsis_Of(  edu.mayo.ontology.taxonomies.kao.rel.summaryreltype.snapshot.SummarizationType.Synopsis_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.summaryreltype._20190801.SummarizationType.Synopsis_Of    ) 
   ;

  private static final Map<UUID, SummarizationTypeSeries> index = indexByUUID(SummarizationTypeSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213221"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/SummaryRelType/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/SummaryRelType/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<SummarizationType> versions;

  SummarizationTypeSeries(SummarizationType... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<SummarizationType> getVersions() {
    return versions;
  }

  public SummarizationTypeSeries asEnum() {
    return this;
  }

  public Series<SummarizationType> asSeries() {
    return this;
  }

  public static int count() {
    return values().length;
  }

  public static int countUnexpired() {
    return  (int) Arrays.stream(values())
        .filter(x -> !x.isSeriesExpired())
        .count();
  }

  @Override
  public TermDescription getDescription() {
    return latest().map(ConceptTerm::getDescription)
        .orElse(null);
  }

  @Override
  public NamespaceIdentifier getNamespace() {
    return SummarizationType.seriesNamespace;
  }
  
  @Override
  public VersionedIdentifier getVersionIdentifier() {
    return getLatest().getVersionIdentifier();
  }  

  @Override
  public boolean isSeriesExpired() {
    Date lastEstablished = getLatest().getVersionEstablishedOn();
    return ! schemeReleases.isEmpty() && schemeReleases.get(0).compareTo(lastEstablished) > 0;
  }

  @Override
  public Optional<Date> getSeriesExpiredOn() {
    Date lastEstablished = getLatest().getVersionEstablishedOn();
    return schemeReleases.stream()
        .filter(r -> r.compareTo(lastEstablished) > 0)
        .min(java.util.Comparator.naturalOrder());
  }


  @Override
  public String getVersionTag() {
    return getNamespace().getVersion();
  }

  @Override
  public Date getEstablishedOn() {
    return getNamespace().getEstablishedOn();
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
    Optional<SummarizationType> l = resolveTerm(tag,  SummarizationTypeSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  SummarizationTypeSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<SummarizationType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<SummarizationType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, SummarizationTypeSeries.values(), Term::getConceptId);
  }

  public static Optional<SummarizationType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, SummarizationTypeSeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new SummarizationTypeSeries.Adapter();
    protected SummarizationTypeSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<SummarizationType> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<SummarizationType> {
    protected SummarizationType[] getValues() { return values(); }

    @Override
    protected Optional<SummarizationType> resolveUUID(UUID uuid) {
      return SummarizationTypeSeries.resolveUUID(uuid);
    }
  }
}


