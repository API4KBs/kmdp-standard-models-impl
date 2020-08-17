package edu.mayo.ontology.taxonomies.krserialization;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( KnowledgeRepresentationLanguageSerializationSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = KnowledgeRepresentationLanguageSerializationSeries.JsonDeserializer.class )
public interface KnowledgeRepresentationLanguageSerialization extends ControlledTerm, VersionableTerm<KnowledgeRepresentationLanguageSerialization, KnowledgeRepresentationLanguageSerializationSeries> {

  String SCHEME_NAME = "KnowledgeRepresentationLanguageSerializations";
  String SCHEME_ID = "844ef4b8-98aa-3ce6-95a4-38e955e89bbd";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KRSerialization";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KRSerialization" ) );

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
