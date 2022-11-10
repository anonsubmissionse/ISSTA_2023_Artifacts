/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:40:39 GMT 2022
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.SourceFile;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SourceFile_ESTest extends SourceFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      SourceFile sourceFile0 = new SourceFile(1079, 2135, 1079, constantPool0);
      sourceFile0.setSourceFileIndex(0);
      int int0 = sourceFile0.getSourceFileIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      SourceFile sourceFile0 = new SourceFile((-2616), 757, (-328), constantPool0);
      int int0 = sourceFile0.getSourceFileIndex();
      assertEquals((-328), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      SourceFile sourceFile0 = new SourceFile(0, 0, 3188, constantPool0);
      SourceFile sourceFile1 = (SourceFile)sourceFile0.copy(constantPool0);
      assertEquals(3188, sourceFile1.getSourceFileIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SourceFile sourceFile0 = new SourceFile((-1272), 0, 0, (ConstantPool) null);
      SourceFile sourceFile1 = (SourceFile)sourceFile0.copy((ConstantPool) null);
      assertEquals(0, sourceFile1.getSourceFileIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SourceFile sourceFile0 = new SourceFile((-1014), 1770, (-1014), (ConstantPool) null);
      SourceFile sourceFile1 = (SourceFile)sourceFile0.copy((ConstantPool) null);
      assertEquals((-1014), sourceFile1.getSourceFileIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      SourceFile sourceFile0 = new SourceFile(208, 208, 208, constantPool0);
      // Undeclared exception!
      try { 
        sourceFile0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      SourceFile sourceFile0 = new SourceFile((-941), 1891, (-941), constantPool0);
      // Undeclared exception!
      try { 
        sourceFile0.getSourceFileName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SourceFile sourceFile0 = new SourceFile((-1014), 1770, (-1014), (ConstantPool) null);
      // Undeclared exception!
      try { 
        sourceFile0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SourceFile sourceFile0 = null;
      try {
        sourceFile0 = new SourceFile((SourceFile) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.SourceFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SourceFile sourceFile0 = null;
      try {
        sourceFile0 = new SourceFile(0, 57, (DataInput) null, (ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.SourceFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      SourceFile sourceFile0 = new SourceFile((-4560), 1861, 216, constantPool0);
      int int0 = sourceFile0.getSourceFileIndex();
      assertEquals(216, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      SourceFile sourceFile0 = new SourceFile(1, 1, 1, constantPool0);
      // Undeclared exception!
      try { 
        sourceFile0.getSourceFileName();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 1. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      SourceFile sourceFile0 = new SourceFile(208, 208, 208, constantPool0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      sourceFile0.dump(dataOutputStream0);
      assertEquals("\u0000\uFFFD\u0000\u0000\u0000\uFFFD\u0000\uFFFD", byteArrayOutputStream0.toString());
      assertEquals(208, sourceFile0.getSourceFileIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      SourceFile sourceFile0 = new SourceFile(208, 208, 208, constantPool0);
      SourceFile sourceFile1 = new SourceFile(sourceFile0);
      assertEquals(208, sourceFile0.getSourceFileIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      SourceFile sourceFile0 = new SourceFile(141, (-172), 0, constantPool0);
      // Undeclared exception!
      try { 
        sourceFile0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 0 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      SourceFile sourceFile0 = new SourceFile(141, (-172), 0, constantPool0);
      SourceFile sourceFile1 = (SourceFile)sourceFile0.copy(constantPool0);
      assertEquals(0, sourceFile1.getSourceFileIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      SourceFile sourceFile0 = null;
      try {
        sourceFile0 = new SourceFile(0, 0, dataInputStream0, constantPool0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      SourceFile sourceFile0 = new SourceFile((-4560), 1861, 216, constantPool0);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      sourceFile0.accept(emptyVisitor0);
      assertEquals(216, sourceFile0.getSourceFileIndex());
  }
}
