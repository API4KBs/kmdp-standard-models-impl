package edu.mayo.ontology.taxonomies.krlanguage;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeRepresentationLanguageSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeRepresentationLanguageSeries.JsonDeserializer.class )
public interface KnowledgeRepresentationLanguage extends ControlledTerm, VersionableTerm<KnowledgeRepresentationLanguage, KnowledgeRepresentationLanguageSeries> {

  String SCHEME_NAME = "KnowledgeRepresentationLanguages";
  String SCHEME_ID = "8d453fd3-31ae-3f01-93fd-710c8a38fcfa";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KRLanguage";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KRLanguage" ) );

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
