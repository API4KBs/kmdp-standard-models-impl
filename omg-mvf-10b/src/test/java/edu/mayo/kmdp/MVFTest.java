package edu.mayo.kmdp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.mayo.kmdp.util.JaxbUtil;
import edu.mayo.kmdp.util.XMLUtil;
import edu.mayo.kmdp.util.XPathUtil;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.omg.spec.mvf._20220702.mvf.MVFDictionary;
import org.omg.spec.mvf._20220702.mvf.MVFEntry;
import org.omg.spec.mvf._20220702.mvf.ObjectFactory;

class MVFTest {

  @Test
  void testDataTypesExist() {
    MVFEntry entry = new MVFEntry();
    assertNotNull(entry);
    MVFDictionary dict = new MVFDictionary();
    assertNotNull(dict);
  }

  @Test
  void testXMLwithXPath() {
    var dict = new MVFDictionary().withName("Test");

    var str = JaxbUtil.marshallToString(
        List.of(ObjectFactory.class),
        dict,
        new ObjectFactory()::createMVFDictionary,
        JaxbUtil.defaultProperties());
    assertTrue(str.contains("<mvf:name>Test</mvf:name>"));

    var dox = XMLUtil.loadXMLDocument(str)
        .orElseGet(Assertions::fail);

    var node = new XPathUtil().xString(dox, "//mvf:mVFDictionary/mvf:name");
    assertEquals("Test", node);
  }

}
