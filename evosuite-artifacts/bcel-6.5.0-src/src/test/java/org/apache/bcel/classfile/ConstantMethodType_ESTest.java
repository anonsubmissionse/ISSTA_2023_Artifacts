/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:52:13 GMT 2022
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import org.apache.bcel.classfile.ConstantMethodType;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.Visitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantMethodType_ESTest extends ConstantMethodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType(0);
      constantMethodType0.setDescriptorIndex(65536);
      int int0 = constantMethodType0.getDescriptorIndex();
      assertEquals(65536, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType((-8583));
      int int0 = constantMethodType0.getDescriptorIndex();
      assertEquals((-8583), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType((-1916));
      // Undeclared exception!
      try { 
        constantMethodType0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantMethodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType(1132);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        constantMethodType0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType(0);
      // Undeclared exception!
      try { 
        constantMethodType0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantMethodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantMethodType constantMethodType0 = null;
      try {
        constantMethodType0 = new ConstantMethodType((ConstantMethodType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantMethodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0, 1404);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      ConstantMethodType constantMethodType0 = null;
      try {
        constantMethodType0 = new ConstantMethodType(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.bcel.classfile.ConstantCP", "?5O7A", (File) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      ConstantMethodType constantMethodType0 = null;
      try {
        constantMethodType0 = new ConstantMethodType(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType((-8583));
      String string0 = constantMethodType0.toString();
      assertEquals("CONSTANT_MethodType[16](descriptorIndex = -8583)", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantMethodType constantMethodType0 = new ConstantMethodType(dataInputStream0);
      assertEquals(0, constantMethodType0.getDescriptorIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType(0);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      constantMethodType0.accept(emptyVisitor0);
      assertEquals(0, constantMethodType0.getDescriptorIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantMethodType constantMethodType0 = null;
      try {
        constantMethodType0 = new ConstantMethodType((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantMethodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType(558);
      ConstantMethodType constantMethodType1 = new ConstantMethodType(constantMethodType0);
      assertEquals(558, constantMethodType0.getDescriptorIndex());
      assertTrue(constantMethodType1.equals((Object)constantMethodType0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType(0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Z", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      constantMethodType0.dump(dataOutputStream0);
      assertEquals(0, constantMethodType0.getDescriptorIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType(0);
      int int0 = constantMethodType0.getDescriptorIndex();
      assertEquals(0, int0);
  }
}
