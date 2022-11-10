/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:05:15 GMT 2022
 */

package org.apache.commons.rng.core.source64;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.JumpableUniformRandomProvider;
import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.core.source64.XoShiRo512Plus;
import org.apache.commons.rng.core.source64.XoShiRo512PlusPlus;
import org.apache.commons.rng.core.source64.XoShiRo512StarStar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractXoShiRo512_ESTest extends AbstractXoShiRo512_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XoShiRo512PlusPlus xoShiRo512PlusPlus0 = new XoShiRo512PlusPlus((-2578L), 0L, 0L, 0L, 0L, 0L, (-1834L), 0L);
      xoShiRo512PlusPlus0.longJump();
      byte[] byteArray0 = xoShiRo512PlusPlus0.getStateInternal();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XoShiRo512PlusPlus xoShiRo512PlusPlus0 = new XoShiRo512PlusPlus(0L, 0L, 7373545129600583345L, 7373545129600583345L, 7373545129600583345L, 7373545129600583345L, 7373545129600583345L, 2124L);
      long[] longArray0 = new long[3];
      XoShiRo512Plus xoShiRo512Plus0 = new XoShiRo512Plus(longArray0);
      byte[] byteArray0 = xoShiRo512Plus0.getStateInternal();
      xoShiRo512PlusPlus0.setStateInternal(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XoShiRo512Plus xoShiRo512Plus0 = new XoShiRo512Plus(0L, 0L, 0L, 0L, 0L, 2867L, 2867L, 0L);
      long long0 = xoShiRo512Plus0.next();
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XoShiRo512PlusPlus xoShiRo512PlusPlus0 = new XoShiRo512PlusPlus((-5362622907718333345L), (-5362622907718333345L), (-2340L), (-5362622907718333345L), 0L, (-996L), 655L, 655L);
      long long0 = xoShiRo512PlusPlus0.next();
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XoShiRo512StarStar xoShiRo512StarStar0 = new XoShiRo512StarStar((-2241461938891922586L), (-2241461938891922586L), (-425L), (-2241461938891922586L), (-2241461938891922586L), (-2241461938891922586L), 0L, 0L);
      xoShiRo512StarStar0.nextBoolean();
      long long0 = xoShiRo512StarStar0.next();
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XoShiRo512PlusPlus xoShiRo512PlusPlus0 = new XoShiRo512PlusPlus(6018250552094165679L, 750L, 750L, 6018250552094165679L, 6018250552094165679L, 6018250552094165679L, 0L, 6018250552094165679L);
      // Undeclared exception!
      try { 
        xoShiRo512PlusPlus0.setStateInternal((byte[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.core.BaseProvider", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      long[] longArray0 = new long[0];
      XoShiRo512StarStar xoShiRo512StarStar0 = new XoShiRo512StarStar(longArray0);
      // Undeclared exception!
      try { 
        xoShiRo512StarStar0.setStateInternal(byteArray0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // State size must be larger than 64 but was 2
         //
         verifyException("org.apache.commons.rng.core.BaseProvider", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      long[] longArray0 = new long[8];
      XoShiRo512Plus xoShiRo512Plus0 = new XoShiRo512Plus(longArray0);
      JumpableUniformRandomProvider jumpableUniformRandomProvider0 = xoShiRo512Plus0.longJump();
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      XoShiRo512StarStar xoShiRo512StarStar0 = new XoShiRo512StarStar(258L, 258L, 258L, 258L, 258L, 258L, 258L, 258L);
      UniformRandomProvider uniformRandomProvider0 = xoShiRo512StarStar0.jump();
      ;
}
}
