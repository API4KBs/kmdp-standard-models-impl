package edu.mayo.ontology.taxonomies.kao.rel.derivationreltype;

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

@javax.xml.bind.annotation.XmlType(name = "DerivationTypeSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( DerivationTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = DerivationTypeSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = DerivationTypeSeries.JsonDeserializer.class )
public enum DerivationTypeSeries implements DerivationType, Series<DerivationType> {

    Inspired_By(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Inspired_By  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Inspired_By    ) , 
       Adaptation_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Adaptation_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Adaptation_Of    ) , 
       Abdridgement_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Abdridgement_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Abdridgement_Of    ) , 
       Transwordation_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Transwordation_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Transwordation_Of    ) , 
       Is_Later_Revision_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Is_Later_Revision_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Is_Later_Revision_Of    ) , 
       Linguistic_Adaptation_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Linguistic_Adaptation_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Linguistic_Adaptation_Of    ) , 
       Paraphrase_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Paraphrase_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Paraphrase_Of    ) , 
       Imitation_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Imitation_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Imitation_Of    ) , 
       Derived_From(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Derived_From  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From    ) , 
       Transcreation_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Transcreation_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Transcreation_Of    ) , 
       Summarization_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Summarization_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Summarization_Of    ) , 
       Is_Later_Versioned_Revision_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Is_Later_Versioned_Revision_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Is_Later_Versioned_Revision_Of    ) , 
       Translation_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Translation_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Translation_Of    ) , 
       Compression_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Compression_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Compression_Of    ) , 
       Digest_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Digest_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Digest_Of    ) , 
       Synopsis_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Synopsis_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Synopsis_Of    ) , 
       Transcription_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Transcription_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Transcription_Of    ) , 
       Transliteration_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Transliteration_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Transliteration_Of    ) , 
       Transcodification_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Transcodification_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Transcodification_Of    ) , 
       Is_Immediate_Next_Versioned_Revision_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Is_Immediate_Next_Versioned_Revision_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Is_Immediate_Next_Versioned_Revision_Of    ) , 
       Has_Original(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Has_Original  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Has_Original    ) , 
       Rearrangement_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Rearrangement_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Rearrangement_Of    ) , 
       Flattening_Of(  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.snapshot.DerivationType.Flattening_Of  ,   edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Flattening_Of    ) 
   ;

  private static final Map<UUID, DerivationTypeSeries> index = indexByUUID(DerivationTypeSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213276"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<DerivationType> versions;

  DerivationTypeSeries(DerivationType... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<DerivationType> getVersions() {
    return versions;
  }

  public DerivationTypeSeries asEnum() {
    return this;
  }

  public Series<DerivationType> asSeries() {
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
    return DerivationType.seriesNamespace;
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

  public static Optional<DerivationType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<DerivationType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<DerivationType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<DerivationType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<DerivationType> resolveTag(final String tag) {
    Optional<DerivationType> l = resolveTerm(tag,  DerivationTypeSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  DerivationTypeSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<DerivationType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<DerivationType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, DerivationTypeSeries.values(), Term::getConceptId);
  }

  public static Optional<DerivationType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, DerivationTypeSeries.values(), Term::getRef);
  }


  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new DerivationTypeSeries.Adapter();
    protected DerivationTypeSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<DerivationType> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<DerivationType> {
    protected DerivationType[] getValues() { return values(); }

    @Override
    protected Optional<DerivationType> resolveUUID(UUID uuid) {
      return DerivationTypeSeries.resolveUUID(uuid);
    }
  }
}


