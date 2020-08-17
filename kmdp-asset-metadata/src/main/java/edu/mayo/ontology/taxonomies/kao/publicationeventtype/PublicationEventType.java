package edu.mayo.ontology.taxonomies.kao.publicationeventtype;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( PublicationEventTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = PublicationEventTypeSeries.JsonDeserializer.class )
public interface PublicationEventType extends ControlledTerm, VersionableTerm<PublicationEventType, PublicationEventTypeSeries> {

  String SCHEME_NAME = "PublicationEventTypes";
  String SCHEME_ID = "ff21c956-1179-34d3-a41d-300e78f4d926";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/PublicationEventType";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/PublicationEventType" ) );

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
