package org.snomed.languages.scg.domain.model;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SCGExpression {

  private DefinitionStatus definitionStatus;
  private List<SCGTerm> focusConcepts;
  private List<SCGAttribute> attributes;
  private Set<SCGAttributeGroup> attributeGroups;

  public SCGExpression() {
    // empty constructor
  }

  public List<SCGAttribute> getAttributes() {
    return attributes != null
        ? attributes
        : Collections.emptyList();
  }

  public void setAttributes(List<SCGAttribute> attributes) {
    this.attributes = attributes;
  }

  public List<SCGTerm> getFocusConcepts() {
    return focusConcepts != null
        ? focusConcepts
        : Collections.emptyList();
  }

  public void setFocusConcepts(List<SCGTerm> focusConcepts) {
    this.focusConcepts = focusConcepts;
  }

  public DefinitionStatus getDefinitionStatus() {
    return definitionStatus;
  }

  public void setDefinitionStatus(DefinitionStatus definitionStatus) {
    this.definitionStatus = definitionStatus;
  }

  public Set<SCGAttributeGroup> getAttributeGroups() {
    return attributeGroups != null
        ? attributeGroups
        : Collections.emptySet();
  }

  public void setAttributeGroups(Set<SCGAttributeGroup> groups) {
    this.attributeGroups = groups;
  }

  /**
   * Writes expression out in normalised SNOMED Compositional Grammar form.
   */
  @Override
  public String toString() {
    return toString(false);
  }

  public String toFullString() {
    return toString(true);
  }


  public String toString(boolean withLabels) {
    StringBuilder builder = new StringBuilder();
    if (getDefinitionStatus() != null) {
      builder.append(getDefinitionStatus().toString()).append(" ");
    }

    var foci = getFocusConcepts().stream()
        .map(f -> f.toString(withLabels))
        .collect(Collectors.joining(" + "));
    builder.append(foci);

    if (!getAttributes().isEmpty() || !getAttributeGroups().isEmpty()) {
      builder.append(" :");
    }

    if (!getAttributes().isEmpty()) {
      builder.append(" ");
      var atts = getAttributes().stream()
          .map(a -> a.toString(withLabels))
          .collect(Collectors.joining(", "));
      builder.append(atts);
    }

    if (!getAttributeGroups().isEmpty()) {
      builder.append(withLabels ? ", " : " ");
      var groups = getAttributeGroups().stream()
          .map(g -> g.toString(withLabels))
          .collect(Collectors.joining(" "));
      builder.append(groups);
    }

    return builder.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((attributeGroups == null) ? 0 : attributeGroups.hashCode());
    result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
    result = prime * result + ((definitionStatus == null) ? 0 : definitionStatus.hashCode());
    result = prime * result + ((focusConcepts == null) ? 0 : focusConcepts.hashCode());
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
    SCGExpression other = (SCGExpression) obj;
    if (attributeGroups == null) {
      if (other.attributeGroups != null) {
        return false;
      }
    } else if (!attributeGroups.equals(other.attributeGroups)) {
      return false;
    }
    if (attributes == null) {
      if (other.attributes != null) {
        return false;
      }
    } else if (!attributes.equals(other.attributes)) {
      return false;
    }
    if (definitionStatus != other.definitionStatus) {
      return false;
    }
    if (focusConcepts == null) {
      return other.focusConcepts == null;
    } else {
      return focusConcepts.equals(other.focusConcepts);
    }
  }
}
