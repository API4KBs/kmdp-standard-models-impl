package edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16;

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

import edu.mayo.ontology.taxonomies.kao.rel.citationreltype.BibliographicCitationTypeSeries;
import edu.mayo.kmdp.terms.impl.model.AnonymousConceptScheme;


@javax.xml.bind.annotation.XmlType(name = "BibliographicCitationType")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( BibliographicCitationType.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = BibliographicCitationType.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = BibliographicCitationType.JsonDeserializer.class )
public enum BibliographicCitationType implements edu.mayo.ontology.taxonomies.kao.rel.citationreltype.BibliographicCitationType {


    /* The citing entity cites the cited entity, either directly and explicitly (as in the reference list of a journal article), indirectly (e.g. by citing a more recent paper by the same group on the same topic), or implicitly (e.g. as in artistic quotations or parodies, or in cases of plagiarism). */
    @javax.xml.bind.annotation.XmlEnumValue("cites")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/cites" )
    Cites( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#5d224440-05e2-314e-8829-859fe1ce0793", "5d224440-05e2-314e-8829-859fe1ce0793", "cites", java.util.Arrays.asList( "cites" ), "cites", "http://purl.org/spar/cito/cites",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The citing entity qualifies or places conditions or restrictions upon statements, ideas or conclusions presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("qualifies")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/qualifies" )
    Qualifies( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#73907b85-bb06-3a97-8c41-9201e50d49fa", "73907b85-bb06-3a97-8c41-9201e50d49fa", "qualifies", java.util.Arrays.asList( "qualifies" ), "qualifies", "http://purl.org/spar/cito/qualifies",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity ridicules the cited entity or aspects of its contents. */
    @javax.xml.bind.annotation.XmlEnumValue("ridicules")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/ridicules" )
    Ridicules( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#c2514de4-b94e-3547-98b7-0aaf0e36ed54", "c2514de4-b94e-3547-98b7-0aaf0e36ed54", "ridicules", java.util.Arrays.asList( "ridicules" ), "ridicules", "http://purl.org/spar/cito/ridicules",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* This property is defined in schema.org and has been added here to align schema.org with CiTO. The object property schema:citation expresses similar semantics to cito:cites except for the explicit definition of domain and range classes, that are schema:CreativeWork according to schema.org. For that reason, it is here defined as a subproperty of cito:cites. */
    @javax.xml.bind.annotation.XmlEnumValue("citation")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://schema.org/citation" )
    Citation( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#33677b82-7973-3e4c-b09d-b5189e095627", "33677b82-7973-3e4c-b09d-b5189e095627", "citation", java.util.Arrays.asList( "citation" ), "citation", "http://schema.org/citation",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity cites the cited entity as being the container of metadata describing the citing entity. */
    @javax.xml.bind.annotation.XmlEnumValue("citesAsMetadataDocument")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/citesAsMetadataDocument" )
    Cites_As_Metadata_Document( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#fe37fb1f-0c9a-36f9-a6ad-a4c51396723f", "fe37fb1f-0c9a-36f9-a6ad-a4c51396723f", "citesAsMetadataDocument", java.util.Arrays.asList( "citesAsMetadataDocument" ), "cites as metadata document", "http://purl.org/spar/cito/citesAsMetadataDocument",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity includes one or more quotations from the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("includesQuotationFrom")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/includesQuotationFrom" )
    Includes_Quotation_From( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#01268750-d16d-393a-9ec8-cd25e078a48c", "01268750-d16d-393a-9ec8-cd25e078a48c", "includesQuotationFrom", java.util.Arrays.asList( "includesQuotationFrom" ), "includes quotation from", "http://purl.org/spar/cito/includesQuotationFrom",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity provides a link, in the form of an HTTP Uniform Resource Locator (URL), to the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("linksTo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/linksTo" )
    Links_To( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#4224db58-91a6-3490-aa91-108a6463282f", "4224db58-91a6-3490-aa91-108a6463282f", "linksTo", java.util.Arrays.asList( "linksTo" ), "links to", "http://purl.org/spar/cito/linksTo",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity cites the cited entity as being the entity from which the citing entity is derived, or about which the citing entity contains metadata. */
    @javax.xml.bind.annotation.XmlEnumValue("citesAsSourceDocument")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/citesAsSourceDocument" )
    Cites_As_Source_Document( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#4bcff16a-3800-30aa-b919-8ac01a75a3bd", "4bcff16a-3800-30aa-b919-8ac01a75a3bd", "citesAsSourceDocument", java.util.Arrays.asList( "citesAsSourceDocument" ), "cites as source document", "http://purl.org/spar/cito/citesAsSourceDocument",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity critiques statements, ideas or conclusions presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("critiques")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/critiques" )
    Critiques( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#af02b6a3-785f-309c-8a6d-6e45708c065a", "af02b6a3-785f-309c-8a6d-6e45708c065a", "critiques", java.util.Arrays.asList( "critiques" ), "critiques", "http://purl.org/spar/cito/critiques",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity replies to statements, ideas or criticisms presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("repliesTo")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/repliesTo" )
    Replies_To( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#7d2a4e38-8712-38a0-b0e8-ae807052488f", "7d2a4e38-8712-38a0-b0e8-ae807052488f", "repliesTo", java.util.Arrays.asList( "repliesTo" ), "replies to", "http://purl.org/spar/cito/repliesTo",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity describes the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("describes")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/describes" )
    Describes( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#7ea108a5-9ad7-34eb-a7a6-6d623e2d3940", "7ea108a5-9ad7-34eb-a7a6-6d623e2d3940", "describes", java.util.Arrays.asList( "describes" ), "describes", "http://purl.org/spar/cito/describes",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity provides intellectual or factual support for statements, ideas or conclusions presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("supports")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/supports" )
    Supports( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#72225dfc-0ffc-3c4e-8471-c5824c2c63c2", "72225dfc-0ffc-3c4e-8471-c5824c2c63c2", "supports", java.util.Arrays.asList( "supports" ), "supports", "http://purl.org/spar/cito/supports",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity express derision for the cited entity, or for ideas or conclusions contained within it. */
    @javax.xml.bind.annotation.XmlEnumValue("derides")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/derides" )
    Derides( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#8c2ce286-eb2d-3358-9c66-a13cbb773e44", "8c2ce286-eb2d-3358-9c66-a13cbb773e44", "derides", java.util.Arrays.asList( "derides" ), "derides", "http://purl.org/spar/cito/derides",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* A property indicating that the author of the citing entity plagiarizes the cited entity, by including textual or other elements from the cited entity without formal acknowledgement of their source.  The citing entity thus contains no explicit citation of the cited entity, according to the norms of scholarly practice, but cites it implicitly. */
    @javax.xml.bind.annotation.XmlEnumValue("plagiarizes")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/plagiarizes" )
    Plagiarizes( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#ae1b2fa0-e6c7-3d8d-8a55-86bda3357d34", "ae1b2fa0-e6c7-3d8d-8a55-86bda3357d34", "plagiarizes", java.util.Arrays.asList( "plagiarizes" ), "plagiarizes", "http://purl.org/spar/cito/plagiarizes",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity contains a statement of fact or a logical assertion (or a collection of such facts and/or assertions) originally present in the cited entity.   This object property is designed to be used to relate a separate abstract, summary or nanopublication to the cited entity upon which it is based. */
    @javax.xml.bind.annotation.XmlEnumValue("containsAssertionFrom")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/containsAssertionFrom" )
    Contains_Assertion_From( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#ae87b13b-da97-36c5-82e7-9fac2a083b1c", "ae87b13b-da97-36c5-82e7-9fac2a083b1c", "containsAssertionFrom", java.util.Arrays.asList( "containsAssertionFrom" ), "contains assertion from", "http://purl.org/spar/cito/containsAssertionFrom",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity includes one or more excerpts from the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("includesExcerptFrom")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/includesExcerptFrom" )
    Includes_Excerpt_From( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#7cf28cc6-b6d5-38ac-9713-c614dea27f30", "7cf28cc6-b6d5-38ac-9713-c614dea27f30", "includesExcerptFrom", java.util.Arrays.asList( "includesExcerptFrom" ), "includes excerpt from", "http://purl.org/spar/cito/includesExcerptFrom",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity cites the cited entity as one that is related. */
    @javax.xml.bind.annotation.XmlEnumValue("citesAsRelated")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/citesAsRelated" )
    Cites_As_Related( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#8da9b328-e8bb-38b1-8326-fbaad3756d52", "8da9b328-e8bb-38b1-8326-fbaad3756d52", "citesAsRelated", java.util.Arrays.asList( "citesAsRelated" ), "cites as related", "http://purl.org/spar/cito/citesAsRelated",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity describes work that uses data presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("usesDataFrom")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/usesDataFrom" )
    Uses_Data_From( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#b1a6ebed-5a78-3c50-bedf-60ab7c584f89", "b1a6ebed-5a78-3c50-bedf-60ab7c584f89", "usesDataFrom", java.util.Arrays.asList( "usesDataFrom" ), "uses data from", "http://purl.org/spar/cito/usesDataFrom",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity corrects statements, ideas or conclusions presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("corrects")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/corrects" )
    Corrects( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#04a4bd16-f07d-3bb7-8d0c-8955a46b7526", "04a4bd16-f07d-3bb7-8d0c-8955a46b7526", "corrects", java.util.Arrays.asList( "corrects" ), "corrects", "http://purl.org/spar/cito/corrects",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity disagrees with statements, ideas or conclusions presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("disagreesWith")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/disagreesWith" )
    Disagrees_With( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#1e45fa4c-5e81-3cba-80f0-9adddafd6abe", "1e45fa4c-5e81-3cba-80f0-9adddafd6abe", "disagreesWith", java.util.Arrays.asList( "disagreesWith" ), "disagrees with", "http://purl.org/spar/cito/disagreesWith",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity describes work that uses a method detailed in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("usesMethodIn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/usesMethodIn" )
    Uses_Method_In( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#08dd8d8f-8a0e-3373-924a-2062cfd23fd6", "08dd8d8f-8a0e-3373-924a-2062cfd23fd6", "usesMethodIn", java.util.Arrays.asList( "usesMethodIn" ), "uses method in", "http://purl.org/spar/cito/usesMethodIn",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity cites the cited entity as one that provides an authoritative description or definition of the subject under discussion. */
    @javax.xml.bind.annotation.XmlEnumValue("citesAsAuthority")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/citesAsAuthority" )
    Cites_As_Authority( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#51ebfd5d-786e-3572-abc4-989a181528f8", "51ebfd5d-786e-3572-abc4-989a181528f8", "citesAsAuthority", java.util.Arrays.asList( "citesAsAuthority" ), "cites as authority", "http://purl.org/spar/cito/citesAsAuthority",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity confirms facts, ideas or statements presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("confirms")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/confirms" )
    Confirms( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#ac81e7f2-8ec8-3298-b0c8-b54e47369396", "ac81e7f2-8ec8-3298-b0c8-b54e47369396", "confirms", java.util.Arrays.asList( "confirms" ), "confirms", "http://purl.org/spar/cito/confirms",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity constitutes a formal retraction of the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("retracts")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/retracts" )
    Retracts( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#cae7021f-e4a1-379a-b2be-8947648e03ef", "cae7021f-e4a1-379a-b2be-8947648e03ef", "retracts", java.util.Arrays.asList( "retracts" ), "retracts", "http://purl.org/spar/cito/retracts",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity cites the cited entity as a source of information on the subject under discussion. */
    @javax.xml.bind.annotation.XmlEnumValue("citesForInformation")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/citesForInformation" )
    Cites_For_Information( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#8ed47473-8e02-3d30-a1cf-a2b22735d93e", "8ed47473-8e02-3d30-a1cf-a2b22735d93e", "citesForInformation", java.util.Arrays.asList( "citesForInformation" ), "cites for information", "http://purl.org/spar/cito/citesForInformation",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity cites the cited entity as an item of recommended reading.  This property can be used, for example, to describe references in a lecture reading list, where the cited references are relevant to the general topic of the lecture, but might not be individually cited within the text of the lecture.  Similarly, it could be used to describe items in a &#39;Suggested further reading&#39; list at the end of a book chapter. */
    @javax.xml.bind.annotation.XmlEnumValue("citesAsRecommendedReading")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/citesAsRecommendedReading" )
    Cites_As_Recommended_Reading( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#b4480021-d983-3634-a7e7-a67eb680a6b1", "b4480021-d983-3634-a7e7-a67eb680a6b1", "citesAsRecommendedReading", java.util.Arrays.asList( "citesAsRecommendedReading" ), "cites as recommended reading", "http://purl.org/spar/cito/citesAsRecommendedReading",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity obtains intellectual or factual support from the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("obtainsSupportFrom")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/obtainsSupportFrom" )
    Obtains_Support_From( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#afa6d307-9859-3ea3-9ff3-c976176eb901", "afa6d307-9859-3ea3-9ff3-c976176eb901", "obtainsSupportFrom", java.util.Arrays.asList( "obtainsSupportFrom" ), "obtains support from", "http://purl.org/spar/cito/obtainsSupportFrom",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity extends facts, ideas or understandings presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("extends")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/extends" )
    Extends( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#ae635f08-107a-3956-9e63-6835f24e6f6f", "ae635f08-107a-3956-9e63-6835f24e6f6f", "extends", java.util.Arrays.asList( "extends" ), "extends", "http://purl.org/spar/cito/extends",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity cites the cited entity as source of factual evidence for statements it contains. */
    @javax.xml.bind.annotation.XmlEnumValue("citesAsEvidence")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/citesAsEvidence" )
    Cites_As_Evidence( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#869fe4db-8152-3275-9551-4b7d63523e35", "869fe4db-8152-3275-9551-4b7d63523e35", "citesAsEvidence", java.util.Arrays.asList( "citesAsEvidence" ), "cites as evidence", "http://purl.org/spar/cito/citesAsEvidence",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity cites the cited entity as source of data. */
    @javax.xml.bind.annotation.XmlEnumValue("citesAsDataSource")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/citesAsDataSource" )
    Cites_As_Data_Source( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#58825490-2adf-3aa2-b0a8-a5586268f25e", "58825490-2adf-3aa2-b0a8-a5586268f25e", "citesAsDataSource", java.util.Arrays.asList( "citesAsDataSource" ), "cites as data source", "http://purl.org/spar/cito/citesAsDataSource",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity updates statements, ideas, hypotheses or understanding presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("updates")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/updates" )
    Updates( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#d05257d3-5204-3561-b5bf-a2650322d82d", "d05257d3-5204-3561-b5bf-a2650322d82d", "updates", java.util.Arrays.asList( "updates" ), "updates", "http://purl.org/spar/cito/updates",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity documents information about the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("documents")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/documents" )
    Documents( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#21f64da1-e579-3c82-95b9-64d159a14491", "21f64da1-e579-3c82-95b9-64d159a14491", "documents", java.util.Arrays.asList( "documents" ), "documents", "http://purl.org/spar/cito/documents",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity refutes statements, ideas or conclusions presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("refutes")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/refutes" )
    Refutes( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#263cb00b-a507-30cc-a312-452b17a8e723", "263cb00b-a507-30cc-a312-452b17a8e723", "refutes", java.util.Arrays.asList( "refutes" ), "refutes", "http://purl.org/spar/cito/refutes",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity describes work that uses conclusions presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("usesConclusionsFrom")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/usesConclusionsFrom" )
    Uses_Conclusions_From( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#49cd0ddf-89ab-3031-bbe0-ed12754ccd23", "49cd0ddf-89ab-3031-bbe0-ed12754ccd23", "usesConclusionsFrom", java.util.Arrays.asList( "usesConclusionsFrom" ), "uses conclusions from", "http://purl.org/spar/cito/usesConclusionsFrom",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity discusses statements, ideas or conclusions presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("discusses")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/discusses" )
    Discusses( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#b5242665-5a31-39f8-8550-caa461b61114", "b5242665-5a31-39f8-8550-caa461b61114", "discusses", java.util.Arrays.asList( "discusses" ), "discusses", "http://purl.org/spar/cito/discusses",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity imitates the characteristic style or content of the cited entity for comic effect, usually without explicit citation. */
    @javax.xml.bind.annotation.XmlEnumValue("parodies")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/parodies" )
    Parodies( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#5e0773b8-0b9f-3484-8f4a-75cdbe6e2dbe", "5e0773b8-0b9f-3484-8f4a-75cdbe6e2dbe", "parodies", java.util.Arrays.asList( "parodies" ), "parodies", "http://purl.org/spar/cito/parodies",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity obtains background information from the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("obtainsBackgroundFrom")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/obtainsBackgroundFrom" )
    Obtains_Background_From( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#611da52d-170c-3e14-bead-b6215f083ed0", "611da52d-170c-3e14-bead-b6215f083ed0", "obtainsBackgroundFrom", java.util.Arrays.asList( "obtainsBackgroundFrom" ), "obtains background from", "http://purl.org/spar/cito/obtainsBackgroundFrom",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity is used to create or compile the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("compiles")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/compiles" )
    Compiles( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#6915ccc3-0459-343c-81a9-06183a54deae", "6915ccc3-0459-343c-81a9-06183a54deae", "compiles", java.util.Arrays.asList( "compiles" ), "compiles", "http://purl.org/spar/cito/compiles",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity acknowledges contributions made by the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("credits")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/credits" )
    Credits( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#928735d6-f2c6-3bee-b16d-d511c8ccaf55", "928735d6-f2c6-3bee-b16d-d511c8ccaf55", "credits", java.util.Arrays.asList( "credits" ), "credits", "http://purl.org/spar/cito/credits",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity speculates on something within or related to the cited entity, without firm evidence. */
    @javax.xml.bind.annotation.XmlEnumValue("speculatesOn")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/speculatesOn" )
    Speculates_On( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#a5bc847f-8f2b-3725-8869-b3e203ee35d4", "a5bc847f-8f2b-3725-8869-b3e203ee35d4", "speculatesOn", java.util.Arrays.asList( "speculatesOn" ), "speculates on", "http://purl.org/spar/cito/speculatesOn",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity cites the cited entity as providing or containing a possible solution to the issues being discussed. */
    @javax.xml.bind.annotation.XmlEnumValue("citesAsPotentialSolution")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/citesAsPotentialSolution" )
    Cites_As_Potential_Solution( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#11473d85-e45b-393e-8516-b8c554f81361", "11473d85-e45b-393e-8516-b8c554f81361", "citesAsPotentialSolution", java.util.Arrays.asList( "citesAsPotentialSolution" ), "cites as potential solution", "http://purl.org/spar/cito/citesAsPotentialSolution",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity agrees with statements, ideas or conclusions presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("agreesWith")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/agreesWith" )
    Agrees_With( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#ce6eb625-a3d6-3fad-9860-af4f75508cbf", "ce6eb625-a3d6-3fad-9860-af4f75508cbf", "agreesWith", java.util.Arrays.asList( "agreesWith" ), "agrees with", "http://purl.org/spar/cito/agreesWith",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity disputes statements, ideas or conclusions presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("disputes")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/disputes" )
    Disputes( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#210d8463-b56c-3159-92d1-cc878da4f522", "210d8463-b56c-3159-92d1-cc878da4f522", "disputes", java.util.Arrays.asList( "disputes" ), "disputes", "http://purl.org/spar/cito/disputes",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) , 
   
    /* The citing entity reviews statements, ideas or conclusions presented in the cited entity. */
    @javax.xml.bind.annotation.XmlEnumValue("reviews")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/cito/reviews" )
    Reviews( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType#74dcb1ce-c508-34d2-b880-279f3dd19da9", "74dcb1ce-c508-34d2-b880-279f3dd19da9", "reviews", java.util.Arrays.asList( "reviews" ), "reviews", "http://purl.org/spar/cito/reviews",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.citationreltype._2018_02_16.BibliographicCitationType.Cites,  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType/2018-02-16"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType/2018-02-16"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.rel.citationreltype.BibliographicCitationType.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.rel.citationreltype.BibliographicCitationType.SCHEME_ID )
      .withVersion( "20200816-213254" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, BibliographicCitationType> index = indexByUUID(BibliographicCitationType.values());

  private TermDescription description;
  private BibliographicCitationTypeSeries series;

  public TermDescription getDescription() {
    return description;
  }

  BibliographicCitationType(final String conceptId, final String conceptUUID,
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
  public BibliographicCitationTypeSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.rel.citationreltype.BibliographicCitationType> asSeries() {
    return toSeries();
  }

  private BibliographicCitationTypeSeries toSeries() {
    if (series == null) {
      series = (BibliographicCitationTypeSeries) BibliographicCitationTypeSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<BibliographicCitationType> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<BibliographicCitationType> {
    protected BibliographicCitationType[] getValues() {
      return values();
    }
    @Override
    protected Optional<BibliographicCitationType> resolveUUID(UUID uuid) {
      return BibliographicCitationType.resolveUUID(uuid);
    }
  }


  public static Optional<BibliographicCitationType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<BibliographicCitationType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<BibliographicCitationType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<BibliographicCitationType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<BibliographicCitationType> resolveTag(final String tag) {
    Optional<BibliographicCitationType> l = resolveTerm(tag, BibliographicCitationType.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, BibliographicCitationType.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<BibliographicCitationType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<BibliographicCitationType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, BibliographicCitationType.values(), Term::getConceptId);
  }

  public static Optional<BibliographicCitationType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, BibliographicCitationType.values(), Term::getRef);
  }

}
