/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:37:14 GMT 2022
 */

package org.apache.commons.geometry.spherical.oned;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.geometry.euclidean.twod.PolarCoordinates;
import org.apache.commons.geometry.spherical.oned.Point1S;
import org.apache.commons.geometry.spherical.oned.Transform1S;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Transform1S_ESTest extends Transform1S_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createRotation(360.0);
      Transform1S transform1S1 = transform1S0.rotate((-669.2711430969));
      boolean boolean0 = transform1S1.equals(transform1S0);
      assertEquals(360.0, transform1S0.getRotation(), 0.01);
      assertFalse(boolean0);
      assertEquals((-309.2711430969), transform1S1.getRotation(), 0.01);
      assertFalse(transform1S1.isNegation());
      assertFalse(transform1S0.equals((Object)transform1S1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createRotation((-1141.3));
      Transform1S transform1S1 = Transform1S.createNegation();
      boolean boolean0 = transform1S0.equals(transform1S1);
      assertFalse(boolean0);
      assertTrue(transform1S0.preservesOrientation());
      assertEquals((-1141.3), transform1S0.getRotation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      Transform1S transform1S1 = Transform1S.createRotation((-105.26));
      Transform1S transform1S2 = transform1S0.premultiply(transform1S1);
      transform1S2.hashCode();
      assertEquals((-105.26), transform1S2.getRotation(), 0.01);
      assertFalse(transform1S2.equals((Object)transform1S1));
      assertFalse(transform1S2.preservesOrientation());
      assertTrue(transform1S1.preservesOrientation());
      assertEquals((-105.26), transform1S1.getRotation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createRotation(6.283185307179586);
      Transform1S transform1S1 = transform1S0.rotate(Double.NaN);
      Transform1S transform1S2 = transform1S1.inverse();
      assertFalse(transform1S2.isNegation());
      assertEquals(6.283185307179586, transform1S0.getRotation(), 0.01);
      assertTrue(transform1S2.equals((Object)transform1S1));
      assertFalse(transform1S0.isNegation());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      Transform1S transform1S1 = transform1S0.rotate((-571.85));
      Point1S point1S0 = Point1S.ZERO;
      Point1S point1S1 = transform1S1.apply(point1S0);
      assertTrue(transform1S1.isNegation());
      assertEquals(6.203048260521882, point1S1.getNormalizedAzimuth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      Transform1S transform1S1 = transform1S0.negate();
      Transform1S transform1S2 = Transform1S.createRotation(2933.81);
      Transform1S transform1S3 = transform1S2.negate();
      Transform1S transform1S4 = transform1S3.premultiply(transform1S1);
      assertEquals((-2933.81), transform1S3.getRotation(), 0.01);
      assertTrue(transform1S4.isNegation());
      assertEquals(0.0, transform1S1.getRotation(), 0.01);
      assertFalse(transform1S2.isNegation());
      assertEquals((-2933.81), transform1S4.getRotation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createRotation((-1141.3));
      Transform1S transform1S1 = transform1S0.negate();
      assertEquals(1141.3, transform1S1.getRotation(), 0.01);
      assertFalse(transform1S1.preservesOrientation());
      assertEquals((-1141.3), transform1S0.getRotation(), 0.01);
      assertFalse(transform1S0.isNegation());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      Transform1S transform1S1 = transform1S0.negate();
      Transform1S transform1S2 = Transform1S.createRotation(2933.81);
      Transform1S transform1S3 = transform1S2.premultiply(transform1S1);
      Transform1S transform1S4 = transform1S3.negate();
      Transform1S transform1S5 = transform1S4.rotate(0.0);
      assertEquals((-2933.81), transform1S5.getRotation(), 0.01);
      assertTrue(transform1S5.equals((Object)transform1S4));
      assertEquals(0.0, transform1S1.getRotation(), 0.01);
      assertTrue(transform1S5.isNegation());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createRotation(172.3479921332);
      Transform1S transform1S1 = transform1S0.multiply(transform1S0);
      assertEquals(172.3479921332, transform1S0.getRotation(), 0.01);
      assertEquals(344.6959842664, transform1S1.getRotation(), 0.01);
      assertFalse(transform1S1.isNegation());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      Transform1S transform1S1 = transform1S0.negate();
      Transform1S transform1S2 = Transform1S.createRotation(2933.81);
      Transform1S transform1S3 = transform1S1.negate();
      Transform1S transform1S4 = transform1S3.multiply(transform1S2);
      assertEquals((-2933.81), transform1S4.getRotation(), 0.01);
      assertFalse(transform1S1.isNegation());
      assertEquals(0.0, transform1S1.getRotation(), 0.01);
      assertTrue(transform1S2.preservesOrientation());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      Transform1S transform1S1 = transform1S0.inverse();
      assertTrue(transform1S1.equals((Object)transform1S0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createRotation(360.0);
      Transform1S transform1S1 = transform1S0.inverse();
      assertEquals((-360.0), transform1S1.getRotation(), 0.01);
      assertFalse(transform1S1.equals((Object)transform1S0));
      assertTrue(transform1S1.preservesOrientation());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      Transform1S transform1S1 = transform1S0.negate();
      Transform1S transform1S2 = Transform1S.createRotation(2933.81);
      Transform1S transform1S3 = transform1S2.premultiply(transform1S1);
      double double0 = transform1S3.getRotation();
      assertEquals(2933.81, double0, 0.01);
      assertEquals(0.0, transform1S1.getRotation(), 0.01);
      assertTrue(transform1S2.preservesOrientation());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createRotation((-1.0));
      double double0 = transform1S0.getRotation();
      assertEquals((-1.0), double0, 0.01);
      assertTrue(transform1S0.preservesOrientation());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      Point1S point1S0 = Point1S.of(Double.POSITIVE_INFINITY);
      Point1S point1S1 = transform1S0.apply(point1S0);
      assertEquals(Double.NEGATIVE_INFINITY, point1S1.getNormalizedAzimuth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.identity();
      PolarCoordinates polarCoordinates0 = PolarCoordinates.of(0.0, 0.0);
      Point1S point1S0 = Point1S.from(polarCoordinates0);
      Point1S point1S1 = transform1S0.apply(point1S0);
      assertEquals(0.0, point1S1.getAzimuth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      Point1S point1S0 = Point1S.NaN;
      Point1S point1S1 = transform1S0.apply(point1S0);
      assertNotSame(point1S0, point1S1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createRotation(0.0);
      // Undeclared exception!
      try { 
        transform1S0.premultiply((Transform1S) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.spherical.oned.Transform1S", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      // Undeclared exception!
      try { 
        transform1S0.multiply((Transform1S) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.spherical.oned.Transform1S", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      boolean boolean0 = transform1S0.isNegation();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      double double0 = transform1S0.getRotation();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      Transform1S transform1S1 = transform1S0.premultiply(transform1S0);
      assertEquals(0.0, transform1S1.getRotation(), 0.01);
      assertTrue(transform1S1.preservesOrientation());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createRotation((-1167.186409868));
      Transform1S transform1S1 = Transform1S.createRotation((-1167.186409868));
      boolean boolean0 = transform1S1.equals(transform1S0);
      assertTrue(boolean0);
      assertEquals((-1167.186409868), transform1S1.getRotation(), 0.01);
      assertFalse(transform1S1.isNegation());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createRotation(28.94705164807618);
      Transform1S transform1S1 = transform1S0.rotate(28.94705164807618);
      boolean boolean0 = transform1S1.equals(transform1S0);
      assertEquals(57.89410329615236, transform1S1.getRotation(), 0.01);
      assertFalse(transform1S0.equals((Object)transform1S1));
      assertEquals(28.94705164807618, transform1S0.getRotation(), 0.01);
      assertFalse(boolean0);
      assertFalse(transform1S1.isNegation());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createRotation(28.94705164807618);
      boolean boolean0 = transform1S0.equals(transform1S0);
      assertTrue(boolean0);
      assertEquals(28.94705164807618, transform1S0.getRotation(), 0.01);
      assertFalse(transform1S0.isNegation());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      Object object0 = new Object();
      boolean boolean0 = transform1S0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.identity();
      boolean boolean0 = transform1S0.preservesOrientation();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      boolean boolean0 = transform1S0.preservesOrientation();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createRotation(2933.81);
      boolean boolean0 = transform1S0.isNegation();
      assertFalse(boolean0);
      assertEquals(2933.81, transform1S0.getRotation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.identity();
      Transform1S transform1S1 = transform1S0.multiply(transform1S0);
      assertTrue(transform1S1.equals((Object)transform1S0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.identity();
      // Undeclared exception!
      try { 
        transform1S0.apply((Point1S) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.spherical.oned.Transform1S", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      Transform1S transform1S1 = transform1S0.negate();
      boolean boolean0 = transform1S0.equals(transform1S1);
      assertEquals(0.0, transform1S1.getRotation(), 0.01);
      assertFalse(transform1S1.isNegation());
      assertFalse(transform1S1.equals((Object)transform1S0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      Transform1S transform1S1 = transform1S0.rotate(0.0);
      assertTrue(transform1S1.equals((Object)transform1S0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Transform1S transform1S0 = Transform1S.createNegation();
      String string0 = transform1S0.toString();
      assertEquals("Transform1S[negate= true, rotate= 0.0]", string0);
  }
}
