/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:45:12 GMT 2022
 */

package org.apache.bcel.verifier.exc;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.verifier.exc.StaticCodeInstructionConstraintException;
import org.apache.bcel.verifier.exc.StructuralCodeConstraintException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodeConstraintException_ESTest extends CodeConstraintException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StaticCodeInstructionConstraintException staticCodeInstructionConstraintException0 = new StaticCodeInstructionConstraintException("org.apache.bcel.verifier.exc.StaticCodeInstructionConstraintException");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StructuralCodeConstraintException structuralCodeConstraintException0 = new StructuralCodeConstraintException();
  }
}
