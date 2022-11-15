package org.snomed.languages.scg;

import org.snomed.languages.scg.domain.model.SCGAttributeGroup;
import org.snomed.languages.scg.domain.model.SCGAttributeValue;
import org.snomed.languages.scg.domain.model.SCGExpression;

public class SCGObjectFactory {

  protected SCGAttributeGroup getAttributeGroup() {
    return new SCGAttributeGroup();
  }

  protected SCGAttributeValue getAttributeValue() {
    return new SCGAttributeValue();
  }

  public SCGExpression getExpression() {
    return new SCGExpression();
  }
}