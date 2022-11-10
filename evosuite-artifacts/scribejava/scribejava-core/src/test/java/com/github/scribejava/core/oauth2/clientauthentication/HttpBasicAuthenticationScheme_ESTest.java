/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 03:06:22 GMT 2022
 */

package com.github.scribejava.core.oauth2.clientauthentication;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth2.clientauthentication.HttpBasicAuthenticationScheme;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpBasicAuthenticationScheme_ESTest extends HttpBasicAuthenticationScheme_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HttpBasicAuthenticationScheme httpBasicAuthenticationScheme0 = HttpBasicAuthenticationScheme.instance();
      // Undeclared exception!
      try { 
        httpBasicAuthenticationScheme0.addClientAuthentication((OAuthRequest) null, "PATCH", "kowNB4rpE%Eju<0- ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.oauth2.clientauthentication.HttpBasicAuthenticationScheme", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HttpBasicAuthenticationScheme httpBasicAuthenticationScheme0 = HttpBasicAuthenticationScheme.instance();
      Verb verb0 = Verb.OPTIONS;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "pm5!$=KjP2y`^8QI_QB");
      httpBasicAuthenticationScheme0.addClientAuthentication(oAuthRequest0, "pm5!$=KjP2y`^8QI_QB", (String) null);
      assertEquals("pm5!$=KjP2y`^8QI_QB", oAuthRequest0.getUrl());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HttpBasicAuthenticationScheme httpBasicAuthenticationScheme0 = new HttpBasicAuthenticationScheme();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HttpBasicAuthenticationScheme httpBasicAuthenticationScheme0 = HttpBasicAuthenticationScheme.instance();
      Verb verb0 = Verb.GET;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "`XAA6+BVIM\\~*(5:>J");
      httpBasicAuthenticationScheme0.addClientAuthentication(oAuthRequest0, (String) null, "`XAA6+BVIM\\~*(5:>J");
      assertNull(oAuthRequest0.getRealm());
  }
}
