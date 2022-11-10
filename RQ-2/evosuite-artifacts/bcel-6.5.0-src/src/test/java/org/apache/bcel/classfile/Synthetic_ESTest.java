/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:30:16 GMT 2022
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.Synthetic;
import org.apache.bcel.classfile.Visitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Synthetic_ESTest extends Synthetic_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Synthetic synthetic0 = new Synthetic(202, 202, byteArray0, constantPool0);
      ConstantPool constantPool1 = new ConstantPool(constantArray0);
      Attribute attribute0 = synthetic0.copy(constantPool1);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      Synthetic synthetic0 = new Synthetic(0, 0, byteArray0, constantPool0);
      String string0 = synthetic0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      Synthetic synthetic0 = new Synthetic(0, 0, byteArray0, constantPool0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      synthetic0.dump(dataOutputStream0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Synthetic synthetic0 = new Synthetic(2660, 2660, byteArray0, (ConstantPool) null);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      synthetic0.accept(emptyVisitor0);
      assertEquals(0, synthetic0.getLength());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Synthetic synthetic0 = new Synthetic((-1), (-1), (DataInput) null, constantPool0);
      byte[] byteArray0 = synthetic0.getBytes();
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Constant[] constantArray0 = new Constant[10];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      byte[] byteArray0 = new byte[0];
      Synthetic synthetic0 = new Synthetic((-1876), 2443, byteArray0, constantPool0);
      byte[] byteArray1 = synthetic0.getBytes();
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Synthetic synthetic0 = new Synthetic(0, (-367), (byte[]) null, (ConstantPool) null);
      Attribute attribute0 = synthetic0.copy((ConstantPool) null);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Synthetic synthetic0 = new Synthetic((-1758), 1, byteArray0, constantPool0);
      Attribute attribute0 = synthetic0.copy(constantPool0);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Synthetic synthetic0 = new Synthetic((byte)51, 0, (DataInput) null, (ConstantPool) null);
      Attribute attribute0 = synthetic0.copy((ConstantPool) null);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Synthetic synthetic0 = new Synthetic(75, 2792, (byte[]) null, (ConstantPool) null);
      // Undeclared exception!
      try { 
        synthetic0.toString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Utility", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Synthetic synthetic0 = new Synthetic(2660, 2660, byteArray0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        synthetic0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Attribute", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Synthetic synthetic0 = new Synthetic(232, 118, byteArray0, (ConstantPool) null);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        synthetic0.dump(dataOutputStream0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Synthetic synthetic0 = new Synthetic(202, 202, byteArray0, constantPool0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        synthetic0.dump(dataOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      Synthetic synthetic0 = new Synthetic(53, 53, byteArray0, (ConstantPool) null);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        synthetic0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Synthetic synthetic0 = null;
      try {
        synthetic0 = new Synthetic((Synthetic) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Synthetic", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      Synthetic synthetic0 = null;
      try {
        synthetic0 = new Synthetic(1496, 1496, (DataInput) null, constantPool0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Synthetic", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      Synthetic synthetic0 = null;
      try {
        synthetic0 = new Synthetic(1496, 2809, dataInputStream0, constantPool0);
        fail("Expecting exception: IOException");
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Synthetic synthetic0 = new Synthetic(235, 235, byteArray0, constantPool0);
      byte[] byteArray1 = synthetic0.getBytes();
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Synthetic synthetic0 = new Synthetic(19, (-367), (byte[]) null, (ConstantPool) null);
      MockFile mockFile0 = new MockFile("Synm|thetic");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      synthetic0.dump(dataOutputStream0);
      assertEquals(0, synthetic0.getNameIndex());
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Constant[] constantArray0 = new Constant[10];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1810, 1);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      Synthetic synthetic0 = null;
      try {
        synthetic0 = new Synthetic((-496), 202, dataInputStream0, constantPool0);
        fail("Expecting exception: EOFException");
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Synthetic synthetic0 = new Synthetic((-1), (-1), (DataInput) null, constantPool0);
      String string0 = synthetic0.toString();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Synthetic synthetic0 = new Synthetic(2660, 2660, byteArray0, (ConstantPool) null);
      synthetic0.setBytes(byteArray0);
      assertEquals(1, synthetic0.getLength());
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Synthetic synthetic0 = new Synthetic(2660, 2660, byteArray0, (ConstantPool) null);
      Synthetic synthetic1 = new Synthetic(synthetic0);
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Synthetic synthetic0 = new Synthetic(2532, 0, byteArray0, constantPool0);
      // Undeclared exception!
      try { 
        synthetic0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Synthetic", e);
      }
  }
}
