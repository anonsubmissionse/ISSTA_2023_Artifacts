/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:00:27 GMT 2022
 */

package org.apache.commons.imaging.formats.pnm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.imaging.formats.pnm.PpmFileInfo;
import org.apache.commons.imaging.formats.pnm.WhiteSpaceReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PpmFileInfo_ESTest extends PpmFileInfo_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo(1930, 935, false, 1930);
      int int0 = ppmFileInfo0.getBitDepth();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo((-3098), 1748, true, 1748);
      int int0 = ppmFileInfo0.getBitDepth();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo(11, 255, false, 255);
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        ppmFileInfo0.getRGB((InputStream) byteArrayInputStream0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // PNM: Unexpected EOF
         //
         verifyException("org.apache.commons.imaging.formats.pnm.FileInfo", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo(31, 31, true, 31);
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)8);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pushbackInputStream0);
      WhiteSpaceReader whiteSpaceReader0 = new WhiteSpaceReader(bufferedInputStream0);
      // Undeclared exception!
      try { 
        ppmFileInfo0.getRGB(whiteSpaceReader0);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
         //
         // For input string: \"\u0000\u0000\u0000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo(0, 1884, true, 1884);
      WhiteSpaceReader whiteSpaceReader0 = new WhiteSpaceReader((InputStream) null);
      // Undeclared exception!
      try { 
        ppmFileInfo0.getRGB(whiteSpaceReader0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.pnm.WhiteSpaceReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo((-1460), 255, true, 255);
      // Undeclared exception!
      try { 
        ppmFileInfo0.getRGB((InputStream) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.pnm.FileInfo", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = null;
      try {
        ppmFileInfo0 = new PpmFileInfo(16711680, (-33), true, 16711680);
        fail("Expecting exception: Exception");
      } catch(Throwable e) {
         //
         // PPM maxVal 16711680 is out of range [1;65535]
         //
         verifyException("org.apache.commons.imaging.formats.pnm.PpmFileInfo", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = null;
      try {
        ppmFileInfo0 = new PpmFileInfo((-1), (-1), false, (-1));
        fail("Expecting exception: Exception");
      } catch(Throwable e) {
         //
         // PPM maxVal -1 is out of range [1;65535]
         //
         verifyException("org.apache.commons.imaging.formats.pnm.PpmFileInfo", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo(1846, 2199, true, 2199);
      String string0 = ppmFileInfo0.getMIMEType();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo(1846, 2199, true, 2199);
      String string0 = ppmFileInfo0.getMIMEType();
      assertEquals(1, ppmFileInfo0.getBitDepth());
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo(1846, 2199, true, 2199);
      ppmFileInfo0.getImageType();
      assertEquals(1, ppmFileInfo0.getBitDepth());
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo(2488, 2488, true, 14);
      ppmFileInfo0.getColorType();
      assertEquals(1, ppmFileInfo0.getBitDepth());
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo((-1492), 3279, false, 3279);
      boolean boolean0 = ppmFileInfo0.hasAlpha();
      assertEquals(1, ppmFileInfo0.getBitDepth());
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo((-1492), 3279, false, 3279);
      boolean boolean0 = ppmFileInfo0.hasAlpha();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo(1930, 1930, false, 1930);
      String string0 = ppmFileInfo0.getImageTypeDescription();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo(1930, 1930, false, 1930);
      String string0 = ppmFileInfo0.getImageTypeDescription();
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo((-1492), 3279, false, 3279);
      int int0 = ppmFileInfo0.getNumComponents();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo((-1492), 3279, false, 3279);
      int int0 = ppmFileInfo0.getNumComponents();
      assertEquals(1, ppmFileInfo0.getBitDepth());
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PpmFileInfo ppmFileInfo0 = new PpmFileInfo((-1492), 3279, false, 3279);
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      WhiteSpaceReader whiteSpaceReader0 = new WhiteSpaceReader(dataInputStream0);
      try { 
        ppmFileInfo0.getRGB(whiteSpaceReader0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // PNM: Unexpected EOF
         //
         verifyException("org.apache.commons.imaging.formats.pnm.WhiteSpaceReader", e);
      }
  }
}
