/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:46:11 GMT 2022
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassVector_ESTest extends ClassVector_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      classVector0.addElement((JavaClass) null);
      classVector0.removeElementAt(0);
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      classVector0.addElement(javaClass0);
      JavaClass[] javaClassArray0 = classVector0.toArray();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<PipedInputStream> class0 = PipedInputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      classVector0.addElement(javaClass0);
      javaClass0.isTransient(true);
      JavaClass javaClass1 = classVector0.elementAt(0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isNative(true);
      classVector0.addElement(javaClass0);
      JavaClass javaClass1 = classVector0.elementAt(0);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      classVector0.addElement(javaClass0);
      JavaClass javaClass1 = classVector0.elementAt(0);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      classVector0.addElement(javaClass0);
      JavaClass javaClass1 = classVector0.elementAt(0);
      assertNotNull(javaClass1.getSourceFileName());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      classVector0.addElement(javaClass0);
      javaClass0.setSuperclassNameIndex((-3645));
      JavaClass javaClass1 = classVector0.elementAt(0);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      classVector0.addElement(javaClass0);
      javaClass0.setMinor((byte)1);
      JavaClass javaClass1 = classVector0.elementAt(0);
      assertFalse(javaClass1.isNative());
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      classVector0.vec = null;
      // Undeclared exception!
      try { 
        classVector0.toArray();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassVector", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      classVector0.vec = null;
      // Undeclared exception!
      try { 
        classVector0.removeElementAt(88);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassVector", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      // Undeclared exception!
      try { 
        classVector0.removeElementAt((-6344));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      classVector0.vec = null;
      // Undeclared exception!
      try { 
        classVector0.elementAt(1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassVector", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      // Undeclared exception!
      try { 
        classVector0.elementAt(525);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 525, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      classVector0.vec = null;
      // Undeclared exception!
      try { 
        classVector0.addElement((JavaClass) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassVector", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      // Undeclared exception!
      try { 
        classVector0.elementAt((-1912));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      // Undeclared exception!
      try { 
        classVector0.removeElementAt(88);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 88, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      JavaClass[] javaClassArray0 = classVector0.toArray();
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassVector classVector0 = new ClassVector();
      classVector0.addElement((JavaClass) null);
      JavaClass javaClass0 = classVector0.elementAt(0);
      ;
}
}
