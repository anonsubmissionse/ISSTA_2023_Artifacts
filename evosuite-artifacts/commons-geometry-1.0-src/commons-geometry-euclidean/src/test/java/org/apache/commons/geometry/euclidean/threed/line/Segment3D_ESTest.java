/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:27:48 GMT 2022
 */

package org.apache.commons.geometry.euclidean.threed.line;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.geometry.core.Transform;
import org.apache.commons.geometry.euclidean.threed.AffineTransformMatrix3D;
import org.apache.commons.geometry.euclidean.threed.Vector3D;
import org.apache.commons.geometry.euclidean.threed.line.Line3D;
import org.apache.commons.geometry.euclidean.threed.line.Segment3D;
import org.apache.commons.geometry.euclidean.threed.rotation.AxisAngleSequence;
import org.apache.commons.geometry.euclidean.threed.rotation.AxisSequence;
import org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation;
import org.apache.commons.numbers.core.Precision;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Segment3D_ESTest extends Segment3D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      QuaternionRotation quaternionRotation0 = QuaternionRotation.fromAxisAngle(vector3D_Unit0, 0.0);
      Line3D line3D1 = line3D0.transform(quaternionRotation0);
      Segment3D segment3D0 = new Segment3D(line3D1, 0.0, 2944.468259320761);
      Segment3D segment3D1 = segment3D0.transform(quaternionRotation0);
      assertEquals(2944.468259320761, segment3D0.getSubspaceEnd(), 0.01);
      assertEquals(0.0, segment3D0.getSubspaceStart(), 0.01);
      assertEquals(2944.468259320761, segment3D1.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AxisSequence axisSequence0 = AxisSequence.YZX;
      Vector3D vector3D0 = axisSequence0.getAxis2();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = line3D0.segment((-314.3618724531), (-314.3618724531));
      AffineTransformMatrix3D affineTransformMatrix3D0 = AffineTransformMatrix3D.createTranslation((-314.3618724531), -0.0, (-314.3618724531));
      Segment3D segment3D1 = segment3D0.transform(affineTransformMatrix3D0);
      assertEquals(0.0, segment3D1.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      QuaternionRotation quaternionRotation0 = QuaternionRotation.fromAxisAngle(vector3D_Unit0, 0.0);
      Segment3D segment3D0 = new Segment3D(line3D0, 0.0, 2944.468259320761);
      Segment3D segment3D1 = segment3D0.transform(quaternionRotation0);
      assertEquals(2944.468259320761, segment3D1.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Vector3D.Unit vector3D_Unit1 = Vector3D.Unit.MINUS_Y;
      Segment3D segment3D0 = new Segment3D(line3D0, vector3D_Unit0, vector3D_Unit1);
      QuaternionRotation quaternionRotation0 = QuaternionRotation.identity();
      Segment3D segment3D1 = segment3D0.transform(quaternionRotation0);
      assertEquals((-1.0), segment3D1.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = line3D0.segment((-685.3481604119322), (-685.3481604119322));
      String string0 = segment3D0.toString();
      assertEquals("Segment3D[startPoint= (NaN, NaN, NaN), endPoint= (NaN, NaN, NaN)]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D((Vector3D) null, vector3D0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = line3D0.segment(0.99, 0.99);
      double double0 = segment3D0.getSubspaceStart();
      assertEquals(0.99, double0, 0.01);
      assertEquals(0.0, segment3D0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Z;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = line3D0.segment((-1386.5325268167824), 2031.8038);
      double double0 = segment3D0.getSubspaceStart();
      assertEquals(3418.3363268167823, segment3D0.getSize(), 0.01);
      assertEquals((-1386.5325268167824), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AxisSequence axisSequence0 = AxisSequence.YZX;
      AxisAngleSequence axisAngleSequence0 = AxisAngleSequence.createAbsolute(axisSequence0, (-1640.398504), 0.0, 2553.6);
      QuaternionRotation quaternionRotation0 = QuaternionRotation.fromAxisAngleSequence(axisAngleSequence0);
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, vector3D_Unit0, vector3D_Unit0);
      Segment3D segment3D1 = segment3D0.transform(quaternionRotation0);
      double double0 = segment3D1.getSubspaceEnd();
      assertEquals(1.0000000000000002, double0, 0.01);
      assertEquals(1.0000000000000002, segment3D1.getSubspaceStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AxisSequence axisSequence0 = AxisSequence.YZX;
      Vector3D vector3D0 = axisSequence0.getAxis2();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = line3D0.segment((-314.3618724531), (-314.3618724531));
      double double0 = segment3D0.getSubspaceEnd();
      assertEquals((-314.3618724531), double0, 0.01);
      assertEquals((-314.3618724531), segment3D0.getSubspaceStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, 0.0, 0.0);
      segment3D0.getStartPoint();
      assertEquals(0.0, segment3D0.getSubspaceStart(), 0.01);
      assertEquals(0.0, segment3D0.getSubspaceEnd(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, vector3D_Unit0, vector3D_Unit0);
      segment3D0.getStartPoint();
      assertEquals(0.0, segment3D0.getSubspaceStart(), 0.01);
      assertEquals(0.0, segment3D0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, precision_DoubleEquivalence0);
      Line3D line3D1 = line3D0.reverse();
      Segment3D segment3D0 = line3D1.segment((-685.3481604119322), (-685.3481604119322));
      Vector3D vector3D1 = segment3D0.getStartPoint();
      assertEquals(0.0, segment3D0.getSize(), 0.01);
      assertFalse(vector3D1.isNaN());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D0, vector3D_Unit0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, (-1535.9261648285), 0.0);
      double double0 = segment3D0.getSize();
      assertEquals(0.0, segment3D0.getSubspaceEnd(), 0.01);
      assertEquals(1535.9261648285, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Z;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, 40.6994953, (-1573.842106557279));
      double double0 = segment3D0.getSize();
      assertEquals((-1614.5416018572791), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, (-685.3481604119322), 2917.062984585159);
      Vector3D vector3D1 = segment3D0.getEndPoint();
      assertEquals(3602.4111449970915, segment3D0.getSize(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, vector3D1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Vector3D.Unit vector3D_Unit1 = Vector3D.Unit.MINUS_Y;
      Segment3D segment3D0 = new Segment3D(line3D0, vector3D_Unit0, vector3D_Unit1);
      Vector3D vector3D0 = segment3D0.getEndPoint();
      assertEquals(0.0, vector3D0.getX(), 0.01);
      assertEquals((-1.0), segment3D0.getSize(), 0.01);
      assertEquals(0.0, segment3D0.getSubspaceStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D0, vector3D_Unit0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, vector3D0, vector3D0);
      Vector3D vector3D1 = segment3D0.getEndPoint();
      assertFalse(vector3D1.equals((Object)vector3D0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from((-1.0), 3929.8, (-764.655335));
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = line3D0.segment(0.0, 1.0);
      Vector3D vector3D1 = segment3D0.getCentroid();
      assertEquals(Double.NEGATIVE_INFINITY, vector3D1.getZ(), 0.01);
      assertEquals(0.0, segment3D0.getSubspaceStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, (Precision.DoubleEquivalence) null);
      Segment3D segment3D0 = new Segment3D(line3D0, 0.0, 3.0);
      Vector3D vector3D1 = segment3D0.getCentroid();
      assertEquals(3.0, segment3D0.getSize(), 0.01);
      assertEquals(0.0, segment3D0.getSubspaceStart(), 0.01);
      assertEquals(0.0, vector3D1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, (Precision.DoubleEquivalence) null);
      Segment3D segment3D0 = line3D0.segment(1359.141177885, (-1.0));
      segment3D0.getCentroid();
      assertEquals(1360.141177885, segment3D0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, (Precision.DoubleEquivalence) null);
      Segment3D segment3D0 = line3D0.segment(1359.141177885, (-1.0));
      // Undeclared exception!
      try { 
        segment3D0.transform((Transform<Vector3D>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.line.Segment3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      Line3D line3D0 = new Line3D(vector3D0, vector3D_Unit0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, vector3D0, vector3D0);
      QuaternionRotation quaternionRotation0 = QuaternionRotation.identity();
      // Undeclared exception!
      try { 
        segment3D0.transform(quaternionRotation0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: NaN
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Segment3D segment3D0 = new Segment3D((Line3D) null, 0.0, 0.0);
      // Undeclared exception!
      try { 
        segment3D0.getStartPoint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.line.Segment3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Segment3D segment3D0 = new Segment3D((Line3D) null, 2231.829805811, 2231.829805811);
      // Undeclared exception!
      try { 
        segment3D0.getEndPoint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.line.Segment3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Line3D line3D0 = new Line3D((Vector3D) null, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      Segment3D segment3D0 = new Segment3D(line3D0, 1053.21, 1.0);
      // Undeclared exception!
      try { 
        segment3D0.getCentroid();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.Vector3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D((Vector3D) null, (Vector3D) null, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, Double.NaN, (-595.8));
      // Undeclared exception!
      try { 
        segment3D0.getBounds();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.Vector3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = line3D0.segment(0.0, 0.0);
      // Undeclared exception!
      try { 
        segment3D0.getBounds();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Invalid bounds: min= (NaN, NaN, NaN), max= (NaN, NaN, NaN)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.Bounds3D$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Y;
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      Segment3D segment3D0 = line3D0.segment((-1.0), (-1.0));
      // Undeclared exception!
      try { 
        segment3D0.containsAbscissa((-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.line.Segment3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Segment3D segment3D0 = null;
      try {
        segment3D0 = new Segment3D((Line3D) null, vector3D0, vector3D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.line.Segment3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, vector3D_Unit0, vector3D_Unit0);
      double double0 = segment3D0.getSubspaceStart();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, segment3D0.getSubspaceEnd(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AxisSequence axisSequence0 = AxisSequence.YXZ;
      Vector3D vector3D0 = axisSequence0.getAxis1();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = line3D0.segment((-632.28202), 1465.59499);
      Vector3D vector3D1 = segment3D0.getStartPoint();
      assertEquals(2097.87701, segment3D0.getSize(), 0.01);
      assertEquals((-631.28202), vector3D1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, vector3D_Unit0, vector3D_Unit0);
      double double0 = segment3D0.getSubspaceEnd();
      assertEquals(0.0, segment3D0.getSubspaceStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(precision_DoubleEquivalence0).gte(anyDouble() , anyDouble());
      doReturn(true, false).when(precision_DoubleEquivalence0).lte(anyDouble() , anyDouble());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = line3D0.segment((Vector3D) vector3D_Unit0, (Vector3D) vector3D_Unit0);
      boolean boolean0 = segment3D0.containsAbscissa(2898.822843266);
      assertTrue(boolean0);
      
      boolean boolean1 = segment3D0.containsAbscissa(2898.822843266);
      assertFalse(boolean1);
      assertEquals(0.0, segment3D0.getSubspaceStart(), 0.01);
      assertEquals(0.0, segment3D0.getSubspaceEnd(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.of((-682.0350125669876), (-682.0350125669876), (-682.0350125669876));
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(precision_DoubleEquivalence0).gte(anyDouble() , anyDouble());
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, vector3D0, vector3D0);
      boolean boolean0 = segment3D0.containsAbscissa((-682.0350125669876));
      assertFalse(boolean0);
      assertEquals(0.0, segment3D0.getSubspaceStart(), 0.01);
      assertEquals(0.0, segment3D0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AxisSequence axisSequence0 = AxisSequence.YZX;
      Vector3D vector3D0 = axisSequence0.getAxis1();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, vector3D0, vector3D0);
      double double0 = segment3D0.getSize();
      assertEquals(0.0, segment3D0.getSubspaceStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AxisSequence axisSequence0 = AxisSequence.YZX;
      Vector3D vector3D0 = axisSequence0.getAxis1();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, vector3D0, vector3D0);
      segment3D0.getBounds();
      assertEquals(0.0, segment3D0.getSubspaceStart(), 0.01);
      assertEquals(0.0, segment3D0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AxisSequence axisSequence0 = AxisSequence.YZX;
      Vector3D vector3D0 = axisSequence0.getAxis1();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, vector3D0, vector3D0);
      boolean boolean0 = segment3D0.isInfinite();
      assertFalse(boolean0);
      assertEquals(0.0, segment3D0.getSubspaceStart(), 0.01);
      assertEquals(0.0, segment3D0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AxisSequence axisSequence0 = AxisSequence.YZX;
      Vector3D vector3D0 = axisSequence0.getAxis1();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, precision_DoubleEquivalence0);
      Segment3D segment3D0 = new Segment3D(line3D0, vector3D0, vector3D0);
      boolean boolean0 = segment3D0.isFinite();
      assertEquals(0.0, segment3D0.getSubspaceStart(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, segment3D0.getSubspaceEnd(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Segment3D segment3D0 = new Segment3D((Line3D) null, -0.0, (-1036.6559));
      // Undeclared exception!
      try { 
        segment3D0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.line.Segment3D", e);
      }
  }
}
