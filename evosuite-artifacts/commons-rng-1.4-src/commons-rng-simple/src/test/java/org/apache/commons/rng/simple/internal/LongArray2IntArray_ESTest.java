/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:15:26 GMT 2022
 */

package org.apache.commons.rng.simple.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.simple.internal.LongArray2IntArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LongArray2IntArray_ESTest extends LongArray2IntArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LongArray2IntArray longArray2IntArray0 = new LongArray2IntArray();
      long[] longArray0 = new long[8];
      int[] intArray0 = longArray2IntArray0.convert(longArray0);
      assertEquals(16, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LongArray2IntArray longArray2IntArray0 = new LongArray2IntArray();
      long[] longArray0 = new long[0];
      int[] intArray0 = longArray2IntArray0.convert(longArray0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LongArray2IntArray longArray2IntArray0 = new LongArray2IntArray();
      // Undeclared exception!
      try { 
        longArray2IntArray0.convert((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.simple.internal.LongArray2IntArray", e);
      }
  }
}
