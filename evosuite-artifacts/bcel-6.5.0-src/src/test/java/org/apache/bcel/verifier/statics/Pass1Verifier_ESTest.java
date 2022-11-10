/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:29:56 GMT 2022
 */

package org.apache.bcel.verifier.statics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Repository;
import org.apache.bcel.verifier.VerificationResult;
import org.apache.bcel.verifier.Verifier;
import org.apache.bcel.verifier.statics.Pass1Verifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Pass1Verifier_ESTest extends Pass1Verifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Verifier verifier0 = mock(Verifier.class, new ViolatedAssumptionAnswer());
      doReturn("u^gUKEUm", "u^gUKEUm", "u^gUKEUm", "u^gUKEUm", "u^gUKEUm").when(verifier0).getClassName();
      JavaClass javaClass0 = mock(JavaClass.class, new ViolatedAssumptionAnswer());
      doReturn("u^gYKEUm", "u^gUKEUm", "u^gYKEUm", "u^gUKEUm", "u^gUKEUm").when(javaClass0).getClassName();
      doReturn("u^gUKEUm", "u^gUKEUm", "u^gUKEUm").when(javaClass0).toString();
      Repository repository0 = mock(Repository.class, new ViolatedAssumptionAnswer());
      doReturn(javaClass0).when(repository0).loadClass(anyString());
      org.apache.bcel.Repository.setRepository(repository0);
      Pass1Verifier pass1Verifier0 = new Pass1Verifier(verifier0);
      pass1Verifier0.getMessages();
      VerificationResult verificationResult0 = pass1Verifier0.do_verify();
      assertEquals("Wrong name: the internal name of the .class file 'u^gUKEUm' does not match the file's name 'u^gUKEUm'.", verificationResult0.getMessage());
      assertEquals(2, verificationResult0.getStatus());
      
      VerificationResult verificationResult1 = pass1Verifier0.do_verify();
      assertEquals(1, verificationResult1.getStatus());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Verifier verifier0 = mock(Verifier.class, new ViolatedAssumptionAnswer());
      doReturn("/Qo").when(verifier0).getClassName();
      Pass1Verifier pass1Verifier0 = new Pass1Verifier(verifier0);
      VerificationResult verificationResult0 = pass1Verifier0.do_verify();
      assertEquals("Repository.lookup() failed. FILE NOT FOUND?", verificationResult0.getMessage());
      assertEquals(2, verificationResult0.getStatus());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Verifier verifier0 = mock(Verifier.class, new ViolatedAssumptionAnswer());
      doReturn("org.apache.bcel.verifier.statics.Pass3aVerifier", "org.apache.bcel.verifier.statics.Pass3aVerifier", (String) null).when(verifier0).getClassName();
      Pass1Verifier pass1Verifier0 = new Pass1Verifier(verifier0);
      VerificationResult verificationResult0 = pass1Verifier0.verify();
      assertEquals(1, verificationResult0.getStatus());
      
      VerificationResult verificationResult1 = pass1Verifier0.do_verify();
      assertEquals("Parsing via BCEL did not succeed. java.lang.NullPointerException occured:\n<evosuite>.<evosuite>(<evosuite>)\n<evosuite>.<evosuite>(<evosuite>)\n<evosuite>.<evosuite>(<evosuite>)\n", verificationResult1.getMessage());
      assertEquals(2, verificationResult1.getStatus());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Pass1Verifier pass1Verifier0 = new Pass1Verifier((Verifier) null);
      pass1Verifier0.addMessage("");
      String[] stringArray0 = pass1Verifier0.getMessages();
      assertEquals(1, stringArray0.length);
  }
}
