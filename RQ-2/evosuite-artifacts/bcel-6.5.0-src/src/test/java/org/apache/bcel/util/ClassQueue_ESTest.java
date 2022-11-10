/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:41:56 GMT 2022
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassQueue_ESTest extends ClassQueue_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassQueue classQueue0 = new ClassQueue();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<JavaClass> class0 = JavaClass.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      classQueue0.enqueue(javaClass0);
      boolean boolean0 = classQueue0.empty();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassQueue classQueue0 = new ClassQueue();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass("org.apache.bcel.util.ClassQueue");
      javaClass0.isVolatile(true);
      classQueue0.enqueue(javaClass0);
      JavaClass javaClass1 = classQueue0.dequeue();
      assertFalse(javaClass1.isStrictfp());
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassQueue classQueue0 = new ClassQueue();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<JavaClass> class0 = JavaClass.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isStrictfp(true);
      classQueue0.enqueue(javaClass0);
      JavaClass javaClass1 = classQueue0.dequeue();
      assertFalse(javaClass1.isSynthetic());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassQueue classQueue0 = new ClassQueue();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass("org.apache.bcel.classfile.JavaClass$1");
      classQueue0.enqueue(javaClass0);
      JavaClass javaClass1 = classQueue0.dequeue();
      assertFalse(javaClass1.isInterface());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassQueue classQueue0 = new ClassQueue();
      LinkedList<JavaClass> linkedList0 = new LinkedList<JavaClass>();
      classQueue0.vec = linkedList0;
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      linkedList0.add(javaClass0);
      JavaClass javaClass1 = classQueue0.dequeue();
      assertFalse(javaClass1.isPrivate());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassQueue classQueue0 = new ClassQueue();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      classQueue0.enqueue(javaClass0);
      JavaClass javaClass1 = classQueue0.dequeue();
      assertFalse(javaClass1.isAbstract());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassQueue classQueue0 = new ClassQueue();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setMajor((-307));
      classQueue0.enqueue(javaClass0);
      JavaClass javaClass1 = classQueue0.dequeue();
      assertNotNull(javaClass1.getPackageName());
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassQueue classQueue0 = new ClassQueue();
      LinkedList<JavaClass> linkedList0 = new LinkedList<JavaClass>();
      classQueue0.vec = linkedList0;
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      linkedList0.add(javaClass0);
      classQueue0.toString();
      linkedList0.offerFirst(javaClass0);
      classQueue0.toString();
      classQueue0.toString();
      classQueue0.toString();
      // Undeclared exception!
      classQueue0.toString();
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassQueue classQueue0 = new ClassQueue();
      classQueue0.vec = null;
      // Undeclared exception!
      try { 
        classQueue0.toString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassQueue", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ClassQueue classQueue0 = new ClassQueue();
      classQueue0.vec = null;
      // Undeclared exception!
      try { 
        classQueue0.enqueue((JavaClass) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassQueue", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassQueue classQueue0 = new ClassQueue();
      classQueue0.vec = null;
      // Undeclared exception!
      try { 
        classQueue0.empty();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassQueue", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassQueue classQueue0 = new ClassQueue();
      classQueue0.vec = null;
      // Undeclared exception!
      try { 
        classQueue0.dequeue();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassQueue", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassQueue classQueue0 = new ClassQueue();
      boolean boolean0 = classQueue0.empty();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassQueue classQueue0 = new ClassQueue();
      // Undeclared exception!
      try { 
        classQueue0.dequeue();
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassQueue classQueue0 = new ClassQueue();
      classQueue0.enqueue((JavaClass) null);
      JavaClass javaClass0 = classQueue0.dequeue();
      assertNotNull(javaClass0);
}
}
