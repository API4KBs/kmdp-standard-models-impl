package edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory;

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

@javax.xml.bind.annotation.XmlType(name = "KnowledgeArtifactCategorySeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeArtifactCategorySeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeArtifactCategorySeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeArtifactCategorySeries.JsonDeserializer.class )
public enum KnowledgeArtifactCategorySeries implements IKnowledgeArtifactCategory, Series<IKnowledgeArtifactCategory> {

    Dataset(  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Dataset    ) , 
       Software(  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Software    ) , 
       Moving_Image(  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Moving_Image    ) , 
       Service(  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Service    ) , 
       Sound(  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Sound    ) , 
       Collection(  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Collection    ) , 
       Event(  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Event    ) , 
       Interactive_Resource(  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Interactive_Resource    ) , 
       Image(  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Image    ) , 
       Text(  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Text    ) , 
       Physical_Object(  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Physical_Object    ) , 
       Still_Image(  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Still_Image    ) 
   ;

  private static final Map<UUID, KnowledgeArtifactCategorySeries> index = indexByUUID(KnowledgeArtifactCategorySeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213249"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<IKnowledgeArtifactCategory> versions;

  KnowledgeArtifactCategorySeries(IKnowledgeArtifactCategory... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<IKnowledgeArtifactCategory> getVersions() {
    return versions;
  }

  public KnowledgeArtifactCategorySeries asEnum() {
    return this;
  }

  public Series<IKnowledgeArtifactCategory> asSeries() {
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
    return IKnowledgeArtifactCategory.seriesNamespace;
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

  public static Optional<IKnowledgeArtifactCategory> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<IKnowledgeArtifactCategory> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<IKnowledgeArtifactCategory> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<IKnowledgeArtifactCategory> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<IKnowledgeArtifactCategory> resolveTag(final String tag) {
    Optional<IKnowledgeArtifactCategory> l = resolveTerm(tag,  KnowledgeArtifactCategorySeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  KnowledgeArtifactCategorySeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<IKnowledgeArtifactCategory> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<IKnowledgeArtifactCategory> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeArtifactCategorySeries.values(), Term::getConceptId);
  }

  public static Optional<IKnowledgeArtifactCategory> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeArtifactCategorySeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new KnowledgeArtifactCategorySeries.Adapter();
    protected KnowledgeArtifactCategorySeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends LegacyURITermsJsonAdapter.Serializer<IKnowledgeArtifactCategory> {

  }

  public static class JsonDeserializer extends LegacyURITermsJsonAdapter.Deserializer<IKnowledgeArtifactCategory> {
    protected IKnowledgeArtifactCategory[] getValues() { return values(); }

    @Override
    protected Optional<IKnowledgeArtifactCategory> resolveUUID(UUID uuid) {
      return KnowledgeArtifactCategorySeries.resolveUUID(uuid);
    }
  }
}


