package edu.mayo.ontology.taxonomies.api4kp.responsecodes;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( ResponseCodeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = ResponseCodeSeries.JsonDeserializer.class )
public interface ResponseCode extends ControlledTerm, VersionableTerm<ResponseCode, ResponseCodeSeries> {

  String SCHEME_NAME = "ResponseCodes";
  String SCHEME_ID = "b748669f-101f-3c4c-8a9a-79ac22b46ce5";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes" ) );

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
