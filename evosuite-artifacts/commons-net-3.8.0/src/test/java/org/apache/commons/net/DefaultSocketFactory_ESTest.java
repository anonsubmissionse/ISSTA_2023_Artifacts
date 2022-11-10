/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 21:06:37 GMT 2022
 */

package org.apache.commons.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.Socket;
import org.apache.commons.net.DefaultSocketFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultSocketFactory_ESTest extends DefaultSocketFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory();
      InetAddress inetAddress0 = MockInetAddress.getByName(":~%`&vzZrVS'A:n 1n");
      ServerSocket serverSocket0 = defaultSocketFactory0.createServerSocket(0, 798, inetAddress0);
      assertEquals("ServerSocket[addr=null,localport=40000]", serverSocket0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory();
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      InetAddress inetAddress1 = MockInetAddress.getByName("");
      try { 
        defaultSocketFactory0.createSocket(inetAddress0, 0, inetAddress1, 1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@3b7fa506
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory(proxy0);
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = MockInetAddress.getByAddress("J`%RAEBJ&c3c?]92r", byteArray0);
      InetAddress inetAddress1 = MockInetAddress.getByAddress(byteArray0);
      // Undeclared exception!
      try { 
        defaultSocketFactory0.createSocket(inetAddress0, (-1229), inetAddress1, (int) (byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1229
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory(proxy0);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("192.168.1.42", 3);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      Socket socket0 = defaultSocketFactory0.createSocket(inetAddress0, (int) (byte)3);
      assertFalse(socket0.isInputShutdown());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 867);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Proxy proxy0 = Proxy.NO_PROXY;
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory(proxy0);
      InetAddress inetAddress0 = MockInetAddress.getByName(",d/}8X`ky6SW|3C");
      Socket socket0 = defaultSocketFactory0.createSocket(inetAddress0, 867, inetAddress0, 867);
      assertEquals("Socket[addr=,d/}8X`ky6SW|3C/200.42.42.0,port=867,localport=867]", socket0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory();
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("192.168.1.42", 3);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      Socket socket0 = defaultSocketFactory0.createSocket(inetAddress0, (int) (byte)3);
      assertTrue(socket0.isBound());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory(proxy0);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 471);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      Socket socket0 = defaultSocketFactory0.createSocket("TLD-,Y>zEFze?ym@", 471, inetAddress0, 0);
      assertEquals("Socket[addr=/200.42.42.0,port=471,localport=40000]", socket0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory(proxy0);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 471);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Socket socket0 = defaultSocketFactory0.createSocket("TLD-,Y>zEFze?ym@", 471);
      assertTrue(socket0.isConnected());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory();
      // Undeclared exception!
      try { 
        defaultSocketFactory0.createSocket((InetAddress) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory(proxy0);
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      // Undeclared exception!
      try { 
        defaultSocketFactory0.createSocket(inetAddress0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      // Undeclared exception!
      try { 
        defaultSocketFactory0.createSocket("c~w<Z+E3;", 1259, inetAddress0, (-6729));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-6729
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory(proxy0);
      // Undeclared exception!
      try { 
        defaultSocketFactory0.createSocket("org.apache.commons.net.DefaultSocketFactory", (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Proxy.Type proxy_Type0 = Proxy.Type.HTTP;
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("_O%?2Bc_BB2", 0);
      Proxy proxy0 = new Proxy(proxy_Type0, inetSocketAddress0);
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory(proxy0);
      // Undeclared exception!
      try { 
        defaultSocketFactory0.createSocket();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid Proxy
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory(proxy0);
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      // Undeclared exception!
      try { 
        defaultSocketFactory0.createServerSocket((-1134), (-1134), inetAddress0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -1134
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory();
      // Undeclared exception!
      try { 
        defaultSocketFactory0.createServerSocket((-3165), (-3165));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -3165
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Proxy.Type proxy_Type0 = Proxy.Type.HTTP;
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(inetAddress0, 1468);
      Proxy proxy0 = new Proxy(proxy_Type0, mockInetSocketAddress0);
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory(proxy0);
      defaultSocketFactory0.createServerSocket(1468);
      try { 
        defaultSocketFactory0.createServerSocket(1468, (-1));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to open TCP port
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory(proxy0);
      // Undeclared exception!
      try { 
        defaultSocketFactory0.createServerSocket((-375));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -375
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory();
      // Undeclared exception!
      try { 
        defaultSocketFactory0.createSocket((InetAddress) null, 1070, (InetAddress) null, 1070);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory(proxy0);
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      try { 
        defaultSocketFactory0.createSocket("TLD-,Y>zEFze?ym@", 471, inetAddress0, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@25851b69
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory(proxy0);
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      try { 
        defaultSocketFactory0.createSocket(inetAddress0, (int) (byte)3);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@3b7fa563
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory(proxy0);
      try { 
        defaultSocketFactory0.createSocket("", 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@164e3a9
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory();
      try { 
        defaultSocketFactory0.createSocket("7nP&7", 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@2584e260
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory(proxy0);
      Socket socket0 = defaultSocketFactory0.createSocket();
      assertFalse(socket0.isBound());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory();
      Socket socket0 = defaultSocketFactory0.createSocket();
      assertFalse(socket0.isInputShutdown());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory();
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      defaultSocketFactory0.createServerSocket(12, 12, inetAddress0);
      try { 
        defaultSocketFactory0.createServerSocket(12);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to open TCP port
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory();
      ServerSocket serverSocket0 = defaultSocketFactory0.createServerSocket(2015, 0);
      assertEquals("ServerSocket[addr=null,localport=2015]", serverSocket0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultSocketFactory defaultSocketFactory0 = new DefaultSocketFactory((Proxy) null);
      defaultSocketFactory0.createServerSocket(829);
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      try { 
        defaultSocketFactory0.createServerSocket(829, 829, inetAddress0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to open TCP port
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }
}
