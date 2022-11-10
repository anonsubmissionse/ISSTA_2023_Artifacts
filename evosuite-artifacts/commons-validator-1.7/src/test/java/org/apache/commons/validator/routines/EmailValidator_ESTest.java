/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:45:45 GMT 2022
 */

package org.apache.commons.validator.routines;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.validator.routines.DomainValidator;
import org.apache.commons.validator.routines.EmailValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmailValidator_ESTest extends EmailValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator(false, false);
      boolean boolean0 = emailValidator0.isValidUser("(((\\.)|[^sp{Cntrl}()<>@,;:'\\\".[]]|')+|(\"(\\\"|[^\"])*\"))");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator(false, false);
      boolean boolean0 = emailValidator0.isValidUser("beats");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator(true, false);
      // Undeclared exception!
      try { 
        emailValidator0.isValidDomain((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance(false, false);
      assertNotNull(emailValidator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance(true, false);
      assertNotNull(emailValidator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator(true);
      boolean boolean0 = emailValidator0.isValidUser("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance(true, true);
      boolean boolean0 = emailValidator0.isValidUser((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance(false, true);
      boolean boolean0 = emailValidator0.isValidDomain("N9=}.rXY");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance(false, true);
      boolean boolean0 = emailValidator0.isValidDomain(".");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance(false, true);
      boolean boolean0 = emailValidator0.isValidDomain("dance");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator(true, false);
      // Undeclared exception!
      try { 
        emailValidator0.isValidDomain("[]");
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
  public void test11()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      EmailValidator emailValidator0 = new EmailValidator(false, false, domainValidator0);
      // Undeclared exception!
      try { 
        emailValidator0.isValid("7<\"i(?R@/P~xU=(2E,xE");
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
  public void test12()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      EmailValidator emailValidator0 = null;
      try {
        emailValidator0 = new EmailValidator(true, true, domainValidator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DomainValidator must agree with allowLocal setting
         //
         verifyException("org.apache.commons.validator.routines.EmailValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EmailValidator emailValidator0 = null;
      try {
        emailValidator0 = new EmailValidator(false, false, (DomainValidator) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DomainValidator cannot be null
         //
         verifyException("org.apache.commons.validator.routines.EmailValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      EmailValidator emailValidator0 = new EmailValidator(false, false, domainValidator0);
      boolean boolean0 = emailValidator0.isValid("8KG]/");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance(false);
      assertNotNull(emailValidator0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance(true, true);
      boolean boolean0 = emailValidator0.isValidDomain("Lo");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance(false, true);
      boolean boolean0 = emailValidator0.isValid((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance(true);
      boolean boolean0 = emailValidator0.isValidUser("^(((\\.)|[^sp{Cntrl}()<>@,;:'\\\\.\\]|')+|(\"(\\\"|[^\"])*\"))(.(((\\.)|[^sp{Cntrl}()<>@,;:'\\\"\\[]]|')+|(\"(\\\"|[^\"])*\")))*$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance();
      String string0 = "V\\\\.)|[^\\s\\p{kntl}\\(\\)<>@,;:\\%\\u\\.\\[\\]..";
      boolean boolean0 = emailValidator0.isValid(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator(true);
      boolean boolean0 = emailValidator0.isValidDomain("");
      assertFalse(boolean0);
  }
}
