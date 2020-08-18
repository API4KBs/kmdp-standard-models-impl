package edu.mayo.ontology.taxonomies.kao.rel.variantreltype;

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

@javax.xml.bind.annotation.XmlType(name = "VariantTypeSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( VariantTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = VariantTypeSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = VariantTypeSeries.JsonDeserializer.class )
public enum VariantTypeSeries implements VariantType, Series<VariantType> {

    Rearrangement_Of(  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Rearrangement_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.variantreltype._20190801.VariantType.Rearrangement_Of    ) , 
       Transcreation_Of(  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Transcreation_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.variantreltype._20190801.VariantType.Transcreation_Of    ) , 
       Transwordation_Of(  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Transwordation_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.variantreltype._20190801.VariantType.Transwordation_Of    ) , 
       Transcription_Of(  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Transcription_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.variantreltype._20190801.VariantType.Transcription_Of    ) , 
       Transcodification_Of(  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Transcodification_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.variantreltype._20190801.VariantType.Transcodification_Of    ) , 
       Adaptation_Of(  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Adaptation_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.variantreltype._20190801.VariantType.Adaptation_Of    ) , 
       Transliteration_Of(  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Transliteration_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.variantreltype._20190801.VariantType.Transliteration_Of    ) , 
       Translation_Of(  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Translation_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.variantreltype._20190801.VariantType.Translation_Of    ) , 
       Linguistic_Adaptation_Of(  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Linguistic_Adaptation_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.variantreltype._20190801.VariantType.Linguistic_Adaptation_Of    ) , 
       Alternative_Representation_Of(  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.variantreltype._20190801.VariantType.Alternative_Representation_Of    ) , 
       Compression_Of(  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Compression_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.variantreltype._20190801.VariantType.Compression_Of    ) 
   ;

  private static final Map<UUID, VariantTypeSeries> index = indexByUUID(VariantTypeSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213234"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<VariantType> versions;

  VariantTypeSeries(VariantType... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<VariantType> getVersions() {
    return versions;
  }

  public VariantTypeSeries asEnum() {
    return this;
  }

  public Series<VariantType> asSeries() {
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
    return VariantType.seriesNamespace;
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

  public static Optional<VariantType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<VariantType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<VariantType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<VariantType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<VariantType> resolveTag(final String tag) {
    Optional<VariantType> l = resolveTerm(tag,  VariantTypeSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  VariantTypeSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<VariantType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<VariantType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, VariantTypeSeries.values(), Term::getConceptId);
  }

  public static Optional<VariantType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, VariantTypeSeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new VariantTypeSeries.Adapter();
    protected VariantTypeSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<VariantType> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<VariantType> {
    protected VariantType[] getValues() { return values(); }

    @Override
    protected Optional<VariantType> resolveUUID(UUID uuid) {
      return VariantTypeSeries.resolveUUID(uuid);
    }
  }
}


