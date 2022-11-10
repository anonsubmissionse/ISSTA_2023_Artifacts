/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 21:50:05 GMT 2022
 */

package org.apache.commons.jcs3.engine;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.apache.commons.jcs3.engine.CacheElement;
import org.apache.commons.jcs3.engine.CacheElementSerialized;
import org.apache.commons.jcs3.engine.ElementAttributes;
import org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal;
import org.apache.commons.jcs3.engine.behavior.ICacheElement;
import org.apache.commons.jcs3.engine.behavior.ICacheServiceNonLocal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZombieCacheServiceNonLocal_ESTest extends ZombieCacheServiceNonLocal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZombieCacheServiceNonLocal<CacheElementSerialized<Object, String>, String> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<CacheElementSerialized<Object, String>, String>(509);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-114);
      byteArray0[1] = (byte)71;
      byteArray0[2] = (byte) (-74);
      ElementAttributes elementAttributes0 = new ElementAttributes();
      ElementAttributes elementAttributes1 = new ElementAttributes(elementAttributes0);
      CacheElementSerialized<Object, String> cacheElementSerialized0 = new CacheElementSerialized<Object, String>("Yy8=mx]pE2E", "ZZQPL83<5yDY_{*", byteArray0, elementAttributes1);
      cacheElementSerialized0.equals("ZZQPL83<5yDY_{*");
      zombieCacheServiceNonLocal0.get("ZZQPL83<5yDY_{*", cacheElementSerialized0, false);
      zombieCacheServiceNonLocal0.update((ICacheElement<CacheElementSerialized<Object, String>, String>) null, (-2435L));
      ZombieCacheServiceNonLocal<CacheElementSerialized<Object, String>, String> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<CacheElementSerialized<Object, String>, String>();
      zombieCacheServiceNonLocal0.propagateEvents(zombieCacheServiceNonLocal1);
      ZombieCacheServiceNonLocal<String, Integer> zombieCacheServiceNonLocal2 = new ZombieCacheServiceNonLocal<String, Integer>();
      zombieCacheServiceNonLocal2.getMatching("qI=jei Spl", "", (-1L));
      zombieCacheServiceNonLocal0.propagateEvents((ICacheServiceNonLocal<CacheElementSerialized<Object, String>, String>) null);
      ZombieCacheServiceNonLocal<Object, CacheElementSerialized<String, Integer>> zombieCacheServiceNonLocal3 = new ZombieCacheServiceNonLocal<Object, CacheElementSerialized<String, Integer>>((-1059));
      int int0 = zombieCacheServiceNonLocal3.getQueueSize();
      int int1 = zombieCacheServiceNonLocal0.getQueueSize();
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 4188;
      ZombieCacheServiceNonLocal<String, String> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<String, String>(4188);
      String string0 = "";
      zombieCacheServiceNonLocal0.removeAll("", (-556L));
      zombieCacheServiceNonLocal0.put((ICacheElement<String, String>) null);
      zombieCacheServiceNonLocal0.propagateEvents(zombieCacheServiceNonLocal0);
      String string1 = "HnEij3U9";
      zombieCacheServiceNonLocal0.getKeySet(string1);
      String string2 = "Propagated {0} events to the new ICacheServiceNonLocal in {1}";
      zombieCacheServiceNonLocal0.getMatching(string1, string1);
      long long0 = 466L;
      zombieCacheServiceNonLocal0.get(string2, string2, long0);
      int int1 = 2632;
      ZombieCacheServiceNonLocal<CacheElementSerialized<Integer, String>, Object> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<CacheElementSerialized<Integer, String>, Object>(int1);
      zombieCacheServiceNonLocal1.getKeySet(string2);
      String string3 = "B9P@?!";
      zombieCacheServiceNonLocal0.getMatching(string3, string1, (long) int0);
      ZombieCacheServiceNonLocal<CacheElement<Object, Object>, CacheElementSerialized<Integer, String>> zombieCacheServiceNonLocal2 = new ZombieCacheServiceNonLocal<CacheElement<Object, Object>, CacheElementSerialized<Integer, String>>();
      zombieCacheServiceNonLocal2.getQueueSize();
      LinkedHashSet<CacheElement<Object, Object>> linkedHashSet0 = new LinkedHashSet<CacheElement<Object, Object>>();
      long long1 = 0L;
      zombieCacheServiceNonLocal2.getMultiple(string0, (Set<CacheElement<Object, Object>>) linkedHashSet0, long1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      System.setCurrentTimeMillis((-759L));
      ZombieCacheServiceNonLocal<ZombieCacheServiceNonLocal<Object, Integer>, Object> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<ZombieCacheServiceNonLocal<Object, Integer>, Object>();
      zombieCacheServiceNonLocal0.getMatching("w4OM~/wV@d~|TR/Mrr.", "3vCNQyv.zJ8J@ v", 1556L);
      zombieCacheServiceNonLocal0.propagateEvents((ICacheServiceNonLocal<ZombieCacheServiceNonLocal<Object, Integer>, Object>) null);
      zombieCacheServiceNonLocal0.getKeySet(", IS_REMOTE = ");
      ZombieCacheServiceNonLocal<String, ZombieCacheServiceNonLocal<Object, Object>> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<String, ZombieCacheServiceNonLocal<Object, Object>>(783);
      zombieCacheServiceNonLocal1.remove("w4OM~/wV@d~|TR/Mrr.", "3vCNQyv.zJ8J@ v", 1556L);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-92);
      byteArray0[1] = (byte)38;
      byteArray0[2] = (byte) (-46);
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte)35;
      byteArray0[5] = (byte)32;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)3;
      ElementAttributes elementAttributes0 = new ElementAttributes();
      ElementAttributes elementAttributes1 = new ElementAttributes(elementAttributes0);
      CacheElementSerialized<String, ZombieCacheServiceNonLocal<Object, Object>> cacheElementSerialized0 = new CacheElementSerialized<String, ZombieCacheServiceNonLocal<Object, Object>>("3vCNQyv.zJ8J@ v", ", IS_REMOTE = ", byteArray0, elementAttributes1);
      zombieCacheServiceNonLocal1.put(cacheElementSerialized0);
      ZombieCacheServiceNonLocal<String, ZombieCacheServiceNonLocal<Object, Object>> zombieCacheServiceNonLocal2 = new ZombieCacheServiceNonLocal<String, ZombieCacheServiceNonLocal<Object, Object>>();
      zombieCacheServiceNonLocal1.propagateEvents(zombieCacheServiceNonLocal2);
      ZombieCacheServiceNonLocal<String, CacheElementSerialized<String, Object>> zombieCacheServiceNonLocal3 = new ZombieCacheServiceNonLocal<String, CacheElementSerialized<String, Object>>(165);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      zombieCacheServiceNonLocal3.getMultiple(", IS_REMOTE = ", linkedHashSet0);
      zombieCacheServiceNonLocal3.get("w4OM~/wV@d~|TR/Mrr.", "Tiq7w]P", (long) 783);
      ZombieCacheServiceNonLocal<String, String> zombieCacheServiceNonLocal4 = new ZombieCacheServiceNonLocal<String, String>();
      ZombieCacheServiceNonLocal<String, String> zombieCacheServiceNonLocal5 = new ZombieCacheServiceNonLocal<String, String>();
      LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<String>();
      zombieCacheServiceNonLocal5.getMultiple((String) null, (Set<String>) linkedHashSet1, (-339L));
      zombieCacheServiceNonLocal4.propagateEvents(zombieCacheServiceNonLocal5);
      assertNotSame(zombieCacheServiceNonLocal5, zombieCacheServiceNonLocal4);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZombieCacheServiceNonLocal<String, String> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<String, String>(4188);
      zombieCacheServiceNonLocal0.removeAll("", (-556L));
      zombieCacheServiceNonLocal0.put((ICacheElement<String, String>) null);
      ZombieCacheServiceNonLocal<String, String> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<String, String>();
      zombieCacheServiceNonLocal0.propagateEvents(zombieCacheServiceNonLocal1);
      zombieCacheServiceNonLocal1.getKeySet("NnEij3U9");
      zombieCacheServiceNonLocal1.getMatching("NnEij3U9", "NnEij3U9");
      zombieCacheServiceNonLocal1.get("Propagated {0} events to the new ICacheServiceNonLocal in {1}", "Propagated {0} events to the new ICacheServiceNonLocal in {1}", 466L);
      ZombieCacheServiceNonLocal<CacheElementSerialized<Integer, String>, Object> zombieCacheServiceNonLocal2 = new ZombieCacheServiceNonLocal<CacheElementSerialized<Integer, String>, Object>(2632);
      zombieCacheServiceNonLocal2.getKeySet("Propagated {0} events to the new ICacheServiceNonLocal in {1}");
      zombieCacheServiceNonLocal1.getMatching("B9P@?!", "NnEij3U9", (long) 4188);
      ZombieCacheServiceNonLocal<CacheElement<Object, Object>, CacheElementSerialized<Integer, String>> zombieCacheServiceNonLocal3 = new ZombieCacheServiceNonLocal<CacheElement<Object, Object>, CacheElementSerialized<Integer, String>>(2632);
      zombieCacheServiceNonLocal3.getQueueSize();
      LinkedHashSet<CacheElement<Object, Object>> linkedHashSet0 = new LinkedHashSet<CacheElement<Object, Object>>();
      Map<CacheElement<Object, Object>, ICacheElement<CacheElement<Object, Object>, CacheElementSerialized<Integer, String>>> map0 = zombieCacheServiceNonLocal3.getMultiple("", (Set<CacheElement<Object, Object>>) linkedHashSet0, 0L);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZombieCacheServiceNonLocal<ZombieCacheServiceNonLocal<String, Integer>, String> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<ZombieCacheServiceNonLocal<String, Integer>, String>(1280);
      ZombieCacheServiceNonLocal<String, Integer> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<String, Integer>();
      zombieCacheServiceNonLocal0.get("org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal$ZombieEvent", zombieCacheServiceNonLocal1, true);
      zombieCacheServiceNonLocal0.removeAll("jKIu@qz", (long) 1280);
      zombieCacheServiceNonLocal0.getQueueSize();
      ZombieCacheServiceNonLocal<CacheElement<String, Object>, String> zombieCacheServiceNonLocal2 = new ZombieCacheServiceNonLocal<CacheElement<String, Object>, String>();
      ZombieCacheServiceNonLocal<CacheElement<String, Object>, String> zombieCacheServiceNonLocal3 = new ZombieCacheServiceNonLocal<CacheElement<String, Object>, String>((-335));
      zombieCacheServiceNonLocal2.propagateEvents(zombieCacheServiceNonLocal3);
      ZombieCacheServiceNonLocal<CacheElementSerialized<Object, String>, CacheElementSerialized<Integer, Integer>> zombieCacheServiceNonLocal4 = new ZombieCacheServiceNonLocal<CacheElementSerialized<Object, String>, CacheElementSerialized<Integer, Integer>>(3);
      ZombieCacheServiceNonLocal<CacheElementSerialized<Object, String>, CacheElementSerialized<Integer, Integer>> zombieCacheServiceNonLocal5 = new ZombieCacheServiceNonLocal<CacheElementSerialized<Object, String>, CacheElementSerialized<Integer, Integer>>();
      zombieCacheServiceNonLocal4.propagateEvents(zombieCacheServiceNonLocal5);
      assertNotSame(zombieCacheServiceNonLocal5, zombieCacheServiceNonLocal4);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZombieCacheServiceNonLocal<CacheElementSerialized<Object, String>, String> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<CacheElementSerialized<Object, String>, String>(509);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-114);
      byteArray0[1] = (byte)71;
      byteArray0[2] = (byte) (-74);
      ElementAttributes elementAttributes0 = new ElementAttributes();
      ElementAttributes elementAttributes1 = new ElementAttributes(elementAttributes0);
      CacheElementSerialized<Object, String> cacheElementSerialized0 = new CacheElementSerialized<Object, String>("Yy8=mx]pE2E", "ZZQPL83<5yDY_{*", byteArray0, elementAttributes1);
      zombieCacheServiceNonLocal0.get("ZZQPL83<5yDY_{*", cacheElementSerialized0, false);
      zombieCacheServiceNonLocal0.update((ICacheElement<CacheElementSerialized<Object, String>, String>) null, (-2435L));
      try { 
        zombieCacheServiceNonLocal0.propagateEvents((ICacheServiceNonLocal<CacheElementSerialized<Object, String>, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZombieCacheServiceNonLocal<String, String> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<String, String>((-861));
      ZombieCacheServiceNonLocal<String, String> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<String, String>();
      zombieCacheServiceNonLocal0.propagateEvents(zombieCacheServiceNonLocal1);
      zombieCacheServiceNonLocal0.remove("", "hNu9m^|Z0bq95`IW~O", (-2240L));
      ZombieCacheServiceNonLocal<Integer, Object> zombieCacheServiceNonLocal2 = new ZombieCacheServiceNonLocal<Integer, Object>(1);
      Object object0 = new Object();
      CacheElement<Integer, Object> cacheElement0 = new CacheElement<Integer, Object>("Y?A0_[?BMzOfwK^", (Integer) null, object0);
      cacheElement0.toString();
      ZombieCacheServiceNonLocal<Integer, Object> zombieCacheServiceNonLocal3 = new ZombieCacheServiceNonLocal<Integer, Object>();
      zombieCacheServiceNonLocal2.propagateEvents(zombieCacheServiceNonLocal3);
      zombieCacheServiceNonLocal2.update((ICacheElement<Integer, Object>) cacheElement0, 919L);
      ZombieCacheServiceNonLocal<CacheElement<Object, Object>, CacheElement<String, Object>> zombieCacheServiceNonLocal4 = new ZombieCacheServiceNonLocal<CacheElement<Object, Object>, CacheElement<String, Object>>();
      zombieCacheServiceNonLocal4.getMatching(")ApTKu`n", "", 0L);
      Integer integer0 = new Integer((-1572));
      zombieCacheServiceNonLocal2.remove("org.apache.commons.jcs3.engine.ZombieCacheService", integer0, 919L);
      ZombieCacheServiceNonLocal<CacheElementSerialized<Object, Object>, ZombieCacheServiceNonLocal<Integer, String>> zombieCacheServiceNonLocal5 = new ZombieCacheServiceNonLocal<CacheElementSerialized<Object, Object>, ZombieCacheServiceNonLocal<Integer, String>>((-1572));
      ICacheElement<CacheElementSerialized<Object, Object>, ZombieCacheServiceNonLocal<Integer, String>> iCacheElement0 = zombieCacheServiceNonLocal5.get("Wzw(>|/6mu+#'T>", (CacheElementSerialized<Object, Object>) null, (-2240L));
      assertNull(iCacheElement0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZombieCacheServiceNonLocal<ZombieCacheServiceNonLocal<Object, String>, Object> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<ZombieCacheServiceNonLocal<Object, String>, Object>((-1549));
      zombieCacheServiceNonLocal0.removeAll((String) null, 0L);
      ZombieCacheServiceNonLocal<ZombieCacheServiceNonLocal<Object, String>, Integer> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<ZombieCacheServiceNonLocal<Object, String>, Integer>((-1549));
      zombieCacheServiceNonLocal1.removeAll("", (long) (-1549));
      ZombieCacheServiceNonLocal<CacheElement<String, Integer>, String> zombieCacheServiceNonLocal2 = new ZombieCacheServiceNonLocal<CacheElement<String, Integer>, String>((-1549));
      Integer integer0 = new Integer(2);
      CacheElement<String, Integer> cacheElement0 = new CacheElement<String, Integer>("", (String) null, integer0);
      zombieCacheServiceNonLocal2.remove("", cacheElement0, 0L);
      int int0 = zombieCacheServiceNonLocal2.getQueueSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZombieCacheServiceNonLocal<Object, Object> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<Object, Object>(2);
      zombieCacheServiceNonLocal0.getMatching("org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal$RemoveAllEvent", "gC$t_!PMIB_6;4", 1221L);
      Integer integer0 = new Integer(2);
      ZombieCacheServiceNonLocal<Integer, Integer> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<Integer, Integer>();
      CacheElement<Object, Object> cacheElement0 = new CacheElement<Object, Object>("^RMsY--'u", integer0, zombieCacheServiceNonLocal1);
      zombieCacheServiceNonLocal0.update((ICacheElement<Object, Object>) cacheElement0, (long) 2);
      assertEquals("^RMsY--'u", cacheElement0.getCacheName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZombieCacheServiceNonLocal<Integer, String> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<Integer, String>(2);
      zombieCacheServiceNonLocal0.removeAll("], attr [", (long) 2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZombieCacheServiceNonLocal<Object, Object> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<Object, Object>((-2147));
      CacheElement<Object, Object> cacheElement0 = new CacheElement<Object, Object>("ce@YO", zombieCacheServiceNonLocal0, zombieCacheServiceNonLocal0);
      zombieCacheServiceNonLocal0.update((ICacheElement<Object, Object>) cacheElement0, 0L);
      ZombieCacheServiceNonLocal<CacheElement<Integer, Integer>, CacheElement<Object, String>> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<CacheElement<Integer, Integer>, CacheElement<Object, String>>(3);
      ZombieCacheServiceNonLocal<Object, ZombieCacheServiceNonLocal<Integer, Object>> zombieCacheServiceNonLocal2 = new ZombieCacheServiceNonLocal<Object, ZombieCacheServiceNonLocal<Integer, Object>>();
      zombieCacheServiceNonLocal2.removeAll("org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal$PutEvent", (long) (-2147));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZombieCacheServiceNonLocal<String, Object> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<String, Object>(1354);
      Map<String, ICacheElement<String, Object>> map0 = zombieCacheServiceNonLocal0.getMultiple("", (Set<String>) null, 0L);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZombieCacheServiceNonLocal<CacheElement<Object, Integer>, Object> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<CacheElement<Object, Integer>, Object>();
      LinkedHashSet<CacheElement<Object, Integer>> linkedHashSet0 = new LinkedHashSet<CacheElement<Object, Integer>>(0);
      Map<CacheElement<Object, Integer>, ICacheElement<CacheElement<Object, Integer>, Object>> map0 = zombieCacheServiceNonLocal0.getMultiple("]", (Set<CacheElement<Object, Integer>>) linkedHashSet0, (long) 0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZombieCacheServiceNonLocal<Object, Integer> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<Object, Integer>();
      ZombieCacheServiceNonLocal<Object, String> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<Object, String>();
      ICacheElement<Object, Integer> iCacheElement0 = zombieCacheServiceNonLocal0.get("lpQ7L4xwy7ttExj7/", (Object) zombieCacheServiceNonLocal1, 0L);
      assertNull(iCacheElement0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZombieCacheServiceNonLocal<Integer, String> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<Integer, String>();
      ZombieCacheServiceNonLocal<Object, Integer> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<Object, Integer>(277);
      zombieCacheServiceNonLocal1.remove("=>n%VH/hE0?L)", (Object) "=>n%VH/hE0?L)", 0L);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZombieCacheServiceNonLocal<Integer, String> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<Integer, String>();
      zombieCacheServiceNonLocal0.remove(", MaxLifeSeconds = ", (Integer) null, 1189L);
      int int0 = zombieCacheServiceNonLocal0.getQueueSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZombieCacheServiceNonLocal<CacheElement<Object, Object>, Integer> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<CacheElement<Object, Object>, Integer>();
      Set<CacheElement<Object, Object>> set0 = zombieCacheServiceNonLocal0.getKeySet("");
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZombieCacheServiceNonLocal<Object, ZombieCacheServiceNonLocal<String, Object>> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<Object, ZombieCacheServiceNonLocal<String, Object>>((-1203));
      ZombieCacheServiceNonLocal<Object, ZombieCacheServiceNonLocal<String, Object>> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<Object, ZombieCacheServiceNonLocal<String, Object>>();
      zombieCacheServiceNonLocal0.propagateEvents(zombieCacheServiceNonLocal1);
      assertNotSame(zombieCacheServiceNonLocal1, zombieCacheServiceNonLocal0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZombieCacheServiceNonLocal<ZombieCacheServiceNonLocal<String, Object>, Integer> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<ZombieCacheServiceNonLocal<String, Object>, Integer>(2334);
      Map<ZombieCacheServiceNonLocal<String, Object>, ICacheElement<ZombieCacheServiceNonLocal<String, Object>, Integer>> map0 = zombieCacheServiceNonLocal0.getMatching("^qqIhJd*bYQ!#)E}", "fjcV:3z5", (long) 2334);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZombieCacheServiceNonLocal<CacheElement<Object, Object>, CacheElement<Object, String>> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<CacheElement<Object, Object>, CacheElement<Object, String>>();
      zombieCacheServiceNonLocal0.removeAll("9>sS{H~N&B)5", (-1198L));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZombieCacheServiceNonLocal<String, CacheElement<Object, Object>> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<String, CacheElement<Object, Object>>((-1));
      zombieCacheServiceNonLocal0.remove("Zombie get for key [{0}] cacheName [{1}] container [{2}]", "Zombie get for key [{0}] cacheName [{1}] container [{2}]", (long) (-1));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZombieCacheServiceNonLocal<ZombieCacheServiceNonLocal<Object, Integer>, CacheElement<Object, String>> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<ZombieCacheServiceNonLocal<Object, Integer>, CacheElement<Object, String>>();
      ZombieCacheServiceNonLocal<Object, Integer> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<Object, Integer>();
      Integer integer0 = new Integer(0);
      CacheElement<Object, Integer> cacheElement0 = new CacheElement<Object, Integer>("", zombieCacheServiceNonLocal0, integer0);
      zombieCacheServiceNonLocal1.update((ICacheElement<Object, Integer>) cacheElement0, 0L);
      assertEquals("", cacheElement0.getCacheName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZombieCacheServiceNonLocal<String, CacheElementSerialized<Object, String>> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<String, CacheElementSerialized<Object, String>>();
      int int0 = zombieCacheServiceNonLocal0.getQueueSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZombieCacheServiceNonLocal<Object, Integer> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<Object, Integer>(3279);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZombieCacheServiceNonLocal<ZombieCacheServiceNonLocal<String, String>, CacheElement<Integer, Integer>> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<ZombieCacheServiceNonLocal<String, String>, CacheElement<Integer, Integer>>();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZombieCacheServiceNonLocal<String, String> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<String, String>(4188);
      zombieCacheServiceNonLocal0.removeAll("e", (long) 4188);
      zombieCacheServiceNonLocal0.update((ICacheElement<String, String>) null, (long) 4188);
      ZombieCacheServiceNonLocal<String, String> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<String, String>();
      zombieCacheServiceNonLocal0.propagateEvents(zombieCacheServiceNonLocal1);
      zombieCacheServiceNonLocal1.getQueueSize();
      zombieCacheServiceNonLocal1.getMatching("e", "e", (long) 4188);
      ZombieCacheServiceNonLocal<CacheElement<Object, Object>, CacheElementSerialized<Integer, String>> zombieCacheServiceNonLocal2 = new ZombieCacheServiceNonLocal<CacheElement<Object, Object>, CacheElementSerialized<Integer, String>>(4188);
      LinkedHashSet<CacheElement<Object, Object>> linkedHashSet0 = new LinkedHashSet<CacheElement<Object, Object>>();
      Map<CacheElement<Object, Object>, ICacheElement<CacheElement<Object, Object>, CacheElementSerialized<Integer, String>>> map0 = zombieCacheServiceNonLocal2.getMultiple("e", (Set<CacheElement<Object, Object>>) linkedHashSet0, (long) 4188);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ZombieCacheServiceNonLocal<Integer, Object> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<Integer, Object>(1);
      Object object0 = new Object();
      CacheElement<Integer, Object> cacheElement0 = new CacheElement<Integer, Object>("", (Integer) null, object0);
      cacheElement0.toString();
      zombieCacheServiceNonLocal0.removeAll("[CacheElement: cacheName [], key [null], val [java.lang.Object@6b0c3923], attr [null]", (long) 1);
      ZombieCacheServiceNonLocal<Integer, Object> zombieCacheServiceNonLocal1 = new ZombieCacheServiceNonLocal<Integer, Object>();
      zombieCacheServiceNonLocal0.propagateEvents(zombieCacheServiceNonLocal1);
      zombieCacheServiceNonLocal0.update((ICacheElement<Integer, Object>) cacheElement0, (long) 1);
      Integer integer0 = new Integer(1);
      zombieCacheServiceNonLocal0.remove("", integer0, (long) 1);
      ZombieCacheServiceNonLocal<String, ZombieCacheServiceNonLocal<Object, Object>> zombieCacheServiceNonLocal2 = new ZombieCacheServiceNonLocal<String, ZombieCacheServiceNonLocal<Object, Object>>();
      zombieCacheServiceNonLocal2.getKeySet("");
      zombieCacheServiceNonLocal0.propagateEvents(zombieCacheServiceNonLocal1);
      ICacheElement<String, ZombieCacheServiceNonLocal<Object, Object>> iCacheElement0 = zombieCacheServiceNonLocal2.get("[CacheElement: cacheName [], key [null], val [java.lang.Object@6b0c3923], attr [null]", "", (long) 1);
      assertNull(iCacheElement0);
  }
}
