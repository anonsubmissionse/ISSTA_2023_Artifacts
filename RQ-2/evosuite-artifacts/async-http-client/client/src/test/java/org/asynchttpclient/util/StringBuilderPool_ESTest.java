/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:55:08 GMT 2022
 */

package org.asynchttpclient.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.asynchttpclient.util.StringBuilderPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringBuilderPool_ESTest extends StringBuilderPool_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringBuilderPool stringBuilderPool0 = new StringBuilderPool();
      StringBuilder stringBuilder0 = stringBuilderPool0.stringBuilder();
      assertNotNull(stringBuilder0.toString());
}
}
