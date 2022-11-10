/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 03:05:53 GMT 2022
 */

package com.github.scribejava.core.oauth2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.oauth2.OAuth2Error;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuth2Error_ESTest extends OAuth2Error_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OAuth2Error oAuth2Error0 = OAuth2Error.parseFrom("slow_down");
      assertEquals(OAuth2Error.SLOW_DOWN, oAuth2Error0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OAuth2Error[] oAuth2ErrorArray0 = OAuth2Error.values();
      assertEquals(16, oAuth2ErrorArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OAuth2Error oAuth2Error0 = OAuth2Error.valueOf("UNSUPPORTED_GRANT_TYPE");
      assertEquals("unsupported_grant_type", oAuth2Error0.getErrorString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OAuth2Error oAuth2Error0 = OAuth2Error.parseFrom("unsupported_token_type");
      assertEquals(OAuth2Error.UNSUPPORTED_TOKEN_TYPE, oAuth2Error0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        OAuth2Error.parseFrom("invblid_token");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // there is no knowlege about 'invblid_token' Error
         //
         verifyException("com.github.scribejava.core.oauth2.OAuth2Error", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OAuth2Error oAuth2Error0 = OAuth2Error.UNSUPPORTED_TOKEN_TYPE;
      String string0 = oAuth2Error0.getErrorString();
      assertEquals("unsupported_token_type", string0);
  }
}
