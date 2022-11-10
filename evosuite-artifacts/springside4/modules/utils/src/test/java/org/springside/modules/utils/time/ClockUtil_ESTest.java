/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 04:07:35 GMT 2022
 */

package org.springside.modules.utils.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;
import org.springside.modules.utils.time.ClockUtil;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClockUtil_ESTest extends ClockUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClockUtil.DefaultClock clockUtil_DefaultClock0 = new ClockUtil.DefaultClock();
      long long0 = clockUtil_DefaultClock0.currentTimeMillis();
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClockUtil.DummyClock clockUtil_DummyClock0 = ClockUtil.useDummyClock();
      long long0 = clockUtil_DummyClock0.nanoTime();
      assertEquals(1392409281320000L, long0);
      assertEquals(1392409281320L, clockUtil_DummyClock0.currentTimeMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClockUtil.DefaultClock clockUtil_DefaultClock0 = new ClockUtil.DefaultClock();
      long long0 = clockUtil_DefaultClock0.currentTimeMillis();
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClockUtil.DummyClock clockUtil_DummyClock0 = ClockUtil.useDummyClock();
      Date date0 = clockUtil_DummyClock0.currentDate();
      System.setCurrentTimeMillis(0L);
      ClockUtil.useDummyClock(date0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClockUtil.DefaultClock clockUtil_DefaultClock0 = new ClockUtil.DefaultClock();
      Date date0 = clockUtil_DefaultClock0.currentDate();
      System.setCurrentTimeMillis((-384L));
      ClockUtil.DummyClock clockUtil_DummyClock0 = ClockUtil.useDummyClock(date0);
      assertEquals(1392409281320L, clockUtil_DummyClock0.currentTimeMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      ClockUtil.DummyClock clockUtil_DummyClock0 = ClockUtil.useDummyClock((Date) mockDate0);
      assertEquals(0L, clockUtil_DummyClock0.currentTimeMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClockUtil.DummyClock clockUtil_DummyClock0 = ClockUtil.useDummyClock(0L);
      clockUtil_DummyClock0.increaseTime((-1));
      Date date0 = clockUtil_DummyClock0.currentDate();
      ClockUtil.useDummyClock(date0);
      assertEquals((-1L), clockUtil_DummyClock0.currentTimeMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      ClockUtil.DummyClock clockUtil_DummyClock0 = ClockUtil.useDummyClock(0L);
      assertEquals(0L, clockUtil_DummyClock0.currentTimeMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      System.setCurrentTimeMillis((-384L));
      ClockUtil.DummyClock clockUtil_DummyClock0 = ClockUtil.useDummyClock(2452L);
      assertEquals(2452L, clockUtil_DummyClock0.currentTimeMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      ClockUtil.DummyClock clockUtil_DummyClock0 = ClockUtil.useDummyClock();
      assertEquals(0L, clockUtil_DummyClock0.currentTimeMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      System.setCurrentTimeMillis((-384L));
      ClockUtil.DummyClock clockUtil_DummyClock0 = ClockUtil.useDummyClock();
      assertEquals((-384L), clockUtil_DummyClock0.currentTimeMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClockUtil.DummyClock clockUtil_DummyClock0 = ClockUtil.useDummyClock();
      clockUtil_DummyClock0.setNanoTime(0L);
      long long0 = ClockUtil.nanoTime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClockUtil.DummyClock clockUtil_DummyClock0 = ClockUtil.useDummyClock((-1L));
      clockUtil_DummyClock0.setNanoTime((-1L));
      assertEquals((-1L), clockUtil_DummyClock0.nanoTime());
      
      long long0 = ClockUtil.nanoTime();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      long long0 = ClockUtil.elapsedTime(1392409281320L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      long long0 = ClockUtil.elapsedTime(1392409281320000L);
      assertEquals((-1391016872038680L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClockUtil.useDummyClock(0L);
      long long0 = ClockUtil.currentTimeMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClockUtil.useDummyClock((-1L));
      long long0 = ClockUtil.currentTimeMillis();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClockUtil.useDummyClock((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.time.ClockUtil$DummyClock", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClockUtil.DummyClock clockUtil_DummyClock0 = new ClockUtil.DummyClock((-1015L));
      assertEquals((-1015L), clockUtil_DummyClock0.currentTimeMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long long0 = ClockUtil.currentTimeMillis();
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClockUtil.DummyClock clockUtil_DummyClock0 = ClockUtil.useDummyClock((-1L));
      Date date0 = clockUtil_DummyClock0.currentDate();
      ClockUtil.DummyClock clockUtil_DummyClock1 = new ClockUtil.DummyClock(date0);
      assertEquals("Wed Dec 31 23:59:59 GMT 1969", date0.toString());
      assertEquals((-1L), clockUtil_DummyClock0.currentTimeMillis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long long0 = ClockUtil.nanoTime();
      assertEquals(1392409281320000L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClockUtil clockUtil0 = new ClockUtil();
      assertEquals(1392409281320000L, clockUtil0.nanoTime());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClockUtil.DummyClock clockUtil_DummyClock0 = new ClockUtil.DummyClock();
      clockUtil_DummyClock0.updateNow((-792L));
      assertEquals((-792L), clockUtil_DummyClock0.currentTimeMillis());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClockUtil.DummyClock clockUtil_DummyClock0 = new ClockUtil.DummyClock();
      long long0 = clockUtil_DummyClock0.currentTimeMillis();
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClockUtil.DummyClock clockUtil_DummyClock0 = new ClockUtil.DummyClock();
      clockUtil_DummyClock0.decreaseTime((-20));
      assertEquals(1392409281340L, clockUtil_DummyClock0.currentTimeMillis());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClockUtil.DummyClock clockUtil_DummyClock0 = ClockUtil.useDummyClock();
      Date date0 = clockUtil_DummyClock0.currentDate();
      clockUtil_DummyClock0.updateNow(date0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
      assertEquals(1392409281320L, clockUtil_DummyClock0.currentTimeMillis());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClockUtil.DummyClock clockUtil_DummyClock0 = ClockUtil.useDummyClock();
      long long0 = clockUtil_DummyClock0.nanoTime();
      assertEquals(1392409281320L, clockUtil_DummyClock0.currentTimeMillis());
      assertEquals(1392409281320000L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      long long0 = ClockUtil.elapsedTime((-792L));
      assertEquals(1392409282112L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClockUtil.DefaultClock clockUtil_DefaultClock0 = new ClockUtil.DefaultClock();
      long long0 = clockUtil_DefaultClock0.nanoTime();
      assertEquals(1392409281320000L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClockUtil.useDefaultClock();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Date date0 = ClockUtil.currentDate();
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }
}
