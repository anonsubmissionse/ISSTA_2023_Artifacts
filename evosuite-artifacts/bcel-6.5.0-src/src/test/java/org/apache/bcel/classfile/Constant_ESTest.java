/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:02:12 GMT 2022
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.PipedInputStream;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantFloat;
import org.apache.bcel.classfile.ConstantInteger;
import org.apache.bcel.classfile.ConstantInvokeDynamic;
import org.apache.bcel.classfile.ConstantMethodHandle;
import org.apache.bcel.classfile.ConstantMethodType;
import org.apache.bcel.classfile.ConstantMethodref;
import org.apache.bcel.classfile.ConstantModule;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.classfile.DescendingVisitor;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.classfile.Visitor;
import org.apache.bcel.util.BCELComparator;
import org.apache.bcel.util.ClassLoaderRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Constant_ESTest extends Constant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstantModule constantModule0 = new ConstantModule((-7));
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(166);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0, 220);
      MockPrintStream mockPrintStream0 = new MockPrintStream(bufferedOutputStream0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      constantModule0.dump(dataOutputStream0);
      assertEquals((-7), constantModule0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConstantClass constantClass0 = new ConstantClass(9);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      DescendingVisitor descendingVisitor0 = new DescendingVisitor((JavaClass) null, emptyVisitor0);
      constantClass0.accept(descendingVisitor0);
      assertEquals((byte)7, constantClass0.getTag());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getInstance("");
      String string0 = constantUtf8_0.toString();
      assertEquals("CONSTANT_Utf8[1](\"\")", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantModule constantModule0 = new ConstantModule(0);
      boolean boolean0 = constantModule0.equals(constantModule0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstantModule constantModule0 = new ConstantModule(0);
      Constant[] constantArray0 = new Constant[6];
      constantArray0[0] = (Constant) constantModule0;
      constantArray0[0].tag = (byte)67;
      // Undeclared exception!
      try { 
        constantArray0[0].toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 67
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Constant.readConstant((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Constant", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-767), (byte)92);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        Constant.readConstant(dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      try { 
        Constant.readConstant(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      dataInputStream0.readBoolean();
      try { 
        Constant.readConstant(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle((-2307), (-2307));
      Constant.setComparator((BCELComparator) null);
      // Undeclared exception!
      try { 
        constantMethodHandle0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Constant", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BCELComparator bCELComparator0 = Method.getComparator();
      Constant.setComparator(bCELComparator0);
      ConstantFloat constantFloat0 = new ConstantFloat((-1446.42F));
      // Undeclared exception!
      try { 
        constantFloat0.hashCode();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantFloat cannot be cast to org.apache.bcel.classfile.Method
         //
         verifyException("org.apache.bcel.classfile.Method$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle((-2307), (-2307));
      constantMethodHandle0.tag = (byte) (-22);
      // Undeclared exception!
      try { 
        constantMethodHandle0.hashCode();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -22
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantModule constantModule0 = new ConstantModule(0);
      // Undeclared exception!
      try { 
        constantModule0.equals((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Constant$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantInteger constantInteger0 = new ConstantInteger(1719);
      // Undeclared exception!
      try { 
        constantInteger0.equals("7");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.bcel.classfile.Constant
         //
         verifyException("org.apache.bcel.classfile.Constant$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantInteger constantInteger0 = new ConstantInteger(0);
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(0, 0);
      constantInvokeDynamic0.tag = (byte)47;
      // Undeclared exception!
      try { 
        constantInteger0.equals(constantInvokeDynamic0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 47
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantModule constantModule0 = new ConstantModule(0);
      // Undeclared exception!
      try { 
        constantModule0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantModule", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstantMethodref constantMethodref0 = new ConstantMethodref(0, (-295));
      // Undeclared exception!
      try { 
        constantMethodref0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantMethodref", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstantFloat constantFloat0 = new ConstantFloat((-1514.1F));
      byte byte0 = constantFloat0.getTag();
      assertEquals((byte)4, byte0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType((-1380));
      Constant constant0 = constantMethodType0.copy();
      assertEquals((byte)16, constant0.getTag());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        Constant.readConstant(dataInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid byte tag in constant pool: 0
         //
         verifyException("org.apache.bcel.classfile.Constant", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      assertEquals((byte)1, JavaClass.HEAP);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<ConstantInteger> class0 = ConstantInteger.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      JavaClass javaClass1 = javaClass0.copy();
      assertEquals(20, javaClass1.getClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(0, 0);
      ConstantInvokeDynamic constantInvokeDynamic1 = (ConstantInvokeDynamic)constantInvokeDynamic0.clone();
      assertEquals((byte)18, constantInvokeDynamic1.getTag());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BCELComparator bCELComparator0 = Constant.getComparator();
      Constant.setComparator(bCELComparator0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ConstantFloat constantFloat0 = new ConstantFloat(192);
      constantFloat0.hashCode();
      assertEquals((byte)4, constantFloat0.getTag());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ConstantInteger constantInteger0 = new ConstantInteger(0);
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(0, 0);
      boolean boolean0 = constantInteger0.equals(constantInvokeDynamic0);
      assertFalse(boolean0);
      assertEquals((byte)18, constantInvokeDynamic0.getTag());
  }
}
