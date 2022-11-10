/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:49:20 GMT 2022
 */

package org.apache.commons.imaging.formats.png.scanlinefilters;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterPaeth;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScanlineFilterPaeth_ESTest extends ScanlineFilterPaeth_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScanlineFilterPaeth scanlineFilterPaeth0 = new ScanlineFilterPaeth(1);
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte)34;
      byteArray1[1] = (byte)53;
      // Undeclared exception!
      try { 
        scanlineFilterPaeth0.unfilter(byteArray1, byteArray0, byteArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterPaeth", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ScanlineFilterPaeth scanlineFilterPaeth0 = new ScanlineFilterPaeth(1);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-33);
      scanlineFilterPaeth0.unfilter(byteArray0, byteArray0, byteArray0);
      scanlineFilterPaeth0.unfilter(byteArray0, byteArray0, byteArray0);
      scanlineFilterPaeth0.unfilter(byteArray0, byteArray0, byteArray0);
      scanlineFilterPaeth0.unfilter(byteArray0, byteArray0, byteArray0);
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte) (-33);
      byteArray1[1] = (byte) (-1);
      scanlineFilterPaeth0.unfilter(byteArray0, byteArray0, byteArray1);
      assertArrayEquals(new byte[] {(byte) (-49), (byte) (-1), (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)1;
      ScanlineFilterPaeth scanlineFilterPaeth0 = new ScanlineFilterPaeth((byte)1);
      scanlineFilterPaeth0.unfilter(byteArray1, byteArray0, (byte[]) null);
      assertArrayEquals(new byte[] {(byte)1, (byte)1}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ScanlineFilterPaeth scanlineFilterPaeth0 = new ScanlineFilterPaeth(657);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        scanlineFilterPaeth0.unfilter((byte[]) null, (byte[]) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterPaeth", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ScanlineFilterPaeth scanlineFilterPaeth0 = new ScanlineFilterPaeth(1);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-33);
      scanlineFilterPaeth0.unfilter(byteArray0, byteArray0, byteArray0);
      scanlineFilterPaeth0.unfilter(byteArray0, byteArray0, byteArray0);
      scanlineFilterPaeth0.unfilter(byteArray0, byteArray0, byteArray0);
      scanlineFilterPaeth0.unfilter(byteArray0, byteArray0, byteArray0);
      scanlineFilterPaeth0.unfilter(byteArray0, byteArray0, byteArray0);
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte) (-33);
      byteArray1[1] = (byte) (-1);
      scanlineFilterPaeth0.unfilter(byteArray0, byteArray0, byteArray1);
      assertArrayEquals(new byte[] {(byte) (-65), (byte) (-33), (byte)0}, byteArray0);
  }
}
