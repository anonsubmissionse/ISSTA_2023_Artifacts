/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 21:23:13 GMT 2022
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantDouble;
import org.apache.bcel.classfile.ConstantDynamic;
import org.apache.bcel.classfile.ConstantFieldref;
import org.apache.bcel.classfile.ConstantFloat;
import org.apache.bcel.classfile.ConstantInteger;
import org.apache.bcel.classfile.ConstantInterfaceMethodref;
import org.apache.bcel.classfile.ConstantInvokeDynamic;
import org.apache.bcel.classfile.ConstantLong;
import org.apache.bcel.classfile.ConstantMethodHandle;
import org.apache.bcel.classfile.ConstantMethodType;
import org.apache.bcel.classfile.ConstantMethodref;
import org.apache.bcel.classfile.ConstantModule;
import org.apache.bcel.classfile.ConstantNameAndType;
import org.apache.bcel.classfile.ConstantPackage;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantString;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Visitor;
import org.apache.bcel.util.ClassLoaderRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantPool_ESTest extends ConstantPool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantDynamic constantDynamic0 = new ConstantDynamic(6, 830);
      constantArray0[0] = (Constant) constantDynamic0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      try { 
        constantPool0.getConstantString((byte)0, (byte)0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected class `' at index 0 and got CONSTANT_Dynamic[17](bootstrap_method_attr_index = 6, name_and_type_index = 830)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(3483);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      constantPool0.dump(dataOutputStream0);
      assertEquals(0, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(0, 0);
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      constantPool0.setConstant(0, constantInvokeDynamic0);
      assertEquals(0, constantInvokeDynamic0.getNameAndTypeIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Constant[] constantArray0 = new Constant[10];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle(6, 6);
      // Undeclared exception!
      try { 
        constantPool0.constantToString((Constant) constantMethodHandle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      constantPool0.accept(emptyVisitor0);
      assertEquals(0, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      String string0 = constantPool0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      Constant[] constantArray0 = constantPool0.getConstantPool();
      assertNull(constantArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Constant[] constantArray1 = constantPool0.getConstantPool();
      assertEquals(0, constantArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getCachedInstance("Unknown constant type ");
      constantArray0[3] = (Constant) constantUtf8_0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Constant constant0 = constantPool0.getConstant((int) (byte)3);
      assertSame(constant0, constantUtf8_0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPool constantPool1 = constantPool0.copy();
      assertNotSame(constantPool1, constantPool0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getInstance("");
      constantArray0[3] = (Constant) constantUtf8_0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      String string0 = constantPool0.constantToString((int) (byte)3, (byte)1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      // Undeclared exception!
      try { 
        constantPool0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Constant[] constantArray0 = new Constant[7];
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      // Undeclared exception!
      try { 
        constantPool0.setConstant(1888, constantArray0[0]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      try { 
        constantPool0.getConstantString(64000, (byte)113);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 64000. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      // Undeclared exception!
      try { 
        constantPool0.getConstantString((-1955), (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getInstance("' at index ");
      constantArray0[0] = (Constant) constantUtf8_0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        constantPool0.getConstantString(0, (byte)74);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 74
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      // Undeclared exception!
      try { 
        constantPool0.getConstant(1096, (byte)1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      // Undeclared exception!
      try { 
        constantPool0.getConstant(12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Constant[] constantArray0 = new Constant[13];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        constantPool0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      FileSystemHandling.shouldAllThrowIOExceptions();
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Unknown constant type ", false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        constantPool0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      // Undeclared exception!
      try { 
        constantPool0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      try { 
        constantPool0.constantToString(118, (byte) (-72));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 118. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      // Undeclared exception!
      try { 
        constantPool0.constantToString((-5040), (byte)66);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Constant[] constantArray0 = new Constant[13];
      ConstantInterfaceMethodref constantInterfaceMethodref0 = new ConstantInterfaceMethodref(0, 0);
      constantArray0[2] = (Constant) constantInterfaceMethodref0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        constantPool0.constantToString((int) (byte)2, (byte)94);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 94
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      ConstantPool constantPool0 = null;
      try {
        constantPool0 = new ConstantPool(dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-100), 305);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantPool constantPool0 = null;
      try {
        constantPool0 = new ConstantPool(dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      ConstantPool constantPool0 = null;
      try {
        constantPool0 = new ConstantPool(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      ConstantPool constantPool0 = null;
      try {
        constantPool0 = new ConstantPool(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getInstance("Unknown constant type ");
      constantArray0[3] = (Constant) constantUtf8_0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantUtf8 constantUtf8_1 = (ConstantUtf8)constantPool0.getConstant((int) (byte)3, (byte)1);
      assertEquals("Unknown constant type ", constantUtf8_1.getBytes());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Constant[] constantArray0 = new Constant[16];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      try { 
        constantPool0.getConstant(0, (byte)102);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 0 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantInteger constantInteger0 = new ConstantInteger(1411);
      constantArray0[0] = (Constant) constantInteger0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        constantPool0.getConstant(0, (byte)102);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 102
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        constantPool0.getConstant(137);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 137. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        constantPool0.getConstant((-3484));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -3484. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Constant[] constantArray0 = new Constant[13];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Constant constant0 = constantPool0.getConstant(0);
      assertNull(constant0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("");
      String string0 = constantPool0.constantToString((Constant) constantUtf8_0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-30);
      byteArray0[2] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantPool constantPool0 = null;
      try {
        constantPool0 = new ConstantPool(dataInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid byte tag in constant pool: 0
         //
         verifyException("org.apache.bcel.classfile.Constant", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantPool constantPool0 = new ConstantPool(dataInputStream0);
      assertEquals(0, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantInterfaceMethodref constantInterfaceMethodref0 = new ConstantInterfaceMethodref(0, 0);
      constantArray0[2] = (Constant) constantInterfaceMethodref0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPool constantPool1 = constantPool0.copy();
      assertNotSame(constantPool1, constantPool0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      String string0 = constantPool0.toString();
      assertEquals("1)null\n2)null\n3)null\n4)null\n", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      int int0 = constantPool0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      int int0 = constantPool0.getLength();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getCachedInstance("Unknown constant type ");
      constantArray0[3] = (Constant) constantUtf8_0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        constantPool0.getConstantString((byte)3, (byte)1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // getConstantString called with illegal tag 1
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantInteger constantInteger0 = new ConstantInteger(1414);
      constantArray0[0] = (Constant) constantInteger0;
      ConstantInterfaceMethodref constantInterfaceMethodref0 = new ConstantInterfaceMethodref(0, 0);
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      try { 
        constantPool0.constantToString((Constant) constantInterfaceMethodref0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected class `CONSTANT_Class' at index 0 and got CONSTANT_Integer[3](bytes = 1414)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantInterfaceMethodref constantInterfaceMethodref0 = new ConstantInterfaceMethodref(0, 0);
      constantArray0[2] = (Constant) constantInterfaceMethodref0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Unknown constant type ", false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      constantPool0.dump(dataOutputStream0);
      assertEquals(5, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      ConstantPackage constantPackage0 = new ConstantPackage(2596);
      // Undeclared exception!
      try { 
        constantPool0.constantToString((Constant) constantPackage0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantModule constantModule0 = new ConstantModule(10);
      try { 
        constantPool0.constantToString((Constant) constantModule0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 10. Constant pool size is: 1
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(0, 0);
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      try { 
        constantPool0.constantToString((Constant) constantInvokeDynamic0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 0 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Constant[] constantArray0 = new Constant[25];
      ConstantDynamic constantDynamic0 = new ConstantDynamic(2, 2);
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        constantPool0.constantToString((Constant) constantDynamic0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown constant type 17
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle(2292, 2292);
      // Undeclared exception!
      try { 
        constantPool0.constantToString((Constant) constantMethodHandle0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2292
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantNameAndType constantNameAndType0 = new ConstantNameAndType(1, 64000);
      try { 
        constantPool0.constantToString((Constant) constantNameAndType0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 1. Constant pool size is: 1
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantMethodref constantMethodref0 = new ConstantMethodref((-2180), (-1560));
      try { 
        constantPool0.constantToString((Constant) constantMethodref0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -2180. Constant pool size is: 1
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantFieldref constantFieldref0 = new ConstantFieldref(5, 0);
      try { 
        constantPool0.constantToString((Constant) constantFieldref0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 5. Constant pool size is: 5
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Constant[] constantArray0 = new Constant[9];
      ConstantString constantString0 = new ConstantString((-3199));
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      try { 
        constantPool0.constantToString((Constant) constantString0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -3199. Constant pool size is: 9
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ConstantClass constantClass0 = new ConstantClass(830);
      Constant[] constantArray0 = new Constant[3];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      try { 
        constantPool0.constantToString((Constant) constantClass0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 830. Constant pool size is: 3
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Constant[] constantArray0 = new Constant[8];
      ConstantDouble constantDouble0 = new ConstantDouble(350.6590220157738);
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      String string0 = constantPool0.constantToString((Constant) constantDouble0);
      assertEquals("350.6590220157738", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      ConstantLong constantLong0 = new ConstantLong(96);
      String string0 = constantPool0.constantToString((Constant) constantLong0);
      assertEquals("96", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      ConstantFloat constantFloat0 = new ConstantFloat(3591.296F);
      String string0 = constantPool0.constantToString((Constant) constantFloat0);
      assertEquals("3591.296", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Constant[] constantArray0 = new Constant[24];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantInteger constantInteger0 = new ConstantInteger(157);
      String string0 = constantPool0.constantToString((Constant) constantInteger0);
      assertEquals("157", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getInstance("Unknown xonstant type ");
      constantArray0[3] = (Constant) constantUtf8_0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      String string0 = constantPool0.constantToString((int) (byte)3, (byte)1);
      assertEquals("Unknown xonstant type ", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      assertEquals("java.lang.Integer", javaClass0.getClassName());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Constant[] constantArray1 = constantPool0.getConstantPool();
      assertSame(constantArray0, constantArray1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        constantPool0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        constantPool0.setConstant(1869, constantArray0[0]);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1869
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      constantPool0.setConstantPool(constantArray0);
      assertEquals(1, constantArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType((-22));
      Constant[] constantArray0 = new Constant[10];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      try { 
        constantPool0.constantToString((Constant) constantMethodType0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -22. Constant pool size is: 10
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
}
