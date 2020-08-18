package edu.mayo.ontology.taxonomies.kmdo.annotationreltype;

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

@javax.xml.bind.annotation.XmlType(name = "AnnotationRelTypeSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( AnnotationRelTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = AnnotationRelTypeSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = AnnotationRelTypeSeries.JsonDeserializer.class )
public enum AnnotationRelTypeSeries implements AnnotationRelType, Series<AnnotationRelType> {

    Defines(  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Defines    ) , 
       Captures(  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Captures    ) , 
       Is_Identified_By(  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Is_Identified_By    ) , 
       Function_Of(  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Function_Of    ) , 
       Archetypes(  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Archetypes    ) , 
       Has_Focus(  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Has_Focus    ) , 
       In_Terms_Of(  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.In_Terms_Of    ) , 
       Conceptual_Representation_Of(  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Conceptual_Representation_Of    ) , 
       Secondary_Subject(  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Secondary_Subject    ) , 
       Knowledge_Representation_Of(  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Representation_Of    ) , 
       Knowledge_Of(  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of    ) , 
       Has_Exemplar(  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Has_Exemplar    ) , 
       Has_Primary_Subject(  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Has_Primary_Subject    ) 
   ;

  private static final Map<UUID, AnnotationRelTypeSeries> index = indexByUUID(AnnotationRelTypeSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213264"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType/SNAPSHOT/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<AnnotationRelType> versions;

  AnnotationRelTypeSeries(AnnotationRelType... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<AnnotationRelType> getVersions() {
    return versions;
  }

  public AnnotationRelTypeSeries asEnum() {
    return this;
  }

  public Series<AnnotationRelType> asSeries() {
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
    return AnnotationRelType.seriesNamespace;
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

  public static Optional<AnnotationRelType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<AnnotationRelType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<AnnotationRelType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<AnnotationRelType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<AnnotationRelType> resolveTag(final String tag) {
    Optional<AnnotationRelType> l = resolveTerm(tag,  AnnotationRelTypeSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  AnnotationRelTypeSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<AnnotationRelType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<AnnotationRelType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, AnnotationRelTypeSeries.values(), Term::getConceptId);
  }

  public static Optional<AnnotationRelType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, AnnotationRelTypeSeries.values(), Term::getRef);
  }


  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new AnnotationRelTypeSeries.Adapter();
    protected AnnotationRelTypeSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<AnnotationRelType> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<AnnotationRelType> {
    protected AnnotationRelType[] getValues() { return values(); }

    @Override
    protected Optional<AnnotationRelType> resolveUUID(UUID uuid) {
      return AnnotationRelTypeSeries.resolveUUID(uuid);
    }
  }
}


