/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:12:10 GMT 2022
 */

package org.apache.commons.rng.core.source32;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.core.source32.XoRoShiRo64StarStar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XoRoShiRo64StarStar_ESTest extends XoRoShiRo64StarStar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XoRoShiRo64StarStar xoRoShiRo64StarStar0 = new XoRoShiRo64StarStar(2180, 2180);
      xoRoShiRo64StarStar0.state0 = 0;
      int int0 = xoRoShiRo64StarStar0.nextOutput();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XoRoShiRo64StarStar xoRoShiRo64StarStar0 = new XoRoShiRo64StarStar(2180, 2180);
      int int0 = xoRoShiRo64StarStar0.nextOutput();
      assertEquals(1096926130, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-110);
      XoRoShiRo64StarStar xoRoShiRo64StarStar0 = new XoRoShiRo64StarStar(intArray0);
      int int0 = xoRoShiRo64StarStar0.nextOutput();
      assertEquals((-1710291008), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XoRoShiRo64StarStar xoRoShiRo64StarStar0 = null;
      try {
        xoRoShiRo64StarStar0 = new XoRoShiRo64StarStar((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.core.source32.AbstractXoRoShiRo64", e);
      }
  }
}
