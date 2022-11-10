/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:18:09 GMT 2022
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.GregorianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GregorianChronology_ESTest extends GregorianChronology_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.calculateFirstDayOfYearMillis(761);
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      int int0 = gregorianChronology0.getDayOfMonth(0L, (-700));
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      int int0 = gregorianChronology0.getMonthOfYear(1182L, (-2972));
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      boolean boolean0 = gregorianChronology0.isLeapYear(52);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 4);
      boolean boolean0 = gregorianChronology0.isLeapYear(1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      int int0 = gregorianChronology0.getMaxYear();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.getAverageMillisPerYear();
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      long long0 = gregorianChronology0.getApproxMillisAtEpochDividedByTwo();
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      long long0 = gregorianChronology0.calculateFirstDayOfYearMillis(1970);
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.calculateFirstDayOfYearMillis(2072);
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        GregorianChronology.getInstance((DateTimeZone) null, 832);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 832
         //
         verifyException("org.joda.time.chrono.GregorianChronology", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      try { 
        gregorianChronology0.assemble((AssembledChronology.Fields) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      long long0 = gregorianChronology0.calculateFirstDayOfYearMillis((-54));
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 4);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      gregorianChronology0.assemble(assembledChronology_Fields0);
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      int int0 = gregorianChronology0.getMonthOfYear(2225L);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Chronology chronology0 = gregorianChronology0.withUTC();
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      long long0 = gregorianChronology0.calculateFirstDayOfYearMillis(0);
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null);
      Chronology chronology0 = gregorianChronology0.withZone((DateTimeZone) null);
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      gregorianChronology0.assemble(assembledChronology_Fields0);
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(929);
      Chronology chronology0 = gregorianChronology0.withZone(dateTimeZone0);
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      long long0 = gregorianChronology0.getAverageMillisPerMonth();
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 4);
      long long0 = gregorianChronology0.getAverageMillisPerYearDividedByTwo();
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.calculateFirstDayOfYearMillis(100);
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 4);
      int int0 = gregorianChronology0.getMinYear();
      assertEquals(1, int0);
}
}
