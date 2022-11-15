package org.snomed.languages.scg.domain.model;

public class SCGAttribute implements Refinement {

  private SCGTerm property;

  private SCGAttributeValue attributeValue;

  public SCGTerm getProperty() {
    return property;
  }

  public void setProperty(SCGTerm property) {
    this.property = property;
  }

  public SCGTerm getAttributeValueId() {
    if (attributeValue != null && !attributeValue.isNested()) {
      return attributeValue.getConcept();
    }
    return null;
  }

  public SCGAttributeValue getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(SCGAttributeValue attributeValue) {
    this.attributeValue = attributeValue;
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
    if (property != null) {
      builder.append(property.toString(withLabels)).append(" = ");
    }
    if (attributeValue != null) {
      builder.append(attributeValue.toString(withLabels));
    }
    return builder.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((property == null) ? 0 : property.hashCode());
    result = prime * result + ((attributeValue == null) ? 0 : attributeValue.hashCode());
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
    SCGAttribute other = (SCGAttribute) obj;
    if (property == null) {
      if (other.property != null) {
        return false;
      }
    } else if (!property.equals(other.property)) {
      return false;
    }
    if (attributeValue == null) {
      if (other.attributeValue != null) {
        return false;
      }
    } else if (!attributeValue.equals(other.attributeValue)) {
      return false;
    }
    return true;
  }
}
