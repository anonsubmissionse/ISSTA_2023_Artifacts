/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 03:08:47 GMT 2022
 */

package com.github.scribejava.core.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.scribejava.core.exceptions.OAuthException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuthException_ESTest extends OAuthException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OAuthException oAuthException0 = new OAuthException("-EC[eGCcGI(4D&P[R%z");
      OAuthException oAuthException1 = new OAuthException(oAuthException0);
      assertFalse(oAuthException1.equals((Object)oAuthException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OAuthException oAuthException0 = new OAuthException("-EC[eGCcGI(4D&P[R%z");
      MockException mockException0 = new MockException(oAuthException0);
      OAuthException oAuthException1 = new OAuthException("", mockException0);
      assertFalse(oAuthException1.equals((Object)oAuthException0));
  }
}
