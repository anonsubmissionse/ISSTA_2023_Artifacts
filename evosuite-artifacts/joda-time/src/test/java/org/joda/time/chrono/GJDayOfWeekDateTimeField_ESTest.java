/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:33:08 GMT 2022
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.chrono.BasicChronology;
import org.joda.time.chrono.BasicWeekyearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJDayOfWeekDateTimeField;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GJDayOfWeekDateTimeField_ESTest extends GJDayOfWeekDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.seconds();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(copticChronology0, durationField0);
      Locale locale0 = Locale.ITALY;
      String string0 = gJDayOfWeekDateTimeField0.getAsText(0, locale0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(islamicChronology0);
      DurationField durationField0 = basicWeekyearDateTimeField0.getLeapDurationField();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(gregorianChronology0, durationField0);
      String string0 = gJDayOfWeekDateTimeField0.getAsShortText(1, (Locale) null);
      assertEquals("Mon", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.seconds();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(copticChronology0, durationField0);
      Locale locale0 = Locale.ENGLISH;
      int int0 = gJDayOfWeekDateTimeField0.convertText("Monday", locale0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      CopticChronology copticChronology0 = new CopticChronology((Chronology) null, object0, 1);
      DurationField durationField0 = copticChronology0.halfdays();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField((BasicChronology) null, durationField0);
      // Undeclared exception!
      try { 
        gJDayOfWeekDateTimeField0.getRangeDurationField();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJDayOfWeekDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(28265625);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = copticChronology0.millis();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(ethiopicChronology0, durationField0);
      Locale locale0 = Locale.GERMAN;
      // Undeclared exception!
      try { 
        gJDayOfWeekDateTimeField0.getAsText(86400, locale0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 86400
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(islamicChronology0);
      DurationField durationField0 = basicWeekyearDateTimeField0.getLeapDurationField();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(islamicChronology0, durationField0);
      Locale locale0 = Locale.US;
      // Undeclared exception!
      try { 
        gJDayOfWeekDateTimeField0.getAsShortText((-2053), locale0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2053
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      CopticChronology copticChronology0 = new CopticChronology((Chronology) null, object0, 1);
      DurationField durationField0 = copticChronology0.halfdays();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField((BasicChronology) null, durationField0);
      // Undeclared exception!
      try { 
        gJDayOfWeekDateTimeField0.get((-505L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJDayOfWeekDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(islamicChronology0);
      DurationField durationField0 = basicWeekyearDateTimeField0.getLeapDurationField();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(gregorianChronology0, durationField0);
      // Undeclared exception!
      try { 
        gJDayOfWeekDateTimeField0.convertText("", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\" for dayOfWeek is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = null;
      try {
        gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(ethiopicChronology0, (DurationField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      DurationField durationField0 = gJMonthOfYearDateTimeField0.getRangeDurationField();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = null;
      try {
        gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(copticChronology0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unit duration field must be precise
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.seconds();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(copticChronology0, durationField0);
      int int0 = gJDayOfWeekDateTimeField0.get(1);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.seconds();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(copticChronology0, durationField0);
      int int0 = gJDayOfWeekDateTimeField0.getMaximumValue();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.seconds();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(copticChronology0, durationField0);
      int int0 = gJDayOfWeekDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DurationField durationField0 = copticChronology0.millis();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(islamicChronology0, durationField0);
      Locale locale0 = Locale.CANADA_FRENCH;
      int int0 = gJDayOfWeekDateTimeField0.getMaximumShortTextLength(locale0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(islamicChronology0);
      DurationField durationField0 = basicWeekyearDateTimeField0.getLeapDurationField();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(gregorianChronology0, durationField0);
      DurationField durationField1 = gJDayOfWeekDateTimeField0.getRangeDurationField();
      assertEquals(604800000L, durationField1.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DurationField durationField0 = copticChronology0.millis();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(islamicChronology0, durationField0);
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        gJDayOfWeekDateTimeField0.convertText((String) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DurationField durationField0 = copticChronology0.millis();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(islamicChronology0, durationField0);
      Locale locale0 = Locale.CANADA_FRENCH;
      String string0 = gJDayOfWeekDateTimeField0.getAsShortText(0, locale0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.minutes();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(copticChronology0, durationField0);
      Locale locale0 = Locale.KOREAN;
      int int0 = gJDayOfWeekDateTimeField0.getMaximumTextLength(locale0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.minutes();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = new GJDayOfWeekDateTimeField(copticChronology0, durationField0);
      Locale locale0 = Locale.KOREAN;
      String string0 = gJDayOfWeekDateTimeField0.getAsText(1, locale0);
      assertEquals("\uC6D4\uC694\uC77C", string0);
      assertNotNull(string0);
  }
}
