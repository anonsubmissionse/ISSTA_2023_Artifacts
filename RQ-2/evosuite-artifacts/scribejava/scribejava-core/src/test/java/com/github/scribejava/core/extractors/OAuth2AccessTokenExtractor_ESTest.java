/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 03:01:44 GMT 2022
 */

package com.github.scribejava.core.extractors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.extractors.OAuth2AccessTokenExtractor;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.Response;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuth2AccessTokenExtractor_ESTest extends OAuth2AccessTokenExtractor_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OAuth2AccessTokenExtractor oAuth2AccessTokenExtractor0 = OAuth2AccessTokenExtractor.instance();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Response response0 = new Response(1093, "Pp 8}%0HBW", hashMap0, "Pp 8}%0HBW");
      // Undeclared exception!
      try { 
        oAuth2AccessTokenExtractor0.extract(response0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Response code is not 200 but '1093'
         //
         verifyException("com.github.scribejava.core.extractors.OAuth2AccessTokenExtractor", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OAuth2AccessTokenExtractor oAuth2AccessTokenExtractor0 = OAuth2AccessTokenExtractor.instance();
      // Undeclared exception!
      try { 
        oAuth2AccessTokenExtractor0.extract((Response) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.extractors.OAuth2AccessTokenExtractor", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OAuth2AccessTokenExtractor oAuth2AccessTokenExtractor0 = new OAuth2AccessTokenExtractor();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
      Closeable[] closeableArray0 = new Closeable[7];
      Response response0 = new Response(200, "@2xo6#_#c^_,|\u0002d", hashMap0, pushbackInputStream0, closeableArray0);
      // Undeclared exception!
      try { 
        oAuth2AccessTokenExtractor0.extract(response0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OAuth2AccessTokenExtractor oAuth2AccessTokenExtractor0 = OAuth2AccessTokenExtractor.instance();
      Response response0 = new Response(200, "", (Map<String, String>) null, "");
      // Undeclared exception!
      try { 
        oAuth2AccessTokenExtractor0.extract(response0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Response body is incorrect. Can't extract a token from an empty string
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OAuth2AccessTokenExtractor oAuth2AccessTokenExtractor0 = new OAuth2AccessTokenExtractor();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-34), (byte)96);
      Response response0 = new Response(200, "p`L=|JFll5o@n", hashMap0, byteArrayInputStream0, (Closeable[]) null);
      // Undeclared exception!
      try { 
        oAuth2AccessTokenExtractor0.extract(response0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OAuth2AccessTokenExtractor oAuth2AccessTokenExtractor0 = new OAuth2AccessTokenExtractor();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Response response0 = new Response(200, "!~]m5I/[Zdz^Wg", hashMap0, "!~]m5I/[Zdz^Wg");
      // Undeclared exception!
      try { 
        oAuth2AccessTokenExtractor0.extract(response0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Response body is incorrect. Can't extract a 'access_token=([^&]+)' from this: '!~]m5I/[Zdz^Wg'
         //
         verifyException("com.github.scribejava.core.extractors.OAuth2AccessTokenExtractor", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OAuth2AccessTokenExtractor oAuth2AccessTokenExtractor0 = OAuth2AccessTokenExtractor.instance();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Response response0 = new Response(200, "access_token=([^&]+)", hashMap0, "access_token=([^&]+)");
      OAuth2AccessToken oAuth2AccessToken0 = oAuth2AccessTokenExtractor0.extract(response0);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      OAuth2AccessTokenExtractor oAuth2AccessTokenExtractor0 = OAuth2AccessTokenExtractor.instance();
      Response response0 = new Response((-1425), "T{l", (Map<String, String>) null, "T{l");
      // Undeclared exception!
      try { 
        oAuth2AccessTokenExtractor0.extract(response0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Response code is not 200 but '-1425'
         //
         verifyException("com.github.scribejava.core.extractors.OAuth2AccessTokenExtractor", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      OAuth2AccessTokenExtractor oAuth2AccessTokenExtractor0 = new OAuth2AccessTokenExtractor();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Response response0 = new Response(200, "S.\"$) O8[GK4J", hashMap0, pipedInputStream0, (Closeable[]) null);
      try { 
        oAuth2AccessTokenExtractor0.extract(response0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
}
