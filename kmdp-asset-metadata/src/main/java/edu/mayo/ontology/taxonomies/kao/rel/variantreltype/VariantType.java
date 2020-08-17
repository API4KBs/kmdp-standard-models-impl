package edu.mayo.ontology.taxonomies.kao.rel.variantreltype;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( VariantTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = VariantTypeSeries.JsonDeserializer.class )
public interface VariantType extends ControlledTerm, VersionableTerm<VariantType, VariantTypeSeries> {

  String SCHEME_NAME = "VariantTypes";
  String SCHEME_ID = "b4493f1f-b680-3c78-93d9-73a55d44a91f";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/Rel/VariantRelType" ) );

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
