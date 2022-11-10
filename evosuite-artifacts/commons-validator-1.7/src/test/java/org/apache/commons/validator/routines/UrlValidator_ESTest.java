/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:38:47 GMT 2022
 */

package org.apache.commons.validator.routines;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.validator.routines.DomainValidator;
import org.apache.commons.validator.routines.RegexValidator;
import org.apache.commons.validator.routines.UrlValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UrlValidator_ESTest extends UrlValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UrlValidator urlValidator0 = UrlValidator.getInstance();
      boolean boolean0 = urlValidator0.isValid("//");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("group", true);
      DomainValidator domainValidator0 = DomainValidator.getInstance(false);
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, regexValidator0, 0L, domainValidator0);
      boolean boolean0 = urlValidator0.isValidQuery("group");
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "},_k%8 FEqW$!8l+";
      stringArray0[1] = "fL$oT0p";
      stringArray0[2] = "@'znW!+a";
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, (RegexValidator) null, 1782L);
      boolean boolean0 = urlValidator0.isValidFragment("@'znW!+a");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("group", true);
      DomainValidator domainValidator0 = DomainValidator.getInstance(false);
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, regexValidator0, 0L, domainValidator0);
      int int0 = urlValidator0.countToken("Hl$", "8)XnflZ<C*{E_A1r4#");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "d^.ni `P";
      stringArray0[1] = "vg";
      stringArray0[2] = "me";
      stringArray0[3] = "";
      stringArray0[4] = "Hq5?d`8^B";
      stringArray0[5] = "gTHg.'";
      stringArray0[6] = "";
      RegexValidator regexValidator0 = new RegexValidator("Hq5?d`8^B");
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, regexValidator0, 0L);
      // Undeclared exception!
      try { 
        urlValidator0.countToken("::FFFF:(?:d{1,3}.){3}d{1,3}|[0-9a-fA-F:]+", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[5];
      RegexValidator regexValidator0 = new RegexValidator("H70nT", true);
      UrlValidator urlValidator0 = null;
      try {
        urlValidator0 = new UrlValidator(stringArray0, regexValidator0, 272L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.UrlValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[9];
      UrlValidator urlValidator0 = null;
      try {
        urlValidator0 = new UrlValidator(stringArray0, (-2090L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.UrlValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[5];
      UrlValidator urlValidator0 = null;
      try {
        urlValidator0 = new UrlValidator(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.UrlValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[4];
      RegexValidator regexValidator0 = new RegexValidator("f;#k*CI GXx*Z0BO%;]");
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      UrlValidator urlValidator0 = null;
      try {
        urlValidator0 = new UrlValidator(stringArray0, regexValidator0, 0L, domainValidator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.UrlValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "b7=h;uaV>";
      stringArray0[1] = "/..";
      stringArray0[2] = "xS4p,^";
      stringArray0[3] = "hgtv";
      RegexValidator regexValidator0 = new RegexValidator(stringArray0);
      DomainValidator domainValidator0 = DomainValidator.getInstance(false);
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, regexValidator0, 1L, domainValidator0);
      assertEquals(4L, UrlValidator.NO_FRAGMENTS);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[0];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, (-1980L));
      assertEquals(8L, UrlValidator.ALLOW_LOCAL_URLS);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator();
      int int0 = urlValidator0.countToken("e/", "e/");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UrlValidator urlValidator0 = UrlValidator.getInstance();
      boolean boolean0 = urlValidator0.isValidFragment((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "d^.ni `P";
      stringArray0[1] = "vg";
      stringArray0[2] = "me";
      stringArray0[3] = "";
      stringArray0[4] = "Hq5?d`8^B";
      stringArray0[5] = "gTHg.'";
      stringArray0[6] = "";
      RegexValidator regexValidator0 = new RegexValidator("Hq5?d`8^B");
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, regexValidator0, 0L);
      boolean boolean0 = urlValidator0.isValidFragment("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "d^.ni `P";
      stringArray0[1] = "vg";
      stringArray0[2] = "me";
      stringArray0[3] = "";
      stringArray0[4] = "Hq5?d`8^B";
      stringArray0[5] = "gTHg.'";
      stringArray0[6] = "";
      RegexValidator regexValidator0 = new RegexValidator("Hq5?d`8^B");
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, regexValidator0, 0L);
      boolean boolean0 = urlValidator0.isValidQuery((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((-1417L));
      boolean boolean0 = urlValidator0.isValidPath("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator();
      boolean boolean0 = urlValidator0.isValidPath((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("group", true);
      DomainValidator domainValidator0 = DomainValidator.getInstance(false);
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, regexValidator0, 0L, domainValidator0);
      boolean boolean0 = urlValidator0.isValidPath("xn8as63slxuz");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator();
      // Undeclared exception!
      try { 
        urlValidator0.isValidAuthority("?:");
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("/../");
      UrlValidator urlValidator0 = new UrlValidator(regexValidator0, 379L);
      boolean boolean0 = urlValidator0.isValidAuthority("/../");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator();
      boolean boolean0 = urlValidator0.isValidAuthority("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("/../");
      UrlValidator urlValidator0 = new UrlValidator(regexValidator0, 379L);
      boolean boolean0 = urlValidator0.isValidAuthority(";:E@acw%.a");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "H;V";
      stringArray0[1] = "H;V";
      stringArray0[2] = "stdio";
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      boolean boolean0 = urlValidator0.isValidScheme("l");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "H;V";
      stringArray0[1] = "H;V";
      stringArray0[2] = "stdio";
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      boolean boolean0 = urlValidator0.isValidScheme("stdio");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("/../");
      UrlValidator urlValidator0 = new UrlValidator(regexValidator0, 379L);
      boolean boolean0 = urlValidator0.isValidScheme("/../");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("group", true);
      DomainValidator domainValidator0 = DomainValidator.getInstance(false);
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, regexValidator0, 0L, domainValidator0);
      boolean boolean0 = urlValidator0.isValid("group");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("I");
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      UrlValidator urlValidator0 = null;
      try {
        urlValidator0 = new UrlValidator((String[]) null, regexValidator0, (-1442L), domainValidator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DomainValidator disagrees with ALLOW_LOCAL_URLS setting
         //
         verifyException("org.apache.commons.validator.routines.UrlValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("4xKAO", false);
      UrlValidator urlValidator0 = null;
      try {
        urlValidator0 = new UrlValidator((String[]) null, regexValidator0, (-23L), (DomainValidator) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DomainValidator must not be null
         //
         verifyException("org.apache.commons.validator.routines.UrlValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator();
      boolean boolean0 = urlValidator0.isValid((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("/../");
      UrlValidator urlValidator0 = new UrlValidator(regexValidator0, 379L);
      boolean boolean0 = urlValidator0.isValid("cdfW:Wh");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UrlValidator urlValidator0 = UrlValidator.getInstance();
      boolean boolean0 = urlValidator0.isValidPath("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[0];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      // Undeclared exception!
      urlValidator0.countToken("", "ftp");
  }
}
