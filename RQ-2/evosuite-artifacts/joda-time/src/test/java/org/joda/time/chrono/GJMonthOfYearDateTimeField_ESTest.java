/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:32:57 GMT 2022
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BasicChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GJMonthOfYearDateTimeField_ESTest extends GJMonthOfYearDateTimeField_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      String string0 = gJMonthOfYearDateTimeField0.getAsText(0, locale0);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      String string0 = gJMonthOfYearDateTimeField0.getAsShortText(0, locale0);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null, 2);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.getAsText((-2711), locale0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2711
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.getAsShortText(1631, locale0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1631
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.convertText("q<", locale0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Value \"q<\" for monthOfYear is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.convertText((String) null, locale0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = null;
      try {
        gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField((BasicChronology) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      Locale locale0 = Locale.FRANCE;
      int int0 = gJMonthOfYearDateTimeField0.convertText("janvier", locale0);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      Locale locale0 = Locale.FRANCE;
      String string0 = gJMonthOfYearDateTimeField0.getAsText(1, locale0);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      Locale locale0 = Locale.FRANCE;
      String string0 = gJMonthOfYearDateTimeField0.getAsText(1, locale0);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      Locale locale0 = Locale.FRANCE;
      int int0 = gJMonthOfYearDateTimeField0.getMaximumTextLength(locale0);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      Locale locale0 = Locale.FRANCE;
      String string0 = gJMonthOfYearDateTimeField0.getAsShortText(1, locale0);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      Locale locale0 = Locale.FRANCE;
      String string0 = gJMonthOfYearDateTimeField0.getAsShortText(1, locale0);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      Locale locale0 = Locale.CHINA;
      int int0 = gJMonthOfYearDateTimeField0.getMaximumShortTextLength(locale0);
      assertEquals(1, int0);
}
}
