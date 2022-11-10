/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 18:34:04 GMT 2022
 */

package org.apache.commons.beanutils.locale.converters;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Timestamp;
import java.util.Locale;
import org.apache.commons.beanutils.locale.converters.SqlTimestampLocaleConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SqlTimestampLocaleConverter_ESTest extends SqlTimestampLocaleConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = new Locale("", "");
      SqlTimestampLocaleConverter sqlTimestampLocaleConverter0 = new SqlTimestampLocaleConverter(locale0, "k");
      MockDate mockDate0 = new MockDate();
      Timestamp timestamp0 = (Timestamp)sqlTimestampLocaleConverter0.parse(mockDate0, "");
      assertEquals(320000000, timestamp0.getNanos());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SqlTimestampLocaleConverter sqlTimestampLocaleConverter0 = new SqlTimestampLocaleConverter(true);
      assertFalse(sqlTimestampLocaleConverter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      SqlTimestampLocaleConverter sqlTimestampLocaleConverter0 = new SqlTimestampLocaleConverter(locale0, "");
      // Undeclared exception!
      try { 
        sqlTimestampLocaleConverter0.parse(locale0, "' for ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated quote
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SqlTimestampLocaleConverter sqlTimestampLocaleConverter0 = new SqlTimestampLocaleConverter((Locale) null, true);
      assertFalse(sqlTimestampLocaleConverter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.UK;
      SqlTimestampLocaleConverter sqlTimestampLocaleConverter0 = new SqlTimestampLocaleConverter(locale0, "CQX$>cw;", false);
      // Undeclared exception!
      try { 
        sqlTimestampLocaleConverter0.parse((Object) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.CANADA_FRENCH;
      SqlTimestampLocaleConverter sqlTimestampLocaleConverter0 = new SqlTimestampLocaleConverter(object0, locale0, false);
      assertFalse(sqlTimestampLocaleConverter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      SqlTimestampLocaleConverter sqlTimestampLocaleConverter0 = new SqlTimestampLocaleConverter("", locale0, "egCa$.D.=&ieGz]", false);
      assertFalse(sqlTimestampLocaleConverter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      SqlTimestampLocaleConverter sqlTimestampLocaleConverter0 = new SqlTimestampLocaleConverter(locale0, locale0);
      assertFalse(sqlTimestampLocaleConverter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SqlTimestampLocaleConverter sqlTimestampLocaleConverter0 = new SqlTimestampLocaleConverter((Locale) null);
      assertFalse(sqlTimestampLocaleConverter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      SqlTimestampLocaleConverter sqlTimestampLocaleConverter0 = new SqlTimestampLocaleConverter(object0);
      assertFalse(sqlTimestampLocaleConverter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = new Locale("");
      SqlTimestampLocaleConverter sqlTimestampLocaleConverter0 = new SqlTimestampLocaleConverter(object0, locale0, "");
      assertFalse(sqlTimestampLocaleConverter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SqlTimestampLocaleConverter sqlTimestampLocaleConverter0 = new SqlTimestampLocaleConverter();
      assertFalse(sqlTimestampLocaleConverter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      SqlTimestampLocaleConverter sqlTimestampLocaleConverter0 = new SqlTimestampLocaleConverter(object0, false);
      // Undeclared exception!
      try { 
        sqlTimestampLocaleConverter0.parse(object0, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error parsing date 'java.lang.Object@2728e46c' at position=0
         //
         verifyException("org.apache.commons.beanutils.locale.converters.DateLocaleConverter", e);
      }
  }
}
