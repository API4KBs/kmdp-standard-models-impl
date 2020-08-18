package edu.mayo.ontology.taxonomies.kao.publishingrole._2017_09_04;

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
import edu.mayo.ontology.taxonomies.kao.publishingrole.PublishingRoleSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "PublishingRole")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( PublishingRole.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = PublishingRole.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = PublishingRole.JsonDeserializer.class )
public enum PublishingRole implements edu.mayo.ontology.taxonomies.kao.publishingrole.PublishingRole {


    /* The role a person has of authorship of some material (for example a document). */
    @javax.xml.bind.annotation.XmlEnumValue("author")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/author" )
    Author( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#02bd92fa-a38a-3a6c-80ea-75e59937a1ef", "02bd92fa-a38a-3a6c-80ea-75e59937a1ef", "author", java.util.Arrays.asList( "author" ), "author", "http://purl.org/spar/pro/author",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of an editor who has executive responsibility for the production of particular publication, usually acting under the authority of the Editor-in-Chief. */
    @javax.xml.bind.annotation.XmlEnumValue("executive-editor")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/executive-editor" )
    Executive_Editor( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#0584add8-5518-311b-9e63-2951b9a87531", "0584add8-5518-311b-9e63-2951b9a87531", "executive-editor", java.util.Arrays.asList( "executive-editor" ), "executive editor", "http://purl.org/spar/pro/executive-editor",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of a person who reads publications. */
    @javax.xml.bind.annotation.XmlEnumValue("reader")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/reader" )
    Reader( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#1de9b0a3-0075-3e8c-b03e-b420c103c320", "1de9b0a3-0075-3e8c-b03e-b420c103c320", "reader", java.util.Arrays.asList( "reader" ), "reader", "http://purl.org/spar/pro/reader",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of a professional writer who assists an aspiring author lacking authorship skills to write a book or article for publication, for example by helping the author to create grammatically correct and lucid prose, or who writes the book on behalf of the named author, without himself/herself claiming authorship. */
    @javax.xml.bind.annotation.XmlEnumValue("ghost-writer")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/ghost-writer" )
    Ghost_Writer( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#d57a12d7-9460-376b-a06b-328f6c0aa1c1", "d57a12d7-9460-376b-a06b-328f6c0aa1c1", "ghost-writer", java.util.Arrays.asList( "ghost-writer" ), "ghost writer", "http://purl.org/spar/pro/ghost-writer",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of an academic peer in evaluating a manuscript submitted by an author for publication as a journal article on behalf of the journal editor, or a conference paper on behalf of the conference programme committee, and in deciding whether it is suitable for acceptance, usually subject to revisions suggested by the peer-reviewer. */
    @javax.xml.bind.annotation.XmlEnumValue("peer-reviewer")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/peer-reviewer" )
    Peer_Reviewer( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#0a7e0095-39df-3ed2-a1f9-a0cbbfc77176", "0a7e0095-39df-3ed2-a1f9-a0cbbfc77176", "peer-reviewer", java.util.Arrays.asList( "peer-reviewer" ), "peer reviewer", "http://purl.org/spar/pro/peer-reviewer",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of owning the copyright to a publication, usually held by the author or by the publishing house that publishes the author&#39;s work. */
    @javax.xml.bind.annotation.XmlEnumValue("copyright-owner")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/copyright-owner" )
    Copyright_Owner( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#d88e6848-93ce-310b-83a5-02a3d9f0670f", "d88e6848-93ce-310b-83a5-02a3d9f0670f", "copyright-owner", java.util.Arrays.asList( "copyright-owner" ), "copyright owner", "http://purl.org/spar/pro/copyright-owner",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of an editor who actively commissions authors to write books to be published by the publishing house for which the commissioning editor works. */
    @javax.xml.bind.annotation.XmlEnumValue("commissioning-editor")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/commissioning-editor" )
    Commissioning_Editor( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#3862fdeb-eebd-35ff-92e8-cd57598df647", "3862fdeb-eebd-35ff-92e8-cd57598df647", "commissioning-editor", java.util.Arrays.asList( "commissioning-editor" ), "commissioning editor", "http://purl.org/spar/pro/commissioning-editor",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role an agent has of compiling a number of items into a compilation or collection. */
    @javax.xml.bind.annotation.XmlEnumValue("compiler")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/compiler" )
    Compiler( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#87f75ce3-f908-3819-a9a2-c77ffeffcc38", "87f75ce3-f908-3819-a9a2-c77ffeffcc38", "compiler", java.util.Arrays.asList( "compiler" ), "compiler", "http://purl.org/spar/pro/compiler",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of an editor who undertakes alterations to the text of a document submitted for publication to improve the formatting, style and accuracy of text, or to bring the text into the house style of the publisher (e.g. Americanization of British spelling), without intentionally altering the substance or meaning of the text. */
    @javax.xml.bind.annotation.XmlEnumValue("copy-editor")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/copy-editor" )
    Copy_Editor( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#d0f970f7-3c3f-3574-873c-9ad1f18d431b", "d0f970f7-3c3f-3574-873c-9ad1f18d431b", "copy-editor", java.util.Arrays.asList( "copy-editor" ), "copy editor", "http://purl.org/spar/pro/copy-editor",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of an agent involved in printing documents, either a company providing printing services or an individual engaged in the process of printing documents. */
    @javax.xml.bind.annotation.XmlEnumValue("printer")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/printer" )
    Printer( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#a9358f4c-e027-38d5-b5a2-a70818b2a6da", "a9358f4c-e027-38d5-b5a2-a70818b2a6da", "printer", java.util.Arrays.asList( "printer" ), "printer", "http://purl.org/spar/pro/printer",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of an author who writes biographies. */
    @javax.xml.bind.annotation.XmlEnumValue("biographer")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/biographer" )
    Biographer( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#ec18aded-60a5-3eef-a1bd-d2df45e3bf9c", "ec18aded-60a5-3eef-a1bd-d2df45e3bf9c", "biographer", java.util.Arrays.asList( "biographer" ), "biographer", "http://purl.org/spar/pro/biographer",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of someone who is a guest editor, for example for a special themed issue of a journal. */
    @javax.xml.bind.annotation.XmlEnumValue("guest-editor")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/guest-editor" )
    Guest_Editor( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#92a42ffb-3aeb-35df-bb4d-da9e004975f8", "92a42ffb-3aeb-35df-bb4d-da9e004975f8", "guest-editor", java.util.Arrays.asList( "guest-editor" ), "guest editor", "http://purl.org/spar/pro/guest-editor",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of an editor who has management responsibility for the production of particular publication, usually acting under the authority of the Executive Editor and the Editor-in-Chief. */
    @javax.xml.bind.annotation.XmlEnumValue("managing-editor")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/managing-editor" )
    Managing_Editor( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#1b16fb3e-1af1-3099-a43b-d0fc3aa78c0a", "1b16fb3e-1af1-3099-a43b-d0fc3aa78c0a", "managing-editor", java.util.Arrays.asList( "managing-editor" ), "managing editor", "http://purl.org/spar/pro/managing-editor",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of an agent that translates a document into another language. */
    @javax.xml.bind.annotation.XmlEnumValue("translator")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/translator" )
    Translator( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#607f2f30-99f2-3347-b327-caa70e0be4b2", "607f2f30-99f2-3347-b327-caa70e0be4b2", "translator", java.util.Arrays.asList( "translator" ), "translator", "http://purl.org/spar/pro/translator",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of someone who acts as a producer. */
    @javax.xml.bind.annotation.XmlEnumValue("producer")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/producer" )
    Producer( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#f18122dd-ebc4-341b-8ed7-58b3f0817da8", "f18122dd-ebc4-341b-8ed7-58b3f0817da8", "producer", java.util.Arrays.asList( "producer" ), "producer", "http://purl.org/spar/pro/producer",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of a person who manages, undertakes and supervises the work of a library. */
    @javax.xml.bind.annotation.XmlEnumValue("librarian")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/librarian" )
    Librarian( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#35fa1bcb-6fbf-37aa-b43a-a7f253507176", "35fa1bcb-6fbf-37aa-b43a-a7f253507176", "librarian", java.util.Arrays.asList( "librarian" ), "librarian", "http://purl.org/spar/pro/librarian",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of a person who manages, undertakes and supervises the work of an archive.  [This term is typically used with respect to a document archive, whereas the term data curator is used with respect to a data archive.] */
    @javax.xml.bind.annotation.XmlEnumValue("archivist")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/archivist" )
    Archivist( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#5ee4d145-0a1d-3307-950b-97782655e5e4", "5ee4d145-0a1d-3307-950b-97782655e5e4", "archivist", java.util.Arrays.asList( "archivist" ), "archivist", "http://purl.org/spar/pro/archivist",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of the person who has editorial responsibility for publication series, for example a book series. */
    @javax.xml.bind.annotation.XmlEnumValue("series-editor")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/series-editor" )
    Series_Editor( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#938bff79-8ef0-3df7-be56-75d693cea0be", "938bff79-8ef0-3df7-be56-75d693cea0be", "series-editor", java.util.Arrays.asList( "series-editor" ), "series editor", "http://purl.org/spar/pro/series-editor",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of an editor who takes responsibility for the passage of a document through the various stages of the publication workflow from the submitted manuscript to the final publication, including responsibility for scheduling and budget. */
    @javax.xml.bind.annotation.XmlEnumValue("production-editor")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/production-editor" )
    Production_Editor( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#f1516046-e881-37b9-93d2-63ebce98835b", "f1516046-e881-37b9-93d2-63ebce98835b", "production-editor", java.util.Arrays.asList( "production-editor" ), "production editor", "http://purl.org/spar/pro/production-editor",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of an agent that illustrates a document. */
    @javax.xml.bind.annotation.XmlEnumValue("illustrator")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/illustrator" )
    Illustrator( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#726f06c3-fbcc-3e37-b04c-54fe29679c1f", "726f06c3-fbcc-3e37-b04c-54fe29679c1f", "illustrator", java.util.Arrays.asList( "illustrator" ), "illustrator", "http://purl.org/spar/pro/illustrator",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of an author who writes blog posts. */
    @javax.xml.bind.annotation.XmlEnumValue("blogger")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/blogger" )
    Blogger( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#9c1252fa-60c8-3778-ba52-81273c8a5d0c", "9c1252fa-60c8-3778-ba52-81273c8a5d0c", "blogger", java.util.Arrays.asList( "blogger" ), "blogger", "http://purl.org/spar/pro/blogger",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of an author who writes evaluations and criticisms of, for example, plays or other works of art. */
    @javax.xml.bind.annotation.XmlEnumValue("critic")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/critic" )
    Critic( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#9e09e4f9-6291-37f3-9bd6-188c0fc16a06", "9e09e4f9-6291-37f3-9bd6-188c0fc16a06", "critic", java.util.Arrays.asList( "critic" ), "critic", "http://purl.org/spar/pro/critic",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of a person who selects and prepares for publication material created and submitted by authors, having oversight of its content, format and presentation. */
    @javax.xml.bind.annotation.XmlEnumValue("editor")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/editor" )
    Editor( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#5aee9dbd-2a18-3839-9050-73571bee1b1f", "5aee9dbd-2a18-3839-9050-73571bee1b1f", "editor", java.util.Arrays.asList( "editor" ), "editor", "http://purl.org/spar/pro/editor",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of a person who distributes or disseminates publications or other resources. */
    @javax.xml.bind.annotation.XmlEnumValue("distributor")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/distributor" )
    Distributor( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#dd7bcee1-6119-3cb8-bba7-65eb595eba87", "dd7bcee1-6119-3cb8-bba7-65eb595eba87", "distributor", java.util.Arrays.asList( "distributor" ), "distributor", "http://purl.org/spar/pro/distributor",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of a person or an organization that published material, or of a publisher&#39;s employee who has responsibility for such publications. */
    @javax.xml.bind.annotation.XmlEnumValue("publisher")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/publisher" )
    Publisher( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#52aded16-5360-352a-8f58-57571d96d68f", "52aded16-5360-352a-8f58-57571d96d68f", "publisher", java.util.Arrays.asList( "publisher" ), "publisher", "http://purl.org/spar/pro/publisher",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role an agent has of contribution of some material (for example an article to a magazine). */
    @javax.xml.bind.annotation.XmlEnumValue("contributor")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/contributor" )
    Contributor( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#bba23486-31bb-3ef0-a2b7-3dde6b38fdc1", "bba23486-31bb-3ef0-a2b7-3dde6b38fdc1", "contributor", java.util.Arrays.asList( "contributor" ), "contributor", "http://purl.org/spar/pro/contributor",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of a person who reads the proofs of documents to detect any errors prior to final publication. */
    @javax.xml.bind.annotation.XmlEnumValue("proof-reader")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/proof-reader" )
    Proof_Reader( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#0980d69c-c7b7-3613-94d1-29ea0c8d1757", "0980d69c-c7b7-3613-94d1-29ea0c8d1757", "proof-reader", java.util.Arrays.asList( "proof-reader" ), "proof reader", "http://purl.org/spar/pro/proof-reader",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* A person who finds work for professional authors, manages their contracts, and works to advance their careers, charging their clients as fees for their services a percentage of the money made from the authors&#39; writings. */
    @javax.xml.bind.annotation.XmlEnumValue("authors-agent")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/authors-agent" )
    Author_S_Agent( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#58b94b8b-7c2b-3d65-86ea-d45e5603749c", "58b94b8b-7c2b-3d65-86ea-d45e5603749c", "authors-agent", java.util.Arrays.asList( "authors-agent" ), "author&#39;s agent", "http://purl.org/spar/pro/authors-agent",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of a senior editor of a publication who deputizes for the Editor-in-Chief. */
    @javax.xml.bind.annotation.XmlEnumValue("deputy-editor")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/deputy-editor" )
    Deputy_Editor( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#85f8fc76-ee68-301a-a1dc-e97d71d73b22", "85f8fc76-ee68-301a-a1dc-e97d71d73b22", "deputy-editor", java.util.Arrays.asList( "deputy-editor" ), "deputy editor", "http://purl.org/spar/pro/deputy-editor",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of the person who has final responsibility for the editorial operations and policies for a particular publication. */
    @javax.xml.bind.annotation.XmlEnumValue("editor-in-chief")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/editor-in-chief" )
    Editor_In_Chief( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#32677f9a-b432-35b3-ad80-7a457adeb17c", "32677f9a-b432-35b3-ad80-7a457adeb17c", "editor-in-chief", java.util.Arrays.asList( "editor-in-chief" ), "editor-in-chief", "http://purl.org/spar/pro/editor-in-chief",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of a person who subjects a publication to a written review and critical analysis of its content, scope and quality. */
    @javax.xml.bind.annotation.XmlEnumValue("reviewer")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/reviewer" )
    Reviewer( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#7ba917e4-e515-3c8a-9ed6-eda08a6ec572", "7ba917e4-e515-3c8a-9ed6-eda08a6ec572", "reviewer", java.util.Arrays.asList( "reviewer" ), "reviewer", "http://purl.org/spar/pro/reviewer",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of an author who writes newspaper or magazine news reports or articles. */
    @javax.xml.bind.annotation.XmlEnumValue("journalist")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/journalist" )
    Journalist( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#82ad21b5-762c-36c3-ab61-1a807982ab76", "82ad21b5-762c-36c3-ab61-1a807982ab76", "journalist", java.util.Arrays.asList( "journalist" ), "journalist", "http://purl.org/spar/pro/journalist",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The role of the person who has senior responsibility for the editorial operations and policies for a particular publication, usually acting under the authority of the Editor-in-Chief. */
    @javax.xml.bind.annotation.XmlEnumValue("senior-editor")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pro/senior-editor" )
    Senior_Editor( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole#bc951e9d-3f1b-3ed2-806e-e1dcac0237c1", "bc951e9d-3f1b-3ed2-806e-e1dcac0237c1", "senior-editor", java.util.Arrays.asList( "senior-editor" ), "senior editor", "http://purl.org/spar/pro/senior-editor",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/PublishingRole/2017-09-04"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/PublishingRole/2017-09-04"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.publishingrole.PublishingRole.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.publishingrole.PublishingRole.SCHEME_ID )
      .withVersion( "20200816-213233" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, PublishingRole> index = indexByUUID(PublishingRole.values());

  private TermDescription description;
  private PublishingRoleSeries series;

  public TermDescription getDescription() {
    return description;
  }

  PublishingRole(final String conceptId, final String conceptUUID,
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
  public PublishingRoleSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.publishingrole.PublishingRole> asSeries() {
    return toSeries();
  }

  private PublishingRoleSeries toSeries() {
    if (series == null) {
      series = (PublishingRoleSeries) PublishingRoleSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<PublishingRole> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<PublishingRole> {
    protected PublishingRole[] getValues() {
      return values();
    }
    @Override
    protected Optional<PublishingRole> resolveUUID(UUID uuid) {
      return PublishingRole.resolveUUID(uuid);
    }
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
    Optional<PublishingRole> l = resolveTerm(tag, PublishingRole.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, PublishingRole.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<PublishingRole> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<PublishingRole> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, PublishingRole.values(), Term::getConceptId);
  }

  public static Optional<PublishingRole> resolveRef(final URI refUri) {
    return resolveTerm(refUri, PublishingRole.values(), Term::getRef);
  }

}
