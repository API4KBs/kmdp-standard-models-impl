package edu.mayo.ontology.taxonomies.ccgentries;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( ConceptDefinitionTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = ConceptDefinitionTypeSeries.JsonDeserializer.class )
public interface ConceptDefinitionType extends ControlledTerm, VersionableTerm<ConceptDefinitionType, ConceptDefinitionTypeSeries> {

  String SCHEME_NAME = "ConceptDefinitionTypes";
  String SCHEME_ID = "8ee52867-7c0b-3ec2-9f26-a2dfd767b415";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/ccgEntries";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/ccgEntries" ) );

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
