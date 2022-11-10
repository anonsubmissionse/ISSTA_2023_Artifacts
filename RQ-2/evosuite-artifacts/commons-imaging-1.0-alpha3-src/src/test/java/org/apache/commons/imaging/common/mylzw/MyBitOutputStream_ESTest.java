/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 23:50:48 GMT 2022
 */

package org.apache.commons.imaging.common.mylzw;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.nio.ByteOrder;
import org.apache.commons.imaging.common.mylzw.MyBitOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MyBitOutputStream_ESTest extends MyBitOutputStream_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.io.filefilter.FalseFileFilter", "org.apache.commons.io.filefilter.FalseFileFilter");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(mockPrintStream0, byteOrder0);
      myBitOutputStream0.writeBits(0, (-1));
      int int0 = myBitOutputStream0.getBytesWritten();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Kc");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(mockPrintStream0, byteOrder0);
      myBitOutputStream0.writeBits(290, (-2482));
      myBitOutputStream0.flushCache();
      assertEquals(1, myBitOutputStream0.getBytesWritten());
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Kc");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(mockPrintStream0, byteOrder0);
      myBitOutputStream0.writeBits(290, (-2482));
      myBitOutputStream0.flushCache();
      assertEquals(0, mockFile0.length());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(byteArrayOutputStream0, byteOrder0);
      myBitOutputStream0.writeBits(3, 2108);
      myBitOutputStream0.writeBits((-1), 255);
      assertEquals(0, myBitOutputStream0.getBytesWritten());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Kc");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(mockPrintStream0, byteOrder0);
      myBitOutputStream0.writeBits(390, 54);
      myBitOutputStream0.writeBits(31, 61);
      assertEquals(0, myBitOutputStream0.getBytesWritten());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream((OutputStream) null, byteOrder0);
      myBitOutputStream0.writeBits((-137), (-137));
      byte[] byteArray0 = new byte[3];
      myBitOutputStream0.write(byteArray0);
      myBitOutputStream0.writeBits(345, (-138));
      assertEquals(0, myBitOutputStream0.getBytesWritten());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(byteArrayOutputStream0, byteOrder0);
      myBitOutputStream0.writeBits(0, 28);
      myBitOutputStream0.writeBits(3, 2108);
      assertEquals(0, myBitOutputStream0.getBytesWritten());
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Kc");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(mockPrintStream0, byteOrder0);
      myBitOutputStream0.write(290);
      assertEquals(0, mockFile0.length());
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Kc");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(mockPrintStream0, byteOrder0);
      myBitOutputStream0.write(290);
      assertEquals(0, myBitOutputStream0.getBytesWritten());
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream((OutputStream) null, byteOrder0);
      // Undeclared exception!
      try { 
        myBitOutputStream0.writeBits(2, 31);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyBitOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(pipedOutputStream0, byteOrder0);
      try { 
        myBitOutputStream0.writeBits(8, 51);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("i");
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(mockFileOutputStream0, byteOrder0);
      mockFileOutputStream0.close();
      try { 
        myBitOutputStream0.write(1345);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream((OutputStream) null, byteOrder0);
      myBitOutputStream0.writeBits(159, 1);
      // Undeclared exception!
      try { 
        myBitOutputStream0.flushCache();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyBitOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      File file0 = MockFile.createTempFile("trK}TcH&Wk-.s4i0b.'", "/:2#IYYB8^pD'(R");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(mockFileOutputStream0, byteOrder0);
      mockFileOutputStream0.close();
      myBitOutputStream0.writeBits(3, 3);
      try { 
        myBitOutputStream0.flushCache();
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Kc");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(mockPrintStream0, byteOrder0);
      myBitOutputStream0.writeBits((-2482), 435);
      int int0 = myBitOutputStream0.getBytesWritten();
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Kc");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(mockPrintStream0, byteOrder0);
      myBitOutputStream0.writeBits((-2482), 435);
      int int0 = myBitOutputStream0.getBytesWritten();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Kc");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(mockPrintStream0, byteOrder0);
      int int0 = myBitOutputStream0.getBytesWritten();
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(byteArrayOutputStream0, byteOrder0);
      myBitOutputStream0.writeBits(61, 61);
      myBitOutputStream0.flushCache();
      assertEquals(0, myBitOutputStream0.getBytesWritten());
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Kc");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(mockPrintStream0, byteOrder0);
      myBitOutputStream0.flushCache();
      assertEquals(0, mockFile0.length());
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Kc");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream(mockPrintStream0, byteOrder0);
      myBitOutputStream0.flushCache();
      assertEquals(0, myBitOutputStream0.getBytesWritten());
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyBitOutputStream myBitOutputStream0 = new MyBitOutputStream((OutputStream) null, byteOrder0);
      // Undeclared exception!
      try { 
        myBitOutputStream0.write((-902));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyBitOutputStream", e);
      }
  }
}
