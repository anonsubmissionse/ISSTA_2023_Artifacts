/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 20:51:41 GMT 2022
 */

package org.apache.commons.net.examples.mail;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.net.examples.mail.POP3Mail;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class POP3Mail_ESTest extends POP3Mail_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "  Subject: ";
      stringArray0[2] = "MD5";
      // Undeclared exception!
      try { 
        POP3Mail.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
         //
         // For input string: \" \"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringReader stringReader0 = new StringReader("from: hostname doesn't mOtch certificate");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      POP3Mail.printMessageInfo(bufferedReader0, (-1890));
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[0] = "B6S]-$[Sav@ -lr";
      stringArray0[2] = "*";
      POP3Mail.main(stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        POP3Mail.printMessageInfo((BufferedReader) null, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.examples.mail.POP3Mail", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@+SSf");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 6730);
      bufferedReader0.close();
      try { 
        POP3Mail.printMessageInfo(bufferedReader0, 6730);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = ":";
      // Undeclared exception!
      try { 
        POP3Mail.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.net.examples.mail.POP3Mail", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Could not retrieve password: ";
      stringArray0[2] = "  J|,{W[m|;[\"z0";
      stringArray0[3] = "!Df";
      // Undeclared exception!
      try { 
        POP3Mail.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
         //
         // For input string: \" \"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[3];
          stringArray0[0] = "p.Nx<Ipzym <;DM";
          stringArray0[2] = "p.Nx<Ipzym <;DM";
          // Undeclared exception!
          try { 
            POP3Mail.main(stringArray0);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"200.42.42.0:110\" \"connect,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkConnect(SecurityManager.java:1051)
             // java.net.Socket.connect(Socket.java:602)
             // org.apache.commons.net.SocketClient._connect(SocketClient.java:253)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:212)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:316)
             // org.apache.commons.net.examples.mail.POP3Mail.main(POP3Mail.java:107)
             // sun.reflect.GeneratedMethodAccessor147.invoke(Unknown Source)
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
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        POP3Mail.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        POP3Mail.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.examples.mail.POP3Mail", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("irom: @M|gKTo");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 22);
      POP3Mail.printMessageInfo(bufferedReader0, 22);
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("subject: s%bj;ct: 8ijqI]jliu) c[");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      POP3Mail.printMessageInfo(bufferedReader0, 10);
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      POP3Mail pOP3Mail0 = new POP3Mail();
  }
}
