/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 21:11:13 GMT 2022
 */

package org.apache.commons.net.daytime;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.daytime.DaytimeTCPClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DaytimeTCPClient_ESTest extends DaytimeTCPClient_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DaytimeTCPClient daytimeTCPClient0 = new DaytimeTCPClient();
      // Undeclared exception!
      try { 
        daytimeTCPClient0.getTime();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }
}
