package edu.mayo.ontology.taxonomies.krformat;

import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.resolveTerm;

import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;
import edu.mayo.kmdp.terms.adapters.json.LegacyURITermsJsonAdapter;
import edu.mayo.kmdp.terms.adapters.xml.LegacyTermsXMLAdapter;
import java.net.URI;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;

@javax.xml.bind.annotation.XmlType(name = "SerializationFormatSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( SerializationFormatSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = SerializationFormatSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = SerializationFormatSeries.JsonDeserializer.class )
public enum SerializationFormatSeries implements SerializationFormat, Series<SerializationFormat> {

    JSON(  edu.mayo.ontology.taxonomies.krformat.snapshot.SerializationFormat.JSON  ,   edu.mayo.ontology.taxonomies.krformat._20190801.SerializationFormat.JSON    ) , 
       XML_1_1(  edu.mayo.ontology.taxonomies.krformat.snapshot.SerializationFormat.XML_1_1  ,   edu.mayo.ontology.taxonomies.krformat._20190801.SerializationFormat.XML_1_1    ) , 
       TXT(  edu.mayo.ontology.taxonomies.krformat.snapshot.SerializationFormat.TXT  ,   edu.mayo.ontology.taxonomies.krformat._20190801.SerializationFormat.TXT    ) , 
       RDF_1_1(  edu.mayo.ontology.taxonomies.krformat.snapshot.SerializationFormat.RDF_1_1  ,   edu.mayo.ontology.taxonomies.krformat._20190801.SerializationFormat.RDF_1_1    ) , 
       YAML_1_2(  edu.mayo.ontology.taxonomies.krformat.snapshot.SerializationFormat.YAML_1_2  ,   edu.mayo.ontology.taxonomies.krformat._20190801.SerializationFormat.YAML_1_2    ) 
   ;

  private static final Map<UUID, SerializationFormatSeries> index = indexByUUID(SerializationFormatSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213298"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KRFormat/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KRFormat/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<SerializationFormat> versions;

  SerializationFormatSeries(SerializationFormat... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<SerializationFormat> getVersions() {
    return versions;
  }

  public SerializationFormatSeries asEnum() {
    return this;
  }

  public Series<SerializationFormat> asSeries() {
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
    return SerializationFormat.seriesNamespace;
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

  public static Optional<SerializationFormat> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<SerializationFormat> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<SerializationFormat> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<SerializationFormat> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<SerializationFormat> resolveTag(final String tag) {
    Optional<SerializationFormat> l = resolveTerm(tag,  SerializationFormatSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  SerializationFormatSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<SerializationFormat> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<SerializationFormat> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, SerializationFormatSeries.values(), Term::getConceptId);
  }

  public static Optional<SerializationFormat> resolveRef(final URI refUri) {
    return resolveTerm(refUri, SerializationFormatSeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new SerializationFormatSeries.Adapter();
    protected SerializationFormatSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends LegacyURITermsJsonAdapter.Serializer<SerializationFormat> {

  }

  public static class JsonDeserializer extends LegacyURITermsJsonAdapter.Deserializer<SerializationFormat> {
    protected SerializationFormat[] getValues() { return values(); }

    @Override
    protected Optional<SerializationFormat> resolveUUID(UUID uuid) {
      return SerializationFormatSeries.resolveUUID(uuid);
    }
  }
}


