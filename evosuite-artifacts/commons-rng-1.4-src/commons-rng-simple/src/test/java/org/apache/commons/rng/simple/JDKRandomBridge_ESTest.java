/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:19:34 GMT 2022
 */

package org.apache.commons.rng.simple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.simple.JDKRandomBridge;
import org.apache.commons.rng.simple.RandomSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDKRandomBridge_ESTest extends JDKRandomBridge_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.MT_64;
      JDKRandomBridge jDKRandomBridge0 = new JDKRandomBridge(randomSource0, (Object) null);
      jDKRandomBridge0.nextGaussian();
      int int0 = 4373;
      int int1 = jDKRandomBridge0.next((-126));
      double double0 = (-2450.0);
      // Undeclared exception!
      try { 
        jDKRandomBridge0.doubles((long) int1, (double) int1, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bound must be greater than origin
         //
         verifyException("java.util.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.PCG_XSH_RS_32_OS;
      JDKRandomBridge jDKRandomBridge0 = null;
      try {
        jDKRandomBridge0 = new JDKRandomBridge(randomSource0, randomSource0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Unrecognized seed type: PCG_XSH_RS_32_OS
         //
         verifyException("org.apache.commons.rng.simple.internal.NativeSeedType", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.TWO_CMRES;
      JDKRandomBridge jDKRandomBridge0 = null;
      try {
        jDKRandomBridge0 = new JDKRandomBridge(randomSource0, (Object) null);
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // Internal error: Please file a bug report
         //
         verifyException("org.apache.commons.rng.simple.internal.ProviderBuilder$RandomSourceInternal", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.TWO_CMRES_SELECT;
      JDKRandomBridge jDKRandomBridge0 = null;
      try {
        jDKRandomBridge0 = new JDKRandomBridge(randomSource0, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.SPLIT_MIX_64;
      JDKRandomBridge jDKRandomBridge0 = new JDKRandomBridge(randomSource0, (Object) null);
      jDKRandomBridge0.setSeed(92);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.PCG_RXS_M_XS_64;
      JDKRandomBridge jDKRandomBridge0 = null;
      try {
        jDKRandomBridge0 = new JDKRandomBridge((RandomSource) null, randomSource0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.simple.JDKRandomBridge", e);
      }
  }
}
