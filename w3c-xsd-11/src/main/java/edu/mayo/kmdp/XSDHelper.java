package edu.mayo.kmdp;

import edu.mayo.kmdp.util.JaxbUtil;
import edu.mayo.kmdp.util.StreamUtil;
import edu.mayo.kmdp.util.XMLUtil;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.apache.xml.resolver.tools.CatalogResolver;
import org.w3._2001.xmlschema.Import;
import org.w3._2001.xmlschema.Include;
import org.w3._2001.xmlschema.ObjectFactory;
import org.w3._2001.xmlschema.Schema;

public class XSDHelper {

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

  public static Map<String, Schema> loadSchemaWithDependencies(URL source, URL... catalogs) {
    CatalogResolver resolver = XMLUtil.catalogResolver(catalogs);
    Map<String, Schema> schemas = new HashMap<>();
    loadSchemas(source, schemas, resolver);
    return schemas;
  }

  private static void loadSchemas(
      URL source,
      Map<String, Schema> schemas,
      CatalogResolver resolver) {
    loadSchema(source).ifPresent(schema -> registerSchema(schema, schemas, resolver));
  }

  private static void registerSchema(Schema s, Map<String, Schema> schemas,
      CatalogResolver resolver) {
    if (schemas.containsKey(s.getTargetNamespace())) {
      return;
    }
    schemas.put(s.getTargetNamespace(), s);
    s.getComposition().stream()
        .flatMap(StreamUtil.filterAs(Import.class))
        .forEach(imp -> loadImport(imp, schemas, resolver));
    s.getComposition().stream()
        .flatMap(StreamUtil.filterAs(Include.class))
        .forEach(incl -> loadInclude(incl, s, resolver));
  }

  private static void loadInclude(Include incl, Schema source,
      CatalogResolver resolver) {
    throw new UnsupportedOperationException();
  }

  private static void loadImport(Import imp, Map<String, Schema> schemas,
      CatalogResolver resolver) {
    String loc = imp.getSchemaLocation();
    if (schemas.containsKey(loc)) {
      // already resolved - do nothing;
      return;
    }
    resolveLocation(loc, resolver)
        .flatMap(XSDHelper::loadSchema)
        .ifPresent(s -> registerSchema(s, schemas, resolver));
  }

  private static Optional<URL> resolveLocation(String loc, CatalogResolver resolver) {
    try {
      if (loc == null) {
        return Optional.empty();
      }
      if (loc.startsWith("http:/")
          || loc.startsWith("https:/")
          || loc.startsWith("file:/")) {
        return Optional.of(new URL(loc));
      } else if (resolver != null) {
        loc = resolver.getCatalog().resolveURI(loc);
        return resolveLocation(loc, resolver);
      } else {
        return Optional.empty();
      }
    } catch (IOException ioe) {
      ioe.printStackTrace();
      return Optional.empty();
    }
  }


}
