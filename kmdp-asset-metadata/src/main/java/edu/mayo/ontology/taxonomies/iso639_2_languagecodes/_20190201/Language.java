package edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201;

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

import edu.mayo.ontology.taxonomies.iso639_2_languagecodes.LanguageSeries;
import edu.mayo.kmdp.terms.impl.model.AnonymousConceptScheme;


@javax.xml.bind.annotation.XmlType(name = "Language")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( Language.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = Language.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = Language.JsonDeserializer.class )
public enum Language implements edu.mayo.ontology.taxonomies.iso639_2_languagecodes.Language {


    /* Kpelle */
    @javax.xml.bind.annotation.XmlEnumValue("kpe")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kpelle" )
    Kpelle( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#a760737b-a42b-3340-95ad-fdbc93127992", "a760737b-a42b-3340-95ad-fdbc93127992", "kpe", java.util.Arrays.asList( "kpe" ), "Kpelle", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kpelle",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kabardian */
    @javax.xml.bind.annotation.XmlEnumValue("kbd")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kabardian" )
    Kabardian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#69a9dbf6-4d71-3b51-aa34-a1e28694960d", "69a9dbf6-4d71-3b51-aa34-a1e28694960d", "kbd", java.util.Arrays.asList( "kbd" ), "Kabardian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kabardian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Luiseno */
    @javax.xml.bind.annotation.XmlEnumValue("lui")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Luiseno" )
    Luiseno( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#5c617c3e-edd9-3ec3-a162-a9ccbf99d011", "5c617c3e-edd9-3ec3-a162-a9ccbf99d011", "lui", java.util.Arrays.asList( "lui" ), "Luiseno", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Luiseno",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Upper Sorbian */
    @javax.xml.bind.annotation.XmlEnumValue("hsb")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/UpperSorbian" )
    Upper_Sorbian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#f919ec7e-dd15-3a94-8ec8-56882baa59e3", "f919ec7e-dd15-3a94-8ec8-56882baa59e3", "hsb", java.util.Arrays.asList( "hsb" ), "Upper Sorbian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/UpperSorbian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Caddo */
    @javax.xml.bind.annotation.XmlEnumValue("cad")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Caddo" )
    Caddo( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#2ab611d6-cb99-383c-bc5c-7e1cba15d9d6", "2ab611d6-cb99-383c-bc5c-7e1cba15d9d6", "cad", java.util.Arrays.asList( "cad" ), "Caddo", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Caddo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bikol */
    @javax.xml.bind.annotation.XmlEnumValue("bik")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Bikol" )
    Bikol( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#81b9e947-37be-353d-9351-069b07161eab", "81b9e947-37be-353d-9351-069b07161eab", "bik", java.util.Arrays.asList( "bik" ), "Bikol", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Bikol",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Estonian */
    @javax.xml.bind.annotation.XmlEnumValue("et")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Estonian" )
    Estonian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#28916fc3-da67-3519-8b2b-98a7f309857f", "28916fc3-da67-3519-8b2b-98a7f309857f", "et", java.util.Arrays.asList( "et", "est" ), "Estonian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Estonian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tswana */
    @javax.xml.bind.annotation.XmlEnumValue("tn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tswana" )
    Tswana( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#d6cffba6-0509-30b4-b2d1-6f8e3b031476", "d6cffba6-0509-30b4-b2d1-6f8e3b031476", "tn", java.util.Arrays.asList( "tn", "tsn" ), "Tswana", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tswana",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Braj */
    @javax.xml.bind.annotation.XmlEnumValue("bra")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Braj" )
    Braj( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#e2359745-64ac-3827-aac1-a92f73c9a821", "e2359745-64ac-3827-aac1-a92f73c9a821", "bra", java.util.Arrays.asList( "bra" ), "Braj", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Braj",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Hebrew */
    @javax.xml.bind.annotation.XmlEnumValue("he")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hebrew" )
    Hebrew( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c6c1f81a-4666-3385-ba7d-85df7eaf8763", "c6c1f81a-4666-3385-ba7d-85df7eaf8763", "he", java.util.Arrays.asList( "he", "heb" ), "Hebrew", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hebrew",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kongo */
    @javax.xml.bind.annotation.XmlEnumValue("kg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kongo" )
    Kongo( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#fcd18223-8eec-36f5-a948-dac946936147", "fcd18223-8eec-36f5-a948-dac946936147", "kg", java.util.Arrays.asList( "kg", "kon" ), "Kongo", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kongo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Amharic */
    @javax.xml.bind.annotation.XmlEnumValue("am")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Amharic" )
    Amharic( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#2822b8f5-aac2-391a-be53-4140a6629eea", "2822b8f5-aac2-391a-be53-4140a6629eea", "am", java.util.Arrays.asList( "am", "amh" ), "Amharic", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Amharic",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Malagasy */
    @javax.xml.bind.annotation.XmlEnumValue("mg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Malagasy" )
    Malagasy( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#000f64bb-dbbb-34ac-a435-5df9f3cfad78", "000f64bb-dbbb-34ac-a435-5df9f3cfad78", "mg", java.util.Arrays.asList( "mg", "mlg" ), "Malagasy", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Malagasy",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tumbuka */
    @javax.xml.bind.annotation.XmlEnumValue("tum")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tumbuka" )
    Tumbuka( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#84ff11eb-157c-3240-a596-0c335a83b557", "84ff11eb-157c-3240-a596-0c335a83b557", "tum", java.util.Arrays.asList( "tum" ), "Tumbuka", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tumbuka",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Aymara */
    @javax.xml.bind.annotation.XmlEnumValue("ay")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Aymara" )
    Aymara( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#fd46bbc3-c5ec-3bc8-b6b0-71e8581ac381", "fd46bbc3-c5ec-3bc8-b6b0-71e8581ac381", "ay", java.util.Arrays.asList( "ay", "aym" ), "Aymara", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Aymara",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Portuguese */
    @javax.xml.bind.annotation.XmlEnumValue("pt")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Portuguese" )
    Portuguese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#30e32c7c-4cf4-34e9-875e-60c14c442541", "30e32c7c-4cf4-34e9-875e-60c14c442541", "pt", java.util.Arrays.asList( "pt", "por" ), "Portuguese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Portuguese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Gujarati */
    @javax.xml.bind.annotation.XmlEnumValue("gu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Gujarati" )
    Gujarati( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#d1a59333-c7e5-3205-bed9-bda9da34b201", "d1a59333-c7e5-3205-bed9-bda9da34b201", "gu", java.util.Arrays.asList( "gu", "guj" ), "Gujarati", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Gujarati",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Haida */
    @javax.xml.bind.annotation.XmlEnumValue("hai")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Haida" )
    Haida( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c4910a8a-c2e8-39a6-bc3c-e14bbcffd63f", "c4910a8a-c2e8-39a6-bc3c-e14bbcffd63f", "hai", java.util.Arrays.asList( "hai" ), "Haida", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Haida",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Macedo Romanian */
    @javax.xml.bind.annotation.XmlEnumValue("rup")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/MacedoRomanian" )
    Macedo_Romanian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#db3c2c4a-da34-3782-8bf8-f3dad892a596", "db3c2c4a-da34-3782-8bf8-f3dad892a596", "rup", java.util.Arrays.asList( "rup" ), "Macedo Romanian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/MacedoRomanian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Duala */
    @javax.xml.bind.annotation.XmlEnumValue("dua")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Duala" )
    Duala( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9e835833-3e2a-357f-8652-d535a6a50262", "9e835833-3e2a-357f-8652-d535a6a50262", "dua", java.util.Arrays.asList( "dua" ), "Duala", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Duala",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kalmyk */
    @javax.xml.bind.annotation.XmlEnumValue("xal")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kalmyk" )
    Kalmyk( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#0f04a61c-d221-384b-b161-b3d199dac964", "0f04a61c-d221-384b-b161-b3d199dac964", "xal", java.util.Arrays.asList( "xal" ), "Kalmyk", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kalmyk",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Hupa */
    @javax.xml.bind.annotation.XmlEnumValue("hup")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Hupa" )
    Hupa( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#69db4aba-c56c-3883-a396-366f41bb6535", "69db4aba-c56c-3883-a396-366f41bb6535", "hup", java.util.Arrays.asList( "hup" ), "Hupa", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Hupa",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Balinese */
    @javax.xml.bind.annotation.XmlEnumValue("ban")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Balinese" )
    Balinese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#519be31b-faca-395c-a791-4591a6c620d1", "519be31b-faca-395c-a791-4591a6c620d1", "ban", java.util.Arrays.asList( "ban" ), "Balinese", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Balinese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sinhala */
    @javax.xml.bind.annotation.XmlEnumValue("si")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sinhala" )
    Sinhala( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#2a3354e2-d50e-34bf-80ba-1fbcd253506e", "2a3354e2-d50e-34bf-80ba-1fbcd253506e", "si", java.util.Arrays.asList( "si", "sin" ), "Sinhala", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sinhala",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Umbundu */
    @javax.xml.bind.annotation.XmlEnumValue("umb")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Umbundu" )
    Umbundu( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#94348c8a-e033-3fd3-8bac-c182d124deb1", "94348c8a-e033-3fd3-8bac-c182d124deb1", "umb", java.util.Arrays.asList( "umb" ), "Umbundu", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Umbundu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Soninke */
    @javax.xml.bind.annotation.XmlEnumValue("snk")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Soninke" )
    Soninke( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7fe86cdd-6bc7-367e-947f-efdcc6ef85b7", "7fe86cdd-6bc7-367e-947f-efdcc6ef85b7", "snk", java.util.Arrays.asList( "snk" ), "Soninke", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Soninke",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Dhivehi */
    @javax.xml.bind.annotation.XmlEnumValue("dv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Dhivehi" )
    Dhivehi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#218acefd-faa5-3741-9277-63c1cb0418f8", "218acefd-faa5-3741-9277-63c1cb0418f8", "dv", java.util.Arrays.asList( "dv", "div" ), "Dhivehi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Dhivehi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Moksha */
    @javax.xml.bind.annotation.XmlEnumValue("mdf")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Moksha" )
    Moksha( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#5c742110-7c9e-3be5-be1a-12cbda5acdce", "5c742110-7c9e-3be5-be1a-12cbda5acdce", "mdf", java.util.Arrays.asList( "mdf" ), "Moksha", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Moksha",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Xhosa */
    @javax.xml.bind.annotation.XmlEnumValue("xh")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Xhosa" )
    Xhosa( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#66ab19a0-e349-3a5b-a559-8b106d98d651", "66ab19a0-e349-3a5b-a559-8b106d98d651", "xh", java.util.Arrays.asList( "xh", "xho" ), "Xhosa", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Xhosa",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Norwegian Bokmal */
    @javax.xml.bind.annotation.XmlEnumValue("nb")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorwegianBokmal" )
    Norwegian_Bokmal( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#8325c477-1176-3c58-9964-da62728cde1e", "8325c477-1176-3c58-9964-da62728cde1e", "nb", java.util.Arrays.asList( "nb", "nob" ), "Norwegian Bokmal", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorwegianBokmal",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Fijian */
    @javax.xml.bind.annotation.XmlEnumValue("fj")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Fijian" )
    Fijian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#bcdc0695-5171-323c-98b2-b2f832d5cbba", "bcdc0695-5171-323c-98b2-b2f832d5cbba", "fj", java.util.Arrays.asList( "fj", "fij" ), "Fijian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Fijian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Asturian */
    @javax.xml.bind.annotation.XmlEnumValue("ast")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Asturian" )
    Asturian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#03c0e8a6-2f85-36bb-b32c-4b6d1e319a56", "03c0e8a6-2f85-36bb-b32c-4b6d1e319a56", "ast", java.util.Arrays.asList( "ast" ), "Asturian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Asturian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ekajuk */
    @javax.xml.bind.annotation.XmlEnumValue("eka")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Ekajuk" )
    Ekajuk( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#8ff25ed2-db08-3f4d-8b20-302391d09b91", "8ff25ed2-db08-3f4d-8b20-302391d09b91", "eka", java.util.Arrays.asList( "eka" ), "Ekajuk", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Ekajuk",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Vietnamese */
    @javax.xml.bind.annotation.XmlEnumValue("vi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Vietnamese" )
    Vietnamese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7b80fae8-5640-316c-9b02-61bef0c27636", "7b80fae8-5640-316c-9b02-61bef0c27636", "vi", java.util.Arrays.asList( "vi", "vie" ), "Vietnamese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Vietnamese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Hmong */
    @javax.xml.bind.annotation.XmlEnumValue("hmn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Hmong" )
    Hmong( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#93e45b49-92a8-3829-bce5-681feeb81782", "93e45b49-92a8-3829-bce5-681feeb81782", "hmn", java.util.Arrays.asList( "hmn" ), "Hmong", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Hmong",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Icelandic */
    @javax.xml.bind.annotation.XmlEnumValue("is")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Icelandic" )
    Icelandic( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#4c545ca2-5c8a-34a5-b3be-19e7a1c44a79", "4c545ca2-5c8a-34a5-b3be-19e7a1c44a79", "is", java.util.Arrays.asList( "is", "isl", "ice" ), "Icelandic", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Icelandic",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Oromo */
    @javax.xml.bind.annotation.XmlEnumValue("om")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Oromo" )
    Oromo( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#57984441-6557-38df-a9c7-cc33e12dfa4c", "57984441-6557-38df-a9c7-cc33e12dfa4c", "om", java.util.Arrays.asList( "om", "orm" ), "Oromo", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Oromo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tahitian */
    @javax.xml.bind.annotation.XmlEnumValue("ty")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tahitian" )
    Tahitian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7e724a2d-ed81-3257-9771-f8fe494f71f6", "7e724a2d-ed81-3257-9771-f8fe494f71f6", "ty", java.util.Arrays.asList( "ty", "tah" ), "Tahitian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tahitian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Mi&#39;kmaq */
    @javax.xml.bind.annotation.XmlEnumValue("mic")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mikmaq" )
    Mi_Kmaq( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#0f04a8d1-6d0b-3dfd-9803-7d69af03b192", "0f04a8d1-6d0b-3dfd-9803-7d69af03b192", "mic", java.util.Arrays.asList( "mic" ), "Mi&#39;kmaq", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mikmaq",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ndonga */
    @javax.xml.bind.annotation.XmlEnumValue("ng")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ndonga" )
    Ndonga( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#4870d997-5463-3426-a831-cd535dfaa41a", "4870d997-5463-3426-a831-cd535dfaa41a", "ng", java.util.Arrays.asList( "ng", "ndo" ), "Ndonga", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ndonga",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Adangme */
    @javax.xml.bind.annotation.XmlEnumValue("ada")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Adangme" )
    Adangme( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#69ce11a3-6146-3d5b-a410-eeff51aebfce", "69ce11a3-6146-3d5b-a410-eeff51aebfce", "ada", java.util.Arrays.asList( "ada" ), "Adangme", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Adangme",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kumyk */
    @javax.xml.bind.annotation.XmlEnumValue("kum")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kumyk" )
    Kumyk( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ec3d92f9-59fe-33bd-8b1f-02d1b2b8322b", "ec3d92f9-59fe-33bd-8b1f-02d1b2b8322b", "kum", java.util.Arrays.asList( "kum" ), "Kumyk", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kumyk",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Urdu */
    @javax.xml.bind.annotation.XmlEnumValue("ur")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Urdu" )
    Urdu( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#f8aa4393-427c-3f2f-9010-f7adc5812517", "f8aa4393-427c-3f2f-9010-f7adc5812517", "ur", java.util.Arrays.asList( "ur", "urd" ), "Urdu", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Urdu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Mapudungun */
    @javax.xml.bind.annotation.XmlEnumValue("arn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mapudungun" )
    Mapudungun( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#8eaf21b3-6200-3ec2-b3bf-29913c694b97", "8eaf21b3-6200-3ec2-b3bf-29913c694b97", "arn", java.util.Arrays.asList( "arn" ), "Mapudungun", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mapudungun",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Mirandese */
    @javax.xml.bind.annotation.XmlEnumValue("mwl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mirandese" )
    Mirandese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#da415406-1804-3338-8b00-e5985dfe76f4", "da415406-1804-3338-8b00-e5985dfe76f4", "mwl", java.util.Arrays.asList( "mwl" ), "Mirandese", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mirandese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Southern Sami */
    @javax.xml.bind.annotation.XmlEnumValue("sma")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/SouthernSami" )
    Southern_Sami( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#5b7e3958-fc7f-3ef8-80df-9342a7fab1c0", "5b7e3958-fc7f-3ef8-80df-9342a7fab1c0", "sma", java.util.Arrays.asList( "sma" ), "Southern Sami", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/SouthernSami",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Javanese */
    @javax.xml.bind.annotation.XmlEnumValue("jv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Javanese" )
    Javanese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7d94af6d-ccea-3273-abd1-d456ba3c750a", "7d94af6d-ccea-3273-abd1-d456ba3c750a", "jv", java.util.Arrays.asList( "jv", "jav" ), "Javanese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Javanese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Hungarian */
    @javax.xml.bind.annotation.XmlEnumValue("hu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hungarian" )
    Hungarian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7b86112e-c640-3fd8-b06a-b5251d1a68fe", "7b86112e-c640-3fd8-b06a-b5251d1a68fe", "hu", java.util.Arrays.asList( "hu", "hun" ), "Hungarian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hungarian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bhojpuri */
    @javax.xml.bind.annotation.XmlEnumValue("bho")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Bhojpuri" )
    Bhojpuri( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#d8e6bfaa-7037-3d8f-9f44-11816036927e", "d8e6bfaa-7037-3d8f-9f44-11816036927e", "bho", java.util.Arrays.asList( "bho" ), "Bhojpuri", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Bhojpuri",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Selkup */
    @javax.xml.bind.annotation.XmlEnumValue("sel")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Selkup" )
    Selkup( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#cfe96f71-6b9d-37b8-929c-817959001360", "cfe96f71-6b9d-37b8-929c-817959001360", "sel", java.util.Arrays.asList( "sel" ), "Selkup", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Selkup",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Niuean */
    @javax.xml.bind.annotation.XmlEnumValue("niu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Niuean" )
    Niuean( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ba37db58-f47c-31c5-a3a9-f50a022f5cf3", "ba37db58-f47c-31c5-a3a9-f50a022f5cf3", "niu", java.util.Arrays.asList( "niu" ), "Niuean", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Niuean",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Welsh */
    @javax.xml.bind.annotation.XmlEnumValue("cy")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Welsh" )
    Welsh( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#bbb0fa49-b525-3426-8f4a-d7a06adc3e07", "bbb0fa49-b525-3426-8f4a-d7a06adc3e07", "cy", java.util.Arrays.asList( "cy", "cym", "wel" ), "Welsh", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Welsh",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Dinka */
    @javax.xml.bind.annotation.XmlEnumValue("din")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Dinka" )
    Dinka( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#1e2dabe0-2349-3f20-b397-a39314123836", "1e2dabe0-2349-3f20-b397-a39314123836", "din", java.util.Arrays.asList( "din" ), "Dinka", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Dinka",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Hawaiian */
    @javax.xml.bind.annotation.XmlEnumValue("haw")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Hawaiian" )
    Hawaiian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#a0d02c94-3869-3d07-8d94-a33e8f78885f", "a0d02c94-3869-3d07-8d94-a33e8f78885f", "haw", java.util.Arrays.asList( "haw" ), "Hawaiian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Hawaiian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ingush */
    @javax.xml.bind.annotation.XmlEnumValue("inh")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Ingush" )
    Ingush( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#e3a09da4-6e1c-34ae-8b80-7bd42dc8a43c", "e3a09da4-6e1c-34ae-8b80-7bd42dc8a43c", "inh", java.util.Arrays.asList( "inh" ), "Ingush", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Ingush",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Papiamento */
    @javax.xml.bind.annotation.XmlEnumValue("pap")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Papiamento" )
    Papiamento( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#fc6a9009-34a5-3594-8d95-15c3bb0a3caf", "fc6a9009-34a5-3594-8d95-15c3bb0a3caf", "pap", java.util.Arrays.asList( "pap" ), "Papiamento", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Papiamento",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Karelian */
    @javax.xml.bind.annotation.XmlEnumValue("krl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Karelian" )
    Karelian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#bdd220eb-2840-3a85-b172-73111d98a5a2", "bdd220eb-2840-3a85-b172-73111d98a5a2", "krl", java.util.Arrays.asList( "krl" ), "Karelian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Karelian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sicilian */
    @javax.xml.bind.annotation.XmlEnumValue("scn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Sicilian" )
    Sicilian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#e3577e57-e439-37a4-964c-73a63e249e54", "e3577e57-e439-37a4-964c-73a63e249e54", "scn", java.util.Arrays.asList( "scn" ), "Sicilian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Sicilian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Occitan */
    @javax.xml.bind.annotation.XmlEnumValue("oc")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Occitan" )
    Occitan( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#68a4c100-e7b1-34ab-9509-c585e7bed39c", "68a4c100-e7b1-34ab-9509-c585e7bed39c", "oc", java.util.Arrays.asList( "oc", "oci" ), "Occitan", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Occitan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Mohawk */
    @javax.xml.bind.annotation.XmlEnumValue("moh")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mohawk" )
    Mohawk( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#fae9a738-56d0-361b-8418-5eaa7409c6cf", "fae9a738-56d0-361b-8418-5eaa7409c6cf", "moh", java.util.Arrays.asList( "moh" ), "Mohawk", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mohawk",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tsimshian */
    @javax.xml.bind.annotation.XmlEnumValue("tsi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tsimshian" )
    Tsimshian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#592d7e25-22bb-3e87-82bc-91fc633a502b", "592d7e25-22bb-3e87-82bc-91fc633a502b", "tsi", java.util.Arrays.asList( "tsi" ), "Tsimshian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tsimshian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Nyamwezi */
    @javax.xml.bind.annotation.XmlEnumValue("nym")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Nyamwezi" )
    Nyamwezi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#b7ba0d63-bfab-3689-8ebc-01624c7aa29e", "b7ba0d63-bfab-3689-8ebc-01624c7aa29e", "nym", java.util.Arrays.asList( "nym" ), "Nyamwezi", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Nyamwezi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Yoruba */
    @javax.xml.bind.annotation.XmlEnumValue("yo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Yoruba" )
    Yoruba( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ce9ff4c0-410d-35af-bc22-06ab23c8759d", "ce9ff4c0-410d-35af-bc22-06ab23c8759d", "yo", java.util.Arrays.asList( "yo", "yor" ), "Yoruba", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Yoruba",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kurdish */
    @javax.xml.bind.annotation.XmlEnumValue("ku")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kurdish" )
    Kurdish( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#f33ec0f9-81dd-3410-a1e0-ebc9da2c4b5e", "f33ec0f9-81dd-3410-a1e0-ebc9da2c4b5e", "ku", java.util.Arrays.asList( "ku", "kur" ), "Kurdish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kurdish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Indonesian */
    @javax.xml.bind.annotation.XmlEnumValue("id")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Indonesian" )
    Indonesian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#cc1c9b57-607b-3439-978b-68074a5e2d80", "cc1c9b57-607b-3439-978b-68074a5e2d80", "id", java.util.Arrays.asList( "id", "ind" ), "Indonesian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Indonesian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Skolt Sami */
    @javax.xml.bind.annotation.XmlEnumValue("sms")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/SkoltSami" )
    Skolt_Sami( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7c700cf5-2b2a-39bc-a8cc-c488e38121e2", "7c700cf5-2b2a-39bc-a8cc-c488e38121e2", "sms", java.util.Arrays.asList( "sms" ), "Skolt Sami", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/SkoltSami",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Uzbek */
    @javax.xml.bind.annotation.XmlEnumValue("uz")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Uzbek" )
    Uzbek( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ca20f547-f2f6-3dbf-ad23-b0395419dd43", "ca20f547-f2f6-3dbf-ad23-b0395419dd43", "uz", java.util.Arrays.asList( "uz", "uzb" ), "Uzbek", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Uzbek",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Cornish */
    @javax.xml.bind.annotation.XmlEnumValue("kw")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Cornish" )
    Cornish( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#8245cd7e-00de-3b2b-8e93-df68364edf46", "8245cd7e-00de-3b2b-8e93-df68364edf46", "kw", java.util.Arrays.asList( "kw", "cor" ), "Cornish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Cornish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bemba */
    @javax.xml.bind.annotation.XmlEnumValue("bem")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Bemba" )
    Bemba( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c3d512ab-7ec1-373e-838c-ed7f4b36cf15", "c3d512ab-7ec1-373e-838c-ed7f4b36cf15", "bem", java.util.Arrays.asList( "bem" ), "Bemba", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Bemba",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tsonga */
    @javax.xml.bind.annotation.XmlEnumValue("ts")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tsonga" )
    Tsonga( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#d634f58f-d91b-30c8-a153-60fb2075bd03", "d634f58f-d91b-30c8-a153-60fb2075bd03", "ts", java.util.Arrays.asList( "ts", "tso" ), "Tsonga", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tsonga",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Shan */
    @javax.xml.bind.annotation.XmlEnumValue("shn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Shan" )
    Shan( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#8f4d09e5-1398-381b-82e7-b7517c71fed7", "8f4d09e5-1398-381b-82e7-b7517c71fed7", "shn", java.util.Arrays.asList( "shn" ), "Shan", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Shan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Quechua */
    @javax.xml.bind.annotation.XmlEnumValue("qu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Quechua" )
    Quechua( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#050dc5fb-2ced-33ee-b331-0a88820ecaa0", "050dc5fb-2ced-33ee-b331-0a88820ecaa0", "qu", java.util.Arrays.asList( "qu", "que" ), "Quechua", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Quechua",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Burmese */
    @javax.xml.bind.annotation.XmlEnumValue("my")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Burmese" )
    Burmese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c98e06a0-0f05-311d-b3d6-f2cfd610cb70", "c98e06a0-0f05-311d-b3d6-f2cfd610cb70", "my", java.util.Arrays.asList( "my", "mya", "bur" ), "Burmese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Burmese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Filipino */
    @javax.xml.bind.annotation.XmlEnumValue("fil")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Filipino" )
    Filipino( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#473a1337-a085-35cf-b4da-2b79e2145015", "473a1337-a085-35cf-b4da-2b79e2145015", "fil", java.util.Arrays.asList( "fil" ), "Filipino", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Filipino",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Syriac */
    @javax.xml.bind.annotation.XmlEnumValue("syr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Syriac" )
    Syriac( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#b4cfc6be-c96f-3b54-a504-55f269f39b71", "b4cfc6be-c96f-3b54-a504-55f269f39b71", "syr", java.util.Arrays.asList( "syr" ), "Syriac", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Syriac",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tiv */
    @javax.xml.bind.annotation.XmlEnumValue("tiv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tiv" )
    Tiv( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#60aa9f1b-5551-34e4-af5d-275a422babd7", "60aa9f1b-5551-34e4-af5d-275a422babd7", "tiv", java.util.Arrays.asList( "tiv" ), "Tiv", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tiv",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Newari */
    @javax.xml.bind.annotation.XmlEnumValue("new")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Newari" )
    Newari( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7bb6df75-753e-3d18-bd73-4b39d0178de7", "7bb6df75-753e-3d18-bd73-4b39d0178de7", "new", java.util.Arrays.asList( "new" ), "Newari", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Newari",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Washo */
    @javax.xml.bind.annotation.XmlEnumValue("was")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Washo" )
    Washo( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ccd9179b-42c5-36e6-aa3e-a1c3d0a1d1a9", "ccd9179b-42c5-36e6-aa3e-a1c3d0a1d1a9", "was", java.util.Arrays.asList( "was" ), "Washo", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Washo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Walloon */
    @javax.xml.bind.annotation.XmlEnumValue("wa")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Walloon" )
    Walloon( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#dee445b5-f256-3bcb-8ee3-ee19e4d8f1bc", "dee445b5-f256-3bcb-8ee3-ee19e4d8f1bc", "wa", java.util.Arrays.asList( "wa", "wln" ), "Walloon", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Walloon",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ga */
    @javax.xml.bind.annotation.XmlEnumValue("gaa")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Ga" )
    Ga( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#e78cf885-951f-37a4-bbf1-efcd5c9cc1c1", "e78cf885-951f-37a4-bbf1-efcd5c9cc1c1", "gaa", java.util.Arrays.asList( "gaa" ), "Ga", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Ga",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Oriya */
    @javax.xml.bind.annotation.XmlEnumValue("or")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Oriya" )
    Oriya( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#aa1fbe57-7ecc-39ca-bb97-0d4151dfe682", "aa1fbe57-7ecc-39ca-bb97-0d4151dfe682", "or", java.util.Arrays.asList( "or", "ori" ), "Oriya", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Oriya",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kanuri */
    @javax.xml.bind.annotation.XmlEnumValue("kr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kanuri" )
    Kanuri( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#552cfb77-7a66-320c-a896-655f2282e116", "552cfb77-7a66-320c-a896-655f2282e116", "kr", java.util.Arrays.asList( "kr", "kau" ), "Kanuri", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kanuri",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Komi */
    @javax.xml.bind.annotation.XmlEnumValue("kv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Komi" )
    Komi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#fc9b189b-45de-3b54-8a71-89c488b59928", "fc9b189b-45de-3b54-8a71-89c488b59928", "kv", java.util.Arrays.asList( "kv", "kom" ), "Komi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Komi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kachin */
    @javax.xml.bind.annotation.XmlEnumValue("kac")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kachin" )
    Kachin( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7217d135-d3cb-30e1-aecd-48672b97d9fd", "7217d135-d3cb-30e1-aecd-48672b97d9fd", "kac", java.util.Arrays.asList( "kac" ), "Kachin", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kachin",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Zaza */
    @javax.xml.bind.annotation.XmlEnumValue("zza")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Zaza" )
    Zaza( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9b954d33-8515-3bf5-a493-e77c380ae9a4", "9b954d33-8515-3bf5-a493-e77c380ae9a4", "zza", java.util.Arrays.asList( "zza" ), "Zaza", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Zaza",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Aragonese */
    @javax.xml.bind.annotation.XmlEnumValue("an")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Aragonese" )
    Aragonese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9d73d9e6-ed72-3e2f-8571-565df39f734b", "9d73d9e6-ed72-3e2f-8571-565df39f734b", "an", java.util.Arrays.asList( "an", "arg" ), "Aragonese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Aragonese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Santali */
    @javax.xml.bind.annotation.XmlEnumValue("sat")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Santali" )
    Santali( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c149febc-3112-3de8-bae5-9bd6efaa5cb2", "c149febc-3112-3de8-bae5-9bd6efaa5cb2", "sat", java.util.Arrays.asList( "sat" ), "Santali", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Santali",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Swahili */
    @javax.xml.bind.annotation.XmlEnumValue("sw")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Swahili" )
    Swahili( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9af95fb4-ee44-3ce2-9961-e7251072625b", "9af95fb4-ee44-3ce2-9961-e7251072625b", "sw", java.util.Arrays.asList( "sw", "swa" ), "Swahili", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Swahili",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tokelau */
    @javax.xml.bind.annotation.XmlEnumValue("tkl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tokelau" )
    Tokelau( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#a5b0ca0a-4bed-32b9-a806-1e17d453bf13", "a5b0ca0a-4bed-32b9-a806-1e17d453bf13", "tkl", java.util.Arrays.asList( "tkl" ), "Tokelau", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tokelau",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Italian */
    @javax.xml.bind.annotation.XmlEnumValue("it")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Italian" )
    Italian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#4be8e06d-27bc-37e1-828f-2fa9a49ca985", "4be8e06d-27bc-37e1-828f-2fa9a49ca985", "it", java.util.Arrays.asList( "it", "ita" ), "Italian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Italian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Madurese */
    @javax.xml.bind.annotation.XmlEnumValue("mad")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Madurese" )
    Madurese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#2d97be3d-9266-341f-a879-08a0e213c09f", "2d97be3d-9266-341f-a879-08a0e213c09f", "mad", java.util.Arrays.asList( "mad" ), "Madurese", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Madurese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kabyle */
    @javax.xml.bind.annotation.XmlEnumValue("kab")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kabyle" )
    Kabyle( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#201b0358-e654-3b02-b247-b4ff48ecd5f0", "201b0358-e654-3b02-b247-b4ff48ecd5f0", "kab", java.util.Arrays.asList( "kab" ), "Kabyle", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kabyle",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Khasi */
    @javax.xml.bind.annotation.XmlEnumValue("kha")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Khasi" )
    Khasi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#56aae56d-c72f-391d-a175-69ae2e4878fc", "56aae56d-c72f-391d-a175-69ae2e4878fc", "kha", java.util.Arrays.asList( "kha" ), "Khasi", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Khasi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sindhi */
    @javax.xml.bind.annotation.XmlEnumValue("sd")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sindhi" )
    Sindhi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ff36f09c-e3d9-36b3-b729-48a4f72144dd", "ff36f09c-e3d9-36b3-b729-48a4f72144dd", "sd", java.util.Arrays.asList( "sd", "snd" ), "Sindhi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sindhi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Gwich&#39;in */
    @javax.xml.bind.annotation.XmlEnumValue("gwi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Gwichin" )
    Gwich_In( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#45607c2b-9f9b-397e-a3b9-9b69babd2ba3", "45607c2b-9f9b-397e-a3b9-9b69babd2ba3", "gwi", java.util.Arrays.asList( "gwi" ), "Gwich&#39;in", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Gwichin",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Efik */
    @javax.xml.bind.annotation.XmlEnumValue("efi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Efik" )
    Efik( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#5dfac4d7-dcee-3cd0-b56a-52e38e44859e", "5dfac4d7-dcee-3cd0-b56a-52e38e44859e", "efi", java.util.Arrays.asList( "efi" ), "Efik", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Efik",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Mossi */
    @javax.xml.bind.annotation.XmlEnumValue("mos")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mossi" )
    Mossi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#5d27ab98-ea9b-33f8-9ddc-c2ccb35f7cdd", "5d27ab98-ea9b-33f8-9ddc-c2ccb35f7cdd", "mos", java.util.Arrays.asList( "mos" ), "Mossi", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mossi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kuanyama */
    @javax.xml.bind.annotation.XmlEnumValue("kj")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kuanyama" )
    Kuanyama( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#86242ff2-83fc-3d1a-8d14-76aa05089995", "86242ff2-83fc-3d1a-8d14-76aa05089995", "kj", java.util.Arrays.asList( "kj", "kua" ), "Kuanyama", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kuanyama",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Lahnda */
    @javax.xml.bind.annotation.XmlEnumValue("lah")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Lahnda" )
    Lahnda( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#d0570932-a2a5-30c0-b616-a9eafb94f8da", "d0570932-a2a5-30c0-b616-a9eafb94f8da", "lah", java.util.Arrays.asList( "lah" ), "Lahnda", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Lahnda",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Fang */
    @javax.xml.bind.annotation.XmlEnumValue("fan")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Fang" )
    Fang( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#498ac8ca-e7ad-39cc-b844-c0a750fcecbb", "498ac8ca-e7ad-39cc-b844-c0a750fcecbb", "fan", java.util.Arrays.asList( "fan" ), "Fang", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Fang",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Akan */
    @javax.xml.bind.annotation.XmlEnumValue("ak")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Akan" )
    Akan( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#dd43cea2-c41a-34cc-a536-8193e2343bf9", "dd43cea2-c41a-34cc-a536-8193e2343bf9", "ak", java.util.Arrays.asList( "ak", "aka" ), "Akan", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Akan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Maithili */
    @javax.xml.bind.annotation.XmlEnumValue("mai")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Maithili" )
    Maithili( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#0c606d8a-ee16-30dd-aea5-81d6cf3c1490", "0c606d8a-ee16-30dd-aea5-81d6cf3c1490", "mai", java.util.Arrays.asList( "mai" ), "Maithili", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Maithili",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Cree */
    @javax.xml.bind.annotation.XmlEnumValue("cr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Cree" )
    Cree( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#83d340ea-e0f7-3cb8-ba85-1fdc310c1bc6", "83d340ea-e0f7-3cb8-ba85-1fdc310c1bc6", "cr", java.util.Arrays.asList( "cr", "cre" ), "Cree", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Cree",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Dzongkha */
    @javax.xml.bind.annotation.XmlEnumValue("dz")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Dzongkha" )
    Dzongkha( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#6bf09989-b4d3-3c43-9fe1-4794368f31e5", "6bf09989-b4d3-3c43-9fe1-4794368f31e5", "dz", java.util.Arrays.asList( "dz", "dzo" ), "Dzongkha", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Dzongkha",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Hausa */
    @javax.xml.bind.annotation.XmlEnumValue("ha")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hausa" )
    Hausa( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7593d697-bfa3-3798-a23b-ecb86cbf3503", "7593d697-bfa3-3798-a23b-ecb86cbf3503", "ha", java.util.Arrays.asList( "ha", "hau" ), "Hausa", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hausa",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tamashek */
    @javax.xml.bind.annotation.XmlEnumValue("tmh")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tamashek" )
    Tamashek( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#abb996ac-bd98-3fb6-93a1-b8b27263f00d", "abb996ac-bd98-3fb6-93a1-b8b27263f00d", "tmh", java.util.Arrays.asList( "tmh" ), "Tamashek", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tamashek",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Northern Frisian */
    @javax.xml.bind.annotation.XmlEnumValue("frr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/NorthernFrisian" )
    Northern_Frisian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ee436f73-fba0-3ec8-a7c3-340106974d45", "ee436f73-fba0-3ec8-a7c3-340106974d45", "frr", java.util.Arrays.asList( "frr" ), "Northern Frisian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/NorthernFrisian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Aleut */
    @javax.xml.bind.annotation.XmlEnumValue("ale")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Aleut" )
    Aleut( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#36573ce0-e77c-3fc8-9cb8-a264430775c0", "36573ce0-e77c-3fc8-9cb8-a264430775c0", "ale", java.util.Arrays.asList( "ale" ), "Aleut", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Aleut",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Breton */
    @javax.xml.bind.annotation.XmlEnumValue("br")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Breton" )
    Breton( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#eb2f428f-5c20-30a6-b8e1-4ac7e8dd1eca", "eb2f428f-5c20-30a6-b8e1-4ac7e8dd1eca", "br", java.util.Arrays.asList( "br", "bre" ), "Breton", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Breton",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Serbian */
    @javax.xml.bind.annotation.XmlEnumValue("sr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Serbian" )
    Serbian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#055301c5-6abc-32dd-ba81-ea3810ad0599", "055301c5-6abc-32dd-ba81-ea3810ad0599", "sr", java.util.Arrays.asList( "sr", "srp" ), "Serbian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Serbian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Lezghian */
    @javax.xml.bind.annotation.XmlEnumValue("lez")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Lezghian" )
    Lezghian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ca3fefeb-6a4c-3f36-b2b3-d07b52bdc413", "ca3fefeb-6a4c-3f36-b2b3-d07b52bdc413", "lez", java.util.Arrays.asList( "lez" ), "Lezghian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Lezghian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Romanian */
    @javax.xml.bind.annotation.XmlEnumValue("ro")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Romanian" )
    Romanian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#efa7394e-caa7-3c70-b6a9-da13a77236b8", "efa7394e-caa7-3c70-b6a9-da13a77236b8", "ro", java.util.Arrays.asList( "ro", "ron", "rum" ), "Romanian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Romanian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Lozi */
    @javax.xml.bind.annotation.XmlEnumValue("loz")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Lozi" )
    Lozi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#23c28b01-9b15-3b11-a7c0-b2b8053b6528", "23c28b01-9b15-3b11-a7c0-b2b8053b6528", "loz", java.util.Arrays.asList( "loz" ), "Lozi", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Lozi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bambara */
    @javax.xml.bind.annotation.XmlEnumValue("bm")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bambara" )
    Bambara( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#832739b2-3245-3a7a-ba10-df7f9c7f6c50", "832739b2-3245-3a7a-ba10-df7f9c7f6c50", "bm", java.util.Arrays.asList( "bm", "bam" ), "Bambara", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bambara",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Manchu */
    @javax.xml.bind.annotation.XmlEnumValue("mnc")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Manchu" )
    Manchu( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#1d2b0124-4230-3560-85b9-71dd4fffdb6d", "1d2b0124-4230-3560-85b9-71dd4fffdb6d", "mnc", java.util.Arrays.asList( "mnc" ), "Manchu", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Manchu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Malayalam */
    @javax.xml.bind.annotation.XmlEnumValue("ml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Malayalam" )
    Malayalam( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#f9b5a275-bc45-3b62-ad13-e4a537f62a3b", "f9b5a275-bc45-3b62-ad13-e4a537f62a3b", "ml", java.util.Arrays.asList( "ml", "mal" ), "Malayalam", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Malayalam",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Panjabi */
    @javax.xml.bind.annotation.XmlEnumValue("pa")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Panjabi" )
    Panjabi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7d457c80-39e1-3cb4-9169-4c384f381684", "7d457c80-39e1-3cb4-9169-4c384f381684", "pa", java.util.Arrays.asList( "pa", "pan" ), "Panjabi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Panjabi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Karachay-Balkar */
    @javax.xml.bind.annotation.XmlEnumValue("krc")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/KarachayBalkar" )
    Karachay_Balkar( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#cde04ca5-5395-3d36-8b84-59bf9dea7a4b", "cde04ca5-5395-3d36-8b84-59bf9dea7a4b", "krc", java.util.Arrays.asList( "krc" ), "Karachay-Balkar", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/KarachayBalkar",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bengali */
    @javax.xml.bind.annotation.XmlEnumValue("bn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bengali" )
    Bengali( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#a56dcb84-43c2-3f8e-94b4-7b8ff1748331", "a56dcb84-43c2-3f8e-94b4-7b8ff1748331", "bn", java.util.Arrays.asList( "bn", "ben" ), "Bengali", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bengali",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Chinese */
    @javax.xml.bind.annotation.XmlEnumValue("zh")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chinese" )
    Chinese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#3b261136-e3c3-3f35-a0a5-8611b1f344cb", "3b261136-e3c3-3f35-a0a5-8611b1f344cb", "zh", java.util.Arrays.asList( "zh", "zho" ), "Chinese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chinese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Lingala */
    @javax.xml.bind.annotation.XmlEnumValue("ln")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Lingala" )
    Lingala( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#d341106c-434c-30c0-bc14-eedca7822975", "d341106c-434c-30c0-bc14-eedca7822975", "ln", java.util.Arrays.asList( "ln", "lin" ), "Lingala", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Lingala",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Mari */
    @javax.xml.bind.annotation.XmlEnumValue("chm")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mari" )
    Mari( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9a2df29a-402a-3c85-9313-eea7ede842f0", "9a2df29a-402a-3c85-9313-eea7ede842f0", "chm", java.util.Arrays.asList( "chm" ), "Mari", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mari",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Pampanga */
    @javax.xml.bind.annotation.XmlEnumValue("pam")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Pampanga" )
    Pampanga( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#5e8e3169-b69e-3a74-b01d-4bf58e2f6fdb", "5e8e3169-b69e-3a74-b01d-4bf58e2f6fdb", "pam", java.util.Arrays.asList( "pam" ), "Pampanga", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Pampanga",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kimbundu */
    @javax.xml.bind.annotation.XmlEnumValue("kmb")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kimbundu" )
    Kimbundu( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#05b82b72-53f8-3449-ba3d-b5aa8dd411ad", "05b82b72-53f8-3449-ba3d-b5aa8dd411ad", "kmb", java.util.Arrays.asList( "kmb" ), "Kimbundu", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kimbundu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Yao */
    @javax.xml.bind.annotation.XmlEnumValue("yao")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Yao" )
    Yao( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7e170de0-74e1-3303-88ae-c1364ac26c3d", "7e170de0-74e1-3303-88ae-c1364ac26c3d", "yao", java.util.Arrays.asList( "yao" ), "Yao", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Yao",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Armenian */
    @javax.xml.bind.annotation.XmlEnumValue("hy")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Armenian" )
    Armenian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#b397edd3-5777-39f6-8361-19e6ced96ff6", "b397edd3-5777-39f6-8361-19e6ced96ff6", "hy", java.util.Arrays.asList( "hy", "hye", "arm" ), "Armenian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Armenian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Maltese */
    @javax.xml.bind.annotation.XmlEnumValue("mt")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Maltese" )
    Maltese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#4d0c1117-e593-3084-8060-68a55ab227b9", "4d0c1117-e593-3084-8060-68a55ab227b9", "mt", java.util.Arrays.asList( "mt", "mlt" ), "Maltese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Maltese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Lower Sorbian */
    @javax.xml.bind.annotation.XmlEnumValue("dsb")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/LowerSorbian" )
    Lower_Sorbian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#72c13d96-4dd7-3240-8db4-09bf73b5ae31", "72c13d96-4dd7-3240-8db4-09bf73b5ae31", "dsb", java.util.Arrays.asList( "dsb" ), "Lower Sorbian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/LowerSorbian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* French */
    @javax.xml.bind.annotation.XmlEnumValue("fr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/French" )
    French( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ad225f70-7802-3a11-8c22-987186dd38e8", "ad225f70-7802-3a11-8c22-987186dd38e8", "fr", java.util.Arrays.asList( "fr", "fra", "fre" ), "French", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/French",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Rundi */
    @javax.xml.bind.annotation.XmlEnumValue("rn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Rundi" )
    Rundi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#899f2e4c-fae6-3e10-9ed8-2951bef7db4d", "899f2e4c-fae6-3e10-9ed8-2951bef7db4d", "rn", java.util.Arrays.asList( "rn", "run" ), "Rundi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Rundi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Lao */
    @javax.xml.bind.annotation.XmlEnumValue("lo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Lao" )
    Lao( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#d8fd56d3-ba06-32de-8f66-25bfb1b4ca7b", "d8fd56d3-ba06-32de-8f66-25bfb1b4ca7b", "lo", java.util.Arrays.asList( "lo", "lao" ), "Lao", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Lao",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kashmiri */
    @javax.xml.bind.annotation.XmlEnumValue("ks")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kashmiri" )
    Kashmiri( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#2fc10ff9-87c2-37fc-8fd5-f440dd8263ab", "2fc10ff9-87c2-37fc-8fd5-f440dd8263ab", "ks", java.util.Arrays.asList( "ks", "kas" ), "Kashmiri", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kashmiri",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Gilbertese */
    @javax.xml.bind.annotation.XmlEnumValue("gil")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Gilbertese" )
    Gilbertese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#6b2950aa-2371-35f5-b36a-c45b4a30386d", "6b2950aa-2371-35f5-b36a-c45b4a30386d", "gil", java.util.Arrays.asList( "gil" ), "Gilbertese", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Gilbertese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sukuma */
    @javax.xml.bind.annotation.XmlEnumValue("suk")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Sukuma" )
    Sukuma( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#51908bfa-f696-3928-8dac-176a8f4888c3", "51908bfa-f696-3928-8dac-176a8f4888c3", "suk", java.util.Arrays.asList( "suk" ), "Sukuma", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Sukuma",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bashkir */
    @javax.xml.bind.annotation.XmlEnumValue("ba")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bashkir" )
    Bashkir( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#634e2c69-edef-3f7a-8b28-7ffe57bffd2d", "634e2c69-edef-3f7a-8b28-7ffe57bffd2d", "ba", java.util.Arrays.asList( "ba", "bak" ), "Bashkir", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bashkir",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Gbaya */
    @javax.xml.bind.annotation.XmlEnumValue("gba")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Gbaya" )
    Gbaya( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#87f0be12-2246-30e4-8ecb-9aad71947f03", "87f0be12-2246-30e4-8ecb-9aad71947f03", "gba", java.util.Arrays.asList( "gba" ), "Gbaya", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Gbaya",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Twi */
    @javax.xml.bind.annotation.XmlEnumValue("tw")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Twi" )
    Twi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#90cf2eaa-63db-30b6-b96c-87dc3d4d7d75", "90cf2eaa-63db-30b6-b96c-87dc3d4d7d75", "tw", java.util.Arrays.asList( "tw", "twi" ), "Twi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Twi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Afar */
    @javax.xml.bind.annotation.XmlEnumValue("aa")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Afar" )
    Afar( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#eaf45172-e57f-392a-91df-c88f9808c540", "eaf45172-e57f-392a-91df-c88f9808c540", "aa", java.util.Arrays.asList( "aa", "aar" ), "Afar", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Afar",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Pohnpeian */
    @javax.xml.bind.annotation.XmlEnumValue("pon")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Pohnpeian" )
    Pohnpeian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#90c55216-9d9c-39f1-bc70-6ac79a8f0492", "90c55216-9d9c-39f1-bc70-6ac79a8f0492", "pon", java.util.Arrays.asList( "pon" ), "Pohnpeian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Pohnpeian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Zapotec */
    @javax.xml.bind.annotation.XmlEnumValue("zap")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Zapotec" )
    Zapotec( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#4c7e9af0-19b5-3987-b08b-8e0cff8605b4", "4c7e9af0-19b5-3987-b08b-8e0cff8605b4", "zap", java.util.Arrays.asList( "zap" ), "Zapotec", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Zapotec",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Romansh */
    @javax.xml.bind.annotation.XmlEnumValue("rm")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Romansh" )
    Romansh( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#88c2cd3e-cbb0-3b23-8456-ba8b33dfd266", "88c2cd3e-cbb0-3b23-8456-ba8b33dfd266", "rm", java.util.Arrays.asList( "rm", "roh" ), "Romansh", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Romansh",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Northern Sami */
    @javax.xml.bind.annotation.XmlEnumValue("se")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorthernSami" )
    Northern_Sami( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ae77afce-e143-3d32-8284-349b7b29c667", "ae77afce-e143-3d32-8284-349b7b29c667", "se", java.util.Arrays.asList( "se", "sme" ), "Northern Sami", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorthernSami",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Fulah */
    @javax.xml.bind.annotation.XmlEnumValue("ff")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Fulah" )
    Fulah( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#bef40fcd-0150-370c-bb04-179a42e04950", "bef40fcd-0150-370c-bb04-179a42e04950", "ff", java.util.Arrays.asList( "ff", "ful" ), "Fulah", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Fulah",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tamil */
    @javax.xml.bind.annotation.XmlEnumValue("ta")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tamil" )
    Tamil( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#f0670813-0209-39b3-9ff8-d85744b40400", "f0670813-0209-39b3-9ff8-d85744b40400", "ta", java.util.Arrays.asList( "ta", "tam" ), "Tamil", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tamil",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Danish */
    @javax.xml.bind.annotation.XmlEnumValue("da")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Danish" )
    Danish( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7bc6f150-ce73-3db3-921c-be0b75aea027", "7bc6f150-ce73-3db3-921c-be0b75aea027", "da", java.util.Arrays.asList( "da", "dan" ), "Danish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Danish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kutenai */
    @javax.xml.bind.annotation.XmlEnumValue("kut")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kutenai" )
    Kutenai( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9193f655-014a-36d0-89e9-e36dea948999", "9193f655-014a-36d0-89e9-e36dea948999", "kut", java.util.Arrays.asList( "kut" ), "Kutenai", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kutenai",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tereno */
    @javax.xml.bind.annotation.XmlEnumValue("ter")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tereno" )
    Tereno( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#a5c13b22-41c1-3805-bace-d0ffe9b2d70d", "a5c13b22-41c1-3805-bace-d0ffe9b2d70d", "ter", java.util.Arrays.asList( "ter" ), "Tereno", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tereno",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Nias */
    @javax.xml.bind.annotation.XmlEnumValue("nia")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Nias" )
    Nias( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#a67945d5-0c2a-32e4-ad5f-de4c8224401f", "a67945d5-0c2a-32e4-ad5f-de4c8224401f", "nia", java.util.Arrays.asList( "nia" ), "Nias", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Nias",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Turkmen */
    @javax.xml.bind.annotation.XmlEnumValue("tk")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Turkmen" )
    Turkmen( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#6f121192-9eb3-3a88-988a-f058eb7dbcfb", "6f121192-9eb3-3a88-988a-f058eb7dbcfb", "tk", java.util.Arrays.asList( "tk", "tuk" ), "Turkmen", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Turkmen",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kara-Kalpak */
    @javax.xml.bind.annotation.XmlEnumValue("kaa")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/KaraKalpak" )
    Kara_Kalpak( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#03d9c119-05e2-3fba-b71b-38cf27946803", "03d9c119-05e2-3fba-b71b-38cf27946803", "kaa", java.util.Arrays.asList( "kaa" ), "Kara-Kalpak", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/KaraKalpak",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ganda */
    @javax.xml.bind.annotation.XmlEnumValue("lg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ganda" )
    Ganda( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#5b69f163-a7ec-32ac-9588-80c49e555eeb", "5b69f163-a7ec-32ac-9588-80c49e555eeb", "lg", java.util.Arrays.asList( "lg", "lug" ), "Ganda", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ganda",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Zuni */
    @javax.xml.bind.annotation.XmlEnumValue("zun")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Zuni" )
    Zuni( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#94a9408b-446f-3827-93d5-bf40d4a8c311", "94a9408b-446f-3827-93d5-bf40d4a8c311", "zun", java.util.Arrays.asList( "zun" ), "Zuni", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Zuni",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Friulian */
    @javax.xml.bind.annotation.XmlEnumValue("fur")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Friulian" )
    Friulian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#0a35eab4-c118-371d-b790-62cf92cb4f5e", "0a35eab4-c118-371d-b790-62cf92cb4f5e", "fur", java.util.Arrays.asList( "fur" ), "Friulian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Friulian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Dogrib */
    @javax.xml.bind.annotation.XmlEnumValue("dgr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Dogrib" )
    Dogrib( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#91dd476a-be3d-35f4-b4c4-65116bdfb563", "91dd476a-be3d-35f4-b4c4-65116bdfb563", "dgr", java.util.Arrays.asList( "dgr" ), "Dogrib", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Dogrib",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Awadhi */
    @javax.xml.bind.annotation.XmlEnumValue("awa")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Awadhi" )
    Awadhi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#b94ea6bd-af33-3eba-85e8-96cbf7ba6f1f", "b94ea6bd-af33-3eba-85e8-96cbf7ba6f1f", "awa", java.util.Arrays.asList( "awa" ), "Awadhi", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Awadhi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Spanish */
    @javax.xml.bind.annotation.XmlEnumValue("es")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Spanish" )
    Spanish( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#cb5480c3-2e71-3788-92b0-8ae1e8712775", "cb5480c3-2e71-3788-92b0-8ae1e8712775", "es", java.util.Arrays.asList( "es", "spa" ), "Spanish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Spanish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ojibwa */
    @javax.xml.bind.annotation.XmlEnumValue("oj")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ojibwa" )
    Ojibwa( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#cdfac88a-fad6-3244-b5a4-d6d3ff80e434", "cdfac88a-fad6-3244-b5a4-d6d3ff80e434", "oj", java.util.Arrays.asList( "oj", "oji" ), "Ojibwa", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ojibwa",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Catalan */
    @javax.xml.bind.annotation.XmlEnumValue("ca")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Catalan" )
    Catalan( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#900a14b1-1561-3d9d-8d1c-47f1d3a3251b", "900a14b1-1561-3d9d-8d1c-47f1d3a3251b", "ca", java.util.Arrays.asList( "ca", "cat" ), "Catalan", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Catalan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Turkish */
    @javax.xml.bind.annotation.XmlEnumValue("tr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Turkish" )
    Turkish( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c1612bbd-ebfa-3546-be8a-b814e08daff1", "c1612bbd-ebfa-3546-be8a-b814e08daff1", "tr", java.util.Arrays.asList( "tr", "tur" ), "Turkish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Turkish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Zenaga */
    @javax.xml.bind.annotation.XmlEnumValue("zen")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Zenaga" )
    Zenaga( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#b1b1627b-b4ca-3217-af47-02b3c09006ce", "b1b1627b-b4ca-3217-af47-02b3c09006ce", "zen", java.util.Arrays.asList( "zen" ), "Zenaga", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Zenaga",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Lunda */
    @javax.xml.bind.annotation.XmlEnumValue("lun")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Lunda" )
    Lunda( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#e91a0a21-acff-3ada-99aa-1e3876281a8c", "e91a0a21-acff-3ada-99aa-1e3876281a8c", "lun", java.util.Arrays.asList( "lun" ), "Lunda", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Lunda",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Acoli */
    @javax.xml.bind.annotation.XmlEnumValue("ach")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Acoli" )
    Acoli( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#fdc6833f-5291-3528-8315-17300c97cd34", "fdc6833f-5291-3528-8315-17300c97cd34", "ach", java.util.Arrays.asList( "ach" ), "Acoli", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Acoli",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Dogri */
    @javax.xml.bind.annotation.XmlEnumValue("doi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Dogri" )
    Dogri( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#292ed8cd-4b5a-304c-b9a1-cec82e51bf0c", "292ed8cd-4b5a-304c-b9a1-cec82e51bf0c", "doi", java.util.Arrays.asList( "doi" ), "Dogri", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Dogri",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Cebuano */
    @javax.xml.bind.annotation.XmlEnumValue("ceb")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Cebuano" )
    Cebuano( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#5834ac15-d37a-37d4-8a51-83fd5d5020ab", "5834ac15-d37a-37d4-8a51-83fd5d5020ab", "ceb", java.util.Arrays.asList( "ceb" ), "Cebuano", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Cebuano",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Palauan */
    @javax.xml.bind.annotation.XmlEnumValue("pau")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Palauan" )
    Palauan( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ace80eb2-dcdd-3632-a082-de5d6499798f", "ace80eb2-dcdd-3632-a082-de5d6499798f", "pau", java.util.Arrays.asList( "pau" ), "Palauan", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Palauan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Western Frisian */
    @javax.xml.bind.annotation.XmlEnumValue("fy")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/WesternFrisian" )
    Western_Frisian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ad19bb17-f84d-3802-9805-c2287995a294", "ad19bb17-f84d-3802-9805-c2287995a294", "fy", java.util.Arrays.asList( "fy", "fry" ), "Western Frisian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/WesternFrisian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Hindi */
    @javax.xml.bind.annotation.XmlEnumValue("hi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hindi" )
    Hindi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#45c3171e-f193-374b-802f-407fba9d955b", "45c3171e-f193-374b-802f-407fba9d955b", "hi", java.util.Arrays.asList( "hi", "hin" ), "Hindi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Hindi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Igbo */
    @javax.xml.bind.annotation.XmlEnumValue("ig")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Igbo" )
    Igbo( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c555b579-aa26-3e92-9bdf-0fed7f7638ee", "c555b579-aa26-3e92-9bdf-0fed7f7638ee", "ig", java.util.Arrays.asList( "ig", "ibo" ), "Igbo", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Igbo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Belarusian */
    @javax.xml.bind.annotation.XmlEnumValue("be")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Belarusian" )
    Belarusian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#0a6de446-0095-3398-a8a4-5ed512a7538f", "0a6de446-0095-3398-a8a4-5ed512a7538f", "be", java.util.Arrays.asList( "be", "bel" ), "Belarusian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Belarusian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Waray */
    @javax.xml.bind.annotation.XmlEnumValue("war")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Waray" )
    Waray( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#53c30045-ab83-32a2-843d-4cede29d1601", "53c30045-ab83-32a2-843d-4cede29d1601", "war", java.util.Arrays.asList( "war" ), "Waray", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Waray",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ainu */
    @javax.xml.bind.annotation.XmlEnumValue("ain")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Ainu" )
    Ainu( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9895b527-2dfd-3ee6-a559-1229945554da", "9895b527-2dfd-3ee6-a559-1229945554da", "ain", java.util.Arrays.asList( "ain" ), "Ainu", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Ainu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Choctaw */
    @javax.xml.bind.annotation.XmlEnumValue("cho")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Choctaw" )
    Choctaw( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#dc0a7b82-bde1-3bc9-993e-b3b6f9f7dea1", "dc0a7b82-bde1-3bc9-993e-b3b6f9f7dea1", "cho", java.util.Arrays.asList( "cho" ), "Choctaw", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Choctaw",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Yapese */
    @javax.xml.bind.annotation.XmlEnumValue("yap")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Yapese" )
    Yapese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#08b53fac-3c6d-3649-899b-9f8ce735cc8b", "08b53fac-3c6d-3649-899b-9f8ce735cc8b", "yap", java.util.Arrays.asList( "yap" ), "Yapese", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Yapese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Avaric */
    @javax.xml.bind.annotation.XmlEnumValue("av")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Avaric" )
    Avaric( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#77505e62-bcfa-3776-aa18-81c8cdde2d2c", "77505e62-bcfa-3776-aa18-81c8cdde2d2c", "av", java.util.Arrays.asList( "av", "ava" ), "Avaric", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Avaric",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Wolaitta */
    @javax.xml.bind.annotation.XmlEnumValue("wal")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Wolaitta" )
    Wolaitta( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#e7788594-fb48-3a63-ab64-5e30cc33468c", "e7788594-fb48-3a63-ab64-5e30cc33468c", "wal", java.util.Arrays.asList( "wal" ), "Wolaitta", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Wolaitta",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Chinook jargon */
    @javax.xml.bind.annotation.XmlEnumValue("chn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/ChinookJargon" )
    Chinook_Jargon( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#09c6d777-5f82-3533-a20d-089fc4288341", "09c6d777-5f82-3533-a20d-089fc4288341", "chn", java.util.Arrays.asList( "chn" ), "Chinook jargon", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/ChinookJargon",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Achinese */
    @javax.xml.bind.annotation.XmlEnumValue("ace")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Achinese" )
    Achinese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#0f69a0b1-539b-3b56-9d2d-90977a680c0f", "0f69a0b1-539b-3b56-9d2d-90977a680c0f", "ace", java.util.Arrays.asList( "ace" ), "Achinese", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Achinese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Maori */
    @javax.xml.bind.annotation.XmlEnumValue("mi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Maori" )
    Maori( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9c751c71-1ebc-3775-a46f-80308ef4d56e", "9c751c71-1ebc-3775-a46f-80308ef4d56e", "mi", java.util.Arrays.asList( "mi", "mri", "mao" ), "Maori", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Maori",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bislama */
    @javax.xml.bind.annotation.XmlEnumValue("bi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bislama" )
    Bislama( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ad5b3d93-8c9d-30ed-b3c8-02be17c40e4e", "ad5b3d93-8c9d-30ed-b3c8-02be17c40e4e", "bi", java.util.Arrays.asList( "bi", "bis" ), "Bislama", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bislama",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Persian */
    @javax.xml.bind.annotation.XmlEnumValue("fa")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Persian" )
    Persian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#8032c149-d0e4-3ad3-8ef6-b60289f910cd", "8032c149-d0e4-3ad3-8ef6-b60289f910cd", "fa", java.util.Arrays.asList( "fa", "fas", "per" ), "Persian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Persian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Luxembourgish */
    @javax.xml.bind.annotation.XmlEnumValue("lb")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Luxembourgish" )
    Luxembourgish( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c0b9b1fd-f1a2-3bf3-8ba8-467790496b0e", "c0b9b1fd-f1a2-3bf3-8ba8-467790496b0e", "lb", java.util.Arrays.asList( "lb", "ltz" ), "Luxembourgish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Luxembourgish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Czech */
    @javax.xml.bind.annotation.XmlEnumValue("cs")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Czech" )
    Czech( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#83ff4480-cdf2-300a-a83b-f30d95774d76", "83ff4480-cdf2-300a-a83b-f30d95774d76", "cs", java.util.Arrays.asList( "cs", "ces", "cze" ), "Czech", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Czech",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Mongo */
    @javax.xml.bind.annotation.XmlEnumValue("lol")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mongo" )
    Mongo( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#df40477e-9a75-356e-9534-00041634f94b", "df40477e-9a75-356e-9534-00041634f94b", "lol", java.util.Arrays.asList( "lol" ), "Mongo", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mongo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tajik */
    @javax.xml.bind.annotation.XmlEnumValue("tg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tajik" )
    Tajik( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#944c84bf-afb0-31ea-bf35-7c4f23cddf53", "944c84bf-afb0-31ea-bf35-7c4f23cddf53", "tg", java.util.Arrays.asList( "tg", "tgk" ), "Tajik", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tajik",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kurukh */
    @javax.xml.bind.annotation.XmlEnumValue("kru")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kurukh" )
    Kurukh( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#dc371a09-b0d0-3220-8ba5-5dd4cf6a55aa", "dc371a09-b0d0-3220-8ba5-5dd4cf6a55aa", "kru", java.util.Arrays.asList( "kru" ), "Kurukh", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kurukh",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Minangkabau */
    @javax.xml.bind.annotation.XmlEnumValue("min")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Minangkabau" )
    Minangkabau( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#a35e9001-239f-3044-be77-a8a9a12ffe30", "a35e9001-239f-3044-be77-a8a9a12ffe30", "min", java.util.Arrays.asList( "min" ), "Minangkabau", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Minangkabau",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Judeo-Persian */
    @javax.xml.bind.annotation.XmlEnumValue("jpr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/JudeoPersian" )
    Judeo_Persian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#0ec53fcf-4921-3bd0-a8fb-976fa07ed7f6", "0ec53fcf-4921-3bd0-a8fb-976fa07ed7f6", "jpr", java.util.Arrays.asList( "jpr" ), "Judeo-Persian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/JudeoPersian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sardinian */
    @javax.xml.bind.annotation.XmlEnumValue("sc")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sardinian" )
    Sardinian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#0fa80b68-9964-3cb8-8c0c-a1ac09197c8c", "0fa80b68-9964-3cb8-8c0c-a1ac09197c8c", "sc", java.util.Arrays.asList( "sc", "srd" ), "Sardinian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sardinian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Chamorro */
    @javax.xml.bind.annotation.XmlEnumValue("ch")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chamorro" )
    Chamorro( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#bc01ab16-66e2-3f8a-aeb7-88936e012802", "bc01ab16-66e2-3f8a-aeb7-88936e012802", "ch", java.util.Arrays.asList( "ch", "cha" ), "Chamorro", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chamorro",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* English */
    @javax.xml.bind.annotation.XmlEnumValue("en")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/English" )
    English( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#78463a38-4a5a-34fa-95fa-73e2f506ecfc", "78463a38-4a5a-34fa-95fa-73e2f506ecfc", "en", java.util.Arrays.asList( "en", "eng" ), "English", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/English",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Susu */
    @javax.xml.bind.annotation.XmlEnumValue("sus")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Susu" )
    Susu( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#07715e2d-6225-38cd-96c6-c4a6fb200537", "07715e2d-6225-38cd-96c6-c4a6fb200537", "sus", java.util.Arrays.asList( "sus" ), "Susu", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Susu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Luba-Katanga */
    @javax.xml.bind.annotation.XmlEnumValue("lu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/LubaKatanga" )
    Luba_Katanga( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#8dd9c99a-29d0-3ba7-8b56-829a39b2a798", "8dd9c99a-29d0-3ba7-8b56-829a39b2a798", "lu", java.util.Arrays.asList( "lu", "lub" ), "Luba-Katanga", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/LubaKatanga",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Eastern Frisian */
    @javax.xml.bind.annotation.XmlEnumValue("frs")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/EasternFrisian" )
    Eastern_Frisian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#4e4cb48f-8f12-3c09-bc3a-958030518ce4", "4e4cb48f-8f12-3c09-bc3a-958030518ce4", "frs", java.util.Arrays.asList( "frs" ), "Eastern Frisian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/EasternFrisian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ladino */
    @javax.xml.bind.annotation.XmlEnumValue("lad")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Ladino" )
    Ladino( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#e0489ac0-d56c-36e4-8543-6ffa5e62f1c4", "e0489ac0-d56c-36e4-8543-6ffa5e62f1c4", "lad", java.util.Arrays.asList( "lad" ), "Ladino", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Ladino",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Nyankole */
    @javax.xml.bind.annotation.XmlEnumValue("nyn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Nyankole" )
    Nyankole( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#f4ce4e5b-83fd-35bd-8cdd-e65c44d4477e", "f4ce4e5b-83fd-35bd-8cdd-e65c44d4477e", "nyn", java.util.Arrays.asList( "nyn" ), "Nyankole", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Nyankole",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Guarani */
    @javax.xml.bind.annotation.XmlEnumValue("gn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Guarani" )
    Guarani( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ee343287-6af4-38b8-8741-fdc6d3b99845", "ee343287-6af4-38b8-8741-fdc6d3b99845", "gn", java.util.Arrays.asList( "gn", "grn" ), "Guarani", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Guarani",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tonga Nyasa */
    @javax.xml.bind.annotation.XmlEnumValue("tog")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/TongaNyasa" )
    Tonga_Nyasa( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#a5a90461-c3df-3da8-b261-b46df59a3f4a", "a5a90461-c3df-3da8-b261-b46df59a3f4a", "tog", java.util.Arrays.asList( "tog" ), "Tonga Nyasa", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/TongaNyasa",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Afrikaans */
    @javax.xml.bind.annotation.XmlEnumValue("af")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Afrikaans" )
    Afrikaans( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#170d296d-4201-3e1a-b7a8-867e9b0ca3a7", "170d296d-4201-3e1a-b7a8-867e9b0ca3a7", "af", java.util.Arrays.asList( "af", "afr" ), "Afrikaans", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Afrikaans",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Scots */
    @javax.xml.bind.annotation.XmlEnumValue("sco")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Scots" )
    Scots( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#6a4a43a9-a929-34ec-b396-57304bebe783", "6a4a43a9-a929-34ec-b396-57304bebe783", "sco", java.util.Arrays.asList( "sco" ), "Scots", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Scots",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Albanian */
    @javax.xml.bind.annotation.XmlEnumValue("sq")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Albanian" )
    Albanian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#a716b6a3-e8cf-3994-965d-64d712db61d8", "a716b6a3-e8cf-3994-965d-64d712db61d8", "sq", java.util.Arrays.asList( "sq", "alb", "sqi" ), "Albanian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Albanian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Hiligaynon */
    @javax.xml.bind.annotation.XmlEnumValue("hil")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Hiligaynon" )
    Hiligaynon( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#663293bb-741f-33fd-a4a3-e63d58fb2166", "663293bb-741f-33fd-a4a3-e63d58fb2166", "hil", java.util.Arrays.asList( "hil" ), "Hiligaynon", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Hiligaynon",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sidamo */
    @javax.xml.bind.annotation.XmlEnumValue("sid")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Sidamo" )
    Sidamo( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#fcb0ed7f-52e3-3edf-b18b-3bdc2acf2d11", "fcb0ed7f-52e3-3edf-b18b-3bdc2acf2d11", "sid", java.util.Arrays.asList( "sid" ), "Sidamo", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Sidamo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Montenegrin */
    @javax.xml.bind.annotation.XmlEnumValue("cnr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Montenegrin" )
    Montenegrin( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#6fddaf6c-61d1-3912-9137-606c664b8422", "6fddaf6c-61d1-3912-9137-606c664b8422", "cnr", java.util.Arrays.asList( "cnr" ), "Montenegrin", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Montenegrin",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Irish */
    @javax.xml.bind.annotation.XmlEnumValue("ga")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Irish" )
    Irish( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#2cfce796-f470-3d56-8ae1-c3a1b3fb7e74", "2cfce796-f470-3d56-8ae1-c3a1b3fb7e74", "ga", java.util.Arrays.asList( "ga", "gle" ), "Irish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Irish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Iban */
    @javax.xml.bind.annotation.XmlEnumValue("iba")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Iban" )
    Iban( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#b3abe0fc-9c65-3748-9f3e-468fac4f342b", "b3abe0fc-9c65-3748-9f3e-468fac4f342b", "iba", java.util.Arrays.asList( "iba" ), "Iban", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Iban",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Limburgan */
    @javax.xml.bind.annotation.XmlEnumValue("li")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Limburgan" )
    Limburgan( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#0678e3d2-2a54-3393-aec7-9daed3fb13e7", "0678e3d2-2a54-3393-aec7-9daed3fb13e7", "li", java.util.Arrays.asList( "li", "lim" ), "Limburgan", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Limburgan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Beja */
    @javax.xml.bind.annotation.XmlEnumValue("bej")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Beja" )
    Beja( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#b4dde8b6-631b-367d-a8b1-a5fd7d68dd7b", "b4dde8b6-631b-367d-a8b1-a5fd7d68dd7b", "bej", java.util.Arrays.asList( "bej" ), "Beja", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Beja",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Assamese */
    @javax.xml.bind.annotation.XmlEnumValue("as")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Assamese" )
    Assamese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7e832a22-3637-3b3a-85e0-30c551d90bab", "7e832a22-3637-3b3a-85e0-30c551d90bab", "as", java.util.Arrays.asList( "as", "asm" ), "Assamese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Assamese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Swiss German */
    @javax.xml.bind.annotation.XmlEnumValue("gsw")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/SwissGerman" )
    Swiss_German( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#3bcead55-a401-3d62-9be4-9e956130059e", "3bcead55-a401-3d62-9be4-9e956130059e", "gsw", java.util.Arrays.asList( "gsw" ), "Swiss German", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/SwissGerman",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Hiri Motu */
    @javax.xml.bind.annotation.XmlEnumValue("ho")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/HiriMotu" )
    Hiri_Motu( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#a534fa6e-0896-332e-ba62-f3002b731576", "a534fa6e-0896-332e-ba62-f3002b731576", "ho", java.util.Arrays.asList( "ho", "hmo" ), "Hiri Motu", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/HiriMotu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Fon */
    @javax.xml.bind.annotation.XmlEnumValue("fon")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Fon" )
    Fon( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#22586c06-e154-314f-a0b6-b9c9df98923c", "22586c06-e154-314f-a0b6-b9c9df98923c", "fon", java.util.Arrays.asList( "fon" ), "Fon", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Fon",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Samoan */
    @javax.xml.bind.annotation.XmlEnumValue("sm")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Samoan" )
    Samoan( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#5063c787-3b7d-3f9f-bbfd-89fe217bf2b5", "5063c787-3b7d-3f9f-bbfd-89fe217bf2b5", "sm", java.util.Arrays.asList( "sm", "smo" ), "Samoan", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Samoan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Marathi */
    @javax.xml.bind.annotation.XmlEnumValue("mr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Marathi" )
    Marathi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#529b1c6e-afff-3f34-bcda-64708f72586d", "529b1c6e-afff-3f34-bcda-64708f72586d", "mr", java.util.Arrays.asList( "mr", "mar" ), "Marathi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Marathi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Votic */
    @javax.xml.bind.annotation.XmlEnumValue("vot")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Votic" )
    Votic( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#fa174b82-29dc-3d57-a5fc-2979dc65cde9", "fa174b82-29dc-3d57-a5fc-2979dc65cde9", "vot", java.util.Arrays.asList( "vot" ), "Votic", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Votic",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* N&#39;Ko */
    @javax.xml.bind.annotation.XmlEnumValue("nqo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/NKo" )
    N_Ko( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#5d81f8e2-096c-39cd-ac2a-83a1166f29ad", "5d81f8e2-096c-39cd-ac2a-83a1166f29ad", "nqo", java.util.Arrays.asList( "nqo" ), "N&#39;Ko", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/NKo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Udmurt */
    @javax.xml.bind.annotation.XmlEnumValue("udm")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Udmurt" )
    Udmurt( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#b4e8d4a3-a651-3e37-9e19-5aeb19806d28", "b4e8d4a3-a651-3e37-9e19-5aeb19806d28", "udm", java.util.Arrays.asList( "udm" ), "Udmurt", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Udmurt",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Dutch */
    @javax.xml.bind.annotation.XmlEnumValue("nl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Dutch" )
    Dutch( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#68bf367e-228f-35ba-83cb-8831a5ee6447", "68bf367e-228f-35ba-83cb-8831a5ee6447", "nl", java.util.Arrays.asList( "nl", "dut", "nld" ), "Dutch", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Dutch",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tatar */
    @javax.xml.bind.annotation.XmlEnumValue("tt")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tatar" )
    Tatar( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#4c86bbde-578e-3648-ba0b-12aea66fc5f6", "4c86bbde-578e-3648-ba0b-12aea66fc5f6", "tt", java.util.Arrays.asList( "tt", "tat" ), "Tatar", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tatar",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sandawe */
    @javax.xml.bind.annotation.XmlEnumValue("sad")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Sandawe" )
    Sandawe( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#8ef45181-3a59-35a7-8979-0cbbf8988ecb", "8ef45181-3a59-35a7-8979-0cbbf8988ecb", "sad", java.util.Arrays.asList( "sad" ), "Sandawe", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Sandawe",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Vai */
    @javax.xml.bind.annotation.XmlEnumValue("vai")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Vai" )
    Vai( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#daf357a2-5d1a-3ecd-a06f-3e3dc505f4c2", "daf357a2-5d1a-3ecd-a06f-3e3dc505f4c2", "vai", java.util.Arrays.asList( "vai" ), "Vai", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Vai",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Yakut */
    @javax.xml.bind.annotation.XmlEnumValue("sah")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Yakut" )
    Yakut( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#2e897917-1b94-3f04-83db-bbf92b3132c1", "2e897917-1b94-3f04-83db-bbf92b3132c1", "sah", java.util.Arrays.asList( "sah" ), "Yakut", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Yakut",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Dakota */
    @javax.xml.bind.annotation.XmlEnumValue("dak")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Dakota" )
    Dakota( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#a77705ea-323f-3bc7-9f54-692354ed7d34", "a77705ea-323f-3bc7-9f54-692354ed7d34", "dak", java.util.Arrays.asList( "dak" ), "Dakota", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Dakota",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Mongolian */
    @javax.xml.bind.annotation.XmlEnumValue("mn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Mongolian" )
    Mongolian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#28c84f05-dbc5-31ff-a522-20ce03b16356", "28c84f05-dbc5-31ff-a522-20ce03b16356", "mn", java.util.Arrays.asList( "mn", "mon" ), "Mongolian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Mongolian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Siksika */
    @javax.xml.bind.annotation.XmlEnumValue("bla")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Siksika" )
    Siksika( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#690fbad1-3911-3251-8cc1-e6862f63a0db", "690fbad1-3911-3251-8cc1-e6862f63a0db", "bla", java.util.Arrays.asList( "bla" ), "Siksika", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Siksika",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Chuvash */
    @javax.xml.bind.annotation.XmlEnumValue("cv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chuvash" )
    Chuvash( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#1dee6da6-3717-39cb-bb22-5d8b871dfa89", "1dee6da6-3717-39cb-bb22-5d8b871dfa89", "cv", java.util.Arrays.asList( "cv", "chv" ), "Chuvash", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chuvash",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* North Ndebele */
    @javax.xml.bind.annotation.XmlEnumValue("nd")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorthNdebele" )
    North_Ndebele( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#63b888f9-df44-3551-a414-1c90a47585da", "63b888f9-df44-3551-a414-1c90a47585da", "nd", java.util.Arrays.asList( "nd", "nde" ), "North Ndebele", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorthNdebele",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Magahi */
    @javax.xml.bind.annotation.XmlEnumValue("mag")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Magahi" )
    Magahi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#bf9420be-f780-33cf-ae9a-b6ed3f67ada9", "bf9420be-f780-33cf-ae9a-b6ed3f67ada9", "mag", java.util.Arrays.asList( "mag" ), "Magahi", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Magahi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Japanese */
    @javax.xml.bind.annotation.XmlEnumValue("ja")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Japanese" )
    Japanese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#f32ced6a-9ba1-34c4-b3c0-47fd1d7c882e", "f32ced6a-9ba1-34c4-b3c0-47fd1d7c882e", "ja", java.util.Arrays.asList( "ja", "jpn" ), "Japanese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Japanese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Baluchi */
    @javax.xml.bind.annotation.XmlEnumValue("bal")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Baluchi" )
    Baluchi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7935d8b5-cfc9-3f94-8d6a-de801ebe5792", "7935d8b5-cfc9-3f94-8d6a-de801ebe5792", "bal", java.util.Arrays.asList( "bal" ), "Baluchi", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Baluchi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Gorontalo */
    @javax.xml.bind.annotation.XmlEnumValue("gor")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Gorontalo" )
    Gorontalo( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#6f59215f-7331-3d5f-bca0-78d041e0baab", "6f59215f-7331-3d5f-bca0-78d041e0baab", "gor", java.util.Arrays.asList( "gor" ), "Gorontalo", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Gorontalo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Lule Sami */
    @javax.xml.bind.annotation.XmlEnumValue("smj")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/LuleSami" )
    Lule_Sami( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#cee88b4f-3e09-3bec-a6fe-44d197327b75", "cee88b4f-3e09-3bec-a6fe-44d197327b75", "smj", java.util.Arrays.asList( "smj" ), "Lule Sami", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/LuleSami",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Cheyenne */
    @javax.xml.bind.annotation.XmlEnumValue("chy")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Cheyenne" )
    Cheyenne( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#266cec9f-4185-3f26-8f14-7d7e4e37d0a0", "266cec9f-4185-3f26-8f14-7d7e4e37d0a0", "chy", java.util.Arrays.asList( "chy" ), "Cheyenne", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Cheyenne",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Serer */
    @javax.xml.bind.annotation.XmlEnumValue("srr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Serer" )
    Serer( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#fa3ade61-99bc-3b7d-a6ac-7f87f9bd5c54", "fa3ade61-99bc-3b7d-a6ac-7f87f9bd5c54", "srr", java.util.Arrays.asList( "srr" ), "Serer", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Serer",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Gondi */
    @javax.xml.bind.annotation.XmlEnumValue("gon")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Gondi" )
    Gondi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7785fe03-682b-30e4-a6c4-456136ebcdd3", "7785fe03-682b-30e4-a6c4-456136ebcdd3", "gon", java.util.Arrays.asList( "gon" ), "Gondi", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Gondi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sango */
    @javax.xml.bind.annotation.XmlEnumValue("sg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sango" )
    Sango( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#2be98262-9367-3eef-af84-2a2f59cfd07a", "2be98262-9367-3eef-af84-2a2f59cfd07a", "sg", java.util.Arrays.asList( "sg", "sag" ), "Sango", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sango",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Adyghe */
    @javax.xml.bind.annotation.XmlEnumValue("ady")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Adyghe" )
    Adyghe( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#6ae8786b-6502-3bd1-92a8-adcf0ff8db05", "6ae8786b-6502-3bd1-92a8-adcf0ff8db05", "ady", java.util.Arrays.asList( "ady" ), "Adyghe", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Adyghe",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Chipewyan */
    @javax.xml.bind.annotation.XmlEnumValue("chp")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Chipewyan" )
    Chipewyan( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#117b5707-eb70-3b7d-85cb-ed69088be180", "117b5707-eb70-3b7d-85cb-ed69088be180", "chp", java.util.Arrays.asList( "chp" ), "Chipewyan", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Chipewyan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sichuan Yi */
    @javax.xml.bind.annotation.XmlEnumValue("ii")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/SichuanYi" )
    Sichuan_Yi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7e43fb09-6b07-36de-bf46-39c03b0e1055", "7e43fb09-6b07-36de-bf46-39c03b0e1055", "ii", java.util.Arrays.asList( "ii", "iii" ), "Sichuan Yi", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/SichuanYi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Mandar */
    @javax.xml.bind.annotation.XmlEnumValue("mdr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mandar" )
    Mandar( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c1fb0de8-c56b-352d-81d9-259e6cd63ff1", "c1fb0de8-c56b-352d-81d9-259e6cd63ff1", "mdr", java.util.Arrays.asList( "mdr" ), "Mandar", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mandar",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tok Pisin */
    @javax.xml.bind.annotation.XmlEnumValue("tpi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/TokPisin" )
    Tok_Pisin( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c30acd46-a6e8-3533-989f-7230fbb6b5e3", "c30acd46-a6e8-3533-989f-7230fbb6b5e3", "tpi", java.util.Arrays.asList( "tpi" ), "Tok Pisin", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/TokPisin",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Marshallese */
    @javax.xml.bind.annotation.XmlEnumValue("mh")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Marshallese" )
    Marshallese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#d6c55299-c38c-32e6-ad6a-2e41c1288010", "d6c55299-c38c-32e6-ad6a-2e41c1288010", "mh", java.util.Arrays.asList( "mh", "mah" ), "Marshallese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Marshallese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Luba-Lulua */
    @javax.xml.bind.annotation.XmlEnumValue("lua")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/LubaLulua" )
    Luba_Lulua( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#604ba7ef-2130-36be-9ab9-0f9f93f04542", "604ba7ef-2130-36be-9ab9-0f9f93f04542", "lua", java.util.Arrays.asList( "lua" ), "Luba-Lulua", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/LubaLulua",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Rajasthani */
    @javax.xml.bind.annotation.XmlEnumValue("raj")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Rajasthani" )
    Rajasthani( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#d6e2f38d-52b9-3b38-a9c4-f8c158faf1f8", "d6e2f38d-52b9-3b38-a9c4-f8c158faf1f8", "raj", java.util.Arrays.asList( "raj" ), "Rajasthani", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Rajasthani",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Basa */
    @javax.xml.bind.annotation.XmlEnumValue("bas")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Basa" )
    Basa( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#a0b7379f-a13a-366b-b9d1-3ae7ff770c37", "a0b7379f-a13a-366b-b9d1-3ae7ff770c37", "bas", java.util.Arrays.asList( "bas" ), "Basa", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Basa",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Grebo */
    @javax.xml.bind.annotation.XmlEnumValue("grb")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Grebo" )
    Grebo( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#4707a0c4-6bf9-3c35-afdf-d339f5ec2daf", "4707a0c4-6bf9-3c35-afdf-d339f5ec2daf", "grb", java.util.Arrays.asList( "grb" ), "Grebo", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Grebo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Central Khmer */
    @javax.xml.bind.annotation.XmlEnumValue("km")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/CentralKhmer" )
    Central_Khmer( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c20f3bf7-2447-3405-b0a7-2acac97a108c", "c20f3bf7-2447-3405-b0a7-2acac97a108c", "km", java.util.Arrays.asList( "km", "khm" ), "Central Khmer", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/CentralKhmer",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Wolof */
    @javax.xml.bind.annotation.XmlEnumValue("wo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Wolof" )
    Wolof( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#410d89e3-c364-3c63-b2d7-412d2d46ef69", "410d89e3-c364-3c63-b2d7-412d2d46ef69", "wo", java.util.Arrays.asList( "wo", "wol" ), "Wolof", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Wolof",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Shona */
    @javax.xml.bind.annotation.XmlEnumValue("sn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Shona" )
    Shona( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#6cd16662-5486-34fb-a621-f46c01701334", "6cd16662-5486-34fb-a621-f46c01701334", "sn", java.util.Arrays.asList( "sn", "sna" ), "Shona", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Shona",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Angika */
    @javax.xml.bind.annotation.XmlEnumValue("anp")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Angika" )
    Angika( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9eb66d98-8651-31ee-9b6d-6ec6320b20ce", "9eb66d98-8651-31ee-9b6d-6ec6320b20ce", "anp", java.util.Arrays.asList( "anp" ), "Angika", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Angika",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Crimean Tatar */
    @javax.xml.bind.annotation.XmlEnumValue("crh")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/CrimeanTatar" )
    Crimean_Tatar( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#01568fb6-905c-3b5f-97fe-b052a529d104", "01568fb6-905c-3b5f-97fe-b052a529d104", "crh", java.util.Arrays.asList( "crh" ), "Crimean Tatar", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/CrimeanTatar",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Nepali */
    @javax.xml.bind.annotation.XmlEnumValue("ne")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Nepali" )
    Nepali( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#2f53f077-d396-32f0-b325-d5eabfc8798b", "2f53f077-d396-32f0-b325-d5eabfc8798b", "ne", java.util.Arrays.asList( "ne", "nep" ), "Nepali", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Nepali",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Lithuanian */
    @javax.xml.bind.annotation.XmlEnumValue("lt")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Lithuanian" )
    Lithuanian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#04f60583-6f66-3d87-9bf3-fb2b3643d16b", "04f60583-6f66-3d87-9bf3-fb2b3643d16b", "lt", java.util.Arrays.asList( "lt", "lit" ), "Lithuanian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Lithuanian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Swedish */
    @javax.xml.bind.annotation.XmlEnumValue("sv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Swedish" )
    Swedish( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#41171a0f-cd36-3ce9-8b5f-0f11398713b6", "41171a0f-cd36-3ce9-8b5f-0f11398713b6", "sv", java.util.Arrays.asList( "sv", "swe" ), "Swedish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Swedish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tlingit */
    @javax.xml.bind.annotation.XmlEnumValue("tli")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tlingit" )
    Tlingit( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#66694844-2836-31d0-84b0-053506cc1ca5", "66694844-2836-31d0-84b0-053506cc1ca5", "tli", java.util.Arrays.asList( "tli" ), "Tlingit", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tlingit",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Azerbaijani */
    @javax.xml.bind.annotation.XmlEnumValue("az")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Azerbaijani" )
    Azerbaijani( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9f3356b2-7d0a-36cb-9f0c-eea9e80a6e72", "9f3356b2-7d0a-36cb-9f0c-eea9e80a6e72", "az", java.util.Arrays.asList( "az", "aze" ), "Azerbaijani", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Azerbaijani",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Venda */
    @javax.xml.bind.annotation.XmlEnumValue("ve")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Venda" )
    Venda( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#78df616a-b31e-35ee-86c6-a519a2ce9e12", "78df616a-b31e-35ee-86c6-a519a2ce9e12", "ve", java.util.Arrays.asList( "ve", "ven" ), "Venda", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Venda",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Zhuang */
    @javax.xml.bind.annotation.XmlEnumValue("za")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Zhuang" )
    Zhuang( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#839baadf-b724-306e-ac3b-12a431dd8358", "839baadf-b724-306e-ac3b-12a431dd8358", "za", java.util.Arrays.asList( "za", "zha" ), "Zhuang", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Zhuang",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Somali */
    @javax.xml.bind.annotation.XmlEnumValue("so")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Somali" )
    Somali( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#0b104da5-7394-3747-a4cc-7b3a42f2c1de", "0b104da5-7394-3747-a4cc-7b3a42f2c1de", "so", java.util.Arrays.asList( "so", "som" ), "Somali", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Somali",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Arapaho */
    @javax.xml.bind.annotation.XmlEnumValue("arp")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Arapaho" )
    Arapaho( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#53c9611f-716b-3754-b288-ca97bbc0efc4", "53c9611f-716b-3754-b288-ca97bbc0efc4", "arp", java.util.Arrays.asList( "arp" ), "Arapaho", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Arapaho",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Telugu */
    @javax.xml.bind.annotation.XmlEnumValue("te")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Telugu" )
    Telugu( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#15b88a88-e6cf-36a4-862c-1562fdcb0c19", "15b88a88-e6cf-36a4-862c-1562fdcb0c19", "te", java.util.Arrays.asList( "te", "tel" ), "Telugu", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Telugu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Faroese */
    @javax.xml.bind.annotation.XmlEnumValue("fo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Faroese" )
    Faroese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#b4c02865-3fbd-3807-a824-f8a41dbe25fe", "b4c02865-3fbd-3807-a824-f8a41dbe25fe", "fo", java.util.Arrays.asList( "fo", "fao" ), "Faroese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Faroese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sasak */
    @javax.xml.bind.annotation.XmlEnumValue("sas")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Sasak" )
    Sasak( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#5dc659a0-585f-3b36-9379-b9db644f799a", "5dc659a0-585f-3b36-9379-b9db644f799a", "sas", java.util.Arrays.asList( "sas" ), "Sasak", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Sasak",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Southern Sotho */
    @javax.xml.bind.annotation.XmlEnumValue("st")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/SouthernSotho" )
    Southern_Sotho( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#0ab0904e-915d-3a0a-b4a9-3d465992cb7e", "0ab0904e-915d-3a0a-b4a9-3d465992cb7e", "st", java.util.Arrays.asList( "st", "sot" ), "Southern Sotho", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/SouthernSotho",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Swati */
    @javax.xml.bind.annotation.XmlEnumValue("ss")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Swati" )
    Swati( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#d6790955-5c47-3737-9a8c-a949769e0ec4", "d6790955-5c47-3737-9a8c-a949769e0ec4", "ss", java.util.Arrays.asList( "ss", "ssw" ), "Swati", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Swati",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kirghiz */
    @javax.xml.bind.annotation.XmlEnumValue("ky")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kirghiz" )
    Kirghiz( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#dcc5d036-3f05-3398-93a1-7020fb43b652", "dcc5d036-3f05-3398-93a1-7020fb43b652", "ky", java.util.Arrays.asList( "ky", "kir" ), "Kirghiz", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kirghiz",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Arabic */
    @javax.xml.bind.annotation.XmlEnumValue("ar")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Arabic" )
    Arabic( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#272ccb85-92ba-3de0-baf1-dedce0fd3ac2", "272ccb85-92ba-3de0-baf1-dedce0fd3ac2", "ar", java.util.Arrays.asList( "ar", "ara" ), "Arabic", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Arabic",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Iloko */
    @javax.xml.bind.annotation.XmlEnumValue("ilo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Iloko" )
    Iloko( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#60314d50-1dc4-31fb-a222-dd9eed5aa068", "60314d50-1dc4-31fb-a222-dd9eed5aa068", "ilo", java.util.Arrays.asList( "ilo" ), "Iloko", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Iloko",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Chuukese */
    @javax.xml.bind.annotation.XmlEnumValue("chk")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Chuukese" )
    Chuukese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c407e1cf-019e-3a9e-a15e-fb77d511f0d5", "c407e1cf-019e-3a9e-a15e-fb77d511f0d5", "chk", java.util.Arrays.asList( "chk" ), "Chuukese", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Chuukese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sranan Tongo */
    @javax.xml.bind.annotation.XmlEnumValue("srn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/SrananTongo" )
    Sranan_Tongo( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#eecbd0ca-832f-3391-ac9f-2f7a9c7b509a", "eecbd0ca-832f-3391-ac9f-2f7a9c7b509a", "srn", java.util.Arrays.asList( "srn" ), "Sranan Tongo", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/SrananTongo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Slovak */
    @javax.xml.bind.annotation.XmlEnumValue("sk")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Slovak" )
    Slovak( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9accc467-b159-37ce-958e-53209c0cde2a", "9accc467-b159-37ce-958e-53209c0cde2a", "sk", java.util.Arrays.asList( "sk", "slk", "slo" ), "Slovak", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Slovak",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Inupiaq */
    @javax.xml.bind.annotation.XmlEnumValue("ik")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Inupiaq" )
    Inupiaq( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#8aeb3707-7d17-3e79-b6a9-4af8c2584723", "8aeb3707-7d17-3e79-b6a9-4af8c2584723", "ik", java.util.Arrays.asList( "ik", "ipk" ), "Inupiaq", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Inupiaq",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Russian */
    @javax.xml.bind.annotation.XmlEnumValue("ru")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Russian" )
    Russian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#deba6920-e706-3540-9385-fe1fb5a379ec", "deba6920-e706-3540-9385-fe1fb5a379ec", "ru", java.util.Arrays.asList( "ru", "rus" ), "Russian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Russian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Delaware */
    @javax.xml.bind.annotation.XmlEnumValue("del")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Delaware" )
    Delaware( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ba290ff9-5047-3708-a109-87cb31e6274c", "ba290ff9-5047-3708-a109-87cb31e6274c", "del", java.util.Arrays.asList( "del" ), "Delaware", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Delaware",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Marwari */
    @javax.xml.bind.annotation.XmlEnumValue("mwr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Marwari" )
    Marwari( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#a5e77efe-1a96-3bdd-ac93-a38680791bf4", "a5e77efe-1a96-3bdd-ac93-a38680791bf4", "mwr", java.util.Arrays.asList( "mwr" ), "Marwari", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Marwari",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Mandingo */
    @javax.xml.bind.annotation.XmlEnumValue("man")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mandingo" )
    Mandingo( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#eb7bf6b7-a121-3bf4-8032-e17e3acb7e4b", "eb7bf6b7-a121-3bf4-8032-e17e3acb7e4b", "man", java.util.Arrays.asList( "man" ), "Mandingo", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mandingo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kazakh */
    @javax.xml.bind.annotation.XmlEnumValue("kk")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kazakh" )
    Kazakh( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#d05ae627-fcc8-38e7-9f1e-e341c3d5cbc2", "d05ae627-fcc8-38e7-9f1e-e341c3d5cbc2", "kk", java.util.Arrays.asList( "kk", "kaz" ), "Kazakh", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kazakh",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Low German */
    @javax.xml.bind.annotation.XmlEnumValue("nds")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/LowGerman" )
    Low_German( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#e930c280-349b-334e-af66-b0ca16139e4f", "e930c280-349b-334e-af66-b0ca16139e4f", "nds", java.util.Arrays.asList( "nds" ), "Low German", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/LowGerman",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Chechen */
    @javax.xml.bind.annotation.XmlEnumValue("ce")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chechen" )
    Chechen( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#427dff9d-d115-37bf-9702-5b6d8e839b27", "427dff9d-d115-37bf-9702-5b6d8e839b27", "ce", java.util.Arrays.asList( "ce", "che" ), "Chechen", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Chechen",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tigrinya */
    @javax.xml.bind.annotation.XmlEnumValue("ti")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tigrinya" )
    Tigrinya( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#dea54a29-be92-3874-9275-fae518b01457", "dea54a29-be92-3874-9275-fae518b01457", "ti", java.util.Arrays.asList( "ti", "tir" ), "Tigrinya", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tigrinya",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Haitian */
    @javax.xml.bind.annotation.XmlEnumValue("ht")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Haitian" )
    Haitian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#da2d3f72-de14-3d2e-8030-b9bfcb75acd6", "da2d3f72-de14-3d2e-8030-b9bfcb75acd6", "ht", java.util.Arrays.asList( "ht", "hat" ), "Haitian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Haitian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Zulu */
    @javax.xml.bind.annotation.XmlEnumValue("zu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Zulu" )
    Zulu( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#68046733-e465-3165-a4f5-9a1918cb1408", "68046733-e465-3165-a4f5-9a1918cb1408", "zu", java.util.Arrays.asList( "zu", "zul" ), "Zulu", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Zulu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Osage */
    @javax.xml.bind.annotation.XmlEnumValue("osa")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Osage" )
    Osage( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c8760186-4a8a-3f59-83f0-7ce45470593c", "c8760186-4a8a-3f59-83f0-7ce45470593c", "osa", java.util.Arrays.asList( "osa" ), "Osage", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Osage",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Thai */
    @javax.xml.bind.annotation.XmlEnumValue("th")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Thai" )
    Thai( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#43ddc789-bcea-3177-a147-91f6c9a03b28", "43ddc789-bcea-3177-a147-91f6c9a03b28", "th", java.util.Arrays.asList( "th", "tha" ), "Thai", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Thai",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Judeo-Arabic */
    @javax.xml.bind.annotation.XmlEnumValue("jrb")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/JudeoArabic" )
    Judeo_Arabic( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#e96d21e3-7776-31be-ba34-1dbca221112e", "e96d21e3-7776-31be-ba34-1dbca221112e", "jrb", java.util.Arrays.asList( "jrb" ), "Judeo-Arabic", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/JudeoArabic",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* German */
    @javax.xml.bind.annotation.XmlEnumValue("de")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/German" )
    German( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#86bc3115-eb4e-3873-ac96-904a4a68e19e", "86bc3115-eb4e-3873-ac96-904a4a68e19e", "de", java.util.Arrays.asList( "de", "deu", "ger" ), "German", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/German",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Korean */
    @javax.xml.bind.annotation.XmlEnumValue("ko")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Korean" )
    Korean( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#d0bdb3cd-e477-382e-b66d-a05ebda50ccb", "d0bdb3cd-e477-382e-b66d-a05ebda50ccb", "ko", java.util.Arrays.asList( "ko", "kor" ), "Korean", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Korean",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tuvalu */
    @javax.xml.bind.annotation.XmlEnumValue("tvl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tuvalu" )
    Tuvalu( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#4e18c1e6-99d8-3bc3-822d-67f2ff82c56b", "4e18c1e6-99d8-3bc3-822d-67f2ff82c56b", "tvl", java.util.Arrays.asList( "tvl" ), "Tuvalu", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tuvalu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Romany */
    @javax.xml.bind.annotation.XmlEnumValue("rom")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Romany" )
    Romany( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#2928692d-1176-39cc-bbdc-4f8922399bee", "2928692d-1176-39cc-bbdc-4f8922399bee", "rom", java.util.Arrays.asList( "rom" ), "Romany", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Romany",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Konkani */
    @javax.xml.bind.annotation.XmlEnumValue("kok")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Konkani" )
    Konkani( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#602a59de-fb60-3629-8f92-05bd6834c18a", "602a59de-fb60-3629-8f92-05bd6834c18a", "kok", java.util.Arrays.asList( "kok" ), "Konkani", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Konkani",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Mende */
    @javax.xml.bind.annotation.XmlEnumValue("men")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mende" )
    Mende( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#820cdc40-b4bd-31c9-a6cd-722feed39d5c", "820cdc40-b4bd-31c9-a6cd-722feed39d5c", "men", java.util.Arrays.asList( "men" ), "Mende", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Mende",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Herero */
    @javax.xml.bind.annotation.XmlEnumValue("hz")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Herero" )
    Herero( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#041e8934-9138-38d5-9b18-9d8be3f811b7", "041e8934-9138-38d5-9b18-9d8be3f811b7", "hz", java.util.Arrays.asList( "hz", "her" ), "Herero", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Herero",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Buginese */
    @javax.xml.bind.annotation.XmlEnumValue("bug")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Buginese" )
    Buginese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#e7e2a8e6-7ee3-3753-9ac1-a8f01d0ccb63", "e7e2a8e6-7ee3-3753-9ac1-a8f01d0ccb63", "bug", java.util.Arrays.asList( "bug" ), "Buginese", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Buginese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tibetan */
    @javax.xml.bind.annotation.XmlEnumValue("bo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tibetan" )
    Tibetan( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#a441f933-e002-3f55-8cff-38b534f98a53", "a441f933-e002-3f55-8cff-38b534f98a53", "bo", java.util.Arrays.asList( "bo", "bod", "tib" ), "Tibetan", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tibetan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Fanti */
    @javax.xml.bind.annotation.XmlEnumValue("fat")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Fanti" )
    Fanti( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9162bf1b-38f4-3261-9a75-3525a7d996d5", "9162bf1b-38f4-3261-9a75-3525a7d996d5", "fat", java.util.Arrays.asList( "fat" ), "Fanti", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Fanti",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Masai */
    @javax.xml.bind.annotation.XmlEnumValue("mas")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Masai" )
    Masai( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#956c505d-b123-329d-b487-6941513cbe21", "956c505d-b123-329d-b487-6941513cbe21", "mas", java.util.Arrays.asList( "mas" ), "Masai", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Masai",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kamba */
    @javax.xml.bind.annotation.XmlEnumValue("kam")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kamba" )
    Kamba( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#3ba389b1-f47d-3651-9e73-274a00ba41c2", "3ba389b1-f47d-3651-9e73-274a00ba41c2", "kam", java.util.Arrays.asList( "kam" ), "Kamba", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kamba",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ossetian */
    @javax.xml.bind.annotation.XmlEnumValue("os")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ossetian" )
    Ossetian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#604e9f0b-a244-342d-9f26-80c5206ea4a6", "604e9f0b-a244-342d-9f26-80c5206ea4a6", "os", java.util.Arrays.asList( "os", "oss" ), "Ossetian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ossetian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tigre */
    @javax.xml.bind.annotation.XmlEnumValue("tig")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tigre" )
    Tigre( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c03e3572-98bf-3ff1-af7b-d2e40353d71f", "c03e3572-98bf-3ff1-af7b-d2e40353d71f", "tig", java.util.Arrays.asList( "tig" ), "Tigre", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tigre",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Abkhazian */
    @javax.xml.bind.annotation.XmlEnumValue("ab")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Abkhazian" )
    Abkhazian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#64db1254-fb5a-3435-b6ce-a757f5ef920c", "64db1254-fb5a-3435-b6ce-a757f5ef920c", "ab", java.util.Arrays.asList( "ab", "abk" ), "Abkhazian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Abkhazian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Latvian */
    @javax.xml.bind.annotation.XmlEnumValue("lv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Latvian" )
    Latvian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#76ad0358-e45d-3408-bc0a-26bbf4c160e3", "76ad0358-e45d-3408-bc0a-26bbf4c160e3", "lv", java.util.Arrays.asList( "lv", "lav" ), "Latvian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Latvian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ewe */
    @javax.xml.bind.annotation.XmlEnumValue("ee")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ewe" )
    Ewe( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#2956bc47-5585-3d0f-9242-091da155e530", "2956bc47-5585-3d0f-9242-091da155e530", "ee", java.util.Arrays.asList( "ee", "ewe" ), "Ewe", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ewe",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Norwegian Nynorsk */
    @javax.xml.bind.annotation.XmlEnumValue("nn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorwegianNynorsk" )
    Norwegian_Nynorsk( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#35fec539-d453-36dd-92be-373a5b6f7b62", "35fec539-d453-36dd-92be-373a5b6f7b62", "nn", java.util.Arrays.asList( "nn", "nno" ), "Norwegian Nynorsk", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/NorwegianNynorsk",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ukrainian */
    @javax.xml.bind.annotation.XmlEnumValue("uk")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ukrainian" )
    Ukrainian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#e78a6fc1-4ad6-3f7a-b838-6b20568ce95b", "e78a6fc1-4ad6-3f7a-b838-6b20568ce95b", "uk", java.util.Arrays.asList( "uk", "ukr" ), "Ukrainian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Ukrainian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Uighur */
    @javax.xml.bind.annotation.XmlEnumValue("ug")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Uighur" )
    Uighur( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#f8131f43-da14-3165-bf7e-cb1fd144eb6a", "f8131f43-da14-3165-bf7e-cb1fd144eb6a", "ug", java.util.Arrays.asList( "ug", "uig" ), "Uighur", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Uighur",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Pushto */
    @javax.xml.bind.annotation.XmlEnumValue("ps")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Pushto" )
    Pushto( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#d7ef8c5d-f269-3972-bed6-943551a4f435", "d7ef8c5d-f269-3972-bed6-943551a4f435", "ps", java.util.Arrays.asList( "ps", "pus" ), "Pushto", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Pushto",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tonga (Tonga Islands) */
    @javax.xml.bind.annotation.XmlEnumValue("to")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tonga-TongaIslands" )
    Tonga_Tonga_Islands( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#b142db5d-05e8-3fce-94bc-07f93bf9cb51", "b142db5d-05e8-3fce-94bc-07f93bf9cb51", "to", java.util.Arrays.asList( "to", "ton" ), "Tonga (Tonga Islands)", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tonga-TongaIslands",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Corsican */
    @javax.xml.bind.annotation.XmlEnumValue("co")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Corsican" )
    Corsican( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9b73be92-c05e-3ace-851c-6ceba2950291", "9b73be92-c05e-3ace-851c-6ceba2950291", "co", java.util.Arrays.asList( "co", "cos" ), "Corsican", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Corsican",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Nauru */
    @javax.xml.bind.annotation.XmlEnumValue("na")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Nauru" )
    Nauru( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#d0c5ab6b-ebe3-38a4-9569-3e990a2947bc", "d0c5ab6b-ebe3-38a4-9569-3e990a2947bc", "na", java.util.Arrays.asList( "na", "nau" ), "Nauru", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Nauru",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Rarotongan */
    @javax.xml.bind.annotation.XmlEnumValue("rar")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Rarotongan" )
    Rarotongan( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#04e0f368-15ea-3d0d-ab92-bfaadd1536d1", "04e0f368-15ea-3d0d-ab92-bfaadd1536d1", "rar", java.util.Arrays.asList( "rar" ), "Rarotongan", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Rarotongan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Nogai */
    @javax.xml.bind.annotation.XmlEnumValue("nog")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Nogai" )
    Nogai( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ebbbca23-45cc-34f4-a4b3-bad0931538d5", "ebbbca23-45cc-34f4-a4b3-bad0931538d5", "nog", java.util.Arrays.asList( "nog" ), "Nogai", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Nogai",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Pangasinan */
    @javax.xml.bind.annotation.XmlEnumValue("pag")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Pangasinan" )
    Pangasinan( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#09aa20d7-7c04-31ed-b5ac-a6e96b6bb1ca", "09aa20d7-7c04-31ed-b5ac-a6e96b6bb1ca", "pag", java.util.Arrays.asList( "pag" ), "Pangasinan", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Pangasinan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Dyula */
    @javax.xml.bind.annotation.XmlEnumValue("dyu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Dyula" )
    Dyula( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#d029bf31-8fb5-38ba-82c5-4aee21b618c6", "d029bf31-8fb5-38ba-82c5-4aee21b618c6", "dyu", java.util.Arrays.asList( "dyu" ), "Dyula", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Dyula",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Erzya */
    @javax.xml.bind.annotation.XmlEnumValue("myv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Erzya" )
    Erzya( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#bd8e36a1-0ecb-3e50-96a5-53e46f62ac2d", "bd8e36a1-0ecb-3e50-96a5-53e46f62ac2d", "myv", java.util.Arrays.asList( "myv" ), "Erzya", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Erzya",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Gayo */
    @javax.xml.bind.annotation.XmlEnumValue("gay")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Gayo" )
    Gayo( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#3b00dc6e-0a74-361f-bdc2-91ecdd213cd6", "3b00dc6e-0a74-361f-bdc2-91ecdd213cd6", "gay", java.util.Arrays.asList( "gay" ), "Gayo", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Gayo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Slave - Athapascan */
    @javax.xml.bind.annotation.XmlEnumValue("den")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/SlaveAthapascan" )
    Slave_Athapascan( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#ba4b5cd8-bc23-3d36-b7d8-ab3433dd23ed", "ba4b5cd8-bc23-3d36-b7d8-ab3433dd23ed", "den", java.util.Arrays.asList( "den" ), "Slave - Athapascan", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/SlaveAthapascan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kinyarwanda */
    @javax.xml.bind.annotation.XmlEnumValue("rw")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kinyarwanda" )
    Kinyarwanda( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#e4875932-c8cf-3d2b-8232-34a1d35b15e0", "e4875932-c8cf-3d2b-8232-34a1d35b15e0", "rw", java.util.Arrays.asList( "rw", "kin" ), "Kinyarwanda", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kinyarwanda",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tuvinian */
    @javax.xml.bind.annotation.XmlEnumValue("tyv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tuvinian" )
    Tuvinian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#e9d5867a-a737-303d-9055-705a87c41bd2", "e9d5867a-a737-303d-9055-705a87c41bd2", "tyv", java.util.Arrays.asList( "tyv" ), "Tuvinian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tuvinian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* South Ndebele */
    @javax.xml.bind.annotation.XmlEnumValue("nr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/SouthNdebele" )
    South_Ndebele( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#b1203842-21fb-361c-97bd-0793e9b5a5eb", "b1203842-21fb-361c-97bd-0793e9b5a5eb", "nr", java.util.Arrays.asList( "nr", "nbl" ), "South Ndebele", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/SouthNdebele",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Navajo */
    @javax.xml.bind.annotation.XmlEnumValue("nv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Navajo" )
    Navajo( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#504405fb-03fe-3519-a14a-6d2ce11000fa", "504405fb-03fe-3519-a14a-6d2ce11000fa", "nv", java.util.Arrays.asList( "nv", "nav" ), "Navajo", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Navajo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Pedi */
    @javax.xml.bind.annotation.XmlEnumValue("nso")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Pedi" )
    Pedi( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#59012db8-d70b-36ef-84e8-dc26c1f6cb52", "59012db8-d70b-36ef-84e8-dc26c1f6cb52", "nso", java.util.Arrays.asList( "nso" ), "Pedi", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Pedi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Macedonian */
    @javax.xml.bind.annotation.XmlEnumValue("mk")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Macedonian" )
    Macedonian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c1e1b1f8-bdaa-34b0-bc18-3e147887e0e1", "c1e1b1f8-bdaa-34b0-bc18-3e147887e0e1", "mk", java.util.Arrays.asList( "mk", "mkd", "mac" ), "Macedonian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Macedonian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Neapolitan */
    @javax.xml.bind.annotation.XmlEnumValue("nap")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Neapolitan" )
    Neapolitan( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#2fd0df13-fd97-3f79-a6f8-5c97bbd1128c", "2fd0df13-fd97-3f79-a6f8-5c97bbd1128c", "nap", java.util.Arrays.asList( "nap" ), "Neapolitan", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Neapolitan",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Sundanese */
    @javax.xml.bind.annotation.XmlEnumValue("su")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sundanese" )
    Sundanese( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#3f43ba07-05bf-371e-a5d7-4a7a2e8b40c0", "3f43ba07-05bf-371e-a5d7-4a7a2e8b40c0", "su", java.util.Arrays.asList( "su", "sun" ), "Sundanese", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Sundanese",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Makasar */
    @javax.xml.bind.annotation.XmlEnumValue("mak")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Makasar" )
    Makasar( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#60b88fe8-16bc-39c6-a39f-d6cc5205abc7", "60b88fe8-16bc-39c6-a39f-d6cc5205abc7", "mak", java.util.Arrays.asList( "mak" ), "Makasar", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Makasar",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bilin */
    @javax.xml.bind.annotation.XmlEnumValue("byn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Bilin" )
    Bilin( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#18c44182-2997-3ef7-b104-da468455fb88", "18c44182-2997-3ef7-b104-da468455fb88", "byn", java.util.Arrays.asList( "byn" ), "Bilin", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Bilin",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tagalog */
    @javax.xml.bind.annotation.XmlEnumValue("tl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tagalog" )
    Tagalog( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#fee97312-6d42-389a-8960-82e9ca6961fa", "fee97312-6d42-389a-8960-82e9ca6961fa", "tl", java.util.Arrays.asList( "tl", "tgl" ), "Tagalog", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Tagalog",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Nyoro */
    @javax.xml.bind.annotation.XmlEnumValue("nyo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Nyoro" )
    Nyoro( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#1a312fe8-2d00-3720-bf68-5da1529744fb", "1a312fe8-2d00-3720-bf68-5da1529744fb", "nyo", java.util.Arrays.asList( "nyo" ), "Nyoro", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Nyoro",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kikuyu */
    @javax.xml.bind.annotation.XmlEnumValue("ki")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kikuyu" )
    Kikuyu( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#7b59a385-670f-39cd-9940-31c5b0514340", "7b59a385-670f-39cd-9940-31c5b0514340", "ki", java.util.Arrays.asList( "ki", "kik" ), "Kikuyu", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kikuyu",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Tetum */
    @javax.xml.bind.annotation.XmlEnumValue("tet")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tetum" )
    Tetum( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#19bd1211-3707-32bf-8253-9d0d9dd7e6b3", "19bd1211-3707-32bf-8253-9d0d9dd7e6b3", "tet", java.util.Arrays.asList( "tet" ), "Tetum", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Tetum",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Slovenian */
    @javax.xml.bind.annotation.XmlEnumValue("sl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Slovenian" )
    Slovenian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#6e9970ea-c6ca-36e3-8a8e-ac50070c49ce", "6e9970ea-c6ca-36e3-8a8e-ac50070c49ce", "sl", java.util.Arrays.asList( "sl", "slv" ), "Slovenian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Slovenian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Polish */
    @javax.xml.bind.annotation.XmlEnumValue("pl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Polish" )
    Polish( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c730389b-c8d9-3e59-8867-766babdd48b5", "c730389b-c8d9-3e59-8867-766babdd48b5", "pl", java.util.Arrays.asList( "pl", "pol" ), "Polish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Polish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kalaallisut */
    @javax.xml.bind.annotation.XmlEnumValue("kl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kalaallisut" )
    Kalaallisut( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#5c4f0685-88ec-3e0d-8193-b59f349879fd", "5c4f0685-88ec-3e0d-8193-b59f349879fd", "kl", java.util.Arrays.asList( "kl", "kal" ), "Kalaallisut", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kalaallisut",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Nzima */
    @javax.xml.bind.annotation.XmlEnumValue("nzi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Nzima" )
    Nzima( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#11c73653-eb50-3dce-8b99-586fec38bf06", "11c73653-eb50-3dce-8b99-586fec38bf06", "nzi", java.util.Arrays.asList( "nzi" ), "Nzima", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Nzima",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Modern Greek */
    @javax.xml.bind.annotation.XmlEnumValue("el")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/ModernGreek" )
    Modern_Greek( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#26349cdd-47fa-3dfd-b5fa-d11686dc477f", "26349cdd-47fa-3dfd-b5fa-d11686dc477f", "el", java.util.Arrays.asList( "el", "ell", "gre" ), "Modern Greek", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/ModernGreek",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Luo - Kenya and Tanzania */
    @javax.xml.bind.annotation.XmlEnumValue("luo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/LuoKenyaAndTanzania" )
    Luo_Kenya_And_Tanzania( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#6fb0b159-32bc-3781-a6ac-875f69eff105", "6fb0b159-32bc-3781-a6ac-875f69eff105", "luo", java.util.Arrays.asList( "luo" ), "Luo - Kenya and Tanzania", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/LuoKenyaAndTanzania",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Timne */
    @javax.xml.bind.annotation.XmlEnumValue("tem")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Timne" )
    Timne( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#34543d19-e611-337b-85b5-e5f68fd2a452", "34543d19-e611-337b-85b5-e5f68fd2a452", "tem", java.util.Arrays.asList( "tem" ), "Timne", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Timne",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Croatian */
    @javax.xml.bind.annotation.XmlEnumValue("hr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Croatian" )
    Croatian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#0c1be09b-ad2a-3aa2-ba31-5b88abda8a32", "0c1be09b-ad2a-3aa2-ba31-5b88abda8a32", "hr", java.util.Arrays.asList( "hr", "hrv" ), "Croatian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Croatian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Nyanja */
    @javax.xml.bind.annotation.XmlEnumValue("ny")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Nyanja" )
    Nyanja( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#e9e85816-90f8-38b6-a877-29eccb168b13", "e9e85816-90f8-38b6-a877-29eccb168b13", "ny", java.util.Arrays.asList( "ny", "nya" ), "Nyanja", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Nyanja",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Galibi Carib */
    @javax.xml.bind.annotation.XmlEnumValue("car")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/GalibiCarib" )
    Galibi_Carib( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#6046db31-a49c-349b-9c71-b3dfde75562c", "6046db31-a49c-349b-9c71-b3dfde75562c", "car", java.util.Arrays.asList( "car" ), "Galibi Carib", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/GalibiCarib",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Ewondo */
    @javax.xml.bind.annotation.XmlEnumValue("ewo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Ewondo" )
    Ewondo( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#060e01ec-5977-3301-bb47-5cd197e88dc6", "060e01ec-5977-3301-bb47-5cd197e88dc6", "ewo", java.util.Arrays.asList( "ewo" ), "Ewondo", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Ewondo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bini */
    @javax.xml.bind.annotation.XmlEnumValue("bin")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Bini" )
    Bini( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#0f2119d0-86ee-35f1-8b40-7615e430fa88", "0f2119d0-86ee-35f1-8b40-7615e430fa88", "bin", java.util.Arrays.asList( "bin" ), "Bini", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Bini",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Yiddish */
    @javax.xml.bind.annotation.XmlEnumValue("yi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Yiddish" )
    Yiddish( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#6d49a359-51ac-313a-a294-548e5137157f", "6d49a359-51ac-313a-a294-548e5137157f", "yi", java.util.Arrays.asList( "yi", "yid" ), "Yiddish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Yiddish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bosnian */
    @javax.xml.bind.annotation.XmlEnumValue("bs")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bosnian" )
    Bosnian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9dea74f0-1b9e-3ee9-abd8-67ad7b2d2d18", "9dea74f0-1b9e-3ee9-abd8-67ad7b2d2d18", "bs", java.util.Arrays.asList( "bs", "bos" ), "Bosnian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bosnian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Norwegian */
    @javax.xml.bind.annotation.XmlEnumValue("no")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Norwegian" )
    Norwegian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#da550ca0-6bca-3bd3-8b7c-6ed32c864c70", "da550ca0-6bca-3bd3-8b7c-6ed32c864c70", "no", java.util.Arrays.asList( "no", "nor" ), "Norwegian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Norwegian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Basque */
    @javax.xml.bind.annotation.XmlEnumValue("eu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Basque" )
    Basque( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#a8a89070-9b58-3887-9edc-68e65a938695", "a8a89070-9b58-3887-9edc-68e65a938695", "eu", java.util.Arrays.asList( "eu", "eus", "baq" ), "Basque", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Basque",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Lushai */
    @javax.xml.bind.annotation.XmlEnumValue("lus")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Lushai" )
    Lushai( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#22568705-45c6-3f1a-b222-c2510c39fc35", "22568705-45c6-3f1a-b222-c2510c39fc35", "lus", java.util.Arrays.asList( "lus" ), "Lushai", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Lushai",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Lamba */
    @javax.xml.bind.annotation.XmlEnumValue("lam")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Lamba" )
    Lamba( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#4a04d47f-2a73-32d3-b3fc-3b4dba1754a1", "4a04d47f-2a73-32d3-b3fc-3b4dba1754a1", "lam", java.util.Arrays.asList( "lam" ), "Lamba", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Lamba",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Inuktitut */
    @javax.xml.bind.annotation.XmlEnumValue("iu")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Inuktitut" )
    Inuktitut( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#3be898f3-f28c-3fba-ad9d-525c453615b4", "3be898f3-f28c-3fba-ad9d-525c453615b4", "iu", java.util.Arrays.asList( "iu", "iku" ), "Inuktitut", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Inuktitut",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kosraean */
    @javax.xml.bind.annotation.XmlEnumValue("kos")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kosraean" )
    Kosraean( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#44872f0c-7873-39a3-bccc-e40a4a26d9d7", "44872f0c-7873-39a3-bccc-e40a4a26d9d7", "kos", java.util.Arrays.asList( "kos" ), "Kosraean", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kosraean",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Cherokee */
    @javax.xml.bind.annotation.XmlEnumValue("chr")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Cherokee" )
    Cherokee( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#3d8cdfa0-57a8-3c19-9caa-67b1677e376c", "3d8cdfa0-57a8-3c19-9caa-67b1677e376c", "chr", java.util.Arrays.asList( "chr" ), "Cherokee", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Cherokee",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Scottish Gaelic */
    @javax.xml.bind.annotation.XmlEnumValue("gd")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/ScottishGaelic" )
    Scottish_Gaelic( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#e9906021-1896-3971-8e81-ac517de52da2", "e9906021-1896-3971-8e81-ac517de52da2", "gd", java.util.Arrays.asList( "gd", "gla" ), "Scottish Gaelic", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/ScottishGaelic",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Standard Moroccan Tamazight */
    @javax.xml.bind.annotation.XmlEnumValue("zgh")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/StandardMoroccanTamazight" )
    Standard_Moroccan_Tamazight( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#40f84270-9adc-3c1a-bc25-d4b36723ac9e", "40f84270-9adc-3c1a-bc25-d4b36723ac9e", "zgh", java.util.Arrays.asList( "zgh" ), "Standard Moroccan Tamazight", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/StandardMoroccanTamazight",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Inari Sami */
    @javax.xml.bind.annotation.XmlEnumValue("smn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/InariSami" )
    Inari_Sami( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#6231aeae-164e-3bd4-ba86-cdfbc124f6ba", "6231aeae-164e-3bd4-ba86-cdfbc124f6ba", "smn", java.util.Arrays.asList( "smn" ), "Inari Sami", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/InariSami",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Southern Altai */
    @javax.xml.bind.annotation.XmlEnumValue("alt")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/SouthernAltai" )
    Southern_Altai( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#6dfae054-3dbc-3e99-b6e5-a4c0b0e5b8bb", "6dfae054-3dbc-3e99-b6e5-a4c0b0e5b8bb", "alt", java.util.Arrays.asList( "alt" ), "Southern Altai", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/SouthernAltai",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Galician */
    @javax.xml.bind.annotation.XmlEnumValue("gl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Galician" )
    Galician( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#516a6233-25de-3756-b29f-124618baabbc", "516a6233-25de-3756-b29f-124618baabbc", "gl", java.util.Arrays.asList( "gl", "glg" ), "Galician", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Galician",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Malay */
    @javax.xml.bind.annotation.XmlEnumValue("ms")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Malay" )
    Malay( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#fc179207-9200-35b7-9ca8-5323ceacf5eb", "fc179207-9200-35b7-9ca8-5323ceacf5eb", "ms", java.util.Arrays.asList( "ms", "may", "msa" ), "Malay", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Malay",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Georgian */
    @javax.xml.bind.annotation.XmlEnumValue("ka")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Georgian" )
    Georgian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#adc0753d-3764-3ed1-97f7-b999a0ae79a0", "adc0753d-3764-3ed1-97f7-b999a0ae79a0", "ka", java.util.Arrays.asList( "ka", "geo", "kat" ), "Georgian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Georgian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kashubian */
    @javax.xml.bind.annotation.XmlEnumValue("csb")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kashubian" )
    Kashubian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#4af7d245-1358-35ea-a35a-46f589292b04", "4af7d245-1358-35ea-a35a-46f589292b04", "csb", java.util.Arrays.asList( "csb" ), "Kashubian", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Kashubian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Kannada */
    @javax.xml.bind.annotation.XmlEnumValue("kn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kannada" )
    Kannada( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#6b511fdc-e48a-3427-8a35-e3365e36230c", "6b511fdc-e48a-3427-8a35-e3365e36230c", "kn", java.util.Arrays.asList( "kn", "kan" ), "Kannada", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Kannada",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Finnish */
    @javax.xml.bind.annotation.XmlEnumValue("fi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Finnish" )
    Finnish( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9ae099fd-0822-37fa-af2f-85664a4f74dc", "9ae099fd-0822-37fa-af2f-85664a4f74dc", "fi", java.util.Arrays.asList( "fi", "fin" ), "Finnish", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Finnish",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Bulgarian */
    @javax.xml.bind.annotation.XmlEnumValue("bg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bulgarian" )
    Bulgarian( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#60bb3bcc-6ff5-3542-8a38-f76f1059b2d2", "60bb3bcc-6ff5-3542-8a38-f76f1059b2d2", "bg", java.util.Arrays.asList( "bg", "bul" ), "Bulgarian", "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/Bulgarian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Buriat */
    @javax.xml.bind.annotation.XmlEnumValue("bua")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Buriat" )
    Buriat( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#9efe3f94-130e-3789-ad8f-999b3861e473", "9efe3f94-130e-3789-ad8f-999b3861e473", "bua", java.util.Arrays.asList( "bua" ), "Buriat", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Buriat",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Dargwa */
    @javax.xml.bind.annotation.XmlEnumValue("dar")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Dargwa" )
    Dargwa( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#dcade61f-2126-3fce-ba64-9309eb835952", "dcade61f-2126-3fce-ba64-9309eb835952", "dar", java.util.Arrays.asList( "dar" ), "Dargwa", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Dargwa",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Rapanui */
    @javax.xml.bind.annotation.XmlEnumValue("rap")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Rapanui" )
    Rapanui( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#c5907c2d-005f-3349-854c-5bbd4f73fb85", "c5907c2d-005f-3349-854c-5bbd4f73fb85", "rap", java.util.Arrays.asList( "rap" ), "Rapanui", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Rapanui",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Manipuri */
    @javax.xml.bind.annotation.XmlEnumValue("mni")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Manipuri" )
    Manipuri( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#65147bd1-37ce-3d59-9ae2-795726ff6b55", "65147bd1-37ce-3d59-9ae2-795726ff6b55", "mni", java.util.Arrays.asList( "mni" ), "Manipuri", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Manipuri",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Creek */
    @javax.xml.bind.annotation.XmlEnumValue("mus")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Creek" )
    Creek( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes#1f00fe69-a0b4-3b7d-b2c4-c808d4007139", "1f00fe69-a0b4-3b7d-b2c4-c808d4007139", "mus", java.util.Arrays.asList( "mus" ), "Creek", "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/Creek",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes" )),
      URI.create("https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes/20190201/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes/20190201/"))
      .withLabel( edu.mayo.ontology.taxonomies.iso639_2_languagecodes.Language.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.iso639_2_languagecodes.Language.SCHEME_ID )
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
  public Series<edu.mayo.ontology.taxonomies.iso639_2_languagecodes.Language> asSeries() {
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
