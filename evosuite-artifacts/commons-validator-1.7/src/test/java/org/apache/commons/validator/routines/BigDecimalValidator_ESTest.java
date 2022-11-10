/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:50:47 GMT 2022
 */

package org.apache.commons.validator.routines;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import org.apache.commons.validator.routines.BigDecimalValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BigDecimalValidator_ESTest extends BigDecimalValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator();
      BigDecimal bigDecimal0 = new BigDecimal((-3506L));
      boolean boolean0 = bigDecimalValidator0.maxValue(bigDecimal0, (double) (-3506L));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = BigDecimalValidator.getInstance();
      BigInteger bigInteger0 = BigInteger.ZERO;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      boolean boolean0 = bigDecimalValidator0.minValue(bigDecimal0, 0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator(false, (-1064), false);
      BigDecimal bigDecimal0 = new BigDecimal((-1));
      boolean boolean0 = bigDecimalValidator0.isInRange(bigDecimal0, (double) (-1064), 134.9162554954775);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator();
      Locale locale0 = Locale.FRENCH;
      BigDecimal bigDecimal0 = bigDecimalValidator0.validate("0", locale0);
      assertEquals((short)0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator(false, (-3615), false);
      Locale locale0 = Locale.FRANCE;
      BigDecimal bigDecimal0 = bigDecimalValidator0.validate("2AC#;V%ZV&oVEH:I5hl", locale0);
      assertEquals((short)2, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = BigDecimalValidator.getInstance();
      BigDecimal bigDecimal0 = bigDecimalValidator0.validate("m0X2I1+f", "m0X2I1+f", (Locale) null);
      assertEquals((byte)0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator(false);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BigDecimal bigDecimal0 = bigDecimalValidator0.validate("9Qz`@25:G", (String) null, locale0);
      assertNotNull(bigDecimal0);
      assertEquals((byte)9, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = BigDecimalValidator.getInstance();
      BigDecimal bigDecimal0 = bigDecimalValidator0.validate("*w)KR'cVb_5B^+4$", "");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator();
      BigDecimal bigDecimal0 = bigDecimalValidator0.validate("1", "");
      assertNotNull(bigDecimal0);
      assertEquals((short)1, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = BigDecimalValidator.getInstance();
      BigDecimal bigDecimal0 = bigDecimalValidator0.validate("-672");
      assertEquals((byte)96, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator();
      BigDecimal bigDecimal0 = bigDecimalValidator0.validate("0");
      assertEquals((short)0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator(false, 583, false);
      BigDecimal bigDecimal0 = bigDecimalValidator0.validate("7,-GMf");
      assertEquals((byte)7, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator();
      Long long0 = new Long(0);
      Locale locale0 = Locale.CANADA_FRENCH;
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance(locale0);
      BigDecimal bigDecimal0 = (BigDecimal)bigDecimalValidator0.processParsedValue(long0, numberFormat0);
      assertEquals((byte)0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator();
      Locale locale0 = Locale.TAIWAN;
      // Undeclared exception!
      try { 
        bigDecimalValidator0.validate("M?g&/frA8Ye", "'4LeeR#~I^J5s}OoS", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed pattern \"'4LeeR#~I^J5s}OoS\"
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator(false);
      // Undeclared exception!
      try { 
        bigDecimalValidator0.validate("~YfENG+KU", "org.apache.commons.validator.routines.AbstractFormatValidator");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Multiple decimal separators in pattern \"org.apache.commons.validator.routines.AbstractFormatValidator\"
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator(false, (-1064), false);
      Locale locale0 = Locale.PRC;
      Format format0 = bigDecimalValidator0.getFormat(locale0);
      // Undeclared exception!
      try { 
        bigDecimalValidator0.processParsedValue(bigDecimalValidator0, format0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator(false, 0, true);
      Locale locale0 = new Locale("pAl5.^w5wOJ|3F>", "");
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", locale0);
      // Undeclared exception!
      try { 
        bigDecimalValidator0.processParsedValue((Object) null, mockSimpleDateFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator(true, 1581, true);
      Long long0 = new Long((-2878L));
      Locale locale0 = Locale.CHINESE;
      MessageFormat messageFormat0 = new MessageFormat("org.apache.commons.validator.routines.AbstractFormatValidator", locale0);
      // Undeclared exception!
      try { 
        bigDecimalValidator0.processParsedValue(long0, messageFormat0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.text.MessageFormat cannot be cast to java.text.NumberFormat
         //
         verifyException("org.apache.commons.validator.routines.BigDecimalValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = BigDecimalValidator.getInstance();
      // Undeclared exception!
      try { 
        bigDecimalValidator0.maxValue((BigDecimal) null, 1886.9841);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.BigDecimalValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = BigDecimalValidator.getInstance();
      // Undeclared exception!
      try { 
        bigDecimalValidator0.isInRange((BigDecimal) null, (double) 2, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.BigDecimalValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator(false, (-1949), true);
      // Undeclared exception!
      try { 
        bigDecimalValidator0.minValue((BigDecimal) null, (-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.BigDecimalValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator();
      Locale locale0 = Locale.FRENCH;
      BigDecimal bigDecimal0 = bigDecimalValidator0.validate("-43", locale0);
      assertEquals((byte) (-43), bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator();
      // Undeclared exception!
      try { 
        bigDecimalValidator0.validate("-2.211");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      boolean boolean0 = bigDecimalValidator0.maxValue(bigDecimal0, (double) 2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = BigDecimalValidator.getInstance();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      boolean boolean0 = bigDecimalValidator0.maxValue(bigDecimal0, (double) 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator();
      BigDecimal bigDecimal0 = new BigDecimal((long) 1);
      boolean boolean0 = bigDecimalValidator0.minValue(bigDecimal0, (double) 2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator();
      BigDecimal bigDecimal0 = new BigDecimal((long) 1);
      boolean boolean0 = bigDecimalValidator0.isInRange(bigDecimal0, (double) 1, (double) 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      boolean boolean0 = bigDecimalValidator0.isInRange(bigDecimal0, (double) 0, (double) 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      boolean boolean0 = bigDecimalValidator0.isInRange(bigDecimal0, (double) 2, (double) 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator(false);
      BigDecimal bigDecimal0 = bigDecimalValidator0.validate("org.apache.commons.validator.routines.BigDecimalValidator");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator(false);
      Locale locale0 = Locale.CANADA_FRENCH;
      BigDecimal bigDecimal0 = bigDecimalValidator0.validate((String) null, (String) null, locale0);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator();
      BigDecimal bigDecimal0 = bigDecimalValidator0.validate("0)9\"$e31b", "0)9\"$e31b");
      assertEquals((byte)0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = BigDecimalValidator.getInstance();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      boolean boolean0 = bigDecimalValidator0.minValue(bigDecimal0, (double) 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BigDecimalValidator bigDecimalValidator0 = new BigDecimalValidator();
      Locale locale0 = Locale.US;
      BigDecimal bigDecimal0 = bigDecimalValidator0.validate("0)9\"$e31b", locale0);
      assertNull(bigDecimal0);
  }
}
