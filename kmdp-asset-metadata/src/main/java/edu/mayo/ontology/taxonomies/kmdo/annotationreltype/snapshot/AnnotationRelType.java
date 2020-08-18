package edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot;

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
import edu.mayo.ontology.taxonomies.kmdo.annotationreltype.AnnotationRelTypeSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "AnnotationRelType")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( AnnotationRelType.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = AnnotationRelType.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = AnnotationRelType.JsonDeserializer.class )
public enum AnnotationRelType implements edu.mayo.ontology.taxonomies.kmdo.annotationreltype.AnnotationRelType {


    /* is identified by */
    @javax.xml.bind.annotation.XmlEnumValue("isIdentifiedBy")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/isIdentifiedBy" )
    Is_Identified_By( "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType#4ac82113-9fdd-3050-85e7-5cca8f26d1c6", "4ac82113-9fdd-3050-85e7-5cca8f26d1c6", "isIdentifiedBy", java.util.Arrays.asList( "isIdentifiedBy" ), "is identified by", "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/isIdentifiedBy",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* A kind of &#39;aboutness&#39; that reflects the relationship between a a knowledge-related conceptualization and its referent(s) */
    @javax.xml.bind.annotation.XmlEnumValue("is-about")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/is-about" )
    Knowledge_Of( "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType#7947f786-5365-3212-a418-9cb9c8c9e1b3", "7947f786-5365-3212-a418-9cb9c8c9e1b3", "is-about", java.util.Arrays.asList( "is-about" ), "knowledge of", "https://www.omg.org/spec/API4KP/api4kp/is-about",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* in terms of */
    @javax.xml.bind.annotation.XmlEnumValue("defined-in-terms-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/defined-in-terms-of" )
    In_Terms_Of( "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType#6e1048ea-46da-39b1-b650-445f31a17fc1", "6e1048ea-46da-39b1-b650-445f31a17fc1", "defined-in-terms-of", java.util.Arrays.asList( "defined-in-terms-of" ), "in terms of", "https://www.omg.org/spec/API4KP/api4kp/defined-in-terms-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  } ) , 
   
    /* has primary subject */
    @javax.xml.bind.annotation.XmlEnumValue("primary-subject")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kmdo/primary-subject" )
    Has_Primary_Subject( "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType#163de52b-217a-3543-85c3-373bebdb4d5f", "163de52b-217a-3543-85c3-373bebdb4d5f", "primary-subject", java.util.Arrays.asList( "primary-subject" ), "has primary subject", "https://www.omg.org/spec/API4KP/api4kp-kmdo/primary-subject",
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  } ) , 
   
    /* a concept archetypes a referent, to the extent that the concept is defined by a definition that has that referent as a subject. */
    @javax.xml.bind.annotation.XmlEnumValue("archetypes")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/archetypes" )
    Archetypes( "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType#2002f094-997f-3dc3-a497-3dd527960d73", "2002f094-997f-3dc3-a497-3dd527960d73", "archetypes", java.util.Arrays.asList( "archetypes" ), "archetypes", "https://www.omg.org/spec/API4KP/api4kp/archetypes",
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  } ) , 
   
    /* captures */
    @javax.xml.bind.annotation.XmlEnumValue("captures")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/captures" )
    Captures( "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType#8856ffdd-044d-37cd-8124-a6be5dcea329", "8856ffdd-044d-37cd-8124-a6be5dcea329", "captures", java.util.Arrays.asList( "captures" ), "captures", "https://www.omg.org/spec/API4KP/api4kp/captures",
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  } ) , 
   
