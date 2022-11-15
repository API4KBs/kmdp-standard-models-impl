package org.snomed.languages.scg.domain.model;

public class SCGTerm {

  private final String conceptId;

  private final String label;

  public SCGTerm(String code, String label) {
    this.conceptId = code;
    this.label = label;
  }

  public String getConceptId() {
    return conceptId;
  }

  public String getLabel() {
    return label;
  }

  @Override
  public String toString() {
    return toString(false);
  }

  public String toFullString() {
    return toString(true);
  }

  public String toString(boolean withLabels) {
    var sb = new StringBuilder(conceptId);
    if (withLabels && label != null) {
      sb.append(" |")
          .append(label)
          .append("|");
    }
    return sb.toString();
  }
}
