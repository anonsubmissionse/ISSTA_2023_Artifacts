/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 04:00:53 GMT 2022
 */

package org.springside.modules.utils.concurrent.threadpool;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.springside.modules.utils.concurrent.threadpool.ThreadPoolBuilder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ThreadPoolBuilder_ESTest extends ThreadPoolBuilder_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThreadPoolBuilder.QueuableCachedThreadPoolBuilder threadPoolBuilder_QueuableCachedThreadPoolBuilder0 = ThreadPoolBuilder.queuableCachedPool();
      ThreadPoolBuilder.QueuableCachedThreadPoolBuilder threadPoolBuilder_QueuableCachedThreadPoolBuilder1 = threadPoolBuilder_QueuableCachedThreadPoolBuilder0.setQueueSize((-2998));
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ThreadPoolBuilder.FixedThreadPoolBuilder threadPoolBuilder_FixedThreadPoolBuilder0 = ThreadPoolBuilder.fixedPool();
      ThreadPoolBuilder.FixedThreadPoolBuilder threadPoolBuilder_FixedThreadPoolBuilder1 = threadPoolBuilder_FixedThreadPoolBuilder0.setThreadNamePrefix("");
      ThreadPoolExecutor threadPoolExecutor0 = threadPoolBuilder_FixedThreadPoolBuilder1.build();
      assertNotNull(threadPoolExecutor0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ThreadPoolBuilder.scheduledPool();
      ThreadPoolBuilder.CachedThreadPoolBuilder threadPoolBuilder_CachedThreadPoolBuilder0 = new ThreadPoolBuilder.CachedThreadPoolBuilder();
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ThreadPoolBuilder.QueuableCachedThreadPoolBuilder threadPoolBuilder_QueuableCachedThreadPoolBuilder0 = new ThreadPoolBuilder.QueuableCachedThreadPoolBuilder();
      ThreadPoolExecutor.AbortPolicy threadPoolExecutor_AbortPolicy0 = new ThreadPoolExecutor.AbortPolicy();
      threadPoolBuilder_QueuableCachedThreadPoolBuilder0.setRejectHanlder(threadPoolExecutor_AbortPolicy0);
      threadPoolBuilder_QueuableCachedThreadPoolBuilder0.setKeepAliveSecs(1335);
      Boolean boolean0 = Boolean.FALSE;
      ThreadPoolBuilder.QueuableCachedThreadPoolBuilder threadPoolBuilder_QueuableCachedThreadPoolBuilder1 = threadPoolBuilder_QueuableCachedThreadPoolBuilder0.setDaemon(boolean0);
      threadPoolBuilder_QueuableCachedThreadPoolBuilder1.build();
      ThreadPoolBuilder.FixedThreadPoolBuilder threadPoolBuilder_FixedThreadPoolBuilder0 = ThreadPoolBuilder.fixedPool();
      assertNotNull(threadPoolBuilder_FixedThreadPoolBuilder0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ThreadPoolBuilder.FixedThreadPoolBuilder threadPoolBuilder_FixedThreadPoolBuilder0 = new ThreadPoolBuilder.FixedThreadPoolBuilder();
      int int0 = (-1378);
      // Undeclared exception!
      try { 
        threadPoolBuilder_FixedThreadPoolBuilder0.setPoolSize((-1378));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // The validated expression is false
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ThreadPoolBuilder.ScheduledThreadPoolBuilder threadPoolBuilder_ScheduledThreadPoolBuilder0 = new ThreadPoolBuilder.ScheduledThreadPoolBuilder();
      ThreadPoolBuilder.ScheduledThreadPoolBuilder threadPoolBuilder_ScheduledThreadPoolBuilder1 = threadPoolBuilder_ScheduledThreadPoolBuilder0.setPoolSize(16);
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolBuilder.ScheduledThreadPoolBuilder threadPoolBuilder_ScheduledThreadPoolBuilder2 = threadPoolBuilder_ScheduledThreadPoolBuilder1.setThreadFactory(threadFactory0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ThreadPoolBuilder.ScheduledThreadPoolBuilder threadPoolBuilder_ScheduledThreadPoolBuilder0 = new ThreadPoolBuilder.ScheduledThreadPoolBuilder();
      ThreadPoolBuilder.ScheduledThreadPoolBuilder threadPoolBuilder_ScheduledThreadPoolBuilder1 = threadPoolBuilder_ScheduledThreadPoolBuilder0.setThreadNamePrefix("");
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ThreadPoolBuilder.ScheduledThreadPoolBuilder threadPoolBuilder_ScheduledThreadPoolBuilder0 = new ThreadPoolBuilder.ScheduledThreadPoolBuilder();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = threadPoolBuilder_ScheduledThreadPoolBuilder0.build();
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ThreadPoolBuilder.QueuableCachedThreadPoolBuilder threadPoolBuilder_QueuableCachedThreadPoolBuilder0 = new ThreadPoolBuilder.QueuableCachedThreadPoolBuilder();
      threadPoolBuilder_QueuableCachedThreadPoolBuilder0.build();
      ThreadPoolBuilder.QueuableCachedThreadPoolBuilder threadPoolBuilder_QueuableCachedThreadPoolBuilder1 = threadPoolBuilder_QueuableCachedThreadPoolBuilder0.setThreadNamePrefix("");
      ThreadPoolBuilder.QueuableCachedThreadPoolBuilder threadPoolBuilder_QueuableCachedThreadPoolBuilder2 = threadPoolBuilder_QueuableCachedThreadPoolBuilder1.setMaxSize(16);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ThreadPoolBuilder.QueuableCachedThreadPoolBuilder threadPoolBuilder_QueuableCachedThreadPoolBuilder0 = ThreadPoolBuilder.queuableCachedPool();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolBuilder.QueuableCachedThreadPoolBuilder threadPoolBuilder_QueuableCachedThreadPoolBuilder1 = threadPoolBuilder_QueuableCachedThreadPoolBuilder0.setThreadFactory(threadFactory0);
      ThreadPoolBuilder.QueuableCachedThreadPoolBuilder threadPoolBuilder_QueuableCachedThreadPoolBuilder2 = threadPoolBuilder_QueuableCachedThreadPoolBuilder1.setMinSize((-2998));
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ThreadPoolBuilder.CachedThreadPoolBuilder threadPoolBuilder_CachedThreadPoolBuilder0 = ThreadPoolBuilder.cachedPool();
      Boolean boolean0 = Boolean.TRUE;
      ThreadPoolBuilder.CachedThreadPoolBuilder threadPoolBuilder_CachedThreadPoolBuilder1 = threadPoolBuilder_CachedThreadPoolBuilder0.setThreadNamePrefix("");
      threadPoolBuilder_CachedThreadPoolBuilder0.setDaemon(boolean0);
      ThreadPoolExecutor threadPoolExecutor0 = threadPoolBuilder_CachedThreadPoolBuilder1.build();
      assertNotNull(threadPoolExecutor0);
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ThreadPoolBuilder.CachedThreadPoolBuilder threadPoolBuilder_CachedThreadPoolBuilder0 = ThreadPoolBuilder.cachedPool();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      threadPoolBuilder_CachedThreadPoolBuilder0.setMinSize(16);
      ThreadPoolExecutor threadPoolExecutor0 = threadPoolBuilder_CachedThreadPoolBuilder0.build();
      assertNotNull(threadPoolExecutor0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ThreadPoolBuilder.CachedThreadPoolBuilder threadPoolBuilder_CachedThreadPoolBuilder0 = ThreadPoolBuilder.cachedPool();
      ThreadPoolExecutor threadPoolExecutor0 = threadPoolBuilder_CachedThreadPoolBuilder0.build();
      threadPoolBuilder_CachedThreadPoolBuilder0.setMaxSize(16);
      ThreadPoolExecutor threadPoolExecutor1 = threadPoolBuilder_CachedThreadPoolBuilder0.build();
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ThreadPoolBuilder.CachedThreadPoolBuilder threadPoolBuilder_CachedThreadPoolBuilder0 = ThreadPoolBuilder.cachedPool();
      ThreadPoolExecutor.DiscardPolicy threadPoolExecutor_DiscardPolicy0 = new ThreadPoolExecutor.DiscardPolicy();
      ThreadPoolBuilder.CachedThreadPoolBuilder threadPoolBuilder_CachedThreadPoolBuilder1 = threadPoolBuilder_CachedThreadPoolBuilder0.setRejectHanlder(threadPoolExecutor_DiscardPolicy0);
      ThreadPoolExecutor threadPoolExecutor0 = threadPoolBuilder_CachedThreadPoolBuilder1.build();
      assertNotNull(threadPoolExecutor0);
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ThreadPoolBuilder.CachedThreadPoolBuilder threadPoolBuilder_CachedThreadPoolBuilder0 = ThreadPoolBuilder.cachedPool();
      threadPoolBuilder_CachedThreadPoolBuilder0.setKeepAliveSecs(16);
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolBuilder.CachedThreadPoolBuilder threadPoolBuilder_CachedThreadPoolBuilder1 = threadPoolBuilder_CachedThreadPoolBuilder0.setThreadFactory(threadFactory0);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ThreadPoolBuilder.QueuableCachedThreadPoolBuilder threadPoolBuilder_QueuableCachedThreadPoolBuilder0 = new ThreadPoolBuilder.QueuableCachedThreadPoolBuilder();
      ThreadPoolExecutor.AbortPolicy threadPoolExecutor_AbortPolicy0 = new ThreadPoolExecutor.AbortPolicy();
      ThreadPoolBuilder threadPoolBuilder0 = new ThreadPoolBuilder();
      ThreadPoolBuilder.FixedThreadPoolBuilder threadPoolBuilder_FixedThreadPoolBuilder0 = new ThreadPoolBuilder.FixedThreadPoolBuilder();
      ThreadPoolBuilder.FixedThreadPoolBuilder threadPoolBuilder_FixedThreadPoolBuilder1 = threadPoolBuilder_FixedThreadPoolBuilder0.setQueueSize(1335);
      threadPoolBuilder_FixedThreadPoolBuilder1.setRejectHanlder(threadPoolExecutor_AbortPolicy0);
      ThreadPoolExecutor threadPoolExecutor0 = threadPoolBuilder_FixedThreadPoolBuilder0.build();
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      ThreadPoolBuilder.FixedThreadPoolBuilder threadPoolBuilder_FixedThreadPoolBuilder0 = new ThreadPoolBuilder.FixedThreadPoolBuilder();
      ThreadPoolBuilder.FixedThreadPoolBuilder threadPoolBuilder_FixedThreadPoolBuilder1 = threadPoolBuilder_FixedThreadPoolBuilder0.setDaemon(boolean0);
      ThreadPoolExecutor threadPoolExecutor0 = threadPoolBuilder_FixedThreadPoolBuilder1.build();
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ThreadPoolBuilder threadPoolBuilder0 = new ThreadPoolBuilder();
      ThreadPoolBuilder.FixedThreadPoolBuilder threadPoolBuilder_FixedThreadPoolBuilder0 = new ThreadPoolBuilder.FixedThreadPoolBuilder();
      ThreadPoolBuilder.FixedThreadPoolBuilder threadPoolBuilder_FixedThreadPoolBuilder1 = threadPoolBuilder_FixedThreadPoolBuilder0.setPoolSize(1335);
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolBuilder.FixedThreadPoolBuilder threadPoolBuilder_FixedThreadPoolBuilder2 = threadPoolBuilder_FixedThreadPoolBuilder1.setThreadFactory(threadFactory0);
      threadPoolBuilder_FixedThreadPoolBuilder2.setQueueSize(1335);
      ThreadPoolBuilder.FixedThreadPoolBuilder threadPoolBuilder_FixedThreadPoolBuilder3 = ThreadPoolBuilder.fixedPool();
      ;
}
}
