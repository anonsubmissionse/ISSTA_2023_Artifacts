/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:26:01 GMT 2022
 */

package org.apache.commons.geometry.euclidean.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.function.Function;
import org.apache.commons.geometry.euclidean.internal.EuclideanUtils;
import org.apache.commons.geometry.euclidean.threed.AffineTransformMatrix3D;
import org.apache.commons.geometry.euclidean.threed.Vector3D;
import org.apache.commons.geometry.euclidean.threed.rotation.AxisSequence;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EuclideanUtils_ESTest extends EuclideanUtils_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Stack<Vector3D> stack0 = new Stack<Vector3D>();
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      Vector3D.Unit vector3D_Unit1 = Vector3D.Unit.MINUS_Y;
      Vector3D.Unit vector3D_Unit2 = Vector3D.Unit.MINUS_Y;
      stack0.add((Vector3D) vector3D_Unit2);
      stack0.add(0, (Vector3D) vector3D_Unit0);
      stack0.insertElementAt(vector3D_Unit1, 0);
      Vector3D.Unit vector3D_Unit3 = Vector3D.Unit.MINUS_Z;
      stack0.add((Vector3D) vector3D_Unit3);
      Function<List<Vector3D>, Vector3D> function0 = (Function<List<Vector3D>, Vector3D>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D_Unit2, vector3D_Unit2).when(function0).apply(anyList());
      List<Vector3D> list0 = EuclideanUtils.convexPolygonToTriangleFan((List<Vector3D>) stack0, function0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Stack<Vector3D> stack0 = new Stack<Vector3D>();
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      Vector3D.Unit vector3D_Unit1 = Vector3D.Unit.MINUS_Y;
      Vector3D.Unit vector3D_Unit2 = Vector3D.Unit.PLUS_X;
      stack0.add((Vector3D) vector3D_Unit2);
      stack0.add(0, (Vector3D) vector3D_Unit0);
      stack0.insertElementAt(vector3D_Unit1, 0);
      stack0.add((Vector3D) vector3D_Unit0);
      Function<List<Vector3D>, Vector3D> function0 = (Function<List<Vector3D>, Vector3D>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D_Unit2, vector3D_Unit2).when(function0).apply(anyList());
      List<Vector3D> list0 = EuclideanUtils.convexPolygonToTriangleFan((List<Vector3D>) stack0, function0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Stack<Vector3D> stack0 = new Stack<Vector3D>();
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      Vector3D.Unit vector3D_Unit1 = Vector3D.Unit.MINUS_Y;
      Vector3D.Unit vector3D_Unit2 = Vector3D.Unit.PLUS_X;
      stack0.add((Vector3D) vector3D_Unit2);
      stack0.add(0, (Vector3D) vector3D_Unit0);
      stack0.insertElementAt(vector3D_Unit1, 0);
      stack0.add((Vector3D) vector3D_Unit0);
      Function<List<Vector3D>, Vector3D> function0 = (Function<List<Vector3D>, Vector3D>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D_Unit2, vector3D_Unit2).when(function0).apply(anyList());
      List<Vector3D> list0 = EuclideanUtils.convexPolygonToTriangleFan((List<Vector3D>) stack0, function0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Stack<Vector3D> stack0 = new Stack<Vector3D>();
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      List<Vector3D> list0 = stack0.subList(0, 0);
      stack0.add((Vector3D) vector3D_Unit0);
      Function<List<Vector3D>, AffineTransformMatrix3D> function0 = (Function<List<Vector3D>, AffineTransformMatrix3D>) mock(Function.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EuclideanUtils.convexPolygonToTriangleFan(list0, function0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Function<List<Vector3D>, LinkedList<Integer>> function0 = (Function<List<Vector3D>, LinkedList<Integer>>) mock(Function.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EuclideanUtils.convexPolygonToTriangleFan((List<Vector3D>) null, function0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.EuclideanUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Stack<Vector3D> stack0 = new Stack<Vector3D>();
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Z;
      Vector3D.Unit vector3D_Unit1 = Vector3D.Unit.MINUS_Y;
      stack0.add((Vector3D) vector3D_Unit1);
      AxisSequence axisSequence0 = AxisSequence.XZY;
      Vector3D vector3D0 = axisSequence0.getAxis3();
      stack0.add(vector3D0);
      stack0.add(0, (Vector3D) vector3D_Unit0);
      stack0.insertElementAt(vector3D_Unit1, 0);
      stack0.add((Vector3D) vector3D_Unit0);
      Function<List<Vector3D>, Vector3D> function0 = (Function<List<Vector3D>, Vector3D>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D_Unit0, vector3D_Unit0, vector3D0).when(function0).apply(anyList());
      List<Vector3D> list0 = EuclideanUtils.convexPolygonToTriangleFan((List<Vector3D>) stack0, function0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Stack<Vector3D> stack0 = new Stack<Vector3D>();
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Z;
      Vector3D.Unit vector3D_Unit1 = Vector3D.Unit.MINUS_Y;
      stack0.add((Vector3D) vector3D_Unit1);
      AxisSequence axisSequence0 = AxisSequence.XZY;
      Vector3D vector3D0 = axisSequence0.getAxis3();
      stack0.add(vector3D0);
      stack0.add(0, (Vector3D) vector3D_Unit0);
      stack0.insertElementAt(vector3D_Unit1, 0);
      stack0.add((Vector3D) vector3D_Unit0);
      Function<List<Vector3D>, Vector3D> function0 = (Function<List<Vector3D>, Vector3D>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D_Unit0, vector3D_Unit0, vector3D0).when(function0).apply(anyList());
      List<Vector3D> list0 = EuclideanUtils.convexPolygonToTriangleFan((List<Vector3D>) stack0, function0);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Stack<Vector3D> stack0 = new Stack<Vector3D>();
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Z;
      stack0.add((Vector3D) vector3D_Unit0);
      stack0.add((Vector3D) vector3D_Unit0);
      stack0.add(0, (Vector3D) vector3D_Unit0);
      stack0.insertElementAt(vector3D_Unit0, 0);
      Function<List<Vector3D>, Vector3D> function0 = (Function<List<Vector3D>, Vector3D>) mock(Function.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EuclideanUtils.convexPolygonToTriangleFan((List<Vector3D>) stack0, function0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal norm: 0.0
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.Vectors", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ArrayList<Vector3D> arrayList0 = new ArrayList<Vector3D>();
      Function<List<Vector3D>, Vector3D> function0 = (Function<List<Vector3D>, Vector3D>) mock(Function.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EuclideanUtils.convexPolygonToTriangleFan((List<Vector3D>) arrayList0, function0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Cannot create triangle fan: 3 or more vertices are required but found only 0
         //
         verifyException("org.apache.commons.geometry.euclidean.internal.EuclideanUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Stack<Vector3D> stack0 = new Stack<Vector3D>();
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_Z;
      stack0.add((Vector3D) vector3D_Unit0);
      stack0.add((Vector3D) vector3D_Unit0);
      stack0.add(0, (Vector3D) vector3D_Unit0);
      Function<List<Vector3D>, Vector3D> function0 = (Function<List<Vector3D>, Vector3D>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(function0).apply(anyList());
      List<Vector3D> list0 = EuclideanUtils.convexPolygonToTriangleFan((List<Vector3D>) stack0, function0);
      ;
}
}
