package edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801;

import static edu.mayo.kmdp.id.helper.DatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveTerm;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.versionOf;

import edu.mayo.kmdp.id.helper.DatatypeHelper;
import edu.mayo.kmdp.id.Identifier;
import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;
import edu.mayo.kmdp.terms.impl.model.TermImpl;
import edu.mayo.kmdp.util.DateTimeUtil;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;

import edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype.RelatedVersionTypeSeries;
import edu.mayo.kmdp.terms.impl.model.AnonymousConceptScheme;


@javax.xml.bind.annotation.XmlType(name = "RelatedVersionType")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( RelatedVersionType.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = RelatedVersionType.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = RelatedVersionType.JsonDeserializer.class )
public enum RelatedVersionType implements edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype.RelatedVersionType {


    /* has prior version */
    @javax.xml.bind.annotation.XmlEnumValue("has-prior-version")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/has-prior-version" )
    Has_Prior_Version( "https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType#b5294870-ae9c-35a5-a023-50dcaac54c7e", "b5294870-ae9c-35a5-a023-50dcaac54c7e", "has-prior-version", java.util.Arrays.asList( "has-prior-version" ), "has prior version", "https://www.omg.org/spec/API4KP/api4kp/has-prior-version",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* is later versioned revision of */
    @javax.xml.bind.annotation.XmlEnumValue("is-later-versioned-revision-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/is-later-versioned-revision-of" )
    Is_Later_Versioned_Revision_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType#ecd53a6e-ab42-3faf-ad05-0105822056ee", "ecd53a6e-ab42-3faf-ad05-0105822056ee", "is-later-versioned-revision-of", java.util.Arrays.asList( "is-later-versioned-revision-of" ), "is later versioned revision of", "https://www.omg.org/spec/API4KP/api4kp/is-later-versioned-revision-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Prior_Version,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Prior_Version,  } ) , 
   
    /* has original */
    @javax.xml.bind.annotation.XmlEnumValue("has-original")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/has-original" )
    Has_Original( "https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType#a1acdddf-7045-39e8-977a-a5a40ed92eec", "a1acdddf-7045-39e8-977a-a5a40ed92eec", "has-original", java.util.Arrays.asList( "has-original" ), "has original", "https://www.omg.org/spec/API4KP/api4kp/has-original",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Is_Later_Versioned_Revision_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Prior_Version,  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Is_Later_Versioned_Revision_Of,  } ) , 
   
