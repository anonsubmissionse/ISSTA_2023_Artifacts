/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:23:29 GMT 2022
 */

package org.apache.commons.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Stream;
import org.apache.commons.geometry.core.partitioning.HyperplaneConvexSubset;
import org.apache.commons.geometry.core.partitioning.Split;
import org.apache.commons.geometry.core.partitioning.SplitLocation;
import org.apache.commons.geometry.euclidean.threed.AffineTransformMatrix3D;
import org.apache.commons.geometry.euclidean.threed.ConvexVolume;
import org.apache.commons.geometry.euclidean.threed.EmbeddedAreaPlaneConvexSubset;
import org.apache.commons.geometry.euclidean.threed.EmbeddingPlane;
import org.apache.commons.geometry.euclidean.threed.Plane;
import org.apache.commons.geometry.euclidean.threed.PlaneConvexSubset;
import org.apache.commons.geometry.euclidean.threed.RegionBSPTree3D;
import org.apache.commons.geometry.euclidean.threed.Vector3D;
import org.apache.commons.geometry.euclidean.threed.rotation.AxisAngleSequence;
import org.apache.commons.geometry.euclidean.threed.rotation.AxisSequence;
import org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation;
import org.apache.commons.geometry.euclidean.twod.ConvexArea;
import org.apache.commons.numbers.core.Precision;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConvexVolume_ESTest extends ConvexVolume_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConvexVolume convexVolume0 = ConvexVolume.full();
      PlaneConvexSubset planeConvexSubset0 = convexVolume0.trim((HyperplaneConvexSubset<Vector3D>) null);
      assertNull(planeConvexSubset0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<Plane> priorityQueue0 = new PriorityQueue<Plane>(1, comparator0);
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from(1757.7687571062138, (-0.999999999999998), (-323.6600135));
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      QuaternionRotation quaternionRotation0 = QuaternionRotation.createVectorRotation(vector3D_Unit0, vector3D_Unit0);
      priorityQueue0.add(embeddingPlane0);
      ConvexVolume convexVolume0 = ConvexVolume.fromBounds((Iterable<? extends Plane>) priorityQueue0);
      ConvexVolume convexVolume1 = convexVolume0.transform(quaternionRotation0);
      assertFalse(convexVolume1.isFull());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from(1757.7687571062138, (-0.999999999999998), (-323.6600135));
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      ConvexVolume convexVolume0 = ConvexVolume.full();
      Split<ConvexVolume> split0 = convexVolume0.split(embeddingPlane0);
      assertEquals(SplitLocation.BOTH, split0.getLocation());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane((Vector3D.Unit) null, (Vector3D.Unit) null, (Vector3D.Unit) null, 2.409919865102884E-181, (Precision.DoubleEquivalence) null);
      Plane[] planeArray0 = new Plane[2];
      planeArray0[0] = (Plane) embeddingPlane0;
      planeArray0[1] = (Plane) embeddingPlane0;
      ConvexVolume convexVolume0 = ConvexVolume.fromBounds(planeArray0);
      assertFalse(convexVolume0.isFull());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<Plane> priorityQueue0 = new PriorityQueue<Plane>(1, comparator0);
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from(1779.0337350561774, (-0.999999999999998), (-323.6600135));
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      PlaneConvexSubset planeConvexSubset0 = embeddingPlane0.span();
      priorityQueue0.add(embeddingPlane0);
      ConvexVolume convexVolume0 = ConvexVolume.fromBounds((Iterable<? extends Plane>) priorityQueue0);
      // Undeclared exception!
      try { 
        convexVolume0.trim(planeConvexSubset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EmbeddedAreaPlaneConvexSubset embeddedAreaPlaneConvexSubset0 = new EmbeddedAreaPlaneConvexSubset((EmbeddingPlane) null, (ConvexArea) null);
      List<PlaneConvexSubset> list0 = embeddedAreaPlaneConvexSubset0.toConvex();
      ConvexVolume convexVolume0 = new ConvexVolume(list0);
      AxisSequence axisSequence0 = AxisSequence.YXY;
      AxisAngleSequence axisAngleSequence0 = AxisAngleSequence.createRelative(axisSequence0, 2872.5995, 2872.5995, 1652.5357475182805);
      QuaternionRotation quaternionRotation0 = QuaternionRotation.fromAxisAngleSequence(axisAngleSequence0);
      // Undeclared exception!
      try { 
        convexVolume0.transform(quaternionRotation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.EmbeddedAreaPlaneConvexSubset", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<Plane> priorityQueue0 = new PriorityQueue<Plane>(1, comparator0);
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from(1757.7687571062138, 8.287890347080895, (-323.6600135));
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      QuaternionRotation quaternionRotation0 = QuaternionRotation.createVectorRotation(vector3D_Unit0, vector3D_Unit0);
      priorityQueue0.add(embeddingPlane0);
      ConvexVolume convexVolume0 = ConvexVolume.fromBounds((Iterable<? extends Plane>) priorityQueue0);
      // Undeclared exception!
      try { 
        convexVolume0.transform(quaternionRotation0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: 0.0
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<PlaneConvexSubset> linkedList0 = new LinkedList<PlaneConvexSubset>();
      ConvexVolume convexVolume0 = new ConvexVolume(linkedList0);
      linkedList0.add((PlaneConvexSubset) null);
      // Undeclared exception!
      try { 
        convexVolume0.toTree();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.core.partitioning.bsp.AbstractBSPTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<PlaneConvexSubset> linkedList0 = new LinkedList<PlaneConvexSubset>();
      linkedList0.addLast((PlaneConvexSubset) null);
      ConvexVolume convexVolume0 = new ConvexVolume(linkedList0);
      // Undeclared exception!
      try { 
        convexVolume0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.ConvexVolume", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<PlaneConvexSubset> arrayList0 = new ArrayList<PlaneConvexSubset>();
      arrayList0.add((PlaneConvexSubset) null);
      ConvexVolume convexVolume0 = new ConvexVolume(arrayList0);
      // Undeclared exception!
      try { 
        convexVolume0.getCentroid();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.ConvexVolume", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConvexVolume.fromBounds((Plane[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConvexVolume.fromBounds((Iterable<? extends Plane>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.core.partitioning.AbstractConvexHyperplaneBoundedRegion$ConvexRegionBoundaryBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConvexVolume convexVolume0 = null;
      try {
        convexVolume0 = new ConvexVolume((List<PlaneConvexSubset>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<PlaneConvexSubset> linkedList0 = new LinkedList<PlaneConvexSubset>();
      ConvexVolume convexVolume0 = new ConvexVolume(linkedList0);
      Stream<PlaneConvexSubset> stream0 = convexVolume0.boundaryStream();
      assertNotNull(stream0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<Plane> priorityQueue0 = new PriorityQueue<Plane>(1, comparator0);
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from(1779.0337350561774, (-0.999999999999998), (-323.6600135));
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      PlaneConvexSubset planeConvexSubset0 = embeddingPlane0.span();
      ConvexVolume convexVolume0 = ConvexVolume.fromBounds((Iterable<? extends Plane>) priorityQueue0);
      PlaneConvexSubset planeConvexSubset1 = convexVolume0.trim(planeConvexSubset0);
      assertSame(planeConvexSubset1, planeConvexSubset0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<Plane> priorityQueue0 = new PriorityQueue<Plane>(1, comparator0);
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from(1757.7687571062138, 8.287890347080895, (-323.6600135));
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      priorityQueue0.add(embeddingPlane0);
      ConvexVolume convexVolume0 = ConvexVolume.fromBounds((Iterable<? extends Plane>) priorityQueue0);
      convexVolume0.getCentroid();
      assertFalse(convexVolume0.isFull());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConvexVolume convexVolume0 = ConvexVolume.full();
      Vector3D vector3D0 = convexVolume0.getCentroid();
      assertNull(vector3D0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConvexVolume convexVolume0 = ConvexVolume.full();
      double double0 = convexVolume0.getSize();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<Plane> priorityQueue0 = new PriorityQueue<Plane>(1, comparator0);
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from(1757.7687571062138, 8.287890347080895, (-323.6600135));
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      priorityQueue0.add(embeddingPlane0);
      ConvexVolume convexVolume0 = ConvexVolume.fromBounds((Iterable<? extends Plane>) priorityQueue0);
      double double0 = convexVolume0.getSize();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertFalse(convexVolume0.isFull());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Plane[] planeArray0 = new Plane[0];
      ConvexVolume convexVolume0 = ConvexVolume.fromBounds(planeArray0);
      assertFalse(convexVolume0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConvexVolume convexVolume0 = ConvexVolume.full();
      AffineTransformMatrix3D affineTransformMatrix3D0 = AffineTransformMatrix3D.identity();
      ConvexVolume convexVolume1 = convexVolume0.transform(affineTransformMatrix3D0);
      assertSame(convexVolume1, convexVolume0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PriorityQueue<Plane> priorityQueue0 = new PriorityQueue<Plane>();
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      EmbeddingPlane embeddingPlane0 = new EmbeddingPlane(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, 20, (Precision.DoubleEquivalence) null);
      priorityQueue0.add(embeddingPlane0);
      ConvexVolume convexVolume0 = ConvexVolume.fromBounds((Iterable<? extends Plane>) priorityQueue0);
      // Undeclared exception!
      try { 
        convexVolume0.split(embeddingPlane0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ConvexVolume convexVolume0 = ConvexVolume.full();
      RegionBSPTree3D regionBSPTree3D0 = convexVolume0.toTree();
      assertNotNull(regionBSPTree3D0);
  }
}
