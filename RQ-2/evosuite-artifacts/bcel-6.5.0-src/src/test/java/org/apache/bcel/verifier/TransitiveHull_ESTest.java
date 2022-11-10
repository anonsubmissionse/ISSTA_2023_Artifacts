/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:20:40 GMT 2022
 */

package org.apache.bcel.verifier;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.verifier.TransitiveHull;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TransitiveHull_ESTest extends TransitiveHull_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.apche;el.classfile.LocalVarialeTabe";
      TransitiveHull.main(stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        TransitiveHull.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        TransitiveHull.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.TransitiveHull", e);
      }
  }
}
