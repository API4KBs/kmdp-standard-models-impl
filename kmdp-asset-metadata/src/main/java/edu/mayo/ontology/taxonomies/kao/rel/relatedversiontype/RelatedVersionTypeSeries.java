package edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype;

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

@javax.xml.bind.annotation.XmlType(name = "RelatedVersionTypeSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( RelatedVersionTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = RelatedVersionTypeSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = RelatedVersionTypeSeries.JsonDeserializer.class )
public enum RelatedVersionTypeSeries implements RelatedVersionType, Series<RelatedVersionType> {

    Has_Previous_Version(  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype.snapshot.RelatedVersionType.Has_Previous_Version  ,   edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Previous_Version    ) , 
       Is_Later_Versioned_Revision_Of(  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype.snapshot.RelatedVersionType.Is_Later_Versioned_Revision_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Is_Later_Versioned_Revision_Of    ) , 
       Has_Prior_Version(  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype.snapshot.RelatedVersionType.Has_Prior_Version  ,   edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Prior_Version    ) , 
       Has_Next_Immediate_Versioned_Revision(  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype.snapshot.RelatedVersionType.Has_Next_Immediate_Versioned_Revision  ,   edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Next_Immediate_Versioned_Revision    ) , 
       Has_Next_Version(  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype.snapshot.RelatedVersionType.Has_Next_Version  ,   edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Next_Version    ) , 
       Has_Later_Versioned_Revision(  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype.snapshot.RelatedVersionType.Has_Later_Versioned_Revision  ,   edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Later_Versioned_Revision    ) , 
       Has_Original(  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype.snapshot.RelatedVersionType.Has_Original  ,   edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Original    ) , 
       Is_Immediate_Next_Versioned_Revision_Of(  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype.snapshot.RelatedVersionType.Is_Immediate_Next_Versioned_Revision_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Is_Immediate_Next_Versioned_Revision_Of    ) , 
       Has_Latest(  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype.snapshot.RelatedVersionType.Has_Latest  ,   edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Latest    ) , 
       Has_Successor_Version(  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype.snapshot.RelatedVersionType.Has_Successor_Version  ,   edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Successor_Version    ) 
   ;

  private static final Map<UUID, RelatedVersionTypeSeries> index = indexByUUID(RelatedVersionTypeSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213207"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<RelatedVersionType> versions;

  RelatedVersionTypeSeries(RelatedVersionType... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<RelatedVersionType> getVersions() {
    return versions;
  }

  public RelatedVersionTypeSeries asEnum() {
    return this;
  }

  public Series<RelatedVersionType> asSeries() {
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
    return RelatedVersionType.seriesNamespace;
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

  public static Optional<RelatedVersionType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<RelatedVersionType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<RelatedVersionType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<RelatedVersionType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<RelatedVersionType> resolveTag(final String tag) {
    Optional<RelatedVersionType> l = resolveTerm(tag,  RelatedVersionTypeSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  RelatedVersionTypeSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<RelatedVersionType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<RelatedVersionType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, RelatedVersionTypeSeries.values(), Term::getConceptId);
  }

  public static Optional<RelatedVersionType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, RelatedVersionTypeSeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new RelatedVersionTypeSeries.Adapter();
    protected RelatedVersionTypeSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<RelatedVersionType> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<RelatedVersionType> {
    protected RelatedVersionType[] getValues() { return values(); }

    @Override
    protected Optional<RelatedVersionType> resolveUUID(UUID uuid) {
      return RelatedVersionTypeSeries.resolveUUID(uuid);
    }
  }
}


