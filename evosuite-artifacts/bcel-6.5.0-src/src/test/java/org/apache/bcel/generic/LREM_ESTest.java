/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:46:39 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.LREM;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.Frame;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LREM_ESTest extends LREM_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LREM lREM0 = new LREM();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        lREM0.accept(executionVisitor0);
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
      LREM lREM0 = new LREM();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      Frame frame0 = new Frame(6696, 341);
      instConstraintVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        lREM0.accept(instConstraintVisitor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction LREM constraint violated: Cannot consume 4 stack slots: only 0 slot(s) left on stack!
         // Stack:
         // Slots used: 0 MaxStack: 341.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LREM lREM0 = new LREM();
      lREM0.setOpcode((short) (-1));
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        lREM0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LREM lREM0 = new LREM();
      Class<?>[] classArray0 = lREM0.getExceptions();
      assertEquals(1, classArray0.length);
  }
}
