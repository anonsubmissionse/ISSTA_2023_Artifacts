/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:55:27 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.DUP_X2;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.Frame;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DUP_X2_ESTest extends DUP_X2_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DUP_X2 dUP_X2_0 = new DUP_X2();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        dUP_X2_0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DUP_X2 dUP_X2_0 = new DUP_X2();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      Frame frame0 = new Frame(439, 439);
      instConstraintVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        dUP_X2_0.accept(instConstraintVisitor0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Instruction DUP_X2 constraint violated: Cannot consume 3 stack slots: only 0 slot(s) left on stack!
         // Stack:
         // Slots used: 0 MaxStack: 439.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DUP_X2 dUP_X2_0 = new DUP_X2();
      dUP_X2_0.setOpcode((short) (-1216));
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        dUP_X2_0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1216
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }
}
