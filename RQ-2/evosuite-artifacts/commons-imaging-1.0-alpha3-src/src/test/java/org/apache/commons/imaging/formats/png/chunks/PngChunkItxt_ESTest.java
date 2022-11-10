/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:44:55 GMT 2022
 */

package org.apache.commons.imaging.formats.png.chunks;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.util.zip.ZipException;
import org.apache.commons.imaging.formats.png.chunks.PngChunkItxt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PngChunkItxt_ESTest extends PngChunkItxt_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      PngChunkItxt pngChunkItxt0 = new PngChunkItxt((-1), 4115, 2843, byteArray0);
      String string0 = pngChunkItxt0.getText();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      byteArray0[0] = (byte) (-101);
      PngChunkItxt pngChunkItxt0 = new PngChunkItxt(0, 0, 310, byteArray0);
      String string0 = pngChunkItxt0.getKeyword();
      assertNotNull(pngChunkItxt0.getText());
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      byteArray0[0] = (byte) (-101);
      PngChunkItxt pngChunkItxt0 = new PngChunkItxt(0, 0, 310, byteArray0);
      String string0 = pngChunkItxt0.getKeyword();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      byteArray0[0] = (byte) (-21);
      byteArray0[1] = (byte)9;
      byteArray0[2] = (byte) (-21);
      byteArray0[3] = (byte)102;
      byteArray0[4] = (byte) (-49);
      byteArray0[6] = (byte)1;
      PngChunkItxt pngChunkItxt0 = null;
      try {
        pngChunkItxt0 = new PngChunkItxt(793, 793, 793, byteArray0);
        fail("Expecting exception: ZipException");
      } catch(Throwable e) {
         //
         // unknown compression method
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PngChunkItxt pngChunkItxt0 = null;
      try {
        pngChunkItxt0 = new PngChunkItxt(222, 0, (-2930), (byte[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.png.chunks.PngChunk", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-81);
      PngChunkItxt pngChunkItxt0 = null;
      try {
        pngChunkItxt0 = new PngChunkItxt((-1), (-1), (-1), byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.imaging.formats.png.chunks.PngChunkItxt", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      PngChunkItxt pngChunkItxt0 = null;
      try {
        pngChunkItxt0 = new PngChunkItxt((byte)0, (byte)0, (byte)0, byteArray0);
        fail("Expecting exception: Exception");
      } catch(Throwable e) {
         //
         // PNG iTXt chunk translated keyword is not terminated.
         //
         verifyException("org.apache.commons.imaging.formats.png.chunks.PngChunkItxt", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      PngChunkItxt pngChunkItxt0 = null;
      try {
        pngChunkItxt0 = new PngChunkItxt((byte)0, (byte)0, (byte)0, byteArray0);
        fail("Expecting exception: Exception");
      } catch(Throwable e) {
         //
         // PNG iTXt chunk language tag is not terminated.
         //
         verifyException("org.apache.commons.imaging.formats.png.chunks.PngChunkItxt", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)97;
      byteArray0[1] = (byte)97;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)97;
      PngChunkItxt pngChunkItxt0 = null;
      try {
        pngChunkItxt0 = new PngChunkItxt((byte)1, (byte)97, (byte)1, byteArray0);
        fail("Expecting exception: Exception");
      } catch(Throwable e) {
         //
         // PNG iTXt chunk has unexpected compression method: 97
         //
         verifyException("org.apache.commons.imaging.formats.png.chunks.PngChunkItxt", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)1;
      PngChunkItxt pngChunkItxt0 = null;
      try {
        pngChunkItxt0 = new PngChunkItxt((byte)1, (byte)1, (byte)1, byteArray0);
        fail("Expecting exception: EOFException");
      } catch(Throwable e) {
         //
         // Unexpected end of ZLIB input stream
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      byteArray0[1] = (byte)71;
      PngChunkItxt pngChunkItxt0 = null;
      try {
        pngChunkItxt0 = new PngChunkItxt((byte)71, (byte)71, (byte)71, byteArray0);
        fail("Expecting exception: Exception");
      } catch(Throwable e) {
         //
         // PNG iTXt chunk has invalid compression flag: 71
         //
         verifyException("org.apache.commons.imaging.formats.png.chunks.PngChunkItxt", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      PngChunkItxt pngChunkItxt0 = null;
      try {
        pngChunkItxt0 = new PngChunkItxt(49, 49, 49, byteArray0);
        fail("Expecting exception: Exception");
      } catch(Throwable e) {
         //
         // PNG iTXt chunk keyword is not terminated.
         //
         verifyException("org.apache.commons.imaging.formats.png.chunks.PngChunkItxt", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      PngChunkItxt pngChunkItxt0 = new PngChunkItxt((-1254), (-1254), (-1254), byteArray0);
      String string0 = pngChunkItxt0.getKeyword();
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      PngChunkItxt pngChunkItxt0 = new PngChunkItxt((-1254), (-1254), (-1254), byteArray0);
      String string0 = pngChunkItxt0.getKeyword();
      assertNotNull(pngChunkItxt0.getText());
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      PngChunkItxt pngChunkItxt0 = new PngChunkItxt((-1254), (-1254), (-1254), byteArray0);
      String string0 = pngChunkItxt0.getText();
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      PngChunkItxt pngChunkItxt0 = new PngChunkItxt((-1254), (-1254), (-1254), byteArray0);
      pngChunkItxt0.getContents();
      assertNotNull(pngChunkItxt0.getText());
}
}
