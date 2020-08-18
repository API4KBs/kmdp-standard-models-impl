package edu.mayo.ontology.taxonomies.krformat.snapshot;

import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.resolveTerm;

import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;
import edu.mayo.kmdp.terms.adapters.xml.LegacyTermsXMLAdapter;
import edu.mayo.kmdp.terms.impl.model.LegacyTermImpl;
import edu.mayo.kmdp.util.DateTimeUtil;
import edu.mayo.ontology.taxonomies.krformat.SerializationFormatSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "SerializationFormat")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( SerializationFormat.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = SerializationFormat.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = SerializationFormat.JsonDeserializer.class )
public enum SerializationFormat implements edu.mayo.ontology.taxonomies.krformat.SerializationFormat {


    /* JSON */
    @javax.xml.bind.annotation.XmlEnumValue("json")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://json.org/20171201" )
    JSON( "https://ontology.mayo.edu/taxonomies/KRFormat#466deec7-6ecd-35fc-a6d3-8571f6324d54", "466deec7-6ecd-35fc-a6d3-8571f6324d54", "json", java.util.Arrays.asList( "json" ), "JSON", "http://json.org/20171201",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* TXT */
    @javax.xml.bind.annotation.XmlEnumValue("text")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://tools.ietf.org/html/rfc1341/7" )
    TXT( "https://ontology.mayo.edu/taxonomies/KRFormat#1cb251ec-0d56-3de6-a929-b520c4aed8d1", "1cb251ec-0d56-3de6-a929-b520c4aed8d1", "text", java.util.Arrays.asList( "text" ), "TXT", "https://tools.ietf.org/html/rfc1341/7",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* RDF 1.1 */
    @javax.xml.bind.annotation.XmlEnumValue("rdf")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.w3.org/RDF/" )
    RDF_1_1( "https://ontology.mayo.edu/taxonomies/KRFormat#29107dcc-e33a-30f4-b5b4-34d442c1a307", "29107dcc-e33a-30f4-b5b4-34d442c1a307", "rdf", java.util.Arrays.asList( "rdf" ), "RDF 1.1", "https://www.w3.org/RDF/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* YAML 1.2 */
    @javax.xml.bind.annotation.XmlEnumValue("yaml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://yaml.org/spec/1.2" )
    YAML_1_2( "https://ontology.mayo.edu/taxonomies/KRFormat#6eedc03a-68a6-3933-8763-e674f2d7c42f", "6eedc03a-68a6-3933-8763-e674f2d7c42f", "yaml", java.util.Arrays.asList( "yaml" ), "YAML 1.2", "http://yaml.org/spec/1.2",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* XML 1.1 */
    @javax.xml.bind.annotation.XmlEnumValue("xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/TR/xml11" )
    XML_1_1( "https://ontology.mayo.edu/taxonomies/KRFormat#0f635d0e-0f38-34ff-b8b5-81c132e6c7a7", "0f635d0e-0f38-34ff-b8b5-81c132e6c7a7", "xml", java.util.Arrays.asList( "xml" ), "XML 1.1", "http://www.w3.org/TR/xml11",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KRFormat" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KRFormat/SNAPSHOT/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KRFormat/SNAPSHOT/"))
      .withLabel( edu.mayo.ontology.taxonomies.krformat.SerializationFormat.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.krformat.SerializationFormat.SCHEME_ID )
      .withVersion( "20200816-213298" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, SerializationFormat> index = indexByUUID(SerializationFormat.values());

  private TermDescription description;
  private SerializationFormatSeries series;

  public TermDescription getDescription() {
    return description;
  }

  SerializationFormat(final String conceptId, final String conceptUUID,
      final String code, final List<String> additionalCodes,
      final String displayName, final String referent,
      final Term[] ancestors,
      final Term[] closure) {
    this.description = new LegacyTermImpl(conceptId, conceptUUID, code, additionalCodes, displayName,
        referent, ancestors, closure);
    this.series = series;
  }

  @Override
  public NamespaceIdentifier getNamespace() {
    return namespace;
  }

  @Override
  public VersionedIdentifier getVersionIdentifier() {
    return new NamespaceIdentifier()
      .withId(getConceptId())
      .withLabel(getLabel())
      .withTag(getTag())
      .withVersion(namespace.getVersion())
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn(namespace.getEstablishedOn());
  }

  @Override
  public java.util.Date getEstablishedOn() {
    return namespace.getEstablishedOn();
  }

  @Override
  public String getVersionTag() {
    return namespace.getVersion();
  }

  @Override
  public SerializationFormatSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.krformat.SerializationFormat> asSeries() {
    return toSeries();
  }

  private SerializationFormatSeries toSeries() {
    if (series == null) {
      series = (SerializationFormatSeries) SerializationFormatSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<SerializationFormat> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<SerializationFormat> {
    protected SerializationFormat[] getValues() {
      return values();
    }
    @Override
    protected Optional<SerializationFormat> resolveUUID(UUID uuid) {
      return SerializationFormat.resolveUUID(uuid);
    }
  }


  public static Optional<SerializationFormat> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<SerializationFormat> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<SerializationFormat> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<SerializationFormat> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<SerializationFormat> resolveTag(final String tag) {
    Optional<SerializationFormat> l = resolveTerm(tag, SerializationFormat.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, SerializationFormat.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<SerializationFormat> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<SerializationFormat> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, SerializationFormat.values(), Term::getConceptId);
  }

  public static Optional<SerializationFormat> resolveRef(final URI refUri) {
    return resolveTerm(refUri, SerializationFormat.values(), Term::getRef);
  }

}
