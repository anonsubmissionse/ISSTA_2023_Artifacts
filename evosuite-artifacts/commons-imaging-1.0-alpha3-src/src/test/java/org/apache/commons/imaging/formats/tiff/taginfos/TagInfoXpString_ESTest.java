/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:56:36 GMT 2022
 */

package org.apache.commons.imaging.formats.tiff.taginfos;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteOrder;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TagInfoXpString_ESTest extends TagInfoXpString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD;
      TagInfoXpString tagInfoXpString0 = new TagInfoXpString("KYUaB/wz", 65546, tiffDirectoryType0);
      byte[] byteArray0 = new byte[4];
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField((-1), 0, fieldTypeByte0, 2390L, (-1), byteArray0, byteOrder0, 0);
      String string0 = tagInfoXpString0.getValue(tiffField0);
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD;
      TagInfoXpString tagInfoXpString0 = new TagInfoXpString("KYUaB/wz", 65535, tiffDirectoryType0);
      FieldTypeShort fieldTypeShort0 = FieldType.SSHORT;
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)91;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField((-1), 0, fieldTypeShort0.BYTE, 2390L, (-354L), byteArray0, byteOrder0, 0);
      String string0 = tagInfoXpString0.getValue(tiffField0);
      assertEquals("\u0000[", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD;
      TagInfoXpString tagInfoXpString0 = new TagInfoXpString("KYUaB/wz", 65535, tiffDirectoryType0);
      FieldTypeShort fieldTypeShort0 = FieldType.SSHORT;
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte) (-57);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-1), 0, fieldTypeShort0.BYTE, 2390L, (-354L), byteArray0, byteOrder0, 0);
      String string0 = tagInfoXpString0.getValue(tiffField0);
      assertEquals("\u0000\uC700", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD2;
      TagInfoXpString tagInfoXpString0 = new TagInfoXpString("", 0, tiffDirectoryType0);
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(2837, (-1), fieldTypeByte0, 0L, 0L, (byte[]) null, byteOrder0, (-1));
      // Undeclared exception!
      try { 
        tagInfoXpString0.getValue(tiffField0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD;
      TagInfoXpString tagInfoXpString0 = new TagInfoXpString(")jmbO%sufY", 9, tiffDirectoryType0);
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      byte[] byteArray0 = new byte[3];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-4104), 2432, fieldTypeByte0, (-4104), (-1), byteArray0, byteOrder0, 0);
      // Undeclared exception!
      try { 
        tagInfoXpString0.getValue(tiffField0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD0;
      TagInfoXpString tagInfoXpString0 = new TagInfoXpString("PreviewCoflorSspacce", 537, tiffDirectoryType0);
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      try { 
        tagInfoXpString0.encodeValue(fieldTypeByte0, byteOrder0, byteOrder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Text value not String: LITTLE_ENDIAN (java.nio.ByteOrder)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD;
      TagInfoXpString tagInfoXpString0 = new TagInfoXpString("H\"9^9_Bvo1PaLwqi", 65546, tiffDirectoryType0);
      byte[] byteArray0 = new byte[4];
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField((-89), 97, fieldTypeByte0, (-1), (-1), byteArray0, byteOrder0, 37121);
      // Undeclared exception!
      try { 
        tagInfoXpString0.encodeValue(fieldTypeByte0, tiffField0, byteOrder0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_GPS;
      TagInfoXpString tagInfoXpString0 = new TagInfoXpString("v/a1uw9); e", 65599, tiffDirectoryType0);
      byte[] byteArray0 = new byte[4];
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      byteArray0[2] = (byte) (-12);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(65599, (byte) (-12), fieldTypeByte0, 65599, (byte) (-12), byteArray0, byteOrder0, (byte) (-12));
      String string0 = tagInfoXpString0.getValue(tiffField0);
      assertEquals("\u0000\u00F4", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_GPS;
      TagInfoXpString tagInfoXpString0 = new TagInfoXpString("fJ/C=RfA51Q_mev", 65629, tiffDirectoryType0);
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)9;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-1), (byte)9, fieldTypeShort0.BYTE, (byte)9, (byte)0, byteArray0, byteOrder0, (-1));
      String string0 = tagInfoXpString0.getValue(tiffField0);
      assertEquals("\u0000\u0900", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD2;
      TagInfoXpString tagInfoXpString0 = new TagInfoXpString("", 22, tiffDirectoryType0);
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(22, 22, fieldTypeByte0, 22, 22, byteArray0, byteOrder0, 22);
      String string0 = tagInfoXpString0.getValue(tiffField0);
      assertEquals("\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_GPS;
      TagInfoXpString tagInfoXpString0 = new TagInfoXpString("fJ/C=RfA51Q_mev", 65629, tiffDirectoryType0);
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      byte[] byteArray0 = new byte[4];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(65629, 65629, fieldTypeShort0, (-1), (-1), byteArray0, byteOrder0, 65629);
      try { 
        tagInfoXpString0.getValue(tiffField0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Text field not encoded as bytes.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD0;
      TagInfoXpString tagInfoXpString0 = new TagInfoXpString("PreviewCoflorSspacce", 537, tiffDirectoryType0);
      byte[] byteArray0 = new byte[2];
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-1), (-1), fieldTypeByte0, 537, (-1), byteArray0, byteOrder0, 537);
      String string0 = tagInfoXpString0.getValue(tiffField0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
      TagInfoXpString tagInfoXpString0 = new TagInfoXpString("", (-604), tiffDirectoryType0);
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField((-604), (-1709), fieldTypeByte0, 0L, (-1), (byte[]) null, byteOrder0, (-1));
      // Undeclared exception!
      try { 
        tagInfoXpString0.encodeValue(fieldTypeByte0, tiffField0, byteOrder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD2;
      TagInfoXpString tagInfoXpString0 = new TagInfoXpString("", 22, tiffDirectoryType0);
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = tagInfoXpString0.encodeValue(fieldTypeByte0, "", byteOrder0);
      assertEquals(2, byteArray0.length);
  }
}
