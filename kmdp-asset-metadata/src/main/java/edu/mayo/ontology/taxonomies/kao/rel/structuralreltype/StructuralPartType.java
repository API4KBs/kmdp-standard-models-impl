package edu.mayo.ontology.taxonomies.kao.rel.structuralreltype;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( StructuralPartTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = StructuralPartTypeSeries.JsonDeserializer.class )
public interface StructuralPartType extends ControlledTerm, VersionableTerm<StructuralPartType, StructuralPartTypeSeries> {

  String SCHEME_NAME = "StructuralPartTypes";
  String SCHEME_ID = "49cc7903-13ac-39c7-aaf6-0e2f6495fafe";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/Rel/StructuralRelType" ) );

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
