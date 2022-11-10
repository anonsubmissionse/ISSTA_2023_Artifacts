/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 18:28:48 GMT 2022
 */

package org.apache.commons.beanutils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.beanutils.PropertyUtilsBean;
import org.apache.commons.beanutils.WrapDynaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WrapDynaClass_ESTest extends WrapDynaClass_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = WrapDynaClass.dynaClasses;
      // Undeclared exception!
      try { 
        hashMap0.put((Object) null, "<:6");
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.beanutils.WrapDynaClass
         //
         verifyException("org.apache.commons.beanutils.WrapDynaClass$2", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<DynaProperty> class0 = DynaProperty.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0);
      wrapDynaClass0.introspect();
      assertNotNull(wrapDynaClass0.getName());
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0);
      PropertyUtilsBean propertyUtilsBean0 = wrapDynaClass0.getPropertyUtilsBean();
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<DynaProperty> class0 = DynaProperty.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0);
      wrapDynaClass0.getDynaProperty("");
      assertNotNull(wrapDynaClass0.getName());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0);
      DynaProperty[] dynaPropertyArray0 = wrapDynaClass0.getDynaProperties();
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0);
      Class<?> class1 = wrapDynaClass0.getBeanClass();
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<DynaProperty> class0 = DynaProperty.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0);
      try { 
        wrapDynaClass0.newInstance();
        fail("Expecting exception: InstantiationException");
      } catch(InstantiationException e) {
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0);
      PropertyDescriptor propertyDescriptor0 = wrapDynaClass0.getPropertyDescriptor("");
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Class<WrapDynaClass> class0 = WrapDynaClass.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0);
      DynaProperty dynaProperty0 = wrapDynaClass0.getDynaProperty("");
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PropertyUtilsBean propertyUtilsBean0 = PropertyUtilsBean.getInstance();
      // Undeclared exception!
      try { 
        WrapDynaClass.createDynaClass((Class<?>) null, propertyUtilsBean0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.beanutils.WrapDynaClass", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        WrapDynaClass.createDynaClass((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.beanutils.WrapDynaClass", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      HashMap<Object, Object> hashMap0 = WrapDynaClass.dynaClasses;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0, (PropertyUtilsBean) null);
      DynaProperty dynaProperty0 = wrapDynaClass0.getDynaProperty("(kC");
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      PropertyUtilsBean propertyUtilsBean0 = new PropertyUtilsBean();
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0, propertyUtilsBean0);
      Class<?> class1 = wrapDynaClass0.getBeanClass();
      assertFalse(class1.isPrimitive());
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0);
      // Undeclared exception!
      try { 
        wrapDynaClass0.getDynaProperty((String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // No property name specified
         //
         verifyException("org.apache.commons.beanutils.WrapDynaClass", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0, (PropertyUtilsBean) null);
      DynaProperty dynaProperty0 = wrapDynaClass0.getDynaProperty("(kC");
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      HashMap<Object, Object> hashMap0 = WrapDynaClass.dynaClasses;
      Set<Object> set0 = hashMap0.keySet();
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = WrapDynaClass.dynaClasses;
      Object object0 = hashMap0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = WrapDynaClass.dynaClasses;
      Collection<Object> collection0 = hashMap0.values();
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = WrapDynaClass.dynaClasses;
      HashMap<Annotation, PropertyDescriptor> hashMap1 = new HashMap<Annotation, PropertyDescriptor>();
      hashMap1.put((Annotation) null, (PropertyDescriptor) null);
      hashMap0.putAll(hashMap1);
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PropertyUtilsBean propertyUtilsBean0 = new PropertyUtilsBean();
      HashMap<Object, Object> hashMap0 = WrapDynaClass.dynaClasses;
      Object object0 = propertyUtilsBean0.getPropertyOfMapBean(hashMap0, "e%");
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = WrapDynaClass.dynaClasses;
      Set<Map.Entry<Object, Object>> set0 = (Set<Map.Entry<Object, Object>>)hashMap0.entrySet();
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = WrapDynaClass.dynaClasses;
      Object object0 = hashMap0.remove((Object) null);
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Object> class0 = Object.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0, (PropertyUtilsBean) null);
      DynaBean dynaBean0 = wrapDynaClass0.newInstance();
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = WrapDynaClass.dynaClasses;
      hashMap0.clear();
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      WrapDynaClass.clear();
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0);
      String string0 = wrapDynaClass0.getName();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      WrapDynaClass wrapDynaClass0 = WrapDynaClass.createDynaClass(class0);
      DynaProperty[] dynaPropertyArray0 = wrapDynaClass0.getDynaProperties();
      ;
}
}
