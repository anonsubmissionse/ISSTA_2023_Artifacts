/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:14:22 GMT 2022
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.NOPTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NOPTransformer_ESTest extends NOPTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Transformer<String, String> transformer0 = NOPTransformer.nopTransformer();
      assertNotNull(transformer0);
  }
}
