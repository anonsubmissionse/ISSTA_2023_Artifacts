/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:14:16 GMT 2022
 */

package org.apache.commons.jcs3.jcache.cdi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import java.util.Set;
import javax.cache.Cache;
import javax.cache.annotation.CacheRemoveAll;
import javax.cache.annotation.CacheResolver;
import javax.cache.annotation.CacheResolverFactory;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.AnnotatedType;
import javax.enterprise.inject.spi.InjectionTarget;
import javax.interceptor.InvocationContext;
import org.apache.commons.jcs3.jcache.cdi.CDIJCacheHelper;
import org.apache.commons.jcs3.jcache.cdi.CacheRemoveAllInterceptor;
import org.apache.commons.jcs3.jcache.cdi.MakeJCacheCDIInterceptorFriendly;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheRemoveAllInterceptor_ESTest extends CacheRemoveAllInterceptor_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CacheRemoveAllInterceptor cacheRemoveAllInterceptor0 = new CacheRemoveAllInterceptor();
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta0 = mock(CDIJCacheHelper.MethodMeta.class, new ViolatedAssumptionAnswer());
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean((AnnotatedType<CDIJCacheHelper>) null, injectionTarget0, "^x1dE");
      Set<Annotation> set0 = makeJCacheCDIInterceptorFriendly_HelperBean0.getQualifiers();
      CacheRemoveAll cacheRemoveAll0 = mock(CacheRemoveAll.class, new ViolatedAssumptionAnswer());
      Cache<Object, String> cache0 = (Cache<Object, String>) mock(Cache.class, new ViolatedAssumptionAnswer());
      CacheResolver cacheResolver0 = mock(CacheResolver.class, new ViolatedAssumptionAnswer());
      doReturn(cache0).when(cacheResolver0).resolveCache(nullable(javax.cache.annotation.CacheInvocationContext.class));
      CacheResolverFactory cacheResolverFactory0 = mock(CacheResolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(cacheResolver0).when(cacheResolverFactory0).getCacheResolver(nullable(javax.cache.annotation.CacheMethodDetails.class));
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta1 = mock(CDIJCacheHelper.MethodMeta.class, new ViolatedAssumptionAnswer());
      doReturn(set0).when(cDIJCacheHelper_MethodMeta1).getAnnotations();
      doReturn(cacheRemoveAll0).when(cDIJCacheHelper_MethodMeta1).getCacheRemoveAll();
      doReturn("").when(cDIJCacheHelper_MethodMeta1).getCacheRemoveAllCacheName();
      doReturn(cacheResolverFactory0).when(cDIJCacheHelper_MethodMeta1).getCacheRemoveAllResolverFactory();
      doReturn(false).when(cDIJCacheHelper_MethodMeta1).isCachePutAfter();
      CDIJCacheHelper cDIJCacheHelper0 = mock(CDIJCacheHelper.class, new ViolatedAssumptionAnswer());
      doReturn(cDIJCacheHelper_MethodMeta0, cDIJCacheHelper_MethodMeta1).when(cDIJCacheHelper0).findMeta(any(javax.interceptor.InvocationContext.class));
      InjectionTarget<CDIJCacheHelper> injectionTarget1 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      doReturn(cDIJCacheHelper0).when(injectionTarget1).produce(nullable(javax.enterprise.context.spi.CreationalContext.class));
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean1 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget1, "X(SeF?J.<'yuP");
      CDIJCacheHelper cDIJCacheHelper1 = makeJCacheCDIInterceptorFriendly_HelperBean1.create((CreationalContext<CDIJCacheHelper>) null);
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      cDIJCacheHelper1.findMeta(invocationContext0);
      Injector.inject(cacheRemoveAllInterceptor0, (Class<?>) CacheRemoveAllInterceptor.class, "helper", (Object) cDIJCacheHelper1);
      Injector.validateBean(cacheRemoveAllInterceptor0, (Class<?>) CacheRemoveAllInterceptor.class);
      InvocationContext invocationContext1 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(invocationContext1).proceed();
      Object object0 = cacheRemoveAllInterceptor0.cache(invocationContext1);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CacheRemoveAllInterceptor cacheRemoveAllInterceptor0 = new CacheRemoveAllInterceptor();
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta0 = mock(CDIJCacheHelper.MethodMeta.class, new ViolatedAssumptionAnswer());
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean((AnnotatedType<CDIJCacheHelper>) null, injectionTarget0, "^x1dE");
      Set<Annotation> set0 = makeJCacheCDIInterceptorFriendly_HelperBean0.getQualifiers();
      CacheRemoveAll cacheRemoveAll0 = mock(CacheRemoveAll.class, new ViolatedAssumptionAnswer());
      Cache<String, String> cache0 = (Cache<String, String>) mock(Cache.class, new ViolatedAssumptionAnswer());
      CacheResolver cacheResolver0 = mock(CacheResolver.class, new ViolatedAssumptionAnswer());
      doReturn(cache0).when(cacheResolver0).resolveCache(nullable(javax.cache.annotation.CacheInvocationContext.class));
      CacheResolverFactory cacheResolverFactory0 = mock(CacheResolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(cacheResolver0).when(cacheResolverFactory0).getCacheResolver(nullable(javax.cache.annotation.CacheMethodDetails.class));
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta1 = mock(CDIJCacheHelper.MethodMeta.class, new ViolatedAssumptionAnswer());
      doReturn(set0).when(cDIJCacheHelper_MethodMeta1).getAnnotations();
      doReturn(cacheRemoveAll0).when(cDIJCacheHelper_MethodMeta1).getCacheRemoveAll();
      doReturn("").when(cDIJCacheHelper_MethodMeta1).getCacheRemoveAllCacheName();
      doReturn(cacheResolverFactory0).when(cDIJCacheHelper_MethodMeta1).getCacheRemoveAllResolverFactory();
      doReturn(true).when(cDIJCacheHelper_MethodMeta1).isCachePutAfter();
      CDIJCacheHelper cDIJCacheHelper0 = mock(CDIJCacheHelper.class, new ViolatedAssumptionAnswer());
      doReturn(cDIJCacheHelper_MethodMeta0, cDIJCacheHelper_MethodMeta1).when(cDIJCacheHelper0).findMeta(any(javax.interceptor.InvocationContext.class));
      InjectionTarget<CDIJCacheHelper> injectionTarget1 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      doReturn(cDIJCacheHelper0).when(injectionTarget1).produce(nullable(javax.enterprise.context.spi.CreationalContext.class));
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean1 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget1, "X(SeF?J.<'yuP");
      CDIJCacheHelper cDIJCacheHelper1 = makeJCacheCDIInterceptorFriendly_HelperBean1.create((CreationalContext<CDIJCacheHelper>) null);
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      cDIJCacheHelper1.findMeta(invocationContext0);
      Injector.inject(cacheRemoveAllInterceptor0, (Class<?>) CacheRemoveAllInterceptor.class, "helper", (Object) cDIJCacheHelper1);
      Injector.validateBean(cacheRemoveAllInterceptor0, (Class<?>) CacheRemoveAllInterceptor.class);
      Object object0 = new Object();
      InvocationContext invocationContext1 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      doReturn(object0).when(invocationContext1).proceed();
      Object object1 = cacheRemoveAllInterceptor0.cache(invocationContext1);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CacheRemoveAllInterceptor cacheRemoveAllInterceptor0 = new CacheRemoveAllInterceptor();
      AnnotatedType<CDIJCacheHelper> annotatedType0 = (AnnotatedType<CDIJCacheHelper>) mock(AnnotatedType.class, new ViolatedAssumptionAnswer());
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta0 = mock(CDIJCacheHelper.MethodMeta.class, new ViolatedAssumptionAnswer());
      InjectionTarget<CDIJCacheHelper> injectionTarget0 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean0 = new MakeJCacheCDIInterceptorFriendly.HelperBean((AnnotatedType<CDIJCacheHelper>) null, injectionTarget0, "^x1dE");
      Set<Annotation> set0 = makeJCacheCDIInterceptorFriendly_HelperBean0.getQualifiers();
      CacheRemoveAll cacheRemoveAll0 = mock(CacheRemoveAll.class, new ViolatedAssumptionAnswer());
      Cache<String, Integer> cache0 = (Cache<String, Integer>) mock(Cache.class, new ViolatedAssumptionAnswer());
      CacheResolver cacheResolver0 = mock(CacheResolver.class, new ViolatedAssumptionAnswer());
      doReturn(cache0).when(cacheResolver0).resolveCache(nullable(javax.cache.annotation.CacheInvocationContext.class));
      CacheResolverFactory cacheResolverFactory0 = mock(CacheResolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(cacheResolver0).when(cacheResolverFactory0).getCacheResolver(nullable(javax.cache.annotation.CacheMethodDetails.class));
      CacheRemoveAll cacheRemoveAll1 = mock(CacheRemoveAll.class, new ViolatedAssumptionAnswer());
      doReturn((Class[]) null).when(cacheRemoveAll1).evictFor();
      doReturn((Class[]) null).when(cacheRemoveAll1).noEvictFor();
      CDIJCacheHelper.MethodMeta cDIJCacheHelper_MethodMeta1 = mock(CDIJCacheHelper.MethodMeta.class, new ViolatedAssumptionAnswer());
      doReturn(set0).when(cDIJCacheHelper_MethodMeta1).getAnnotations();
      doReturn(cacheRemoveAll0, cacheRemoveAll1, cacheRemoveAll1).when(cDIJCacheHelper_MethodMeta1).getCacheRemoveAll();
      doReturn("").when(cDIJCacheHelper_MethodMeta1).getCacheRemoveAllCacheName();
      doReturn(cacheResolverFactory0).when(cDIJCacheHelper_MethodMeta1).getCacheRemoveAllResolverFactory();
      doReturn(true).when(cDIJCacheHelper_MethodMeta1).isCachePutAfter();
      CDIJCacheHelper cDIJCacheHelper0 = mock(CDIJCacheHelper.class, new ViolatedAssumptionAnswer());
      doReturn(cDIJCacheHelper_MethodMeta0, cDIJCacheHelper_MethodMeta1).when(cDIJCacheHelper0).findMeta(any(javax.interceptor.InvocationContext.class));
      doReturn(true).when(cDIJCacheHelper0).isIncluded(nullable(java.lang.Class.class) , nullable(java.lang.Class[].class) , nullable(java.lang.Class[].class));
      InjectionTarget<CDIJCacheHelper> injectionTarget1 = (InjectionTarget<CDIJCacheHelper>) mock(InjectionTarget.class, new ViolatedAssumptionAnswer());
      doReturn(cDIJCacheHelper0).when(injectionTarget1).produce(nullable(javax.enterprise.context.spi.CreationalContext.class));
      MakeJCacheCDIInterceptorFriendly.HelperBean makeJCacheCDIInterceptorFriendly_HelperBean1 = new MakeJCacheCDIInterceptorFriendly.HelperBean(annotatedType0, injectionTarget1, "X(SeF?J.<'yuP");
      CDIJCacheHelper cDIJCacheHelper1 = makeJCacheCDIInterceptorFriendly_HelperBean1.create((CreationalContext<CDIJCacheHelper>) null);
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      cDIJCacheHelper1.findMeta(invocationContext0);
      Injector.inject(cacheRemoveAllInterceptor0, (Class<?>) CacheRemoveAllInterceptor.class, "helper", (Object) cDIJCacheHelper1);
      Injector.validateBean(cacheRemoveAllInterceptor0, (Class<?>) CacheRemoveAllInterceptor.class);
      try { 
        cacheRemoveAllInterceptor0.cache((InvocationContext) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.jcache.cdi.CacheRemoveAllInterceptor", e);
      }
  }
}
