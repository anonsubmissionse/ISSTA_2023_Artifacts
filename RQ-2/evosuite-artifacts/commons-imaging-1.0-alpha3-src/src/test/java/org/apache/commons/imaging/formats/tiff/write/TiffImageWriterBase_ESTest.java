/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 22:44:39 GMT 2022
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.nio.ByteOrder;
import java.util.Hashtable;
import java.util.Locale;
import javax.swing.JLayeredPane;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.RgbBufferedImageFactory;
import org.apache.commons.imaging.formats.tiff.TiffImagingParameters;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputField;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffImageWriterBase_ESTest extends TiffImageWriterBase_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("<Fcz|AJ`up[[Rm|b", true);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0);
      RgbBufferedImageFactory rgbBufferedImageFactory0 = new RgbBufferedImageFactory();
      BufferedImage bufferedImage0 = rgbBufferedImageFactory0.getColorBufferedImage(3, 3, false);
      Hashtable<RenderingHints.Key, Locale> hashtable0 = new Hashtable<RenderingHints.Key, Locale>();
      RenderingHints renderingHints0 = new RenderingHints(hashtable0);
      RescaleOp rescaleOp0 = new RescaleOp(0L, 1.8758F, renderingHints0);
      BufferedImage bufferedImage1 = rescaleOp0.filter(bufferedImage0, bufferedImage0);
      tiffImageWriterLossy0.writeImage(bufferedImage1, binaryOutputStream0, tiffImagingParameters0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0, byteOrder0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, (-2875L));
      assertNotNull(byteArrayOutputStream0.toString());
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy((ByteOrder) null);
      MockFile mockFile0 = new MockFile("$D", "$D");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
      assertEquals(1, binaryOutputStream0.getByteCount());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockPrintStream mockPrintStream0 = new MockPrintStream("!p&8 ");
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet((ByteOrder) null);
      tiffOutputSet0.setGPSInDegrees(46.1791809, 46.1791809);
      tiffImageWriterLossy0.write(mockPrintStream0, tiffOutputSet0);
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(0);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImageFileHeader((BinaryOutputStream) null, (-2864L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0, byteOrder0);
      try { 
        tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, (byte)33);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImageFileHeader((BinaryOutputStream) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, byteArrayOutputStream0, tiffImagingParameters0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("<Fcz|AJ`up[[Rm|b", true);
      RgbBufferedImageFactory rgbBufferedImageFactory0 = new RgbBufferedImageFactory();
      FileSystemHandling.shouldAllThrowIOExceptions();
      BufferedImage bufferedImage0 = rgbBufferedImageFactory0.getColorBufferedImage(3, 3, false);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, tiffImagingParameters0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      try { 
        tiffImageWriterLossy0.write(filterOutputStream0, tiffOutputSet0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // No directories.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFile mockFile0 = new MockFile(" ");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.write(binaryOutputStream0, (TiffOutputSet) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.validateDirectories((TiffOutputSet) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("<Fcz|,J`up[[Rm|", false);
      RgbBufferedImageFactory rgbBufferedImageFactory0 = new RgbBufferedImageFactory();
      BufferedImage bufferedImage0 = rgbBufferedImageFactory0.getColorBufferedImage(3, 34853, false);
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, tiffImagingParameters0);
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("<Fcz|AJ`up[Rm|b", true);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0);
      tiffImagingParameters0.setXmpXml("<Fcz|AJ`up[Rm|b");
      RgbBufferedImageFactory rgbBufferedImageFactory0 = new RgbBufferedImageFactory();
      BufferedImage bufferedImage0 = rgbBufferedImageFactory0.getColorBufferedImage(3, 3, false);
      tiffImageWriterLossy0.writeImage(bufferedImage0, binaryOutputStream0, tiffImagingParameters0);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("<Fcz|,J`up[[Rm|", true);
      RgbBufferedImageFactory rgbBufferedImageFactory0 = new RgbBufferedImageFactory();
      PixelDensity pixelDensity0 = PixelDensity.createFromPixelsPerCentimetre(1, 1);
      tiffImagingParameters0.setPixelDensity(pixelDensity0);
      BufferedImage bufferedImage0 = rgbBufferedImageFactory0.getColorBufferedImage(1, 1, false);
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, tiffImagingParameters0);
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("<Fcz|,J`up[[Rm|", true);
      RgbBufferedImageFactory rgbBufferedImageFactory0 = new RgbBufferedImageFactory();
      BufferedImage bufferedImage0 = rgbBufferedImageFactory0.getColorBufferedImage(3, 3, false);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      tiffImagingParameters0.setCompression(integer0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, tiffImagingParameters0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Invalid compression parameter (Only CCITT 1D/Group 3/Group 4, LZW, Packbits, Zlib Deflate and uncompressed supported).
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("<Fcz|,J`up[[Rm|", true);
      RgbBufferedImageFactory rgbBufferedImageFactory0 = new RgbBufferedImageFactory();
      BufferedImage bufferedImage0 = rgbBufferedImageFactory0.getColorBufferedImage(1, 1, false);
      Integer integer0 = new Integer(1);
      tiffImagingParameters0.setCompression(integer0);
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, tiffImagingParameters0);
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("'Y9g&=AVz7I", true);
      RgbBufferedImageFactory rgbBufferedImageFactory0 = new RgbBufferedImageFactory();
      BufferedImage bufferedImage0 = rgbBufferedImageFactory0.getColorBufferedImage(2, 2, false);
      Integer integer0 = new Integer(2);
      tiffImagingParameters0.setCompression(integer0);
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, tiffImagingParameters0);
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("<cz|,J`u[[R|");
      RgbBufferedImageFactory rgbBufferedImageFactory0 = new RgbBufferedImageFactory();
      Integer integer0 = new Integer((byte)89);
      tiffImagingParameters0.setLzwCompressionBlockSize(integer0);
      BufferedImage bufferedImage0 = rgbBufferedImageFactory0.getColorBufferedImage(3, 3, false);
      tiffImagingParameters0.setCompression(integer0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, tiffImagingParameters0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Block size parameter 89 is less than 8000 minimum
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("<Fcz|,J`up[[Rm|", true);
      RgbBufferedImageFactory rgbBufferedImageFactory0 = new RgbBufferedImageFactory();
      BufferedImage bufferedImage0 = rgbBufferedImageFactory0.getColorBufferedImage(3, 3, false);
      Integer integer0 = new Integer(3);
      tiffImagingParameters0.setCompression(integer0);
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, tiffImagingParameters0);
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("<Fcz|,J`up[[Rm|", false);
      RgbBufferedImageFactory rgbBufferedImageFactory0 = new RgbBufferedImageFactory();
      PixelDensity pixelDensity0 = PixelDensity.createUnitless(34853, 34853);
      tiffImagingParameters0.setPixelDensity(pixelDensity0);
      BufferedImage bufferedImage0 = rgbBufferedImageFactory0.getColorBufferedImage(3, 3, false);
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, tiffImagingParameters0);
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory(2, tiffOutputSet0.byteOrder);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      try { 
        tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Missing directory: 0.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addExifDirectory();
      try { 
        tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Missing root directory.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("<Fcz|AJ`up[Rm|b", true);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0);
      RgbBufferedImageFactory rgbBufferedImageFactory0 = new RgbBufferedImageFactory();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.getOrCreateGPSDirectory();
      tiffImagingParameters0.setOutputSet(tiffOutputSet0);
      BufferedImage bufferedImage0 = rgbBufferedImageFactory0.getColorBufferedImage(3, 3, false);
      tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      tiffImageWriterLossy0.writeImage(bufferedImage0, binaryOutputStream0, tiffImagingParameters0);
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory(2, tiffOutputSet0.byteOrder);
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD0;
      TagInfoFloat tagInfoFloat0 = new TagInfoFloat("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", (-2495), tiffDirectoryType0);
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      byte[] byteArray0 = new byte[5];
      TiffOutputField tiffOutputField0 = new TiffOutputField(2, tagInfoFloat0, fieldTypeLong0, 37385, byteArray0);
      tiffOutputDirectory0.add(tiffOutputField0);
      TagInfoDoubles tagInfoDoubles0 = new TagInfoDoubles("0a:%E,t !{k4=P+>[_", 2, (-2255), tagInfoFloat0.directoryType);
      double[] doubleArray0 = new double[1];
      tiffOutputDirectory0.add(tagInfoDoubles0, doubleArray0);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      try { 
        tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Tag (2 (0x2: 0a:%E,t !{k4=P+>[_): ) appears twice in directory.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory((-473), tiffOutputSet0.byteOrder);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      try { 
        tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Unknown directory: -473
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.getOrCreateGPSDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      ;
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(34853);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0);
      try { 
        tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
}
