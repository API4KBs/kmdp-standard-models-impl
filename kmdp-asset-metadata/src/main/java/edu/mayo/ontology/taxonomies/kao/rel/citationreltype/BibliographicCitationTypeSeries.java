package edu.mayo.ontology.taxonomies.kao.rel.citationreltype;

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

@javax.xml.bind.annotation.XmlType(name = "BibliographicCitationTypeSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( BibliographicCitationTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = BibliographicCitationTypeSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = BibliographicCitationTypeSeries.JsonDeserializer.class )
public enum BibliographicCitationTypeSeries implements BibliographicCitationType, Series<BibliographicCitationType> {

    Cites_As_Metadata_Document(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites_As_Metadata_Document    ) , 
       Links_To(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Links_To    ) , 
       Plagiarizes(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Plagiarizes    ) , 
       Supports(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Supports    ) , 
       Corrects(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Corrects    ) , 
       Qualifies(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Qualifies    ) , 
       Cites_As_Data_Source(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites_As_Data_Source    ) , 
       Obtains_Background_From(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Obtains_Background_From    ) , 
       Reviews(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Reviews    ) , 
       Cites_As_Potential_Solution(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites_As_Potential_Solution    ) , 
       Updates(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Updates    ) , 
       Compiles(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Compiles    ) , 
       Speculates_On(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Speculates_On    ) , 
       Cites_As_Evidence(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites_As_Evidence    ) , 
       Cites_As_Source_Document(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites_As_Source_Document    ) , 
       Uses_Data_From(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Uses_Data_From    ) , 
       Replies_To(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Replies_To    ) , 
       Cites_As_Authority(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites_As_Authority    ) , 
       Uses_Conclusions_From(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Uses_Conclusions_From    ) , 
       Extends(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Extends    ) , 
       Discusses(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Discusses    ) , 
       Includes_Excerpt_From(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Includes_Excerpt_From    ) , 
       Obtains_Support_From(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Obtains_Support_From    ) , 
       Cites_As_Related(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites_As_Related    ) , 
       Agrees_With(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Agrees_With    ) , 
       Includes_Quotation_From(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Includes_Quotation_From    ) , 
       Cites_For_Information(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites_For_Information    ) , 
       Uses_Method_In(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Uses_Method_In    ) , 
       Disagrees_With(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Disagrees_With    ) , 
       Cites(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites    ) , 
       Critiques(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Critiques    ) , 
       Disputes(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Disputes    ) , 
       Refutes(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Refutes    ) , 
       Credits(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Credits    ) , 
       Ridicules(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Ridicules    ) , 
       Contains_Assertion_From(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Contains_Assertion_From    ) , 
       Derides(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Derides    ) , 
       Retracts(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Retracts    ) , 
       Citation(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Citation    ) , 
       Confirms(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Confirms    ) , 
       Cites_As_Recommended_Reading(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites_As_Recommended_Reading    ) , 
       Documents(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Documents    ) , 
       Parodies(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Parodies    ) , 
       Describes(  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Describes    ) 
   ;

  private static final Map<UUID, BibliographicCitationTypeSeries> index = indexByUUID(BibliographicCitationTypeSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213254"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType/2018-02-16")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<BibliographicCitationType> versions;

  BibliographicCitationTypeSeries(BibliographicCitationType... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<BibliographicCitationType> getVersions() {
    return versions;
  }

  public BibliographicCitationTypeSeries asEnum() {
    return this;
  }

  public Series<BibliographicCitationType> asSeries() {
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
    return BibliographicCitationType.seriesNamespace;
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

  public static Optional<BibliographicCitationType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<BibliographicCitationType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<BibliographicCitationType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<BibliographicCitationType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<BibliographicCitationType> resolveTag(final String tag) {
    Optional<BibliographicCitationType> l = resolveTerm(tag,  BibliographicCitationTypeSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  BibliographicCitationTypeSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<BibliographicCitationType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<BibliographicCitationType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, BibliographicCitationTypeSeries.values(), Term::getConceptId);
  }

  public static Optional<BibliographicCitationType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, BibliographicCitationTypeSeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new BibliographicCitationTypeSeries.Adapter();
    protected BibliographicCitationTypeSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends LegacyURITermsJsonAdapter.Serializer<BibliographicCitationType> {

  }

  public static class JsonDeserializer extends LegacyURITermsJsonAdapter.Deserializer<BibliographicCitationType> {
    protected BibliographicCitationType[] getValues() { return values(); }

    @Override
    protected Optional<BibliographicCitationType> resolveUUID(UUID uuid) {
      return BibliographicCitationTypeSeries.resolveUUID(uuid);
    }
  }
}


