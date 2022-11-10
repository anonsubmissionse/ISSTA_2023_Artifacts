/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 18:30:12 GMT 2022
 */

package org.apache.commons.beanutils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.beanutils.DefaultIntrospectionContext;
import org.apache.commons.beanutils.FluentPropertyBeanIntrospector;
import org.apache.commons.beanutils.IntrospectionContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FluentPropertyBeanIntrospector_ESTest extends FluentPropertyBeanIntrospector_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FluentPropertyBeanIntrospector fluentPropertyBeanIntrospector0 = new FluentPropertyBeanIntrospector("");
      String string0 = fluentPropertyBeanIntrospector0.getWriteMethodPrefix();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FluentPropertyBeanIntrospector fluentPropertyBeanIntrospector0 = new FluentPropertyBeanIntrospector("");
      // Undeclared exception!
      try { 
        fluentPropertyBeanIntrospector0.introspect((IntrospectionContext) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.beanutils.FluentPropertyBeanIntrospector", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FluentPropertyBeanIntrospector fluentPropertyBeanIntrospector0 = new FluentPropertyBeanIntrospector("equals");
      String string0 = fluentPropertyBeanIntrospector0.getWriteMethodPrefix();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FluentPropertyBeanIntrospector fluentPropertyBeanIntrospector0 = new FluentPropertyBeanIntrospector("p");
      Class<Integer> class0 = Integer.class;
      DefaultIntrospectionContext defaultIntrospectionContext0 = new DefaultIntrospectionContext(class0);
      fluentPropertyBeanIntrospector0.introspect(defaultIntrospectionContext0);
      assertNotNull(fluentPropertyBeanIntrospector0.getWriteMethodPrefix());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FluentPropertyBeanIntrospector fluentPropertyBeanIntrospector0 = null;
      try {
        fluentPropertyBeanIntrospector0 = new FluentPropertyBeanIntrospector((String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Prefix for write methods must not be null!
         //
         verifyException("org.apache.commons.beanutils.FluentPropertyBeanIntrospector", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FluentPropertyBeanIntrospector fluentPropertyBeanIntrospector0 = new FluentPropertyBeanIntrospector("equals");
      Class<Object> class0 = Object.class;
      DefaultIntrospectionContext defaultIntrospectionContext0 = new DefaultIntrospectionContext(class0);
      fluentPropertyBeanIntrospector0.introspect(defaultIntrospectionContext0);
      assertNotNull(fluentPropertyBeanIntrospector0.getWriteMethodPrefix());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FluentPropertyBeanIntrospector fluentPropertyBeanIntrospector0 = new FluentPropertyBeanIntrospector();
      assertNotNull(fluentPropertyBeanIntrospector0.getWriteMethodPrefix());
}
}
