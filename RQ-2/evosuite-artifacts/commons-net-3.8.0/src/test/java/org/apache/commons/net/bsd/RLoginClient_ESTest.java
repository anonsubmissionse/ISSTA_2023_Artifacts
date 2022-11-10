/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 21:14:10 GMT 2022
 */

package org.apache.commons.net.bsd;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.bsd.RLoginClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RLoginClient_ESTest extends RLoginClient_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RLoginClient rLoginClient0 = new RLoginClient();
      // Undeclared exception!
      try { 
        rLoginClient0.rlogin((String) null, "org.apache.commons.io.filefilter.TrueFileFilter", (String) null, 1299);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.bsd.RExecClient", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RLoginClient rLoginClient0 = new RLoginClient();
      // Undeclared exception!
      try { 
        rLoginClient0.rlogin("At!`LOmNJaX[=", "", "UtwsP0TyL<,2Td[:");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.bsd.RExecClient", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RLoginClient rLoginClient0 = new RLoginClient();
      // Undeclared exception!
      try { 
        rLoginClient0.rlogin("/", "/", "H}:.N}", 513);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.bsd.RExecClient", e);
      }
  }
}
