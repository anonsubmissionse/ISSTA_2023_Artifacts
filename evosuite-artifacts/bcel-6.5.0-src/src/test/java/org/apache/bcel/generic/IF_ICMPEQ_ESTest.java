/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:48:48 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.IF_ICMPEQ;
import org.apache.bcel.generic.IfInstruction;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IF_ICMPEQ_ESTest extends IF_ICMPEQ_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IF_ICMPEQ iF_ICMPEQ0 = new IF_ICMPEQ();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        iF_ICMPEQ0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IF_ICMPEQ iF_ICMPEQ0 = new IF_ICMPEQ();
      IfInstruction ifInstruction0 = iF_ICMPEQ0.negate();
      assertEquals((short)160, ifInstruction0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IF_ICMPEQ iF_ICMPEQ0 = new IF_ICMPEQ((InstructionHandle) null);
      assertEquals((short)159, iF_ICMPEQ0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IF_ICMPEQ iF_ICMPEQ0 = new IF_ICMPEQ();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        iF_ICMPEQ0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }
}
