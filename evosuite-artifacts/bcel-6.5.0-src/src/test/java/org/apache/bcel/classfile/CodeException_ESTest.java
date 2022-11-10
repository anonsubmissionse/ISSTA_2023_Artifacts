/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:35:21 GMT 2022
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.bcel.classfile.CodeException;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.DescendingVisitor;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Visitor;
import org.apache.bcel.util.ClassLoaderRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodeException_ESTest extends CodeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 0, 54, 54);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      DescendingVisitor descendingVisitor0 = new DescendingVisitor((JavaClass) null, emptyVisitor0);
      codeException0.accept(descendingVisitor0);
      assertEquals(54, codeException0.getHandlerPC());
      assertEquals(54, codeException0.getCatchType());
      assertEquals(0, codeException0.getEndPC());
      assertEquals(0, codeException0.getStartPC());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      assertEquals(94, javaClass0.getSuperclassNameIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 0, 2600, 0);
      String string0 = codeException0.toString((ConstantPool) null);
      assertEquals("0\t0\t2600\t<Any exception>(0)", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 38, 38, 38);
      int int0 = codeException0.getStartPC();
      assertEquals(38, codeException0.getCatchType());
      assertEquals(0, int0);
      assertEquals(38, codeException0.getHandlerPC());
      assertEquals(38, codeException0.getEndPC());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CodeException codeException0 = new CodeException(483, 483, 483, 483);
      int int0 = codeException0.getStartPC();
      assertEquals(483, codeException0.getCatchType());
      assertEquals(483, codeException0.getHandlerPC());
      assertEquals(483, codeException0.getEndPC());
      assertEquals(483, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CodeException codeException0 = new CodeException(1275, 1275, 1275, 1275);
      int int0 = codeException0.getHandlerPC();
      assertEquals(1275, codeException0.getCatchType());
      assertEquals(1275, codeException0.getEndPC());
      assertEquals(1275, codeException0.getStartPC());
      assertEquals(1275, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1139), (-1139), (-1139), 0);
      int int0 = codeException0.getHandlerPC();
      assertEquals((-1139), codeException0.getEndPC());
      assertEquals((-1139), codeException0.getStartPC());
      assertEquals((-1139), int0);
      assertEquals(0, codeException0.getCatchType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 0, 54, 54);
      int int0 = codeException0.getEndPC();
      assertEquals(54, codeException0.getCatchType());
      assertEquals(54, codeException0.getHandlerPC());
      assertEquals(0, codeException0.getStartPC());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1148), 3077, (-1148), 922);
      int int0 = codeException0.getEndPC();
      assertEquals((-1148), codeException0.getStartPC());
      assertEquals(3077, int0);
      assertEquals((-1148), codeException0.getHandlerPC());
      assertEquals(922, codeException0.getCatchType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 0, 2600, 0);
      int int0 = codeException0.getCatchType();
      assertEquals(2600, codeException0.getHandlerPC());
      assertEquals(0, int0);
      assertEquals(0, codeException0.getStartPC());
      assertEquals(0, codeException0.getEndPC());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CodeException codeException0 = new CodeException(40, (-700), (-700), (-1615));
      int int0 = codeException0.getCatchType();
      assertEquals((-700), codeException0.getEndPC());
      assertEquals((-1615), int0);
      assertEquals(40, codeException0.getStartPC());
      assertEquals((-700), codeException0.getHandlerPC());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1), 700, (-1), 77);
      assertEquals((-1), codeException0.getStartPC());
      
      codeException0.setStartPC(1);
      codeException0.copy();
      assertEquals(1, codeException0.getStartPC());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1), (-1), 0, (-832));
      CodeException codeException1 = codeException0.copy();
      assertEquals(0, codeException1.getHandlerPC());
      assertEquals((-832), codeException1.getCatchType());
      assertEquals((-1), codeException1.getEndPC());
      assertEquals((-1), codeException1.getStartPC());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 0, 54, 54);
      CodeException codeException1 = codeException0.copy();
      assertEquals(0, codeException1.getStartPC());
      assertEquals(0, codeException1.getEndPC());
      assertEquals(54, codeException1.getCatchType());
      assertEquals(54, codeException1.getHandlerPC());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1139), (-1139), (-1139), 0);
      CodeException codeException1 = codeException0.copy();
      assertEquals((-1139), codeException1.getEndPC());
      assertEquals((-1139), codeException1.getHandlerPC());
      assertEquals((-1139), codeException1.getStartPC());
      assertEquals(0, codeException1.getCatchType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CodeException codeException0 = new CodeException(195, 0, 0, (-2051));
      // Undeclared exception!
      try { 
        codeException0.toString((ConstantPool) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.CodeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CodeException codeException0 = new CodeException(1756, (-1), (-897), (-1));
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        codeException0.toString(constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -1. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 0, 136, 0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        codeException0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CodeException codeException0 = null;
      try {
        codeException0 = new CodeException((CodeException) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.CodeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      CodeException codeException0 = null;
      try {
        codeException0 = new CodeException(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      CodeException codeException0 = null;
      try {
        codeException0 = new CodeException(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 3557, 0, 3);
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        codeException0.toString(constantPool0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 3. Constant pool size is: 1
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CodeException codeException0 = new CodeException((-3053), (-819), (-3053), 1166);
      int int0 = codeException0.getCatchType();
      assertEquals((-819), codeException0.getEndPC());
      assertEquals(1166, int0);
      assertEquals((-3053), codeException0.getStartPC());
      assertEquals((-3053), codeException0.getHandlerPC());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CodeException codeException0 = new CodeException((-3053), (-819), (-3053), 1166);
      int int0 = codeException0.getStartPC();
      assertEquals((-3053), codeException0.getHandlerPC());
      assertEquals(1166, codeException0.getCatchType());
      assertEquals((-3053), int0);
      assertEquals((-819), codeException0.getEndPC());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1), (-1), 0, (-832));
      int int0 = codeException0.getEndPC();
      assertEquals((-1), int0);
      assertEquals((-832), codeException0.getCatchType());
      assertEquals(0, codeException0.getHandlerPC());
      assertEquals((-1), codeException0.getStartPC());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 3557, 0, 3);
      int int0 = codeException0.getHandlerPC();
      assertEquals(3, codeException0.getCatchType());
      assertEquals(0, codeException0.getStartPC());
      assertEquals(3557, codeException0.getEndPC());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 0, 2628, 0);
      assertEquals(0, codeException0.getCatchType());
      
      String string0 = codeException0.toString((ConstantPool) null, false);
      assertEquals("0\t0\t2628\t<Any exception>(0)", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 0, 2628, 0);
      codeException0.setEndPC((-2035));
      assertEquals((-2035), codeException0.getEndPC());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CodeException codeException0 = new CodeException((-3051), (-3051), (-3051), (-3051));
      String string0 = codeException0.toString();
      assertEquals("CodeException(startPc = -3051, endPc = -3051, handlerPc = -3051, catchType = -3051)", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CodeException codeException0 = new CodeException(575, 575, 123, (-4358));
      // Undeclared exception!
      try { 
        codeException0.toString((ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.CodeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CodeException codeException0 = new CodeException((-2177), (-907), (-2177), (-2177));
      // Undeclared exception!
      try { 
        codeException0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.CodeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CodeException codeException0 = new CodeException((-2177), (-907), (-2177), (-2177));
      codeException0.setCatchType(3723);
      assertEquals(3723, codeException0.getCatchType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CodeException codeException0 = new CodeException((-3051), (-3051), (-3051), (-3051));
      codeException0.setHandlerPC((-3051));
      assertEquals((-3051), codeException0.getEndPC());
      assertEquals((-3051), codeException0.getHandlerPC());
      assertEquals((-3051), codeException0.getStartPC());
      assertEquals((-3051), codeException0.getCatchType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 0, 54, 54);
      CodeException codeException1 = new CodeException(codeException0);
      assertEquals(54, codeException0.getHandlerPC());
      assertEquals(54, codeException0.getCatchType());
      assertEquals(0, codeException1.getEndPC());
      assertEquals(0, codeException1.getStartPC());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CodeException codeException0 = null;
      try {
        codeException0 = new CodeException((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.CodeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CodeException codeException0 = new CodeException((-2177), (-907), (-2177), (-2177));
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      codeException0.dump(dataOutputStream0);
      assertEquals("\uFFFD\uFFFDu\uFFFD\uFFFD", byteArrayOutputStream0.toString());
      assertEquals((-907), codeException0.getEndPC());
  }
}
