/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:49:22 GMT 2022
 */

package org.apache.commons.validator.routines.checkdigit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.validator.routines.checkdigit.ISBNCheckDigit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ISBNCheckDigit_ESTest extends ISBNCheckDigit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = (ISBNCheckDigit)ISBNCheckDigit.ISBN_CHECK_DIGIT;
      boolean boolean0 = iSBNCheckDigit0.isValid("org.apache.commons.validator.routines.checkdigit.CUSIPCheckDigit");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = (ISBNCheckDigit)ISBNCheckDigit.ISBN_CHECK_DIGIT;
      boolean boolean0 = iSBNCheckDigit0.isValid("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = new ISBNCheckDigit();
      try { 
        iSBNCheckDigit0.calculate("org.apache.commons.validator.routines.checkdigit.ISBNCheckDigit");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid ISBN Length = 63
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ISBNCheckDigit", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = new ISBNCheckDigit();
      try { 
        iSBNCheckDigit0.calculate("d");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid ISBN Length = 1
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ISBNCheckDigit", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = new ISBNCheckDigit();
      try { 
        iSBNCheckDigit0.calculate("v|81ab^\u0003'bqf");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid Character[1] = 'v'
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = new ISBNCheckDigit();
      boolean boolean0 = iSBNCheckDigit0.isValid((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = new ISBNCheckDigit();
      boolean boolean0 = iSBNCheckDigit0.isValid("'G]f jg~2`");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = new ISBNCheckDigit();
      try { 
        iSBNCheckDigit0.calculate(".HA{]/-#R");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid Character[1] = '.'
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = new ISBNCheckDigit();
      try { 
        iSBNCheckDigit0.calculate("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ISBN Code is missing
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ISBNCheckDigit", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = new ISBNCheckDigit();
      try { 
        iSBNCheckDigit0.calculate((String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ISBN Code is missing
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ISBNCheckDigit", e);
      }
  }
}
