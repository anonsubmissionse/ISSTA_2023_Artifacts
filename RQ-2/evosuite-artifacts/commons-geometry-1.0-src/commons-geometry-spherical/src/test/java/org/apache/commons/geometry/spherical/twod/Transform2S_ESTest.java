/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:39:08 GMT 2022
 */

package org.apache.commons.geometry.spherical.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.geometry.euclidean.threed.AffineTransformMatrix3D;
import org.apache.commons.geometry.euclidean.threed.Vector3D;
import org.apache.commons.geometry.euclidean.threed.rotation.AxisAngleSequence;
import org.apache.commons.geometry.euclidean.threed.rotation.AxisSequence;
import org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation;
import org.apache.commons.geometry.spherical.twod.Point2S;
import org.apache.commons.geometry.spherical.twod.Transform2S;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Transform2S_ESTest extends Transform2S_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Transform2S transform2S0 = Transform2S.identity();
      Point2S point2S0 = Point2S.PLUS_J;
      Transform2S transform2S1 = transform2S0.rotate(point2S0, 1344.40420697);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_K;
      Transform2S transform2S0 = Transform2S.createRotation(point2S0, 2713.4540800283467);
      Point2S point2S1 = Point2S.PLUS_K;
      Point2S point2S2 = transform2S0.apply(point2S1);
      assertFalse(point2S2.isNaN());
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_K;
      Transform2S transform2S0 = Transform2S.createRotation(point2S0, 2713.4540800283467);
      Point2S point2S1 = transform2S0.apply(point2S0);
      assertEquals(0, point2S1.getDimension());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Transform2S transform2S0 = Transform2S.createReflection((Vector3D) vector3D_Unit0);
      Point2S point2S0 = Point2S.of((-2279.7187292381977), 1.0160400267861482);
      // Undeclared exception!
      try { 
        transform2S0.rotate(point2S0, Double.POSITIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Invalid angle: Infinity
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Point2S point2S0 = Point2S.PLUS_J;
      Transform2S transform2S0 = Transform2S.createReflection(point2S0);
      // Undeclared exception!
      try { 
        transform2S0.rotate((QuaternionRotation) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.spherical.twod.Transform2S", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_K;
      Transform2S transform2S0 = Transform2S.createReflection(point2S0);
      // Undeclared exception!
      try { 
        transform2S0.rotate((Vector3D) null, 1816.3051941957694);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_I;
      Transform2S transform2S0 = Transform2S.createReflection(point2S0);
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      // Undeclared exception!
      try { 
        transform2S0.rotate(vector3D0, (-3513.7380155));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: Infinity
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Transform2S transform2S0 = Transform2S.identity();
      // Undeclared exception!
      try { 
        transform2S0.reflect((Point2S) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.spherical.twod.Transform2S", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Transform2S transform2S0 = Transform2S.identity();
      // Undeclared exception!
      try { 
        transform2S0.reflect((Vector3D) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      AxisSequence axisSequence0 = AxisSequence.YZY;
      AxisAngleSequence axisAngleSequence0 = AxisAngleSequence.createAbsolute(axisSequence0, 0.017453292519943295, 0.017453292519943295, 0.017453292519943295);
      QuaternionRotation quaternionRotation0 = QuaternionRotation.fromAxisAngleSequence(axisAngleSequence0);
      Transform2S transform2S0 = Transform2S.createRotation(quaternionRotation0);
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      // Undeclared exception!
      try { 
        transform2S0.reflect(vector3D0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: Infinity
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Transform2S transform2S0 = Transform2S.identity();
      // Undeclared exception!
      try { 
        transform2S0.premultiply((Transform2S) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.spherical.twod.Transform2S", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Transform2S transform2S0 = Transform2S.identity();
      // Undeclared exception!
      try { 
        transform2S0.multiply((Transform2S) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.spherical.twod.Transform2S", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Point2S point2S0 = Point2S.NaN;
      // Undeclared exception!
      try { 
        Transform2S.createRotation(point2S0, 0.0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_K;
      // Undeclared exception!
      try { 
        Transform2S.createRotation(point2S0, Double.POSITIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Invalid angle: Infinity
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Transform2S.createRotation((QuaternionRotation) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.spherical.twod.Transform2S", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Transform2S.createRotation((Vector3D) null, 4.71238898038469);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      // Undeclared exception!
      try { 
        Transform2S.createRotation(vector3D0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: Infinity
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Point2S point2S0 = Point2S.NaN;
      // Undeclared exception!
      try { 
        Transform2S.createReflection(point2S0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Transform2S.createReflection((Vector3D) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_J;
      Vector3D.Unit vector3D_Unit0 = point2S0.getVector();
      Vector3D.Unit vector3D_Unit1 = vector3D_Unit0.negate();
      Vector3D vector3D0 = vector3D_Unit1.add((Vector3D) vector3D_Unit0);
      // Undeclared exception!
      try { 
        Transform2S.createReflection(vector3D0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: 0.0
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Transform2S transform2S0 = Transform2S.identity();
      // Undeclared exception!
      try { 
        transform2S0.apply((Point2S) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.spherical.twod.Transform2S", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AxisSequence axisSequence0 = AxisSequence.XYZ;
      Vector3D vector3D0 = axisSequence0.getAxis2();
      Transform2S transform2S0 = Transform2S.createRotation(vector3D0, 0.0);
      boolean boolean0 = transform2S0.preservesOrientation();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_K;
      Transform2S transform2S0 = Transform2S.createRotation(point2S0, (-285.69428));
      Transform2S transform2S1 = transform2S0.premultiply(transform2S0);
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_J;
      Transform2S transform2S0 = Transform2S.createReflection(point2S0);
      AffineTransformMatrix3D affineTransformMatrix3D0 = transform2S0.getEuclideanTransform();
      assertNotNull(affineTransformMatrix3D0);
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Transform2S transform2S0 = Transform2S.identity();
      Transform2S transform2S1 = transform2S0.inverse();
      boolean boolean0 = transform2S1.equals(transform2S0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QuaternionRotation quaternionRotation0 = QuaternionRotation.identity();
      Transform2S transform2S0 = Transform2S.createRotation(quaternionRotation0);
      boolean boolean0 = transform2S0.equals(transform2S0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Transform2S transform2S0 = Transform2S.identity();
      Object object0 = new Object();
      boolean boolean0 = transform2S0.equals(object0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Transform2S transform2S0 = Transform2S.identity();
      Point2S point2S0 = Point2S.PLUS_J;
      Point2S point2S1 = transform2S0.apply(point2S0);
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Transform2S transform2S0 = Transform2S.identity();
      Point2S point2S0 = Point2S.PLUS_J;
      Transform2S transform2S1 = transform2S0.reflect(point2S0);
      ;
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Transform2S transform2S0 = Transform2S.identity();
      Transform2S transform2S1 = transform2S0.multiply(transform2S0);
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Transform2S transform2S0 = Transform2S.identity();
      transform2S0.hashCode();
  }
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Transform2S transform2S0 = Transform2S.identity();
      Transform2S transform2S1 = transform2S0.reflect((Vector3D) vector3D_Unit0);
      ;
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Transform2S transform2S0 = Transform2S.identity();
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      QuaternionRotation quaternionRotation0 = QuaternionRotation.createVectorRotation(vector3D_Unit0, vector3D_Unit0);
      Transform2S transform2S1 = transform2S0.rotate(quaternionRotation0);
      ;
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_K;
      Transform2S transform2S0 = Transform2S.createReflection(point2S0);
      String string0 = transform2S0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Transform2S transform2S0 = Transform2S.identity();
      Transform2S transform2S1 = transform2S0.rotate((Vector3D) vector3D_Unit0, (-1987.92436));
      ;
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Point2S point2S0 = Point2S.PLUS_J;
      Transform2S transform2S0 = Transform2S.createReflection(point2S0);
      boolean boolean0 = transform2S0.preservesOrientation();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Transform2S transform2S0 = Transform2S.identity();
      Point2S point2S0 = Point2S.NaN;
      // Undeclared exception!
      try { 
        transform2S0.rotate(point2S0, (-3.141592653589793));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation", e);
      }
  }
}
