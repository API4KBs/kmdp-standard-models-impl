package org.snomed.languages.scg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.snomed.languages.scg.domain.model.SCGAttribute;
import org.snomed.languages.scg.domain.model.SCGAttributeGroup;
import org.snomed.languages.scg.domain.model.DefinitionStatus;
import org.snomed.languages.scg.domain.model.SCGExpression;


class SCGExpressionParserTest {

  private SCGExpressionParser builder;

  @BeforeEach
  void setUp() {
    builder = new SCGExpressionParser();
  }

  @Test
  void testExpressionWithInvalidSyntax() {
    String scg = "83152002|";

    assertThrows(SCGException.class, () -> {
      builder.abstractExpression(scg);
    });
  }


  @Test
  void testSimpleCode() {
    String scg = "83152002";

    SCGExpression xpr = builder.abstractExpression(scg);
    assertEquals(scg, xpr.getFocusConcepts().get(0).getConceptId());
  }

  @Test
  void testSimpleExpression() {
    String scg = "=== 83152002 |oophorectomy|";
    SCGExpression expression = builder.abstractExpression(scg);
    assertNotNull(expression.getDefinitionStatus());
    assertEquals(DefinitionStatus.EQUIVALENT_TO, expression.getDefinitionStatus());
    assertEquals(1, expression.getFocusConcepts().size());
    assertEquals("83152002", expression.getFocusConcepts().get(0).getConceptId());
  }


  @Test
  void testExpressionWithMultipleFocusConcepts() {
    String scg = "=== 421720008 |Spray dose form|  +  7946007 |Drug suspension|";
    SCGExpression expression = builder.abstractExpression(scg);
    assertNotNull(expression.getDefinitionStatus());
    assertEquals(DefinitionStatus.EQUIVALENT_TO, expression.getDefinitionStatus());
    assertEquals(2, expression.getFocusConcepts().size());
    assertTrue(expression.getFocusConcepts().stream()
        .anyMatch(s -> s.getConceptId().equals("421720008")));
    assertTrue(expression.getFocusConcepts().stream()
        .anyMatch(s -> s.getConceptId().equals("7946007")));
  }

  @Test
  void testExpressionWithSubTypeOfDefinitionStatus() {
    String scg = "<<< 73211009 |Diabetes mellitus| :  363698007 |Finding site|  =  113331007 |Endocrine system|";
    SCGExpression expression = builder.abstractExpression(scg);
    assertEquals(DefinitionStatus.SUBTYPE_OF, expression.getDefinitionStatus());
    assertNotNull(expression.getFocusConcepts());
    assertEquals(1, expression.getFocusConcepts().size());
    assertTrue(expression.getFocusConcepts().stream()
        .anyMatch(s -> s.getConceptId().equals("73211009")));
  }

  @Test
  void testExpressionWithExplicitEquivalentToDefinitionStatus() {
    String scg = "=== 46866001 |Fracture of lower limb| + 428881005 |Injury of tibia| :\n" +
        "        116676008 |Associated morphology| = 72704001 |Fracture| ,\n" +
        "        363698007 |Finding site| = 12611008 |Bone structure of tibia|";
    SCGExpression expression = builder.abstractExpression(scg);
    assertEquals(DefinitionStatus.EQUIVALENT_TO, expression.getDefinitionStatus());
    assertNotNull(expression.getFocusConcepts());
    assertEquals(2, expression.getFocusConcepts().size());
    assertTrue(expression.getFocusConcepts().stream()
        .anyMatch(s -> s.getConceptId().equals("46866001")));
    assertTrue(expression.getFocusConcepts().stream()
        .anyMatch(s -> s.getConceptId().equals("428881005")));
  }

  @Test
  void testExpressionWithAttribute() {
    String scg = "83152002 |oophorectomy|: 405815000|procedure device| = 122456005 |laser device|";
    SCGExpression expression = builder.abstractExpression(scg);
    assertNull(expression.getDefinitionStatus());
    assertNotNull(expression.getFocusConcepts());
    assertEquals(1, expression.getFocusConcepts().size());
    assertTrue(expression.getFocusConcepts().stream()
        .anyMatch(s -> s.getConceptId().equals("83152002")));
    assertNotNull(expression.getAttributes());
    assertEquals(1, expression.getAttributes().size());
    SCGAttribute attribute = expression.getAttributes().get(0);
    assertEquals("405815000", attribute.getProperty().getConceptId());
    assertEquals("122456005", attribute.getAttributeValueId().getConceptId());
  }


