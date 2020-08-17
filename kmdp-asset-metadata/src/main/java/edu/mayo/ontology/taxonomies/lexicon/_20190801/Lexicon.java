package edu.mayo.ontology.taxonomies.lexicon._20190801;

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

import edu.mayo.ontology.taxonomies.lexicon.LexiconSeries;
import edu.mayo.kmdp.terms.impl.model.AnonymousConceptScheme;


@javax.xml.bind.annotation.XmlType(name = "Lexicon")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( Lexicon.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = Lexicon.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = Lexicon.JsonDeserializer.class )
public enum Lexicon implements edu.mayo.ontology.taxonomies.lexicon.Lexicon {


    /* XML Schema Instance */
    @javax.xml.bind.annotation.XmlEnumValue("xsi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2001/XMLSchema-instance" )
    XML_Schema_Instance( "https://ontology.mayo.edu/taxonomies/Lexicon#d9ee1051-fec2-311c-9719-0e1b8292d687", "d9ee1051-fec2-311c-9719-0e1b8292d687", "xsi", java.util.Arrays.asList( "xsi" ), "XML Schema Instance", "http://www.w3.org/2001/XMLSchema-instance",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Logical Observation Identifiers Names and Codes */
    @javax.xml.bind.annotation.XmlEnumValue("lnc")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://loinc.org/" )
    LOINC( "https://ontology.mayo.edu/taxonomies/Lexicon#1da42144-e4c8-37a4-a216-c16ad35333fb", "1da42144-e4c8-37a4-a216-c16ad35333fb", "lnc", java.util.Arrays.asList( "lnc" ), "LOINC", "http://loinc.org/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset Relationships - Citations */
    @javax.xml.bind.annotation.XmlEnumValue("cito")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType/2018-02-16" )
    Asset_Relationships_Citations( "https://ontology.mayo.edu/taxonomies/Lexicon#3541d2ae-4605-394a-9a9c-768899b9ac08", "3541d2ae-4605-394a-9a9c-768899b9ac08", "cito", java.util.Arrays.asList( "cito" ), "Asset Relationships - Citations", "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType/2018-02-16",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset Relationships - Structural */
    @javax.xml.bind.annotation.XmlEnumValue("struct")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType/20190801/" )
    Asset_Relationships_Structural( "https://ontology.mayo.edu/taxonomies/Lexicon#0f8d6fb5-6fe6-3df5-9ad0-114ec5b51dbb", "0f8d6fb5-6fe6-3df5-9ad0-114ec5b51dbb", "struct", java.util.Arrays.asList( "struct" ), "Asset Relationships - Structural", "https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType/20190801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Representation and Reasoning Serialization */
    @javax.xml.bind.annotation.XmlEnumValue("krser")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/KRSerialization/20190801/" )
    KRR_Serialization( "https://ontology.mayo.edu/taxonomies/Lexicon#1df77f03-55ca-32f1-a6a2-3228a8579f80", "1df77f03-55ca-32f1-a6a2-3228a8579f80", "krser", java.util.Arrays.asList( "krser" ), "KRR Serialization", "https://ontology.mayo.edu/taxonomies/KRSerialization/20190801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset Relationships - Versions */
    @javax.xml.bind.annotation.XmlEnumValue("version")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType/20190801/" )
    Asset_Relationships_Versions( "https://ontology.mayo.edu/taxonomies/Lexicon#2af72f10-0c35-3273-9462-84f6fd1dfc08", "2af72f10-0c35-3273-9462-84f6fd1dfc08", "version", java.util.Arrays.asList( "version" ), "Asset Relationships - Versions", "https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType/20190801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Representation and Reasoning Language */
    @javax.xml.bind.annotation.XmlEnumValue("krlang")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/KRLanguage/20190801/" )
    KRR_Language( "https://ontology.mayo.edu/taxonomies/Lexicon#1c974f09-4497-3556-94c1-4ec23f618b1d", "1c974f09-4497-3556-94c1-4ec23f618b1d", "krlang", java.util.Arrays.asList( "krlang" ), "KRR Language", "https://ontology.mayo.edu/taxonomies/KRLanguage/20190801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Mayo Clinic Propositional Concept Vocabulary */
    @javax.xml.bind.annotation.XmlEnumValue("pcv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://ontology.mayo.edu/taxonomies/PCV" )
    PCV( "https://ontology.mayo.edu/taxonomies/Lexicon#62198d22-d71c-3bd7-b292-6546095b0459", "62198d22-d71c-3bd7-b292-6546095b0459", "pcv", java.util.Arrays.asList( "pcv" ), "PCV", "http://ontology.mayo.edu/taxonomies/PCV",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset Type */
    @javax.xml.bind.annotation.XmlEnumValue("asset-type")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType/20190801/" )
    Knowledge_Asset_Type( "https://ontology.mayo.edu/taxonomies/Lexicon#5069d0f4-a935-3a1c-807b-0c18716f097c", "5069d0f4-a935-3a1c-807b-0c18716f097c", "asset-type", java.util.Arrays.asList( "asset-type" ), "Knowledge Asset Type", "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType/20190801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset Relationships - Variants */
    @javax.xml.bind.annotation.XmlEnumValue("variant")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType/20190801/" )
    Asset_Relationships_Variants( "https://ontology.mayo.edu/taxonomies/Lexicon#aa7ac8cd-5e0a-3993-a177-746279cc00d2", "aa7ac8cd-5e0a-3993-a177-746279cc00d2", "variant", java.util.Arrays.asList( "variant" ), "Asset Relationships - Variants", "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType/20190801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset Relationships - Summary */
    @javax.xml.bind.annotation.XmlEnumValue("summary")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/KAO/Rel/SummaryRelType/20190801/" )
    Asset_Relationships_Summary( "https://ontology.mayo.edu/taxonomies/Lexicon#a80da128-2f2c-375b-bc5f-2c92c836968b", "a80da128-2f2c-375b-bc5f-2c92c836968b", "summary", java.util.Arrays.asList( "summary" ), "Asset Relationships - Summary", "https://ontology.mayo.edu/taxonomies/KAO/Rel/SummaryRelType/20190801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Representation and Reasoning Lexicon */
    @javax.xml.bind.annotation.XmlEnumValue("lexicon")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/Lexicon/20190801/" )
    KRR_Lexicon( "https://ontology.mayo.edu/taxonomies/Lexicon#42d48e29-2d15-34fd-8505-0e15e00ad591", "42d48e29-2d15-34fd-8505-0e15e00ad591", "lexicon", java.util.Arrays.asList( "lexicon" ), "KRR Lexicon", "https://ontology.mayo.edu/taxonomies/Lexicon/20190801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Language Parsing Level */
    @javax.xml.bind.annotation.XmlEnumValue("vertical")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/API4KP/ParsingLevel/20190801/" )
    Parsing_Level( "https://ontology.mayo.edu/taxonomies/Lexicon#e6dec152-d6a9-31fc-8b0a-5e8cc2579cc3", "e6dec152-d6a9-31fc-8b0a-5e8cc2579cc3", "vertical", java.util.Arrays.asList( "vertical" ), "Parsing Level", "https://ontology.mayo.edu/taxonomies/API4KP/ParsingLevel/20190801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* RxNorm */
    @javax.xml.bind.annotation.XmlEnumValue("rxnorm")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://www.nlm.nih.gov/research/umls/rxnorm/" )
    RxNORM( "https://ontology.mayo.edu/taxonomies/Lexicon#06e94584-b9ba-3d24-9732-706d24cb8169", "06e94584-b9ba-3d24-9732-706d24cb8169", "rxnorm", java.util.Arrays.asList( "rxnorm" ), "RxNORM", "https://www.nlm.nih.gov/research/umls/rxnorm/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Systematized Nomenclature of Medicine -- Clinical Terms */
    @javax.xml.bind.annotation.XmlEnumValue("sct")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://snomed.info/sct/900000000000207008/version/20180731" )
    SNOMED_CT( "https://ontology.mayo.edu/taxonomies/Lexicon#04ed5e26-fb5b-3489-88de-7b14fcfb8c81", "04ed5e26-fb5b-3489-88de-7b14fcfb8c81", "sct", java.util.Arrays.asList( "sct" ), "SNOMED-CT", "http://snomed.info/sct/900000000000207008/version/20180731",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset Relationships - Derivations */
    @javax.xml.bind.annotation.XmlEnumValue("deriv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType/20190801/" )
    Asset_Relationships_Derivations( "https://ontology.mayo.edu/taxonomies/Lexicon#76595934-1b01-3193-986f-db2753ef323c", "76595934-1b01-3193-986f-db2753ef323c", "deriv", java.util.Arrays.asList( "deriv" ), "Asset Relationships - Derivations", "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType/20190801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Representation and Reasoning Language Role */
    @javax.xml.bind.annotation.XmlEnumValue("lang-rol")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/KAO/LanguageRole/20190801/" )
    KRR_Language_Role( "https://ontology.mayo.edu/taxonomies/Lexicon#75406125-d75a-37aa-96e1-434b5ebbb5a6", "75406125-d75a-37aa-96e1-434b5ebbb5a6", "lang-rol", java.util.Arrays.asList( "lang-rol" ), "KRR Language Role", "https://ontology.mayo.edu/taxonomies/KAO/LanguageRole/20190801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Reasoning Technique */
    @javax.xml.bind.annotation.XmlEnumValue("krtech")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique/20190801/" )
    KRR_Technique( "https://ontology.mayo.edu/taxonomies/Lexicon#13cd5054-b9c0-30c7-bf0e-c965b6790f32", "13cd5054-b9c0-30c7-bf0e-c965b6790f32", "krtech", java.util.Arrays.asList( "krtech" ), "KRR Technique", "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique/20190801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Natural Language (ISO 639-1 Standard) */
    @javax.xml.bind.annotation.XmlEnumValue("langs")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes/20170801/" )
    Natural_Language( "https://ontology.mayo.edu/taxonomies/Lexicon#5a058668-50c2-3651-be23-4659f6c92ada", "5a058668-50c2-3651-be23-4659f6c92ada", "langs", java.util.Arrays.asList( "langs" ), "Natural Language", "https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes/20170801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Simple Knowledge Organization Scheme */
    @javax.xml.bind.annotation.XmlEnumValue("skos")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2004/02/skos/core#" )
    SKOS( "https://ontology.mayo.edu/taxonomies/Lexicon#dc490ca8-3d19-37b0-a8cf-b9c65d4d2135", "dc490ca8-3d19-37b0-a8cf-b9c65d4d2135", "skos", java.util.Arrays.asList( "skos" ), "SKOS", "http://www.w3.org/2004/02/skos/core#",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* XML Namespace */
    @javax.xml.bind.annotation.XmlEnumValue("xmlns")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/XML/1998/namespace" )
    XML_Namespace( "https://ontology.mayo.edu/taxonomies/Lexicon#008a1dc8-6ca0-31cd-8153-3bbb1ceb3c99", "008a1dc8-6ca0-31cd-8153-3bbb1ceb3c99", "xmlns", java.util.Arrays.asList( "xmlns" ), "XML Namespace", "http://www.w3.org/XML/1998/namespace",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Representation and Reasoning Language Profile */
    @javax.xml.bind.annotation.XmlEnumValue("krprof")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/KRProfile/20190801/" )
    KRR_Profile( "https://ontology.mayo.edu/taxonomies/Lexicon#22ff75a6-0d49-34f5-a4e6-d6ef90477656", "22ff75a6-0d49-34f5-a4e6-d6ef90477656", "krprof", java.util.Arrays.asList( "krprof" ), "KRR Profile", "https://ontology.mayo.edu/taxonomies/KRProfile/20190801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset Relationships - Dependencies */
    @javax.xml.bind.annotation.XmlEnumValue("depend")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType/20190801/" )
    Asset_Relationships_Dependencies( "https://ontology.mayo.edu/taxonomies/Lexicon#6334ae0f-062c-3661-85cf-2dc022e0359a", "6334ae0f-062c-3661-85cf-2dc022e0359a", "depend", java.util.Arrays.asList( "depend" ), "Asset Relationships - Dependencies", "https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType/20190801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Asset Category */
    @javax.xml.bind.annotation.XmlEnumValue("asset-cat")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetCategory/20190801/" )
    Knowledge_Asset_Category( "https://ontology.mayo.edu/taxonomies/Lexicon#2a345970-4fce-3637-9309-9b59e9675c87", "2a345970-4fce-3637-9309-9b59e9675c87", "asset-cat", java.util.Arrays.asList( "asset-cat" ), "Knowledge Asset Category", "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetCategory/20190801/",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Knowledge Representation and Reasoning Serialization Format */
    @javax.xml.bind.annotation.XmlEnumValue("krfmt")
    @de.escalon.hypermedia.hydra.mapping.Expose( "https://ontology.mayo.edu/taxonomies/KRFormat/20190801/" )
    KRR_MetaFormat( "https://ontology.mayo.edu/taxonomies/Lexicon#569e800e-bc81-3d4b-9bae-e036b1057a2d", "569e800e-bc81-3d4b-9bae-e036b1057a2d", "krfmt", java.util.Arrays.asList( "krfmt" ), "KRR MetaFormat", "https://ontology.mayo.edu/taxonomies/KRFormat/20190801/",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/Lexicon" )),
      URI.create("https://ontology.mayo.edu/taxonomies/Lexicon/20190801/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/Lexicon/20190801/"))
      .withLabel( edu.mayo.ontology.taxonomies.lexicon.Lexicon.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.lexicon.Lexicon.SCHEME_ID )
      .withVersion( "20190801" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2019-08-01") );

  public static final Map<UUID, Lexicon> index = indexByUUID(Lexicon.values());

  private TermDescription description;
  private LexiconSeries series;

  public TermDescription getDescription() {
    return description;
  }

  Lexicon(final String conceptId, final String conceptUUID,
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
  public LexiconSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.lexicon.Lexicon> asSeries() {
    return toSeries();
  }

  private LexiconSeries toSeries() {
    if (series == null) {
      series = (LexiconSeries) LexiconSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<Lexicon> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<Lexicon> {
    protected Lexicon[] getValues() {
      return values();
    }
    @Override
    protected Optional<Lexicon> resolveUUID(UUID uuid) {
      return Lexicon.resolveUUID(uuid);
    }
  }


  public static Optional<Lexicon> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<Lexicon> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<Lexicon> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<Lexicon> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<Lexicon> resolveTag(final String tag) {
    Optional<Lexicon> l = resolveTerm(tag, Lexicon.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, Lexicon.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<Lexicon> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<Lexicon> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, Lexicon.values(), Term::getConceptId);
  }

  public static Optional<Lexicon> resolveRef(final URI refUri) {
    return resolveTerm(refUri, Lexicon.values(), Term::getRef);
  }

}
