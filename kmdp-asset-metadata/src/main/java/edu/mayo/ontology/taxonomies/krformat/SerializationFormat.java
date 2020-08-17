package edu.mayo.ontology.taxonomies.krformat;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( SerializationFormatSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = SerializationFormatSeries.JsonDeserializer.class )
public interface SerializationFormat extends ControlledTerm, VersionableTerm<SerializationFormat, SerializationFormatSeries> {

  String SCHEME_NAME = "SerializationFormats";
  String SCHEME_ID = "449c29c9-ad44-31b8-932d-91eb39e0074b";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KRFormat";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KRFormat" ) );

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
