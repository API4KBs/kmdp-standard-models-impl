package edu.mayo.ontology.taxonomies.kao.publicationeventtype;

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

@javax.xml.bind.annotation.XmlType(name = "PublicationEventTypeSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( PublicationEventTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = PublicationEventTypeSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = PublicationEventTypeSeries.JsonDeserializer.class )
public enum PublicationEventTypeSeries implements PublicationEventType, Series<PublicationEventType> {

    Authoring(  edu.mayo.ontology.taxonomies.kao.publicationeventtype.snapshot.PublicationEventType.Authoring    ) , 
       Review(  edu.mayo.ontology.taxonomies.kao.publicationeventtype.snapshot.PublicationEventType.Review    ) , 
       Editing(  edu.mayo.ontology.taxonomies.kao.publicationeventtype.snapshot.PublicationEventType.Editing    ) , 
       Creation(  edu.mayo.ontology.taxonomies.kao.publicationeventtype.snapshot.PublicationEventType.Creation    ) , 
       Publication(  edu.mayo.ontology.taxonomies.kao.publicationeventtype.snapshot.PublicationEventType.Publication    ) , 
       Revision(  edu.mayo.ontology.taxonomies.kao.publicationeventtype.snapshot.PublicationEventType.Revision    ) , 
       Approval(  edu.mayo.ontology.taxonomies.kao.publicationeventtype.snapshot.PublicationEventType.Approval    ) 
   ;

  private static final Map<UUID, PublicationEventTypeSeries> index = indexByUUID(PublicationEventTypeSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213247"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/PublicationEventType/SNAPSHOT/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<PublicationEventType> versions;

  PublicationEventTypeSeries(PublicationEventType... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<PublicationEventType> getVersions() {
    return versions;
  }

  public PublicationEventTypeSeries asEnum() {
    return this;
  }

  public Series<PublicationEventType> asSeries() {
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
    return PublicationEventType.seriesNamespace;
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

  public static Optional<PublicationEventType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<PublicationEventType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<PublicationEventType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<PublicationEventType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<PublicationEventType> resolveTag(final String tag) {
    Optional<PublicationEventType> l = resolveTerm(tag,  PublicationEventTypeSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  PublicationEventTypeSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<PublicationEventType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<PublicationEventType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, PublicationEventTypeSeries.values(), Term::getConceptId);
  }

  public static Optional<PublicationEventType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, PublicationEventTypeSeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new PublicationEventTypeSeries.Adapter();
    protected PublicationEventTypeSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<PublicationEventType> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<PublicationEventType> {
    protected PublicationEventType[] getValues() { return values(); }

    @Override
    protected Optional<PublicationEventType> resolveUUID(UUID uuid) {
      return PublicationEventTypeSeries.resolveUUID(uuid);
    }
  }
}


