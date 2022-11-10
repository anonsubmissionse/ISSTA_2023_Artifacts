/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:50:14 GMT 2022
 */

package org.apache.commons.imaging.formats.psd.datareaders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.nio.ByteOrder;
import java.util.Enumeration;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.formats.psd.PsdHeaderInfo;
import org.apache.commons.imaging.formats.psd.PsdImageContents;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParser;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserCmyk;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserGrayscale;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserLab;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserRgb;
import org.apache.commons.imaging.formats.psd.datareaders.UncompressedDataReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UncompressedDataReader_ESTest extends UncompressedDataReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataParserLab dataParserLab0 = new DataParserLab();
      UncompressedDataReader uncompressedDataReader0 = new UncompressedDataReader(dataParserLab0);
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)111, (-1));
      PsdHeaderInfo psdHeaderInfo0 = new PsdHeaderInfo((byte) (-24), byteArray0, 1542, 95, (byte)99, 4, 1008);
      PsdImageContents psdImageContents0 = new PsdImageContents(psdHeaderInfo0, 95, (byte)99, 0, (byte) (-24));
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      BinaryFileParser binaryFileParser0 = new BinaryFileParser(byteOrder0);
      // Undeclared exception!
      uncompressedDataReader0.readData(byteArrayInputStream0, (BufferedImage) null, psdImageContents0, binaryFileParser0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UncompressedDataReader uncompressedDataReader0 = new UncompressedDataReader((DataParser) null);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      BinaryFileParser binaryFileParser0 = new BinaryFileParser();
      // Undeclared exception!
      try { 
        uncompressedDataReader0.readData(sequenceInputStream0, bufferedImage0, (PsdImageContents) null, binaryFileParser0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DataParserCmyk dataParserCmyk0 = new DataParserCmyk();
      UncompressedDataReader uncompressedDataReader0 = new UncompressedDataReader(dataParserCmyk0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null, 8);
      byte[] byteArray0 = new byte[2];
      PsdHeaderInfo psdHeaderInfo0 = new PsdHeaderInfo(8, byteArray0, (-575), (byte)0, (byte) (-1), 8, 2878);
      PsdImageContents psdImageContents0 = new PsdImageContents(psdHeaderInfo0, (byte)0, (-2902), (-468), (byte)0);
      // Undeclared exception!
      try { 
        uncompressedDataReader0.readData(bufferedInputStream0, (BufferedImage) null, psdImageContents0, (BinaryFileParser) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.psd.datareaders.UncompressedDataReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DataParserRgb dataParserRgb0 = new DataParserRgb();
      UncompressedDataReader uncompressedDataReader0 = new UncompressedDataReader(dataParserRgb0);
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 10);
      BufferedImage bufferedImage0 = new BufferedImage(62, 1, 1);
      byte[] byteArray0 = new byte[5];
      PsdHeaderInfo psdHeaderInfo0 = new PsdHeaderInfo(10, byteArray0, 84, 62, 10, (byte)8, 159);
      PsdImageContents psdImageContents0 = new PsdImageContents(psdHeaderInfo0, (-2475), (byte) (-107), 255, (-1659));
      BinaryFileParser binaryFileParser0 = new BinaryFileParser();
      // Undeclared exception!
      try { 
        uncompressedDataReader0.readData(pushbackInputStream0, bufferedImage0, psdImageContents0, binaryFileParser0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DataParserLab dataParserLab0 = new DataParserLab();
      UncompressedDataReader uncompressedDataReader0 = new UncompressedDataReader(dataParserLab0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      byte[] byteArray0 = new byte[4];
      PsdHeaderInfo psdHeaderInfo0 = new PsdHeaderInfo((-359), byteArray0, 1, 248, (byte)1, 247, (byte)1);
      PsdImageContents psdImageContents0 = new PsdImageContents(psdHeaderInfo0, 1, 247, (byte)65, 242);
      BinaryFileParser binaryFileParser0 = new BinaryFileParser();
      try { 
        uncompressedDataReader0.readData(pipedInputStream0, (BufferedImage) null, psdImageContents0, binaryFileParser0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DataParserRgb dataParserRgb0 = new DataParserRgb();
      UncompressedDataReader uncompressedDataReader0 = new UncompressedDataReader(dataParserRgb0);
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 1);
      BufferedImage bufferedImage0 = new BufferedImage(62, 1, 1);
      byte[] byteArray0 = new byte[5];
      PsdHeaderInfo psdHeaderInfo0 = new PsdHeaderInfo(1, byteArray0, 84, 62, 1, (byte)8, 159);
      PsdImageContents psdImageContents0 = new PsdImageContents(psdHeaderInfo0, (-2475), (byte) (-107), 255, (-1659));
      BinaryFileParser binaryFileParser0 = new BinaryFileParser();
      uncompressedDataReader0.readData(pushbackInputStream0, bufferedImage0, psdImageContents0, binaryFileParser0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DataParserGrayscale dataParserGrayscale0 = new DataParserGrayscale();
      UncompressedDataReader uncompressedDataReader0 = new UncompressedDataReader(dataParserGrayscale0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 3269);
      byte[] byteArray0 = new byte[8];
      PsdHeaderInfo psdHeaderInfo0 = new PsdHeaderInfo((-104), byteArray0, (-304), (byte)7, 255, (-2680), 1);
      PsdImageContents psdImageContents0 = new PsdImageContents(psdHeaderInfo0, (byte) (-26), 3269, (-304), 2040);
      BinaryFileParser binaryFileParser0 = new BinaryFileParser();
      // Undeclared exception!
      try { 
        uncompressedDataReader0.readData(pipedInputStream0, (BufferedImage) null, psdImageContents0, binaryFileParser0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.psd.dataparsers.DataParser", e);
      }
  }
}
