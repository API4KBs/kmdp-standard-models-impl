package edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique;

import static edu.mayo.kmdp.id.helper.DatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveTerm;


import edu.mayo.kmdp.id.Identifier;
import edu.mayo.kmdp.id.ScopedIdentifier;
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

@javax.xml.bind.annotation.XmlType(name = "KnowledgeProcessingTechniqueSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeProcessingTechniqueSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeProcessingTechniqueSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeProcessingTechniqueSeries.JsonDeserializer.class )
public enum KnowledgeProcessingTechniqueSeries implements KnowledgeProcessingTechnique, Series<KnowledgeProcessingTechnique> {

    Naturalistic_Technique(  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Naturalistic_Technique  ,   edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique._20190801.KnowledgeProcessingTechnique.Naturalistic_Technique    ) , 
       Qualitative_Computational_Technique(  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Qualitative_Computational_Technique  ,   edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique._20190801.KnowledgeProcessingTechnique.Qualitative_Computational_Technique    ) , 
       Computational_Technique(  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Computational_Technique  ,   edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique._20190801.KnowledgeProcessingTechnique.Computational_Technique    ) , 
       Logic_Based_Technique(  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Logic_Based_Technique  ,   edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique._20190801.KnowledgeProcessingTechnique.Logic_Based_Technique    ) , 
       Natural_Language_Processing_Technique(  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Natural_Language_Processing_Technique  ,   edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique._20190801.KnowledgeProcessingTechnique.Natural_Language_Processing_Technique    ) , 
       Service_Based_Technique(  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Service_Based_Technique  ,   edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique._20190801.KnowledgeProcessingTechnique.Service_Based_Technique    ) , 
       Query_Based_Technique(  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Query_Based_Technique  ,   edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique._20190801.KnowledgeProcessingTechnique.Query_Based_Technique    ) , 
       Quantitative_Computational_Technique(  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Quantitative_Computational_Technique  ,   edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique._20190801.KnowledgeProcessingTechnique.Quantitative_Computational_Technique    ) , 
       HCI_Interactive_Technique(  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.HCI_Interactive_Technique  ,   edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique._20190801.KnowledgeProcessingTechnique.HCI_Interactive_Technique    ) 
   ;

  private static final Map<UUID, KnowledgeProcessingTechniqueSeries> index = indexByUUID(KnowledgeProcessingTechniqueSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213281"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<KnowledgeProcessingTechnique> versions;

  KnowledgeProcessingTechniqueSeries(KnowledgeProcessingTechnique... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<KnowledgeProcessingTechnique> getVersions() {
    return versions;
  }

  public KnowledgeProcessingTechniqueSeries asEnum() {
    return this;
  }

  public Series<KnowledgeProcessingTechnique> asSeries() {
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
    return KnowledgeProcessingTechnique.seriesNamespace;
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

  public static Optional<KnowledgeProcessingTechnique> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeProcessingTechnique> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeProcessingTechnique> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeProcessingTechnique> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeProcessingTechnique> resolveTag(final String tag) {
    Optional<KnowledgeProcessingTechnique> l = resolveTerm(tag,  KnowledgeProcessingTechniqueSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  KnowledgeProcessingTechniqueSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeProcessingTechnique> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeProcessingTechnique> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeProcessingTechniqueSeries.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeProcessingTechnique> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeProcessingTechniqueSeries.values(), Term::getRef);
  }


  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new KnowledgeProcessingTechniqueSeries.Adapter();
    protected KnowledgeProcessingTechniqueSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<KnowledgeProcessingTechnique> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<KnowledgeProcessingTechnique> {
    protected KnowledgeProcessingTechnique[] getValues() { return values(); }

    @Override
    protected Optional<KnowledgeProcessingTechnique> resolveUUID(UUID uuid) {
      return KnowledgeProcessingTechniqueSeries.resolveUUID(uuid);
    }
  }
}


