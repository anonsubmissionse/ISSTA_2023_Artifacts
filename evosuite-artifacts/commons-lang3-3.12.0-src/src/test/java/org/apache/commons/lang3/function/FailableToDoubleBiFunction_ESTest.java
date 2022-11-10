/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:25:17 GMT 2022
 */

package org.apache.commons.lang3.function;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.function.FailableToDoubleBiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FailableToDoubleBiFunction_ESTest extends FailableToDoubleBiFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FailableToDoubleBiFunction<String, Object, Throwable> failableToDoubleBiFunction0 = FailableToDoubleBiFunction.nop();
      Object object0 = new Object();
      double double0 = failableToDoubleBiFunction0.applyAsDouble("", object0);
      assertEquals(0.0, double0, 0.01);
  }
}
