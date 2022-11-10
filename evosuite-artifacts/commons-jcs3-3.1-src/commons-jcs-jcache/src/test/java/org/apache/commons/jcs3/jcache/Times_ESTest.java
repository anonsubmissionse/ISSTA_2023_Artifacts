/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:19:57 GMT 2022
 */

package org.apache.commons.jcs3.jcache;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jcs3.jcache.Times;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Times_ESTest extends Times_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      long long0 = Times.now(false);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      long long0 = Times.now(true);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      long long0 = Times.now(false);
      assertEquals(1392409281320L, long0);
  }
}
