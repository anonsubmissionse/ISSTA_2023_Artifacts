/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:14:47 GMT 2022
 */

package org.apache.commons.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.geometry.euclidean.twod.PolarCoordinates;
import org.apache.commons.geometry.euclidean.twod.Vector2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolarCoordinates_ESTest extends PolarCoordinates_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      PolarCoordinates polarCoordinates1 = PolarCoordinates.of(3.141592653589793, Double.NEGATIVE_INFINITY);
      boolean boolean0 = polarCoordinates1.equals(polarCoordinates0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      PolarCoordinates polarCoordinates1 = PolarCoordinates.of(3.141592653589793, Double.NEGATIVE_INFINITY);
      boolean boolean0 = polarCoordinates1.equals(polarCoordinates0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      PolarCoordinates polarCoordinates1 = PolarCoordinates.of(3.141592653589793, Double.NEGATIVE_INFINITY);
      boolean boolean0 = polarCoordinates1.equals(polarCoordinates0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      PolarCoordinates polarCoordinates1 = PolarCoordinates.of(3.141592653589793, Double.NEGATIVE_INFINITY);
      boolean boolean0 = polarCoordinates1.equals(polarCoordinates0);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      PolarCoordinates polarCoordinates1 = PolarCoordinates.of(3.141592653589793, Double.NEGATIVE_INFINITY);
      boolean boolean0 = polarCoordinates1.equals(polarCoordinates0);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of((-1289.4), (-1289.4));
      PolarCoordinates polarCoordinates1 = PolarCoordinates.parse("(1823.4869673238688, 3.9269908169872414)");
      boolean boolean0 = polarCoordinates0.equals(polarCoordinates1);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of((-1289.4), (-1289.4));
      PolarCoordinates polarCoordinates1 = PolarCoordinates.parse("(1823.4869673238688, 3.9269908169872414)");
      boolean boolean0 = polarCoordinates0.equals(polarCoordinates1);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of((-1289.4), (-1289.4));
      PolarCoordinates polarCoordinates1 = PolarCoordinates.parse("(1823.4869673238688, 3.9269908169872414)");
      boolean boolean0 = polarCoordinates0.equals(polarCoordinates1);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of((-1289.4), (-1289.4));
      PolarCoordinates polarCoordinates1 = PolarCoordinates.parse("(1823.4869673238688, 3.9269908169872414)");
      boolean boolean0 = polarCoordinates0.equals(polarCoordinates1);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of((-1289.4), (-1289.4));
      PolarCoordinates polarCoordinates1 = PolarCoordinates.parse("(1823.4869673238688, 3.9269908169872414)");
      boolean boolean0 = polarCoordinates0.equals(polarCoordinates1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector2D vector2D0 = PolarCoordinates.toCartesian((double) 2, Double.POSITIVE_INFINITY);
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector2D vector2D0 = PolarCoordinates.toCartesian((double) 2, Double.POSITIVE_INFINITY);
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector2D vector2D0 = PolarCoordinates.toCartesian(Double.POSITIVE_INFINITY, 2382.2664856166);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector2D vector2D0 = PolarCoordinates.toCartesian(Double.POSITIVE_INFINITY, 2382.2664856166);
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector2D vector2D0 = PolarCoordinates.toCartesian(0.0, 970.2538);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector2D vector2D0 = PolarCoordinates.toCartesian(0.0, 970.2538);
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector2D vector2D0 = PolarCoordinates.toCartesian((-675.512), 1140.0);
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector2D vector2D0 = PolarCoordinates.toCartesian((-675.512), 1140.0);
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, Double.NaN);
      Vector2D vector2D0 = polarCoordinates0.toCartesian();
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, Double.NaN);
      Vector2D vector2D0 = polarCoordinates0.toCartesian();
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, Double.NaN);
      Vector2D vector2D0 = polarCoordinates0.toCartesian();
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(vector2D0);
      Vector2D vector2D1 = polarCoordinates0.toCartesian();
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(2, 2434.992);
      Vector2D vector2D0 = polarCoordinates0.toCartesian();
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(2, 2434.992);
      Vector2D vector2D0 = polarCoordinates0.toCartesian();
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian((-966.13), 0.0);
      Vector2D vector2D0 = polarCoordinates0.toCartesian();
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian((-966.13), 0.0);
      Vector2D vector2D0 = polarCoordinates0.toCartesian();
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.parse("(NaN, NaN)");
      ;
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.parse("(0.0, 0.0)");
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.parse("(0.0, 0.0)");
      ;
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.parse("(3.141592653589793, -Infinity)");
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.parse("(3.141592653589793, -Infinity)");
      ;
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(0.0, 1028.0);
      ;
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(0.0, 1028.0);
      ;
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double double0 = PolarCoordinates.normalizeAzimuth(0.0);
      ;
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(0.0, 0.0);
      double double0 = polarCoordinates0.getRadius();
      ;
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(0.0, 0.0);
      double double0 = polarCoordinates0.getRadius();
      ;
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.273390607896142E150, 0.0);
      double double0 = polarCoordinates0.getAzimuth();
      ;
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.273390607896142E150, 0.0);
      double double0 = polarCoordinates0.getAzimuth();
      ;
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of((-1156.628986137756), Double.NEGATIVE_INFINITY);
      double double0 = polarCoordinates0.getAzimuth();
      ;
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of((-1156.628986137756), Double.NEGATIVE_INFINITY);
      double double0 = polarCoordinates0.getAzimuth();
      ;
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(Double.POSITIVE_INFINITY, 6.283185307179586);
      ;
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(Double.POSITIVE_INFINITY, 6.283185307179586);
      ;
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(0.0, 0.0);
      Vector2D vector2D0 = polarCoordinates0.toCartesian();
      PolarCoordinates polarCoordinates1 = PolarCoordinates.fromCartesian(vector2D0);
      ;
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        PolarCoordinates.parse("ZYZ");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse string \"ZYZ\" at index 0: expected \"(\" but found \"Z\"
         //
         verifyException("org.apache.commons.geometry.core.internal.SimpleTupleFormat", e);
      }
  }
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        PolarCoordinates.parse((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.core.internal.SimpleTupleFormat", e);
      }
  }
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        PolarCoordinates.fromCartesian((Vector2D) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.PolarCoordinates", e);
      }
  }
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double double0 = PolarCoordinates.normalizeAzimuth((-675.512));
      ;
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double double0 = PolarCoordinates.normalizeAzimuth(Double.NEGATIVE_INFINITY);
      ;
}
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(Double.NaN, Double.NaN);
      boolean boolean0 = polarCoordinates0.isNaN();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, Double.NaN);
      boolean boolean0 = polarCoordinates0.isNaN();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, Double.NaN);
      boolean boolean0 = polarCoordinates0.isNaN();
      ;
}
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      PolarCoordinates polarCoordinates1 = PolarCoordinates.fromCartesian(507.76, 507.76);
      boolean boolean0 = polarCoordinates0.equals(polarCoordinates1);
      ;
}
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      PolarCoordinates polarCoordinates1 = PolarCoordinates.fromCartesian(507.76, 507.76);
      boolean boolean0 = polarCoordinates0.equals(polarCoordinates1);
      ;
}
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      PolarCoordinates polarCoordinates1 = PolarCoordinates.fromCartesian(507.76, 507.76);
      boolean boolean0 = polarCoordinates0.equals(polarCoordinates1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      PolarCoordinates polarCoordinates1 = PolarCoordinates.fromCartesian(507.76, 507.76);
      boolean boolean0 = polarCoordinates0.equals(polarCoordinates1);
      assertTrue(polarCoordinates1.isNaN());
}
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      PolarCoordinates polarCoordinates1 = PolarCoordinates.of(3.141592653589793, Double.NaN);
      boolean boolean0 = polarCoordinates1.equals(polarCoordinates0);
      ;
}
 @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      PolarCoordinates polarCoordinates1 = PolarCoordinates.of(3.141592653589793, Double.NaN);
      boolean boolean0 = polarCoordinates1.equals(polarCoordinates0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      PolarCoordinates polarCoordinates1 = PolarCoordinates.of(3.141592653589793, Double.NaN);
      boolean boolean0 = polarCoordinates1.equals(polarCoordinates0);
      ;
}
 @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      PolarCoordinates polarCoordinates1 = PolarCoordinates.of(3.141592653589793, Double.NaN);
      boolean boolean0 = polarCoordinates1.equals(polarCoordinates0);
      assertTrue(polarCoordinates0.isNaN());
}
 @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(Double.NaN, Double.NaN);
      PolarCoordinates polarCoordinates1 = PolarCoordinates.of(Double.NaN, Double.NaN);
      polarCoordinates0.equals(polarCoordinates1);
      assertTrue(polarCoordinates1.isNaN());
}
 @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(Double.NaN, Double.NaN);
      PolarCoordinates polarCoordinates1 = PolarCoordinates.of(Double.NaN, Double.NaN);
      polarCoordinates0.equals(polarCoordinates1);
      assertTrue(polarCoordinates0.isNaN());
}
 @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of((-1239.4619244034), (-1239.4619244034));
      boolean boolean0 = polarCoordinates0.equals("(1239.4619244034, 1.4671737645683152)");
      ;
}
 @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of((-1239.4619244034), (-1239.4619244034));
      boolean boolean0 = polarCoordinates0.equals("(1239.4619244034, 1.4671737645683152)");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of((-1239.4619244034), (-1239.4619244034));
      boolean boolean0 = polarCoordinates0.equals("(1239.4619244034, 1.4671737645683152)");
      ;
}
 @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      boolean boolean0 = polarCoordinates0.equals(polarCoordinates0);
      ;
}
 @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      boolean boolean0 = polarCoordinates0.equals(polarCoordinates0);
      ;
}
 @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      boolean boolean0 = polarCoordinates0.equals(polarCoordinates0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      PolarCoordinates polarCoordinates1 = PolarCoordinates.fromCartesian(vector2D0);
      boolean boolean0 = polarCoordinates1.equals(polarCoordinates0);
      assertTrue(polarCoordinates1.isInfinite());
}
 @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      PolarCoordinates polarCoordinates1 = PolarCoordinates.fromCartesian(vector2D0);
      boolean boolean0 = polarCoordinates1.equals(polarCoordinates0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      PolarCoordinates polarCoordinates1 = PolarCoordinates.fromCartesian(vector2D0);
      boolean boolean0 = polarCoordinates1.equals(polarCoordinates0);
      ;
}
 @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      PolarCoordinates polarCoordinates1 = PolarCoordinates.fromCartesian(vector2D0);
      boolean boolean0 = polarCoordinates1.equals(polarCoordinates0);
      ;
}
 @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      PolarCoordinates polarCoordinates1 = PolarCoordinates.fromCartesian(vector2D0);
      boolean boolean0 = polarCoordinates1.equals(polarCoordinates0);
      ;
}
 @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      polarCoordinates0.hashCode();
      ;
}
 @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      polarCoordinates0.hashCode();
      assertTrue(polarCoordinates0.isNaN());
}
 @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      polarCoordinates0.hashCode();
      ;
}
 @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, Double.NaN);
      boolean boolean0 = polarCoordinates0.isFinite();
      ;
}
 @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, Double.NaN);
      boolean boolean0 = polarCoordinates0.isFinite();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      boolean boolean0 = polarCoordinates0.isFinite();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      boolean boolean0 = polarCoordinates0.isFinite();
      ;
}
 @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      boolean boolean0 = polarCoordinates0.isFinite();
      ;
}
 @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(vector2D0);
      boolean boolean0 = polarCoordinates0.isFinite();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, Double.NEGATIVE_INFINITY);
      boolean boolean0 = polarCoordinates0.isInfinite();
      ;
}
 @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, Double.NEGATIVE_INFINITY);
      boolean boolean0 = polarCoordinates0.isInfinite();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, Double.NEGATIVE_INFINITY);
      boolean boolean0 = polarCoordinates0.isInfinite();
      ;
}
 @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(vector2D0);
      boolean boolean0 = polarCoordinates0.isInfinite();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(vector2D0);
      boolean boolean0 = polarCoordinates0.isInfinite();
      ;
}
 @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(vector2D0);
      boolean boolean0 = polarCoordinates0.isInfinite();
      ;
}
 @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      boolean boolean0 = polarCoordinates0.isInfinite();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      boolean boolean0 = polarCoordinates0.isInfinite();
      assertTrue(polarCoordinates0.isNaN());
}
 @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      boolean boolean0 = polarCoordinates0.isInfinite();
      ;
}
 @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, 3.141592653589793);
      boolean boolean0 = polarCoordinates0.isInfinite();
      ;
}
 @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, Double.NaN);
      polarCoordinates0.hashCode();
      assertTrue(polarCoordinates0.isNaN());
}
 @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(3.141592653589793, Double.NaN);
      polarCoordinates0.hashCode();
      ;
}
 @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      boolean boolean0 = polarCoordinates0.isNaN();
      ;
}
 @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      boolean boolean0 = polarCoordinates0.isNaN();
      ;
}
 @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      boolean boolean0 = polarCoordinates0.isNaN();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian((-3.141592653589793), Double.NaN);
      boolean boolean0 = polarCoordinates0.isInfinite();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian((-3.141592653589793), Double.NaN);
      boolean boolean0 = polarCoordinates0.isInfinite();
      ;
}
 @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian((-3.141592653589793), Double.NaN);
      boolean boolean0 = polarCoordinates0.isInfinite();
      ;
}
 @Test(timeout = 4000)
  public void test99()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian((-3.141592653589793), Double.NaN);
      boolean boolean0 = polarCoordinates0.isInfinite();
      assertTrue(polarCoordinates0.isNaN());
}
 @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      String string0 = polarCoordinates0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of((-1.0), (-1.0));
      double double0 = polarCoordinates0.getRadius();
      ;
}
 @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of((-1.0), (-1.0));
      double double0 = polarCoordinates0.getRadius();
      ;
}
 @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian((-2286.23116), (-1618.1624944635));
      double double0 = polarCoordinates0.getAzimuth();
      ;
}
 @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian((-2286.23116), (-1618.1624944635));
      double double0 = polarCoordinates0.getAzimuth();
      ;
}
 @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Vector2D vector2D0 = PolarCoordinates.toCartesian(507.76, (-1198.40785599962));
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(vector2D0);
      ;
}
 @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Vector2D vector2D0 = PolarCoordinates.toCartesian(507.76, (-1198.40785599962));
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(vector2D0);
      ;
}
 @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      int int0 = polarCoordinates0.getDimension();
      ;
}
 @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      int int0 = polarCoordinates0.getDimension();
      ;
}
 @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      PolarCoordinates polarCoordinates0 = PolarCoordinates.fromCartesian(507.76, 507.76);
      int int0 = polarCoordinates0.getDimension();
      assertEquals(0, int0);
}
}
