/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 20:58:15 GMT 2022
 */

package org.apache.commons.net.bsd;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.net.bsd.RCommandClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RCommandClient_ESTest extends RCommandClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      // Undeclared exception!
      try { 
        rCommandClient0.rcommand("66rW]p6AY)6%c", "", "66rW]p6AY)6%c");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.bsd.RExecClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
          RCommandClient rCommandClient0 = new RCommandClient();
          // Undeclared exception!
          try { 
            rCommandClient0.connect("3So(", (-3026), inetAddress0, 733);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"localhost:733\" \"listen,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkListen(SecurityManager.java:1131)
             // java.net.Socket.bind(Socket.java:660)
             // org.apache.commons.net.SocketClient._connect(SocketClient.java:251)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:278)
             // org.apache.commons.net.bsd.RCommandClient.connect(RCommandClient.java:342)
             // sun.reflect.GeneratedMethodAccessor113.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          RCommandClient rCommandClient0 = new RCommandClient();
          InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
          // Undeclared exception!
          try { 
            rCommandClient0.connect("m|hL'", 1023, inetAddress0, 1023);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"localhost:1023\" \"listen,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkListen(SecurityManager.java:1131)
             // java.net.Socket.bind(Socket.java:660)
             // org.apache.commons.net.SocketClient._connect(SocketClient.java:251)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:278)
             // org.apache.commons.net.bsd.RCommandClient.connect(RCommandClient.java:342)
             // sun.reflect.GeneratedMethodAccessor113.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          InetAddress inetAddress0 = MockInetAddress.getByName("?d,{x DtihnD,O\"{;E");
          RCommandClient rCommandClient0 = new RCommandClient();
          InetAddress inetAddress1 = MockInetAddress.getLoopbackAddress();
          // Undeclared exception!
          try { 
            rCommandClient0.connect(inetAddress0, (-137), inetAddress1, 512);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"localhost:512\" \"listen,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkListen(SecurityManager.java:1131)
             // java.net.Socket.bind(Socket.java:660)
             // org.apache.commons.net.SocketClient._connect(SocketClient.java:251)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:236)
             // org.apache.commons.net.bsd.RCommandClient.connect(RCommandClient.java:309)
             // sun.reflect.GeneratedMethodAccessor112.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          RCommandClient rCommandClient0 = new RCommandClient();
          byte[] byteArray0 = new byte[4];
          InetAddress inetAddress0 = MockInetAddress.getByAddress(byteArray0);
          // Undeclared exception!
          try { 
            rCommandClient0.connect(inetAddress0, (int) (byte)43, inetAddress0, 1023);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"localhost:1023\" \"listen,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkListen(SecurityManager.java:1131)
             // java.net.Socket.bind(Socket.java:660)
             // org.apache.commons.net.SocketClient._connect(SocketClient.java:251)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:236)
             // org.apache.commons.net.bsd.RCommandClient.connect(RCommandClient.java:309)
             // sun.reflect.GeneratedMethodAccessor112.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      // Undeclared exception!
      try { 
        rCommandClient0.createErrorStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.SocketClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      // Undeclared exception!
      try { 
        rCommandClient0.connect((InetAddress) null, (-4649), (InetAddress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.Socket", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = MockInetAddress.getByAddress(byteArray0);
      // Undeclared exception!
      try { 
        rCommandClient0.connect(inetAddress0, (-248), inetAddress0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-248
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      Proxy proxy0 = Proxy.NO_PROXY;
      rCommandClient0.setProxy(proxy0);
      try { 
        rCommandClient0.connect(inetAddress0, 804, inetAddress0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@39d71465
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      // Undeclared exception!
      try { 
        rCommandClient0.connect(inetAddress0, (-1719));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1719
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      Proxy proxy0 = Proxy.NO_PROXY;
      rCommandClient0.setProxy(proxy0);
      try { 
        rCommandClient0.connect((InetAddress) null, 1769);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@73f24a9d
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      Proxy proxy0 = Proxy.NO_PROXY;
      rCommandClient0.setProxy(proxy0);
      try { 
        rCommandClient0.connect("\r\n", 512, inetAddress0, 512);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@5df6efc0
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      // Undeclared exception!
      try { 
        rCommandClient0.connect((String) null, (-338), inetAddress0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-338
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      Proxy proxy0 = Proxy.NO_PROXY;
      rCommandClient0.setProxy(proxy0);
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      try { 
        rCommandClient0.connect("yv-N>QeX!Y-z>e8Onn", 0, inetAddress0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@5df6b1c0
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      // Undeclared exception!
      try { 
        rCommandClient0.connect("\r\n", (-2160));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-2160
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      Proxy proxy0 = Proxy.NO_PROXY;
      rCommandClient0.setProxy(proxy0);
      try { 
        rCommandClient0.connect("org.apache.commons.io.filefilter.iddenFileFilte", 1023);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@5df72da1
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      try { 
        rCommandClient0.connect("\r\n", 1023, (InetAddress) null, 4222);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid port number 4222
         //
         verifyException("org.apache.commons.net.bsd.RCommandClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      try { 
        rCommandClient0.connect((String) null, (-640), inetAddress0, (-640));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid port number -640
         //
         verifyException("org.apache.commons.net.bsd.RCommandClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      try { 
        rCommandClient0.connect((InetAddress) null, 1023, (InetAddress) null, 2215);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid port number 2215
         //
         verifyException("org.apache.commons.net.bsd.RCommandClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      try { 
        rCommandClient0.connect(inetAddress0, (-12), inetAddress0, (-12));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid port number -12
         //
         verifyException("org.apache.commons.net.bsd.RCommandClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      // Undeclared exception!
      try { 
        rCommandClient0.rcommand("", "UKQj:R.2", "mi", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.SocketClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      // Undeclared exception!
      try { 
        rCommandClient0.rcommand((String) null, "org.apache.commons.net.DefaultSocketFactory", "org.apache.commons.net.DefaultSocketFactory");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.bsd.RExecClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RCommandClient rCommandClient0 = new RCommandClient();
      // Undeclared exception!
      try { 
        rCommandClient0.connect((InetAddress) null, 1769);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.Socket", e);
      }
  }
}
