/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:37:38 GMT 2022
 */

package org.asynchttpclient.spnego;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.LanguageCallback;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.asynchttpclient.spnego.NamePasswordCallbackHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NamePasswordCallbackHandler_ESTest extends NamePasswordCallbackHandler_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NamePasswordCallbackHandler namePasswordCallbackHandler0 = new NamePasswordCallbackHandler("", "");
      LanguageCallback languageCallback0 = new LanguageCallback();
      Callback[] callbackArray0 = new Callback[6];
      callbackArray0[0] = (Callback) languageCallback0;
      try { 
        namePasswordCallbackHandler0.handle(callbackArray0);
        fail("Expecting exception: UnsupportedCallbackException");
      } catch(UnsupportedCallbackException e) {
         //
         // Unsupported callback type javax.security.auth.callback.LanguageCallback
         //
         verifyException("org.asynchttpclient.spnego.NamePasswordCallbackHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NamePasswordCallbackHandler namePasswordCallbackHandler0 = new NamePasswordCallbackHandler("T", "T", "T");
      Callback[] callbackArray0 = new Callback[2];
      // Undeclared exception!
      try { 
        namePasswordCallbackHandler0.handle(callbackArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.spnego.NamePasswordCallbackHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NamePasswordCallbackHandler namePasswordCallbackHandler0 = new NamePasswordCallbackHandler("p", "p", "p");
      Callback[] callbackArray0 = new Callback[1];
      NameCallback nameCallback0 = new NameCallback("p");
      callbackArray0[0] = (Callback) nameCallback0;
      namePasswordCallbackHandler0.handle(callbackArray0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NamePasswordCallbackHandler namePasswordCallbackHandler0 = new NamePasswordCallbackHandler("K_ j/6GpjT~", "{} -> {}", "{} -> {}");
      NameCallback nameCallback0 = new NameCallback("{} -> {}");
      boolean boolean0 = namePasswordCallbackHandler0.handleCallback(nameCallback0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NamePasswordCallbackHandler namePasswordCallbackHandler0 = new NamePasswordCallbackHandler(".Z,c`m%*z;?", ".Z,c`m%*z;?");
      PasswordCallback passwordCallback0 = new PasswordCallback(".Z,c`m%*z;?", true);
      Callback[] callbackArray0 = new Callback[2];
      callbackArray0[0] = (Callback) passwordCallback0;
      // Undeclared exception!
      try { 
        namePasswordCallbackHandler0.handle(callbackArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.spnego.NamePasswordCallbackHandler", e);
      }
  }
}
