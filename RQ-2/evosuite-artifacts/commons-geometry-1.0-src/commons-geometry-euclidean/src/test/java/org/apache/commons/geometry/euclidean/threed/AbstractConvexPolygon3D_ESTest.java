/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:06:09 GMT 2022
 */

package org.apache.commons.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.apache.commons.geometry.euclidean.threed.Bounds3D;
import org.apache.commons.geometry.euclidean.threed.EmbeddingPlane;
import org.apache.commons.geometry.euclidean.threed.Plane;
import org.apache.commons.geometry.euclidean.threed.SimpleTriangle3D;
import org.apache.commons.geometry.euclidean.threed.Vector3D;
import org.apache.commons.geometry.euclidean.threed.VertexListConvexPolygon3D;
import org.apache.commons.geometry.euclidean.threed.rotation.AxisSequence;
import org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation;
import org.apache.commons.numbers.core.Precision;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractConvexPolygon3D_ESTest extends AbstractConvexPolygon3D_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from((-1281.5664889383), (-9.28), 0.0);
      Vector3D.Unit vector3D_Unit1 = vector3D_Unit0.orthogonal();
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit1, (-1837.39), (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane0, vector3D_Unit0, vector3D_Unit1, vector3D_Unit1);
      // Undeclared exception!
      try { 
        simpleTriangle3D0.closest((Vector3D) vector3D_Unit1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.AbstractConvexPolygon3D", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      Plane plane0 = embeddingPlane0.reverse();
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(plane0, vector3D_Unit0, vector3D_Unit0, vector3D_Unit0);
      // Undeclared exception!
      try { 
        simpleTriangle3D0.closest(vector3D_Unit0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: 0.0
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Plane plane0 = new Plane(vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(plane0, vector3D_Unit0, vector3D_Unit0, vector3D_Unit0);
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      // Undeclared exception!
      try { 
        simpleTriangle3D0.closest(vector3D0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: 0.0
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      Plane plane0 = new Plane(vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(plane0, vector3D_Unit0, (Vector3D) null, vector3D_Unit0);
      SimpleTriangle3D simpleTriangle3D1 = simpleTriangle3D0.reverse();
      // Undeclared exception!
      try { 
        simpleTriangle3D1.closest((Vector3D) vector3D_Unit0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.AbstractConvexPolygon3D", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (-0.5322896399820491), (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane0, vector3D_Unit0, vector3D_Unit0, vector3D_Unit0);
      List<Vector3D> list0 = simpleTriangle3D0.getVertices();
      Vector<Vector3D> vector0 = new Vector<Vector3D>(list0);
      Vector3D vector3D0 = Vector3D.NaN;
      vector0.add(vector3D0);
      VertexListConvexPolygon3D vertexListConvexPolygon3D0 = new VertexListConvexPolygon3D(embeddingPlane0, vector0);
      double double0 = vertexListConvexPolygon3D0.getSize();
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Z;
      Vector3D.Unit vector3D_Unit1 = Vector3D.Unit.PLUS_X;
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D((Plane) null, vector3D_Unit0, vector3D_Unit0, vector3D_Unit1);
      List<Vector3D> list0 = simpleTriangle3D0.getVertices();
      VertexListConvexPolygon3D vertexListConvexPolygon3D0 = new VertexListConvexPolygon3D((Plane) null, list0);
      // Undeclared exception!
      try { 
        vertexListConvexPolygon3D0.getSize();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.AbstractConvexPolygon3D", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Z;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.651, (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane0, vector3D_Unit0, vector3D_Unit0, vector3D_Unit0);
      List<Vector3D> list0 = simpleTriangle3D0.getVertices();
      Vector<Vector3D> vector0 = new Vector<Vector3D>(list0);
      VertexListConvexPolygon3D vertexListConvexPolygon3D0 = new VertexListConvexPolygon3D(embeddingPlane0, vector0);
      AxisSequence axisSequence0 = AxisSequence.XYX;
      Vector3D vector3D0 = axisSequence0.getAxis2();
      vector0.add(vector3D0);
      double double0 = vertexListConvexPolygon3D0.getSize();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Y;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (-1491.0), (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane0, vector3D_Unit0, vector3D_Unit0, vector3D_Unit0);
      boolean boolean0 = simpleTriangle3D0.isFull();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from((-616.6), (-1485.8777994), (-616.6));
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (-1.0), (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane0, vector3D_Unit0, vector3D_Unit0, vector3D_Unit0);
      boolean boolean0 = simpleTriangle3D0.isEmpty();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      Vector3D.Unit vector3D_Unit1 = Vector3D.Unit.MINUS_Z;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit1, 967.9, (Precision.DoubleEquivalence) null);
      Vector3D.Unit vector3D_Unit2 = vector3D_Unit0.negate();
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane0, vector3D_Unit0, vector3D_Unit2, vector3D_Unit1);
      double double0 = simpleTriangle3D0.getSize();
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Y;
      Vector3D.Unit vector3D_Unit1 = Vector3D.Unit.PLUS_X;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit1, vector3D_Unit1, (-1491.0), (Precision.DoubleEquivalence) null);
      QuaternionRotation quaternionRotation0 = QuaternionRotation.identity();
      EmbeddingPlane embeddingPlane1 = embeddingPlane0.rotate(vector3D_Unit1, quaternionRotation0);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane1, vector3D_Unit1, vector3D_Unit1, vector3D_Unit1);
      Plane plane0 = simpleTriangle3D0.getPlane();
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Y;
      Vector3D.Unit vector3D_Unit1 = Vector3D.Unit.PLUS_X;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit1, vector3D_Unit1, (-1491.0), (Precision.DoubleEquivalence) null);
      QuaternionRotation quaternionRotation0 = QuaternionRotation.fromAxisAngle(vector3D_Unit1, (-1491.0));
      Plane plane0 = embeddingPlane0.rotate(vector3D_Unit0, quaternionRotation0);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(plane0, vector3D_Unit1, vector3D_Unit1, vector3D_Unit1);
      Plane plane1 = simpleTriangle3D0.getPlane();
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 2554.89, (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane0, vector3D_Unit0, vector3D_Unit0, vector3D_Unit0);
      SimpleTriangle3D simpleTriangle3D1 = simpleTriangle3D0.reverse();
      Plane plane0 = simpleTriangle3D1.getPlane();
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (-0.5322896399820491), (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane0, vector3D_Unit0, vector3D_Unit0, vector3D_Unit0);
      List<Vector3D> list0 = simpleTriangle3D0.getVertices();
      Vector<Vector3D> vector0 = new Vector<Vector3D>(list0);
      Vector3D vector3D0 = Vector3D.NaN;
      vector0.add(vector3D0);
      VertexListConvexPolygon3D vertexListConvexPolygon3D0 = new VertexListConvexPolygon3D(embeddingPlane0, vector0);
      Vector3D vector3D1 = vertexListConvexPolygon3D0.getCentroid();
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D((Plane) null, vector3D0, vector3D_Unit0, vector3D0);
      List<Vector3D> list0 = simpleTriangle3D0.getVertices();
      VertexListConvexPolygon3D vertexListConvexPolygon3D0 = new VertexListConvexPolygon3D((Plane) null, list0);
      Vector3D vector3D1 = vertexListConvexPolygon3D0.getCentroid();
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Z;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.651, (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane0, vector3D_Unit0, vector3D_Unit0, vector3D_Unit0);
      List<Vector3D> list0 = simpleTriangle3D0.getVertices();
      Vector<Vector3D> vector0 = new Vector<Vector3D>(list0);
      VertexListConvexPolygon3D vertexListConvexPolygon3D0 = new VertexListConvexPolygon3D(embeddingPlane0, vector0);
      Vector3D vector3D0 = vertexListConvexPolygon3D0.getCentroid();
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AxisSequence axisSequence0 = AxisSequence.XYX;
      Vector3D vector3D0 = axisSequence0.getAxis1();
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D((Plane) null, vector3D0, vector3D0, vector3D0);
      Vector3D vector3D1 = simpleTriangle3D0.getCentroid();
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D((Plane) null, vector3D0, vector3D0, vector3D0);
      Bounds3D bounds3D0 = simpleTriangle3D0.getBounds();
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D((Plane) null, (Vector3D) null, (Vector3D) null, (Vector3D) null);
      // Undeclared exception!
      try { 
        simpleTriangle3D0.toString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.AbstractConvexPolygon3D", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Z;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.5, (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane0, vector3D_Unit0, vector3D_Unit0, vector3D_Unit0);
      List<Vector3D> list0 = simpleTriangle3D0.getVertices();
      Vector<Vector3D> vector0 = new Vector<Vector3D>(list0);
      VertexListConvexPolygon3D vertexListConvexPolygon3D0 = new VertexListConvexPolygon3D(embeddingPlane0, vector0);
      vector0.setSize(0);
      // Undeclared exception!
      try { 
        vertexListConvexPolygon3D0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Y;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (-1491.0), (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane0, vector3D_Unit0, vector3D_Unit0, vector3D_Unit0);
      // Undeclared exception!
      try { 
        simpleTriangle3D0.getEmbedded();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // Unable to create line segment: no vertex precision specified
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.path.LinePath$Builder", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Z;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.5, (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane0, vector3D_Unit0, vector3D_Unit0, vector3D_Unit0);
      List<Vector3D> list0 = simpleTriangle3D0.getVertices();
      Vector<Vector3D> vector0 = new Vector<Vector3D>(list0);
      VertexListConvexPolygon3D vertexListConvexPolygon3D0 = new VertexListConvexPolygon3D(embeddingPlane0, vector0);
      vector0.setSize(0);
      // Undeclared exception!
      try { 
        vertexListConvexPolygon3D0.getCentroid();
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector$Itr", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Y;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (-1281.5664889383), (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane0, (Vector3D) null, vector3D_Unit0, vector3D_Unit0);
      // Undeclared exception!
      try { 
        simpleTriangle3D0.getCentroid();
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
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D((Plane) null, vector3D0, vector3D_Unit0, vector3D0);
      // Undeclared exception!
      try { 
        simpleTriangle3D0.getBounds();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // Invalid bounds: min= (0.0, 1.0, 0.0), max= (Infinity, Infinity, Infinity)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.Bounds3D$Builder", e);
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AxisSequence axisSequence0 = AxisSequence.XYX;
      Vector3D vector3D0 = axisSequence0.getAxis1();
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D((Plane) null, vector3D0, vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        simpleTriangle3D0.classify(vector3D0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.AbstractConvexPolygon3D", e);
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D((Plane) null, vector3D_Unit0, vector3D_Unit0, vector3D_Unit0);
      Plane plane0 = simpleTriangle3D0.getPlane();
      assertNotNull(plane0);
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Z;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (-3379.2156456329853), (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane0, vector3D_Unit0, vector3D_Unit0, vector3D_Unit0);
      // Undeclared exception!
      try { 
        simpleTriangle3D0.split(embeddingPlane0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.core.partitioning.AbstractHyperplane", e);
      }
  }
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (-172.70274903296), (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(embeddingPlane0, vector3D_Unit0, vector3D_Unit0, vector3D_Unit0);
      String string0 = simpleTriangle3D0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      Plane plane0 = new Plane(vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D(plane0, vector3D_Unit0, vector3D_Unit0, (Vector3D) null);
      // Undeclared exception!
      try { 
        simpleTriangle3D0.getEmbedded();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.EmbeddingPlane", e);
      }
  }
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleTriangle3D simpleTriangle3D0 = new SimpleTriangle3D((Plane) null, (Vector3D) null, (Vector3D) null, (Vector3D) null);
      // Undeclared exception!
      try { 
        simpleTriangle3D0.getBounds();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.Bounds3D$Builder", e);
      }
  }
}
