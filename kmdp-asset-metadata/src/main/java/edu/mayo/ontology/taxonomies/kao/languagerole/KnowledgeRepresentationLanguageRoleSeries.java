package edu.mayo.ontology.taxonomies.kao.languagerole;

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

@javax.xml.bind.annotation.XmlType(name = "KnowledgeRepresentationLanguageRoleSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeRepresentationLanguageRoleSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeRepresentationLanguageRoleSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeRepresentationLanguageRoleSeries.JsonDeserializer.class )
public enum KnowledgeRepresentationLanguageRoleSeries implements KnowledgeRepresentationLanguageRole, Series<KnowledgeRepresentationLanguageRole> {

    Expression_Language(  edu.mayo.ontology.taxonomies.kao.languagerole.snapshot.KnowledgeRepresentationLanguageRole.Expression_Language  ,   edu.mayo.ontology.taxonomies.kao.languagerole._20190801.KnowledgeRepresentationLanguageRole.Expression_Language    ) , 
       Query_Language(  edu.mayo.ontology.taxonomies.kao.languagerole.snapshot.KnowledgeRepresentationLanguageRole.Query_Language  ,   edu.mayo.ontology.taxonomies.kao.languagerole._20190801.KnowledgeRepresentationLanguageRole.Query_Language    ) , 
       Annotation_Language(  edu.mayo.ontology.taxonomies.kao.languagerole.snapshot.KnowledgeRepresentationLanguageRole.Annotation_Language  ,   edu.mayo.ontology.taxonomies.kao.languagerole._20190801.KnowledgeRepresentationLanguageRole.Annotation_Language    ) , 
       Ontology_Language(  edu.mayo.ontology.taxonomies.kao.languagerole.snapshot.KnowledgeRepresentationLanguageRole.Ontology_Language  ,   edu.mayo.ontology.taxonomies.kao.languagerole._20190801.KnowledgeRepresentationLanguageRole.Ontology_Language    ) , 
       Schema_Language(  edu.mayo.ontology.taxonomies.kao.languagerole.snapshot.KnowledgeRepresentationLanguageRole.Schema_Language  ,   edu.mayo.ontology.taxonomies.kao.languagerole._20190801.KnowledgeRepresentationLanguageRole.Schema_Language    ) , 
       Rule_Language(  edu.mayo.ontology.taxonomies.kao.languagerole.snapshot.KnowledgeRepresentationLanguageRole.Rule_Language  ,   edu.mayo.ontology.taxonomies.kao.languagerole._20190801.KnowledgeRepresentationLanguageRole.Rule_Language    ) 
   ;

  private static final Map<UUID, KnowledgeRepresentationLanguageRoleSeries> index = indexByUUID(KnowledgeRepresentationLanguageRoleSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213256"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/LanguageRole/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KAO/LanguageRole/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<KnowledgeRepresentationLanguageRole> versions;

  KnowledgeRepresentationLanguageRoleSeries(KnowledgeRepresentationLanguageRole... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<KnowledgeRepresentationLanguageRole> getVersions() {
    return versions;
  }

  public KnowledgeRepresentationLanguageRoleSeries asEnum() {
    return this;
  }

  public Series<KnowledgeRepresentationLanguageRole> asSeries() {
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
    return KnowledgeRepresentationLanguageRole.seriesNamespace;
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

  public static Optional<KnowledgeRepresentationLanguageRole> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageRole> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageRole> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageRole> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageRole> resolveTag(final String tag) {
    Optional<KnowledgeRepresentationLanguageRole> l = resolveTerm(tag,  KnowledgeRepresentationLanguageRoleSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  KnowledgeRepresentationLanguageRoleSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeRepresentationLanguageRole> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageRole> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeRepresentationLanguageRoleSeries.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeRepresentationLanguageRole> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeRepresentationLanguageRoleSeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new KnowledgeRepresentationLanguageRoleSeries.Adapter();
    protected KnowledgeRepresentationLanguageRoleSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends LegacyURITermsJsonAdapter.Serializer<KnowledgeRepresentationLanguageRole> {

  }

  public static class JsonDeserializer extends LegacyURITermsJsonAdapter.Deserializer<KnowledgeRepresentationLanguageRole> {
    protected KnowledgeRepresentationLanguageRole[] getValues() { return values(); }

    @Override
    protected Optional<KnowledgeRepresentationLanguageRole> resolveUUID(UUID uuid) {
      return KnowledgeRepresentationLanguageRoleSeries.resolveUUID(uuid);
    }
  }
}


