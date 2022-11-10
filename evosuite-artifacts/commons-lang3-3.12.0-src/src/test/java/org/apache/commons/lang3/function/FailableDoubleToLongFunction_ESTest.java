/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:23:56 GMT 2022
 */

package org.apache.commons.lang3.function;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.function.FailableDoubleToLongFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FailableDoubleToLongFunction_ESTest extends FailableDoubleToLongFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FailableDoubleToLongFunction<Throwable> failableDoubleToLongFunction0 = FailableDoubleToLongFunction.nop();
      int int0 = failableDoubleToLongFunction0.applyAsLong(0.0);
      assertEquals(0, int0);
  }
}
