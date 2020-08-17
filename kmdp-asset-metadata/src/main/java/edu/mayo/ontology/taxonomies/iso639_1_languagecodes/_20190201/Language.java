package edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201;

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

import edu.mayo.ontology.taxonomies.iso639_1_languagecodes.LanguageSeries;
import edu.mayo.kmdp.terms.impl.model.AnonymousConceptScheme;


@javax.xml.bind.annotation.XmlType(name = "Language")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( Language.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = Language.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = Language.JsonDeserializer.class )
public enum Language implements edu.mayo.ontology.taxonomies.iso639_1_languagecodes.Language {


    /* Icelandic */
    @javax.xml.bind.annotation.XmlEnumValue("is")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Icelandic" )
    Icelandic( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#4c545ca2-5c8a-34a5-b3be-19e7a1c44a79", "4c545ca2-5c8a-34a5-b3be-19e7a1c44a79", "is", java.util.Arrays.asList( "is" ), "Icelandic", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Icelandic",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Basque */
    @javax.xml.bind.annotation.XmlEnumValue("eu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Basque" )
    Basque( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#a8a89070-9b58-3887-9edc-68e65a938695", "a8a89070-9b58-3887-9edc-68e65a938695", "eu", java.util.Arrays.asList( "eu" ), "Basque", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Basque",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Nyanja */
    @javax.xml.bind.annotation.XmlEnumValue("ny")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Nyanja" )
    Nyanja( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#e9e85816-90f8-38b6-a877-29eccb168b13", "e9e85816-90f8-38b6-a877-29eccb168b13", "ny", java.util.Arrays.asList( "ny" ), "Nyanja", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Nyanja",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Oriya */
    @javax.xml.bind.annotation.XmlEnumValue("or")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Oriya" )
    Oriya( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#aa1fbe57-7ecc-39ca-bb97-0d4151dfe682", "aa1fbe57-7ecc-39ca-bb97-0d4151dfe682", "or", java.util.Arrays.asList( "or" ), "Oriya", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Oriya",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Persian */
    @javax.xml.bind.annotation.XmlEnumValue("fa")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Persian" )
    Persian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#8032c149-d0e4-3ad3-8ef6-b60289f910cd", "8032c149-d0e4-3ad3-8ef6-b60289f910cd", "fa", java.util.Arrays.asList( "fa" ), "Persian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Persian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Catalan */
    @javax.xml.bind.annotation.XmlEnumValue("ca")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Catalan" )
    Catalan( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#900a14b1-1561-3d9d-8d1c-47f1d3a3251b", "900a14b1-1561-3d9d-8d1c-47f1d3a3251b", "ca", java.util.Arrays.asList( "ca" ), "Catalan", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Catalan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Turkish */
    @javax.xml.bind.annotation.XmlEnumValue("tr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Turkish" )
    Turkish( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#c1612bbd-ebfa-3546-be8a-b814e08daff1", "c1612bbd-ebfa-3546-be8a-b814e08daff1", "tr", java.util.Arrays.asList( "tr" ), "Turkish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Turkish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* North Ndebele */
    @javax.xml.bind.annotation.XmlEnumValue("nd")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorthNdebele" )
    North_Ndebele( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#63b888f9-df44-3551-a414-1c90a47585da", "63b888f9-df44-3551-a414-1c90a47585da", "nd", java.util.Arrays.asList( "nd" ), "North Ndebele", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorthNdebele",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Hungarian */
    @javax.xml.bind.annotation.XmlEnumValue("hu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hungarian" )
    Hungarian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#7b86112e-c640-3fd8-b06a-b5251d1a68fe", "7b86112e-c640-3fd8-b06a-b5251d1a68fe", "hu", java.util.Arrays.asList( "hu" ), "Hungarian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hungarian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Vietnamese */
    @javax.xml.bind.annotation.XmlEnumValue("vi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Vietnamese" )
    Vietnamese( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#7b80fae8-5640-316c-9b02-61bef0c27636", "7b80fae8-5640-316c-9b02-61bef0c27636", "vi", java.util.Arrays.asList( "vi" ), "Vietnamese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Vietnamese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Italian */
    @javax.xml.bind.annotation.XmlEnumValue("it")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Italian" )
    Italian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#4be8e06d-27bc-37e1-828f-2fa9a49ca985", "4be8e06d-27bc-37e1-828f-2fa9a49ca985", "it", java.util.Arrays.asList( "it" ), "Italian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Italian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Modern Greek */
    @javax.xml.bind.annotation.XmlEnumValue("el")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/ModernGreek" )
    Modern_Greek( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#26349cdd-47fa-3dfd-b5fa-d11686dc477f", "26349cdd-47fa-3dfd-b5fa-d11686dc477f", "el", java.util.Arrays.asList( "el" ), "Modern Greek", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/ModernGreek",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Samoan */
    @javax.xml.bind.annotation.XmlEnumValue("sm")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Samoan" )
    Samoan( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#5063c787-3b7d-3f9f-bbfd-89fe217bf2b5", "5063c787-3b7d-3f9f-bbfd-89fe217bf2b5", "sm", java.util.Arrays.asList( "sm" ), "Samoan", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Samoan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Welsh */
    @javax.xml.bind.annotation.XmlEnumValue("cy")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Welsh" )
    Welsh( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#bbb0fa49-b525-3426-8f4a-d7a06adc3e07", "bbb0fa49-b525-3426-8f4a-d7a06adc3e07", "cy", java.util.Arrays.asList( "cy" ), "Welsh", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Welsh",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Romansh */
    @javax.xml.bind.annotation.XmlEnumValue("rm")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Romansh" )
    Romansh( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#88c2cd3e-cbb0-3b23-8456-ba8b33dfd266", "88c2cd3e-cbb0-3b23-8456-ba8b33dfd266", "rm", java.util.Arrays.asList( "rm" ), "Romansh", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Romansh",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Marathi */
    @javax.xml.bind.annotation.XmlEnumValue("mr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Marathi" )
    Marathi( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#529b1c6e-afff-3f34-bcda-64708f72586d", "529b1c6e-afff-3f34-bcda-64708f72586d", "mr", java.util.Arrays.asList( "mr" ), "Marathi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Marathi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Albanian */
    @javax.xml.bind.annotation.XmlEnumValue("sq")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Albanian" )
    Albanian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#a716b6a3-e8cf-3994-965d-64d712db61d8", "a716b6a3-e8cf-3994-965d-64d712db61d8", "sq", java.util.Arrays.asList( "sq" ), "Albanian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Albanian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kongo */
    @javax.xml.bind.annotation.XmlEnumValue("kg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kongo" )
    Kongo( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#fcd18223-8eec-36f5-a948-dac946936147", "fcd18223-8eec-36f5-a948-dac946936147", "kg", java.util.Arrays.asList( "kg" ), "Kongo", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kongo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sango */
    @javax.xml.bind.annotation.XmlEnumValue("sg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sango" )
    Sango( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#2be98262-9367-3eef-af84-2a2f59cfd07a", "2be98262-9367-3eef-af84-2a2f59cfd07a", "sg", java.util.Arrays.asList( "sg" ), "Sango", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sango",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Turkmen */
    @javax.xml.bind.annotation.XmlEnumValue("tk")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Turkmen" )
    Turkmen( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#6f121192-9eb3-3a88-988a-f058eb7dbcfb", "6f121192-9eb3-3a88-988a-f058eb7dbcfb", "tk", java.util.Arrays.asList( "tk" ), "Turkmen", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Turkmen",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bashkir */
    @javax.xml.bind.annotation.XmlEnumValue("ba")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bashkir" )
    Bashkir( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#634e2c69-edef-3f7a-8b28-7ffe57bffd2d", "634e2c69-edef-3f7a-8b28-7ffe57bffd2d", "ba", java.util.Arrays.asList( "ba" ), "Bashkir", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bashkir",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* South Ndebele */
    @javax.xml.bind.annotation.XmlEnumValue("nr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/SouthNdebele" )
    South_Ndebele( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#b1203842-21fb-361c-97bd-0793e9b5a5eb", "b1203842-21fb-361c-97bd-0793e9b5a5eb", "nr", java.util.Arrays.asList( "nr" ), "South Ndebele", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/SouthNdebele",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Estonian */
    @javax.xml.bind.annotation.XmlEnumValue("et")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Estonian" )
    Estonian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#28916fc3-da67-3519-8b2b-98a7f309857f", "28916fc3-da67-3519-8b2b-98a7f309857f", "et", java.util.Arrays.asList( "et" ), "Estonian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Estonian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Hiri Motu */
    @javax.xml.bind.annotation.XmlEnumValue("ho")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/HiriMotu" )
    Hiri_Motu( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#a534fa6e-0896-332e-ba62-f3002b731576", "a534fa6e-0896-332e-ba62-f3002b731576", "ho", java.util.Arrays.asList( "ho" ), "Hiri Motu", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/HiriMotu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Guarani */
    @javax.xml.bind.annotation.XmlEnumValue("gn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Guarani" )
    Guarani( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#ee343287-6af4-38b8-8741-fdc6d3b99845", "ee343287-6af4-38b8-8741-fdc6d3b99845", "gn", java.util.Arrays.asList( "gn" ), "Guarani", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Guarani",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Abkhazian */
    @javax.xml.bind.annotation.XmlEnumValue("ab")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Abkhazian" )
    Abkhazian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#64db1254-fb5a-3435-b6ce-a757f5ef920c", "64db1254-fb5a-3435-b6ce-a757f5ef920c", "ab", java.util.Arrays.asList( "ab" ), "Abkhazian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Abkhazian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Danish */
    @javax.xml.bind.annotation.XmlEnumValue("da")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Danish" )
    Danish( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#7bc6f150-ce73-3db3-921c-be0b75aea027", "7bc6f150-ce73-3db3-921c-be0b75aea027", "da", java.util.Arrays.asList( "da" ), "Danish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Danish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Uzbek */
    @javax.xml.bind.annotation.XmlEnumValue("uz")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Uzbek" )
    Uzbek( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#ca20f547-f2f6-3dbf-ad23-b0395419dd43", "ca20f547-f2f6-3dbf-ad23-b0395419dd43", "uz", java.util.Arrays.asList( "uz" ), "Uzbek", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Uzbek",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Twi */
    @javax.xml.bind.annotation.XmlEnumValue("tw")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Twi" )
    Twi( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#90cf2eaa-63db-30b6-b96c-87dc3d4d7d75", "90cf2eaa-63db-30b6-b96c-87dc3d4d7d75", "tw", java.util.Arrays.asList( "tw" ), "Twi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Twi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kurdish */
    @javax.xml.bind.annotation.XmlEnumValue("ku")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kurdish" )
    Kurdish( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#f33ec0f9-81dd-3410-a1e0-ebc9da2c4b5e", "f33ec0f9-81dd-3410-a1e0-ebc9da2c4b5e", "ku", java.util.Arrays.asList( "ku" ), "Kurdish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kurdish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Aymara */
    @javax.xml.bind.annotation.XmlEnumValue("ay")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Aymara" )
    Aymara( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#fd46bbc3-c5ec-3bc8-b6b0-71e8581ac381", "fd46bbc3-c5ec-3bc8-b6b0-71e8581ac381", "ay", java.util.Arrays.asList( "ay" ), "Aymara", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Aymara",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Xhosa */
    @javax.xml.bind.annotation.XmlEnumValue("xh")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Xhosa" )
    Xhosa( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#66ab19a0-e349-3a5b-a559-8b106d98d651", "66ab19a0-e349-3a5b-a559-8b106d98d651", "xh", java.util.Arrays.asList( "xh" ), "Xhosa", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Xhosa",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Norwegian Bokmal */
    @javax.xml.bind.annotation.XmlEnumValue("nb")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorwegianBokmal" )
    Norwegian_Bokmal( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#8325c477-1176-3c58-9964-da62728cde1e", "8325c477-1176-3c58-9964-da62728cde1e", "nb", java.util.Arrays.asList( "nb" ), "Norwegian Bokmal", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorwegianBokmal",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Central Khmer */
    @javax.xml.bind.annotation.XmlEnumValue("km")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/CentralKhmer" )
    Central_Khmer( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#c20f3bf7-2447-3405-b0a7-2acac97a108c", "c20f3bf7-2447-3405-b0a7-2acac97a108c", "km", java.util.Arrays.asList( "km" ), "Central Khmer", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/CentralKhmer",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Wolof */
    @javax.xml.bind.annotation.XmlEnumValue("wo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Wolof" )
    Wolof( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#410d89e3-c364-3c63-b2d7-412d2d46ef69", "410d89e3-c364-3c63-b2d7-412d2d46ef69", "wo", java.util.Arrays.asList( "wo" ), "Wolof", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Wolof",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Chinese */
    @javax.xml.bind.annotation.XmlEnumValue("zh")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chinese" )
    Chinese( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#3b261136-e3c3-3f35-a0a5-8611b1f344cb", "3b261136-e3c3-3f35-a0a5-8611b1f344cb", "zh", java.util.Arrays.asList( "zh" ), "Chinese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chinese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sinhala */
    @javax.xml.bind.annotation.XmlEnumValue("si")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sinhala" )
    Sinhala( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#2a3354e2-d50e-34bf-80ba-1fbcd253506e", "2a3354e2-d50e-34bf-80ba-1fbcd253506e", "si", java.util.Arrays.asList( "si" ), "Sinhala", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sinhala",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Limburgan */
    @javax.xml.bind.annotation.XmlEnumValue("li")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Limburgan" )
    Limburgan( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#0678e3d2-2a54-3393-aec7-9daed3fb13e7", "0678e3d2-2a54-3393-aec7-9daed3fb13e7", "li", java.util.Arrays.asList( "li" ), "Limburgan", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Limburgan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Venda */
    @javax.xml.bind.annotation.XmlEnumValue("ve")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Venda" )
    Venda( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#78df616a-b31e-35ee-86c6-a519a2ce9e12", "78df616a-b31e-35ee-86c6-a519a2ce9e12", "ve", java.util.Arrays.asList( "ve" ), "Venda", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Venda",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Slovak */
    @javax.xml.bind.annotation.XmlEnumValue("sk")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Slovak" )
    Slovak( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#9accc467-b159-37ce-958e-53209c0cde2a", "9accc467-b159-37ce-958e-53209c0cde2a", "sk", java.util.Arrays.asList( "sk" ), "Slovak", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Slovak",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Azerbaijani */
    @javax.xml.bind.annotation.XmlEnumValue("az")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Azerbaijani" )
    Azerbaijani( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#9f3356b2-7d0a-36cb-9f0c-eea9e80a6e72", "9f3356b2-7d0a-36cb-9f0c-eea9e80a6e72", "az", java.util.Arrays.asList( "az" ), "Azerbaijani", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Azerbaijani",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Nepali */
    @javax.xml.bind.annotation.XmlEnumValue("ne")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Nepali" )
    Nepali( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#2f53f077-d396-32f0-b325-d5eabfc8798b", "2f53f077-d396-32f0-b325-d5eabfc8798b", "ne", java.util.Arrays.asList( "ne" ), "Nepali", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Nepali",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ossetian */
    @javax.xml.bind.annotation.XmlEnumValue("os")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ossetian" )
    Ossetian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#604e9f0b-a244-342d-9f26-80c5206ea4a6", "604e9f0b-a244-342d-9f26-80c5206ea4a6", "os", java.util.Arrays.asList( "os" ), "Ossetian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ossetian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Aragonese */
    @javax.xml.bind.annotation.XmlEnumValue("an")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Aragonese" )
    Aragonese( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#9d73d9e6-ed72-3e2f-8571-565df39f734b", "9d73d9e6-ed72-3e2f-8571-565df39f734b", "an", java.util.Arrays.asList( "an" ), "Aragonese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Aragonese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Chuvash */
    @javax.xml.bind.annotation.XmlEnumValue("cv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chuvash" )
    Chuvash( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#1dee6da6-3717-39cb-bb22-5d8b871dfa89", "1dee6da6-3717-39cb-bb22-5d8b871dfa89", "cv", java.util.Arrays.asList( "cv" ), "Chuvash", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chuvash",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Thai */
    @javax.xml.bind.annotation.XmlEnumValue("th")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Thai" )
    Thai( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#43ddc789-bcea-3177-a147-91f6c9a03b28", "43ddc789-bcea-3177-a147-91f6c9a03b28", "th", java.util.Arrays.asList( "th" ), "Thai", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Thai",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Armenian */
    @javax.xml.bind.annotation.XmlEnumValue("hy")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Armenian" )
    Armenian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#b397edd3-5777-39f6-8361-19e6ced96ff6", "b397edd3-5777-39f6-8361-19e6ced96ff6", "hy", java.util.Arrays.asList( "hy" ), "Armenian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Armenian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Assamese */
    @javax.xml.bind.annotation.XmlEnumValue("as")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Assamese" )
    Assamese( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#7e832a22-3637-3b3a-85e0-30c551d90bab", "7e832a22-3637-3b3a-85e0-30c551d90bab", "as", java.util.Arrays.asList( "as" ), "Assamese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Assamese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Komi */
    @javax.xml.bind.annotation.XmlEnumValue("kv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Komi" )
    Komi( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#fc9b189b-45de-3b54-8a71-89c488b59928", "fc9b189b-45de-3b54-8a71-89c488b59928", "kv", java.util.Arrays.asList( "kv" ), "Komi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Komi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Uighur */
    @javax.xml.bind.annotation.XmlEnumValue("ug")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Uighur" )
    Uighur( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#f8131f43-da14-3165-bf7e-cb1fd144eb6a", "f8131f43-da14-3165-bf7e-cb1fd144eb6a", "ug", java.util.Arrays.asList( "ug" ), "Uighur", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Uighur",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Faroese */
    @javax.xml.bind.annotation.XmlEnumValue("fo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Faroese" )
    Faroese( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#b4c02865-3fbd-3807-a824-f8a41dbe25fe", "b4c02865-3fbd-3807-a824-f8a41dbe25fe", "fo", java.util.Arrays.asList( "fo" ), "Faroese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Faroese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Southern Sotho */
    @javax.xml.bind.annotation.XmlEnumValue("st")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/SouthernSotho" )
    Southern_Sotho( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#0ab0904e-915d-3a0a-b4a9-3d465992cb7e", "0ab0904e-915d-3a0a-b4a9-3d465992cb7e", "st", java.util.Arrays.asList( "st" ), "Southern Sotho", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/SouthernSotho",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kashmiri */
    @javax.xml.bind.annotation.XmlEnumValue("ks")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kashmiri" )
    Kashmiri( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#2fc10ff9-87c2-37fc-8fd5-f440dd8263ab", "2fc10ff9-87c2-37fc-8fd5-f440dd8263ab", "ks", java.util.Arrays.asList( "ks" ), "Kashmiri", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kashmiri",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tswana */
    @javax.xml.bind.annotation.XmlEnumValue("tn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tswana" )
    Tswana( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#d6cffba6-0509-30b4-b2d1-6f8e3b031476", "d6cffba6-0509-30b4-b2d1-6f8e3b031476", "tn", java.util.Arrays.asList( "tn" ), "Tswana", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tswana",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Malagasy */
    @javax.xml.bind.annotation.XmlEnumValue("mg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Malagasy" )
    Malagasy( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#000f64bb-dbbb-34ac-a435-5df9f3cfad78", "000f64bb-dbbb-34ac-a435-5df9f3cfad78", "mg", java.util.Arrays.asList( "mg" ), "Malagasy", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Malagasy",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Telugu */
    @javax.xml.bind.annotation.XmlEnumValue("te")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Telugu" )
    Telugu( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#15b88a88-e6cf-36a4-862c-1562fdcb0c19", "15b88a88-e6cf-36a4-862c-1562fdcb0c19", "te", java.util.Arrays.asList( "te" ), "Telugu", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Telugu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Russian */
    @javax.xml.bind.annotation.XmlEnumValue("ru")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Russian" )
    Russian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#deba6920-e706-3540-9385-fe1fb5a379ec", "deba6920-e706-3540-9385-fe1fb5a379ec", "ru", java.util.Arrays.asList( "ru" ), "Russian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Russian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kuanyama */
    @javax.xml.bind.annotation.XmlEnumValue("kj")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kuanyama" )
    Kuanyama( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#86242ff2-83fc-3d1a-8d14-76aa05089995", "86242ff2-83fc-3d1a-8d14-76aa05089995", "kj", java.util.Arrays.asList( "kj" ), "Kuanyama", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kuanyama",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Romanian */
    @javax.xml.bind.annotation.XmlEnumValue("ro")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Romanian" )
    Romanian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#efa7394e-caa7-3c70-b6a9-da13a77236b8", "efa7394e-caa7-3c70-b6a9-da13a77236b8", "ro", java.util.Arrays.asList( "ro" ), "Romanian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Romanian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Japanese */
    @javax.xml.bind.annotation.XmlEnumValue("ja")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Japanese" )
    Japanese( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#f32ced6a-9ba1-34c4-b3c0-47fd1d7c882e", "f32ced6a-9ba1-34c4-b3c0-47fd1d7c882e", "ja", java.util.Arrays.asList( "ja" ), "Japanese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Japanese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Occitan */
    @javax.xml.bind.annotation.XmlEnumValue("oc")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Occitan" )
    Occitan( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#68a4c100-e7b1-34ab-9509-c585e7bed39c", "68a4c100-e7b1-34ab-9509-c585e7bed39c", "oc", java.util.Arrays.asList( "oc" ), "Occitan", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Occitan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Swahili */
    @javax.xml.bind.annotation.XmlEnumValue("sw")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Swahili" )
    Swahili( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#9af95fb4-ee44-3ce2-9961-e7251072625b", "9af95fb4-ee44-3ce2-9961-e7251072625b", "sw", java.util.Arrays.asList( "sw" ), "Swahili", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Swahili",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Amharic */
    @javax.xml.bind.annotation.XmlEnumValue("am")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Amharic" )
    Amharic( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#2822b8f5-aac2-391a-be53-4140a6629eea", "2822b8f5-aac2-391a-be53-4140a6629eea", "am", java.util.Arrays.asList( "am" ), "Amharic", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Amharic",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Oromo */
    @javax.xml.bind.annotation.XmlEnumValue("om")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Oromo" )
    Oromo( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#57984441-6557-38df-a9c7-cc33e12dfa4c", "57984441-6557-38df-a9c7-cc33e12dfa4c", "om", java.util.Arrays.asList( "om" ), "Oromo", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Oromo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Akan */
    @javax.xml.bind.annotation.XmlEnumValue("ak")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Akan" )
    Akan( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#dd43cea2-c41a-34cc-a536-8193e2343bf9", "dd43cea2-c41a-34cc-a536-8193e2343bf9", "ak", java.util.Arrays.asList( "ak" ), "Akan", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Akan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Luba-Katanga */
    @javax.xml.bind.annotation.XmlEnumValue("lu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/LubaKatanga" )
    Luba_Katanga( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#8dd9c99a-29d0-3ba7-8b56-829a39b2a798", "8dd9c99a-29d0-3ba7-8b56-829a39b2a798", "lu", java.util.Arrays.asList( "lu" ), "Luba-Katanga", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/LubaKatanga",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Swati */
    @javax.xml.bind.annotation.XmlEnumValue("ss")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Swati" )
    Swati( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#d6790955-5c47-3737-9a8c-a949769e0ec4", "d6790955-5c47-3737-9a8c-a949769e0ec4", "ss", java.util.Arrays.asList( "ss" ), "Swati", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Swati",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Arabic */
    @javax.xml.bind.annotation.XmlEnumValue("ar")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Arabic" )
    Arabic( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#272ccb85-92ba-3de0-baf1-dedce0fd3ac2", "272ccb85-92ba-3de0-baf1-dedce0fd3ac2", "ar", java.util.Arrays.asList( "ar" ), "Arabic", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Arabic",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Hebrew */
    @javax.xml.bind.annotation.XmlEnumValue("he")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hebrew" )
    Hebrew( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#c6c1f81a-4666-3385-ba7d-85df7eaf8763", "c6c1f81a-4666-3385-ba7d-85df7eaf8763", "he", java.util.Arrays.asList( "he" ), "Hebrew", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hebrew",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sindhi */
    @javax.xml.bind.annotation.XmlEnumValue("sd")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sindhi" )
    Sindhi( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#ff36f09c-e3d9-36b3-b729-48a4f72144dd", "ff36f09c-e3d9-36b3-b729-48a4f72144dd", "sd", java.util.Arrays.asList( "sd" ), "Sindhi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sindhi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Quechua */
    @javax.xml.bind.annotation.XmlEnumValue("qu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Quechua" )
    Quechua( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#050dc5fb-2ced-33ee-b331-0a88820ecaa0", "050dc5fb-2ced-33ee-b331-0a88820ecaa0", "qu", java.util.Arrays.asList( "qu" ), "Quechua", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Quechua",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Hausa */
    @javax.xml.bind.annotation.XmlEnumValue("ha")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hausa" )
    Hausa( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#7593d697-bfa3-3798-a23b-ecb86cbf3503", "7593d697-bfa3-3798-a23b-ecb86cbf3503", "ha", java.util.Arrays.asList( "ha" ), "Hausa", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hausa",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Cornish */
    @javax.xml.bind.annotation.XmlEnumValue("kw")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Cornish" )
    Cornish( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#8245cd7e-00de-3b2b-8e93-df68364edf46", "8245cd7e-00de-3b2b-8e93-df68364edf46", "kw", java.util.Arrays.asList( "kw" ), "Cornish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Cornish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Yoruba */
    @javax.xml.bind.annotation.XmlEnumValue("yo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Yoruba" )
    Yoruba( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#ce9ff4c0-410d-35af-bc22-06ab23c8759d", "ce9ff4c0-410d-35af-bc22-06ab23c8759d", "yo", java.util.Arrays.asList( "yo" ), "Yoruba", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Yoruba",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Herero */
    @javax.xml.bind.annotation.XmlEnumValue("hz")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Herero" )
    Herero( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#041e8934-9138-38d5-9b18-9d8be3f811b7", "041e8934-9138-38d5-9b18-9d8be3f811b7", "hz", java.util.Arrays.asList( "hz" ), "Herero", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Herero",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Shona */
    @javax.xml.bind.annotation.XmlEnumValue("sn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Shona" )
    Shona( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#6cd16662-5486-34fb-a621-f46c01701334", "6cd16662-5486-34fb-a621-f46c01701334", "sn", java.util.Arrays.asList( "sn" ), "Shona", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Shona",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Gujarati */
    @javax.xml.bind.annotation.XmlEnumValue("gu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Gujarati" )
    Gujarati( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#d1a59333-c7e5-3205-bed9-bda9da34b201", "d1a59333-c7e5-3205-bed9-bda9da34b201", "gu", java.util.Arrays.asList( "gu" ), "Gujarati", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Gujarati",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Panjabi */
    @javax.xml.bind.annotation.XmlEnumValue("pa")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Panjabi" )
    Panjabi( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#7d457c80-39e1-3cb4-9169-4c384f381684", "7d457c80-39e1-3cb4-9169-4c384f381684", "pa", java.util.Arrays.asList( "pa" ), "Panjabi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Panjabi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Somali */
    @javax.xml.bind.annotation.XmlEnumValue("so")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Somali" )
    Somali( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#0b104da5-7394-3747-a4cc-7b3a42f2c1de", "0b104da5-7394-3747-a4cc-7b3a42f2c1de", "so", java.util.Arrays.asList( "so" ), "Somali", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Somali",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Dhivehi */
    @javax.xml.bind.annotation.XmlEnumValue("dv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Dhivehi" )
    Dhivehi( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#218acefd-faa5-3741-9277-63c1cb0418f8", "218acefd-faa5-3741-9277-63c1cb0418f8", "dv", java.util.Arrays.asList( "dv" ), "Dhivehi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Dhivehi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Zhuang */
    @javax.xml.bind.annotation.XmlEnumValue("za")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Zhuang" )
    Zhuang( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#839baadf-b724-306e-ac3b-12a431dd8358", "839baadf-b724-306e-ac3b-12a431dd8358", "za", java.util.Arrays.asList( "za" ), "Zhuang", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Zhuang",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kanuri */
    @javax.xml.bind.annotation.XmlEnumValue("kr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kanuri" )
    Kanuri( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#552cfb77-7a66-320c-a896-655f2282e116", "552cfb77-7a66-320c-a896-655f2282e116", "kr", java.util.Arrays.asList( "kr" ), "Kanuri", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kanuri",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Zulu */
    @javax.xml.bind.annotation.XmlEnumValue("zu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Zulu" )
    Zulu( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#68046733-e465-3165-a4f5-9a1918cb1408", "68046733-e465-3165-a4f5-9a1918cb1408", "zu", java.util.Arrays.asList( "zu" ), "Zulu", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Zulu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Indonesian */
    @javax.xml.bind.annotation.XmlEnumValue("id")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Indonesian" )
    Indonesian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#cc1c9b57-607b-3439-978b-68074a5e2d80", "cc1c9b57-607b-3439-978b-68074a5e2d80", "id", java.util.Arrays.asList( "id" ), "Indonesian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Indonesian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tibetan */
    @javax.xml.bind.annotation.XmlEnumValue("bo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tibetan" )
    Tibetan( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#a441f933-e002-3f55-8cff-38b534f98a53", "a441f933-e002-3f55-8cff-38b534f98a53", "bo", java.util.Arrays.asList( "bo" ), "Tibetan", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tibetan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bengali */
    @javax.xml.bind.annotation.XmlEnumValue("bn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bengali" )
    Bengali( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#a56dcb84-43c2-3f8e-94b4-7b8ff1748331", "a56dcb84-43c2-3f8e-94b4-7b8ff1748331", "bn", java.util.Arrays.asList( "bn" ), "Bengali", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bengali",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Lao */
    @javax.xml.bind.annotation.XmlEnumValue("lo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Lao" )
    Lao( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#d8fd56d3-ba06-32de-8f66-25bfb1b4ca7b", "d8fd56d3-ba06-32de-8f66-25bfb1b4ca7b", "lo", java.util.Arrays.asList( "lo" ), "Lao", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Lao",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Burmese */
    @javax.xml.bind.annotation.XmlEnumValue("my")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Burmese" )
    Burmese( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#c98e06a0-0f05-311d-b3d6-f2cfd610cb70", "c98e06a0-0f05-311d-b3d6-f2cfd610cb70", "my", java.util.Arrays.asList( "my" ), "Burmese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Burmese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Lithuanian */
    @javax.xml.bind.annotation.XmlEnumValue("lt")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Lithuanian" )
    Lithuanian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#04f60583-6f66-3d87-9bf3-fb2b3643d16b", "04f60583-6f66-3d87-9bf3-fb2b3643d16b", "lt", java.util.Arrays.asList( "lt" ), "Lithuanian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Lithuanian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tonga (Tonga Islands) */
    @javax.xml.bind.annotation.XmlEnumValue("to")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tonga-TongaIslands" )
    Tonga_Tonga_Islands( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#b142db5d-05e8-3fce-94bc-07f93bf9cb51", "b142db5d-05e8-3fce-94bc-07f93bf9cb51", "to", java.util.Arrays.asList( "to" ), "Tonga (Tonga Islands)", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tonga-TongaIslands",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kirghiz */
    @javax.xml.bind.annotation.XmlEnumValue("ky")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kirghiz" )
    Kirghiz( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#dcc5d036-3f05-3398-93a1-7020fb43b652", "dcc5d036-3f05-3398-93a1-7020fb43b652", "ky", java.util.Arrays.asList( "ky" ), "Kirghiz", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kirghiz",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bulgarian */
    @javax.xml.bind.annotation.XmlEnumValue("bg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bulgarian" )
    Bulgarian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#60bb3bcc-6ff5-3542-8a38-f76f1059b2d2", "60bb3bcc-6ff5-3542-8a38-f76f1059b2d2", "bg", java.util.Arrays.asList( "bg" ), "Bulgarian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bulgarian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Georgian */
    @javax.xml.bind.annotation.XmlEnumValue("ka")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Georgian" )
    Georgian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#adc0753d-3764-3ed1-97f7-b999a0ae79a0", "adc0753d-3764-3ed1-97f7-b999a0ae79a0", "ka", java.util.Arrays.asList( "ka" ), "Georgian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Georgian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Croatian */
    @javax.xml.bind.annotation.XmlEnumValue("hr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Croatian" )
    Croatian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#0c1be09b-ad2a-3aa2-ba31-5b88abda8a32", "0c1be09b-ad2a-3aa2-ba31-5b88abda8a32", "hr", java.util.Arrays.asList( "hr" ), "Croatian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Croatian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Maltese */
    @javax.xml.bind.annotation.XmlEnumValue("mt")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Maltese" )
    Maltese( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#4d0c1117-e593-3084-8060-68a55ab227b9", "4d0c1117-e593-3084-8060-68a55ab227b9", "mt", java.util.Arrays.asList( "mt" ), "Maltese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Maltese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Galician */
    @javax.xml.bind.annotation.XmlEnumValue("gl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Galician" )
    Galician( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#516a6233-25de-3756-b29f-124618baabbc", "516a6233-25de-3756-b29f-124618baabbc", "gl", java.util.Arrays.asList( "gl" ), "Galician", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Galician",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Walloon */
    @javax.xml.bind.annotation.XmlEnumValue("wa")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Walloon" )
    Walloon( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#dee445b5-f256-3bcb-8ee3-ee19e4d8f1bc", "dee445b5-f256-3bcb-8ee3-ee19e4d8f1bc", "wa", java.util.Arrays.asList( "wa" ), "Walloon", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Walloon",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Luxembourgish */
    @javax.xml.bind.annotation.XmlEnumValue("lb")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Luxembourgish" )
    Luxembourgish( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#c0b9b1fd-f1a2-3bf3-8ba8-467790496b0e", "c0b9b1fd-f1a2-3bf3-8ba8-467790496b0e", "lb", java.util.Arrays.asList( "lb" ), "Luxembourgish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Luxembourgish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tajik */
    @javax.xml.bind.annotation.XmlEnumValue("tg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tajik" )
    Tajik( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#944c84bf-afb0-31ea-bf35-7c4f23cddf53", "944c84bf-afb0-31ea-bf35-7c4f23cddf53", "tg", java.util.Arrays.asList( "tg" ), "Tajik", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tajik",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Pushto */
    @javax.xml.bind.annotation.XmlEnumValue("ps")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Pushto" )
    Pushto( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#d7ef8c5d-f269-3972-bed6-943551a4f435", "d7ef8c5d-f269-3972-bed6-943551a4f435", "ps", java.util.Arrays.asList( "ps" ), "Pushto", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Pushto",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Norwegian Nynorsk */
    @javax.xml.bind.annotation.XmlEnumValue("nn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorwegianNynorsk" )
    Norwegian_Nynorsk( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#35fec539-d453-36dd-92be-373a5b6f7b62", "35fec539-d453-36dd-92be-373a5b6f7b62", "nn", java.util.Arrays.asList( "nn" ), "Norwegian Nynorsk", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorwegianNynorsk",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sichuan Yi */
    @javax.xml.bind.annotation.XmlEnumValue("ii")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/SichuanYi" )
    Sichuan_Yi( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#7e43fb09-6b07-36de-bf46-39c03b0e1055", "7e43fb09-6b07-36de-bf46-39c03b0e1055", "ii", java.util.Arrays.asList( "ii" ), "Sichuan Yi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/SichuanYi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Maori */
    @javax.xml.bind.annotation.XmlEnumValue("mi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Maori" )
    Maori( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#9c751c71-1ebc-3775-a46f-80308ef4d56e", "9c751c71-1ebc-3775-a46f-80308ef4d56e", "mi", java.util.Arrays.asList( "mi" ), "Maori", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Maori",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Rundi */
    @javax.xml.bind.annotation.XmlEnumValue("rn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Rundi" )
    Rundi( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#899f2e4c-fae6-3e10-9ed8-2951bef7db4d", "899f2e4c-fae6-3e10-9ed8-2951bef7db4d", "rn", java.util.Arrays.asList( "rn" ), "Rundi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Rundi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Swedish */
    @javax.xml.bind.annotation.XmlEnumValue("sv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Swedish" )
    Swedish( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#41171a0f-cd36-3ce9-8b5f-0f11398713b6", "41171a0f-cd36-3ce9-8b5f-0f11398713b6", "sv", java.util.Arrays.asList( "sv" ), "Swedish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Swedish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Lingala */
    @javax.xml.bind.annotation.XmlEnumValue("ln")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Lingala" )
    Lingala( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#d341106c-434c-30c0-bc14-eedca7822975", "d341106c-434c-30c0-bc14-eedca7822975", "ln", java.util.Arrays.asList( "ln" ), "Lingala", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Lingala",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Inupiaq */
    @javax.xml.bind.annotation.XmlEnumValue("ik")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Inupiaq" )
    Inupiaq( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#8aeb3707-7d17-3e79-b6a9-4af8c2584723", "8aeb3707-7d17-3e79-b6a9-4af8c2584723", "ik", java.util.Arrays.asList( "ik" ), "Inupiaq", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Inupiaq",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Nauru */
    @javax.xml.bind.annotation.XmlEnumValue("na")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Nauru" )
    Nauru( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#d0c5ab6b-ebe3-38a4-9569-3e990a2947bc", "d0c5ab6b-ebe3-38a4-9569-3e990a2947bc", "na", java.util.Arrays.asList( "na" ), "Nauru", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Nauru",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Scottish Gaelic */
    @javax.xml.bind.annotation.XmlEnumValue("gd")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/ScottishGaelic" )
    Scottish_Gaelic( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#e9906021-1896-3971-8e81-ac517de52da2", "e9906021-1896-3971-8e81-ac517de52da2", "gd", java.util.Arrays.asList( "gd" ), "Scottish Gaelic", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/ScottishGaelic",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Afar */
    @javax.xml.bind.annotation.XmlEnumValue("aa")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Afar" )
    Afar( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#eaf45172-e57f-392a-91df-c88f9808c540", "eaf45172-e57f-392a-91df-c88f9808c540", "aa", java.util.Arrays.asList( "aa" ), "Afar", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Afar",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Latvian */
    @javax.xml.bind.annotation.XmlEnumValue("lv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Latvian" )
    Latvian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#76ad0358-e45d-3408-bc0a-26bbf4c160e3", "76ad0358-e45d-3408-bc0a-26bbf4c160e3", "lv", java.util.Arrays.asList( "lv" ), "Latvian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Latvian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ukrainian */
    @javax.xml.bind.annotation.XmlEnumValue("uk")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ukrainian" )
    Ukrainian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#e78a6fc1-4ad6-3f7a-b838-6b20568ce95b", "e78a6fc1-4ad6-3f7a-b838-6b20568ce95b", "uk", java.util.Arrays.asList( "uk" ), "Ukrainian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ukrainian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Cree */
    @javax.xml.bind.annotation.XmlEnumValue("cr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Cree" )
    Cree( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#83d340ea-e0f7-3cb8-ba85-1fdc310c1bc6", "83d340ea-e0f7-3cb8-ba85-1fdc310c1bc6", "cr", java.util.Arrays.asList( "cr" ), "Cree", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Cree",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Dzongkha */
    @javax.xml.bind.annotation.XmlEnumValue("dz")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Dzongkha" )
    Dzongkha( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#6bf09989-b4d3-3c43-9fe1-4794368f31e5", "6bf09989-b4d3-3c43-9fe1-4794368f31e5", "dz", java.util.Arrays.asList( "dz" ), "Dzongkha", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Dzongkha",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Breton */
    @javax.xml.bind.annotation.XmlEnumValue("br")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Breton" )
    Breton( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#eb2f428f-5c20-30a6-b8e1-4ac7e8dd1eca", "eb2f428f-5c20-30a6-b8e1-4ac7e8dd1eca", "br", java.util.Arrays.asList( "br" ), "Breton", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Breton",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tigrinya */
    @javax.xml.bind.annotation.XmlEnumValue("ti")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tigrinya" )
    Tigrinya( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#dea54a29-be92-3874-9275-fae518b01457", "dea54a29-be92-3874-9275-fae518b01457", "ti", java.util.Arrays.asList( "ti" ), "Tigrinya", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tigrinya",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Serbian */
    @javax.xml.bind.annotation.XmlEnumValue("sr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Serbian" )
    Serbian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#055301c5-6abc-32dd-ba81-ea3810ad0599", "055301c5-6abc-32dd-ba81-ea3810ad0599", "sr", java.util.Arrays.asList( "sr" ), "Serbian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Serbian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Corsican */
    @javax.xml.bind.annotation.XmlEnumValue("co")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Corsican" )
    Corsican( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#9b73be92-c05e-3ace-851c-6ceba2950291", "9b73be92-c05e-3ace-851c-6ceba2950291", "co", java.util.Arrays.asList( "co" ), "Corsican", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Corsican",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Northern Sami */
    @javax.xml.bind.annotation.XmlEnumValue("se")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorthernSami" )
    Northern_Sami( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#ae77afce-e143-3d32-8284-349b7b29c667", "ae77afce-e143-3d32-8284-349b7b29c667", "se", java.util.Arrays.asList( "se" ), "Northern Sami", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorthernSami",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Haitian */
    @javax.xml.bind.annotation.XmlEnumValue("ht")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Haitian" )
    Haitian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#da2d3f72-de14-3d2e-8030-b9bfcb75acd6", "da2d3f72-de14-3d2e-8030-b9bfcb75acd6", "ht", java.util.Arrays.asList( "ht" ), "Haitian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Haitian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* German */
    @javax.xml.bind.annotation.XmlEnumValue("de")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/German" )
    German( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#86bc3115-eb4e-3873-ac96-904a4a68e19e", "86bc3115-eb4e-3873-ac96-904a4a68e19e", "de", java.util.Arrays.asList( "de" ), "German", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/German",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tsonga */
    @javax.xml.bind.annotation.XmlEnumValue("ts")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tsonga" )
    Tsonga( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#d634f58f-d91b-30c8-a153-60fb2075bd03", "d634f58f-d91b-30c8-a153-60fb2075bd03", "ts", java.util.Arrays.asList( "ts" ), "Tsonga", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tsonga",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ewe */
    @javax.xml.bind.annotation.XmlEnumValue("ee")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ewe" )
    Ewe( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#2956bc47-5585-3d0f-9242-091da155e530", "2956bc47-5585-3d0f-9242-091da155e530", "ee", java.util.Arrays.asList( "ee" ), "Ewe", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ewe",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Urdu */
    @javax.xml.bind.annotation.XmlEnumValue("ur")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Urdu" )
    Urdu( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#f8aa4393-427c-3f2f-9010-f7adc5812517", "f8aa4393-427c-3f2f-9010-f7adc5812517", "ur", java.util.Arrays.asList( "ur" ), "Urdu", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Urdu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Marshallese */
    @javax.xml.bind.annotation.XmlEnumValue("mh")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Marshallese" )
    Marshallese( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#d6c55299-c38c-32e6-ad6a-2e41c1288010", "d6c55299-c38c-32e6-ad6a-2e41c1288010", "mh", java.util.Arrays.asList( "mh" ), "Marshallese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Marshallese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Igbo */
    @javax.xml.bind.annotation.XmlEnumValue("ig")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Igbo" )
    Igbo( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#c555b579-aa26-3e92-9bdf-0fed7f7638ee", "c555b579-aa26-3e92-9bdf-0fed7f7638ee", "ig", java.util.Arrays.asList( "ig" ), "Igbo", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Igbo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Malayalam */
    @javax.xml.bind.annotation.XmlEnumValue("ml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Malayalam" )
    Malayalam( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#f9b5a275-bc45-3b62-ad13-e4a537f62a3b", "f9b5a275-bc45-3b62-ad13-e4a537f62a3b", "ml", java.util.Arrays.asList( "ml" ), "Malayalam", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Malayalam",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tahitian */
    @javax.xml.bind.annotation.XmlEnumValue("ty")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tahitian" )
    Tahitian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#7e724a2d-ed81-3257-9771-f8fe494f71f6", "7e724a2d-ed81-3257-9771-f8fe494f71f6", "ty", java.util.Arrays.asList( "ty" ), "Tahitian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tahitian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bambara */
    @javax.xml.bind.annotation.XmlEnumValue("bm")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bambara" )
    Bambara( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#832739b2-3245-3a7a-ba10-df7f9c7f6c50", "832739b2-3245-3a7a-ba10-df7f9c7f6c50", "bm", java.util.Arrays.asList( "bm" ), "Bambara", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bambara",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Norwegian */
    @javax.xml.bind.annotation.XmlEnumValue("no")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Norwegian" )
    Norwegian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#da550ca0-6bca-3bd3-8b7c-6ed32c864c70", "da550ca0-6bca-3bd3-8b7c-6ed32c864c70", "no", java.util.Arrays.asList( "no" ), "Norwegian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Norwegian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* English */
    @javax.xml.bind.annotation.XmlEnumValue("en")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/English" )
    English( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#78463a38-4a5a-34fa-95fa-73e2f506ecfc", "78463a38-4a5a-34fa-95fa-73e2f506ecfc", "en", java.util.Arrays.asList( "en" ), "English", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/English",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Mongolian */
    @javax.xml.bind.annotation.XmlEnumValue("mn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Mongolian" )
    Mongolian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#28c84f05-dbc5-31ff-a522-20ce03b16356", "28c84f05-dbc5-31ff-a522-20ce03b16356", "mn", java.util.Arrays.asList( "mn" ), "Mongolian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Mongolian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ndonga */
    @javax.xml.bind.annotation.XmlEnumValue("ng")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ndonga" )
    Ndonga( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#4870d997-5463-3426-a831-cd535dfaa41a", "4870d997-5463-3426-a831-cd535dfaa41a", "ng", java.util.Arrays.asList( "ng" ), "Ndonga", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ndonga",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Czech */
    @javax.xml.bind.annotation.XmlEnumValue("cs")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Czech" )
    Czech( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#83ff4480-cdf2-300a-a83b-f30d95774d76", "83ff4480-cdf2-300a-a83b-f30d95774d76", "cs", java.util.Arrays.asList( "cs" ), "Czech", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Czech",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* French */
    @javax.xml.bind.annotation.XmlEnumValue("fr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/French" )
    French( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#ad225f70-7802-3a11-8c22-987186dd38e8", "ad225f70-7802-3a11-8c22-987186dd38e8", "fr", java.util.Arrays.asList( "fr" ), "French", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/French",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kannada */
    @javax.xml.bind.annotation.XmlEnumValue("kn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kannada" )
    Kannada( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#6b511fdc-e48a-3427-8a35-e3365e36230c", "6b511fdc-e48a-3427-8a35-e3365e36230c", "kn", java.util.Arrays.asList( "kn" ), "Kannada", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kannada",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Finnish */
    @javax.xml.bind.annotation.XmlEnumValue("fi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Finnish" )
    Finnish( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#9ae099fd-0822-37fa-af2f-85664a4f74dc", "9ae099fd-0822-37fa-af2f-85664a4f74dc", "fi", java.util.Arrays.asList( "fi" ), "Finnish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Finnish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sardinian */
    @javax.xml.bind.annotation.XmlEnumValue("sc")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sardinian" )
    Sardinian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#0fa80b68-9964-3cb8-8c0c-a1ac09197c8c", "0fa80b68-9964-3cb8-8c0c-a1ac09197c8c", "sc", java.util.Arrays.asList( "sc" ), "Sardinian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sardinian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Chamorro */
    @javax.xml.bind.annotation.XmlEnumValue("ch")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chamorro" )
    Chamorro( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#bc01ab16-66e2-3f8a-aeb7-88936e012802", "bc01ab16-66e2-3f8a-aeb7-88936e012802", "ch", java.util.Arrays.asList( "ch" ), "Chamorro", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chamorro",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kazakh */
    @javax.xml.bind.annotation.XmlEnumValue("kk")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kazakh" )
    Kazakh( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#d05ae627-fcc8-38e7-9f1e-e341c3d5cbc2", "d05ae627-fcc8-38e7-9f1e-e341c3d5cbc2", "kk", java.util.Arrays.asList( "kk" ), "Kazakh", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kazakh",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Dutch */
    @javax.xml.bind.annotation.XmlEnumValue("nl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Dutch" )
    Dutch( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#68bf367e-228f-35ba-83cb-8831a5ee6447", "68bf367e-228f-35ba-83cb-8831a5ee6447", "nl", java.util.Arrays.asList( "nl" ), "Dutch", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Dutch",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Javanese */
    @javax.xml.bind.annotation.XmlEnumValue("jv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Javanese" )
    Javanese( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#7d94af6d-ccea-3273-abd1-d456ba3c750a", "7d94af6d-ccea-3273-abd1-d456ba3c750a", "jv", java.util.Arrays.asList( "jv" ), "Javanese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Javanese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tatar */
    @javax.xml.bind.annotation.XmlEnumValue("tt")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tatar" )
    Tatar( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#4c86bbde-578e-3648-ba0b-12aea66fc5f6", "4c86bbde-578e-3648-ba0b-12aea66fc5f6", "tt", java.util.Arrays.asList( "tt" ), "Tatar", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tatar",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Malay */
    @javax.xml.bind.annotation.XmlEnumValue("ms")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Malay" )
    Malay( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#fc179207-9200-35b7-9ca8-5323ceacf5eb", "fc179207-9200-35b7-9ca8-5323ceacf5eb", "ms", java.util.Arrays.asList( "ms" ), "Malay", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Malay",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Avaric */
    @javax.xml.bind.annotation.XmlEnumValue("av")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Avaric" )
    Avaric( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#77505e62-bcfa-3776-aa18-81c8cdde2d2c", "77505e62-bcfa-3776-aa18-81c8cdde2d2c", "av", java.util.Arrays.asList( "av" ), "Avaric", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Avaric",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Chechen */
    @javax.xml.bind.annotation.XmlEnumValue("ce")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chechen" )
    Chechen( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#427dff9d-d115-37bf-9702-5b6d8e839b27", "427dff9d-d115-37bf-9702-5b6d8e839b27", "ce", java.util.Arrays.asList( "ce" ), "Chechen", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chechen",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ganda */
    @javax.xml.bind.annotation.XmlEnumValue("lg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ganda" )
    Ganda( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#5b69f163-a7ec-32ac-9588-80c49e555eeb", "5b69f163-a7ec-32ac-9588-80c49e555eeb", "lg", java.util.Arrays.asList( "lg" ), "Ganda", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ganda",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tamil */
    @javax.xml.bind.annotation.XmlEnumValue("ta")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tamil" )
    Tamil( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#f0670813-0209-39b3-9ff8-d85744b40400", "f0670813-0209-39b3-9ff8-d85744b40400", "ta", java.util.Arrays.asList( "ta" ), "Tamil", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tamil",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Macedonian */
    @javax.xml.bind.annotation.XmlEnumValue("mk")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Macedonian" )
    Macedonian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#c1e1b1f8-bdaa-34b0-bc18-3e147887e0e1", "c1e1b1f8-bdaa-34b0-bc18-3e147887e0e1", "mk", java.util.Arrays.asList( "mk" ), "Macedonian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Macedonian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sundanese */
    @javax.xml.bind.annotation.XmlEnumValue("su")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sundanese" )
    Sundanese( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#3f43ba07-05bf-371e-a5d7-4a7a2e8b40c0", "3f43ba07-05bf-371e-a5d7-4a7a2e8b40c0", "su", java.util.Arrays.asList( "su" ), "Sundanese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sundanese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Portuguese */
    @javax.xml.bind.annotation.XmlEnumValue("pt")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Portuguese" )
    Portuguese( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#30e32c7c-4cf4-34e9-875e-60c14c442541", "30e32c7c-4cf4-34e9-875e-60c14c442541", "pt", java.util.Arrays.asList( "pt" ), "Portuguese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Portuguese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bislama */
    @javax.xml.bind.annotation.XmlEnumValue("bi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bislama" )
    Bislama( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#ad5b3d93-8c9d-30ed-b3c8-02be17c40e4e", "ad5b3d93-8c9d-30ed-b3c8-02be17c40e4e", "bi", java.util.Arrays.asList( "bi" ), "Bislama", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bislama",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kikuyu */
    @javax.xml.bind.annotation.XmlEnumValue("ki")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kikuyu" )
    Kikuyu( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#7b59a385-670f-39cd-9940-31c5b0514340", "7b59a385-670f-39cd-9940-31c5b0514340", "ki", java.util.Arrays.asList( "ki" ), "Kikuyu", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kikuyu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tagalog */
    @javax.xml.bind.annotation.XmlEnumValue("tl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tagalog" )
    Tagalog( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#fee97312-6d42-389a-8960-82e9ca6961fa", "fee97312-6d42-389a-8960-82e9ca6961fa", "tl", java.util.Arrays.asList( "tl" ), "Tagalog", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tagalog",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Navajo */
    @javax.xml.bind.annotation.XmlEnumValue("nv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Navajo" )
    Navajo( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#504405fb-03fe-3519-a14a-6d2ce11000fa", "504405fb-03fe-3519-a14a-6d2ce11000fa", "nv", java.util.Arrays.asList( "nv" ), "Navajo", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Navajo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Spanish */
    @javax.xml.bind.annotation.XmlEnumValue("es")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Spanish" )
    Spanish( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#cb5480c3-2e71-3788-92b0-8ae1e8712775", "cb5480c3-2e71-3788-92b0-8ae1e8712775", "es", java.util.Arrays.asList( "es" ), "Spanish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Spanish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Korean */
    @javax.xml.bind.annotation.XmlEnumValue("ko")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Korean" )
    Korean( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#d0bdb3cd-e477-382e-b66d-a05ebda50ccb", "d0bdb3cd-e477-382e-b66d-a05ebda50ccb", "ko", java.util.Arrays.asList( "ko" ), "Korean", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Korean",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kalaallisut */
    @javax.xml.bind.annotation.XmlEnumValue("kl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kalaallisut" )
    Kalaallisut( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#5c4f0685-88ec-3e0d-8193-b59f349879fd", "5c4f0685-88ec-3e0d-8193-b59f349879fd", "kl", java.util.Arrays.asList( "kl" ), "Kalaallisut", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kalaallisut",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Western Frisian */
    @javax.xml.bind.annotation.XmlEnumValue("fy")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/WesternFrisian" )
    Western_Frisian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#ad19bb17-f84d-3802-9805-c2287995a294", "ad19bb17-f84d-3802-9805-c2287995a294", "fy", java.util.Arrays.asList( "fy" ), "Western Frisian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/WesternFrisian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Hindi */
    @javax.xml.bind.annotation.XmlEnumValue("hi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hindi" )
    Hindi( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#45c3171e-f193-374b-802f-407fba9d955b", "45c3171e-f193-374b-802f-407fba9d955b", "hi", java.util.Arrays.asList( "hi" ), "Hindi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hindi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Fijian */
    @javax.xml.bind.annotation.XmlEnumValue("fj")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Fijian" )
    Fijian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#bcdc0695-5171-323c-98b2-b2f832d5cbba", "bcdc0695-5171-323c-98b2-b2f832d5cbba", "fj", java.util.Arrays.asList( "fj" ), "Fijian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Fijian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Inuktitut */
    @javax.xml.bind.annotation.XmlEnumValue("iu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Inuktitut" )
    Inuktitut( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#3be898f3-f28c-3fba-ad9d-525c453615b4", "3be898f3-f28c-3fba-ad9d-525c453615b4", "iu", java.util.Arrays.asList( "iu" ), "Inuktitut", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Inuktitut",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Yiddish */
    @javax.xml.bind.annotation.XmlEnumValue("yi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Yiddish" )
    Yiddish( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#6d49a359-51ac-313a-a294-548e5137157f", "6d49a359-51ac-313a-a294-548e5137157f", "yi", java.util.Arrays.asList( "yi" ), "Yiddish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Yiddish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kinyarwanda */
    @javax.xml.bind.annotation.XmlEnumValue("rw")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kinyarwanda" )
    Kinyarwanda( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#e4875932-c8cf-3d2b-8232-34a1d35b15e0", "e4875932-c8cf-3d2b-8232-34a1d35b15e0", "rw", java.util.Arrays.asList( "rw" ), "Kinyarwanda", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kinyarwanda",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Irish */
    @javax.xml.bind.annotation.XmlEnumValue("ga")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Irish" )
    Irish( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#2cfce796-f470-3d56-8ae1-c3a1b3fb7e74", "2cfce796-f470-3d56-8ae1-c3a1b3fb7e74", "ga", java.util.Arrays.asList( "ga" ), "Irish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Irish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Fulah */
    @javax.xml.bind.annotation.XmlEnumValue("ff")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Fulah" )
    Fulah( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#bef40fcd-0150-370c-bb04-179a42e04950", "bef40fcd-0150-370c-bb04-179a42e04950", "ff", java.util.Arrays.asList( "ff" ), "Fulah", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Fulah",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ojibwa */
    @javax.xml.bind.annotation.XmlEnumValue("oj")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ojibwa" )
    Ojibwa( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#cdfac88a-fad6-3244-b5a4-d6d3ff80e434", "cdfac88a-fad6-3244-b5a4-d6d3ff80e434", "oj", java.util.Arrays.asList( "oj" ), "Ojibwa", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ojibwa",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Belarusian */
    @javax.xml.bind.annotation.XmlEnumValue("be")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Belarusian" )
    Belarusian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#0a6de446-0095-3398-a8a4-5ed512a7538f", "0a6de446-0095-3398-a8a4-5ed512a7538f", "be", java.util.Arrays.asList( "be" ), "Belarusian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Belarusian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Afrikaans */
    @javax.xml.bind.annotation.XmlEnumValue("af")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Afrikaans" )
    Afrikaans( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#170d296d-4201-3e1a-b7a8-867e9b0ca3a7", "170d296d-4201-3e1a-b7a8-867e9b0ca3a7", "af", java.util.Arrays.asList( "af" ), "Afrikaans", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Afrikaans",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Slovenian */
    @javax.xml.bind.annotation.XmlEnumValue("sl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Slovenian" )
    Slovenian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#6e9970ea-c6ca-36e3-8a8e-ac50070c49ce", "6e9970ea-c6ca-36e3-8a8e-ac50070c49ce", "sl", java.util.Arrays.asList( "sl" ), "Slovenian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Slovenian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bosnian */
    @javax.xml.bind.annotation.XmlEnumValue("bs")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bosnian" )
    Bosnian( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#9dea74f0-1b9e-3ee9-abd8-67ad7b2d2d18", "9dea74f0-1b9e-3ee9-abd8-67ad7b2d2d18", "bs", java.util.Arrays.asList( "bs" ), "Bosnian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bosnian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Polish */
    @javax.xml.bind.annotation.XmlEnumValue("pl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Polish" )
    Polish( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes#c730389b-c8d9-3e59-8867-766babdd48b5", "c730389b-c8d9-3e59-8867-766babdd48b5", "pl", java.util.Arrays.asList( "pl" ), "Polish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Polish",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes" )),
      URI.create("https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes/20190201/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes/20190201/"))
      .withLabel( edu.mayo.ontology.taxonomies.iso639_1_languagecodes.Language.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.iso639_1_languagecodes.Language.SCHEME_ID )
      .withVersion( "20190201" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2019-02-01") );

  public static final Map<UUID, Language> index = indexByUUID(Language.values());

  private TermDescription description;
  private LanguageSeries series;

  public TermDescription getDescription() {
    return description;
  }

  Language(final String conceptId, final String conceptUUID,
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
  public LanguageSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.iso639_1_languagecodes.Language> asSeries() {
    return toSeries();
  }

  private LanguageSeries toSeries() {
    if (series == null) {
      series = (LanguageSeries) LanguageSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<Language> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<Language> {
    protected Language[] getValues() {
      return values();
    }
    @Override
    protected Optional<Language> resolveUUID(UUID uuid) {
      return Language.resolveUUID(uuid);
    }
  }


  public static Optional<Language> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<Language> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<Language> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<Language> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<Language> resolveTag(final String tag) {
    Optional<Language> l = resolveTerm(tag, Language.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, Language.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<Language> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<Language> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, Language.values(), Term::getConceptId);
  }

  public static Optional<Language> resolveRef(final URI refUri) {
    return resolveTerm(refUri, Language.values(), Term::getRef);
  }

}
