/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:07:17 GMT 2022
 */

package org.apache.commons.imaging.formats.tiff.taginfos;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteOrder;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TagInfoSShorts_ESTest extends TagInfoSShorts_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD;
      TagInfoSShorts tagInfoSShorts0 = new TagInfoSShorts("$d8Cqdec'@;Z<ai{%2)", (-1823), 940, tiffDirectoryType0);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[2];
      short[] shortArray0 = tagInfoSShorts0.getValue(byteOrder0, byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_GPS;
      TagInfoSShorts tagInfoSShorts0 = new TagInfoSShorts("^}", 0, 0, tiffDirectoryType0);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      short[] shortArray0 = new short[1];
      byte[] byteArray0 = tagInfoSShorts0.encodeValue(byteOrder0, shortArray0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
      TagInfoSShorts tagInfoSShorts0 = new TagInfoSShorts("WVIiuP^S@\"0#Qa`G8", 5437, 0, tiffDirectoryType0);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      short[] shortArray0 = new short[0];
      byte[] byteArray0 = tagInfoSShorts0.encodeValue(byteOrder0, shortArray0);
      short[] shortArray1 = tagInfoSShorts0.getValue(byteOrder0, byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
      TagInfoSShorts tagInfoSShorts0 = new TagInfoSShorts("", 9, (-1757), tiffDirectoryType0);
      // Undeclared exception!
      try { 
        tagInfoSShorts0.getValue((ByteOrder) null, (byte[]) null);
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
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
      TagInfoSShorts tagInfoSShorts0 = new TagInfoSShorts("", 544, (-2), tiffDirectoryType0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      // Undeclared exception!
      try { 
        tagInfoSShorts0.encodeValue(byteOrder0, (short[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.ByteConversions", e);
      }
  }
}
