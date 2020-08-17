package edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801;

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

import edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.DerivationTypeSeries;
import edu.mayo.kmdp.terms.impl.model.AnonymousConceptScheme;


@javax.xml.bind.annotation.XmlType(name = "DerivationType")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( DerivationType.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = DerivationType.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = DerivationType.JsonDeserializer.class )
public enum DerivationType implements edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.DerivationType {


    /* derived from */
    @javax.xml.bind.annotation.XmlEnumValue("derived-from")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/derived-from" )
    Derived_From( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#5bf26ff0-5cff-3bb3-956f-abe63e6905b4", "5bf26ff0-5cff-3bb3-956f-abe63e6905b4", "derived-from", java.util.Arrays.asList( "derived-from" ), "derived from", "https://www.omg.org/spec/API4KP/api4kp/derived-from",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The concepts used by the derived work are more suitable from a certain perspective, including but not limited to delivering to an audience or a setting, or expressing in some language */
    @javax.xml.bind.annotation.XmlEnumValue("adaptation-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/adaptation-of" )
    Adaptation_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#14034e6a-930e-3393-a5a7-73ae6a5a1a46", "14034e6a-930e-3393-a5a7-73ae6a5a1a46", "adaptation-of", java.util.Arrays.asList( "adaptation-of" ), "adaptation of", "https://www.omg.org/spec/API4KP/api4kp/adaptation-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* inspired by */
    @javax.xml.bind.annotation.XmlEnumValue("inspired-by")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/inspired-by" )
    Inspired_By( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#69490f83-8d9f-3c6e-bd41-e34da7e7b022", "69490f83-8d9f-3c6e-bd41-e34da7e7b022", "inspired-by", java.util.Arrays.asList( "inspired-by" ), "inspired by", "https://www.omg.org/spec/API4KP/api4kp/inspired-by",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* transcription of */
    @javax.xml.bind.annotation.XmlEnumValue("transcription-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/transcription-of" )
    Transcription_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#d0a6f05a-17d6-3a51-98a9-6b863e850290", "d0a6f05a-17d6-3a51-98a9-6b863e850290", "transcription-of", java.util.Arrays.asList( "transcription-of" ), "transcription of", "https://www.omg.org/spec/API4KP/api4kp/transcription-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* linguistic adaptation of */
    @javax.xml.bind.annotation.XmlEnumValue("linguistic-adaptation-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/linguistic-adaptation-of" )
    Linguistic_Adaptation_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#9f4fccf7-15ec-3373-aa05-0b7169837777", "9f4fccf7-15ec-3373-aa05-0b7169837777", "linguistic-adaptation-of", java.util.Arrays.asList( "linguistic-adaptation-of" ), "linguistic adaptation of", "https://www.omg.org/spec/API4KP/api4kp/linguistic-adaptation-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Adaptation_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Adaptation_Of,  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* flattening of */
    @javax.xml.bind.annotation.XmlEnumValue("flattening-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/flattening-of" )
    Flattening_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#c77f083e-3e45-3d74-ab61-1339a70481d9", "c77f083e-3e45-3d74-ab61-1339a70481d9", "flattening-of", java.util.Arrays.asList( "flattening-of" ), "flattening of", "https://www.omg.org/spec/API4KP/api4kp/flattening-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* translation of */
    @javax.xml.bind.annotation.XmlEnumValue("translation-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/translation-of" )
    Translation_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#f764785f-6f81-3303-86a0-12c255a3aa27", "f764785f-6f81-3303-86a0-12c255a3aa27", "translation-of", java.util.Arrays.asList( "translation-of" ), "translation of", "https://www.omg.org/spec/API4KP/api4kp/translation-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* rearrangement of */
    @javax.xml.bind.annotation.XmlEnumValue("rearrangement-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/rearrangement-of" )
    Rearrangement_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#20c639fa-4768-3f67-93df-8eefc395a370", "20c639fa-4768-3f67-93df-8eefc395a370", "rearrangement-of", java.util.Arrays.asList( "rearrangement-of" ), "rearrangement of", "https://www.omg.org/spec/API4KP/api4kp/rearrangement-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* transcodification of */
    @javax.xml.bind.annotation.XmlEnumValue("transcodification-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/transcodification-of" )
    Transcodification_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#42a75b86-6bb1-39e1-9c7b-c53b2d9b3a83", "42a75b86-6bb1-39e1-9c7b-c53b2d9b3a83", "transcodification-of", java.util.Arrays.asList( "transcodification-of" ), "transcodification of", "https://www.omg.org/spec/API4KP/api4kp/transcodification-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* compression of */
    @javax.xml.bind.annotation.XmlEnumValue("compression-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/compression-of" )
    Compression_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#d156995d-4e23-36b9-823b-e6780cab563f", "d156995d-4e23-36b9-823b-e6780cab563f", "compression-of", java.util.Arrays.asList( "compression-of" ), "compression of", "https://www.omg.org/spec/API4KP/api4kp/compression-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Transcodification_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Transcodification_Of,  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* transwordation of */
    @javax.xml.bind.annotation.XmlEnumValue("transwordation-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/transwordation-of" )
    Transwordation_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#fc296392-1134-3f42-9dd1-bc8beb12453b", "fc296392-1134-3f42-9dd1-bc8beb12453b", "transwordation-of", java.util.Arrays.asList( "transwordation-of" ), "transwordation of", "https://www.omg.org/spec/API4KP/api4kp/transwordation-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* is later revision of */
    @javax.xml.bind.annotation.XmlEnumValue("is-later-revision-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/is-later-revision-of" )
    Is_Later_Revision_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#3631d583-b888-39f0-890d-9f496629e0d9", "3631d583-b888-39f0-890d-9f496629e0d9", "is-later-revision-of", java.util.Arrays.asList( "is-later-revision-of" ), "is later revision of", "https://www.omg.org/spec/API4KP/api4kp/is-later-revision-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* abdridgement of */
    @javax.xml.bind.annotation.XmlEnumValue("abridgement-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/abridgement-of" )
    Abdridgement_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#fb08d593-c4b4-3e2c-b3e8-4a24d874c11d", "fb08d593-c4b4-3e2c-b3e8-4a24d874c11d", "abridgement-of", java.util.Arrays.asList( "abridgement-of" ), "abdridgement of", "https://www.omg.org/spec/API4KP/api4kp/abridgement-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* paraphrase of */
    @javax.xml.bind.annotation.XmlEnumValue("paraphrase-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/paraphrase-of" )
    Paraphrase_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#2e1c288b-5c8b-3470-b22c-f392a1ada976", "2e1c288b-5c8b-3470-b22c-f392a1ada976", "paraphrase-of", java.util.Arrays.asList( "paraphrase-of" ), "paraphrase of", "https://www.omg.org/spec/API4KP/api4kp/paraphrase-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* summarization of */
    @javax.xml.bind.annotation.XmlEnumValue("summarization-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/summarization-of" )
    Summarization_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#bb7caa52-4202-38f0-b5b7-729602e2d459", "bb7caa52-4202-38f0-b5b7-729602e2d459", "summarization-of", java.util.Arrays.asList( "summarization-of" ), "summarization of", "https://www.omg.org/spec/API4KP/api4kp/summarization-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* transcreation of */
    @javax.xml.bind.annotation.XmlEnumValue("transcreation-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/transcreation-of" )
    Transcreation_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#fe94d8d8-a3f7-3708-afca-87fe6f017c8e", "fe94d8d8-a3f7-3708-afca-87fe6f017c8e", "transcreation-of", java.util.Arrays.asList( "transcreation-of" ), "transcreation of", "https://www.omg.org/spec/API4KP/api4kp/transcreation-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Adaptation_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Adaptation_Of,  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* synopsis of */
    @javax.xml.bind.annotation.XmlEnumValue("synopsis-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/synopsis-of" )
    Synopsis_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#7d490997-4223-35bd-8c05-ec54bb4c8b68", "7d490997-4223-35bd-8c05-ec54bb4c8b68", "synopsis-of", java.util.Arrays.asList( "synopsis-of" ), "synopsis of", "https://www.omg.org/spec/API4KP/api4kp/synopsis-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Summarization_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Summarization_Of,  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* transliteration of */
    @javax.xml.bind.annotation.XmlEnumValue("transliteration-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/transliteration-of" )
    Transliteration_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#4201d317-b445-35e5-81cd-67b84105a3d8", "4201d317-b445-35e5-81cd-67b84105a3d8", "transliteration-of", java.util.Arrays.asList( "transliteration-of" ), "transliteration of", "https://www.omg.org/spec/API4KP/api4kp/transliteration-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* imitation of */
    @javax.xml.bind.annotation.XmlEnumValue("imitation-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/imitation-of" )
    Imitation_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#d995acdf-6cd1-3feb-bc86-228fa0be1b29", "d995acdf-6cd1-3feb-bc86-228fa0be1b29", "imitation-of", java.util.Arrays.asList( "imitation-of" ), "imitation of", "https://www.omg.org/spec/API4KP/api4kp/imitation-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Inspired_By,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Inspired_By,  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* is later versioned revision of */
    @javax.xml.bind.annotation.XmlEnumValue("is-later-versioned-revision-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/is-later-versioned-revision-of" )
    Is_Later_Versioned_Revision_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#ecd53a6e-ab42-3faf-ad05-0105822056ee", "ecd53a6e-ab42-3faf-ad05-0105822056ee", "is-later-versioned-revision-of", java.util.Arrays.asList( "is-later-versioned-revision-of" ), "is later versioned revision of", "https://www.omg.org/spec/API4KP/api4kp/is-later-versioned-revision-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Is_Later_Revision_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Is_Later_Revision_Of,  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* has original */
    @javax.xml.bind.annotation.XmlEnumValue("has-original")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/has-original" )
    Has_Original( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#a1acdddf-7045-39e8-977a-a5a40ed92eec", "a1acdddf-7045-39e8-977a-a5a40ed92eec", "has-original", java.util.Arrays.asList( "has-original" ), "has original", "https://www.omg.org/spec/API4KP/api4kp/has-original",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Is_Later_Versioned_Revision_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Is_Later_Revision_Of,  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Is_Later_Versioned_Revision_Of,  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* is immediate next versioned revision of */
    @javax.xml.bind.annotation.XmlEnumValue("is-immediate-next-versioned-revision-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/is-immediate-next-versioned-revision-of" )
    Is_Immediate_Next_Versioned_Revision_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#e8c9e53c-b211-362b-bed8-b2144821a266", "e8c9e53c-b211-362b-bed8-b2144821a266", "is-immediate-next-versioned-revision-of", java.util.Arrays.asList( "is-immediate-next-versioned-revision-of" ), "is immediate next versioned revision of", "https://www.omg.org/spec/API4KP/api4kp/is-immediate-next-versioned-revision-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Is_Later_Versioned_Revision_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Is_Later_Revision_Of,  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Is_Later_Versioned_Revision_Of,  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) , 
   
    /* digest of */
    @javax.xml.bind.annotation.XmlEnumValue("digest-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/digest-of" )
    Digest_Of( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType#f896008d-227b-32d1-a8f9-ea74f4adab7f", "f896008d-227b-32d1-a8f9-ea74f4adab7f", "digest-of", java.util.Arrays.asList( "digest-of" ), "digest of", "https://www.omg.org/spec/API4KP/api4kp/digest-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Summarization_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Summarization_Of,  edu.mayo.ontology.taxonomies.kao.rel.derivationreltype._20190801.DerivationType.Derived_From,  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType/20190801/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType/20190801/"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.DerivationType.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.DerivationType.SCHEME_ID )
      .withVersion( "20190801" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2019-08-01") );

  public static final Map<UUID, DerivationType> index = indexByUUID(DerivationType.values());

  private TermDescription description;
  private DerivationTypeSeries series;

  public TermDescription getDescription() {
    return description;
  }

  DerivationType(final String conceptId, final String conceptUUID,
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
  public DerivationTypeSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.rel.derivationreltype.DerivationType> asSeries() {
    return toSeries();
  }

  private DerivationTypeSeries toSeries() {
    if (series == null) {
      series = (DerivationTypeSeries) DerivationTypeSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<DerivationType> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<DerivationType> {
    protected DerivationType[] getValues() {
      return values();
    }
    @Override
    protected Optional<DerivationType> resolveUUID(UUID uuid) {
      return DerivationType.resolveUUID(uuid);
    }
  }


  public static Optional<DerivationType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<DerivationType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<DerivationType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<DerivationType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<DerivationType> resolveTag(final String tag) {
    Optional<DerivationType> l = resolveTerm(tag, DerivationType.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, DerivationType.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<DerivationType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<DerivationType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, DerivationType.values(), Term::getConceptId);
  }

  public static Optional<DerivationType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, DerivationType.values(), Term::getRef);
  }

}
