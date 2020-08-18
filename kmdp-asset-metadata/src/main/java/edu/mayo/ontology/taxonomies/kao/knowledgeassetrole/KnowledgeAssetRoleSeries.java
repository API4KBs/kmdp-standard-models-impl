package edu.mayo.ontology.taxonomies.kao.knowledgeassetrole;

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

@javax.xml.bind.annotation.XmlType(name = "KnowledgeAssetRoleSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeAssetRoleSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeAssetRoleSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeAssetRoleSeries.JsonDeserializer.class )
public enum KnowledgeAssetRoleSeries implements KnowledgeAssetRole, Series<KnowledgeAssetRole> {

    Operational_Concept_Definition(  edu.mayo.ontology.taxonomies.kao.knowledgeassetrole.snapshot.KnowledgeAssetRole.Operational_Concept_Definition  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassetrole._20190801.KnowledgeAssetRole.Operational_Concept_Definition    ) , 
       Component_Knowledge_Asset(  edu.mayo.ontology.taxonomies.kao.knowledgeassetrole.snapshot.KnowledgeAssetRole.Component_Knowledge_Asset  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassetrole._20190801.KnowledgeAssetRole.Component_Knowledge_Asset    ) , 
       Composite_Knowledge_Asset(  edu.mayo.ontology.taxonomies.kao.knowledgeassetrole.snapshot.KnowledgeAssetRole.Composite_Knowledge_Asset  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassetrole._20190801.KnowledgeAssetRole.Composite_Knowledge_Asset    ) 
   ;

  private static final Map<UUID, KnowledgeAssetRoleSeries> index = indexByUUID(KnowledgeAssetRoleSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213241"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetRole/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetRole/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<KnowledgeAssetRole> versions;

  KnowledgeAssetRoleSeries(KnowledgeAssetRole... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<KnowledgeAssetRole> getVersions() {
    return versions;
  }

  public KnowledgeAssetRoleSeries asEnum() {
    return this;
  }

  public Series<KnowledgeAssetRole> asSeries() {
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
    return KnowledgeAssetRole.seriesNamespace;
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
    Optional<KnowledgeAssetRole> l = resolveTerm(tag,  KnowledgeAssetRoleSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  KnowledgeAssetRoleSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeAssetRole> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeAssetRole> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeAssetRoleSeries.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeAssetRole> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeAssetRoleSeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new KnowledgeAssetRoleSeries.Adapter();
    protected KnowledgeAssetRoleSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends LegacyURITermsJsonAdapter.Serializer<KnowledgeAssetRole> {

  }

  public static class JsonDeserializer extends LegacyURITermsJsonAdapter.Deserializer<KnowledgeAssetRole> {
    protected KnowledgeAssetRole[] getValues() { return values(); }

    @Override
    protected Optional<KnowledgeAssetRole> resolveUUID(UUID uuid) {
      return KnowledgeAssetRoleSeries.resolveUUID(uuid);
    }
  }
}


