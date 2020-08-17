package edu.mayo.ontology.taxonomies.api4kp.knowledgeoperations;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeProcessingOperationSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeProcessingOperationSeries.JsonDeserializer.class )
public interface KnowledgeProcessingOperation extends ControlledTerm, VersionableTerm<KnowledgeProcessingOperation, KnowledgeProcessingOperationSeries> {

  String SCHEME_NAME = "KnowledgeProcessingOperations";
  String SCHEME_ID = "e8d624c0-4d95-3c49-b1a6-dafde2108139";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/API4KP/KnowledgeOperations" ) );

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
