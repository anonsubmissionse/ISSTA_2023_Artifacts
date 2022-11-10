/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:34:22 GMT 2022
 */

package org.apache.bcel.verifier.structurals;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.apache.bcel.verifier.structurals.Frame;
import org.apache.bcel.verifier.structurals.LocalVariables;
import org.apache.bcel.verifier.structurals.OperandStack;
import org.apache.bcel.verifier.structurals.UninitializedObjectType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Frame_ESTest extends Frame_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Frame frame0 = new Frame(59, 59);
      frame0.hashCode();
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectType objectType0 = new ObjectType("Local Variables:\nOperandStack:\nSlots used: 0 MaxStack: 0.\n");
      UninitializedObjectType uninitializedObjectType0 = new UninitializedObjectType(objectType0);
      Frame.setThis(uninitializedObjectType0);
      UninitializedObjectType uninitializedObjectType1 = Frame.getThis();
      assertNotNull(uninitializedObjectType1.getSignature());
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Frame frame0 = new Frame((LocalVariables) null, (OperandStack) null);
      OperandStack operandStack0 = frame0.getStack();
      assertNotNull(operandStack0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Frame frame0 = new Frame(645, (-771));
      OperandStack operandStack0 = frame0.getStack();
      assertEquals(0, operandStack0.maxStack());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Frame frame0 = new Frame(0, 0);
      OperandStack operandStack0 = frame0.getStack();
      assertEquals(0, operandStack0.maxStack());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectType objectType0 = ObjectType.getInstance("");
      OperandStack operandStack0 = new OperandStack(1, objectType0);
      Frame frame0 = new Frame((LocalVariables) null, operandStack0);
      LocalVariables localVariables0 = frame0.getLocals();
      assertNotNull(localVariables0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Frame frame0 = new Frame(59, 59);
      LocalVariables localVariables0 = frame0.getLocals();
      assertEquals(0, localVariables0.maxLocals());
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Frame frame0 = new Frame(1826, 213);
      Frame frame1 = frame0.getClone();
      frame1.clone();
      Frame frame2 = frame1.getClone();
      // Undeclared exception!
      frame2.toString();
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(0);
      Frame frame0 = new Frame(localVariables0, (OperandStack) null);
      // Undeclared exception!
      try { 
        frame0.hashCode();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.Frame", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(2444);
      LocalVariables localVariables1 = localVariables0.getClone();
      ObjectType objectType0 = Type.THROWABLE;
      OperandStack operandStack0 = new OperandStack(2444, objectType0);
      localVariables0.getClone();
      Frame frame0 = new Frame(localVariables1, operandStack0);
      Frame frame1 = frame0.getClone();
      // Undeclared exception!
      frame1.getClone();
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(0);
      Frame frame0 = new Frame(localVariables0, (OperandStack) null);
      // Undeclared exception!
      try { 
        frame0.getClone();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.Frame", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Frame frame0 = new Frame(1623, (-753));
      Frame frame1 = frame0.getClone();
      Frame frame2 = frame1.getClone();
      Object object0 = frame0.clone();
      frame2.equals(object0);
      // Undeclared exception!
      frame2.equals(frame0);
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(1);
      Frame frame0 = new Frame(localVariables0, (OperandStack) null);
      // Undeclared exception!
      try { 
        frame0.equals(frame0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.Frame", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Frame frame0 = new Frame(3389, 0);
      Frame frame1 = frame0.getClone();
      // Undeclared exception!
      frame1.clone();
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(81);
      Frame frame0 = new Frame(localVariables0, (OperandStack) null);
      // Undeclared exception!
      try { 
        frame0.clone();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.Frame", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Frame frame0 = new Frame(32767, 1165);
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Frame frame0 = null;
      try {
        frame0 = new Frame((-520), (-520));
        fail("Expecting exception: NegativeArraySizeException");
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.LocalVariables", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Frame frame0 = new Frame(11, 11);
      Frame frame1 = new Frame(34, 34);
      boolean boolean0 = frame0.equals(frame1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UninitializedObjectType uninitializedObjectType0 = Frame.getThis();
      LocalVariables localVariables0 = new LocalVariables(0);
      OperandStack operandStack0 = new OperandStack(20, uninitializedObjectType0.THROWABLE);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      Frame frame1 = new Frame(0, 937);
      boolean boolean0 = frame0.equals(frame1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UninitializedObjectType uninitializedObjectType0 = Frame.getThis();
      LocalVariables localVariables0 = new LocalVariables(0);
      OperandStack operandStack0 = new OperandStack(20, uninitializedObjectType0.THROWABLE);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      Object object0 = new Object();
      boolean boolean0 = frame0.equals(object0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Frame frame0 = new Frame(0, 0);
      String string0 = frame0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Frame frame0 = new Frame(0, 0);
      LocalVariables localVariables0 = frame0.getLocals();
      ObjectType objectType0 = new ObjectType("<=?;Ikzy#z'F-uk;");
      OperandStack operandStack0 = new OperandStack(226, objectType0);
      Frame frame1 = new Frame(localVariables0, operandStack0);
      // Undeclared exception!
      try { 
        frame1.toString();
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Invalid signature: L<=?;Ikzy#z'F-uk;;
         //
         verifyException("org.apache.bcel.classfile.Utility", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UninitializedObjectType uninitializedObjectType0 = Frame.getThis();
      LocalVariables localVariables0 = new LocalVariables(0);
      OperandStack operandStack0 = new OperandStack(20, uninitializedObjectType0.THROWABLE);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      OperandStack operandStack1 = frame0.getStack();
      assertEquals(1, operandStack1.maxStack());
}
}
