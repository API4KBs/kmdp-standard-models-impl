package edu.mayo.ontology.taxonomies.kao.decisiontype._20190801;

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
import edu.mayo.ontology.taxonomies.kao.decisiontype.DecisionTypeSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "DecisionType")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( DecisionType.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = DecisionType.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = DecisionType.JsonDeserializer.class )
public enum DecisionType implements edu.mayo.ontology.taxonomies.kao.decisiontype.DecisionType {


    /* Decision about what action or intervention is next, based on the current state. The outcome of the decision is the intent to do something in the future */
    @javax.xml.bind.annotation.XmlEnumValue("ActionableDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/ActionableDecision" )
    Actionable_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#28d541e1-bd08-3afc-a3f0-3780601576c6", "28d541e1-bd08-3afc-a3f0-3780601576c6", "ActionableDecision", java.util.Arrays.asList( "ActionableDecision" ), "Actionable Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/ActionableDecision",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Decision that (answers a question that) aims to gain more information about some state of affairs - past, present or future. */
    @javax.xml.bind.annotation.XmlEnumValue("AssessmentDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/AssessmentDecision" )
    Assessment_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#d03ea564-0d31-3e72-a98b-cb93aa4c5cce", "d03ea564-0d31-3e72-a98b-cb93aa4c5cce", "AssessmentDecision", java.util.Arrays.asList( "AssessmentDecision" ), "Assessment Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/AssessmentDecision",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Decision that requires to synthesizes or reduces a set of given pieces of information of the same kind into a single piece of information */
    @javax.xml.bind.annotation.XmlEnumValue("AggregationDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/AggregationDecision" )
    Aggregation_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#7a42c227-08ed-36af-a332-b6f04cc457b3", "7a42c227-08ed-36af-a332-b6f04cc457b3", "AggregationDecision", java.util.Arrays.asList( "AggregationDecision" ), "Aggregation Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/AggregationDecision",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Decision that is intended to be made by two or more decision makers, i.e. such that the answer to the decision making process will result from the consensus of two or more agents */
    @javax.xml.bind.annotation.XmlEnumValue("SharedDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/SharedDecision" )
    Shared_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#bd53d56d-e2c7-3ec2-ae91-5af122027498", "bd53d56d-e2c7-3ec2-ae91-5af122027498", "SharedDecision", java.util.Arrays.asList( "SharedDecision" ), "Shared Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/SharedDecision",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Decision that implies the selection of one or more elements out of a finite, explicitly enumerated set of categorical alternatives, each one of which can be evaluated independently, as well as compared to each other. */
    @javax.xml.bind.annotation.XmlEnumValue("SelectionDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/SelectionDecision" )
    Selection_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#cb854ec0-87c7-30b0-96ef-a73b6fac8cf8", "cb854ec0-87c7-30b0-96ef-a73b6fac8cf8", "SelectionDecision", java.util.Arrays.asList( "SelectionDecision" ), "Selection Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/SelectionDecision",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Selection Decision that requires to select one and only one of the alternatives */
    @javax.xml.bind.annotation.XmlEnumValue("ChoiceDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/ChoiceDecision" )
    Choice_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#21d77342-d120-324b-9ac6-11562e52c4cd", "21d77342-d120-324b-9ac6-11562e52c4cd", "ChoiceDecision", java.util.Arrays.asList( "ChoiceDecision" ), "Choice Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/ChoiceDecision",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Selection_Decision,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Selection_Decision,  } ) , 
   
    /* Choice between two complementary options */
    @javax.xml.bind.annotation.XmlEnumValue("BinaryDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/BinaryDecision" )
    Binary_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#7c76cd04-06af-39e3-9510-432336716f7e", "7c76cd04-06af-39e3-9510-432336716f7e", "BinaryDecision", java.util.Arrays.asList( "BinaryDecision" ), "Binary Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/BinaryDecision",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Choice_Decision,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Choice_Decision,  edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Selection_Decision,  } ) , 
   
    /* Binary decision where the options are &#39;yes&#39; vs &#39;no&#39;, or &#39;true&#39; vs &#39;false&#39; */
    @javax.xml.bind.annotation.XmlEnumValue("BooleanDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/BooleanDecision" )
    Boolean_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#c49eb0da-074c-30cd-9ced-7ba597ac1d15", "c49eb0da-074c-30cd-9ced-7ba597ac1d15", "BooleanDecision", java.util.Arrays.asList( "BooleanDecision" ), "Boolean Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/BooleanDecision",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Binary_Decision,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Binary_Decision,  edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Choice_Decision,  edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Selection_Decision,  } ) , 
   
