package edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801;

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
import edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.KnowledgeProcessingOperationSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "KnowledgeProcessingOperation")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeProcessingOperation.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeProcessingOperation.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeProcessingOperation.JsonDeserializer.class )
public enum KnowledgeProcessingOperation implements edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.KnowledgeProcessingOperation {


    /* &#39;Closed&#39; tasks start with the extraction of knowledge from a knowledge artifact (given or resolved), and are possibly terminated with the creation of a (new version of) a knowledge artifact.As such, they cannot be chained directly, but their composition is mediated by the use of carriers */
    @javax.xml.bind.annotation.XmlEnumValue("ClosedKnowledgeProcessingTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ClosedKnowledgeProcessingTask" )
    Closed_Knowledge_Processing_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#73f82424-3a8c-3aba-89ec-eb8cdb142348", "73f82424-3a8c-3aba-89ec-eb8cdb142348", "ClosedKnowledgeProcessingTask", java.util.Arrays.asList( "ClosedKnowledgeProcessingTask" ), "closed knowledge processing task", "https://www.omg.org/spec/API4KP/api4kp-ops/ClosedKnowledgeProcessingTask",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Associates identifiers (and or names) to the entity they denote, its location, or information about it */
    @javax.xml.bind.annotation.XmlEnumValue("IdentityResolutionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/IdentityResolutionTask" )
    Identity_Resolution_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#bc88357d-37ed-3daa-98bf-b66690b6b83a", "bc88357d-37ed-3daa-98bf-b66690b6b83a", "IdentityResolutionTask", java.util.Arrays.asList( "IdentityResolutionTask" ), "identity resolution task", "https://www.omg.org/spec/API4KP/api4kp-ops/IdentityResolutionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Closed_Knowledge_Processing_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Closed_Knowledge_Processing_Task,  } ) , 
   
    /* identity lookup task */
    @javax.xml.bind.annotation.XmlEnumValue("IdentityLookupTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/IdentityLookupTask" )
    Identity_Lookup_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#f62fbbd5-a061-3a45-9cb3-fa340f6bad2c", "f62fbbd5-a061-3a45-9cb3-fa340f6bad2c", "IdentityLookupTask", java.util.Arrays.asList( "IdentityLookupTask" ), "identity lookup task", "https://www.omg.org/spec/API4KP/api4kp-ops/IdentityLookupTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Identity_Resolution_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Closed_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Identity_Resolution_Task,  } ) , 
   
    /* identity negotiation task */
    @javax.xml.bind.annotation.XmlEnumValue("IdentityNegotiationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/IdentityNegotiationTask" )
    Identity_Negotiation_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#0a51894a-d7f2-37e6-a614-f4cc4801bc23", "0a51894a-d7f2-37e6-a614-f4cc4801bc23", "IdentityNegotiationTask", java.util.Arrays.asList( "IdentityNegotiationTask" ), "identity negotiation task", "https://www.omg.org/spec/API4KP/api4kp-ops/IdentityNegotiationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Identity_Resolution_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Closed_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Identity_Resolution_Task,  } ) , 
   
    /* Tasks executed as a service are necessarily closed, as they are mediated by the request and regulated by the service contract. */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeProcessingServiceTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeProcessingServiceTask" )
    Knowledge_Processing_Service_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#825457ba-9920-3de6-b0f3-06acfedcd720", "825457ba-9920-3de6-b0f3-06acfedcd720", "KnowledgeProcessingServiceTask", java.util.Arrays.asList( "KnowledgeProcessingServiceTask" ), "knowledge processing service task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeProcessingServiceTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Closed_Knowledge_Processing_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Closed_Knowledge_Processing_Task,  } ) , 
   
    /* knowledge repository task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeRepositoryTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeRepositoryTask" )
    Knowledge_Repository_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#6bfe6747-7f5a-3fcc-b4f2-d18692648af0", "6bfe6747-7f5a-3fcc-b4f2-d18692648af0", "KnowledgeRepositoryTask", java.util.Arrays.asList( "KnowledgeRepositoryTask" ), "knowledge repository task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeRepositoryTask",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* internal repository task */
    @javax.xml.bind.annotation.XmlEnumValue("InternalRepositoryTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/InternalRepositoryTask" )
    Internal_Repository_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#7891ab4e-4dbc-3465-9e0e-16845e1ccbd7", "7891ab4e-4dbc-3465-9e0e-16845e1ccbd7", "InternalRepositoryTask", java.util.Arrays.asList( "InternalRepositoryTask" ), "internal repository task", "https://www.omg.org/spec/API4KP/api4kp-ops/InternalRepositoryTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Repository_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Closed_Knowledge_Processing_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Closed_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Repository_Task,  } ) , 
   
    /* replace artifact at location task */
    @javax.xml.bind.annotation.XmlEnumValue("ReplaceArtifactAtLocationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ReplaceArtifactAtLocationTask" )
    Replace_Artifact_At_Location_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#ddf7c540-9a48-367d-b44f-35340c53059e", "ddf7c540-9a48-367d-b44f-35340c53059e", "ReplaceArtifactAtLocationTask", java.util.Arrays.asList( "ReplaceArtifactAtLocationTask" ), "replace artifact at location task", "https://www.omg.org/spec/API4KP/api4kp-ops/ReplaceArtifactAtLocationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Internal_Repository_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Internal_Repository_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Closed_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Repository_Task,  } ) , 
   
    /* retrieve artifact from location task */
    @javax.xml.bind.annotation.XmlEnumValue("RetrieveArtifactFromLocationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/RetrieveArtifactFromLocationTask" )
    Retrieve_Artifact_From_Location_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#63ac5f26-d6f9-3ce1-86c3-a05931b7d18d", "63ac5f26-d6f9-3ce1-86c3-a05931b7d18d", "RetrieveArtifactFromLocationTask", java.util.Arrays.asList( "RetrieveArtifactFromLocationTask" ), "retrieve artifact from location task", "https://www.omg.org/spec/API4KP/api4kp-ops/RetrieveArtifactFromLocationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Internal_Repository_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Internal_Repository_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Closed_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Repository_Task,  } ) , 
   
    /* clear location task */
    @javax.xml.bind.annotation.XmlEnumValue("ClearLocationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ClearLocationTask" )
    Clear_Location_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#6ce7c8c6-01dd-37da-95d5-d6b2693a56a9", "6ce7c8c6-01dd-37da-95d5-d6b2693a56a9", "ClearLocationTask", java.util.Arrays.asList( "ClearLocationTask" ), "clear location task", "https://www.omg.org/spec/API4KP/api4kp-ops/ClearLocationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Internal_Repository_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Internal_Repository_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Closed_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Repository_Task,  } ) , 
   
