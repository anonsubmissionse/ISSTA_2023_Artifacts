/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:25:14 GMT 2022
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CachedDateTimeZone_ESTest extends CachedDateTimeZone_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      long long0 = cachedDateTimeZone0.nextTransition(0L);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      long long0 = cachedDateTimeZone0.nextTransition((-1209L));
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      boolean boolean0 = cachedDateTimeZone0.isFixed();
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-4969));
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      int int0 = cachedDateTimeZone0.getStandardOffset(60L);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        CachedDateTimeZone.forZone((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.CachedDateTimeZone", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      CachedDateTimeZone cachedDateTimeZone1 = CachedDateTimeZone.forZone(dateTimeZone0);
      boolean boolean0 = cachedDateTimeZone1.equals(cachedDateTimeZone0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(158);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      cachedDateTimeZone0.hashCode();
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("Asia/Shanghai");
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      cachedDateTimeZone0.isFixed();
      boolean boolean0 = cachedDateTimeZone0.equals("org/joda/time/tz/data");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("Asia/Shanghai");
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      cachedDateTimeZone0.isFixed();
      boolean boolean0 = cachedDateTimeZone0.equals("org/joda/time/tz/data");
      cachedDateTimeZone0.getUncachedZone();
      System.setCurrentTimeMillis(1000000000000L);
      String string0 = dateTimeZone0.getName((-2177481943000L));
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      String string0 = cachedDateTimeZone0.getNameKey(1);
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal((-650019600001L));
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((-650019600001L));
      ;
}
}