    /* Binary (boolean) Decision such that, when occurrences are resolved to &quot;false&quot; in a given situation, will defeat the purpose of making another otherwise &quot;enabled&quot; decision. */
    @javax.xml.bind.annotation.XmlEnumValue("EnablerDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/EnablerDecision" )
    Enabler_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#d6186f7a-7fa0-3370-938f-47511c079480", "d6186f7a-7fa0-3370-938f-47511c079480", "EnablerDecision", java.util.Arrays.asList( "EnablerDecision" ), "Enabler Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/EnablerDecision",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Decision that can have a model based on computable techniques, and such that can be faithfully expressed in a machine-executable language */
    @javax.xml.bind.annotation.XmlEnumValue("ComputableDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/ComputableDecision" )
    Computable_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#8c1bd5ba-c9aa-3d6f-8a5c-40cbb9bbd31a", "8c1bd5ba-c9aa-3d6f-8a5c-40cbb9bbd31a", "ComputableDecision", java.util.Arrays.asList( "ComputableDecision" ), "Computable Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/ComputableDecision",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Decision that is made for the purpose of informing another decision, and as such does not need to be communicated explicitly. */
    @javax.xml.bind.annotation.XmlEnumValue("ImplicitDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/ImplicitDecision" )
    Implicit_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#e0dbe4d9-79b5-390c-91a9-bcc756d68b18", "e0dbe4d9-79b5-390c-91a9-bcc756d68b18", "ImplicitDecision", java.util.Arrays.asList( "ImplicitDecision" ), "Implicit Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/ImplicitDecision",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Decision based on the mutual temporal correlation between multiple pieces of information */
    @javax.xml.bind.annotation.XmlEnumValue("CorrelationDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/CorrelationDecision" )
    Temporal_Correlation_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#cc45cb9e-0a9e-396e-90a4-79a8a632901d", "cc45cb9e-0a9e-396e-90a4-79a8a632901d", "CorrelationDecision", java.util.Arrays.asList( "CorrelationDecision" ), "Temporal Correlation Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/CorrelationDecision",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Correlation decision which has one explicit &quot;anchor concept&quot;, to which all other input concepts are related */
    @javax.xml.bind.annotation.XmlEnumValue("PivotalDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/PivotalDecision" )
    Pivotal_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#6fab9428-08bc-3a45-aa51-fd0a37682098", "6fab9428-08bc-3a45-aa51-fd0a37682098", "PivotalDecision", java.util.Arrays.asList( "PivotalDecision" ), "Pivotal Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/PivotalDecision",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Temporal_Correlation_Decision,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.decisiontype._20190801.DecisionType.Temporal_Correlation_Decision,  } ) , 
   
    /* Decision that cannot be modeled and faithfully expressed in a computable way. As such, the decision making processes it abstracts generally require a human agent to be performed successfully */
    @javax.xml.bind.annotation.XmlEnumValue("NaturalisticDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/NaturalisticDecision" )
    Naturalistic_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#20953273-18b7-3ec2-813f-1e71808e9823", "20953273-18b7-3ec2-813f-1e71808e9823", "NaturalisticDecision", java.util.Arrays.asList( "NaturalisticDecision" ), "Naturalistic Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/NaturalisticDecision",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Binary (boolean) Decision such that, when occurrences are resolved to &quot;true&quot; in a given situation, will defeat the purpose of making other &quot;defeated&quot; decisions */
    @javax.xml.bind.annotation.XmlEnumValue("DefeaterDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/DefeaterDecision" )
    Defeater_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#a2db22af-c342-3bc8-960c-75a18a23dd22", "a2db22af-c342-3bc8-960c-75a18a23dd22", "DefeaterDecision", java.util.Arrays.asList( "DefeaterDecision" ), "Defeater Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/DefeaterDecision",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Decision such that its decision making process will require the exchange of information between two or more agents, possibly following some established protocol */
    @javax.xml.bind.annotation.XmlEnumValue("InteractiveDecision")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/ontologies/decisionmodels/InteractiveDecision" )
    Interactive_Decision( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType#022cdc44-8bbc-3edc-b14a-fca761d24704", "022cdc44-8bbc-3edc-b14a-fca761d24704", "InteractiveDecision", java.util.Arrays.asList( "InteractiveDecision" ), "Interactive Decision", "http://ontology.mayo.edu/ontologies/decisionmodels/InteractiveDecision",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/DecisionType/20190801/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/DecisionType/20190801/"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.decisiontype.DecisionType.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.decisiontype.DecisionType.SCHEME_ID )
      .withVersion( "20190801" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2019-08-01") );

  public static final Map<UUID, DecisionType> index = indexByUUID(DecisionType.values());

  private TermDescription description;
  private DecisionTypeSeries series;

  public TermDescription getDescription() {
    return description;
  }

  DecisionType(final String conceptId, final String conceptUUID,
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
  public DecisionTypeSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.decisiontype.DecisionType> asSeries() {
    return toSeries();
  }

  private DecisionTypeSeries toSeries() {
    if (series == null) {
      series = (DecisionTypeSeries) DecisionTypeSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<DecisionType> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<DecisionType> {
    protected DecisionType[] getValues() {
      return values();
    }
    @Override
    protected Optional<DecisionType> resolveUUID(UUID uuid) {
      return DecisionType.resolveUUID(uuid);
    }
  }


  public static Optional<DecisionType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<DecisionType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<DecisionType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<DecisionType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<DecisionType> resolveTag(final String tag) {
    Optional<DecisionType> l = resolveTerm(tag, DecisionType.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, DecisionType.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<DecisionType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<DecisionType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, DecisionType.values(), Term::getConceptId);
  }

  public static Optional<DecisionType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, DecisionType.values(), Term::getRef);
  }

}
