/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 16:49:26 GMT 2022
 */

package org.apache.commons.weaver.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Parameter;
import java.net.Proxy;
import java.util.PriorityQueue;
import java.util.Vector;
import java.util.function.Predicate;
import org.apache.commons.weaver.model.WeavableClass;
import org.apache.commons.weaver.model.WeavablePackage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Weavable_ESTest extends Weavable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Annotation[] annotationArray0 = weavablePackage0.getDeclaredAnnotations();
      assertEquals(0, annotationArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      WeavableClass<AccessibleObject> weavableClass0 = new WeavableClass<AccessibleObject>((Class<AccessibleObject>) null, weavablePackage0);
      // Undeclared exception!
      try { 
        weavableClass0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      // Undeclared exception!
      try { 
        weavablePackage0.addAnnotations((Annotation[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The validated object is null
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Parameter> class0 = Parameter.class;
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      WeavableClass<Parameter> weavableClass0 = new WeavableClass<Parameter>(class0, weavablePackage0);
      Annotation[] annotationArray0 = new Annotation[8];
      // Undeclared exception!
      try { 
        weavableClass0.addAnnotations(annotationArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The validated array contains null element at index: 0
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Class<Annotation> class0 = Annotation.class;
      Annotation annotation0 = weavablePackage0.getAnnotation(class0);
      assertNull(annotation0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Class<Proxy.Type> class0 = Proxy.Type.class;
      WeavableClass<Proxy.Type> weavableClass0 = weavablePackage0.getWeavable(class0);
      Annotation[] annotationArray0 = weavableClass0.getAnnotations();
      assertEquals(0, annotationArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Annotation[] annotationArray0 = new Annotation[0];
      boolean boolean0 = weavablePackage0.addAnnotations(annotationArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Predicate<Object> predicate0 = Predicate.isEqual((Object) weavablePackage0);
      WeavablePackage weavablePackage1 = new WeavablePackage((Package) null);
      // Undeclared exception!
      try { 
        predicate0.test(weavablePackage1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.weaver.model.Weavable", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Predicate<Object> predicate0 = Predicate.isEqual((Object) weavablePackage0);
      boolean boolean0 = predicate0.test(weavablePackage0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Vector<Annotation> vector0 = new Vector<Annotation>();
      vector0.add((Annotation) null);
      Predicate<Annotation> predicate0 = Predicate.isEqual((Object) weavablePackage0);
      boolean boolean0 = vector0.removeIf(predicate0);
      assertEquals(1, vector0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Class<Annotation> class0 = Annotation.class;
      boolean boolean0 = weavablePackage0.isAnnotationPresent(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Vector<Annotation> vector0 = new Vector<Annotation>();
      weavablePackage0.addAnnotations((Iterable<Annotation>) vector0);
      Class<Annotation> class0 = Annotation.class;
      Annotation annotation0 = weavablePackage0.getAnnotation(class0);
      assertNull(annotation0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Annotation[] annotationArray0 = weavablePackage0.getAnnotations();
      assertEquals(0, annotationArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Vector<Annotation> vector0 = new Vector<Annotation>();
      vector0.add((Annotation) null);
      boolean boolean0 = weavablePackage0.addAnnotations((Iterable<Annotation>) vector0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Class<AccessibleObject> class0 = AccessibleObject.class;
      WeavableClass<AccessibleObject> weavableClass0 = new WeavableClass<AccessibleObject>(class0, weavablePackage0);
      PriorityQueue<Annotation> priorityQueue0 = new PriorityQueue<Annotation>();
      boolean boolean0 = weavableClass0.addAnnotations((Iterable<Annotation>) priorityQueue0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Class<Annotation> class0 = Annotation.class;
      WeavableClass<Annotation> weavableClass0 = new WeavableClass<Annotation>(class0, weavablePackage0);
      boolean boolean0 = weavableClass0.addAnnotations((Iterable<Annotation>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      weavablePackage0.hashCode();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Class<AccessibleObject> class0 = AccessibleObject.class;
      WeavableClass<AccessibleObject> weavableClass0 = new WeavableClass<AccessibleObject>(class0, weavablePackage0);
      String string0 = weavableClass0.toString();
      assertNotNull(string0);
  }
}
