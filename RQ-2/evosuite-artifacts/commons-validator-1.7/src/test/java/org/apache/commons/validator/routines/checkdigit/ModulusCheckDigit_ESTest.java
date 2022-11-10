/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:46:53 GMT 2022
 */

package org.apache.commons.validator.routines.checkdigit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.validator.routines.checkdigit.ABANumberCheckDigit;
import org.apache.commons.validator.routines.checkdigit.CUSIPCheckDigit;
import org.apache.commons.validator.routines.checkdigit.EAN13CheckDigit;
import org.apache.commons.validator.routines.checkdigit.ISBN10CheckDigit;
import org.apache.commons.validator.routines.checkdigit.ISINCheckDigit;
import org.apache.commons.validator.routines.checkdigit.ISSNCheckDigit;
import org.apache.commons.validator.routines.checkdigit.LuhnCheckDigit;
import org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit;
import org.apache.commons.validator.routines.checkdigit.ModulusTenCheckDigit;
import org.apache.commons.validator.routines.checkdigit.SedolCheckDigit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModulusCheckDigit_ESTest extends ModulusCheckDigit_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CUSIPCheckDigit cUSIPCheckDigit0 = new CUSIPCheckDigit();
      String string0 = cUSIPCheckDigit0.toCheckDigit(9);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CUSIPCheckDigit cUSIPCheckDigit0 = new CUSIPCheckDigit();
      String string0 = cUSIPCheckDigit0.toCheckDigit(9);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ISINCheckDigit iSINCheckDigit0 = new ISINCheckDigit();
      int int0 = iSINCheckDigit0.toInt('0', 1415, 6);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ISINCheckDigit iSINCheckDigit0 = new ISINCheckDigit();
      int int0 = iSINCheckDigit0.toInt('0', 1415, 6);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[1];
      ModulusTenCheckDigit modulusTenCheckDigit0 = new ModulusTenCheckDigit(intArray0);
      modulusTenCheckDigit0.toInt('D', 1034, 4365);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ABANumberCheckDigit aBANumberCheckDigit0 = new ABANumberCheckDigit();
      String string0 = aBANumberCheckDigit0.toCheckDigit(0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ABANumberCheckDigit aBANumberCheckDigit0 = new ABANumberCheckDigit();
      String string0 = aBANumberCheckDigit0.toCheckDigit(0);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int int0 = ModulusCheckDigit.sumDigits((-1566));
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = (int) 'K';
      ModulusTenCheckDigit modulusTenCheckDigit0 = new ModulusTenCheckDigit(intArray0, false);
      int int0 = modulusTenCheckDigit0.calculateModulus("4", false);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = (int) 'K';
      ModulusTenCheckDigit modulusTenCheckDigit0 = new ModulusTenCheckDigit(intArray0, false);
      int int0 = modulusTenCheckDigit0.calculateModulus("4", false);
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      int int0 = iSSNCheckDigit0.calculateModulus("99", false);
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      int int0 = iSSNCheckDigit0.calculateModulus("99", false);
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-1449);
      ModulusTenCheckDigit modulusTenCheckDigit0 = new ModulusTenCheckDigit(intArray0, true);
      int int0 = modulusTenCheckDigit0.calculateModulus("j", true);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      try { 
        iSBN10CheckDigit0.toInt('x', 33, 'x');
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Invalid Character[33] = 'x'
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LuhnCheckDigit luhnCheckDigit0 = (LuhnCheckDigit)LuhnCheckDigit.LUHN_CHECK_DIGIT;
      try { 
        luhnCheckDigit0.calculateModulus("gzHlIJA>}us{D9", false);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Invalid Character[1] = 'g'
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ISINCheckDigit iSINCheckDigit0 = new ISINCheckDigit();
      // Undeclared exception!
      try { 
        iSINCheckDigit0.calculateModulus("", true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EAN13CheckDigit eAN13CheckDigit0 = new EAN13CheckDigit();
      // Undeclared exception!
      try { 
        eAN13CheckDigit0.calculateModulus((String) null, false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[0];
      ModulusTenCheckDigit modulusTenCheckDigit0 = new ModulusTenCheckDigit(intArray0);
      // Undeclared exception!
      try { 
        modulusTenCheckDigit0.calculateModulus("l~", true);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusTenCheckDigit", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[0];
      ModulusTenCheckDigit modulusTenCheckDigit0 = new ModulusTenCheckDigit(intArray0, false, false);
      // Undeclared exception!
      try { 
        modulusTenCheckDigit0.calculate("Invalid Character[");
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusTenCheckDigit", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SedolCheckDigit sedolCheckDigit0 = (SedolCheckDigit)SedolCheckDigit.SEDOL_CHECK_DIGIT;
      boolean boolean0 = sedolCheckDigit0.isValid("01");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      boolean boolean0 = iSBN10CheckDigit0.isValid("94");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      boolean boolean0 = iSBN10CheckDigit0.isValid("94");
      assertEquals(0, iSBN10CheckDigit0.getModulus());
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = ModulusCheckDigit.sumDigits('i');
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[8];
      ModulusTenCheckDigit modulusTenCheckDigit0 = new ModulusTenCheckDigit(intArray0);
      try { 
        modulusTenCheckDigit0.toCheckDigit('v');
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Invalid Check Digit Value =118
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      try { 
        iSSNCheckDigit0.toCheckDigit((-1));
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Invalid Check Digit Value =-1
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      String string0 = iSBN10CheckDigit0.calculate("99");
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      boolean boolean0 = iSBN10CheckDigit0.isValid("+_");
      assertEquals(0, iSBN10CheckDigit0.getModulus());
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      boolean boolean0 = iSBN10CheckDigit0.isValid("+_");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SedolCheckDigit sedolCheckDigit0 = new SedolCheckDigit();
      try { 
        sedolCheckDigit0.calculate("");
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Code is missing
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ABANumberCheckDigit aBANumberCheckDigit0 = new ABANumberCheckDigit();
      try { 
        aBANumberCheckDigit0.calculate((String) null);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Code is missing
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-939);
      ModulusTenCheckDigit modulusTenCheckDigit0 = new ModulusTenCheckDigit(intArray0, true);
      boolean boolean0 = modulusTenCheckDigit0.isValid("7");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-939);
      ModulusTenCheckDigit modulusTenCheckDigit0 = new ModulusTenCheckDigit(intArray0, true);
      boolean boolean0 = modulusTenCheckDigit0.isValid("7");
      assertEquals(0, modulusTenCheckDigit0.getModulus());
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SedolCheckDigit sedolCheckDigit0 = new SedolCheckDigit();
      boolean boolean0 = sedolCheckDigit0.isValid("");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SedolCheckDigit sedolCheckDigit0 = new SedolCheckDigit();
      boolean boolean0 = sedolCheckDigit0.isValid("");
      ;
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int[] intArray0 = new int[10];
      ModulusTenCheckDigit modulusTenCheckDigit0 = new ModulusTenCheckDigit(intArray0, true);
      boolean boolean0 = modulusTenCheckDigit0.isValid("4");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int[] intArray0 = new int[10];
      ModulusTenCheckDigit modulusTenCheckDigit0 = new ModulusTenCheckDigit(intArray0, true);
      boolean boolean0 = modulusTenCheckDigit0.isValid("4");
      assertEquals(0, modulusTenCheckDigit0.getModulus());
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      boolean boolean0 = iSSNCheckDigit0.isValid((String) null);
      assertEquals(0, iSSNCheckDigit0.getModulus());
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      boolean boolean0 = iSSNCheckDigit0.isValid((String) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ISINCheckDigit iSINCheckDigit0 = new ISINCheckDigit();
      int int0 = iSINCheckDigit0.getModulus();
      ;
}
}
