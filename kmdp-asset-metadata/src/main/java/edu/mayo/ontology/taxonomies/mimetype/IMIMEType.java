package edu.mayo.ontology.taxonomies.mimetype;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( MIMETypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = MIMETypeSeries.JsonDeserializer.class )
public interface IMIMEType extends ControlledTerm, VersionableTerm<IMIMEType, MIMETypeSeries> {

  String SCHEME_NAME = "MIMETypes";
  String SCHEME_ID = "f9400258-11b6-39c8-bcf4-831f15d4143e";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/MIMEType";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/MIMEType" ) );

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
