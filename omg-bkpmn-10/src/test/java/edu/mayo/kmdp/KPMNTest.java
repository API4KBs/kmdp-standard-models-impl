package edu.mayo.kmdp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.omg.spec.bkpmn._20201108.bkpmn.TBKPMNModel;
import org.omg.spec.bkpmn._20201108.bkpmn.TBKPMNModelPackage;
import org.omg.spec.bkpmn._20201108.bkpmn.TPurpose;

class KPMNTest {

  @Test
  void testInstantiate() {
    TBKPMNModelPackage bkp = new TBKPMNModelPackage()
        .withModel(new TBKPMNModel()
            .withPurposeRef(new TPurpose()));
    assertNotNull(bkp);
  }

}
