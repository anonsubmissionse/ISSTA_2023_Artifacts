/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 05:23:01 GMT 2022
 */

package org.apache.commons.vfs2.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.vfs2.impl.DefaultProviderConfiguration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultProviderConfiguration_ESTest extends DefaultProviderConfiguration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultProviderConfiguration defaultProviderConfiguration0 = new DefaultProviderConfiguration();
      boolean boolean0 = defaultProviderConfiguration0.isDefault();
      assertTrue(boolean0);
  }
}
