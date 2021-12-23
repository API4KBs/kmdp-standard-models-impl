/**
 * Copyright © 2018 Mayo Clinic (RSTKNOWLEDGEMGMT@mayo.edu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.mayo.kmdp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.mayo.kmdp.util.StreamUtil;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.w3._2001.xmlschema.Schema;
import org.w3._2001.xmlschema.TopLevelComplexType;

class XSDTest {

  @Test
  void testSimpleXSDParse() {
    InputStream is = XSDTest.class.getResourceAsStream("/DMN12.xsd");

    Schema dmnSchema = XSDHelper.loadSchema(is)
        .orElseGet(Assertions::fail);

    List<TopLevelComplexType> complexTypes = dmnSchema.getSimpleTypeOrComplexTypeOrGroup()
        .stream().flatMap(StreamUtil.filterAs(TopLevelComplexType.class))
        .collect(Collectors.toList());

    assertTrue(complexTypes.stream().anyMatch(t -> "tDecision".equals(t.getName())));
  }


  @Test
  void testXSDParseWithDependencies() throws URISyntaxException {
    URL catalog = XSDTest.class.getResource("/dmn12-test-catalog.xml");
    URL root = XSDTest.class.getResource("/DMN12.xsd");

    assertNotNull(catalog);
    assertNotNull(root);
    Map<String, Schema> dmnSchema = XSDHelper.loadSchemaWithDependencies(root, catalog.toURI());
    assertEquals(4, dmnSchema.size());
  }
}