    /* store artifact at location task */
    @javax.xml.bind.annotation.XmlEnumValue("StoreArtifactAtLocationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/StoreArtifactAtLocationTask" )
    Store_Artifact_At_Location_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#42abd65f-f86b-3b9a-b199-5d7375fe2a5d", "42abd65f-f86b-3b9a-b199-5d7375fe2a5d", "StoreArtifactAtLocationTask", java.util.Arrays.asList( "StoreArtifactAtLocationTask" ), "store artifact at location task", "https://www.omg.org/spec/API4KP/api4kp-ops/StoreArtifactAtLocationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Internal_Repository_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Internal_Repository_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Closed_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Repository_Task,  } ) , 
   
    /* knowledge reasoning task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeReasoningTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeReasoningTask" )
    Knowledge_Reasoning_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#093f6074-f693-3d96-bfc9-a9d60898cd9e", "093f6074-f693-3d96-bfc9-a9d60898cd9e", "KnowledgeReasoningTask", java.util.Arrays.asList( "KnowledgeReasoningTask" ), "knowledge reasoning task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeReasoningTask",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* semantic knowledge management task */
    @javax.xml.bind.annotation.XmlEnumValue("SemanticKnowledgeManagementTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SemanticKnowledgeManagementTask" )
    Semantic_Knowledge_Management_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#129119da-5063-37d3-884c-6f76b43a6eaa", "129119da-5063-37d3-884c-6f76b43a6eaa", "SemanticKnowledgeManagementTask", java.util.Arrays.asList( "SemanticKnowledgeManagementTask" ), "semantic knowledge management task", "https://www.omg.org/spec/API4KP/api4kp-ops/SemanticKnowledgeManagementTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  } ) , 
   
    /* discover compatible resources task */
    @javax.xml.bind.annotation.XmlEnumValue("DiscoverCompatibleResourcesTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/DiscoverCompatibleResourcesTask" )
    Discover_Compatible_Resources_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#73502609-4bba-3563-b3e2-292d2bd994bf", "73502609-4bba-3563-b3e2-292d2bd994bf", "DiscoverCompatibleResourcesTask", java.util.Arrays.asList( "DiscoverCompatibleResourcesTask" ), "discover compatible resources task", "https://www.omg.org/spec/API4KP/api4kp-ops/DiscoverCompatibleResourcesTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Semantic_Knowledge_Management_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Semantic_Knowledge_Management_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  } ) , 
   
    /* logic-based reasoning task */
    @javax.xml.bind.annotation.XmlEnumValue("LogicBasedReasoningTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/LogicBasedReasoningTask" )
    Logic_Based_Reasoning_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#6366dbb0-acff-39e1-a024-cc0c0640c023", "6366dbb0-acff-39e1-a024-cc0c0640c023", "LogicBasedReasoningTask", java.util.Arrays.asList( "LogicBasedReasoningTask" ), "logic-based reasoning task", "https://www.omg.org/spec/API4KP/api4kp-ops/LogicBasedReasoningTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  } ) , 
   
    /* given two concepts, determines whether one is necessarily broader than the other */
    @javax.xml.bind.annotation.XmlEnumValue("SubsumptionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SubsumptionTask" )
    Subsumption_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#513d2f6b-ef46-3383-94ac-b15081c14b80", "513d2f6b-ef46-3383-94ac-b15081c14b80", "SubsumptionTask", java.util.Arrays.asList( "SubsumptionTask" ), "subsumption task", "https://www.omg.org/spec/API4KP/api4kp-ops/SubsumptionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  } ) , 
   
    /* query answering task */
    @javax.xml.bind.annotation.XmlEnumValue("QueryAnswerTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/QueryAnswerTask" )
    Query_Answering_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#c44dc3e3-396c-39e7-8526-f5ba0866dd5b", "c44dc3e3-396c-39e7-8526-f5ba0866dd5b", "QueryAnswerTask", java.util.Arrays.asList( "QueryAnswerTask" ), "query answering task", "https://www.omg.org/spec/API4KP/api4kp-ops/QueryAnswerTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  } ) , 
   
    /* proof generation task */
    @javax.xml.bind.annotation.XmlEnumValue("ProofGenerationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ProofGenerationTask" )
    Proof_Generation_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#66e3a943-23b4-31f5-9a20-778c9e7bf2fb", "66e3a943-23b4-31f5-9a20-778c9e7bf2fb", "ProofGenerationTask", java.util.Arrays.asList( "ProofGenerationTask" ), "proof generation task", "https://www.omg.org/spec/API4KP/api4kp-ops/ProofGenerationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  } ) , 
   
    /* satisfiability check task */
    @javax.xml.bind.annotation.XmlEnumValue("SatisfiabilityCheckTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SatisfiabilityCheckTask" )
    Satisfiability_Check_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#821efb14-fbc0-324d-847c-4a1a8cbb7d23", "821efb14-fbc0-324d-847c-4a1a8cbb7d23", "SatisfiabilityCheckTask", java.util.Arrays.asList( "SatisfiabilityCheckTask" ), "satisfiability check task", "https://www.omg.org/spec/API4KP/api4kp-ops/SatisfiabilityCheckTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  } ) , 
   
    /* given a set of concepts (classes), determines whether (i) an individual is necessarily instance (member) of which concepts (classes)(ii) a concept (class) is narrower (subclass) of which concepts (classes) */
    @javax.xml.bind.annotation.XmlEnumValue("ClassificationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ClassificationTask" )
    Classification_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#1a37141f-d9a8-333f-81c8-c948b5418f06", "1a37141f-d9a8-333f-81c8-c948b5418f06", "ClassificationTask", java.util.Arrays.asList( "ClassificationTask" ), "classification task", "https://www.omg.org/spec/API4KP/api4kp-ops/ClassificationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  } ) , 
   
    /* consistency check task */
    @javax.xml.bind.annotation.XmlEnumValue("ConsistencyCheckTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ConsistencyCheckTask" )
    Consistency_Check_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#b6724bb4-9d9d-332d-8394-a8ace4de6d6d", "b6724bb4-9d9d-332d-8394-a8ace4de6d6d", "ConsistencyCheckTask", java.util.Arrays.asList( "ConsistencyCheckTask" ), "consistency check task", "https://www.omg.org/spec/API4KP/api4kp-ops/ConsistencyCheckTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  } ) , 
   
    /* resolve dependencies task */
    @javax.xml.bind.annotation.XmlEnumValue("ResolveDependenciesTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ResolveDependenciesTask" )
    Resolve_Dependencies_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#96b07f19-d787-3dbe-b6dc-fbd59363ab43", "96b07f19-d787-3dbe-b6dc-fbd59363ab43", "ResolveDependenciesTask", java.util.Arrays.asList( "ResolveDependenciesTask" ), "resolve dependencies task", "https://www.omg.org/spec/API4KP/api4kp-ops/ResolveDependenciesTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Semantic_Knowledge_Management_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Semantic_Knowledge_Management_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  } ) , 
   
