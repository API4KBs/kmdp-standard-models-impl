package edu.mayo.ontology.taxonomies.kao.rel.relatedversiontype;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( RelatedVersionTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = RelatedVersionTypeSeries.JsonDeserializer.class )
public interface RelatedVersionType extends ControlledTerm, VersionableTerm<RelatedVersionType, RelatedVersionTypeSeries> {

  String SCHEME_NAME = "RelatedVersionTypes";
  String SCHEME_ID = "3f357c5c-fb00-3284-b64e-02d1190e645c";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/Rel/RelatedVersionType" ) );

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
