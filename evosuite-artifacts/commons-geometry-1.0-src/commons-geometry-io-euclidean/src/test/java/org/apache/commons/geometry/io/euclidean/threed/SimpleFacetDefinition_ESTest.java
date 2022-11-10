/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:01:26 GMT 2022
 */

package org.apache.commons.geometry.io.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.apache.commons.geometry.euclidean.threed.Vector3D;
import org.apache.commons.geometry.euclidean.threed.rotation.AxisSequence;
import org.apache.commons.geometry.io.euclidean.threed.SimpleFacetDefinition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleFacetDefinition_ESTest extends SimpleFacetDefinition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Stack<Vector3D> stack0 = new Stack<Vector3D>();
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      stack0.add((Vector3D) vector3D_Unit0);
      stack0.add((Vector3D) vector3D_Unit0);
      stack0.add((Vector3D) vector3D_Unit0);
      Vector3D.Unit vector3D_Unit1 = Vector3D.Unit.PLUS_Y;
      SimpleFacetDefinition simpleFacetDefinition0 = new SimpleFacetDefinition(stack0, vector3D_Unit1);
      Vector3D vector3D0 = simpleFacetDefinition0.getNormal();
      assertEquals(1.0, vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayList<Vector3D> arrayList0 = new ArrayList<Vector3D>();
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from((-689.845), (-689.845), (-689.845));
      arrayList0.add((Vector3D) vector3D_Unit0);
      arrayList0.add((Vector3D) vector3D_Unit0);
      arrayList0.add((Vector3D) vector3D_Unit0);
      SimpleFacetDefinition simpleFacetDefinition0 = new SimpleFacetDefinition(arrayList0, vector3D_Unit0);
      Vector3D vector3D0 = simpleFacetDefinition0.getNormal();
      assertSame(vector3D0, vector3D_Unit0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<Vector3D> arrayList0 = new ArrayList<Vector3D>();
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_X;
      arrayList0.add((Vector3D) vector3D_Unit0);
      arrayList0.add((Vector3D) vector3D_Unit0);
      arrayList0.add((Vector3D) vector3D_Unit0);
      SimpleFacetDefinition simpleFacetDefinition0 = new SimpleFacetDefinition(arrayList0, vector3D_Unit0);
      Vector3D vector3D0 = simpleFacetDefinition0.getNormal();
      assertEquals(1.0, vector3D0.norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Y;
      SimpleFacetDefinition simpleFacetDefinition0 = null;
      try {
        simpleFacetDefinition0 = new SimpleFacetDefinition((List<Vector3D>) null, vector3D_Unit0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Facet vertex list cannot be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleFacetDefinition simpleFacetDefinition0 = null;
      try {
        simpleFacetDefinition0 = new SimpleFacetDefinition((List<Vector3D>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Facet vertex list cannot be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Stack<Vector3D> stack0 = new Stack<Vector3D>();
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.from(0.9995, 0.9995, 0.9995);
      SimpleFacetDefinition simpleFacetDefinition0 = null;
      try {
        simpleFacetDefinition0 = new SimpleFacetDefinition(stack0, vector3D_Unit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Facet vertex list must contain at least 3 points; found 0
         //
         verifyException("org.apache.commons.geometry.io.euclidean.threed.SimpleFacetDefinition", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Vector3D> arrayList0 = new ArrayList<Vector3D>();
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      arrayList0.add((Vector3D) vector3D_Unit0);
      arrayList0.add((Vector3D) vector3D_Unit0);
      arrayList0.add((Vector3D) vector3D_Unit0);
      SimpleFacetDefinition simpleFacetDefinition0 = new SimpleFacetDefinition(arrayList0, vector3D_Unit0);
      Vector3D vector3D0 = simpleFacetDefinition0.getNormal();
      assertEquals(0.0, vector3D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayList<Vector3D> arrayList0 = new ArrayList<Vector3D>();
      AxisSequence axisSequence0 = AxisSequence.YXY;
      Vector3D vector3D0 = axisSequence0.getAxis3();
      arrayList0.add(vector3D0);
      arrayList0.add(vector3D0);
      arrayList0.add(vector3D0);
      SimpleFacetDefinition simpleFacetDefinition0 = new SimpleFacetDefinition(arrayList0);
      Vector3D vector3D1 = simpleFacetDefinition0.getNormal();
      assertNull(vector3D1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Vector3D> arrayList0 = new ArrayList<Vector3D>();
      AxisSequence axisSequence0 = AxisSequence.YXY;
      Vector3D vector3D0 = axisSequence0.getAxis3();
      arrayList0.add(vector3D0);
      arrayList0.add(vector3D0);
      arrayList0.add(vector3D0);
      SimpleFacetDefinition simpleFacetDefinition0 = new SimpleFacetDefinition(arrayList0);
      List<Vector3D> list0 = simpleFacetDefinition0.getVertices();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Stack<Vector3D> stack0 = new Stack<Vector3D>();
      LinkedList<Vector3D> linkedList0 = new LinkedList<Vector3D>(stack0);
      SimpleFacetDefinition simpleFacetDefinition0 = null;
      try {
        simpleFacetDefinition0 = new SimpleFacetDefinition(linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Facet vertex list must contain at least 3 points; found 0
         //
         verifyException("org.apache.commons.geometry.io.euclidean.threed.SimpleFacetDefinition", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<Vector3D> arrayList0 = new ArrayList<Vector3D>();
      AxisSequence axisSequence0 = AxisSequence.YXY;
      Vector3D vector3D0 = axisSequence0.getAxis3();
      arrayList0.add(vector3D0);
      arrayList0.add(vector3D0);
      arrayList0.add(vector3D0);
      SimpleFacetDefinition simpleFacetDefinition0 = new SimpleFacetDefinition(arrayList0);
      String string0 = simpleFacetDefinition0.toString();
      assertEquals("SimpleFacetDefinition[vertices= [(0.0, 1.0, 0.0), (0.0, 1.0, 0.0), (0.0, 1.0, 0.0)], normal= null]", string0);
  }
}
