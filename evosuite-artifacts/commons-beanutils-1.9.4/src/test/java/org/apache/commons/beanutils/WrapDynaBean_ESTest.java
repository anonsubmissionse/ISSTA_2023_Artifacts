/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 18:30:30 GMT 2022
 */

package org.apache.commons.beanutils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.PropertyDescriptor;
import org.apache.commons.beanutils.DynaClass;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.beanutils.PropertyUtilsBean;
import org.apache.commons.beanutils.WrapDynaBean;
import org.apache.commons.beanutils.WrapDynaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WrapDynaBean_ESTest extends WrapDynaBean_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      DynaProperty dynaProperty0 = new DynaProperty("Error setting mapped property '", class0, class0);
      WrapDynaBean wrapDynaBean0 = new WrapDynaBean(dynaProperty0);
      DynaClass dynaClass0 = wrapDynaBean0.getDynaClass();
      // Undeclared exception!
      try { 
        wrapDynaBean0.set("a=rjEjYO.NNWHH", "xT}", (Object) dynaClass0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Error setting mapped property 'a=rjEjYO.NNWHH', exception - java.lang.NoSuchMethodException: Unknown property 'a=rjEjYO' on class 'class org.apache.commons.beanutils.DynaProperty'
         //
         verifyException("org.apache.commons.beanutils.WrapDynaBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<String> class0 = String.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0, (PropertyUtilsBean) null);
      WrapDynaBean wrapDynaBean0 = new WrapDynaBean(wrapDynaClass0, wrapDynaClass0);
      // Undeclared exception!
      try { 
        wrapDynaBean0.set("", 795, (Object) "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Error setting indexed property '', exception - java.lang.NoSuchMethodException: Unknown property '' on bean class 'class org.apache.commons.beanutils.WrapDynaClass'
         //
         verifyException("org.apache.commons.beanutils.WrapDynaBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WrapDynaBean wrapDynaBean0 = new WrapDynaBean("q@|");
      // Undeclared exception!
      try { 
        wrapDynaBean0.get("q@|", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Error reading mapped property 'q@|', exception - java.lang.NoSuchMethodException: Unknown property 'q@|'+ on bean class 'class java.lang.String'
         //
         verifyException("org.apache.commons.beanutils.WrapDynaBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      DynaProperty dynaProperty0 = new DynaProperty("", class0);
      Class<DynaProperty> class1 = DynaProperty.class;
      PropertyUtilsBean propertyUtilsBean0 = PropertyUtilsBean.getInstance();
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class1, propertyUtilsBean0);
      WrapDynaBean wrapDynaBean0 = new WrapDynaBean(dynaProperty0, wrapDynaClass0);
      Object object0 = wrapDynaBean0.getInstance();
      assertSame(object0, dynaProperty0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WrapDynaBean wrapDynaBean0 = new WrapDynaBean("");
      wrapDynaBean0.instance = (Object) null;
      wrapDynaBean0.dynaClass = null;
      // Undeclared exception!
      try { 
        wrapDynaBean0.getDynaClass();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.beanutils.WrapDynaBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WrapDynaBean wrapDynaBean0 = null;
      try {
        wrapDynaBean0 = new WrapDynaBean((Object) null, (WrapDynaClass) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.beanutils.WrapDynaBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WrapDynaBean wrapDynaBean0 = null;
      try {
        wrapDynaBean0 = new WrapDynaBean((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.beanutils.WrapDynaBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WrapDynaBean wrapDynaBean0 = new WrapDynaBean("");
      wrapDynaBean0.dynaClass = null;
      // Undeclared exception!
      try { 
        wrapDynaBean0.get("", (-43));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Error reading indexed property '', exception - java.lang.NoSuchMethodException: Unknown property '' on bean class 'class java.lang.String'
         //
         verifyException("org.apache.commons.beanutils.WrapDynaBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      WrapDynaBean wrapDynaBean0 = new WrapDynaBean(object0);
      // Undeclared exception!
      try { 
        wrapDynaBean0.getDynaProperty("\"/9@eQm");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid property name '\"/9@eQm'
         //
         verifyException("org.apache.commons.beanutils.WrapDynaBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      WrapDynaBean wrapDynaBean0 = new WrapDynaBean(object0);
      // Undeclared exception!
      try { 
        wrapDynaBean0.set("No origin bean specified", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Error setting property 'No origin bean specified', exception - java.lang.NoSuchMethodException: Unknown property 'No origin bean specified' on class 'class java.lang.Object'
         //
         verifyException("org.apache.commons.beanutils.WrapDynaBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<String> class0 = String.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0);
      WrapDynaBean wrapDynaBean0 = new WrapDynaBean((Object) null, wrapDynaClass0);
      Object object0 = wrapDynaBean0.getInstance();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PropertyUtilsBean propertyUtilsBean0 = new PropertyUtilsBean();
      WrapDynaBean wrapDynaBean0 = new WrapDynaBean(propertyUtilsBean0);
      // Undeclared exception!
      try { 
        wrapDynaBean0.get("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Error reading property '', exception - java.lang.NoSuchMethodException: Unknown property '' on class 'class org.apache.commons.beanutils.PropertyUtilsBean'
         //
         verifyException("org.apache.commons.beanutils.WrapDynaBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0);
      WrapDynaBean wrapDynaBean0 = new WrapDynaBean((Object) null, wrapDynaClass0);
      // Undeclared exception!
      try { 
        wrapDynaBean0.contains("v4=a^E=SY.8[x6|a{bX", "v4=a^E=SY.8[x6|a{bX");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // WrapDynaBean does not support contains()
         //
         verifyException("org.apache.commons.beanutils.WrapDynaBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<String> class0 = String.class;
      PropertyUtilsBean propertyUtilsBean0 = PropertyUtilsBean.getInstance();
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0, propertyUtilsBean0);
      WrapDynaBean wrapDynaBean0 = new WrapDynaBean("", wrapDynaClass0);
      // Undeclared exception!
      try { 
        wrapDynaBean0.remove("", "");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // WrapDynaBean does not support remove()
         //
         verifyException("org.apache.commons.beanutils.WrapDynaBean", e);
      }
  }
}
