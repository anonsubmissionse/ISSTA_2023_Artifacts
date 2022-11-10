/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 18:33:51 GMT 2022
 */

package org.apache.commons.beanutils.locale.converters;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.beanutils.locale.converters.SqlTimeLocaleConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SqlTimeLocaleConverter_ESTest extends SqlTimeLocaleConverter_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = new Locale("", "l0`_>|9PFPEI", ") cC[|j&)B_S/AO<iZb");
      SqlTimeLocaleConverter sqlTimeLocaleConverter0 = new SqlTimeLocaleConverter(object0, locale0, "", false);
      assertFalse(sqlTimeLocaleConverter0.isLenient());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = new Locale("");
      SqlTimeLocaleConverter sqlTimeLocaleConverter0 = new SqlTimeLocaleConverter(object0, locale0, true);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SqlTimeLocaleConverter sqlTimeLocaleConverter0 = new SqlTimeLocaleConverter((Object) null, false);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      SqlTimeLocaleConverter sqlTimeLocaleConverter0 = new SqlTimeLocaleConverter(locale0, "Error parsing date '", true);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      SqlTimeLocaleConverter sqlTimeLocaleConverter0 = new SqlTimeLocaleConverter(locale0, false);
      // Undeclared exception!
      try { 
        sqlTimeLocaleConverter0.parse(locale0, "org.apache.commons.beanutils.locale.converters.SqlTimeLocaleConverter");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'o'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      SqlTimeLocaleConverter sqlTimeLocaleConverter0 = new SqlTimeLocaleConverter(locale0, (String) null);
      assertFalse(sqlTimeLocaleConverter0.isLenient());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      SqlTimeLocaleConverter sqlTimeLocaleConverter0 = new SqlTimeLocaleConverter("'", locale0);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      SqlTimeLocaleConverter sqlTimeLocaleConverter0 = new SqlTimeLocaleConverter("Unsupported target type: ", locale0, "");
      // Undeclared exception!
      try { 
        sqlTimeLocaleConverter0.parse("Unsupported target type: ", "");
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Date 'Unsupported target type: ' contains unparsed characters from position=0
         //
         verifyException("org.apache.commons.beanutils.locale.converters.DateLocaleConverter", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SqlTimeLocaleConverter sqlTimeLocaleConverter0 = new SqlTimeLocaleConverter();
      assertTrue(sqlTimeLocaleConverter0.isLenient());
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      SqlTimeLocaleConverter sqlTimeLocaleConverter0 = new SqlTimeLocaleConverter(locale0);
      // Undeclared exception!
      try { 
        sqlTimeLocaleConverter0.parse((Object) null, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SqlTimeLocaleConverter sqlTimeLocaleConverter0 = new SqlTimeLocaleConverter(false);
      MockDate mockDate0 = new MockDate((-2768), (-2768), (-2891), (-2891), 3285);
      Object object0 = sqlTimeLocaleConverter0.parse(mockDate0, "(~V_");
      assertNotNull(object0.toString());
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      SqlTimeLocaleConverter sqlTimeLocaleConverter0 = new SqlTimeLocaleConverter(object0);
      ;
}
}
