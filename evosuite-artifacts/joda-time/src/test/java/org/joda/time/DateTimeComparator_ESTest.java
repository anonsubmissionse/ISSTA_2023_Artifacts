/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:12:14 GMT 2022
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeComparator;
import org.joda.time.DateTimeFieldType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeComparator_ESTest extends DateTimeComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeComparator dateTimeComparator0 = new DateTimeComparator(dateTimeFieldType0, dateTimeFieldType0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance(dateTimeFieldType0, dateTimeFieldType0);
      DateTimeFieldType dateTimeFieldType1 = dateTimeComparator0.getUpperLimit();
      assertEquals("era", dateTimeFieldType1.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance();
      DateTimeFieldType dateTimeFieldType0 = dateTimeComparator0.getLowerLimit();
      assertNull(dateTimeFieldType0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance(dateTimeFieldType0, (DateTimeFieldType) null);
      assertNotNull(dateTimeComparator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance((DateTimeFieldType) null, (DateTimeFieldType) null);
      assertNotNull(dateTimeComparator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance();
      DateTimeFieldType dateTimeFieldType0 = dateTimeComparator0.getUpperLimit();
      assertNull(dateTimeFieldType0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getTimeOnlyInstance();
      String string0 = dateTimeComparator0.toString();
      assertEquals("DateTimeComparator[-dayOfYear]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance(dateTimeFieldType0, dateTimeFieldType0);
      String string0 = dateTimeComparator0.toString();
      assertEquals("DateTimeComparator[secondOfMinute]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance((DateTimeFieldType) null);
      String string0 = dateTimeComparator0.toString();
      assertEquals("DateTimeComparator[]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getDateOnlyInstance();
      String string0 = dateTimeComparator0.toString();
      assertEquals("DateTimeComparator[dayOfYear-]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance(dateTimeFieldType0, dateTimeFieldType0);
      dateTimeComparator0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance();
      dateTimeComparator0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance();
      DateTimeComparator dateTimeComparator1 = DateTimeComparator.getTimeOnlyInstance();
      boolean boolean0 = dateTimeComparator0.equals(dateTimeComparator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance(dateTimeFieldType0, dateTimeFieldType0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.weekOfWeekyear();
      DateTimeComparator dateTimeComparator1 = DateTimeComparator.getInstance(dateTimeFieldType0, dateTimeFieldType1);
      boolean boolean0 = dateTimeComparator0.equals(dateTimeComparator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance(dateTimeFieldType0, dateTimeFieldType0);
      DateTimeComparator dateTimeComparator1 = DateTimeComparator.getTimeOnlyInstance();
      boolean boolean0 = dateTimeComparator1.equals(dateTimeComparator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getDateOnlyInstance();
      boolean boolean0 = dateTimeComparator0.equals("A+k].UZ{");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance((DateTimeFieldType) null, dateTimeFieldType0);
      assertNotNull(dateTimeComparator0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getDateOnlyInstance();
      DateTimeFieldType dateTimeFieldType0 = dateTimeComparator0.getLowerLimit();
      DateTimeComparator dateTimeComparator1 = DateTimeComparator.getInstance(dateTimeFieldType0, dateTimeFieldType0);
      assertNotSame(dateTimeComparator1, dateTimeComparator0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance((DateTimeFieldType) null);
      int int0 = dateTimeComparator0.compare((Object) null, (Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance((DateTimeFieldType) null, dateTimeFieldType0);
      assertNotNull(dateTimeComparator0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeComparator dateTimeComparator1 = DateTimeComparator.getInstance(dateTimeFieldType0, dateTimeFieldType0);
      boolean boolean0 = dateTimeComparator1.equals(dateTimeComparator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getDateOnlyInstance();
      boolean boolean0 = dateTimeComparator0.equals(dateTimeComparator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeComparator dateTimeComparator0 = DateTimeComparator.getTimeOnlyInstance();
      // Undeclared exception!
      try { 
        dateTimeComparator0.compare((Object) null, "DateTimeComparator[-dayOfYear]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"DateTimeComparator[-dayOfYear]\"
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }
}
