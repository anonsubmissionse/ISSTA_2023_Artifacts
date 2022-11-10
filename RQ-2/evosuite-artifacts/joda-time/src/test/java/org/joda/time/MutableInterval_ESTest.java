/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:27:04 GMT 2022
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableInstant;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableInterval.parse("Asia/Ho_Chi_Minh");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Asia\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((Object) null, (Chronology) null);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MutableInterval mutableInterval0 = null;
      try {
        mutableInterval0 = new MutableInterval("sn_Fqz]1i4s*");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: sn_Fqz]1i4s*
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      assertEquals(0, mutableInterval0.getStartMillis());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Instant instant0 = Instant.now();
      MutableInterval mutableInterval0 = new MutableInterval(instant0, instant0);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, days0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Instant instant0 = Instant.now();
      MutableInterval mutableInterval0 = new MutableInterval(hours0, instant0);
      assertEquals(0, mutableInterval0.getStartMillis());
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((Object) null);
      assertEquals(0, mutableInterval0.getStartMillis());
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Duration duration0 = new Duration(0L, 0L);
      Instant instant0 = Instant.ofEpochMilli(0L);
      MutableInterval mutableInterval0 = new MutableInterval(duration0, instant0);
      assertEquals(0, mutableInterval0.getStartMillis());
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, duration0);
      assertEquals(0, mutableInterval0.getEndMillis());
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      MutableInterval mutableInterval0 = null;
      try {
        mutableInterval0 = new MutableInterval(object0, (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // No interval converter found for type: java.lang.Object
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableInterval.parse("");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: 
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-2877L), (-2877L));
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutableInterval mutableInterval0 = null;
      try {
        mutableInterval0 = new MutableInterval((-2447L), (-3885L), (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }
}
