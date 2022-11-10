/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:03:20 GMT 2022
 */

package org.apache.commons.jcs3.engine;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jcs3.engine.CacheGroup;
import org.apache.commons.jcs3.engine.ElementAttributes;
import org.apache.commons.jcs3.engine.behavior.IElementAttributes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheGroup_ESTest extends CacheGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CacheGroup cacheGroup0 = new CacheGroup();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setTimeFactorForMilliseconds(0L);
      cacheGroup0.setElementAttributes(elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheGroup0.getElementAttrributes();
      assertEquals(1392409281320L, iElementAttributes0.getLastAccessTime());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CacheGroup cacheGroup0 = new CacheGroup();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      cacheGroup0.setElementAttributes(elementAttributes0);
      elementAttributes0.setTimeFactorForMilliseconds((-1143L));
      IElementAttributes iElementAttributes0 = cacheGroup0.getElementAttrributes();
      assertEquals(0, iElementAttributes0.getSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CacheGroup cacheGroup0 = new CacheGroup();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      cacheGroup0.setElementAttributes(elementAttributes0);
      elementAttributes0.setSize(1);
      IElementAttributes iElementAttributes0 = cacheGroup0.getElementAttrributes();
      assertTrue(iElementAttributes0.getIsEternal());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CacheGroup cacheGroup0 = new CacheGroup();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setSize((-656));
      cacheGroup0.setElementAttributes(elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheGroup0.getElementAttrributes();
      assertEquals(1392409281320L, iElementAttributes0.getCreateTime());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CacheGroup cacheGroup0 = new CacheGroup();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setMaxLife(0L);
      cacheGroup0.setElementAttributes(elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheGroup0.getElementAttrributes();
      assertEquals(0L, iElementAttributes0.getTimeToLiveSeconds());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CacheGroup cacheGroup0 = new CacheGroup();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setMaxLife(1000L);
      cacheGroup0.setElementAttributes(elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheGroup0.getElementAttrributes();
      assertEquals(1000L, iElementAttributes0.getMaxLife());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CacheGroup cacheGroup0 = new CacheGroup();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setIsSpool(false);
      cacheGroup0.setElementAttributes(elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheGroup0.getElementAttrributes();
      assertEquals((-1L), iElementAttributes0.getMaxLife());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CacheGroup cacheGroup0 = new CacheGroup();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setIsRemote(false);
      cacheGroup0.setElementAttributes(elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheGroup0.getElementAttrributes();
      assertSame(iElementAttributes0, elementAttributes0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CacheGroup cacheGroup0 = new CacheGroup();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setIsLateral(false);
      cacheGroup0.setElementAttributes(elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheGroup0.getElementAttrributes();
      assertEquals((-1L), iElementAttributes0.getMaxLife());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CacheGroup cacheGroup0 = new CacheGroup();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      elementAttributes0.setIsEternal(false);
      cacheGroup0.setElementAttributes(elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheGroup0.getElementAttrributes();
      assertTrue(iElementAttributes0.getIsLateral());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CacheGroup cacheGroup0 = new CacheGroup();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      cacheGroup0.setElementAttributes(elementAttributes0);
      elementAttributes0.setIdleTime(0L);
      IElementAttributes iElementAttributes0 = cacheGroup0.getElementAttrributes();
      assertEquals(1392409281320L, iElementAttributes0.getCreateTime());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CacheGroup cacheGroup0 = new CacheGroup();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      cacheGroup0.setElementAttributes(elementAttributes0);
      elementAttributes0.setIdleTime(1);
      IElementAttributes iElementAttributes0 = cacheGroup0.getElementAttrributes();
      assertSame(iElementAttributes0, elementAttributes0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CacheGroup cacheGroup0 = new CacheGroup();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      ElementAttributes elementAttributes1 = new ElementAttributes(elementAttributes0);
      cacheGroup0.setElementAttributes(elementAttributes1);
      IElementAttributes iElementAttributes0 = cacheGroup0.getElementAttrributes();
      assertEquals((-1392409282L), iElementAttributes0.getTimeToLiveSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      System.setCurrentTimeMillis((-1L));
      CacheGroup cacheGroup0 = new CacheGroup();
      ElementAttributes elementAttributes0 = new ElementAttributes();
      cacheGroup0.setElementAttributes(elementAttributes0);
      IElementAttributes iElementAttributes0 = cacheGroup0.getElementAttrributes();
      assertTrue(iElementAttributes0.getIsEternal());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CacheGroup cacheGroup0 = new CacheGroup();
      IElementAttributes iElementAttributes0 = cacheGroup0.getElementAttrributes();
      assertNull(iElementAttributes0);
  }
}
