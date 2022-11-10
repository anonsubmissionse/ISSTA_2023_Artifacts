/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:44:13 GMT 2022
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.OutputStream;
import org.apache.bcel.classfile.ClassElementValue;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ElementValue;
import org.apache.bcel.classfile.ElementValuePair;
import org.apache.bcel.classfile.SimpleElementValue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ElementValuePair_ESTest extends ElementValuePair_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ElementValuePair elementValuePair0 = new ElementValuePair(1056, (ElementValue) null, (ConstantPool) null);
      elementValuePair0.getValue();
      assertEquals(1056, elementValuePair0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ClassElementValue classElementValue0 = new ClassElementValue(0, 0, constantPool0);
      ElementValuePair elementValuePair0 = new ElementValuePair(0, classElementValue0, constantPool0);
      elementValuePair0.getValue();
      assertEquals(0, elementValuePair0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassElementValue classElementValue0 = new ClassElementValue(1, 0, (ConstantPool) null);
      ElementValuePair elementValuePair0 = new ElementValuePair(0, classElementValue0, (ConstantPool) null);
      elementValuePair0.getValue();
      assertEquals(0, elementValuePair0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Constant[] constantArray0 = new Constant[8];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ElementValuePair elementValuePair0 = new ElementValuePair(0, (ElementValue) null, constantPool0);
      int int0 = elementValuePair0.getNameIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Constant[] constantArray0 = new Constant[10];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ElementValuePair elementValuePair0 = new ElementValuePair(14, (ElementValue) null, constantPool0);
      int int0 = elementValuePair0.getNameIndex();
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      SimpleElementValue simpleElementValue0 = new SimpleElementValue(2244, 1279, constantPool0);
      ElementValuePair elementValuePair0 = new ElementValuePair(14, simpleElementValue0, constantPool0);
      // Undeclared exception!
      try { 
        elementValuePair0.toShortString();
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
      ClassElementValue classElementValue0 = new ClassElementValue((-2739), (-2739), (ConstantPool) null);
      ElementValuePair elementValuePair0 = new ElementValuePair((-2739), classElementValue0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        elementValuePair0.getNameString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ElementValuePair", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ClassElementValue classElementValue0 = new ClassElementValue((-2142), 147, constantPool0);
      ElementValuePair elementValuePair0 = new ElementValuePair((-2142), classElementValue0, constantPool0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        elementValuePair0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ClassElementValue classElementValue0 = new ClassElementValue((-1449), (-986), constantPool0);
      ElementValuePair elementValuePair0 = new ElementValuePair(0, classElementValue0, constantPool0);
      // Undeclared exception!
      try { 
        elementValuePair0.getNameString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 0 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ClassElementValue classElementValue0 = new ClassElementValue((-2142), (-2142), constantPool0);
      ElementValuePair elementValuePair0 = new ElementValuePair((-2142), classElementValue0, constantPool0);
      int int0 = elementValuePair0.getNameIndex();
      assertEquals((-2142), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ClassElementValue classElementValue0 = new ClassElementValue(0, 0, constantPool0);
      ElementValuePair elementValuePair0 = new ElementValuePair(0, classElementValue0, constantPool0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("-*GDX", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      elementValuePair0.dump(dataOutputStream0);
      assertEquals(0, elementValuePair0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ClassElementValue classElementValue0 = new ClassElementValue((-1449), (-986), constantPool0);
      ElementValuePair elementValuePair0 = new ElementValuePair(0, classElementValue0, constantPool0);
      elementValuePair0.getValue();
      assertEquals(0, elementValuePair0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ClassElementValue classElementValue0 = new ClassElementValue((-2142), (-2142), constantPool0);
      ElementValuePair elementValuePair0 = new ElementValuePair((-2142), classElementValue0, constantPool0);
      // Undeclared exception!
      try { 
        elementValuePair0.toShortString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -2142. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
}
