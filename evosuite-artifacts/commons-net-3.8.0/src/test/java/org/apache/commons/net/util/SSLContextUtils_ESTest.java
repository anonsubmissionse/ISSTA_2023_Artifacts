/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 21:10:20 GMT 2022
 */

package org.apache.commons.net.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import org.apache.commons.net.util.SSLContextUtils;
import org.apache.ftpserver.ssl.impl.ExtendedAliasKeyManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SSLContextUtils_ESTest extends SSLContextUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KeyManager[] keyManagerArray0 = new KeyManager[3];
      TrustManager[] trustManagerArray0 = new TrustManager[2];
      // Undeclared exception!
      try { 
        SSLContextUtils.createSSLContext((String) null, keyManagerArray0, trustManagerArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.Provider$ServiceKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExtendedAliasKeyManager extendedAliasKeyManager0 = new ExtendedAliasKeyManager((KeyManager) null, (String) null);
      // Undeclared exception!
      try { 
        SSLContextUtils.createSSLContext((String) null, (KeyManager) extendedAliasKeyManager0, (TrustManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.Provider$ServiceKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      KeyManager[] keyManagerArray0 = new KeyManager[0];
      TrustManager[] trustManagerArray0 = new TrustManager[1];
      try { 
        SSLContextUtils.createSSLContext("ZQs>OL:+Z", keyManagerArray0, trustManagerArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not initialize SSL context
         //
         verifyException("org.apache.commons.net.util.SSLContextUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TrustManager trustManager0 = mock(TrustManager.class, new ViolatedAssumptionAnswer());
      try { 
        SSLContextUtils.createSSLContext("iLy!o{v ~J.Rh-", (KeyManager) null, trustManager0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not initialize SSL context
         //
         verifyException("org.apache.commons.net.util.SSLContextUtils", e);
      }
  }
}
