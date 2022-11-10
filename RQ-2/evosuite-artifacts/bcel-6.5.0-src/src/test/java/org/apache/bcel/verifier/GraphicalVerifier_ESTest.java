/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:37:55 GMT 2022
 */

package org.apache.bcel.verifier;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.apache.bcel.verifier.GraphicalVerifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GraphicalVerifier_ESTest extends GraphicalVerifier_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GraphicalVerifier graphicalVerifier0 = null;
      try {
        graphicalVerifier0 = new GraphicalVerifier();
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        GraphicalVerifier.main((String[]) null);
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
