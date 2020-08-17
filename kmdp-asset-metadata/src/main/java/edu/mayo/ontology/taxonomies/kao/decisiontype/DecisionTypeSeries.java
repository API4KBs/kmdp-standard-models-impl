package edu.mayo.ontology.taxonomies.kao.decisiontype;

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

@javax.xml.bind.annotation.XmlType(name = "DecisionTypeSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( DecisionTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = DecisionTypeSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = DecisionTypeSeries.JsonDeserializer.class )
public enum DecisionTypeSeries implements DecisionType, Series<DecisionType> {

    Binary_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Binary_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Binary_Decision    ) , 
       Implicit_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Implicit_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Implicit_Decision    ) , 
       Interactive_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Interactive_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Interactive_Decision    ) , 
       Pivotal_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Pivotal_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Pivotal_Decision    ) , 
       Choice_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Choice_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Choice_Decision    ) , 
       Actionable_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Actionable_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Actionable_Decision    ) , 
       Defeater_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Defeater_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Defeater_Decision    ) , 
       Shared_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Shared_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Shared_Decision    ) , 
       Assessment_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Assessment_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Assessment_Decision    ) , 
       Naturalistic_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Naturalistic_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Naturalistic_Decision    ) , 
       Temporal_Correlation_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Temporal_Correlation_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Temporal_Correlation_Decision    ) , 
       Selection_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Selection_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Selection_Decision    ) , 
       Computable_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Computable_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Computable_Decision    ) , 
       Enabler_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Enabler_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Enabler_Decision    ) , 
       Aggregation_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Aggregation_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Aggregation_Decision    ) , 
       Boolean_Decision(  edu.mayo.ontology.taxonomies.kao.decisiontype.snapshot.DecisionType.Boolean_Decision  ,   edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Boolean_Decision    ) 
   ;

  private static final Map<UUID, DecisionTypeSeries> index = indexByUUID(DecisionTypeSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213293"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/DecisionType/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/KAO/DecisionType/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<DecisionType> versions;

  DecisionTypeSeries(DecisionType... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<DecisionType> getVersions() {
    return versions;
  }

  public DecisionTypeSeries asEnum() {
    return this;
  }

  public Series<DecisionType> asSeries() {
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
    return DecisionType.seriesNamespace;
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

  public static Optional<DecisionType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<DecisionType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<DecisionType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<DecisionType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<DecisionType> resolveTag(final String tag) {
    Optional<DecisionType> l = resolveTerm(tag,  DecisionTypeSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  DecisionTypeSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<DecisionType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<DecisionType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, DecisionTypeSeries.values(), Term::getConceptId);
  }

  public static Optional<DecisionType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, DecisionTypeSeries.values(), Term::getRef);
  }


  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new DecisionTypeSeries.Adapter();
    protected DecisionTypeSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<DecisionType> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<DecisionType> {
    protected DecisionType[] getValues() { return values(); }

    @Override
    protected Optional<DecisionType> resolveUUID(UUID uuid) {
      return DecisionTypeSeries.resolveUUID(uuid);
    }
  }
}


