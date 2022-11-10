/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:46:09 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionConst;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InstructionConst_ESTest extends InstructionConst_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Instruction instruction0 = InstructionConst.getInstruction(159);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Instruction instruction0 = InstructionConst.getInstruction(0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Instruction instruction0 = InstructionConst.getInstruction(113);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        InstructionConst.getInstruction((-2106));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2106
         //
         verifyException("org.apache.bcel.generic.InstructionConst", e);
      }
  }
}
