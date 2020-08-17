package edu.mayo.ontology.taxonomies.kao.publicationstatus;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( PublicationStatusSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = PublicationStatusSeries.JsonDeserializer.class )
public interface PublicationStatus extends ControlledTerm, VersionableTerm<PublicationStatus, PublicationStatusSeries> {

  String SCHEME_NAME = "PublicationStatuses";
  String SCHEME_ID = "28ea09a2-1a19-3910-988f-c14f5d1f84eb";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/PublicationStatus" ) );

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
