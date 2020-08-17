package edu.mayo.ontology.taxonomies.lexicon;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( LexiconSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = LexiconSeries.JsonDeserializer.class )
public interface Lexicon extends ControlledTerm, VersionableTerm<Lexicon, LexiconSeries> {

  String SCHEME_NAME = "Lexica";
  String SCHEME_ID = "0e011e70-b3e3-3b1b-ac2d-92ce8c6dbba1";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/Lexicon";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/Lexicon" ) );

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
