package edu.mayo.ontology.taxonomies.kao.publicationstatus;

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

@javax.xml.bind.annotation.XmlType(name = "PublicationStatusSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( PublicationStatusSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = PublicationStatusSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = PublicationStatusSeries.JsonDeserializer.class )
public enum PublicationStatusSeries implements PublicationStatus, Series<PublicationStatus> {

    Restricted_Access(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Restricted_Access    ) , 
       Retracted_From_Publication(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Retracted_From_Publication    ) , 
       Enhanced(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Enhanced    ) , 
       Rejected_For_Publication(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Rejected_For_Publication    ) , 
       Closed_Access(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Closed_Access    ) , 
       Gold_Open_Access(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Gold_Open_Access    ) , 
       Initial_Draft(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Initial_Draft    ) , 
       Under_Review(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Under_Review    ) , 
       Draft(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Draft    ) , 
       Archived(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Archived    ) , 
       Embargoed(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Embargoed    ) , 
       Withdrawn_From_Submission(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Withdrawn_From_Submission    ) , 
       Confidential(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Confidential    ) , 
       Intermediate_Draft(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Intermediate_Draft    ) , 
       Published(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Published    ) , 
       Version_Of_Record(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Version_Of_Record    ) , 
       Corrected(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Corrected    ) , 
       Proof(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Proof    ) , 
       Copy_Edited(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Copy_Edited    ) , 
       Gratis_Open_Access(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Gratis_Open_Access    ) , 
       Reviewed(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Reviewed    ) , 
       Green_Open_Access(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Green_Open_Access    ) , 
       Subscription_Access(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Subscription_Access    ) , 
       Anonymized(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Anonymized    ) , 
       Libre_Open_Access(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Libre_Open_Access    ) , 
       Accepted_For_Publication(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Accepted_For_Publication    ) , 
       Submitted(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Submitted    ) , 
       Republished(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Republished    ) , 
       Non_Confidential(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Non_Confidential    ) , 
       Final_Draft(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Final_Draft    ) , 
       Revised(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Revised    ) , 
       Open_Access(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Open_Access    ) , 
       Catalogued(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Catalogued    ) , 
       Peer_Reviewed(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Peer_Reviewed    ) , 
       Unpublished(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.Unpublished    ) , 
       In_Press(  edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01.PublicationStatus.In_Press    ) 
   ;

  private static final Map<UUID, PublicationStatusSeries> index = indexByUUID(PublicationStatusSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213241"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus/2014-02-01")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<PublicationStatus> versions;

  PublicationStatusSeries(PublicationStatus... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<PublicationStatus> getVersions() {
    return versions;
  }

  public PublicationStatusSeries asEnum() {
    return this;
  }

  public Series<PublicationStatus> asSeries() {
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
    return PublicationStatus.seriesNamespace;
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

  public static Optional<PublicationStatus> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<PublicationStatus> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<PublicationStatus> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<PublicationStatus> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<PublicationStatus> resolveTag(final String tag) {
    Optional<PublicationStatus> l = resolveTerm(tag,  PublicationStatusSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  PublicationStatusSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<PublicationStatus> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<PublicationStatus> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, PublicationStatusSeries.values(), Term::getConceptId);
  }

  public static Optional<PublicationStatus> resolveRef(final URI refUri) {
    return resolveTerm(refUri, PublicationStatusSeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new PublicationStatusSeries.Adapter();
    protected PublicationStatusSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends LegacyURITermsJsonAdapter.Serializer<PublicationStatus> {

  }

  public static class JsonDeserializer extends LegacyURITermsJsonAdapter.Deserializer<PublicationStatus> {
    protected PublicationStatus[] getValues() { return values(); }

    @Override
    protected Optional<PublicationStatus> resolveUUID(UUID uuid) {
      return PublicationStatusSeries.resolveUUID(uuid);
    }
  }
}


