/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:50:49 GMT 2022
 */

package org.asynchttpclient.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.asynchttpclient.exception.TooManyConnectionsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TooManyConnectionsException_ESTest extends TooManyConnectionsException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TooManyConnectionsException tooManyConnectionsException0 = new TooManyConnectionsException(7023);
  }
}
