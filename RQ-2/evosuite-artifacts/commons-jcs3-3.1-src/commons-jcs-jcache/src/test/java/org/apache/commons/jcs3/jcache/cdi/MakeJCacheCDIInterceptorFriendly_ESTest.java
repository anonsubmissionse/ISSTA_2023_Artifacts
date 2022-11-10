/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:11:01 GMT 2022
 */

package org.apache.commons.jcs3.jcache.cdi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Set;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.AnnotatedType;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.BeforeBeanDiscovery;
import javax.enterprise.inject.spi.InjectionTarget;
import javax.enterprise.inject.spi.ProcessAnnotatedType;
import org.apache.commons.jcs3.jcache.cdi.CDIJCacheHelper;
import org.apache.commons.jcs3.jcache.cdi.MakeJCacheCDIInterceptorFriendly;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MakeJCacheCDIInterceptorFriendly_ESTest extends MakeJCacheCDIInterceptorFriendly_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MakeJCacheCDIInterceptorFriendly makeJCacheCDIInterceptorFriendly0 = new MakeJCacheCDIInterceptorFriendly();
      makeJCacheCDIInterceptorFriendly0.vetoScannedCDIJCacheHelperQualifiers((ProcessAnnotatedType<CDIJCacheHelper>) null);
      // Undeclared exception!
      try { 
        makeJCacheCDIInterceptorFriendly0.vetoScannedCDIJCacheHelperQualifiers((ProcessAnnotatedType<CDIJCacheHelper>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.jcache.cdi.MakeJCacheCDIInterceptorFriendly", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MakeJCacheCDIInterceptorFriendly makeJCacheCDIInterceptorFriendly0 = new MakeJCacheCDIInterceptorFriendly();
      BeforeBeanDiscovery beforeBeanDiscovery0 = mock(BeforeBeanDiscovery.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        makeJCacheCDIInterceptorFriendly0.discoverInterceptorBindings(beforeBeanDiscovery0, (BeanManager) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.jcache.cdi.MakeJCacheCDIInterceptorFriendly", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MakeJCacheCDIInterceptorFriendly makeJCacheCDIInterceptorFriendly0 = new MakeJCacheCDIInterceptorFriendly();
      BeanManager beanManager0 = mock(BeanManager.class, new ViolatedAssumptionAnswer());
      doReturn((AnnotatedType) null).when(beanManager0).createAnnotatedType(nullable(java.lang.Class.class));
      doReturn((InjectionTarget) null).when(beanManager0).createInjectionTarget(nullable(javax.enterprise.inject.spi.AnnotatedType.class));
      // Undeclared exception!
      try { 
        makeJCacheCDIInterceptorFriendly0.addHelper((AfterBeanDiscovery) null, beanManager0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.jcache.cdi.MakeJCacheCDIInterceptorFriendly", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MakeJCacheCDIInterceptorFriendly makeJCacheCDIInterceptorFriendly0 = new MakeJCacheCDIInterceptorFriendly();
      AfterBeanDiscovery afterBeanDiscovery0 = mock(AfterBeanDiscovery.class, new ViolatedAssumptionAnswer());
      ProcessAnnotatedType<CDIJCacheHelper> processAnnotatedType0 = (ProcessAnnotatedType<CDIJCacheHelper>) mock(ProcessAnnotatedType.class, new ViolatedAssumptionAnswer());
      makeJCacheCDIInterceptorFriendly0.vetoScannedCDIJCacheHelperQualifiers(processAnnotatedType0);
      BeanManager beanManager0 = mock(BeanManager.class, new ViolatedAssumptionAnswer());
      makeJCacheCDIInterceptorFriendly0.addHelper(afterBeanDiscovery0, beanManager0);
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MakeJCacheCDIInterceptorFriendly makeJCacheCDIInterceptorFriendly0 = new MakeJCacheCDIInterceptorFriendly();
      AfterBeanDiscovery afterBeanDiscovery0 = mock(AfterBeanDiscovery.class, new ViolatedAssumptionAnswer());
      BeanManager beanManager0 = mock(BeanManager.class, new ViolatedAssumptionAnswer());
      doReturn((AnnotatedType) null).when(beanManager0).createAnnotatedType(nullable(java.lang.Class.class));
      doReturn((InjectionTarget) null).when(beanManager0).createInjectionTarget(nullable(javax.enterprise.inject.spi.AnnotatedType.class));
      makeJCacheCDIInterceptorFriendly0.addHelper(afterBeanDiscovery0, beanManager0);
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MakeJCacheCDIInterceptorFriendly makeJCacheCDIInterceptorFriendly0 = new MakeJCacheCDIInterceptorFriendly();
      BeforeBeanDiscovery beforeBeanDiscovery0 = mock(BeforeBeanDiscovery.class, new ViolatedAssumptionAnswer());
      BeanManager beanManager0 = mock(BeanManager.class, new ViolatedAssumptionAnswer());
      doReturn((AnnotatedType) null, (AnnotatedType) null, (AnnotatedType) null, (AnnotatedType) null, (AnnotatedType) null).when(beanManager0).createAnnotatedType(nullable(java.lang.Class.class));
      makeJCacheCDIInterceptorFriendly0.discoverInterceptorBindings(beforeBeanDiscovery0, beanManager0);
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget0, "mYI+^M");
      CreationalContext<CDIJCacheHelper> creationalContext0 = (CreationalContext<CDIJCacheHelper>) mock(CreationalContext.class, new ViolatedAssumptionAnswer());
      makeJCacheCDIInterceptorFriendly_HelperBean0.destroy((CDIJCacheHelper) null, creationalContext0);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget0, "mYI+^M");
      makeJCacheCDIInterceptorFriendly_HelperBean0.getScope();
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget0, "mYI+^M");
      String string0 = makeJCacheCDIInterceptorFriendly_HelperBean0.getId();
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget0, "_VXFxGj0r-(j3(e#q5G");
      makeJCacheCDIInterceptorFriendly_HelperBean0.getQualifiers();
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(annotatedType0).getJavaClass();
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget0, "n");
      makeJCacheCDIInterceptorFriendly_HelperBean0.getBeanClass();
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      doReturn((Set) null).when(injectionTarget0).getInjectionPoints();
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget0, "n");
      makeJCacheCDIInterceptorFriendly_HelperBean0.getInjectionPoints();
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget0, "mYI+^M");
      makeJCacheCDIInterceptorFriendly_HelperBean0.getStereotypes();
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget0, "n");
      boolean boolean0 = makeJCacheCDIInterceptorFriendly_HelperBean0.isAlternative();
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget0, "n");
      boolean boolean0 = makeJCacheCDIInterceptorFriendly_HelperBean0.isAlternative();
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(injectionTarget0).produce(nullable(javax.enterprise.context.spi.CreationalContext.class));
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget0, "n");
      CreationalContext<CDIJCacheHelper> creationalContext0 = (CreationalContext<CDIJCacheHelper>) mock(CreationalContext.class, new ViolatedAssumptionAnswer());
      makeJCacheCDIInterceptorFriendly_HelperBean0.create(creationalContext0);
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      doReturn((Set) null).when(annotatedType0).getTypeClosure();
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget0, "n");
      makeJCacheCDIInterceptorFriendly_HelperBean0.getTypes();
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget0, "^6MB$ ");
      boolean boolean0 = makeJCacheCDIInterceptorFriendly_HelperBean0.isNullable();
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget0, "^6MB$ ");
      boolean boolean0 = makeJCacheCDIInterceptorFriendly_HelperBean0.isNullable();
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget0, "hx4|zu6k6INdV[}H~7");
      makeJCacheCDIInterceptorFriendly_HelperBean0.getName();
      ;
}
}
