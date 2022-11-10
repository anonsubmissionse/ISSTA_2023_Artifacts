/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 17:05:50 GMT 2022
 */

package org.apache.commons.weaver.normalizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.weaver.model.Scanner;
import org.apache.commons.weaver.model.WeaveEnvironment;
import org.apache.commons.weaver.normalizer.NormalizerWeaver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NormalizerWeaver_ESTest extends NormalizerWeaver_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NormalizerWeaver normalizerWeaver0 = new NormalizerWeaver();
      WeaveEnvironment weaveEnvironment0 = mock(WeaveEnvironment.class, new ViolatedAssumptionAnswer());
      Scanner scanner0 = mock(Scanner.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        normalizerWeaver0.process(weaveEnvironment0, scanner0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.weaver.normalizer.Normalizer", e);
      }
  }
}
