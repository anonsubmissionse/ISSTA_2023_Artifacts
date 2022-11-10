/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:37:41 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.DCONST;
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
public class DCONST_ESTest extends DCONST_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DCONST dCONST0 = new DCONST(1.0);
      Number number0 = dCONST0.getValue();
      assertEquals(1.0, number0);
      assertEquals((short)15, dCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DCONST dCONST0 = new DCONST();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        dCONST0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DCONST dCONST0 = null;
      try {
        dCONST0 = new DCONST(2.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DCONST can be used only for 0.0 and 1.0: 2.0
         //
         verifyException("org.apache.bcel.generic.DCONST", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DCONST dCONST0 = new DCONST(0.0);
      assertEquals((short)14, dCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DCONST dCONST0 = new DCONST(1.0);
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        dCONST0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DCONST dCONST0 = new DCONST(1.0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = dCONST0.getType(constantPoolGen0);
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      LocalVariables localVariables0 = new LocalVariables(194);
      OperandStack operandStack0 = new OperandStack(4192, type0.STRINGBUFFER);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      executionVisitor0.setFrame(frame0);
      dCONST0.accept(executionVisitor0);
      assertEquals((short)15, dCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DCONST dCONST0 = new DCONST();
      Number number0 = dCONST0.getValue();
      assertEquals(0.0, number0);
  }
}
