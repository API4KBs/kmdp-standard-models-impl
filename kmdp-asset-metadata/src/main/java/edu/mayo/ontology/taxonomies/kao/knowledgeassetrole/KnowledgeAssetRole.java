package edu.mayo.ontology.taxonomies.kao.knowledgeassetrole;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeAssetRoleSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeAssetRoleSeries.JsonDeserializer.class )
public interface KnowledgeAssetRole extends ControlledTerm, VersionableTerm<KnowledgeAssetRole, KnowledgeAssetRoleSeries> {

  String SCHEME_NAME = "KnowledgeAssetRoles";
  String SCHEME_ID = "3e582ae0-a248-38d9-86c1-19eb118c26fa";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetRole";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeAssetRole" ) );

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
