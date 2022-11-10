/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:32:21 GMT 2022
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Duration;
import org.joda.time.Minutes;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.Seconds;
import org.joda.time.convert.ReadableDurationConverter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReadableDurationConverter_ESTest extends ReadableDurationConverter_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReadableDurationConverter readableDurationConverter0 = new ReadableDurationConverter();
      Minutes minutes0 = Minutes.ZERO;
      Duration duration0 = minutes0.toStandardDuration();
      long long0 = readableDurationConverter0.getDurationMillis(duration0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReadableDurationConverter readableDurationConverter0 = new ReadableDurationConverter();
      Duration duration0 = Duration.millis(48);
      long long0 = readableDurationConverter0.getDurationMillis(duration0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReadableDurationConverter readableDurationConverter0 = ReadableDurationConverter.INSTANCE;
      Seconds seconds0 = Seconds.TWO;
      Duration duration0 = seconds0.toStandardDuration();
      Duration duration1 = duration0.negated();
      long long0 = readableDurationConverter0.getDurationMillis(duration1);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReadableDurationConverter readableDurationConverter0 = new ReadableDurationConverter();
      // Undeclared exception!
      try { 
        readableDurationConverter0.setInto((ReadWritablePeriod) null, (Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadableDurationConverter", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ReadableDurationConverter readableDurationConverter0 = new ReadableDurationConverter();
      MutablePeriod mutablePeriod0 = new MutablePeriod(48, 0, 34, 34, 168, 0, 0, 34, (PeriodType) null);
      // Undeclared exception!
      try { 
        readableDurationConverter0.setInto(mutablePeriod0, "Py5rCJZ:>)a1%O;g8j*", (Chronology) null);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.joda.time.ReadableDuration
         //
         verifyException("org.joda.time.convert.ReadableDurationConverter", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ReadableDurationConverter readableDurationConverter0 = new ReadableDurationConverter();
      // Undeclared exception!
      try { 
        readableDurationConverter0.getDurationMillis((Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadableDurationConverter", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ReadableDurationConverter readableDurationConverter0 = new ReadableDurationConverter();
      Class<?> class0 = readableDurationConverter0.getSupportedType();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ReadableDurationConverter readableDurationConverter0 = ReadableDurationConverter.INSTANCE;
      // Undeclared exception!
      try { 
        readableDurationConverter0.getDurationMillis("org.joda.time.convert.ReadableDurationConverter");
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.joda.time.ReadableDuration
         //
         verifyException("org.joda.time.convert.ReadableDurationConverter", e);
      }
  }
}
