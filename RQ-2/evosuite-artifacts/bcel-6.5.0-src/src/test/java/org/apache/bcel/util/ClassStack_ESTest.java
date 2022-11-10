/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:54:46 GMT 2022
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.EmptyStackException;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassStack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassStack_ESTest extends ClassStack_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      classStack0.push((JavaClass) null);
      JavaClass javaClass0 = classStack0.top();
      assertNotNull(javaClass0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isVarArgs(true);
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.top();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isProtected(true);
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.top();
      assertTrue(javaClass1.isVolatile());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isNative(true);
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.top();
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isEnum(true);
      classStack0.push(javaClass0);
      classStack0.push((JavaClass) null);
      classStack0.pop();
      JavaClass javaClass1 = classStack0.top();
      assertNotNull(javaClass1.getSourceFileName());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.top();
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setMinor(1012);
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.top();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setClassNameIndex((byte)0);
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.top();
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setClassNameIndex((-1));
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.top();
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isVarArgs(true);
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.pop();
      assertEquals(0, javaClass1.getModifiers());
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<PushbackInputStream> class0 = PushbackInputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isSynchronized(false);
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.pop();
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isStatic(true);
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.pop();
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isProtected(true);
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.pop();
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isNative(true);
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.pop();
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isEnum(true);
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.pop();
      assertEquals(0, javaClass1.getMinor());
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setMinor(1012);
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.pop();
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setClassNameIndex((byte)0);
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.pop();
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setClassNameIndex((-1));
      classStack0.push(javaClass0);
      JavaClass javaClass1 = classStack0.pop();
      assertFalse(javaClass1.isPrivate());
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      classStack0.push(javaClass0);
      boolean boolean0 = classStack0.empty();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      // Undeclared exception!
      try { 
        classStack0.pop();
        fail("Expecting exception: EmptyStackException");
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      // Undeclared exception!
      try { 
        classStack0.top();
        fail("Expecting exception: EmptyStackException");
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassStack classStack0 = new ClassStack();
      boolean boolean0 = classStack0.empty();
      assertTrue(boolean0);
}
}
