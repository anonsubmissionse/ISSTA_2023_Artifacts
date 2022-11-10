/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:38:57 GMT 2022
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
import java.io.PipedOutputStream;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.LocalVariable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocalVariable_ESTest extends LocalVariable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable(0, (-1), 1507, 2349, (-1), (ConstantPool) null);
      int int0 = localVariable0.getStartPC();
      assertEquals(0, int0);
      assertEquals((-1), localVariable0.getOrigIndex());
      assertEquals(2349, localVariable0.getSignatureIndex());
      assertEquals((-1), localVariable0.getLength());
      assertEquals((-1), localVariable0.getIndex());
      assertEquals(1507, localVariable0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable(2832, 2832, 2832, 3245, 2832, (ConstantPool) null);
      int int0 = localVariable0.getStartPC();
      assertEquals(2832, localVariable0.getOrigIndex());
      assertEquals(2832, int0);
      assertEquals(2832, localVariable0.getLength());
      assertEquals(2832, localVariable0.getIndex());
      assertEquals(3245, localVariable0.getSignatureIndex());
      assertEquals(2832, localVariable0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariable localVariable0 = new LocalVariable(1, 1, 1, 1, 0, constantPool0);
      int int0 = localVariable0.getSignatureIndex();
      assertEquals(1, int0);
      assertEquals(1, localVariable0.getLength());
      assertEquals(0, localVariable0.getOrigIndex());
      assertEquals(1, localVariable0.getNameIndex());
      assertEquals(1, localVariable0.getStartPC());
      assertEquals(0, localVariable0.getIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable(0, 1439, 1766, 0, 0, (ConstantPool) null);
      int int0 = localVariable0.getNameIndex();
      assertEquals(0, localVariable0.getStartPC());
      assertEquals(0, localVariable0.getIndex());
      assertEquals(1766, int0);
      assertEquals(1439, localVariable0.getLength());
      assertEquals(0, localVariable0.getSignatureIndex());
      assertEquals(0, localVariable0.getOrigIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariable localVariable0 = new LocalVariable(1, 1, 1, 1, 0, constantPool0);
      assertEquals(1, localVariable0.getLength());
      
      localVariable0.setLength(0);
      int int0 = localVariable0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-2803), (-2803), (-2803), (-1790), 107, (ConstantPool) null, (-2803));
      int int0 = localVariable0.getLength();
      assertEquals((-2803), localVariable0.getOrigIndex());
      assertEquals((-2803), localVariable0.getNameIndex());
      assertEquals((-2803), int0);
      assertEquals((-2803), localVariable0.getStartPC());
      assertEquals(107, localVariable0.getIndex());
      assertEquals((-1790), localVariable0.getSignatureIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariable localVariable0 = new LocalVariable(1, 1, 1, 1, 0, constantPool0);
      int int0 = localVariable0.getIndex();
      assertEquals(1, localVariable0.getStartPC());
      assertEquals(1, localVariable0.getLength());
      assertEquals(0, int0);
      assertEquals(0, localVariable0.getOrigIndex());
      assertEquals(1, localVariable0.getSignatureIndex());
      assertEquals(1, localVariable0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariable localVariable0 = new LocalVariable(1352, 0, (-2353), 0, (-1), constantPool0);
      int int0 = localVariable0.getIndex();
      assertEquals((-1), localVariable0.getOrigIndex());
      assertEquals((-2353), localVariable0.getNameIndex());
      assertEquals(0, localVariable0.getSignatureIndex());
      assertEquals(1352, localVariable0.getStartPC());
      assertEquals(0, localVariable0.getLength());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-1300), (-1300), (-1300), (-1300), (-2241), (ConstantPool) null, (-2241));
      localVariable0.getConstantPool();
      assertEquals((-1300), localVariable0.getSignatureIndex());
      assertEquals((-1300), localVariable0.getLength());
      assertEquals((-2241), localVariable0.getIndex());
      assertEquals((-2241), localVariable0.getOrigIndex());
      assertEquals((-1300), localVariable0.getStartPC());
      assertEquals((-1300), localVariable0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      LocalVariable localVariable0 = new LocalVariable(1, 0, 1, 1, 1, constantPool0, 1);
      localVariable0.getConstantPool();
      assertEquals(1, localVariable0.getOrigIndex());
      assertEquals(1, localVariable0.getStartPC());
      assertEquals(1, localVariable0.getNameIndex());
      assertEquals(1, localVariable0.getSignatureIndex());
      assertEquals(0, localVariable0.getLength());
      assertEquals(1, localVariable0.getIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      LocalVariable localVariable0 = new LocalVariable(1, 0, 1, 1, 1, constantPool0, 1);
      LocalVariable localVariable1 = localVariable0.copy();
      assertEquals(1, localVariable1.getStartPC());
      assertEquals(1, localVariable1.getNameIndex());
      assertEquals(1, localVariable1.getOrigIndex());
      assertEquals(1, localVariable1.getSignatureIndex());
      assertEquals(1, localVariable1.getIndex());
      assertEquals(0, localVariable1.getLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable(756, 756, 756, 111, 0, (ConstantPool) null, (-5));
      LocalVariable localVariable1 = localVariable0.copy();
      assertEquals(756, localVariable1.getLength());
      assertEquals(756, localVariable1.getNameIndex());
      assertEquals(0, localVariable1.getIndex());
      assertEquals((-5), localVariable1.getOrigIndex());
      assertEquals(756, localVariable1.getStartPC());
      assertEquals(111, localVariable1.getSignatureIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Constant[] constantArray0 = new Constant[7];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariable localVariable0 = new LocalVariable(2313, 0, 0, (-1854), (-1854), constantPool0);
      LocalVariable localVariable1 = localVariable0.copy();
      assertEquals(0, localVariable1.getLength());
      assertEquals((-1854), localVariable1.getSignatureIndex());
      assertEquals((-1854), localVariable1.getOrigIndex());
      assertEquals(0, localVariable1.getNameIndex());
      assertEquals(2313, localVariable1.getStartPC());
      assertEquals((-1854), localVariable1.getIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-1300), (-1300), (-1300), (-1300), (-2241), (ConstantPool) null, (-2241));
      // Undeclared exception!
      try { 
        localVariable0.toStringShared(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.LocalVariable", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariable localVariable0 = new LocalVariable(2490, 2490, 168, 2490, 2490, constantPool0);
      // Undeclared exception!
      try { 
        localVariable0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 168. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariable localVariable0 = new LocalVariable(1, 1, 1, 1, 0, constantPool0);
      // Undeclared exception!
      try { 
        localVariable0.getSignature();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 1. Constant pool size is: 1
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      LocalVariable localVariable0 = new LocalVariable((-425), (-425), 795, 795, (-425), constantPool0);
      // Undeclared exception!
      try { 
        localVariable0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.LocalVariable", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalVariable localVariable0 = null;
      try {
        localVariable0 = new LocalVariable((LocalVariable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.LocalVariable", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      LocalVariable localVariable0 = null;
      try {
        localVariable0 = new LocalVariable((DataInput) null, constantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.LocalVariable", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariable localVariable0 = new LocalVariable(1, 1, 1, 1, 0, constantPool0);
      localVariable0.getConstantPool();
      assertEquals(1, localVariable0.getLength());
      assertEquals(1, localVariable0.getNameIndex());
      assertEquals(1, localVariable0.getStartPC());
      assertEquals(0, localVariable0.getIndex());
      assertEquals(0, localVariable0.getOrigIndex());
      assertEquals(1, localVariable0.getSignatureIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-1300), (-1300), (-1300), (-1300), (-2241), (ConstantPool) null, (-2241));
      int int0 = localVariable0.getStartPC();
      assertEquals((-1300), localVariable0.getLength());
      assertEquals((-2241), localVariable0.getOrigIndex());
      assertEquals((-1300), localVariable0.getNameIndex());
      assertEquals((-2241), localVariable0.getIndex());
      assertEquals((-1300), localVariable0.getSignatureIndex());
      assertEquals((-1300), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable(177, 0, 1, (-2407), 1846, (ConstantPool) null);
      int int0 = localVariable0.getOrigIndex();
      assertEquals(0, localVariable0.getLength());
      assertEquals(1846, int0);
      assertEquals(1, localVariable0.getNameIndex());
      assertEquals(177, localVariable0.getStartPC());
      assertEquals(1846, localVariable0.getIndex());
      assertEquals((-2407), localVariable0.getSignatureIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable(177, 0, 1, (-2407), 1846, (ConstantPool) null);
      // Undeclared exception!
      try { 
        localVariable0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.LocalVariable", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariable localVariable0 = new LocalVariable(1, 1, 1, 1, 0, constantPool0);
      int int0 = localVariable0.getLength();
      assertEquals(1, localVariable0.getStartPC());
      assertEquals(0, localVariable0.getIndex());
      assertEquals(1, localVariable0.getSignatureIndex());
      assertEquals(0, localVariable0.getOrigIndex());
      assertEquals(1, int0);
      assertEquals(1, localVariable0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-1300), (-1300), (-1300), (-1300), (-2241), (ConstantPool) null, (-2241));
      int int0 = localVariable0.getNameIndex();
      assertEquals((-1300), int0);
      assertEquals((-1300), localVariable0.getSignatureIndex());
      assertEquals((-1300), localVariable0.getLength());
      assertEquals((-2241), localVariable0.getIndex());
      assertEquals((-1300), localVariable0.getStartPC());
      assertEquals((-2241), localVariable0.getOrigIndex());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable(1, 1, 1, 1, 1, (ConstantPool) null, 1);
      int int0 = localVariable0.getIndex();
      assertEquals(1, localVariable0.getStartPC());
      assertEquals(1, localVariable0.getNameIndex());
      assertEquals(1, localVariable0.getLength());
      assertEquals(1, localVariable0.getSignatureIndex());
      assertEquals(1, int0);
      assertEquals(1, localVariable0.getOrigIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-1300), (-1300), (-1300), (-1300), (-2241), (ConstantPool) null, (-2241));
      int int0 = localVariable0.getSignatureIndex();
      assertEquals((-2241), localVariable0.getIndex());
      assertEquals((-1300), localVariable0.getLength());
      assertEquals((-1300), localVariable0.getStartPC());
      assertEquals((-1300), int0);
      assertEquals((-2241), localVariable0.getOrigIndex());
      assertEquals((-1300), localVariable0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-1300), (-1300), (-1300), (-1300), (-2241), (ConstantPool) null, (-2241));
      // Undeclared exception!
      try { 
        localVariable0.getSignature();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.LocalVariable", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-2803), (-2803), (-2803), (-1790), 107, (ConstantPool) null, (-2803));
      LocalVariable localVariable1 = localVariable0.copy();
      assertEquals((-2803), localVariable1.getNameIndex());
      assertEquals((-2803), localVariable1.getStartPC());
      assertEquals(107, localVariable1.getIndex());
      assertEquals((-2803), localVariable1.getOrigIndex());
      assertEquals((-2803), localVariable1.getLength());
      assertEquals((-1790), localVariable1.getSignatureIndex());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, 1);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      LocalVariable localVariable0 = null;
      try {
        localVariable0 = new LocalVariable(dataInputStream0, constantPool0);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-1300), (-1300), (-1300), (-1300), (-2241), (ConstantPool) null, (-2241));
      localVariable0.setSignatureIndex((-3120));
      assertEquals((-3120), localVariable0.getSignatureIndex());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-1300), (-1300), (-1300), (-1300), (-2241), (ConstantPool) null, (-2241));
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      localVariable0.dump(dataOutputStream0);
      assertEquals((-1300), localVariable0.getSignatureIndex());
      assertEquals((-2241), localVariable0.getOrigIndex());
      assertEquals((-1300), localVariable0.getNameIndex());
      assertEquals((-1300), localVariable0.getStartPC());
      assertEquals((-1300), localVariable0.getLength());
      assertEquals((-2241), localVariable0.getIndex());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-2803), (-2803), (-2803), (-1790), 107, (ConstantPool) null, (-2803));
      localVariable0.setIndex(936);
      assertEquals(936, localVariable0.getIndex());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-2803), (-2803), (-2803), (-1790), 107, (ConstantPool) null, (-2803));
      assertEquals((-2803), localVariable0.getStartPC());
      
      localVariable0.setStartPC((-1790));
      assertEquals(107, localVariable0.getIndex());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-2803), (-2803), (-2803), (-1790), 107, (ConstantPool) null, (-2803));
      assertEquals((-2803), localVariable0.getNameIndex());
      
      localVariable0.setNameIndex(107);
      assertEquals(107, localVariable0.getIndex());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-1300), (-1300), (-1300), (-1300), (-2241), (ConstantPool) null, (-2241));
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      localVariable0.accept(emptyVisitor0);
      assertEquals((-1300), localVariable0.getLength());
      assertEquals((-1300), localVariable0.getNameIndex());
      assertEquals((-1300), localVariable0.getStartPC());
      assertEquals((-2241), localVariable0.getOrigIndex());
      assertEquals((-1300), localVariable0.getSignatureIndex());
      assertEquals((-2241), localVariable0.getIndex());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable(1, 1, 1, 1, 1, (ConstantPool) null, 1);
      localVariable0.setConstantPool((ConstantPool) null);
      assertEquals(1, localVariable0.getStartPC());
      assertEquals(1, localVariable0.getNameIndex());
      assertEquals(1, localVariable0.getLength());
      assertEquals(1, localVariable0.getIndex());
      assertEquals(1, localVariable0.getSignatureIndex());
      assertEquals(1, localVariable0.getOrigIndex());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-1300), (-1300), (-1300), (-1300), (-2241), (ConstantPool) null, (-2241));
      LocalVariable localVariable1 = new LocalVariable(localVariable0);
      assertEquals((-1300), localVariable1.getStartPC());
      assertEquals((-2241), localVariable1.getOrigIndex());
      assertEquals((-1300), localVariable1.getLength());
      assertEquals((-1300), localVariable1.getNameIndex());
      assertEquals((-1300), localVariable0.getSignatureIndex());
      assertEquals((-2241), localVariable1.getIndex());
      assertEquals((-1300), localVariable1.getSignatureIndex());
      assertEquals((-2241), localVariable0.getIndex());
      assertEquals((-1300), localVariable0.getStartPC());
      assertEquals((-1300), localVariable0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalVariable localVariable0 = new LocalVariable((-2894), (-2894), (-2894), (-2894), (-2894), (ConstantPool) null, (-2894));
      // Undeclared exception!
      try { 
        localVariable0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.LocalVariable", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariable localVariable0 = new LocalVariable(1, 375, 0, 375, 1058, constantPool0, 1058);
      // Undeclared exception!
      try { 
        localVariable0.toStringShared(true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 0. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
}
