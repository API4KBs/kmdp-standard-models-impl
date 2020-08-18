package edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations;

import static edu.mayo.kmdp.id.helper.DatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveTerm;

import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;
import java.net.URI;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;

@javax.xml.bind.annotation.XmlType(name = "KnowledgeProcessingOperationSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeProcessingOperationSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeProcessingOperationSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeProcessingOperationSeries.JsonDeserializer.class )
public enum KnowledgeProcessingOperationSeries implements KnowledgeProcessingOperation, Series<KnowledgeProcessingOperation> {

    Decoding_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Decoding_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Decoding_Task    ) , 
       Transcreation_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Transcreation_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Transcreation_Task    ) , 
       Selection_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Selection_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Selection_Task    ) , 
       Syntactic_Parsing_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Syntactic_Parsing_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Parsing_Task    ) , 
       Knowledge_Reasoning_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Reasoning_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reasoning_Task    ) , 
       Diffing_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Diffing_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Diffing_Task    ) , 
       Semantic_Knowledge_Management_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Semantic_Knowledge_Management_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Semantic_Knowledge_Management_Task    ) , 
       Knowledge_Processing_Service_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Processing_Service_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Processing_Service_Task    ) , 
       Retrieve_Resource_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Retrieve_Resource_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Retrieve_Resource_Task    ) , 
       I_O_Read_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.I_O_Read_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.I_O_Read_Task    ) , 
       Detect_Logic_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Detect_Logic_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Detect_Logic_Task    ) , 
       Syntactic_Knowledge_Processing_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Knowledge_Processing_Task    ) , 
       Horizontal_Knowledge_Processing_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Horizontal_Knowledge_Processing_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Horizontal_Knowledge_Processing_Task    ) , 
       Simplification_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Simplification_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Simplification_Task    ) , 
       Subsumption_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Subsumption_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Subsumption_Task    ) , 
       Transcription_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Transcription_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Transcription_Task    ) , 
       Knowledge_Resource_Assembly_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Resource_Assembly_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Assembly_Task    ) , 
       Lifting_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Lifting_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lifting_Task    ) , 
       Syntactic_Carving_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Syntactic_Carving_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Carving_Task    ) , 
       Retrieve_Resource_Description_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Retrieve_Resource_Description_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Retrieve_Resource_Description_Task    ) , 
       Replication_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Replication_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Replication_Task    ) , 
       Knowledge_Analytic_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Analytic_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Analytic_Task    ) , 
       Resolve_Dependency_Closure_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Resolve_Dependency_Closure_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Resolve_Dependency_Closure_Task    ) , 
       Store_Artifact_At_Location_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Store_Artifact_At_Location_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Store_Artifact_At_Location_Task    ) , 
       Clear_Location_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Clear_Location_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Clear_Location_Task    ) , 
       Retrieve_Artifact_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Retrieve_Artifact_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Retrieve_Artifact_Task    ) , 
       Detect_Computational_Complexity_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Detect_Computational_Complexity_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Detect_Computational_Complexity_Task    ) , 
       Knowledge_Resource_Composition_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Resource_Composition_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Composition_Task    ) , 
       Reduction_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Reduction_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Reduction_Task    ) , 
       Syntactic_Redaction_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Syntactic_Redaction_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Redaction_Task    ) , 
       Fusion_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Fusion_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Fusion_Task    ) , 
       Series_Management_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Series_Management_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Series_Management_Task    ) , 
       Knowledge_Resource_Closure_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Resource_Closure_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Closure_Task    ) , 
       Knowledge_Compositional_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Compositional_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Compositional_Task    ) , 
       Knowledge_Resource_Flattening_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Resource_Flattening_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Flattening_Task    ) , 
       Syntactic_Translation_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Syntactic_Translation_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Translation_Task    ) , 
       Entailment_Check_Test(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Entailment_Check_Test  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Entailment_Check_Test    ) , 
       Closed_Knowledge_Processing_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Closed_Knowledge_Processing_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Closed_Knowledge_Processing_Task    ) , 
       Removal_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Removal_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Removal_Task    ) , 
       Internal_Repository_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Internal_Repository_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Internal_Repository_Task    ) , 
       Separation_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Separation_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Separation_Task    ) , 
       Lowering_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Lowering_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Lowering_Task    ) , 
       Vertical_Knowledge_Processing_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Vertical_Knowledge_Processing_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Vertical_Knowledge_Processing_Task    ) , 
       Extract_Description_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Extract_Description_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Extract_Description_Task    ) , 
       Serialization_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Serialization_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Serialization_Task    ) , 
       Encoding_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Encoding_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Encoding_Task    ) , 
       Conceptualization_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Conceptualization_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Conceptualization_Task    ) , 
       Retrieve_Surrogate_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Retrieve_Surrogate_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Retrieve_Surrogate_Task    ) , 
       Knowledge_Resource_Rearrangement_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Resource_Rearrangement_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Rearrangement_Task    ) , 
       Consistency_Check_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Consistency_Check_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Consistency_Check_Task    ) , 
       Translation_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Translation_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Translation_Task    ) , 
       Knowledge_Resource_Disaggregation_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Resource_Disaggregation_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Disaggregation_Task    ) , 
       Proof_Generation_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Proof_Generation_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Proof_Generation_Task    ) , 
       Syntactic_Paraphrase_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Syntactic_Paraphrase_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Paraphrase_Task    ) , 
       Expression_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Expression_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Expression_Task    ) , 
       Syntactic_Transcription_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Syntactic_Transcription_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Transcription_Task    ) , 
       Create_Working_Knowledge_Base_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Create_Working_Knowledge_Base_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Create_Working_Knowledge_Base_Task    ) , 
       Partition_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Partition_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Partition_Task    ) , 
       Inference_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Inference_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Inference_Task    ) , 
       Replace_Artifact_At_Location_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Replace_Artifact_At_Location_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Replace_Artifact_At_Location_Task    ) , 
       Parsing_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Parsing_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Parsing_Task    ) , 
       Paraphrase_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Paraphrase_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Paraphrase_Task    ) , 
       Injection_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Injection_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Injection_Task    ) , 
       Knowledge_Resource_Disassembly_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Resource_Disassembly_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Disassembly_Task    ) , 
       Identity_Lookup_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Identity_Lookup_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Identity_Lookup_Task    ) , 
       Retrieve_Artifact_From_Location_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Retrieve_Artifact_From_Location_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Retrieve_Artifact_From_Location_Task    ) , 
       Knowledge_Manipulation_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Manipulation_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Manipulation_Task    ) , 
       Knowledge_Resource_Aggregation_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Resource_Aggregation_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Aggregation_Task    ) , 
       Discover_Compatible_Resources_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Discover_Compatible_Resources_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Discover_Compatible_Resources_Task    ) , 
       Knowledge_Resource_Decomposition_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Resource_Decomposition_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Decomposition_Task    ) , 
       Satisfiability_Check_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Satisfiability_Check_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Satisfiability_Check_Task    ) , 
       Detect_Language_Information_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Detect_Language_Information_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Detect_Language_Information_Task    ) , 
       Query_Answering_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Query_Answering_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Query_Answering_Task    ) , 
       Detect_Signature_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Detect_Signature_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Detect_Signature_Task    ) , 
       Knowledge_Base_Building_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Base_Building_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Base_Building_Task    ) , 
       I_O_Write_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.I_O_Write_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.I_O_Write_Task    ) , 
       Snapshot_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Snapshot_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Snapshot_Task    ) , 
       Well_Formedness_Check_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Well_Formedness_Check_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Well_Formedness_Check_Task    ) , 
       Knowledge_Resource_Weaving_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Weaving_Task    ) , 
       Knowledge_Structuring_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Structuring_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Structuring_Task    ) , 
       Abdrigment_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Abdrigment_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Abdrigment_Task    ) , 
       Classification_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Classification_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Classification_Task    ) , 
       Knowledge_Resource_Construction_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Resource_Construction_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Construction_Task    ) , 
       Extraction_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Extraction_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Extraction_Task    ) , 
       Logic_Based_Reasoning_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Logic_Based_Reasoning_Task    ) , 
       Censoring_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Censoring_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Censoring_Task    ) , 
       Union_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Union_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Union_Task    ) , 
       Summarization_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Summarization_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Summarization_Task    ) , 
       Knowledge_Resource_Deconstruction_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Resource_Deconstruction_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Resource_Deconstruction_Task    ) , 
       Extension_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Extension_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Extension_Task    ) , 
       Identity_Resolution_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Identity_Resolution_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Identity_Resolution_Task    ) , 
       Knowledge_Repository_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Repository_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Repository_Task    ) , 
       Identity_Negotiation_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Identity_Negotiation_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Identity_Negotiation_Task    ) , 
       Knowledge_Reshaping_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Knowledge_Reshaping_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Knowledge_Reshaping_Task    ) , 
       Resolve_Dependencies_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Resolve_Dependencies_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Resolve_Dependencies_Task    ) , 
       Syntactic_Analysis_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Syntactic_Analysis_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Syntactic_Analysis_Task    ) , 
       Cherrypicking_Task(  edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations.snapshot.KnowledgeProcessingOperation.Cherrypicking_Task  ,   edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations._20190801.KnowledgeProcessingOperation.Cherrypicking_Task    ) 
   ;

  private static final Map<UUID, KnowledgeProcessingOperationSeries> index = indexByUUID(KnowledgeProcessingOperationSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213211"  ,   "20190801"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"  ,   "2019-08-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations/SNAPSHOT/") ,   URI.create("https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations/20190801/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<KnowledgeProcessingOperation> versions;

  KnowledgeProcessingOperationSeries(KnowledgeProcessingOperation... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<KnowledgeProcessingOperation> getVersions() {
    return versions;
  }

  public KnowledgeProcessingOperationSeries asEnum() {
    return this;
  }

  public Series<KnowledgeProcessingOperation> asSeries() {
    return this;
  }

  public static int count() {
    return values().length;
  }

  public static int countUnexpired() {
    return  (int) Arrays.stream(values())
        .filter(x -> !x.isSeriesExpired())
        .count();
  }

  @Override
  public TermDescription getDescription() {
    return latest().map(ConceptTerm::getDescription)
        .orElse(null);
  }

  @Override
  public NamespaceIdentifier getNamespace() {
    return KnowledgeProcessingOperation.seriesNamespace;
  }
  
  @Override
  public VersionedIdentifier getVersionIdentifier() {
    return getLatest().getVersionIdentifier();
  }  

  @Override
  public boolean isSeriesExpired() {
    Date lastEstablished = getLatest().getVersionEstablishedOn();
    return ! schemeReleases.isEmpty() && schemeReleases.get(0).compareTo(lastEstablished) > 0;
  }

  @Override
  public Optional<Date> getSeriesExpiredOn() {
    Date lastEstablished = getLatest().getVersionEstablishedOn();
    return schemeReleases.stream()
        .filter(r -> r.compareTo(lastEstablished) > 0)
        .min(java.util.Comparator.naturalOrder());
  }


  @Override
  public String getVersionTag() {
    return getNamespace().getVersion();
  }

  @Override
  public Date getEstablishedOn() {
    return getNamespace().getEstablishedOn();
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
    Optional<KnowledgeProcessingOperation> l = resolveTerm(tag,  KnowledgeProcessingOperationSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  KnowledgeProcessingOperationSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeProcessingOperation> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeProcessingOperation> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeProcessingOperationSeries.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeProcessingOperation> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeProcessingOperationSeries.values(), Term::getRef);
  }


  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new KnowledgeProcessingOperationSeries.Adapter();
    protected KnowledgeProcessingOperationSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<KnowledgeProcessingOperation> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<KnowledgeProcessingOperation> {
    protected KnowledgeProcessingOperation[] getValues() { return values(); }

    @Override
    protected Optional<KnowledgeProcessingOperation> resolveUUID(UUID uuid) {
      return KnowledgeProcessingOperationSeries.resolveUUID(uuid);
    }
  }
}


