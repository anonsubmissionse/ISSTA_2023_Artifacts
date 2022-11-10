/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:42:09 GMT 2022
 */

package org.apache.commons.imaging.formats.tiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteOrder;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.imaging.formats.tiff.TiffContents;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffElement;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffHeader;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffContents_ESTest extends TiffContents_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffHeader tiffHeader0 = new TiffHeader(byteOrder0, 15, 15);
      LinkedList<TiffDirectory> linkedList0 = new LinkedList<TiffDirectory>();
      LinkedList<TiffField> linkedList1 = new LinkedList<TiffField>();
      TiffContents tiffContents0 = new TiffContents(tiffHeader0, linkedList0, linkedList1);
      FieldTypeFloat fieldTypeFloat0 = new FieldTypeFloat(8, "]/jN8@zg");
      byte[] byteArray0 = new byte[3];
      TiffField tiffField0 = new TiffField(15, 15, fieldTypeFloat0, 188L, 758L, byteArray0, tiffHeader0.byteOrder, 15);
      linkedList1.add(tiffField0);
      TiffDirectory tiffDirectory0 = new TiffDirectory(15, linkedList1, 8, 15L, tiffHeader0.byteOrder);
      linkedList0.addLast(tiffDirectory0);
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_GPS;
      TagInfoSRational tagInfoSRational0 = new TagInfoSRational("]/jN8@zg", 15, tiffDirectoryType0);
      TiffField tiffField1 = tiffContents0.findField(tagInfoSRational0);
      assertEquals(15, tiffField1.getTag());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffHeader tiffHeader0 = new TiffHeader(byteOrder0, 0, 0);
      LinkedList<TiffDirectory> linkedList0 = new LinkedList<TiffDirectory>();
      LinkedList<TiffField> linkedList1 = new LinkedList<TiffField>();
      TiffContents tiffContents0 = new TiffContents(tiffHeader0, linkedList0, linkedList1);
      FieldTypeFloat fieldTypeFloat0 = new FieldTypeFloat((-1043), "ImageLength");
      byte[] byteArray0 = new byte[3];
      TiffField tiffField0 = new TiffField((-1802), 943, fieldTypeFloat0, 0, (-4L), byteArray0, tiffHeader0.byteOrder, (-2175));
      linkedList1.add(tiffField0);
      TiffDirectory tiffDirectory0 = new TiffDirectory(0, linkedList1, 8, 0L, tiffHeader0.byteOrder);
      linkedList0.addLast(tiffDirectory0);
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_GPS;
      TagInfoSRational tagInfoSRational0 = new TagInfoSRational("]/jN8@-9zg", (-1802), tiffDirectoryType0);
      TiffField tiffField1 = tiffContents0.findField(tagInfoSRational0);
      assertTrue(tiffField1.isLocalValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffHeader tiffHeader0 = new TiffHeader(byteOrder0, 0, 0);
      LinkedList<TiffDirectory> linkedList0 = new LinkedList<TiffDirectory>();
      LinkedList<TiffField> linkedList1 = new LinkedList<TiffField>();
      TiffContents tiffContents0 = new TiffContents(tiffHeader0, linkedList0, linkedList1);
      FieldTypeFloat fieldTypeFloat0 = new FieldTypeFloat(0, "");
      byte[] byteArray0 = new byte[1];
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeFloat0, 8, 0L, byteArray0, tiffHeader0.byteOrder, 0);
      TiffDirectory tiffDirectory0 = new TiffDirectory(0, linkedList1, 8, 0L, tiffHeader0.byteOrder);
      linkedList0.add(tiffDirectory0);
      linkedList1.push(tiffField0);
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
      TagInfoSRational tagInfoSRational0 = new TagInfoSRational("", 0, tiffDirectoryType0);
      TiffField tiffField1 = tiffContents0.findField(tagInfoSRational0);
      assertFalse(tiffField1.isLocalValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffHeader tiffHeader0 = new TiffHeader(byteOrder0, 0, 0);
      LinkedList<TiffDirectory> linkedList0 = new LinkedList<TiffDirectory>();
      LinkedList<TiffField> linkedList1 = new LinkedList<TiffField>();
      TiffContents tiffContents0 = new TiffContents(tiffHeader0, linkedList0, linkedList1);
      byte[] byteArray0 = new byte[1];
      TiffDirectory tiffDirectory0 = new TiffDirectory(0, linkedList1, 8, 0L, tiffHeader0.byteOrder);
      linkedList0.add(tiffDirectory0);
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD;
      TagInfoSRational tagInfoSRational0 = new TagInfoSRational("gO\"@G^<j+[wv", 0, tiffDirectoryType0);
      FieldTypeByte fieldTypeByte0 = FieldType.UNDEFINED;
      TiffField tiffField0 = new TiffField(8, (-3120), fieldTypeByte0, (-5668L), 4L, byteArray0, byteOrder0, (byte) (-123));
      linkedList1.add(tiffField0);
      TagInfoSLong tagInfoSLong0 = new TagInfoSLong("gO\"@G^<j+[wv", 8, tagInfoSRational0.directoryType);
      TiffField tiffField1 = tiffContents0.findField(tagInfoSLong0);
      assertEquals("Undefined", tiffField1.getFieldTypeName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffHeader tiffHeader0 = new TiffHeader(byteOrder0, 3594, (-1L));
      LinkedList<TiffDirectory> linkedList0 = new LinkedList<TiffDirectory>();
      LinkedList<TiffField> linkedList1 = new LinkedList<TiffField>();
      TiffContents tiffContents0 = new TiffContents(tiffHeader0, linkedList0, linkedList1);
      linkedList0.add((TiffDirectory) null);
      // Undeclared exception!
      try { 
        tiffContents0.getElements();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffContents", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffHeader tiffHeader0 = new TiffHeader(byteOrder0, 0, 0);
      LinkedHashSet<TiffDirectory> linkedHashSet0 = new LinkedHashSet<TiffDirectory>();
      LinkedList<TiffDirectory> linkedList0 = new LinkedList<TiffDirectory>(linkedHashSet0);
      LinkedList<TiffField> linkedList1 = new LinkedList<TiffField>();
      TiffContents tiffContents0 = new TiffContents(tiffHeader0, linkedList0, linkedList1);
      TiffDirectory tiffDirectory0 = new TiffDirectory(0, tiffContents0.tiffFields, 1L, 8, tiffHeader0.byteOrder);
      linkedList0.add(0, tiffDirectory0);
      linkedList1.add((TiffField) null);
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_GPS;
      TagInfoSLongs tagInfoSLongs0 = new TagInfoSLongs("org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab", 8, 0, tiffDirectoryType0);
      // Undeclared exception!
      try { 
        tiffContents0.findField(tagInfoSLongs0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffDirectory", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<TiffDirectory> linkedList0 = new LinkedList<TiffDirectory>();
      LinkedList<TiffField> linkedList1 = new LinkedList<TiffField>();
      TiffContents tiffContents0 = new TiffContents((TiffHeader) null, linkedList0, linkedList1);
      // Undeclared exception!
      try { 
        tiffContents0.dissect();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffContents", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffHeader tiffHeader0 = new TiffHeader(byteOrder0, 0, 0);
      LinkedList<TiffDirectory> linkedList0 = new LinkedList<TiffDirectory>();
      LinkedList<TiffField> linkedList1 = new LinkedList<TiffField>();
      TiffContents tiffContents0 = new TiffContents(tiffHeader0, linkedList0, linkedList1);
      byte[] byteArray0 = new byte[1];
      TiffDirectory tiffDirectory0 = new TiffDirectory(0, linkedList1, 8, 0L, tiffHeader0.byteOrder);
      linkedList0.add(tiffDirectory0);
      FieldTypeByte fieldTypeByte0 = FieldType.UNDEFINED;
      TiffField tiffField0 = new TiffField(8, (-3120), fieldTypeByte0, (-5668L), 4L, byteArray0, byteOrder0, (byte) (-123));
      linkedList1.add(tiffField0);
      // Undeclared exception!
      try { 
        tiffContents0.dissect();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffHeader tiffHeader0 = new TiffHeader(byteOrder0, 1, 1);
      LinkedList<TiffDirectory> linkedList0 = new LinkedList<TiffDirectory>();
      LinkedList<TiffField> linkedList1 = new LinkedList<TiffField>();
      TiffContents tiffContents0 = new TiffContents(tiffHeader0, linkedList0, linkedList1);
      FieldTypeFloat fieldTypeFloat0 = new FieldTypeFloat(8, "]/jN8@zg");
      byte[] byteArray0 = new byte[3];
      TiffField tiffField0 = new TiffField(1, 8, fieldTypeFloat0, 1, 8, byteArray0, tiffHeader0.byteOrder, (-2175));
      linkedList1.add(tiffField0);
      TiffDirectory tiffDirectory0 = new TiffDirectory(1, linkedList1, 8, 1L, tiffHeader0.byteOrder);
      linkedList0.addLast(tiffDirectory0);
      // Undeclared exception!
      try { 
        tiffContents0.dissect();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.imaging.common.ByteConversions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffHeader tiffHeader0 = new TiffHeader(byteOrder0, 0, 0);
      LinkedList<TiffField> linkedList0 = new LinkedList<TiffField>();
      TiffContents tiffContents0 = null;
      try {
        tiffContents0 = new TiffContents(tiffHeader0, (List<TiffDirectory>) null, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffHeader tiffHeader0 = new TiffHeader(byteOrder0, 0, 0);
      LinkedList<TiffDirectory> linkedList0 = new LinkedList<TiffDirectory>();
      LinkedList<TiffField> linkedList1 = new LinkedList<TiffField>();
      TiffContents tiffContents0 = new TiffContents(tiffHeader0, linkedList0, linkedList1);
      FieldTypeFloat fieldTypeFloat0 = new FieldTypeFloat(0, "");
      byte[] byteArray0 = new byte[1];
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeFloat0, 8, 0L, byteArray0, tiffHeader0.byteOrder, 0);
      TiffDirectory tiffDirectory0 = new TiffDirectory(0, linkedList1, 8, 0L, tiffHeader0.byteOrder);
      linkedList0.add(tiffDirectory0);
      linkedList1.push(tiffField0);
      tiffContents0.dissect();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffHeader tiffHeader0 = new TiffHeader(byteOrder0, 0, 0);
      LinkedList<TiffDirectory> linkedList0 = new LinkedList<TiffDirectory>();
      LinkedList<TiffField> linkedList1 = new LinkedList<TiffField>();
      TiffContents tiffContents0 = new TiffContents(tiffHeader0, linkedList0, linkedList1);
      TiffDirectory tiffDirectory0 = new TiffDirectory(0, linkedList1, 8, 0L, tiffHeader0.byteOrder);
      linkedList0.add(tiffDirectory0);
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
      TagInfoSRational tagInfoSRational0 = new TagInfoSRational("", 0, tiffDirectoryType0);
      TiffField tiffField0 = tiffContents0.findField(tagInfoSRational0);
      assertNull(tiffField0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffHeader tiffHeader0 = new TiffHeader(byteOrder0, 0, 0);
      LinkedList<TiffDirectory> linkedList0 = new LinkedList<TiffDirectory>();
      LinkedList<TiffField> linkedList1 = new LinkedList<TiffField>();
      TiffContents tiffContents0 = new TiffContents(tiffHeader0, linkedList0, linkedList1);
      FieldTypeFloat fieldTypeFloat0 = new FieldTypeFloat(0, "");
      byte[] byteArray0 = new byte[1];
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeFloat0, 8, 0L, byteArray0, tiffHeader0.byteOrder, 0);
      TiffDirectory tiffDirectory0 = new TiffDirectory(0, linkedList1, 8, 0L, tiffHeader0.byteOrder);
      linkedList0.add(tiffDirectory0);
      linkedList1.push(tiffField0);
      List<TiffElement> list0 = tiffContents0.getElements();
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffHeader tiffHeader0 = new TiffHeader(byteOrder0, 0, 0);
      LinkedList<TiffDirectory> linkedList0 = new LinkedList<TiffDirectory>();
      LinkedList<TiffField> linkedList1 = new LinkedList<TiffField>();
      TiffContents tiffContents0 = new TiffContents(tiffHeader0, linkedList0, linkedList1);
      FieldTypeFloat fieldTypeFloat0 = new FieldTypeFloat(0, "");
      byte[] byteArray0 = new byte[1];
      TiffField tiffField0 = new TiffField(0, 8, fieldTypeFloat0, 0, 8, byteArray0, tiffHeader0.byteOrder, 0);
      linkedList1.add(tiffField0);
      TiffDirectory tiffDirectory0 = new TiffDirectory(0, linkedList1, 8, 0L, tiffHeader0.byteOrder);
      linkedList0.add(tiffDirectory0);
      List<TiffElement> list0 = tiffContents0.getElements();
      assertEquals(2, list0.size());
  }
}
