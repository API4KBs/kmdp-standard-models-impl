package edu.mayo.ontology.taxonomies.api4kp.parsinglevel;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( ParsingLevelSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = ParsingLevelSeries.JsonDeserializer.class )
public interface ParsingLevel extends ControlledTerm, VersionableTerm<ParsingLevel, ParsingLevelSeries> {

  String SCHEME_NAME = "ParsingLevels";
  String SCHEME_ID = "71faf5b8-1c5e-334b-ad9c-165315309010";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/API4KP/ParsingLevel";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/API4KP/ParsingLevel" ) );

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
