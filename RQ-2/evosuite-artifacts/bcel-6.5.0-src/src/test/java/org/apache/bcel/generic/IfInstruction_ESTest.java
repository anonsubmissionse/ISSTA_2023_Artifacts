/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:47:56 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.IF_ACMPEQ;
import org.apache.bcel.generic.IfInstruction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IfInstruction_ESTest extends IfInstruction_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IF_ACMPEQ iF_ACMPEQ0 = new IF_ACMPEQ();
      IfInstruction ifInstruction0 = iF_ACMPEQ0.negate();
      ;
}
}
