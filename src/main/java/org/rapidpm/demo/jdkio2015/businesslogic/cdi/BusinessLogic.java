package org.rapidpm.demo.jdkio2015.businesslogic.cdi;

import org.rapidpm.commons.cdi.CDINotMapped;

/**
 * Created by Sven Ruppert on 30.09.2014.
 */
@CDINotMapped
public interface BusinessLogic {
  public String doSomething();
}
