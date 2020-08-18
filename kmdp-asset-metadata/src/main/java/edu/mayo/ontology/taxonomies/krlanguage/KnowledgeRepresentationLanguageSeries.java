package edu.mayo.ontology.taxonomies.krlanguage;

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

@javax.xml.bind.annotation.XmlType(name = "KnowledgeRepresentationLanguageSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeRepresentationLanguageSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeRepresentationLanguageSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeRepresentationLanguageSeries.JsonDeserializer.class )
public enum KnowledgeRepresentationLanguageSeries implements KnowledgeRepresentationLanguage, Series<KnowledgeRepresentationLanguage> {

    FHIR_DSTU2(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.FHIR_DSTU2  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.FHIR_DSTU2    ) , 
       Reaction_RuleML_1_2(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.Reaction_RuleML_1_2  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.Reaction_RuleML_1_2    ) , 
       GraphQL_Queries(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.GraphQL_Queries    ) , 
       Knowledge_Asset_Surrogate_2_0(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.Knowledge_Asset_Surrogate_2_0    ) , 
       HL7_CQL(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.HL7_CQL  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.HL7_CQL    ) , 
       FHIR_STU3(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.FHIR_STU3  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.FHIR_STU3    ) , 
       Knowledge_Asset_Surrogate(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.Knowledge_Asset_Surrogate  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.Knowledge_Asset_Surrogate    ) , 
       API4KP_Identifiers(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.API4KP_Identifiers    ) , 
       CMMN_1_1(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.CMMN_1_1  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.CMMN_1_1    ) , 
       XSLT_3_0(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.XSLT_3_0  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.XSLT_3_0    ) , 
       Java_8(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.Java_8  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.Java_8    ) , 
       UML_Resource(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.UML_Resource    ) , 
       Clinical_Concept_Glossary(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.Clinical_Concept_Glossary  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.Clinical_Concept_Glossary    ) , 
       OWL2_EL(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.OWL2_EL    ) , 
       GraphQL_2018(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.GraphQL_2018    ) , 
       GraphQL_Schemas(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.GraphQL_Schemas    ) , 
       Cognitive_Care_Process_Model(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.Cognitive_Care_Process_Model  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.Cognitive_Care_Process_Model    ) , 
       CQL_Essentials(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.CQL_Essentials    ) , 
       HTML(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.HTML  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.HTML    ) , 
       OpenAPI_2_X(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.OpenAPI_2_X  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.OpenAPI_2_X    ) , 
       XSD_1_1(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.XSD_1_1  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.XSD_1_1    ) , 
       KNART_1_3(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.KNART_1_3  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.KNART_1_3    ) , 
       API4KP_Datatypes(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.API4KP_Datatypes    ) , 
       UML_2_5(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.UML_2_5  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.UML_2_5    ) , 
       DITA(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.DITA  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.DITA    ) , 
       BPMN_2_0(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.BPMN_2_0  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.BPMN_2_0    ) , 
       Mustache(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.Mustache  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.Mustache    ) , 
       XHTML(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.XHTML  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.XHTML    ) , 
       OWL2_DL(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.OWL2_DL    ) , 
       FEEL_1_2(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.FEEL_1_2  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.FEEL_1_2    ) , 
       Common_Logic(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.Common_Logic  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.Common_Logic    ) , 
       OWL2_QL(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.OWL2_QL    ) , 
       FEEL_1_1(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.FEEL_1_1  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.FEEL_1_1    ) , 
       SPARQL_1_1(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.SPARQL_1_1  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.SPARQL_1_1    ) , 
       Service_Profile(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.Service_Profile  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.Service_Profile    ) , 
       OWL2_RL(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.OWL2_RL    ) , 
       API4KP(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.API4KP  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.API4KP    ) , 
       OWL2_Full(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.OWL2_Full    ) , 
       API4KP_Service_Descriptors(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.API4KP_Service_Descriptors    ) , 
       Knowledge_Asset_Surrogate_Annotations(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.Knowledge_Asset_Surrogate_Annotations    ) , 
       DMN_1_1(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.DMN_1_1  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.DMN_1_1    ) , 
       HL7_ELM(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.HL7_ELM  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.HL7_ELM    ) , 
       DMN_1_2(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.DMN_1_2  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.DMN_1_2    ) , 
       OWL_2(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.OWL_2  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.OWL_2    ) , 
       FHIRPath_STU1(  edu.mayo.ontology.taxonomies.krlanguage.snapshot.KnowledgeRepresentationLanguage.FHIRPath_STU1  ,   edu.mayo.ontology.taxonomies.krlanguage._20190801.KnowledgeRepresentationLanguage.FHIRPath_STU1    ) 
   ;

  private static final Map<UUID, KnowledgeRepresentationLanguageSeries> index = indexByUUID(KnowledgeRepresentationLanguageSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213212"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KRLanguage/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KRLanguage/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<KnowledgeRepresentationLanguage> versions;

  KnowledgeRepresentationLanguageSeries(KnowledgeRepresentationLanguage... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<KnowledgeRepresentationLanguage> getVersions() {
    return versions;
  }

  public KnowledgeRepresentationLanguageSeries asEnum() {
    return this;
  }

  public Series<KnowledgeRepresentationLanguage> asSeries() {
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
    return KnowledgeRepresentationLanguage.seriesNamespace;
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

  public static Optional<KnowledgeRepresentationLanguage> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguage> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguage> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguage> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguage> resolveTag(final String tag) {
    Optional<KnowledgeRepresentationLanguage> l = resolveTerm(tag,  KnowledgeRepresentationLanguageSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  KnowledgeRepresentationLanguageSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeRepresentationLanguage> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguage> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeRepresentationLanguageSeries.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeRepresentationLanguage> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeRepresentationLanguageSeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new KnowledgeRepresentationLanguageSeries.Adapter();
    protected KnowledgeRepresentationLanguageSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<KnowledgeRepresentationLanguage> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<KnowledgeRepresentationLanguage> {
    protected KnowledgeRepresentationLanguage[] getValues() { return values(); }

    @Override
    protected Optional<KnowledgeRepresentationLanguage> resolveUUID(UUID uuid) {
      return KnowledgeRepresentationLanguageSeries.resolveUUID(uuid);
    }
  }
}


