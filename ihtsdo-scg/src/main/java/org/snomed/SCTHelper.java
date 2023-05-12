package org.snomed;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class SCTHelper {

  public static final String SNOMED = "http://snomed.info/sct";
  public static final String SNOMED_NS = "http://snomed.info/id/";
  public static final String SNOMED_NAME = "SNOMEDCT";


  private SCTHelper() {
    // functions only
  }

  public static Optional<String> mapTag(String tag) {
    return recognizeTag(tag)
        .map(SCTCategories::getMappedConcept);
  }

  public static Set<String> getAllTags() {
    return Arrays.stream(SCTCategories.values())
        .map(SCTCategories::getSemanticTag)
        .collect(Collectors.toSet());
  }

  public static boolean isTag(String tag) {
    return recognizeTag(tag)
        .isPresent();
  }

  private static Optional<SCTCategories> recognizeTag(String tag) {
    return Arrays.stream(SCTCategories.values())
        .filter(ct -> tag.equals(ct.getSemanticTag()) || tag.equals("sct:" + ct.getSemanticTag()))
        .findFirst();
  }
}
