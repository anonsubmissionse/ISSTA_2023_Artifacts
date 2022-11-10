/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:33:36 GMT 2022
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassSet_ESTest extends ClassSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass("java.lang.Object");
      classSet0.remove(javaClass0);
      assertEquals("java.lang.Object", javaClass0.getSuperclassName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass("java.lang.Object");
      classSet0.add(javaClass0);
      classSet0.toArray();
      assertFalse(classSet0.empty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass("java.lang.Object");
      classSet0.add(javaClass0);
      classSet0.getClassNames();
      assertFalse(classSet0.empty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      // Undeclared exception!
      try { 
        classSet0.add((JavaClass) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      boolean boolean0 = classSet0.empty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      assertTrue(classSet0.empty());
      
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass("java.lang.Object");
      classSet0.add(javaClass0);
      boolean boolean0 = classSet0.empty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass("java.lang.Object");
      classSet0.add(javaClass0);
      boolean boolean0 = classSet0.add(javaClass0);
      assertFalse(classSet0.empty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      String[] stringArray0 = classSet0.getClassNames();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      JavaClass[] javaClassArray0 = classSet0.toArray();
      assertEquals(0, javaClassArray0.length);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      // Undeclared exception!
      try { 
        classSet0.remove((JavaClass) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassSet", e);
      }
  }
}
