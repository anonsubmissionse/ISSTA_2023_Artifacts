/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 21:12:43 GMT 2022
 */

package org.apache.commons.net.chargen;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.net.chargen.CharGenTCPClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CharGenTCPClient_ESTest extends CharGenTCPClient_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharGenTCPClient charGenTCPClient0 = new CharGenTCPClient();
      charGenTCPClient0.getInputStream();
      ;
}
}
