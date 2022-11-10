/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 20:52:32 GMT 2022
 */

package org.apache.commons.net.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import org.apache.commons.net.io.ToNetASCIIInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ToNetASCIIInputStream_ESTest extends ToNetASCIIInputStream_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(bufferedInputStream0);
      byte[] byteArray0 = new byte[0];
      int int0 = toNetASCIIInputStream0.read(byteArray0);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      int int0 = toNetASCIIInputStream0.read();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 45, (-1011));
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      int int0 = toNetASCIIInputStream0.available();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream((InputStream) null);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        toNetASCIIInputStream0.read(byteArray0, (int) (byte)1, (int) (byte)115);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.io.ToNetASCIIInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(pipedInputStream0);
      byte[] byteArray0 = new byte[2];
      try { 
        toNetASCIIInputStream0.read(byteArray0, 0, (int) (byte)14);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream((InputStream) null);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        toNetASCIIInputStream0.read(byteArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.io.ToNetASCIIInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(344);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(bufferedInputStream0);
      byte[] byteArray0 = new byte[4];
      try { 
        toNetASCIIInputStream0.read(byteArray0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        toNetASCIIInputStream0.read();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.io.ToNetASCIIInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-23), (byte)2);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        toNetASCIIInputStream0.read();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(pipedInputStream0);
      try { 
        toNetASCIIInputStream0.read();
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        toNetASCIIInputStream0.available();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.io.ToNetASCIIInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(mockFileInputStream0);
      try { 
        toNetASCIIInputStream0.available();
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      File file0 = MockFile.createTempFile("|J6FRxa z ,8a", "|J6FRxa z ,8a");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(pushbackInputStream0);
      int int0 = toNetASCIIInputStream0.available();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      int int0 = toNetASCIIInputStream0.read();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      int int0 = toNetASCIIInputStream0.read();
      int int1 = toNetASCIIInputStream0.available();
      assertEquals(1, int1);
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      int int0 = toNetASCIIInputStream0.read(byteArray0, (int) (byte)6, (int) (byte)6);
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      int int0 = toNetASCIIInputStream0.read(byteArray0, (int) (byte)6, (int) (byte)6);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      toNetASCIIInputStream0.read(byteArray0);
      int int0 = toNetASCIIInputStream0.read(byteArray0, (int) (byte)13, 1028);
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      toNetASCIIInputStream0.read(byteArray0);
      int int0 = toNetASCIIInputStream0.read(byteArray0, (int) (byte)13, 1028);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        toNetASCIIInputStream0.read(byteArray0, (int) (byte)13, 1028);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         verifyException("org.apache.commons.net.io.ToNetASCIIInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      File file0 = MockFile.createTempFile("|J6FRxa z ,8a", "|J6FRxa z ,8a");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(pushbackInputStream0);
      toNetASCIIInputStream0.read();
      byte[] byteArray0 = new byte[4];
      int int0 = toNetASCIIInputStream0.read(byteArray0, Integer.MAX_VALUE, 3811);
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      File file0 = MockFile.createTempFile("|J6FRxa z ,8a", "|J6FRxa z ,8a");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(pushbackInputStream0);
      toNetASCIIInputStream0.read();
      byte[] byteArray0 = new byte[4];
      int int0 = toNetASCIIInputStream0.read(byteArray0, Integer.MAX_VALUE, 3811);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)93);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      int int0 = toNetASCIIInputStream0.read();
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)93);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      int int0 = toNetASCIIInputStream0.read();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      toNetASCIIInputStream0.read();
      int int0 = toNetASCIIInputStream0.read();
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      toNetASCIIInputStream0.read();
      int int0 = toNetASCIIInputStream0.read();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream((InputStream) null);
      byte[] byteArray0 = new byte[4];
      int int0 = toNetASCIIInputStream0.read(byteArray0, (int) (byte) (-6), 0);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      toNetASCIIInputStream0.read(byteArray0);
      int int0 = toNetASCIIInputStream0.read();
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      toNetASCIIInputStream0.read(byteArray0);
      int int0 = toNetASCIIInputStream0.read();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      boolean boolean0 = toNetASCIIInputStream0.markSupported();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      toNetASCIIInputStream0.read(byteArray0);
      int int0 = toNetASCIIInputStream0.read(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ToNetASCIIInputStream toNetASCIIInputStream0 = new ToNetASCIIInputStream(byteArrayInputStream0);
      toNetASCIIInputStream0.read(byteArray0);
      int int0 = toNetASCIIInputStream0.read(byteArray0);
      assertEquals(1, int0);
}
}
