/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:02:20 GMT 2022
 */

package org.apache.commons.imaging.formats.png.scanlinefilters;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterAverage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScanlineFilterAverage_ESTest extends ScanlineFilterAverage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScanlineFilterAverage scanlineFilterAverage0 = new ScanlineFilterAverage(255);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      scanlineFilterAverage0.unfilter(byteArray0, byteArray0, byteArray0);
      assertArrayEquals(new byte[] {(byte)126, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ScanlineFilterAverage scanlineFilterAverage0 = new ScanlineFilterAverage(256);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        scanlineFilterAverage0.unfilter(byteArray0, (byte[]) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterAverage", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ScanlineFilterAverage scanlineFilterAverage0 = new ScanlineFilterAverage(2626);
      byte[] byteArray0 = new byte[1];
      scanlineFilterAverage0.unfilter(byteArray0, byteArray0, (byte[]) null);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ScanlineFilterAverage scanlineFilterAverage0 = new ScanlineFilterAverage((-1));
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[1];
      // Undeclared exception!
      try { 
        scanlineFilterAverage0.unfilter(byteArray0, byteArray1, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterAverage", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ScanlineFilterAverage scanlineFilterAverage0 = new ScanlineFilterAverage(255);
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[2];
      // Undeclared exception!
      try { 
        scanlineFilterAverage0.unfilter(byteArray0, byteArray1, byteArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterAverage", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ScanlineFilterAverage scanlineFilterAverage0 = new ScanlineFilterAverage(10);
      byte[] byteArray0 = new byte[25];
      scanlineFilterAverage0.unfilter(byteArray0, byteArray0, byteArray0);
      assertEquals(25, byteArray0.length);
  }
}
