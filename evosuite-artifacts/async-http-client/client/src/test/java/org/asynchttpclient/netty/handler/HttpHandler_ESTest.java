/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 22:12:03 GMT 2022
 */

package org.asynchttpclient.netty.handler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.asynchttpclient.AsyncHttpClientConfig;
import org.asynchttpclient.netty.channel.ChannelManager;
import org.asynchttpclient.netty.handler.HttpHandler;
import org.asynchttpclient.netty.request.NettyRequestSender;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpHandler_ESTest extends HttpHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChannelManager channelManager0 = mock(ChannelManager.class, new ViolatedAssumptionAnswer());
      NettyRequestSender nettyRequestSender0 = mock(NettyRequestSender.class, new ViolatedAssumptionAnswer());
      HttpHandler httpHandler0 = null;
      try {
        httpHandler0 = new HttpHandler((AsyncHttpClientConfig) null, channelManager0, nettyRequestSender0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.handler.intercept.Redirect30xInterceptor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(asyncHttpClientConfig0).getMaxRedirects();
      ChannelManager channelManager0 = mock(ChannelManager.class, new ViolatedAssumptionAnswer());
      HttpHandler httpHandler0 = null;
      try {
        httpHandler0 = new HttpHandler(asyncHttpClientConfig0, channelManager0, (NettyRequestSender) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
