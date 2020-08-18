package edu.mayo.ontology.taxonomies.kao.publicationeventtype.snapshot;

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
import edu.mayo.ontology.taxonomies.kao.publicationeventtype.PublicationEventTypeSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "PublicationEventType")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( PublicationEventType.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = PublicationEventType.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = PublicationEventType.JsonDeserializer.class )
public enum PublicationEventType implements edu.mayo.ontology.taxonomies.kao.publicationeventtype.PublicationEventType {


    /* An expert&#39;s act of creating a new Work of Knowledge */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeCreationActivity")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kmdo/KnowledgeCreationActivity" )
    Creation( "https://ontology.mayo.edu/taxonomies/KAO/PublicationEventType#afdb4687-26c7-3e75-846c-5520cf6cec4f", "afdb4687-26c7-3e75-846c-5520cf6cec4f", "KnowledgeCreationActivity", java.util.Arrays.asList( "KnowledgeCreationActivity" ), "creation", "https://www.omg.org/spec/API4KP/api4kp-kmdo/KnowledgeCreationActivity",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The act of expressing a Work of Knowledge in some language */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeAuthoringActivity")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kmdo/KnowledgeAuthoringActivity" )
    Authoring( "https://ontology.mayo.edu/taxonomies/KAO/PublicationEventType#d03896b3-d1e1-3ca3-bdea-d9321ccac658", "d03896b3-d1e1-3ca3-bdea-d9321ccac658", "KnowledgeAuthoringActivity", java.util.Arrays.asList( "KnowledgeAuthoringActivity" ), "authoring", "https://www.omg.org/spec/API4KP/api4kp-kmdo/KnowledgeAuthoringActivity",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* publication */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgePublicationActivity")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kmdo/KnowledgePublicationActivity" )
    Publication( "https://ontology.mayo.edu/taxonomies/KAO/PublicationEventType#a2b106f1-a145-3cff-b717-68f97f95ad12", "a2b106f1-a145-3cff-b717-68f97f95ad12", "KnowledgePublicationActivity", java.util.Arrays.asList( "KnowledgePublicationActivity" ), "publication", "https://www.omg.org/spec/API4KP/api4kp-kmdo/KnowledgePublicationActivity",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The act by which an designated party (a knowledge approval body) transfers their authority to a knowledge asset */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeApprovalActivity")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kmdo/KnowledgeApprovalActivity" )
    Approval( "https://ontology.mayo.edu/taxonomies/KAO/PublicationEventType#4c1fe7d6-a9d2-3b51-b5de-c3816387646d", "4c1fe7d6-a9d2-3b51-b5de-c3816387646d", "KnowledgeApprovalActivity", java.util.Arrays.asList( "KnowledgeApprovalActivity" ), "approval", "https://www.omg.org/spec/API4KP/api4kp-kmdo/KnowledgeApprovalActivity",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The act of formatting and typesetting a Knowledge Expression to fit a designated carrier */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeEditingActivity")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kmdo/KnowledgeEditingActivity" )
    Editing( "https://ontology.mayo.edu/taxonomies/KAO/PublicationEventType#2a0c61c4-79cf-3d6a-9e15-8bd2bdfe99b4", "2a0c61c4-79cf-3d6a-9e15-8bd2bdfe99b4", "KnowledgeEditingActivity", java.util.Arrays.asList( "KnowledgeEditingActivity" ), "editing", "https://www.omg.org/spec/API4KP/api4kp-kmdo/KnowledgeEditingActivity",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* An expert&#39;s comparison of a knowledge asset with their subject matter expertise, to determine whether the work is still accurate, faithful and up to date */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeReviewActivity")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kmdo/KnowledgeReviewActivity" )
    Review( "https://ontology.mayo.edu/taxonomies/KAO/PublicationEventType#22051a5f-b02d-3fde-9c13-8c6ec13c7b57", "22051a5f-b02d-3fde-9c13-8c6ec13c7b57", "KnowledgeReviewActivity", java.util.Arrays.asList( "KnowledgeReviewActivity" ), "review", "https://www.omg.org/spec/API4KP/api4kp-kmdo/KnowledgeReviewActivity",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* A knowledge review that results in a new version of a knowledge asset */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeRevisionActivity")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kmdo/KnowledgeRevisionActivity" )
    Revision( "https://ontology.mayo.edu/taxonomies/KAO/PublicationEventType#25f1b7b7-0e3a-3f4d-934d-f6e7b9f79560", "25f1b7b7-0e3a-3f4d-934d-f6e7b9f79560", "KnowledgeRevisionActivity", java.util.Arrays.asList( "KnowledgeRevisionActivity" ), "revision", "https://www.omg.org/spec/API4KP/api4kp-kmdo/KnowledgeRevisionActivity",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.publicationeventtype.snapshot.PublicationEventType.Review,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.publicationeventtype.snapshot.PublicationEventType.Review,  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/PublicationEventType" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/PublicationEventType/SNAPSHOT/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/PublicationEventType/SNAPSHOT/"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.publicationeventtype.PublicationEventType.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.publicationeventtype.PublicationEventType.SCHEME_ID )
      .withVersion( "20200816-213247" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, PublicationEventType> index = indexByUUID(PublicationEventType.values());

  private TermDescription description;
  private PublicationEventTypeSeries series;

  public TermDescription getDescription() {
    return description;
  }

  PublicationEventType(final String conceptId, final String conceptUUID,
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
  public PublicationEventTypeSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.publicationeventtype.PublicationEventType> asSeries() {
    return toSeries();
  }

  private PublicationEventTypeSeries toSeries() {
    if (series == null) {
      series = (PublicationEventTypeSeries) PublicationEventTypeSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends LegacyURITermsJsonAdapter.Serializer<PublicationEventType> {}

  public static class JsonDeserializer extends LegacyURITermsJsonAdapter.Deserializer<PublicationEventType> {
    protected PublicationEventType[] getValues() {
      return values();
    }
    @Override
    protected Optional<PublicationEventType> resolveUUID(UUID uuid) {
      return PublicationEventType.resolveUUID(uuid);
    }
  }


  public static Optional<PublicationEventType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<PublicationEventType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<PublicationEventType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<PublicationEventType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<PublicationEventType> resolveTag(final String tag) {
    Optional<PublicationEventType> l = resolveTerm(tag, PublicationEventType.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, PublicationEventType.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<PublicationEventType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<PublicationEventType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, PublicationEventType.values(), Term::getConceptId);
  }

  public static Optional<PublicationEventType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, PublicationEventType.values(), Term::getRef);
  }

}
