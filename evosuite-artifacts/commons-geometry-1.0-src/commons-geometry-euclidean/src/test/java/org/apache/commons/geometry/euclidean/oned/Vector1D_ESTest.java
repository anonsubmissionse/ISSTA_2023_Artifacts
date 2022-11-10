/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:22:27 GMT 2022
 */

package org.apache.commons.geometry.euclidean.oned;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.UnaryOperator;
import org.apache.commons.geometry.euclidean.oned.AffineTransformMatrix1D;
import org.apache.commons.geometry.euclidean.oned.Vector1D;
import org.apache.commons.numbers.core.Precision;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Vector1D_ESTest extends Vector1D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.POSITIVE_INFINITY;
      // Undeclared exception!
      try { 
        Vector1D.Unit.from(vector1D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: Infinity
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ZERO;
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      boolean boolean0 = vector1D0.equals(vector1D_Unit0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      Vector1D vector1D0 = vector1D_Unit0.negate();
      double double0 = vector1D0.angle((Vector1D) vector1D_Unit0);
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals(1.0, vector1D0.norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      Vector1D vector1D0 = vector1D_Unit0.NaN.subtract(0.6, (Vector1D) vector1D_Unit0);
      double double0 = vector1D0.dot(vector1D0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      Vector1D.Unit vector1D_Unit1 = vector1D_Unit0.normalize();
      assertSame(vector1D_Unit0, vector1D_Unit1);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.of((-1193.5595279131));
      AffineTransformMatrix1D affineTransformMatrix1D0 = AffineTransformMatrix1D.createTranslation(vector1D0);
      Vector1D.Unit vector1D_Unit0 = affineTransformMatrix1D0.applyDirection(vector1D0);
      double double0 = vector1D_Unit0.norm();
      assertEquals((-1193.5595279131), vector1D0.getX(), 0.01);
      assertEquals((-1.0), vector1D_Unit0.getX(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D[] vector1DArray0 = new Vector1D[9];
      vector1DArray0[0] = (Vector1D) vector1D_Unit0;
      vector1DArray0[1] = (Vector1D) vector1D_Unit0;
      vector1DArray0[2] = (Vector1D) vector1D_Unit0;
      vector1DArray0[3] = (Vector1D) vector1D_Unit0;
      vector1DArray0[4] = (Vector1D) vector1D_Unit0;
      vector1DArray0[5] = (Vector1D) vector1D_Unit0;
      vector1DArray0[6] = (Vector1D) vector1D_Unit0;
      vector1DArray0[7] = vector1DArray0[5];
      vector1DArray0[8] = (Vector1D) vector1D_Unit0;
      Vector1D.Sum vector1D_Sum0 = Vector1D.Sum.of((Vector1D) vector1D_Unit0, vector1DArray0);
      Vector1D.Sum vector1D_Sum1 = vector1D_Sum0.add((Vector1D) vector1D_Unit0);
      assertSame(vector1D_Sum1, vector1D_Sum0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D vector1D0 = vector1D_Unit0.withNorm(Double.NaN);
      assertTrue(vector1D0.isNaN());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      Vector1D vector1D0 = vector1D_Unit0.withNorm(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.of((-1193.5595279131));
      AffineTransformMatrix1D affineTransformMatrix1D0 = AffineTransformMatrix1D.createTranslation(vector1D0);
      Vector1D.Unit vector1D_Unit0 = affineTransformMatrix1D0.applyDirection(vector1D0);
      Vector1D vector1D1 = vector1D_Unit0.withNorm(0.0);
      assertEquals(-0.0, vector1D1.getX(), 0.01);
      assertEquals((-1193.5595279131), vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      Vector1D vector1D0 = vector1D_Unit0.POSITIVE_INFINITY.vectorTo((Vector1D) vector1D_Unit0);
      assertEquals(Double.NEGATIVE_INFINITY, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      Vector1D vector1D0 = vector1D_Unit0.vectorTo((Vector1D) vector1D_Unit0);
      assertEquals(0.0, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.POSITIVE_INFINITY;
      Vector1D vector1D1 = vector1D0.NaN.vectorTo(vector1D0);
      assertTrue(vector1D1.isNaN());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.from((-1424.0));
      AffineTransformMatrix1D affineTransformMatrix1D0 = AffineTransformMatrix1D.createTranslation((Vector1D) vector1D_Unit0);
      vector1D_Unit0.NaN.transform(affineTransformMatrix1D0);
      assertEquals((-1.0), vector1D_Unit0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.POSITIVE_INFINITY;
      AffineTransformMatrix1D affineTransformMatrix1D0 = AffineTransformMatrix1D.createScale(vector1D0);
      Vector1D vector1D1 = vector1D0.transform(affineTransformMatrix1D0);
      assertEquals(Double.POSITIVE_INFINITY, vector1D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.from((-1003.4713486276197));
      UnaryOperator<Vector1D> unaryOperator0 = UnaryOperator.identity();
      Vector1D vector1D0 = vector1D_Unit0.transform(unaryOperator0);
      assertEquals((-1.0), vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D vector1D0 = vector1D_Unit0.NEGATIVE_INFINITY.subtract((Vector1D) vector1D_Unit0);
      assertEquals(Double.NEGATIVE_INFINITY, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D vector1D0 = vector1D_Unit0.subtract((Vector1D) vector1D_Unit0);
      assertEquals(0.0, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D vector1D0 = vector1D_Unit0.ZERO.subtract(0.0, (Vector1D) vector1D_Unit0);
      assertEquals(0.0, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.parse("(-Infinity)");
      assertEquals(Double.NEGATIVE_INFINITY, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.parse("(-0.0)");
      assertEquals(-0.0, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.parse("(NaN)");
      assertEquals(1, vector1D0.getDimension());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.of(Double.NaN);
      assertEquals(1, vector1D0.getDimension());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.of(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.of(0.0);
      assertEquals(0.0, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.of(21.65459095187051);
      Vector1D.Unit vector1D_Unit0 = vector1D0.normalizeOrNull();
      Vector1D.Unit vector1D_Unit1 = vector1D_Unit0.normalize();
      assertEquals(1.0, vector1D_Unit1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      double double0 = vector1D0.normSq();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      double double0 = vector1D_Unit0.ZERO.norm();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      Vector1D vector1D1 = vector1D0.negate();
      assertEquals(Double.POSITIVE_INFINITY, vector1D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ZERO;
      Vector1D vector1D1 = vector1D0.negate();
      assertEquals(-0.0, vector1D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D vector1D0 = vector1D_Unit0.NEGATIVE_INFINITY.multiply(0.0);
      assertEquals(Double.NaN, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ZERO;
      Vector1D vector1D1 = vector1D0.ZERO.multiply((-1003.4713486276197));
      assertEquals(-0.0, vector1D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.POSITIVE_INFINITY;
      Vector1D vector1D1 = vector1D0.NEGATIVE_INFINITY.multiply(2846.4740752);
      assertEquals(Double.NEGATIVE_INFINITY, vector1D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.of((-1088.75));
      Vector1D.Unit vector1D_Unit0 = vector1D0.normalizeOrNull();
      Vector1D vector1D1 = vector1D_Unit0.POSITIVE_INFINITY.lerp(vector1D0, 874.2909482201);
      assertEquals((-1.0), vector1D_Unit0.getX(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, vector1D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.of((-1193.5595279131));
      AffineTransformMatrix1D affineTransformMatrix1D0 = AffineTransformMatrix1D.createTranslation(vector1D0);
      Vector1D.Unit vector1D_Unit0 = affineTransformMatrix1D0.applyDirection(vector1D0);
      Vector1D vector1D1 = vector1D0.ZERO.lerp((Vector1D) vector1D_Unit0, 0.0);
      assertEquals((-1.0), vector1D_Unit0.getX(), 0.01);
      assertEquals(0.0, vector1D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NaN;
      Vector1D vector1D1 = vector1D0.lerp(vector1D0, Double.NaN);
      assertEquals(Double.NaN, vector1D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D vector1D0 = vector1D_Unit0.NaN.add(Double.NEGATIVE_INFINITY, (Vector1D) vector1D_Unit0);
      boolean boolean0 = vector1D0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NaN;
      boolean boolean0 = vector1D0.ZERO.isFinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ZERO;
      double double0 = vector1D0.getX();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      double double0 = vector1D_Unit0.getX();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.of((-1193.5595279131));
      AffineTransformMatrix1D affineTransformMatrix1D0 = AffineTransformMatrix1D.createTranslation(vector1D0);
      Vector1D.Unit vector1D_Unit0 = affineTransformMatrix1D0.applyDirection(vector1D0);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      vector1D_Unit0.eq((Vector1D) vector1D_Unit0, precision_DoubleEquivalence0);
      assertEquals((-1193.5595279131), vector1D0.getX(), 0.01);
      assertEquals((-1.0), vector1D_Unit0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.of(21.65459095187051);
      Vector1D.Unit vector1D_Unit0 = vector1D0.normalizeOrNull();
      Vector1D vector1D1 = vector1D0.getZero();
      double double0 = vector1D1.dot((Vector1D) vector1D_Unit0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.of(21.65459095187051);
      Vector1D.Unit vector1D_Unit0 = vector1D0.normalizeOrNull();
      Vector1D.Unit vector1D_Unit1 = Vector1D.Unit.MINUS;
      double double0 = vector1D_Unit1.dot((Vector1D) vector1D_Unit0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ZERO;
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      double double0 = vector1D_Unit0.NEGATIVE_INFINITY.distanceSq(vector1D0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ZERO;
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      Vector1D.Unit vector1D_Unit1 = vector1D0.directionTo((Vector1D) vector1D_Unit0);
      assertEquals(1.0, vector1D_Unit1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ZERO;
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D.Unit vector1D_Unit1 = vector1D0.directionTo((Vector1D) vector1D_Unit0);
      assertEquals((-1.0), vector1D_Unit1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      Vector1D vector1D1 = vector1D0.NaN.add(vector1D0);
      assertFalse(vector1D1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      AffineTransformMatrix1D affineTransformMatrix1D0 = AffineTransformMatrix1D.createScale(0.0);
      Vector1D vector1D0 = vector1D_Unit0.ZERO.transform(affineTransformMatrix1D0);
      Vector1D vector1D1 = vector1D_Unit0.ZERO.add(vector1D0);
      assertEquals(0.0, vector1D0.getX(), 0.01);
      assertEquals(0.0, vector1D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ZERO;
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D vector1D1 = vector1D_Unit0.NEGATIVE_INFINITY.add(vector1D0);
      assertEquals(Double.NEGATIVE_INFINITY, vector1D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      Vector1D vector1D1 = vector1D0.NEGATIVE_INFINITY.add(0.0, vector1D0);
      assertTrue(vector1D1.isNaN());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      Vector1D vector1D1 = vector1D0.add(1286.95974294396, (Vector1D) vector1D_Unit0);
      assertEquals(Double.NEGATIVE_INFINITY, vector1D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.from((-1.0));
      Vector1D vector1D0 = vector1D_Unit0.add((-1.0), (Vector1D) vector1D_Unit0);
      assertEquals((-1.0), vector1D_Unit0.getX(), 0.01);
      assertEquals(0.0, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.POSITIVE_INFINITY;
      // Undeclared exception!
      try { 
        vector1D0.withNorm((-0.9999999999));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: Infinity
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      // Undeclared exception!
      try { 
        vector1D_Unit0.subtract((Vector1D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.oned.Vector1D", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      // Undeclared exception!
      try { 
        vector1D_Unit0.subtract(4750.026206086907, (Vector1D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.oned.Vector1D", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      // Undeclared exception!
      try { 
        Vector1D.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse string \"\" at index 0: expected \"(\" but found \"\"
         //
         verifyException("org.apache.commons.geometry.core.internal.SimpleTupleFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      // Undeclared exception!
      try { 
        vector1D0.normalize();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: Infinity
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.from(508.7469742);
      // Undeclared exception!
      try { 
        vector1D_Unit0.NEGATIVE_INFINITY.lerp((Vector1D) null, 508.7469742);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.oned.Vector1D", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      // Undeclared exception!
      try { 
        vector1D_Unit0.eq((Vector1D) vector1D_Unit0, (Precision.DoubleEquivalence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.oned.Vector1D", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      // Undeclared exception!
      try { 
        vector1D_Unit0.dot((Vector1D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.oned.Vector1D", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      // Undeclared exception!
      try { 
        vector1D0.NEGATIVE_INFINITY.distanceSq((Vector1D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.oned.Vector1D", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      // Undeclared exception!
      try { 
        vector1D_Unit0.distance((Vector1D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.oned.Vector1D", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ZERO;
      // Undeclared exception!
      try { 
        vector1D0.directionTo((Vector1D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.oned.Vector1D", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.from((-1003.47134862762));
      // Undeclared exception!
      try { 
        vector1D_Unit0.angle((Vector1D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.oned.Vector1D", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ZERO;
      // Undeclared exception!
      try { 
        vector1D0.angle(vector1D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: 0.0
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ZERO;
      // Undeclared exception!
      try { 
        vector1D0.ZERO.add((Vector1D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.oned.Vector1D", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      // Undeclared exception!
      try { 
        vector1D_Unit0.add(0.0, (Vector1D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.oned.Vector1D", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D.Sum vector1D_Sum0 = new Vector1D.Sum(vector1D_Unit0);
      Vector1D vector1D0 = vector1D_Sum0.get();
      assertEquals((-1.0), vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.of((-1088.75));
      vector1D0.isNaN();
      assertEquals((-1088.75), vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      Vector1D vector1D1 = vector1D0.multiply((-64.28071));
      double double0 = vector1D1.distance(vector1D0);
      assertTrue(vector1D1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NaN;
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D vector1D1 = vector1D0.subtract((Vector1D) vector1D_Unit0);
      assertEquals(1, vector1D1.getDimension());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Vector1D.Sum vector1D_Sum0 = Vector1D.Sum.create();
      assertNotNull(vector1D_Sum0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      double double0 = vector1D0.norm();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.of((-1193.5595279131));
      AffineTransformMatrix1D affineTransformMatrix1D0 = AffineTransformMatrix1D.createTranslation(vector1D0);
      Vector1D.Unit vector1D_Unit0 = affineTransformMatrix1D0.applyDirection(vector1D0);
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      vector1D_Unit0.eq((Vector1D) vector1D_Unit0, precision_DoubleEquivalence0);
      assertEquals((-1.0), vector1D_Unit0.getX(), 0.01);
      assertEquals((-1193.5595279131), vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      double double0 = vector1D_Unit0.getX();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      Vector1D.Unit vector1D_Unit0 = vector1D0.POSITIVE_INFINITY.normalizeOrNull();
      Vector1D vector1D1 = vector1D_Unit0.ZERO.subtract((-347.916396299), vector1D0);
      // Undeclared exception!
      try { 
        vector1D1.vectorTo((Vector1D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.oned.Vector1D", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.from((-1.0));
      Vector1D.Sum vector1D_Sum0 = new Vector1D.Sum(vector1D_Unit0);
      vector1D_Sum0.addScaled(0.0, (Vector1D) vector1D_Unit0);
      assertEquals((-1.0), vector1D_Unit0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      Vector1D.Unit vector1D_Unit1 = Vector1D.Unit.from((Vector1D) vector1D_Unit0);
      assertSame(vector1D_Unit1, vector1D_Unit0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      Vector1D vector1D0 = vector1D_Unit0.negate();
      assertEquals((-1.0), vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D vector1D0 = vector1D_Unit0.negate();
      assertEquals(1.0, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D vector1D0 = Vector1D.parse("(-1.0)");
      boolean boolean0 = vector1D_Unit0.equals(vector1D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      Vector1D vector1D0 = vector1D_Unit0.NaN.subtract(0.6, (Vector1D) vector1D_Unit0);
      boolean boolean0 = vector1D_Unit0.equals(vector1D0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.of((-0.999999999999998));
      Vector1D.Unit vector1D_Unit0 = vector1D0.normalize();
      Object object0 = new Object();
      boolean boolean0 = vector1D_Unit0.equals(object0);
      assertFalse(boolean0);
      assertEquals((-1.0), vector1D_Unit0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      boolean boolean0 = vector1D_Unit0.equals(vector1D_Unit0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      vector1D0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.from((-1003.47134862762));
      vector1D_Unit0.hashCode();
      assertEquals((-1.0), vector1D_Unit0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D.Unit vector1D_Unit1 = Vector1D.Unit.from(0.6);
      double double0 = vector1D_Unit1.angle((Vector1D) vector1D_Unit0);
      assertEquals(1.0, vector1D_Unit1.norm(), 0.01);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      boolean boolean0 = vector1D0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      boolean boolean0 = vector1D_Unit0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NaN;
      boolean boolean0 = vector1D0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      // Undeclared exception!
      try { 
        vector1D_Unit0.POSITIVE_INFINITY.transform((UnaryOperator<Vector1D>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.oned.Vector1D", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      Vector1D.Unit vector1D_Unit1 = Vector1D.Unit.MINUS;
      boolean boolean0 = vector1D_Unit0.equals(vector1D_Unit1);
      assertFalse(boolean0);
      assertFalse(vector1D_Unit1.equals((Object)vector1D_Unit0));
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      String string0 = vector1D_Unit0.toString();
      assertEquals("(1.0)", string0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      double double0 = vector1D_Unit0.distanceSq((Vector1D) vector1D_Unit0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      Vector1D vector1D0 = vector1D_Unit0.NaN.subtract(0.6, (Vector1D) vector1D_Unit0);
      Vector1D vector1D1 = vector1D0.negate();
      assertTrue(vector1D1.isNaN());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      boolean boolean0 = vector1D_Unit0.POSITIVE_INFINITY.isFinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      // Undeclared exception!
      try { 
        Vector1D.Unit.from(vector1D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: Infinity
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      double double0 = vector1D_Unit0.dot((Vector1D) vector1D_Unit0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      double double0 = vector1D_Unit0.distance((Vector1D) vector1D_Unit0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.of((-0.999999999999998));
      Vector1D.Unit vector1D_Unit0 = vector1D0.normalize();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(precision_DoubleEquivalence0).eq(anyDouble() , anyDouble());
      vector1D_Unit0.POSITIVE_INFINITY.isZero(precision_DoubleEquivalence0);
      assertEquals((-1.0), vector1D_Unit0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.POSITIVE_INFINITY;
      // Undeclared exception!
      try { 
        vector1D0.directionTo(vector1D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: NaN
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      // Undeclared exception!
      try { 
        Vector1D.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.core.internal.SimpleTupleFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      int int0 = vector1D_Unit0.getDimension();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D vector1D0 = vector1D_Unit0.subtract(0.989, (Vector1D) vector1D_Unit0);
      Vector1D vector1D1 = vector1D0.withNorm(0.989);
      assertEquals((-0.989), vector1D1.getX(), 0.01);
      assertEquals((-0.01100000000000001), vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.PLUS;
      Vector1D vector1D0 = vector1D_Unit0.add(4791.6, (Vector1D) vector1D_Unit0);
      Vector1D vector1D1 = vector1D0.withNorm(4791.6);
      assertEquals(4792.6, vector1D0.getX(), 0.01);
      assertEquals(4791.6, vector1D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      double double0 = vector1D_Unit0.normSq();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D vector1D0 = vector1D_Unit0.withNorm(0.0);
      assertEquals(-0.0, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      double double0 = vector1D_Unit0.angle((Vector1D) vector1D_Unit0);
      assertEquals(1.0, vector1D_Unit0.norm(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D.Unit vector1D_Unit1 = vector1D_Unit0.normalizeOrNull();
      assertFalse(vector1D_Unit1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D.Sum vector1D_Sum0 = Vector1D.Sum.of((Vector1D) vector1D_Unit0);
      assertNotNull(vector1D_Sum0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      Vector1D[] vector1DArray0 = new Vector1D[9];
      // Undeclared exception!
      try { 
        Vector1D.Sum.of((Vector1D) vector1D_Unit0, vector1DArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.oned.Vector1D", e);
      }
  }
}