    /* has previous version */
    @javax.xml.bind.annotation.XmlEnumValue("has-previous-version")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/has-previous-version" )
    Has_Previous_Version( "https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType#278b9dcc-a102-3fdf-ad32-624b971dac7e", "278b9dcc-a102-3fdf-ad32-624b971dac7e", "has-previous-version", java.util.Arrays.asList( "has-previous-version" ), "has previous version", "https://www.omg.org/spec/API4KP/api4kp/has-previous-version",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Prior_Version,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Prior_Version,  } ) , 
   
    /* is immediate next versioned revision of */
    @javax.xml.bind.annotation.XmlEnumValue("is-immediate-next-versioned-revision-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/is-immediate-next-versioned-revision-of" )
    Is_Immediate_Next_Versioned_Revision_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType#e8c9e53c-b211-362b-bed8-b2144821a266", "e8c9e53c-b211-362b-bed8-b2144821a266", "is-immediate-next-versioned-revision-of", java.util.Arrays.asList( "is-immediate-next-versioned-revision-of" ), "is immediate next versioned revision of", "https://www.omg.org/spec/API4KP/api4kp/is-immediate-next-versioned-revision-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Is_Later_Versioned_Revision_Of,  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Previous_Version,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Prior_Version,  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Is_Later_Versioned_Revision_Of,  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Previous_Version,  } ) , 
   
    /* Being related by means of a versioning scheme, in general, does not imply derivation: when preparing a new endeavor to be released as part of a series, It is not uncommon to &#39;start from scratch&#39;.Hence, versioning due to revision is treated as a special case, at the intersection of versioning and revision */
    @javax.xml.bind.annotation.XmlEnumValue("has-succesor-version")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/has-succesor-version" )
    Has_Successor_Version( "https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType#ab1b0725-2860-3a84-87ad-d0d1e2cab6c2", "ab1b0725-2860-3a84-87ad-d0d1e2cab6c2", "has-succesor-version", java.util.Arrays.asList( "has-succesor-version" ), "has successor version", "https://www.omg.org/spec/API4KP/api4kp/has-succesor-version",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* has next version */
    @javax.xml.bind.annotation.XmlEnumValue("has-next-version")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/has-next-version" )
    Has_Next_Version( "https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType#f9213036-1c02-342c-90be-3b26b64bb094", "f9213036-1c02-342c-90be-3b26b64bb094", "has-next-version", java.util.Arrays.asList( "has-next-version" ), "has next version", "https://www.omg.org/spec/API4KP/api4kp/has-next-version",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Successor_Version,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Successor_Version,  } ) , 
   
    /* has later versioned revision */
    @javax.xml.bind.annotation.XmlEnumValue("has-later-versioned-revision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/has-later-versioned-revision" )
    Has_Later_Versioned_Revision( "https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType#dcd2a9fb-b162-380c-adc7-5e374fae7da4", "dcd2a9fb-b162-380c-adc7-5e374fae7da4", "has-later-versioned-revision", java.util.Arrays.asList( "has-later-versioned-revision" ), "has later versioned revision", "https://www.omg.org/spec/API4KP/api4kp/has-later-versioned-revision",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Successor_Version,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Successor_Version,  } ) , 
   
    /* has next immediate versioned revision */
    @javax.xml.bind.annotation.XmlEnumValue("has-next-immediate-versioned-revision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/has-next-immediate-versioned-revision" )
    Has_Next_Immediate_Versioned_Revision( "https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType#bb62f55f-6808-3b7c-bb70-1b3281fd3c1a", "bb62f55f-6808-3b7c-bb70-1b3281fd3c1a", "has-next-immediate-versioned-revision", java.util.Arrays.asList( "has-next-immediate-versioned-revision" ), "has next immediate versioned revision", "https://www.omg.org/spec/API4KP/api4kp/has-next-immediate-versioned-revision",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Next_Version,  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Later_Versioned_Revision,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Next_Version,  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Successor_Version,  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Later_Versioned_Revision,  } ) , 
   
    /* has latest */
    @javax.xml.bind.annotation.XmlEnumValue("has-latest")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/has-latest" )
    Has_Latest( "https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType#c52fba66-5ca4-3f3d-b7f6-7012a02e64c0", "c52fba66-5ca4-3f3d-b7f6-7012a02e64c0", "has-latest", java.util.Arrays.asList( "has-latest" ), "has latest", "https://www.omg.org/spec/API4KP/api4kp/has-latest",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Later_Versioned_Revision,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Successor_Version,  edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype._20190801.RelatedVersionType.Has_Later_Versioned_Revision,  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType/20190801/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType/20190801/"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype.RelatedVersionType.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype.RelatedVersionType.SCHEME_ID )
      .withVersion( "20190801" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2019-08-01") );

  public static final Map<UUID, RelatedVersionType> index = indexByUUID(RelatedVersionType.values());

  private TermDescription description;
  private RelatedVersionTypeSeries series;

  public TermDescription getDescription() {
    return description;
  }

  RelatedVersionType(final String conceptId, final String conceptUUID,
      final String code, final List<String> additionalCodes,
      final String displayName, final String referent,
      final Term[] ancestors,
      final Term[] closure) {
    this.description = new TermImpl(conceptId, conceptUUID, code, additionalCodes, displayName,
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
  public RelatedVersionTypeSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype.RelatedVersionType> asSeries() {
    return toSeries();
  }

  private RelatedVersionTypeSeries toSeries() {
    if (series == null) {
      series = (RelatedVersionTypeSeries) RelatedVersionTypeSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<RelatedVersionType> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<RelatedVersionType> {
    protected RelatedVersionType[] getValues() {
      return values();
    }
    @Override
    protected Optional<RelatedVersionType> resolveUUID(UUID uuid) {
      return RelatedVersionType.resolveUUID(uuid);
    }
  }


  public static Optional<RelatedVersionType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<RelatedVersionType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<RelatedVersionType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<RelatedVersionType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<RelatedVersionType> resolveTag(final String tag) {
    Optional<RelatedVersionType> l = resolveTerm(tag, RelatedVersionType.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, RelatedVersionType.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<RelatedVersionType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<RelatedVersionType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, RelatedVersionType.values(), Term::getConceptId);
  }

  public static Optional<RelatedVersionType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, RelatedVersionType.values(), Term::getRef);
  }

}
