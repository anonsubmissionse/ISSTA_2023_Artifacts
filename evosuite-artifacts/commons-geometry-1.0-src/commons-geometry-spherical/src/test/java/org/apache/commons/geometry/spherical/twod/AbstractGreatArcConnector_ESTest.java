/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:37:40 GMT 2022
 */

package org.apache.commons.geometry.spherical.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.ServiceLoader;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import org.apache.commons.geometry.euclidean.threed.Vector3D;
import org.apache.commons.geometry.spherical.oned.Point1S;
import org.apache.commons.geometry.spherical.twod.AbstractGreatArcConnector;
import org.apache.commons.geometry.spherical.twod.GreatArc;
import org.apache.commons.geometry.spherical.twod.GreatArcPath;
import org.apache.commons.geometry.spherical.twod.GreatCircle;
import org.apache.commons.geometry.spherical.twod.InteriorAngleGreatArcConnector;
import org.apache.commons.geometry.spherical.twod.Point2S;
import org.apache.commons.numbers.core.Precision;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractGreatArcConnector_ESTest extends AbstractGreatArcConnector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      GreatCircle greatCircle0 = new GreatCircle(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      GreatArc greatArc0 = greatCircle0.span();
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(greatArc0);
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc1 = new AbstractGreatArcConnector.ConnectableGreatArc((Point2S) null);
      int int0 = abstractGreatArcConnector_ConnectableGreatArc1.compareTo(abstractGreatArcConnector_ConnectableGreatArc0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_K;
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S0);
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc1 = new AbstractGreatArcConnector.ConnectableGreatArc((Point2S) null);
      int int0 = abstractGreatArcConnector_ConnectableGreatArc0.compareTo(abstractGreatArcConnector_ConnectableGreatArc1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Point2S point2S0 = Point2S.NaN;
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S0);
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc1 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S0);
      // Undeclared exception!
      try { 
        abstractGreatArcConnector_ConnectableGreatArc0.shouldContinueConnectionSearch(abstractGreatArcConnector_ConnectableGreatArc1, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.spherical.twod.AbstractGreatArcConnector$ConnectableGreatArc", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc((Point2S) null);
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc1 = new AbstractGreatArcConnector.ConnectableGreatArc((Point2S) null);
      assertFalse(abstractGreatArcConnector_ConnectableGreatArc1.hasStart());
      
      boolean boolean0 = abstractGreatArcConnector_ConnectableGreatArc0.shouldContinueConnectionSearch(abstractGreatArcConnector_ConnectableGreatArc1, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      GreatCircle greatCircle0 = new GreatCircle(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      GreatArc greatArc0 = greatCircle0.span();
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(greatArc0);
      Point1S point1S0 = Point1S.ZERO;
      Point2S point2S0 = greatCircle0.toSpace(point1S0);
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc1 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S0);
      // Undeclared exception!
      try { 
        abstractGreatArcConnector_ConnectableGreatArc0.getRelativeAngle(abstractGreatArcConnector_ConnectableGreatArc1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.spherical.twod.AbstractGreatArcConnector$ConnectableGreatArc", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      GreatCircle greatCircle0 = new GreatCircle(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      GreatArc greatArc0 = greatCircle0.span();
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(greatArc0);
      Point1S point1S0 = Point1S.ZERO;
      Point2S point2S0 = greatCircle0.toSpace(point1S0);
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc1 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S0);
      boolean boolean0 = abstractGreatArcConnector_ConnectableGreatArc0.canConnectTo(abstractGreatArcConnector_ConnectableGreatArc1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      GreatCircle greatCircle0 = new GreatCircle(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      GreatArc greatArc0 = greatCircle0.span();
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(greatArc0);
      boolean boolean0 = abstractGreatArcConnector_ConnectableGreatArc0.hasEnd();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      GreatCircle greatCircle0 = new GreatCircle(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      GreatArc greatArc0 = greatCircle0.span();
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(greatArc0);
      boolean boolean0 = abstractGreatArcConnector_ConnectableGreatArc0.hasStart();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      GreatCircle greatCircle0 = new GreatCircle(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      GreatArc greatArc0 = greatCircle0.span();
      InteriorAngleGreatArcConnector.Maximize interiorAngleGreatArcConnector_Maximize0 = new InteriorAngleGreatArcConnector.Maximize();
      PriorityQueue<GreatArc> priorityQueue0 = new PriorityQueue<GreatArc>();
      priorityQueue0.add(greatArc0);
      // Undeclared exception!
      try { 
        interiorAngleGreatArcConnector_Maximize0.connect(priorityQueue0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.spherical.twod.AbstractGreatArcConnector$ConnectableGreatArc", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InteriorAngleGreatArcConnector.Maximize interiorAngleGreatArcConnector_Maximize0 = new InteriorAngleGreatArcConnector.Maximize();
      List<GreatArcPath> list0 = interiorAngleGreatArcConnector_Maximize0.connectAll();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InteriorAngleGreatArcConnector.Maximize interiorAngleGreatArcConnector_Maximize0 = new InteriorAngleGreatArcConnector.Maximize();
      LinkedHashSet<GreatArc> linkedHashSet0 = new LinkedHashSet<GreatArc>();
      Vector<GreatArc> vector0 = new Vector<GreatArc>(linkedHashSet0);
      vector0.add((GreatArc) null);
      // Undeclared exception!
      try { 
        interiorAngleGreatArcConnector_Maximize0.add((Iterable<GreatArc>) vector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.spherical.twod.AbstractGreatArcConnector$ConnectableGreatArc", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InteriorAngleGreatArcConnector.Maximize interiorAngleGreatArcConnector_Maximize0 = new InteriorAngleGreatArcConnector.Maximize();
      Class<GreatArc> class0 = GreatArc.class;
      ServiceLoader<GreatArc> serviceLoader0 = ServiceLoader.loadInstalled(class0);
      interiorAngleGreatArcConnector_Maximize0.add((Iterable<GreatArc>) serviceLoader0);
      assertEquals("java.util.ServiceLoader[org.apache.commons.geometry.spherical.twod.GreatArc]", serviceLoader0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc((Point2S) null);
      GreatArc greatArc0 = abstractGreatArcConnector_ConnectableGreatArc0.getArc();
      assertNull(greatArc0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_I;
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S0);
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc1 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S0);
      boolean boolean0 = abstractGreatArcConnector_ConnectableGreatArc1.equals(abstractGreatArcConnector_ConnectableGreatArc0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_K;
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S0);
      Point2S point2S1 = Point2S.MINUS_I;
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc1 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S1);
      boolean boolean0 = abstractGreatArcConnector_ConnectableGreatArc1.equals(abstractGreatArcConnector_ConnectableGreatArc0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_I;
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S0);
      Object object0 = new Object();
      boolean boolean0 = abstractGreatArcConnector_ConnectableGreatArc0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      GreatCircle greatCircle0 = new GreatCircle(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      GreatArc greatArc0 = greatCircle0.span();
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(greatArc0);
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc1 = new AbstractGreatArcConnector.ConnectableGreatArc((Point2S) null);
      boolean boolean0 = abstractGreatArcConnector_ConnectableGreatArc1.equals(abstractGreatArcConnector_ConnectableGreatArc0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_I;
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S0);
      boolean boolean0 = abstractGreatArcConnector_ConnectableGreatArc0.equals(abstractGreatArcConnector_ConnectableGreatArc0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Point2S point2S0 = Point2S.PLUS_K;
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S0);
      boolean boolean0 = abstractGreatArcConnector_ConnectableGreatArc0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Point2S point2S0 = Point2S.PLUS_K;
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S0);
      int int0 = abstractGreatArcConnector_ConnectableGreatArc0.compareTo(abstractGreatArcConnector_ConnectableGreatArc0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_K;
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S0);
      Point2S point2S1 = Point2S.MINUS_I;
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc1 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S1);
      int int0 = abstractGreatArcConnector_ConnectableGreatArc0.compareTo(abstractGreatArcConnector_ConnectableGreatArc1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      GreatCircle greatCircle0 = new GreatCircle(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      GreatArc greatArc0 = greatCircle0.span();
      InteriorAngleGreatArcConnector.Maximize interiorAngleGreatArcConnector_Maximize0 = new InteriorAngleGreatArcConnector.Maximize();
      // Undeclared exception!
      try { 
        interiorAngleGreatArcConnector_Maximize0.add(greatArc0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.spherical.twod.AbstractGreatArcConnector$ConnectableGreatArc", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Point2S point2S0 = Point2S.PLUS_K;
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S0);
      boolean boolean0 = abstractGreatArcConnector_ConnectableGreatArc0.hasZeroSize();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      GreatCircle greatCircle0 = new GreatCircle(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      GreatArc greatArc0 = greatCircle0.span();
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(greatArc0);
      boolean boolean0 = abstractGreatArcConnector_ConnectableGreatArc0.endPointsEq(abstractGreatArcConnector_ConnectableGreatArc0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InteriorAngleGreatArcConnector.Maximize interiorAngleGreatArcConnector_Maximize0 = new InteriorAngleGreatArcConnector.Maximize();
      Stack<GreatArc> stack0 = new Stack<GreatArc>();
      ArrayDeque<GreatArc> arrayDeque0 = new ArrayDeque<GreatArc>(stack0);
      interiorAngleGreatArcConnector_Maximize0.connect(arrayDeque0);
      assertEquals(0, arrayDeque0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InteriorAngleGreatArcConnector.Maximize interiorAngleGreatArcConnector_Maximize0 = new InteriorAngleGreatArcConnector.Maximize();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-9)).when(comparator0).compare(any() , any());
      TreeSet<GreatArc> treeSet0 = new TreeSet<GreatArc>(comparator0);
      treeSet0.add((GreatArc) null);
      // Undeclared exception!
      try { 
        interiorAngleGreatArcConnector_Maximize0.connectAll((Iterable<GreatArc>) treeSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.spherical.twod.AbstractGreatArcConnector$ConnectableGreatArc", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      GreatCircle greatCircle0 = new GreatCircle(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      GreatArc greatArc0 = greatCircle0.span();
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(greatArc0);
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc1 = abstractGreatArcConnector_ConnectableGreatArc0.getConnectionSearchKey();
      assertFalse(abstractGreatArcConnector_ConnectableGreatArc1.hasStart());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Point2S point2S0 = Point2S.MINUS_I;
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(point2S0);
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc1 = abstractGreatArcConnector_ConnectableGreatArc0.getSelf();
      assertSame(abstractGreatArcConnector_ConnectableGreatArc1, abstractGreatArcConnector_ConnectableGreatArc0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.MINUS_X;
      GreatCircle greatCircle0 = new GreatCircle(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      GreatArc greatArc0 = greatCircle0.span();
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(greatArc0);
      double double0 = abstractGreatArcConnector_ConnectableGreatArc0.getRelativeAngle(abstractGreatArcConnector_ConnectableGreatArc0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector3D.Unit vector3D_Unit0 = Vector3D.Unit.PLUS_Z;
      GreatCircle greatCircle0 = new GreatCircle(vector3D_Unit0, vector3D_Unit0, vector3D_Unit0, (Precision.DoubleEquivalence) null);
      GreatArc greatArc0 = greatCircle0.span();
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc0 = new AbstractGreatArcConnector.ConnectableGreatArc(greatArc0);
      AbstractGreatArcConnector.ConnectableGreatArc abstractGreatArcConnector_ConnectableGreatArc1 = new AbstractGreatArcConnector.ConnectableGreatArc((Point2S) null);
      int int0 = abstractGreatArcConnector_ConnectableGreatArc0.compareTo(abstractGreatArcConnector_ConnectableGreatArc1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InteriorAngleGreatArcConnector.Maximize interiorAngleGreatArcConnector_Maximize0 = new InteriorAngleGreatArcConnector.Maximize();
      ArrayList<GreatArc> arrayList0 = new ArrayList<GreatArc>();
      List<GreatArcPath> list0 = interiorAngleGreatArcConnector_Maximize0.connectAll((Iterable<GreatArc>) arrayList0);
      assertTrue(list0.isEmpty());
  }
}
