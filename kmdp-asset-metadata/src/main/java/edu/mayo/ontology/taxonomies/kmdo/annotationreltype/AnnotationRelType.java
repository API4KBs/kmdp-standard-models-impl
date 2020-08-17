package edu.mayo.ontology.taxonomies.kmdo.annotationreltype;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( AnnotationRelTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = AnnotationRelTypeSeries.JsonDeserializer.class )
public interface AnnotationRelType extends ControlledTerm, VersionableTerm<AnnotationRelType, AnnotationRelTypeSeries> {

  String SCHEME_NAME = "AnnotationRelTypes";
  String SCHEME_ID = "83f5af98-cc19-314e-b599-7c73fd8be1cd";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KMDO/AnnotationRelType" ) );

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
