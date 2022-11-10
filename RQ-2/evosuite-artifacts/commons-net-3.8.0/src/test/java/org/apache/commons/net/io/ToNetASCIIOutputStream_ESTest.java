/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 21:04:59 GMT 2022
 */

package org.apache.commons.net.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.net.io.ToNetASCIIOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ToNetASCIIOutputStream_ESTest extends ToNetASCIIOutputStream_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ToNetASCIIOutputStream toNetASCIIOutputStream0 = new ToNetASCIIOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[1];
      toNetASCIIOutputStream0.write(byteArray0, (int) (byte) (-27), (int) (byte) (-27));
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(">");
      ToNetASCIIOutputStream toNetASCIIOutputStream0 = new ToNetASCIIOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        toNetASCIIOutputStream0.write(byteArray0, 91, 91);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 91
         //
         verifyException("org.apache.commons.net.io.ToNetASCIIOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ToNetASCIIOutputStream toNetASCIIOutputStream0 = new ToNetASCIIOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        toNetASCIIOutputStream0.write(byteArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.io.ToNetASCIIOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ToNetASCIIOutputStream toNetASCIIOutputStream0 = new ToNetASCIIOutputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[7];
      try { 
        toNetASCIIOutputStream0.write(byteArray0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToNetASCIIOutputStream toNetASCIIOutputStream0 = new ToNetASCIIOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        toNetASCIIOutputStream0.write((-21));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.io.ToNetASCIIOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ToNetASCIIOutputStream toNetASCIIOutputStream0 = new ToNetASCIIOutputStream(pipedOutputStream0);
      try { 
        toNetASCIIOutputStream0.write((-2345));
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ToNetASCIIOutputStream toNetASCIIOutputStream0 = new ToNetASCIIOutputStream(byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        toNetASCIIOutputStream0.write((byte[]) null, 0, 1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.io.ToNetASCIIOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("DXE#k&t]G");
      ToNetASCIIOutputStream toNetASCIIOutputStream0 = new ToNetASCIIOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      toNetASCIIOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte)0);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("DXE#k&t]G");
      ToNetASCIIOutputStream toNetASCIIOutputStream0 = new ToNetASCIIOutputStream(mockPrintStream0);
      toNetASCIIOutputStream0.write(5);
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("$VALUES");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      ToNetASCIIOutputStream toNetASCIIOutputStream0 = new ToNetASCIIOutputStream(dataOutputStream0);
      toNetASCIIOutputStream0.write(13);
      toNetASCIIOutputStream0.write(10);
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("d47p,h,3//.m", "");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ToNetASCIIOutputStream toNetASCIIOutputStream0 = new ToNetASCIIOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[9];
      byteArray0[8] = (byte)13;
      toNetASCIIOutputStream0.write(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("$VALUES");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      ToNetASCIIOutputStream toNetASCIIOutputStream0 = new ToNetASCIIOutputStream(dataOutputStream0);
      toNetASCIIOutputStream0.write(10);
  }
}
