/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 14:48:21 GMT 2022
 */

package org.asynchttpclient.netty.channel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.DefaultEventLoopGroup;
import io.netty.channel.EventLoopGroup;
import io.netty.handler.ssl.SslContext;
import io.netty.util.Timer;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import org.asynchttpclient.AsyncHttpClientConfig;
import org.asynchttpclient.SslEngineFactory;
import org.asynchttpclient.channel.ChannelPool;
import org.asynchttpclient.netty.channel.ChannelManager;
import org.asynchttpclient.uri.Uri;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ChannelManager_ESTest extends ChannelManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ChannelPool channelPool0 = mock(ChannelPool.class, new ViolatedAssumptionAnswer());
      SslEngineFactory sslEngineFactory0 = mock(SslEngineFactory.class, new ViolatedAssumptionAnswer());
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(sslEngineFactory0, (SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, (Timer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChannelPool channelPool0 = mock(ChannelPool.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[2];
      stringArray0[0] = "yu?E)]q`H<@p";
      stringArray0[1] = "XV,";
      SslContext sslContext0 = mock(SslContext.class, new ViolatedAssumptionAnswer());
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((ByteBufAllocator) null).when(asyncHttpClientConfig0).getAllocator();
      doReturn((Map) null).when(asyncHttpClientConfig0).getChannelOptions();
      doReturn(channelPool0).when(asyncHttpClientConfig0).getChannelPool();
      doReturn(0).when(asyncHttpClientConfig0).getConnectTimeout();
      doReturn((EventLoopGroup) null).when(asyncHttpClientConfig0).getEventLoopGroup();
      doReturn(1).when(asyncHttpClientConfig0).getHandshakeTimeout();
      doReturn(0).when(asyncHttpClientConfig0).getIoThreadsCount();
      doReturn(0, 0).when(asyncHttpClientConfig0).getSoLinger();
      doReturn(0, 0).when(asyncHttpClientConfig0).getSoRcvBuf();
      doReturn(0, 0).when(asyncHttpClientConfig0).getSoSndBuf();
      doReturn(sslContext0, (SslContext) null).when(asyncHttpClientConfig0).getSslContext();
      doReturn((SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      doReturn(threadFactory0, (ThreadFactory) null).when(asyncHttpClientConfig0).getThreadFactory();
      doReturn(false).when(asyncHttpClientConfig0).isSoKeepAlive();
      doReturn(false).when(asyncHttpClientConfig0).isSoReuseAddress();
      doReturn(false).when(asyncHttpClientConfig0).isTcpNoDelay();
      doReturn(false).when(asyncHttpClientConfig0).isUseNativeTransport();
      Timer timer0 = mock(Timer.class, new ViolatedAssumptionAnswer());
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, timer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "c:!L-+T:G'2q$(:13";
      stringArray0[1] = "6pmH";
      stringArray0[2] = "ahc-http";
      stringArray0[3] = "IhuUI/~ '";
      stringArray0[4] = "7^:";
      SslContext sslContext0 = mock(SslContext.class, new ViolatedAssumptionAnswer());
      SslEngineFactory sslEngineFactory0 = mock(SslEngineFactory.class, new ViolatedAssumptionAnswer());
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(sslEngineFactory0, (SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      Timer timer0 = mock(Timer.class, new ViolatedAssumptionAnswer());
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, timer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        ChannelManager.isSslHandlerConfigured((ChannelPipeline) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[4];
      ChannelPool channelPool0 = mock(ChannelPool.class, new ViolatedAssumptionAnswer());
      SslContext sslContext0 = mock(SslContext.class, new ViolatedAssumptionAnswer());
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((ByteBufAllocator) null).when(asyncHttpClientConfig0).getAllocator();
      doReturn((Map) null).when(asyncHttpClientConfig0).getChannelOptions();
      doReturn(channelPool0).when(asyncHttpClientConfig0).getChannelPool();
      doReturn(0).when(asyncHttpClientConfig0).getConnectTimeout();
      doReturn((EventLoopGroup) null).when(asyncHttpClientConfig0).getEventLoopGroup();
      doReturn(0).when(asyncHttpClientConfig0).getHandshakeTimeout();
      doReturn(0).when(asyncHttpClientConfig0).getIoThreadsCount();
      doReturn(0, 0).when(asyncHttpClientConfig0).getSoLinger();
      doReturn(0, 0).when(asyncHttpClientConfig0).getSoRcvBuf();
      doReturn(0, 0).when(asyncHttpClientConfig0).getSoSndBuf();
      doReturn(sslContext0, (SslContext) null).when(asyncHttpClientConfig0).getSslContext();
      doReturn((SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      doReturn(threadFactory0, (ThreadFactory) null).when(asyncHttpClientConfig0).getThreadFactory();
      doReturn(false).when(asyncHttpClientConfig0).isSoKeepAlive();
      doReturn(false).when(asyncHttpClientConfig0).isSoReuseAddress();
      doReturn(false).when(asyncHttpClientConfig0).isTcpNoDelay();
      doReturn(false).when(asyncHttpClientConfig0).isUseNativeTransport();
      Timer timer0 = mock(Timer.class, new ViolatedAssumptionAnswer());
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, timer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      SslEngineFactory sslEngineFactory0 = mock(SslEngineFactory.class, new ViolatedAssumptionAnswer());
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(sslEngineFactory0, (SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      Timer timer0 = mock(Timer.class, new ViolatedAssumptionAnswer());
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, timer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ChannelPool channelPool0 = mock(ChannelPool.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[9];
      stringArray0[0] = ";+6QVF-iI";
      stringArray0[1] = "";
      stringArray0[2] = "Adding key: {} for channel {}";
      stringArray0[3] = "l'C`^gWC1oGy? 'e3B";
      SslContext sslContext0 = mock(SslContext.class, new ViolatedAssumptionAnswer());
      SslEngineFactory sslEngineFactory0 = mock(SslEngineFactory.class, new ViolatedAssumptionAnswer());
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(sslEngineFactory0, (SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      Timer timer0 = mock(Timer.class, new ViolatedAssumptionAnswer());
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, timer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ChannelPool channelPool0 = mock(ChannelPool.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[5];
      stringArray0[0] = ".m}T'";
      stringArray0[1] = "hA~[5u}rP@G#CA";
      stringArray0[2] = "io.netty.util.internal.IntegerHolder";
      stringArray0[3] = "unavailable";
      stringArray0[4] = "";
      SslContext sslContext0 = mock(SslContext.class, new ViolatedAssumptionAnswer());
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((ByteBufAllocator) null).when(asyncHttpClientConfig0).getAllocator();
      doReturn((Map) null).when(asyncHttpClientConfig0).getChannelOptions();
      doReturn(channelPool0).when(asyncHttpClientConfig0).getChannelPool();
      doReturn(0).when(asyncHttpClientConfig0).getConnectTimeout();
      doReturn((EventLoopGroup) null).when(asyncHttpClientConfig0).getEventLoopGroup();
      doReturn((-1)).when(asyncHttpClientConfig0).getHandshakeTimeout();
      doReturn(0).when(asyncHttpClientConfig0).getIoThreadsCount();
      doReturn(0, 0).when(asyncHttpClientConfig0).getSoLinger();
      doReturn(0, 0).when(asyncHttpClientConfig0).getSoRcvBuf();
      doReturn(0, 0).when(asyncHttpClientConfig0).getSoSndBuf();
      doReturn(sslContext0, (SslContext) null).when(asyncHttpClientConfig0).getSslContext();
      doReturn((SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      doReturn(threadFactory0, (ThreadFactory) null).when(asyncHttpClientConfig0).getThreadFactory();
      doReturn(false).when(asyncHttpClientConfig0).isSoKeepAlive();
      doReturn(false).when(asyncHttpClientConfig0).isSoReuseAddress();
      doReturn(false).when(asyncHttpClientConfig0).isTcpNoDelay();
      doReturn(false).when(asyncHttpClientConfig0).isUseNativeTransport();
      Timer timer0 = mock(Timer.class, new ViolatedAssumptionAnswer());
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, timer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChannelPool channelPool0 = mock(ChannelPool.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[5];
      stringArray0[0] = "rl.TbQH8o";
      stringArray0[1] = "";
      stringArray0[2] = "'%JjB0T>KXj";
      stringArray0[3] = "9uil~O2HWi\"p]O";
      stringArray0[4] = "";
      SslContext sslContext0 = mock(SslContext.class, new ViolatedAssumptionAnswer());
      SslEngineFactory sslEngineFactory0 = mock(SslEngineFactory.class, new ViolatedAssumptionAnswer());
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(sslEngineFactory0, (SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      Timer timer0 = mock(Timer.class, new ViolatedAssumptionAnswer());
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, timer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ChannelHandler channelHandler0 = mock(ChannelHandler.class, new ViolatedAssumptionAnswer());
      ChannelPipeline channelPipeline0 = mock(ChannelPipeline.class, new ViolatedAssumptionAnswer());
      doReturn(channelHandler0).when(channelPipeline0).get(anyString());
      boolean boolean0 = ChannelManager.isSslHandlerConfigured(channelPipeline0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ChannelPipeline channelPipeline0 = mock(ChannelPipeline.class, new ViolatedAssumptionAnswer());
      doReturn((ChannelHandler) null).when(channelPipeline0).get(anyString());
      boolean boolean0 = ChannelManager.isSslHandlerConfigured(channelPipeline0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ChannelPool channelPool0 = mock(ChannelPool.class, new ViolatedAssumptionAnswer());
      SslEngineFactory sslEngineFactory0 = mock(SslEngineFactory.class, new ViolatedAssumptionAnswer());
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      SslEngineFactory sslEngineFactory1 = mock(SslEngineFactory.class, new ViolatedAssumptionAnswer());
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(channelPool0).when(asyncHttpClientConfig0).getChannelPool();
      doReturn((EventLoopGroup) null).when(asyncHttpClientConfig0).getEventLoopGroup();
      doReturn(0).when(asyncHttpClientConfig0).getHandshakeTimeout();
      doReturn(sslEngineFactory0, sslEngineFactory1).when(asyncHttpClientConfig0).getSslEngineFactory();
      doReturn(threadFactory0, (ThreadFactory) null).when(asyncHttpClientConfig0).getThreadFactory();
      doReturn(true).when(asyncHttpClientConfig0).isUseNativeTransport();
      Timer timer0 = mock(Timer.class, new ViolatedAssumptionAnswer());
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, timer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No suitable native transport (epoll or kqueue) available
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ChannelPool channelPool0 = mock(ChannelPool.class, new ViolatedAssumptionAnswer());
      SslContext sslContext0 = mock(SslContext.class, new ViolatedAssumptionAnswer());
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      DefaultEventLoopGroup defaultEventLoopGroup0 = new DefaultEventLoopGroup(0);
      SslContext sslContext1 = mock(SslContext.class, new ViolatedAssumptionAnswer());
      RxThreadFactory rxThreadFactory0 = new RxThreadFactory("io.netty.channel.embedded.EmbeddedSocketAddress");
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(channelPool0).when(asyncHttpClientConfig0).getChannelPool();
      doReturn(defaultEventLoopGroup0, defaultEventLoopGroup0).when(asyncHttpClientConfig0).getEventLoopGroup();
      doReturn(0).when(asyncHttpClientConfig0).getHandshakeTimeout();
      doReturn(sslContext0, sslContext1).when(asyncHttpClientConfig0).getSslContext();
      doReturn((SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      doReturn(threadFactory0, rxThreadFactory0).when(asyncHttpClientConfig0).getThreadFactory();
      Timer timer0 = mock(Timer.class, new ViolatedAssumptionAnswer());
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, timer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown event loop group DefaultEventLoopGroup
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((ChannelPool) null).when(asyncHttpClientConfig0).getChannelPool();
      doReturn((String[]) null).when(asyncHttpClientConfig0).getEnabledCipherSuites();
      doReturn((String[]) null).when(asyncHttpClientConfig0).getEnabledProtocols();
      doReturn(0).when(asyncHttpClientConfig0).getHandshakeTimeout();
      doReturn((SslContext) null).when(asyncHttpClientConfig0).getSslContext();
      doReturn((SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      doReturn(0).when(asyncHttpClientConfig0).getSslSessionCacheSize();
      doReturn(0).when(asyncHttpClientConfig0).getSslSessionTimeout();
      doReturn((ThreadFactory) null).when(asyncHttpClientConfig0).getThreadFactory();
      doReturn((String) null).when(asyncHttpClientConfig0).getThreadPoolName();
      doReturn(false).when(asyncHttpClientConfig0).isFilterInsecureCipherSuites();
      doReturn(false).when(asyncHttpClientConfig0).isKeepAlive();
      doReturn(false).when(asyncHttpClientConfig0).isUseInsecureTrustManager();
      doReturn(false).when(asyncHttpClientConfig0).isUseOpenSsl();
      Timer timer0 = mock(Timer.class, new ViolatedAssumptionAnswer());
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, timer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // poolName
         //
         verifyException("io.netty.util.internal.ObjectUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChannelPool channelPool0 = mock(ChannelPool.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[5];
      stringArray0[0] = "U#wzTG";
      SslContext sslContext0 = mock(SslContext.class, new ViolatedAssumptionAnswer());
      SslEngineFactory sslEngineFactory0 = mock(SslEngineFactory.class, new ViolatedAssumptionAnswer());
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(sslEngineFactory0, (SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      Timer timer0 = mock(Timer.class, new ViolatedAssumptionAnswer());
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, timer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ChannelPool channelPool0 = mock(ChannelPool.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      Timer timer0 = mock(Timer.class, new ViolatedAssumptionAnswer());
      ChannelPipeline channelPipeline0 = mock(ChannelPipeline.class, new ViolatedAssumptionAnswer());
      Uri uri0 = mock(Uri.class, new ViolatedAssumptionAnswer());
      SslContext sslContext0 = mock(SslContext.class, new ViolatedAssumptionAnswer());
      SslEngineFactory sslEngineFactory0 = mock(SslEngineFactory.class, new ViolatedAssumptionAnswer());
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(sslEngineFactory0, (SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      Timer timer1 = mock(Timer.class, new ViolatedAssumptionAnswer());
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, timer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[4];
      ChannelPool channelPool0 = mock(ChannelPool.class, new ViolatedAssumptionAnswer());
      SslContext sslContext0 = mock(SslContext.class, new ViolatedAssumptionAnswer());
      SslEngineFactory sslEngineFactory0 = mock(SslEngineFactory.class, new ViolatedAssumptionAnswer());
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(sslEngineFactory0, (SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, (Timer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SslContext sslContext0 = mock(SslContext.class, new ViolatedAssumptionAnswer());
      SslEngineFactory sslEngineFactory0 = mock(SslEngineFactory.class, new ViolatedAssumptionAnswer());
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(sslEngineFactory0, (SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      Timer timer0 = mock(Timer.class, new ViolatedAssumptionAnswer());
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, timer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ChannelPool channelPool0 = mock(ChannelPool.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      SslContext sslContext0 = mock(SslContext.class, new ViolatedAssumptionAnswer());
      SslEngineFactory sslEngineFactory0 = mock(SslEngineFactory.class, new ViolatedAssumptionAnswer());
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(sslEngineFactory0, (SslEngineFactory) null).when(asyncHttpClientConfig0).getSslEngineFactory();
      Timer timer0 = mock(Timer.class, new ViolatedAssumptionAnswer());
      ChannelManager channelManager0 = null;
      try {
        channelManager0 = new ChannelManager(asyncHttpClientConfig0, timer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.ChannelManager", e);
      }
  }
}
