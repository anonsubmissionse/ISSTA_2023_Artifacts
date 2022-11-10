/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:18:27 GMT 2022
 */

package org.apache.commons.jcs3.jcache.proxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import org.apache.commons.jcs3.jcache.proxy.ExceptionWrapperHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExceptionWrapperHandler_ESTest extends ExceptionWrapperHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        ExceptionWrapperHandler.newProxy(classLoader0, (Object) classLoader0, (Class<? extends RuntimeException>) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.jcache.proxy.ExceptionWrapperHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<RuntimeException> class0 = RuntimeException.class;
      Object[] objectArray0 = new Object[7];
      ExceptionWrapperHandler<Object> exceptionWrapperHandler0 = new ExceptionWrapperHandler<Object>(class0, class0);
      try { 
        exceptionWrapperHandler0.invoke(class0, (Method) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.jcache.proxy.ExceptionWrapperHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ExceptionWrapperHandler<RuntimeException> exceptionWrapperHandler0 = null;
      try {
        exceptionWrapperHandler0 = new ExceptionWrapperHandler<RuntimeException>((RuntimeException) null, (Class<? extends RuntimeException>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.jcache.proxy.ExceptionWrapperHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<Object> class0 = Object.class;
      Class<RuntimeException> class1 = RuntimeException.class;
      // Undeclared exception!
      try { 
        ExceptionWrapperHandler.newProxy(classLoader0, (Object) class0, (Class<? extends RuntimeException>) class1, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.lang.Object is not an interface
         //
         verifyException("java.lang.reflect.Proxy$ProxyClassFactory", e);
      }
  }
}
