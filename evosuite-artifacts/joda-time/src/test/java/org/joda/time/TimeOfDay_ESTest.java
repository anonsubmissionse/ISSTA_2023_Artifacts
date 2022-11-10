/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:21:35 GMT 2022
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.TimeOfDay;
import org.joda.time.UTCDateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withWeekyear(1);
      DateTime dateTime2 = dateTime1.toDateTimeISO();
      Date date0 = dateTime2.toDate();
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(date0);
      assertEquals(320, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Days days0 = Days.ONE;
      Duration duration0 = days0.toStandardDuration();
      DateTime dateTime0 = DateTime.now((Chronology) gJChronology0);
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      PeriodType periodType0 = minutes0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod(duration0, dateTime0, periodType0);
      TimeOfDay timeOfDay0 = new TimeOfDay(dateTimeZone0);
      TimeOfDay timeOfDay1 = timeOfDay0.minus(mutablePeriod0);
      assertNotSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-1105L));
      TimeOfDay timeOfDay1 = timeOfDay0.withSecondOfMinute(0);
      assertEquals(0, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      TimeOfDay timeOfDay0 = new TimeOfDay(0L, (Chronology) islamicChronology0);
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withSecondOfMinute(1);
      assertEquals(1, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(islamicChronology0);
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0, lenientChronology0);
      TimeOfDay timeOfDay1 = timeOfDay0.withMinuteOfHour(0);
      assertEquals(0, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      TimeOfDay timeOfDay1 = timeOfDay0.withMinuteOfHour(3);
      assertEquals(3, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Date date0 = dateTime0.toDate();
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(date0);
      TimeOfDay timeOfDay1 = timeOfDay0.withMinuteOfHour(1);
      assertEquals(1, timeOfDay1.getMinuteOfHour());
      assertEquals(320, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((Object) null);
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withMillisOfSecond(3);
      assertEquals(3, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay((-2331L), (Chronology) copticChronology0);
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withHourOfDay(1);
      assertEquals(1, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-1105L));
      TimeOfDay timeOfDay1 = timeOfDay0.withHourOfDay(0);
      assertEquals(0, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      TimeOfDay timeOfDay1 = timeOfDay0.withFieldAdded(durationFieldType0, 3);
      assertEquals(24, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0, 0, gJChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      TimeOfDay timeOfDay1 = timeOfDay0.withFieldAdded(durationFieldType0, 3);
      assertEquals(3, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(10, 10);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      TimeOfDay timeOfDay1 = timeOfDay0.withField(dateTimeFieldType0, 10);
      assertEquals(10, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeUtils.MillisProvider dateTimeUtils_MillisProvider0 = mock(DateTimeUtils.MillisProvider.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeUtils_MillisProvider0).getMillis();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_MillisProvider0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2349, 1, 1990);
      TimeOfDay timeOfDay0 = TimeOfDay.fromCalendarFields(mockGregorianCalendar0);
      DateTime dateTime0 = timeOfDay0.toDateTimeToday((DateTimeZone) null);
      assertEquals(0L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      DateTimeUtils.MillisProvider dateTimeUtils_MillisProvider0 = mock(DateTimeUtils.MillisProvider.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeUtils_MillisProvider0).getMillis();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_MillisProvider0);
      DateTime dateTime0 = timeOfDay0.toDateTimeToday();
      assertEquals(0L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-1105L));
      DateTimeUtils.MillisProvider dateTimeUtils_MillisProvider0 = mock(DateTimeUtils.MillisProvider.class, new ViolatedAssumptionAnswer());
      doReturn((-1688L)).when(dateTimeUtils_MillisProvider0).getMillis();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_MillisProvider0);
      DateTime dateTime0 = timeOfDay0.toDateTimeToday();
      assertEquals((-1105L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      Months months0 = Months.ONE;
      TimeOfDay timeOfDay1 = timeOfDay0.minus(months0);
      assertNotSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay((long) 2, (Chronology) null);
      int int0 = timeOfDay0.getSecondOfMinute();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 1);
      int int0 = timeOfDay0.getMinuteOfHour();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(0L);
      int[] intArray0 = new int[3];
      intArray0[1] = (-404);
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, intArray0);
      int int0 = timeOfDay1.getMinuteOfHour();
      assertEquals((-404), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      TimeOfDay timeOfDay0 = TimeOfDay.fromCalendarFields(calendar0);
      timeOfDay0.getFieldType(2);
      assertEquals(320, timeOfDay0.getMillisOfSecond());
      assertEquals(20, timeOfDay0.getHourOfDay());
      assertEquals(21, timeOfDay0.getSecondOfMinute());
      assertEquals(21, timeOfDay0.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) buddhistChronology0);
      DateTimeField dateTimeField0 = timeOfDay0.getField(1, (Chronology) buddhistChronology0);
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay((-597L), (Chronology) ethiopicChronology0);
      TimeOfDay timeOfDay1 = timeOfDay0.minusSeconds(2);
      assertEquals(57, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeUtils.MillisProvider dateTimeUtils_MillisProvider0 = mock(DateTimeUtils.MillisProvider.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeUtils_MillisProvider0).getMillis();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_MillisProvider0);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      Date date0 = localDateTime0.toDate();
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(date0);
      assertEquals(0, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(mockDate0);
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, (int[]) null);
      // Undeclared exception!
      try { 
        timeOfDay1.withSecondOfMinute(243);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      // Undeclared exception!
      try { 
        timeOfDay0.MIDNIGHT.withMinuteOfHour(1596);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1596 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay((long) 2, (Chronology) gJChronology0);
      int[] intArray0 = new int[2];
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, intArray0);
      // Undeclared exception!
      try { 
        timeOfDay1.withMinuteOfHour(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((DateTimeZone) null);
      // Undeclared exception!
      try { 
        timeOfDay0.withHourOfDay((-1155));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1155 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay(2, 2, 2, gJChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      // Undeclared exception!
      try { 
        timeOfDay0.withFieldAdded(durationFieldType0, Integer.MAX_VALUE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147483647 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0, 0, gJChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      // Undeclared exception!
      timeOfDay0.withFieldAdded(durationFieldType0, Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = (UTCDateTimeZone)UTCDateTimeZone.INSTANCE;
      TimeOfDay timeOfDay0 = new TimeOfDay((DateTimeZone) uTCDateTimeZone0);
      int[] intArray0 = new int[3];
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, intArray0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      // Undeclared exception!
      try { 
        timeOfDay1.withFieldAdded(durationFieldType0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Date date0 = dateTime0.toDate();
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(date0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      // Undeclared exception!
      try { 
        timeOfDay0.withField(dateTimeFieldType0, 1383);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'millisOfDay' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      int[] intArray0 = new int[5];
      intArray0[0] = (-2787);
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, intArray0);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      // Undeclared exception!
      try { 
        timeOfDay1.withChronologyRetainFields(ethiopicChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2787 for hourOfDay must not be smaller than 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      int[] intArray0 = new int[7];
      intArray0[2] = 1900;
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, intArray0);
      // Undeclared exception!
      try { 
        timeOfDay1.toLocalTime();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1900 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      Date date0 = localDateTime0.toDate();
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(date0);
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, (int[]) null);
      // Undeclared exception!
      try { 
        timeOfDay1.toDateTimeToday(dateTimeZone0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      TimeOfDay timeOfDay1 = timeOfDay0.plusMinutes((-837));
      assertEquals(3, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-1659L));
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, (int[]) null);
      Period period0 = new Period();
      // Undeclared exception!
      try { 
        timeOfDay1.minus(period0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1118), 1906, 1504, 2, 3);
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(mockDate0);
      // Undeclared exception!
      try { 
        timeOfDay0.getFieldType((-2490));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int[] intArray0 = new int[6];
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay((TimeOfDay) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = new Object();
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: java.lang.Object
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay((-5539), (-5539), islamicChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -5539 for hourOfDay must not be smaller than 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay((-1899), (-1899), 3861, buddhistChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1899 for hourOfDay must not be smaller than 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay((-1773), (-1773), (-1788), (-1773), iSOChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1773 for hourOfDay must not be smaller than 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(3, 721, 721, 721);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 721 for minuteOfHour must not be larger than 59
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(28181250, 28181250);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 28181250 for hourOfDay must not be larger than 23
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      Period period0 = Period.days(1);
      TimeOfDay timeOfDay1 = timeOfDay0.withPeriodAdded(period0, 1);
      assertNotSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0, 0, gJChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      TimeOfDay timeOfDay1 = timeOfDay0.withFieldAdded(durationFieldType0, 0);
      assertSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) uTCDateTimeZone0);
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(0L, (Chronology) copticChronology0);
      assertEquals(0, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) buddhistChronology0);
      TimeOfDay timeOfDay1 = timeOfDay0.minusHours(1);
      assertEquals(19, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      LocalTime localTime0 = timeOfDay0.MIDNIGHT.toLocalTime();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((Object) null, (Chronology) null);
      TimeOfDay timeOfDay1 = null;
      try {
        timeOfDay1 = new TimeOfDay(timeOfDay0, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 14, 14, 14);
      assertEquals(0, TimeOfDay.HOUR_OF_DAY);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay(3, 3, 1, 176, gJChronology0);
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      // Undeclared exception!
      try { 
        timeOfDay0.withFieldAdded(durationFieldType0, 4737);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'weeks' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(0L);
      int int0 = timeOfDay0.getMinuteOfHour();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0, 0);
      int int0 = timeOfDay0.getMillisOfSecond();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(13, 13, 13);
      TimeOfDay timeOfDay0 = TimeOfDay.fromCalendarFields(mockGregorianCalendar0);
      UTCDateTimeZone uTCDateTimeZone0 = (UTCDateTimeZone)UTCDateTimeZone.INSTANCE;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) uTCDateTimeZone0);
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, (Chronology) copticChronology0);
      assertEquals(0, timeOfDay1.getSecondOfMinute());
      assertEquals(0, timeOfDay1.getHourOfDay());
      assertEquals(0, timeOfDay1.getMinuteOfHour());
      assertEquals(0, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      int int0 = timeOfDay0.getSecondOfMinute();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      Months months0 = Months.MIN_VALUE;
      TimeOfDay timeOfDay1 = timeOfDay0.withPeriodAdded(months0, 0);
      assertSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0L);
      TimeOfDay timeOfDay1 = timeOfDay0.plus((ReadablePeriod) null);
      assertEquals(0, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      TimeOfDay timeOfDay1 = timeOfDay0.withField(dateTimeFieldType0, 0);
      assertSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withField(dateTimeFieldType0, 1);
      assertEquals(1, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      TimeOfDay timeOfDay1 = timeOfDay0.withChronologyRetainFields(ethiopicChronology0);
      assertNotSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((-171L), (Chronology) gJChronology0);
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      TimeZone timeZone0 = uTCDateTimeZone0.toTimeZone();
      Date date0 = localDateTime0.toDate(timeZone0);
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(date0);
      // Undeclared exception!
      try { 
        timeOfDay0.getField((-1707), (Chronology) gJChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -1707
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeOfDay.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeOfDay.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) buddhistChronology0);
      DateTime dateTime0 = timeOfDay0.MIDNIGHT.toDateTimeToday();
      assertEquals(1392336000000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      TimeOfDay timeOfDay0 = new TimeOfDay(dateTimeZone0);
      TimeOfDay timeOfDay1 = timeOfDay0.plusHours(2);
      assertEquals(22, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0L);
      TimeOfDay timeOfDay1 = timeOfDay0.minusMinutes(0);
      assertSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(355, 0, 20503125);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 355 for hourOfDay must not be larger than 23
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((Object) null);
      // Undeclared exception!
      try { 
        timeOfDay0.MIDNIGHT.getField(1, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTime dateTime0 = timeOfDay0.toDateTimeToday((DateTimeZone) null);
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay("C]oLnrG", gJChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"C]oLnrG\"
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0L);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = timeOfDay0.getFieldTypes();
      assertEquals(4, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(10000000L);
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.minusMillis(2);
      assertEquals(998, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0, 0, gJChronology0);
      TimeOfDay timeOfDay1 = timeOfDay0.plusSeconds(298);
      assertEquals(58, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-1258L));
      assertEquals(4, timeOfDay0.size());
      
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.plusMillis(14);
      assertEquals(14, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(mockDate0);
      // Undeclared exception!
      try { 
        timeOfDay0.withSecondOfMinute(243);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 243 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay((-1201L));
      assertEquals(4, timeOfDay0.size());
      assertEquals(23, timeOfDay0.getHourOfDay());
  }
}
