package edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801;

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
import edu.mayo.kmdp.terms.impl.model.LegacyTermImpl;
import edu.mayo.kmdp.util.DateTimeUtil;
import edu.mayo.ontology.taxonomies.kao.rel.structuralreltype.StructuralPartTypeSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "StructuralPartType")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( StructuralPartType.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = StructuralPartType.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = StructuralPartType.JsonDeserializer.class )
public enum StructuralPartType implements edu.mayo.ontology.taxonomies.kao.rel.structuralreltype.StructuralPartType {


    /* has part */
    @javax.xml.bind.annotation.XmlEnumValue("has-part")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/has-part" )
    Has_Part( "https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType#1eb151a7-abc4-3dc8-b9d4-db59fa1b4c15", "1eb151a7-abc4-3dc8-b9d4-db59fa1b4c15", "has-part", java.util.Arrays.asList( "has-part" ), "has part", "https://www.omg.org/spec/API4KP/api4kp/has-part",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* has proper part */
    @javax.xml.bind.annotation.XmlEnumValue("has-proper-part")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/has-proper-part" )
    Has_Proper_Part( "https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType#3ebdcb17-f570-323d-bd00-937b453fbfe9", "3ebdcb17-f570-323d-bd00-937b453fbfe9", "has-proper-part", java.util.Arrays.asList( "has-proper-part" ), "has proper part", "https://www.omg.org/spec/API4KP/api4kp/has-proper-part",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Part,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Part,  } ) , 
   
