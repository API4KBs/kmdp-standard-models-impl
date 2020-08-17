package edu.mayo.ontology.taxonomies.kao.rel.derivationreltype;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( DerivationTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = DerivationTypeSeries.JsonDeserializer.class )
public interface DerivationType extends ControlledTerm, VersionableTerm<DerivationType, DerivationTypeSeries> {

  String SCHEME_NAME = "DerivationTypes";
  String SCHEME_ID = "aaa70e67-8ff9-3ea7-8a6d-fc98cb919f36";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DerivationRelType" ) );

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
