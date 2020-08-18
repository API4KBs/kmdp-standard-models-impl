package edu.mayo.ontology.taxonomies.skos.relatedconcept;

import static edu.mayo.kmdp.id.helper.DatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveTerm;

import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;
import edu.mayo.kmdp.terms.impl.model.TermImpl;
import edu.mayo.kmdp.util.DateTimeUtil;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "RelatedConcept")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( RelatedConcept.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = RelatedConcept.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = RelatedConcept.JsonDeserializer.class )
public enum RelatedConcept implements edu.mayo.ontology.taxonomies.skos.relatedconcept.IRelatedConcept {


    /* is in semantic relation with */
    @javax.xml.bind.annotation.XmlEnumValue("semanticRelation")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2004/02/skos/core#semanticRelation" )
    Is_In_Semantic_Relation_With( "https://ontology.mayo.edu/taxonomies/skos/RelatedConcept#80a46e59-5638-317e-8bc6-d80998a70927", "80a46e59-5638-317e-8bc6-d80998a70927", "semanticRelation", java.util.Arrays.asList( "semanticRelation" ), "is in semantic relation with", "http://www.w3.org/2004/02/skos/core#semanticRelation",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* skos:related is disjoint with skos:broaderTransitive */
    @javax.xml.bind.annotation.XmlEnumValue("related")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2004/02/skos/core#related" )
    Has_Related( "https://ontology.mayo.edu/taxonomies/skos/RelatedConcept#90ed4512-c954-3ea8-87dc-c288ffc3f367", "90ed4512-c954-3ea8-87dc-c288ffc3f367", "related", java.util.Arrays.asList( "related" ), "has related", "http://www.w3.org/2004/02/skos/core#related",
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With,  },
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With,  } ) , 
   
    /* has broader transitive */
    @javax.xml.bind.annotation.XmlEnumValue("broaderTransitive")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2004/02/skos/core#broaderTransitive" )
    Has_Broader_Transitive( "https://ontology.mayo.edu/taxonomies/skos/RelatedConcept#986420bf-b6db-36a5-a6c6-56665bbb2207", "986420bf-b6db-36a5-a6c6-56665bbb2207", "broaderTransitive", java.util.Arrays.asList( "broaderTransitive" ), "has broader transitive", "http://www.w3.org/2004/02/skos/core#broaderTransitive",
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With,  },
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With,  } ) , 
   
    /* Broader concepts are typically rendered as parents in a concept hierarchy (tree). */
    @javax.xml.bind.annotation.XmlEnumValue("broader")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2004/02/skos/core#broader" )
    Has_Broader( "https://ontology.mayo.edu/taxonomies/skos/RelatedConcept#3c649ef0-96d4-3054-8aab-0bd65ae33f5e", "3c649ef0-96d4-3054-8aab-0bd65ae33f5e", "broader", java.util.Arrays.asList( "broader" ), "has broader", "http://www.w3.org/2004/02/skos/core#broader",
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Broader_Transitive,  },
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Broader_Transitive,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With,  } ) , 
   
    /* has narrower transitive */
    @javax.xml.bind.annotation.XmlEnumValue("narrowerTransitive")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2004/02/skos/core#narrowerTransitive" )
    Has_Narrower_Transitive( "https://ontology.mayo.edu/taxonomies/skos/RelatedConcept#06fe0314-4606-3e2c-a104-61fea1b54ad4", "06fe0314-4606-3e2c-a104-61fea1b54ad4", "narrowerTransitive", java.util.Arrays.asList( "narrowerTransitive" ), "has narrower transitive", "http://www.w3.org/2004/02/skos/core#narrowerTransitive",
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With,  },
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With,  } ) , 
   
    /* Narrower concepts are typically rendered as children in a concept hierarchy (tree). */
    @javax.xml.bind.annotation.XmlEnumValue("narrower")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2004/02/skos/core#narrower" )
    Has_Narrower( "https://ontology.mayo.edu/taxonomies/skos/RelatedConcept#9b62ba57-3b52-38a5-967a-1aeb49fe3f89", "9b62ba57-3b52-38a5-967a-1aeb49fe3f89", "narrower", java.util.Arrays.asList( "narrower" ), "has narrower", "http://www.w3.org/2004/02/skos/core#narrower",
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Narrower_Transitive,  },
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Narrower_Transitive,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With,  } ) , 
   
    /* These concept mapping relations mirror semantic relations, and the data model defined below is similar (with the exception of skos:exactMatch) to the data model defined for semantic relations. A distinct vocabulary is provided for concept mapping relations, to provide a convenient way to differentiate links within a concept scheme from links between concept schemes. However, this pattern of usage is not a formal requirement of the SKOS data model, and relies on informal definitions of best practice. */
    @javax.xml.bind.annotation.XmlEnumValue("mappingRelation")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2004/02/skos/core#mappingRelation" )
    Is_In_Mapping_Relation_With( "https://ontology.mayo.edu/taxonomies/skos/RelatedConcept#941c2fa5-c5df-3356-987a-fbee6b282390", "941c2fa5-c5df-3356-987a-fbee6b282390", "mappingRelation", java.util.Arrays.asList( "mappingRelation" ), "is in mapping relation with", "http://www.w3.org/2004/02/skos/core#mappingRelation",
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With,  },
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With,  } ) , 
   
    /* has narrower match */
    @javax.xml.bind.annotation.XmlEnumValue("narrowMatch")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2004/02/skos/core#narrowMatch" )
    Has_Narrower_Match( "https://ontology.mayo.edu/taxonomies/skos/RelatedConcept#f9be4782-3836-34d5-ac91-c58ac8b478d3", "f9be4782-3836-34d5-ac91-c58ac8b478d3", "narrowMatch", java.util.Arrays.asList( "narrowMatch" ), "has narrower match", "http://www.w3.org/2004/02/skos/core#narrowMatch",
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Narrower,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Mapping_Relation_With,  },
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Narrower_Transitive,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Narrower,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Mapping_Relation_With,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With,  } ) , 
   
    /* has broader match */
    @javax.xml.bind.annotation.XmlEnumValue("broadMatch")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2004/02/skos/core#broadMatch" )
    Has_Broader_Match( "https://ontology.mayo.edu/taxonomies/skos/RelatedConcept#dda6511f-9664-3466-afb9-65c0952ab4f9", "dda6511f-9664-3466-afb9-65c0952ab4f9", "broadMatch", java.util.Arrays.asList( "broadMatch" ), "has broader match", "http://www.w3.org/2004/02/skos/core#broadMatch",
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Broader,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Mapping_Relation_With,  },
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Broader_Transitive,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Broader,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Mapping_Relation_With,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With,  } ) , 
   
    /* has related match */
    @javax.xml.bind.annotation.XmlEnumValue("relatedMatch")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2004/02/skos/core#relatedMatch" )
    Has_Related_Match( "https://ontology.mayo.edu/taxonomies/skos/RelatedConcept#8686db88-1140-3520-ba9d-3b6d84df5621", "8686db88-1140-3520-ba9d-3b6d84df5621", "relatedMatch", java.util.Arrays.asList( "relatedMatch" ), "has related match", "http://www.w3.org/2004/02/skos/core#relatedMatch",
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Related,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Mapping_Relation_With,  },
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Related,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Mapping_Relation_With,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With,  } ) , 
   
    /* has close match */
    @javax.xml.bind.annotation.XmlEnumValue("closeMatch")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2004/02/skos/core#closeMatch" )
    Has_Close_Match( "https://ontology.mayo.edu/taxonomies/skos/RelatedConcept#47ac143d-958f-3d53-926c-f50988bd88e5", "47ac143d-958f-3d53-926c-f50988bd88e5", "closeMatch", java.util.Arrays.asList( "closeMatch" ), "has close match", "http://www.w3.org/2004/02/skos/core#closeMatch",
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Mapping_Relation_With,  },
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Mapping_Relation_With,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With,  } ) , 
   
    /* skos:exactMatch is disjoint with each of the properties skos:broadMatch and skos:relatedMatch. */
    @javax.xml.bind.annotation.XmlEnumValue("exactMatch")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2004/02/skos/core#exactMatch" )
    Has_Exact_Match( "https://ontology.mayo.edu/taxonomies/skos/RelatedConcept#5868a2de-2a16-3dca-91fe-19d61273ee61", "5868a2de-2a16-3dca-91fe-19d61273ee61", "exactMatch", java.util.Arrays.asList( "exactMatch" ), "has exact match", "http://www.w3.org/2004/02/skos/core#exactMatch",
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Close_Match,  },
        new Term[] {  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Mapping_Relation_With,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Is_In_Semantic_Relation_With,  edu.mayo.ontology.taxonomies.skos.relatedconcept.RelatedConcept.Has_Close_Match,  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/skos/RelatedConcept" )),
      URI.create("https://ontology.mayo.edu/taxonomies/skos/RelatedConcept"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/skos/RelatedConcept"))
      .withLabel( edu.mayo.ontology.taxonomies.skos.relatedconcept.IRelatedConcept.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.skos.relatedconcept.IRelatedConcept.SCHEME_ID )
      .withVersion( "20200816-213255" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, RelatedConcept> index = indexByUUID(RelatedConcept.values());

  private TermDescription description;
  private RelatedConceptSeries series;

  public TermDescription getDescription() {
    return description;
  }

  RelatedConcept(final String conceptId, final String conceptUUID,
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
  public RelatedConceptSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.skos.relatedconcept.IRelatedConcept> asSeries() {
    return toSeries();
  }

  private RelatedConceptSeries toSeries() {
    if (series == null) {
      series = (RelatedConceptSeries) RelatedConceptSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<RelatedConcept> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<RelatedConcept> {
    protected RelatedConcept[] getValues() {
      return values();
    }
    @Override
    protected Optional<RelatedConcept> resolveUUID(UUID uuid) {
      return RelatedConcept.resolveUUID(uuid);
    }
  }


  public static Optional<RelatedConcept> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<RelatedConcept> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<RelatedConcept> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<RelatedConcept> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<RelatedConcept> resolveTag(final String tag) {
    Optional<RelatedConcept> l = resolveTerm(tag, RelatedConcept.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, RelatedConcept.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<RelatedConcept> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<RelatedConcept> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, RelatedConcept.values(), Term::getConceptId);
  }

  public static Optional<RelatedConcept> resolveRef(final URI refUri) {
    return resolveTerm(refUri, RelatedConcept.values(), Term::getRef);
  }

}
