/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:10:31 GMT 2022
 */

package org.apache.commons.lang3.reflect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import org.apache.commons.lang3.reflect.ConstructorUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstructorUtils_ESTest extends ConstructorUtils_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 3);
      Constructor<Annotation> constructor0 = ConstructorUtils.getMatchingAccessibleConstructor(class0, (Class<?>[]) classArray0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Annotation>[] classArray0 = (Class<Annotation>[]) Array.newInstance(Class.class, 0);
      Class<String> class0 = String.class;
      Constructor<String> constructor0 = ConstructorUtils.getMatchingAccessibleConstructor(class0, (Class<?>[]) classArray0);
      constructor0.setAccessible(true);
      Constructor<String> constructor1 = ConstructorUtils.getAccessibleConstructor(constructor0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Constructor<Integer> constructor0 = ConstructorUtils.getAccessibleConstructor(class0, (Class<?>[]) classArray0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 8);
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeExactConstructor((Class<Integer>) null, (Object[]) null, (Class<?>[]) classArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // cls
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeExactConstructor(class0, objectArray0, (Class<?>[]) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeExactConstructor((Class<Object>) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // cls
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      try { 
        ConstructorUtils.invokeExactConstructor(class0, (Object[]) null);
        fail("Expecting exception: NoSuchMethodException");
      } catch(NoSuchMethodException e) {
         //
         // No such accessible constructor on object: java.lang.annotation.Annotation
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      try { 
        ConstructorUtils.invokeConstructor(class0, (Object[]) classArray0, (Class<?>[]) classArray0);
        fail("Expecting exception: InvocationTargetException");
      } catch(InvocationTargetException e) {
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeConstructor((Class<Integer>) null, (Object[]) classArray0, (Class<?>[]) classArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // cls
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Constructor<Integer> constructor0 = ConstructorUtils.getMatchingAccessibleConstructor(class0, (Class<?>[]) classArray0);
      Type[] typeArray0 = constructor0.getGenericExceptionTypes();
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeConstructor(class0, (Object[]) typeArray0, (Class<?>[]) classArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 1);
      try { 
        ConstructorUtils.invokeConstructor(class0, (Object[]) classArray0);
        fail("Expecting exception: InvocationTargetException");
      } catch(InvocationTargetException e) {
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[11];
      // Undeclared exception!
      try { 
        ConstructorUtils.invokeConstructor((Class<Object>) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // cls
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConstructorUtils.getMatchingAccessibleConstructor((Class<Integer>) null, (Class<?>[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // cls
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConstructorUtils.getAccessibleConstructor((Constructor<Annotation>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // ctor
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 1);
      // Undeclared exception!
      try { 
        ConstructorUtils.getAccessibleConstructor(classArray0[0], (Class<?>[]) classArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // cls
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Annotation>[] classArray0 = (Class<Annotation>[]) Array.newInstance(Class.class, 0);
      Object object0 = ConstructorUtils.invokeExactConstructor(class0, (Object[]) classArray0, (Class<?>[]) classArray0);
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Annotation>[] classArray0 = (Class<Annotation>[]) Array.newInstance(Class.class, 0);
      Class<Object> class0 = Object.class;
      Object object0 = ConstructorUtils.invokeConstructor(class0, (Object[]) classArray0, (Class<?>[]) classArray0);
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      try { 
        ConstructorUtils.invokeConstructor(class0, (Object[]) null, (Class<?>[]) null);
        fail("Expecting exception: NoSuchMethodException");
      } catch(NoSuchMethodException e) {
         //
         // No such accessible constructor on object: java.lang.annotation.Annotation
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Annotation>[] classArray0 = (Class<Annotation>[]) Array.newInstance(Class.class, 0);
      Class<Object> class0 = Object.class;
      Constructor<Object> constructor0 = ConstructorUtils.getAccessibleConstructor(class0, (Class<?>[]) classArray0);
      assertEquals(0, constructor0.getModifiers());
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      Constructor<String> constructor0 = ConstructorUtils.getMatchingAccessibleConstructor(class0, (Class<?>[]) classArray0);
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Constructor<Integer> constructor0 = ConstructorUtils.getMatchingAccessibleConstructor(class0, (Class<?>[]) classArray0);
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Constructor<Integer> constructor0 = ConstructorUtils.getMatchingAccessibleConstructor(class0, (Class<?>[]) classArray0);
      Constructor<Integer> constructor1 = ConstructorUtils.getAccessibleConstructor(constructor0);
      assertNotNull(constructor1.toString());
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[7];
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 3);
      try { 
        ConstructorUtils.invokeExactConstructor(class0, objectArray0, (Class<?>[]) classArray0);
        fail("Expecting exception: NoSuchMethodException");
      } catch(NoSuchMethodException e) {
         //
         // No such accessible constructor on object: java.lang.Object
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      Class<Object> class0 = Object.class;
      try { 
        ConstructorUtils.invokeConstructor(class0, objectArray0);
        fail("Expecting exception: NoSuchMethodException");
      } catch(NoSuchMethodException e) {
         //
         // No such accessible constructor on object: java.lang.Object
         //
         verifyException("org.apache.commons.lang3.reflect.ConstructorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = ConstructorUtils.invokeConstructor(class0, (Object[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ConstructorUtils constructorUtils0 = new ConstructorUtils();
  }
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<String> class0 = String.class;
      String string0 = ConstructorUtils.invokeExactConstructor(class0, (Object[]) null);
      ;
}
}
