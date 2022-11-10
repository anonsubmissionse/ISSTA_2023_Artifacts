/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:33:03 GMT 2022
 */

package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.bmp.BmpHeaderInfo;
import org.apache.commons.imaging.formats.bmp.PixelParserRle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PixelParserRle_ESTest extends PixelParserRle_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte)0, (byte)0, 15, 1180, 51, (byte)0, 51, 15, (byte)0, 4, 359, 0, 65280, 4, 4, 2387, 0, 510, 0, 1180, 51, bmpHeaderInfo_ColorSpace0, (-443), 545, 51, 4, 0, 1180, 545);
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)122;
      PixelParserRle pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, byteArray0, byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder(8, 772, false);
      try { 
        pixelParserRle0.processImage(imageBuilder0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // BMP: Bad RLE
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte)2, (byte)2, 3467, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, 8, (byte)2, (byte)2, (byte)2, (-314), (byte)2, 132, (-16), 8, (-16), (-341), (byte)2, bmpHeaderInfo_ColorSpace0, (byte)2, (byte)2, 8, (byte)2, 3467, (-314), (-1280));
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)2;
      byteArray0[4] = (byte)2;
      PixelParserRle pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, byteArray0, byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder(2, 3467, false);
      try { 
        pixelParserRle0.processImage(imageBuilder0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // BMP: Bad RLE
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte)30, (byte)30, 15, 1180, 51, (byte)30, 51, 15, (byte)30, 4, 359, 0, 65280, 1, 4, 2387, 0, 510, 0, 2240, 51, bmpHeaderInfo_ColorSpace0, (-443), 545, 51, 4, 0, 1180, 545);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)30;
      byteArray0[1] = (byte)30;
      PixelParserRle pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, byteArray0, byteArray0);
      // Undeclared exception!
      try { 
        pixelParserRle0.processImage((ImageBuilder) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 56
         //
         verifyException("org.apache.commons.imaging.formats.bmp.PixelParser", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte) (-68), (byte) (-68), (byte) (-68), (byte) (-68), (byte) (-68), (-3225), 0, (byte) (-68), 0, (-129), 0, 0, 0, (-129), 0, 0, 0, 0, (-749), (byte) (-68), 0, bmpHeaderInfo_ColorSpace0, 0, 0, 1760, 0, 8, 1587, (-2574));
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-68);
      PixelParserRle pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, byteArray0, byteArray0);
      try { 
        pixelParserRle0.processImage((ImageBuilder) null);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // BMP RLE: bad BitsPerPixel: -129
         //
         verifyException("org.apache.commons.imaging.formats.bmp.PixelParserRle", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte)3, (byte) (-1), (byte) (-1), 0, (-1295), 658, (byte)3, (-1665), 32, 32, (byte) (-1), 0, 1, 0, 32, (-1295), (-4598), 0, 0, 0, 0, bmpHeaderInfo_ColorSpace0, (byte) (-1), 0, 2118, (-4598), 0, 32, 649);
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-1);
      PixelParserRle pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, byteArray0, byteArray0);
      try { 
        pixelParserRle0.processImage((ImageBuilder) null);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // BMP RLE: bad BitsPerPixel: 32
         //
         verifyException("org.apache.commons.imaging.formats.bmp.PixelParserRle", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)70;
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte)70, (byte)70, (byte)70, (byte)70, 4, 4, (byte)70, (byte)70, (byte)70, 4, (byte)70, (byte)70, (byte)70, 4, (byte)0, (byte)70, 4, (byte)70, (byte)70, (byte)70, 4, bmpHeaderInfo_ColorSpace0, (byte)70, (byte)70, (byte)70, 4, (byte)70, (byte)70, 4);
      PixelParserRle pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, byteArray0, byteArray0);
      // Undeclared exception!
      try { 
        pixelParserRle0.processImage((ImageBuilder) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.PixelParserRle", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte)31, (byte)67, 3102, (byte)67, 0, 2, 3102, 2, 2, 2, (-740), 2, (-2568), 36, 3102, 15, 2, 0, 2313, 186, (byte)31, bmpHeaderInfo_ColorSpace0, 65280, 2436, (-740), 0, (-1995), (-1625), 2436);
      PixelParserRle pixelParserRle0 = null;
      try {
        pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, (byte[]) null, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte)2, (byte)2, 3467, (byte)2, (byte)2, (-2195), 1000, (-2236), (byte)2, 8, 1000, 0, (-2236), (-314), 143, 132, 15, 8, 15, (-341), (-2195), bmpHeaderInfo_ColorSpace0, (byte)2, (-1295), 8, (-1295), 120, (-314), (-1280));
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)2;
      PixelParserRle pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, byteArray0, byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder(4, 152, false);
      try { 
        pixelParserRle0.processImage(imageBuilder0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // BMP: Bad RLE
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, bmpHeaderInfo_ColorSpace0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1);
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)1;
      PixelParserRle pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, byteArray0, byteArray0);
      pixelParserRle0.processImage((ImageBuilder) null);
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, bmpHeaderInfo_ColorSpace0, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4);
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)4;
      PixelParserRle pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, byteArray0, byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder(4, (byte)4, false);
      try { 
        pixelParserRle0.processImage(imageBuilder0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // BMP: Bad RLE
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte)3, (byte) (-1), (byte) (-1), 0, (-1295), 658, (byte)3, (-1665), 32, 32, (byte) (-1), 0, 1, 0, 32, (-1295), (-4598), 0, 0, 0, 0, bmpHeaderInfo_ColorSpace0, (byte) (-1), 0, 2118, (-4598), 0, 32, 649);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)3;
      PixelParserRle pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, byteArray0, byteArray0);
      try { 
        pixelParserRle0.processImage((ImageBuilder) null);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // BMP RLE: bad BitsPerPixel: 32
         //
         verifyException("org.apache.commons.imaging.formats.bmp.PixelParserRle", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte)2, (byte)2, 3467, (byte)2, (byte)2, (-2195), 1000, (-2236), (byte)2, 8, 1000, 0, (-2236), (-314), 143, 132, 15, 8, 15, (-341), (-2195), bmpHeaderInfo_ColorSpace0, (byte)2, (-1295), 8, (-1295), 120, (-314), (-1280));
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte)2;
      PixelParserRle pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, byteArray0, byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder(4, 152, false);
      try { 
        pixelParserRle0.processImage(imageBuilder0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // BMP: Bad RLE
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), bmpHeaderInfo_ColorSpace0, (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23), (byte) (-23));
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-23);
      PixelParserRle pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, byteArray0, byteArray0);
      try { 
        pixelParserRle0.processImage((ImageBuilder) null);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // BMP RLE: bad BitsPerPixel: -23
         //
         verifyException("org.apache.commons.imaging.formats.bmp.PixelParserRle", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte) (-15), (byte) (-15), (byte) (-15), (byte) (-15), (byte) (-15), (byte) (-15), (byte) (-15), (byte) (-15), (byte) (-15), 8, (byte) (-15), (byte) (-15), (byte) (-15), (byte) (-15), (byte) (-15), 8, (byte) (-15), (byte) (-15), (byte) (-15), (byte) (-15), (byte) (-15), bmpHeaderInfo_ColorSpace0, (byte) (-15), (byte) (-15), (byte) (-15), (byte) (-15), (byte) (-15), 8, (byte) (-15));
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-15);
      PixelParserRle pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, byteArray0, byteArray0);
      try { 
        pixelParserRle0.processImage((ImageBuilder) null);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // RLE: Absolute Mode count: -1 read: 7 length: 242
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte) (-13), (byte)3, (byte)3, (byte) (-13), (byte)3, (byte) (-13), (byte) (-13), (byte) (-13), (byte) (-13), 4, 4, (byte)3, (byte) (-13), (byte) (-13), (byte)3, (byte)3, 4, 4, (byte) (-13), (byte)3, (byte) (-13), bmpHeaderInfo_ColorSpace0, (byte) (-13), (byte)3, (byte) (-13), (byte)3, (byte) (-13), (byte) (-13), (byte) (-13));
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)3;
      PixelParserRle pixelParserRle0 = new PixelParserRle(bmpHeaderInfo0, byteArray0, byteArray0);
      try { 
        pixelParserRle0.processImage((ImageBuilder) null);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // BMP: Bad RLE
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }
}
