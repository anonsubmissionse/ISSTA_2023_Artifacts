/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:39:33 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import org.apache.bcel.classfile.ClassElementValue;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantNameAndType;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.generic.ClassElementValueGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.ElementValueGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassElementValueGen_ESTest extends ClassElementValueGen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(objectType0, constantPoolGen0);
      String string0 = classElementValueGen0.stringifyValue();
      assertEquals("Ljava/lang/StringBuffer;", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(0, constantPoolGen0);
      int int0 = classElementValueGen0.getIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen((-935), (ConstantPoolGen) null);
      int int0 = classElementValueGen0.getIndex();
      assertEquals((-935), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(objectType0, constantPoolGen0);
      ClassElementValue classElementValue0 = (ClassElementValue)classElementValueGen0.getElementValue();
      assertEquals(1, classElementValue0.getIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(objectType0, constantPoolGen0);
      String string0 = classElementValueGen0.getClassString();
      assertEquals("Ljava/lang/StringBuffer;", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen((-368), (ConstantPoolGen) null);
      // Undeclared exception!
      try { 
        classElementValueGen0.stringifyValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ClassElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen((-197), constantPoolGen0);
      // Undeclared exception!
      try { 
        classElementValueGen0.stringifyValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -197
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(0, (ConstantPoolGen) null);
      // Undeclared exception!
      try { 
        classElementValueGen0.getClassString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ClassElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantNameAndType constantNameAndType0 = new ConstantNameAndType(0, 0);
      constantArray0[0] = (Constant) constantNameAndType0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(0, constantPoolGen0);
      // Undeclared exception!
      try { 
        classElementValueGen0.getClassString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantNameAndType cannot be cast to org.apache.bcel.classfile.ConstantUtf8
         //
         verifyException("org.apache.bcel.generic.ClassElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen((-702), constantPoolGen0);
      // Undeclared exception!
      try { 
        classElementValueGen0.getClassString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -702
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(objectType0, constantPoolGen0);
      // Undeclared exception!
      try { 
        classElementValueGen0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ClassElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = null;
      try {
        classElementValueGen0 = new ClassElementValueGen((ObjectType) null, constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ClassElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjectType objectType0 = Type.STRING;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(objectType0, constantPoolGen0);
      assertEquals(70, ElementValueGen.PRIMITIVE_FLOAT);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ClassElementValue classElementValue0 = new ClassElementValue(0, 1763, constantPool0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ClassElementValueGen classElementValueGen0 = null;
      try {
        classElementValueGen0 = new ClassElementValueGen(classElementValue0, constantPoolGen0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 1763. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = null;
      try {
        classElementValueGen0 = new ClassElementValueGen((ClassElementValue) null, constantPoolGen0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ClassElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassElementValue classElementValue0 = new ClassElementValue((-1466), (-1466), (ConstantPool) null);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(classElementValue0, constantPoolGen0, false);
      assertEquals(70, ElementValueGen.PRIMITIVE_FLOAT);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(objectType0, constantPoolGen0);
      String string0 = classElementValueGen0.stringifyValue();
      assertEquals("Ljava/lang/Object;", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(objectType0, constantPoolGen0);
      int int0 = classElementValueGen0.getIndex();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(objectType0, constantPoolGen0);
      String string0 = classElementValueGen0.getClassString();
      assertEquals("Ljava/lang/Object;", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen((-935), (ConstantPoolGen) null);
      // Undeclared exception!
      try { 
        classElementValueGen0.getElementValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ClassElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(objectType0, constantPoolGen0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.bcel.util.ClassPath$JrtModules");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      classElementValueGen0.dump(dataOutputStream0);
      assertEquals("Ljava/lang/Object;", classElementValueGen0.getClassString());
  }
}
