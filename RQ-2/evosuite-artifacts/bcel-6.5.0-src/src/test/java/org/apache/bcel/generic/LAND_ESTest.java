/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:50:21 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.LAND;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.Frame;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.verifier.structurals.LocalVariables;
import org.apache.bcel.verifier.structurals.OperandStack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LAND_ESTest extends LAND_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LAND lAND0 = new LAND();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(99);
      OperandStack operandStack0 = new OperandStack(0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        lAND0.accept(instConstraintVisitor0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Instruction LAND constraint violated: Cannot consume 4 stack slots: only 0 slot(s) left on stack!
         // Stack:
         // Slots used: 0 MaxStack: 0.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LAND lAND0 = new LAND();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      LocalVariables localVariables0 = new LocalVariables(1465);
      OperandStack operandStack0 = new OperandStack(1465);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      executionVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        lAND0.accept(executionVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LAND lAND0 = new LAND();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        lAND0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }
}
