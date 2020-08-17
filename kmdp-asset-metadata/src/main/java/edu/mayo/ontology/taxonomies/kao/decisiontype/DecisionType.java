package edu.mayo.ontology.taxonomies.kao.decisiontype;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( DecisionTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = DecisionTypeSeries.JsonDeserializer.class )
public interface DecisionType extends ControlledTerm, VersionableTerm<DecisionType, DecisionTypeSeries> {

  String SCHEME_NAME = "DecisionTypes";
  String SCHEME_ID = "ed047630-5625-3fef-ba3f-239b7594ecdd";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/DecisionType";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/DecisionType" ) );

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
