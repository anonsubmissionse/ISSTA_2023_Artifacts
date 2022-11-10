/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:21:05 GMT 2022
 */

package org.apache.commons.rng.simple.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.simple.internal.Long2Int;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Long2Int_ESTest extends Long2Int_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Long2Int long2Int0 = new Long2Int();
      Long long0 = new Long((-1L));
      Integer integer0 = long2Int0.convert(long0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Long2Int long2Int0 = new Long2Int();
      Long long0 = new Long(529L);
      Integer integer0 = long2Int0.convert(long0);
      assertEquals(529, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Long2Int long2Int0 = new Long2Int();
      Long long0 = new Long(4294967295L);
      Integer integer0 = long2Int0.convert(long0);
      assertEquals((-1), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Long2Int long2Int0 = new Long2Int();
      // Undeclared exception!
      try { 
        long2Int0.convert((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.simple.internal.Long2Int", e);
      }
  }
}
