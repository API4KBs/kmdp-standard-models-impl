package edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory;

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

@javax.xml.bind.annotation.XmlType(name = "KnowledgeAssetCategorySeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeAssetCategorySeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeAssetCategorySeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeAssetCategorySeries.JsonDeserializer.class )
public enum KnowledgeAssetCategorySeries implements KnowledgeAssetCategory, Series<KnowledgeAssetCategory> {

    Terminology_Ontology_And_Assertional_KBs(  edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory.snapshot.KnowledgeAssetCategory.Terminology_Ontology_And_Assertional_KBs  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory._20190801.KnowledgeAssetCategory.Terminology_Ontology_And_Assertional_KBs    ) , 
       KPIs_Measurements_And_Metrics(  edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory.snapshot.KnowledgeAssetCategory.KPIs_Measurements_And_Metrics  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory._20190801.KnowledgeAssetCategory.KPIs_Measurements_And_Metrics    ) , 
       Rules_Policies_And_Guidelines(  edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory.snapshot.KnowledgeAssetCategory.Rules_Policies_And_Guidelines  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory._20190801.KnowledgeAssetCategory.Rules_Policies_And_Guidelines    ) , 
       Structured_Information_And_Data_Capture_Models(  edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory.snapshot.KnowledgeAssetCategory.Structured_Information_And_Data_Capture_Models  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory._20190801.KnowledgeAssetCategory.Structured_Information_And_Data_Capture_Models    ) , 
       Assessment_Predictive_And_Inferential_Models(  edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory.snapshot.KnowledgeAssetCategory.Assessment_Predictive_And_Inferential_Models  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory._20190801.KnowledgeAssetCategory.Assessment_Predictive_And_Inferential_Models    ) , 
       Plans_Processes_Pathways_And_Protocol_Definitions(  edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory.snapshot.KnowledgeAssetCategory.Plans_Processes_Pathways_And_Protocol_Definitions  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory._20190801.KnowledgeAssetCategory.Plans_Processes_Pathways_And_Protocol_Definitions    ) 
   ;

  private static final Map<UUID, KnowledgeAssetCategorySeries> index = indexByUUID(KnowledgeAssetCategorySeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213226"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetCategory/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetCategory/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<KnowledgeAssetCategory> versions;

  KnowledgeAssetCategorySeries(KnowledgeAssetCategory... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<KnowledgeAssetCategory> getVersions() {
    return versions;
  }

  public KnowledgeAssetCategorySeries asEnum() {
    return this;
  }

  public Series<KnowledgeAssetCategory> asSeries() {
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
    return KnowledgeAssetCategory.seriesNamespace;
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

  public static Optional<KnowledgeAssetCategory> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeAssetCategory> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeAssetCategory> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeAssetCategory> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeAssetCategory> resolveTag(final String tag) {
    Optional<KnowledgeAssetCategory> l = resolveTerm(tag,  KnowledgeAssetCategorySeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  KnowledgeAssetCategorySeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeAssetCategory> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeAssetCategory> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeAssetCategorySeries.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeAssetCategory> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeAssetCategorySeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new KnowledgeAssetCategorySeries.Adapter();
    protected KnowledgeAssetCategorySeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends LegacyURITermsJsonAdapter.Serializer<KnowledgeAssetCategory> {

  }

  public static class JsonDeserializer extends LegacyURITermsJsonAdapter.Deserializer<KnowledgeAssetCategory> {
    protected KnowledgeAssetCategory[] getValues() { return values(); }

    @Override
    protected Optional<KnowledgeAssetCategory> resolveUUID(UUID uuid) {
      return KnowledgeAssetCategorySeries.resolveUUID(uuid);
    }
  }
}


