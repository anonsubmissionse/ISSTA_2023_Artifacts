/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 03:03:49 GMT 2022
 */

package com.github.scribejava.core.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.model.OAuth1AccessToken;
import com.github.scribejava.core.model.OAuth1RequestToken;
import com.github.scribejava.core.model.OAuth2AccessToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Token_ESTest extends Token_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OAuth1RequestToken oAuth1RequestToken0 = new OAuth1RequestToken("", "9jH($5foe", "");
      String string0 = oAuth1RequestToken0.getRawResponse();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer((-8));
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("=='c=", "=='c=", integer0, "", "=='c=", "=='c=");
      String string0 = oAuth2AccessToken0.getParameter("");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("com.github.scribejava.core.model.OAuth2AccessToken");
      // Undeclared exception!
      try { 
        oAuth2AccessToken0.getParameter("com.github.scribejava.core.model.OAuth2AccessToken");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.model.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer(1);
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("='=", "='=", integer0, "", "'='", "='=");
      String string0 = oAuth2AccessToken0.getParameter("");
      assertNotNull(string0);
      assertEquals("'", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("=", "=");
      String string0 = oAuth2AccessToken0.getParameter("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("'", "=");
      String string0 = oAuth2AccessToken0.getParameter("'");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("=", "=");
      // Undeclared exception!
      try { 
        oAuth1AccessToken0.getRawResponse();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // This token object was not constructed by ScribeJava and does not have a rawResponse
         //
         verifyException("com.github.scribejava.core.model.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Integer integer0 = new Integer(1);
      OAuth2AccessToken oAuth2AccessToken0 = new OAuth2AccessToken("='=", "='=", integer0, "", "'='", "='=");
      String string0 = oAuth2AccessToken0.getRawResponse();
      assertEquals("='=", string0);
  }
}
