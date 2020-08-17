package edu.mayo.ontology.taxonomies.krprofile;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeRepresentationLanguageProfileSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeRepresentationLanguageProfileSeries.JsonDeserializer.class )
public interface KnowledgeRepresentationLanguageProfile extends ControlledTerm, VersionableTerm<KnowledgeRepresentationLanguageProfile, KnowledgeRepresentationLanguageProfileSeries> {

  String SCHEME_NAME = "KnowledgeRepresentationLanguageProfiles";
  String SCHEME_ID = "5c14da0f-83e7-39aa-9e8b-c51186364554";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KRProfile";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KRProfile" ) );

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
