/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:36:14 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.LCONST;
import org.apache.bcel.generic.Type;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.Frame;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.verifier.structurals.LocalVariables;
import org.apache.bcel.verifier.structurals.OperandStack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LCONST_ESTest extends LCONST_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LCONST lCONST0 = new LCONST(1L);
      Number number0 = lCONST0.getValue();
      assertEquals((short)10, lCONST0.getOpcode());
      assertEquals(1L, number0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LCONST lCONST0 = new LCONST(1L);
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        lCONST0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LCONST lCONST0 = null;
      try {
        lCONST0 = new LCONST((-631L));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // LCONST can be used only for 0 and 1: -631
         //
         verifyException("org.apache.bcel.generic.LCONST", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LCONST lCONST0 = new LCONST(0L);
      assertEquals((short)9, lCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LCONST lCONST0 = new LCONST(1L);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = lCONST0.getType(constantPoolGen0);
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      LocalVariables localVariables0 = new LocalVariables(487);
      OperandStack operandStack0 = new OperandStack(487, type0.THROWABLE);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      executionVisitor0.setFrame(frame0);
      lCONST0.accept(executionVisitor0);
      assertEquals((short)10, lCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LCONST lCONST0 = new LCONST();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        lCONST0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LCONST lCONST0 = new LCONST();
      Number number0 = lCONST0.getValue();
      assertEquals(0L, number0);
  }
}
