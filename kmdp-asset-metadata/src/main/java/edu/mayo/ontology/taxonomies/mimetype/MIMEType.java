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
import edu.mayo.kmdp.terms.impl.model.LegacyTermImpl;
import edu.mayo.kmdp.util.DateTimeUtil;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "MIMEType")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( MIMEType.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = MIMEType.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = MIMEType.JsonDeserializer.class )
public enum MIMEType implements edu.mayo.ontology.taxonomies.mimetype.IMIMEType {


    /* model-x3dvrml */
    @javax.xml.bind.annotation.XmlEnumValue("model/x3d+vrml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#x3dvrml" )
    Model_X3dvrml( "https://ontology.mayo.edu/taxonomies/MIMEType#a8615900-d126-32c3-94d2-04a3105c3edc", "a8615900-d126-32c3-94d2-04a3105c3edc", "model/x3d+vrml", java.util.Arrays.asList( "model/x3d+vrml" ), "model-x3dvrml", "http://www.invincea.com/ontologies/icas/1.0.1/mime#x3dvrml",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-soapxml */
    @javax.xml.bind.annotation.XmlEnumValue("application/soap+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#soapxml" )
    Application_Soapxml( "https://ontology.mayo.edu/taxonomies/MIMEType#8ea31af4-9fae-3f5f-a7ec-f0ace9611982", "8ea31af4-9fae-3f5f-a7ec-f0ace9611982", "application/soap+xml", java.util.Arrays.asList( "application/soap+xml" ), "application-soapxml", "http://www.invincea.com/ontologies/icas/1.0.1/mime#soapxml",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* message-http */
    @javax.xml.bind.annotation.XmlEnumValue("message/http")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#http" )
    Message_Http( "https://ontology.mayo.edu/taxonomies/MIMEType#9f1228c9-793a-3579-88c9-f6c92ed83904", "9f1228c9-793a-3579-88c9-f6c92ed83904", "message/http", java.util.Arrays.asList( "message/http" ), "message-http", "http://www.invincea.com/ontologies/icas/1.0.1/mime#http",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* multipart-encrypted */
    @javax.xml.bind.annotation.XmlEnumValue("multipart/encrypted")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#encrypted" )
    Multipart_Encrypted( "https://ontology.mayo.edu/taxonomies/MIMEType#19202da4-52c1-3b34-b473-581a705d37be", "19202da4-52c1-3b34-b473-581a705d37be", "multipart/encrypted", java.util.Arrays.asList( "multipart/encrypted" ), "multipart-encrypted", "http://www.invincea.com/ontologies/icas/1.0.1/mime#encrypted",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* scripting language content */
    @javax.xml.bind.annotation.XmlEnumValue("text/cmd")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#cmd" )
    Text_Cmd( "https://ontology.mayo.edu/taxonomies/MIMEType#45da268a-ee42-391e-8642-4c0d57dce9ef", "45da268a-ee42-391e-8642-4c0d57dce9ef", "text/cmd", java.util.Arrays.asList( "text/cmd" ), "text-cmd", "http://www.invincea.com/ontologies/icas/1.0.1/mime#cmd",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-xmldtd */
    @javax.xml.bind.annotation.XmlEnumValue("application/xml-dtd")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#xmldtd" )
    Application_Xmldtd( "https://ontology.mayo.edu/taxonomies/MIMEType#ce315ca0-70d6-3a63-a2b4-f87c363b706a", "ce315ca0-70d6-3a63-a2b4-f87c363b706a", "application/xml-dtd", java.util.Arrays.asList( "application/xml-dtd" ), "application-xmldtd", "http://www.invincea.com/ontologies/icas/1.0.1/mime#xmldtd",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* text-rtf */
    @javax.xml.bind.annotation.XmlEnumValue("text/rtf")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#rtf" )
    Text_Rtf( "https://ontology.mayo.edu/taxonomies/MIMEType#e0c05d45-bd36-397d-91e8-a5ee16f40c82", "e0c05d45-bd36-397d-91e8-a5ee16f40c82", "text/rtf", java.util.Arrays.asList( "text/rtf" ), "text-rtf", "http://www.invincea.com/ontologies/icas/1.0.1/mime#rtf",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* audio-vndrnrealaudio */
    @javax.xml.bind.annotation.XmlEnumValue("audio/vnd.rnrealaudio")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#vndrnrealaudio" )
    Audio_Vndrnrealaudio( "https://ontology.mayo.edu/taxonomies/MIMEType#edc4cef1-fd89-3434-9194-3a32217a3361", "edc4cef1-fd89-3434-9194-3a32217a3361", "audio/vnd.rnrealaudio", java.util.Arrays.asList( "audio/vnd.rnrealaudio" ), "audio-vndrnrealaudio", "http://www.invincea.com/ontologies/icas/1.0.1/mime#vndrnrealaudio",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* audio-opus */
    @javax.xml.bind.annotation.XmlEnumValue("audio/opus")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#opus" )
    Audio_Opus( "https://ontology.mayo.edu/taxonomies/MIMEType#5e546a15-a5d3-3193-bab9-62cf117d6c40", "5e546a15-a5d3-3193-bab9-62cf117d6c40", "audio/opus", java.util.Arrays.asList( "audio/opus" ), "audio-opus", "http://www.invincea.com/ontologies/icas/1.0.1/mime#opus",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* ASCII Plain Text */
    @javax.xml.bind.annotation.XmlEnumValue("text/plain")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#plain" )
    ASCII_Plain_Text( "https://ontology.mayo.edu/taxonomies/MIMEType#46849f4a-4904-3f0d-a5bf-bfb6525045f9", "46849f4a-4904-3f0d-a5bf-bfb6525045f9", "text/plain", java.util.Arrays.asList( "text/plain" ), "ASCII Plain Text", "http://www.invincea.com/ontologies/icas/1.0.1/mime#plain",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* message-example */
    @javax.xml.bind.annotation.XmlEnumValue("message/example")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#examplemessage" )
    Message_Example( "https://ontology.mayo.edu/taxonomies/MIMEType#5c3551f2-1fb5-333c-af3b-9ce7b9305d41", "5c3551f2-1fb5-333c-af3b-9ce7b9305d41", "message/example", java.util.Arrays.asList( "message/example" ), "message-example", "http://www.invincea.com/ontologies/icas/1.0.1/mime#examplemessage",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* model-x3dbinary */
    @javax.xml.bind.annotation.XmlEnumValue("model/x3d+binary")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#x3dbinary" )
    Model_X3dbinary( "https://ontology.mayo.edu/taxonomies/MIMEType#8ec4fb08-b571-3135-b578-3d71629d95b5", "8ec4fb08-b571-3135-b578-3d71629d95b5", "model/x3d+binary", java.util.Arrays.asList( "model/x3d+binary" ), "model-x3dbinary", "http://www.invincea.com/ontologies/icas/1.0.1/mime#x3dbinary",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* audio-basic */
    @javax.xml.bind.annotation.XmlEnumValue("audio/basic")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#basic" )
    Audio_Basic( "https://ontology.mayo.edu/taxonomies/MIMEType#7e22386b-19d5-3e72-abf1-6ef69daa293a", "7e22386b-19d5-3e72-abf1-6ef69daa293a", "audio/basic", java.util.Arrays.asList( "audio/basic" ), "audio-basic", "http://www.invincea.com/ontologies/icas/1.0.1/mime#basic",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-atomxml */
    @javax.xml.bind.annotation.XmlEnumValue("application/atom-xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#atomxml" )
    Application_Atomxml( "https://ontology.mayo.edu/taxonomies/MIMEType#abf9d980-db42-33fc-976f-0665935f0d7e", "abf9d980-db42-33fc-976f-0665935f0d7e", "application/atom-xml", java.util.Arrays.asList( "application/atom-xml" ), "application-atomxml", "http://www.invincea.com/ontologies/icas/1.0.1/mime#atomxml",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-pdf */
    @javax.xml.bind.annotation.XmlEnumValue("application/pdf")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#pdf" )
    Application_Pdf( "https://ontology.mayo.edu/taxonomies/MIMEType#223017b5-46a2-3cfe-baa7-f1efcefc0b88", "223017b5-46a2-3cfe-baa7-f1efcefc0b88", "application/pdf", java.util.Arrays.asList( "application/pdf" ), "application-pdf", "http://www.invincea.com/ontologies/icas/1.0.1/mime#pdf",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Windows Executable */
    @javax.xml.bind.annotation.XmlEnumValue("application/exe")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#exe" )
    Windows_Executable( "https://ontology.mayo.edu/taxonomies/MIMEType#3d898246-3a0a-3ada-b6e4-ade685b633b3", "3d898246-3a0a-3ada-b6e4-ade685b633b3", "application/exe", java.util.Arrays.asList( "application/exe" ), "Windows Executable", "http://www.invincea.com/ontologies/icas/1.0.1/mime#exe",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* audio-webm */
    @javax.xml.bind.annotation.XmlEnumValue("audio/webm")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#webmaudio" )
    Audio_Webm( "https://ontology.mayo.edu/taxonomies/MIMEType#d8f319cc-60f7-3e23-a966-f0b74a917476", "d8f319cc-60f7-3e23-a966-f0b74a917476", "audio/webm", java.util.Arrays.asList( "audio/webm" ), "audio-webm", "http://www.invincea.com/ontologies/icas/1.0.1/mime#webmaudio",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* image-svgxml */
    @javax.xml.bind.annotation.XmlEnumValue("image/svg+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#svgxml" )
    Image_Svgxml( "https://ontology.mayo.edu/taxonomies/MIMEType#97342266-7d9d-3b9e-96d6-68db017ba049", "97342266-7d9d-3b9e-96d6-68db017ba049", "image/svg+xml", java.util.Arrays.asList( "image/svg+xml" ), "image-svgxml", "http://www.invincea.com/ontologies/icas/1.0.1/mime#svgxml",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-edi-x12 */
    @javax.xml.bind.annotation.XmlEnumValue("application/EDI-X12")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#edi-x12" )
    Application_Edi_X12( "https://ontology.mayo.edu/taxonomies/MIMEType#ca1d208a-b880-3f3d-8815-37a8023ea94e", "ca1d208a-b880-3f3d-8815-37a8023ea94e", "application/EDI-X12", java.util.Arrays.asList( "application/EDI-X12" ), "application-edi-x12", "http://www.invincea.com/ontologies/icas/1.0.1/mime#edi-x12",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* model-example */
    @javax.xml.bind.annotation.XmlEnumValue("model/example")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#examplemodel" )
    Model_Example( "https://ontology.mayo.edu/taxonomies/MIMEType#8e02bae5-66a1-37cc-8c6e-ce0d1ca8ce51", "8e02bae5-66a1-37cc-8c6e-ce0d1ca8ce51", "model/example", java.util.Arrays.asList( "model/example" ), "model-example", "http://www.invincea.com/ontologies/icas/1.0.1/mime#examplemodel",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Zip Archive File */
    @javax.xml.bind.annotation.XmlEnumValue("application/zip")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#zip" )
    Zip_Archive_File( "https://ontology.mayo.edu/taxonomies/MIMEType#5b0dd320-9b37-3a05-bc06-78d96fb4c27c", "5b0dd320-9b37-3a05-bc06-78d96fb4c27c", "application/zip", java.util.Arrays.asList( "application/zip" ), "Zip Archive File", "http://www.invincea.com/ontologies/icas/1.0.1/mime#zip",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Cascading Style Sheet */
    @javax.xml.bind.annotation.XmlEnumValue("text/css")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#css" )
    Cascading_Style_Sheet( "https://ontology.mayo.edu/taxonomies/MIMEType#bd9993ab-6748-3778-8045-1453afd93d09", "bd9993ab-6748-3778-8045-1453afd93d09", "text/css", java.util.Arrays.asList( "text/css" ), "Cascading Style Sheet", "http://www.invincea.com/ontologies/icas/1.0.1/mime#css",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* model-x3dxml */
    @javax.xml.bind.annotation.XmlEnumValue("model/x3d+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#x3dxml" )
    Model_X3dxml( "https://ontology.mayo.edu/taxonomies/MIMEType#f42f826f-a2c1-34e7-8d4b-6ae2a14500b0", "f42f826f-a2c1-34e7-8d4b-6ae2a14500b0", "model/x3d+xml", java.util.Arrays.asList( "model/x3d+xml" ), "model-x3dxml", "http://www.invincea.com/ontologies/icas/1.0.1/mime#x3dxml",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* text-example */
    @javax.xml.bind.annotation.XmlEnumValue("text/example")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#exampletext" )
    Text_Example( "https://ontology.mayo.edu/taxonomies/MIMEType#92386720-b6d1-3ef9-ae0d-e557cd9fa20c", "92386720-b6d1-3ef9-ae0d-e557cd9fa20c", "text/example", java.util.Arrays.asList( "text/example" ), "text-example", "http://www.invincea.com/ontologies/icas/1.0.1/mime#exampletext",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* audio-ogg */
    @javax.xml.bind.annotation.XmlEnumValue("audio/ogg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#oggaudio" )
    Audio_Ogg( "https://ontology.mayo.edu/taxonomies/MIMEType#35bde8a7-1ece-3fc2-8c66-0771f5cd6cf0", "35bde8a7-1ece-3fc2-8c66-0771f5cd6cf0", "audio/ogg", java.util.Arrays.asList( "audio/ogg" ), "audio-ogg", "http://www.invincea.com/ontologies/icas/1.0.1/mime#oggaudio",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* model-iges */
    @javax.xml.bind.annotation.XmlEnumValue("model/iges")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#iges" )
    Model_Iges( "https://ontology.mayo.edu/taxonomies/MIMEType#aadf2c40-9f97-3049-a876-c4af6111f8a7", "aadf2c40-9f97-3049-a876-c4af6111f8a7", "model/iges", java.util.Arrays.asList( "model/iges" ), "model-iges", "http://www.invincea.com/ontologies/icas/1.0.1/mime#iges",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* text-vcard */
    @javax.xml.bind.annotation.XmlEnumValue("text/vcard")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#vcard" )
    Text_Vcard( "https://ontology.mayo.edu/taxonomies/MIMEType#6796b816-53dd-3c2b-8e1c-11b48cc3ee56", "6796b816-53dd-3c2b-8e1c-11b48cc3ee56", "text/vcard", java.util.Arrays.asList( "text/vcard" ), "text-vcard", "http://www.invincea.com/ontologies/icas/1.0.1/mime#vcard",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* video-webmvideo */
    @javax.xml.bind.annotation.XmlEnumValue("video/webm")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#webmvideo" )
    Video_Webmvideo( "https://ontology.mayo.edu/taxonomies/MIMEType#14eacbb0-c036-3957-887f-68991455e6a1", "14eacbb0-c036-3957-887f-68991455e6a1", "video/webm", java.util.Arrays.asList( "video/webm" ), "video-webmvideo", "http://www.invincea.com/ontologies/icas/1.0.1/mime#webmvideo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* example-example */
    @javax.xml.bind.annotation.XmlEnumValue("example/example")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#exampleexample" )
    Example_Example( "https://ontology.mayo.edu/taxonomies/MIMEType#e2960838-0628-3510-b409-f4f2f6ae77d4", "e2960838-0628-3510-b409-f4f2f6ae77d4", "example/example", java.util.Arrays.asList( "example/example" ), "example-example", "http://www.invincea.com/ontologies/icas/1.0.1/mime#exampleexample",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* JPEG Image */
    @javax.xml.bind.annotation.XmlEnumValue("image/jpeg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#jpeg" )
    JPEG_Image( "https://ontology.mayo.edu/taxonomies/MIMEType#634546cf-1fbb-34c2-a8ab-c986dba3da6e", "634546cf-1fbb-34c2-a8ab-c986dba3da6e", "image/jpeg", java.util.Arrays.asList( "image/jpeg" ), "JPEG Image", "http://www.invincea.com/ontologies/icas/1.0.1/mime#jpeg",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* multipart-related */
    @javax.xml.bind.annotation.XmlEnumValue("multipart/related")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#related" )
    Multipart_Related( "https://ontology.mayo.edu/taxonomies/MIMEType#96ac53fd-a440-3e2b-aa17-395185560be0", "96ac53fd-a440-3e2b-aa17-395185560be0", "multipart/related", java.util.Arrays.asList( "multipart/related" ), "multipart-related", "http://www.invincea.com/ontologies/icas/1.0.1/mime#related",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* multipart-mixed */
    @javax.xml.bind.annotation.XmlEnumValue("multipart/mixed")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#mixed" )
    Multipart_Mixed( "https://ontology.mayo.edu/taxonomies/MIMEType#2bf317b5-f27e-3967-b5fc-f3f193f6eb56", "2bf317b5-f27e-3967-b5fc-f3f193f6eb56", "multipart/mixed", java.util.Arrays.asList( "multipart/mixed" ), "multipart-mixed", "http://www.invincea.com/ontologies/icas/1.0.1/mime#mixed",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* audio-vorbis */
    @javax.xml.bind.annotation.XmlEnumValue("audio/vorbis")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#vorbis" )
    Audio_Vorbis( "https://ontology.mayo.edu/taxonomies/MIMEType#66e10be4-22e8-30fa-a258-e499212b3b42", "66e10be4-22e8-30fa-a258-e499212b3b42", "audio/vorbis", java.util.Arrays.asList( "audio/vorbis" ), "audio-vorbis", "http://www.invincea.com/ontologies/icas/1.0.1/mime#vorbis",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-postscript */
    @javax.xml.bind.annotation.XmlEnumValue("application/postscript")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#postscript" )
    Application_Postscript( "https://ontology.mayo.edu/taxonomies/MIMEType#edf06995-f5d8-388f-8600-a074c99d4b39", "edf06995-f5d8-388f-8600-a074c99d4b39", "application/postscript", java.util.Arrays.asList( "application/postscript" ), "application-postscript", "http://www.invincea.com/ontologies/icas/1.0.1/mime#postscript",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-gzip */
    @javax.xml.bind.annotation.XmlEnumValue("application/gzip")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#gzip" )
    Application_Gzip( "https://ontology.mayo.edu/taxonomies/MIMEType#86e65488-45dc-32cf-8c07-7c41af1b4285", "86e65488-45dc-32cf-8c07-7c41af1b4285", "application/gzip", java.util.Arrays.asList( "application/gzip" ), "application-gzip", "http://www.invincea.com/ontologies/icas/1.0.1/mime#gzip",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* audio-example */
    @javax.xml.bind.annotation.XmlEnumValue("audio/example")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#exampleaudio" )
    Audio_Example( "https://ontology.mayo.edu/taxonomies/MIMEType#3cb16c17-0c41-3d66-a698-c1edf677064d", "3cb16c17-0c41-3d66-a698-c1edf677064d", "audio/example", java.util.Arrays.asList( "audio/example" ), "audio-example", "http://www.invincea.com/ontologies/icas/1.0.1/mime#exampleaudio",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* video-mp4 */
    @javax.xml.bind.annotation.XmlEnumValue("video/mp4")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#mp4video" )
    Video_Mp4( "https://ontology.mayo.edu/taxonomies/MIMEType#70691007-2798-3ae0-93e0-fc635f606548", "70691007-2798-3ae0-93e0-fc635f606548", "video/mp4", java.util.Arrays.asList( "video/mp4" ), "video-mp4", "http://www.invincea.com/ontologies/icas/1.0.1/mime#mp4video",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* model-vrml */
    @javax.xml.bind.annotation.XmlEnumValue("model/vrml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#vrml" )
    Model_Vrml( "https://ontology.mayo.edu/taxonomies/MIMEType#bc0e63d4-8aab-35c5-ae5e-e8b411840963", "bc0e63d4-8aab-35c5-ae5e-e8b411840963", "model/vrml", java.util.Arrays.asList( "model/vrml" ), "model-vrml", "http://www.invincea.com/ontologies/icas/1.0.1/mime#vrml",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* text-vndabc */
    @javax.xml.bind.annotation.XmlEnumValue("text/vnd.abc")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#vndabc" )
    Text_Vndabc( "https://ontology.mayo.edu/taxonomies/MIMEType#84356a82-437e-3707-83d8-dc3dfebfe9a6", "84356a82-437e-3707-83d8-dc3dfebfe9a6", "text/vnd.abc", java.util.Arrays.asList( "text/vnd.abc" ), "text-vndabc", "http://www.invincea.com/ontologies/icas/1.0.1/mime#vndabc",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Portable Network Graphics Image */
    @javax.xml.bind.annotation.XmlEnumValue("image/png")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#png" )
    Portable_Network_Graphics_Image( "https://ontology.mayo.edu/taxonomies/MIMEType#a6d34471-0a83-33af-b724-7888c39c3a77", "a6d34471-0a83-33af-b724-7888c39c3a77", "image/png", java.util.Arrays.asList( "image/png" ), "Portable Network Graphics Image", "http://www.invincea.com/ontologies/icas/1.0.1/mime#png",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* image-example */
    @javax.xml.bind.annotation.XmlEnumValue("image/example")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#exampleimage" )
    Image_Example( "https://ontology.mayo.edu/taxonomies/MIMEType#9bff71ae-704a-37cf-9db8-8cdae979d0b2", "9bff71ae-704a-37cf-9db8-8cdae979d0b2", "image/example", java.util.Arrays.asList( "image/example" ), "image-example", "http://www.invincea.com/ontologies/icas/1.0.1/mime#exampleimage",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Comma-Separated Values */
    @javax.xml.bind.annotation.XmlEnumValue("text/csv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#csv" )
    Comma_Separated_Values( "https://ontology.mayo.edu/taxonomies/MIMEType#295b6659-9517-3f7a-a9f7-a7bd6b753995", "295b6659-9517-3f7a-a9f7-a7bd6b753995", "text/csv", java.util.Arrays.asList( "text/csv" ), "Comma-Separated Values", "http://www.invincea.com/ontologies/icas/1.0.1/mime#csv",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* audio-mpeg */
    @javax.xml.bind.annotation.XmlEnumValue("audio/mpeg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#mpegaudio" )
    Audio_Mpeg( "https://ontology.mayo.edu/taxonomies/MIMEType#f3459d88-a015-31e6-8fe6-c19ef16f1c9c", "f3459d88-a015-31e6-8fe6-c19ef16f1c9c", "audio/mpeg", java.util.Arrays.asList( "audio/mpeg" ), "audio-mpeg", "http://www.invincea.com/ontologies/icas/1.0.1/mime#mpegaudio",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* message-imdxml */
    @javax.xml.bind.annotation.XmlEnumValue("model/imd+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#imdnxml" )
    Message_Imdxml( "https://ontology.mayo.edu/taxonomies/MIMEType#880d4a1b-6bbe-3f08-a729-bfeef3333536", "880d4a1b-6bbe-3f08-a729-bfeef3333536", "model/imd+xml", java.util.Arrays.asList( "model/imd+xml" ), "message-imdxml", "http://www.invincea.com/ontologies/icas/1.0.1/mime#imdnxml",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-ecmascript */
    @javax.xml.bind.annotation.XmlEnumValue("application/ecmascript")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#ecmascript" )
    Application_Ecmascript( "https://ontology.mayo.edu/taxonomies/MIMEType#f48558d9-8f72-374e-8ae1-99b84543fa0a", "f48558d9-8f72-374e-8ae1-99b84543fa0a", "application/ecmascript", java.util.Arrays.asList( "application/ecmascript" ), "application-ecmascript", "http://www.invincea.com/ontologies/icas/1.0.1/mime#ecmascript",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* video-mpeg */
    @javax.xml.bind.annotation.XmlEnumValue("video/mpeg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#mpegvideo" )
    Video_Mpeg( "https://ontology.mayo.edu/taxonomies/MIMEType#dcb181a5-eefe-3e9a-8923-e13f74430e5f", "dcb181a5-eefe-3e9a-8923-e13f74430e5f", "video/mpeg", java.util.Arrays.asList( "video/mpeg" ), "video-mpeg", "http://www.invincea.com/ontologies/icas/1.0.1/mime#mpegvideo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-example */
    @javax.xml.bind.annotation.XmlEnumValue("application/example")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#exampleapp" )
    Application_Example( "https://ontology.mayo.edu/taxonomies/MIMEType#65163f32-2781-3912-bfe5-65249f5bec09", "65163f32-2781-3912-bfe5-65249f5bec09", "application/example", java.util.Arrays.asList( "application/example" ), "application-example", "http://www.invincea.com/ontologies/icas/1.0.1/mime#exampleapp",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* model-mesh */
    @javax.xml.bind.annotation.XmlEnumValue("model/mesh")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#mesh" )
    Model_Mesh( "https://ontology.mayo.edu/taxonomies/MIMEType#81606f24-cdac-3755-803e-167fa7fa13f6", "81606f24-cdac-3755-803e-167fa7fa13f6", "model/mesh", java.util.Arrays.asList( "model/mesh" ), "model-mesh", "http://www.invincea.com/ontologies/icas/1.0.1/mime#mesh",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* RFC822 Email Message */
    @javax.xml.bind.annotation.XmlEnumValue("message/rfc822")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#rfc822" )
    RFC822_Email_Message( "https://ontology.mayo.edu/taxonomies/MIMEType#d7e73a9b-d104-3fbe-821d-fd0a9c47e6ce", "d7e73a9b-d104-3fbe-821d-fd0a9c47e6ce", "message/rfc822", java.util.Arrays.asList( "message/rfc822" ), "RFC822 Email Message", "http://www.invincea.com/ontologies/icas/1.0.1/mime#rfc822",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-edifact */
    @javax.xml.bind.annotation.XmlEnumValue("application/EDIFACT")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#edifact" )
    Application_Edifact( "https://ontology.mayo.edu/taxonomies/MIMEType#8fe3bdf9-a519-376b-854b-92b8c008b785", "8fe3bdf9-a519-376b-854b-92b8c008b785", "application/EDIFACT", java.util.Arrays.asList( "application/EDIFACT" ), "application-edifact", "http://www.invincea.com/ontologies/icas/1.0.1/mime#edifact",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* multipart-data */
    @javax.xml.bind.annotation.XmlEnumValue("multipart/data")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#formdata" )
    Multipart_Data( "https://ontology.mayo.edu/taxonomies/MIMEType#28d567e3-35d5-3ebd-b427-0f146e94164a", "28d567e3-35d5-3ebd-b427-0f146e94164a", "multipart/data", java.util.Arrays.asList( "multipart/data" ), "multipart-data", "http://www.invincea.com/ontologies/icas/1.0.1/mime#formdata",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-xhtmlxml */
    @javax.xml.bind.annotation.XmlEnumValue("application/xhtml+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#xhtmlxml" )
    Application_Xhtmlxml( "https://ontology.mayo.edu/taxonomies/MIMEType#d821095b-2fe8-3ca7-af75-dcbf9cc790e5", "d821095b-2fe8-3ca7-af75-dcbf9cc790e5", "application/xhtml+xml", java.util.Arrays.asList( "application/xhtml+xml" ), "application-xhtmlxml", "http://www.invincea.com/ontologies/icas/1.0.1/mime#xhtmlxml",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* audio-vndwave */
    @javax.xml.bind.annotation.XmlEnumValue("audio/wav")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#vndwave" )
    Audio_Vndwave( "https://ontology.mayo.edu/taxonomies/MIMEType#6aea8e02-2c05-3133-804c-4c36c4e6fb60", "6aea8e02-2c05-3133-804c-4c36c4e6fb60", "audio/wav", java.util.Arrays.asList( "audio/wav" ), "audio-vndwave", "http://www.invincea.com/ontologies/icas/1.0.1/mime#vndwave",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* HyperText Markup Language */
    @javax.xml.bind.annotation.XmlEnumValue("text/html")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#html" )
    HyperText_Markup_Language( "https://ontology.mayo.edu/taxonomies/MIMEType#6ffaad09-c302-36c3-8c88-88e6d6757d2f", "6ffaad09-c302-36c3-8c88-88e6d6757d2f", "text/html", java.util.Arrays.asList( "text/html" ), "HyperText Markup Language", "http://www.invincea.com/ontologies/icas/1.0.1/mime#html",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* model-x3dfastinfoset */
    @javax.xml.bind.annotation.XmlEnumValue("model/x3d+fastinfoset")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#x3dfastinfoset" )
    Model_X3dfastinfoset( "https://ontology.mayo.edu/taxonomies/MIMEType#5247f0c5-b779-341b-a509-84ec63168854", "5247f0c5-b779-341b-a509-84ec63168854", "model/x3d+fastinfoset", java.util.Arrays.asList( "model/x3d+fastinfoset" ), "model-x3dfastinfoset", "http://www.invincea.com/ontologies/icas/1.0.1/mime#x3dfastinfoset",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Apple QuickTime Video */
    @javax.xml.bind.annotation.XmlEnumValue("video/quicktime")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#quicktime" )
    Apple_QuickTime_Video( "https://ontology.mayo.edu/taxonomies/MIMEType#45045ebb-0e37-3588-aa44-d79ee7586381", "45045ebb-0e37-3588-aa44-d79ee7586381", "video/quicktime", java.util.Arrays.asList( "video/quicktime" ), "Apple QuickTime Video", "http://www.invincea.com/ontologies/icas/1.0.1/mime#quicktime",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* audio-l24 */
    @javax.xml.bind.annotation.XmlEnumValue("audio/L24")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#l24" )
    Audio_L24( "https://ontology.mayo.edu/taxonomies/MIMEType#747e61f8-67a8-385f-b7a7-14ed2f914254", "747e61f8-67a8-385f-b7a7-14ed2f914254", "audio/L24", java.util.Arrays.asList( "audio/L24" ), "audio-l24", "http://www.invincea.com/ontologies/icas/1.0.1/mime#l24",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* message-partial */
    @javax.xml.bind.annotation.XmlEnumValue("message/partial")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#partial" )
    Message_Partial( "https://ontology.mayo.edu/taxonomies/MIMEType#5bd9ea7e-a823-3362-8e1e-ad2fab4801bc", "5bd9ea7e-a823-3362-8e1e-ad2fab4801bc", "message/partial", java.util.Arrays.asList( "message/partial" ), "message-partial", "http://www.invincea.com/ontologies/icas/1.0.1/mime#partial",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* JSON Data */
    @javax.xml.bind.annotation.XmlEnumValue("application/json")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#json" )
    JSON_Data( "https://ontology.mayo.edu/taxonomies/MIMEType#d1f5a9d4-46c6-3ec2-8f63-545e8163e585", "d1f5a9d4-46c6-3ec2-8f63-545e8163e585", "application/json", java.util.Arrays.asList( "application/json" ), "JSON Data", "http://www.invincea.com/ontologies/icas/1.0.1/mime#json",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* video-ogg */
    @javax.xml.bind.annotation.XmlEnumValue("video/ogg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#oggvideo" )
    Video_Ogg( "https://ontology.mayo.edu/taxonomies/MIMEType#680f149c-d80a-3320-ad40-4aecd94bb979", "680f149c-d80a-3320-ad40-4aecd94bb979", "video/ogg", java.util.Arrays.asList( "video/ogg" ), "video-ogg", "http://www.invincea.com/ontologies/icas/1.0.1/mime#oggvideo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* multipart-alternative */
    @javax.xml.bind.annotation.XmlEnumValue("multipart/alternative")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#alternative" )
    Multipart_Alternative( "https://ontology.mayo.edu/taxonomies/MIMEType#8563ef1a-56ae-3b03-ad5b-d3e95ea8c5f3", "8563ef1a-56ae-3b03-ad5b-d3e95ea8c5f3", "multipart/alternative", java.util.Arrays.asList( "multipart/alternative" ), "multipart-alternative", "http://www.invincea.com/ontologies/icas/1.0.1/mime#alternative",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* audio-mp4 */
    @javax.xml.bind.annotation.XmlEnumValue("audio/mp4")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#mp4" )
    Audio_Mp4( "https://ontology.mayo.edu/taxonomies/MIMEType#5b724d89-87ac-386b-9f96-2dc258cba8e4", "5b724d89-87ac-386b-9f96-2dc258cba8e4", "audio/mp4", java.util.Arrays.asList( "audio/mp4" ), "audio-mp4", "http://www.invincea.com/ontologies/icas/1.0.1/mime#mp4",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* video-avi */
    @javax.xml.bind.annotation.XmlEnumValue("video/avi")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#avi" )
    Video_Avi( "https://ontology.mayo.edu/taxonomies/MIMEType#97833ea8-739a-3436-9f74-023c6d28905d", "97833ea8-739a-3436-9f74-023c6d28905d", "video/avi", java.util.Arrays.asList( "video/avi" ), "video-avi", "http://www.invincea.com/ontologies/icas/1.0.1/mime#avi",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-rssxml */
    @javax.xml.bind.annotation.XmlEnumValue("application/rss+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#rssxml" )
    Application_Rssxml( "https://ontology.mayo.edu/taxonomies/MIMEType#bdac12ce-4e04-3890-a44b-add54d0664df", "bdac12ce-4e04-3890-a44b-add54d0664df", "application/rss+xml", java.util.Arrays.asList( "application/rss+xml" ), "application-rssxml", "http://www.invincea.com/ontologies/icas/1.0.1/mime#rssxml",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Octet-Stream */
    @javax.xml.bind.annotation.XmlEnumValue("application/octet-stream")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#octet-stream" )
    Octet_Stream( "https://ontology.mayo.edu/taxonomies/MIMEType#fe7a824e-702d-3b28-a101-bb89430df06b", "fe7a824e-702d-3b28-a101-bb89430df06b", "application/octet-stream", java.util.Arrays.asList( "application/octet-stream" ), "Octet-Stream", "http://www.invincea.com/ontologies/icas/1.0.1/mime#octet-stream",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-xml */
    @javax.xml.bind.annotation.XmlEnumValue("application/xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#xml" )
    Application_Xml( "https://ontology.mayo.edu/taxonomies/MIMEType#5c90526a-12dd-3ea0-a402-444cbf93a177", "5c90526a-12dd-3ea0-a402-444cbf93a177", "application/xml", java.util.Arrays.asList( "application/xml" ), "application-xml", "http://www.invincea.com/ontologies/icas/1.0.1/mime#xml",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-rdfxml */
    @javax.xml.bind.annotation.XmlEnumValue("application/rdf+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#rdfxml" )
    Application_Rdfxml( "https://ontology.mayo.edu/taxonomies/MIMEType#b4e59966-1d1d-31a0-89fd-c6e94e178548", "b4e59966-1d1d-31a0-89fd-c6e94e178548", "application/rdf+xml", java.util.Arrays.asList( "application/rdf+xml" ), "application-rdfxml", "http://www.invincea.com/ontologies/icas/1.0.1/mime#rdfxml",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* image-gif */
    @javax.xml.bind.annotation.XmlEnumValue("image/gif")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#gif" )
    Image_Gif( "https://ontology.mayo.edu/taxonomies/MIMEType#fad40117-6da6-3e1c-8d28-f1cf4abc58f4", "fad40117-6da6-3e1c-8d28-f1cf4abc58f4", "image/gif", java.util.Arrays.asList( "image/gif" ), "image-gif", "http://www.invincea.com/ontologies/icas/1.0.1/mime#gif",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* multipart-signed */
    @javax.xml.bind.annotation.XmlEnumValue("multipart/signed")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#signed" )
    Multipart_Signed( "https://ontology.mayo.edu/taxonomies/MIMEType#5ba2f195-7488-3b93-80b3-aa4c39a91c03", "5ba2f195-7488-3b93-80b3-aa4c39a91c03", "multipart/signed", java.util.Arrays.asList( "multipart/signed" ), "multipart-signed", "http://www.invincea.com/ontologies/icas/1.0.1/mime#signed",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Javascript */
    @javax.xml.bind.annotation.XmlEnumValue("application/javascript")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#javascript" )
    Javascript( "https://ontology.mayo.edu/taxonomies/MIMEType#aac491d2-2bcb-34a9-9dee-d88b738c1edc", "aac491d2-2bcb-34a9-9dee-d88b738c1edc", "application/javascript", java.util.Arrays.asList( "application/javascript" ), "Javascript", "http://www.invincea.com/ontologies/icas/1.0.1/mime#javascript",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-xopxml */
    @javax.xml.bind.annotation.XmlEnumValue("application/xop+xml")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#xopxml" )
    Application_Xopxml( "https://ontology.mayo.edu/taxonomies/MIMEType#32432ad1-7983-347a-9b8e-25e1817c7a57", "32432ad1-7983-347a-9b8e-25e1817c7a57", "application/xop+xml", java.util.Arrays.asList( "application/xop+xml" ), "application-xopxml", "http://www.invincea.com/ontologies/icas/1.0.1/mime#xopxml",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-ogg */
    @javax.xml.bind.annotation.XmlEnumValue("application/ogg")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#oggapp" )
    Application_Ogg( "https://ontology.mayo.edu/taxonomies/MIMEType#7f9425e7-5b3a-3449-a34b-1189abc27d8b", "7f9425e7-5b3a-3449-a34b-1189abc27d8b", "application/ogg", java.util.Arrays.asList( "application/ogg" ), "application-ogg", "http://www.invincea.com/ontologies/icas/1.0.1/mime#oggapp",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* video-xflv */
    @javax.xml.bind.annotation.XmlEnumValue("video/xflv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#xflv" )
    Video_Xflv( "https://ontology.mayo.edu/taxonomies/MIMEType#9062ec9c-3a15-3578-ae04-53a20e4f388b", "9062ec9c-3a15-3578-ae04-53a20e4f388b", "video/xflv", java.util.Arrays.asList( "video/xflv" ), "video-xflv", "http://www.invincea.com/ontologies/icas/1.0.1/mime#xflv",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* application-xnacl */
    @javax.xml.bind.annotation.XmlEnumValue("application/xnacl")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#xnacl" )
    Application_Xnacl( "https://ontology.mayo.edu/taxonomies/MIMEType#af0372f3-f323-316d-8f8e-f4c588f3cb5e", "af0372f3-f323-316d-8f8e-f4c588f3cb5e", "application/xnacl", java.util.Arrays.asList( "application/xnacl" ), "application-xnacl", "http://www.invincea.com/ontologies/icas/1.0.1/mime#xnacl",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* video-example */
    @javax.xml.bind.annotation.XmlEnumValue("video/example")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#examplevideo" )
    Video_Example( "https://ontology.mayo.edu/taxonomies/MIMEType#439c0b3c-050e-3a3e-85c4-5de2a0634609", "439c0b3c-050e-3a3e-85c4-5de2a0634609", "video/example", java.util.Arrays.asList( "video/example" ), "video-example", "http://www.invincea.com/ontologies/icas/1.0.1/mime#examplevideo",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* video-xmswmv */
    @javax.xml.bind.annotation.XmlEnumValue("video/xms-wmv")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.invincea.com/ontologies/icas/1.0.1/mime#xmswmv" )
    Video_Xmswmv( "https://ontology.mayo.edu/taxonomies/MIMEType#6a2b8e1b-0c0a-30dd-8c8a-7063c1261070", "6a2b8e1b-0c0a-30dd-8c8a-7063c1261070", "video/xms-wmv", java.util.Arrays.asList( "video/xms-wmv" ), "video-xmswmv", "http://www.invincea.com/ontologies/icas/1.0.1/mime#xmswmv",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/MIMEType" )),
      URI.create("https://ontology.mayo.edu/taxonomies/MIMEType"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/MIMEType"))
      .withLabel( edu.mayo.ontology.taxonomies.mimetype.IMIMEType.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.mimetype.IMIMEType.SCHEME_ID )
      .withVersion( "20200816-213200" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, MIMEType> index = indexByUUID(MIMEType.values());

  private TermDescription description;
  private MIMETypeSeries series;

  public TermDescription getDescription() {
    return description;
  }

  MIMEType(final String conceptId, final String conceptUUID,
      final String code, final List<String> additionalCodes,
      final String displayName, final String referent,
      final Term[] ancestors,
      final Term[] closure) {
    this.description = new LegacyTermImpl(conceptId, conceptUUID, code, additionalCodes, displayName,
        referent, ancestors, closure);
    this.series = series;
  }

  @Override
  public NamespaceIdentifier getNamespace() {
    return namespace;
  }

  @Override
  public VersionedIdentifier getVersionIdentifier() {
    return new NamespaceIdentifier()
      .withId(getConceptId())
      .withLabel(getLabel())
      .withTag(getTag())
      .withVersion(namespace.getVersion())
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn(namespace.getEstablishedOn());
  }

  @Override
  public java.util.Date getEstablishedOn() {
    return namespace.getEstablishedOn();
  }

  @Override
  public String getVersionTag() {
    return namespace.getVersion();
  }

  @Override
  public MIMETypeSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.mimetype.IMIMEType> asSeries() {
    return toSeries();
  }

  private MIMETypeSeries toSeries() {
    if (series == null) {
      series = (MIMETypeSeries) MIMETypeSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<MIMEType> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<MIMEType> {
    protected MIMEType[] getValues() {
      return values();
    }
    @Override
    protected Optional<MIMEType> resolveUUID(UUID uuid) {
      return MIMEType.resolveUUID(uuid);
    }
  }


  public static Optional<MIMEType> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<MIMEType> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<MIMEType> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<MIMEType> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<MIMEType> resolveTag(final String tag) {
    Optional<MIMEType> l = resolveTerm(tag, MIMEType.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, MIMEType.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<MIMEType> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<MIMEType> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, MIMEType.values(), Term::getConceptId);
  }

  public static Optional<MIMEType> resolveRef(final URI refUri) {
    return resolveTerm(refUri, MIMEType.values(), Term::getRef);
  }

}
