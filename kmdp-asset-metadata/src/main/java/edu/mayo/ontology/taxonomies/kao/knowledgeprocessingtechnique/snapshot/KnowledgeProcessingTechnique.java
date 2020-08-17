package edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot;

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

import edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.KnowledgeProcessingTechniqueSeries;
import edu.mayo.kmdp.terms.impl.model.AnonymousConceptScheme;


@javax.xml.bind.annotation.XmlType(name = "KnowledgeProcessingTechnique")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeProcessingTechnique.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeProcessingTechnique.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeProcessingTechnique.JsonDeserializer.class )
public enum KnowledgeProcessingTechnique implements edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.KnowledgeProcessingTechnique {


    /* Technique based on delegation to another entity */
    @javax.xml.bind.annotation.XmlEnumValue("ServiceBasedTechnique")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/ServiceBasedTechnique" )
    Service_Based_Technique( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique#faabd348-224b-377e-92da-e76868d3f5b0", "faabd348-224b-377e-92da-e76868d3f5b0", "ServiceBasedTechnique", java.util.Arrays.asList( "ServiceBasedTechnique" ), "service based technique", "https://www.omg.org/spec/API4KP/api4kp-kao/ServiceBasedTechnique",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* HCI interactive technique */
    @javax.xml.bind.annotation.XmlEnumValue("InteractiveTechnique")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/InteractiveTechnique" )
    HCI_Interactive_Technique( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique#d94bea97-ded3-3a3d-8d97-ce161ea91ff2", "d94bea97-ded3-3a3d-8d97-ce161ea91ff2", "InteractiveTechnique", java.util.Arrays.asList( "InteractiveTechnique" ), "HCI interactive technique", "https://www.omg.org/spec/API4KP/api4kp-kao/InteractiveTechnique",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* I.e. technique such that a computer would not be able to apply it, and achieve the goal of a task executed (following a method) using this technique */
    @javax.xml.bind.annotation.XmlEnumValue("NaturalisticTechnique")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/NaturalisticTechnique" )
    Naturalistic_Technique( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique#f14d0b2d-0246-3601-8ecc-3181cdeed45f", "f14d0b2d-0246-3601-8ecc-3181cdeed45f", "NaturalisticTechnique", java.util.Arrays.asList( "NaturalisticTechnique" ), "naturalistic technique", "https://www.omg.org/spec/API4KP/api4kp-kao/NaturalisticTechnique",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* computational technique */
    @javax.xml.bind.annotation.XmlEnumValue("ComputationalTechnique")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/ComputationalTechnique" )
    Computational_Technique( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique#c710da1c-bc8f-34d3-9e5b-3bb26cdf334e", "c710da1c-bc8f-34d3-9e5b-3bb26cdf334e", "ComputationalTechnique", java.util.Arrays.asList( "ComputationalTechnique" ), "computational technique", "https://www.omg.org/spec/API4KP/api4kp-kao/ComputationalTechnique",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* qualitative computational technique */
    @javax.xml.bind.annotation.XmlEnumValue("QualitativeTechnique")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/QualitativeTechnique" )
    Qualitative_Computational_Technique( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique#8a717c26-8031-3210-99b1-a3891897b2c5", "8a717c26-8031-3210-99b1-a3891897b2c5", "QualitativeTechnique", java.util.Arrays.asList( "QualitativeTechnique" ), "qualitative computational technique", "https://www.omg.org/spec/API4KP/api4kp-kao/QualitativeTechnique",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Computational_Technique,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Computational_Technique,  } ) , 
   
    /* quantitative computational technique */
    @javax.xml.bind.annotation.XmlEnumValue("QuantitativeTechnique")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/QuantitativeTechnique" )
    Quantitative_Computational_Technique( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique#0453f3fa-9cfd-36cf-9a5a-1a17e0b7c29d", "0453f3fa-9cfd-36cf-9a5a-1a17e0b7c29d", "QuantitativeTechnique", java.util.Arrays.asList( "QuantitativeTechnique" ), "quantitative computational technique", "https://www.omg.org/spec/API4KP/api4kp-kao/QuantitativeTechnique",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Computational_Technique,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Computational_Technique,  } ) , 
   
    /* Technique based on formal logic */
    @javax.xml.bind.annotation.XmlEnumValue("LogicBasedTechnique")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/LogicBasedTechnique" )
    Logic_Based_Technique( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique#18c6c122-aa5a-3ec3-92cf-fcbc25d99dd6", "18c6c122-aa5a-3ec3-92cf-fcbc25d99dd6", "LogicBasedTechnique", java.util.Arrays.asList( "LogicBasedTechnique" ), "logic based technique", "https://www.omg.org/spec/API4KP/api4kp-kao/LogicBasedTechnique",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Qualitative_Computational_Technique,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Qualitative_Computational_Technique,  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Computational_Technique,  } ) , 
   
    /* natural language processing technique */
    @javax.xml.bind.annotation.XmlEnumValue("NLPTechnique")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/NLPTechnique" )
    Natural_Language_Processing_Technique( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique#475763f6-4c7f-364e-90d0-49b384e4f0d8", "475763f6-4c7f-364e-90d0-49b384e4f0d8", "NLPTechnique", java.util.Arrays.asList( "NLPTechnique" ), "natural language processing technique", "https://www.omg.org/spec/API4KP/api4kp-kao/NLPTechnique",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Computational_Technique,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.snapshot.KnowledgeProcessingTechnique.Computational_Technique,  } ) , 
   
    /* query based technique */
    @javax.xml.bind.annotation.XmlEnumValue("QueryTechnique")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/QueryTechnique" )
    Query_Based_Technique( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique#221f0704-2eb6-3767-806c-bb70fdb5fde7", "221f0704-2eb6-3767-806c-bb70fdb5fde7", "QueryTechnique", java.util.Arrays.asList( "QueryTechnique" ), "query based technique", "https://www.omg.org/spec/API4KP/api4kp-kao/QueryTechnique",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique/SNAPSHOT/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique/SNAPSHOT/"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.KnowledgeProcessingTechnique.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.KnowledgeProcessingTechnique.SCHEME_ID )
      .withVersion( "20200816-213281" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, KnowledgeProcessingTechnique> index = indexByUUID(KnowledgeProcessingTechnique.values());

  private TermDescription description;
  private KnowledgeProcessingTechniqueSeries series;

  public TermDescription getDescription() {
    return description;
  }

  KnowledgeProcessingTechnique(final String conceptId, final String conceptUUID,
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
  public KnowledgeProcessingTechniqueSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique.KnowledgeProcessingTechnique> asSeries() {
    return toSeries();
  }

  private KnowledgeProcessingTechniqueSeries toSeries() {
    if (series == null) {
      series = (KnowledgeProcessingTechniqueSeries) KnowledgeProcessingTechniqueSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<KnowledgeProcessingTechnique> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<KnowledgeProcessingTechnique> {
    protected KnowledgeProcessingTechnique[] getValues() {
      return values();
    }
    @Override
    protected Optional<KnowledgeProcessingTechnique> resolveUUID(UUID uuid) {
      return KnowledgeProcessingTechnique.resolveUUID(uuid);
    }
  }


  public static Optional<KnowledgeProcessingTechnique> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeProcessingTechnique> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeProcessingTechnique> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeProcessingTechnique> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeProcessingTechnique> resolveTag(final String tag) {
    Optional<KnowledgeProcessingTechnique> l = resolveTerm(tag, KnowledgeProcessingTechnique.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, KnowledgeProcessingTechnique.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeProcessingTechnique> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeProcessingTechnique> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeProcessingTechnique.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeProcessingTechnique> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeProcessingTechnique.values(), Term::getRef);
  }

}
