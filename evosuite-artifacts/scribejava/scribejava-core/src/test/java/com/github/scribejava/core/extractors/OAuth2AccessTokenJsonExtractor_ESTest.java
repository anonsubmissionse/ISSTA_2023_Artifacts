/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 02:57:28 GMT 2022
 */

package com.github.scribejava.core.extractors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ValueNode;
import com.fasterxml.jackson.databind.util.RawValue;
import com.github.scribejava.core.extractors.OAuth2AccessTokenJsonExtractor;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.Response;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.time.ZoneId;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuth2AccessTokenJsonExtractor_ESTest extends OAuth2AccessTokenJsonExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = OAuth2AccessTokenJsonExtractor.instance();
      Integer integer0 = new Integer(192);
      JsonNodeFactory jsonNodeFactory0 = new JsonNodeFactory(true);
      JsonNode jsonNode0 = jsonNodeFactory0.missingNode();
      OAuth2AccessToken oAuth2AccessToken0 = oAuth2AccessTokenJsonExtractor0.createToken("error_uri", "aC*l", integer0, "LC=", "aC*l", jsonNode0, "aC*l");
      assertEquals("error_uri", oAuth2AccessToken0.getAccessToken());
      assertEquals("aC*l", oAuth2AccessToken0.getScope());
      assertEquals("aC*l", oAuth2AccessToken0.getTokenType());
      assertEquals("LC=", oAuth2AccessToken0.getRefreshToken());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = new OAuth2AccessTokenJsonExtractor();
      Response response0 = new Response(200, "4", (Map<String, String>) null, "4");
      // Undeclared exception!
      try { 
        oAuth2AccessTokenJsonExtractor0.extract(response0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Response body is incorrect. Can't extract a 'access_token' from this: '4'
         //
         verifyException("com.github.scribejava.core.extractors.AbstractJsonExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = OAuth2AccessTokenJsonExtractor.instance();
      // Undeclared exception!
      try { 
        oAuth2AccessTokenJsonExtractor0.generateError((Response) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.extractors.OAuth2AccessTokenJsonExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = OAuth2AccessTokenJsonExtractor.instance();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Response response0 = new Response(0, "$gi}%lR:@',T Y_", hashMap0, (InputStream) null, (Closeable[]) null);
      // Undeclared exception!
      try { 
        oAuth2AccessTokenJsonExtractor0.generateError(response0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // argument \"content\" is null
         //
         verifyException("com.fasterxml.jackson.databind.ObjectMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = OAuth2AccessTokenJsonExtractor.instance();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), 65280);
      Closeable[] closeableArray0 = new Closeable[3];
      Response response0 = new Response((-79), "xe'/DQ[*;WS(m#;G", hashMap0, byteArrayInputStream0, closeableArray0);
      // Undeclared exception!
      try { 
        oAuth2AccessTokenJsonExtractor0.generateError(response0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = OAuth2AccessTokenJsonExtractor.instance();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      pushbackInputStream0.close();
      Closeable[] closeableArray0 = new Closeable[0];
      Response response0 = new Response((-7), "s", hashMap0, pushbackInputStream0, closeableArray0);
      try { 
        oAuth2AccessTokenJsonExtractor0.generateError(response0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = new OAuth2AccessTokenJsonExtractor();
      Response response0 = new Response((-2360), "RLve>+.u Fn,qgNDn*", (Map<String, String>) null, "RLve>+.u Fn,qgNDn*");
      // Undeclared exception!
      try { 
        oAuth2AccessTokenJsonExtractor0.generateError(response0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // RLve>+.u Fn,qgNDn*
         //
         verifyException("com.github.scribejava.core.extractors.OAuth2AccessTokenJsonExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = new OAuth2AccessTokenJsonExtractor();
      // Undeclared exception!
      try { 
        oAuth2AccessTokenJsonExtractor0.extract((Response) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.extractors.OAuth2AccessTokenJsonExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = new OAuth2AccessTokenJsonExtractor();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Response response0 = new Response(878, "", hashMap0, "");
      // Undeclared exception!
      try { 
        oAuth2AccessTokenJsonExtractor0.extract(response0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Response body is incorrect. Can't extract a token from an empty string
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = OAuth2AccessTokenJsonExtractor.instance();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-118), 37);
      Closeable[] closeableArray0 = new Closeable[2];
      Response response0 = new Response(0, "READ_ONLY", hashMap0, byteArrayInputStream0, closeableArray0);
      // Undeclared exception!
      try { 
        oAuth2AccessTokenJsonExtractor0.extract(response0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = OAuth2AccessTokenJsonExtractor.instance();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      PipedInputStream pipedInputStream0 = new PipedInputStream(246);
      Response response0 = new Response(246, "YD+Lz\"", hashMap0, pipedInputStream0, (Closeable[]) null);
      try { 
        oAuth2AccessTokenJsonExtractor0.extract(response0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = OAuth2AccessTokenJsonExtractor.instance();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      Response response0 = new Response(200, "n_Q]G65@O", map0, "n_Q]G65@O");
      try { 
        oAuth2AccessTokenJsonExtractor0.extract(response0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unrecognized token 'n_Q': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')
         //  at [Source: (String)\"n_Q]G65@O\"; line: 1, column: 4]
         //
         verifyException("com.fasterxml.jackson.core.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = OAuth2AccessTokenJsonExtractor.instance();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      Response response0 = new Response(200, "+", map0, "+");
      try { 
        oAuth2AccessTokenJsonExtractor0.extract(response0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unexpected end-of-input in a Number value
         //  at [Source: (String)\"+\"; line: 1, column: 2]
         //
         verifyException("com.fasterxml.jackson.core.base.ParserMinimalBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = new OAuth2AccessTokenJsonExtractor();
      Integer integer0 = new Integer(0);
      ObjectMapper objectMapper0 = new ObjectMapper();
      ArrayNode arrayNode0 = objectMapper0.createArrayNode();
      RawValue rawValue0 = new RawValue("WJk");
      ValueNode valueNode0 = arrayNode0.rawValueNode(rawValue0);
      // Undeclared exception!
      try { 
        oAuth2AccessTokenJsonExtractor0.createToken((String) null, "includeAs cannot be null", integer0, "includeAs cannot be null", "includeAs cannot be null", valueNode0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // access_token can't be null
         //
         verifyException("com.github.scribejava.core.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = OAuth2AccessTokenJsonExtractor.instance();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Closeable[] closeableArray0 = new Closeable[1];
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Response response0 = new Response((-902), "Could not instantiate DOMImplementationRegistry: ", hashMap0, sequenceInputStream0, closeableArray0);
      // Undeclared exception!
      try { 
        oAuth2AccessTokenJsonExtractor0.generateError(response0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Response body is incorrect. Can't extract a 'error' from this: ''
         //
         verifyException("com.github.scribejava.core.extractors.AbstractJsonExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = new OAuth2AccessTokenJsonExtractor();
      Response response0 = new Response(1580, " i", (Map<String, String>) null, "4");
      // Undeclared exception!
      try { 
        oAuth2AccessTokenJsonExtractor0.extract(response0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Response body is incorrect. Can't extract a 'error' from this: '4'
         //
         verifyException("com.github.scribejava.core.extractors.AbstractJsonExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = new OAuth2AccessTokenJsonExtractor();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      Response response0 = new Response(0, "", map0, "token_type");
      // Undeclared exception!
      try { 
        oAuth2AccessTokenJsonExtractor0.extract(response0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // token_type
         //
         verifyException("com.github.scribejava.core.extractors.OAuth2AccessTokenJsonExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OAuth2AccessTokenJsonExtractor oAuth2AccessTokenJsonExtractor0 = OAuth2AccessTokenJsonExtractor.instance();
      OAuth2AccessToken oAuth2AccessToken0 = oAuth2AccessTokenJsonExtractor0.createToken("", "Could not instantiate DOMImplementationRegistry: ", (Integer) null, "Could not instantiate DOMImplementationRegistry: ", "refresh_token", (JsonNode) null, "refresh_token");
      assertEquals("refresh_token", oAuth2AccessToken0.getScope());
      assertEquals("", oAuth2AccessToken0.getAccessToken());
      assertEquals("Could not instantiate DOMImplementationRegistry: ", oAuth2AccessToken0.getRefreshToken());
      assertEquals("Could not instantiate DOMImplementationRegistry: ", oAuth2AccessToken0.getTokenType());
  }
}
