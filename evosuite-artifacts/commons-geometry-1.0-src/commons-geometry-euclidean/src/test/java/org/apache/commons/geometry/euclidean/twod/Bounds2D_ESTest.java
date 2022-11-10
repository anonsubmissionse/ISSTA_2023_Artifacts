/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:12:21 GMT 2022
 */

package org.apache.commons.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import org.apache.commons.geometry.euclidean.twod.Bounds2D;
import org.apache.commons.geometry.euclidean.twod.Vector2D;
import org.apache.commons.geometry.euclidean.twod.rotation.Rotation2D;
import org.apache.commons.geometry.euclidean.twod.shape.Parallelogram;
import org.apache.commons.numbers.core.Precision;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Bounds2D_ESTest extends Bounds2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      Vector2D.Unit vector2D_Unit1 = vector2D_Unit0.orthogonal();
      Vector2D[] vector2DArray0 = new Vector2D[3];
      vector2DArray0[0] = (Vector2D) vector2D_Unit0;
      vector2DArray0[1] = (Vector2D) vector2D_Unit1;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      Bounds2D bounds2D1 = bounds2D0.intersection(bounds2D0);
      assertNotNull(bounds2D1);
      assertTrue(bounds2D1.equals((Object)bounds2D0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayDeque<Vector2D> arrayDeque0 = new ArrayDeque<Vector2D>();
      Vector2D vector2D0 = Vector2D.ZERO;
      arrayDeque0.add(vector2D0);
      Bounds2D bounds2D0 = Bounds2D.from((Iterable<Vector2D>) arrayDeque0);
      Bounds2D bounds2D1 = Bounds2D.from((Iterable<Vector2D>) arrayDeque0);
      Bounds2D bounds2D2 = bounds2D0.intersection(bounds2D1);
      assertNotNull(bounds2D2);
      assertTrue(bounds2D2.equals((Object)bounds2D1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      Vector2D.Unit vector2D_Unit1 = vector2D_Unit0.negate();
      Vector2D[] vector2DArray0 = new Vector2D[3];
      vector2DArray0[0] = (Vector2D) vector2D_Unit1;
      vector2DArray0[1] = (Vector2D) vector2D_Unit1;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit1, vector2DArray0);
      Bounds2D bounds2D1 = bounds2D0.intersection(bounds2D0);
      assertNotNull(bounds2D1);
      assertTrue(bounds2D1.equals((Object)bounds2D0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      Vector2D.Unit vector2D_Unit1 = vector2D_Unit0.negate();
      Vector2D[] vector2DArray0 = new Vector2D[3];
      vector2DArray0[0] = (Vector2D) vector2D_Unit1;
      vector2DArray0[1] = (Vector2D) vector2D_Unit1;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit1, vector2DArray0);
      boolean boolean0 = bounds2D0.contains((Vector2D) vector2D_Unit1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Vector2D.Unit vector2D_Unit1 = vector2D_Unit0.negate();
      Vector2D[] vector2DArray0 = new Vector2D[3];
      vector2DArray0[0] = (Vector2D) vector2D_Unit1;
      vector2DArray0[1] = (Vector2D) vector2D_Unit1;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit1, vector2DArray0);
      boolean boolean0 = bounds2D0.contains((Vector2D) vector2D_Unit1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      Vector2D.Unit vector2D_Unit1 = vector2D_Unit0.orthogonal();
      Vector2D[] vector2DArray0 = new Vector2D[3];
      vector2DArray0[0] = (Vector2D) vector2D_Unit0;
      vector2DArray0[1] = (Vector2D) vector2D_Unit1;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      doReturn(false, false, false, false).when(precision_DoubleEquivalence0).eqZero(anyDouble());
      Parallelogram parallelogram0 = bounds2D0.toRegion(precision_DoubleEquivalence0);
      assertFalse(parallelogram0.isFull());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Vector2D[] vector2DArray0 = new Vector2D[9];
      vector2DArray0[0] = (Vector2D) vector2D_Unit0;
      vector2DArray0[1] = (Vector2D) vector2D_Unit0;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      vector2DArray0[3] = (Vector2D) vector2D_Unit0;
      vector2DArray0[4] = (Vector2D) vector2D_Unit0;
      vector2DArray0[5] = (Vector2D) vector2D_Unit0;
      vector2DArray0[6] = (Vector2D) vector2D_Unit0;
      vector2DArray0[7] = (Vector2D) vector2D_Unit0;
      vector2DArray0[8] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      // Undeclared exception!
      try { 
        bounds2D0.toRegion((Precision.DoubleEquivalence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.shape.Parallelogram", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      Vector2D[] vector2DArray0 = new Vector2D[8];
      vector2DArray0[0] = (Vector2D) vector2D_Unit0;
      vector2DArray0[1] = (Vector2D) vector2D_Unit0;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      vector2DArray0[3] = (Vector2D) vector2D_Unit0;
      vector2DArray0[4] = (Vector2D) vector2D_Unit0;
      vector2DArray0[5] = (Vector2D) vector2D_Unit0;
      vector2DArray0[6] = (Vector2D) vector2D_Unit0;
      vector2DArray0[7] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      // Undeclared exception!
      try { 
        bounds2D0.intersects((Bounds2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Bounds2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Vector2D[] vector2DArray0 = new Vector2D[8];
      vector2DArray0[0] = (Vector2D) vector2D_Unit0;
      vector2DArray0[1] = (Vector2D) vector2D_Unit0;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      vector2DArray0[3] = (Vector2D) vector2D_Unit0;
      vector2DArray0[4] = (Vector2D) vector2D_Unit0;
      vector2DArray0[5] = (Vector2D) vector2D_Unit0;
      vector2DArray0[6] = (Vector2D) vector2D_Unit0;
      vector2DArray0[7] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      // Undeclared exception!
      try { 
        bounds2D0.intersection((Bounds2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Bounds2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayDeque<Vector2D> arrayDeque0 = new ArrayDeque<Vector2D>();
      Vector2D vector2D0 = Vector2D.ZERO;
      arrayDeque0.add(vector2D0);
      Bounds2D bounds2D0 = Bounds2D.from((Iterable<Vector2D>) arrayDeque0);
      // Undeclared exception!
      try { 
        bounds2D0.hasSize((Precision.DoubleEquivalence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Bounds2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector2D[] vector2DArray0 = new Vector2D[4];
      // Undeclared exception!
      try { 
        Bounds2D.from((Vector2D) null, vector2DArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bounds2D.from((Iterable<Vector2D>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Bounds2D$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_Y;
      Vector2D[] vector2DArray0 = new Vector2D[1];
      vector2DArray0[0] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      // Undeclared exception!
      try { 
        bounds2D0.contains((Vector2D) vector2D_Unit0, (Precision.DoubleEquivalence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Bounds2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.from(-0.0, (-1401.519027892768));
      Vector2D[] vector2DArray0 = new Vector2D[8];
      vector2DArray0[0] = (Vector2D) vector2D_Unit0;
      vector2DArray0[1] = (Vector2D) vector2D_Unit0;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      vector2DArray0[3] = (Vector2D) vector2D_Unit0;
      vector2DArray0[4] = (Vector2D) vector2D_Unit0;
      vector2DArray0[5] = (Vector2D) vector2D_Unit0;
      vector2DArray0[6] = (Vector2D) vector2D_Unit0;
      vector2DArray0[7] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D0 = Bounds2D.from(vector2DArray0[7], vector2DArray0);
      // Undeclared exception!
      try { 
        bounds2D0.contains((Vector2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Bounds2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Bounds2D.Builder bounds2D_Builder0 = Bounds2D.builder();
      // Undeclared exception!
      try { 
        bounds2D_Builder0.build();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot construct bounds: no points given
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Bounds2D$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Bounds2D.Builder bounds2D_Builder0 = Bounds2D.builder();
      Vector2D vector2D0 = Vector2D.NaN;
      bounds2D_Builder0.add(vector2D0);
      // Undeclared exception!
      try { 
        bounds2D_Builder0.build();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Invalid bounds: min= (NaN, NaN), max= (NaN, NaN)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Bounds2D$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Bounds2D.Builder bounds2D_Builder0 = Bounds2D.builder();
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      bounds2D_Builder0.add(vector2D0);
      // Undeclared exception!
      try { 
        bounds2D_Builder0.build();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Invalid bounds: min= (-Infinity, -Infinity), max= (-Infinity, -Infinity)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Bounds2D$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Bounds2D.Builder bounds2D_Builder0 = Bounds2D.builder();
      boolean boolean0 = bounds2D_Builder0.hasBounds();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashSet<Vector2D> hashSet0 = new HashSet<Vector2D>();
      LinkedHashSet<Vector2D> linkedHashSet0 = new LinkedHashSet<Vector2D>(hashSet0);
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      boolean boolean0 = linkedHashSet0.add(vector2D_Unit0);
      Bounds2D.Builder bounds2D_Builder0 = Bounds2D.builder();
      LinkedList<Vector2D> linkedList0 = new LinkedList<Vector2D>(linkedHashSet0);
      bounds2D_Builder0.addAll(linkedList0);
      boolean boolean1 = bounds2D_Builder0.hasBounds();
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Bounds2D.Builder bounds2D_Builder0 = Bounds2D.builder();
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_X;
      Vector2D.Unit vector2D_Unit1 = vector2D_Unit0.negate();
      Vector2D.Unit vector2D_Unit2 = vector2D_Unit1.orthogonal();
      bounds2D_Builder0.add((Vector2D) vector2D_Unit2);
      Bounds2D bounds2D0 = bounds2D_Builder0.build();
      Vector2D[] vector2DArray0 = new Vector2D[3];
      vector2DArray0[0] = (Vector2D) vector2D_Unit1;
      vector2DArray0[1] = (Vector2D) vector2D_Unit1;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D1 = Bounds2D.from((Vector2D) vector2D_Unit1, vector2DArray0);
      boolean boolean0 = bounds2D0.intersects(bounds2D1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Bounds2D.Builder bounds2D_Builder0 = Bounds2D.builder();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      bounds2D_Builder0.add(vector2D0);
      // Undeclared exception!
      try { 
        bounds2D_Builder0.build();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Invalid bounds: min= (Infinity, Infinity), max= (Infinity, Infinity)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Bounds2D$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Vector2D[] vector2DArray0 = new Vector2D[3];
      vector2DArray0[0] = (Vector2D) vector2D_Unit0;
      vector2DArray0[1] = (Vector2D) vector2D_Unit0;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      // Undeclared exception!
      try { 
        Bounds2D.from(vector2D0, vector2DArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Invalid bounds: min= (-Infinity, -Infinity), max= (1.0, 0.0)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Bounds2D$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Vector2D[] vector2DArray0 = new Vector2D[0];
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      Bounds2D.Builder bounds2D_Builder0 = Bounds2D.builder();
      Bounds2D.Builder bounds2D_Builder1 = bounds2D_Builder0.add(bounds2D0);
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Bounds2D.Builder bounds2D_Builder2 = bounds2D_Builder1.add(vector2D0);
      boolean boolean0 = bounds2D_Builder2.hasBounds();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector2D[] vector2DArray0 = new Vector2D[0];
      Vector2D vector2D0 = Vector2D.of(0.6, Double.NaN);
      // Undeclared exception!
      try { 
        Bounds2D.from(vector2D0, vector2DArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Invalid bounds: min= (0.6, NaN), max= (0.6, NaN)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Bounds2D$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.from(1548.05500924, 1548.05500924);
      Vector2D.Unit vector2D_Unit1 = Vector2D.Unit.MINUS_Y;
      Vector2D[] vector2DArray0 = new Vector2D[5];
      vector2DArray0[0] = (Vector2D) vector2D_Unit1;
      vector2DArray0[1] = (Vector2D) vector2D_Unit1;
      vector2DArray0[2] = (Vector2D) vector2D_Unit1;
      vector2DArray0[3] = (Vector2D) vector2D_Unit1;
      vector2DArray0[4] = (Vector2D) vector2D_Unit1;
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit1, vector2DArray0);
      Bounds2D bounds2D1 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      boolean boolean0 = bounds2D0.equals(bounds2D1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Vector2D[] vector2DArray0 = new Vector2D[1];
      vector2DArray0[0] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      Rotation2D rotation2D0 = Rotation2D.of((-1.0));
      Vector2D vector2D0 = rotation2D0.applyVector((Vector2D) vector2D_Unit0);
      Bounds2D bounds2D1 = Bounds2D.from(vector2D0, vector2DArray0);
      boolean boolean0 = bounds2D0.equals(bounds2D1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Vector2D[] vector2DArray0 = new Vector2D[0];
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      Bounds2D bounds2D1 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      boolean boolean0 = bounds2D0.equals(bounds2D1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Vector2D[] vector2DArray0 = new Vector2D[0];
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      boolean boolean0 = bounds2D0.equals(bounds2D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashSet<Vector2D> linkedHashSet0 = new LinkedHashSet<Vector2D>();
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      linkedHashSet0.add(vector2D_Unit0);
      Bounds2D bounds2D0 = Bounds2D.from((Iterable<Vector2D>) linkedHashSet0);
      boolean boolean0 = bounds2D0.equals(linkedHashSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Bounds2D.Builder bounds2D_Builder0 = Bounds2D.builder();
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Vector2D.Unit vector2D_Unit1 = vector2D_Unit0.negate();
      Vector2D.Unit vector2D_Unit2 = vector2D_Unit1.orthogonal();
      Bounds2D.Builder bounds2D_Builder1 = bounds2D_Builder0.add((Vector2D) vector2D_Unit2);
      Bounds2D bounds2D0 = bounds2D_Builder1.build();
      Vector2D[] vector2DArray0 = new Vector2D[3];
      vector2DArray0[0] = (Vector2D) vector2D_Unit1;
      vector2DArray0[1] = (Vector2D) vector2D_Unit1;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D1 = Bounds2D.from((Vector2D) vector2D_Unit1, vector2DArray0);
      boolean boolean0 = bounds2D0.intersects(bounds2D1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Bounds2D.Builder bounds2D_Builder0 = Bounds2D.builder();
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Vector2D.Unit vector2D_Unit1 = vector2D_Unit0.negate();
      Vector2D.Unit vector2D_Unit2 = vector2D_Unit1.orthogonal();
      Bounds2D.Builder bounds2D_Builder1 = bounds2D_Builder0.add((Vector2D) vector2D_Unit2);
      Bounds2D bounds2D0 = bounds2D_Builder1.build();
      Vector2D[] vector2DArray0 = new Vector2D[3];
      vector2DArray0[0] = (Vector2D) vector2D_Unit1;
      vector2DArray0[1] = (Vector2D) vector2D_Unit1;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D1 = Bounds2D.from((Vector2D) vector2D_Unit1, vector2DArray0);
      Bounds2D bounds2D2 = bounds2D1.intersection(bounds2D0);
      assertNull(bounds2D2);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Bounds2D.Builder bounds2D_Builder0 = Bounds2D.builder();
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_Y;
      Vector2D.Unit vector2D_Unit1 = vector2D_Unit0.negate();
      Vector2D.Unit vector2D_Unit2 = vector2D_Unit1.orthogonal();
      bounds2D_Builder0.add((Vector2D) vector2D_Unit2);
      Bounds2D bounds2D0 = bounds2D_Builder0.build();
      Vector2D[] vector2DArray0 = new Vector2D[3];
      vector2DArray0[0] = (Vector2D) vector2D_Unit1;
      vector2DArray0[1] = (Vector2D) vector2D_Unit1;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D1 = Bounds2D.from((Vector2D) vector2D_Unit1, vector2DArray0);
      boolean boolean0 = bounds2D0.intersects(bounds2D1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Bounds2D.Builder bounds2D_Builder0 = Bounds2D.builder();
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.MINUS_Y;
      bounds2D_Builder0.add((Vector2D) vector2D_Unit0);
      Bounds2D bounds2D0 = bounds2D_Builder0.build();
      boolean boolean0 = bounds2D0.intersects(bounds2D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Bounds2D.Builder bounds2D_Builder0 = Bounds2D.builder();
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      Vector2D.Unit vector2D_Unit1 = vector2D_Unit0.negate();
      Vector2D.Unit vector2D_Unit2 = vector2D_Unit1.orthogonal();
      Bounds2D.Builder bounds2D_Builder1 = bounds2D_Builder0.add((Vector2D) vector2D_Unit2);
      Bounds2D bounds2D0 = bounds2D_Builder1.build();
      Vector2D[] vector2DArray0 = new Vector2D[3];
      vector2DArray0[0] = (Vector2D) vector2D_Unit1;
      vector2DArray0[1] = (Vector2D) vector2D_Unit1;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D1 = Bounds2D.from((Vector2D) vector2D_Unit1, vector2DArray0);
      boolean boolean0 = bounds2D0.intersects(bounds2D1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashSet<Vector2D> linkedHashSet0 = new LinkedHashSet<Vector2D>(351, 351);
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      linkedHashSet0.add(vector2D_Unit0);
      Bounds2D bounds2D0 = Bounds2D.from((Iterable<Vector2D>) linkedHashSet0);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(precision_DoubleEquivalence0).gte(anyDouble() , anyDouble());
      doReturn(true, true).when(precision_DoubleEquivalence0).lte(anyDouble() , anyDouble());
      boolean boolean0 = bounds2D0.contains((Vector2D) vector2D_Unit0, precision_DoubleEquivalence0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashSet<Vector2D> linkedHashSet0 = new LinkedHashSet<Vector2D>(398, 398);
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      linkedHashSet0.add(vector2D_Unit0);
      Bounds2D bounds2D0 = Bounds2D.from((Iterable<Vector2D>) linkedHashSet0);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(precision_DoubleEquivalence0).gte(anyDouble() , anyDouble());
      doReturn(true).when(precision_DoubleEquivalence0).lte(anyDouble() , anyDouble());
      boolean boolean0 = bounds2D0.contains((Vector2D) vector2D_Unit0, precision_DoubleEquivalence0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.from(0.8606437703699489, 0.8606437703699489);
      Vector2D[] vector2DArray0 = new Vector2D[2];
      vector2DArray0[0] = (Vector2D) vector2D_Unit0;
      vector2DArray0[1] = vector2DArray0[0];
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(precision_DoubleEquivalence0).gte(anyDouble() , anyDouble());
      doReturn(false).when(precision_DoubleEquivalence0).lte(anyDouble() , anyDouble());
      boolean boolean0 = bounds2D0.contains(vector2DArray0[1], precision_DoubleEquivalence0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashSet<Vector2D> linkedHashSet0 = new LinkedHashSet<Vector2D>();
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      linkedHashSet0.add(vector2D_Unit0);
      Bounds2D bounds2D0 = Bounds2D.from((Iterable<Vector2D>) linkedHashSet0);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(precision_DoubleEquivalence0).gte(anyDouble() , anyDouble());
      doReturn(true, false).when(precision_DoubleEquivalence0).lte(anyDouble() , anyDouble());
      boolean boolean0 = bounds2D0.contains((Vector2D) vector2D_Unit0, precision_DoubleEquivalence0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedHashSet<Vector2D> linkedHashSet0 = new LinkedHashSet<Vector2D>();
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      linkedHashSet0.add(vector2D_Unit0);
      Bounds2D bounds2D0 = Bounds2D.from((Iterable<Vector2D>) linkedHashSet0);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(precision_DoubleEquivalence0).gte(anyDouble() , anyDouble());
      boolean boolean0 = bounds2D0.contains((Vector2D) vector2D_Unit0, precision_DoubleEquivalence0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      Vector2D.Unit vector2D_Unit1 = vector2D_Unit0.negate();
      Vector2D[] vector2DArray0 = new Vector2D[3];
      vector2DArray0[0] = (Vector2D) vector2D_Unit1;
      vector2DArray0[1] = (Vector2D) vector2D_Unit1;
      vector2DArray0[2] = (Vector2D) vector2D_Unit1;
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit1, vector2DArray0);
      boolean boolean0 = bounds2D0.contains((Vector2D) vector2D_Unit0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedHashSet<Vector2D> linkedHashSet0 = new LinkedHashSet<Vector2D>();
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      linkedHashSet0.add(vector2D_Unit0);
      Bounds2D bounds2D0 = Bounds2D.from((Iterable<Vector2D>) linkedHashSet0);
      Vector2D vector2D0 = bounds2D0.getDiagonal();
      boolean boolean0 = bounds2D0.contains(vector2D0);
      assertFalse(boolean0);
      assertEquals(0.0, vector2D0.getX(), 0.01);
      assertEquals(0.0, vector2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedHashSet<Vector2D> linkedHashSet0 = new LinkedHashSet<Vector2D>();
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      linkedHashSet0.add(vector2D_Unit0);
      Bounds2D bounds2D0 = Bounds2D.from((Iterable<Vector2D>) linkedHashSet0);
      Rotation2D rotation2D0 = Rotation2D.of(2838.0);
      Vector2D vector2D0 = rotation2D0.applyVector((Vector2D) vector2D_Unit0);
      boolean boolean0 = bounds2D0.contains(vector2D0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedHashSet<Vector2D> linkedHashSet0 = new LinkedHashSet<Vector2D>(351, 351);
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_Y;
      linkedHashSet0.add(vector2D_Unit0);
      Bounds2D bounds2D0 = Bounds2D.from((Iterable<Vector2D>) linkedHashSet0);
      Vector2D vector2D0 = Vector2D.NaN;
      boolean boolean0 = bounds2D0.contains(vector2D0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.from(1548.05500924, 1548.05500924);
      Vector2D[] vector2DArray0 = new Vector2D[5];
      vector2DArray0[0] = (Vector2D) vector2D_Unit0;
      vector2DArray0[1] = (Vector2D) vector2D_Unit0;
      vector2DArray0[2] = (Vector2D) vector2D_Unit0;
      vector2DArray0[3] = (Vector2D) vector2D_Unit0;
      vector2DArray0[4] = (Vector2D) vector2D_Unit0;
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(precision_DoubleEquivalence0).eqZero(anyDouble());
      boolean boolean0 = bounds2D0.hasSize(precision_DoubleEquivalence0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Vector2D[] vector2DArray0 = new Vector2D[0];
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(precision_DoubleEquivalence0).eqZero(anyDouble());
      boolean boolean0 = bounds2D0.hasSize(precision_DoubleEquivalence0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Vector2D[] vector2DArray0 = new Vector2D[0];
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(precision_DoubleEquivalence0).eqZero(anyDouble());
      boolean boolean0 = bounds2D0.hasSize(precision_DoubleEquivalence0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Vector2D[] vector2DArray0 = new Vector2D[0];
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      bounds2D0.hashCode();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HashSet<Vector2D> hashSet0 = new HashSet<Vector2D>();
      LinkedHashSet<Vector2D> linkedHashSet0 = new LinkedHashSet<Vector2D>(hashSet0);
      // Undeclared exception!
      try { 
        Bounds2D.from((Iterable<Vector2D>) linkedHashSet0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot construct bounds: no points given
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Bounds2D$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Vector2D.Unit vector2D_Unit0 = Vector2D.Unit.PLUS_X;
      Vector2D[] vector2DArray0 = new Vector2D[0];
      Bounds2D bounds2D0 = Bounds2D.from((Vector2D) vector2D_Unit0, vector2DArray0);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      doReturn(false).when(precision_DoubleEquivalence0).eqZero(anyDouble());
      // Undeclared exception!
      try { 
        bounds2D0.toRegion(precision_DoubleEquivalence0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: 0.0
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }
}
