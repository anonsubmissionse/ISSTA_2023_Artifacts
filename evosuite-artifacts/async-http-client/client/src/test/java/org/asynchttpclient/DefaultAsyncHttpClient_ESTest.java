/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:22:39 GMT 2022
 */

package org.asynchttpclient;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.handler.ssl.SslContext;
import java.util.List;
import org.asynchttpclient.AsyncHttpClientConfig;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClientConfig;
import org.asynchttpclient.Realm;
import org.asynchttpclient.SslEngineFactory;
import org.asynchttpclient.channel.ChannelPool;
import org.asynchttpclient.channel.KeepAliveStrategy;
import org.asynchttpclient.netty.channel.ConnectionSemaphoreFactory;
import org.asynchttpclient.proxy.ProxyServerSelector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultAsyncHttpClient_ESTest extends DefaultAsyncHttpClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultAsyncHttpClient defaultAsyncHttpClient0 = null;
      try {
        defaultAsyncHttpClient0 = new DefaultAsyncHttpClient((AsyncHttpClientConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.DefaultAsyncHttpClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((ChannelPool) null).when(asyncHttpClientConfig0).getChannelPool();
      doReturn(0).when(asyncHttpClientConfig0).getConnectTimeout();
      doReturn((ConnectionSemaphoreFactory) null).when(asyncHttpClientConfig0).getConnectionSemaphoreFactory();
      doReturn(0).when(asyncHttpClientConfig0).getConnectionTtl();
      doReturn((String[]) null).when(asyncHttpClientConfig0).getEnabledCipherSuites();
      doReturn((String[]) null).when(asyncHttpClientConfig0).getEnabledProtocols();
      doReturn(0).when(asyncHttpClientConfig0).getHandshakeTimeout();
      doReturn((KeepAliveStrategy) null).when(asyncHttpClientConfig0).getKeepAliveStrategy();
      doReturn(0).when(asyncHttpClientConfig0).getMaxConnections();
      doReturn(0).when(asyncHttpClientConfig0).getMaxConnectionsPerHost();
      doReturn(0).when(asyncHttpClientConfig0).getMaxRedirects();
      doReturn(0).when(asyncHttpClientConfig0).getMaxRequestRetry();
      doReturn(0).when(asyncHttpClientConfig0).getPooledConnectionIdleTimeout();
      doReturn((ProxyServerSelector) null).when(asyncHttpClientConfig0).getProxyServerSelector();
      doReturn(0).when(asyncHttpClientConfig0).getReadTimeout();
      doReturn((Realm) null).when(asyncHttpClientConfig0).getRealm();
      doReturn((List) null).when(asyncHttpClientConfig0).getRequestFilters();
      doReturn(0).when(asyncHttpClientConfig0).getRequestTimeout();
      doReturn(0).when(asyncHttpClientConfig0).getShutdownQuietPeriod();
      doReturn(0).when(asyncHttpClientConfig0).getShutdownTimeout();
      doReturn((SslContext) null).when(asyncHttpClientConfig0).getSslContext();
      doReturn((SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      doReturn(0).when(asyncHttpClientConfig0).getSslSessionCacheSize();
      doReturn(0).when(asyncHttpClientConfig0).getSslSessionTimeout();
      doReturn((String) null).when(asyncHttpClientConfig0).getUserAgent();
      doReturn(0).when(asyncHttpClientConfig0).getWebSocketMaxBufferSize();
      doReturn(0).when(asyncHttpClientConfig0).getWebSocketMaxFrameSize();
      doReturn(false).when(asyncHttpClientConfig0).isAggregateWebSocketFrameFragments();
      doReturn(false).when(asyncHttpClientConfig0).isCompressionEnforced();
      doReturn(false).when(asyncHttpClientConfig0).isDisableUrlEncodingForBoundRequests();
      doReturn(false).when(asyncHttpClientConfig0).isDisableZeroCopy();
      doReturn(false).when(asyncHttpClientConfig0).isEnableWebSocketCompression();
      doReturn(false).when(asyncHttpClientConfig0).isFilterInsecureCipherSuites();
      doReturn(false).when(asyncHttpClientConfig0).isFollowRedirect();
      doReturn(false).when(asyncHttpClientConfig0).isKeepAlive();
      doReturn(false).when(asyncHttpClientConfig0).isKeepEncodingHeader();
      doReturn(false).when(asyncHttpClientConfig0).isStrict302Handling();
      doReturn(false).when(asyncHttpClientConfig0).isUseInsecureTrustManager();
      doReturn(false).when(asyncHttpClientConfig0).isUseLaxCookieEncoder();
      DefaultAsyncHttpClientConfig.Builder defaultAsyncHttpClientConfig_Builder0 = null;
      try {
        defaultAsyncHttpClientConfig_Builder0 = new DefaultAsyncHttpClientConfig.Builder(asyncHttpClientConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }
}
