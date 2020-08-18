package edu.mayo.ontology.taxonomies.ccgentries;

import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.resolveTerm;

import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;
import edu.mayo.kmdp.terms.adapters.json.LegacyURITermsJsonAdapter;
import edu.mayo.kmdp.terms.adapters.xml.LegacyTermsXMLAdapter;
import java.net.URI;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;

@javax.xml.bind.annotation.XmlType(name = "ConceptDefinitionTypeSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( ConceptDefinitionTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = ConceptDefinitionTypeSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = ConceptDefinitionTypeSeries.JsonDeserializer.class )
public enum ConceptDefinitionTypeSeries implements ConceptDefinitionType, Series<ConceptDefinitionType> {

    Human_Resolution_Concept_Definition(  edu.mayo.ontology.taxonomies.ccgentries.snapshot.ConceptDefinitionType.Human_Resolution_Concept_Definition  ,   edu.mayo.ontology.taxonomies.ccgentries._20190801.ConceptDefinitionType.Human_Resolution_Concept_Definition    ) , 
       Statistical_Concept_Definition(  edu.mayo.ontology.taxonomies.ccgentries.snapshot.ConceptDefinitionType.Statistical_Concept_Definition  ,   edu.mayo.ontology.taxonomies.ccgentries._20190801.ConceptDefinitionType.Statistical_Concept_Definition    ) , 
       NLP_Based_Concept_Definition(  edu.mayo.ontology.taxonomies.ccgentries.snapshot.ConceptDefinitionType.NLP_Based_Concept_Definition  ,   edu.mayo.ontology.taxonomies.ccgentries._20190801.ConceptDefinitionType.NLP_Based_Concept_Definition    ) , 
       Logic_Based_Concept_Definition(  edu.mayo.ontology.taxonomies.ccgentries.snapshot.ConceptDefinitionType.Logic_Based_Concept_Definition  ,   edu.mayo.ontology.taxonomies.ccgentries._20190801.ConceptDefinitionType.Logic_Based_Concept_Definition    ) , 
       Computable_Knowledge_Based_Concept_Definition(  edu.mayo.ontology.taxonomies.ccgentries.snapshot.ConceptDefinitionType.Computable_Knowledge_Based_Concept_Definition  ,   edu.mayo.ontology.taxonomies.ccgentries._20190801.ConceptDefinitionType.Computable_Knowledge_Based_Concept_Definition    ) , 
       Interactive_Concept_Definition(  edu.mayo.ontology.taxonomies.ccgentries.snapshot.ConceptDefinitionType.Interactive_Concept_Definition  ,   edu.mayo.ontology.taxonomies.ccgentries._20190801.ConceptDefinitionType.Interactive_Concept_Definition    ) , 
       Cognitively_Assisted_Concept_Definition(  edu.mayo.ontology.taxonomies.ccgentries.snapshot.ConceptDefinitionType.Cognitively_Assisted_Concept_Definition  ,   edu.mayo.ontology.taxonomies.ccgentries._20190801.ConceptDefinitionType.Cognitively_Assisted_Concept_Definition    ) , 
       Service_Based_Concept_Definition(  edu.mayo.ontology.taxonomies.ccgentries.snapshot.ConceptDefinitionType.Service_Based_Concept_Definition  ,   edu.mayo.ontology.taxonomies.ccgentries._20190801.ConceptDefinitionType.Service_Based_Concept_Definition    ) 
   ;

  private static final Map<UUID, ConceptDefinitionTypeSeries> index = indexByUUID(ConceptDefinitionTypeSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213277"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/ccgEntries/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/ccgEntries/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<ConceptDefinitionType> versions;

  ConceptDefinitionTypeSeries(ConceptDefinitionType... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<ConceptDefinitionType> getVersions() {
    return versions;
  }

  public ConceptDefinitionTypeSeries asEnum() {
    return this;
  }

  public Series<ConceptDefinitionType> asSeries() {
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
    return ConceptDefinitionType.seriesNamespace;
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

  public static Optional<ConceptDefinitionType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<ConceptDefinitionType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<ConceptDefinitionType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<ConceptDefinitionType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<ConceptDefinitionType> resolveTag(final String tag) {
    Optional<ConceptDefinitionType> l = resolveTerm(tag,  ConceptDefinitionTypeSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  ConceptDefinitionTypeSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<ConceptDefinitionType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<ConceptDefinitionType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, ConceptDefinitionTypeSeries.values(), Term::getConceptId);
  }

  public static Optional<ConceptDefinitionType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, ConceptDefinitionTypeSeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new ConceptDefinitionTypeSeries.Adapter();
    protected ConceptDefinitionTypeSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends LegacyURITermsJsonAdapter.Serializer<ConceptDefinitionType> {

  }

  public static class JsonDeserializer extends LegacyURITermsJsonAdapter.Deserializer<ConceptDefinitionType> {
    protected ConceptDefinitionType[] getValues() { return values(); }

    @Override
    protected Optional<ConceptDefinitionType> resolveUUID(UUID uuid) {
      return ConceptDefinitionTypeSeries.resolveUUID(uuid);
    }
  }
}


