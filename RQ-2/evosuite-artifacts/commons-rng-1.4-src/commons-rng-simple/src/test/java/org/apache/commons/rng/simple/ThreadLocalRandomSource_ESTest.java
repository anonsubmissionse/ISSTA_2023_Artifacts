/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:17:37 GMT 2022
 */

package org.apache.commons.rng.simple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.core.source64.TwoCmres;
import org.apache.commons.rng.simple.RandomSource;
import org.apache.commons.rng.simple.ThreadLocalRandomSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ThreadLocalRandomSource_ESTest extends ThreadLocalRandomSource_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.TWO_CMRES_SELECT;
      // Undeclared exception!
      try { 
        ThreadLocalRandomSource.current(randomSource0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        ThreadLocalRandomSource.current((RandomSource) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Random source is null
         //
         verifyException("org.apache.commons.rng.simple.ThreadLocalRandomSource", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.TWO_CMRES;
      TwoCmres twoCmres0 = (TwoCmres)ThreadLocalRandomSource.current(randomSource0);
      assertEquals(0, twoCmres0.numberOfSubcycleGenerators());
}
}
