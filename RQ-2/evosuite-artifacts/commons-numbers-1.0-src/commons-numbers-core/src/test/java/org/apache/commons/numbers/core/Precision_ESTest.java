/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 20:03:31 GMT 2022
 */

package org.apache.commons.numbers.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.RoundingMode;
import org.apache.commons.numbers.core.Precision;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Precision_ESTest extends Precision_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(0.0F);
      boolean boolean0 = precision_DoubleEquivalence0.gte(3691.77758, (-1247));
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(0.0);
      boolean boolean0 = precision_DoubleEquivalence0.gt(1.0, 1.0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(2780.8);
      boolean boolean0 = precision_DoubleEquivalence0.lte(1589.6987961432192, 0.0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(0.0F);
      boolean boolean0 = precision_DoubleEquivalence0.lt(0.0F, (-871.3F));
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(1.0);
      boolean boolean0 = precision_DoubleEquivalence0.eq(1638.408294006, Double.NaN);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = Precision.representableDelta(2281, 782.9547);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.HALF_EVEN;
      double double0 = Precision.round(1009.0, (-251), roundingMode0);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int int0 = Precision.compareTo(0.0, -0.0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN(45.57117319062, 0.0, 45.57117319062);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      boolean boolean0 = Precision.equalsWithRelativeTolerance(1.0, 0.0, 1.0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = Precision.equals(-0.0F, (float) 0, 0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = Precision.equals(0.0F, (float) (-1));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN((float) (-1), 0.0F, 0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN(0.0F, 99.1F, 99.1F);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = Precision.equals((-1.0F), 0.0F, 3308.5925F);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = Precision.compareTo(0.0, 0.0, (-696));
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(0.0);
      boolean boolean0 = precision_DoubleEquivalence0.eq(0.0, (-3046.959));
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.HALF_EVEN;
      double double0 = Precision.round((-661.0), 1757, roundingMode0);
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = Precision.round(-0.0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = Precision.round(4301.9, 0);
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = Precision.representableDelta(0.0, 1);
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double double0 = Precision.representableDelta(0, (-1972.49539514));
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN((float) 0, 0.0F, 0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN((float) (-6), (float) (-6));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = Precision.equals((-1.0F), (-1.0F));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = Precision.equals(0.0, (double) 0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Precision.round((double) (-567), (-567), (RoundingMode) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      // Undeclared exception!
      try { 
        Precision.round((double) 2281, (-1), roundingMode0);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Precision.round((double) 1.0F, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // Underflow
         //
         verifyException("java.math.BigDecimal", e);
      }
  }
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.FLOOR;
      double double0 = Precision.round(1623.934029974, 0, roundingMode0);
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = Precision.equals(Double.NaN, Double.NaN, 2146559105);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = Precision.equals(-0.0, 0.0, 1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = Precision.equals((-557.0), 0.0, 1073741824);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = Precision.equals(2765.5532907699153, -0.0, (-3207));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = Precision.equals(681.692848, 681.692848, (-944));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = Precision.equals(0.0, 0.0, 0.0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean boolean0 = Precision.equals(0.0, 2.2250738585072014E-308, 0.0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = Precision.equals(1589.6987961432192, 632.0, 1589.6987961432192);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN((double) 2143774695, Double.NaN);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = Precision.equals((-1.0F), 0.0F, 2281);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = Precision.equals(3220.958F, (-1.0F), (-543));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = Precision.equals((float) 0, (float) 0, 0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = Precision.equals((-579.0F), (-2025.8F), 1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = Precision.compareTo(Double.NaN, 0.0, (-2333.421555547));
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int int0 = Precision.compareTo(211.88799999999992, (double) 0, Double.NaN);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int int0 = Precision.compareTo(643.5811, 643.5811, Double.NaN);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      int int0 = Precision.compareTo((-676.648), 0.0, 0.0);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(846.21);
      double double0 = precision_DoubleEquivalence0.signum((-1.920768083039233));
      ;
}
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(2534.76);
      double double0 = precision_DoubleEquivalence0.signum(Double.NaN);
      ;
}
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(0.0);
      double double0 = precision_DoubleEquivalence0.signum(0.0);
      ;
}
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(0.0);
      boolean boolean0 = precision_DoubleEquivalence0.gte(0.0, 0.0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(0.0);
      boolean boolean0 = precision_DoubleEquivalence0.gte((-1.0), -0.0);
      ;
}
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(0.0);
      boolean boolean0 = precision_DoubleEquivalence0.gt(0.0, (-6));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(0.0);
      boolean boolean0 = precision_DoubleEquivalence0.gt(0.0, 1.0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(2534.76);
      boolean boolean0 = precision_DoubleEquivalence0.lte(Double.NaN, 3869);
      ;
}
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(0.0);
      boolean boolean0 = precision_DoubleEquivalence0.lt((-676.648), 1);
      ;
}
 @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        Precision.doubleEquivalenceOfEpsilon((-661.3212764032));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Invalid epsilon value: -661.3212764032
         //
         verifyException("org.apache.commons.numbers.core.Precision", e);
      }
  }
 @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        Precision.doubleEquivalenceOfEpsilon(Double.NaN);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Invalid epsilon value: NaN
         //
         verifyException("org.apache.commons.numbers.core.Precision", e);
      }
  }
 @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.HALF_EVEN;
      double double0 = Precision.round(Double.NaN, (-586), roundingMode0);
      ;
}
 @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN(Double.NaN, (double) 0.0F, (-223));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN(Double.NaN, Double.NaN, (-1));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN(1.0, 3003.9, 3869);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(0.0);
      int int0 = precision_DoubleEquivalence0.compare(Double.NaN, Double.NaN);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN(0.0, -0.0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN((-1.0), 0.0, 495.0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN(0.0, 0.0, (-1467.0290628));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean boolean0 = Precision.equalsWithRelativeTolerance(0.0, (-1500.2), 1371.0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean boolean0 = Precision.equalsWithRelativeTolerance(1, 1, 0.0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      boolean boolean0 = Precision.equalsWithRelativeTolerance((-1.0F), 3612.76909681078, 0.0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(2780.8);
      boolean boolean0 = precision_DoubleEquivalence0.lt(2780.8, 0.0);
      ;
}
 @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN(Double.NaN, Double.NaN);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN(Double.NaN, (-1.0), 0.0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      boolean boolean0 = Precision.equals(-0.0F, 512.2109F, 2143774695);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN((float) 1, (-740.0F), (-740.0F));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN(654.0832F, 3229.0854F, 3229.0854F);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN(0.0F, (float) 3869, (-1.0F));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN(0.0F, 0.0F, 0.0F);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      boolean boolean0 = Precision.equals((-579.0F), 0.0F, (-2025.8F));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      boolean boolean0 = Precision.equals((float) 1, 0.0F, (float) 1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      boolean boolean0 = Precision.equals((float) (-528), (float) (-528), (float) 0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      boolean boolean0 = Precision.equalsIncludingNaN(0.0F, 923.0446F);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      int int0 = Precision.compareTo(0.0, (-3065.83882031), (-6));
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      int int0 = Precision.compareTo(0.0, 0.0, 0);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      int int0 = Precision.compareTo((-1.0), 2.2250738585072014E-308, 1);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(0.0);
      boolean boolean0 = precision_DoubleEquivalence0.lte(0.0, 1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(2534.76);
      boolean boolean0 = precision_DoubleEquivalence0.eqZero(0.0);
      ;
}
 @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = Precision.doubleEquivalenceOfEpsilon(0.0);
      double double0 = precision_DoubleEquivalence0.signum(3082.3125418308);
      ;
}
 @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      double double0 = Precision.representableDelta(0.0, 0.0);
      ;
}
 @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      boolean boolean0 = Precision.equals(0.0, (double) 1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      double double0 = Precision.round((-743.912252), 1);
      ;
}
}
