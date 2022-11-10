/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:27:26 GMT 2022
 */

package org.apache.commons.geometry.euclidean.twod.path;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.apache.commons.geometry.euclidean.twod.LineConvexSubset;
import org.apache.commons.geometry.euclidean.twod.Vector2D;
import org.apache.commons.geometry.euclidean.twod.path.AbstractLinePathConnector;
import org.apache.commons.geometry.euclidean.twod.path.InteriorAngleLinePathConnector;
import org.apache.commons.geometry.euclidean.twod.path.LinePath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InteriorAngleLinePathConnector_ESTest extends InteriorAngleLinePathConnector_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InteriorAngleLinePathConnector.Minimize interiorAngleLinePathConnector_Minimize0 = new InteriorAngleLinePathConnector.Minimize();
      boolean boolean0 = interiorAngleLinePathConnector_Minimize0.isBetterAngle(0.0, 0.0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InteriorAngleLinePathConnector.Maximize interiorAngleLinePathConnector_Maximize0 = new InteriorAngleLinePathConnector.Maximize();
      boolean boolean0 = interiorAngleLinePathConnector_Maximize0.isBetterAngle(-0.0, 759.0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InteriorAngleLinePathConnector.Maximize interiorAngleLinePathConnector_Maximize0 = new InteriorAngleLinePathConnector.Maximize();
      ArrayList<AbstractLinePathConnector.ConnectableLineSubset> arrayList0 = new ArrayList<AbstractLinePathConnector.ConnectableLineSubset>();
      Vector2D vector2D0 = Vector2D.NaN;
      AbstractLinePathConnector.ConnectableLineSubset abstractLinePathConnector_ConnectableLineSubset0 = new AbstractLinePathConnector.ConnectableLineSubset(vector2D0);
      // Undeclared exception!
      try { 
        interiorAngleLinePathConnector_Maximize0.selectConnection(abstractLinePathConnector_ConnectableLineSubset0, arrayList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.path.InteriorAngleLinePathConnector", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashSet<LineConvexSubset> hashSet0 = new HashSet<LineConvexSubset>();
      hashSet0.add((LineConvexSubset) null);
      // Undeclared exception!
      try { 
        InteriorAngleLinePathConnector.connectMinimized(hashSet0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.path.AbstractLinePathConnector$ConnectableLineSubset", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        InteriorAngleLinePathConnector.connectMaximized((Collection<LineConvexSubset>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.twod.path.AbstractLinePathConnector", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      InteriorAngleLinePathConnector.Minimize interiorAngleLinePathConnector_Minimize0 = new InteriorAngleLinePathConnector.Minimize();
      boolean boolean0 = interiorAngleLinePathConnector_Minimize0.isBetterAngle((-915.7), 501.24245192701426);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InteriorAngleLinePathConnector.Minimize interiorAngleLinePathConnector_Minimize0 = new InteriorAngleLinePathConnector.Minimize();
      boolean boolean0 = interiorAngleLinePathConnector_Minimize0.isBetterAngle(509.3512969093, 0.0);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InteriorAngleLinePathConnector.Maximize interiorAngleLinePathConnector_Maximize0 = new InteriorAngleLinePathConnector.Maximize();
      boolean boolean0 = interiorAngleLinePathConnector_Maximize0.isBetterAngle(3752.0414806146186, (-653.7474125828605));
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      InteriorAngleLinePathConnector.Maximize interiorAngleLinePathConnector_Maximize0 = new InteriorAngleLinePathConnector.Maximize();
      boolean boolean0 = interiorAngleLinePathConnector_Maximize0.isBetterAngle(3752.0414806146186, 3752.0414806146186);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ArrayDeque<LineConvexSubset> arrayDeque0 = new ArrayDeque<LineConvexSubset>();
      List<LinePath> list0 = InteriorAngleLinePathConnector.connectMaximized(arrayDeque0);
      assertEquals(1, list0.size());
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayDeque<LineConvexSubset> arrayDeque0 = new ArrayDeque<LineConvexSubset>();
      List<LinePath> list0 = InteriorAngleLinePathConnector.connectMinimized(arrayDeque0);
      assertTrue(list0.isEmpty());
}
}
