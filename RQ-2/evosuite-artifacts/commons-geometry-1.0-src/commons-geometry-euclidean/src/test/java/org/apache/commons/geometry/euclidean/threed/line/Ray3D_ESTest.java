/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:30:30 GMT 2022
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
import org.apache.commons.geometry.euclidean.threed.line.Ray3D;
import org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation;
import org.apache.commons.numbers.core.Precision;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Ray3D_ESTest extends Ray3D_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from(0.0, 209.566459, 0.0);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      QuaternionRotation quaternionRotation0 = QuaternionRotation.identity();
      Line3D line3D1 = line3D0.transform(quaternionRotation0);
      Ray3D ray3D0 = line3D1.rayFrom(0.0);
      Ray3D ray3D1 = ray3D0.transform(quaternionRotation0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Z;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Line3D line3D1 = line3D0.reverse();
      Ray3D ray3D0 = new Ray3D(line3D1, vector3D_Unit0);
      AffineTransformMatrix3D affineTransformMatrix3D0 = AffineTransformMatrix3D.createTranslation((Vector3D) vector3D_Unit0);
      Ray3D ray3D1 = ray3D0.transform(affineTransformMatrix3D0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = new Ray3D(line3D0, 514.836082786626);
      double double0 = ray3D0.getSubspaceStart();
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = new Ray3D(line3D0, Double.NEGATIVE_INFINITY);
      double double0 = ray3D0.getSubspaceStart();
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from(33.82, 33.82, 3852.8055061);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Ray3D ray3D0 = new Ray3D(line3D0, vector3D0);
      Vector3D vector3D1 = ray3D0.getStartPoint();
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Vector3D vector3D0 = Vector3D.of(0.6, 0.6, 0.6);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D0, precision_DoubleEquivalence0);
      AffineTransformMatrix3D affineTransformMatrix3D0 = AffineTransformMatrix3D.createTranslation((Vector3D) vector3D_Unit0);
      Line3D line3D1 = line3D0.transform(affineTransformMatrix3D0);
      Ray3D ray3D0 = line3D1.rayFrom((Vector3D) vector3D_Unit0);
      Vector3D vector3D1 = ray3D0.getStartPoint();
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((-1753.6));
      Vector3D vector3D0 = ray3D0.getStartPoint();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      Ray3D ray3D0 = line3D0.rayFrom(0.0);
      ray3D0.getStartPoint();
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = new Ray3D(line3D0, Double.NEGATIVE_INFINITY);
      Vector3D vector3D0 = ray3D0.getStartPoint();
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      Line3D line3D0 = new Line3D(vector3D_Unit0, (Vector3D) null, (Precision.DoubleEquivalence) null);
      Ray3D ray3D0 = line3D0.rayFrom(0.0);
      ray3D0.getDirection();
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Vector3D vector3D0 = Vector3D.NaN;
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = new Ray3D(line3D0, 596.1166395764305);
      ray3D0.getDirection();
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D0, vector3D0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = new Ray3D(line3D0, 7.888609052210118E-31);
      ray3D0.getDirection();
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      Ray3D ray3D0 = line3D0.rayFrom(0.0);
      ray3D0.getDirection();
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = new Ray3D(line3D0, 514.836082786626);
      ray3D0.getDirection();
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from(33.82, 33.82, 3852.8055061);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Line3D line3D1 = line3D0.reverse();
      Ray3D ray3D0 = new Ray3D(line3D1, vector3D_Unit0);
      ray3D0.getDirection();
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(precision_DoubleEquivalence0).gte(anyDouble() , anyDouble());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = new Ray3D(line3D0, Double.NEGATIVE_INFINITY);
      ray3D0.containsAbscissa(Double.NEGATIVE_INFINITY);
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.of(928.23512, 928.23512, 928.23512);
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = new Ray3D(line3D0, vector3D_Unit0);
      // Undeclared exception!
      try { 
        ray3D0.transform((Transform<Vector3D>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.line.Line3D", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = new Ray3D(line3D0, Double.NEGATIVE_INFINITY);
      AffineTransformMatrix3D affineTransformMatrix3D0 = AffineTransformMatrix3D.fromColumnVectors((Vector3D) vector3D_Unit0, (Vector3D) vector3D_Unit0, (Vector3D) vector3D_Unit0);
      ray3D0.transform(affineTransformMatrix3D0);
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Ray3D ray3D0 = new Ray3D((Line3D) null, (-560.15652));
      // Undeclared exception!
      try { 
        ray3D0.toString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.line.Ray3D", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Ray3D ray3D0 = new Ray3D((Line3D) null, 1522.579);
      // Undeclared exception!
      try { 
        ray3D0.getDirection();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.line.Ray3D", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Ray3D ray3D0 = new Ray3D((Line3D) null, 4.149515568880993E180);
      // Undeclared exception!
      try { 
        ray3D0.containsAbscissa(2179.155);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.line.Ray3D", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D((Vector3D) null, (Vector3D) null, precision_DoubleEquivalence0);
      Ray3D ray3D0 = null;
      try {
        ray3D0 = new Ray3D(line3D0, (Vector3D) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.line.Line3D", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D((Vector3D) null, (Vector3D) null, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((-2815.1672));
      // Undeclared exception!
      try { 
        ray3D0.getStartPoint();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.Vector3D", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((Vector3D) vector3D_Unit0);
      double double0 = ray3D0.getSubspaceStart();
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((Vector3D) vector3D_Unit0);
      boolean boolean0 = ray3D0.isInfinite();
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((Vector3D) vector3D_Unit0);
      boolean boolean0 = ray3D0.isInfinite();
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((Vector3D) vector3D_Unit0);
      boolean boolean0 = ray3D0.isFinite();
      ;
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((Vector3D) vector3D_Unit0);
      boolean boolean0 = ray3D0.isFinite();
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((Vector3D) vector3D_Unit0);
      double double0 = ray3D0.getSize();
      ;
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((Vector3D) vector3D_Unit0);
      double double0 = ray3D0.getSize();
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(precision_DoubleEquivalence0).gte(anyDouble() , anyDouble());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((Vector3D) vector3D_Unit0);
      ray3D0.containsAbscissa(Double.POSITIVE_INFINITY);
      ;
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((Vector3D) vector3D_Unit0);
      double double0 = ray3D0.getSubspaceEnd();
      ;
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((Vector3D) vector3D_Unit0);
      double double0 = ray3D0.getSubspaceEnd();
      ;
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((Vector3D) vector3D_Unit0);
      String string0 = ray3D0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((Vector3D) vector3D_Unit0);
      String string0 = ray3D0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((Vector3D) vector3D_Unit0);
      ray3D0.getEndPoint();
      ;
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((Vector3D) vector3D_Unit0);
      ray3D0.getBounds();
      ;
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line3D line3D0 = new Line3D(vector3D_Unit0, vector3D_Unit0, precision_DoubleEquivalence0);
      Ray3D ray3D0 = line3D0.rayFrom((Vector3D) vector3D_Unit0);
      ray3D0.getCentroid();
      ;
}
}
