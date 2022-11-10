/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:00:11 GMT 2022
 */

package org.apache.commons.imaging.formats.png.transparencyfilters;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterIndexedColor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TransparencyFilterIndexedColor_ESTest extends TransparencyFilterIndexedColor_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      TransparencyFilterIndexedColor transparencyFilterIndexedColor0 = new TransparencyFilterIndexedColor(byteArray0);
      int int0 = transparencyFilterIndexedColor0.filter((byte)1, 0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TransparencyFilterIndexedColor transparencyFilterIndexedColor0 = new TransparencyFilterIndexedColor(byteArray0);
      try { 
        transparencyFilterIndexedColor0.filter((-2655), (-473));
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // TransparencyFilterIndexedColor index: -473, bytes.length: 0
         //
         verifyException("org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterIndexedColor", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TransparencyFilterIndexedColor transparencyFilterIndexedColor0 = new TransparencyFilterIndexedColor(byteArray0);
      int int0 = transparencyFilterIndexedColor0.filter(1, 1);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TransparencyFilterIndexedColor transparencyFilterIndexedColor0 = new TransparencyFilterIndexedColor(byteArray0);
      int int0 = transparencyFilterIndexedColor0.filter(0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TransparencyFilterIndexedColor transparencyFilterIndexedColor0 = new TransparencyFilterIndexedColor(byteArray0);
      int int0 = transparencyFilterIndexedColor0.filter((-4430), 16777105);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TransparencyFilterIndexedColor transparencyFilterIndexedColor0 = null;
      try {
        transparencyFilterIndexedColor0 = new TransparencyFilterIndexedColor((byte[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter", e);
      }
  }
}
