package edu.mayo.ontology.taxonomies.kao.knowledgeassettype;

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

@javax.xml.bind.annotation.XmlType(name = "KnowledgeAssetTypeSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeAssetTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeAssetTypeSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeAssetTypeSeries.JsonDeserializer.class )
public enum KnowledgeAssetTypeSeries implements KnowledgeAssetType, Series<KnowledgeAssetType> {

    Cognitive_Care_Process_Model(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Cognitive_Care_Process_Model  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Cognitive_Care_Process_Model    ) , 
       Grammar(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Grammar  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Grammar    ) , 
       Multi_Agent_Decision_Task_Model(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Multi_Agent_Decision_Task_Model  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Multi_Agent_Decision_Task_Model    ) , 
       Decision_Model(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Decision_Model  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Decision_Model    ) , 
       Semantic_Decision_Model(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Semantic_Decision_Model  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Semantic_Decision_Model    ) , 
       Clinical_Quality_Measure(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Clinical_Quality_Measure  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Clinical_Quality_Measure    ) , 
       Inquiry_Specification(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Inquiry_Specification  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Inquiry_Specification    ) , 
       Service_Profile(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Service_Profile  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Service_Profile    ) , 
       Questionnaire(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Questionnaire  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Questionnaire    ) , 
       Clinical_Rule(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Clinical_Rule  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Clinical_Rule    ) , 
       Conceptual_Domain_Model(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Conceptual_Domain_Model  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Conceptual_Domain_Model    ) , 
       Service_Description(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Service_Description  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Service_Description    ) , 
       Formal_Grammar(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Formal_Grammar  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Formal_Grammar    ) , 
       Assessment_Model(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Assessment_Model  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Assessment_Model    ) , 
       Clinical_Trial_Protocol(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Clinical_Trial_Protocol  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Clinical_Trial_Protocol    ) , 
       Protocol(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Protocol  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Protocol    ) , 
       Clinical_Practice_Guideline(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Clinical_Practice_Guideline  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Clinical_Practice_Guideline    ) , 
       Lexicon(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Lexicon  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Vocabulary    ) , 
       Computable_Decision_Model(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Computable_Decision_Model  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Computable_Decision_Model    ) , 
       Factual_Knowledge(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Factual_Knowledge  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Factual_Knowledge    ) , 
       Predictive_Model(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Predictive_Model  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Predictive_Model    ) , 
       Information_Model(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Information_Model  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Information_Model    ) , 
       Prescriptive_Grammar(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Prescriptive_Grammar  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Prescriptive_Grammar    ) , 
       Care_Process_Model(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Care_Process_Model  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Care_Process_Model    ) , 
       Functional_Expression(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Functional_Expression  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Functional_Expression    ) , 
       Contextualizable_Knowledge(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Contextualizable_Knowledge  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Contextualizable_Knowledge    ) , 
       Cohort_Definition(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Cohort_Definition  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Cohort_Definition    ) , 
       Clinical_Protocol(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Clinical_Protocol  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Clinical_Protocol    ) , 
       Value_Set(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Value_Set  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Value_Set    ) , 
       Nursing_Protocol(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Nursing_Protocol  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Nursing_Protocol    ) , 
       Documentation_Template(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Documentation_Template  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Documentation_Template    ) , 
       Formal_Ontology(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Formal_Ontology  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Formal_Ontology    ) , 
       Descriptive_Grammar(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Descriptive_Grammar  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Descriptive_Grammar    ) , 
       Equation(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Equation  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Equation    ) , 
       Order_Set(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Order_Set  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Order_Set    ) , 
       Decision_Task_Model(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Decision_Task_Model  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Decision_Task_Model    ) , 
       Semantic_Information_Model(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Semantic_Information_Model  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Semantic_Information_Model    ) , 
       Cognitive_Process_Model(  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Cognitive_Process_Model  ,   edu.mayo.ontology.taxonomies.kao.knowledgeassettype._20190801.KnowledgeAssetType.Cognitive_Process_Model    ) 
   ;

  private static final Map<UUID, KnowledgeAssetTypeSeries> index = indexByUUID(KnowledgeAssetTypeSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213264"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<KnowledgeAssetType> versions;

  KnowledgeAssetTypeSeries(KnowledgeAssetType... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<KnowledgeAssetType> getVersions() {
    return versions;
  }

  public KnowledgeAssetTypeSeries asEnum() {
    return this;
  }

  public Series<KnowledgeAssetType> asSeries() {
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
    return KnowledgeAssetType.seriesNamespace;
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

  public static Optional<KnowledgeAssetType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeAssetType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeAssetType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeAssetType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeAssetType> resolveTag(final String tag) {
    Optional<KnowledgeAssetType> l = resolveTerm(tag,  KnowledgeAssetTypeSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  KnowledgeAssetTypeSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeAssetType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeAssetType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeAssetTypeSeries.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeAssetType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeAssetTypeSeries.values(), Term::getRef);
  }


  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new KnowledgeAssetTypeSeries.Adapter();
    protected KnowledgeAssetTypeSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<KnowledgeAssetType> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<KnowledgeAssetType> {
    protected KnowledgeAssetType[] getValues() { return values(); }

    @Override
    protected Optional<KnowledgeAssetType> resolveUUID(UUID uuid) {
      return KnowledgeAssetTypeSeries.resolveUUID(uuid);
    }
  }
}