    /* entailment check test */
    @javax.xml.bind.annotation.XmlEnumValue("EntailmentCheckTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/EntailmentCheckTask" )
    Entailment_Check_Test( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#960249cd-cd9d-33c5-84b4-9ea48bd3c1a9", "960249cd-cd9d-33c5-84b4-9ea48bd3c1a9", "EntailmentCheckTask", java.util.Arrays.asList( "EntailmentCheckTask" ), "entailment check test", "https://www.omg.org/spec/API4KP/api4kp-ops/EntailmentCheckTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  } ) , 
   
    /* inference task */
    @javax.xml.bind.annotation.XmlEnumValue("InferenceTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/InferenceTask" )
    Inference_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#d3c5d0a2-cc0b-3b91-b625-7335e4dd6d89", "d3c5d0a2-cc0b-3b91-b625-7335e4dd6d89", "InferenceTask", java.util.Arrays.asList( "InferenceTask" ), "inference task", "https://www.omg.org/spec/API4KP/api4kp-ops/InferenceTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task,  } ) , 
   
    /* resolve dependency closure task */
    @javax.xml.bind.annotation.XmlEnumValue("ResolveClosureTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ResolveClosureTask" )
    Resolve_Dependency_Closure_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#dc4096f9-4e81-32a2-9594-9d475da1de25", "dc4096f9-4e81-32a2-9594-9d475da1de25", "ResolveClosureTask", java.util.Arrays.asList( "ResolveClosureTask" ), "resolve dependency closure task", "https://www.omg.org/spec/API4KP/api4kp-ops/ResolveClosureTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Resolve_Dependencies_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Resolve_Dependencies_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Semantic_Knowledge_Management_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  } ) , 
   
    /* retrieve resource task */
    @javax.xml.bind.annotation.XmlEnumValue("RetrieveResourceTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/RetrieveResourceTask" )
    Retrieve_Resource_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#f40c084b-0f55-3d74-b84c-12e6eca3bd95", "f40c084b-0f55-3d74-b84c-12e6eca3bd95", "RetrieveResourceTask", java.util.Arrays.asList( "RetrieveResourceTask" ), "retrieve resource task", "https://www.omg.org/spec/API4KP/api4kp-ops/RetrieveResourceTask",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* retrieve resource description task */
    @javax.xml.bind.annotation.XmlEnumValue("RetrieveResourceDescriptionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/RetrieveResourceDescriptionTask" )
    Retrieve_Resource_Description_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#8a1f7581-0e54-354b-a75f-ca5338cc9efe", "8a1f7581-0e54-354b-a75f-ca5338cc9efe", "RetrieveResourceDescriptionTask", java.util.Arrays.asList( "RetrieveResourceDescriptionTask" ), "retrieve resource description task", "https://www.omg.org/spec/API4KP/api4kp-ops/RetrieveResourceDescriptionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Retrieve_Resource_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Retrieve_Resource_Task,  } ) , 
   
    /* extract description task */
    @javax.xml.bind.annotation.XmlEnumValue("ExtractDescriptionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ExtractDescriptionTask" )
    Extract_Description_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#ef0fec99-4530-3389-bf9c-09176da954f6", "ef0fec99-4530-3389-bf9c-09176da954f6", "ExtractDescriptionTask", java.util.Arrays.asList( "ExtractDescriptionTask" ), "extract description task", "https://www.omg.org/spec/API4KP/api4kp-ops/ExtractDescriptionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Semantic_Knowledge_Management_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Retrieve_Resource_Description_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Retrieve_Resource_Description_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Semantic_Knowledge_Management_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Retrieve_Resource_Task,  } ) , 
   
    /* knowledge analytic task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeAnalyticTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeAnalyticTask" )
    Knowledge_Analytic_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#6d0cadd1-a254-3154-b54d-2678719020af", "6d0cadd1-a254-3154-b54d-2678719020af", "KnowledgeAnalyticTask", java.util.Arrays.asList( "KnowledgeAnalyticTask" ), "knowledge analytic task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeAnalyticTask",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* detect language information task */
    @javax.xml.bind.annotation.XmlEnumValue("DetectLanguageInformationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/DetectLanguageInformationTask" )
    Detect_Language_Information_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#c1c32c40-a67a-3465-a408-89738cd4f5ae", "c1c32c40-a67a-3465-a408-89738cd4f5ae", "DetectLanguageInformationTask", java.util.Arrays.asList( "DetectLanguageInformationTask" ), "detect language information task", "https://www.omg.org/spec/API4KP/api4kp-ops/DetectLanguageInformationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Analytic_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Analytic_Task,  } ) , 
   
    /* detect signature task */
    @javax.xml.bind.annotation.XmlEnumValue("DetectSignatureTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/DetectSignatureTask" )
    Detect_Signature_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#5e8bac10-157a-3c3d-9c69-ea546c38767c", "5e8bac10-157a-3c3d-9c69-ea546c38767c", "DetectSignatureTask", java.util.Arrays.asList( "DetectSignatureTask" ), "detect signature task", "https://www.omg.org/spec/API4KP/api4kp-ops/DetectSignatureTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Analytic_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Analytic_Task,  } ) , 
   
    /* well-formedness check task */
    @javax.xml.bind.annotation.XmlEnumValue("WellFormednessCheckTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/WellFormednessCheckTask" )
    Well_Formedness_Check_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#180be9d5-8843-3d57-9014-6a9f147ed1bd", "180be9d5-8843-3d57-9014-6a9f147ed1bd", "WellFormednessCheckTask", java.util.Arrays.asList( "WellFormednessCheckTask" ), "well-formedness check task", "https://www.omg.org/spec/API4KP/api4kp-ops/WellFormednessCheckTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Analytic_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Analytic_Task,  } ) , 
   
    /* detect logic task */
    @javax.xml.bind.annotation.XmlEnumValue("DetectLogicTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/DetectLogicTask" )
    Detect_Logic_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#282b7e3f-5bf5-3a62-b2a1-245c8767dbe1", "282b7e3f-5bf5-3a62-b2a1-245c8767dbe1", "DetectLogicTask", java.util.Arrays.asList( "DetectLogicTask" ), "detect logic task", "https://www.omg.org/spec/API4KP/api4kp-ops/DetectLogicTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Analytic_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Analytic_Task,  } ) , 
   
    /* detect computational complexity task */
    @javax.xml.bind.annotation.XmlEnumValue("DetectComplexityTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/DetectComplexityTask" )
    Detect_Computational_Complexity_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#aeef45be-b169-31ae-ae6c-2bf9776d7052", "aeef45be-b169-31ae-ae6c-2bf9776d7052", "DetectComplexityTask", java.util.Arrays.asList( "DetectComplexityTask" ), "detect computational complexity task", "https://www.omg.org/spec/API4KP/api4kp-ops/DetectComplexityTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Analytic_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Analytic_Task,  } ) , 
   
    /* The act of comparing two knowledge resources to determine overlap and differences, returning a similarity degree, and pointers to the differences.Should leverage graph comparison, tree comparison or text line comparison (&#39;diff&#39;). */
    @javax.xml.bind.annotation.XmlEnumValue("DiffingTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/DiffingTask" )
    Diffing_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#9c738a06-9a1d-33ed-8c9c-4ae08cf585b8", "9c738a06-9a1d-33ed-8c9c-4ae08cf585b8", "DiffingTask", java.util.Arrays.asList( "DiffingTask" ), "diffing task", "https://www.omg.org/spec/API4KP/api4kp-ops/DiffingTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Analytic_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Analytic_Task,  } ) , 
   
    /* I/O write task */
    @javax.xml.bind.annotation.XmlEnumValue("WriteTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/WriteTask" )
    I_O_Write_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#5ded53ab-42e8-3054-b36c-12b90ee41b1a", "5ded53ab-42e8-3054-b36c-12b90ee41b1a", "WriteTask", java.util.Arrays.asList( "WriteTask" ), "I/O write task", "https://www.omg.org/spec/API4KP/api4kp-ops/WriteTask",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* retrieve artifact task */
    @javax.xml.bind.annotation.XmlEnumValue("RetrieveArtifactTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/RetrieveArtifactTask" )
    Retrieve_Artifact_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#485963fa-542a-36b6-85aa-b34b939c8ca9", "485963fa-542a-36b6-85aa-b34b939c8ca9", "RetrieveArtifactTask", java.util.Arrays.asList( "RetrieveArtifactTask" ), "retrieve artifact task", "https://www.omg.org/spec/API4KP/api4kp-ops/RetrieveArtifactTask",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* retrieve surrogate task */
    @javax.xml.bind.annotation.XmlEnumValue("RetrieveSurrogateTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/RetrieveSurrogateTask" )
    Retrieve_Surrogate_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#457f0909-9dc2-3260-bd3f-ee5e14d8f334", "457f0909-9dc2-3260-bd3f-ee5e14d8f334", "RetrieveSurrogateTask", java.util.Arrays.asList( "RetrieveSurrogateTask" ), "retrieve surrogate task", "https://www.omg.org/spec/API4KP/api4kp-ops/RetrieveSurrogateTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Retrieve_Artifact_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Retrieve_Artifact_Task,  } ) , 
   
    /* series management task */
    @javax.xml.bind.annotation.XmlEnumValue("SeriesManagementTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SeriesManagementTask" )
    Series_Management_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#5cfb689c-4afa-397e-b049-50c98e21a1f4", "5cfb689c-4afa-397e-b049-50c98e21a1f4", "SeriesManagementTask", java.util.Arrays.asList( "SeriesManagementTask" ), "series management task", "https://www.omg.org/spec/API4KP/api4kp-ops/SeriesManagementTask",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Unlike replication tasks, &#39;Snapshot tasks&#39; are atomic.In fact, a snapshot does not imply replication or any other activity, other than the guarantee that the ouput endevaor is immutable, and properly versioned */
    @javax.xml.bind.annotation.XmlEnumValue("SnapshotTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SnapshotTask" )
    Snapshot_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#987a73b4-0509-3f68-98bb-7a02873223d1", "987a73b4-0509-3f68-98bb-7a02873223d1", "SnapshotTask", java.util.Arrays.asList( "SnapshotTask" ), "snapshot task", "https://www.omg.org/spec/API4KP/api4kp-ops/SnapshotTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Series_Management_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Series_Management_Task,  } ) , 
   
    /* a task that generates new knowledge endeavors, according to methods that only leverage the syntactic and semantic aspects of a knowledge resource, but not its pragmatic ones. */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeManipulationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeManipulationTask" )
    Knowledge_Manipulation_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#d1c172f4-cf3d-3ad1-be10-146746d0014f", "d1c172f4-cf3d-3ad1-be10-146746d0014f", "KnowledgeManipulationTask", java.util.Arrays.asList( "KnowledgeManipulationTask" ), "knowledge manipulation task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeManipulationTask",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* knowledge structuring task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeStructuringTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeStructuringTask" )
    Knowledge_Structuring_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#f419e4e0-120b-3141-9629-7df055937a5c", "f419e4e0-120b-3141-9629-7df055937a5c", "KnowledgeStructuringTask", java.util.Arrays.asList( "KnowledgeStructuringTask" ), "knowledge structuring task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeStructuringTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* knowledge reshaping task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeReshapingTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeReshapingTask" )
    Knowledge_Reshaping_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#349c27da-60d3-3955-b8e5-1de2959ce258", "349c27da-60d3-3955-b8e5-1de2959ce258", "KnowledgeReshapingTask", java.util.Arrays.asList( "KnowledgeReshapingTask" ), "knowledge reshaping task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeReshapingTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* simplification task */
    @javax.xml.bind.annotation.XmlEnumValue("SimplificationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SimplificationTask" )
    Simplification_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#7d0b4c92-9108-3d62-8b3a-ad9753355eb6", "7d0b4c92-9108-3d62-8b3a-ad9753355eb6", "SimplificationTask", java.util.Arrays.asList( "SimplificationTask" ), "simplification task", "https://www.omg.org/spec/API4KP/api4kp-ops/SimplificationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* reduction task */
    @javax.xml.bind.annotation.XmlEnumValue("ReductionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ReductionTask" )
    Reduction_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#6a736666-1d8a-35f0-988c-71acf3bc1905", "6a736666-1d8a-35f0-988c-71acf3bc1905", "ReductionTask", java.util.Arrays.asList( "ReductionTask" ), "reduction task", "https://www.omg.org/spec/API4KP/api4kp-ops/ReductionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Simplification_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Simplification_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* Unlike translations, transcreations will generally result in the creation of a derivative Work, because of significative semantic and/or pragmatic differences in the outcome and its intended use. */
    @javax.xml.bind.annotation.XmlEnumValue("TranscreationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/TranscreationTask" )
    Transcreation_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#d07aa2d2-4c8f-37c1-b1c6-75cf3e177236", "d07aa2d2-4c8f-37c1-b1c6-75cf3e177236", "TranscreationTask", java.util.Arrays.asList( "TranscreationTask" ), "transcreation task", "https://www.omg.org/spec/API4KP/api4kp-ops/TranscreationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* The expression of the resulting WoK will not contain any linguistic element that evokes the redacted concepts. */
    @javax.xml.bind.annotation.XmlEnumValue("FilteringTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/FilteringTask" )
    Censoring_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#d64811b4-20b7-341c-9f79-b74ae835aa7b", "d64811b4-20b7-341c-9f79-b74ae835aa7b", "FilteringTask", java.util.Arrays.asList( "FilteringTask" ), "censoring task", "https://www.omg.org/spec/API4KP/api4kp-ops/FilteringTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Simplification_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Simplification_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* summarization task */
    @javax.xml.bind.annotation.XmlEnumValue("SummarizationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SummarizationTask" )
    Summarization_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#d4df954e-eb63-3e73-8a5d-b7929c502360", "d4df954e-eb63-3e73-8a5d-b7929c502360", "SummarizationTask", java.util.Arrays.asList( "SummarizationTask" ), "summarization task", "https://www.omg.org/spec/API4KP/api4kp-ops/SummarizationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Simplification_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Simplification_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* Selection is additive (to the target WoK), whereas simplification is subtractive (to the source WoK) */
    @javax.xml.bind.annotation.XmlEnumValue("SelectionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SelectionTask" )
    Selection_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#a5628370-845c-350f-b0e7-6cab66aac127", "a5628370-845c-350f-b0e7-6cab66aac127", "SelectionTask", java.util.Arrays.asList( "SelectionTask" ), "selection task", "https://www.omg.org/spec/API4KP/api4kp-ops/SelectionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* cherrypicking task */
    @javax.xml.bind.annotation.XmlEnumValue("CherrypickingTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/CherrypickingTask" )
    Cherrypicking_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#e2cd8d79-c1c6-37dd-ac1b-ee3f589cd645", "e2cd8d79-c1c6-37dd-ac1b-ee3f589cd645", "CherrypickingTask", java.util.Arrays.asList( "CherrypickingTask" ), "cherrypicking task", "https://www.omg.org/spec/API4KP/api4kp-ops/CherrypickingTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Selection_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Selection_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* syntactic knowledge processing task */
    @javax.xml.bind.annotation.XmlEnumValue("SyntacticKnowledgeProcessingTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SyntacticKnowledgeProcessingTask" )
    Syntactic_Knowledge_Processing_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#65640dd0-c2fe-3609-9380-408f0f560f50", "65640dd0-c2fe-3609-9380-408f0f560f50", "SyntacticKnowledgeProcessingTask", java.util.Arrays.asList( "SyntacticKnowledgeProcessingTask" ), "syntactic knowledge processing task", "https://www.omg.org/spec/API4KP/api4kp-ops/SyntacticKnowledgeProcessingTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* syntactic redaction task */
    @javax.xml.bind.annotation.XmlEnumValue("RedactionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/RedactionTask" )
    Syntactic_Redaction_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#c08cfda8-6856-3b22-90d1-1f1aa42d0816", "c08cfda8-6856-3b22-90d1-1f1aa42d0816", "RedactionTask", java.util.Arrays.asList( "RedactionTask" ), "syntactic redaction task", "https://www.omg.org/spec/API4KP/api4kp-ops/RedactionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Simplification_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Simplification_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* &#39;Horizontal&#39; tasks may use information at the ground level of abstraction, or at any level above. As such, for each task of this type there is a &#39;syntactic&#39; version and a &#39;semantic&#39; version. The latter uses information at the work of knowledge (abstract semantic graph) level, while the former uses only linguistic information (grammars/syntaxes) */
    @javax.xml.bind.annotation.XmlEnumValue("HorizontalKnowledgeProcessingTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/HorizontalKnowledgeProcessingTask" )
    Horizontal_Knowledge_Processing_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#53e87d62-8d35-3395-b5d9-420a9661edb7", "53e87d62-8d35-3395-b5d9-420a9661edb7", "HorizontalKnowledgeProcessingTask", java.util.Arrays.asList( "HorizontalKnowledgeProcessingTask" ), "horizontal knowledge processing task", "https://www.omg.org/spec/API4KP/api4kp-ops/HorizontalKnowledgeProcessingTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* paraphrase task */
    @javax.xml.bind.annotation.XmlEnumValue("ParaphraseTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ParaphraseTask" )
    Paraphrase_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#88542a0a-965d-37da-b7e0-8d2dd2ad6088", "88542a0a-965d-37da-b7e0-8d2dd2ad6088", "ParaphraseTask", java.util.Arrays.asList( "ParaphraseTask" ), "paraphrase task", "https://www.omg.org/spec/API4KP/api4kp-ops/ParaphraseTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Horizontal_Knowledge_Processing_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Horizontal_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* abdrigment task */
    @javax.xml.bind.annotation.XmlEnumValue("AbridgmentTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/AbridgmentTask" )
    Abdrigment_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#13aa30aa-d52e-36f1-8c34-f19bc337f73c", "13aa30aa-d52e-36f1-8c34-f19bc337f73c", "AbridgmentTask", java.util.Arrays.asList( "AbridgmentTask" ), "abdrigment task", "https://www.omg.org/spec/API4KP/api4kp-ops/AbridgmentTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Paraphrase_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Horizontal_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Paraphrase_Task,  } ) , 
   
    /* Translations may be preceded by paraphrases, to ensure that the source expression uses only aspects that are mappable to the target language, when the mapping is not complete */
    @javax.xml.bind.annotation.XmlEnumValue("TranslationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/TranslationTask" )
    Translation_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#abeb0612-ea6e-36f1-892f-d7faaea0f911", "abeb0612-ea6e-36f1-892f-d7faaea0f911", "TranslationTask", java.util.Arrays.asList( "TranslationTask" ), "translation task", "https://www.omg.org/spec/API4KP/api4kp-ops/TranslationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Horizontal_Knowledge_Processing_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Horizontal_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* syntactic translation task */
    @javax.xml.bind.annotation.XmlEnumValue("SyntacticTranslationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SyntacticTranslationTask" )
    Syntactic_Translation_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#38630544-20ef-3359-a62f-0816f81358fc", "38630544-20ef-3359-a62f-0816f81358fc", "SyntacticTranslationTask", java.util.Arrays.asList( "SyntacticTranslationTask" ), "syntactic translation task", "https://www.omg.org/spec/API4KP/api4kp-ops/SyntacticTranslationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Translation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Horizontal_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Translation_Task,  } ) , 
   
    /* transcription task */
    @javax.xml.bind.annotation.XmlEnumValue("TranscriptionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/TranscriptionTask" )
    Transcription_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#df766945-c056-322a-8b73-7a0ef15de206", "df766945-c056-322a-8b73-7a0ef15de206", "TranscriptionTask", java.util.Arrays.asList( "TranscriptionTask" ), "transcription task", "https://www.omg.org/spec/API4KP/api4kp-ops/TranscriptionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Horizontal_Knowledge_Processing_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Horizontal_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* syntactic transcription task */
    @javax.xml.bind.annotation.XmlEnumValue("SyntacticTranscriptionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SyntacticTranscriptionTask" )
    Syntactic_Transcription_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#a74722f7-8089-3d50-b273-5aecbdae3250", "a74722f7-8089-3d50-b273-5aecbdae3250", "SyntacticTranscriptionTask", java.util.Arrays.asList( "SyntacticTranscriptionTask" ), "syntactic transcription task", "https://www.omg.org/spec/API4KP/api4kp-ops/SyntacticTranscriptionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Transcription_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Horizontal_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Transcription_Task,  } ) , 
   
    /* syntactic carving task */
    @javax.xml.bind.annotation.XmlEnumValue("CarvingTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/CarvingTask" )
    Syntactic_Carving_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#d76a9299-4e72-36c1-a261-2265afe11582", "d76a9299-4e72-36c1-a261-2265afe11582", "CarvingTask", java.util.Arrays.asList( "CarvingTask" ), "syntactic carving task", "https://www.omg.org/spec/API4KP/api4kp-ops/CarvingTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Selection_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Selection_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* replication task */
    @javax.xml.bind.annotation.XmlEnumValue("ReplicationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ReplicationTask" )
    Replication_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#7fa37dc0-640e-3353-8316-cb59036b4b38", "7fa37dc0-640e-3353-8316-cb59036b4b38", "ReplicationTask", java.util.Arrays.asList( "ReplicationTask" ), "replication task", "https://www.omg.org/spec/API4KP/api4kp-ops/ReplicationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Horizontal_Knowledge_Processing_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Horizontal_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* task that, despite the syntactic nature of the operation, preserve both representation (encoding, format or concrete syntax, language (grammar and lexicon), and content (work of knowledge and used concepts) */
    @javax.xml.bind.annotation.XmlEnumValue("VerticalKnowledgeProcessingTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/VerticalKnowledgeProcessingTask" )
    Vertical_Knowledge_Processing_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#362b4e85-1742-37cf-85f4-4cb665a31c7d", "362b4e85-1742-37cf-85f4-4cb665a31c7d", "VerticalKnowledgeProcessingTask", java.util.Arrays.asList( "VerticalKnowledgeProcessingTask" ), "vertical knowledge processing task", "https://www.omg.org/spec/API4KP/api4kp-ops/VerticalKnowledgeProcessingTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* lowering task */
    @javax.xml.bind.annotation.XmlEnumValue("LoweringTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/LoweringTask" )
    Lowering_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#062deafd-6724-395a-a41d-8a0b9bf89b12", "062deafd-6724-395a-a41d-8a0b9bf89b12", "LoweringTask", java.util.Arrays.asList( "LoweringTask" ), "lowering task", "https://www.omg.org/spec/API4KP/api4kp-ops/LoweringTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Vertical_Knowledge_Processing_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Vertical_Knowledge_Processing_Task,  } ) , 
   
    /* lifting task */
    @javax.xml.bind.annotation.XmlEnumValue("LiftingTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/LiftingTask" )
    Lifting_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#c6eab0bd-8714-36bf-900e-45a56a549396", "c6eab0bd-8714-36bf-900e-45a56a549396", "LiftingTask", java.util.Arrays.asList( "LiftingTask" ), "lifting task", "https://www.omg.org/spec/API4KP/api4kp-ops/LiftingTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Vertical_Knowledge_Processing_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Vertical_Knowledge_Processing_Task,  } ) , 
   
    /* conceptualization task */
    @javax.xml.bind.annotation.XmlEnumValue("InterpretationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/InterpretationTask" )
    Conceptualization_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#8baa8d9f-643b-3aaf-b769-809b8995b054", "8baa8d9f-643b-3aaf-b769-809b8995b054", "InterpretationTask", java.util.Arrays.asList( "InterpretationTask" ), "conceptualization task", "https://www.omg.org/spec/API4KP/api4kp-ops/InterpretationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lifting_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lifting_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Vertical_Knowledge_Processing_Task,  } ) , 
   
    /* encoding task */
    @javax.xml.bind.annotation.XmlEnumValue("EncodingTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/EncodingTask" )
    Encoding_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#58219335-f3dd-3be1-909e-374b04976a58", "58219335-f3dd-3be1-909e-374b04976a58", "EncodingTask", java.util.Arrays.asList( "EncodingTask" ), "encoding task", "https://www.omg.org/spec/API4KP/api4kp-ops/EncodingTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lowering_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lowering_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Vertical_Knowledge_Processing_Task,  } ) , 
   
    /* expression task */
    @javax.xml.bind.annotation.XmlEnumValue("ExpressionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ExpressionTask" )
    Expression_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#82ddb4f6-5c95-37a8-9275-e9688b4537f7", "82ddb4f6-5c95-37a8-9275-e9688b4537f7", "ExpressionTask", java.util.Arrays.asList( "ExpressionTask" ), "expression task", "https://www.omg.org/spec/API4KP/api4kp-ops/ExpressionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lowering_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lowering_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Vertical_Knowledge_Processing_Task,  } ) , 
   
    /* syntactic parsing task */
    @javax.xml.bind.annotation.XmlEnumValue("SyntacticParsingTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SyntacticParsingTask" )
    Syntactic_Parsing_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#545110c3-e708-34da-aa15-26b3f2194e86", "545110c3-e708-34da-aa15-26b3f2194e86", "SyntacticParsingTask", java.util.Arrays.asList( "SyntacticParsingTask" ), "syntactic parsing task", "https://www.omg.org/spec/API4KP/api4kp-ops/SyntacticParsingTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lifting_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lifting_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Vertical_Knowledge_Processing_Task,  } ) , 
   
    /* decoding task */
    @javax.xml.bind.annotation.XmlEnumValue("DecodingTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/DecodingTask" )
    Decoding_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#b0f289e8-18bb-363b-bde0-2b7eb8ee8860", "b0f289e8-18bb-363b-bde0-2b7eb8ee8860", "DecodingTask", java.util.Arrays.asList( "DecodingTask" ), "decoding task", "https://www.omg.org/spec/API4KP/api4kp-ops/DecodingTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lifting_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lifting_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Vertical_Knowledge_Processing_Task,  } ) , 
   
    /* serialization task */
    @javax.xml.bind.annotation.XmlEnumValue("SerializationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SerializationTask" )
    Serialization_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#e7e0cd08-0c7b-394b-8129-d3cd8ac0c7e7", "e7e0cd08-0c7b-394b-8129-d3cd8ac0c7e7", "SerializationTask", java.util.Arrays.asList( "SerializationTask" ), "serialization task", "https://www.omg.org/spec/API4KP/api4kp-ops/SerializationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lowering_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lowering_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Vertical_Knowledge_Processing_Task,  } ) , 
   
    /* syntactic analysis task */
    @javax.xml.bind.annotation.XmlEnumValue("SyntacticAnalysisTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SyntacticAnalysisTask" )
    Syntactic_Analysis_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#16a6f204-4ea3-3563-a6ac-647a4bb5d234", "16a6f204-4ea3-3563-a6ac-647a4bb5d234", "SyntacticAnalysisTask", java.util.Arrays.asList( "SyntacticAnalysisTask" ), "syntactic analysis task", "https://www.omg.org/spec/API4KP/api4kp-ops/SyntacticAnalysisTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lifting_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lifting_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Vertical_Knowledge_Processing_Task,  } ) , 
   
    /* parsing task */
    @javax.xml.bind.annotation.XmlEnumValue("ParsingTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ParsingTask" )
    Parsing_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#8717fac4-e6aa-391e-89d3-8298ec725737", "8717fac4-e6aa-391e-89d3-8298ec725737", "ParsingTask", java.util.Arrays.asList( "ParsingTask" ), "parsing task", "https://www.omg.org/spec/API4KP/api4kp-ops/ParsingTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lifting_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lifting_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Vertical_Knowledge_Processing_Task,  } ) , 
   
    /* syntactic paraphrase task */
    @javax.xml.bind.annotation.XmlEnumValue("SyntacticParaphraseTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SyntacticParaphraseTask" )
    Syntactic_Paraphrase_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#74745afb-8567-3983-9d87-8e841ca88484", "74745afb-8567-3983-9d87-8e841ca88484", "SyntacticParaphraseTask", java.util.Arrays.asList( "SyntacticParaphraseTask" ), "syntactic paraphrase task", "https://www.omg.org/spec/API4KP/api4kp-ops/SyntacticParaphraseTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Paraphrase_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Horizontal_Knowledge_Processing_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Paraphrase_Task,  } ) , 
   
    /* knowledge compositional task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeCompositionalTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeCompositionalTask" )
    Knowledge_Compositional_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#a3e422f8-5409-3ebe-bbc5-21d2056aca79", "a3e422f8-5409-3ebe-bbc5-21d2056aca79", "KnowledgeCompositionalTask", java.util.Arrays.asList( "KnowledgeCompositionalTask" ), "knowledge compositional task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeCompositionalTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  } ) , 
   
    /* The operation generates a new structure, that is a versioned revision of the input structure */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeResourceRearrangementTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceRearrangementTask" )
    Knowledge_Resource_Rearrangement_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#f402b88e-3574-38ae-8b72-22e82a691a81", "f402b88e-3574-38ae-8b72-22e82a691a81", "KnowledgeResourceRearrangementTask", java.util.Arrays.asList( "KnowledgeResourceRearrangementTask" ), "knowledge resource rearrangement task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceRearrangementTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* knowledge resource deconstruction task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeResourceDeconstructionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceDeconstructionTask" )
    Knowledge_Resource_Deconstruction_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#a950af06-1295-3e2c-b05a-1f91529c8b3d", "a950af06-1295-3e2c-b05a-1f91529c8b3d", "KnowledgeResourceDeconstructionTask", java.util.Arrays.asList( "KnowledgeResourceDeconstructionTask" ), "knowledge resource deconstruction task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceDeconstructionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* knowledge resource disaggregation task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeResourceDisaggregationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceDisaggregationTask" )
    Knowledge_Resource_Disaggregation_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#29032213-840d-390e-be4f-0f2fe72016f3", "29032213-840d-390e-be4f-0f2fe72016f3", "KnowledgeResourceDisaggregationTask", java.util.Arrays.asList( "KnowledgeResourceDisaggregationTask" ), "knowledge resource disaggregation task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceDisaggregationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Deconstruction_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Deconstruction_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* knowledge resource decomposition task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeResourceDecompositionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceDecompositionTask" )
    Knowledge_Resource_Decomposition_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#85e2a1ed-5763-3340-900c-39494f1d60f8", "85e2a1ed-5763-3340-900c-39494f1d60f8", "KnowledgeResourceDecompositionTask", java.util.Arrays.asList( "KnowledgeResourceDecompositionTask" ), "knowledge resource decomposition task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceDecompositionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Deconstruction_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Deconstruction_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* knowledge resource construction task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeResourceConstructionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceConstructionTask" )
    Knowledge_Resource_Construction_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#5b82a948-a445-3eb8-8a09-16224afa4f7b", "5b82a948-a445-3eb8-8a09-16224afa4f7b", "KnowledgeResourceConstructionTask", java.util.Arrays.asList( "KnowledgeResourceConstructionTask" ), "knowledge resource construction task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceConstructionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* knowledge resource aggregation task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeResourceAggregationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceAggregationTask" )
    Knowledge_Resource_Aggregation_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#87feae16-2db5-38d0-98ce-31f2da14501a", "87feae16-2db5-38d0-98ce-31f2da14501a", "KnowledgeResourceAggregationTask", java.util.Arrays.asList( "KnowledgeResourceAggregationTask" ), "knowledge resource aggregation task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceAggregationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Construction_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Construction_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* knowledge resource weaving task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeResourceWeavingTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceWeavingTask" )
    Knowledge_Resource_Weaving_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#f173a9c7-4ce3-3cb6-8d60-1263c045c88a", "f173a9c7-4ce3-3cb6-8d60-1263c045c88a", "KnowledgeResourceWeavingTask", java.util.Arrays.asList( "KnowledgeResourceWeavingTask" ), "knowledge resource weaving task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceWeavingTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* knowledge resource assembly task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeResourceAssemblyTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceAssemblyTask" )
    Knowledge_Resource_Assembly_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#e889c8a5-8028-3195-841b-2185b78c3fc9", "e889c8a5-8028-3195-841b-2185b78c3fc9", "KnowledgeResourceAssemblyTask", java.util.Arrays.asList( "KnowledgeResourceAssemblyTask" ), "knowledge resource assembly task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceAssemblyTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* knowledge resource disassembly task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeResourceDisassemblyTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceDisassemblyTask" )
    Knowledge_Resource_Disassembly_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#a01e05fc-912b-35c6-b570-a094a88a3473", "a01e05fc-912b-35c6-b570-a094a88a3473", "KnowledgeResourceDisassemblyTask", java.util.Arrays.asList( "KnowledgeResourceDisassemblyTask" ), "knowledge resource disassembly task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceDisassemblyTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* Fusing two or more resources is equivalent to structuring them by construction, then flattening the structure so obtained */
    @javax.xml.bind.annotation.XmlEnumValue("FusionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/FusionTask" )
    Fusion_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#cc486e7e-68e3-304c-a300-dff4068220ac", "cc486e7e-68e3-304c-a300-dff4068220ac", "FusionTask", java.util.Arrays.asList( "FusionTask" ), "fusion task", "https://www.omg.org/spec/API4KP/api4kp-ops/FusionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* union task */
    @javax.xml.bind.annotation.XmlEnumValue("UnionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/UnionTask" )
    Union_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#7337f2f2-3ca9-3070-aa55-baf92afb9d88", "7337f2f2-3ca9-3070-aa55-baf92afb9d88", "UnionTask", java.util.Arrays.asList( "UnionTask" ), "union task", "https://www.omg.org/spec/API4KP/api4kp-ops/UnionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Fusion_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Fusion_Task,  } ) , 
   
    /* A transitive, recursive assembly of knowledge resources */
    @javax.xml.bind.annotation.XmlEnumValue("ClosureTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ClosureTask" )
    Knowledge_Resource_Closure_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#f4bbe93d-b084-3129-84ff-681fcfb2e27b", "f4bbe93d-b084-3129-84ff-681fcfb2e27b", "ClosureTask", java.util.Arrays.asList( "ClosureTask" ), "knowledge resource closure task", "https://www.omg.org/spec/API4KP/api4kp-ops/ClosureTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Assembly_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Assembly_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* Conceptually equivalent to a deconstruction followed by a disassembly */
    @javax.xml.bind.annotation.XmlEnumValue("SeparationTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/SeparationTask" )
    Separation_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#c6827063-611d-3d5f-a1ce-c4a0b7ddaf5b", "c6827063-611d-3d5f-a1ce-c4a0b7ddaf5b", "SeparationTask", java.util.Arrays.asList( "SeparationTask" ), "separation task", "https://www.omg.org/spec/API4KP/api4kp-ops/SeparationTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* removal task */
    @javax.xml.bind.annotation.XmlEnumValue("RemovalTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/RemovalTask" )
    Removal_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#f4bd80e4-984a-3e6a-9e31-93c4fabcb8d7", "f4bd80e4-984a-3e6a-9e31-93c4fabcb8d7", "RemovalTask", java.util.Arrays.asList( "RemovalTask" ), "removal task", "https://www.omg.org/spec/API4KP/api4kp-ops/RemovalTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Separation_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Separation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* partition task */
    @javax.xml.bind.annotation.XmlEnumValue("PartitionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/PartitionTask" )
    Partition_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#1e2cc6dc-dcf6-3558-9048-482074991748", "1e2cc6dc-dcf6-3558-9048-482074991748", "PartitionTask", java.util.Arrays.asList( "PartitionTask" ), "partition task", "https://www.omg.org/spec/API4KP/api4kp-ops/PartitionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Separation_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Separation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* extraction task */
    @javax.xml.bind.annotation.XmlEnumValue("ExtractionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ExtractionTask" )
    Extraction_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#e8624eac-7104-3679-9736-53f2e3cee894", "e8624eac-7104-3679-9736-53f2e3cee894", "ExtractionTask", java.util.Arrays.asList( "ExtractionTask" ), "extraction task", "https://www.omg.org/spec/API4KP/api4kp-ops/ExtractionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Separation_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Separation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* The flattening may require some manipulation of the component resources before they can be merged */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeResourceFlatteningTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceFlatteningTask" )
    Knowledge_Resource_Flattening_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#7d382867-0f40-36fe-9e68-18c3c1c953e2", "7d382867-0f40-36fe-9e68-18c3c1c953e2", "KnowledgeResourceFlatteningTask", java.util.Arrays.asList( "KnowledgeResourceFlatteningTask" ), "knowledge resource flattening task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceFlatteningTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Assembly_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Assembly_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* injection task */
    @javax.xml.bind.annotation.XmlEnumValue("InjectionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/InjectionTask" )
    Injection_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#8392be4f-b6ac-358c-8430-fb448576828b", "8392be4f-b6ac-358c-8430-fb448576828b", "InjectionTask", java.util.Arrays.asList( "InjectionTask" ), "injection task", "https://www.omg.org/spec/API4KP/api4kp-ops/InjectionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Fusion_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Fusion_Task,  } ) , 
   
    /* extension task */
    @javax.xml.bind.annotation.XmlEnumValue("ExtensionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ExtensionTask" )
    Extension_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#e589e4b4-e305-32af-b8ec-1db7c1d69651", "e589e4b4-e305-32af-b8ec-1db7c1d69651", "ExtensionTask", java.util.Arrays.asList( "ExtensionTask" ), "extension task", "https://www.omg.org/spec/API4KP/api4kp-ops/ExtensionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Injection_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Injection_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Fusion_Task,  } ) , 
   
    /* knowledge base building task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeBaseBuildingTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeBaseBuildingTask" )
    Knowledge_Base_Building_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#c6e34990-85d9-31b2-8a33-f46e0e9f8b33", "c6e34990-85d9-31b2-8a33-f46e0e9f8b33", "KnowledgeBaseBuildingTask", java.util.Arrays.asList( "KnowledgeBaseBuildingTask" ), "knowledge base building task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeBaseBuildingTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* create working knowledge base task */
    @javax.xml.bind.annotation.XmlEnumValue("CreateWorkingKnowledgeBaseTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/CreateWorkingKnowledgeBaseTask" )
    Create_Working_Knowledge_Base_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#b589ab25-df70-3a5f-9ff9-b2fe36728e79", "b589ab25-df70-3a5f-9ff9-b2fe36728e79", "CreateWorkingKnowledgeBaseTask", java.util.Arrays.asList( "CreateWorkingKnowledgeBaseTask" ), "create working knowledge base task", "https://www.omg.org/spec/API4KP/api4kp-ops/CreateWorkingKnowledgeBaseTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Base_Building_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Base_Building_Task,  } ) , 
   
    /* knowledge resource composition task */
    @javax.xml.bind.annotation.XmlEnumValue("KnowledgeResourceCompositionTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceCompositionTask" )
    Knowledge_Resource_Composition_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#9e409e61-4bc6-3f1a-8895-d13c77c4611e", "9e409e61-4bc6-3f1a-8895-d13c77c4611e", "KnowledgeResourceCompositionTask", java.util.Arrays.asList( "KnowledgeResourceCompositionTask" ), "knowledge resource composition task", "https://www.omg.org/spec/API4KP/api4kp-ops/KnowledgeResourceCompositionTask",
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Construction_Task,  },
        new Term[] {  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Construction_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task,  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task,  } ) , 
   
    /* I/O read task */
    @javax.xml.bind.annotation.XmlEnumValue("ReadTask")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-ops/ReadTask" )
    I_O_Read_Task( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations#4eea2884-8e5b-3537-93f3-1926712bcece", "4eea2884-8e5b-3537-93f3-1926712bcece", "ReadTask", java.util.Arrays.asList( "ReadTask" ), "I/O read task", "https://www.omg.org/spec/API4KP/api4kp-ops/ReadTask",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations" )),
      URI.create("https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations/20190801/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations/20190801/"))
      .withLabel( edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.KnowledgeProcessingOperation.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.KnowledgeProcessingOperation.SCHEME_ID )
      .withVersion( "20190801" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2019-08-01") );

  public static final Map<UUID, KnowledgeProcessingOperation> index = indexByUUID(KnowledgeProcessingOperation.values());

  private TermDescription description;
  private KnowledgeProcessingOperationSeries series;

  public TermDescription getDescription() {
    return description;
  }

  KnowledgeProcessingOperation(final String conceptId, final String conceptUUID,
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
  public KnowledgeProcessingOperationSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.KnowledgeProcessingOperation> asSeries() {
    return toSeries();
  }

  private KnowledgeProcessingOperationSeries toSeries() {
    if (series == null) {
      series = (KnowledgeProcessingOperationSeries) KnowledgeProcessingOperationSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<KnowledgeProcessingOperation> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<KnowledgeProcessingOperation> {
    protected KnowledgeProcessingOperation[] getValues() {
      return values();
    }
    @Override
    protected Optional<KnowledgeProcessingOperation> resolveUUID(UUID uuid) {
      return KnowledgeProcessingOperation.resolveUUID(uuid);
    }
  }


  public static Optional<KnowledgeProcessingOperation> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeProcessingOperation> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeProcessingOperation> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeProcessingOperation> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeProcessingOperation> resolveTag(final String tag) {
    Optional<KnowledgeProcessingOperation> l = resolveTerm(tag, KnowledgeProcessingOperation.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, KnowledgeProcessingOperation.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeProcessingOperation> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeProcessingOperation> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeProcessingOperation.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeProcessingOperation> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeProcessingOperation.values(), Term::getRef);
  }

}
