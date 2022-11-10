/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:34:03 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantDouble;
import org.apache.bcel.classfile.ConstantDynamic;
import org.apache.bcel.classfile.ConstantInteger;
import org.apache.bcel.classfile.ConstantMethodHandle;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.MULTIANEWARRAY;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MULTIANEWARRAY_ESTest extends MULTIANEWARRAY_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(1, (short)4);
      Constant[] constantArray0 = new Constant[5];
      ConstantInteger constantInteger0 = new ConstantInteger(1);
      constantArray0[1] = (Constant) constantInteger0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      String string0 = mULTIANEWARRAY0.toString(constantPool0);
      assertEquals("multianewarray 1 4", string0);
      assertEquals(4, mULTIANEWARRAY0.getLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(2, (short)24);
      String string0 = mULTIANEWARRAY0.toString(false);
      assertEquals(4, mULTIANEWARRAY0.getLength());
      assertEquals("multianewarray 2 2 24", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(0, (short)197);
      Constant[] constantArray0 = new Constant[1];
      ConstantDouble constantDouble0 = new ConstantDouble((-227.620484));
      constantArray0[0] = (Constant) constantDouble0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      String string0 = mULTIANEWARRAY0.toString(constantPool0);
      assertEquals("multianewarray -227.620484 197", string0);
      assertEquals(4, mULTIANEWARRAY0.getLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      short short0 = mULTIANEWARRAY0.getDimensions();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte) (-50);
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      mULTIANEWARRAY0.initFromFile(byteSequence0, true);
      short short0 = mULTIANEWARRAY0.getDimensions();
      assertEquals(4, mULTIANEWARRAY0.getLength());
      assertEquals((short) (-50), short0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(0, (short)3371);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = mULTIANEWARRAY0.consumeStack(constantPoolGen0);
      assertEquals(4, mULTIANEWARRAY0.getLength());
      assertEquals(3371, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-5);
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      mULTIANEWARRAY0.initFromFile(byteSequence0, false);
      int int0 = mULTIANEWARRAY0.consumeStack((ConstantPoolGen) null);
      assertEquals(4, mULTIANEWARRAY0.getLength());
      assertEquals((-5), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.toString(false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(4, (short)52);
      Constant[] constantArray0 = new Constant[4];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.toString(constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 4. Constant pool size is: 4
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      Constant[] constantArray0 = new Constant[2];
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle(0, 0);
      constantArray0[0] = (Constant) constantMethodHandle0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.toString(constantPool0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      Constant[] constantArray0 = new Constant[8];
      ConstantDynamic constantDynamic0 = new ConstantDynamic(176, 176);
      constantArray0[0] = (Constant) constantDynamic0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.toString(constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown constant type 17
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      Constant[] constantArray0 = new Constant[9];
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getCachedInstance(" read ");
      constantArray0[0] = (Constant) constantUtf8_0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.toString(constantPool0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.initFromFile((ByteSequence) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(2, (short)24);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.getLoadClassType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 2 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.getLoadClassType((ConstantPoolGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(44, (short)2640);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(212, (short)1);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(" ", false);
      mockFileOutputStream0.close();
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        mULTIANEWARRAY0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(2, (short)24);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ArrayType arrayType0 = new ArrayType("multianewarray 2 2 24", (short)24);
      constantPoolGen0.addArrayClass(arrayType0);
      ObjectType objectType0 = mULTIANEWARRAY0.getLoadClassType(constantPoolGen0);
      assertNotNull(objectType0);
      assertEquals((short)24, mULTIANEWARRAY0.getDimensions());
      assertEquals(4, mULTIANEWARRAY0.getLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(2, (short)24);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addClass("'z~*+Us:");
      ObjectType objectType0 = mULTIANEWARRAY0.getLoadClassType(constantPoolGen0);
      assertEquals((short)24, mULTIANEWARRAY0.getDimensions());
      assertNotNull(objectType0);
      assertEquals(4, mULTIANEWARRAY0.getLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = null;
      try {
        mULTIANEWARRAY0 = new MULTIANEWARRAY(1262, (short) (-29));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid dimensions value: -29
         //
         verifyException("org.apache.bcel.generic.MULTIANEWARRAY", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(254, (short)1);
      Class<?>[] classArray0 = mULTIANEWARRAY0.getExceptions();
      assertEquals((short)1, mULTIANEWARRAY0.getDimensions());
      assertEquals(8, classArray0.length);
      assertEquals(4, mULTIANEWARRAY0.getLength());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(254, (short)1);
      short short0 = mULTIANEWARRAY0.getDimensions();
      assertEquals(4, mULTIANEWARRAY0.getLength());
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      Constant[] constantArray0 = new Constant[8];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.toString(constantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      byte[] byteArray0 = new byte[2];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      try { 
        mULTIANEWARRAY0.initFromFile(byteSequence0, false);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      int int0 = mULTIANEWARRAY0.consumeStack((ConstantPoolGen) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(254, (short)1);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(" ", false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      mULTIANEWARRAY0.dump(dataOutputStream0);
      assertEquals((short)1, mULTIANEWARRAY0.getDimensions());
      assertEquals(4, mULTIANEWARRAY0.getLength());
  }
}
