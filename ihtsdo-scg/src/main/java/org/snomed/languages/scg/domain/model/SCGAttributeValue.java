package org.snomed.languages.scg.domain.model;

public class SCGAttributeValue implements Refinement {

  private SCGTerm concept;
  private SCGExpression conceptExpression;

  public SCGTerm getConcept() {
    return this.concept;
  }

  public void setConcept(SCGTerm concept) {
    this.concept = concept;
  }

  public SCGExpression getConceptExpression() {
    return conceptExpression;
  }

  public void setConceptExpression(SCGExpression conceptExpression) {
    this.conceptExpression = conceptExpression;
  }

  public boolean isNested() {
    return this.conceptExpression != null;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((concept == null) ? 0 : concept.hashCode());
    result = prime * result + ((conceptExpression == null) ? 0 : conceptExpression.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    SCGAttributeValue other = (SCGAttributeValue) obj;
    if (concept == null) {
      if (other.concept != null) {
        return false;
      }
    } else if (!concept.equals(other.concept)) {
      return false;
    }
    if (conceptExpression == null) {
      return other.conceptExpression == null;
    } else {
      return conceptExpression.equals(other.conceptExpression);
    }
  }


  @Override
  public String toString() {
    return toString(false);
  }

  public String toFullString() {
    return toString(true);
  }

  public String toString(boolean withLabels) {
    StringBuilder builder = new StringBuilder();
    if (concept != null) {
      builder.append(concept.toString(withLabels));
    }
    if (conceptExpression != null) {
      builder.append("( ").append(conceptExpression.toString(withLabels)).append(" )");
    }
    return builder.toString();
  }
}
