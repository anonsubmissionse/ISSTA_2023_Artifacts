/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:25:20 GMT 2022
 */

package org.apache.commons.lang3.function;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.function.FailableLongFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FailableLongFunction_ESTest extends FailableLongFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FailableLongFunction<Object, Throwable> failableLongFunction0 = FailableLongFunction.nop();
      Object object0 = failableLongFunction0.apply(0L);
      assertNull(object0);
  }
}
