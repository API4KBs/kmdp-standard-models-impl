package edu.mayo.ontology.taxonomies.kao.knowledgeartifactcategory;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeArtifactCategorySeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeArtifactCategorySeries.JsonDeserializer.class )
public interface IKnowledgeArtifactCategory extends ControlledTerm, VersionableTerm<IKnowledgeArtifactCategory, KnowledgeArtifactCategorySeries> {

  String SCHEME_NAME = "KnowledgeArtifactCategories";
  String SCHEME_ID = "ef2886a9-1ac5-30bb-aa43-4642c3a45755";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeArtifactCategory" ) );

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
