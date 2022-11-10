/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 21:52:41 GMT 2022
 */

package org.apache.bcel.verifier.statics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.verifier.VerificationResult;
import org.apache.bcel.verifier.Verifier;
import org.apache.bcel.verifier.statics.LocalVariablesInfo;
import org.apache.bcel.verifier.statics.Pass2Verifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Pass2Verifier_ESTest extends Pass2Verifier_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Pass2Verifier pass2Verifier0 = new Pass2Verifier((Verifier) null);
      // Undeclared exception!
      try { 
        pass2Verifier0.getLocalVariablesInfo(0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.statics.Pass2Verifier", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pass2Verifier pass2Verifier0 = new Pass2Verifier((Verifier) null);
      // Undeclared exception!
      try { 
        pass2Verifier0.do_verify();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.statics.Pass2Verifier", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VerificationResult verificationResult0 = mock(VerificationResult.class, new ViolatedAssumptionAnswer());
      Verifier verifier0 = mock(Verifier.class, new ViolatedAssumptionAnswer());
      doReturn(verificationResult0).when(verifier0).doPass1();
      Pass2Verifier pass2Verifier0 = new Pass2Verifier(verifier0);
      VerificationResult verificationResult1 = pass2Verifier0.do_verify();
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VerificationResult verificationResult0 = mock(VerificationResult.class, new ViolatedAssumptionAnswer());
      Verifier verifier0 = mock(Verifier.class, new ViolatedAssumptionAnswer());
      doReturn(verificationResult0).when(verifier0).doPass1();
      Pass2Verifier pass2Verifier0 = new Pass2Verifier(verifier0);
      LocalVariablesInfo localVariablesInfo0 = pass2Verifier0.getLocalVariablesInfo(2);
      ;
}
}
