/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:31:25 GMT 2022
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
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
import org.apache.bcel.classfile.BootstrapMethod;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BootstrapMethod_ESTest extends BootstrapMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[0];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(124, intArray0);
      bootstrapMethod0.getNumBootstrapArguments();
      assertEquals(124, bootstrapMethod0.getBootstrapMethodRef());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[3];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod((-2601), intArray0);
      int int0 = bootstrapMethod0.getBootstrapMethodRef();
      assertEquals((-2601), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[2];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod((-123), intArray0);
      bootstrapMethod0.getBootstrapArguments();
      assertEquals((-123), bootstrapMethod0.getBootstrapMethodRef());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[0];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(2482, intArray0);
      bootstrapMethod0.getBootstrapArguments();
      assertEquals(2482, bootstrapMethod0.getBootstrapMethodRef());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[0];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(2482, intArray0);
      bootstrapMethod0.setBootstrapMethodRef(0);
      bootstrapMethod0.copy();
      assertEquals(0, bootstrapMethod0.getBootstrapMethodRef());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[3];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod((-2601), intArray0);
      BootstrapMethod bootstrapMethod1 = bootstrapMethod0.copy();
      assertEquals((-2601), bootstrapMethod1.getBootstrapMethodRef());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[14];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod((-4065), intArray0);
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        bootstrapMethod0.toString(constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -4065. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[7];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod((-1), intArray0);
      // Undeclared exception!
      try { 
        bootstrapMethod0.toString((ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.BootstrapMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(3575, (int[]) null);
      // Undeclared exception!
      try { 
        bootstrapMethod0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.BootstrapMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(1, (int[]) null);
      // Undeclared exception!
      try { 
        bootstrapMethod0.getNumBootstrapArguments();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.BootstrapMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(0, (int[]) null);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        bootstrapMethod0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[8];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod((-650), intArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        bootstrapMethod0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BootstrapMethod bootstrapMethod0 = null;
      try {
        bootstrapMethod0 = new BootstrapMethod((BootstrapMethod) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.BootstrapMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BootstrapMethod bootstrapMethod0 = null;
      try {
        bootstrapMethod0 = new BootstrapMethod((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.BootstrapMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-127), 1956);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      BootstrapMethod bootstrapMethod0 = null;
      try {
        bootstrapMethod0 = new BootstrapMethod(dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -127
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      BootstrapMethod bootstrapMethod0 = null;
      try {
        bootstrapMethod0 = new BootstrapMethod(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[2];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(15, intArray0);
      int int0 = bootstrapMethod0.getBootstrapMethodRef();
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(1, (int[]) null);
      bootstrapMethod0.getBootstrapArguments();
      assertEquals(1, bootstrapMethod0.getBootstrapMethodRef());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[1];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(704, intArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      bootstrapMethod0.dump(dataOutputStream0);
      assertEquals(6, byteArrayOutputStream0.size());
      assertEquals(704, bootstrapMethod0.getBootstrapMethodRef());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)9;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      BootstrapMethod bootstrapMethod0 = null;
      try {
        bootstrapMethod0 = new BootstrapMethod(dataInputStream0);
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
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(dataInputStream0);
      assertEquals(0, bootstrapMethod0.getBootstrapMethodRef());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[1];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(704, intArray0);
      BootstrapMethod bootstrapMethod1 = bootstrapMethod0.copy();
      assertEquals(704, bootstrapMethod1.getBootstrapMethodRef());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(0, (int[]) null);
      bootstrapMethod0.setBootstrapArguments((int[]) null);
      assertEquals(0, bootstrapMethod0.getBootstrapMethodRef());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[1];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(704, intArray0);
      bootstrapMethod0.setBootstrapMethodRef(0);
      int int0 = bootstrapMethod0.getBootstrapMethodRef();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[1];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(704, intArray0);
      String string0 = bootstrapMethod0.toString();
      assertEquals("BootstrapMethod(704, 1, [0])", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[1];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(704, intArray0);
      bootstrapMethod0.getNumBootstrapArguments();
      assertEquals(704, bootstrapMethod0.getBootstrapMethodRef());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[1];
      BootstrapMethod bootstrapMethod0 = new BootstrapMethod(704, intArray0);
      BootstrapMethod bootstrapMethod1 = new BootstrapMethod(bootstrapMethod0);
      assertEquals(704, bootstrapMethod0.getBootstrapMethodRef());
  }
}
