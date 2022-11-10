/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:05:51 GMT 2022
 */

package org.apache.commons.imaging.formats.tiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.tiff.TiffImagingParameters;
import org.apache.commons.imaging.formats.tiff.TiffReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffReader_ESTest extends TiffReader_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(true);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)77;
      byteArray0[1] = (byte)77;
      byteArray0[2] = (byte)77;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("GPSInfo", byteArray0);
      FormatCompliance formatCompliance0 = new FormatCompliance("GPSInfo", true);
      try { 
        tiffReader0.readFirstDirectory(byteSourceArray0, true, formatCompliance0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Unknown Tiff Version: 19712
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(false);
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-126);
      ByteSourceArray byteSourceArray0 = new ByteSourceArray((String) null, byteArray0);
      FormatCompliance formatCompliance0 = new FormatCompliance((String) null);
      try { 
        tiffReader0.readDirectories(byteSourceArray0, false, formatCompliance0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Byte Order bytes don't match (0, -126).
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(true);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)108;
      byteArray0[1] = (byte)108;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      FormatCompliance formatCompliance0 = new FormatCompliance(",+STRHRQ&\"Z!?o,=EZ");
      try { 
        tiffReader0.readDirectories(byteSourceArray0, true, formatCompliance0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Invalid TIFF byte order 108
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(true);
      FormatCompliance formatCompliance0 = new FormatCompliance("offsetToFirstIFD");
      // Undeclared exception!
      try { 
        tiffReader0.readFirstDirectory((ByteSource) null, true, formatCompliance0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(true);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(dataInputStream0, "");
      // Undeclared exception!
      try { 
        tiffReader0.readFirstDirectory(byteSourceInputStream0, true, (FormatCompliance) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(false);
      byte[] byteArray0 = new byte[0];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      try { 
        tiffReader0.readFirstDirectory(byteSourceArray0, true, formatCompliance0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Not a Valid TIFF File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(true);
      MockFile mockFile0 = new MockFile("):KwsX|,5g*<$0kq[eG");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      FormatCompliance formatCompliance0 = new FormatCompliance("):KwsX|,5g*<$0kq[eG", true);
      try { 
        tiffReader0.readFirstDirectory(byteSourceFile0, false, formatCompliance0);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(true);
      FormatCompliance formatCompliance0 = new FormatCompliance("");
      // Undeclared exception!
      try { 
        tiffReader0.readDirectories((ByteSource) null, true, formatCompliance0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      TiffReader tiffReader0 = new TiffReader(true);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(dataInputStream0, "vvf$B9zxLJfk$f");
      // Undeclared exception!
      try { 
        tiffReader0.readDirectories(byteSourceInputStream0, false, formatCompliance0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(false);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-4), (byte)118);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(byteArrayInputStream0, "SerialNumber");
      FormatCompliance formatCompliance0 = new FormatCompliance("");
      // Undeclared exception!
      try { 
        tiffReader0.readDirectories(byteSourceInputStream0, false, formatCompliance0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(false);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(sequenceInputStream0, "up?)\u0001|nlV+BL");
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      try { 
        tiffReader0.readDirectories(byteSourceInputStream0, false, formatCompliance0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Not a Valid TIFF File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(true);
      MockFile mockFile0 = new MockFile("Tag");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      try { 
        tiffReader0.readDirectories(byteSourceFile0, true, formatCompliance0);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(true);
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      // Undeclared exception!
      try { 
        tiffReader0.readContents((ByteSource) null, tiffImagingParameters0, formatCompliance0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(true);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(bufferedInputStream0, "L6=j");
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      FormatCompliance formatCompliance0 = new FormatCompliance("Attempt to read byte range starting from ", true);
      // Undeclared exception!
      try { 
        tiffReader0.readContents(byteSourceInputStream0, tiffImagingParameters0, formatCompliance0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(false);
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1165), 683);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(byteArrayInputStream0, "dCkToGm!vn=Io|X|");
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      // Undeclared exception!
      try { 
        tiffReader0.readContents(byteSourceInputStream0, tiffImagingParameters0, formatCompliance0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(true);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0, 65280);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(bufferedInputStream0, "");
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      FormatCompliance formatCompliance0 = new FormatCompliance("UFn1>MgoqU", true);
      try { 
        tiffReader0.readContents(byteSourceInputStream0, tiffImagingParameters0, formatCompliance0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(false);
      byte[] byteArray0 = new byte[7];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      TiffReader.Listener tiffReader_Listener0 = mock(TiffReader.Listener.class, new ViolatedAssumptionAnswer());
      try { 
        tiffReader0.read(byteSourceArray0, (FormatCompliance) null, tiffReader_Listener0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Invalid TIFF byte order 0
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(false);
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      TiffReader.Listener tiffReader_Listener0 = mock(TiffReader.Listener.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tiffReader0.read((ByteSource) null, formatCompliance0, tiffReader_Listener0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(false);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0, 1589);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(pushbackInputStream0, "JeC");
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      TiffReader.Listener tiffReader_Listener0 = mock(TiffReader.Listener.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tiffReader0.read(byteSourceInputStream0, formatCompliance0, tiffReader_Listener0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(false);
      File file0 = MockFile.createTempFile("ApplicationNotes", "ApplicationNotes", (File) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(mockFileInputStream0, "ApplicationNotes");
      FormatCompliance formatCompliance0 = new FormatCompliance("ApplicationNotes");
      TiffReader.Listener tiffReader_Listener0 = mock(TiffReader.Listener.class, new ViolatedAssumptionAnswer());
      try { 
        tiffReader0.read(byteSourceInputStream0, formatCompliance0, tiffReader_Listener0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Not a Valid TIFF File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(false);
      MockFile mockFile0 = new MockFile(".[tH4>Ozot|v3is4=V");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      TiffReader.Listener tiffReader_Listener0 = mock(TiffReader.Listener.class, new ViolatedAssumptionAnswer());
      try { 
        tiffReader0.read(byteSourceFile0, formatCompliance0, tiffReader_Listener0);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(true);
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-83), 86);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(byteArrayInputStream0, "b66PieY:");
      FormatCompliance formatCompliance0 = new FormatCompliance("b66PieY:", true);
      TiffReader.Listener tiffReader_Listener0 = mock(TiffReader.Listener.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tiffReader0.read(byteSourceInputStream0, formatCompliance0, tiffReader_Listener0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(true);
      byte[] byteArray0 = new byte[11];
      byteArray0[0] = (byte) (-6);
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      FormatCompliance formatCompliance0 = FormatCompliance.getDefault();
      try { 
        tiffReader0.readContents(byteSourceArray0, tiffImagingParameters0, formatCompliance0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Byte Order bytes don't match (-6, 0).
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte)73;
      byteArray0[1] = (byte)73;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      TiffReader tiffReader0 = new TiffReader(true);
      try { 
        tiffReader0.readFirstDirectory(byteSourceArray0, true, (FormatCompliance) null);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Unknown Tiff Version: 0
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(false);
      MockFile mockFile0 = new MockFile("GrayResponseUnit");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      TiffImagingParameters tiffImagingParameters0 = new TiffImagingParameters();
      FormatCompliance formatCompliance0 = new FormatCompliance("(L3", true);
      try { 
        tiffReader0.readContents(byteSourceFile0, tiffImagingParameters0, formatCompliance0);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TiffReader tiffReader0 = new TiffReader(false);
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-59), (byte)70);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)24);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(pushbackInputStream0, "");
      FormatCompliance formatCompliance0 = new FormatCompliance("");
      // Undeclared exception!
      try { 
        tiffReader0.readFirstDirectory(byteSourceInputStream0, false, formatCompliance0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }
}
