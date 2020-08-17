package edu.mayo.ontology.taxonomies.kao.rel.dependencyreltype;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( DependencyTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = DependencyTypeSeries.JsonDeserializer.class )
public interface DependencyType extends ControlledTerm, VersionableTerm<DependencyType, DependencyTypeSeries> {

  String SCHEME_NAME = "DependencyTypes";
  String SCHEME_ID = "a0813f70-fc74-3383-b01e-b7d9b00870ff";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/Rel/DependencyRelType" ) );

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
