/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:12:29 GMT 2022
 */

package org.apache.commons.rng.core.source32;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.core.source32.Well19937a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Well19937a_ESTest extends Well19937a_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-2366);
      Well19937a well19937a0 = new Well19937a(intArray0);
      int int0 = well19937a0.next();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[3];
      Well19937a well19937a0 = new Well19937a(intArray0);
      well19937a0.index = (-3821);
      // Undeclared exception!
      try { 
        well19937a0.next();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3821
         //
         verifyException("org.apache.commons.rng.core.source32.AbstractWell$IndexTable", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[1];
      Well19937a well19937a0 = new Well19937a(intArray0);
      int int0 = well19937a0.next();
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Well19937a well19937a0 = null;
      try {
        well19937a0 = new Well19937a((int[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
