/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:29:49 GMT 2022
 */

package org.apache.commons.geometry.euclidean;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.geometry.euclidean.EuclideanVectorSum;
import org.apache.commons.geometry.euclidean.oned.Vector1D;
import org.apache.commons.geometry.euclidean.twod.Vector2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EuclideanVectorSum_ESTest extends EuclideanVectorSum_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector1D.Sum vector1D_Sum0 = Vector1D.Sum.create();
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      vector1D_Sum0.accept((Vector1D) vector1D_Unit0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector1D.Sum vector1D_Sum0 = Vector1D.Sum.create();
      Vector1D.Unit vector1D_Unit0 = Vector1D.Unit.MINUS;
      EuclideanVectorSum<Vector1D> euclideanVectorSum0 = vector1D_Sum0.addScaled(1762.403092, vector1D_Unit0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Vector2D[] vector2DArray0 = new Vector2D[3];
      vector2DArray0[0] = vector2D0;
      vector2DArray0[1] = vector2D0;
      vector2DArray0[2] = vector2D0;
      Vector2D.Sum vector2D_Sum0 = Vector2D.Sum.of(vector2D0, vector2DArray0);
      EuclideanVectorSum<Vector2D> euclideanVectorSum0 = vector2D_Sum0.add(vector2DArray0[0]);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector2D.Sum vector2D_Sum0 = Vector2D.Sum.create();
      // Undeclared exception!
      try { 
        vector2D_Sum0.addScaled(1065.4, (Vector2D) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.Vector2D", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vector1D.Sum vector1D_Sum0 = Vector1D.Sum.create();
      // Undeclared exception!
      try { 
        vector1D_Sum0.accept((Vector1D) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.oned.Vector1D", e);
      }
  }
}