    /* has exemplar */
    @javax.xml.bind.annotation.XmlEnumValue("has-exemplar")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/has-exemplar" )
    Has_Exemplar( "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType#988f9f5d-25c7-3cd9-b358-853a092d908a", "988f9f5d-25c7-3cd9-b358-853a092d908a", "has-exemplar", java.util.Arrays.asList( "has-exemplar" ), "has exemplar", "https://www.omg.org/spec/API4KP/api4kp/has-exemplar",
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Archetypes,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Archetypes,  } ) , 
   
    /* conceptual representation of */
    @javax.xml.bind.annotation.XmlEnumValue("has-subject")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/has-subject" )
    Conceptual_Representation_Of( "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType#7cb4306d-9ffc-3194-9485-fad6e7ed7435", "7cb4306d-9ffc-3194-9485-fad6e7ed7435", "has-subject", java.util.Arrays.asList( "has-subject" ), "conceptual representation of", "https://www.omg.org/spec/API4KP/api4kp/has-subject",
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  } ) , 
   
    /* secondary-subject */
    @javax.xml.bind.annotation.XmlEnumValue("secondary-subject")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kmdo/secondary-subject" )
    Secondary_Subject( "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType#c5b01472-9f5b-3a15-8b1d-260c4a63d172", "c5b01472-9f5b-3a15-8b1d-260c4a63d172", "secondary-subject", java.util.Arrays.asList( "secondary-subject" ), "secondary-subject", "https://www.omg.org/spec/API4KP/api4kp-kmdo/secondary-subject",
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  } ) , 
   
    /* knowledge representation of */
    @javax.xml.bind.annotation.XmlEnumValue("knowledge-representation-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/knowledge-representation-of" )
    Knowledge_Representation_Of( "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType#829f6919-7203-3502-a579-2f6ebc7e8297", "829f6919-7203-3502-a579-2f6ebc7e8297", "knowledge-representation-of", java.util.Arrays.asList( "knowledge-representation-of" ), "knowledge representation of", "https://www.omg.org/spec/API4KP/api4kp/knowledge-representation-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  } ) , 
   
    /* defines */
    @javax.xml.bind.annotation.XmlEnumValue("defines")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/defines" )
    Defines( "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType#e5ce0278-0309-3c37-ae63-626f7fc5c76b", "e5ce0278-0309-3c37-ae63-626f7fc5c76b", "defines", java.util.Arrays.asList( "defines" ), "defines", "https://www.omg.org/spec/API4KP/api4kp/defines",
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Captures,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Captures,  } ) , 
   
    /* has focus */
    @javax.xml.bind.annotation.XmlEnumValue("focus")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kmdo/focus" )
    Has_Focus( "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType#1818d506-396d-37b3-9035-f719885c4cd1", "1818d506-396d-37b3-9035-f719885c4cd1", "focus", java.util.Arrays.asList( "focus" ), "has focus", "https://www.omg.org/spec/API4KP/api4kp-kmdo/focus",
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  } ) , 
   
    /* function of */
    @javax.xml.bind.annotation.XmlEnumValue("function-of")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/function-of" )
    Function_Of( "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType#bdc45b5e-7674-30ef-a140-bb7a6e5de2eb", "bdc45b5e-7674-30ef-a140-bb7a6e5de2eb", "function-of", java.util.Arrays.asList( "function-of" ), "function of", "https://www.omg.org/spec/API4KP/api4kp/function-of",
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Archetypes,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Knowledge_Of,  edu.mayo.ontology.taxonomies.kmdo.annotationreltype.snapshot.AnnotationRelType.Archetypes,  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType/SNAPSHOT/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType/SNAPSHOT/"))
      .withLabel( edu.mayo.ontology.taxonomies.kmdo.annotationreltype.AnnotationRelType.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kmdo.annotationreltype.AnnotationRelType.SCHEME_ID )
      .withVersion( "20200816-213264" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, AnnotationRelType> index = indexByUUID(AnnotationRelType.values());

  private TermDescription description;
  private AnnotationRelTypeSeries series;

  public TermDescription getDescription() {
    return description;
  }

  AnnotationRelType(final String conceptId, final String conceptUUID,
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
  public AnnotationRelTypeSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kmdo.annotationreltype.AnnotationRelType> asSeries() {
    return toSeries();
  }

  private AnnotationRelTypeSeries toSeries() {
    if (series == null) {
      series = (AnnotationRelTypeSeries) AnnotationRelTypeSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends LegacyURITermsJsonAdapter.Serializer<AnnotationRelType> {}

  public static class JsonDeserializer extends LegacyURITermsJsonAdapter.Deserializer<AnnotationRelType> {
    protected AnnotationRelType[] getValues() {
      return values();
    }
    @Override
    protected Optional<AnnotationRelType> resolveUUID(UUID uuid) {
      return AnnotationRelType.resolveUUID(uuid);
    }
  }


  public static Optional<AnnotationRelType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<AnnotationRelType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<AnnotationRelType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<AnnotationRelType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<AnnotationRelType> resolveTag(final String tag) {
    Optional<AnnotationRelType> l = resolveTerm(tag, AnnotationRelType.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, AnnotationRelType.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<AnnotationRelType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<AnnotationRelType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, AnnotationRelType.values(), Term::getConceptId);
  }

  public static Optional<AnnotationRelType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, AnnotationRelType.values(), Term::getRef);
  }

}
