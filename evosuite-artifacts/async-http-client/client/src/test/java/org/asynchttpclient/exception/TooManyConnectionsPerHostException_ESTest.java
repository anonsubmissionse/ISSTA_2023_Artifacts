/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:51:55 GMT 2022
 */

package org.asynchttpclient.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.asynchttpclient.exception.TooManyConnectionsPerHostException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TooManyConnectionsPerHostException_ESTest extends TooManyConnectionsPerHostException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TooManyConnectionsPerHostException tooManyConnectionsPerHostException0 = new TooManyConnectionsPerHostException(0);
  }
}
