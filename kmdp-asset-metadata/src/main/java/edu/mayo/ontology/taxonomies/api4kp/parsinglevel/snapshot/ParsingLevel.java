package edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot;

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
import edu.mayo.ontology.taxonomies.api4kp.parsinglevel.ParsingLevelSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "ParsingLevel")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( ParsingLevel.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = ParsingLevel.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = ParsingLevel.JsonDeserializer.class )
public enum ParsingLevel implements edu.mayo.ontology.taxonomies.api4kp.parsinglevel.ParsingLevel {


    /* Expressions can be abstract or concrete, depending on their conformance to the constraints that specify either an abstract, as opposed to a concrete, syntax for the language used to express the Work */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeExpression")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/KnowledgeExpression" )
    Knowledge_Expression( "https://ontology.mayo.edu/taxonomies/API4KP/ParsingLevel#e965a536-5040-32c3-b4ee-93ffc12435eb", "e965a536-5040-32c3-b4ee-93ffc12435eb", "KnowledgeExpression", java.util.Arrays.asList( "KnowledgeExpression" ), "knowledge expression", "https://www.omg.org/spec/API4KP/api4kp/KnowledgeExpression",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* As a remark, two individual Concrete Expressions of the same Abstract Expression (of the same Work) are different if they use different serializations */
    @javax.xml.bind.annotation.XmlEnumValue("ConcreteExpression")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/ConcreteExpression" )
    Concrete_Knowledge_Expression( "https://ontology.mayo.edu/taxonomies/API4KP/ParsingLevel#2f0c1c52-a25b-31a1-bc43-c50d0d5cfa44", "2f0c1c52-a25b-31a1-bc43-c50d0d5cfa44", "ConcreteExpression", java.util.Arrays.asList( "ConcreteExpression" ), "concrete knowledge expression", "https://www.omg.org/spec/API4KP/api4kp/ConcreteExpression",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Knowledge_Expression,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Knowledge_Expression,  } ) , 
   
    /* A concrete expression such that the atomic syntactic elements of that expression are encoded in a way that makes them suitable to be engraved on a carrier medium */
    @javax.xml.bind.annotation.XmlEnumValue("EncodedKnowledgeExpression")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/EncodedKnowledgeExpression" )
    Encoded_Knowledge_Expression( "https://ontology.mayo.edu/taxonomies/API4KP/ParsingLevel#21b23b35-c6c7-3255-b2be-e3f70349f0ed", "21b23b35-c6c7-3255-b2be-e3f70349f0ed", "EncodedKnowledgeExpression", java.util.Arrays.asList( "EncodedKnowledgeExpression" ), "encoded knowledge expression", "https://www.omg.org/spec/API4KP/api4kp/EncodedKnowledgeExpression",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Knowledge_Expression,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Knowledge_Expression,  } ) , 
   
    /* knowledge asset surogate */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeAssetSurrogate")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/KnowledgeAssetSurrogate" )
    Knowledge_Asset_Surogate( "https://ontology.mayo.edu/taxonomies/API4KP/ParsingLevel#7ca20f21-1214-3f37-8b92-3cb238a0eba0", "7ca20f21-1214-3f37-8b92-3cb238a0eba0", "KnowledgeAssetSurrogate", java.util.Arrays.asList( "KnowledgeAssetSurrogate" ), "knowledge asset surogate", "https://www.omg.org/spec/API4KP/api4kp/KnowledgeAssetSurrogate",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Knowledge_Expression,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Knowledge_Expression,  } ) , 
   
    /* An expression that has been superimposed with a parse tree proving that (and how) the expression is a valid sentence of a given language, according to a concrete syntax of that language */
    @javax.xml.bind.annotation.XmlEnumValue("ParsedExpression")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/ParsedExpression" )
    Parsed_Knowedge_Expression( "https://ontology.mayo.edu/taxonomies/API4KP/ParsingLevel#010f8869-be8a-32de-a1f7-8742785dc0e3", "010f8869-be8a-32de-a1f7-8742785dc0e3", "ParsedExpression", java.util.Arrays.asList( "ParsedExpression" ), "parsed knowedge expression", "https://www.omg.org/spec/API4KP/api4kp/ParsedExpression",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Knowledge_Expression,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Knowledge_Expression,  } ) , 
   
    /* Abstract expressions, by definition generically depend on some carrier. An abstract expression needs one to exist physically, but does not depend on any particular one. Abstract Expressions, however, cannot be realized directly. The language needs to be complemented with a form that allows for a concrete syntactic encoding (e.g. written vs vocal for English, XML vs JSON for UML Class Models, OFN vs Turtle for OWL, etc..) */
    @javax.xml.bind.annotation.XmlEnumValue("AbstractExpression")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/AbstractExpression" )
    Abstract_Knowledge_Expression( "https://ontology.mayo.edu/taxonomies/API4KP/ParsingLevel#926222be-6e4a-3093-9f0d-347fae6d9124", "926222be-6e4a-3093-9f0d-347fae6d9124", "AbstractExpression", java.util.Arrays.asList( "AbstractExpression" ), "abstract knowledge expression", "https://www.omg.org/spec/API4KP/api4kp/AbstractExpression",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Knowledge_Expression,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.parsinglevel.snapshot.ParsingLevel.Knowledge_Expression,  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/API4KP/ParsingLevel" )),
      URI.create("https://ontology.mayo.edu/taxonomies/API4KP/ParsingLevel/SNAPSHOT/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/API4KP/ParsingLevel/SNAPSHOT/"))
      .withLabel( edu.mayo.ontology.taxonomies.api4kp.parsinglevel.ParsingLevel.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.api4kp.parsinglevel.ParsingLevel.SCHEME_ID )
      .withVersion( "20200816-213270" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, ParsingLevel> index = indexByUUID(ParsingLevel.values());

  private TermDescription description;
  private ParsingLevelSeries series;

  public TermDescription getDescription() {
    return description;
  }

  ParsingLevel(final String conceptId, final String conceptUUID,
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
  public ParsingLevelSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.api4kp.parsinglevel.ParsingLevel> asSeries() {
    return toSeries();
  }

  private ParsingLevelSeries toSeries() {
    if (series == null) {
      series = (ParsingLevelSeries) ParsingLevelSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<ParsingLevel> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<ParsingLevel> {
    protected ParsingLevel[] getValues() {
      return values();
    }
    @Override
    protected Optional<ParsingLevel> resolveUUID(UUID uuid) {
      return ParsingLevel.resolveUUID(uuid);
    }
  }


  public static Optional<ParsingLevel> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<ParsingLevel> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<ParsingLevel> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<ParsingLevel> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<ParsingLevel> resolveTag(final String tag) {
    Optional<ParsingLevel> l = resolveTerm(tag, ParsingLevel.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, ParsingLevel.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<ParsingLevel> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<ParsingLevel> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, ParsingLevel.values(), Term::getConceptId);
  }

  public static Optional<ParsingLevel> resolveRef(final URI refUri) {
    return resolveTerm(refUri, ParsingLevel.values(), Term::getRef);
  }

}
