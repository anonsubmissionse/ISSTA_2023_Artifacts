/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:23:01 GMT 2022
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BuddhistChronology_ESTest extends BuddhistChronology_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      Chronology chronology0 = buddhistChronology0.withZone(dateTimeZone0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      buddhistChronology0.assemble(assembledChronology_Fields0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      BuddhistChronology buddhistChronology1 = BuddhistChronology.getInstance(dateTimeZone0);
      boolean boolean0 = buddhistChronology0.equals(buddhistChronology1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      String string0 = buddhistChronology0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      boolean boolean0 = buddhistChronology0.equals(buddhistChronology0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      boolean boolean0 = buddhistChronology0.equals((Object) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      BuddhistChronology buddhistChronology1 = (BuddhistChronology)buddhistChronology0.withZone((DateTimeZone) null);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      buddhistChronology0.hashCode();
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Chronology chronology0 = buddhistChronology0.withUTC();
      ;
}
}
