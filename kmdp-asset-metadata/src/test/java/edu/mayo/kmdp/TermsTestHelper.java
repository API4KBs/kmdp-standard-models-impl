package edu.mayo.kmdp;

import static edu.mayo.kmdp.id.helper.DatatypeHelper.ns;

import java.net.URI;
import org.omg.spec.api4kp._1_0.identifiers.ConceptIdentifier;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;

public class TermsTestHelper {

  /**
   * Instantiates a SNOMED-CT term
   * @param label
   * @param code
   * @return a Term from SNOMED
   */
  public static ConceptIdentifier sct(String label, String code) {
    return new ConceptIdentifier()
        .withLabel(label)
        .withTag(code)
        .withNamespace(ns("http://snomed.info/sct/900000000000207008",
            "SNOMED-CT",
            "20130731"))

        .withConceptId(URI.create("http://snomed.info/id/" + code))
        .withRef(URI.create("http://snomed.info/id/" + code));
  }

  /**
   * Instantiates a Mayo Clinic local term
   * @param label
   * @param code
   * @return a Test Term from a fictitious concept scheme
   */
  public static ConceptIdentifier mayo(String label, String code) {
    return new ConceptIdentifier()
        .withLabel(label)
        .withTag(code)
        .withNamespace(
            new NamespaceIdentifier().withId(URI.create("http://ontology.mayo.edu/taxonomies/TODO")))
        .withConceptId(URI.create("http://ontology.mayo.edu/taxonomies/TODO#" + code))
        .withRef(URI.create("http://ontology.mayo.edu/taxonomies/TODO#" + code));
  }
}
