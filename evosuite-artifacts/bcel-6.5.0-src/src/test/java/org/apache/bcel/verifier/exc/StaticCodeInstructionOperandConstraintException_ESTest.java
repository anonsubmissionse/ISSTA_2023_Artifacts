/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:51:33 GMT 2022
 */

package org.apache.bcel.verifier.exc;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.verifier.exc.StaticCodeInstructionOperandConstraintException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StaticCodeInstructionOperandConstraintException_ESTest extends StaticCodeInstructionOperandConstraintException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StaticCodeInstructionOperandConstraintException staticCodeInstructionOperandConstraintException0 = new StaticCodeInstructionOperandConstraintException("org.apache.bcel.verifier.exc.VerificationException");
  }
}
