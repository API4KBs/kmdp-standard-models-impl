package edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype;

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

@javax.xml.bind.annotation.XmlType(name = "DependencyTypeSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( DependencyTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = DependencyTypeSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = DependencyTypeSeries.JsonDeserializer.class )
public enum DependencyTypeSeries implements DependencyType, Series<DependencyType> {

    Complements(  edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype.snapshot.DependencyType.Complements  ,   edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype._20190801.DependencyType.Complements    ) , 
       Imports(  edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype.snapshot.DependencyType.Imports  ,   edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype._20190801.DependencyType.Imports    ) , 
       Depends_On(  edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype.snapshot.DependencyType.Depends_On  ,   edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype._20190801.DependencyType.Depends_On    ) , 
       Supplements(  edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype.snapshot.DependencyType.Supplements  ,   edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype._20190801.DependencyType.Supplements    ) , 
       Includes(  edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype.snapshot.DependencyType.Includes  ,   edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype._20190801.DependencyType.Includes    ) , 
       Effectuates(  edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype.snapshot.DependencyType.Effectuates  ,   edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype._20190801.DependencyType.Effectuates    ) , 
       Complies_With(  edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype.snapshot.DependencyType.Complies_With  ,   edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype._20190801.DependencyType.Complies_With    ) 
   ;

  private static final Map<UUID, DependencyTypeSeries> index = indexByUUID(DependencyTypeSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213262"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<DependencyType> versions;

  DependencyTypeSeries(DependencyType... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<DependencyType> getVersions() {
    return versions;
  }

  public DependencyTypeSeries asEnum() {
    return this;
  }

  public Series<DependencyType> asSeries() {
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
    return DependencyType.seriesNamespace;
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

  public static Optional<DependencyType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<DependencyType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<DependencyType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<DependencyType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<DependencyType> resolveTag(final String tag) {
    Optional<DependencyType> l = resolveTerm(tag,  DependencyTypeSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  DependencyTypeSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<DependencyType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<DependencyType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, DependencyTypeSeries.values(), Term::getConceptId);
  }

  public static Optional<DependencyType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, DependencyTypeSeries.values(), Term::getRef);
  }


  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new DependencyTypeSeries.Adapter();
    protected DependencyTypeSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<DependencyType> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<DependencyType> {
    protected DependencyType[] getValues() { return values(); }

    @Override
    protected Optional<DependencyType> resolveUUID(UUID uuid) {
      return DependencyTypeSeries.resolveUUID(uuid);
    }
  }
}


