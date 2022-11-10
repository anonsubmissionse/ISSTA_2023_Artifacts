/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:27:39 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantDouble;
import org.apache.bcel.classfile.ConstantFieldref;
import org.apache.bcel.classfile.ConstantLong;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.LDC2_W;
import org.apache.bcel.generic.Type;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LDC2_W_ESTest extends LDC2_W_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      executionVisitor0.setConstantPoolGen(constantPoolGen0);
      LDC2_W lDC2_W0 = new LDC2_W(7);
      lDC2_W0.accept(executionVisitor0);
      assertEquals((short)20, lDC2_W0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LDC2_W lDC2_W0 = new LDC2_W();
      Constant[] constantArray0 = new Constant[2];
      ConstantLong constantLong0 = new ConstantLong(3L);
      constantArray0[0] = (Constant) constantLong0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Number number0 = lDC2_W0.getValue(constantPoolGen0);
      assertEquals(3L, number0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LDC2_W lDC2_W0 = new LDC2_W();
      Constant[] constantArray0 = new Constant[4];
      ConstantLong constantLong0 = new ConstantLong((-1L));
      constantArray0[0] = (Constant) constantLong0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      Number number0 = lDC2_W0.getValue(constantPoolGen0);
      assertEquals((-1L), number0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LDC2_W lDC2_W0 = new LDC2_W(4641);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        lDC2_W0.getValue(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 4641. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      LDC2_W lDC2_W0 = new LDC2_W(7);
      // Undeclared exception!
      try { 
        lDC2_W0.getValue(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.LDC2_W", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      LDC2_W lDC2_W0 = new LDC2_W(268);
      // Undeclared exception!
      try { 
        lDC2_W0.getType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 268. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LDC2_W lDC2_W0 = new LDC2_W();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        lDC2_W0.getType(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.LDC2_W", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LDC2_W lDC2_W0 = new LDC2_W();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        lDC2_W0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LDC2_W lDC2_W0 = null;
      try {
        lDC2_W0 = new LDC2_W((-1361));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Negative index value: -1361
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LDC2_W lDC2_W0 = new LDC2_W();
      Constant[] constantArray0 = new Constant[4];
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("");
      constantArray0[0] = (Constant) constantUtf8_0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        lDC2_W0.getValue(constantPoolGen0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown or invalid constant type at 0
         //
         verifyException("org.apache.bcel.generic.LDC2_W", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LDC2_W lDC2_W0 = new LDC2_W(0);
      Constant[] constantArray0 = new Constant[1];
      ConstantDouble constantDouble0 = new ConstantDouble(0);
      constantArray0[0] = (Constant) constantDouble0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Number number0 = lDC2_W0.getValue(constantPoolGen0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantFieldref constantFieldref0 = new ConstantFieldref((-4550), (-4550));
      constantArray0[0] = (Constant) constantFieldref0;
      LDC2_W lDC2_W0 = new LDC2_W();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        lDC2_W0.getType(constantPoolGen0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown constant type -1
         //
         verifyException("org.apache.bcel.generic.LDC2_W", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LDC2_W lDC2_W0 = new LDC2_W(0);
      Constant[] constantArray0 = new Constant[1];
      ConstantDouble constantDouble0 = new ConstantDouble(0);
      constantArray0[0] = (Constant) constantDouble0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = lDC2_W0.getType(constantPoolGen0);
      assertEquals((byte)7, type0.getType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      LDC2_W lDC2_W0 = new LDC2_W(7);
      // Undeclared exception!
      try { 
        lDC2_W0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LDC2_W lDC2_W0 = new LDC2_W();
      Constant[] constantArray0 = new Constant[3];
      ConstantLong constantLong0 = new ConstantLong(0L);
      constantArray0[0] = (Constant) constantLong0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      Type type0 = lDC2_W0.getType(constantPoolGen0);
      assertEquals((byte)11, type0.getType());
  }
}
