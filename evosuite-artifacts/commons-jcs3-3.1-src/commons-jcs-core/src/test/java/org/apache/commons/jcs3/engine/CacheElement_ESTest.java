/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:01:03 GMT 2022
 */

package org.apache.commons.jcs3.engine;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.jcs3.engine.CacheElement;
import org.apache.commons.jcs3.engine.ElementAttributes;
import org.apache.commons.jcs3.engine.behavior.IElementAttributes;
import org.apache.commons.jcs3.engine.control.event.behavior.IElementEventHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheElement_ESTest extends CacheElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ElementAttributes elementAttributes0 = new ElementAttributes();
      CacheElement<String, Integer> cacheElement0 = new CacheElement<String, Integer>("ZLf2ev5*Y90y$uf.+S", "FX.tmXc0AD", (Integer) null, elementAttributes0);
      Integer integer0 = cacheElement0.getVal();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ElementAttributes elementAttributes0 = new ElementAttributes();
      CacheElement<String, String> cacheElement0 = new CacheElement<String, String>((String) null, (String) null, (String) null, elementAttributes0);
      String string0 = cacheElement0.getKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ElementAttributes elementAttributes0 = new ElementAttributes();
      IElementEventHandler iElementEventHandler0 = mock(IElementEventHandler.class, new ViolatedAssumptionAnswer());
      elementAttributes0.setTimeFactorForMilliseconds(0);
      CacheElement<IElementEventHandler, Object> cacheElement0 = new CacheElement<IElementEventHandler, Object>("=v'8d\u0004{ JVF#pB(M", iElementEventHandler0, "", elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheElement0.getElementAttributes();
      assertEquals(0L, iElementAttributes0.getTimeFactorForMilliseconds());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(478);
      IElementEventHandler iElementEventHandler0 = mock(IElementEventHandler.class, new ViolatedAssumptionAnswer());
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setTimeFactorForMilliseconds((-1L));
      CacheElement<Integer, IElementEventHandler> cacheElement0 = new CacheElement<Integer, IElementEventHandler>("X|Bd)VNOe0|TtQ~", integer0, iElementEventHandler0, elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheElement0.getElementAttributes();
      assertEquals((-1L), iElementAttributes0.getTimeFactorForMilliseconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer((-1620));
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setSize(284);
      CacheElement<String, String> cacheElement0 = new CacheElement<String, String>(", getTimeToLiveSeconds() = ", ", getTimeToLiveSeconds() = ", ", getTimeToLiveSeconds() = ", elementAttributes0);
      CacheElement<Object, Integer> cacheElement1 = new CacheElement<Object, Integer>("[ IS_LATERAL = ", cacheElement0, integer0, elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheElement1.getElementAttributes();
      assertEquals(284, iElementAttributes0.getSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ElementAttributes elementAttributes0 = new ElementAttributes();
      Integer integer0 = new Integer(4432);
      CacheElement<Integer, String> cacheElement0 = new CacheElement<Integer, String>(", CreateTime = ", integer0, ":\"m$8W'l,.\"jzk#F/", elementAttributes0);
      elementAttributes0.setSize((-2413));
      IElementAttributes iElementAttributes0 = cacheElement0.getElementAttributes();
      assertEquals((-2413), iElementAttributes0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(0);
      CacheElement<Integer, Object> cacheElement0 = new CacheElement<Integer, Object>("I+z}m$}", integer0, "I+z}m$}");
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setMaxLife(0);
      CacheElement<String, Object> cacheElement1 = new CacheElement<String, Object>("", "I+z}m$}", cacheElement0, elementAttributes0);
      CacheElement<Object, Object> cacheElement2 = new CacheElement<Object, Object>("I+z}m$}", cacheElement1, "", elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheElement2.getElementAttributes();
      assertEquals(0L, iElementAttributes0.getTimeToLiveSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setMaxLife(3579);
      CacheElement<String, Object> cacheElement0 = new CacheElement<String, Object>("[ IS_LATERAL = true, IS_SPOOL = true, IS_REMOTE = true, IS_ETERNAL = true, MaxLifeSeconds = 3579, IdleTime = -1, CreateTime = 1392409281320, LastAccessTime = 1392409281320, getTimeToLiveSeconds() = 3579, createTime = 1392409281320 ]", "[ IS_LATERAL = true, IS_SPOOL = true, IS_REMOTE = true, IS_ETERNAL = true, MaxLifeSeconds = 3579, IdleTime = -1, CreateTime = 1392409281320, LastAccessTime = 1392409281320, getTimeToLiveSeconds() = 3579, createTime = 1392409281320 ]", "[CacheElement: cacheName [], val [], key [3579], val [null], attr [[ IS_LATERAL = true, IS_SPOOL = true, IS_REMOTE = true, IS_ETERNAL = true, MaxLifeSeconds = 3579, IdleTime = -1, CreateTime = 1392409281320, LastAccessTime = 1392409281320, getTimeToLiveSeconds() = 3579, createTime = 1392409281320 ]]", elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheElement0.getElementAttributes();
      assertEquals(3579L, iElementAttributes0.getMaxLife());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(1);
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setIsSpool(false);
      CacheElement<Integer, String> cacheElement0 = new CacheElement<Integer, String>("", integer0, ", IS_REMOTE = ", elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheElement0.getElementAttributes();
      assertFalse(iElementAttributes0.getIsSpool());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ElementAttributes elementAttributes0 = new ElementAttributes();
      IElementEventHandler iElementEventHandler0 = mock(IElementEventHandler.class, new ViolatedAssumptionAnswer());
      elementAttributes0.setIsRemote(false);
      CacheElement<IElementEventHandler, Object> cacheElement0 = new CacheElement<IElementEventHandler, Object>("=v'8d\u0004{ JVF#pB(M", iElementEventHandler0, "", elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheElement0.getElementAttributes();
      assertFalse(iElementAttributes0.getIsRemote());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setIsLateral(false);
      Integer integer0 = new Integer(4432);
      CacheElement<Integer, String> cacheElement0 = new CacheElement<Integer, String>(", CreateTime = ", integer0, ":\"m$8W'l,.\"jzk#F/", elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheElement0.getElementAttributes();
      assertFalse(iElementAttributes0.getIsLateral());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IElementEventHandler iElementEventHandler0 = mock(IElementEventHandler.class, new ViolatedAssumptionAnswer());
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setIsEternal(false);
      CacheElement<String, IElementEventHandler> cacheElement0 = new CacheElement<String, IElementEventHandler>("Clone not supported. This should never happen.", "Clone not supported. This should never happen.", iElementEventHandler0, elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheElement0.getElementAttributes();
      assertFalse(iElementAttributes0.getIsEternal());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(0);
      CacheElement<Integer, Object> cacheElement0 = new CacheElement<Integer, Object>("I+z}m$}", integer0, "I+z}m$}");
      ElementAttributes elementAttributes0 = new ElementAttributes();
      CacheElement<String, Object> cacheElement1 = new CacheElement<String, Object>("", "I+z}m$}", cacheElement0, elementAttributes0);
      elementAttributes0.setIdleTime(0L);
      IElementAttributes iElementAttributes0 = cacheElement1.getElementAttributes();
      assertEquals(0L, iElementAttributes0.getIdleTime());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setIdleTime(1974L);
      Object object0 = new Object();
      CacheElement<Object, Object> cacheElement0 = new CacheElement<Object, Object>("Clone not supported. This should never happen.", (Object) null, object0, elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheElement0.getElementAttributes();
      assertEquals(1974L, iElementAttributes0.getIdleTime());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CacheElement<Object, String> cacheElement0 = new CacheElement<Object, String>((String) null, (Object) null, "pur");
      ElementAttributes elementAttributes0 = new ElementAttributes();
      ElementAttributes elementAttributes1 = new ElementAttributes(elementAttributes0);
      CacheElement<String, CacheElement<Object, String>> cacheElement1 = new CacheElement<String, CacheElement<Object, String>>("pur", "pur", cacheElement0, elementAttributes1);
      IElementAttributes iElementAttributes0 = cacheElement1.getElementAttributes();
      assertEquals((-1392409282L), iElementAttributes0.getTimeToLiveSeconds());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CacheElement<String, Object> cacheElement0 = new CacheElement<String, Object>("7za=", "7za=", "7za=");
      IElementAttributes iElementAttributes0 = cacheElement0.getElementAttributes();
      System.setCurrentTimeMillis((-753L));
      Integer integer0 = new Integer(1);
      CacheElement<Object, Integer> cacheElement1 = new CacheElement<Object, Integer>("7za=", iElementAttributes0, integer0);
      IElementAttributes iElementAttributes1 = cacheElement1.getElementAttributes();
      assertEquals((-753L), iElementAttributes1.getLastAccessTime());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ElementAttributes elementAttributes0 = new ElementAttributes();
      CacheElement<Object, Object> cacheElement0 = new CacheElement<Object, Object>((String) null, (Object) null, (Object) null, elementAttributes0);
      String string0 = cacheElement0.getCacheName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      CacheElement<Object, Object> cacheElement0 = new CacheElement<Object, Object>("YiN$k}: \"~u", object0, object0, elementAttributes0);
      String string0 = cacheElement0.getCacheName();
      assertEquals("YiN$k}: \"~u", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ElementAttributes elementAttributes0 = new ElementAttributes();
      CacheElement<String, String> cacheElement0 = new CacheElement<String, String>("=v'8d\u0004{ JVF#pB(M", "", "^!m ");
      IElementEventHandler iElementEventHandler0 = mock(IElementEventHandler.class, new ViolatedAssumptionAnswer());
      CacheElement<IElementEventHandler, Object> cacheElement1 = new CacheElement<IElementEventHandler, Object>("=v'8d\u0004{ JVF#pB(M", iElementEventHandler0, "", elementAttributes0);
      boolean boolean0 = cacheElement1.equals(cacheElement0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CacheElement<Object, String> cacheElement0 = new CacheElement<Object, String>((String) null, (Object) null, "pur");
      ElementAttributes elementAttributes0 = new ElementAttributes();
      CacheElement<Object, Object> cacheElement1 = new CacheElement<Object, Object>("pur", "pur", cacheElement0, elementAttributes0);
      Object object0 = cacheElement1.getVal();
      boolean boolean0 = cacheElement0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer(1);
      CacheElement<Integer, Integer> cacheElement0 = new CacheElement<Integer, Integer>("`IY@", integer0, integer0);
      boolean boolean0 = cacheElement0.equals("hpzR+A%~i!0A");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CacheElement<Object, Object> cacheElement0 = new CacheElement<Object, Object>("", "", "");
      CacheElement<CacheElement<Object, Object>, CacheElement<Object, Object>> cacheElement1 = new CacheElement<CacheElement<Object, Object>, CacheElement<Object, Object>>("", cacheElement0, cacheElement0);
      cacheElement1.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CacheElement<String, String> cacheElement0 = new CacheElement<String, String>("", "", "");
      String string0 = cacheElement0.getKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CacheElement<Object, String> cacheElement0 = new CacheElement<Object, String>(",T4R6.", ",T4R6.", ",T4R6.");
      String string0 = cacheElement0.toString();
      assertEquals("[CacheElement: cacheName [,T4R6.], key [,T4R6.], val [,T4R6.], attr [null]", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer integer0 = new Integer((-16));
      CacheElement<Integer, Object> cacheElement0 = new CacheElement<Integer, Object>("", integer0, integer0);
      String string0 = cacheElement0.getCacheName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CacheElement<Object, String> cacheElement0 = new CacheElement<Object, String>("i0~Tbs(=ggHQA?", "i0~Tbs(=ggHQA?", "i0~Tbs(=ggHQA?");
      ElementAttributes elementAttributes0 = new ElementAttributes();
      cacheElement0.setElementAttributes(elementAttributes0);
      assertEquals(0, elementAttributes0.getSize());
  }
}
