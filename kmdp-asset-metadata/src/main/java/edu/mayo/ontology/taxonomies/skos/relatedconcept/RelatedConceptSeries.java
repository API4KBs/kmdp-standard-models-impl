package edu.mayo.ontology.taxonomies.skos.relatedconcept;

import static edu.mayo.kmdp.id.helper.DatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveTerm;

import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;
import java.net.URI;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;

@javax.xml.bind.annotation.XmlType(name = "RelatedConceptSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( RelatedConceptSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = RelatedConceptSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = RelatedConceptSeries.JsonDeserializer.class )
public enum RelatedConceptSeries implements IRelatedConcept, Series<IRelatedConcept> {

    Has_Broader_Transitive(  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Broader_Transitive    ) , 
       Has_Broader_Match(  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Broader_Match    ) , 
       Has_Narrower_Transitive(  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Narrower_Transitive    ) , 
       Has_Close_Match(  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Close_Match    ) , 
       Has_Exact_Match(  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Exact_Match    ) , 
       Has_Broader(  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Broader    ) , 
       Has_Related_Match(  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Related_Match    ) , 
       Is_In_Mapping_Relation_With(  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Mapping_Relation_With    ) , 
       Is_In_Semantic_Relation_With(  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With    ) , 
       Has_Related(  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Related    ) , 
       Has_Narrower(  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Narrower    ) , 
       Has_Narrower_Match(  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Narrower_Match    ) 
   ;

  private static final Map<UUID, RelatedConceptSeries> index = indexByUUID(RelatedConceptSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213255"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/skos/RelatedConcept")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<IRelatedConcept> versions;

  RelatedConceptSeries(IRelatedConcept... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<IRelatedConcept> getVersions() {
    return versions;
  }

  public RelatedConceptSeries asEnum() {
    return this;
  }

  public Series<IRelatedConcept> asSeries() {
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
    return IRelatedConcept.seriesNamespace;
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

  public static Optional<IRelatedConcept> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<IRelatedConcept> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<IRelatedConcept> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<IRelatedConcept> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<IRelatedConcept> resolveTag(final String tag) {
    Optional<IRelatedConcept> l = resolveTerm(tag,  RelatedConceptSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  RelatedConceptSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<IRelatedConcept> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<IRelatedConcept> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, RelatedConceptSeries.values(), Term::getConceptId);
  }

  public static Optional<IRelatedConcept> resolveRef(final URI refUri) {
    return resolveTerm(refUri, RelatedConceptSeries.values(), Term::getRef);
  }


  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new RelatedConceptSeries.Adapter();
    protected RelatedConceptSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<IRelatedConcept> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<IRelatedConcept> {
    protected IRelatedConcept[] getValues() { return values(); }

    @Override
    protected Optional<IRelatedConcept> resolveUUID(UUID uuid) {
      return RelatedConceptSeries.resolveUUID(uuid);
    }
  }
}


