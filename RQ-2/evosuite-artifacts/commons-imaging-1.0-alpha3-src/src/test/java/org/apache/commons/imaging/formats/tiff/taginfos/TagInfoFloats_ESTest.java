/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:06:48 GMT 2022
 */

package org.apache.commons.imaging.formats.tiff.taginfos;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TagInfoFloats_ESTest extends TagInfoFloats_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD2;
      TagInfoFloats tagInfoFloats0 = new TagInfoFloats("&KBX}\"a4{", 0, 0, tiffDirectoryType0);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      float[] floatArray0 = new float[1];
      byte[] byteArray0 = tagInfoFloats0.encodeValue(byteOrder0, floatArray0);
      float[] floatArray1 = tagInfoFloats0.getValue(byteOrder0, byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD0;
      TagInfoFloats tagInfoFloats0 = new TagInfoFloats((String) null, 0, 0, tiffDirectoryType0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      ByteOrder byteOrder0 = charBuffer0.order();
      float[] floatArray0 = new float[0];
      byte[] byteArray0 = tagInfoFloats0.encodeValue(byteOrder0, floatArray0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD;
      TagInfoFloats tagInfoFloats0 = new TagInfoFloats("", 5718, 5718, tiffDirectoryType0);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      // Undeclared exception!
      try { 
        tagInfoFloats0.getValue(byteOrder0, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.ByteConversions", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD3;
      TagInfoFloats tagInfoFloats0 = new TagInfoFloats("8#/^Z", 1, 4443, tiffDirectoryType0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      // Undeclared exception!
      try { 
        tagInfoFloats0.encodeValue(byteOrder0, (float[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.ByteConversions", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD3;
      TagInfoFloats tagInfoFloats0 = new TagInfoFloats("8#/^Z", 1, 4443, tiffDirectoryType0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[2];
      float[] floatArray0 = tagInfoFloats0.getValue(byteOrder0, byteArray0);
      ;
}
}
