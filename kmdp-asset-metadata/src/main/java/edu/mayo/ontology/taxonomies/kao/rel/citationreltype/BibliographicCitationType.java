package edu.mayo.ontology.taxonomies.kao.rel.citationreltype;

import edu.mayo.kmdp.terms.ControlledTerm;
import edu.mayo.kmdp.terms.VersionableTerm;
import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;

@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( BibliographicCitationTypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = BibliographicCitationTypeSeries.JsonDeserializer.class )
public interface BibliographicCitationType extends ControlledTerm, VersionableTerm<BibliographicCitationType, BibliographicCitationTypeSeries> {

  String SCHEME_NAME = "BibliographicCitationTypes";
  String SCHEME_ID = "64c8a1a5-a5c5-3b17-b8ca-a46bfc4de45c";

  String seriesIdentifier = "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType";
  URIIdentifier seriesUri = new URIIdentifier()
    .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/KAO/Rel/CitationRelType" ) );

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
