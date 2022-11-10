/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:26:25 GMT 2022
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.PreciseDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PreciseDurationDateTimeField_ESTest extends PreciseDurationDateTimeField_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.remainder((-1089L));
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.remainder(0);
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.roundHalfEven(1000L);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.roundCeiling(0L);
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.roundFloor(0L);
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.set(0L, 0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.set(6601L, 1);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.set((long) (-2639), 0);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.roundFloor(1000L);
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.roundCeiling((-1953L));
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      // Undeclared exception!
      try { 
        preciseDateTimeField0.set((-61721481600000L), (-1));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for dayOfYear must be in the range [0,604799]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.roundFloor(1);
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.roundFloor((-1294L));
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      int int0 = preciseDateTimeField0.getMaximumValueForSet(301L, (-2639));
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      DurationField durationField2 = preciseDateTimeField0.getDurationField();
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.getUnitMillis();
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      int int0 = preciseDateTimeField0.getMinimumValue();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.remainder(1000L);
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.remainder((-1L));
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      long long0 = preciseDateTimeField0.roundCeiling(1);
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.eras();
      PreciseDateTimeField preciseDateTimeField0 = null;
      try {
        preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // The unit milliseconds must be at least 1
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DurationField durationField0 = buddhistChronology0.weekyears();
      PreciseDateTimeField preciseDateTimeField0 = null;
      try {
        preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Unit duration field must be precise
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.hours();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      boolean boolean0 = preciseDateTimeField0.isLenient();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.hours();
      DurationField durationField1 = buddhistChronology0.weeks();
      PreciseDateTimeField preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField1);
      boolean boolean0 = preciseDateTimeField0.isLenient();
      assertEquals(0, preciseDateTimeField0.getMinimumValue());
}
}
