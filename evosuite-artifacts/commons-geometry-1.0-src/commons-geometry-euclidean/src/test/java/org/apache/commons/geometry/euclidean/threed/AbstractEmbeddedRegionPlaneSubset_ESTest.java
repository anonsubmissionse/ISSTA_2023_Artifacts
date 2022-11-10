/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:27:46 GMT 2022
 */

package org.apache.commons.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ServiceLoader;
import org.apache.commons.geometry.euclidean.threed.AffineTransformMatrix3D;
import org.apache.commons.geometry.euclidean.threed.Bounds3D;
import org.apache.commons.geometry.euclidean.threed.EmbeddedAreaPlaneConvexSubset;
import org.apache.commons.geometry.euclidean.threed.EmbeddedTreePlaneSubset;
import org.apache.commons.geometry.euclidean.threed.EmbeddingPlane;
import org.apache.commons.geometry.euclidean.threed.Plane;
import org.apache.commons.geometry.euclidean.threed.Vector3D;
import org.apache.commons.geometry.euclidean.twod.BoundaryList2D;
import org.apache.commons.geometry.euclidean.twod.BoundarySource2D;
import org.apache.commons.geometry.euclidean.twod.ConvexArea;
import org.apache.commons.geometry.euclidean.twod.Line;
import org.apache.commons.geometry.euclidean.twod.RegionBSPTree2D;
import org.apache.commons.geometry.euclidean.twod.Segment;
import org.apache.commons.geometry.euclidean.twod.Vector2D;
import org.apache.commons.numbers.core.Precision;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractEmbeddedRegionPlaneSubset_ESTest extends AbstractEmbeddedRegionPlaneSubset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from((-3371.7777156316), (-3371.7777156316), (-3371.7777156316));
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (-3371.7777156316), (Precision.DoubleEquivalence) null);
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = (EmbeddedAreaPlaneConvexSubset)embeddingPlane0.span();
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector2D vector2D0 = embeddedAreaPlaneConvexSubset0.toSubspace(vector3D0);
      assertFalse(vector2D0.isNaN());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      Vector3D.Unit vector3D_Unit1 = vector3D_Unit0.negate();
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit1, vector3D_Unit1, vector3D_Unit1, (-348.2803), (Precision.DoubleEquivalence) null);
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset(embeddingPlane0);
      Vector2D vector2D0 = embeddedTreePlaneSubset0.toSubspace((Vector3D) vector3D_Unit0);
      assertFalse(vector2D0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (-3371.7777156316), (Precision.DoubleEquivalence) null);
      ConvexArea convexArea0 = ConvexArea.full();
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset(embeddingPlane0, convexArea0);
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Vector3D vector3D0 = embeddedAreaPlaneConvexSubset0.toSpace((Vector2D) vector2D_Unit0);
      assertEquals(3, vector3D0.getDimension());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Z;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset(embeddingPlane0, false);
      Vector2D vector2D0 = embeddedTreePlaneSubset0.toSubspace((Vector3D) vector3D_Unit0);
      Vector3D vector3D0 = embeddedTreePlaneSubset0.toSpace(vector2D0);
      assertFalse(vector3D0.isNaN());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      Plane plane0 = new Plane(vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      EmbeddingPlane embeddingPlane0 = plane0.getEmbedding();
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset(embeddingPlane0, false);
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_Y;
      Vector3D vector3D0 = embeddedTreePlaneSubset0.toSpace((Vector2D) vector2D_Unit0);
      assertEquals(1.0, vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Y;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset(embeddingPlane0, (RegionBSPTree2D) null);
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Vector3D vector3D0 = embeddedTreePlaneSubset0.toSpace((Vector2D) vector2D_Unit0);
      assertEquals((-1.0), vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset(embeddingPlane0, false);
      Vector2D vector2D0 = embeddedTreePlaneSubset0.toSubspace((Vector3D) vector3D_Unit0);
      Vector3D vector3D0 = embeddedTreePlaneSubset0.toSpace(vector2D0);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      Plane plane0 = new Plane(vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      EmbeddingPlane embeddingPlane0 = plane0.getEmbedding();
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset(embeddingPlane0, false);
      Vector2D vector2D0 = embeddedTreePlaneSubset0.toSubspace((Vector3D) vector3D_Unit0);
      Vector3D vector3D0 = embeddedTreePlaneSubset0.toSpace(vector2D0);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegionBSPTree2D regionBSPTree2D0 = RegionBSPTree2D.full();
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset((EmbeddingPlane) null, regionBSPTree2D0);
      boolean boolean0 = embeddedTreePlaneSubset0.isFull();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset((EmbeddingPlane) null);
      double double0 = embeddedTreePlaneSubset0.getSize();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset((EmbeddingPlane) null, true);
      double double0 = embeddedTreePlaneSubset0.getSize();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      Plane plane0 = new Plane(vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      EmbeddingPlane embeddingPlane0 = plane0.getEmbedding();
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset(embeddingPlane0, false);
      EmbeddingPlane embeddingPlane1 = embeddedTreePlaneSubset0.getPlane();
      assertSame(embeddingPlane1, embeddingPlane0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      Plane plane0 = new Plane(vector3D_Unit0, 2.326559996988609, (Precision.DoubleEquivalence) null);
      EmbeddingPlane embeddingPlane0 = plane0.getEmbedding();
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset(embeddingPlane0, false);
      EmbeddingPlane embeddingPlane1 = embeddedTreePlaneSubset0.getPlane();
      assertSame(embeddingPlane0, embeddingPlane1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from((-3371.7777156316), (-3371.7777156316), (-3371.7777156316));
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 1401.79195, (Precision.DoubleEquivalence) null);
      EmbeddingPlane embeddingPlane1 = embeddingPlane0.reverse();
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset(embeddingPlane1, true);
      EmbeddingPlane embeddingPlane2 = embeddedTreePlaneSubset0.getPlane();
      assertSame(embeddingPlane2, embeddingPlane1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from((-3371.7777156316), (-3371.7777156316), (-3371.7777156316));
      Vector3D.Unit vector3D_Unit1 = Vector3D.Unit.MINUS_X;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit1, vector3D_Unit1, (-3371.7777156316), (Precision.DoubleEquivalence) null);
      AffineTransformMatrix3D affineTransformMatrix3D0 = AffineTransformMatrix3D.identity();
      EmbeddingPlane embeddingPlane1 = embeddingPlane0.transform(affineTransformMatrix3D0);
      EmbeddingPlane embeddingPlane2 = embeddingPlane1.reverse();
      Line[] lineArray0 = new Line[0];
      ConvexArea convexArea0 = ConvexArea.fromBounds(lineArray0);
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset(embeddingPlane2, convexArea0);
      EmbeddingPlane embeddingPlane3 = embeddedAreaPlaneConvexSubset0.getHyperplane();
      assertSame(embeddingPlane2, embeddingPlane3);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Z;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 3185.749783716974, (Precision.DoubleEquivalence) null);
      LinkedList<Segment> linkedList0 = new LinkedList<Segment>();
      BoundaryList2D boundaryList2D0 = new BoundaryList2D(linkedList0);
      RegionBSPTree2D regionBSPTree2D0 = boundaryList2D0.toTree();
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset(embeddingPlane0, regionBSPTree2D0);
      EmbeddingPlane embeddingPlane1 = embeddedTreePlaneSubset0.getHyperplane();
      assertSame(embeddingPlane1, embeddingPlane0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset((EmbeddingPlane) null);
      RegionBSPTree2D regionBSPTree2D0 = new RegionBSPTree2D();
      Bounds3D bounds3D0 = embeddedTreePlaneSubset0.getBoundsFromSubspace(regionBSPTree2D0);
      assertNull(bounds3D0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset(embeddingPlane0);
      Vector3D vector3D0 = embeddedTreePlaneSubset0.closest((Vector3D) vector3D_Unit0);
      assertNull(vector3D0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Y;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (-3371.7777156316), (Precision.DoubleEquivalence) null);
      ConvexArea convexArea0 = ConvexArea.full();
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset(embeddingPlane0, convexArea0);
      Vector3D vector3D0 = embeddedAreaPlaneConvexSubset0.closest((Vector3D) vector3D_Unit0);
      assertFalse(vector3D0.isNaN());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from(2217.090778, 2217.090778, 2217.090778);
      Plane plane0 = new Plane(vector3D_Unit0, (-1566.1538540243407), (Precision.DoubleEquivalence) null);
      EmbeddingPlane embeddingPlane0 = plane0.getEmbedding();
      Line[] lineArray0 = new Line[0];
      ConvexArea convexArea0 = ConvexArea.fromBounds(lineArray0);
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset(embeddingPlane0, convexArea0);
      Vector3D vector3D0 = embeddedAreaPlaneConvexSubset0.closest((Vector3D) vector3D_Unit0);
      assertFalse(vector3D0.isNaN());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (-130.17871645), (Precision.DoubleEquivalence) null);
      Class<Line> class0 = Line.class;
      ServiceLoader<Line> serviceLoader0 = ServiceLoader.load(class0);
      ConvexArea convexArea0 = ConvexArea.fromBounds((Iterable<Line>) serviceLoader0);
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset(embeddingPlane0, convexArea0);
      Vector3D vector3D0 = embeddedAreaPlaneConvexSubset0.closest((Vector3D) vector3D_Unit0);
      assertFalse(vector3D0.isNaN());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane((Vector3D.Unit) null, (Vector3D.Unit) null, (Vector3D.Unit) null, 0.0, (Precision.DoubleEquivalence) null);
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset(embeddingPlane0, (RegionBSPTree2D) null);
      // Undeclared exception!
      try { 
        embeddedTreePlaneSubset0.toSubspace((Vector3D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.EmbeddingPlane", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset((EmbeddingPlane) null, (RegionBSPTree2D) null);
      // Undeclared exception!
      try { 
        embeddedTreePlaneSubset0.isEmpty();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.AbstractEmbeddedRegionPlaneSubset", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset((EmbeddingPlane) null, (ConvexArea) null);
      // Undeclared exception!
      try { 
        embeddedAreaPlaneConvexSubset0.getCentroid();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.AbstractEmbeddedRegionPlaneSubset", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset((EmbeddingPlane) null, (ConvexArea) null);
      // Undeclared exception!
      try { 
        embeddedAreaPlaneConvexSubset0.getBoundsFromSubspace((BoundarySource2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.AbstractEmbeddedRegionPlaneSubset", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset((EmbeddingPlane) null, (ConvexArea) null);
      // Undeclared exception!
      try { 
        embeddedAreaPlaneConvexSubset0.isFull();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.AbstractEmbeddedRegionPlaneSubset", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ConvexArea convexArea0 = ConvexArea.full();
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset((EmbeddingPlane) null, convexArea0);
      EmbeddingPlane embeddingPlane0 = embeddedAreaPlaneConvexSubset0.getPlane();
      assertNull(embeddingPlane0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ConvexArea convexArea0 = ConvexArea.full();
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset((EmbeddingPlane) null, convexArea0);
      String string0 = embeddedAreaPlaneConvexSubset0.toString();
      assertEquals("EmbeddedAreaPlaneConvexSubset[plane= null, subspaceRegion= ConvexArea[boundaries= []]]", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset((EmbeddingPlane) null, (ConvexArea) null);
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      // Undeclared exception!
      try { 
        embeddedAreaPlaneConvexSubset0.classify(vector3D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.core.internal.HyperplaneSubsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from((-3371.7777156316), (-3371.7777156316), (-3371.7777156316));
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (-3371.7777156316), (Precision.DoubleEquivalence) null);
      Line[] lineArray0 = new Line[0];
      ConvexArea convexArea0 = ConvexArea.fromBounds(lineArray0);
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset(embeddingPlane0, convexArea0);
      EmbeddingPlane embeddingPlane1 = embeddedAreaPlaneConvexSubset0.getHyperplane();
      assertSame(embeddingPlane1, embeddingPlane0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ConvexArea convexArea0 = ConvexArea.full();
      Vector2D[] vector2DArray0 = new Vector2D[3];
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset((EmbeddingPlane) null, convexArea0);
      // Undeclared exception!
      try { 
        embeddedAreaPlaneConvexSubset0.toSpace(vector2DArray0[0]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.AbstractEmbeddedRegionPlaneSubset", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedList<Line> linkedList0 = new LinkedList<Line>();
      HashSet<Line> hashSet0 = new HashSet<Line>(linkedList0);
      ConvexArea convexArea0 = ConvexArea.fromBounds((Iterable<Line>) hashSet0);
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset((EmbeddingPlane) null, convexArea0);
      boolean boolean0 = embeddedAreaPlaneConvexSubset0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset((EmbeddingPlane) null, (ConvexArea) null);
      // Undeclared exception!
      try { 
        embeddedAreaPlaneConvexSubset0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.AbstractEmbeddedRegionPlaneSubset", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from((-3371.7777156316), (-3371.7777156316), (-3371.7777156316));
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (-3371.7777156316), (Precision.DoubleEquivalence) null);
      ConvexArea convexArea0 = ConvexArea.full();
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset(embeddingPlane0, convexArea0);
      Vector3D vector3D0 = embeddedAreaPlaneConvexSubset0.closest((Vector3D) vector3D_Unit0);
      assertEquals((-1947.851472305865), vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ConvexArea convexArea0 = ConvexArea.full();
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset((EmbeddingPlane) null, convexArea0);
      Vector3D vector3D0 = embeddedAreaPlaneConvexSubset0.getCentroid();
      assertNull(vector3D0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset((EmbeddingPlane) null);
      boolean boolean0 = embeddedTreePlaneSubset0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset((EmbeddingPlane) null);
      boolean boolean0 = embeddedTreePlaneSubset0.isFull();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset((EmbeddingPlane) null);
      EmbeddingPlane embeddingPlane0 = embeddedTreePlaneSubset0.getHyperplane();
      assertNull(embeddingPlane0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RegionBSPTree2D regionBSPTree2D0 = RegionBSPTree2D.empty();
      EmbeddedTreePlaneSubset embeddedTreePlaneSubset0 = new EmbeddedTreePlaneSubset((EmbeddingPlane) null, regionBSPTree2D0);
      // Undeclared exception!
      try { 
        embeddedTreePlaneSubset0.closest((Vector3D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.core.internal.HyperplaneSubsets", e);
      }
  }
}
