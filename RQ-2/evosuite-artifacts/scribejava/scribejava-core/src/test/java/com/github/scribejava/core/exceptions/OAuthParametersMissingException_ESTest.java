/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 03:10:29 GMT 2022
 */

package com.github.scribejava.core.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.scribejava.core.exceptions.OAuthParametersMissingException;
import com.github.scribejava.core.model.OAuthRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuthParametersMissingException_ESTest extends OAuthParametersMissingException_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OAuthParametersMissingException oAuthParametersMissingException0 = new OAuthParametersMissingException((OAuthRequest) null);
  }
}
