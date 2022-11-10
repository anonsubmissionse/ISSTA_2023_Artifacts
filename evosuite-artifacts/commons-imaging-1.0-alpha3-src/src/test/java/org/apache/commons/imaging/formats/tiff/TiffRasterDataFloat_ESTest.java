/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:58:05 GMT 2022
 */

package org.apache.commons.imaging.formats.tiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat;
import org.apache.commons.imaging.formats.tiff.TiffRasterDataType;
import org.apache.commons.imaging.formats.tiff.TiffRasterStatistics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffRasterDataFloat_ESTest extends TiffRasterDataFloat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(369, 369, 1);
      tiffRasterDataFloat0.setValue(1, 0, (float) 1);
      float float0 = tiffRasterDataFloat0.getValue(1, 0, 0);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(12, 12);
      tiffRasterDataFloat0.setIntValue(0, 0, (-1780));
      float float0 = tiffRasterDataFloat0.getValue(0, 0, 0);
      assertEquals((-1780.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      float[] floatArray0 = new float[2];
      floatArray0[0] = (float) 2290;
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(2290, 2290, 2290, floatArray0);
      float float0 = tiffRasterDataFloat0.getValue(0, 0);
      assertEquals(2290.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(1, 1, 1);
      tiffRasterDataFloat0.setValue(0, 0, (-1789.7152F));
      float float0 = tiffRasterDataFloat0.getValue(0, 0);
      assertEquals((-1789.7152F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(13, 1);
      TiffRasterStatistics tiffRasterStatistics0 = tiffRasterDataFloat0.getSimpleStatistics(Float.NaN);
      assertEquals(13, tiffRasterStatistics0.getCountOfSamples());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      float[] floatArray0 = new float[4];
      floatArray0[0] = (float) (-392);
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(1, 1, floatArray0);
      TiffRasterStatistics tiffRasterStatistics0 = tiffRasterDataFloat0.getSimpleStatistics((float) (-1518930783));
      assertEquals((-1.51893082E9F), tiffRasterStatistics0.getExcludedValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      float[] floatArray0 = new float[4];
      floatArray0[3] = (float) 1;
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(1, 1, floatArray0);
      TiffRasterStatistics tiffRasterStatistics0 = tiffRasterDataFloat0.getSimpleStatistics((float) (-1518930783));
      assertEquals((-1.51893082E9F), tiffRasterStatistics0.getExcludedValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      float[] floatArray0 = new float[2];
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(2273, 2273, 2273, floatArray0);
      TiffRasterStatistics tiffRasterStatistics0 = tiffRasterDataFloat0.getSimpleStatistics(0.0F);
      assertEquals(0.0F, tiffRasterStatistics0.getExcludedValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[0] = Float.NaN;
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(1, 2, floatArray0);
      TiffRasterStatistics tiffRasterStatistics0 = tiffRasterDataFloat0.getSimpleStatistics(2.0F);
      assertEquals(2.0F, tiffRasterStatistics0.getExcludedValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(12, 12);
      tiffRasterDataFloat0.setIntValue(0, 0, (-1780));
      TiffRasterStatistics tiffRasterStatistics0 = tiffRasterDataFloat0.getSimpleStatistics();
      assertEquals((-12.361111F), tiffRasterStatistics0.getMeanValue(), 0.01F);
      assertEquals(Float.NaN, tiffRasterStatistics0.getExcludedValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      float[] floatArray0 = new float[2];
      floatArray0[0] = (float) 2290;
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(2290, 2290, 2290, floatArray0);
      TiffRasterStatistics tiffRasterStatistics0 = tiffRasterDataFloat0.getSimpleStatistics();
      assertFalse(tiffRasterStatistics0.isAnExcludedValueSet());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      float[] floatArray0 = new float[0];
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(120553784, 120553784, 120553784, floatArray0);
      TiffRasterStatistics tiffRasterStatistics0 = tiffRasterDataFloat0.getSimpleStatistics();
      assertEquals(Float.NaN, tiffRasterStatistics0.getExcludedValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      float[] floatArray0 = new float[6];
      floatArray0[3] = (float) 2;
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(2, 2, floatArray0);
      int int0 = tiffRasterDataFloat0.getIntValue(1, 1, 2);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(2, 2);
      tiffRasterDataFloat0.setIntValue(0, 0, 2, 2);
      int int0 = tiffRasterDataFloat0.getIntValue(0, 0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(12, 12);
      tiffRasterDataFloat0.setIntValue(0, 0, (-1780));
      int int0 = tiffRasterDataFloat0.getIntValue(0, 0);
      assertEquals((-1780), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      float[] floatArray0 = new float[2];
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(2290, 2290, 2290, floatArray0);
      int[] intArray0 = tiffRasterDataFloat0.getIntData();
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(369, 369, 1);
      float[] floatArray0 = tiffRasterDataFloat0.getData();
      assertEquals(136161, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(752, 752);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.setValue((-1415), (-1706), (-3580), (float) 752);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Coordinates out of range (-1415, -1706)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      float[] floatArray0 = new float[2];
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(2290, 2290, 2290, floatArray0);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.setValue(620, 620, 620, (float) 620);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1042204876
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      float[] floatArray0 = new float[0];
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(3078, 3078, 3078, floatArray0);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.setValue(3078, 3078, (float) 3078);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Coordinates out of range (3078, 3078)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      float[] floatArray0 = new float[10];
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(2269, 2269, 2269, floatArray0);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.setValue(379, 379, (float) 379);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 860330
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(1, 1, 1);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.setIntValue(1, (-180), 640, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Coordinates out of range (1, -180)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      float[] floatArray0 = new float[2];
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(2290, 2290, 2290, floatArray0);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.setIntValue(2, 381, 39651821, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 872492
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(38, 38);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.setIntValue(1, 38, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Coordinates out of range (1, 38)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      float[] floatArray0 = new float[19];
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(2290, 2290, 2290, floatArray0);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.setIntValue(2, 2, (-2951));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4582
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      float[] floatArray0 = new float[2];
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(2290, 2290, 2290, floatArray0);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.getValue(2290, (-1111), 2290);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Coordinates out of range (2290, -1111)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      float[] floatArray0 = new float[2];
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(2290, 2290, 2290, floatArray0);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.getValue(0, 0, 1933);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1546910708
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(3790, 1);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.getValue(3790, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Coordinates out of range (3790, 1)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      float[] floatArray0 = new float[2];
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(2290, 2290, 2290, floatArray0);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.getValue(1611, 1611);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3690801
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(489, 1929);
      // Undeclared exception!
      tiffRasterDataFloat0.getSimpleStatistics(0.0F);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(675, 1166);
      // Undeclared exception!
      tiffRasterDataFloat0.getSimpleStatistics();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(369, 369, 1);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.getIntValue((-1699), (-3954), (-1517));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Coordinates out of range (-1699, -3954)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(38, 38);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.getIntValue(3409, 38);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Coordinates out of range (3409, 38)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      float[] floatArray0 = new float[2];
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(2273, 2273, 2273, floatArray0);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.getIntValue(1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2274
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = null;
      try {
        tiffRasterDataFloat0 = new TiffRasterDataFloat(1328, 1328, 1328);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = null;
      try {
        tiffRasterDataFloat0 = new TiffRasterDataFloat((-782), (-782), (-782));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Raster dimensions less than or equal to zero are not supported
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = null;
      try {
        tiffRasterDataFloat0 = new TiffRasterDataFloat(129846224, 1274);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = null;
      try {
        tiffRasterDataFloat0 = new TiffRasterDataFloat((-1518930783), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Raster dimensions less than or equal to zero are not supported
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      float[] floatArray0 = new float[0];
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(3078, 3078, 3078, floatArray0);
      float[] floatArray1 = tiffRasterDataFloat0.getData();
      assertSame(floatArray1, floatArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      float[] floatArray0 = new float[9];
      TiffRasterDataFloat tiffRasterDataFloat0 = null;
      try {
        tiffRasterDataFloat0 = new TiffRasterDataFloat(407, 407, 407, floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Specified data does not contain sufficient elements
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = null;
      try {
        tiffRasterDataFloat0 = new TiffRasterDataFloat(947778, 947778, 947778, (float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Specified data does not contain sufficient elements
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      float[] floatArray0 = new float[0];
      TiffRasterDataFloat tiffRasterDataFloat0 = null;
      try {
        tiffRasterDataFloat0 = new TiffRasterDataFloat(2, 2, floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Specified data does not contain sufficient elements
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      float[] floatArray0 = new float[2];
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(38080, 7311616, floatArray0);
      // Undeclared exception!
      try { 
        tiffRasterDataFloat0.getIntValue(2, 2, (-1860));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 76162
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = null;
      try {
        tiffRasterDataFloat0 = new TiffRasterDataFloat(1566, 1566, (float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Specified data does not contain sufficient elements
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(1, 1, 1);
      TiffRasterDataType tiffRasterDataType0 = tiffRasterDataFloat0.getDataType();
      assertEquals(TiffRasterDataType.FLOAT, tiffRasterDataType0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(54, 54, 54);
      int[] intArray0 = tiffRasterDataFloat0.getIntData();
      assertEquals(157464, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(12, 12);
      int int0 = tiffRasterDataFloat0.getIntValue(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(12, 12);
      int int0 = tiffRasterDataFloat0.getIntValue(0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(54, 54, 54);
      tiffRasterDataFloat0.setValue(0, 0, 0, (float) 0);
      assertEquals(TiffRasterDataType.FLOAT, tiffRasterDataFloat0.getDataType());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      float[] floatArray0 = new float[2];
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(2290, 2290, 2290, floatArray0);
      float float0 = tiffRasterDataFloat0.getValue(0, 0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TiffRasterDataFloat tiffRasterDataFloat0 = new TiffRasterDataFloat(12, 12);
      float float0 = tiffRasterDataFloat0.getValue(0, 0, 0);
      assertEquals(0.0F, float0, 0.01F);
  }
}
