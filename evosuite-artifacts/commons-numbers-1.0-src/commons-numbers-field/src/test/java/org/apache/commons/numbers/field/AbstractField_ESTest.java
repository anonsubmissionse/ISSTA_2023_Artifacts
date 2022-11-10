/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 20:27:13 GMT 2022
 */

package org.apache.commons.numbers.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.numbers.field.BigFractionField;
import org.apache.commons.numbers.field.FP64;
import org.apache.commons.numbers.field.FP64Field;
import org.apache.commons.numbers.field.FractionField;
import org.apache.commons.numbers.fraction.BigFraction;
import org.apache.commons.numbers.fraction.Fraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractField_ESTest extends AbstractField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FP64Field fP64Field0 = FP64Field.get();
      FP64 fP64_0 = FP64.of(0.0);
      FP64 fP64_1 = fP64Field0.multiply(fP64_0, fP64_0);
      FP64 fP64_2 = fP64Field0.multiply(fP64_1, fP64_0);
      assertEquals(0, fP64_2.intValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FP64Field fP64Field0 = FP64Field.get();
      // Undeclared exception!
      try { 
        fP64Field0.subtract((FP64) null, (FP64) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.numbers.field.AbstractField", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FractionField fractionField0 = FractionField.get();
      Fraction fraction0 = Fraction.ONE;
      Fraction fraction1 = Fraction.of(Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        fractionField0.subtract(fraction0, fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // integer overflow
         //
         verifyException("java.lang.Math", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigFractionField bigFractionField0 = BigFractionField.get();
      BigFraction bigFraction0 = BigFraction.ZERO;
      // Undeclared exception!
      try { 
        bigFractionField0.reciprocal(bigFraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Denominator must be different from 0
         //
         verifyException("org.apache.commons.numbers.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FP64Field fP64Field0 = FP64Field.get();
      // Undeclared exception!
      try { 
        fP64Field0.reciprocal((FP64) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.numbers.field.AbstractField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FractionField fractionField0 = FractionField.get();
      // Undeclared exception!
      try { 
        fractionField0.negate((Fraction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.numbers.field.AbstractField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FractionField fractionField0 = FractionField.get();
      // Undeclared exception!
      try { 
        fractionField0.multiply((Fraction) null, (Fraction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.numbers.field.AbstractField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FractionField fractionField0 = FractionField.get();
      Fraction fraction0 = Fraction.from((-1355.09), (-1097));
      // Undeclared exception!
      try { 
        fractionField0.multiply(fraction0, fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // integer overflow
         //
         verifyException("java.lang.Math", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FractionField fractionField0 = FractionField.get();
      // Undeclared exception!
      try { 
        fractionField0.multiply(0, (Fraction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.numbers.field.AbstractField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FractionField fractionField0 = FractionField.get();
      Fraction fraction0 = Fraction.from((double) Integer.MAX_VALUE, Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        fractionField0.multiply(Integer.MAX_VALUE, fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // integer overflow
         //
         verifyException("java.lang.Math", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigFractionField bigFractionField0 = BigFractionField.get();
      BigFraction bigFraction0 = BigFraction.ONE;
      BigFraction bigFraction1 = BigFraction.ZERO;
      // Undeclared exception!
      try { 
        bigFractionField0.divide(bigFraction0, bigFraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The value to divide by must not be zero
         //
         verifyException("org.apache.commons.numbers.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FP64Field fP64Field0 = FP64Field.get();
      FP64 fP64_0 = FP64.of(1.0);
      // Undeclared exception!
      try { 
        fP64Field0.divide(fP64_0, (FP64) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.numbers.field.FP64", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BigFractionField bigFractionField0 = BigFractionField.get();
      BigFraction bigFraction0 = BigFraction.ZERO;
      // Undeclared exception!
      try { 
        bigFractionField0.add((BigFraction) null, bigFraction0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.numbers.field.AbstractField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FractionField fractionField0 = FractionField.get();
      Fraction fraction0 = Fraction.from((-891.375406544), 0.0, 4214);
      // Undeclared exception!
      try { 
        fractionField0.add(fraction0, fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // integer overflow
         //
         verifyException("java.lang.Math", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FractionField fractionField0 = FractionField.get();
      Fraction fraction0 = Fraction.ONE;
      Fraction fraction1 = fractionField0.negate(fraction0);
      assertEquals((-1), fraction1.intValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BigFractionField bigFractionField0 = BigFractionField.get();
      BigFraction bigFraction0 = bigFractionField0.one();
      BigFraction bigFraction1 = bigFractionField0.reciprocal(bigFraction0);
      assertTrue(bigFraction1.equals((Object)bigFraction0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FractionField fractionField0 = FractionField.get();
      Fraction fraction0 = Fraction.ONE;
      Fraction fraction1 = fractionField0.multiply(18, fraction0);
      assertEquals(18.0, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FractionField fractionField0 = FractionField.get();
      Fraction fraction0 = Fraction.ONE;
      Fraction fraction1 = fractionField0.subtract(fraction0, fraction0);
      assertEquals(0, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FractionField fractionField0 = FractionField.get();
      Fraction fraction0 = Fraction.ONE;
      Fraction fraction1 = fractionField0.divide(fraction0, fraction0);
      assertEquals(1, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FP64Field fP64Field0 = FP64Field.get();
      FP64 fP64_0 = FP64.of((-3332.66223));
      FP64 fP64_1 = fP64Field0.add(fP64_0, fP64_0);
      assertEquals((-6665.324F), fP64_1.floatValue(), 0.01F);
  }
}
