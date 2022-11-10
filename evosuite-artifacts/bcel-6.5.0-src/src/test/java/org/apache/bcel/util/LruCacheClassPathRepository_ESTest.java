/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:39:37 GMT 2022
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.LruCacheClassPathRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LruCacheClassPathRepository_ESTest extends LruCacheClassPathRepository_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      LruCacheClassPathRepository lruCacheClassPathRepository0 = new LruCacheClassPathRepository(classPath0, 124);
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      lruCacheClassPathRepository0.removeClass(javaClass0);
      assertEquals("java.lang", javaClass0.getPackageName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      LruCacheClassPathRepository lruCacheClassPathRepository0 = new LruCacheClassPathRepository(classPath0, 185);
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass("org.apache.bcel.util.LruCacheClassPathRepository");
      lruCacheClassPathRepository0.storeClass(javaClass0);
      JavaClass javaClass1 = lruCacheClassPathRepository0.findClass("org.apache.bcel.util.LruCacheClassPathRepository");
      assertFalse(javaClass1.isTransient());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      LruCacheClassPathRepository lruCacheClassPathRepository0 = new LruCacheClassPathRepository(classPath0, 198);
      JavaClass javaClass0 = lruCacheClassPathRepository0.findClass("");
      assertNull(javaClass0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      LruCacheClassPathRepository lruCacheClassPathRepository0 = null;
      try {
        lruCacheClassPathRepository0 = new LruCacheClassPathRepository(classPath0, (-2256));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cacheSize must be a positive number.
         //
         verifyException("org.apache.bcel.util.LruCacheClassPathRepository", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      LruCacheClassPathRepository lruCacheClassPathRepository0 = new LruCacheClassPathRepository(classPath0, 1);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      lruCacheClassPathRepository0.storeClass(javaClass0);
      JavaClass javaClass1 = javaClass0.getSuperClass();
      assertTrue(javaClass1.isAbstract());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      LruCacheClassPathRepository lruCacheClassPathRepository0 = new LruCacheClassPathRepository(classPath0, 13);
      // Undeclared exception!
      try { 
        lruCacheClassPathRepository0.removeClass((JavaClass) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.LruCacheClassPathRepository", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("YNq;v+psq3");
      LruCacheClassPathRepository lruCacheClassPathRepository0 = new LruCacheClassPathRepository(classPath0, 1553);
      // Undeclared exception!
      try { 
        lruCacheClassPathRepository0.storeClass((JavaClass) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.LruCacheClassPathRepository", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      LruCacheClassPathRepository lruCacheClassPathRepository0 = new LruCacheClassPathRepository(classPath0, 13);
      lruCacheClassPathRepository0.clear();
  }
}
