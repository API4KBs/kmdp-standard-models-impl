package edu.mayo.ontology.taxonomies.krprofile;

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

@javax.xml.bind.annotation.XmlType(name = "KnowledgeRepresentationLanguageProfileSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeRepresentationLanguageProfileSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeRepresentationLanguageProfileSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeRepresentationLanguageProfileSeries.JsonDeserializer.class )
public enum KnowledgeRepresentationLanguageProfileSeries implements KnowledgeRepresentationLanguageProfile, Series<KnowledgeRepresentationLanguageProfile> {

    OWL2_Full(  edu.mayo.ontology.taxonomies.krprofile.snapshot.KnowledgeRepresentationLanguageProfile.OWL2_Full  ,   edu.mayo.ontology.taxonomies.krprofile._20190801.KnowledgeRepresentationLanguageProfile.OWL2_Full    ) , 
       GraphQL_Schemas(  edu.mayo.ontology.taxonomies.krprofile.snapshot.KnowledgeRepresentationLanguageProfile.GraphQL_Schemas    ) , 
       API4KP_Service_Descriptors(  edu.mayo.ontology.taxonomies.krprofile.snapshot.KnowledgeRepresentationLanguageProfile.API4KP_Service_Descriptors  ,   edu.mayo.ontology.taxonomies.krprofile._20190801.KnowledgeRepresentationLanguageProfile.API4KP_Service_Descriptors    ) , 
       Knowledge_Asset_Surrogate_Annotations(  edu.mayo.ontology.taxonomies.krprofile.snapshot.KnowledgeRepresentationLanguageProfile.Knowledge_Asset_Surrogate_Annotations  ,   edu.mayo.ontology.taxonomies.krprofile._20190801.KnowledgeRepresentationLanguageProfile.Knowledge_Asset_Surrogate_Annotations    ) , 
       CQL_Essentials(  edu.mayo.ontology.taxonomies.krprofile.snapshot.KnowledgeRepresentationLanguageProfile.CQL_Essentials  ,   edu.mayo.ontology.taxonomies.krprofile._20190801.KnowledgeRepresentationLanguageProfile.CQL_Essentials    ) , 
       OWL2_QL(  edu.mayo.ontology.taxonomies.krprofile.snapshot.KnowledgeRepresentationLanguageProfile.OWL2_QL  ,   edu.mayo.ontology.taxonomies.krprofile._20190801.KnowledgeRepresentationLanguageProfile.OWL2_QL    ) , 
       API4KP_Identifiers(  edu.mayo.ontology.taxonomies.krprofile.snapshot.KnowledgeRepresentationLanguageProfile.API4KP_Identifiers  ,   edu.mayo.ontology.taxonomies.krprofile._20190801.KnowledgeRepresentationLanguageProfile.API4KP_Identifiers    ) , 
       API4KP_Datatypes(  edu.mayo.ontology.taxonomies.krprofile.snapshot.KnowledgeRepresentationLanguageProfile.API4KP_Datatypes  ,   edu.mayo.ontology.taxonomies.krprofile._20190801.KnowledgeRepresentationLanguageProfile.API4KP_Datatypes    ) , 
       OWL2_EL(  edu.mayo.ontology.taxonomies.krprofile.snapshot.KnowledgeRepresentationLanguageProfile.OWL2_EL  ,   edu.mayo.ontology.taxonomies.krprofile._20190801.KnowledgeRepresentationLanguageProfile.OWL2_EL    ) , 
       OWL2_DL(  edu.mayo.ontology.taxonomies.krprofile.snapshot.KnowledgeRepresentationLanguageProfile.OWL2_DL  ,   edu.mayo.ontology.taxonomies.krprofile._20190801.KnowledgeRepresentationLanguageProfile.OWL2_DL    ) , 
       OWL2_RL(  edu.mayo.ontology.taxonomies.krprofile.snapshot.KnowledgeRepresentationLanguageProfile.OWL2_RL  ,   edu.mayo.ontology.taxonomies.krprofile._20190801.KnowledgeRepresentationLanguageProfile.OWL2_RL    ) , 
       UML_Resource(  edu.mayo.ontology.taxonomies.krprofile.snapshot.KnowledgeRepresentationLanguageProfile.UML_Resource  ,   edu.mayo.ontology.taxonomies.krprofile._20190801.KnowledgeRepresentationLanguageProfile.UML_Resource    ) , 
       GraphQL_Queries(  edu.mayo.ontology.taxonomies.krprofile.snapshot.KnowledgeRepresentationLanguageProfile.GraphQL_Queries    ) 
   ;

  private static final Map<UUID, KnowledgeRepresentationLanguageProfileSeries> index = indexByUUID(KnowledgeRepresentationLanguageProfileSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213227"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KRProfile/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KRProfile/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<KnowledgeRepresentationLanguageProfile> versions;

  KnowledgeRepresentationLanguageProfileSeries(KnowledgeRepresentationLanguageProfile... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<KnowledgeRepresentationLanguageProfile> getVersions() {
    return versions;
  }

  public KnowledgeRepresentationLanguageProfileSeries asEnum() {
    return this;
  }

  public Series<KnowledgeRepresentationLanguageProfile> asSeries() {
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
    return KnowledgeRepresentationLanguageProfile.seriesNamespace;
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

  public static Optional<KnowledgeRepresentationLanguageProfile> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageProfile> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageProfile> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageProfile> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageProfile> resolveTag(final String tag) {
    Optional<KnowledgeRepresentationLanguageProfile> l = resolveTerm(tag,  KnowledgeRepresentationLanguageProfileSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  KnowledgeRepresentationLanguageProfileSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeRepresentationLanguageProfile> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeRepresentationLanguageProfile> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeRepresentationLanguageProfileSeries.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeRepresentationLanguageProfile> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeRepresentationLanguageProfileSeries.values(), Term::getRef);
  }


  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new KnowledgeRepresentationLanguageProfileSeries.Adapter();
    protected KnowledgeRepresentationLanguageProfileSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<KnowledgeRepresentationLanguageProfile> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<KnowledgeRepresentationLanguageProfile> {
    protected KnowledgeRepresentationLanguageProfile[] getValues() { return values(); }

    @Override
    protected Optional<KnowledgeRepresentationLanguageProfile> resolveUUID(UUID uuid) {
      return KnowledgeRepresentationLanguageProfileSeries.resolveUUID(uuid);
    }
  }
}


