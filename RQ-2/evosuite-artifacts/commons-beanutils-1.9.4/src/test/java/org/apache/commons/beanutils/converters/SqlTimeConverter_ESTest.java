/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 18:32:20 GMT 2022
 */

package org.apache.commons.beanutils.converters;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.beanutils.converters.SqlTimeConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SqlTimeConverter_ESTest extends SqlTimeConverter_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SqlTimeConverter sqlTimeConverter0 = new SqlTimeConverter((Object) null);
      Class<?> class0 = sqlTimeConverter0.getDefaultType();
      assertTrue(class0.isInterface());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SqlTimeConverter sqlTimeConverter0 = new SqlTimeConverter((Object) null);
      SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)sqlTimeConverter0.getFormat((Locale) null, (TimeZone) null);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SqlTimeConverter sqlTimeConverter0 = new SqlTimeConverter();
      Locale locale0 = Locale.CHINA;
      TimeZone timeZone0 = TimeZone.getDefault();
      SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)sqlTimeConverter0.getFormat(locale0, timeZone0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object object0 = new Object();
      SqlTimeConverter sqlTimeConverter0 = null;
      try {
        sqlTimeConverter0 = new SqlTimeConverter(object0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // String must be in JDBC format [HH:mm:ss] to create a java.sql.Time
         //
         verifyException("org.apache.commons.beanutils.converters.DateTimeConverter", e);
      }
  }
}
