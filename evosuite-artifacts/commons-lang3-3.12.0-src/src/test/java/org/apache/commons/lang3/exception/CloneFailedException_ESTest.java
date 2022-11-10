/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:23:36 GMT 2022
 */

package org.apache.commons.lang3.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.exception.CloneFailedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CloneFailedException_ESTest extends CloneFailedException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CloneFailedException cloneFailedException0 = new CloneFailedException("org.apache.commons.lang3.exception.CloneFailedException");
      MockThrowable mockThrowable0 = new MockThrowable("", cloneFailedException0);
      CloneFailedException cloneFailedException1 = new CloneFailedException("@,ymb~+er;r", mockThrowable0);
      assertFalse(cloneFailedException1.equals((Object)cloneFailedException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CloneFailedException cloneFailedException0 = new CloneFailedException("org.apache.commons.lang3.exception.CloneFailedException");
      CloneFailedException cloneFailedException1 = new CloneFailedException(cloneFailedException0);
      assertFalse(cloneFailedException1.equals((Object)cloneFailedException0));
  }
}
