/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:22:05 GMT 2022
 */

package org.apache.commons.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.geometry.euclidean.twod.Line;
import org.apache.commons.geometry.euclidean.twod.LinecastPoint2D;
import org.apache.commons.geometry.euclidean.twod.Vector2D;
import org.apache.commons.numbers.core.Precision;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinecastPoint2D_ESTest extends LinecastPoint2D_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        LinecastPoint2D.sortAndFilter((List<LinecastPoint2D>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.LinecastPoint2D", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      LinecastPoint2D linecastPoint2D0 = null;
      try {
        linecastPoint2D0 = new LinecastPoint2D(vector2D_Unit0, vector2D_Unit0, (Line) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.AbstractLinecastPoint", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line line0 = new Line(vector2D_Unit0, 329.09138994, precision_DoubleEquivalence0);
      LinecastPoint2D linecastPoint2D0 = null;
      try {
        linecastPoint2D0 = new LinecastPoint2D(vector2D0, vector2D0, line0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: Infinity
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line line0 = new Line(vector2D_Unit0, (-2623.47), precision_DoubleEquivalence0);
      Line line1 = line0.reverse();
      Vector2D vector2D0 = line1.getOrigin();
      LinecastPoint2D linecastPoint2D0 = new LinecastPoint2D(vector2D0, vector2D_Unit0, line1);
      line1.rayFrom(vector2D0);
      line0.getOrigin();
      LinecastPoint2D linecastPoint2D1 = new LinecastPoint2D(vector2D0, vector2D_Unit0, line1);
      Precision.DoubleEquivalence precision_DoubleEquivalence1 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(precision_DoubleEquivalence1).eq(anyDouble() , anyDouble());
      boolean boolean0 = linecastPoint2D0.eq(linecastPoint2D1, precision_DoubleEquivalence1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.from(0.5, (-1651.215310164));
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line line0 = new Line(vector2D_Unit0, (-1651.215310164), precision_DoubleEquivalence0);
      LinecastPoint2D linecastPoint2D0 = new LinecastPoint2D(vector2D_Unit0, vector2D_Unit0, line0);
      Precision.DoubleEquivalence precision_DoubleEquivalence1 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, false).when(precision_DoubleEquivalence1).eq(anyDouble() , anyDouble());
      boolean boolean0 = linecastPoint2D0.eq(linecastPoint2D0, precision_DoubleEquivalence1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<LinecastPoint2D> arrayList0 = new ArrayList<LinecastPoint2D>();
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.from((-1.5707963267948966), (-1.5707963267948966));
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      Line line0 = new Line(vector2D_Unit0, 408.369189, precision_DoubleEquivalence0);
      LinecastPoint2D linecastPoint2D0 = new LinecastPoint2D(vector2D_Unit0, vector2D_Unit0, line0);
      arrayList0.add(linecastPoint2D0);
      Precision.DoubleEquivalence precision_DoubleEquivalence1 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, false, true, true).when(precision_DoubleEquivalence1).eq(anyDouble() , anyDouble());
      Line line1 = new Line(vector2D_Unit0, 1.5707963267948966, precision_DoubleEquivalence1);
      LinecastPoint2D linecastPoint2D1 = new LinecastPoint2D(vector2D_Unit0, vector2D_Unit0, line1);
      arrayList0.add(linecastPoint2D1);
      LinecastPoint2D.sortAndFilter(arrayList0);
      LinecastPoint2D.sortAndFilter(arrayList0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ArrayList<LinecastPoint2D> arrayList0 = new ArrayList<LinecastPoint2D>();
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.from((-1.5707963267948966), (-1.5707963267948966));
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      Line line0 = new Line(vector2D_Unit0, 408.369189, precision_DoubleEquivalence0);
      LinecastPoint2D linecastPoint2D0 = new LinecastPoint2D(vector2D_Unit0, vector2D_Unit0, line0);
      arrayList0.add(linecastPoint2D0);
      Precision.DoubleEquivalence precision_DoubleEquivalence1 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, false, true, true).when(precision_DoubleEquivalence1).eq(anyDouble() , anyDouble());
      Line line1 = new Line(vector2D_Unit0, 1.5707963267948966, precision_DoubleEquivalence1);
      LinecastPoint2D linecastPoint2D1 = new LinecastPoint2D(vector2D_Unit0, vector2D_Unit0, line1);
      arrayList0.add(linecastPoint2D1);
      LinecastPoint2D.sortAndFilter(arrayList0);
      LinecastPoint2D.sortAndFilter(arrayList0);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line line0 = new Line(vector2D_Unit0, Double.POSITIVE_INFINITY, precision_DoubleEquivalence0);
      LinecastPoint2D linecastPoint2D0 = new LinecastPoint2D(vector2D_Unit0, vector2D_Unit0, line0);
      // Undeclared exception!
      try { 
        linecastPoint2D0.eq((LinecastPoint2D) null, (Precision.DoubleEquivalence) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.LinecastPoint2D", e);
      }
  }
}
