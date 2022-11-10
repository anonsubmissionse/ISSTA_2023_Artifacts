/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:12:33 GMT 2022
 */

package org.apache.commons.rng.core.source32;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.core.source32.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Well44497b_ESTest extends Well44497b_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[5] = 1110;
      Well44497b well44497b0 = new Well44497b(intArray0);
      int int0 = well44497b0.next();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[7];
      Well44497b well44497b0 = new Well44497b(intArray0);
      well44497b0.index = (-1617797059);
      // Undeclared exception!
      try { 
        well44497b0.next();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1617797059
         //
         verifyException("org.apache.commons.rng.core.source32.AbstractWell$IndexTable", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Well44497b well44497b0 = null;
      try {
        well44497b0 = new Well44497b((int[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[0];
      Well44497b well44497b0 = new Well44497b(intArray0);
      int int0 = well44497b0.next();
      assertEquals(0, int0);
}
}
