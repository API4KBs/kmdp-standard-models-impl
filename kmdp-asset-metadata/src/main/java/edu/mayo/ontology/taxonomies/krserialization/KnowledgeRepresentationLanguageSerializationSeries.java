package edu.mayo.ontology.taxonomies.krserialization;

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

@javax.xml.bind.annotation.XmlType(name = "KnowledgeRepresentationLanguageSerializationSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeRepresentationLanguageSerializationSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeRepresentationLanguageSerializationSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeRepresentationLanguageSerializationSeries.JsonDeserializer.class )
public enum KnowledgeRepresentationLanguageSerializationSeries implements KnowledgeRepresentationLanguageSerialization, Series<KnowledgeRepresentationLanguageSerialization> {

    Knowledge_Asset_Surrogate_JSON_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.Knowledge_Asset_Surrogate_JSON_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.Knowledge_Asset_Surrogate_JSON_Syntax    ) , 
       DMN_1_1_XML_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.DMN_1_1_XML_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.DMN_1_1_XML_Syntax    ) , 
       FHIR_DSTU2_RDF_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.FHIR_DSTU2_RDF_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.FHIR_DSTU2_RDF_Syntax    ) , 
       Knowledge_Asset_Surrogate_2_0_XML_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.Knowledge_Asset_Surrogate_2_0_XML_Syntax    ) , 
       CQL_ELM_XML_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.CQL_ELM_XML_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.CQL_ELM_XML_Syntax    ) , 
       OWL_XML_Serialization(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.OWL_XML_Serialization  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.OWL_XML_Serialization    ) , 
       OpenAPI_2_JSON_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.OpenAPI_2_JSON_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.OpenAPI_2_JSON_Syntax    ) , 
       GraphQL_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.GraphQL_Syntax    ) , 
       CGIF(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.CGIF  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.CGIF    ) , 
       SPARQL_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.SPARQL_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.SPARQL_Syntax    ) , 
       OWL_Manchester_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.OWL_Manchester_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.OWL_Manchester_Syntax    ) , 
       DMN_1_2_XML_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.DMN_1_2_XML_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.DMN_1_2_XML_Syntax    ) , 
       BPMN_2_0_XML_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.BPMN_2_0_XML_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.BPMN_2_0_XML_Syntax    ) , 
       Turtle(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.Turtle  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.Turtle    ) , 
       Knowledge_Asset_Annotations_XML_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.Knowledge_Asset_Annotations_XML_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.Knowledge_Asset_Annotations_XML_Syntax    ) , 
       CLIF(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.CLIF  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.CLIF    ) , 
       XSD_XML_1_1_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.XSD_XML_1_1_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.XSD_XML_1_1_Syntax    ) , 
       KNART_XML_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.KNART_XML_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.KNART_XML_Syntax    ) , 
       CQL_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.CQL_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.CQL_Syntax    ) , 
       Knowledge_Asset_Surrogate_XML_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.Knowledge_Asset_Surrogate_XML_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.Knowledge_Asset_Surrogate_XML_Syntax    ) , 
       OpenAPI_2_YAML_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.OpenAPI_2_YAML_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.OpenAPI_2_YAML_Syntax    ) , 
       API4KP_Service_JSON_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.API4KP_Service_JSON_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.API4KP_Service_JSON_Syntax    ) , 
       API4KP_Service_XML_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.API4KP_Service_XML_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.API4KP_Service_XML_Syntax    ) , 
       OWL_Functional_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.OWL_Functional_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.OWL_Functional_Syntax    ) , 
       CMMN_1_1_XML_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.CMMN_1_1_XML_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.CMMN_1_1_XML_Syntax    ) , 
       XCL(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.XCL  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.XCL    ) , 
       RDF_XML_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.RDF_XML_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.RDF_XML_Syntax    ) , 
       FHIR_DSTU2_JSON_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.FHIR_DSTU2_JSON_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.FHIR_DSTU2_JSON_Syntax    ) , 
       FHIR_DSTU2_XML_Syntax(  edu.mayo.ontology.taxonomies.krserialization.snapshot.KnowledgeRepresentationLanguageSerialization.FHIR_DSTU2_XML_Syntax  ,   edu.mayo.ontology.taxonomies.krserialization._20190801.KnowledgeRepresentationLanguageSerialization.FHIR_DSTU2_XML_Syntax    ) 
   ;

  private static final Map<UUID, KnowledgeRepresentationLanguageSerializationSeries> index = indexByUUID(KnowledgeRepresentationLanguageSerializationSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213241"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KRSerialization/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KRSerialization/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<KnowledgeRepresentationLanguageSerialization> versions;

  KnowledgeRepresentationLanguageSerializationSeries(KnowledgeRepresentationLanguageSerialization... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<KnowledgeRepresentationLanguageSerialization> getVersions() {
    return versions;
  }

  public KnowledgeRepresentationLanguageSerializationSeries asEnum() {
    return this;
  }

  public Series<KnowledgeRepresentationLanguageSerialization> asSeries() {
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
    return KnowledgeRepresentationLanguageSerialization.seriesNamespace;
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

  public static Optional<KnowledgeRepresentationLanguageSerialization> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageSerialization> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageSerialization> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageSerialization> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageSerialization> resolveTag(final String tag) {
    Optional<KnowledgeRepresentationLanguageSerialization> l = resolveTerm(tag,  KnowledgeRepresentationLanguageSerializationSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  KnowledgeRepresentationLanguageSerializationSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeRepresentationLanguageSerialization> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageSerialization> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeRepresentationLanguageSerializationSeries.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeRepresentationLanguageSerialization> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeRepresentationLanguageSerializationSeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new KnowledgeRepresentationLanguageSerializationSeries.Adapter();
    protected KnowledgeRepresentationLanguageSerializationSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<KnowledgeRepresentationLanguageSerialization> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<KnowledgeRepresentationLanguageSerialization> {
    protected KnowledgeRepresentationLanguageSerialization[] getValues() { return values(); }

    @Override
    protected Optional<KnowledgeRepresentationLanguageSerialization> resolveUUID(UUID uuid) {
      return KnowledgeRepresentationLanguageSerializationSeries.resolveUUID(uuid);
    }
  }
}


