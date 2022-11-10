/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:11:19 GMT 2022
 */

package org.apache.commons.imaging.formats.tiff.taginfos;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteOrder;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TagInfoSRational_ESTest extends TagInfoSRational_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD0;
      TagInfoSRational tagInfoSRational0 = new TagInfoSRational("org.apache.commons.io.filefilter.RegexFileFilter", 0, tiffDirectoryType0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      RationalNumber rationalNumber0 = new RationalNumber(1653, 1528);
      byte[] byteArray0 = tagInfoSRational0.encodeValue(byteOrder0, rationalNumber0);
      RationalNumber rationalNumber1 = tagInfoSRational0.getValue(byteOrder0, byteArray0);
      assertFalse(rationalNumber1.unsignedType);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD1;
      TagInfoSRational tagInfoSRational0 = new TagInfoSRational("", 724, tiffDirectoryType0);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      RationalNumber rationalNumber0 = new RationalNumber(0, 1);
      byte[] byteArray0 = tagInfoSRational0.encodeValue(byteOrder0, rationalNumber0);
      RationalNumber rationalNumber1 = tagInfoSRational0.getValue(byteOrder0, byteArray0);
      assertFalse(rationalNumber1.unsignedType);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD3;
      TagInfoSRational tagInfoSRational0 = new TagInfoSRational("7GB,o", 0, tiffDirectoryType0);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1));
      byte[] byteArray0 = tagInfoSRational0.encodeValue(byteOrder0, rationalNumber0);
      RationalNumber rationalNumber1 = tagInfoSRational0.getValue(byteOrder0, byteArray0);
      assertEquals((-1L), rationalNumber1.numerator);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD0;
      TagInfoSRational tagInfoSRational0 = new TagInfoSRational("Jon@a", (-435), tiffDirectoryType0);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      // Undeclared exception!
      try { 
        tagInfoSRational0.getValue(byteOrder0, (byte[]) null);
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
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD0;
      TagInfoSRational tagInfoSRational0 = new TagInfoSRational(">sjNdmvQUp", 2017, tiffDirectoryType0);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        tagInfoSRational0.getValue(byteOrder0, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.imaging.common.ByteConversions", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD3;
      TagInfoSRational tagInfoSRational0 = new TagInfoSRational("", 1904, tiffDirectoryType0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      // Undeclared exception!
      try { 
        tagInfoSRational0.encodeValue(byteOrder0, (RationalNumber) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.ByteConversions", e);
      }
  }
}
