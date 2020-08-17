package edu.mayo.ontology.taxonomies.kao.knowledgeassetcategory;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeAssetCategorySeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeAssetCategorySeries.JsonDeserializer.class )
public interface KnowledgeAssetCategory extends ControlledTerm, VersionableTerm<KnowledgeAssetCategory, KnowledgeAssetCategorySeries> {

  String SCHEME_NAME = "KnowledgeAssetCategories";
  String SCHEME_ID = "02762f0f-208e-3b57-94ab-fa288ecdfe39";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetCategory";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetCategory" ) );

  NamespaceIdentifier seriesNamespace = new NamespaceIdentifier()
      .withId(seriesUri.getUri())
      .withLabel(SCHEME_NAME)
      .withTag(SCHEME_ID);

  default URIIdentifier getSeriesUri() {
    return seriesUri;
  }

  @Override
  public NamespaceIdentifier getNamespace();

  @Override
  default URI getNamespaceUri() {
    return seriesUri.getUri();
  }

}
