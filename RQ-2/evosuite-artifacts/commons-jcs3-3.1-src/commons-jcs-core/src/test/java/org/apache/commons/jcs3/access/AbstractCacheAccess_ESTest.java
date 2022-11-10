/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:07:42 GMT 2022
 */

package org.apache.commons.jcs3.access;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Properties;
import org.apache.commons.jcs3.access.CacheAccess;
import org.apache.commons.jcs3.access.GroupCacheAccess;
import org.apache.commons.jcs3.engine.CompositeCacheAttributes;
import org.apache.commons.jcs3.engine.ElementAttributes;
import org.apache.commons.jcs3.engine.behavior.ICompositeCacheAttributes;
import org.apache.commons.jcs3.engine.behavior.IElementAttributes;
import org.apache.commons.jcs3.engine.control.CompositeCache;
import org.apache.commons.jcs3.engine.control.CompositeCacheManager;
import org.apache.commons.jcs3.engine.control.group.GroupAttrName;
import org.apache.commons.jcs3.engine.stats.behavior.ICacheStats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCacheAccess_ESTest extends AbstractCacheAccess_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CompositeCacheAttributes compositeCacheAttributes0 = new CompositeCacheAttributes();
      CompositeCache<String, Object> compositeCache0 = new CompositeCache<String, Object>(compositeCacheAttributes0, (IElementAttributes) null);
      CacheAccess<String, Object> cacheAccess0 = new CacheAccess<String, Object>(compositeCache0);
      ICacheStats iCacheStats0 = cacheAccess0.getStatistics();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CompositeCacheAttributes compositeCacheAttributes0 = new CompositeCacheAttributes();
      CompositeCache<String, Object> compositeCache0 = new CompositeCache<String, Object>(compositeCacheAttributes0, (IElementAttributes) null);
      CacheAccess<String, Object> cacheAccess0 = new CacheAccess<String, Object>(compositeCache0);
      IElementAttributes iElementAttributes0 = cacheAccess0.getDefaultElementAttributes();
      assertNotNull(iElementAttributes0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getInstance("");
      CompositeCacheAttributes compositeCacheAttributes0 = new CompositeCacheAttributes();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setIdleTime(1158L);
      compositeCacheManager0.getCache("", (ICompositeCacheAttributes) compositeCacheAttributes0, (IElementAttributes) elementAttributes0);
      CompositeCache<Object, String> compositeCache0 = compositeCacheManager0.getCache((ICompositeCacheAttributes) compositeCacheAttributes0);
      CacheAccess<Object, String> cacheAccess0 = new CacheAccess<Object, String>(compositeCache0);
      cacheAccess0.setDefaultElementAttributes(elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheAccess0.getDefaultElementAttributes();
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      CompositeCacheAttributes compositeCacheAttributes0 = new CompositeCacheAttributes();
      Properties properties0 = new Properties();
      compositeCacheManager0.configure(properties0, false);
      CompositeCache<Integer, Integer> compositeCache0 = compositeCacheManager0.getCache("", (ICompositeCacheAttributes) compositeCacheAttributes0);
      CacheAccess<Integer, Integer> cacheAccess0 = new CacheAccess<Integer, Integer>(compositeCache0);
      Integer integer0 = new Integer(7200);
      cacheAccess0.putSafe(integer0, integer0);
      CompositeCache<Integer, Integer> compositeCache1 = cacheAccess0.getCacheControl();
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      CompositeCacheAttributes compositeCacheAttributes0 = new CompositeCacheAttributes();
      Properties properties0 = new Properties();
      compositeCacheManager0.configure(properties0, false);
      CompositeCache<Integer, Integer> compositeCache0 = compositeCacheManager0.getCache("", (ICompositeCacheAttributes) compositeCacheAttributes0);
      CacheAccess<Integer, Integer> cacheAccess0 = new CacheAccess<Integer, Integer>(compositeCache0);
      CompositeCache<Integer, Integer> compositeCache1 = cacheAccess0.getCacheControl();
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getInstance("");
      CompositeCacheAttributes compositeCacheAttributes0 = new CompositeCacheAttributes();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      CompositeCache<Object, Object> compositeCache0 = compositeCacheManager0.getCache("Failure freeing memory elements.", (ICompositeCacheAttributes) compositeCacheAttributes0, (IElementAttributes) elementAttributes0);
      CacheAccess<Object, Object> cacheAccess0 = new CacheAccess<Object, Object>(compositeCache0);
      ICompositeCacheAttributes iCompositeCacheAttributes0 = cacheAccess0.getCacheAttributes();
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getInstance("");
      CompositeCache<Object, Object> compositeCache0 = compositeCacheManager0.getCache("t");
      CacheAccess<Object, Object> cacheAccess0 = new CacheAccess<Object, Object>(compositeCache0);
      int int0 = cacheAccess0.freeMemoryElements(1);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getInstance("");
      CompositeCache<Object, Object> compositeCache0 = compositeCacheManager0.getCache("t");
      CacheAccess<Object, Object> cacheAccess0 = new CacheAccess<Object, Object>(compositeCache0);
      Object object0 = new Object();
      cacheAccess0.put(object0, (Object) "t");
      int int0 = cacheAccess0.freeMemoryElements(1);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getInstance("");
      CompositeCache<Object, Object> compositeCache0 = compositeCacheManager0.getCache("t");
      CacheAccess<Object, Object> cacheAccess0 = new CacheAccess<Object, Object>(compositeCache0);
      Object object0 = new Object();
      cacheAccess0.put(object0, (Object) "t");
      int int0 = cacheAccess0.freeMemoryElements(1);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CacheAccess<Object, Integer> cacheAccess0 = new CacheAccess<Object, Integer>((CompositeCache<Object, Integer>) null);
      CompositeCacheAttributes compositeCacheAttributes0 = new CompositeCacheAttributes();
      // Undeclared exception!
      try { 
        cacheAccess0.setCacheAttributes(compositeCacheAttributes0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.access.AbstractCacheAccess", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CacheAccess<String, Object> cacheAccess0 = new CacheAccess<String, Object>((CompositeCache<String, Object>) null);
      // Undeclared exception!
      try { 
        cacheAccess0.getStats();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.access.AbstractCacheAccess", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CacheAccess<String, Integer> cacheAccess0 = new CacheAccess<String, Integer>((CompositeCache<String, Integer>) null);
      // Undeclared exception!
      try { 
        cacheAccess0.getDefaultElementAttributes();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.access.AbstractCacheAccess", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CacheAccess<Object, String> cacheAccess0 = new CacheAccess<Object, String>((CompositeCache<Object, String>) null);
      // Undeclared exception!
      try { 
        cacheAccess0.getCacheAttributes();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.access.AbstractCacheAccess", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GroupCacheAccess<String, String> groupCacheAccess0 = new GroupCacheAccess<String, String>((CompositeCache<GroupAttrName<String>, String>) null);
      // Undeclared exception!
      try { 
        groupCacheAccess0.dispose();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.access.AbstractCacheAccess", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CacheAccess<String, Object> cacheAccess0 = new CacheAccess<String, Object>((CompositeCache<String, Object>) null);
      // Undeclared exception!
      try { 
        cacheAccess0.clear();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.access.AbstractCacheAccess", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CacheAccess<Integer, Object> cacheAccess0 = new CacheAccess<Integer, Object>((CompositeCache<Integer, Object>) null);
      CompositeCache<Integer, Object> compositeCache0 = cacheAccess0.getCacheControl();
      assertNotNull(compositeCache0);
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getInstance("");
      CompositeCache<Object, Object> compositeCache0 = compositeCacheManager0.getCache("t");
      CacheAccess<Object, Object> cacheAccess0 = new CacheAccess<Object, Object>(compositeCache0);
      cacheAccess0.clear();
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getInstance("");
      CompositeCache<Object, String> compositeCache0 = compositeCacheManager0.getCache("");
      CacheAccess<Object, String> cacheAccess0 = new CacheAccess<Object, String>(compositeCache0);
      cacheAccess0.dispose();
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getInstance("");
      CompositeCache<String, Object> compositeCache0 = compositeCacheManager0.getCache("org.apache.commons.jcs3:type=JCSAdminBean");
      CacheAccess<String, Object> cacheAccess0 = new CacheAccess<String, Object>(compositeCache0);
      ICompositeCacheAttributes iCompositeCacheAttributes0 = cacheAccess0.getCacheAttributes();
      CompositeCache<Object, Object> compositeCache1 = compositeCacheManager0.getCache("org.apache.commons.jcs3:type=JCSAdminBean");
      CacheAccess<Object, Object> cacheAccess1 = new CacheAccess<Object, Object>(compositeCache1);
      IElementAttributes iElementAttributes0 = cacheAccess1.getDefaultElementAttributes();
      CompositeCache<Integer, Integer> compositeCache2 = new CompositeCache<Integer, Integer>(iCompositeCacheAttributes0, iElementAttributes0);
      CacheAccess<Integer, Integer> cacheAccess2 = new CacheAccess<Integer, Integer>(compositeCache2);
      String string0 = cacheAccess2.getStats();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getInstance("");
      CompositeCache<String, Object> compositeCache0 = compositeCacheManager0.getCache("org.apache.commons.jcs3:type=JCSAdminBean");
      CacheAccess<String, Object> cacheAccess0 = new CacheAccess<String, Object>(compositeCache0);
      ICompositeCacheAttributes iCompositeCacheAttributes0 = cacheAccess0.getCacheAttributes();
      cacheAccess0.setCacheAttributes(iCompositeCacheAttributes0);
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CacheAccess<Object, String> cacheAccess0 = new CacheAccess<Object, String>((CompositeCache<Object, String>) null);
      // Undeclared exception!
      try { 
        cacheAccess0.freeMemoryElements(0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.access.AbstractCacheAccess", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CacheAccess<String, Object> cacheAccess0 = new CacheAccess<String, Object>((CompositeCache<String, Object>) null);
      // Undeclared exception!
      try { 
        cacheAccess0.getStatistics();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.access.AbstractCacheAccess", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CacheAccess<Object, String> cacheAccess0 = new CacheAccess<Object, String>((CompositeCache<Object, String>) null);
      ElementAttributes elementAttributes0 = new ElementAttributes();
      // Undeclared exception!
      try { 
        cacheAccess0.setDefaultElementAttributes(elementAttributes0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.access.AbstractCacheAccess", e);
      }
  }
}
