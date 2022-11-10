/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:48:13 GMT 2022
 */

package org.apache.commons.validator.routines;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.validator.routines.ISBNValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ISBNValidator_ESTest extends ISBNValidator_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISBNValidator iSBNValidator0 = ISBNValidator.getInstance();
      // Undeclared exception!
      try { 
        iSBNValidator0.convertToISBN13(" for '");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Invalid length 5 for 'for ''
         //
         verifyException("org.apache.commons.validator.routines.ISBNValidator", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ISBNValidator iSBNValidator0 = ISBNValidator.getInstance();
      String string0 = iSBNValidator0.validate("^(?:(d{9}[0-9X])|(?:(d{1,5})(?:-|s)(d{1,7})(?:-|s)(d{1,6})(?:-|s)([0-9X])))$");
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ISBNValidator iSBNValidator0 = new ISBNValidator();
      // Undeclared exception!
      try { 
        iSBNValidator0.convertToISBN13("iBAifqI8*E");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Check digit error for 'iBAifqI8*E' - Invalid Character[4] = 'i'
         //
         verifyException("org.apache.commons.validator.routines.ISBNValidator", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ISBNValidator iSBNValidator0 = ISBNValidator.getInstance(true);
      String string0 = iSBNValidator0.validateISBN13((String) null);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ISBNValidator iSBNValidator0 = ISBNValidator.getInstance(true);
      String string0 = iSBNValidator0.validateISBN10((String) null);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ISBNValidator iSBNValidator0 = ISBNValidator.getInstance();
      boolean boolean0 = iSBNValidator0.isValidISBN13("}");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ISBNValidator iSBNValidator0 = new ISBNValidator(true);
      // Undeclared exception!
      try { 
        iSBNValidator0.convertToISBN13("CiF2f(w+`m ");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Check digit error for 'CiF2f(w+`m' - Invalid Character[4] = 'C'
         //
         verifyException("org.apache.commons.validator.routines.ISBNValidator", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ISBNValidator iSBNValidator0 = ISBNValidator.getInstance(true);
      String string0 = iSBNValidator0.convertToISBN13((String) null);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ISBNValidator iSBNValidator0 = ISBNValidator.getInstance(true);
      // Undeclared exception!
      try { 
        iSBNValidator0.convertToISBN13("@=Ip[egPN95uh");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Invalid length 14 for '@=Ip[egPN95uh'
         //
         verifyException("org.apache.commons.validator.routines.ISBNValidator", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ISBNValidator iSBNValidator0 = ISBNValidator.getInstance(false);
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISBNValidator iSBNValidator0 = ISBNValidator.getInstance(true);
      boolean boolean0 = iSBNValidator0.isValid((String) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISBNValidator iSBNValidator0 = ISBNValidator.getInstance();
      boolean boolean0 = iSBNValidator0.isValidISBN10("xR");
      assertTrue(boolean0);
}
}
