/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:39:20 GMT 2022
 */

package org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PaletteEntryForRange_ESTest extends PaletteEntryForRange_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Color color0 = Color.GREEN;
      Color color1 = color0.darker();
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-747.0F), 0.86261666F, color1, color0);
      Color color2 = paletteEntryForRange0.getColor((-747.0F));
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Color color0 = Color.GREEN;
      Color color1 = color0.darker();
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-747.0F), 0.86261666F, color1, color0);
      Color color2 = paletteEntryForRange0.getColor((-747.0F));
      assertEquals(1, color2.getRGB());
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Color color0 = Color.MAGENTA;
      Color color1 = color0.darker();
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-747.0F), 0.0F, color1, color0);
      Color color2 = paletteEntryForRange0.getColor((-714.0179F));
      assertEquals(0, color2.getRGB());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Color color0 = Color.MAGENTA;
      Color color1 = color0.darker();
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-747.0F), 0.0F, color1, color0);
      Color color2 = paletteEntryForRange0.getColor((-714.0179F));
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Color color0 = Color.MAGENTA;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-747.0F), 0.0F, color0, color0);
      Color color1 = paletteEntryForRange0.getColor(0.0F);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Color color0 = Color.MAGENTA;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-747.0F), 0.0F, color0, color0);
      Color color1 = paletteEntryForRange0.getColor(0.0F);
      assertEquals(0, color1.getRGB());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Color color0 = Color.MAGENTA;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-747.0F), 0.0F, color0, color0);
      Color color1 = paletteEntryForRange0.getColor(0.0F);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Color color0 = Color.DARK_GRAY;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0);
      Color color1 = paletteEntryForRange0.getColor((-2842.0F));
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Color color0 = Color.DARK_GRAY;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0);
      Color color1 = paletteEntryForRange0.getColor((-2842.0F));
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Color color0 = Color.GREEN;
      Color color1 = color0.darker();
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-747.0F), 0.86261666F, color1, color0);
      int int0 = paletteEntryForRange0.getARGB(0.86261666F);
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Color color0 = Color.MAGENTA;
      Color color1 = color0.darker();
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-747.0F), 0.0F, color1, color0);
      int int0 = paletteEntryForRange0.getARGB((-1.0F));
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Color color0 = Color.MAGENTA;
      Color color1 = color0.darker();
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-747.0F), 0.0F, color1, color0);
      int int0 = paletteEntryForRange0.getARGB((-1.0F));
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Color color0 = Color.getColor("9#", (-1));
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2361.5217F), (-437.52673F), color0);
      boolean boolean0 = paletteEntryForRange0.isCovered((-437.52673F));
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Color color0 = Color.getColor("9#", (-1));
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2361.5217F), (-437.52673F), color0);
      boolean boolean0 = paletteEntryForRange0.isCovered((-437.52673F));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Color color0 = Color.getColor("9#", (-1));
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2361.5217F), (-437.52673F), color0);
      boolean boolean0 = paletteEntryForRange0.isCovered((-437.52673F));
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Color color0 = Color.orange;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-503.178F), 0.0F, color0);
      float float0 = paletteEntryForRange0.getUpperBound();
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Color color0 = Color.orange;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-503.178F), 0.0F, color0);
      float float0 = paletteEntryForRange0.getUpperBound();
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Color color0 = Color.magenta;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2359.27F), (-1.0F), color0, color0);
      float float0 = paletteEntryForRange0.getUpperBound();
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Color color0 = Color.magenta;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2359.27F), (-1.0F), color0, color0);
      float float0 = paletteEntryForRange0.getUpperBound();
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Color color0 = Color.getColor("", (-1955));
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange(0.0F, 1895.0F, color0, color0);
      float float0 = paletteEntryForRange0.getLowerBound();
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Color color0 = Color.getColor("", (-1955));
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange(0.0F, 1895.0F, color0, color0);
      float float0 = paletteEntryForRange0.getLowerBound();
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Color color0 = Color.black;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange(1926.7F, 3699.3F, color0, color0);
      float float0 = paletteEntryForRange0.getLowerBound();
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Color color0 = Color.black;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange(1926.7F, 3699.3F, color0, color0);
      float float0 = paletteEntryForRange0.getLowerBound();
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Color color0 = new Color(801, true);
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange(1.0F, 1028.45F, color0, color0);
      Color color1 = paletteEntryForRange0.getColor(535);
      assertEquals(0, color1.getRGB());
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Color color0 = new Color(801, true);
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange(1.0F, 1028.45F, color0, color0);
      Color color1 = paletteEntryForRange0.getColor(535);
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Color color0 = new Color(801, true);
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange(1.0F, 1028.45F, color0, color0);
      Color color1 = paletteEntryForRange0.getColor(535);
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Color color0 = new Color(1, true);
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange(14.939972F, 366.25946F, color0, color0);
      int int0 = paletteEntryForRange0.getARGB(14.939972F);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Color color0 = new Color(1, true);
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange(14.939972F, 366.25946F, color0, color0);
      int int0 = paletteEntryForRange0.getARGB(14.939972F);
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Color color0 = Color.GREEN;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-747.0F), 0.86261666F, color0, color0);
      Color color1 = paletteEntryForRange0.getColor(1.395878F);
      ;
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Color color0 = Color.GREEN;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-747.0F), 0.86261666F, color0, color0);
      Color color1 = paletteEntryForRange0.getColor(1.395878F);
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Color color0 = Color.GREEN;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-747.0F), 0.86261666F, color0, color0);
      Color color1 = paletteEntryForRange0.getColor(1.395878F);
      ;
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Color color0 = Color.getColor("", (-1955));
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange(0.0F, 1895.0F, color0, color0);
      Color color1 = paletteEntryForRange0.getColor((-1513.93F));
      ;
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Color color0 = Color.getColor("", (-1955));
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange(0.0F, 1895.0F, color0, color0);
      Color color1 = paletteEntryForRange0.getColor((-1513.93F));
      ;
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Color color0 = Color.getColor("", (-1955));
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange(0.0F, 1895.0F, color0, color0);
      Color color1 = paletteEntryForRange0.getColor((-1513.93F));
      ;
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      int int0 = paletteEntryForRange0.getARGB(0);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      int int0 = paletteEntryForRange0.getARGB(0);
      ;
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      int int0 = paletteEntryForRange0.getARGB(0);
      ;
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      int int0 = paletteEntryForRange0.getARGB((-8355712));
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      int int0 = paletteEntryForRange0.getARGB((-8355712));
      ;
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      int int0 = paletteEntryForRange0.getARGB((-8355712));
      ;
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      boolean boolean0 = paletteEntryForRange0.isCovered(0);
      ;
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      boolean boolean0 = paletteEntryForRange0.isCovered(0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      boolean boolean0 = paletteEntryForRange0.isCovered(0);
      ;
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      boolean boolean0 = paletteEntryForRange0.isCovered((-2842.0F));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      boolean boolean0 = paletteEntryForRange0.isCovered((-2842.0F));
      ;
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      boolean boolean0 = paletteEntryForRange0.isCovered((-8355712));
      ;
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      boolean boolean0 = paletteEntryForRange0.isCovered((-8355712));
      ;
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      boolean boolean0 = paletteEntryForRange0.isCovered((-8355712));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      PaletteEntryForRange paletteEntryForRange0 = null;
      try {
        paletteEntryForRange0 = new PaletteEntryForRange(29.768864F, 174.33649F, (Color) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Null colors not allowed
         //
         verifyException("org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange", e);
      }
  }
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Color color0 = Color.white;
      PaletteEntryForRange paletteEntryForRange0 = null;
      try {
        paletteEntryForRange0 = new PaletteEntryForRange(2102.932F, 2102.932F, color0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Specified values must be v0<v1
         //
         verifyException("org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange", e);
      }
  }
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Color color0 = Color.WHITE;
      PaletteEntryForRange paletteEntryForRange0 = null;
      try {
        paletteEntryForRange0 = new PaletteEntryForRange(2610.824F, 2752.3452F, color0, (Color) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Null colors not allowed
         //
         verifyException("org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange", e);
      }
  }
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      PaletteEntryForRange paletteEntryForRange0 = null;
      try {
        paletteEntryForRange0 = new PaletteEntryForRange(0.0F, 366.25946F, (Color) null, (Color) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Null colors not allowed
         //
         verifyException("org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange", e);
      }
  }
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Color color0 = Color.MAGENTA;
      PaletteEntryForRange paletteEntryForRange0 = null;
      try {
        paletteEntryForRange0 = new PaletteEntryForRange((-1096.4053F), (-1096.4053F), color0, color0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Specified values must be v0<v1
         //
         verifyException("org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange", e);
      }
  }
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Color color0 = Color.GREEN;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-747.0F), 0.86261666F, color0, color0);
      String string0 = paletteEntryForRange0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      boolean boolean0 = paletteEntryForRange0.coversSingleEntry();
      ;
}
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      boolean boolean0 = paletteEntryForRange0.coversSingleEntry();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      boolean boolean0 = paletteEntryForRange0.coversSingleEntry();
      ;
}
 @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      float float0 = paletteEntryForRange0.getLowerBound();
      ;
}
 @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Color color0 = Color.gray;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-2842.0F), (-494.75F), color0, color0);
      float float0 = paletteEntryForRange0.getLowerBound();
      ;
}
 @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Color color0 = Color.ORANGE;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-1845.2766F), 1895.0F, color0);
      float float0 = paletteEntryForRange0.getUpperBound();
      ;
}
 @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Color color0 = Color.ORANGE;
      PaletteEntryForRange paletteEntryForRange0 = new PaletteEntryForRange((-1845.2766F), 1895.0F, color0);
      float float0 = paletteEntryForRange0.getUpperBound();
      ;
}
}
