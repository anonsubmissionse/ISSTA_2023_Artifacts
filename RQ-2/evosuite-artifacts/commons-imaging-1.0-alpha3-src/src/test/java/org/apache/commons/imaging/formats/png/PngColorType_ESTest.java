/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:51:35 GMT 2022
 */

package org.apache.commons.imaging.formats.png;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.imaging.formats.png.PngColorType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PngColorType_ESTest extends PngColorType_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.getColorType(4);
      assertNotNull(pngColorType0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PngColorType.getColorType((-1849));
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.INDEXED_COLOR;
      boolean boolean0 = pngColorType0.isBitDepthAllowed(4);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PngColorType[] pngColorTypeArray0 = PngColorType.values();
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.valueOf("GREYSCALE");
      boolean boolean0 = pngColorType0.isGreyscale();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.TRUE_COLOR_WITH_ALPHA;
      boolean boolean0 = pngColorType0.hasAlpha();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.getColorType(0);
      int int0 = pngColorType0.getValue();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.getColorType(false, false);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.getColorType(true, true);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.getColorType(true, false);
      assertNotNull(pngColorType0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.getColorType(false, true);
      assertNotNull(pngColorType0);
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.getColorType(false, true);
      boolean boolean0 = pngColorType0.isBitDepthAllowed(1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.getColorType(0);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.getColorType(0);
      boolean boolean0 = pngColorType0.isBitDepthAllowed(0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.INDEXED_COLOR;
      int int0 = pngColorType0.getValue();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.INDEXED_COLOR;
      boolean boolean0 = pngColorType0.hasAlpha();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.TRUE_COLOR_WITH_ALPHA;
      int int0 = pngColorType0.getSamplesPerPixel();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PngColorType pngColorType0 = PngColorType.TRUE_COLOR_WITH_ALPHA;
      boolean boolean0 = pngColorType0.isGreyscale();
      assertTrue(boolean0);
}
}
