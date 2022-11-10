/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:47:40 GMT 2022
 */

package org.apache.commons.imaging.formats.jpeg.decoder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JpegInputStream_ESTest extends JpegInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 255;
      intArray0[1] = 1;
      JpegInputStream jpegInputStream0 = new JpegInputStream(intArray0);
      try { 
        jpegInputStream0.nextBit();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid marker found in entropy data: 0xFF 1
         //
         verifyException("org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 3233;
      JpegInputStream jpegInputStream0 = new JpegInputStream(intArray0);
      int int0 = jpegInputStream0.nextBit();
      assertEquals(1, int0);
      assertTrue(jpegInputStream0.hasNext());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[1];
      JpegInputStream jpegInputStream0 = new JpegInputStream(intArray0);
      int int0 = jpegInputStream0.read();
      assertFalse(jpegInputStream0.hasNext());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 1799;
      JpegInputStream jpegInputStream0 = new JpegInputStream(intArray0);
      int int0 = jpegInputStream0.read();
      assertEquals(1799, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-2139);
      JpegInputStream jpegInputStream0 = new JpegInputStream(intArray0);
      int int0 = jpegInputStream0.read();
      assertFalse(jpegInputStream0.hasNext());
      assertEquals((-2139), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[1];
      JpegInputStream jpegInputStream0 = new JpegInputStream(intArray0);
      jpegInputStream0.nextBit();
      // Undeclared exception!
      try { 
        jpegInputStream0.read();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // This stream hasn't any other value, all values were already read.
         //
         verifyException("org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[3];
      JpegInputStream jpegInputStream0 = new JpegInputStream(intArray0);
      boolean boolean0 = jpegInputStream0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[1];
      JpegInputStream jpegInputStream0 = new JpegInputStream(intArray0);
      jpegInputStream0.nextBit();
      boolean boolean0 = jpegInputStream0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 255;
      intArray0[1] = 220;
      JpegInputStream jpegInputStream0 = new JpegInputStream(intArray0);
      try { 
        jpegInputStream0.nextBit();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // DNL not yet supported
         //
         verifyException("org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 255;
      intArray0[1] = 255;
      JpegInputStream jpegInputStream0 = new JpegInputStream(intArray0);
      try { 
        jpegInputStream0.nextBit();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid marker found in entropy data: 0xFF ff
         //
         verifyException("org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 255;
      intArray0[1] = (-355);
      JpegInputStream jpegInputStream0 = new JpegInputStream(intArray0);
      try { 
        jpegInputStream0.nextBit();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Premature End of File
         //
         verifyException("org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 255;
      JpegInputStream jpegInputStream0 = new JpegInputStream(intArray0);
      int int0 = jpegInputStream0.nextBit();
      assertFalse(jpegInputStream0.hasNext());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-1135);
      JpegInputStream jpegInputStream0 = new JpegInputStream(intArray0);
      try { 
        jpegInputStream0.nextBit();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Premature End of File
         //
         verifyException("org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[1];
      JpegInputStream jpegInputStream0 = new JpegInputStream(intArray0);
      assertTrue(jpegInputStream0.hasNext());
      
      jpegInputStream0.nextBit();
      int int0 = jpegInputStream0.nextBit();
      assertFalse(jpegInputStream0.hasNext());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[0];
      JpegInputStream jpegInputStream0 = new JpegInputStream(intArray0);
      // Undeclared exception!
      try { 
        jpegInputStream0.nextBit();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // This stream hasn't any other value, all values were already read.
         //
         verifyException("org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JpegInputStream jpegInputStream0 = null;
      try {
        jpegInputStream0 = new JpegInputStream((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream", e);
      }
  }
}
