package edu.mayo.ontology.taxonomies.api4kp.responsecodes._2011;

import static edu.mayo.kmdp.id.helper.DatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveTerm;

import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;
import edu.mayo.kmdp.terms.impl.model.TermImpl;
import edu.mayo.kmdp.util.DateTimeUtil;
import edu.mayo.ontology.taxonomies.api4kp.responsecodes.ResponseCodeSeries;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.URIIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.VersionTagType;


@javax.xml.bind.annotation.XmlType(name = "ResponseCode")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( ResponseCode.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = ResponseCode.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = ResponseCode.JsonDeserializer.class )
public enum ResponseCode implements edu.mayo.ontology.taxonomies.api4kp.responsecodes.ResponseCode {


    /* IMUsed */
    @javax.xml.bind.annotation.XmlEnumValue("226")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#IMUsed" )
    IMUsed( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#9cfdf10e-8fc0-37a4-8b08-ed031e1f0ed1", "9cfdf10e-8fc0-37a4-8b08-ed031e1f0ed1", "226", java.util.Arrays.asList( "226" ), "IMUsed", "http://www.w3.org/2011/http-statusCodes#IMUsed",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Forbidden */
    @javax.xml.bind.annotation.XmlEnumValue("403")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#Forbidden" )
    Forbidden( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#bbf94b34-eb32-368a-9a57-a3be5062fe7d", "bbf94b34-eb32-368a-9a57-a3be5062fe7d", "403", java.util.Arrays.asList( "403" ), "Forbidden", "http://www.w3.org/2011/http-statusCodes#Forbidden",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* GatewayTimeout */
    @javax.xml.bind.annotation.XmlEnumValue("504")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#GatewayTimeout" )
    GatewayTimeout( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#b337e84d-e875-3b27-ada3-a12363109e80", "b337e84d-e875-3b27-ada3-a12363109e80", "504", java.util.Arrays.asList( "504" ), "GatewayTimeout", "http://www.w3.org/2011/http-statusCodes#GatewayTimeout",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* NotModified */
    @javax.xml.bind.annotation.XmlEnumValue("304")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#NotModified" )
    NotModified( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#37bc2f75-bf1b-3fe8-850a-1a41c200364c", "37bc2f75-bf1b-3fe8-850a-1a41c200364c", "304", java.util.Arrays.asList( "304" ), "NotModified", "http://www.w3.org/2011/http-statusCodes#NotModified",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Processing */
    @javax.xml.bind.annotation.XmlEnumValue("102")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#Processing" )
    Processing( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#ec895663-7a99-387b-9197-eacd77acce5e", "ec895663-7a99-387b-9197-eacd77acce5e", "102", java.util.Arrays.asList( "102" ), "Processing", "http://www.w3.org/2011/http-statusCodes#Processing",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* MethodNotAllowed */
    @javax.xml.bind.annotation.XmlEnumValue("405")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#MethodNotAllowed" )
    MethodNotAllowed( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#bbcbff5c-1f1d-3d46-825d-28119a85c6c2", "bbcbff5c-1f1d-3d46-825d-28119a85c6c2", "405", java.util.Arrays.asList( "405" ), "MethodNotAllowed", "http://www.w3.org/2011/http-statusCodes#MethodNotAllowed",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* HTTPVersionNotSupported */
    @javax.xml.bind.annotation.XmlEnumValue("505")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#HTTPVersionNotSupported" )
    HTTPVersionNotSupported( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#e8c0653f-ea13-391b-b3c4-8159f7c24f78", "e8c0653f-ea13-391b-b3c4-8159f7c24f78", "505", java.util.Arrays.asList( "505" ), "HTTPVersionNotSupported", "http://www.w3.org/2011/http-statusCodes#HTTPVersionNotSupported",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Found */
    @javax.xml.bind.annotation.XmlEnumValue("302")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#Found" )
    Found( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#577bcc91-4f9e-35d5-a4e4-f82f9f00e7d4", "577bcc91-4f9e-35d5-a4e4-f82f9f00e7d4", "302", java.util.Arrays.asList( "302" ), "Found", "http://www.w3.org/2011/http-statusCodes#Found",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* UnprocessableEntity */
    @javax.xml.bind.annotation.XmlEnumValue("422")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#UnprocessableEntity" )
    UnprocessableEntity( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#f85454e8-279b-3180-985c-ac7d243c5eb3", "f85454e8-279b-3180-985c-ac7d243c5eb3", "422", java.util.Arrays.asList( "422" ), "UnprocessableEntity", "http://www.w3.org/2011/http-statusCodes#UnprocessableEntity",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* RequestedRangeNotSatisfiable */
    @javax.xml.bind.annotation.XmlEnumValue("416")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#RequestedRangeNotSatisfiable" )
    RequestedRangeNotSatisfiable( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#8fe0093b-b30d-3f8c-b147-4bd0764e6ac0", "8fe0093b-b30d-3f8c-b147-4bd0764e6ac0", "416", java.util.Arrays.asList( "416" ), "RequestedRangeNotSatisfiable", "http://www.w3.org/2011/http-statusCodes#RequestedRangeNotSatisfiable",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* ExpectationFailed */
    @javax.xml.bind.annotation.XmlEnumValue("417")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#ExpectationFailed" )
    ExpectationFailed( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#41ae36ec-b9b3-3ee6-89d0-5b90c14222fb", "41ae36ec-b9b3-3ee6-89d0-5b90c14222fb", "417", java.util.Arrays.asList( "417" ), "ExpectationFailed", "http://www.w3.org/2011/http-statusCodes#ExpectationFailed",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* ProxyAuthenticationRequired */
    @javax.xml.bind.annotation.XmlEnumValue("407")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#ProxyAuthenticationRequired" )
    ProxyAuthenticationRequired( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#f4f6dce2-f3a0-39da-9a0c-2b5b66452017", "f4f6dce2-f3a0-39da-9a0c-2b5b66452017", "407", java.util.Arrays.asList( "407" ), "ProxyAuthenticationRequired", "http://www.w3.org/2011/http-statusCodes#ProxyAuthenticationRequired",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* NoContent */
    @javax.xml.bind.annotation.XmlEnumValue("204")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#NoContent" )
    NoContent( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#274ad478-6c3a-3ca6-9fa0-97b85867d9a4", "274ad478-6c3a-3ca6-9fa0-97b85867d9a4", "204", java.util.Arrays.asList( "204" ), "NoContent", "http://www.w3.org/2011/http-statusCodes#NoContent",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* BadGateway */
    @javax.xml.bind.annotation.XmlEnumValue("502")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#BadGateway" )
    BadGateway( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#b5b41fac-0361-3157-9967-3ecb926af5ae", "b5b41fac-0361-3157-9967-3ecb926af5ae", "502", java.util.Arrays.asList( "502" ), "BadGateway", "http://www.w3.org/2011/http-statusCodes#BadGateway",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* ServiceUnavailable */
    @javax.xml.bind.annotation.XmlEnumValue("503")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#ServiceUnavailable" )
    ServiceUnavailable( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#285e19f2-0bed-3d7d-a151-02b49d5c09a0", "285e19f2-0bed-3d7d-a151-02b49d5c09a0", "503", java.util.Arrays.asList( "503" ), "ServiceUnavailable", "http://www.w3.org/2011/http-statusCodes#ServiceUnavailable",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* PaymentRequired */
    @javax.xml.bind.annotation.XmlEnumValue("402")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#PaymentRequired" )
    PaymentRequired( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#69cb3ea3-17a3-3c4e-a143-e665fdb20b14", "69cb3ea3-17a3-3c4e-a143-e665fdb20b14", "402", java.util.Arrays.asList( "402" ), "PaymentRequired", "http://www.w3.org/2011/http-statusCodes#PaymentRequired",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* MovedPermanently */
    @javax.xml.bind.annotation.XmlEnumValue("301")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#MovedPermanently" )
    MovedPermanently( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#34ed066d-f378-3fac-89b9-24ec161e7639", "34ed066d-f378-3fac-89b9-24ec161e7639", "301", java.util.Arrays.asList( "301" ), "MovedPermanently", "http://www.w3.org/2011/http-statusCodes#MovedPermanently",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* RequestURITooLong */
    @javax.xml.bind.annotation.XmlEnumValue("414")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#RequestURITooLong" )
    RequestURITooLong( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#66808e32-7dc7-3d13-9ba1-8e051673d906", "66808e32-7dc7-3d13-9ba1-8e051673d906", "414", java.util.Arrays.asList( "414" ), "RequestURITooLong", "http://www.w3.org/2011/http-statusCodes#RequestURITooLong",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* NotImplemented */
    @javax.xml.bind.annotation.XmlEnumValue("501")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#NotImplemented" )
    NotImplemented( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#5b69b9cb-8306-3d40-b869-739ae7f0995e", "5b69b9cb-8306-3d40-b869-739ae7f0995e", "501", java.util.Arrays.asList( "501" ), "NotImplemented", "http://www.w3.org/2011/http-statusCodes#NotImplemented",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* MultiStatus */
    @javax.xml.bind.annotation.XmlEnumValue("207")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#MultiStatus" )
    MultiStatus( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#69adc1e1-07f7-37d0-b5d7-baf04342e1ca", "69adc1e1-07f7-37d0-b5d7-baf04342e1ca", "207", java.util.Arrays.asList( "207" ), "MultiStatus", "http://www.w3.org/2011/http-statusCodes#MultiStatus",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* NotFound */
    @javax.xml.bind.annotation.XmlEnumValue("404")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#NotFound" )
    NotFound( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#4f4adcbf-8c6f-36dc-bc8a-3282ac2bf10a", "4f4adcbf-8c6f-36dc-bc8a-3282ac2bf10a", "404", java.util.Arrays.asList( "404" ), "NotFound", "http://www.w3.org/2011/http-statusCodes#NotFound",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* PartialContent */
    @javax.xml.bind.annotation.XmlEnumValue("206")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#PartialContent" )
    PartialContent( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#7eabe3a1-649f-3a2b-bff8-c02ebfd5659f", "7eabe3a1-649f-3a2b-bff8-c02ebfd5659f", "206", java.util.Arrays.asList( "206" ), "PartialContent", "http://www.w3.org/2011/http-statusCodes#PartialContent",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Conflict */
    @javax.xml.bind.annotation.XmlEnumValue("409")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#Conflict" )
    Conflict( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#a96b65a7-21e5-31e1-a3de-768ac819ffbb", "a96b65a7-21e5-31e1-a3de-768ac819ffbb", "409", java.util.Arrays.asList( "409" ), "Conflict", "http://www.w3.org/2011/http-statusCodes#Conflict",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* UseProxy */
    @javax.xml.bind.annotation.XmlEnumValue("305")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#UseProxy" )
    UseProxy( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#496e05e1-aea0-39c4-a558-00e8a7b9ea28", "496e05e1-aea0-39c4-a558-00e8a7b9ea28", "305", java.util.Arrays.asList( "305" ), "UseProxy", "http://www.w3.org/2011/http-statusCodes#UseProxy",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* RequestEntityTooLarge */
    @javax.xml.bind.annotation.XmlEnumValue("413")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#RequestEntityTooLarge" )
    RequestEntityTooLarge( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#0deb1c54-8143-35ca-9ad2-66f53bc82511", "0deb1c54-8143-35ca-9ad2-66f53bc82511", "413", java.util.Arrays.asList( "413" ), "RequestEntityTooLarge", "http://www.w3.org/2011/http-statusCodes#RequestEntityTooLarge",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* NotAcceptable */
    @javax.xml.bind.annotation.XmlEnumValue("406")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#NotAcceptable" )
    NotAcceptable( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#8cb22bdd-0b7b-31ab-93d7-42e22eed8da2", "8cb22bdd-0b7b-31ab-93d7-42e22eed8da2", "406", java.util.Arrays.asList( "406" ), "NotAcceptable", "http://www.w3.org/2011/http-statusCodes#NotAcceptable",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* InternalServerError */
    @javax.xml.bind.annotation.XmlEnumValue("500")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#InternalServerError" )
    InternalServerError( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#cee63112-1c2e-3923-af3a-2f028ad5c89b", "cee63112-1c2e-3923-af3a-2f028ad5c89b", "500", java.util.Arrays.asList( "500" ), "InternalServerError", "http://www.w3.org/2011/http-statusCodes#InternalServerError",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* NotExtended */
    @javax.xml.bind.annotation.XmlEnumValue("510")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#NotExtended" )
    NotExtended( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#08740852-2c31-3eb1-b982-bc0eaf81d35f", "08740852-2c31-3eb1-b982-bc0eaf81d35f", "510", java.util.Arrays.asList( "510" ), "NotExtended", "http://www.w3.org/2011/http-statusCodes#NotExtended",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Unauthorized */
    @javax.xml.bind.annotation.XmlEnumValue("401")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#Unauthorized" )
    Unauthorized( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#816b112c-6105-33eb-9537-828a39af4818", "816b112c-6105-33eb-9537-828a39af4818", "401", java.util.Arrays.asList( "401" ), "Unauthorized", "http://www.w3.org/2011/http-statusCodes#Unauthorized",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* ResetContent */
    @javax.xml.bind.annotation.XmlEnumValue("205")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#ResetContent" )
    ResetContent( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#eae27d77-ca20-3b30-9e05-6e3d2dcd7d69", "eae27d77-ca20-3b30-9e05-6e3d2dcd7d69", "205", java.util.Arrays.asList( "205" ), "ResetContent", "http://www.w3.org/2011/http-statusCodes#ResetContent",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Accepted */
    @javax.xml.bind.annotation.XmlEnumValue("202")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#Accepted" )
    Accepted( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#854d6fae-5ee4-3911-a77c-739ee1734486", "854d6fae-5ee4-3911-a77c-739ee1734486", "202", java.util.Arrays.asList( "202" ), "Accepted", "http://www.w3.org/2011/http-statusCodes#Accepted",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* PreconditionFailed */
    @javax.xml.bind.annotation.XmlEnumValue("412")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#PreconditionFailed" )
    PreconditionFailed( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#b9228e09-62a7-3b84-b3d5-d92f4faa000b", "b9228e09-62a7-3b84-b3d5-d92f4faa000b", "412", java.util.Arrays.asList( "412" ), "PreconditionFailed", "http://www.w3.org/2011/http-statusCodes#PreconditionFailed",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* LengthRequired */
    @javax.xml.bind.annotation.XmlEnumValue("411")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#LengthRequired" )
    LengthRequired( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#17d63b16-25c8-36c2-a647-a73e1482372b", "17d63b16-25c8-36c2-a647-a73e1482372b", "411", java.util.Arrays.asList( "411" ), "LengthRequired", "http://www.w3.org/2011/http-statusCodes#LengthRequired",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* OK */
    @javax.xml.bind.annotation.XmlEnumValue("200")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#OK" )
    OK( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#3644a684-f98e-38fe-a23c-713b77189a77", "3644a684-f98e-38fe-a23c-713b77189a77", "200", java.util.Arrays.asList( "200" ), "OK", "http://www.w3.org/2011/http-statusCodes#OK",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* MultipleChoices */
    @javax.xml.bind.annotation.XmlEnumValue("300")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#MultipleChoices" )
    MultipleChoices( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#94f6d7e0-4a4d-3520-b530-0f18b984988c", "94f6d7e0-4a4d-3520-b530-0f18b984988c", "300", java.util.Arrays.asList( "300" ), "MultipleChoices", "http://www.w3.org/2011/http-statusCodes#MultipleChoices",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* RequestTimeout */
    @javax.xml.bind.annotation.XmlEnumValue("408")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#RequestTimeout" )
    RequestTimeout( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#0d0fd7c6-e093-37b8-84fa-0150b875b868", "0d0fd7c6-e093-37b8-84fa-0150b875b868", "408", java.util.Arrays.asList( "408" ), "RequestTimeout", "http://www.w3.org/2011/http-statusCodes#RequestTimeout",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Created */
    @javax.xml.bind.annotation.XmlEnumValue("201")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#Created" )
    Created( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#757b505c-fd34-364c-85ca-5b5690ee5293", "757b505c-fd34-364c-85ca-5b5690ee5293", "201", java.util.Arrays.asList( "201" ), "Created", "http://www.w3.org/2011/http-statusCodes#Created",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Continue */
    @javax.xml.bind.annotation.XmlEnumValue("100")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#Continue" )
    Continue( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#f899139d-f5e1-3593-9643-1415e770c6dd", "f899139d-f5e1-3593-9643-1415e770c6dd", "100", java.util.Arrays.asList( "100" ), "Continue", "http://www.w3.org/2011/http-statusCodes#Continue",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Locked */
    @javax.xml.bind.annotation.XmlEnumValue("423")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#Locked" )
    Locked( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#faa9afea-49ef-3ff0-a9a8-33cccc778fd0", "faa9afea-49ef-3ff0-a9a8-33cccc778fd0", "423", java.util.Arrays.asList( "423" ), "Locked", "http://www.w3.org/2011/http-statusCodes#Locked",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* NonAuthoritativeInformation */
    @javax.xml.bind.annotation.XmlEnumValue("203")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#NonAuthoritativeInformation" )
    NonAuthoritativeInformation( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#e2c0be24-560d-38c5-a599-c2a9c9d0bbd2", "e2c0be24-560d-38c5-a599-c2a9c9d0bbd2", "203", java.util.Arrays.asList( "203" ), "NonAuthoritativeInformation", "http://www.w3.org/2011/http-statusCodes#NonAuthoritativeInformation",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Gone */
    @javax.xml.bind.annotation.XmlEnumValue("410")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#Gone" )
    Gone( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#1068c6e4-c805-3cfd-8e9e-a8072e3189e2", "1068c6e4-c805-3cfd-8e9e-a8072e3189e2", "410", java.util.Arrays.asList( "410" ), "Gone", "http://www.w3.org/2011/http-statusCodes#Gone",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* InsufficientStorage */
    @javax.xml.bind.annotation.XmlEnumValue("507")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#InsufficientStorage" )
    InsufficientStorage( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#2d6cc4b2-d139-3535-92fb-8cbb3086ae2e", "2d6cc4b2-d139-3535-92fb-8cbb3086ae2e", "507", java.util.Arrays.asList( "507" ), "InsufficientStorage", "http://www.w3.org/2011/http-statusCodes#InsufficientStorage",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* FailedDependency */
    @javax.xml.bind.annotation.XmlEnumValue("424")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#FailedDependency" )
    FailedDependency( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#3c7781a3-6bcd-3cf0-8c11-a970fbe0e2a6", "3c7781a3-6bcd-3cf0-8c11-a970fbe0e2a6", "424", java.util.Arrays.asList( "424" ), "FailedDependency", "http://www.w3.org/2011/http-statusCodes#FailedDependency",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* BadRequest */
    @javax.xml.bind.annotation.XmlEnumValue("400")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#BadRequest" )
    BadRequest( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#18d80423-86b7-3e2c-a79f-d162df0205c8", "18d80423-86b7-3e2c-a79f-d162df0205c8", "400", java.util.Arrays.asList( "400" ), "BadRequest", "http://www.w3.org/2011/http-statusCodes#BadRequest",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* UpgradeRequired */
    @javax.xml.bind.annotation.XmlEnumValue("426")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#UpgradeRequired" )
    UpgradeRequired( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#6ecbdd6e-c859-3284-9c13-885a37ce8d81", "6ecbdd6e-c859-3284-9c13-885a37ce8d81", "426", java.util.Arrays.asList( "426" ), "UpgradeRequired", "http://www.w3.org/2011/http-statusCodes#UpgradeRequired",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* TemporaryRedirect */
    @javax.xml.bind.annotation.XmlEnumValue("307")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#TemporaryRedirect" )
    TemporaryRedirect( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#8e98d81f-8217-3049-b5cc-b23337bb5761", "8e98d81f-8217-3049-b5cc-b23337bb5761", "307", java.util.Arrays.asList( "307" ), "TemporaryRedirect", "http://www.w3.org/2011/http-statusCodes#TemporaryRedirect",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* VariantAlsoNegotiates */
    @javax.xml.bind.annotation.XmlEnumValue("506")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#VariantAlsoNegotiates" )
    VariantAlsoNegotiates( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#ff4d5fbb-afdf-376c-bdc0-32e3bde78de5", "ff4d5fbb-afdf-376c-bdc0-32e3bde78de5", "506", java.util.Arrays.asList( "506" ), "VariantAlsoNegotiates", "http://www.w3.org/2011/http-statusCodes#VariantAlsoNegotiates",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* UnsupportedMediaType */
    @javax.xml.bind.annotation.XmlEnumValue("415")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#UnsupportedMediaType" )
    UnsupportedMediaType( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#42e7aaa8-8b48-337a-96a1-acd04ed91125", "42e7aaa8-8b48-337a-96a1-acd04ed91125", "415", java.util.Arrays.asList( "415" ), "UnsupportedMediaType", "http://www.w3.org/2011/http-statusCodes#UnsupportedMediaType",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* Reserved */
    @javax.xml.bind.annotation.XmlEnumValue("306")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#Reserved" )
    Reserved( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#b2eb7349-0357-3495-bb57-a32e2841bda5", "b2eb7349-0357-3495-bb57-a32e2841bda5", "306", java.util.Arrays.asList( "306" ), "Reserved", "http://www.w3.org/2011/http-statusCodes#Reserved",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* SwitchingProtocols */
    @javax.xml.bind.annotation.XmlEnumValue("101")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#SwitchingProtocols" )
    SwitchingProtocols( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#38b3eff8-baf5-3627-878e-c76a704e9b52", "38b3eff8-baf5-3627-878e-c76a704e9b52", "101", java.util.Arrays.asList( "101" ), "SwitchingProtocols", "http://www.w3.org/2011/http-statusCodes#SwitchingProtocols",
        new Term[] {  },
        new Term[] {  } ) , 
   
    /* SeeOther */
    @javax.xml.bind.annotation.XmlEnumValue("303")
    @de.escalon.hypermedia.hydra.mapping.Expose( "http://www.w3.org/2011/http-statusCodes#SeeOther" )
    SeeOther( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes#11b9842e-0a27-3ff2-92c1-903e7132cd68", "11b9842e-0a27-3ff2-92c1-903e7132cd68", "303", java.util.Arrays.asList( "303" ), "SeeOther", "http://www.w3.org/2011/http-statusCodes#SeeOther",
        new Term[] {  },
        new Term[] {  } ) 
   ;


  public static final URIIdentifier schemeURI = Series.toVersion(
      new URIIdentifier()
          .withUri( URI.create( "https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes" )),
      URI.create("https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes/2011/"));

  public static final NamespaceIdentifier namespace = new NamespaceIdentifier()
      .withId(URI.create("https://ontology.mayo.edu/taxonomies/API4KP/ResponseCodes/2011/"))
      .withLabel( edu.mayo.ontology.taxonomies.api4kp.responsecodes.ResponseCode.SCHEME_NAME )
      .withTag( edu.mayo.ontology.taxonomies.api4kp.responsecodes.ResponseCode.SCHEME_ID )
      .withVersion( "2011" )
      .withVersioning( VersionTagType.TIMESTAMP )
      .withEstablishedOn( DateTimeUtil.parseDate("2020-08-16") );

  public static final Map<UUID, ResponseCode> index = indexByUUID(ResponseCode.values());

  private TermDescription description;
  private ResponseCodeSeries series;

  public TermDescription getDescription() {
    return description;
  }

  ResponseCode(final String conceptId, final String conceptUUID,
      final String code, final List<String> additionalCodes,
      final String displayName, final String referent,
      final Term[] ancestors,
      final Term[] closure) {
    this.description = new TermImpl(conceptId, conceptUUID, code, additionalCodes, displayName,
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
  public ResponseCodeSeries asEnum() {
    return toSeries();
  }

  @Override
  public Series<edu.mayo.ontology.taxonomies.api4kp.responsecodes.ResponseCode> asSeries() {
    return toSeries();
  }

  private ResponseCodeSeries toSeries() {
    if (series == null) {
      series = (ResponseCodeSeries) ResponseCodeSeries.resolveUUID(this.getConceptUUID())
        .orElseThrow(IllegalStateException::new);
    }
    return series;
  }

  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new Adapter();
    protected Term[] getValues() { return values(); }
	}

  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<ResponseCode> {}

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<ResponseCode> {
    protected ResponseCode[] getValues() {
      return values();
    }
    @Override
    protected Optional<ResponseCode> resolveUUID(UUID uuid) {
      return ResponseCode.resolveUUID(uuid);
    }
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
    Optional<ResponseCode> l = resolveTerm(tag, ResponseCode.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag, ResponseCode.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<ResponseCode> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<ResponseCode> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, ResponseCode.values(), Term::getConceptId);
  }

  public static Optional<ResponseCode> resolveRef(final URI refUri) {
    return resolveTerm(refUri, ResponseCode.values(), Term::getRef);
  }

}
