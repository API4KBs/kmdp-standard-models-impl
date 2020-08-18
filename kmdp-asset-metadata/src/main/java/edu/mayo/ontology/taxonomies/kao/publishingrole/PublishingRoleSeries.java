package edu.mayo.ontology.taxonomies.kao.publishingrole;

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

@javax.xml.bind.annotation.XmlType(name = "PublishingRoleSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( PublishingRoleSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = PublishingRoleSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = PublishingRoleSeries.JsonDeserializer.class )
public enum PublishingRoleSeries implements PublishingRole, Series<PublishingRole> {

    Editor(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Editor    ) , 
       Translator(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Translator    ) , 
       Proof_Reader(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Proof_Reader    ) , 
       Critic(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Critic    ) , 
       Blogger(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Blogger    ) , 
       Printer(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Printer    ) , 
       Journalist(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Journalist    ) , 
       Series_Editor(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Series_Editor    ) , 
       Senior_Editor(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Senior_Editor    ) , 
       Contributor(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Contributor    ) , 
       Copyright_Owner(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Copyright_Owner    ) , 
       Archivist(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Archivist    ) , 
       Illustrator(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Illustrator    ) , 
       Author_S_Agent(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Author_S_Agent    ) , 
       Managing_Editor(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Managing_Editor    ) , 
       Biographer(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Biographer    ) , 
       Author(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Author    ) , 
       Compiler(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Compiler    ) , 
       Producer(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Producer    ) , 
       Editor_In_Chief(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Editor_In_Chief    ) , 
       Reviewer(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Reviewer    ) , 
       Librarian(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Librarian    ) , 
       Production_Editor(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Production_Editor    ) , 
       Commissioning_Editor(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Commissioning_Editor    ) , 
       Guest_Editor(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Guest_Editor    ) , 
       Executive_Editor(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Executive_Editor    ) , 
       Reader(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Reader    ) , 
       Publisher(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Publisher    ) , 
       Ghost_Writer(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Ghost_Writer    ) , 
       Peer_Reviewer(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Peer_Reviewer    ) , 
       Copy_Editor(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Copy_Editor    ) , 
       Distributor(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Distributor    ) , 
       Deputy_Editor(  edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04.PublishingRole.Deputy_Editor    ) 
   ;

  private static final Map<UUID, PublishingRoleSeries> index = indexByUUID(PublishingRoleSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213233"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/KAO/PublishingRole/2017-09-04")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<PublishingRole> versions;

  PublishingRoleSeries(PublishingRole... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<PublishingRole> getVersions() {
    return versions;
  }

  public PublishingRoleSeries asEnum() {
    return this;
  }

  public Series<PublishingRole> asSeries() {
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
    return PublishingRole.seriesNamespace;
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

  public static Optional<PublishingRole> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<PublishingRole> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<PublishingRole> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<PublishingRole> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<PublishingRole> resolveTag(final String tag) {
    Optional<PublishingRole> l = resolveTerm(tag,  PublishingRoleSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  PublishingRoleSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<PublishingRole> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<PublishingRole> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, PublishingRoleSeries.values(), Term::getConceptId);
  }

  public static Optional<PublishingRole> resolveRef(final URI refUri) {
    return resolveTerm(refUri, PublishingRoleSeries.values(), Term::getRef);
  }


  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new PublishingRoleSeries.Adapter();
    protected PublishingRoleSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<PublishingRole> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<PublishingRole> {
    protected PublishingRole[] getValues() { return values(); }

    @Override
    protected Optional<PublishingRole> resolveUUID(UUID uuid) {
      return PublishingRoleSeries.resolveUUID(uuid);
    }
  }
}


