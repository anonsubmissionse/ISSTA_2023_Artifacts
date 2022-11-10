/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:31:55 GMT 2022
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.field.DelegatedDurationField;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.ScaledDurationField;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DecoratedDurationField_ESTest extends DecoratedDurationField_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.weekyears();
      Weeks weeks0 = Weeks.MAX_VALUE;
      DurationFieldType durationFieldType0 = weeks0.getFieldType();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      boolean boolean0 = decoratedDurationField0.isPrecise();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.months();
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getValueAsLong(11129011200000L, (-1L));
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(millisDurationField0, durationFieldType0);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(decoratedDurationField0, durationFieldType0, (-1269));
      long long0 = scaledDurationField0.getValueAsLong(1974L, (-1200L));
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, 18);
      long long0 = scaledDurationField0.getUnitMillis();
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-1L));
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(preciseDurationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getUnitMillis();
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.centuries();
      PeriodType periodType0 = PeriodType.yearDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      DurationFieldType durationFieldType0 = mutablePeriod0.getFieldType(1);
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getMillis(0L, (-2019L));
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.days();
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getMillis(404L, (-825L));
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.hours();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getMillis(0, (-52L));
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.months();
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, 1189);
      long long0 = scaledDurationField0.getMillis((-3043), (-2516L));
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.days();
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      DelegatedDurationField delegatedDurationField0 = new DelegatedDurationField(durationField0, durationFieldType0);
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(delegatedDurationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getDifferenceAsLong(1, 0L);
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.halfdays();
      Years years0 = Years.TWO;
      DurationFieldType durationFieldType0 = years0.getFieldType();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getDifferenceAsLong((-15742265918680L), (-1502L));
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DelegatedDurationField delegatedDurationField0 = new DelegatedDurationField(millisDurationField0);
      Hours hours0 = Hours.TWO;
      DurationFieldType durationFieldType0 = hours0.getFieldType(0);
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(delegatedDurationField0, durationFieldType0);
      long long0 = decoratedDurationField0.add((long) 0, (long) 0);
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.days();
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.add((long) 1, (long) 1);
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(millisDurationField0, durationFieldType0, 4074);
      long long0 = scaledDurationField0.add(0L, 0);
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.halfdays();
      Years years0 = Years.TWO;
      DurationFieldType durationFieldType0 = years0.getFieldType();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.add((long) 2020, (-1));
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(preciseDurationField0, durationFieldType0, 2443);
      // Undeclared exception!
      try { 
        scaledDurationField0.getValueAsLong(0L, 0L);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.PreciseDurationField", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.halfdays();
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, 31);
      // Undeclared exception!
      try { 
        scaledDurationField0.getMillis(31557600000L, 1L);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 978285600000 * 43200000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.centuries();
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, (-2045));
      // Undeclared exception!
      try { 
        scaledDurationField0.getMillis((-2045), (long) (-2045));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Value 418204469 for year must be in the range [-292275054,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      DurationFieldType durationFieldType0 = weeks0.getFieldType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(preciseDurationField0, durationFieldType0);
      // Undeclared exception!
      try { 
        decoratedDurationField0.getDifferenceAsLong(377L, 0L);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.PreciseDurationField", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.weekyears();
      Weeks weeks0 = Weeks.MAX_VALUE;
      DurationFieldType durationFieldType0 = weeks0.getFieldType();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      // Undeclared exception!
      try { 
        decoratedDurationField0.add((long) 288, (-3362L));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (BuddhistChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.months();
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      // Undeclared exception!
      try { 
        decoratedDurationField0.add((-1L), 21859200000L);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: 21859200000
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.days();
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      // Undeclared exception!
      try { 
        decoratedDurationField0.add(86399999L, 215740799175L);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 215740799175 * 86400000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.months();
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, 1189);
      // Undeclared exception!
      try { 
        scaledDurationField0.add((-2516L), (-3043));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (BuddhistChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      DecoratedDurationField decoratedDurationField0 = null;
      try {
        decoratedDurationField0 = new DecoratedDurationField((DurationField) null, durationFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.joda.time.field.DecoratedDurationField", e);
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.months();
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      DurationField durationField1 = decoratedDurationField0.getWrappedField();
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      DecoratedDurationField decoratedDurationField0 = null;
      try {
        decoratedDurationField0 = new DecoratedDurationField(unsupportedDurationField0, durationFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // The field must be supported
         //
         verifyException("org.joda.time.field.DecoratedDurationField", e);
      }
  }
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.days();
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getDifferenceAsLong(918518400000L, 86399999L);
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.days();
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getMillis((-1795L), (-825L));
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.months();
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getMillis(4232, (long) 4232);
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.days();
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getUnitMillis();
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.days();
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      boolean boolean0 = decoratedDurationField0.isPrecise();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.days();
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.add((-825L), 2497);
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.days();
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getValueAsLong(0L, 0L);
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.days();
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.add(433L, (-88L));
      ;
}
}
