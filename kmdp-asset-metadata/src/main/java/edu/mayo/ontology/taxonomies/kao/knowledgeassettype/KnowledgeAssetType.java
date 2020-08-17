package edu.mayo.ontology.taxonomies.kao.knowledgeassettype;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeAssetTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeAssetTypeSeries.JsonDeserializer.class )
public interface KnowledgeAssetType extends ControlledTerm, VersionableTerm<KnowledgeAssetType, KnowledgeAssetTypeSeries> {

  String SCHEME_NAME = "KnowledgeAssetTypes";
  String SCHEME_ID = "243089c1-b6ab-318f-bec9-e1cfaf410992";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetType" ) );

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
