package edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory._20190801;

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
import edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory.KnowledgeAssetCategorySeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "KnowledgeAssetCategory")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeAssetCategory.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = KnowledgeAssetCategory.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeAssetCategory.JsonDeserializer.class )
public enum KnowledgeAssetCategory implements edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory.KnowledgeAssetCategory {


    /* Specifications can be imperative (define what to do) or adaptive (define what not to do), depending on how many degrees of freedom are left to an agent */
    @javax.xml.bind.annotation.XmlEnumValue("ProcessAsset")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/ProcessAsset" )
    Plans_Processes_Pathways_And_Protocol_Definitions( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetCategory#f9e2a69d-0f6e-3a2b-94c4-beaf6fdadaea", "f9e2a69d-0f6e-3a2b-94c4-beaf6fdadaea", "ProcessAsset", java.util.Arrays.asList( "ProcessAsset" ), "Plans, Processes, Pathways and Protocol Definitions", "https://www.omg.org/spec/API4KP/api4kp-kao/ProcessAsset",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Structured Information and Data Capture Models */
    @javax.xml.bind.annotation.XmlEnumValue("InformationAsset")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/InformationAsset" )
    Structured_Information_And_Data_Capture_Models( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetCategory#3f55a496-5ff3-3989-bf0a-15a61da8b09c", "3f55a496-5ff3-3989-bf0a-15a61da8b09c", "InformationAsset", java.util.Arrays.asList( "InformationAsset" ), "Structured Information and Data Capture Models", "https://www.omg.org/spec/API4KP/api4kp-kao/InformationAsset",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge of this kind usually builds directly on Assessment Models (for the quantification) and Process Models (to relate the measures to the processes and their goals). */
    @javax.xml.bind.annotation.XmlEnumValue("MetricAsset")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/MetricAsset" )
    KPIs_Measurements_And_Metrics( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetCategory#2d705e5a-22d4-3368-98a6-e5ea7d52fd05", "2d705e5a-22d4-3368-98a6-e5ea7d52fd05", "MetricAsset", java.util.Arrays.asList( "MetricAsset" ), "KPIs, Measurements and Metrics", "https://www.omg.org/spec/API4KP/api4kp-kao/MetricAsset",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Assets in this category describe or specify how to limit an agent&#39;s degree of freedom, to prevent undesirable behaviors, in favor of more desirable ones. */
    @javax.xml.bind.annotation.XmlEnumValue("BusinessRuleAsset")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/BusinessRuleAsset" )
    Rules_Policies_And_Guidelines( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetCategory#7db1af1f-1703-356f-bddc-8cb0a81a442c", "7db1af1f-1703-356f-bddc-8cb0a81a442c", "BusinessRuleAsset", java.util.Arrays.asList( "BusinessRuleAsset" ), "Rules, Policies and Guidelines", "https://www.omg.org/spec/API4KP/api4kp-kao/BusinessRuleAsset",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge of this kind is usually structural, universal, and expressed using declarative languages */
    @javax.xml.bind.annotation.XmlEnumValue("SemanticAsset")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/SemanticAsset" )
    Terminology_Ontology_And_Assertional_KBs( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetCategory#64719ac1-415f-3747-843c-e1e8949071ff", "64719ac1-415f-3747-843c-e1e8949071ff", "SemanticAsset", java.util.Arrays.asList( "SemanticAsset" ), "Terminology, Ontology and Assertional KBs", "https://www.omg.org/spec/API4KP/api4kp-kao/SemanticAsset",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* When qualitiative, knowledge of this kind can be generally abstracted by means of &quot;if..then..&quot; rules (or analogous formalisms). The quantitative counterpart is expressed by means of mathematical formulas. Either way, expressions are expected to be pure, functional and idempotent, even when they handle uncertainty. */
    @javax.xml.bind.annotation.XmlEnumValue("InferentialAsset")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.omg.org/spec/API4KP/api4kp-kao/InferentialAsset" )
    Assessment_Predictive_And_Inferential_Models( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetCategory#d4b0e868-60c8-387d-a139-e3c35427bfb6", "d4b0e868-60c8-387d-a139-e3c35427bfb6", "InferentialAsset", java.util.Arrays.asList( "InferentialAsset" ), "Assessment, Predictive and Inferential Models", "https://www.omg.org/spec/API4KP/api4kp-kao/InferentialAsset",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetCategory" )),
      URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetCategory/20190801/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetCategory/20190801/"))
      .withLabel( edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory.KnowledgeAssetCategory.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory.KnowledgeAssetCategory.SCHEME_ID )
      .withVersion( "20190801" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2019-08-01") );

  public static final Map<UUID, KnowledgeAssetCategory> index = indexByUUID(KnowledgeAssetCategory.values());

  private TermDescription description;
  private KnowledgeAssetCategorySeries series;

  public TermDescription getDescription() {
    return description;
  }

  KnowledgeAssetCategory(final String conceptId, final String conceptUUID,
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
  public KnowledgeAssetCategorySeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory.KnowledgeAssetCategory> asSeries() {
    return toSeries();
  }

  private KnowledgeAssetCategorySeries toSeries() {
    if (series == null) {
      series = (KnowledgeAssetCategorySeries) KnowledgeAssetCategorySeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends LegacyURITermsJsonAdapter.Serializer<KnowledgeAssetCategory> {}

  public static class JsonDeserializer extends LegacyURITermsJsonAdapter.Deserializer<KnowledgeAssetCategory> {
    protected KnowledgeAssetCategory[] getValues() {
      return values();
    }
    @Override
    protected Optional<KnowledgeAssetCategory> resolveUUID(UUID uuid) {
      return KnowledgeAssetCategory.resolveUUID(uuid);
    }
  }


  public static Optional<KnowledgeAssetCategory> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<KnowledgeAssetCategory> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<KnowledgeAssetCategory> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<KnowledgeAssetCategory> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<KnowledgeAssetCategory> resolveTag(final String tag) {
    Optional<KnowledgeAssetCategory> l = resolveTerm(tag, KnowledgeAssetCategory.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, KnowledgeAssetCategory.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<KnowledgeAssetCategory> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<KnowledgeAssetCategory> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, KnowledgeAssetCategory.values(), Term::getConceptId);
  }

  public static Optional<KnowledgeAssetCategory> resolveRef(final URI refUri) {
    return resolveTerm(refUri, KnowledgeAssetCategory.values(), Term::getRef);
  }

}
