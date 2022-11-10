/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:08:55 GMT 2022
 */

package org.apache.commons.dbutils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.EventHandler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.apache.commons.dbutils.ProxyFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProxyFactory_ESTest extends ProxyFactory_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProxyFactory proxyFactory0 = ProxyFactory.instance();
      EventHandler eventHandler0 = new EventHandler(proxyFactory0, "77WRJ{sf>lN", "77WRJ{sf>lN", "77WRJ{sf>lN");
      Proxy proxy0 = (Proxy)proxyFactory0.createResultSet(eventHandler0);
      assertNotNull(proxy0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ProxyFactory proxyFactory0 = new ProxyFactory();
      Class<Integer> class0 = Integer.class;
      InvocationHandler invocationHandler0 = mock(InvocationHandler.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        proxyFactory0.newProxyInstance(class0, invocationHandler0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // java.lang.Integer is not an interface
         //
         verifyException("java.lang.reflect.Proxy$ProxyClassFactory", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ProxyFactory proxyFactory0 = ProxyFactory.instance();
      // Undeclared exception!
      try { 
        proxyFactory0.createStatement((InvocationHandler) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.ProxyFactory", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ProxyFactory proxyFactory0 = ProxyFactory.instance();
      // Undeclared exception!
      try { 
        proxyFactory0.createResultSetMetaData((InvocationHandler) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.ProxyFactory", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ProxyFactory proxyFactory0 = ProxyFactory.instance();
      // Undeclared exception!
      try { 
        proxyFactory0.createPreparedStatement((InvocationHandler) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.ProxyFactory", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ProxyFactory proxyFactory0 = ProxyFactory.instance();
      // Undeclared exception!
      try { 
        proxyFactory0.createDriver((InvocationHandler) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.ProxyFactory", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ProxyFactory proxyFactory0 = new ProxyFactory();
      // Undeclared exception!
      try { 
        proxyFactory0.createConnection((InvocationHandler) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.ProxyFactory", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ProxyFactory proxyFactory0 = new ProxyFactory();
      // Undeclared exception!
      try { 
        proxyFactory0.createCallableStatement((InvocationHandler) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.ProxyFactory", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ProxyFactory proxyFactory0 = ProxyFactory.instance();
      EventHandler eventHandler0 = new EventHandler(proxyFactory0, "77WRJ{sf>lN", "77WRJ{sf>lN", "77WRJ{sf>lN");
      Proxy proxy0 = (Proxy)proxyFactory0.createCallableStatement(eventHandler0);
      assertNotNull(proxy0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ProxyFactory proxyFactory0 = ProxyFactory.instance();
      EventHandler eventHandler0 = new EventHandler(proxyFactory0, "77WRJ{sf>lN", "77WRJ{sf>lN", "77WRJ{sf>lN");
      Proxy proxy0 = (Proxy)proxyFactory0.createResultSetMetaData(eventHandler0);
      assertNotNull(proxy0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ProxyFactory proxyFactory0 = ProxyFactory.instance();
      EventHandler eventHandler0 = new EventHandler(proxyFactory0, "77WRJ{sf>lN", "77WRJ{sf>lN", "77WRJ{sf>lN");
      Proxy proxy0 = (Proxy)proxyFactory0.createDriver(eventHandler0);
      assertNotNull(proxy0);
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ProxyFactory proxyFactory0 = ProxyFactory.instance();
      EventHandler eventHandler0 = new EventHandler(proxyFactory0, "77WRJ{sf>lN", "77WRJ{sf>lN", "77WRJ{sf>lN");
      Proxy proxy0 = (Proxy)proxyFactory0.createStatement(eventHandler0);
      assertNotNull(proxy0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ProxyFactory proxyFactory0 = ProxyFactory.instance();
      EventHandler eventHandler0 = new EventHandler(proxyFactory0, "77WRJ{sf>lN", "77WRJ{sf>lN", "77WRJ{sf>lN");
      Proxy proxy0 = (Proxy)proxyFactory0.createConnection(eventHandler0);
      assertNotNull(proxy0);
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ProxyFactory proxyFactory0 = ProxyFactory.instance();
      EventHandler eventHandler0 = new EventHandler(proxyFactory0, "77WRJ{sf>lN", "77WRJ{sf>lN", "77WRJ{sf>lN");
      Proxy proxy0 = (Proxy)proxyFactory0.createPreparedStatement(eventHandler0);
      assertNotNull(proxy0);
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ProxyFactory proxyFactory0 = new ProxyFactory();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        proxyFactory0.newProxyInstance(class0, (InvocationHandler) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.ProxyFactory", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ProxyFactory proxyFactory0 = ProxyFactory.instance();
      // Undeclared exception!
      try { 
        proxyFactory0.createResultSet((InvocationHandler) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.ProxyFactory", e);
      }
  }
}
