/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:47:50 GMT 2022
 */

package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import javax.swing.DebugGraphics;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.formats.bmp.BmpWriterPalette;
import org.apache.commons.imaging.palette.SimplePalette;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BmpWriterPalette_ESTest extends BmpWriterPalette_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = 1302;
      intArray0[1] = 16;
      intArray0[2] = 552;
      intArray0[3] = (-1);
      intArray0[4] = (-1401);
      intArray0[5] = 36;
      intArray0[6] = 3;
      SimplePalette simplePalette0 = new SimplePalette(intArray0);
      BmpWriterPalette bmpWriterPalette0 = new BmpWriterPalette(simplePalette0);
      BufferedImage bufferedImage0 = new BufferedImage(16, 552, 3);
      // Undeclared exception!
      bmpWriterPalette0.getImageData(bufferedImage0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[1] = (-3379);
      SimplePalette simplePalette0 = new SimplePalette(intArray0);
      BmpWriterPalette bmpWriterPalette0 = new BmpWriterPalette(simplePalette0);
      PrintStream printStream0 = DebugGraphics.logStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(printStream0);
      bmpWriterPalette0.writePalette(binaryOutputStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 360;
      SimplePalette simplePalette0 = new SimplePalette(intArray0);
      BmpWriterPalette bmpWriterPalette0 = new BmpWriterPalette(simplePalette0);
      // Undeclared exception!
      try { 
        bmpWriterPalette0.writePalette((BinaryOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpWriterPalette", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[0];
      SimplePalette simplePalette0 = new SimplePalette(intArray0);
      BmpWriterPalette bmpWriterPalette0 = new BmpWriterPalette(simplePalette0);
      bmpWriterPalette0.getPaletteSize();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[9];
      SimplePalette simplePalette0 = new SimplePalette(intArray0);
      BmpWriterPalette bmpWriterPalette0 = new BmpWriterPalette(simplePalette0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0);
      try { 
        bmpWriterPalette0.writePalette(binaryOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = 1302;
      SimplePalette simplePalette0 = new SimplePalette(intArray0);
      BmpWriterPalette bmpWriterPalette0 = new BmpWriterPalette(simplePalette0);
      BufferedImage bufferedImage0 = new BufferedImage(16, 552, 3);
      // Undeclared exception!
      bmpWriterPalette0.getImageData(bufferedImage0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[3];
      SimplePalette simplePalette0 = new SimplePalette(intArray0);
      BmpWriterPalette bmpWriterPalette0 = new BmpWriterPalette(simplePalette0);
      // Undeclared exception!
      try { 
        bmpWriterPalette0.getImageData((BufferedImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpWriterPalette", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BmpWriterPalette bmpWriterPalette0 = null;
      try {
        bmpWriterPalette0 = new BmpWriterPalette((SimplePalette) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpWriterPalette", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[0];
      SimplePalette simplePalette0 = new SimplePalette(intArray0);
      BmpWriterPalette bmpWriterPalette0 = new BmpWriterPalette(simplePalette0);
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      byte[] byteArray0 = bmpWriterPalette0.getImageData(bufferedImage0);
      assertArrayEquals(new byte[] {(byte) (-128), (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[29];
      SimplePalette simplePalette0 = new SimplePalette(intArray0);
      BmpWriterPalette bmpWriterPalette0 = new BmpWriterPalette(simplePalette0);
      BufferedImage bufferedImage0 = new BufferedImage(28, 27, 1);
      byte[] byteArray0 = bmpWriterPalette0.getImageData(bufferedImage0);
      assertEquals(756, byteArray0.length);
      assertEquals(8, bmpWriterPalette0.getBitsPerPixel());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[8];
      SimplePalette simplePalette0 = new SimplePalette(intArray0);
      BmpWriterPalette bmpWriterPalette0 = new BmpWriterPalette(simplePalette0);
      bmpWriterPalette0.getPaletteSize();
      assertEquals(4, bmpWriterPalette0.getBitsPerPixel());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[0];
      SimplePalette simplePalette0 = new SimplePalette(intArray0);
      BmpWriterPalette bmpWriterPalette0 = new BmpWriterPalette(simplePalette0);
      int int0 = bmpWriterPalette0.getBitsPerPixel();
      assertEquals(1, int0);
  }
}
