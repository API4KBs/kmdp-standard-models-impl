package edu.mayo.ontology.taxonomies.kao.knowledgeprocessingtechnique;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeProcessingTechniqueSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeProcessingTechniqueSeries.JsonDeserializer.class )
public interface KnowledgeProcessingTechnique extends ControlledTerm, VersionableTerm<KnowledgeProcessingTechnique, KnowledgeProcessingTechniqueSeries> {

  String SCHEME_NAME = "KnowledgeProcessingTechniques";
  String SCHEME_ID = "294f76a3-f64f-3f80-b269-2f73c0159e18";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/KnowledgeProcessingTechnique" ) );

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
