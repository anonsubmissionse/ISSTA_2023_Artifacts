/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:35:32 GMT 2022
 */

package org.apache.commons.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.validator.UrlValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UrlValidator_ESTest extends UrlValidator_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(4518);
      int int0 = urlValidator0.countToken(" F?oT8E{ZiuZ,l/k", "b(yS`b");
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[8];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, (-1943));
      // Undeclared exception!
      urlValidator0.countToken("", "org.apache.commons.validator.routines.RegexValidator");
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[8];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      // Undeclared exception!
      try { 
        urlValidator0.countToken((String) null, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[0];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, (-2762));
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(5);
      int int0 = urlValidator0.countToken("vUZu_VMb015vTw9=WV+3", "vUZu_VMb015vTw9=WV+3");
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(5);
      boolean boolean0 = urlValidator0.isValidFragment((String) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(5);
      boolean boolean0 = urlValidator0.isValidFragment("");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[3];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      boolean boolean0 = urlValidator0.isValidQuery(stringArray0[0]);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[3];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      boolean boolean0 = urlValidator0.isValidQuery(".");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((-1622));
      boolean boolean0 = urlValidator0.isValidPath("");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[3];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      boolean boolean0 = urlValidator0.isValidPath(".");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(5);
      boolean boolean0 = urlValidator0.isValidPath((String) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(5);
      boolean boolean0 = urlValidator0.isValidPath("");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[3];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      boolean boolean0 = urlValidator0.isValidAuthority(stringArray0[1]);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(5);
      boolean boolean0 = urlValidator0.isValidScheme("I32i");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(5);
      boolean boolean0 = urlValidator0.isValidScheme((String) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[3];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      boolean boolean0 = urlValidator0.isValidScheme("or.apache.cojmonsvalidator.routines.InetAddrnssValidator");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(5);
      boolean boolean0 = urlValidator0.isValid("");
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator();
      boolean boolean0 = urlValidator0.isValidScheme("http");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((-1622));
      boolean boolean0 = urlValidator0.isValidScheme("");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[3];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      boolean boolean0 = urlValidator0.isValid(stringArray0[1]);
      ;
}
}
