/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:32:46 GMT 2022
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.convert.LongConverter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LongConverter_ESTest extends LongConverter_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LongConverter longConverter0 = new LongConverter();
      Long long0 = new Long(0L);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      long long1 = longConverter0.getInstantMillis(long0, ethiopicChronology0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LongConverter longConverter0 = new LongConverter();
      Long long0 = new Long(1572L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      long long1 = longConverter0.getInstantMillis(long0, buddhistChronology0);
      assertEquals(1, long1);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LongConverter longConverter0 = new LongConverter();
      Long long0 = new Long((-2088L));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      long long1 = longConverter0.getInstantMillis(long0, buddhistChronology0);
      assertEquals(1, long1);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LongConverter longConverter0 = new LongConverter();
      Long long0 = new Long(0L);
      long long1 = longConverter0.getDurationMillis(long0);
      assertEquals(0, long1);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LongConverter longConverter0 = LongConverter.INSTANCE;
      Long long0 = Long.getLong("1K,h.^\"1Xe", 1682L);
      long long1 = longConverter0.getDurationMillis(long0);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LongConverter longConverter0 = LongConverter.INSTANCE;
      Long long0 = Long.valueOf((-1183L));
      long long1 = longConverter0.getDurationMillis(long0);
      assertEquals(0, long1);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LongConverter longConverter0 = LongConverter.INSTANCE;
      // Undeclared exception!
      try { 
        longConverter0.getInstantMillis((Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.LongConverter", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LongConverter longConverter0 = new LongConverter();
      // Undeclared exception!
      try { 
        longConverter0.getDurationMillis((Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.LongConverter", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LongConverter longConverter0 = new LongConverter();
      Class<?> class0 = longConverter0.getSupportedType();
      assertTrue(class0.isEnum());
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LongConverter longConverter0 = new LongConverter();
      Object object0 = new Object();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      // Undeclared exception!
      try { 
        longConverter0.getInstantMillis(object0, ethiopicChronology0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Long
         //
         verifyException("org.joda.time.convert.LongConverter", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LongConverter longConverter0 = new LongConverter();
      // Undeclared exception!
      try { 
        longConverter0.getDurationMillis("Converter[java.lang.Long]");
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Long
         //
         verifyException("org.joda.time.convert.LongConverter", e);
      }
  }
}