    /* The relationship between a composite and its parts */
    @javax.xml.bind.annotation.XmlEnumValue("has-structural-component")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/has-structural-component" )
    The_Relationship_Between_A_Composite_And_Its_Parts( "https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType#04a04cc9-ffc9-3916-96e6-5c928a06a627", "04a04cc9-ffc9-3916-96e6-5c928a06a627", "has-structural-component", java.util.Arrays.asList( "has-structural-component" ), "The relationship between a composite and its parts", "https://www.omg.org/spec/API4KP/api4kp/has-structural-component",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Proper_Part,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Proper_Part,  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Part,  } ) , 
   
    /* structurally organized by */
    @javax.xml.bind.annotation.XmlEnumValue("structurally-organized-by")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/structurally-organized-by" )
    Structurally_Organized_By( "https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType#857c1e6e-b1be-3def-bb4e-c188663c1595", "857c1e6e-b1be-3def-bb4e-c188663c1595", "structurally-organized-by", java.util.Arrays.asList( "structurally-organized-by" ), "structurally organized by", "https://www.omg.org/spec/API4KP/api4kp/structurally-organized-by",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.The_Relationship_Between_A_Composite_And_Its_Parts,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Proper_Part,  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.The_Relationship_Between_A_Composite_And_Its_Parts,  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Part,  } ) , 
   
    /* embeds language */
    @javax.xml.bind.annotation.XmlEnumValue("embedsLanguage")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/embedsLanguage" )
    Embeds_Language( "https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType#a1180655-792c-3db6-be8f-a9e7c79c126e", "a1180655-792c-3db6-be8f-a9e7c79c126e", "embedsLanguage", java.util.Arrays.asList( "embedsLanguage" ), "embeds language", "https://www.omg.org/spec/API4KP/api4kp/embedsLanguage",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Proper_Part,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Proper_Part,  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Part,  } ) , 
   
    /* uses concept */
    @javax.xml.bind.annotation.XmlEnumValue("uses-concept")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/uses-concept" )
    Uses_Concept( "https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType#57ab3dbe-c6d8-3485-abad-41214d740e0f", "57ab3dbe-c6d8-3485-abad-41214d740e0f", "uses-concept", java.util.Arrays.asList( "uses-concept" ), "uses concept", "https://www.omg.org/spec/API4KP/api4kp/uses-concept",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Part,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Part,  } ) , 
   
    /* captures */
    @javax.xml.bind.annotation.XmlEnumValue("captures")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/captures" )
    Captures( "https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType#8856ffdd-044d-37cd-8124-a6be5dcea329", "8856ffdd-044d-37cd-8124-a6be5dcea329", "captures", java.util.Arrays.asList( "captures" ), "captures", "https://www.omg.org/spec/API4KP/api4kp/captures",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Uses_Concept,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Part,  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Uses_Concept,  } ) , 
   
    /* defines */
    @javax.xml.bind.annotation.XmlEnumValue("defines")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/defines" )
    Defines( "https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType#e5ce0278-0309-3c37-ae63-626f7fc5c76b", "e5ce0278-0309-3c37-ae63-626f7fc5c76b", "defines", java.util.Arrays.asList( "defines" ), "defines", "https://www.omg.org/spec/API4KP/api4kp/defines",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Captures,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Part,  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Captures,  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Uses_Concept,  } ) , 
   
    /* a WoK levereages a concept if that concept is not part of that WoK, but is required to understand the WoK */
    @javax.xml.bind.annotation.XmlEnumValue("leverages")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/leverages" )
    Leverages( "https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType#841df031-fd83-3e4b-91da-3bb97cd0dd0b", "841df031-fd83-3e4b-91da-3bb97cd0dd0b", "leverages", java.util.Arrays.asList( "leverages" ), "leverages", "https://www.omg.org/spec/API4KP/api4kp/leverages",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Uses_Concept,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Part,  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Uses_Concept,  } ) , 
   
    /* concept that is used explcitily in the definition of another concept */
    @javax.xml.bind.annotation.XmlEnumValue("defines-in-terms-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/defines-in-terms-of" )
    Defines_In_Terms_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType#3ea88319-201c-361d-b5fd-f456a23668fb", "3ea88319-201c-361d-b5fd-f456a23668fb", "defines-in-terms-of", java.util.Arrays.asList( "defines-in-terms-of" ), "defines-in-terms-of", "https://www.omg.org/spec/API4KP/api4kp/defines-in-terms-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Leverages,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Has_Part,  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Uses_Concept,  edu.mayo.ontology.taxonomies.kao.rel.structuralreltype._20190801.StructuralPartType.Leverages,  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType/20190801/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType/20190801/"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.rel.structuralreltype.StructuralPartType.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.rel.structuralreltype.StructuralPartType.SCHEME_ID )
      .withVersion( "20190801" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2019-08-01") );

  public static final Map<UUID, StructuralPartType> index = indexByUUID(StructuralPartType.values());

  private TermDescription description;
  private StructuralPartTypeSeries series;

  public TermDescription getDescription() {
    return description;
  }

  StructuralPartType(final String conceptId, final String conceptUUID,
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
  public StructuralPartTypeSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.rel.structuralreltype.StructuralPartType> asSeries() {
    return toSeries();
  }

  private StructuralPartTypeSeries toSeries() {
    if (series == null) {
      series = (StructuralPartTypeSeries) StructuralPartTypeSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends LegacyURITermsJsonAdapter.Serializer<StructuralPartType> {}

  public static class JsonDeserializer extends LegacyURITermsJsonAdapter.Deserializer<StructuralPartType> {
    protected StructuralPartType[] getValues() {
      return values();
    }
    @Override
    protected Optional<StructuralPartType> resolveUUID(UUID uuid) {
      return StructuralPartType.resolveUUID(uuid);
    }
  }


  public static Optional<StructuralPartType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<StructuralPartType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<StructuralPartType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<StructuralPartType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<StructuralPartType> resolveTag(final String tag) {
    Optional<StructuralPartType> l = resolveTerm(tag, StructuralPartType.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, StructuralPartType.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<StructuralPartType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<StructuralPartType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, StructuralPartType.values(), Term::getConceptId);
  }

  public static Optional<StructuralPartType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, StructuralPartType.values(), Term::getRef);
  }

}
