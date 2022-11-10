/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:11:55 GMT 2022
 */

package org.apache.commons.rng.core.source32;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.core.source32.Well19937c;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Well19937c_ESTest extends Well19937c_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[2];
      Well19937c well19937c0 = new Well19937c(intArray0);
      int int0 = well19937c0.next();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      Well19937c well19937c0 = new Well19937c(intArray0);
      well19937c0.index = (-2930);
      // Undeclared exception!
      try { 
        well19937c0.next();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2930
         //
         verifyException("org.apache.commons.rng.core.source32.AbstractWell$IndexTable", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Well19937c well19937c0 = null;
      try {
        well19937c0 = new Well19937c((int[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.core.source32.AbstractWell", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[0];
      Well19937c well19937c0 = new Well19937c(intArray0);
      int int0 = well19937c0.next();
      assertEquals(1, int0);
}
}
