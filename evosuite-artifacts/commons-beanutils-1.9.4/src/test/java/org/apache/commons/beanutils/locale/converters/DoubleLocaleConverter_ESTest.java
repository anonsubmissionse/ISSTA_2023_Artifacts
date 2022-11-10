/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 18:32:39 GMT 2022
 */

package org.apache.commons.beanutils.locale.converters;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.util.Locale;
import org.apache.commons.beanutils.locale.converters.DoubleLocaleConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DoubleLocaleConverter_ESTest extends DoubleLocaleConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Long long0 = new Long(1656L);
      Locale locale0 = Locale.CANADA_FRENCH;
      DoubleLocaleConverter doubleLocaleConverter0 = new DoubleLocaleConverter(long0, locale0);
      // Undeclared exception!
      try { 
        doubleLocaleConverter0.parse((Object) null, "ti#P9#");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Double double0 = new Double(3993.9021);
      Locale locale0 = Locale.GERMAN;
      DoubleLocaleConverter doubleLocaleConverter0 = new DoubleLocaleConverter(double0, locale0);
      // Undeclared exception!
      try { 
        doubleLocaleConverter0.parse(locale0, "O3p`)");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Locale cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.beanutils.locale.converters.DecimalLocaleConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleLocaleConverter doubleLocaleConverter0 = new DoubleLocaleConverter("'SLQ", (Locale) null, "", true);
      try { 
        doubleLocaleConverter0.parse("", "");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable number: \"\"
         //
         verifyException("java.text.NumberFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      DoubleLocaleConverter doubleLocaleConverter0 = new DoubleLocaleConverter(object0, false);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      DoubleLocaleConverter doubleLocaleConverter0 = new DoubleLocaleConverter(locale0, "M", true);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Short short0 = new Short((short) (-1));
      Locale locale0 = Locale.ENGLISH;
      DoubleLocaleConverter doubleLocaleConverter0 = new DoubleLocaleConverter(short0, locale0, false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      DoubleLocaleConverter doubleLocaleConverter0 = new DoubleLocaleConverter(locale0, true);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleLocaleConverter doubleLocaleConverter0 = new DoubleLocaleConverter(false);
      // Undeclared exception!
      try { 
        doubleLocaleConverter0.parse((Object) null, "org.apache.commons.beanutils.locale.converters.DecimalLocaleConverter");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Multiple decimal separators in pattern \"org.apache.commons.beanutils.locale.converters.DecimalLocaleConverter\"
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      DoubleLocaleConverter doubleLocaleConverter0 = new DoubleLocaleConverter(locale0);
      Object object0 = doubleLocaleConverter0.parse("2j:?9i%d+MlobE", "");
      assertEquals(2.0, object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleLocaleConverter doubleLocaleConverter0 = new DoubleLocaleConverter();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      DoubleLocaleConverter doubleLocaleConverter0 = new DoubleLocaleConverter(locale0, locale0, "a.^YG");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      DoubleLocaleConverter doubleLocaleConverter0 = new DoubleLocaleConverter(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      DoubleLocaleConverter doubleLocaleConverter0 = new DoubleLocaleConverter(locale0, "orRapach.commons.beanutils.locale-converters.DobleLcaleConerter");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double double0 = new Double(3993.9021);
      Locale locale0 = Locale.GERMAN;
      DoubleLocaleConverter doubleLocaleConverter0 = new DoubleLocaleConverter(double0, locale0);
      Object object0 = doubleLocaleConverter0.parse(double0, "");
      assertEquals(3993.9021, object0);
  }
}
