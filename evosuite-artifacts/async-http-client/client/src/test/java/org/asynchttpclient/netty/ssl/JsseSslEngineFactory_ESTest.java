/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:54:16 GMT 2022
 */

package org.asynchttpclient.netty.ssl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import org.asynchttpclient.AsyncHttpClientConfig;
import org.asynchttpclient.netty.ssl.JsseSslEngineFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsseSslEngineFactory_ESTest extends JsseSslEngineFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SSLContext sSLContext0 = SSLContext.getDefault();
      JsseSslEngineFactory jsseSslEngineFactory0 = new JsseSslEngineFactory(sSLContext0);
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(asyncHttpClientConfig0).isDisableHttpsEndpointIdentificationAlgorithm();
      SSLEngine sSLEngine0 = jsseSslEngineFactory0.newSslEngine(asyncHttpClientConfig0, "tUntO", 0);
      assertNotNull(sSLEngine0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SSLContext sSLContext0 = SSLContext.getDefault();
      JsseSslEngineFactory jsseSslEngineFactory0 = new JsseSslEngineFactory(sSLContext0);
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        jsseSslEngineFactory0.newSslEngine(asyncHttpClientConfig0, "", 1559);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SSLContext sSLContext0 = SSLContext.getDefault();
      JsseSslEngineFactory jsseSslEngineFactory0 = new JsseSslEngineFactory(sSLContext0);
      // Undeclared exception!
      try { 
        jsseSslEngineFactory0.newSslEngine((AsyncHttpClientConfig) null, "6srhTkIsY", 1106);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.ssl.SslEngineFactoryBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      SSLContext sSLContext0 = SSLContext.getInstance("SSLv3");
      JsseSslEngineFactory jsseSslEngineFactory0 = new JsseSslEngineFactory(sSLContext0);
      // Undeclared exception!
      try { 
        jsseSslEngineFactory0.newSslEngine(asyncHttpClientConfig0, "SSLv3", 0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
      }
  }
}
