/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 17:58:37 GMT 2022
 */

package org.apache.commons.jexl3.internal.introspection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.CharBuffer;
import org.apache.commons.jexl3.internal.introspection.AbstractExecutor;
import org.apache.commons.jexl3.internal.introspection.DuckGetExecutor;
import org.apache.commons.jexl3.internal.introspection.DuckSetExecutor;
import org.apache.commons.jexl3.internal.introspection.Introspector;
import org.apache.commons.jexl3.internal.introspection.ListGetExecutor;
import org.apache.commons.jexl3.internal.introspection.MapGetExecutor;
import org.apache.commons.jexl3.internal.introspection.PropertySetExecutor;
import org.apache.commons.logging.impl.SimpleLog;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractExecutor_ESTest extends AbstractExecutor_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<MapGetExecutor> class0 = MapGetExecutor.class;
      PropertySetExecutor propertySetExecutor0 = new PropertySetExecutor(class0, (Method) null, "zP+", (Object) null);
      PropertySetExecutor propertySetExecutor1 = new PropertySetExecutor(class0, (Method) null, "", (Object) null);
      // Undeclared exception!
      try { 
        propertySetExecutor0.equals((AbstractExecutor) propertySetExecutor1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.internal.introspection.AbstractExecutor", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleLog simpleLog0 = new SimpleLog((String) null);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Introspector introspector0 = new Introspector(simpleLog0, classLoader0);
      Class<CharBuffer> class0 = CharBuffer.class;
      DuckGetExecutor duckGetExecutor0 = DuckGetExecutor.discover(introspector0, class0, (Object) null);
      duckGetExecutor0.hashCode();
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object[] objectArray0 = AbstractExecutor.makeArgs((Object[]) null);
      assertNotNull(objectArray0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      Object[] objectArray1 = AbstractExecutor.makeArgs(objectArray0);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Object[] objectArray1 = AbstractExecutor.makeArgs(objectArray0);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimpleLog simpleLog0 = new SimpleLog((String) null);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Introspector introspector0 = new Introspector(simpleLog0, classLoader0);
      Class<CharBuffer> class0 = CharBuffer.class;
      DuckGetExecutor duckGetExecutor0 = DuckGetExecutor.discover(introspector0, class0, (Object) null);
      Object object0 = duckGetExecutor0.getTargetProperty();
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<MapGetExecutor> class0 = MapGetExecutor.class;
      PropertySetExecutor propertySetExecutor0 = new PropertySetExecutor(class0, (Method) null, "zP+", (Object) null);
      Object object0 = propertySetExecutor0.getTargetProperty();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Class<Object> class1 = Object.class;
      PropertySetExecutor propertySetExecutor0 = new PropertySetExecutor(class0, (Method) null, "", class1);
      Class<?> class2 = propertySetExecutor0.getTargetClass();
      assertFalse(class2.isInterface());
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SimpleLog simpleLog0 = new SimpleLog((String) null);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Introspector introspector0 = new Introspector(simpleLog0, classLoader0);
      Class<CharBuffer> class0 = CharBuffer.class;
      DuckGetExecutor duckGetExecutor0 = DuckGetExecutor.discover(introspector0, class0, (Object) null);
      String string0 = duckGetExecutor0.getMethodName();
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Class<MapGetExecutor> class0 = MapGetExecutor.class;
      PropertySetExecutor propertySetExecutor0 = new PropertySetExecutor(class0, (Method) null, "zP+", (Object) null);
      Method method0 = propertySetExecutor0.getMethod();
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Class<?> class0 = AbstractExecutor.classOf(charBuffer0);
      assertEquals(0, class0.getModifiers());
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<?> class0 = AbstractExecutor.classOf((Object) null);
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Float float0 = new Float(0.0);
      Integer integer0 = AbstractExecutor.castInteger(float0);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = AbstractExecutor.castInteger(integer0);
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer((-1041));
      Integer integer1 = AbstractExecutor.castInteger(integer0);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleLog simpleLog0 = new SimpleLog((String) null);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Introspector introspector0 = new Introspector(simpleLog0, classLoader0);
      Class<CharBuffer> class0 = CharBuffer.class;
      DuckGetExecutor duckGetExecutor0 = DuckGetExecutor.discover(introspector0, class0, (Object) null);
      Method method0 = duckGetExecutor0.getMethod();
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleLog simpleLog0 = new SimpleLog((String) null);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Introspector introspector0 = new Introspector(simpleLog0, classLoader0);
      Class<CharBuffer> class0 = CharBuffer.class;
      DuckGetExecutor duckGetExecutor0 = DuckGetExecutor.discover(introspector0, class0, (Object) null);
      Method method0 = duckGetExecutor0.getMethod();
      assertFalse(duckGetExecutor0.isAlive());
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<MapGetExecutor> class0 = MapGetExecutor.class;
      PropertySetExecutor propertySetExecutor0 = new PropertySetExecutor(class0, (Method) null, "zP+", (Object) null);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      boolean boolean0 = propertySetExecutor0.tryFailed(classLoader0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleLog simpleLog0 = new SimpleLog((String) null);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Introspector introspector0 = new Introspector(simpleLog0, classLoader0);
      Class<CharBuffer> class0 = CharBuffer.class;
      DuckGetExecutor duckGetExecutor0 = DuckGetExecutor.discover(introspector0, class0, (Object) null);
      boolean boolean0 = duckGetExecutor0.isCacheable();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<MapGetExecutor> class0 = MapGetExecutor.class;
      PropertySetExecutor propertySetExecutor0 = new PropertySetExecutor(class0, (Method) null, "6P+", (Object) null);
      boolean boolean0 = propertySetExecutor0.isCacheable();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<MapGetExecutor> class0 = MapGetExecutor.class;
      PropertySetExecutor propertySetExecutor0 = new PropertySetExecutor(class0, (Method) null, "z~+", (Object) null);
      boolean boolean0 = propertySetExecutor0.isAlive();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<MapGetExecutor> class0 = MapGetExecutor.class;
      PropertySetExecutor propertySetExecutor0 = new PropertySetExecutor(class0, (Method) null, "zP+", (Object) null);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      boolean boolean0 = propertySetExecutor0.equals((Object) classLoader0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer integer0 = new Integer(36);
      String string0 = AbstractExecutor.castString(integer0);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = AbstractExecutor.castString((Object) null);
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = AbstractExecutor.castString("zP+");
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Integer integer0 = AbstractExecutor.castInteger((Object) null);
      assertNotNull(integer0);
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<MapGetExecutor> class0 = MapGetExecutor.class;
      PropertySetExecutor propertySetExecutor0 = new PropertySetExecutor(class0, (Method) null, "zP+", (Object) null);
      Class<?> class1 = propertySetExecutor0.getTargetClass();
      assertTrue(class1.isAnnotation());
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<ListGetExecutor> class0 = ListGetExecutor.class;
      Class<DuckSetExecutor>[] classArray0 = (Class<DuckSetExecutor>[]) Array.newInstance(Class.class, 0);
      // Undeclared exception!
      try { 
        AbstractExecutor.initMarker(class0, "", classArray0);
        fail("Expecting exception: Error");
      } catch(Error e) {
         //
         // java.lang.NoSuchMethodException: org.apache.commons.jexl3.internal.introspection.ListGetExecutor.()
         //
         verifyException("org.apache.commons.jexl3.internal.introspection.AbstractExecutor", e);
      }
  }
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<MapGetExecutor> class0 = MapGetExecutor.class;
      PropertySetExecutor propertySetExecutor0 = new PropertySetExecutor(class0, (Method) null, "z~+", (Object) null);
      // Undeclared exception!
      try { 
        propertySetExecutor0.getMethodName();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.internal.introspection.AbstractExecutor", e);
      }
  }
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<MapGetExecutor> class0 = MapGetExecutor.class;
      PropertySetExecutor propertySetExecutor0 = new PropertySetExecutor(class0, (Method) null, "zP+", (Object) null);
      // Undeclared exception!
      try { 
        propertySetExecutor0.hashCode();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.internal.introspection.AbstractExecutor", e);
      }
  }
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleLog simpleLog0 = new SimpleLog((String) null);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Introspector introspector0 = new Introspector(simpleLog0, classLoader0);
      Class<CharBuffer> class0 = CharBuffer.class;
      DuckGetExecutor duckGetExecutor0 = DuckGetExecutor.discover(introspector0, class0, (Object) null);
      boolean boolean0 = duckGetExecutor0.isAlive();
      assertTrue(boolean0);
}
}
