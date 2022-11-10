/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 21:08:28 GMT 2022
 */

package org.apache.commons.net.examples.ntp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.net.examples.ntp.TimeClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeClient_ESTest extends TimeClient_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        TimeClient.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 40000);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 37);
      byte[] byteArray0 = new byte[9];
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, evoSuiteRemoteAddress0, byteArray0);
      TimeClient.timeUDP("wgwss");
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[2];
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 40000);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 37);
      byte[] byteArray0 = new byte[0];
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, evoSuiteRemoteAddress0, byteArray0);
      stringArray0[0] = "-udp";
      TimeClient.main(stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeClient.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.examples.ntp.TimeClient", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          // Undeclared exception!
          try { 
            TimeClient.timeTCP("");
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"127.0.0.1:37\" \"connect,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkConnect(SecurityManager.java:1051)
             // java.net.Socket.connect(Socket.java:602)
             // org.apache.commons.net.SocketClient._connect(SocketClient.java:253)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:212)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:316)
             // org.apache.commons.net.examples.ntp.TimeClient.timeTCP(TimeClient.java:47)
             // sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             // sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
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
  public void test5()  throws Throwable  {
      try { 
        TimeClient.timeUDP("");
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Simulated IO exception
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoDatagramSocketImpl", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-wdp";
      // Undeclared exception!
      try { 
        TimeClient.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[11];
      // Undeclared exception!
      try { 
        TimeClient.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TimeClient timeClient0 = new TimeClient();
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-udp";
      // Undeclared exception!
      try { 
        TimeClient.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[1];
          // Undeclared exception!
          try { 
            TimeClient.main(stringArray0);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"127.0.0.1:37\" \"connect,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkConnect(SecurityManager.java:1051)
             // java.net.Socket.connect(Socket.java:602)
             // org.apache.commons.net.SocketClient._connect(SocketClient.java:253)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:212)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:316)
             // org.apache.commons.net.examples.ntp.TimeClient.timeTCP(TimeClient.java:47)
             // org.apache.commons.net.examples.ntp.TimeClient.main(TimeClient.java:72)
             // sun.reflect.GeneratedMethodAccessor20.invoke(Unknown Source)
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
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
