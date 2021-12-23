package edu.mayo.kmdp;

import edu.mayo.kmdp.util.CatalogBasedURIResolver;
import edu.mayo.kmdp.util.JaxbUtil;
import edu.mayo.kmdp.util.StreamUtil;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.xml.catalog.CatalogException;
import org.w3._2001.xmlschema.Import;
import org.w3._2001.xmlschema.Include;
import org.w3._2001.xmlschema.ObjectFactory;
import org.w3._2001.xmlschema.Schema;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XSDHelper {

  private XSDHelper() {
    // functions only
  }

  public static Optional<Schema> loadSchema(InputStream is) {
    return JaxbUtil.unmarshall(ObjectFactory.class, Schema.class, is);
  }

  public static Optional<Schema> loadSchema(URL source) {
    try {
      InputStream is = source.openStream();
      return JaxbUtil.unmarshall(ObjectFactory.class, Schema.class, is);
    } catch (IOException e) {
      return Optional.empty();
    }
  }

  public static Map<String, Schema> loadSchemaWithDependencies(URL source, URI... catalogs) {
    EntityResolver resolver = new CatalogBasedURIResolver(catalogs);
    Map<String, Schema> schemas = new HashMap<>();
    loadSchemas(source, schemas, resolver);
    return schemas;
  }

  private static void loadSchemas(
      URL source,
      Map<String, Schema> schemas,
      EntityResolver resolver) {
    loadSchema(source).ifPresent(schema -> registerSchema(schema, schemas, resolver));
  }

  private static void registerSchema(Schema s, Map<String, Schema> schemas,
      EntityResolver resolver) {
    if (schemas.containsKey(s.getTargetNamespace())) {
      return;
    }
    schemas.put(s.getTargetNamespace(), s);
    s.getComposition().stream()
        .flatMap(StreamUtil.filterAs(Import.class))
        .forEach(imp -> {
          try {
            loadImport(imp, schemas, resolver);
          } catch (IOException e) {
            e.printStackTrace();
          } catch (SAXException e) {
            e.printStackTrace();
          }
        });
    s.getComposition().stream()
        .flatMap(StreamUtil.filterAs(Include.class))
        .forEach(incl -> loadInclude(incl, s, resolver));
  }

  private static void loadInclude(Include incl, Schema source,
      EntityResolver resolver) {
    throw new UnsupportedOperationException();
  }

  private static void loadImport(Import imp, Map<String, Schema> schemas,
      EntityResolver resolver) throws IOException, SAXException {
    String loc = imp.getSchemaLocation();
    if (schemas.containsKey(loc)) {
      // already resolved - do nothing;
      return;
    }
    InputSource src = resolver.resolveEntity(imp.getNamespace(), imp.getSchemaLocation());
    if (src != null) {
       XSDHelper.loadSchema(src.getByteStream())
          .ifPresent(s -> registerSchema(s, schemas, resolver));
    } else {
      throw new CatalogException(
          "Unable to resolve import" + imp.getNamespace() + " at " + imp.getSchemaLocation());
    }
  }


}
