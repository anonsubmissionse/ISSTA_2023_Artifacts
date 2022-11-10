/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:30:11 GMT 2022
 */

package org.apache.commons.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.apache.commons.geometry.core.partitioning.HyperplaneSubset;
import org.apache.commons.geometry.euclidean.twod.BoundarySource2D;
import org.apache.commons.geometry.euclidean.twod.BoundarySourceLinecaster2D;
import org.apache.commons.geometry.euclidean.twod.ConvexArea;
import org.apache.commons.geometry.euclidean.twod.Line;
import org.apache.commons.geometry.euclidean.twod.LineConvexSubset;
import org.apache.commons.geometry.euclidean.twod.LineSpanningSubset;
import org.apache.commons.geometry.euclidean.twod.LinecastPoint2D;
import org.apache.commons.geometry.euclidean.twod.Ray;
import org.apache.commons.geometry.euclidean.twod.RegionBSPTree2D;
import org.apache.commons.geometry.euclidean.twod.ReverseRay;
import org.apache.commons.geometry.euclidean.twod.Vector2D;
import org.apache.commons.geometry.euclidean.twod.path.LinePath;
import org.apache.commons.numbers.core.Precision;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Linecastable2D_ESTest extends Linecastable2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector<LineConvexSubset> vector0 = new Vector<LineConvexSubset>();
      ConvexArea convexArea0 = new ConvexArea(vector0);
      LinecastPoint2D linecastPoint2D0 = convexArea0.linecastFirst((LineConvexSubset) null);
      assertNull(linecastPoint2D0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayDeque<Line> arrayDeque0 = new ArrayDeque<Line>((-1969));
      ConvexArea convexArea0 = ConvexArea.fromBounds((Iterable<Line>) arrayDeque0);
      List<LinecastPoint2D> list0 = convexArea0.linecast((LineConvexSubset) null);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Stack<Vector2D> stack0 = new Stack<Vector2D>();
      LinePath linePath0 = LinePath.fromVertexLoop(stack0, (Precision.DoubleEquivalence) null);
      BoundarySourceLinecaster2D boundarySourceLinecaster2D0 = new BoundarySourceLinecaster2D(linePath0);
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Line line0 = new Line(vector2D_Unit0, (-556.56), (Precision.DoubleEquivalence) null);
      List<LinecastPoint2D> list0 = boundarySourceLinecaster2D0.linecast(line0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BoundarySourceLinecaster2D boundarySourceLinecaster2D0 = new BoundarySourceLinecaster2D((BoundarySource2D) null);
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_Y;
      ReverseRay reverseRay0 = new ReverseRay((Line) null, vector2D_Unit0);
      // Undeclared exception!
      try { 
        boundarySourceLinecaster2D0.linecastFirst((LineConvexSubset) reverseRay0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.BoundarySourceLinecaster2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<LineConvexSubset> arrayList0 = new ArrayList<LineConvexSubset>();
      ConvexArea convexArea0 = new ConvexArea(arrayList0);
      // Undeclared exception!
      try { 
        convexArea0.linecastFirst((Line) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Linecastable2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LineConvexSubset[] lineConvexSubsetArray0 = new LineConvexSubset[7];
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line line0 = new Line(vector2D_Unit0, (-1417.090830279304), precision_DoubleEquivalence0);
      BoundarySource2D boundarySource2D0 = BoundarySource2D.of(lineConvexSubsetArray0);
      // Undeclared exception!
      try { 
        boundarySource2D0.linecastFirst(line0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.BoundarySourceLinecaster2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RegionBSPTree2D regionBSPTree2D0 = new RegionBSPTree2D();
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      Line line0 = new Line(vector2D_Unit0, (-471.169090101708), (Precision.DoubleEquivalence) null);
      Ray ray0 = line0.rayFrom((Vector2D) vector2D_Unit0);
      ReverseRay reverseRay0 = ray0.reverse();
      regionBSPTree2D0.insert((HyperplaneSubset<Vector2D>) reverseRay0);
      // Undeclared exception!
      try { 
        regionBSPTree2D0.linecast((LineConvexSubset) ray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RegionBSPTree2D regionBSPTree2D0 = new RegionBSPTree2D();
      // Undeclared exception!
      try { 
        regionBSPTree2D0.linecast((Line) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Linecastable2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      HashSet<Vector2D> hashSet0 = new HashSet<Vector2D>();
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line line0 = new Line(vector2D_Unit0, (-1417.090830279304), precision_DoubleEquivalence0);
      LineSpanningSubset lineSpanningSubset0 = new LineSpanningSubset(line0);
      Precision.DoubleEquivalence precision_DoubleEquivalence1 = lineSpanningSubset0.getPrecision();
      LinePath linePath0 = LinePath.fromVertices((Collection<Vector2D>) hashSet0, true, precision_DoubleEquivalence1);
      LinecastPoint2D linecastPoint2D0 = linePath0.linecastFirst(line0);
      assertNull(linecastPoint2D0);
  }
}
