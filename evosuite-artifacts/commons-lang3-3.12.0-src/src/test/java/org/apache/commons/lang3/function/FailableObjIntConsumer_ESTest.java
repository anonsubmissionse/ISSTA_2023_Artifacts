/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:28:30 GMT 2022
 */

package org.apache.commons.lang3.function;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.function.FailableObjIntConsumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FailableObjIntConsumer_ESTest extends FailableObjIntConsumer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FailableObjIntConsumer<Object, Throwable> failableObjIntConsumer0 = FailableObjIntConsumer.nop();
      Integer integer0 = new Integer(0);
      failableObjIntConsumer0.accept(integer0, 0);
  }
}
