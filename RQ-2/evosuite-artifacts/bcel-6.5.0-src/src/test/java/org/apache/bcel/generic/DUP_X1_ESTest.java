/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:55:21 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.DUP_X1;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DUP_X1_ESTest extends DUP_X1_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DUP_X1 dUP_X1_0 = new DUP_X1();
      dUP_X1_0.setOpcode((short)1389);
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        dUP_X1_0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1389
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DUP_X1 dUP_X1_0 = new DUP_X1();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        dUP_X1_0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }
}
