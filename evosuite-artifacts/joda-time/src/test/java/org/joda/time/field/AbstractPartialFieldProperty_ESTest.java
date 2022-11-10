/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:22:05 GMT 2022
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.Instant;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractPartialFieldProperty_ESTest extends AbstractPartialFieldProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3, 2806, 3, 4473, 3);
      MonthDay monthDay0 = MonthDay.fromDateFields(mockDate0);
      MonthDay.Property monthDay_Property0 = monthDay0.dayOfMonth();
      MonthDay monthDay1 = new MonthDay();
      MonthDay.Property monthDay_Property1 = monthDay1.dayOfMonth();
      boolean boolean0 = monthDay_Property1.equals(monthDay_Property0);
      assertFalse(monthDay_Property0.equals((Object)monthDay_Property1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 43);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      DurationField durationField0 = partial_Property0.getRangeDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      Partial partial0 = new Partial(dateTimeFieldType0, 18);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      int int0 = partial_Property0.getMinimumValueOverall();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) ethiopicChronology0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.year();
      int int0 = yearMonth_Property0.getMinimumValueOverall();
      assertEquals((-292269338), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Partial partial0 = new Partial(localTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      int int0 = partial_Property0.getMinimumValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) ethiopicChronology0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.year();
      int int0 = yearMonth_Property0.getMinimumValue();
      assertEquals((-292269338), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.parse("");
      MonthDay.Property monthDay_Property0 = monthDay0.dayOfMonth();
      DateTimeField dateTimeField0 = monthDay_Property0.getField();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) ethiopicChronology0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      int int0 = yearMonth_Property0.get();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      Partial partial0 = new Partial(dateTimeFieldType0, (-623));
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      int int0 = partial_Property0.get();
      assertEquals((-623), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) ethiopicChronology0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      DateTimeFieldType dateTimeFieldType0 = yearMonth_Property0.getFieldType();
      assertEquals("monthOfYear", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      String string0 = yearMonth_Property0.getName();
      assertEquals("monthOfYear", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      YearMonth yearMonth0 = new YearMonth((Chronology) julianChronology0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      Locale locale0 = Locale.ITALY;
      String string0 = yearMonth_Property0.getAsShortText(locale0);
      assertEquals("feb", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(34L);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      Locale locale0 = Locale.JAPAN;
      String string0 = monthDay_Property0.getAsText(locale0);
      assertEquals("1\u6708", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate(58, 58, 58, 58, 58);
      MonthDay monthDay0 = MonthDay.fromDateFields(mockDate0);
      MonthDay.Property monthDay_Property0 = monthDay0.dayOfMonth();
      MonthDay.Property monthDay_Property1 = monthDay0.dayOfMonth();
      boolean boolean0 = monthDay_Property1.equals(monthDay_Property0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay.Property monthDay_Property0 = monthDay0.dayOfMonth();
      MonthDay.Property monthDay_Property1 = monthDay0.monthOfYear();
      boolean boolean0 = monthDay_Property1.equals(monthDay_Property0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((Chronology) ethiopicChronology0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      boolean boolean0 = yearMonth_Property0.equals(ethiopicChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate(38, (-14), (-14), 38, 38, (-14));
      MonthDay monthDay0 = MonthDay.fromDateFields(mockDate0);
      MonthDay.Property monthDay_Property0 = monthDay0.dayOfMonth();
      boolean boolean0 = monthDay_Property0.equals(monthDay_Property0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(34L);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      MonthDay.Property monthDay_Property1 = monthDay0.dayOfMonth();
      boolean boolean0 = monthDay_Property0.equals(monthDay_Property1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate(38, (-14), (-14), 38, 38, (-14));
      MonthDay monthDay0 = MonthDay.fromDateFields(mockDate0);
      MonthDay monthDay1 = MonthDay.now();
      MonthDay.Property monthDay_Property0 = monthDay0.dayOfMonth();
      int int0 = monthDay_Property0.compareTo((ReadablePartial) monthDay1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((Chronology) ethiopicChronology0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      YearMonth yearMonth1 = yearMonth0.plusMonths(1);
      int int0 = yearMonth_Property0.compareTo((ReadablePartial) yearMonth1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      MonthDay monthDay0 = MonthDay.fromDateFields(mockDate0);
      MonthDay.Property monthDay_Property0 = monthDay0.dayOfMonth();
      // Undeclared exception!
      try { 
        monthDay_Property0.compareTo((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant must not be null
         //
         verifyException("org.joda.time.field.AbstractPartialFieldProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((Chronology) ethiopicChronology0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      int int0 = yearMonth_Property0.compareTo((ReadablePartial) yearMonth0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      Instant instant0 = Instant.ofEpochMilli(1);
      DateTime dateTime0 = instant0.toDateTime();
      int int0 = yearMonth_Property0.compareTo((ReadableInstant) dateTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(34L);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      Instant instant0 = Instant.now();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTime dateTime0 = instant0.toDateTime((Chronology) iSOChronology0);
      int int0 = monthDay_Property0.compareTo((ReadableInstant) dateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((long) 4079, (Chronology) null);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      // Undeclared exception!
      try { 
        monthDay_Property0.compareTo((ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant must not be null
         //
         verifyException("org.joda.time.field.AbstractPartialFieldProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      int int0 = yearMonth_Property0.compareTo((ReadableInstant) dateTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      String string0 = yearMonth_Property0.getAsString();
      assertEquals("2", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(1, 1, (Chronology) null);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      int int0 = monthDay_Property0.getMaximumTextLength((Locale) null);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      int int0 = yearMonth_Property0.getMaximumValue();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.parse("");
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      int int0 = monthDay_Property0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.parse("");
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      String string0 = monthDay_Property0.getAsShortText();
      assertEquals("Jan", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      yearMonth_Property0.hashCode();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      int int0 = yearMonth_Property0.getMaximumShortTextLength((Locale) null);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(34L);
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      String string0 = monthDay_Property0.getAsText();
      assertEquals("January", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((Chronology) ethiopicChronology0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      int int0 = yearMonth_Property0.getMinimumValueOverall();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.parse("");
      MonthDay.Property monthDay_Property0 = monthDay0.monthOfYear();
      DurationField durationField0 = monthDay_Property0.getRangeDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      int int0 = yearMonth_Property0.getMaximumValueOverall();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((Chronology) ethiopicChronology0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      DurationField durationField0 = yearMonth_Property0.getDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      String string0 = yearMonth_Property0.toString();
      assertEquals("Property[monthOfYear]", string0);
  }
}
