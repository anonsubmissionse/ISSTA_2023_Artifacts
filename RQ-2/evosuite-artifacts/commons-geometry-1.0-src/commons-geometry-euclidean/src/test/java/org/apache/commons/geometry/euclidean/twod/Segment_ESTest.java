/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:17:00 GMT 2022
 */

package org.apache.commons.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.geometry.core.RegionLocation;
import org.apache.commons.geometry.core.partitioning.Split;
import org.apache.commons.geometry.core.partitioning.SplitLocation;
import org.apache.commons.geometry.euclidean.twod.AffineTransformMatrix2D;
import org.apache.commons.geometry.euclidean.twod.Bounds2D;
import org.apache.commons.geometry.euclidean.twod.Line;
import org.apache.commons.geometry.euclidean.twod.LineConvexSubset;
import org.apache.commons.geometry.euclidean.twod.Segment;
import org.apache.commons.geometry.euclidean.twod.Vector2D;
import org.apache.commons.geometry.euclidean.twod.rotation.Rotation2D;
import org.apache.commons.numbers.core.Precision;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Segment_ESTest extends Segment_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(685, 0, 0, 685).when(precision_DoubleEquivalence0).compare(anyDouble() , anyDouble());
      Line line0 = new Line(vector2D_Unit0, 34.0, precision_DoubleEquivalence0);
      Segment segment0 = line0.segment((double) 685, 34.0);
      RegionLocation regionLocation0 = segment0.classifyAbscissa((-26.09893));
      assertNotNull(regionLocation0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(685, 0, 0, 685).when(precision_DoubleEquivalence0).compare(anyDouble() , anyDouble());
      Line line0 = new Line(vector2D_Unit0, 34.0, precision_DoubleEquivalence0);
      Segment segment0 = line0.segment((double) 685, 34.0);
      RegionLocation regionLocation0 = segment0.classifyAbscissa((-26.09893));
      Split<LineConvexSubset> split0 = segment0.splitOnIntersection(line0, vector2D_Unit0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      doReturn(precision_DoubleEquivalence0).when(line0).getPrecision();
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      Precision.DoubleEquivalence precision_DoubleEquivalence1 = segment0.getPrecision();
      Line line1 = new Line(vector2D_Unit0, (-11.9), precision_DoubleEquivalence1);
      AffineTransformMatrix2D affineTransformMatrix2D0 = AffineTransformMatrix2D.createScale((-4147.236968782993), 877.080733214);
      Line line2 = line1.transform(affineTransformMatrix2D0);
      Line line3 = line2.reverse();
      Segment segment1 = line3.segment((Vector2D) vector2D_Unit0, (Vector2D) vector2D_Unit0);
      double double0 = segment1.getSubspaceStart();
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      doReturn(precision_DoubleEquivalence0).when(line0).getPrecision();
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      Precision.DoubleEquivalence precision_DoubleEquivalence1 = segment0.getPrecision();
      Line line1 = new Line(vector2D_Unit0, 4.0, precision_DoubleEquivalence1);
      Segment segment1 = line1.segment((-1081.43827089), 1611.0);
      double double0 = segment1.getSubspaceStart();
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Line line0 = new Line(vector2D_Unit0, 12.0, (Precision.DoubleEquivalence) null);
      Segment segment0 = line0.segment(12.0, 0.0);
      Segment segment1 = segment0.reverse();
      double double0 = segment1.getSubspaceEnd();
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.from(0.0, (-0.9999999999));
      Line line0 = new Line(vector2D_Unit0, (-0.9999999999), (Precision.DoubleEquivalence) null);
      Line line1 = line0.reverse();
      Segment segment0 = line1.segment((Vector2D) vector2D_Unit0, (Vector2D) vector2D_Unit0);
      double double0 = segment0.getSubspaceEnd();
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      Segment segment0 = new Segment(line0, (Vector2D) null, vector2D_Unit0);
      Vector2D vector2D0 = segment0.getStartPoint();
      assertNotNull(vector2D0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Line line0 = new Line(vector2D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      Segment segment0 = line0.segment(0.0, (-2797.40037));
      Segment segment1 = segment0.reverse();
      Vector2D vector2D0 = segment1.getStartPoint();
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Rotation2D rotation2D0 = Rotation2D.of(4.0);
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.from(1611.0, 1611.0);
      Line line0 = new Line(vector2D_Unit0, 4.0, precision_DoubleEquivalence0);
      Segment segment0 = new Segment(line0, vector2D0, vector2D0);
      Segment segment1 = segment0.transform(rotation2D0);
      Vector2D vector2D1 = segment1.getStartPoint();
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Line line0 = new Line(vector2D_Unit0, 0.0, (Precision.DoubleEquivalence) null);
      Segment segment0 = line0.segment(0.0, (-2797.40037));
      double double0 = segment0.getSize();
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      Line line1 = mock(Line.class, new ViolatedAssumptionAnswer());
      doReturn(line0).when(line1).reverse();
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Segment segment0 = new Segment(line1, vector2D0, vector2D_Unit0);
      Segment segment1 = segment0.reverse();
      Vector2D vector2D1 = segment1.getEndPoint();
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Vector2D.Unit vector2D_Unit1 = Vector2D.Unit.MINUS_Y;
      Line line0 = new Line(vector2D_Unit1, 664.0, (Precision.DoubleEquivalence) null);
      Segment segment0 = line0.segment((Vector2D) vector2D_Unit0, (Vector2D) vector2D_Unit0);
      Vector2D vector2D0 = segment0.getEndPoint();
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Rotation2D rotation2D0 = Rotation2D.identity();
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Vector2D vector2D1 = rotation2D0.applyVector(vector2D0);
      Segment segment0 = new Segment((Line) null, vector2D0, vector2D1);
      Vector2D vector2D2 = segment0.getEndPoint();
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      Vector2D vector2D0 = segment0.getEndPoint();
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Segment segment0 = new Segment(line0, vector2D0, vector2D0);
      Vector2D vector2D1 = segment0.getCentroid();
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line line0 = new Line(vector2D_Unit0, 0.0, precision_DoubleEquivalence0);
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      Vector2D vector2D0 = segment0.getCentroid();
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Line line0 = new Line(vector2D_Unit0, (-615.9521807791863), (Precision.DoubleEquivalence) null);
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      Vector2D vector2D0 = segment0.getCentroid();
      assertFalse(vector2D0.isNaN());
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      Segment segment0 = new Segment((Line) null, vector2D0, vector2D0);
      Vector2D vector2D1 = segment0.getCentroid();
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(line0).abscissa(any(org.apache.commons.geometry.euclidean.twod.Vector2D.class));
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      double double0 = segment0.closestAbscissa(1.0);
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.from(0.0, (-0.9999999999));
      Line line0 = new Line(vector2D_Unit0, (-0.9999999999), (Precision.DoubleEquivalence) null);
      Line line1 = line0.reverse();
      Segment segment0 = line1.segment((Vector2D) vector2D_Unit0, (Vector2D) vector2D_Unit0);
      double double0 = segment0.closestAbscissa(666.0);
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Line line0 = new Line(vector2D_Unit0, 0.5, (Precision.DoubleEquivalence) null);
      Segment segment0 = line0.segment((Vector2D) vector2D_Unit0, (Vector2D) vector2D_Unit0);
      AffineTransformMatrix2D affineTransformMatrix2D0 = AffineTransformMatrix2D.createScale(0.5, (-1670.0));
      // Undeclared exception!
      try { 
        segment0.transform(affineTransformMatrix2D0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Vector2D", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Line line0 = new Line(vector2D_Unit0, (-2907.999033695), (Precision.DoubleEquivalence) null);
      Segment segment0 = line0.segment(369.8, (-2907.999033695));
      // Undeclared exception!
      try { 
        segment0.splitOnIntersection(line0, vector2D_Unit0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Segment", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.from((-2195.06489869156), (-2195.06489869156));
      Segment segment0 = new Segment((Line) null, vector2D_Unit0, vector2D_Unit0);
      // Undeclared exception!
      try { 
        segment0.reverse();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Segment", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Segment segment0 = new Segment((Line) null, (Vector2D) null, (Vector2D) null);
      // Undeclared exception!
      try { 
        segment0.getSubspaceStart();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Segment", e);
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      doReturn((Line) null).when(line0).reverse();
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      Segment segment1 = segment0.reverse();
      // Undeclared exception!
      try { 
        segment1.getSubspaceEnd();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Segment", e);
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      doReturn(precision_DoubleEquivalence0).when(line0).getPrecision();
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      Precision.DoubleEquivalence precision_DoubleEquivalence1 = segment0.getPrecision();
      Line line1 = new Line(vector2D_Unit0, 0.0, precision_DoubleEquivalence1);
      Segment segment1 = new Segment(line1, vector2D_Unit0, (Vector2D) null);
      // Undeclared exception!
      try { 
        segment1.getSize();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Vector2D", e);
      }
  }
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Segment segment0 = new Segment((Line) null, (Vector2D) null, (Vector2D) null);
      // Undeclared exception!
      try { 
        segment0.getBounds();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Bounds2D$Builder", e);
      }
  }
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Segment segment0 = new Segment(line0, vector2D0, vector2D_Unit0);
      // Undeclared exception!
      try { 
        segment0.getBounds();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // Invalid bounds: min= (-Infinity, -Infinity), max= (1.0, 0.0)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Bounds2D$Builder", e);
      }
  }
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_Y;
      Segment segment0 = new Segment((Line) null, vector2D_Unit0, vector2D_Unit0);
      // Undeclared exception!
      try { 
        segment0.closestAbscissa(1399.9324);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Segment", e);
      }
  }
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Segment segment0 = new Segment((Line) null, vector2D0, vector2D0);
      // Undeclared exception!
      try { 
        segment0.classifyAbscissa((-1558.7));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.LineSubset", e);
      }
  }
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Line line0 = new Line(vector2D_Unit0, (-2907.999033695), (Precision.DoubleEquivalence) null);
      Segment segment0 = line0.segment(369.8, (-2907.999033695));
      double double0 = segment0.getSubspaceEnd();
      ;
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      Segment segment0 = new Segment(line0, (Vector2D) null, (Vector2D) null);
      Vector2D vector2D0 = segment0.getEndPoint();
      assertNotNull(vector2D0);
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.from(1611.0, 1611.0);
      Line line0 = new Line(vector2D_Unit0, 4.0, precision_DoubleEquivalence0);
      Segment segment0 = new Segment(line0, vector2D0, vector2D0);
      Vector2D vector2D1 = segment0.getStartPoint();
      ;
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(line0).abscissa(any(org.apache.commons.geometry.euclidean.twod.Vector2D.class));
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      double double0 = segment0.getSubspaceStart();
      ;
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(886, (-28), 886, 886).when(precision_DoubleEquivalence0).compare(anyDouble() , anyDouble());
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      doReturn(precision_DoubleEquivalence0).when(line0).getPrecision();
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      Precision.DoubleEquivalence precision_DoubleEquivalence1 = segment0.getPrecision();
      Line line1 = new Line(vector2D_Unit0, 128.8, precision_DoubleEquivalence1);
      Split<LineConvexSubset> split0 = segment0.splitOnIntersection(line1, vector2D_Unit0);
      ;
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(886, (-28), 886, 886).when(precision_DoubleEquivalence0).compare(anyDouble() , anyDouble());
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      doReturn(precision_DoubleEquivalence0).when(line0).getPrecision();
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      Precision.DoubleEquivalence precision_DoubleEquivalence1 = segment0.getPrecision();
      Line line1 = new Line(vector2D_Unit0, 128.8, precision_DoubleEquivalence1);
      Split<LineConvexSubset> split0 = segment0.splitOnIntersection(line1, vector2D_Unit0);
      Split<LineConvexSubset> split1 = segment0.splitOnIntersection(line1, vector2D_Unit0);
      ;
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(886, (-1)).when(precision_DoubleEquivalence0).compare(anyDouble() , anyDouble());
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      doReturn(precision_DoubleEquivalence0).when(line0).getPrecision();
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      Precision.DoubleEquivalence precision_DoubleEquivalence1 = segment0.getPrecision();
      Line line1 = new Line(vector2D_Unit0, 0.0, precision_DoubleEquivalence1);
      Split<LineConvexSubset> split0 = segment0.splitOnIntersection(line1, (Vector2D) null);
      ;
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn((-1058), 0, (-1058)).when(precision_DoubleEquivalence0).compare(anyDouble() , anyDouble());
      Line line0 = new Line(vector2D_Unit0, (-11.9), precision_DoubleEquivalence0);
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      RegionLocation regionLocation0 = segment0.classifyAbscissa(0);
      assertNotNull(regionLocation0);
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn((-1058), 0, (-1058)).when(precision_DoubleEquivalence0).compare(anyDouble() , anyDouble());
      Line line0 = new Line(vector2D_Unit0, (-11.9), precision_DoubleEquivalence0);
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      RegionLocation regionLocation0 = segment0.classifyAbscissa(0);
      Split<LineConvexSubset> split0 = segment0.splitOnIntersection(line0, vector2D_Unit0);
      ;
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(685, 0, 0, 0).when(precision_DoubleEquivalence0).compare(anyDouble() , anyDouble());
      Line line0 = new Line(vector2D_Unit0, 34.0, precision_DoubleEquivalence0);
      Segment segment0 = line0.segment((double) 685, 34.0);
      RegionLocation regionLocation0 = segment0.classifyAbscissa((-26.09893));
      assertNotNull(regionLocation0);
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(685, 0, 0, 0).when(precision_DoubleEquivalence0).compare(anyDouble() , anyDouble());
      Line line0 = new Line(vector2D_Unit0, 34.0, precision_DoubleEquivalence0);
      Segment segment0 = line0.segment((double) 685, 34.0);
      RegionLocation regionLocation0 = segment0.classifyAbscissa((-26.09893));
      Split<LineConvexSubset> split0 = segment0.splitOnIntersection(line0, vector2D_Unit0);
      ;
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(precision_DoubleEquivalence0).compare(anyDouble() , anyDouble());
      Line line0 = new Line(vector2D_Unit0, 1901.8352, precision_DoubleEquivalence0);
      Segment segment0 = line0.segment((Vector2D) vector2D_Unit0, (Vector2D) vector2D_Unit0);
      RegionLocation regionLocation0 = segment0.classifyAbscissa((-1553.145598056131));
      assertNotNull(regionLocation0);
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(685, 0, (-1), 685, 685).when(precision_DoubleEquivalence0).compare(anyDouble() , anyDouble());
      Line line0 = new Line(vector2D_Unit0, 9.313225746154785E-10, precision_DoubleEquivalence0);
      Segment segment0 = line0.segment((Vector2D) vector2D_Unit0, (Vector2D) vector2D_Unit0);
      RegionLocation regionLocation0 = segment0.classifyAbscissa(685);
      assertNotNull(regionLocation0);
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(685, 0, (-1), 685, 685).when(precision_DoubleEquivalence0).compare(anyDouble() , anyDouble());
      Line line0 = new Line(vector2D_Unit0, 9.313225746154785E-10, precision_DoubleEquivalence0);
      Segment segment0 = line0.segment((Vector2D) vector2D_Unit0, (Vector2D) vector2D_Unit0);
      RegionLocation regionLocation0 = segment0.classifyAbscissa(685);
      Split<LineConvexSubset> split0 = segment0.splitOnIntersection(line0, vector2D_Unit0);
      ;
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(685, 0, (-1), 685, 685).when(precision_DoubleEquivalence0).compare(anyDouble() , anyDouble());
      Line line0 = new Line(vector2D_Unit0, 9.313225746154785E-10, precision_DoubleEquivalence0);
      Segment segment0 = line0.segment((Vector2D) vector2D_Unit0, (Vector2D) vector2D_Unit0);
      RegionLocation regionLocation0 = segment0.classifyAbscissa(685);
      Split<LineConvexSubset> split0 = segment0.splitOnIntersection(line0, vector2D_Unit0);
      RegionLocation regionLocation1 = segment0.classifyAbscissa(9.313225746154785E-10);
      ;
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line line0 = new Line(vector2D_Unit0, (-11.9), precision_DoubleEquivalence0);
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      boolean boolean0 = segment0.isFull();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Line line0 = new Line(vector2D_Unit0, (-615.9521807791863), (Precision.DoubleEquivalence) null);
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      double double0 = segment0.getSize();
      ;
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_Y;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line line0 = new Line(vector2D_Unit0, 34.0, precision_DoubleEquivalence0);
      Segment segment0 = line0.segment((double) 685, 34.0);
      boolean boolean0 = segment0.isFinite();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line line0 = new Line(vector2D_Unit0, 9.313225746154785E-10, precision_DoubleEquivalence0);
      Segment segment0 = line0.segment((Vector2D) vector2D_Unit0, (Vector2D) vector2D_Unit0);
      boolean boolean0 = segment0.isInfinite();
      ;
}
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line line0 = new Line(vector2D_Unit0, (-11.9), precision_DoubleEquivalence0);
      Segment segment0 = new Segment(line0, vector2D_Unit0, vector2D_Unit0);
      Bounds2D bounds2D0 = segment0.getBounds();
      assertNotNull(bounds2D0);
}
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line line0 = new Line(vector2D_Unit0, (-2641.549), precision_DoubleEquivalence0);
      Segment segment0 = line0.segment((Vector2D) vector2D_Unit0, (Vector2D) vector2D_Unit0);
      double double0 = segment0.closestAbscissa((-2641.549));
      ;
}
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn((-2147481602), 1253).when(precision_DoubleEquivalence0).compare(anyDouble() , anyDouble());
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      Precision.DoubleEquivalence precision_DoubleEquivalence1 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(precision_DoubleEquivalence1).eq(anyDouble() , anyDouble());
      Line line1 = new Line(vector2D_Unit0, 1901.8352, precision_DoubleEquivalence1);
      AffineTransformMatrix2D affineTransformMatrix2D0 = AffineTransformMatrix2D.identity();
      Line line2 = line1.transform(affineTransformMatrix2D0);
      Line line3 = line2.reverse();
      Segment segment0 = line3.segment((Vector2D) vector2D_Unit0, (Vector2D) vector2D_Unit0);
      segment0.reverse();
      Line line4 = mock(Line.class, new ViolatedAssumptionAnswer());
      doReturn(precision_DoubleEquivalence0, (Precision.DoubleEquivalence) null).when(line4).getPrecision();
      doReturn(0.0).when(line4).abscissa(any(org.apache.commons.geometry.euclidean.twod.Vector2D.class));
      Segment segment1 = new Segment(line4, vector2D_Unit0, vector2D_Unit0);
      Precision.DoubleEquivalence precision_DoubleEquivalence2 = segment1.getPrecision();
      Line line5 = new Line(vector2D_Unit0, 0.0, precision_DoubleEquivalence2);
      segment1.splitOnIntersection(line5, (Vector2D) null);
      // Undeclared exception!
      try { 
        segment1.classifyAbscissa(1253);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Segment", e);
      }
  }
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      Line line0 = new Line(vector2D_Unit0, 1901.8352, precision_DoubleEquivalence0);
      Segment segment0 = line0.segment((Vector2D) vector2D_Unit0, (Vector2D) vector2D_Unit0);
      String string0 = segment0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Line line0 = new Line((Vector2D.Unit) null, 0.0, (Precision.DoubleEquivalence) null);
      Segment segment0 = new Segment(line0, (Vector2D) null, (Vector2D) null);
      // Undeclared exception!
      try { 
        segment0.getCentroid();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Segment", e);
      }
  }
}
