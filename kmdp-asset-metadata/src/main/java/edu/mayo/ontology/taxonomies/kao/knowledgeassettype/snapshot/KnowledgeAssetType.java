package edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot;

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

import edu.mayo.ontology.taxonomies.kao.knowledgeassettype.KnowledgeAssetTypeSeries;
import edu.mayo.kmdp.terms.impl.model.AnonymousConceptScheme;


@javax.xml.bind.annotation.XmlType(name = "KnowledgeAssetType")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeAssetType.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeAssetType.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeAssetType.JsonDeserializer.class )
public enum KnowledgeAssetType implements edu.mayo.ontology.taxonomies.kao.knowledgeassettype.KnowledgeAssetType {


    /* Systematically developed statements to assist provider decisions about appropriate healthcare for specific clinical situations */
    @javax.xml.bind.annotation.XmlEnumValue("ClinicalPracticeGuideline")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ckao/ClinicalPracticeGuideline" )
    Clinical_Practice_Guideline( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#a145eccf-b803-3766-a23b-12accce04675", "a145eccf-b803-3766-a23b-12accce04675", "ClinicalPracticeGuideline", java.util.Arrays.asList( "ClinicalPracticeGuideline" ), "Clinical Practice Guideline", "https://www.omg.org/spec/API4KP/api4kp-ckao/ClinicalPracticeGuideline",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* If a grammar X formalizes a Language L, and X is expressed by an abstract syntax S, L is &#39;specified by&#39; S. */
    @javax.xml.bind.annotation.XmlEnumValue("Grammar")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/Grammar" )
    Grammar( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#d305bbe7-9fb9-3d87-a3fd-a339c8b601b6", "d305bbe7-9fb9-3d87-a3fd-a339c8b601b6", "Grammar", java.util.Arrays.asList( "Grammar" ), "grammar", "https://www.omg.org/spec/API4KP/api4kp/Grammar",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* formal grammar */
    @javax.xml.bind.annotation.XmlEnumValue("FormalGrammar")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/FormalGrammar" )
    Formal_Grammar( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#ddbe6d71-1ed9-349f-a283-ce5b9f1a2e23", "ddbe6d71-1ed9-349f-a283-ce5b9f1a2e23", "FormalGrammar", java.util.Arrays.asList( "FormalGrammar" ), "formal grammar", "https://www.omg.org/spec/API4KP/api4kp/FormalGrammar",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Grammar,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Grammar,  } ) , 
   
    /* descriptive grammar */
    @javax.xml.bind.annotation.XmlEnumValue("DescriptiveGrammar")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/DescriptiveGrammar" )
    Descriptive_Grammar( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#953fe157-b1df-3af4-8a6e-8e6d680d77b0", "953fe157-b1df-3af4-8a6e-8e6d680d77b0", "DescriptiveGrammar", java.util.Arrays.asList( "DescriptiveGrammar" ), "descriptive grammar", "https://www.omg.org/spec/API4KP/api4kp/DescriptiveGrammar",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Grammar,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Grammar,  } ) , 
   
    /* prescriptive grammar */
    @javax.xml.bind.annotation.XmlEnumValue("PrescriptiveGrammar")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/PrescriptiveGrammar" )
    Prescriptive_Grammar( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#a73acd8e-1de9-37b7-80ff-41ff37493475", "a73acd8e-1de9-37b7-80ff-41ff37493475", "PrescriptiveGrammar", java.util.Arrays.asList( "PrescriptiveGrammar" ), "prescriptive grammar", "https://www.omg.org/spec/API4KP/api4kp/PrescriptiveGrammar",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Grammar,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Grammar,  } ) , 
   
    /* knowledge that allows to infer an otherwise unknown or not directly observable state or situation */
    @javax.xml.bind.annotation.XmlEnumValue("AssessmentModel")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/AssessmentModel" )
    Assessment_Model( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#18f58ef5-b603-3013-b61b-df1f8231e354", "18f58ef5-b603-3013-b61b-df1f8231e354", "AssessmentModel", java.util.Arrays.asList( "AssessmentModel" ), "Assessment Model", "https://www.omg.org/spec/API4KP/api4kp-kao/AssessmentModel",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* assessment of some state that is unobservable due to being in the future */
    @javax.xml.bind.annotation.XmlEnumValue("PredictiveModel")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/PredictiveModel" )
    Predictive_Model( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#259f3bea-58dc-383c-a2ad-9b485d6c24a6", "259f3bea-58dc-383c-a2ad-9b485d6c24a6", "PredictiveModel", java.util.Arrays.asList( "PredictiveModel" ), "Predictive Model", "https://www.omg.org/spec/API4KP/api4kp-kao/PredictiveModel",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Assessment_Model,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Assessment_Model,  } ) , 
   
    /* Knowledge about the application of well-known information processing methods, possibly chained together, which are stateless, functional and idempotent in nature. */
    @javax.xml.bind.annotation.XmlEnumValue("FunctionalExpression")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/FunctionalExpression" )
    Functional_Expression( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#5a1e9e9f-e6e8-3367-b2e8-3c0ee7e28ea3", "5a1e9e9f-e6e8-3367-b2e8-3c0ee7e28ea3", "FunctionalExpression", java.util.Arrays.asList( "FunctionalExpression" ), "Functional Expression", "https://www.omg.org/spec/API4KP/api4kp-kao/FunctionalExpression",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Assessment_Model,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Assessment_Model,  } ) , 
   
    /* A functional expression, defined in terms of two functional expressions connected by means of the well known equality operator. */
    @javax.xml.bind.annotation.XmlEnumValue("Equation")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/Equation" )
    Equation( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#aa8a1050-43d9-3127-8760-e67170853c2c", "aa8a1050-43d9-3127-8760-e67170853c2c", "Equation", java.util.Arrays.asList( "Equation" ), "Equation", "https://www.omg.org/spec/API4KP/api4kp-kao/Equation",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Functional_Expression,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Assessment_Model,  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Functional_Expression,  } ) , 
   
    /* Assessment that can be abstracted by means of a question, which requires to select one out of a set of admissible options */
    @javax.xml.bind.annotation.XmlEnumValue("DecisionModel")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/DecisionModel" )
    Decision_Model( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#310adb96-1a21-3100-90eb-c7ef4fe270e7", "310adb96-1a21-3100-90eb-c7ef4fe270e7", "DecisionModel", java.util.Arrays.asList( "DecisionModel" ), "Decision Model", "https://www.omg.org/spec/API4KP/api4kp-kao/DecisionModel",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Assessment_Model,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Assessment_Model,  } ) , 
   
    /* Decision Model that includes an unambiguous definition of every concept involved */
    @javax.xml.bind.annotation.XmlEnumValue("SemanticDecisionModel")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/SemanticDecisionModel" )
    Semantic_Decision_Model( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#56b58fc2-b66f-3175-878e-bc3ef01cb916", "56b58fc2-b66f-3175-878e-bc3ef01cb916", "SemanticDecisionModel", java.util.Arrays.asList( "SemanticDecisionModel" ), "Semantic Decision Model", "https://www.omg.org/spec/API4KP/api4kp-kao/SemanticDecisionModel",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Decision_Model,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Assessment_Model,  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Decision_Model,  } ) , 
   
    /* Decision Model that includes an explicit specification of its decision making logic, suitable to be faithfully expressed in a computable language */
    @javax.xml.bind.annotation.XmlEnumValue("ComputableDecisionModel")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/ComputableDecisionModel" )
    Computable_Decision_Model( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#34de94f3-e2fe-3803-bc24-e508dfff3821", "34de94f3-e2fe-3803-bc24-e508dfff3821", "ComputableDecisionModel", java.util.Arrays.asList( "ComputableDecisionModel" ), "Computable Decision Model", "https://www.omg.org/spec/API4KP/api4kp-kao/ComputableDecisionModel",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Decision_Model,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Assessment_Model,  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Decision_Model,  } ) , 
   
    /* Definition used to classify persons into classes defined by some common characteristic */
    @javax.xml.bind.annotation.XmlEnumValue("CohortDefinition")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/CohortDefinition" )
    Cohort_Definition( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#6f9cfd8e-2208-38c5-82b5-c76befa20dc2", "6f9cfd8e-2208-38c5-82b5-c76befa20dc2", "CohortDefinition", java.util.Arrays.asList( "CohortDefinition" ), "Cohort Definition", "https://www.omg.org/spec/API4KP/api4kp-kao/CohortDefinition",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* A shared, endorsed, justified, imperative specification of the expected behavior of one or more agents in a specific situation */
    @javax.xml.bind.annotation.XmlEnumValue("Protocol")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/Protocol" )
    Protocol( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#888a77f5-ac07-38b6-8800-1822417df8b6", "888a77f5-ac07-38b6-8800-1822417df8b6", "Protocol", java.util.Arrays.asList( "Protocol" ), "Protocol", "https://www.omg.org/spec/API4KP/api4kp-kao/Protocol",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Protocol applicable in a clinical situation, such that it directs the behavior of patients and/or providers */
    @javax.xml.bind.annotation.XmlEnumValue("ClinicalProtocol")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ckao/ClinicalProtocol" )
    Clinical_Protocol( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#ab6a0cf1-bf9b-3167-ab63-7855b33c002b", "ab6a0cf1-bf9b-3167-ab63-7855b33c002b", "ClinicalProtocol", java.util.Arrays.asList( "ClinicalProtocol" ), "Clinical Protocol", "https://www.omg.org/spec/API4KP/api4kp-ckao/ClinicalProtocol",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Protocol,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Protocol,  } ) , 
   
    /* Descriptions of the objectives, design, methodology, statistical considerations and aspects related to the organization of clinical trials.Trial protocols provide the background and rationale for conducting a study, highlighting specific research questions that are addressed, and taking into consideration ethical issues. Trial protocols must meet a standard that adheres to the principles of Good Clinical Practice, and are used to obtain ethics approval by local Ethics Committees or Institutional Review Boards. */
    @javax.xml.bind.annotation.XmlEnumValue("ClinicalTrialProtocol")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ckao/ClinicalTrialProtocol" )
    Clinical_Trial_Protocol( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#db61721f-b412-30cb-a8c9-571ec143e45b", "db61721f-b412-30cb-a8c9-571ec143e45b", "ClinicalTrialProtocol", java.util.Arrays.asList( "ClinicalTrialProtocol" ), "Clinical Trial Protocol", "https://www.omg.org/spec/API4KP/api4kp-ckao/ClinicalTrialProtocol",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Clinical_Protocol,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Protocol,  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Clinical_Protocol,  } ) , 
   
    /* Protocol that directs the behavior of nurses */
    @javax.xml.bind.annotation.XmlEnumValue("NursingProtocol")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ckao/NursingProtocol" )
    Nursing_Protocol( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#6047674c-0d9b-3c81-89a3-6943f3a7169b", "6047674c-0d9b-3c81-89a3-6943f3a7169b", "NursingProtocol", java.util.Arrays.asList( "NursingProtocol" ), "Nursing Protocol", "https://www.omg.org/spec/API4KP/api4kp-ckao/NursingProtocol",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Clinical_Protocol,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Protocol,  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Clinical_Protocol,  } ) , 
   
    /* A standardized list of orders for a specific diagnosis */
    @javax.xml.bind.annotation.XmlEnumValue("OrderSet")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ckao/OrderSet" )
    Order_Set( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#ec0813c7-748e-3c4f-ba9c-dd475f04f471", "ec0813c7-748e-3c4f-ba9c-dd475f04f471", "OrderSet", java.util.Arrays.asList( "OrderSet" ), "Order Set", "https://www.omg.org/spec/API4KP/api4kp-ckao/OrderSet",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Computational logic to direct clinical interventions that is typically expressed as if/then statements but may also be represented by a diagram, decision table or other representation language */
    @javax.xml.bind.annotation.XmlEnumValue("ClinicalRule")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ckao/ClinicalRule" )
    Clinical_Rule( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#85a69294-58d2-3fc2-b6b6-1603601b6b6d", "85a69294-58d2-3fc2-b6b6-1603601b6b6d", "ClinicalRule", java.util.Arrays.asList( "ClinicalRule" ), "Clinical Rule", "https://www.omg.org/spec/API4KP/api4kp-ckao/ClinicalRule",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* A set of pairs of &quot;codes&quot;, drawn from one or more code systems, and human-readable terms that represent clinical concepts (e.g. &quot;diabetes type II&quot;) */
    @javax.xml.bind.annotation.XmlEnumValue("ValueSet")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/ValueSet" )
    Value_Set( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#346ce957-0279-3835-8e0a-488b82c5e509", "346ce957-0279-3835-8e0a-488b82c5e509", "ValueSet", java.util.Arrays.asList( "ValueSet" ), "Value Set", "https://www.omg.org/spec/API4KP/api4kp-kao/ValueSet",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* An organized collection of determinable concepts, possibly associated to questions, which are meant to be resolved in a particular context */
    @javax.xml.bind.annotation.XmlEnumValue("DocumentationTemplate")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/DocumentationTemplate" )
    Documentation_Template( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#eb91048e-f75c-383f-9ffa-28b83003b13f", "eb91048e-f75c-383f-9ffa-28b83003b13f", "DocumentationTemplate", java.util.Arrays.asList( "DocumentationTemplate" ), "Documentation Template", "https://www.omg.org/spec/API4KP/api4kp-kao/DocumentationTemplate",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* An organized collection of questions intended to solicit information from patients, providers or other individuals in the healthcare domain */
    @javax.xml.bind.annotation.XmlEnumValue("Questionnaire")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/Questionnaire" )
    Questionnaire( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#179d692e-f970-3bcf-ad92-ff37fd394ec8", "179d692e-f970-3bcf-ad92-ff37fd394ec8", "Questionnaire", java.util.Arrays.asList( "Questionnaire" ), "Questionnaire", "https://www.omg.org/spec/API4KP/api4kp-kao/Questionnaire",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Documentation_Template,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Documentation_Template,  } ) , 
   
    /* Adaptive specification of how to perform (complex) clinical activities, properly orchestrated over time, so to achieve certain objectives and goals */
    @javax.xml.bind.annotation.XmlEnumValue("CareProcessModel")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ckao/CareProcessModel" )
    Care_Process_Model( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#434e06c0-e3df-3e57-9862-144f7c7857c4", "434e06c0-e3df-3e57-9862-144f7c7857c4", "CareProcessModel", java.util.Arrays.asList( "CareProcessModel" ), "Care Process Model", "https://www.omg.org/spec/API4KP/api4kp-ckao/CareProcessModel",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset that captures how information is processed internally by an intelligent agent */
    @javax.xml.bind.annotation.XmlEnumValue("CognitiveProcessModel")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/CognitiveProcessModel" )
    Cognitive_Process_Model( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#e12dcd92-f8de-3115-b8ca-4480cfc44d77", "e12dcd92-f8de-3115-b8ca-4480cfc44d77", "CognitiveProcessModel", java.util.Arrays.asList( "CognitiveProcessModel" ), "Cognitive Process Model", "https://www.omg.org/spec/API4KP/api4kp-kao/CognitiveProcessModel",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge whose primary subject is the cognitive aspects of a Care Process */
    @javax.xml.bind.annotation.XmlEnumValue("CognitiveCareProcessModel")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ckao/CognitiveCareProcessModel" )
    Cognitive_Care_Process_Model( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#5ae45eed-8397-3431-a5f9-c963e3b5411d", "5ae45eed-8397-3431-a5f9-c963e3b5411d", "CognitiveCareProcessModel", java.util.Arrays.asList( "CognitiveCareProcessModel" ), "Cognitive Care Process Model", "https://www.omg.org/spec/API4KP/api4kp-ckao/CognitiveCareProcessModel",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Cognitive_Process_Model,  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Care_Process_Model,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Care_Process_Model,  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Cognitive_Process_Model,  } ) , 
   
    /* Model of who, when, where and why a Decision is made, usually as part of a broader process. Also known as Decision Making Process Model, usually includes a Decision Model that specifies how to actually choose the optimal option */
    @javax.xml.bind.annotation.XmlEnumValue("DecisionTaskModel")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/DecisionTaskModel" )
    Decision_Task_Model( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#b6d9833f-1d31-3851-918b-5e4c58da46cd", "b6d9833f-1d31-3851-918b-5e4c58da46cd", "DecisionTaskModel", java.util.Arrays.asList( "DecisionTaskModel" ), "Decision Task Model", "https://www.omg.org/spec/API4KP/api4kp-kao/DecisionTaskModel",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Cognitive_Process_Model,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Cognitive_Process_Model,  } ) , 
   
    /* Decision Task Model that requires the participation of two or more agents */
    @javax.xml.bind.annotation.XmlEnumValue("MultiAgentDecisionTaskModel")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/MultiAgentDecisionTaskModel" )
    Multi_Agent_Decision_Task_Model( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#5c742ccc-fb77-3f33-87f5-663c2d9d251c", "5c742ccc-fb77-3f33-87f5-663c2d9d251c", "MultiAgentDecisionTaskModel", java.util.Arrays.asList( "MultiAgentDecisionTaskModel" ), "Multi-Agent Decision Task Model", "https://www.omg.org/spec/API4KP/api4kp-kao/MultiAgentDecisionTaskModel",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Decision_Task_Model,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Cognitive_Process_Model,  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Decision_Task_Model,  } ) , 
   
    /* (Meta) model that defines which information should be captured about some kind of domain */
    @javax.xml.bind.annotation.XmlEnumValue("InformationModel")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/InformationModel" )
    Information_Model( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#ca24fdd2-0157-3afd-9e47-8e4301f7d1cd", "ca24fdd2-0157-3afd-9e47-8e4301f7d1cd", "InformationModel", java.util.Arrays.asList( "InformationModel" ), "Information Model", "https://www.omg.org/spec/API4KP/api4kp-kao/InformationModel",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Information Model designed such that instances have one and only one interpretation */
    @javax.xml.bind.annotation.XmlEnumValue("SemanticInformationModel")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/SemanticInformationModel" )
    Semantic_Information_Model( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#58d7a7c1-4301-3361-90b0-f753ba6308f4", "58d7a7c1-4301-3361-90b0-f753ba6308f4", "SemanticInformationModel", java.util.Arrays.asList( "SemanticInformationModel" ), "Semantic Information Model", "https://www.omg.org/spec/API4KP/api4kp-kao/SemanticInformationModel",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Information_Model,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Information_Model,  } ) , 
   
    /* CQMs are tools that help measure or quantify healthcare processes, outcomes, patientperceptions and organizational structure and/or systems that are associated with the ability to provide high-quality healthcare and/or that relate to one or more quality goals */
    @javax.xml.bind.annotation.XmlEnumValue("QualityMeasure")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ckao/QualityMeasure" )
    Clinical_Quality_Measure( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#4f2167ce-cfab-34cf-b97f-e37131e2a6b1", "4f2167ce-cfab-34cf-b97f-e37131e2a6b1", "QualityMeasure", java.util.Arrays.asList( "QualityMeasure" ), "Clinical Quality Measure", "https://www.omg.org/spec/API4KP/api4kp-ckao/QualityMeasure",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* The definition of how (and possibly when and where) to ask a question, following some kind of protocol, for the purpose of receiving a specific answer, with the goal of gaining information in the process */
    @javax.xml.bind.annotation.XmlEnumValue("InquirySpecification")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/InquirySpecification" )
    Inquiry_Specification( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#1c381179-9148-3121-ba86-ba7323df346f", "1c381179-9148-3121-ba86-ba7323df346f", "InquirySpecification", java.util.Arrays.asList( "InquirySpecification" ), "Inquiry Specification", "https://www.omg.org/spec/API4KP/api4kp-kao/InquirySpecification",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* lexicon */
    @javax.xml.bind.annotation.XmlEnumValue("Lexicon")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp/Lexicon" )
    Lexicon( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#1dd8cd8a-f5f7-36dc-bb82-c583a35bd0bc", "1dd8cd8a-f5f7-36dc-bb82-c583a35bd0bc", "Lexicon", java.util.Arrays.asList( "Lexicon" ), "lexicon", "https://www.omg.org/spec/API4KP/api4kp/Lexicon",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Service Description */
    @javax.xml.bind.annotation.XmlEnumValue("ServiceDescription")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/ServiceDescription" )
    Service_Description( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#d9f6ec9f-4a1e-3a42-9205-58be1ec46b63", "d9f6ec9f-4a1e-3a42-9205-58be1ec46b63", "ServiceDescription", java.util.Arrays.asList( "ServiceDescription" ), "Service Description", "https://www.omg.org/spec/API4KP/api4kp-kao/ServiceDescription",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Service Description that refines (by constraint), and thus depends on, some Service Description */
    @javax.xml.bind.annotation.XmlEnumValue("ServiceProfile")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/ServiceProfile" )
    Service_Profile( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#c3a1659d-bcfb-3ee5-8965-72394890d15f", "c3a1659d-bcfb-3ee5-8965-72394890d15f", "ServiceProfile", java.util.Arrays.asList( "ServiceProfile" ), "Service Profile", "https://www.omg.org/spec/API4KP/api4kp-kao/ServiceProfile",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Service_Description,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Service_Description,  } ) , 
   
    /* Abstraction of the structure and/or behavior of the entities in a given domain */
    @javax.xml.bind.annotation.XmlEnumValue("ConceptualModel")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/ConceptualModel" )
    Conceptual_Domain_Model( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#7784234a-31a1-3034-a3ff-9f00bfd059df", "7784234a-31a1-3034-a3ff-9f00bfd059df", "ConceptualModel", java.util.Arrays.asList( "ConceptualModel" ), "Conceptual (Domain) Model", "https://www.omg.org/spec/API4KP/api4kp-kao/ConceptualModel",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge that is held to be a faithful conceptualization of the state of affairs in a given domain by all agents that share (and understand) it. */
    @javax.xml.bind.annotation.XmlEnumValue("FactualKnowledge")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/FactualKnowledge" )
    Factual_Knowledge( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#cade9984-b37f-3ca8-9443-6959296c57a3", "cade9984-b37f-3ca8-9443-6959296c57a3", "FactualKnowledge", java.util.Arrays.asList( "FactualKnowledge" ), "Factual Knowledge", "https://www.omg.org/spec/API4KP/api4kp-kao/FactualKnowledge",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Conceptual_Domain_Model,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Conceptual_Domain_Model,  } ) , 
   
    /* conceptual model that is based on formal principles, such as that allow to make inferences and/or verify the consistency of the model */
    @javax.xml.bind.annotation.XmlEnumValue("FormalOntology")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/FormalOntology" )
    Formal_Ontology( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#f7f24acc-0954-3cc4-bc89-9760e4a3a219", "f7f24acc-0954-3cc4-bc89-9760e4a3a219", "FormalOntology", java.util.Arrays.asList( "FormalOntology" ), "Formal Ontology", "https://www.omg.org/spec/API4KP/api4kp-kao/FormalOntology",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Conceptual_Domain_Model,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Conceptual_Domain_Model,  } ) , 
   
    /* Conceptual Work of Knowledge that has been adapted for a given context */
    @javax.xml.bind.annotation.XmlEnumValue("ContextualizabledKnowledge")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/ContextualizabledKnowledge" )
    Contextualizable_Knowledge( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType#3a2507a9-8d43-3bb0-892f-bda8705951fb", "3a2507a9-8d43-3bb0-892f-bda8705951fb", "ContextualizabledKnowledge", java.util.Arrays.asList( "ContextualizabledKnowledge" ), "Contextualizable Knowledge", "https://www.omg.org/spec/API4KP/api4kp-kao/ContextualizabledKnowledge",
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Conceptual_Domain_Model,  },
        new Term[] {  edu.mayo.ontology.taxonomies.kao.knowledgeassettype.snapshot.KnowledgeAssetType.Conceptual_Domain_Model,  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType/SNAPSHOT/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType/SNAPSHOT/"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.knowledgeassettype.KnowledgeAssetType.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.knowledgeassettype.KnowledgeAssetType.SCHEME_ID )
      .withVersion( "20200816-213264" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, KnowledgeAssetType> index = indexByUUID(KnowledgeAssetType.values());

  private TermDescription description;
  private KnowledgeAssetTypeSeries series;

  public TermDescription getDescription() {
    return description;
  }

  KnowledgeAssetType(final String conceptId, final String conceptUUID,
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
  public KnowledgeAssetTypeSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.knowledgeassettype.KnowledgeAssetType> asSeries() {
    return toSeries();
  }

  private KnowledgeAssetTypeSeries toSeries() {
    if (series == null) {
      series = (KnowledgeAssetTypeSeries) KnowledgeAssetTypeSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<KnowledgeAssetType> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<KnowledgeAssetType> {
    protected KnowledgeAssetType[] getValues() {
      return values();
    }
    @Override
    protected Optional<KnowledgeAssetType> resolveUUID(UUID uuid) {
      return KnowledgeAssetType.resolveUUID(uuid);
    }
  }


  public static Optional<KnowledgeAssetType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeAssetType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeAssetType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeAssetType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeAssetType> resolveTag(final String tag) {
    Optional<KnowledgeAssetType> l = resolveTerm(tag, KnowledgeAssetType.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, KnowledgeAssetType.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeAssetType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeAssetType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeAssetType.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeAssetType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeAssetType.values(), Term::getRef);
  }

}
