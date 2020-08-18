package edu.mayo.ontology.taxonomies.api4kp.parsinglevel;

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

@javax.xml.bind.annotation.XmlType(name = "ParsingLevelSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( ParsingLevelSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = ParsingLevelSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = ParsingLevelSeries.JsonDeserializer.class )
public enum ParsingLevelSeries implements ParsingLevel, Series<ParsingLevel> {

    Knowledge_Expression(  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Knowledge_Expression  ,   edu.mayo.ontology.taxonomies.api4kp.parsinglevel._20190801.ParsingLevel.Knowledge_Expression    ) , 
       Encoded_Knowledge_Expression(  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Encoded_Knowledge_Expression  ,   edu.mayo.ontology.taxonomies.api4kp.parsinglevel._20190801.ParsingLevel.Encoded_Knowledge_Expression    ) , 
       Concrete_Knowledge_Expression(  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Concrete_Knowledge_Expression  ,   edu.mayo.ontology.taxonomies.api4kp.parsinglevel._20190801.ParsingLevel.Concrete_Knowledge_Expression    ) , 
       Parsed_Knowedge_Expression(  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Parsed_Knowedge_Expression  ,   edu.mayo.ontology.taxonomies.api4kp.parsinglevel._20190801.ParsingLevel.Parsed_Knowedge_Expression    ) , 
       Abstract_Knowledge_Expression(  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Abstract_Knowledge_Expression  ,   edu.mayo.ontology.taxonomies.api4kp.parsinglevel._20190801.ParsingLevel.Abstract_Knowledge_Expression    ) , 
       Knowledge_Asset_Surogate(  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Knowledge_Asset_Surogate    ) 
   ;

  private static final Map<UUID, ParsingLevelSeries> index = indexByUUID(ParsingLevelSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213270"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/API4KP/ParsingLevel/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/API4KP/ParsingLevel/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<ParsingLevel> versions;

  ParsingLevelSeries(ParsingLevel... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<ParsingLevel> getVersions() {
    return versions;
  }

  public ParsingLevelSeries asEnum() {
    return this;
  }

  public Series<ParsingLevel> asSeries() {
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
    return ParsingLevel.seriesNamespace;
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

  public static Optional<ParsingLevel> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<ParsingLevel> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<ParsingLevel> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<ParsingLevel> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<ParsingLevel> resolveTag(final String tag) {
    Optional<ParsingLevel> l = resolveTerm(tag,  ParsingLevelSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  ParsingLevelSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<ParsingLevel> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<ParsingLevel> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, ParsingLevelSeries.values(), Term::getConceptId);
  }

  public static Optional<ParsingLevel> resolveRef(final URI refUri) {
    return resolveTerm(refUri, ParsingLevelSeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new ParsingLevelSeries.Adapter();
    protected ParsingLevelSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<ParsingLevel> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<ParsingLevel> {
    protected ParsingLevel[] getValues() { return values(); }

    @Override
    protected Optional<ParsingLevel> resolveUUID(UUID uuid) {
      return ParsingLevelSeries.resolveUUID(uuid);
    }
  }
}


