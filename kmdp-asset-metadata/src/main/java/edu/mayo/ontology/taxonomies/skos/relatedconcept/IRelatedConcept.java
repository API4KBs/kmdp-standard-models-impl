package edu.mayo.ontology.taxonomies.skos.relatedconcept;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( RelatedConceptSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = RelatedConceptSeries.JsonDeserializer.class )
public interface IRelatedConcept extends ControlledTerm, VersionableTerm<IRelatedConcept, RelatedConceptSeries> {

  String SCHEME_NAME = "RelatedConcepts";
  String SCHEME_ID = "55e61476-8345-32c2-980a-ff7ea8354c52";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/skos/RelatedConcept";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/skos/RelatedConcept" ) );

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
