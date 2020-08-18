package edu.mayo.ontology.taxonomies.kao.rel.structuralreltype;

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

@javax.xml.bind.annotation.XmlType(name = "StructuralPartTypeSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( StructuralPartTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = StructuralPartTypeSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = StructuralPartTypeSeries.JsonDeserializer.class )
public enum StructuralPartTypeSeries implements StructuralPartType, Series<StructuralPartType> {

    Has_Part(  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype.snapshot.StructuralPartType.Has_Part  ,   edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Part    ) , 
       Has_Proper_Part(  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype.snapshot.StructuralPartType.Has_Proper_Part  ,   edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Proper_Part    ) , 
       Defines(  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype.snapshot.StructuralPartType.Defines  ,   edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Defines    ) , 
       Embeds_Language(  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype.snapshot.StructuralPartType.Embeds_Language  ,   edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Embeds_Language    ) , 
       The_Relationship_Between_A_Composite_And_Its_Parts(  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype.snapshot.StructuralPartType.Has_Structural_Component  ,   edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.The_Relationship_Between_A_Composite_And_Its_Parts    ) , 
       Captures(  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype.snapshot.StructuralPartType.Captures  ,   edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Captures    ) , 
       Defines_In_Terms_Of(  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype.snapshot.StructuralPartType.Defines_In_Terms_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Defines_In_Terms_Of    ) , 
       Uses_Concept(  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype.snapshot.StructuralPartType.Uses_Concept  ,   edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Uses_Concept    ) , 
       Leverages(  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype.snapshot.StructuralPartType.Leverages  ,   edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Leverages    ) , 
       Structurally_Organized_By(  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype.snapshot.StructuralPartType.Structurally_Organized_By  ,   edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Structurally_Organized_By    ) 
   ;

  private static final Map<UUID, StructuralPartTypeSeries> index = indexByUUID(StructuralPartTypeSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213292"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<StructuralPartType> versions;

  StructuralPartTypeSeries(StructuralPartType... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<StructuralPartType> getVersions() {
    return versions;
  }

  public StructuralPartTypeSeries asEnum() {
    return this;
  }

  public Series<StructuralPartType> asSeries() {
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
    return StructuralPartType.seriesNamespace;
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

  public static Optional<StructuralPartType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<StructuralPartType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<StructuralPartType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<StructuralPartType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<StructuralPartType> resolveTag(final String tag) {
    Optional<StructuralPartType> l = resolveTerm(tag,  StructuralPartTypeSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  StructuralPartTypeSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<StructuralPartType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<StructuralPartType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, StructuralPartTypeSeries.values(), Term::getConceptId);
  }

  public static Optional<StructuralPartType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, StructuralPartTypeSeries.values(), Term::getRef);
  }


  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new StructuralPartTypeSeries.Adapter();
    protected StructuralPartTypeSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<StructuralPartType> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<StructuralPartType> {
    protected StructuralPartType[] getValues() { return values(); }

    @Override
    protected Optional<StructuralPartType> resolveUUID(UUID uuid) {
      return StructuralPartTypeSeries.resolveUUID(uuid);
    }
  }
}


