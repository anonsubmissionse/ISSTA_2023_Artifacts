/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:11:41 GMT 2022
 */

package org.apache.commons.imaging.formats.tiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteOrder;
import java.util.LinkedList;
import org.apache.commons.imaging.formats.tiff.JpegImageData;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffElement;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffElement_ESTest extends TiffElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      JpegImageData jpegImageData0 = new JpegImageData(0L, 1623, byteArray0);
      jpegImageData0.getDataLength();
      assertEquals(1623, jpegImageData0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffHeader tiffHeader0 = new TiffHeader(byteOrder0, 0, 0);
      tiffHeader0.getElementDescription();
      assertEquals(8, tiffHeader0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<TiffField> linkedList0 = new LinkedList<TiffField>();
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffDirectory tiffDirectory0 = new TiffDirectory(0, linkedList0, 0, (-1797L), byteOrder0);
      tiffDirectory0.getElementDescription();
      assertEquals(6, tiffDirectory0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<TiffField> linkedList0 = new LinkedList<TiffField>();
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffDirectory tiffDirectory0 = new TiffDirectory(40962, linkedList0, 254L, 40962, byteOrder0);
      linkedList0.add((TiffField) null);
      // Undeclared exception!
      try { 
        tiffDirectory0.getElementDescription();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffDirectory", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      JpegImageData jpegImageData0 = new JpegImageData(26, 26, byteArray0);
      jpegImageData0.getData();
      assertEquals(26, jpegImageData0.length);
      assertEquals(26L, jpegImageData0.offset);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TiffElement.Stub tiffElement_Stub0 = new TiffElement.Stub(1L, 762);
      String string0 = tiffElement_Stub0.getElementDescription();
      assertEquals("Element, offset: 1, length: 762, last: 763", string0);
  }
}
