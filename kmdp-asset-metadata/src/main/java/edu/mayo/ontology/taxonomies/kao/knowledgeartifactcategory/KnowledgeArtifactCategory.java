package edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory;

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
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "KnowledgeArtifactCategory")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeArtifactCategory.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeArtifactCategory.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeArtifactCategory.JsonDeserializer.class )
public enum KnowledgeArtifactCategory implements edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.IKnowledgeArtifactCategory {


    /* Data encoded in a defined structure. */
    @javax.xml.bind.annotation.XmlEnumValue("Dataset")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/dc/dcmitype/Dataset" )
    Dataset( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory#239658e0-16e3-35d0-aae7-19d280a79fec", "239658e0-16e3-35d0-aae7-19d280a79fec", "Dataset", java.util.Arrays.asList( "Dataset" ), "Dataset", "http://purl.org/dc/dcmitype/Dataset",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* A resource primarily intended to be heard. */
    @javax.xml.bind.annotation.XmlEnumValue("Sound")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/dc/dcmitype/Sound" )
    Sound( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory#9d07e0e0-8af7-396c-b45b-e0112b9ccfbe", "9d07e0e0-8af7-396c-b45b-e0112b9ccfbe", "Sound", java.util.Arrays.asList( "Sound" ), "Sound", "http://purl.org/dc/dcmitype/Sound",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* An aggregation of resources. */
    @javax.xml.bind.annotation.XmlEnumValue("Collection")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/dc/dcmitype/Collection" )
    Collection( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory#d15b505c-ce09-306d-a9f9-18cb1f8c641c", "d15b505c-ce09-306d-a9f9-18cb1f8c641c", "Collection", java.util.Arrays.asList( "Collection" ), "Collection", "http://purl.org/dc/dcmitype/Collection",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* A resource consisting primarily of words for reading. */
    @javax.xml.bind.annotation.XmlEnumValue("Text")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/dc/dcmitype/Text" )
    Text( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory#9dffbf69-ffba-3bc3-8bc4-e01abf4b1675", "9dffbf69-ffba-3bc3-8bc4-e01abf4b1675", "Text", java.util.Arrays.asList( "Text" ), "Text", "http://purl.org/dc/dcmitype/Text",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* A computer program in source or compiled form. */
    @javax.xml.bind.annotation.XmlEnumValue("Software")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/dc/dcmitype/Software" )
    Software( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory#719d067b-2291-38f0-bbcf-a1da4ac4dede", "719d067b-2291-38f0-bbcf-a1da4ac4dede", "Software", java.util.Arrays.asList( "Software" ), "Software", "http://purl.org/dc/dcmitype/Software",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* A visual representation other than text. */
    @javax.xml.bind.annotation.XmlEnumValue("Image")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/dc/dcmitype/Image" )
    Image( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory#be53a054-1a6d-36f6-acb8-79fa2c584b08", "be53a054-1a6d-36f6-acb8-79fa2c584b08", "Image", java.util.Arrays.asList( "Image" ), "Image", "http://purl.org/dc/dcmitype/Image",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* A static visual representation. */
    @javax.xml.bind.annotation.XmlEnumValue("StillImage")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/dc/dcmitype/StillImage" )
    Still_Image( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory#53117440-2784-3b1e-b0ac-ed385c1de0a5", "53117440-2784-3b1e-b0ac-ed385c1de0a5", "StillImage", java.util.Arrays.asList( "StillImage" ), "Still Image", "http://purl.org/dc/dcmitype/StillImage",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Image,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Image,  } ) , 
   
    /* A series of visual representations imparting an impression of motion when shown in succession. */
    @javax.xml.bind.annotation.XmlEnumValue("MovingImage")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/dc/dcmitype/MovingImage" )
    Moving_Image( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory#976868e2-21df-3568-b067-0e85f61d2420", "976868e2-21df-3568-b067-0e85f61d2420", "MovingImage", java.util.Arrays.asList( "MovingImage" ), "Moving Image", "http://purl.org/dc/dcmitype/MovingImage",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Image,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.KnowledgeArtifactCategory.Image,  } ) , 
   
    /* A resource requiring interaction from the user to be understood, executed, or experienced. */
    @javax.xml.bind.annotation.XmlEnumValue("InteractiveResource")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/dc/dcmitype/InteractiveResource" )
    Interactive_Resource( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory#cec124ac-ab17-3e92-a02b-e1b4205948ea", "cec124ac-ab17-3e92-a02b-e1b4205948ea", "InteractiveResource", java.util.Arrays.asList( "InteractiveResource" ), "Interactive Resource", "http://purl.org/dc/dcmitype/InteractiveResource",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* A system that provides one or more functions. */
    @javax.xml.bind.annotation.XmlEnumValue("Service")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/dc/dcmitype/Service" )
    Service( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory#c2ba7e78-5c49-350f-88da-9aacc45c2b85", "c2ba7e78-5c49-350f-88da-9aacc45c2b85", "Service", java.util.Arrays.asList( "Service" ), "Service", "http://purl.org/dc/dcmitype/Service",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* An inanimate, three-dimensional object or substance. */
    @javax.xml.bind.annotation.XmlEnumValue("PhysicalObject")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/dc/dcmitype/PhysicalObject" )
    Physical_Object( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory#6bdfa244-e66d-3ff3-a468-fd93cfb03e44", "6bdfa244-e66d-3ff3-a468-fd93cfb03e44", "PhysicalObject", java.util.Arrays.asList( "PhysicalObject" ), "Physical Object", "http://purl.org/dc/dcmitype/PhysicalObject",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* A non-persistent, time-based occurrence. */
    @javax.xml.bind.annotation.XmlEnumValue("Event")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://purl.org/dc/dcmitype/Event" )
    Event( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory#a4ecfc70-5743-3499-8cf1-7bd83df499f7", "a4ecfc70-5743-3499-8cf1-7bd83df499f7", "Event", java.util.Arrays.asList( "Event" ), "Event", "http://purl.org/dc/dcmitype/Event",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.IKnowledgeArtifactCategory.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.IKnowledgeArtifactCategory.SCHEME_ID )
      .withVersion( "20200816-213249" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, KnowledgeArtifactCategory> index = indexByUUID(KnowledgeArtifactCategory.values());

  private TermDescription description;
  private KnowledgeArtifactCategorySeries series;

  public TermDescription getDescription() {
    return description;
  }

  KnowledgeArtifactCategory(final String conceptId, final String conceptUUID,
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
  public KnowledgeArtifactCategorySeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory.IKnowledgeArtifactCategory> asSeries() {
    return toSeries();
  }

  private KnowledgeArtifactCategorySeries toSeries() {
    if (series == null) {
      series = (KnowledgeArtifactCategorySeries) KnowledgeArtifactCategorySeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends LegacyURITermsJsonAdapter.Serializer<KnowledgeArtifactCategory> {}

  public static class JsonDeserializer extends LegacyURITermsJsonAdapter.Deserializer<KnowledgeArtifactCategory> {
    protected KnowledgeArtifactCategory[] getValues() {
      return values();
    }
    @Override
    protected Optional<KnowledgeArtifactCategory> resolveUUID(UUID uuid) {
      return KnowledgeArtifactCategory.resolveUUID(uuid);
    }
  }


  public static Optional<KnowledgeArtifactCategory> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeArtifactCategory> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeArtifactCategory> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeArtifactCategory> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeArtifactCategory> resolveTag(final String tag) {
    Optional<KnowledgeArtifactCategory> l = resolveTerm(tag, KnowledgeArtifactCategory.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, KnowledgeArtifactCategory.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeArtifactCategory> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeArtifactCategory> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeArtifactCategory.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeArtifactCategory> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeArtifactCategory.values(), Term::getRef);
  }

}
