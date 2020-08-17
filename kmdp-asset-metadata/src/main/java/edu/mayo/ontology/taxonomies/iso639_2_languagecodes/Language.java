package edu.mayo.ontology.taxonomies.iso639_2_languagecodes;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( LanguageSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = LanguageSeries.JsonDeserializer.class )
public interface Language extends ControlledTerm, VersionableTerm<Language, LanguageSeries> {

  String SCHEME_NAME = "Languages";
  String SCHEME_ID = "3a08e2e3-40ab-39fd-9263-af48193cbf8e";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes" ) );

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
