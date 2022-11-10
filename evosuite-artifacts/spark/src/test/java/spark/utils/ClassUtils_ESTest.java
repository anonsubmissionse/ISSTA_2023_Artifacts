/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 17:04:43 GMT 2022
 */

package spark.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.utils.ClassUtils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassUtils_ESTest extends ClassUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<?> class0 = ClassUtils.resolvePrimitiveClassName("[C");
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassLoader classLoader0 = ClassUtils.getDefaultClassLoader();
      Class<?> class0 = ClassUtils.forName("com.sun.nio.file.SensitivityWatchEventModifier", classLoader0);
      assertEquals("class com.sun.nio.file.SensitivityWatchEventModifier", class0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassLoader classLoader0 = ClassUtils.getDefaultClassLoader();
      Class<?> class0 = ClassUtils.forName("org.eclipse.jetty.util.Scanner$Visitor", classLoader0);
      assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        ClassUtils.forName((String) null, classLoader0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Name must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<?> class0 = ClassUtils.resolvePrimitiveClassName("qs(6|e^D#Hi+Q:l;A");
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassLoader classLoader0 = ClassUtils.getDefaultClassLoader();
      try { 
        ClassUtils.forName(".@bER;-~+9;x0I.S/", classLoader0);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      try { 
        ClassUtils.forName("-", (ClassLoader) null);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassLoader classLoader0 = ClassUtils.getDefaultClassLoader();
      Class<?> class0 = ClassUtils.forName("[org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate", classLoader0);
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      String string0 = ClassUtils.classPackageAsResourcePath(class0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = ClassUtils.classPackageAsResourcePath((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String string0 = ClassUtils.classPackageAsResourcePath(class0);
      assertEquals("java/lang", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<?> class0 = ClassUtils.resolvePrimitiveClassName((String) null);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassLoader classLoader0 = ClassUtils.getDefaultClassLoader();
      try { 
        ClassUtils.forName("Z .a2`dU[]", classLoader0);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      try { 
        ClassUtils.forName("[LU;<", (ClassLoader) null);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.forName("[Lorg.eclipse.jetty.webapp.ClasspathPattern$LocationEntry;", classLoader0);
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassLoader classLoader0 = ClassUtils.getDefaultClassLoader();
      Class<?> class0 = ClassUtils.forName("org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate[]", classLoader0);
      assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassLoader classLoader0 = ClassUtils.getDefaultClassLoader();
      Class<?> class0 = ClassUtils.forName("[C", classLoader0);
      assertTrue(class0.isArray());
  }
}
