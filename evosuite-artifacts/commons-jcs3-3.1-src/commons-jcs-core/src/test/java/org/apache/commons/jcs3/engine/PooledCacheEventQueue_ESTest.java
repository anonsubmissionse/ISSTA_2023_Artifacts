/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 21:55:05 GMT 2022
 */

package org.apache.commons.jcs3.engine;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.commons.jcs3.auxiliary.lateral.LateralCache;
import org.apache.commons.jcs3.auxiliary.lateral.LateralCacheAttributes;
import org.apache.commons.jcs3.auxiliary.lateral.LateralCacheMonitor;
import org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPCacheFactory;
import org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.TCPLateralCacheAttributes;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCache;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCacheAttributes;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCacheFactory;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCacheMonitor;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCacheNoWait;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCacheNoWaitFacade;
import org.apache.commons.jcs3.auxiliary.remote.behavior.IRemoteCacheListener;
import org.apache.commons.jcs3.engine.AbstractCacheEventQueue;
import org.apache.commons.jcs3.engine.CacheAdaptor;
import org.apache.commons.jcs3.engine.CacheEventQueue;
import org.apache.commons.jcs3.engine.CompositeCacheAttributes;
import org.apache.commons.jcs3.engine.ElementAttributes;
import org.apache.commons.jcs3.engine.PooledCacheEventQueue;
import org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal;
import org.apache.commons.jcs3.engine.behavior.ICache;
import org.apache.commons.jcs3.engine.behavior.ICacheEventQueue;
import org.apache.commons.jcs3.engine.behavior.ICacheListener;
import org.apache.commons.jcs3.engine.behavior.ICacheServiceNonLocal;
import org.apache.commons.jcs3.engine.behavior.ICompositeCacheAttributes;
import org.apache.commons.jcs3.engine.control.CompositeCache;
import org.apache.commons.jcs3.engine.control.CompositeCacheManager;
import org.apache.commons.jcs3.engine.logging.CacheEventLoggerDebugLogger;
import org.apache.commons.jcs3.engine.logging.behavior.ICacheEventLogger;
import org.apache.commons.jcs3.engine.stats.behavior.IStats;
import org.apache.commons.jcs3.utils.serialization.CompressingSerializer;
import org.apache.commons.jcs3.utils.serialization.StandardSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PooledCacheEventQueue_ESTest extends PooledCacheEventQueue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TCPLateralCacheAttributes tCPLateralCacheAttributes0 = new TCPLateralCacheAttributes();
      ZombieCacheServiceNonLocal<Integer, Delayed> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<Integer, Delayed>();
      LateralTCPCacheFactory lateralTCPCacheFactory0 = new LateralTCPCacheFactory();
      LateralCacheMonitor lateralCacheMonitor0 = new LateralCacheMonitor(lateralTCPCacheFactory0);
      LateralCache<Integer, Delayed> lateralCache0 = new LateralCache<Integer, Delayed>(tCPLateralCacheAttributes0, zombieCacheServiceNonLocal0, lateralCacheMonitor0);
      CacheAdaptor<Integer, Delayed> cacheAdaptor0 = new CacheAdaptor<Integer, Delayed>(lateralCache0);
      CacheEventQueue<Integer, Delayed> cacheEventQueue0 = new CacheEventQueue<Integer, Delayed>(cacheAdaptor0, 0L, "{_4EOPCb^c_}B3");
      cacheEventQueue0.initialize(cacheAdaptor0, 0L, "org.apache.commons.jcs3.engine.logging.CacheEventLoggerDebugLogger", 4197, 4197, (String) null);
      assertEquals(10000, cacheEventQueue0.getWaitToDieMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompositeCacheManager.getInstance("");
      CacheAdaptor<ThreadPoolExecutor, String> cacheAdaptor0 = new CacheAdaptor<ThreadPoolExecutor, String>((ICache<ThreadPoolExecutor, String>) null);
      PooledCacheEventQueue<ThreadPoolExecutor, String> pooledCacheEventQueue0 = new PooledCacheEventQueue<ThreadPoolExecutor, String>(cacheAdaptor0, 1420L, "", 180, (-2868), "{0} - Aux cache[{1}] hit, but element expired.");
      assertEquals(1420L, pooledCacheEventQueue0.getListenerId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompositeCacheAttributes compositeCacheAttributes0 = new CompositeCacheAttributes();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      CompositeCache<PooledCacheEventQueue<Object, Object>, String> compositeCache0 = new CompositeCache<PooledCacheEventQueue<Object, Object>, String>(compositeCacheAttributes0, elementAttributes0);
      CacheAdaptor<PooledCacheEventQueue<Object, Object>, String> cacheAdaptor0 = new CacheAdaptor<PooledCacheEventQueue<Object, Object>, String>(compositeCache0);
      CacheEventQueue<PooledCacheEventQueue<Object, Object>, String> cacheEventQueue0 = new CacheEventQueue<PooledCacheEventQueue<Object, Object>, String>(cacheAdaptor0, 100L, "{cuSk?[i");
      cacheEventQueue0.addRemoveAllEvent();
      int int0 = cacheEventQueue0.size();
      assertEquals(100L, cacheEventQueue0.getListenerId());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompositeCacheAttributes compositeCacheAttributes0 = new CompositeCacheAttributes();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      CompositeCache<Object, Object> compositeCache0 = new CompositeCache<Object, Object>(compositeCacheAttributes0, elementAttributes0);
      CacheAdaptor<Object, Object> cacheAdaptor0 = new CacheAdaptor<Object, Object>(compositeCache0);
      CacheEventQueue<Object, Object> cacheEventQueue0 = new CacheEventQueue<Object, Object>(cacheAdaptor0, 0L, "2,tv_OHGH/6*S>*JF.E", 0, (-415));
      ICacheEventQueue.QueueType iCacheEventQueue_QueueType0 = cacheEventQueue0.getQueueType();
      assertEquals(ICacheEventQueue.QueueType.SINGLE, iCacheEventQueue_QueueType0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CacheAdaptor<InputStream, Delayed> cacheAdaptor0 = new CacheAdaptor<InputStream, Delayed>((ICache<InputStream, Delayed>) null);
      CacheEventQueue<InputStream, Delayed> cacheEventQueue0 = new CacheEventQueue<InputStream, Delayed>(cacheAdaptor0, 2472L, (String) null);
      cacheEventQueue0.createPool("scheduler_pool");
      assertEquals(2472L, cacheEventQueue0.getListenerId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LateralCacheAttributes lateralCacheAttributes0 = new LateralCacheAttributes();
      LateralTCPCacheFactory lateralTCPCacheFactory0 = new LateralTCPCacheFactory();
      LateralCacheMonitor lateralCacheMonitor0 = new LateralCacheMonitor(lateralTCPCacheFactory0);
      LateralCache<Callable<Runnable>, ThreadPoolExecutor> lateralCache0 = new LateralCache<Callable<Runnable>, ThreadPoolExecutor>(lateralCacheAttributes0, (ICacheServiceNonLocal<Callable<Runnable>, ThreadPoolExecutor>) null, lateralCacheMonitor0);
      CacheAdaptor<Callable<Runnable>, ThreadPoolExecutor> cacheAdaptor0 = new CacheAdaptor<Callable<Runnable>, ThreadPoolExecutor>(lateralCache0);
      CacheEventQueue<Callable<Runnable>, ThreadPoolExecutor> cacheEventQueue0 = new CacheEventQueue<Callable<Runnable>, ThreadPoolExecutor>(cacheAdaptor0, 1L, "T", 65536, 300000);
      // Undeclared exception!
      try { 
        cacheEventQueue0.put((AbstractCacheEventQueue.AbstractCacheEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      ZombieCacheServiceNonLocal<ForkJoinTask<Object>, String> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<ForkJoinTask<Object>, String>();
      RemoteCacheMonitor remoteCacheMonitor0 = new RemoteCacheMonitor();
      RemoteCache<ForkJoinTask<Object>, String> remoteCache0 = new RemoteCache<ForkJoinTask<Object>, String>(remoteCacheAttributes0, zombieCacheServiceNonLocal0, (IRemoteCacheListener<ForkJoinTask<Object>, String>) null, remoteCacheMonitor0);
      CacheAdaptor<ForkJoinTask<Object>, String> cacheAdaptor0 = new CacheAdaptor<ForkJoinTask<Object>, String>(remoteCache0);
      CacheEventQueue<ForkJoinTask<Object>, String> cacheEventQueue0 = new CacheEventQueue<ForkJoinTask<Object>, String>(cacheAdaptor0, (-78L), "");
      // Undeclared exception!
      try { 
        cacheEventQueue0.initialize((ICacheListener<ForkJoinTask<Object>, String>) null, (-78L), "R", 34, 34, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // listener must not be null
         //
         verifyException("org.apache.commons.jcs3.engine.AbstractCacheEventQueue", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PooledCacheEventQueue<Object, String> pooledCacheEventQueue0 = null;
      try {
        pooledCacheEventQueue0 = new PooledCacheEventQueue<Object, String>((ICacheListener<Object, String>) null, (-65L), "fD1{r\"h((H00AR{", 1383, 1383, "6e5VXds");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // listener must not be null
         //
         verifyException("org.apache.commons.jcs3.engine.AbstractCacheEventQueue", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CacheAdaptor<String, Object> cacheAdaptor0 = new CacheAdaptor<String, Object>((ICache<String, Object>) null);
      CacheEventQueue<String, Object> cacheEventQueue0 = new CacheEventQueue<String, Object>(cacheAdaptor0, 0L, "");
      int int0 = cacheEventQueue0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<RemoteCacheNoWait<Integer, ThreadPoolExecutor>> arrayList0 = new ArrayList<RemoteCacheNoWait<Integer, ThreadPoolExecutor>>();
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      CacheEventLoggerDebugLogger cacheEventLoggerDebugLogger0 = new CacheEventLoggerDebugLogger();
      StandardSerializer standardSerializer0 = new StandardSerializer();
      CompressingSerializer compressingSerializer0 = new CompressingSerializer(standardSerializer0);
      RemoteCacheFactory remoteCacheFactory0 = new RemoteCacheFactory();
      RemoteCacheNoWaitFacade<Integer, ThreadPoolExecutor> remoteCacheNoWaitFacade0 = new RemoteCacheNoWaitFacade<Integer, ThreadPoolExecutor>(arrayList0, remoteCacheAttributes0, cacheEventLoggerDebugLogger0, compressingSerializer0, remoteCacheFactory0);
      CacheAdaptor<Integer, ThreadPoolExecutor> cacheAdaptor0 = new CacheAdaptor<Integer, ThreadPoolExecutor>(remoteCacheNoWaitFacade0);
      CacheEventQueue<Integer, ThreadPoolExecutor> cacheEventQueue0 = new CacheEventQueue<Integer, ThreadPoolExecutor>(cacheAdaptor0, 100L, "UQO$");
      cacheEventQueue0.addDisposeEvent();
      boolean boolean0 = cacheEventQueue0.isEmpty();
      assertFalse(boolean0);
      assertEquals(100L, cacheEventQueue0.getListenerId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getInstance("");
      CompositeCacheAttributes compositeCacheAttributes0 = new CompositeCacheAttributes();
      CompositeCache<Object, String> compositeCache0 = compositeCacheManager0.getCache("", (ICompositeCacheAttributes) compositeCacheAttributes0);
      CacheAdaptor<Object, String> cacheAdaptor0 = new CacheAdaptor<Object, String>(compositeCache0);
      CacheEventQueue<Object, String> cacheEventQueue0 = new CacheEventQueue<Object, String>(cacheAdaptor0, 650L, "ZSdX9`22");
      boolean boolean0 = cacheEventQueue0.isEmpty();
      assertEquals(650L, cacheEventQueue0.getListenerId());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompositeCacheAttributes compositeCacheAttributes0 = new CompositeCacheAttributes();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      CompositeCache<PooledCacheEventQueue<Object, Object>, String> compositeCache0 = new CompositeCache<PooledCacheEventQueue<Object, Object>, String>(compositeCacheAttributes0, elementAttributes0);
      CacheAdaptor<PooledCacheEventQueue<Object, Object>, String> cacheAdaptor0 = new CacheAdaptor<PooledCacheEventQueue<Object, Object>, String>(compositeCache0);
      CacheEventQueue<PooledCacheEventQueue<Object, Object>, String> cacheEventQueue0 = new CacheEventQueue<PooledCacheEventQueue<Object, Object>, String>(cacheAdaptor0, 100L, "{cuSk?[i");
      IStats iStats0 = cacheEventQueue0.getStatistics();
      assertEquals("Pooled Cache Event Queue", iStats0.getTypeName());
      assertEquals(100L, cacheEventQueue0.getListenerId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayList<RemoteCacheNoWait<PooledCacheEventQueue<Object, String>, String>> arrayList0 = new ArrayList<RemoteCacheNoWait<PooledCacheEventQueue<Object, String>, String>>();
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      ZombieCacheServiceNonLocal<PooledCacheEventQueue<Object, String>, String> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<PooledCacheEventQueue<Object, String>, String>();
      RemoteCacheMonitor remoteCacheMonitor0 = new RemoteCacheMonitor();
      RemoteCache<PooledCacheEventQueue<Object, String>, String> remoteCache0 = new RemoteCache<PooledCacheEventQueue<Object, String>, String>(remoteCacheAttributes0, zombieCacheServiceNonLocal0, (IRemoteCacheListener<PooledCacheEventQueue<Object, String>, String>) null, remoteCacheMonitor0);
      RemoteCacheNoWait<PooledCacheEventQueue<Object, String>, String> remoteCacheNoWait0 = new RemoteCacheNoWait<PooledCacheEventQueue<Object, String>, String>(remoteCache0);
      remoteCacheNoWait0.dispose();
      arrayList0.add(remoteCacheNoWait0);
      CompressingSerializer compressingSerializer0 = new CompressingSerializer();
      RemoteCacheFactory remoteCacheFactory0 = new RemoteCacheFactory();
      RemoteCacheNoWaitFacade<PooledCacheEventQueue<Object, String>, String> remoteCacheNoWaitFacade0 = new RemoteCacheNoWaitFacade<PooledCacheEventQueue<Object, String>, String>(arrayList0, remoteCacheAttributes0, (ICacheEventLogger) null, compressingSerializer0, remoteCacheFactory0);
      String string0 = remoteCacheNoWaitFacade0.getStats();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      ZombieCacheServiceNonLocal<ForkJoinTask<Object>, String> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<ForkJoinTask<Object>, String>();
      RemoteCacheMonitor remoteCacheMonitor0 = new RemoteCacheMonitor();
      RemoteCache<ForkJoinTask<Object>, String> remoteCache0 = new RemoteCache<ForkJoinTask<Object>, String>(remoteCacheAttributes0, zombieCacheServiceNonLocal0, (IRemoteCacheListener<ForkJoinTask<Object>, String>) null, remoteCacheMonitor0);
      CacheAdaptor<ForkJoinTask<Object>, String> cacheAdaptor0 = new CacheAdaptor<ForkJoinTask<Object>, String>(remoteCache0);
      CacheEventQueue<ForkJoinTask<Object>, String> cacheEventQueue0 = new CacheEventQueue<ForkJoinTask<Object>, String>(cacheAdaptor0, (-78L), "x");
      cacheEventQueue0.destroy();
      cacheEventQueue0.destroy();
      assertFalse(cacheEventQueue0.isWorking());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompositeCacheAttributes compositeCacheAttributes0 = new CompositeCacheAttributes();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      CompositeCache<Delayed, Delayed> compositeCache0 = new CompositeCache<Delayed, Delayed>(compositeCacheAttributes0, elementAttributes0);
      CacheAdaptor<Delayed, Delayed> cacheAdaptor0 = new CacheAdaptor<Delayed, Delayed>(compositeCache0);
      PooledCacheEventQueue<Delayed, Delayed> pooledCacheEventQueue0 = null;
      try {
        pooledCacheEventQueue0 = new PooledCacheEventQueue<Delayed, Delayed>(cacheAdaptor0, 84L, "Cache event queue destroyed: {0}", 112, 112, (String) null);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.utils.config.PropertySetter", e);
      }
  }
}
