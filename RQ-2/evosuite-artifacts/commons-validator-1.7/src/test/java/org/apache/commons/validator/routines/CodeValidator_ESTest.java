/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:46:44 GMT 2022
 */

package org.apache.commons.validator.routines;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.regex.PatternSyntaxException;
import org.apache.commons.validator.routines.CodeValidator;
import org.apache.commons.validator.routines.RegexValidator;
import org.apache.commons.validator.routines.checkdigit.ABANumberCheckDigit;
import org.apache.commons.validator.routines.checkdigit.CUSIPCheckDigit;
import org.apache.commons.validator.routines.checkdigit.CheckDigit;
import org.apache.commons.validator.routines.checkdigit.EAN13CheckDigit;
import org.apache.commons.validator.routines.checkdigit.ISBNCheckDigit;
import org.apache.commons.validator.routines.checkdigit.ModulusTenCheckDigit;
import org.apache.commons.validator.routines.checkdigit.SedolCheckDigit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodeValidator_ESTest extends CodeValidator_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = (ISBNCheckDigit)ISBNCheckDigit.ISBN_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator("org.apache.commons.validator.routines.CodeValidator", iSBNCheckDigit0);
      Object object0 = codeValidator0.validate("org.apache.commons.validator.routines.CodeValidator");
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = (ISBNCheckDigit)ISBNCheckDigit.ISBN_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator("org.apache.commons.validator.routines.CodeValidator", iSBNCheckDigit0);
      Object object0 = codeValidator0.validate("org.apache.commons.validator.routines.CodeValidator");
      assertNotNull(object0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = (ISBNCheckDigit)ISBNCheckDigit.ISBN_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator("org.apache.commons.validator.routines.CodeValidator", iSBNCheckDigit0);
      Object object0 = codeValidator0.validate("org.apache.commons.validator.routines.CodeValidator");
      assertEquals(0, codeValidator0.getMinLength());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("org.apache.commons.validator.routines.checkdigit.ISBNCheckDigit");
      ABANumberCheckDigit aBANumberCheckDigit0 = new ABANumberCheckDigit();
      CodeValidator codeValidator0 = new CodeValidator(regexValidator0, aBANumberCheckDigit0);
      boolean boolean0 = codeValidator0.isValid("' out of range 0 to ");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("org.apache.commons.validator.routines.checkdigit.ISBNCheckDigit");
      ABANumberCheckDigit aBANumberCheckDigit0 = new ABANumberCheckDigit();
      CodeValidator codeValidator0 = new CodeValidator(regexValidator0, aBANumberCheckDigit0);
      boolean boolean0 = codeValidator0.isValid("' out of range 0 to ");
      assertEquals(0, codeValidator0.getMaxLength());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("org.apache.commons.validator.routines.checkdigit.ISBNCheckDigit");
      ABANumberCheckDigit aBANumberCheckDigit0 = new ABANumberCheckDigit();
      CodeValidator codeValidator0 = new CodeValidator(regexValidator0, aBANumberCheckDigit0);
      boolean boolean0 = codeValidator0.isValid("' out of range 0 to ");
      assertEquals(1, codeValidator0.getMinLength());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("53Lk+a-,}Ir", (CheckDigit) null);
      RegexValidator regexValidator0 = codeValidator0.getRegexValidator();
      assertNotNull(regexValidator0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("53Lk+a-,}Ir", (CheckDigit) null);
      RegexValidator regexValidator0 = codeValidator0.getRegexValidator();
      assertEquals(1, codeValidator0.getMaxLength());
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("53Lk+a-,}Ir", (CheckDigit) null);
      RegexValidator regexValidator0 = codeValidator0.getRegexValidator();
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = new ISBNCheckDigit();
      CodeValidator codeValidator0 = new CodeValidator((String) null, iSBNCheckDigit0);
      int int0 = codeValidator0.getMinLength();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = new ISBNCheckDigit();
      CodeValidator codeValidator0 = new CodeValidator((String) null, iSBNCheckDigit0);
      int int0 = codeValidator0.getMinLength();
      assertEquals(0, codeValidator0.getMaxLength());
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("", (CheckDigit) null);
      int int0 = codeValidator0.getMaxLength();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("", (CheckDigit) null);
      int int0 = codeValidator0.getMaxLength();
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("", (CheckDigit) null);
      codeValidator0.getCheckDigit();
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("", (CheckDigit) null);
      codeValidator0.getCheckDigit();
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[0];
      ModulusTenCheckDigit modulusTenCheckDigit0 = new ModulusTenCheckDigit(intArray0, true);
      CodeValidator codeValidator0 = new CodeValidator("", (-1), (-1114), modulusTenCheckDigit0);
      // Undeclared exception!
      try { 
        codeValidator0.validate("00");
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusTenCheckDigit", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[0];
      ModulusTenCheckDigit modulusTenCheckDigit0 = new ModulusTenCheckDigit(intArray0);
      CodeValidator codeValidator0 = new CodeValidator((String) null, (-3913), 7, modulusTenCheckDigit0);
      // Undeclared exception!
      try { 
        codeValidator0.isValid("CfC8");
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusTenCheckDigit", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SedolCheckDigit sedolCheckDigit0 = (SedolCheckDigit)SedolCheckDigit.SEDOL_CHECK_DIGIT;
      CodeValidator codeValidator0 = null;
      try {
        codeValidator0 = new CodeValidator("`{aVCv", sedolCheckDigit0);
        fail("Expecting exception: PatternSyntaxException");
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 0
         // `{aVCv
         // ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ISBNCheckDigit iSBNCheckDigit0 = (ISBNCheckDigit)ISBNCheckDigit.ISBN_CHECK_DIGIT;
      CodeValidator codeValidator0 = null;
      try {
        codeValidator0 = new CodeValidator("qBq?}ju|4{e", 35, iSBNCheckDigit0);
        fail("Expecting exception: PatternSyntaxException");
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 8
         // qBq?}ju|4{e
         //         ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SedolCheckDigit sedolCheckDigit0 = (SedolCheckDigit)SedolCheckDigit.SEDOL_CHECK_DIGIT;
      CodeValidator codeValidator0 = null;
      try {
        codeValidator0 = new CodeValidator("^y@J'j>0Gw0{", (-1), (-1), sedolCheckDigit0);
        fail("Expecting exception: PatternSyntaxException");
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 10
         // ^y@J'j>0Gw0{
         //           ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("", (CheckDigit) null);
      Object object0 = codeValidator0.validate("T1c5T");
      assertEquals(0, codeValidator0.getMaxLength());
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("", (CheckDigit) null);
      Object object0 = codeValidator0.validate("T1c5T");
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("", (CheckDigit) null);
      Object object0 = codeValidator0.validate("T1c5T");
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CUSIPCheckDigit cUSIPCheckDigit0 = (CUSIPCheckDigit)CUSIPCheckDigit.CUSIP_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator("", (-383), 2124, cUSIPCheckDigit0);
      Object object0 = codeValidator0.validate("org.apache.commons.validator.routines.CodeValidator");
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CUSIPCheckDigit cUSIPCheckDigit0 = (CUSIPCheckDigit)CUSIPCheckDigit.CUSIP_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator("", (-383), 2124, cUSIPCheckDigit0);
      Object object0 = codeValidator0.validate("org.apache.commons.validator.routines.CodeValidator");
      assertNotNull(object0);
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CUSIPCheckDigit cUSIPCheckDigit0 = (CUSIPCheckDigit)CUSIPCheckDigit.CUSIP_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator("", (-383), 2124, cUSIPCheckDigit0);
      Object object0 = codeValidator0.validate("org.apache.commons.validator.routines.CodeValidator");
      assertEquals(1, codeValidator0.getMinLength());
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("org.apache.commons.validator.routines.CodeValidator", 6, 6, (CheckDigit) null);
      Object object0 = codeValidator0.validate("org.apache.commons.validator.routines.CodeValidator");
      ;
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("org.apache.commons.validator.routines.CodeValidator", 6, 6, (CheckDigit) null);
      Object object0 = codeValidator0.validate("org.apache.commons.validator.routines.CodeValidator");
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("org.apache.commons.validator.routines.CodeValidator", 6, 6, (CheckDigit) null);
      Object object0 = codeValidator0.validate("org.apache.commons.validator.routines.CodeValidator");
      ;
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EAN13CheckDigit eAN13CheckDigit0 = (EAN13CheckDigit)ISBNCheckDigit.ISBN13_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator("", eAN13CheckDigit0);
      codeValidator0.validate((String) null);
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EAN13CheckDigit eAN13CheckDigit0 = (EAN13CheckDigit)ISBNCheckDigit.ISBN13_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator("", eAN13CheckDigit0);
      codeValidator0.validate((String) null);
      ;
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("", 1, 1, (CheckDigit) null);
      int int0 = codeValidator0.getMaxLength();
      assertEquals(1, codeValidator0.getMinLength());
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("", 1, 1, (CheckDigit) null);
      int int0 = codeValidator0.getMaxLength();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("nt");
      ABANumberCheckDigit aBANumberCheckDigit0 = (ABANumberCheckDigit)ABANumberCheckDigit.ABAN_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator(regexValidator0, 696, 0, aBANumberCheckDigit0);
      int int0 = codeValidator0.getMinLength();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("nt");
      ABANumberCheckDigit aBANumberCheckDigit0 = (ABANumberCheckDigit)ABANumberCheckDigit.ABAN_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator(regexValidator0, 696, 0, aBANumberCheckDigit0);
      int int0 = codeValidator0.getMinLength();
      ;
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SedolCheckDigit sedolCheckDigit0 = new SedolCheckDigit();
      CodeValidator codeValidator0 = new CodeValidator((RegexValidator) null, (-2704), sedolCheckDigit0);
      Object object0 = codeValidator0.validate("vN0");
      assertNotNull(object0);
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SedolCheckDigit sedolCheckDigit0 = new SedolCheckDigit();
      CodeValidator codeValidator0 = new CodeValidator((RegexValidator) null, (-2704), sedolCheckDigit0);
      Object object0 = codeValidator0.validate("vN0");
      ;
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SedolCheckDigit sedolCheckDigit0 = new SedolCheckDigit();
      CodeValidator codeValidator0 = new CodeValidator((RegexValidator) null, (-2704), sedolCheckDigit0);
      Object object0 = codeValidator0.validate("vN0");
      ;
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EAN13CheckDigit eAN13CheckDigit0 = (EAN13CheckDigit)EAN13CheckDigit.EAN13_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator((RegexValidator) null, 0, eAN13CheckDigit0);
      codeValidator0.validate("[postitionWeight=");
      ;
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EAN13CheckDigit eAN13CheckDigit0 = (EAN13CheckDigit)EAN13CheckDigit.EAN13_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator((RegexValidator) null, 0, eAN13CheckDigit0);
      codeValidator0.validate("[postitionWeight=");
      ;
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("M", 0, 0, (CheckDigit) null);
      codeValidator0.validate("org.apache.commons.validator.routines.che+kdigit.EAN13CheckDigit");
      ;
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("M", 0, 0, (CheckDigit) null);
      codeValidator0.validate("org.apache.commons.validator.routines.che+kdigit.EAN13CheckDigit");
      ;
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("M", 0, 0, (CheckDigit) null);
      boolean boolean0 = codeValidator0.isValid("M");
      assertEquals(0, codeValidator0.getMaxLength());
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("M", 0, 0, (CheckDigit) null);
      boolean boolean0 = codeValidator0.isValid("M");
      ;
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("M", 0, 0, (CheckDigit) null);
      boolean boolean0 = codeValidator0.isValid("M");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("", (CheckDigit) null);
      Object object0 = codeValidator0.validate("");
      ;
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("", (CheckDigit) null);
      Object object0 = codeValidator0.validate("");
      assertEquals(0, codeValidator0.getMinLength());
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("", (CheckDigit) null);
      Object object0 = codeValidator0.validate("");
      assertEquals(0, codeValidator0.getMaxLength());
}
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EAN13CheckDigit eAN13CheckDigit0 = (EAN13CheckDigit)EAN13CheckDigit.EAN13_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator((RegexValidator) null, 0, eAN13CheckDigit0);
      int int0 = codeValidator0.getMinLength();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      EAN13CheckDigit eAN13CheckDigit0 = (EAN13CheckDigit)EAN13CheckDigit.EAN13_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator((RegexValidator) null, 0, eAN13CheckDigit0);
      int int0 = codeValidator0.getMinLength();
      assertEquals(0, codeValidator0.getMaxLength());
}
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      EAN13CheckDigit eAN13CheckDigit0 = (EAN13CheckDigit)EAN13CheckDigit.EAN13_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator((RegexValidator) null, 0, eAN13CheckDigit0);
      codeValidator0.getRegexValidator();
      assertEquals(0, codeValidator0.getMaxLength());
}
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EAN13CheckDigit eAN13CheckDigit0 = (EAN13CheckDigit)EAN13CheckDigit.EAN13_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator((RegexValidator) null, 0, eAN13CheckDigit0);
      codeValidator0.getRegexValidator();
      ;
}
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      EAN13CheckDigit eAN13CheckDigit0 = (EAN13CheckDigit)EAN13CheckDigit.EAN13_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator((RegexValidator) null, 0, eAN13CheckDigit0);
      int int0 = codeValidator0.getMaxLength();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      EAN13CheckDigit eAN13CheckDigit0 = (EAN13CheckDigit)EAN13CheckDigit.EAN13_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator((RegexValidator) null, 0, eAN13CheckDigit0);
      int int0 = codeValidator0.getMaxLength();
      ;
}
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("", 24, (CheckDigit) null);
      assertEquals(0, codeValidator0.getMinLength());
}
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CodeValidator codeValidator0 = new CodeValidator("", 24, (CheckDigit) null);
      assertEquals(0, codeValidator0.getMaxLength());
}
 @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      EAN13CheckDigit eAN13CheckDigit0 = (EAN13CheckDigit)EAN13CheckDigit.EAN13_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator((RegexValidator) null, 0, eAN13CheckDigit0);
      codeValidator0.getCheckDigit();
      assertEquals(1, codeValidator0.getMinLength());
}
 @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      EAN13CheckDigit eAN13CheckDigit0 = (EAN13CheckDigit)EAN13CheckDigit.EAN13_CHECK_DIGIT;
      CodeValidator codeValidator0 = new CodeValidator((RegexValidator) null, 0, eAN13CheckDigit0);
      codeValidator0.getCheckDigit();
      ;
}
}
