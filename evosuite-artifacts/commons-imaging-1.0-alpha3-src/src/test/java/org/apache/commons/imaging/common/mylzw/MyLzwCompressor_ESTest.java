/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:39:05 GMT 2022
 */

package org.apache.commons.imaging.common.mylzw;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.nio.ByteOrder;
import org.apache.commons.imaging.common.mylzw.MyLzwCompressor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MyLzwCompressor_ESTest extends MyLzwCompressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(1121, byteOrder0, false, myLzwCompressor_Listener0);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      assertNotNull(myLzwCompressor0);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)52;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-16);
      byteArray0[4] = (byte) (-7);
      byteArray0[5] = (byte)0;
      try { 
        myLzwCompressor0.compress(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder1.toString());
      assertFalse(byteOrder1.equals((Object)byteOrder0));
      assertNotNull(byteOrder1);
      assertNotSame(byteOrder1, byteOrder0);
      
      ByteOrder byteOrder2 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder2.toString());
      assertFalse(byteOrder2.equals((Object)byteOrder0));
      assertNotNull(byteOrder2);
      assertNotSame(byteOrder2, byteOrder0);
      assertSame(byteOrder2, byteOrder1);
      
      ByteOrder byteOrder3 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder3.toString());
      assertFalse(byteOrder3.equals((Object)byteOrder0));
      assertNotNull(byteOrder3);
      assertNotSame(byteOrder3, byteOrder0);
      assertSame(byteOrder3, byteOrder2);
      assertSame(byteOrder3, byteOrder1);
      
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(8, byteOrder0, true, myLzwCompressor_Listener0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertFalse(byteOrder0.equals((Object)byteOrder3));
      assertFalse(byteOrder0.equals((Object)byteOrder2));
      assertFalse(byteOrder0.equals((Object)byteOrder1));
      assertNotNull(myLzwCompressor0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)95;
      byteArray0[2] = (byte)4;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-32);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-1);
      byteArray0[7] = (byte)0;
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertArrayEquals(new byte[] {(byte) (-1), (byte)95, (byte)4, (byte)0, (byte) (-32), (byte)0, (byte) (-1), (byte)0}, byteArray0);
      assertEquals(8, byteArray0.length);
      assertEquals(12, byteArray1.length);
      assertFalse(byteOrder0.equals((Object)byteOrder3));
      assertFalse(byteOrder0.equals((Object)byteOrder2));
      assertFalse(byteOrder0.equals((Object)byteOrder1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotNull(byteArray1);
      assertNotSame(byteOrder0, byteOrder3);
      assertNotSame(byteOrder0, byteOrder2);
      assertNotSame(byteOrder0, byteOrder1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      
      byte[] byteArray2 = null;
      // Undeclared exception!
      try { 
        myLzwCompressor0.compress((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(255, byteOrder0, false);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      assertNotNull(myLzwCompressor0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder1.toString());
      assertFalse(byteOrder1.equals((Object)byteOrder0));
      assertNotNull(byteOrder1);
      assertNotSame(byteOrder1, byteOrder0);
      
      ByteOrder byteOrder2 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder2.toString());
      assertFalse(byteOrder2.equals((Object)byteOrder0));
      assertNotNull(byteOrder2);
      assertNotSame(byteOrder2, byteOrder0);
      assertSame(byteOrder2, byteOrder1);
      
      ByteOrder byteOrder3 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder3.toString());
      assertFalse(byteOrder3.equals((Object)byteOrder0));
      assertNotNull(byteOrder3);
      assertNotSame(byteOrder3, byteOrder0);
      assertSame(byteOrder3, byteOrder2);
      assertSame(byteOrder3, byteOrder1);
      
      ByteOrder byteOrder4 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder4.toString());
      assertFalse(byteOrder4.equals((Object)byteOrder0));
      assertNotNull(byteOrder4);
      assertSame(byteOrder4, byteOrder2);
      assertNotSame(byteOrder4, byteOrder0);
      assertSame(byteOrder4, byteOrder1);
      assertSame(byteOrder4, byteOrder3);
      
      ByteOrder byteOrder5 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder5.toString());
      assertFalse(byteOrder5.equals((Object)byteOrder0));
      assertNotNull(byteOrder5);
      assertNotSame(byteOrder5, byteOrder0);
      assertSame(byteOrder5, byteOrder2);
      assertSame(byteOrder5, byteOrder1);
      assertSame(byteOrder5, byteOrder4);
      assertSame(byteOrder5, byteOrder3);
      
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-310), byteOrder0, false);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertFalse(byteOrder0.equals((Object)byteOrder3));
      assertFalse(byteOrder0.equals((Object)byteOrder1));
      assertFalse(byteOrder0.equals((Object)byteOrder4));
      assertFalse(byteOrder0.equals((Object)byteOrder2));
      assertFalse(byteOrder0.equals((Object)byteOrder5));
      assertNotNull(myLzwCompressor0);
      
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte) (-14);
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertEquals(3, byteArray0.length);
      assertEquals(0, byteArray1.length);
      assertFalse(byteOrder0.equals((Object)byteOrder3));
      assertFalse(byteOrder0.equals((Object)byteOrder1));
      assertFalse(byteOrder0.equals((Object)byteOrder4));
      assertFalse(byteOrder0.equals((Object)byteOrder2));
      assertFalse(byteOrder0.equals((Object)byteOrder5));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotNull(byteArray1);
      assertNotSame(byteOrder0, byteOrder3);
      assertNotSame(byteOrder0, byteOrder1);
      assertNotSame(byteOrder0, byteOrder4);
      assertNotSame(byteOrder0, byteOrder2);
      assertNotSame(byteOrder0, byteOrder5);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      
      byteArray0[0] = (byte) (-14);
      byte[] byteArray2 = myLzwCompressor0.compress(byteArray0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertArrayEquals(new byte[] {(byte) (-14), (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray2);
      assertEquals(3, byteArray0.length);
      assertEquals(0, byteArray2.length);
      assertFalse(byteOrder0.equals((Object)byteOrder3));
      assertFalse(byteOrder0.equals((Object)byteOrder1));
      assertFalse(byteOrder0.equals((Object)byteOrder4));
      assertFalse(byteOrder0.equals((Object)byteOrder2));
      assertFalse(byteOrder0.equals((Object)byteOrder5));
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertNotNull(byteArray2);
      assertNotSame(byteOrder0, byteOrder3);
      assertNotSame(byteOrder0, byteOrder1);
      assertNotSame(byteOrder0, byteOrder4);
      assertNotSame(byteOrder0, byteOrder2);
      assertNotSame(byteOrder0, byteOrder5);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray0);
      
      myLzwCompressor0.compress(byteArray0);
      myLzwCompressor0.compress(byteArray0);
      byte[] byteArray3 = new byte[7];
      myLzwCompressor0.compress(byteArray1);
      byteArray3[0] = byte0;
      byteArray3[1] = byte0;
      byteArray3[2] = byte0;
      byteArray3[3] = byte0;
      byteArray3[4] = byte0;
      byteArray3[5] = byte0;
      byteArray3[6] = byte0;
      byte[] byteArray4 = myLzwCompressor0.compress(byteArray3);
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte[] byteArray5 = null;
      myLzwCompressor0.compress(byteArray5);
      byte byte2 = (byte) (-1);
      myLzwCompressor0.compress(byteArray4);
      ByteOrder.nativeOrder();
      byteArray0[2] = byte2;
      myLzwCompressor0.compress(byteArray0);
      myLzwCompressor0.compress(byteArray1);
      myLzwCompressor0.compress(byteArray2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 2558;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder1.toString());
      assertNotNull(byteOrder1);
      assertSame(byteOrder1, byteOrder0);
      
      boolean boolean0 = false;
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(int0, byteOrder0, boolean0, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)85;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byte[] byteArray1 = new byte[1];
      myLzwCompressor0.compress(byteArray1);
      byteArray1[0] = byte0;
      myLzwCompressor0.compress(byteArray1);
      byteArray0[1] = byte1;
      byte[] byteArray2 = myLzwCompressor0.compress(byteArray0);
      byte byte2 = (byte) (-118);
      ByteOrder.nativeOrder();
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      myLzwCompressor0.compress(byteArray2);
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-125);
      myLzwCompressor0.compress(byteArray0);
      byteArray0[4] = byte4;
      byte byte5 = (byte)87;
      byteArray0[5] = byte5;
      byte byte6 = (byte)0;
      byteArray0[6] = byte6;
      myLzwCompressor0.compress(byteArray0);
      myLzwCompressor0.compress(byteArray0);
      myLzwCompressor0.compress(byteArray0);
      myLzwCompressor0.compress(byteArray0);
      myLzwCompressor0.compress(byteArray0);
      myLzwCompressor0.compress(byteArray0);
      byte[] byteArray3 = new byte[0];
      myLzwCompressor0.compress(byteArray3);
      byte[] byteArray4 = new byte[6];
      byteArray4[0] = byte6;
      byteArray4[1] = byte4;
      byteArray4[2] = byte4;
      byteArray4[3] = byte2;
      byteArray4[4] = byte5;
      byteArray4[5] = byte2;
      myLzwCompressor0.compress(byteArray4);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, (ByteOrder) null, false);
      assertNotNull(myLzwCompressor0);
      
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byte byte1 = (byte)92;
      byteArray0[1] = (byte)92;
      byte byte2 = (byte)96;
      byteArray0[2] = (byte)96;
      try { 
        myLzwCompressor0.compress(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder1.toString());
      assertFalse(byteOrder1.equals((Object)byteOrder0));
      assertNotNull(byteOrder1);
      assertNotSame(byteOrder1, byteOrder0);
      
      ByteOrder byteOrder2 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder2.toString());
      assertFalse(byteOrder2.equals((Object)byteOrder0));
      assertNotNull(byteOrder2);
      assertSame(byteOrder2, byteOrder1);
      assertNotSame(byteOrder2, byteOrder0);
      
      ByteOrder byteOrder3 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder3.toString());
      assertFalse(byteOrder3.equals((Object)byteOrder0));
      assertNotNull(byteOrder3);
      assertSame(byteOrder3, byteOrder2);
      assertSame(byteOrder3, byteOrder1);
      assertNotSame(byteOrder3, byteOrder0);
      
      ByteOrder byteOrder4 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder4.toString());
      assertFalse(byteOrder4.equals((Object)byteOrder0));
      assertNotNull(byteOrder4);
      assertSame(byteOrder4, byteOrder1);
      assertSame(byteOrder4, byteOrder3);
      assertNotSame(byteOrder4, byteOrder0);
      assertSame(byteOrder4, byteOrder2);
      
      ByteOrder byteOrder5 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder5.toString());
      assertFalse(byteOrder5.equals((Object)byteOrder0));
      assertNotNull(byteOrder5);
      assertSame(byteOrder5, byteOrder2);
      assertSame(byteOrder5, byteOrder3);
      assertSame(byteOrder5, byteOrder4);
      assertSame(byteOrder5, byteOrder1);
      assertNotSame(byteOrder5, byteOrder0);
      
      ByteOrder byteOrder6 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder6.toString());
      assertFalse(byteOrder6.equals((Object)byteOrder0));
      assertNotNull(byteOrder6);
      assertSame(byteOrder6, byteOrder4);
      assertSame(byteOrder6, byteOrder2);
      assertSame(byteOrder6, byteOrder5);
      assertSame(byteOrder6, byteOrder1);
      assertNotSame(byteOrder6, byteOrder0);
      assertSame(byteOrder6, byteOrder3);
      
      ByteOrder byteOrder7 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder7.toString());
      assertFalse(byteOrder7.equals((Object)byteOrder0));
      assertNotNull(byteOrder7);
      assertSame(byteOrder7, byteOrder3);
      assertSame(byteOrder7, byteOrder1);
      assertSame(byteOrder7, byteOrder5);
      assertSame(byteOrder7, byteOrder4);
      assertNotSame(byteOrder7, byteOrder0);
      assertSame(byteOrder7, byteOrder2);
      assertSame(byteOrder7, byteOrder6);
      
      ByteOrder byteOrder8 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder8.toString());
      assertFalse(byteOrder8.equals((Object)byteOrder0));
      assertNotNull(byteOrder8);
      assertSame(byteOrder8, byteOrder7);
      assertSame(byteOrder8, byteOrder3);
      assertSame(byteOrder8, byteOrder5);
      assertSame(byteOrder8, byteOrder1);
      assertSame(byteOrder8, byteOrder4);
      assertSame(byteOrder8, byteOrder6);
      assertNotSame(byteOrder8, byteOrder0);
      assertSame(byteOrder8, byteOrder2);
      
      ByteOrder byteOrder9 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder9.toString());
      assertFalse(byteOrder9.equals((Object)byteOrder0));
      assertNotNull(byteOrder9);
      assertSame(byteOrder9, byteOrder4);
      assertSame(byteOrder9, byteOrder2);
      assertSame(byteOrder9, byteOrder7);
      assertSame(byteOrder9, byteOrder6);
      assertSame(byteOrder9, byteOrder8);
      assertNotSame(byteOrder9, byteOrder0);
      assertSame(byteOrder9, byteOrder1);
      assertSame(byteOrder9, byteOrder3);
      assertSame(byteOrder9, byteOrder5);
      
      ByteOrder byteOrder10 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder10.toString());
      assertFalse(byteOrder10.equals((Object)byteOrder0));
      assertNotNull(byteOrder10);
      assertSame(byteOrder10, byteOrder3);
      assertSame(byteOrder10, byteOrder6);
      assertSame(byteOrder10, byteOrder8);
      assertSame(byteOrder10, byteOrder9);
      assertNotSame(byteOrder10, byteOrder0);
      assertSame(byteOrder10, byteOrder5);
      assertSame(byteOrder10, byteOrder1);
      assertSame(byteOrder10, byteOrder4);
      assertSame(byteOrder10, byteOrder2);
      assertSame(byteOrder10, byteOrder7);
      
      ByteOrder byteOrder11 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder11.toString());
      assertFalse(byteOrder11.equals((Object)byteOrder0));
      assertNotNull(byteOrder11);
      assertSame(byteOrder11, byteOrder7);
      assertSame(byteOrder11, byteOrder4);
      assertSame(byteOrder11, byteOrder5);
      assertSame(byteOrder11, byteOrder1);
      assertSame(byteOrder11, byteOrder3);
      assertSame(byteOrder11, byteOrder6);
      assertSame(byteOrder11, byteOrder2);
      assertSame(byteOrder11, byteOrder8);
      assertNotSame(byteOrder11, byteOrder0);
      assertSame(byteOrder11, byteOrder10);
      assertSame(byteOrder11, byteOrder9);
      
      ByteOrder byteOrder12 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder12.toString());
      assertFalse(byteOrder12.equals((Object)byteOrder0));
      assertNotNull(byteOrder12);
      assertSame(byteOrder12, byteOrder7);
      assertNotSame(byteOrder12, byteOrder0);
      assertSame(byteOrder12, byteOrder11);
      assertSame(byteOrder12, byteOrder5);
      assertSame(byteOrder12, byteOrder10);
      assertSame(byteOrder12, byteOrder8);
      assertSame(byteOrder12, byteOrder6);
      assertSame(byteOrder12, byteOrder3);
      assertSame(byteOrder12, byteOrder2);
      assertSame(byteOrder12, byteOrder4);
      assertSame(byteOrder12, byteOrder1);
      assertSame(byteOrder12, byteOrder9);
      
      ByteOrder byteOrder13 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder13.toString());
      assertFalse(byteOrder13.equals((Object)byteOrder0));
      assertNotNull(byteOrder13);
      assertSame(byteOrder13, byteOrder2);
      assertSame(byteOrder13, byteOrder8);
      assertNotSame(byteOrder13, byteOrder0);
      assertSame(byteOrder13, byteOrder5);
      assertSame(byteOrder13, byteOrder3);
      assertSame(byteOrder13, byteOrder10);
      assertSame(byteOrder13, byteOrder7);
      assertSame(byteOrder13, byteOrder12);
      assertSame(byteOrder13, byteOrder6);
      assertSame(byteOrder13, byteOrder11);
      assertSame(byteOrder13, byteOrder4);
      assertSame(byteOrder13, byteOrder1);
      assertSame(byteOrder13, byteOrder9);
      
      ByteOrder byteOrder14 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder14.toString());
      assertFalse(byteOrder14.equals((Object)byteOrder0));
      assertNotNull(byteOrder14);
      assertSame(byteOrder14, byteOrder4);
      assertSame(byteOrder14, byteOrder2);
      assertSame(byteOrder14, byteOrder3);
      assertNotSame(byteOrder14, byteOrder0);
      assertSame(byteOrder14, byteOrder1);
      assertSame(byteOrder14, byteOrder8);
      assertSame(byteOrder14, byteOrder13);
      assertSame(byteOrder14, byteOrder10);
      assertSame(byteOrder14, byteOrder11);
      assertSame(byteOrder14, byteOrder9);
      assertSame(byteOrder14, byteOrder5);
      assertSame(byteOrder14, byteOrder7);
      assertSame(byteOrder14, byteOrder6);
      assertSame(byteOrder14, byteOrder12);
      
      ByteOrder byteOrder15 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder15.toString());
      assertFalse(byteOrder15.equals((Object)byteOrder0));
      assertNotNull(byteOrder15);
      assertSame(byteOrder15, byteOrder4);
      assertSame(byteOrder15, byteOrder8);
      assertSame(byteOrder15, byteOrder2);
      assertSame(byteOrder15, byteOrder13);
      assertSame(byteOrder15, byteOrder10);
      assertSame(byteOrder15, byteOrder11);
      assertSame(byteOrder15, byteOrder5);
      assertNotSame(byteOrder15, byteOrder0);
      assertSame(byteOrder15, byteOrder1);
      assertSame(byteOrder15, byteOrder14);
      assertSame(byteOrder15, byteOrder9);
      assertSame(byteOrder15, byteOrder3);
      assertSame(byteOrder15, byteOrder6);
      assertSame(byteOrder15, byteOrder12);
      assertSame(byteOrder15, byteOrder7);
      
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(2596, byteOrder0, true);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertFalse(byteOrder0.equals((Object)byteOrder12));
      assertFalse(byteOrder0.equals((Object)byteOrder11));
      assertFalse(byteOrder0.equals((Object)byteOrder9));
      assertFalse(byteOrder0.equals((Object)byteOrder4));
      assertFalse(byteOrder0.equals((Object)byteOrder1));
      assertFalse(byteOrder0.equals((Object)byteOrder14));
      assertFalse(byteOrder0.equals((Object)byteOrder13));
      assertFalse(byteOrder0.equals((Object)byteOrder6));
      assertFalse(byteOrder0.equals((Object)byteOrder8));
      assertFalse(byteOrder0.equals((Object)byteOrder7));
      assertFalse(byteOrder0.equals((Object)byteOrder2));
      assertFalse(byteOrder0.equals((Object)byteOrder10));
      assertFalse(byteOrder0.equals((Object)byteOrder3));
      assertFalse(byteOrder0.equals((Object)byteOrder5));
      assertFalse(byteOrder0.equals((Object)byteOrder15));
      assertNotNull(myLzwCompressor0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-14);
      try { 
        myLzwCompressor0.compress(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder1.toString());
      assertFalse(byteOrder1.equals((Object)byteOrder0));
      assertNotNull(byteOrder1);
      assertNotSame(byteOrder1, byteOrder0);
      
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      ByteOrder byteOrder2 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder2.toString());
      assertFalse(byteOrder2.equals((Object)byteOrder0));
      assertNotNull(byteOrder2);
      assertNotSame(byteOrder2, byteOrder0);
      assertSame(byteOrder2, byteOrder1);
      
      ByteOrder byteOrder3 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder3.toString());
      assertFalse(byteOrder3.equals((Object)byteOrder0));
      assertNotNull(byteOrder3);
      assertNotSame(byteOrder3, byteOrder0);
      assertSame(byteOrder3, byteOrder2);
      assertSame(byteOrder3, byteOrder1);
      
      ByteOrder byteOrder4 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder4.toString());
      assertFalse(byteOrder4.equals((Object)byteOrder0));
      assertNotNull(byteOrder4);
      assertSame(byteOrder4, byteOrder3);
      assertSame(byteOrder4, byteOrder2);
      assertSame(byteOrder4, byteOrder1);
      assertNotSame(byteOrder4, byteOrder0);
      
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, true, myLzwCompressor_Listener0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertFalse(byteOrder0.equals((Object)byteOrder3));
      assertFalse(byteOrder0.equals((Object)byteOrder2));
      assertFalse(byteOrder0.equals((Object)byteOrder4));
      assertFalse(byteOrder0.equals((Object)byteOrder1));
      assertNotNull(myLzwCompressor0);
      
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-96)}, byteArray1);
      assertEquals(4, byteArray0.length);
      assertEquals(1, byteArray1.length);
      assertFalse(byteOrder0.equals((Object)byteOrder3));
      assertFalse(byteOrder0.equals((Object)byteOrder2));
      assertFalse(byteOrder0.equals((Object)byteOrder4));
      assertFalse(byteOrder0.equals((Object)byteOrder1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotNull(byteArray1);
      assertNotSame(byteOrder0, byteOrder3);
      assertNotSame(byteOrder0, byteOrder2);
      assertNotSame(byteOrder0, byteOrder4);
      assertNotSame(byteOrder0, byteOrder1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      
      byteArray0[0] = (byte)1;
      ByteOrder byteOrder5 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder5.toString());
      assertFalse(byteOrder5.equals((Object)byteOrder0));
      assertNotNull(byteOrder5);
      assertSame(byteOrder5, byteOrder3);
      assertSame(byteOrder5, byteOrder2);
      assertSame(byteOrder5, byteOrder1);
      assertNotSame(byteOrder5, byteOrder0);
      assertSame(byteOrder5, byteOrder4);
      
      ByteOrder byteOrder6 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder6.toString());
      assertFalse(byteOrder6.equals((Object)byteOrder0));
      assertNotNull(byteOrder6);
      assertSame(byteOrder6, byteOrder4);
      assertSame(byteOrder6, byteOrder3);
      assertSame(byteOrder6, byteOrder2);
      assertSame(byteOrder6, byteOrder5);
      assertNotSame(byteOrder6, byteOrder0);
      assertSame(byteOrder6, byteOrder1);
      
      byte byte0 = (byte)66;
      byte[] byteArray2 = new byte[0];
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      
      try { 
        myLzwCompressor0.compress(byteArray2);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, false, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte) (-90);
      byteArray0[0] = (byte) (-90);
      byteArray0[1] = (byte)0;
      byte byte1 = (byte)5;
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)5;
      ByteOrder.nativeOrder();
      byteArray1[1] = (byte)79;
      try { 
        myLzwCompressor0.compress(byteArray1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-863), byteOrder0, false);
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      ByteOrder.nativeOrder();
      byteArray0[0] = (byte)108;
      byteArray0[1] = (byte)6;
      try { 
        myLzwCompressor0.compress(byteArray1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, (ByteOrder) null, false, (MyLzwCompressor.Listener) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 6320;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      boolean boolean0 = true;
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(int0, byteOrder0, boolean0);
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-1);
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      byte byte3 = (byte)8;
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-120);
      byteArray0[4] = byte4;
      byte byte5 = (byte)24;
      byteArray0[5] = byte5;
      byte byte6 = (byte)1;
      byteArray0[6] = byte6;
      myLzwCompressor0.compress(byteArray0);
  }
}
