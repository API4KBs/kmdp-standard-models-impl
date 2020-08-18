package edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot;

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
import edu.mayo.ontology.taxonomies.kao.rel.variantreltype.VariantTypeSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "VariantType")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( VariantType.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = VariantType.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = VariantType.JsonDeserializer.class )
public enum VariantType implements edu.mayo.ontology.taxonomies.kao.rel.variantreltype.VariantType {


    /* alternative representation of */
    @javax.xml.bind.annotation.XmlEnumValue("variant-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/variant-of" )
    Alternative_Representation_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType#a099e794-022e-3700-a676-6ae34d12912e", "a099e794-022e-3700-a676-6ae34d12912e", "variant-of", java.util.Arrays.asList( "variant-of" ), "alternative representation of", "https://www.omg.org/spec/API4KP/api4kp/variant-of",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The concepts used by the derived work are more suitable from a certain perspective, including but not limited to delivering to an audience or a setting, or expressing in some language */
    @javax.xml.bind.annotation.XmlEnumValue("adaptation-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/adaptation-of" )
    Adaptation_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType#14034e6a-930e-3393-a5a7-73ae6a5a1a46", "14034e6a-930e-3393-a5a7-73ae6a5a1a46", "adaptation-of", java.util.Arrays.asList( "adaptation-of" ), "adaptation of", "https://www.omg.org/spec/API4KP/api4kp/adaptation-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  } ) , 
   
    /* transcreation of */
    @javax.xml.bind.annotation.XmlEnumValue("transcreation-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/transcreation-of" )
    Transcreation_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType#fe94d8d8-a3f7-3708-afca-87fe6f017c8e", "fe94d8d8-a3f7-3708-afca-87fe6f017c8e", "transcreation-of", java.util.Arrays.asList( "transcreation-of" ), "transcreation of", "https://www.omg.org/spec/API4KP/api4kp/transcreation-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Adaptation_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Adaptation_Of,  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  } ) , 
   
    /* translation of */
    @javax.xml.bind.annotation.XmlEnumValue("translation-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/translation-of" )
    Translation_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType#f764785f-6f81-3303-86a0-12c255a3aa27", "f764785f-6f81-3303-86a0-12c255a3aa27", "translation-of", java.util.Arrays.asList( "translation-of" ), "translation of", "https://www.omg.org/spec/API4KP/api4kp/translation-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  } ) , 
   
    /* transwordation of */
    @javax.xml.bind.annotation.XmlEnumValue("transwordation-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/transwordation-of" )
    Transwordation_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType#fc296392-1134-3f42-9dd1-bc8beb12453b", "fc296392-1134-3f42-9dd1-bc8beb12453b", "transwordation-of", java.util.Arrays.asList( "transwordation-of" ), "transwordation of", "https://www.omg.org/spec/API4KP/api4kp/transwordation-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  } ) , 
   
    /* transliteration of */
    @javax.xml.bind.annotation.XmlEnumValue("transliteration-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/transliteration-of" )
    Transliteration_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType#4201d317-b445-35e5-81cd-67b84105a3d8", "4201d317-b445-35e5-81cd-67b84105a3d8", "transliteration-of", java.util.Arrays.asList( "transliteration-of" ), "transliteration of", "https://www.omg.org/spec/API4KP/api4kp/transliteration-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  } ) , 
   
    /* rearrangement of */
    @javax.xml.bind.annotation.XmlEnumValue("rearrangement-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/rearrangement-of" )
    Rearrangement_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType#20c639fa-4768-3f67-93df-8eefc395a370", "20c639fa-4768-3f67-93df-8eefc395a370", "rearrangement-of", java.util.Arrays.asList( "rearrangement-of" ), "rearrangement of", "https://www.omg.org/spec/API4KP/api4kp/rearrangement-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  } ) , 
   
    /* transcodification of */
    @javax.xml.bind.annotation.XmlEnumValue("transcodification-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/transcodification-of" )
    Transcodification_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType#42a75b86-6bb1-39e1-9c7b-c53b2d9b3a83", "42a75b86-6bb1-39e1-9c7b-c53b2d9b3a83", "transcodification-of", java.util.Arrays.asList( "transcodification-of" ), "transcodification of", "https://www.omg.org/spec/API4KP/api4kp/transcodification-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  } ) , 
   
    /* linguistic adaptation of */
    @javax.xml.bind.annotation.XmlEnumValue("linguistic-adaptation-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/linguistic-adaptation-of" )
    Linguistic_Adaptation_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType#9f4fccf7-15ec-3373-aa05-0b7169837777", "9f4fccf7-15ec-3373-aa05-0b7169837777", "linguistic-adaptation-of", java.util.Arrays.asList( "linguistic-adaptation-of" ), "linguistic adaptation of", "https://www.omg.org/spec/API4KP/api4kp/linguistic-adaptation-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Adaptation_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Adaptation_Of,  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  } ) , 
   
    /* transcription of */
    @javax.xml.bind.annotation.XmlEnumValue("transcription-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/transcription-of" )
    Transcription_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType#d0a6f05a-17d6-3a51-98a9-6b863e850290", "d0a6f05a-17d6-3a51-98a9-6b863e850290", "transcription-of", java.util.Arrays.asList( "transcription-of" ), "transcription of", "https://www.omg.org/spec/API4KP/api4kp/transcription-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  } ) , 
   
    /* compression of */
    @javax.xml.bind.annotation.XmlEnumValue("compression-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/compression-of" )
    Compression_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType#d156995d-4e23-36b9-823b-e6780cab563f", "d156995d-4e23-36b9-823b-e6780cab563f", "compression-of", java.util.Arrays.asList( "compression-of" ), "compression of", "https://www.omg.org/spec/API4KP/api4kp/compression-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Transcodification_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Transcodification_Of,  edu.mayo.ontology.taxonomies.kao.rel.variantreltype.snapshot.VariantType.Alternative_Representation_Of,  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType/SNAPSHOT/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType/SNAPSHOT/"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.rel.variantreltype.VariantType.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.rel.variantreltype.VariantType.SCHEME_ID )
      .withVersion( "20200816-213234" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, VariantType> index = indexByUUID(VariantType.values());

  private TermDescription description;
  private VariantTypeSeries series;

  public TermDescription getDescription() {
    return description;
  }

  VariantType(final String conceptId, final String conceptUUID,
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
  public VariantTypeSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.rel.variantreltype.VariantType> asSeries() {
    return toSeries();
  }

  private VariantTypeSeries toSeries() {
    if (series == null) {
      series = (VariantTypeSeries) VariantTypeSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends LegacyURITermsJsonAdapter.Serializer<VariantType> {}

  public static class JsonDeserializer extends LegacyURITermsJsonAdapter.Deserializer<VariantType> {
    protected VariantType[] getValues() {
      return values();
    }
    @Override
    protected Optional<VariantType> resolveUUID(UUID uuid) {
      return VariantType.resolveUUID(uuid);
    }
  }


  public static Optional<VariantType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<VariantType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<VariantType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<VariantType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<VariantType> resolveTag(final String tag) {
    Optional<VariantType> l = resolveTerm(tag, VariantType.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, VariantType.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<VariantType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<VariantType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, VariantType.values(), Term::getConceptId);
  }

  public static Optional<VariantType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, VariantType.values(), Term::getRef);
  }

}
