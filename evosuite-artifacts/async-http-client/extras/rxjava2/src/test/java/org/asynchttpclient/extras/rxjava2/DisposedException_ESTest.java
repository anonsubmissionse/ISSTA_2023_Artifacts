/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 16:05:33 GMT 2022
 */

package org.asynchttpclient.extras.rxjava2;

import org.junit.Test;
import static org.junit.Assert.*;
import org.asynchttpclient.extras.rxjava2.DisposedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DisposedException_ESTest extends DisposedException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DisposedException disposedException0 = new DisposedException("");
      assertEquals("org.asynchttpclient.extras.rxjava2.DisposedException: ", disposedException0.toString());
  }
}
