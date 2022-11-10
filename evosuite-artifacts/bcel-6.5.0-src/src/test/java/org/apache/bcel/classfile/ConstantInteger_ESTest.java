/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:41:09 GMT 2022
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantInteger;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.DescendingVisitor;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Visitor;
import org.apache.bcel.util.ClassLoaderRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantInteger_ESTest extends ConstantInteger_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstantInteger constantInteger0 = new ConstantInteger((-283));
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<PushbackInputStream> class0 = PushbackInputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      DescendingVisitor descendingVisitor0 = new DescendingVisitor(javaClass0, emptyVisitor0);
      constantInteger0.accept(descendingVisitor0);
      assertEquals((-283), constantInteger0.getBytes());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConstantInteger constantInteger0 = new ConstantInteger(0);
      int int0 = constantInteger0.getBytes();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstantInteger constantInteger0 = new ConstantInteger(128);
      int int0 = constantInteger0.getBytes();
      assertEquals(128, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantInteger constantInteger0 = new ConstantInteger(0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        constantInteger0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstantInteger constantInteger0 = new ConstantInteger((-4062));
      MockFile mockFile0 = new MockFile("([4_a)~'Yq", ")");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dataOutputStream0.close();
      try { 
        constantInteger0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantInteger constantInteger0 = null;
      try {
        constantInteger0 = new ConstantInteger((ConstantInteger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1495);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      ConstantInteger constantInteger0 = null;
      try {
        constantInteger0 = new ConstantInteger(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte) (-75));
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)116);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      ConstantInteger constantInteger0 = null;
      try {
        constantInteger0 = new ConstantInteger(dataInputStream0);
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
      ConstantInteger constantInteger0 = new ConstantInteger((-283));
      int int0 = constantInteger0.getBytes();
      assertEquals((-283), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstantInteger constantInteger0 = new ConstantInteger((-5262));
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      constantInteger0.dump(dataOutputStream0);
      assertEquals("\u0003\uFFFD\uFFFD\uFFFDr", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstantInteger constantInteger0 = new ConstantInteger((-5262));
      // Undeclared exception!
      try { 
        constantInteger0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantInteger constantInteger0 = new ConstantInteger((-5262));
      Constant[] constantArray0 = new Constant[8];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Object object0 = constantInteger0.getConstantValue(constantPool0);
      assertEquals((-5262), object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantInteger constantInteger0 = null;
      try {
        constantInteger0 = new ConstantInteger((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantInteger constantInteger0 = new ConstantInteger(16384);
      String string0 = constantInteger0.toString();
      assertEquals("CONSTANT_Integer[3](bytes = 16384)", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantInteger constantInteger0 = new ConstantInteger(16384);
      constantInteger0.setBytes(16384);
      assertEquals(16384, constantInteger0.getBytes());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantInteger constantInteger0 = new ConstantInteger(16384);
      ConstantInteger constantInteger1 = new ConstantInteger(constantInteger0);
      assertEquals(16384, constantInteger0.getBytes());
      assertTrue(constantInteger1.equals((Object)constantInteger0));
  }
}
