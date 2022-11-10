/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 16:43:12 GMT 2022
 */

package org.apache.commons.weaver.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import org.apache.commons.weaver.model.WeavableClass;
import org.apache.commons.weaver.model.WeavableConstructor;
import org.apache.commons.weaver.model.WeavableField;
import org.apache.commons.weaver.model.WeavableMethod;
import org.apache.commons.weaver.model.WeavablePackage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WeavableClass_ESTest extends WeavableClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Class<Integer> class0 = Integer.TYPE;
      WeavableClass<Integer> weavableClass0 = new WeavableClass<Integer>(class0, weavablePackage0);
      Class<Integer> class1 = Integer.class;
      WeavableClass<Integer> weavableClass1 = new WeavableClass<Integer>(class1, weavablePackage0);
      int int0 = weavableClass0.localCompareTo(weavableClass1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WeavableClass<WeavablePackage> weavableClass0 = new WeavableClass<WeavablePackage>((Class<WeavablePackage>) null, (WeavablePackage) null);
      // Undeclared exception!
      try { 
        weavableClass0.localCompareTo(weavableClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Comparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Class<Locale.Category> class0 = Locale.Category.class;
      WeavableClass<Locale.Category> weavableClass0 = new WeavableClass<Locale.Category>(class0, weavablePackage0);
      int int0 = weavableClass0.localCompareTo((WeavableClass<Locale.Category>) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<WeavablePackage> class0 = WeavablePackage.class;
      WeavableClass<WeavablePackage> weavableClass0 = new WeavableClass<WeavablePackage>(class0, (WeavablePackage) null);
      int int0 = weavableClass0.localCompareTo(weavableClass0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      WeavableClass<Annotation> weavableClass0 = new WeavableClass<Annotation>(class0, (WeavablePackage) null);
      // Undeclared exception!
      try { 
        weavableClass0.getWeavable((Method) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentSkipListMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Class<Integer> class0 = Integer.class;
      WeavableClass<Integer> weavableClass0 = weavablePackage0.getWeavable(class0);
      Iterable<WeavableField<Integer>> iterable0 = weavableClass0.getFields();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Class<Object> class0 = Object.class;
      WeavableClass<Object> weavableClass0 = weavablePackage0.getWeavable(class0);
      // Undeclared exception!
      try { 
        weavableClass0.getWeavable((Field) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.weaver.model.WeavableClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Class<Object> class0 = Object.class;
      WeavableClass<Object> weavableClass0 = weavablePackage0.getWeavable(class0);
      Iterable<WeavableMethod<Object>> iterable0 = weavableClass0.getMethods();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Class<Locale.Category> class0 = Locale.Category.class;
      WeavableClass<Locale.Category> weavableClass0 = new WeavableClass<Locale.Category>(class0, weavablePackage0);
      Iterable<WeavableConstructor<Locale.Category>> iterable0 = weavableClass0.getConstructors();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      WeavablePackage weavablePackage0 = new WeavablePackage((Package) null);
      Class<Package> class0 = Package.class;
      WeavableClass<Package> weavableClass0 = weavablePackage0.getWeavable(class0);
      // Undeclared exception!
      try { 
        weavableClass0.getWeavable((Constructor<Package>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentSkipListMap", e);
      }
  }
}
