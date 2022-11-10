/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:39:40 GMT 2022
 */

package org.apache.commons.geometry.spherical.oned;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.geometry.euclidean.twod.Vector2D;
import org.apache.commons.geometry.spherical.oned.CutAngle;
import org.apache.commons.geometry.spherical.oned.CutAngles;
import org.apache.commons.geometry.spherical.oned.Point1S;
import org.apache.commons.numbers.angle.Angle;
import org.apache.commons.numbers.core.Precision;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CutAngles_ESTest extends CutAngles_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Angle.Rad angle_Rad0 = Angle.Rad.of(6.283185307179586);
      Point1S point1S0 = Point1S.of((Angle) angle_Rad0);
      CutAngle cutAngle0 = CutAngles.fromPointAndDirection(point1S0, true, (Precision.DoubleEquivalence) null);
      assertTrue(cutAngle0.isPositiveFacing());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Point1S point1S0 = Point1S.of(0.0);
      CutAngle cutAngle0 = CutAngles.fromPointAndDirection(point1S0, false, (Precision.DoubleEquivalence) null);
      assertFalse(cutAngle0.isPositiveFacing());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Point1S point1S0 = Point1S.NaN;
      CutAngle cutAngle0 = CutAngles.fromPointAndDirection(point1S0, false, (Precision.DoubleEquivalence) null);
      assertFalse(cutAngle0.isPositiveFacing());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CutAngle cutAngle0 = CutAngles.fromAzimuthAndDirection((-1038.0), false, (Precision.DoubleEquivalence) null);
      assertFalse(cutAngle0.isPositiveFacing());
      assertEquals((-1038.0), cutAngle0.getAzimuth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CutAngle cutAngle0 = CutAngles.fromAzimuthAndDirection(6.283185307179586, false, (Precision.DoubleEquivalence) null);
      assertFalse(cutAngle0.isPositiveFacing());
      assertEquals(6.283185307179586, cutAngle0.getAzimuth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CutAngle cutAngle0 = CutAngles.fromAzimuthAndDirection(Double.NEGATIVE_INFINITY, false, (Precision.DoubleEquivalence) null);
      assertFalse(cutAngle0.isPositiveFacing());
      assertEquals(Double.NEGATIVE_INFINITY, cutAngle0.getAzimuth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Point1S point1S0 = Point1S.of(Double.NEGATIVE_INFINITY);
      CutAngle cutAngle0 = CutAngles.createPositiveFacing(point1S0, (Precision.DoubleEquivalence) null);
      assertTrue(cutAngle0.isPositiveFacing());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.from(0.6, 0.0);
      Point1S point1S0 = Point1S.from((Vector2D) vector2D_Unit0);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      CutAngle cutAngle0 = CutAngles.createPositiveFacing(point1S0, precision_DoubleEquivalence0);
      assertTrue(cutAngle0.isPositiveFacing());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Point1S point1S0 = Point1S.of((-1.0));
      CutAngle cutAngle0 = CutAngles.createPositiveFacing(point1S0, (Precision.DoubleEquivalence) null);
      assertTrue(cutAngle0.isPositiveFacing());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CutAngle cutAngle0 = CutAngles.createPositiveFacing(Double.NEGATIVE_INFINITY, (Precision.DoubleEquivalence) null);
      assertTrue(cutAngle0.isPositiveFacing());
      assertEquals(Double.NEGATIVE_INFINITY, cutAngle0.getAzimuth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CutAngle cutAngle0 = CutAngles.createPositiveFacing(6.283185307179586, (Precision.DoubleEquivalence) null);
      assertTrue(cutAngle0.isPositiveFacing());
      assertEquals(6.283185307179586, cutAngle0.getAzimuth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CutAngle cutAngle0 = CutAngles.createPositiveFacing((-4948.84918513), (Precision.DoubleEquivalence) null);
      assertTrue(cutAngle0.isPositiveFacing());
      assertEquals((-4948.84918513), cutAngle0.getAzimuth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Angle.Deg angle_Deg0 = Angle.Deg.ZERO;
      Angle.Turn angle_Turn0 = angle_Deg0.toTurn();
      Angle.Rad angle_Rad0 = angle_Turn0.toRad();
      Point1S point1S0 = Point1S.of((Angle) angle_Rad0);
      CutAngle cutAngle0 = CutAngles.createNegativeFacing(point1S0, (Precision.DoubleEquivalence) null);
      assertFalse(cutAngle0.isPositiveFacing());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Point1S point1S0 = Point1S.NaN;
      CutAngle cutAngle0 = CutAngles.createNegativeFacing(point1S0, (Precision.DoubleEquivalence) null);
      assertFalse(cutAngle0.isPositiveFacing());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CutAngle cutAngle0 = CutAngles.createNegativeFacing(Double.NEGATIVE_INFINITY, (Precision.DoubleEquivalence) null);
      assertFalse(cutAngle0.isPositiveFacing());
      assertEquals(Double.NEGATIVE_INFINITY, cutAngle0.getAzimuth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CutAngle cutAngle0 = CutAngles.createNegativeFacing(598.6213745197335, (Precision.DoubleEquivalence) null);
      assertFalse(cutAngle0.isPositiveFacing());
      assertEquals(1.7187703376728223, cutAngle0.getNormalizedAzimuth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Point1S point1S0 = Point1S.NaN;
      CutAngle cutAngle0 = CutAngles.createPositiveFacing(point1S0, (Precision.DoubleEquivalence) null);
      assertTrue(cutAngle0.isPositiveFacing());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Point1S point1S0 = Point1S.of(Double.NEGATIVE_INFINITY);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      CutAngle cutAngle0 = CutAngles.createNegativeFacing(point1S0, precision_DoubleEquivalence0);
      assertFalse(cutAngle0.isPositiveFacing());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Point1S point1S0 = Point1S.of(Double.NEGATIVE_INFINITY);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      CutAngle cutAngle0 = CutAngles.fromPointAndDirection(point1S0, false, precision_DoubleEquivalence0);
      assertFalse(cutAngle0.isPositiveFacing());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CutAngle cutAngle0 = CutAngles.fromAzimuthAndDirection(0.0, true, (Precision.DoubleEquivalence) null);
      assertEquals(0.0, cutAngle0.getNormalizedAzimuth(), 0.01);
      assertTrue(cutAngle0.isPositiveFacing());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CutAngle cutAngle0 = CutAngles.createNegativeFacing(0.0, (Precision.DoubleEquivalence) null);
      assertEquals(0.0, cutAngle0.getAzimuth(), 0.01);
      assertFalse(cutAngle0.isPositiveFacing());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CutAngle cutAngle0 = CutAngles.createPositiveFacing(0.0, (Precision.DoubleEquivalence) null);
      assertTrue(cutAngle0.isPositiveFacing());
      assertEquals(0.0, cutAngle0.getAzimuth(), 0.01);
  }
}
