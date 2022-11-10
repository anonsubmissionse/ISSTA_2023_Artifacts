/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:27:25 GMT 2022
 */

package org.apache.commons.lang3.function;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.function.FailableToLongBiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FailableToLongBiFunction_ESTest extends FailableToLongBiFunction_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FailableToLongBiFunction<Object, String, Throwable> failableToLongBiFunction0 = FailableToLongBiFunction.nop();
      Object object0 = new Object();
      long long0 = failableToLongBiFunction0.applyAsLong(object0, "");
      assertEquals(0, long0);
}
}
