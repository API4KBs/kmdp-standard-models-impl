package edu.mayo.ontology.taxonomies.kao.rel.summaryreltype;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( SummarizationTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = SummarizationTypeSeries.JsonDeserializer.class )
public interface SummarizationType extends ControlledTerm, VersionableTerm<SummarizationType, SummarizationTypeSeries> {

  String SCHEME_NAME = "SummarizationTypes";
  String SCHEME_ID = "4d5f5ce9-4eca-307f-9fb7-ce5569109c4a";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/Rel/SummaryRelType";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/Rel/SummaryRelType" ) );

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
