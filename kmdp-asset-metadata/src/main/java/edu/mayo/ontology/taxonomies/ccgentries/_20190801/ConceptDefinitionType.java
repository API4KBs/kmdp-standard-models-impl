package edu.mayo.ontology.taxonomies.ccgentries._20190801;

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
import edu.mayo.ontology.taxonomies.ccgentries.ConceptDefinitionTypeSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "ConceptDefinitionType")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( ConceptDefinitionType.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = ConceptDefinitionType.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = ConceptDefinitionType.JsonDeserializer.class )
public enum ConceptDefinitionType implements edu.mayo.ontology.taxonomies.ccgentries.ConceptDefinitionType {


    /* computable knowledge based concept definition */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeBasedConceptDefinition")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/CCG/KnowledgeBasedConceptDefinition" )
    Computable_Knowledge_Based_Concept_Definition( "https://ontology.mayo.edu/taxonomies/ccgEntries#514c07f2-a339-3ceb-84f3-978a6647954c", "514c07f2-a339-3ceb-84f3-978a6647954c", "KnowledgeBasedConceptDefinition", java.util.Arrays.asList( "KnowledgeBasedConceptDefinition" ), "computable knowledge based concept definition", "http://ontology.mayo.edu/ontologies/CCG/KnowledgeBasedConceptDefinition",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* statistical concept definition */
    @javax.xml.bind.annotation.XmlEnumValue("StatisticalConceptDefinition")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/CCG/StatisticalConceptDefinition" )
    Statistical_Concept_Definition( "https://ontology.mayo.edu/taxonomies/ccgEntries#115b072d-2a1f-3898-acb5-19be52e8d4ba", "115b072d-2a1f-3898-acb5-19be52e8d4ba", "StatisticalConceptDefinition", java.util.Arrays.asList( "StatisticalConceptDefinition" ), "statistical concept definition", "http://ontology.mayo.edu/ontologies/CCG/StatisticalConceptDefinition",
        new Term[] {  edu.mayo.ontology.taxonomies.ccgentries._20190801.ConceptDefinitionType.Computable_Knowledge_Based_Concept_Definition,  },
        new Term[] {  edu.mayo.ontology.taxonomies.ccgentries._20190801.ConceptDefinitionType.Computable_Knowledge_Based_Concept_Definition,  } ) , 
   
    /* logic based concept definition */
    @javax.xml.bind.annotation.XmlEnumValue("LogicBasedConceptDefinition")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/CCG/LogicBasedConceptDefinition" )
    Logic_Based_Concept_Definition( "https://ontology.mayo.edu/taxonomies/ccgEntries#028c5b2c-cb05-356c-b3d7-03f5e0a17f18", "028c5b2c-cb05-356c-b3d7-03f5e0a17f18", "LogicBasedConceptDefinition", java.util.Arrays.asList( "LogicBasedConceptDefinition" ), "logic based concept definition", "http://ontology.mayo.edu/ontologies/CCG/LogicBasedConceptDefinition",
        new Term[] {  edu.mayo.ontology.taxonomies.ccgentries._20190801.ConceptDefinitionType.Computable_Knowledge_Based_Concept_Definition,  },
        new Term[] {  edu.mayo.ontology.taxonomies.ccgentries._20190801.ConceptDefinitionType.Computable_Knowledge_Based_Concept_Definition,  } ) , 
   
    /* NLP based concept definition */
    @javax.xml.bind.annotation.XmlEnumValue("NLPBasedConceptDefinition")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/CCG/NLPBasedConceptDefinition" )
    NLP_Based_Concept_Definition( "https://ontology.mayo.edu/taxonomies/ccgEntries#efb551da-92c0-303d-8852-0cf8bd0a4273", "efb551da-92c0-303d-8852-0cf8bd0a4273", "NLPBasedConceptDefinition", java.util.Arrays.asList( "NLPBasedConceptDefinition" ), "NLP based concept definition", "http://ontology.mayo.edu/ontologies/CCG/NLPBasedConceptDefinition",
        new Term[] {  edu.mayo.ontology.taxonomies.ccgentries._20190801.ConceptDefinitionType.Computable_Knowledge_Based_Concept_Definition,  },
        new Term[] {  edu.mayo.ontology.taxonomies.ccgentries._20190801.ConceptDefinitionType.Computable_Knowledge_Based_Concept_Definition,  } ) , 
   
    /* human resolution concept definition */
    @javax.xml.bind.annotation.XmlEnumValue("HumanResolutionConceptDefinition")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/CCG/HumanResolutionConceptDefinition" )
    Human_Resolution_Concept_Definition( "https://ontology.mayo.edu/taxonomies/ccgEntries#2283eb4c-e6af-3d57-bf45-557d65b5215d", "2283eb4c-e6af-3d57-bf45-557d65b5215d", "HumanResolutionConceptDefinition", java.util.Arrays.asList( "HumanResolutionConceptDefinition" ), "human resolution concept definition", "http://ontology.mayo.edu/ontologies/CCG/HumanResolutionConceptDefinition",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* interactive concept definition */
    @javax.xml.bind.annotation.XmlEnumValue("InteractiveConceptDefinition")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/CCG/InteractiveConceptDefinition" )
    Interactive_Concept_Definition( "https://ontology.mayo.edu/taxonomies/ccgEntries#e015782e-9843-36fe-adce-6f08f61469a0", "e015782e-9843-36fe-adce-6f08f61469a0", "InteractiveConceptDefinition", java.util.Arrays.asList( "InteractiveConceptDefinition" ), "interactive concept definition", "http://ontology.mayo.edu/ontologies/CCG/InteractiveConceptDefinition",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* cognitively assisted concept definition */
    @javax.xml.bind.annotation.XmlEnumValue("CognitivelyAssistedConceptDefinition")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/CCG/CognitivelyAssistedConceptDefinition" )
    Cognitively_Assisted_Concept_Definition( "https://ontology.mayo.edu/taxonomies/ccgEntries#ac276ecb-4b00-368d-97e4-7a3fca2cc7ac", "ac276ecb-4b00-368d-97e4-7a3fca2cc7ac", "CognitivelyAssistedConceptDefinition", java.util.Arrays.asList( "CognitivelyAssistedConceptDefinition" ), "cognitively assisted concept definition", "http://ontology.mayo.edu/ontologies/CCG/CognitivelyAssistedConceptDefinition",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* service-based concept definition */
    @javax.xml.bind.annotation.XmlEnumValue("ServiceBasedDefinition")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/CCG/ServiceBasedDefinition" )
    Service_Based_Concept_Definition( "https://ontology.mayo.edu/taxonomies/ccgEntries#9751e8bc-5b15-3f33-8ac8-5bba6a331934", "9751e8bc-5b15-3f33-8ac8-5bba6a331934", "ServiceBasedDefinition", java.util.Arrays.asList( "ServiceBasedDefinition" ), "service-based concept definition", "http://ontology.mayo.edu/ontologies/CCG/ServiceBasedDefinition",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/ccgEntries" )),
      URI.create("https://ontology.mayo.edu/taxonomies/ccgEntries/20190801/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/ccgEntries/20190801/"))
      .withLabel( edu.mayo.ontology.taxonomies.ccgentries.ConceptDefinitionType.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.ccgentries.ConceptDefinitionType.SCHEME_ID )
      .withVersion( "20190801" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2019-08-01") );

  public static final Map<UUID, ConceptDefinitionType> index = indexByUUID(ConceptDefinitionType.values());

  private TermDescription description;
  private ConceptDefinitionTypeSeries series;

  public TermDescription getDescription() {
    return description;
  }

  ConceptDefinitionType(final String conceptId, final String conceptUUID,
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
  public ConceptDefinitionTypeSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.ccgentries.ConceptDefinitionType> asSeries() {
    return toSeries();
  }

  private ConceptDefinitionTypeSeries toSeries() {
    if (series == null) {
      series = (ConceptDefinitionTypeSeries) ConceptDefinitionTypeSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<ConceptDefinitionType> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<ConceptDefinitionType> {
    protected ConceptDefinitionType[] getValues() {
      return values();
    }
    @Override
    protected Optional<ConceptDefinitionType> resolveUUID(UUID uuid) {
      return ConceptDefinitionType.resolveUUID(uuid);
    }
  }


  public static Optional<ConceptDefinitionType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<ConceptDefinitionType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<ConceptDefinitionType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<ConceptDefinitionType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<ConceptDefinitionType> resolveTag(final String tag) {
    Optional<ConceptDefinitionType> l = resolveTerm(tag, ConceptDefinitionType.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, ConceptDefinitionType.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<ConceptDefinitionType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<ConceptDefinitionType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, ConceptDefinitionType.values(), Term::getConceptId);
  }

  public static Optional<ConceptDefinitionType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, ConceptDefinitionType.values(), Term::getRef);
  }

}
