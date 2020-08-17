package edu.mayo.ontology.taxonomies.kao.publishingrole;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( PublishingRoleSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = PublishingRoleSeries.JsonDeserializer.class )
public interface PublishingRole extends ControlledTerm, VersionableTerm<PublishingRole, PublishingRoleSeries> {

  String SCHEME_NAME = "PublishingRoles";
  String SCHEME_ID = "f55d1773-5459-3b9f-a454-6eb33ef6d5f8";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/PublishingRole" ) );

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
