/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:13:57 GMT 2022
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.functors.NOPClosure;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NOPClosure_ESTest extends NOPClosure_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Closure<String> closure0 = NOPClosure.nopClosure();
      assertNotNull(closure0);
}
}