  @Test
  void testExpressionWithAttributeGroups() {
    String example =
        "=== 71388002 |Procedure| :" + "{  260686004 |Method| = 129304002 |Excision - action| ,"
            + "   405813007 |Procedure site - direct| = 15497006 |Ovarian structure| },"
            + "{  260686004 |Method| = 129304002 |Excision - action| ,"
            + "   405813007 |Procedure site - direct| = 31435000 |Fallopian tube structure| }";

    SCGExpression expression = builder.abstractExpression(example);
    assertEquals(DefinitionStatus.EQUIVALENT_TO, expression.getDefinitionStatus());
    assertNotNull(expression.getFocusConcepts());
    assertEquals(1, expression.getFocusConcepts().size());
    assertTrue(expression.getFocusConcepts().stream()
        .anyMatch(s -> s.getConceptId().equals("71388002")));
    assertNotNull(expression.getAttributeGroups());
    assertEquals(2, expression.getAttributeGroups().size());

    for (SCGAttributeGroup group : expression.getAttributeGroups()) {
      assertEquals(2, group.getAttributes().size());
      SCGAttribute attribute1 = group.getAttributes().get(0);
      SCGAttribute attribute2 = group.getAttributes().get(1);

      assertEquals("260686004", attribute1.getProperty().getConceptId());
      assertEquals("129304002", attribute1.getAttributeValueId().getConceptId());

      if (!"405813007".equals(attribute2.getProperty().getConceptId())
          && "15497006".equals(attribute2.getAttributeValueId().getConceptId())) {
        assertEquals("260686004", attribute1.getProperty().getConceptId());
        assertEquals("129304002", attribute1.getAttributeValueId().getConceptId());
        assertEquals("405813007", attribute2.getProperty().getConceptId());
        assertEquals("31435000", attribute2.getAttributeValueId().getConceptId());
      }
    }
  }

  @Test
  void testExpressionWithSimpleNestedRefinements() {
    String scg = "=== 373873005 |Pharmaceutical / biologic product| :"
        + "411116001 |Has dose form|  = ( 421720008 |Spray dose form|  +  7946007 |Drug suspension| )";
    SCGExpression expression = builder.abstractExpression(scg);
    assertEquals(DefinitionStatus.EQUIVALENT_TO, expression.getDefinitionStatus());
    assertNotNull(expression.getFocusConcepts());
    assertEquals(1, expression.getFocusConcepts().size());
    assertTrue(expression.getFocusConcepts().stream()
        .anyMatch(s -> s.getConceptId().equals("373873005")));
    assertTrue(expression.getAttributeGroups().isEmpty());
    assertNotNull(expression.getAttributes());
    assertEquals(1, expression.getAttributes().size());
    SCGAttribute attribute = expression.getAttributes().get(0);
    assertEquals("411116001", attribute.getProperty().getConceptId());
    assertNotNull(attribute.getAttributeValue());
    assertTrue(attribute.getAttributeValue().isNested());
    assertNull(attribute.getAttributeValue().getConcept());
    SCGExpression nestedExpression = attribute.getAttributeValue().getConceptExpression();
    assertNotNull(nestedExpression);
    assertNull(nestedExpression.getDefinitionStatus());
    assertTrue(nestedExpression.getFocusConcepts().stream()
        .anyMatch(s -> s.getConceptId().equals("421720008")));
    assertTrue(nestedExpression.getFocusConcepts().stream()
        .anyMatch(s -> s.getConceptId().equals("7946007")));
  }


  @Test
  void testExpressionWithNestedRefinements() {
    String scg = "=== 397956004 |prosthetic arthroplasty of the hip|:"
        + "363704007 |procedure site| = (24136001 |hip joint structure|: "
        + "272741003 |laterality| = 7771000 |left|),"
        + "{ 363699004 |direct device| = 304120007 |total hip replacement prosthesis|,"
        + "260686004 |method| = 257867005 |insertion - action|}";

    SCGExpression expression = builder.abstractExpression(scg);
    assertEquals(DefinitionStatus.EQUIVALENT_TO, expression.getDefinitionStatus());
    assertNotNull(expression.getFocusConcepts());
    assertEquals(1, expression.getFocusConcepts().size());
    assertTrue(expression.getFocusConcepts().stream()
        .anyMatch(s -> s.getConceptId().equals("397956004")));

    assertNotNull(expression.getAttributes());
    assertEquals(1, expression.getAttributes().size());
    SCGAttribute attribute = expression.getAttributes().get(0);
    assertEquals("363704007", attribute.getProperty().getConceptId());
    assertNotNull(attribute.getAttributeValue());
    assertTrue(attribute.getAttributeValue().isNested());
    assertNull(attribute.getAttributeValue().getConcept());

    SCGExpression nestedExpression = attribute.getAttributeValue().getConceptExpression();
    assertNotNull(nestedExpression);
    assertNull(nestedExpression.getDefinitionStatus());
    assertTrue(nestedExpression.getFocusConcepts().stream()
        .anyMatch(s -> s.getConceptId().equals("24136001")));
    assertEquals(1, nestedExpression.getAttributes().size());
    SCGAttribute nestedAttribute = nestedExpression.getAttributes().get(0);
    assertNotNull(nestedAttribute);
    assertEquals("272741003", nestedAttribute.getProperty().getConceptId());

    Set<SCGAttributeGroup> attributeGroups = expression.getAttributeGroups();
    assertNotNull(attributeGroups);
    assertEquals(1, attributeGroups.size());
    assertEquals(2, attributeGroups.iterator().next().getAttributes().size());
  }

  @Test
  void testExpressionToString() {
    String scg = "397956004 |prosthetic arthroplasty of the hip| : "
        + "363704007 |procedure site| = ( 24136001 |hip joint structure| : "
        + "272741003 |laterality| = 7771000 |left| ), "
        + "{ 363699004 |direct device| = 304120007 |total hip replacement prosthesis|, "
        + "260686004 |method| = 257867005 |insertion - action| }";

    SCGExpression expression = builder.abstractExpression(scg);
    assertEquals(
        "397956004 : 363704007 = ( 24136001 : 272741003 = 7771000 ) { 363699004 = 304120007, 260686004 = 257867005 }",
        expression.toString());

    assertEquals(scg, expression.toFullString());
    System.out.println(expression.toFullString());
  }
}
