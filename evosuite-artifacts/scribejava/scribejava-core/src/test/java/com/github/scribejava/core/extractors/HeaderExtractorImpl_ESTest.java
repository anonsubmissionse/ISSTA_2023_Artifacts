/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 03:00:34 GMT 2022
 */

package com.github.scribejava.core.extractors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.extractors.HeaderExtractorImpl;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Verb;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HeaderExtractorImpl_ESTest extends HeaderExtractorImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HeaderExtractorImpl headerExtractorImpl0 = new HeaderExtractorImpl();
      // Undeclared exception!
      try { 
        headerExtractorImpl0.extract((OAuthRequest) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot extract a header from a null object
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Verb verb0 = Verb.PUT;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      HeaderExtractorImpl headerExtractorImpl0 = new HeaderExtractorImpl();
      // Undeclared exception!
      try { 
        headerExtractorImpl0.extract(oAuthRequest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not find oauth parameters in request: @Request(PUT ). OAuth parameters must be specified with the addOAuthParameter() method
         //
         verifyException("com.github.scribejava.core.extractors.HeaderExtractorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Verb verb0 = Verb.PUT;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "");
      Map<String, String> map0 = oAuthRequest0.getOauthParameters();
      oAuthRequest0.initMultipartPayload(map0);
      oAuthRequest0.setRealm("");
      HeaderExtractorImpl headerExtractorImpl0 = new HeaderExtractorImpl();
      String string0 = headerExtractorImpl0.extract(oAuthRequest0);
      assertEquals("OAuth Content-Type=\"multipart%2Fform-data%3B%20boundary%3D%22----ScribeJava----1392409281320%22\"", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HeaderExtractorImpl headerExtractorImpl0 = new HeaderExtractorImpl();
      Verb verb0 = Verb.DELETE;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "<");
      oAuthRequest0.addOAuthParameter("realm", "realm");
      oAuthRequest0.setRealm("<");
      String string0 = headerExtractorImpl0.extract(oAuthRequest0);
      assertEquals("OAuth realm=\"realm\", realm=\"<\"", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HeaderExtractorImpl headerExtractorImpl0 = new HeaderExtractorImpl();
      Verb verb0 = Verb.DELETE;
      OAuthRequest oAuthRequest0 = new OAuthRequest(verb0, "<");
      oAuthRequest0.addOAuthParameter("realm", "realm");
      Map<String, String> map0 = oAuthRequest0.getOauthParameters();
      oAuthRequest0.initMultipartPayload(map0);
      String string0 = headerExtractorImpl0.extract(oAuthRequest0);
      assertEquals("OAuth realm=\"realm\", Content-Type=\"multipart%2Fform-data%3B%20boundary%3D%22----ScribeJava----1392409281320%22\"", string0);
  }
}
