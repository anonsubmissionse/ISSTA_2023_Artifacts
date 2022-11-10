/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:13:21 GMT 2022
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseSingleFieldPeriod_ESTest extends BaseSingleFieldPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      hours0.hashCode();
      assertEquals(3, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Years years0 = Years.years(17);
      Years years1 = Years.MIN_VALUE;
      boolean boolean0 = years0.equals(years1);
      assertFalse(years1.equals((Object)years0));
      assertFalse(boolean0);
      assertEquals(17, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      // Undeclared exception!
      try { 
        seconds0.getValue(17);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 17
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Months months0 = Months.ONE;
      // Undeclared exception!
      try { 
        months0.getFieldType(628);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 628
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = BaseSingleFieldPeriod.standardPeriodIn((ReadablePeriod) null, 0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      int int0 = minutes0.getValue(0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      int int0 = years0.getValue(0);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      PeriodType periodType0 = hours0.getPeriodType();
      assertEquals(1, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.ZERO;
      DurationFieldType durationFieldType0 = days0.getFieldType(0);
      Days days1 = Days.FIVE;
      int int0 = days1.get(durationFieldType0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds((-253));
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      int int0 = seconds0.get(durationFieldType0);
      assertEquals((-253), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.standardHoursIn((ReadablePeriod) null);
      // Undeclared exception!
      try { 
        BaseSingleFieldPeriod.standardPeriodIn(hours0, 0L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      // Undeclared exception!
      try { 
        years0.compareTo((BaseSingleFieldPeriod) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      // Undeclared exception!
      try { 
        BaseSingleFieldPeriod.between((ReadablePartial) null, (ReadablePartial) null, minutes0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.ZERO;
      int int0 = days0.getValue(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      Years years1 = years0.dividedBy((-1464));
      int int0 = years1.compareTo((BaseSingleFieldPeriod) years0);
      assertEquals((-1466860), years1.getYears());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Years years0 = Years.ZERO;
      Years years1 = Years.THREE;
      int int0 = years1.compareTo((BaseSingleFieldPeriod) years0);
      assertEquals(1, int0);
      assertEquals(0, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Hours hours0 = weeks0.toStandardHours();
      Seconds seconds0 = hours0.toStandardSeconds();
      // Undeclared exception!
      try { 
        seconds0.compareTo((BaseSingleFieldPeriod) weeks0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Seconds cannot be compared to class org.joda.time.Weeks
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Years years0 = Years.ZERO;
      int int0 = years0.compareTo((BaseSingleFieldPeriod) years0);
      assertEquals(0, years0.getYears());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Years years0 = Years.years(102);
      Years years1 = Years.years(102);
      boolean boolean0 = years0.equals(years1);
      assertTrue(boolean0);
      assertEquals(102, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Months months0 = Months.TWO;
      Seconds seconds0 = Seconds.THREE;
      boolean boolean0 = months0.equals(seconds0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      Object object0 = new Object();
      boolean boolean0 = years0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Years years0 = Years.years(102);
      boolean boolean0 = years0.equals(years0);
      assertTrue(boolean0);
      assertEquals(102, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Years years0 = Years.ZERO;
      DurationFieldType durationFieldType0 = years0.getFieldType();
      boolean boolean0 = years0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      boolean boolean0 = seconds0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      Months months0 = Months.TWO;
      int int0 = months0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Years years0 = Years.TWO;
      // Undeclared exception!
      try { 
        years0.getValue((-2072));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -2072
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Years years0 = Years.ZERO;
      Years years1 = Years.THREE;
      boolean boolean0 = years0.equals(years1);
      assertEquals(3, years1.getYears());
      assertFalse(boolean0);
      assertFalse(years1.equals((Object)years0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Years years0 = Years.ONE;
      // Undeclared exception!
      try { 
        years0.getFieldType((-566));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -566
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Instant instant0 = new Instant();
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      int int0 = BaseSingleFieldPeriod.between(instant0, instant0, durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Instant instant0 = Instant.now();
      Days days0 = Days.ZERO;
      Duration duration0 = days0.toStandardDuration();
      Seconds seconds0 = duration0.toStandardSeconds();
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      // Undeclared exception!
      try { 
        BaseSingleFieldPeriod.between(instant0, (ReadableInstant) null, durationFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        Years.yearsBetween((ReadableInstant) null, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Days days0 = Days.TWO;
      days0.toMutablePeriod();
      assertEquals(2, days0.getDays());
      assertEquals(1, days0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      hours0.toPeriod();
      assertEquals(7, hours0.getHours());
      assertEquals(1, hours0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Years years0 = Years.years(0);
      int int0 = years0.size();
      assertEquals(1, int0);
  }
}
