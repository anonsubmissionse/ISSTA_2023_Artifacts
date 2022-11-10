/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:42:54 GMT 2022
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPackage;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.Visitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantPackage_ESTest extends ConstantPackage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)9;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      ConstantPackage constantPackage0 = new ConstantPackage(dataInputStream0);
      int int0 = constantPackage0.getNameIndex();
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConstantPackage constantPackage0 = new ConstantPackage((-1647));
      int int0 = constantPackage0.getNameIndex();
      assertEquals((-1647), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstantPackage constantPackage0 = new ConstantPackage(0);
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        constantPackage0.getConstantValue(constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 0 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantPackage constantPackage0 = new ConstantPackage(829);
      // Undeclared exception!
      try { 
        constantPackage0.getBytes((ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPackage", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstantPackage constantPackage0 = new ConstantPackage(352);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        constantPackage0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantPackage constantPackage0 = new ConstantPackage(195);
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("qZ~B{P>$'oya", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        constantPackage0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstantPackage constantPackage0 = new ConstantPackage(0);
      // Undeclared exception!
      try { 
        constantPackage0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPackage", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConstantPackage constantPackage0 = null;
      try {
        constantPackage0 = new ConstantPackage((ConstantPackage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPackage", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      ConstantPackage constantPackage0 = null;
      try {
        constantPackage0 = new ConstantPackage(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 152);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      ConstantPackage constantPackage0 = null;
      try {
        constantPackage0 = new ConstantPackage(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstantPackage constantPackage0 = new ConstantPackage(0);
      // Undeclared exception!
      try { 
        constantPackage0.getConstantValue((ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPackage", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantPackage constantPackage0 = new ConstantPackage(0);
      File file0 = MockFile.createTempFile("/86NrM%FcD1Lqc", "wJg1", (File) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      constantPackage0.dump(dataOutputStream0);
      assertEquals(0, constantPackage0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantPackage constantPackage0 = new ConstantPackage(195);
      ConstantPackage constantPackage1 = new ConstantPackage(constantPackage0);
      assertEquals(195, constantPackage0.getNameIndex());
      assertTrue(constantPackage1.equals((Object)constantPackage0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantPackage constantPackage0 = new ConstantPackage(577);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      constantPackage0.accept(emptyVisitor0);
      assertEquals(577, constantPackage0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantPackage constantPackage0 = new ConstantPackage(0);
      int int0 = constantPackage0.getNameIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantPackage constantPackage0 = new ConstantPackage(0);
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        constantPackage0.getBytes(constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 0. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstantPackage constantPackage0 = new ConstantPackage(0);
      constantPackage0.setNameIndex((-1847));
      assertEquals((-1847), constantPackage0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      ConstantPackage constantPackage0 = null;
      try {
        constantPackage0 = new ConstantPackage(dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstantPackage constantPackage0 = new ConstantPackage((-2398));
      String string0 = constantPackage0.toString();
      assertEquals("CONSTANT_Package[20](nameIndex = -2398)", string0);
  }
}
