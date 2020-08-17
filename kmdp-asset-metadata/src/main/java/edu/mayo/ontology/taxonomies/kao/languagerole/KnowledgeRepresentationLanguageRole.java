package edu.mayo.ontology.taxonomies.kao.languagerole;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeRepresentationLanguageRoleSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeRepresentationLanguageRoleSeries.JsonDeserializer.class )
public interface KnowledgeRepresentationLanguageRole extends ControlledTerm, VersionableTerm<KnowledgeRepresentationLanguageRole, KnowledgeRepresentationLanguageRoleSeries> {

  String SCHEME_NAME = "KnowledgeRepresentationLanguageRoles";
  String SCHEME_ID = "35da57ad-231a-3f93-827a-1526a920fa0f";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/LanguageRole";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/LanguageRole" ) );

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
