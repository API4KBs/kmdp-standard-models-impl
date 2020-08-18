package edu.mayo.ontology.taxonomies.kao.publicationstatus._2014_02_01;

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
import edu.mayo.ontology.taxonomies.kao.publicationstatus.PublicationStatusSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "PublicationStatus")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( PublicationStatus.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = PublicationStatus.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = PublicationStatus.JsonDeserializer.class )
public enum PublicationStatus implements edu.mayo.ontology.taxonomies.kao.publicationstatus.PublicationStatus {


    /* The status of a publication (for example a book) that has been republished in a different edition or in translation, or of a work (for example a journal article or a poem) that is republished as part of a collection or an anthology, or of material (for example a figure from an existing publication) that is republished as part of a quite different publication.  Where the publisher of the new work is different from the original publisher, such republication typically includes an acknowledgement of the source and copyright of the original material, and is undertaken after obtaining permission of the original copyright holder. */
    @javax.xml.bind.annotation.XmlEnumValue("republished")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/republished" )
    Republished( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#bddb54bc-7106-3dbb-8b39-489f0cd6b6b2", "bddb54bc-7106-3dbb-8b39-489f0cd6b6b2", "republished", java.util.Arrays.asList( "republished" ), "republished", "http://purl.org/spar/pso/republished",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a work (for example a document or a dataset) that has been submitted for publication by the author to a publisher or a data repository, prior to its being accepted or rejected. */
    @javax.xml.bind.annotation.XmlEnumValue("submitted")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/submitted" )
    Submitted( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#410d9893-9d41-36ad-b562-b97046d2a3eb", "410d9893-9d41-36ad-b562-b97046d2a3eb", "submitted", java.util.Arrays.asList( "submitted" ), "submitted", "http://purl.org/spar/pso/submitted",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a published work which is both free to read on-line, and to which additional usage rights apply, for example the right to text mine, make derivative works, re-use and re-publish the published work, such rights frequently being defined by application of an explicit license such as a Creative Commons license.  [See also: pso:open-access, pso:gratis-open-access, pso:gold-open-access, pso:green-open-access, pso:embargoed and pso:subscription-access.] */
    @javax.xml.bind.annotation.XmlEnumValue("libre-open-access")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/libre-open-access" )
    Libre_Open_Access( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#066a4b28-b5bb-390c-8e29-8fa35cb5c2a2", "066a4b28-b5bb-390c-8e29-8fa35cb5c2a2", "libre-open-access", java.util.Arrays.asList( "libre-open-access" ), "libre open access", "http://purl.org/spar/pso/libre-open-access",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a work (for example a document or a dataset) that has been updated or enhanced, for example by the provision of additional or supplementary material. */
    @javax.xml.bind.annotation.XmlEnumValue("enhanced")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/enhanced" )
    Enhanced( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#10620571-dcb5-3fdc-83d7-b0113ff25bda", "10620571-dcb5-3fdc-83d7-b0113ff25bda", "enhanced", java.util.Arrays.asList( "enhanced" ), "enhanced", "http://purl.org/spar/pso/enhanced",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a work (for example a document or a dataset) in which errors, that may have introduced by the author, by a publisher, or by some automated process, have been corrected. */
    @javax.xml.bind.annotation.XmlEnumValue("corrected")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/corrected" )
    Corrected( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#3bb94c8f-b943-3244-8e9c-3ab2efd8eb64", "3bb94c8f-b943-3244-8e9c-3ab2efd8eb64", "corrected", java.util.Arrays.asList( "corrected" ), "corrected", "http://purl.org/spar/pso/corrected",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a pre-publication work (for example a document or a dataset) part-way through its development. */
    @javax.xml.bind.annotation.XmlEnumValue("intermediate-draft")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/intermediate-draft" )
    Intermediate_Draft( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#8e22d83e-4a93-327c-9a54-f09f37324521", "8e22d83e-4a93-327c-9a54-f09f37324521", "intermediate-draft", java.util.Arrays.asList( "intermediate-draft" ), "intermediate draft", "http://purl.org/spar/pso/intermediate-draft",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a document that has been received from the author(s) by an editor or a publisher for potential publication, and then has been sent to independent reviewers for their comments as to its suitability for publication, prior to receipt of such reviews. */
    @javax.xml.bind.annotation.XmlEnumValue("under-review")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/under-review" )
    Under_Review( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#d222cba9-1124-361b-a1a9-0cbd75a3f56c", "d222cba9-1124-361b-a1a9-0cbd75a3f56c", "under-review", java.util.Arrays.asList( "under-review" ), "under review", "http://purl.org/spar/pso/under-review",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a document containing information that may be shared publicly. */
    @javax.xml.bind.annotation.XmlEnumValue("non-confidential")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/non-confidential" )
    Non_Confidential( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#796d67d5-eeb8-3222-92db-9c2e23256297", "796d67d5-eeb8-3222-92db-9c2e23256297", "non-confidential", java.util.Arrays.asList( "non-confidential" ), "non-confidential", "http://purl.org/spar/pso/non-confidential",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a document that has been subjected to copy editing, i.e. alterations to the text undertaken by someone other than the author that are designed to improve the formatting, style and accuracy of text, or to bring the text into the house style of the publisher (e.g. Americanization of British spelling), but that are not designed to alter the substance or meaning of the text. */
    @javax.xml.bind.annotation.XmlEnumValue("copy-edited")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/copy-edited" )
    Copy_Edited( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#ca50cfcc-f8d5-361c-87ef-2cdc895170ae", "ca50cfcc-f8d5-361c-87ef-2cdc895170ae", "copy-edited", java.util.Arrays.asList( "copy-edited" ), "copy-edited", "http://purl.org/spar/pso/copy-edited",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a work (typically a private or secret paper or a confidential dataset) that is typically held unpublished in a &#39;dark&#39; archive whose existence is unknown by the wider world, and that is only available to the owner or copyright holder of the asset. */
    @javax.xml.bind.annotation.XmlEnumValue("closed-access")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/closed-access" )
    Closed_Access( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#616ccd07-b3ff-349e-b402-70692697b62a", "616ccd07-b3ff-349e-b402-70692697b62a", "closed-access", java.util.Arrays.asList( "closed-access" ), "closed access", "http://purl.org/spar/pso/closed-access",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a pre-publication work (for example a document or a dataset) when in the authors&#39; opinion it has been brought to a stage of development that renders it suitable for publication. */
    @javax.xml.bind.annotation.XmlEnumValue("final-draft")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/final-draft" )
    Final_Draft( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#9e28825f-032e-340a-bbf6-1e093e7d7ac7", "9e28825f-032e-340a-bbf6-1e093e7d7ac7", "final-draft", java.util.Arrays.asList( "final-draft" ), "final draft", "http://purl.org/spar/pso/final-draft",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a work (for example a document or a dataset) prior to completion and publication. */
    @javax.xml.bind.annotation.XmlEnumValue("draft")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/draft" )
    Draft( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#f91b2829-bf86-33e3-9809-4e1dedb6f947", "f91b2829-bf86-33e3-9809-4e1dedb6f947", "draft", java.util.Arrays.asList( "draft" ), "draft", "http://purl.org/spar/pso/draft",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of material (for example a document or a dataset) after it has been rejected for publication by a publisher or data repository. */
    @javax.xml.bind.annotation.XmlEnumValue("rejected-for-publication")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/rejected-for-publication" )
    Rejected_For_Publication( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#f7205f1f-3197-39b5-a0aa-e55597635d5e", "f7205f1f-3197-39b5-a0aa-e55597635d5e", "rejected-for-publication", java.util.Arrays.asList( "rejected-for-publication" ), "rejected for publication", "http://purl.org/spar/pso/rejected-for-publication",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a work (for example a document or a dataset) that has been saved for long-term preservation in a physical or electronic archive. */
    @javax.xml.bind.annotation.XmlEnumValue("archived")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/archived" )
    Archived( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#0d111f56-9649-35f5-a2aa-aaf9d2980787", "0d111f56-9649-35f5-a2aa-aaf9d2980787", "archived", java.util.Arrays.asList( "archived" ), "archived", "http://purl.org/spar/pso/archived",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a published work, for example a book or a journal article, that has been subjected to a written review giving critical analysis of its content, scope and quality.  [See also pso:peer-reviewed.] */
    @javax.xml.bind.annotation.XmlEnumValue("reviewed")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/reviewed" )
    Reviewed( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#1f7b6951-ed4d-3a88-9b4f-ff0a98a3d96e", "1f7b6951-ed4d-3a88-9b4f-ff0a98a3d96e", "reviewed", java.util.Arrays.asList( "reviewed" ), "reviewed", "http://purl.org/spar/pso/reviewed",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a work (for example a document or a dataset) that has not been published by the author, a publisher or a data repository. */
    @javax.xml.bind.annotation.XmlEnumValue("unpublished")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/unpublished" )
    Unpublished( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#3ebd43fb-0ca8-3e5d-8aae-6b6f19703a39", "3ebd43fb-0ca8-3e5d-8aae-6b6f19703a39", "unpublished", java.util.Arrays.asList( "unpublished" ), "unpublished", "http://purl.org/spar/pso/unpublished",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a document after it has been accepted for publication and prior to its formal publication in print.  (Note that for many journal articles that are published electronically, this status rarely exists, since there is commonly no delay between acceptance and publication.) */
    @javax.xml.bind.annotation.XmlEnumValue("in-press")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/in-press" )
    In_Press( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#e8d02d99-8570-3cca-9cfd-d700245d5c74", "e8d02d99-8570-3cca-9cfd-d700245d5c74", "in-press", java.util.Arrays.asList( "in-press" ), "in press", "http://purl.org/spar/pso/in-press",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a work that is subjected to an embargo, which means that the work cannot be published, or in the case of a press release that it cannot be reported on, until a particular date known as the embargo date.  For open-access journal articles, an embargoed article is one in which availability of the open-access version of the article is delayed by the publisher for a substantial embargo period, typically of six or twelve months, after subscription-access availability of the published work.   */
    @javax.xml.bind.annotation.XmlEnumValue("embargoed")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/embargoed" )
    Embargoed( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#a518622c-abb0-3bea-b6f0-04f71987763f", "a518622c-abb0-3bea-b6f0-04f71987763f", "embargoed", java.util.Arrays.asList( "embargoed" ), "embargoed", "http://purl.org/spar/pso/embargoed",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a pre-publication document late in the publication process, once it has been accepted for publication by a publisher, after the inclusion of any author corrections required by the editor following peer-review, following copy editing and formatting to bring the manuscript into the house style, and prior to final checking by the editor, proof-reader and author to detect and eliminate any errors prior to publication. */
    @javax.xml.bind.annotation.XmlEnumValue("proof")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/proof" )
    Proof( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#028dce7f-598c-380b-a369-7045a8316ce2", "028dce7f-598c-380b-a369-7045a8316ce2", "proof", java.util.Arrays.asList( "proof" ), "proof", "http://purl.org/spar/pso/proof",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a document or dataset that has been subjected to anonymization, so that individual persons, for example the authors and/or people that are the subjects described in the document or dataset, cannot be identified. */
    @javax.xml.bind.annotation.XmlEnumValue("anonymized")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/anonymized" )
    Anonymized( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#3dd247ca-998d-3d9a-94e8-bc3e316248e9", "3dd247ca-998d-3d9a-94e8-bc3e316248e9", "anonymized", java.util.Arrays.asList( "anonymized" ), "anonymized", "http://purl.org/spar/pso/anonymized",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a published work which is free to read on-line, in contrast to subscription-access works, but to which licensing restrictions apply, limiting the possibilities for downloading, text mining, modification, re-publication or re-use of the published work.  The term Gratis Open Access thus signifies absence of a price barrier to view.  While both imply free (a potentially ambiguous word), Gratis Open Access equates to free as in beer while Libre Open Access (q.v.) equates to free as in speech.  Gratis Open Access is thus a necessary but not a sufficient condition for true Libre Open Access.   Many open access publications by commercial scholarly publishers are only Gratis Open Access, while almost all publications by pure Open Access scholarly publishers are Libre Open Access. [See also: pso:open-access, pso:libre-open-access, pso:gold-open-access, pso:green-open-access, pso:embargoed and pso:subscription-access.] */
    @javax.xml.bind.annotation.XmlEnumValue("gratis-open-access")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/gratis-open-access" )
    Gratis_Open_Access( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#1cf38cc8-84a4-35fd-a0d3-930f78fdb4e5", "1cf38cc8-84a4-35fd-a0d3-930f78fdb4e5", "gratis-open-access", java.util.Arrays.asList( "gratis-open-access" ), "gratis open access", "http://purl.org/spar/pso/gratis-open-access",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of material (for example a document or a dataset) that has been published, i.e. made available for people to access, read or use, either freely or for a purchase price or an access fee. */
    @javax.xml.bind.annotation.XmlEnumValue("published")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/published" )
    Published( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#8f888fed-f6bd-3ff7-893c-6d76bb8dc21c", "8f888fed-f6bd-3ff7-893c-6d76bb8dc21c", "published", java.util.Arrays.asList( "published" ), "published", "http://purl.org/spar/pso/published",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The final version of a document that has been formally published as a peer-reviewed journal article, citable via a permanent identifier, and forming an abiding component of the scholarly record. */
    @javax.xml.bind.annotation.XmlEnumValue("version-of-record")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/version-of-record" )
    Version_Of_Record( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#0311978d-38d4-3b1b-90cd-75c1088a0173", "0311978d-38d4-3b1b-90cd-75c1088a0173", "version-of-record", java.util.Arrays.asList( "version-of-record" ), "version of record", "http://purl.org/spar/pso/version-of-record",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a work (for example a document or a dataset) once it has been accepted for publication by a publisher or data repository. */
    @javax.xml.bind.annotation.XmlEnumValue("accepted-for-publication")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/accepted-for-publication" )
    Accepted_For_Publication( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#4dc665b2-4b5b-3771-b44b-470be242c55e", "4dc665b2-4b5b-3771-b44b-470be242c55e", "accepted-for-publication", java.util.Arrays.asList( "accepted-for-publication" ), "accepted for publication", "http://purl.org/spar/pso/accepted-for-publication",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a published work, typically an article in a journal issue, that is not available to read without payment of an article access fee or a journal subscription fee for that publication. */
    @javax.xml.bind.annotation.XmlEnumValue("subscription-access")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/subscription-access" )
    Subscription_Access( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#add4f225-f44b-37ef-9936-68331f74c94e", "add4f225-f44b-37ef-9936-68331f74c94e", "subscription-access", java.util.Arrays.asList( "subscription-access" ), "subscription access", "http://purl.org/spar/pso/subscription-access",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a publication that has been subsequently retracted by the publisher, for example because it was subsequently found to contain erroneous or fraudulent information. */
    @javax.xml.bind.annotation.XmlEnumValue("retracted-from-publication")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/retracted-from-publication" )
    Retracted_From_Publication( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#6370a2f1-10a1-3e01-a0b4-b568cab64ddd", "6370a2f1-10a1-3e01-a0b4-b568cab64ddd", "retracted-from-publication", java.util.Arrays.asList( "retracted-from-publication" ), "retracted from publication", "http://purl.org/spar/pso/retracted-from-publication",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a published work made available by the author, by self-archiving a version of the work for free and open public use in their institutional repository, in a central repository, or elsewhere, in parallel with publication of a subscription-access Version of Record of the work by a publisher.  The green open-access version of the work may be a preprint (the version of the article as first submitted for publication) or a postprint (the pre-publication version of the article after incorporation of authors responses to peer reviewers comments).  Its availability may have an embargo restriction imposed by the publisher of the subscription-access version of the work, that prevents the green open-access version from being freely available until some substantial time after publication of the subscription-access journal issue containing that article.  A green open-access work should be accompanied by a license explicitly defining usage rights, for example a Creative Commons Attribution License.  [See also: pso:open-access, pso:gratis-open-access, pso:libre-open-access, pso:gold-open-access, pso:embargoed and pso:subscription-access.] */
    @javax.xml.bind.annotation.XmlEnumValue("green-open-access")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/green-open-access" )
    Green_Open_Access( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#a1d8d8ff-25fc-33cf-8d9f-219c0883f9a5", "a1d8d8ff-25fc-33cf-8d9f-219c0883f9a5", "green-open-access", java.util.Arrays.asList( "green-open-access" ), "green open access", "http://purl.org/spar/pso/green-open-access",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a work, typically a scholarly journal article, that has been peer reviewed, i.e. subjected to review by two or more independent reviewers (also know as referees) who are academic peers of the author(s), and judged by them to be of sufficient quality to merit publication, usually after further revision by the author to incorporate the reviewers&#39; suggested modifications and improvements. */
    @javax.xml.bind.annotation.XmlEnumValue("peer-reviewed")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/peer-reviewed" )
    Peer_Reviewed( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#aa944e6c-b76d-3e69-8b74-a741859e38f6", "aa944e6c-b76d-3e69-8b74-a741859e38f6", "peer-reviewed", java.util.Arrays.asList( "peer-reviewed" ), "peer reviewed", "http://purl.org/spar/pso/peer-reviewed",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a work (for example a document or a dataset) concerning which metadata has been stored in a physical or electronic catalogue. */
    @javax.xml.bind.annotation.XmlEnumValue("catalogued")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/catalogued" )
    Catalogued( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#806552d7-efc7-3e39-bf2e-b271c9df5d37", "806552d7-efc7-3e39-bf2e-b271c9df5d37", "catalogued", java.util.Arrays.asList( "catalogued" ), "catalogued", "http://purl.org/spar/pso/catalogued",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a published work (typically a scholarly publication or a dataset) that is freely available via the Internet for third parties to read without payment of access or subscription fees, and (in the case of a work published under a full open-access license) that is freely available to download and reuse for any purposes including commercial ones, including modification of the original work, its integration with other material, and its re-publication, subject typically to a requirement that the original authors and the source of the original work are acknowledged in compliance with scholarly citation norms. [See also: pso:gratis-open-access, pso:libre-open-access, pso:gold-open-access, pso:green-open-access, pso:embargoed and pso:subscription-access.] */
    @javax.xml.bind.annotation.XmlEnumValue("open-access")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/open-access" )
    Open_Access( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#d270ed17-1cea-3cff-ad11-0e317201e9a8", "d270ed17-1cea-3cff-ad11-0e317201e9a8", "open-access", java.util.Arrays.asList( "open-access" ), "open access", "http://purl.org/spar/pso/open-access",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a work (for example a pre-publication document or dataset) that has been voluntarily withdrawn by the author, having previously been submitted for publication, perhaps because the revisions requested by the peer-reviewers were considered impossible to achieve, or because the author wishes to submit it for publication elsewhere. */
    @javax.xml.bind.annotation.XmlEnumValue("withdrawn-from-submission")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/withdrawn-from-submission" )
    Withdrawn_From_Submission( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#d47cb8a8-dac9-3f6a-a880-cc1667879f2d", "d47cb8a8-dac9-3f6a-a880-cc1667879f2d", "withdrawn-from-submission", java.util.Arrays.asList( "withdrawn-from-submission" ), "withdrawn from submission", "http://purl.org/spar/pso/withdrawn-from-submission",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a work (typically a scholarly paper or a dataset) to which access is restricted.  For example, confidential information to which access is made available only to those who have been approved by the owner or copyright holder of the asset after personal application, or to those with appropriate security clearance, or to those within a partnership. */
    @javax.xml.bind.annotation.XmlEnumValue("restricted-access")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/restricted-access" )
    Restricted_Access( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#f17ee323-c7c0-3a08-81ab-44617f028abb", "f17ee323-c7c0-3a08-81ab-44617f028abb", "restricted-access", java.util.Arrays.asList( "restricted-access" ), "restricted access", "http://purl.org/spar/pso/restricted-access",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a document containing information that must be kept confidential. */
    @javax.xml.bind.annotation.XmlEnumValue("confidential")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/confidential" )
    Confidential( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#35de502b-0c10-3a63-809d-a8d1ece87598", "35de502b-0c10-3a63-809d-a8d1ece87598", "confidential", java.util.Arrays.asList( "confidential" ), "confidential", "http://purl.org/spar/pso/confidential",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a published work, typically a journal article, made available by the publisher on the publisher&#39;s own web site for third parties to read without payment of access or subscription fees.  Gold open access has the benefit that the article is findable where you expect it to be, but licensing restrictions may limit the possibilities for downloading, text mining, modification, re-publication or re-use of the published work.  Gold open-access publication typically involves payment by the author or his/her institution to the publisher of an article processing charge (aka an author publishing charge).  [See also: pso:open-access, pso:gratis-open-access, pso:libre-open-access, pso:green-open-access, pso:embargoed and pso:subscription-access.] */
    @javax.xml.bind.annotation.XmlEnumValue("gold-open-access")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/gold-open-access" )
    Gold_Open_Access( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#e316b88e-a0e9-3bd6-a6ab-c1d274bf5062", "e316b88e-a0e9-3bd6-a6ab-c1d274bf5062", "gold-open-access", java.util.Arrays.asList( "gold-open-access" ), "gold open access", "http://purl.org/spar/pso/gold-open-access",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of a pre-publication work (for example a document or a dataset) when in its initial stage of development. */
    @javax.xml.bind.annotation.XmlEnumValue("initial-draft")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/initial-draft" )
    Initial_Draft( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#a2675ee1-c42f-3033-9cc2-2b88d9bcfdec", "a2675ee1-c42f-3033-9cc2-2b88d9bcfdec", "initial-draft", java.util.Arrays.asList( "initial-draft" ), "initial draft", "http://purl.org/spar/pso/initial-draft",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The status of s work (for example a document or a dataset) that has been altered or improved, typically by the original author. */
    @javax.xml.bind.annotation.XmlEnumValue("revised")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/spar/pso/revised" )
    Revised( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus#d962ffb9-d6c6-350b-953a-1d8feb738837", "d962ffb9-d6c6-350b-953a-1d8feb738837", "revised", java.util.Arrays.asList( "revised" ), "revised", "http://purl.org/spar/pso/revised",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus/2014-02-01"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus/2014-02-01"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.publicationstatus.PublicationStatus.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.publicationstatus.PublicationStatus.SCHEME_ID )
      .withVersion( "20200816-213241" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, PublicationStatus> index = indexByUUID(PublicationStatus.values());

  private TermDescription description;
  private PublicationStatusSeries series;

  public TermDescription getDescription() {
    return description;
  }

  PublicationStatus(final String conceptId, final String conceptUUID,
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
  public PublicationStatusSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.publicationstatus.PublicationStatus> asSeries() {
    return toSeries();
  }

  private PublicationStatusSeries toSeries() {
    if (series == null) {
      series = (PublicationStatusSeries) PublicationStatusSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends LegacyURITermsJsonAdapter.Serializer<PublicationStatus> {}

  public static class JsonDeserializer extends LegacyURITermsJsonAdapter.Deserializer<PublicationStatus> {
    protected PublicationStatus[] getValues() {
      return values();
    }
    @Override
    protected Optional<PublicationStatus> resolveUUID(UUID uuid) {
      return PublicationStatus.resolveUUID(uuid);
    }
  }


  public static Optional<PublicationStatus> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<PublicationStatus> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<PublicationStatus> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<PublicationStatus> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<PublicationStatus> resolveTag(final String tag) {
    Optional<PublicationStatus> l = resolveTerm(tag, PublicationStatus.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, PublicationStatus.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<PublicationStatus> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<PublicationStatus> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, PublicationStatus.values(), Term::getConceptId);
  }

  public static Optional<PublicationStatus> resolveRef(final URI refUri) {
    return resolveTerm(refUri, PublicationStatus.values(), Term::getRef);
  }

}
