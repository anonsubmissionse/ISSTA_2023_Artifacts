/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 03:59:30 GMT 2022
 */

package org.springside.modules.utils.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.utils.time.CachingDateFormatter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CachingDateFormatter_ESTest extends CachingDateFormatter_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CachingDateFormatter cachingDateFormatter0 = null;
      try {
        cachingDateFormatter0 = new CachingDateFormatter((FastDateFormat) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.time.CachingDateFormatter", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CachingDateFormatter cachingDateFormatter0 = null;
      try {
        cachingDateFormatter0 = new CachingDateFormatter("'`A)!ja");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Unterminated quote
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser$StrategyParser", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      CachingDateFormatter cachingDateFormatter0 = new CachingDateFormatter(fastDateFormat0);
      String string0 = cachingDateFormatter0.format(1);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      CachingDateFormatter cachingDateFormatter0 = new CachingDateFormatter(fastDateFormat0);
      String string0 = cachingDateFormatter0.format(1);
      String string1 = cachingDateFormatter0.format(1);
      assertNotNull(string1);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      CachingDateFormatter cachingDateFormatter0 = new CachingDateFormatter(fastDateFormat0);
      String string0 = cachingDateFormatter0.format(1);
      String string1 = cachingDateFormatter0.format(1);
      assertNotNull(string1);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CachingDateFormatter cachingDateFormatter0 = new CachingDateFormatter("SSS");
      String string0 = cachingDateFormatter0.format((-1514L));
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CachingDateFormatter cachingDateFormatter0 = new CachingDateFormatter("SSS");
      String string0 = cachingDateFormatter0.format((-1514L));
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CachingDateFormatter cachingDateFormatter0 = new CachingDateFormatter("");
      cachingDateFormatter0.format((-2923L));
      String string0 = cachingDateFormatter0.format(1L);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Locale locale0 = new Locale("SSS", "SSS", "");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("SSS", locale0);
      CachingDateFormatter cachingDateFormatter0 = new CachingDateFormatter(fastDateFormat0);
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CachingDateFormatter cachingDateFormatter0 = null;
      try {
        cachingDateFormatter0 = new CachingDateFormatter((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FormatCache", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CachingDateFormatter.CachedTime cachingDateFormatter_CachedTime0 = new CachingDateFormatter.CachedTime(795L, (String) null);
  }
}
