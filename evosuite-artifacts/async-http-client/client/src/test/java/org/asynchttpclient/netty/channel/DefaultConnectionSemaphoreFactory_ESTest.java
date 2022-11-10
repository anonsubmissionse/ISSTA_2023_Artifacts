/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:42:17 GMT 2022
 */

package org.asynchttpclient.netty.channel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.asynchttpclient.AsyncHttpClientConfig;
import org.asynchttpclient.netty.channel.ConnectionSemaphore;
import org.asynchttpclient.netty.channel.DefaultConnectionSemaphoreFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultConnectionSemaphoreFactory_ESTest extends DefaultConnectionSemaphoreFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultConnectionSemaphoreFactory defaultConnectionSemaphoreFactory0 = new DefaultConnectionSemaphoreFactory();
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((-2549)).when(asyncHttpClientConfig0).getAcquireFreeChannelTimeout();
      doReturn(0).when(asyncHttpClientConfig0).getMaxConnections();
      doReturn(39).when(asyncHttpClientConfig0).getMaxConnectionsPerHost();
      ConnectionSemaphore connectionSemaphore0 = defaultConnectionSemaphoreFactory0.newConnectionSemaphore(asyncHttpClientConfig0);
      assertNotNull(connectionSemaphore0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultConnectionSemaphoreFactory defaultConnectionSemaphoreFactory0 = new DefaultConnectionSemaphoreFactory();
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(asyncHttpClientConfig0).getAcquireFreeChannelTimeout();
      doReturn(0).when(asyncHttpClientConfig0).getMaxConnections();
      doReturn(0).when(asyncHttpClientConfig0).getMaxConnectionsPerHost();
      ConnectionSemaphore connectionSemaphore0 = defaultConnectionSemaphoreFactory0.newConnectionSemaphore(asyncHttpClientConfig0);
      assertNotNull(connectionSemaphore0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultConnectionSemaphoreFactory defaultConnectionSemaphoreFactory0 = new DefaultConnectionSemaphoreFactory();
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((-144)).when(asyncHttpClientConfig0).getAcquireFreeChannelTimeout();
      doReturn(2240).when(asyncHttpClientConfig0).getMaxConnections();
      doReturn(988).when(asyncHttpClientConfig0).getMaxConnectionsPerHost();
      ConnectionSemaphore connectionSemaphore0 = defaultConnectionSemaphoreFactory0.newConnectionSemaphore(asyncHttpClientConfig0);
      assertNotNull(connectionSemaphore0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultConnectionSemaphoreFactory defaultConnectionSemaphoreFactory0 = new DefaultConnectionSemaphoreFactory();
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((-2549)).when(asyncHttpClientConfig0).getAcquireFreeChannelTimeout();
      doReturn(335).when(asyncHttpClientConfig0).getMaxConnections();
      doReturn(0).when(asyncHttpClientConfig0).getMaxConnectionsPerHost();
      ConnectionSemaphore connectionSemaphore0 = defaultConnectionSemaphoreFactory0.newConnectionSemaphore(asyncHttpClientConfig0);
      assertNotNull(connectionSemaphore0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultConnectionSemaphoreFactory defaultConnectionSemaphoreFactory0 = new DefaultConnectionSemaphoreFactory();
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(335).when(asyncHttpClientConfig0).getAcquireFreeChannelTimeout();
      doReturn(0).when(asyncHttpClientConfig0).getMaxConnections();
      doReturn((-2549)).when(asyncHttpClientConfig0).getMaxConnectionsPerHost();
      ConnectionSemaphore connectionSemaphore0 = defaultConnectionSemaphoreFactory0.newConnectionSemaphore(asyncHttpClientConfig0);
      assertNotNull(connectionSemaphore0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultConnectionSemaphoreFactory defaultConnectionSemaphoreFactory0 = new DefaultConnectionSemaphoreFactory();
      // Undeclared exception!
      try { 
        defaultConnectionSemaphoreFactory0.newConnectionSemaphore((AsyncHttpClientConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.netty.channel.DefaultConnectionSemaphoreFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultConnectionSemaphoreFactory defaultConnectionSemaphoreFactory0 = new DefaultConnectionSemaphoreFactory();
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(285).when(asyncHttpClientConfig0).getAcquireFreeChannelTimeout();
      doReturn((-322)).when(asyncHttpClientConfig0).getMaxConnections();
      doReturn((-322)).when(asyncHttpClientConfig0).getMaxConnectionsPerHost();
      ConnectionSemaphore connectionSemaphore0 = defaultConnectionSemaphoreFactory0.newConnectionSemaphore(asyncHttpClientConfig0);
      assertNotNull(connectionSemaphore0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultConnectionSemaphoreFactory defaultConnectionSemaphoreFactory0 = new DefaultConnectionSemaphoreFactory();
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((-322)).when(asyncHttpClientConfig0).getAcquireFreeChannelTimeout();
      doReturn(285).when(asyncHttpClientConfig0).getMaxConnections();
      doReturn((-322)).when(asyncHttpClientConfig0).getMaxConnectionsPerHost();
      ConnectionSemaphore connectionSemaphore0 = defaultConnectionSemaphoreFactory0.newConnectionSemaphore(asyncHttpClientConfig0);
      assertNotNull(connectionSemaphore0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultConnectionSemaphoreFactory defaultConnectionSemaphoreFactory0 = new DefaultConnectionSemaphoreFactory();
      AsyncHttpClientConfig asyncHttpClientConfig0 = mock(AsyncHttpClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(285).when(asyncHttpClientConfig0).getAcquireFreeChannelTimeout();
      doReturn((-322)).when(asyncHttpClientConfig0).getMaxConnections();
      doReturn(285).when(asyncHttpClientConfig0).getMaxConnectionsPerHost();
      ConnectionSemaphore connectionSemaphore0 = defaultConnectionSemaphoreFactory0.newConnectionSemaphore(asyncHttpClientConfig0);
      assertNotNull(connectionSemaphore0);
  }
}
