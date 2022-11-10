/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 04:04:11 GMT 2022
 */

package org.springside.modules.utils.concurrent.threadpool;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.net.SSLSocketReceiver;
import java.util.IllegalFormatConversionException;
import java.util.MissingFormatArgumentException;
import java.util.MissingFormatWidthException;
import java.util.UnknownFormatConversionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;
import org.springside.modules.utils.concurrent.threadpool.ThreadPoolUtil;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ThreadPoolUtil_ESTest extends ThreadPoolUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SSLSocketReceiver sSLSocketReceiver0 = new SSLSocketReceiver();
      ThreadPoolUtil.SafeRunnable threadPoolUtil_SafeRunnable0 = new ThreadPoolUtil.SafeRunnable(sSLSocketReceiver0);
      threadPoolUtil_SafeRunnable0.run();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      boolean boolean0 = ThreadPoolUtil.gracefulShutdown((ExecutorService) forkJoinPool0, (-224), timeUnit0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      boolean boolean0 = ThreadPoolUtil.gracefulShutdown((ExecutorService) forkJoinPool0, (-954));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        ThreadPoolUtil.buildThreadFactory("@[M|%`[%", false);
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = '`'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        ThreadPoolUtil.buildThreadFactory("a54o&I\r%", true);
        fail("Expecting exception: MissingFormatWidthException");
      
      } catch(MissingFormatWidthException e) {
         //
         // %-%
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ThreadPoolUtil.buildThreadFactory("-%d", true);
        fail("Expecting exception: MissingFormatArgumentException");
      
      } catch(MissingFormatArgumentException e) {
         //
         // Format specifier '%d'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ThreadPoolUtil.buildThreadFactory("WY!@mg4%a*", true);
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // a != java.lang.Integer
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        ThreadPoolUtil.buildThreadFactory("aB[+%vK>d6\"az]5556Q");
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = 'v'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ThreadPoolUtil.buildThreadFactory("-%d");
        fail("Expecting exception: MissingFormatArgumentException");
      
      } catch(MissingFormatArgumentException e) {
         //
         // Format specifier '%d'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      boolean boolean0 = ThreadPoolUtil.gracefulShutdown((ExecutorService) forkJoinPool0, 0, timeUnit0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      boolean boolean0 = ThreadPoolUtil.gracefulShutdown((ExecutorService) null, 0, timeUnit0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      boolean boolean0 = ThreadPoolUtil.gracefulShutdown((ExecutorService) forkJoinPool0, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = ThreadPoolUtil.gracefulShutdown((ExecutorService) null, (-2622));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockThread mockThread0 = new MockThread();
      Runnable runnable0 = ThreadPoolUtil.safeRunnable(mockThread0);
      runnable0.run();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ThreadFactory threadFactory0 = ThreadPoolUtil.buildThreadFactory("org.apache.commons.lang3.concurrent.BasicThreadFactory", false);
      assertNotNull(threadFactory0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ThreadPoolUtil.safeRunnable((Runnable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The validated object is null
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ThreadFactory threadFactory0 = ThreadPoolUtil.buildThreadFactory("");
      assertNotNull(threadFactory0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ThreadPoolUtil threadPoolUtil0 = new ThreadPoolUtil();
  }
}
