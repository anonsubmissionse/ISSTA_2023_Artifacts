/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:02:45 GMT 2022
 */

package org.apache.commons.imaging.palette;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.imaging.palette.ColorCount;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ColorCount_ESTest extends ColorCount_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ColorCount colorCount0 = new ColorCount(1602);
      ColorCount colorCount1 = new ColorCount(780);
      boolean boolean0 = colorCount1.equals(colorCount0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ColorCount colorCount0 = new ColorCount(1602);
      colorCount0.hashCode();
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ColorCount colorCount0 = new ColorCount(1602);
      ColorCount colorCount1 = new ColorCount(780);
      boolean boolean0 = colorCount0.equals(colorCount1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ColorCount colorCount0 = new ColorCount(1602);
      ColorCount colorCount1 = new ColorCount(780);
      boolean boolean0 = colorCount0.equals(colorCount1);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ColorCount colorCount0 = new ColorCount(1602);
      boolean boolean0 = colorCount0.equals(colorCount0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ColorCount colorCount0 = new ColorCount(1602);
      Object object0 = new Object();
      boolean boolean0 = colorCount0.equals(object0);
      assertTrue(boolean0);
}
}
