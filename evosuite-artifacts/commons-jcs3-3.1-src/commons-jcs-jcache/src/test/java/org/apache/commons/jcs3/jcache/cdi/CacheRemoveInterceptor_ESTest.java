/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:14:14 GMT 2022
 */

package org.apache.commons.jcs3.jcache.cdi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.AnnotatedType;
import javax.enterprise.inject.spi.InjectionTarget;
import javax.interceptor.InvocationContext;
import org.apache.commons.jcs3.jcache.cdi.CDIJCacheHelper;
import org.apache.commons.jcs3.jcache.cdi.CacheRemoveInterceptor;
import org.apache.commons.jcs3.jcache.cdi.MakeJCacheCDIInterceptorFriendly;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheRemoveInterceptor_ESTest extends CacheRemoveInterceptor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CacheRemoveInterceptor cacheRemoveInterceptor0 = new CacheRemoveInterceptor();
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      CDIJCacheHelper cDIJCacheHelper0 = mock(CDIJCacheHelper.class, new ViolatedAssumptionAnswer());
      doReturn((CDIJCacheHelper.MethodMeta) null).when(cDIJCacheHelper0).findMeta(any(javax.interceptor.InvocationContext.class));
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      doReturn(cDIJCacheHelper0).when(injectionTarget0).produce(nullable(javax.enterprise.context.spi.CreationalContext.class));
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget0, "");
      CreationalContext<CDIJCacheHelper> creationalContext0 = (CreationalContext<CDIJCacheHelper>) mock(CreationalContext.class, new ViolatedAssumptionAnswer());
      CDIJCacheHelper cDIJCacheHelper1 = makeJCacheCDIInterceptorFriendly_HelperBean0.create(creationalContext0);
      Injector.inject(cacheRemoveInterceptor0, (Class<?>) CacheRemoveInterceptor.class, "helper", (Object) cDIJCacheHelper1);
      Injector.validateBean(cacheRemoveInterceptor0, (Class<?>) CacheRemoveInterceptor.class);
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      try { 
        cacheRemoveInterceptor0.cache(invocationContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.jcache.cdi.CacheRemoveInterceptor", e);
      }
  }
}
