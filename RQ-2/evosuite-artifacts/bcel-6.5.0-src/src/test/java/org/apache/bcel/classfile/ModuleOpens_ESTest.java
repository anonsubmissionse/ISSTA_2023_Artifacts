/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:34:00 GMT 2022
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.ModuleOpens;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModuleOpens_ESTest extends ModuleOpens_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ModuleOpens moduleOpens0 = new ModuleOpens(dataInputStream0);
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        moduleOpens0.toString(constantPool0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 0. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ModuleOpens moduleOpens0 = new ModuleOpens(dataInputStream0);
      // Undeclared exception!
      try { 
        moduleOpens0.toString((ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ModuleOpens", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ModuleOpens moduleOpens0 = new ModuleOpens(dataInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        moduleOpens0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ModuleOpens moduleOpens0 = null;
      try {
        moduleOpens0 = new ModuleOpens((DataInput) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ModuleOpens", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-67), 222);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ModuleOpens moduleOpens0 = null;
      try {
        moduleOpens0 = new ModuleOpens(dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      ModuleOpens moduleOpens0 = null;
      try {
        moduleOpens0 = new ModuleOpens(dataInputStream0);
        fail("Expecting exception: IOException");
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      ModuleOpens moduleOpens0 = null;
      try {
        moduleOpens0 = new ModuleOpens(dataInputStream0);
        fail("Expecting exception: EOFException");
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ModuleOpens moduleOpens0 = new ModuleOpens(dataInputStream0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)116);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      moduleOpens0.dump(dataOutputStream0);
      assertNotNull(byteArrayOutputStream0.toString());
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ModuleOpens moduleOpens0 = new ModuleOpens(dataInputStream0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)116);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      moduleOpens0.dump(dataOutputStream0);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ModuleOpens moduleOpens0 = new ModuleOpens(dataInputStream0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)116);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      moduleOpens0.dump(dataOutputStream0);
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ModuleOpens moduleOpens0 = new ModuleOpens(dataInputStream0);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      moduleOpens0.accept(emptyVisitor0);
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ModuleOpens moduleOpens0 = new ModuleOpens(dataInputStream0);
      String string0 = moduleOpens0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ModuleOpens moduleOpens0 = new ModuleOpens(dataInputStream0);
      ModuleOpens moduleOpens1 = moduleOpens0.copy();
      ;
}
}
