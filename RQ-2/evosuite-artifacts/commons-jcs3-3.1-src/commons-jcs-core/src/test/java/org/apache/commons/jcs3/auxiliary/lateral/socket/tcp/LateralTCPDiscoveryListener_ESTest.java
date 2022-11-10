/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 21:38:46 GMT 2022
 */

package org.apache.commons.jcs3.auxiliary.lateral.socket.tcp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.Delayed;
import org.apache.commons.jcs3.auxiliary.lateral.LateralCache;
import org.apache.commons.jcs3.auxiliary.lateral.LateralCacheAttributes;
import org.apache.commons.jcs3.auxiliary.lateral.LateralCacheMonitor;
import org.apache.commons.jcs3.auxiliary.lateral.LateralCacheNoWait;
import org.apache.commons.jcs3.auxiliary.lateral.LateralCacheNoWaitFacade;
import org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPCacheFactory;
import org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPDiscoveryListener;
import org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPListener;
import org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.TCPLateralCacheAttributes;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCacheNoWait;
import org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal;
import org.apache.commons.jcs3.engine.behavior.ICompositeCacheManager;
import org.apache.commons.jcs3.engine.control.CompositeCacheManager;
import org.apache.commons.jcs3.engine.logging.CacheEventLoggerDebugLogger;
import org.apache.commons.jcs3.utils.discovery.DiscoveredService;
import org.apache.commons.jcs3.utils.serialization.CompressingSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LateralTCPDiscoveryListener_ESTest extends LateralTCPDiscoveryListener_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("", compositeCacheManager0);
      boolean boolean0 = lateralTCPDiscoveryListener0.removeNoWait((LateralCacheNoWaitFacade<LateralTCPDiscoveryListener, RemoteCacheNoWait<LateralCacheNoWaitFacade<CompositeCacheManager, Delayed>, TCPLateralCacheAttributes>>) null, "3+WQDmlEE", "removeNoWait > Got facade for {0} = {1}");
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("", compositeCacheManager0);
      TCPLateralCacheAttributes tCPLateralCacheAttributes0 = new TCPLateralCacheAttributes();
      LateralTCPListener<Object, TCPLateralCacheAttributes> lateralTCPListener0 = new LateralTCPListener<Object, TCPLateralCacheAttributes>(tCPLateralCacheAttributes0);
      LinkedList<LateralCacheNoWait<Object, TCPLateralCacheAttributes>> linkedList0 = new LinkedList<LateralCacheNoWait<Object, TCPLateralCacheAttributes>>();
      LateralCacheNoWaitFacade<Object, TCPLateralCacheAttributes> lateralCacheNoWaitFacade0 = new LateralCacheNoWaitFacade<Object, TCPLateralCacheAttributes>(lateralTCPListener0, linkedList0, tCPLateralCacheAttributes0);
      boolean boolean0 = lateralTCPDiscoveryListener0.addNoWaitFacade("", lateralCacheNoWaitFacade0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("", compositeCacheManager0);
      TCPLateralCacheAttributes tCPLateralCacheAttributes0 = new TCPLateralCacheAttributes();
      LateralTCPListener<Object, TCPLateralCacheAttributes> lateralTCPListener0 = new LateralTCPListener<Object, TCPLateralCacheAttributes>(tCPLateralCacheAttributes0);
      LinkedList<LateralCacheNoWait<Object, TCPLateralCacheAttributes>> linkedList0 = new LinkedList<LateralCacheNoWait<Object, TCPLateralCacheAttributes>>();
      LateralCacheNoWaitFacade<Object, TCPLateralCacheAttributes> lateralCacheNoWaitFacade0 = new LateralCacheNoWaitFacade<Object, TCPLateralCacheAttributes>(lateralTCPListener0, linkedList0, tCPLateralCacheAttributes0);
      boolean boolean0 = lateralTCPDiscoveryListener0.addNoWaitFacade("", lateralCacheNoWaitFacade0);
      boolean boolean1 = lateralTCPDiscoveryListener0.containsNoWaitFacade("");
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      CacheEventLoggerDebugLogger cacheEventLoggerDebugLogger0 = new CacheEventLoggerDebugLogger();
      CompressingSerializer compressingSerializer0 = new CompressingSerializer();
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener(".", compositeCacheManager0, cacheEventLoggerDebugLogger0, compressingSerializer0);
      TCPLateralCacheAttributes tCPLateralCacheAttributes0 = new TCPLateralCacheAttributes();
      LateralTCPListener<LateralTCPCacheFactory, Object> lateralTCPListener0 = new LateralTCPListener<LateralTCPCacheFactory, Object>(tCPLateralCacheAttributes0);
      LinkedList<LateralCacheNoWait<LateralTCPCacheFactory, Object>> linkedList0 = new LinkedList<LateralCacheNoWait<LateralTCPCacheFactory, Object>>();
      LateralCacheNoWaitFacade<LateralTCPCacheFactory, Object> lateralCacheNoWaitFacade0 = new LateralCacheNoWaitFacade<LateralTCPCacheFactory, Object>(lateralTCPListener0, linkedList0, tCPLateralCacheAttributes0);
      boolean boolean0 = lateralTCPDiscoveryListener0.addNoWait((LateralCacheNoWait<LateralTCPCacheFactory, Object>) null, lateralCacheNoWaitFacade0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getInstance("");
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("&uV&3", compositeCacheManager0);
      // Undeclared exception!
      try { 
        lateralTCPDiscoveryListener0.removeNoWait((LateralCacheNoWait<CompositeCacheManager, String>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPDiscoveryListener", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("", (ICompositeCacheManager) null);
      // Undeclared exception!
      try { 
        lateralTCPDiscoveryListener0.removeDiscoveredService((DiscoveredService) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPDiscoveryListener", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener((String) null, compositeCacheManager0);
      // Undeclared exception!
      try { 
        lateralTCPDiscoveryListener0.containsNoWaitFacade((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      CacheEventLoggerDebugLogger cacheEventLoggerDebugLogger0 = new CacheEventLoggerDebugLogger();
      CompressingSerializer compressingSerializer0 = new CompressingSerializer();
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener(".", compositeCacheManager0, cacheEventLoggerDebugLogger0, compressingSerializer0);
      TCPLateralCacheAttributes tCPLateralCacheAttributes0 = new TCPLateralCacheAttributes();
      ZombieCacheServiceNonLocal<TCPLateralCacheAttributes, Integer> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<TCPLateralCacheAttributes, Integer>();
      LateralTCPCacheFactory lateralTCPCacheFactory0 = new LateralTCPCacheFactory();
      LateralCacheMonitor lateralCacheMonitor0 = new LateralCacheMonitor(lateralTCPCacheFactory0);
      LateralCache<TCPLateralCacheAttributes, Integer> lateralCache0 = new LateralCache<TCPLateralCacheAttributes, Integer>(tCPLateralCacheAttributes0, zombieCacheServiceNonLocal0, lateralCacheMonitor0);
      LateralCacheNoWait<TCPLateralCacheAttributes, Integer> lateralCacheNoWait0 = new LateralCacheNoWait<TCPLateralCacheAttributes, Integer>(lateralCache0);
      // Undeclared exception!
      try { 
        lateralTCPDiscoveryListener0.containsNoWait("org.apache.commons.jcs3:type=JCSAdminBean", lateralCacheNoWait0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener((String) null, (ICompositeCacheManager) null);
      TCPLateralCacheAttributes tCPLateralCacheAttributes0 = new TCPLateralCacheAttributes();
      LateralTCPListener<Integer, String> lateralTCPListener0 = new LateralTCPListener<Integer, String>(tCPLateralCacheAttributes0);
      LinkedList<LateralCacheNoWait<Integer, String>> linkedList0 = new LinkedList<LateralCacheNoWait<Integer, String>>();
      LateralCacheNoWaitFacade<Integer, String> lateralCacheNoWaitFacade0 = new LateralCacheNoWaitFacade<Integer, String>(lateralTCPListener0, linkedList0, tCPLateralCacheAttributes0);
      // Undeclared exception!
      try { 
        lateralTCPDiscoveryListener0.addNoWaitFacade((String) null, lateralCacheNoWaitFacade0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("qfWS", compositeCacheManager0);
      LateralTCPCacheFactory lateralTCPCacheFactory0 = new LateralTCPCacheFactory();
      TCPLateralCacheAttributes tCPLateralCacheAttributes0 = new TCPLateralCacheAttributes();
      LateralCacheMonitor lateralCacheMonitor0 = new LateralCacheMonitor(lateralTCPCacheFactory0);
      ZombieCacheServiceNonLocal<String, String> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<String, String>(13);
      LateralCache<String, String> lateralCache0 = new LateralCache<String, String>(tCPLateralCacheAttributes0, zombieCacheServiceNonLocal0, lateralCacheMonitor0);
      LateralCacheNoWait<String, String> lateralCacheNoWait0 = new LateralCacheNoWait<String, String>(lateralCache0);
      LateralTCPListener<String, String> lateralTCPListener0 = new LateralTCPListener<String, String>(tCPLateralCacheAttributes0);
      ArrayList<LateralCacheNoWait<String, String>> arrayList0 = new ArrayList<LateralCacheNoWait<String, String>>();
      LateralCacheNoWaitFacade<String, String> lateralCacheNoWaitFacade0 = new LateralCacheNoWaitFacade<String, String>(lateralTCPListener0, arrayList0, tCPLateralCacheAttributes0);
      // Undeclared exception!
      try { 
        lateralTCPDiscoveryListener0.addNoWait(lateralCacheNoWait0, lateralCacheNoWaitFacade0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("", compositeCacheManager0);
      // Undeclared exception!
      try { 
        lateralTCPDiscoveryListener0.addDiscoveredService((DiscoveredService) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPDiscoveryListener", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("", compositeCacheManager0);
      boolean boolean0 = lateralTCPDiscoveryListener0.containsNoWaitFacade("");
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("Added ,oWait for cacheName [{0}] at g1}", compositeCacheManager0);
      DiscoveredService discoveredService0 = new DiscoveredService();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("org.apache.commons.jcs3:type=JCSAdminBean");
      discoveredService0.setCacheNames(arrayList0);
      lateralTCPDiscoveryListener0.removeDiscoveredService(discoveredService0);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener((String) null, (ICompositeCacheManager) null);
      DiscoveredService discoveredService0 = new DiscoveredService();
      lateralTCPDiscoveryListener0.removeDiscoveredService(discoveredService0);
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("-Z!5-OT|0EDXKnZV(WM", (ICompositeCacheManager) null);
      DiscoveredService discoveredService0 = new DiscoveredService();
      LateralTCPCacheFactory lateralTCPCacheFactory0 = new LateralTCPCacheFactory();
      lateralTCPDiscoveryListener0.addDiscoveredService(discoveredService0);
      ZombieCacheServiceNonLocal<InputStream, InputStream> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<InputStream, InputStream>((-1924));
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("-Z!5-OT|0EDXKnZV(WM", (ICompositeCacheManager) null);
      LateralCacheAttributes lateralCacheAttributes0 = new LateralCacheAttributes();
      ZombieCacheServiceNonLocal<Object, CompositeCacheManager> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<Object, CompositeCacheManager>();
      LateralTCPCacheFactory lateralTCPCacheFactory0 = new LateralTCPCacheFactory();
      LateralCacheMonitor lateralCacheMonitor0 = new LateralCacheMonitor(lateralTCPCacheFactory0);
      lateralCacheAttributes0.setCacheName("-Z!5-OT|0EDXKnZV(WM");
      LateralCache<Object, CompositeCacheManager> lateralCache0 = new LateralCache<Object, CompositeCacheManager>(lateralCacheAttributes0, zombieCacheServiceNonLocal0, lateralCacheMonitor0);
      LateralCacheNoWait<Object, CompositeCacheManager> lateralCacheNoWait0 = new LateralCacheNoWait<Object, CompositeCacheManager>(lateralCache0);
      lateralTCPDiscoveryListener0.removeNoWait(lateralCacheNoWait0);
      ZombieCacheServiceNonLocal<Integer, Integer> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<Integer, Integer>((-1924));
      LateralCache<Integer, Integer> lateralCache1 = new LateralCache<Integer, Integer>(lateralCacheAttributes0, zombieCacheServiceNonLocal1, lateralCacheMonitor0);
      LateralCacheNoWait<Integer, Integer> lateralCacheNoWait1 = new LateralCacheNoWait<Integer, Integer>(lateralCache1);
      boolean boolean0 = lateralTCPDiscoveryListener0.removeNoWait(lateralCacheNoWait1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TCPLateralCacheAttributes tCPLateralCacheAttributes0 = new TCPLateralCacheAttributes();
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener((String) null, (ICompositeCacheManager) null);
      LateralTCPListener<TCPLateralCacheAttributes, Delayed> lateralTCPListener0 = new LateralTCPListener<TCPLateralCacheAttributes, Delayed>(tCPLateralCacheAttributes0);
      LinkedList<LateralCacheNoWait<TCPLateralCacheAttributes, Delayed>> linkedList0 = new LinkedList<LateralCacheNoWait<TCPLateralCacheAttributes, Delayed>>();
      LateralCacheNoWaitFacade<TCPLateralCacheAttributes, Delayed> lateralCacheNoWaitFacade0 = new LateralCacheNoWaitFacade<TCPLateralCacheAttributes, Delayed>(lateralTCPListener0, linkedList0, tCPLateralCacheAttributes0);
      boolean boolean0 = lateralTCPDiscoveryListener0.removeNoWait(lateralCacheNoWaitFacade0, (String) null, (String) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("-Z!5-OT|0EDXKnZV(WM", (ICompositeCacheManager) null);
      LateralCacheAttributes lateralCacheAttributes0 = new LateralCacheAttributes();
      ZombieCacheServiceNonLocal<Object, CompositeCacheManager> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<Object, CompositeCacheManager>();
      LateralTCPCacheFactory lateralTCPCacheFactory0 = new LateralTCPCacheFactory();
      LateralCacheMonitor lateralCacheMonitor0 = new LateralCacheMonitor(lateralTCPCacheFactory0);
      lateralCacheAttributes0.setCacheName("-Z!5-OT|0EDXKnZV(WM");
      LateralCache<Object, CompositeCacheManager> lateralCache0 = new LateralCache<Object, CompositeCacheManager>(lateralCacheAttributes0, zombieCacheServiceNonLocal0, lateralCacheMonitor0);
      LateralCacheNoWait<Object, CompositeCacheManager> lateralCacheNoWait0 = new LateralCacheNoWait<Object, CompositeCacheManager>(lateralCache0);
      lateralTCPDiscoveryListener0.removeNoWait(lateralCacheNoWait0);
      ZombieCacheServiceNonLocal<ObjectInputStream, Object> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<ObjectInputStream, Object>();
      LateralCache<ObjectInputStream, Object> lateralCache1 = new LateralCache<ObjectInputStream, Object>(lateralCacheAttributes0, zombieCacheServiceNonLocal1, lateralCacheMonitor0);
      LateralCacheNoWait<ObjectInputStream, Object> lateralCacheNoWait1 = new LateralCacheNoWait<ObjectInputStream, Object>(lateralCache1);
      lateralTCPDiscoveryListener0.addNoWait(lateralCacheNoWait1);
      ZombieCacheServiceNonLocal<InputStream, InputStream> zombieCacheServiceNonLocal2 = new ZombieCacheServiceNonLocal<InputStream, InputStream>((-1924));
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("C", (ICompositeCacheManager) null);
      LateralCacheAttributes lateralCacheAttributes0 = new LateralCacheAttributes();
      lateralCacheAttributes0.setCacheName("67F1&?UH-");
      LateralTCPCacheFactory lateralTCPCacheFactory0 = new LateralTCPCacheFactory();
      ZombieCacheServiceNonLocal<LateralTCPDiscoveryListener, LateralCacheNoWait<Integer, String>> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<LateralTCPDiscoveryListener, LateralCacheNoWait<Integer, String>>((-1953));
      LateralCacheMonitor lateralCacheMonitor0 = new LateralCacheMonitor(lateralTCPCacheFactory0);
      System.setCurrentTimeMillis((-799));
      ZombieCacheServiceNonLocal<InputStream, LateralTCPDiscoveryListener> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<InputStream, LateralTCPDiscoveryListener>(981);
      LateralCache<InputStream, LateralTCPDiscoveryListener> lateralCache0 = new LateralCache<InputStream, LateralTCPDiscoveryListener>(lateralCacheAttributes0, zombieCacheServiceNonLocal1, lateralCacheMonitor0);
      LateralCacheNoWait<InputStream, LateralTCPDiscoveryListener> lateralCacheNoWait0 = new LateralCacheNoWait<InputStream, LateralTCPDiscoveryListener>(lateralCache0);
      TCPLateralCacheAttributes tCPLateralCacheAttributes0 = new TCPLateralCacheAttributes();
      LateralTCPListener<InputStream, LateralTCPDiscoveryListener> lateralTCPListener0 = new LateralTCPListener<InputStream, LateralTCPDiscoveryListener>(tCPLateralCacheAttributes0);
      ArrayList<LateralCacheNoWait<InputStream, LateralTCPDiscoveryListener>> arrayList0 = new ArrayList<LateralCacheNoWait<InputStream, LateralTCPDiscoveryListener>>();
      LateralCacheNoWaitFacade<InputStream, LateralTCPDiscoveryListener> lateralCacheNoWaitFacade0 = new LateralCacheNoWaitFacade<InputStream, LateralTCPDiscoveryListener>(lateralTCPListener0, arrayList0, tCPLateralCacheAttributes0);
      boolean boolean0 = lateralTCPDiscoveryListener0.addNoWait(lateralCacheNoWait0, lateralCacheNoWaitFacade0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("-Z!5-OT|0EDXKnZV(WM", (ICompositeCacheManager) null);
      DiscoveredService discoveredService0 = new DiscoveredService();
      LateralCacheAttributes lateralCacheAttributes0 = new LateralCacheAttributes();
      ZombieCacheServiceNonLocal<Object, CompositeCacheManager> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<Object, CompositeCacheManager>();
      LateralTCPCacheFactory lateralTCPCacheFactory0 = new LateralTCPCacheFactory();
      LateralCacheMonitor lateralCacheMonitor0 = new LateralCacheMonitor(lateralTCPCacheFactory0);
      lateralCacheAttributes0.setCacheName("-Z!5-OT|0EDXKnZV(WM");
      ZombieCacheServiceNonLocal<ObjectInputStream, Object> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<ObjectInputStream, Object>();
      LateralCache<ObjectInputStream, Object> lateralCache0 = new LateralCache<ObjectInputStream, Object>(lateralCacheAttributes0, zombieCacheServiceNonLocal1, lateralCacheMonitor0);
      LateralCacheNoWait<ObjectInputStream, Object> lateralCacheNoWait0 = new LateralCacheNoWait<ObjectInputStream, Object>(lateralCache0);
      lateralTCPDiscoveryListener0.addNoWait(lateralCacheNoWait0);
      ZombieCacheServiceNonLocal<InputStream, InputStream> zombieCacheServiceNonLocal2 = new ZombieCacheServiceNonLocal<InputStream, InputStream>((-1924));
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("eD0*Bv$RQL8UGD2x~", (ICompositeCacheManager) null);
      TCPLateralCacheAttributes tCPLateralCacheAttributes0 = new TCPLateralCacheAttributes();
      tCPLateralCacheAttributes0.setCacheName("eD0*Bv$RQL8UGD2x~");
      LateralTCPCacheFactory lateralTCPCacheFactory0 = new LateralTCPCacheFactory();
      ZombieCacheServiceNonLocal<LateralTCPDiscoveryListener, LateralCacheNoWait<Integer, String>> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<LateralTCPDiscoveryListener, LateralCacheNoWait<Integer, String>>();
      LateralCacheMonitor lateralCacheMonitor0 = new LateralCacheMonitor(lateralTCPCacheFactory0);
      LateralCache<LateralTCPDiscoveryListener, LateralCacheNoWait<Integer, String>> lateralCache0 = new LateralCache<LateralTCPDiscoveryListener, LateralCacheNoWait<Integer, String>>(tCPLateralCacheAttributes0, zombieCacheServiceNonLocal0, lateralCacheMonitor0);
      LateralCacheNoWait<LateralTCPDiscoveryListener, LateralCacheNoWait<Integer, String>> lateralCacheNoWait0 = new LateralCacheNoWait<LateralTCPDiscoveryListener, LateralCacheNoWait<Integer, String>>(lateralCache0);
      boolean boolean0 = lateralTCPDiscoveryListener0.containsNoWait("eD0*Bv$RQL8UGD2x~", lateralCacheNoWait0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("-Z!5-OT|0EDXKnZV(WM", (ICompositeCacheManager) null);
      DiscoveredService discoveredService0 = new DiscoveredService();
      LateralCacheAttributes lateralCacheAttributes0 = new LateralCacheAttributes();
      LateralTCPCacheFactory lateralTCPCacheFactory0 = new LateralTCPCacheFactory();
      LateralCacheMonitor lateralCacheMonitor0 = new LateralCacheMonitor(lateralTCPCacheFactory0);
      ZombieCacheServiceNonLocal<ObjectInputStream, Object> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<ObjectInputStream, Object>();
      LateralCache<ObjectInputStream, Object> lateralCache0 = new LateralCache<ObjectInputStream, Object>(lateralCacheAttributes0, zombieCacheServiceNonLocal0, lateralCacheMonitor0);
      LateralCacheNoWait<ObjectInputStream, Object> lateralCacheNoWait0 = new LateralCacheNoWait<ObjectInputStream, Object>(lateralCache0);
      // Undeclared exception!
      try { 
        lateralTCPDiscoveryListener0.addNoWait(lateralCacheNoWait0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("", compositeCacheManager0);
      TCPLateralCacheAttributes tCPLateralCacheAttributes0 = new TCPLateralCacheAttributes();
      LateralTCPListener<Object, TCPLateralCacheAttributes> lateralTCPListener0 = new LateralTCPListener<Object, TCPLateralCacheAttributes>(tCPLateralCacheAttributes0);
      LinkedList<LateralCacheNoWait<Object, TCPLateralCacheAttributes>> linkedList0 = new LinkedList<LateralCacheNoWait<Object, TCPLateralCacheAttributes>>();
      LateralCacheNoWaitFacade<Object, TCPLateralCacheAttributes> lateralCacheNoWaitFacade0 = new LateralCacheNoWaitFacade<Object, TCPLateralCacheAttributes>(lateralTCPListener0, linkedList0, tCPLateralCacheAttributes0);
      boolean boolean0 = lateralTCPDiscoveryListener0.addNoWaitFacade("", lateralCacheNoWaitFacade0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      LateralTCPDiscoveryListener lateralTCPDiscoveryListener0 = new LateralTCPDiscoveryListener("", compositeCacheManager0);
      TCPLateralCacheAttributes tCPLateralCacheAttributes0 = new TCPLateralCacheAttributes();
      LateralTCPListener<Object, TCPLateralCacheAttributes> lateralTCPListener0 = new LateralTCPListener<Object, TCPLateralCacheAttributes>(tCPLateralCacheAttributes0);
      LinkedList<LateralCacheNoWait<Object, TCPLateralCacheAttributes>> linkedList0 = new LinkedList<LateralCacheNoWait<Object, TCPLateralCacheAttributes>>();
      LateralCacheNoWaitFacade<Object, TCPLateralCacheAttributes> lateralCacheNoWaitFacade0 = new LateralCacheNoWaitFacade<Object, TCPLateralCacheAttributes>(lateralTCPListener0, linkedList0, tCPLateralCacheAttributes0);
      boolean boolean0 = lateralTCPDiscoveryListener0.addNoWaitFacade("", lateralCacheNoWaitFacade0);
      boolean boolean1 = lateralTCPDiscoveryListener0.addNoWaitFacade("", lateralCacheNoWaitFacade0);
      assertTrue(boolean1);
}
}
