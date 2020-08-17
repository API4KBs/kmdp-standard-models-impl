package edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype._20190801;

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

import edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype.DependencyTypeSeries;
import edu.mayo.kmdp.terms.impl.model.AnonymousConceptScheme;


@javax.xml.bind.annotation.XmlType(name = "DependencyType")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( DependencyType.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = DependencyType.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = DependencyType.JsonDeserializer.class )
public enum DependencyType implements edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype.DependencyType {


    /* depends on */
    @javax.xml.bind.annotation.XmlEnumValue("depends-on")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/depends-on" )
    Depends_On( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType#f6a2233d-39a6-3065-91ae-db573cf75837", "f6a2233d-39a6-3065-91ae-db573cf75837", "depends-on", java.util.Arrays.asList( "depends-on" ), "depends on", "https://www.omg.org/spec/API4KP/api4kp/depends-on",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* imports */
    @javax.xml.bind.annotation.XmlEnumValue("imports")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/imports" )
    Imports( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType#a6878bf5-d858-3676-83a1-ef2871d36f47", "a6878bf5-d858-3676-83a1-ef2871d36f47", "imports", java.util.Arrays.asList( "imports" ), "imports", "https://www.omg.org/spec/API4KP/api4kp/imports",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype._20190801.DependencyType.Depends_On,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype._20190801.DependencyType.Depends_On,  } ) , 
   
    /* includes */
    @javax.xml.bind.annotation.XmlEnumValue("includes")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/includes" )
    Includes( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType#bb2b21ef-7774-3f86-87ff-02b0284505c6", "bb2b21ef-7774-3f86-87ff-02b0284505c6", "includes", java.util.Arrays.asList( "includes" ), "includes", "https://www.omg.org/spec/API4KP/api4kp/includes",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype._20190801.DependencyType.Imports,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype._20190801.DependencyType.Depends_On,  edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype._20190801.DependencyType.Imports,  } ) , 
   
    /* supplements */
    @javax.xml.bind.annotation.XmlEnumValue("supplements")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/supplements" )
    Supplements( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType#8b7c9cfd-991f-399c-988a-2e54116c67b7", "8b7c9cfd-991f-399c-988a-2e54116c67b7", "supplements", java.util.Arrays.asList( "supplements" ), "supplements", "https://www.omg.org/spec/API4KP/api4kp/supplements",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* complements */
    @javax.xml.bind.annotation.XmlEnumValue("complements")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/complements" )
    Complements( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType#5a115280-4ff4-3812-a4b4-00d5b206fc89", "5a115280-4ff4-3812-a4b4-00d5b206fc89", "complements", java.util.Arrays.asList( "complements" ), "complements", "https://www.omg.org/spec/API4KP/api4kp/complements",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* effectuates */
    @javax.xml.bind.annotation.XmlEnumValue("effectuates")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/effectuates" )
    Effectuates( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType#e60f5902-0ebb-3405-a421-58be4de5b108", "e60f5902-0ebb-3405-a421-58be4de5b108", "effectuates", java.util.Arrays.asList( "effectuates" ), "effectuates", "https://www.omg.org/spec/API4KP/api4kp/effectuates",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* complies with */
    @javax.xml.bind.annotation.XmlEnumValue("complies-with")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/complies-with" )
    Complies_With( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType#918c15c3-ba21-3947-bbf6-452280ec11c0", "918c15c3-ba21-3947-bbf6-452280ec11c0", "complies-with", java.util.Arrays.asList( "complies-with" ), "complies with", "https://www.omg.org/spec/API4KP/api4kp/complies-with",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType/20190801/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType/20190801/"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype.DependencyType.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype.DependencyType.SCHEME_ID )
      .withVersion( "20190801" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2019-08-01") );

  public static final Map<UUID, DependencyType> index = indexByUUID(DependencyType.values());

  private TermDescription description;
  private DependencyTypeSeries series;

  public TermDescription getDescription() {
    return description;
  }

  DependencyType(final String conceptId, final String conceptUUID,
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
  public DependencyTypeSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype.DependencyType> asSeries() {
    return toSeries();
  }

  private DependencyTypeSeries toSeries() {
    if (series == null) {
      series = (DependencyTypeSeries) DependencyTypeSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<DependencyType> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<DependencyType> {
    protected DependencyType[] getValues() {
      return values();
    }
    @Override
    protected Optional<DependencyType> resolveUUID(UUID uuid) {
      return DependencyType.resolveUUID(uuid);
    }
  }


  public static Optional<DependencyType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<DependencyType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<DependencyType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<DependencyType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<DependencyType> resolveTag(final String tag) {
    Optional<DependencyType> l = resolveTerm(tag, DependencyType.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, DependencyType.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<DependencyType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<DependencyType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, DependencyType.values(), Term::getConceptId);
  }

  public static Optional<DependencyType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, DependencyType.values(), Term::getRef);
  }

}
