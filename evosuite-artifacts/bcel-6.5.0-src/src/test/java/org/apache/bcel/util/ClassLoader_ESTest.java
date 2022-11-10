/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:21:12 GMT 2022
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.ClassLoader;
import org.apache.bcel.util.ClassLoaderRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassLoader_ESTest extends ClassLoader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[8];
      ClassLoader classLoader0 = new ClassLoader(stringArray0);
      // Undeclared exception!
      try { 
        classLoader0.loadClass("org.apache.bcel.classfile.ConstantNameAndType", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader();
      Class<?> class0 = classLoader0.loadClass("org.apache.bcel.classfile.InnerClass", true);
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isTransient(true);
      classLoader0.modifyClass(javaClass0);
      //  // Unstable assertion: assertEquals(17, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ClassLoader classLoader0 = new ClassLoader(stringArray0);
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isSynthetic(true);
      JavaClass javaClass1 = classLoader0.modifyClass(javaClass0);
      assertFalse(javaClass1.isNative());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader((String[]) null);
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<ConstantUtf8> class0 = ConstantUtf8.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isSynchronized(false);
      JavaClass javaClass1 = classLoader0.modifyClass(javaClass0);
      assertFalse(javaClass1.isPrivate());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isProtected(true);
      JavaClass javaClass1 = classLoader0.modifyClass(javaClass0);
      assertEquals("java.lang.String", javaClass1.getFileName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<ConstantClass> class0 = ConstantClass.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setModifiers(378);
      JavaClass javaClass1 = classLoader0.modifyClass(javaClass0);
      assertSame(javaClass1, javaClass0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isEnum(true);
      JavaClass javaClass1 = classLoader0.modifyClass(javaClass0);
      assertFalse(javaClass1.isVolatile());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isInterface(true);
      JavaClass javaClass1 = classLoader0.modifyClass(javaClass0);
      assertEquals("java.lang", javaClass1.getPackageName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader();
      Class<?> class0 = classLoader0.loadClass("org.apache.bcel.classfile.InnerClass", true);
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isAnnotation(true);
      classLoader0.modifyClass(javaClass0);
      //  // Unstable assertion: assertEquals(17, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ClassLoader classLoader0 = new ClassLoader(stringArray0);
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      JavaClass javaClass1 = classLoader0.modifyClass(javaClass0);
      assertEquals("java.lang", javaClass1.getPackageName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setSuperclassNameIndex((-4288));
      JavaClass javaClass1 = classLoader0.modifyClass(javaClass0);
      assertEquals((byte)2, JavaClass.FILE);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ClassLoader classLoader0 = new ClassLoader(stringArray0);
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setClassNameIndex((-1729));
      JavaClass javaClass1 = classLoader0.modifyClass(javaClass0);
      assertTrue(javaClass1.isFinal());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader();
      Class<?> class0 = classLoader0.loadClass("java.lang.Cloneable", true);
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader();
      Class<?> class0 = classLoader0.loadClass("org.apache.bcel.util.LruCacheClassPathRepository$1", true);
      assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader();
      // Undeclared exception!
      try { 
        classLoader0.loadClass("", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid class name 
         //
         verifyException("org.apache.bcel.util.AbstractClassPathRepository", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader();
      // Undeclared exception!
      try { 
        classLoader0.createClass("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader();
      // Undeclared exception!
      try { 
        classLoader0.createClass("3ycb|5W$0<2/W?@8(W7");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0<\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader();
      // Undeclared exception!
      try { 
        classLoader0.createClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader();
      try { 
        classLoader0.loadClass("N$$BCEL$$", false);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      String[] stringArray0 = new String[7];
      ClassLoader classLoader1 = new ClassLoader(classLoader0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader((String[]) null);
      JavaClass javaClass0 = classLoader0.createClass("lZLwg[d{F{Q]B");
      assertNull(javaClass0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader();
      classLoader0.loadClass("org.apache.bcel.classfile.InnerClass", true);
      Class<?> class0 = classLoader0.loadClass("org.apache.bcel.classfile.InnerClass", false);
      //  // Unstable assertion: assertEquals(17, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader((String[]) null);
      JavaClass javaClass0 = classLoader0.modifyClass((JavaClass) null);
      assertNull(javaClass0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassLoader classLoader0 = new ClassLoader((String[]) null);
      ClassLoader classLoader1 = new ClassLoader(classLoader0);
      assertFalse(classLoader1.equals((Object)classLoader0));
  }
}
