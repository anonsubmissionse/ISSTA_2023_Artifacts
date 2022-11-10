/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 19:56:33 GMT 2022
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicGJChronology_ESTest extends BasicGJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.setYear(5097599999L, (-1075));
      assertEquals((-96085785600001L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.getYearDifference(5097600000L, 30120530946L);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      int int0 = julianChronology0.getDaysInMonthMaxForSet(2861L, 28);
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2340, 366, 292278993, 0, 2340, 1);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      YearMonth yearMonth1 = yearMonth0.minusMonths(1970);
      assertEquals(802439, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(292278993, 1078958, 0);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      YearMonth yearMonth1 = yearMonth0.minusMonths(28624218);
      assertEquals(2, yearMonth1.getMonthOfYear());
      assertEquals(289793794, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(292278993, 2340, 0);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      YearMonth yearMonth1 = yearMonth0.minusMonths(292278993);
      assertEquals(7, yearMonth1.getMonthOfYear());
      assertEquals(267912278, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(292278993, 1970, 19);
      mockGregorianCalendar0.set(365, 1440, 0, (-1174), 0);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      YearMonth yearMonth1 = yearMonth0.minusMonths(1970);
      assertEquals(320, yearMonth1.getYear());
      assertEquals(9, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.minusMonths((-31));
      long long0 = buddhistChronology0.set(localDateTime1, 2007);
      assertEquals((-15660787058680L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(292278993, 1970, 0);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      YearMonth yearMonth1 = yearMonth0.plusMonths(1970);
      assertEquals(292269056, yearMonth1.getYear());
      assertEquals(8, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1970, 2340, 0);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      YearMonth yearMonth1 = yearMonth0.minusMonths(1970);
      assertEquals(2000, yearMonth1.getYear());
      assertEquals(10, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      LocalDateTime localDateTime1 = localDateTime0.withFieldAdded(durationFieldType0, (-1935));
      long long0 = buddhistChronology0.set(localDateTime1, (-1935));
      assertEquals((-15825771518680L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond(15778476000L);
      Duration duration0 = Duration.standardSeconds(1597623);
      Instant instant1 = instant0.withDurationAdded((ReadableDuration) duration0, (-2405));
      Months months0 = Months.monthsBetween((ReadableInstant) instant1, (ReadableInstant) instant1);
      assertEquals(0, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(292278993, 2340, 0);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      YearMonth yearMonth1 = yearMonth0.minusMonths(1078958);
      assertEquals(292178948, yearMonth1.getYear());
      assertEquals(2, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      int int0 = gregorianChronology0.getDayOfMonth(0L, 5362);
      assertEquals((-1238902), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      boolean boolean0 = gregorianChronology0.isLeapDay((-1L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.setYear(0L, 292278993);
      assertEquals(9223371985593600000L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(233);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      JulianChronology julianChronology0 = new JulianChronology(gJChronology0, buddhistChronology0.BE, 1);
      long long0 = julianChronology0.getTotalMillisByYearMonth(1946, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null, 4);
      long long0 = julianChronology0.getTotalMillisByYearMonth(738, 8);
      assertEquals(18316800000L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      int int0 = gregorianChronology0.getMonthOfYear(350L, (-2844));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      int int0 = julianChronology0.getDaysInYearMonth(12, 12);
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0, 2);
      int int0 = julianChronology0.getDaysInMonthMax(7);
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      // Undeclared exception!
      try { 
        gregorianChronology0.getTotalMillisByYearMonth(0, (-2692));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        julianChronology0.getDaysInYearMonth(376, (-3068));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3069
         //
         verifyException("org.joda.time.chrono.BasicGJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      long long0 = julianChronology0.getYearDifference((-60243987600000L), 1909L);
      assertEquals((-1910L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.getYearDifference(1970, 5097600000L);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      long long0 = julianChronology0.getYearDifference((-35L), (-60243987600000L));
      assertEquals(1909L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = gregorianChronology0.getZone();
      DateTime dateTime0 = new DateTime(23L, dateTimeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      DateTime dateTime1 = dateTime0.withFieldAdded(durationFieldType0, 17971875);
      DateTime dateTime2 = dateTime1.withWeekyear(1440);
      Period period0 = new Period(dateTime2, dateTime1);
      assertEquals((-16704359999977L), dateTime2.getMillis());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0, 2);
      long long0 = julianChronology0.getYearDifference(15778476000L, (-485L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      int int0 = julianChronology0.getDaysInMonthMaxForSet((-292275054), (-292275054));
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      int int0 = gregorianChronology0.getDaysInMonthMaxForSet(31535999366L, 292278993);
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = localDate0.minusDays(2615625);
      LocalDate localDate2 = localDate1.plusYears(2615625);
      int[] intArray0 = localDate2.getValues();
      assertArrayEquals(new int[] {2610477, 10, 13}, intArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(292278993, 1440, 292278993);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      YearMonth yearMonth1 = yearMonth0.minusMonths(1078958);
      assertEquals(5, yearMonth1.getMonthOfYear());
      assertEquals(291378807, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Integer integer0 = new Integer((-2430));
      Instant instant0 = Instant.ofEpochSecond(3640);
      Duration duration0 = Duration.standardSeconds((long) integer0);
      Instant instant1 = instant0.withDurationAdded((ReadableDuration) duration0, (-2430));
      Months months0 = Months.monthsBetween((ReadableInstant) instant1, (ReadableInstant) instant1);
      assertEquals(1, months0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = localDate0.minusDays(2615625);
      int[] intArray0 = localDate1.getValues();
      assertArrayEquals(new int[] {(-5148), 10, 13}, intArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = gregorianChronology0.getZone();
      DateTime dateTime0 = new DateTime(23L, dateTimeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      DateTime dateTime1 = dateTime0.withFieldAdded(durationFieldType0, 17971875);
      Period period0 = new Period(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(292278993, 1970, 19);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      YearMonth yearMonth1 = yearMonth0.minusMonths(1970);
      assertEquals(5, yearMonth1.getMonthOfYear());
      assertEquals(292268728, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(292278993, 1970, 0);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      YearMonth yearMonth1 = yearMonth0.minusMonths(1970);
      assertEquals(292268728, yearMonth1.getYear());
      assertEquals(4, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1085898, (-19), (-19), 1402, 292278993);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      YearMonth yearMonth1 = yearMonth0.minusMonths(1085898);
      assertEquals(9, yearMonth1.getMonthOfYear());
      assertEquals(995960, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Months months0 = Months.SEVEN;
      DurationFieldType durationFieldType0 = months0.getFieldType();
      LocalDateTime localDateTime1 = localDateTime0.withFieldAdded(durationFieldType0, (-1935));
      long long0 = buddhistChronology0.set(localDateTime1, (-1935));
      assertEquals((-20830966718680L), long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null);
      boolean boolean0 = gregorianChronology0.isLeapDay((-292275054));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        julianChronology0.getDaysInMonthMax((-292275054));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -292275055
         //
         verifyException("org.joda.time.chrono.BasicGJChronology", e);
      }
  }
}
