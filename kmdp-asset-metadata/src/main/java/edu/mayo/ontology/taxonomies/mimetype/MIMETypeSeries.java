package edu.mayo.ontology.taxonomies.mimetype;

import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.resolveTerm;

import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;
import edu.mayo.kmdp.terms.adapters.xml.LegacyTermsXMLAdapter;
import java.net.URI;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;

@javax.xml.bind.annotation.XmlType(name = "MIMETypeSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( MIMETypeSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = MIMETypeSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = MIMETypeSeries.JsonDeserializer.class )
public enum MIMETypeSeries implements IMIMEType, Series<IMIMEType> {

    Windows_Executable(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Windows_Executable    ) , 
       Video_Xflv(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Video_Xflv    ) , 
       Application_Xnacl(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Xnacl    ) , 
       Model_Mesh(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Model_Mesh    ) , 
       JSON_Data(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.JSON_Data    ) , 
       Model_Iges(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Model_Iges    ) , 
       HyperText_Markup_Language(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.HyperText_Markup_Language    ) , 
       Model_X3dfastinfoset(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Model_X3dfastinfoset    ) , 
       Video_Webmvideo(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Video_Webmvideo    ) , 
       Audio_Vndwave(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Audio_Vndwave    ) , 
       Application_Rssxml(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Rssxml    ) , 
       Application_Edi_X12(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Edi_X12    ) , 
       Audio_Vorbis(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Audio_Vorbis    ) , 
       Model_X3dvrml(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Model_X3dvrml    ) , 
       Model_X3dbinary(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Model_X3dbinary    ) , 
       RFC822_Email_Message(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.RFC822_Email_Message    ) , 
       Video_Ogg(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Video_Ogg    ) , 
       Audio_Webm(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Audio_Webm    ) , 
       Image_Example(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Image_Example    ) , 
       Audio_L24(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Audio_L24    ) , 
       Application_Postscript(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Postscript    ) , 
       Application_Gzip(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Gzip    ) , 
       Application_Ecmascript(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Ecmascript    ) , 
       Text_Cmd(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Text_Cmd    ) , 
       Zip_Archive_File(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Zip_Archive_File    ) , 
       Application_Soapxml(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Soapxml    ) , 
       Model_Example(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Model_Example    ) , 
       Audio_Opus(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Audio_Opus    ) , 
       Image_Svgxml(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Image_Svgxml    ) , 
       Application_Xmldtd(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Xmldtd    ) , 
       Model_X3dxml(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Model_X3dxml    ) , 
       Video_Mp4(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Video_Mp4    ) , 
       Multipart_Data(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Multipart_Data    ) , 
       Application_Xml(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Xml    ) , 
       ASCII_Plain_Text(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.ASCII_Plain_Text    ) , 
       Text_Vndabc(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Text_Vndabc    ) , 
       Apple_QuickTime_Video(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Apple_QuickTime_Video    ) , 
       Message_Example(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Message_Example    ) , 
       Comma_Separated_Values(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Comma_Separated_Values    ) , 
       Video_Xmswmv(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Video_Xmswmv    ) , 
       Octet_Stream(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Octet_Stream    ) , 
       JPEG_Image(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.JPEG_Image    ) , 
       Application_Ogg(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Ogg    ) , 
       Multipart_Encrypted(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Multipart_Encrypted    ) , 
       Audio_Ogg(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Audio_Ogg    ) , 
       Video_Example(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Video_Example    ) , 
       Multipart_Signed(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Multipart_Signed    ) , 
       Audio_Example(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Audio_Example    ) , 
       Text_Vcard(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Text_Vcard    ) , 
       Audio_Mp4(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Audio_Mp4    ) , 
       Text_Example(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Text_Example    ) , 
       Example_Example(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Example_Example    ) , 
       Javascript(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Javascript    ) , 
       Message_Imdxml(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Message_Imdxml    ) , 
       Audio_Vndrnrealaudio(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Audio_Vndrnrealaudio    ) , 
       Application_Example(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Example    ) , 
       Model_Vrml(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Model_Vrml    ) , 
       Message_Partial(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Message_Partial    ) , 
       Application_Atomxml(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Atomxml    ) , 
       Audio_Mpeg(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Audio_Mpeg    ) , 
       Application_Xhtmlxml(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Xhtmlxml    ) , 
       Application_Edifact(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Edifact    ) , 
       Text_Rtf(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Text_Rtf    ) , 
       Audio_Basic(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Audio_Basic    ) , 
       Cascading_Style_Sheet(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Cascading_Style_Sheet    ) , 
       Video_Mpeg(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Video_Mpeg    ) , 
       Application_Rdfxml(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Rdfxml    ) , 
       Image_Gif(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Image_Gif    ) , 
       Application_Pdf(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Pdf    ) , 
       Multipart_Related(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Multipart_Related    ) , 
       Portable_Network_Graphics_Image(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Portable_Network_Graphics_Image    ) , 
       Video_Avi(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Video_Avi    ) , 
       Application_Xopxml(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Application_Xopxml    ) , 
       Message_Http(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Message_Http    ) , 
       Multipart_Mixed(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Multipart_Mixed    ) , 
       Multipart_Alternative(  edu.mayo.ontology.taxonomies.mimetype.MIMEType.Multipart_Alternative    ) 
   ;

  private static final Map<UUID, MIMETypeSeries> index = indexByUUID(MIMETypeSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20200816-213200"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2020-08-16"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/MIMEType")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<IMIMEType> versions;

  MIMETypeSeries(IMIMEType... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<IMIMEType> getVersions() {
    return versions;
  }

  public MIMETypeSeries asEnum() {
    return this;
  }

  public Series<IMIMEType> asSeries() {
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
    return IMIMEType.seriesNamespace;
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

  public static Optional<IMIMEType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<IMIMEType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<IMIMEType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<IMIMEType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<IMIMEType> resolveTag(final String tag) {
    Optional<IMIMEType> l = resolveTerm(tag,  MIMETypeSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  MIMETypeSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<IMIMEType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<IMIMEType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, MIMETypeSeries.values(), Term::getConceptId);
  }

  public static Optional<IMIMEType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, MIMETypeSeries.values(), Term::getRef);
  }


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new MIMETypeSeries.Adapter();
    protected MIMETypeSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<IMIMEType> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<IMIMEType> {
    protected IMIMEType[] getValues() { return values(); }

    @Override
    protected Optional<IMIMEType> resolveUUID(UUID uuid) {
      return MIMETypeSeries.resolveUUID(uuid);
    }
  }
}


