package edu.mayo.ontology.taxonomies.lexicon;

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

@javax.xml.bind.annotation.XmlType(name = "LexiconSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( LexiconSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = LexiconSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = LexiconSeries.JsonDeserializer.class )
public enum LexiconSeries implements Lexicon, Series<Lexicon> {

    KRR_Language_Role(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.KRR_Language_Role  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.KRR_Language_Role    ) , 
       SNOMED_CT(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.SNOMED_CT  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.SNOMED_CT    ) , 
       Asset_Relationships_Structural(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.Asset_Relationships_Structural  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.Asset_Relationships_Structural    ) , 
       SKOS(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.SKOS  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.SKOS    ) , 
       Asset_Relationships_Citations(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.Asset_Relationships_Citations  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.Asset_Relationships_Citations    ) , 
       Natural_Language(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.Natural_Language  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.Natural_Language    ) , 
       KRR_Language(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.KRR_Language  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.KRR_Language    ) , 
       KRR_Technique(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.KRR_Technique  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.KRR_Technique    ) , 
       Asset_Relationships_Variants(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.Asset_Relationships_Variants  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.Asset_Relationships_Variants    ) , 
       Knowledge_Asset_Type(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.Knowledge_Asset_Type  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.Knowledge_Asset_Type    ) , 
       KRR_Profile(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.KRR_Profile  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.KRR_Profile    ) , 
       RxNORM(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.RxNORM  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.RxNORM    ) , 
       Asset_Relationships_Derivations(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.Asset_Relationships_Derivations  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.Asset_Relationships_Derivations    ) , 
       Asset_Relationships_Dependencies(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.Asset_Relationships_Dependencies  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.Asset_Relationships_Dependencies    ) , 
       Asset_Relationships_Versions(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.Asset_Relationships_Versions  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.Asset_Relationships_Versions    ) , 
       KRR_Lexicon(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.KRR_Lexicon  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.KRR_Lexicon    ) , 
       XML_Schema_Instance(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.XML_Schema_Instance  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.XML_Schema_Instance    ) , 
       KRR_MetaFormat(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.KRR_MetaFormat  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.KRR_MetaFormat    ) , 
       Asset_Relationships_Summary(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.Asset_Relationships_Summary  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.Asset_Relationships_Summary    ) , 
       Knowledge_Asset_Category(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.Knowledge_Asset_Category  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.Knowledge_Asset_Category    ) , 
       Parsing_Level(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.Parsing_Level  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.Parsing_Level    ) , 
       LOINC(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.LOINC  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.LOINC    ) , 
       PCV(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.PCV  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.PCV    ) , 
       KRR_Serialization(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.KRR_Serialization  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.KRR_Serialization    ) , 
       XML_Namespace(  edu.mayo.ontology.taxonomies.lexicon.snapshot.Lexicon.XML_Namespace  ,   edu.mayo.ontology.taxonomies.lexicon._20190801.Lexicon.XML_Namespace    ) 
   ;

  private static final Map<UUID, LexiconSeries> index = indexByUUID(LexiconSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213284"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/Lexicon/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/Lexicon/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<Lexicon> versions;

  LexiconSeries(Lexicon... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<Lexicon> getVersions() {
    return versions;
  }

  public LexiconSeries asEnum() {
    return this;
  }

  public Series<Lexicon> asSeries() {
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
    return Lexicon.seriesNamespace;
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

  public static Optional<Lexicon> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<Lexicon> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<Lexicon> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<Lexicon> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<Lexicon> resolveTag(final String tag) {
    Optional<Lexicon> l = resolveTerm(tag,  LexiconSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  LexiconSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<Lexicon> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<Lexicon> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, LexiconSeries.values(), Term::getConceptId);
  }

  public static Optional<Lexicon> resolveRef(final URI refUri) {
    return resolveTerm(refUri, LexiconSeries.values(), Term::getRef);
  }


  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new LexiconSeries.Adapter();
    protected LexiconSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<Lexicon> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<Lexicon> {
    protected Lexicon[] getValues() { return values(); }

    @Override
    protected Optional<Lexicon> resolveUUID(UUID uuid) {
      return LexiconSeries.resolveUUID(uuid);
    }
  }
}


