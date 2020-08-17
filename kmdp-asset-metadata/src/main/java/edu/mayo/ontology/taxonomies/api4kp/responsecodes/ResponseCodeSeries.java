package edu.mayo.ontology.taxonomies.api4kp.responsecodes;

import static edu.mayo.kmdp.id.helper.DatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveTerm;


import edu.mayo.kmdp.id.Identifier;
import edu.mayo.kmdp.id.ScopedIdentifier;
import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;

import java.net.URI;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;

@javax.xml.bind.annotation.XmlType(name = "ResponseCodeSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( ResponseCodeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = ResponseCodeSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = ResponseCodeSeries.JsonDeserializer.class )
public enum ResponseCodeSeries implements ResponseCode, Series<ResponseCode> {

    Unauthorized(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.Unauthorized    ) , 
       Created(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.Created    ) , 
       NotImplemented(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.NotImplemented    ) , 
       ServiceUnavailable(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.ServiceUnavailable    ) , 
       UnprocessableEntity(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.UnprocessableEntity    ) , 
       NotModified(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.NotModified    ) , 
       BadRequest(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.BadRequest    ) , 
       HTTPVersionNotSupported(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.HTTPVersionNotSupported    ) , 
       NotFound(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.NotFound    ) , 
       NotExtended(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.NotExtended    ) , 
       LengthRequired(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.LengthRequired    ) , 
       InsufficientStorage(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.InsufficientStorage    ) , 
       GatewayTimeout(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.GatewayTimeout    ) , 
       Reserved(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.Reserved    ) , 
       MultiStatus(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.MultiStatus    ) , 
       OK(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.OK    ) , 
       IMUsed(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.IMUsed    ) , 
       Gone(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.Gone    ) , 
       PreconditionFailed(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.PreconditionFailed    ) , 
       FailedDependency(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.FailedDependency    ) , 
       ResetContent(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.ResetContent    ) , 
       SwitchingProtocols(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.SwitchingProtocols    ) , 
       NonAuthoritativeInformation(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.NonAuthoritativeInformation    ) , 
       UseProxy(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.UseProxy    ) , 
       Accepted(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.Accepted    ) , 
       RequestedRangeNotSatisfiable(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.RequestedRangeNotSatisfiable    ) , 
       PaymentRequired(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.PaymentRequired    ) , 
       Forbidden(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.Forbidden    ) , 
       RequestTimeout(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.RequestTimeout    ) , 
       ProxyAuthenticationRequired(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.ProxyAuthenticationRequired    ) , 
       ExpectationFailed(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.ExpectationFailed    ) , 
       Locked(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.Locked    ) , 
       SeeOther(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.SeeOther    ) , 
       Found(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.Found    ) , 
       MethodNotAllowed(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.MethodNotAllowed    ) , 
       RequestEntityTooLarge(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.RequestEntityTooLarge    ) , 
       RequestURITooLong(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.RequestURITooLong    ) , 
       NotAcceptable(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.NotAcceptable    ) , 
       NoContent(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.NoContent    ) , 
       UpgradeRequired(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.UpgradeRequired    ) , 
       UnsupportedMediaType(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.UnsupportedMediaType    ) , 
       PartialContent(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.PartialContent    ) , 
       InternalServerError(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.InternalServerError    ) , 
       TemporaryRedirect(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.TemporaryRedirect    ) , 
       MovedPermanently(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.MovedPermanently    ) , 
       Continue(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.Continue    ) , 
       Processing(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.Processing    ) , 
       MultipleChoices(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.MultipleChoices    ) , 
       Conflict(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.Conflict    ) , 
       VariantAlsoNegotiates(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.VariantAlsoNegotiates    ) , 
       BadGateway(  edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011.ResponseCode.BadGateway    ) 
   ;

  private static final Map<UUID, ResponseCodeSeries> index = indexByUUID(ResponseCodeSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "2011"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes/2011/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<ResponseCode> versions;

  ResponseCodeSeries(ResponseCode... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<ResponseCode> getVersions() {
    return versions;
  }

  public ResponseCodeSeries asEnum() {
    return this;
  }

  public Series<ResponseCode> asSeries() {
    return this;
  }

  public static int count() {
    return values().length;
  }

  public static int countUnexpired() {
    return  (int) Arrays.stream(values())
        .filter(x -> !x.isSeriesExpired())
        .count();
  }

  @Override
  public TermDescription getDescription() {
    return latest().map(ConceptTerm::getDescription)
        .orElse(null);
  }

  @Override
  public NamespaceIdentifier getNamespace() {
    return ResponseCode.seriesNamespace;
  }
  
  @Override
  public VersionedIdentifier getVersionIdentifier() {
    return getLatest().getVersionIdentifier();
  }  

  @Override
  public boolean isSeriesExpired() {
    Date lastEstablished = getLatest().getVersionEstablishedOn();
    return ! schemeReleases.isEmpty() && schemeReleases.get(0).compareTo(lastEstablished) > 0;
  }

  @Override
  public Optional<Date> getSeriesExpiredOn() {
    Date lastEstablished = getLatest().getVersionEstablishedOn();
    return schemeReleases.stream()
        .filter(r -> r.compareTo(lastEstablished) > 0)
        .min(java.util.Comparator.naturalOrder());
  }


  @Override
  public String getVersionTag() {
    return getNamespace().getVersion();
  }

  @Override
  public Date getEstablishedOn() {
    return getNamespace().getEstablishedOn();
  }

  public static Optional<ResponseCode> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<ResponseCode> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<ResponseCode> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<ResponseCode> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<ResponseCode> resolveTag(final String tag) {
    Optional<ResponseCode> l = resolveTerm(tag,  ResponseCodeSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  ResponseCodeSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<ResponseCode> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<ResponseCode> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, ResponseCodeSeries.values(), Term::getConceptId);
  }

  public static Optional<ResponseCode> resolveRef(final URI refUri) {
    return resolveTerm(refUri, ResponseCodeSeries.values(), Term::getRef);
  }


  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new ResponseCodeSeries.Adapter();
    protected ResponseCodeSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<ResponseCode> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<ResponseCode> {
    protected ResponseCode[] getValues() { return values(); }

    @Override
    protected Optional<ResponseCode> resolveUUID(UUID uuid) {
      return ResponseCodeSeries.resolveUUID(uuid);
    }
  }
}


