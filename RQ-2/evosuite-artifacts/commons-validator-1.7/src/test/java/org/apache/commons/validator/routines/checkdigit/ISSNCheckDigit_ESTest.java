/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:53:36 GMT 2022
 */

package org.apache.commons.validator.routines.checkdigit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.validator.routines.checkdigit.ISSNCheckDigit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ISSNCheckDigit_ESTest extends ISSNCheckDigit_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      boolean boolean0 = iSSNCheckDigit0.isValid("^");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      try { 
        iSSNCheckDigit0.toCheckDigit(891);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Invalid Check Digit Value =891
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      int int0 = iSSNCheckDigit0.weightedValue(0, (-2779), 0);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = (ISSNCheckDigit)ISSNCheckDigit.ISSN_CHECK_DIGIT;
      int int0 = iSSNCheckDigit0.weightedValue(3, 3, 3);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = (ISSNCheckDigit)ISSNCheckDigit.ISSN_CHECK_DIGIT;
      int int0 = iSSNCheckDigit0.weightedValue((-3501), 0, (-94));
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = (ISSNCheckDigit)ISSNCheckDigit.ISSN_CHECK_DIGIT;
      int int0 = iSSNCheckDigit0.toInt('0', 0, (-94));
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = (ISSNCheckDigit)ISSNCheckDigit.ISSN_CHECK_DIGIT;
      int int0 = iSSNCheckDigit0.toInt('7', 0, 0);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      try { 
        iSSNCheckDigit0.toInt('f', 1488, 1614);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Invalid Character[1488] = 'f'
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = (ISSNCheckDigit)ISSNCheckDigit.ISSN_CHECK_DIGIT;
      try { 
        iSSNCheckDigit0.toCheckDigit((-3501));
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Invalid Check Digit Value =-3501
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      boolean boolean0 = iSSNCheckDigit0.isValid("9");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      String string0 = iSSNCheckDigit0.toCheckDigit(10);
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      boolean boolean0 = iSSNCheckDigit0.isValid("X");
      assertTrue(boolean0);
}
}
