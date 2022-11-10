/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:35:13 GMT 2022
 */

package org.apache.commons.jcs3.jcache.extras.cdi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Set;
import javax.enterprise.inject.spi.AnnotatedField;
import javax.enterprise.inject.spi.AnnotatedParameter;
import javax.enterprise.inject.spi.AnnotatedType;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.enterprise.inject.spi.ProcessBean;
import org.apache.commons.jcs3.jcache.JCSCachingManager;
import org.apache.commons.jcs3.jcache.JCSCachingProvider;
import org.apache.commons.jcs3.jcache.cdi.MakeJCacheCDIInterceptorFriendly;
import org.apache.commons.jcs3.jcache.extras.cdi.CacheManagerBean;
import org.apache.commons.jcs3.jcache.extras.cdi.ExtraJCacheExtension;
import org.apache.webbeans.component.ExtensionBean;
import org.apache.webbeans.component.ManagedBean;
import org.apache.webbeans.component.NewManagedBean;
import org.apache.webbeans.component.ProducerFieldBean;
import org.apache.webbeans.component.WebBeansType;
import org.apache.webbeans.config.WebBeansContext;
import org.apache.webbeans.container.AnnotatedTypeWrapper;
import org.apache.webbeans.container.BeanManagerImpl;
import org.apache.webbeans.container.InjectableBeanManager;
import org.apache.webbeans.exception.DuplicateDefinitionException;
import org.apache.webbeans.portable.events.ProcessManagedBeanImpl;
import org.apache.webbeans.portable.events.ProcessProducerFieldImpl;
import org.apache.webbeans.portable.events.discovery.AfterBeanDiscoveryImpl;
import org.apache.webbeans.portable.events.discovery.BeforeShutdownImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExtraJCacheExtension_ESTest extends ExtraJCacheExtension_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExtraJCacheExtension extraJCacheExtension0 = new ExtraJCacheExtension();
      AnnotatedField<JCSCachingProvider> annotatedField0 = (AnnotatedField<JCSCachingProvider>) mock(AnnotatedField.class, new ViolatedAssumptionAnswer());
      AnnotatedParameter<JCSCachingProvider> annotatedParameter0 = (AnnotatedParameter<JCSCachingProvider>) mock(AnnotatedParameter.class, new ViolatedAssumptionAnswer());
      ProcessProducerFieldImpl<JCSCachingProvider, CacheManagerBean> processProducerFieldImpl0 = new ProcessProducerFieldImpl<JCSCachingProvider, CacheManagerBean>((ProducerFieldBean<CacheManagerBean>) null, annotatedField0, annotatedParameter0);
      processProducerFieldImpl0.setStarted();
      // Undeclared exception!
      try { 
        extraJCacheExtension0.processBean((ProcessBean<CacheManagerBean>) processProducerFieldImpl0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // only call container event methods in their correct lifecycle
         //
         verifyException("org.apache.webbeans.portable.events.EventBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExtraJCacheExtension extraJCacheExtension0 = new ExtraJCacheExtension();
      WebBeansContext webBeansContext0 = new WebBeansContext();
      AfterBeanDiscoveryImpl afterBeanDiscoveryImpl0 = new AfterBeanDiscoveryImpl(webBeansContext0);
      afterBeanDiscoveryImpl0.setStarted();
      // Undeclared exception!
      try { 
        extraJCacheExtension0.addJCacheBeans(afterBeanDiscoveryImpl0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Don't call AfterBeanDiscovery.addBean(bean) after the event is fired
         //
         verifyException("org.apache.webbeans.portable.events.discovery.AfterBeanDiscoveryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ExtraJCacheExtension extraJCacheExtension0 = new ExtraJCacheExtension();
      WebBeansContext webBeansContext0 = new WebBeansContext();
      WebBeansType webBeansType0 = WebBeansType.INJECTIONPOINT;
      MakeJCacheCDIInterceptorFriendly makeJCacheCDIInterceptorFriendly0 = new MakeJCacheCDIInterceptorFriendly();
      BeanManagerImpl beanManagerImpl0 = webBeansContext0.getBeanManagerImpl();
      Class<JCSCachingProvider> class0 = JCSCachingProvider.class;
      AnnotatedType<JCSCachingProvider> annotatedType0 = beanManagerImpl0.createAnnotatedType(class0);
      AnnotatedTypeWrapper<JCSCachingProvider> annotatedTypeWrapper0 = new AnnotatedTypeWrapper<JCSCachingProvider>(makeJCacheCDIInterceptorFriendly0, annotatedType0);
      ExtensionBean<JCSCachingProvider> extensionBean0 = new ExtensionBean<JCSCachingProvider>(webBeansContext0, class0);
      NewManagedBean<JCSCachingProvider> newManagedBean0 = new NewManagedBean<JCSCachingProvider>(webBeansContext0, webBeansType0, annotatedTypeWrapper0, extensionBean0, class0, (Set<InjectionPoint>) null);
      ProcessManagedBeanImpl<JCSCachingProvider> processManagedBeanImpl0 = new ProcessManagedBeanImpl<JCSCachingProvider>(newManagedBean0, annotatedType0);
      extraJCacheExtension0.processBean((ProcessBean<JCSCachingProvider>) processManagedBeanImpl0);
      AfterBeanDiscoveryImpl afterBeanDiscoveryImpl0 = new AfterBeanDiscoveryImpl(webBeansContext0);
      extraJCacheExtension0.addJCacheBeans(afterBeanDiscoveryImpl0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ExtraJCacheExtension extraJCacheExtension0 = new ExtraJCacheExtension();
      BeforeShutdownImpl beforeShutdownImpl0 = new BeforeShutdownImpl();
      WebBeansContext webBeansContext0 = new WebBeansContext();
      AfterBeanDiscoveryImpl afterBeanDiscoveryImpl0 = new AfterBeanDiscoveryImpl(webBeansContext0);
      extraJCacheExtension0.addJCacheBeans(afterBeanDiscoveryImpl0);
      extraJCacheExtension0.destroyIfCreated(beforeShutdownImpl0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ExtraJCacheExtension extraJCacheExtension0 = new ExtraJCacheExtension();
      BeforeShutdownImpl beforeShutdownImpl0 = new BeforeShutdownImpl();
      extraJCacheExtension0.destroyIfCreated(beforeShutdownImpl0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ExtraJCacheExtension extraJCacheExtension0 = new ExtraJCacheExtension();
      WebBeansContext webBeansContext0 = WebBeansContext.currentInstance();
      AfterBeanDiscoveryImpl afterBeanDiscoveryImpl0 = new AfterBeanDiscoveryImpl(webBeansContext0);
      // Undeclared exception!
      try { 
        extraJCacheExtension0.addJCacheBeans(afterBeanDiscoveryImpl0);
       //  fail("Expecting exception: DuplicateDefinitionException");
       // Unstable assertion
      } catch(DuplicateDefinitionException e) {
         //
         // PassivationCapable bean id is not unique: org.apache.commons.jcs3.jcache.extras.cdi.CacheManagerBean-29 bean:CacheManager, WebBeansType:THIRDPARTY, Name:null, API Types:[javax.cache.CacheManager,java.lang.Object], Qualifiers:[javax.enterprise.inject.Default,javax.enterprise.inject.Any]
         //
         verifyException("org.apache.webbeans.container.BeanManagerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ExtraJCacheExtension extraJCacheExtension0 = new ExtraJCacheExtension();
      WebBeansContext webBeansContext0 = WebBeansContext.getInstance();
      WebBeansType webBeansType0 = WebBeansType.RESOURCEBEAN;
      InjectableBeanManager injectableBeanManager0 = new InjectableBeanManager();
      Class<JCSCachingManager> class0 = JCSCachingManager.class;
      AnnotatedType<JCSCachingManager> annotatedType0 = injectableBeanManager0.createAnnotatedType(class0);
      AnnotatedTypeWrapper<JCSCachingManager> annotatedTypeWrapper0 = new AnnotatedTypeWrapper<JCSCachingManager>(extraJCacheExtension0, annotatedType0);
      ExtensionBean<JCSCachingManager> extensionBean0 = new ExtensionBean<JCSCachingManager>(webBeansContext0, class0);
      ManagedBean<JCSCachingManager> managedBean0 = new ManagedBean<JCSCachingManager>(webBeansContext0, webBeansType0, annotatedTypeWrapper0, extensionBean0, class0);
      ProcessManagedBeanImpl<JCSCachingManager> processManagedBeanImpl0 = new ProcessManagedBeanImpl<JCSCachingManager>(managedBean0, annotatedType0);
      extraJCacheExtension0.processBean((ProcessBean<JCSCachingManager>) processManagedBeanImpl0);
      AfterBeanDiscoveryImpl afterBeanDiscoveryImpl0 = new AfterBeanDiscoveryImpl(webBeansContext0);
      // Undeclared exception!
      try { 
        extraJCacheExtension0.addJCacheBeans(afterBeanDiscoveryImpl0);
       //  fail("Expecting exception: DuplicateDefinitionException");
       // Unstable assertion
      } catch(DuplicateDefinitionException e) {
         //
         // PassivationCapable bean id is not unique: org.apache.commons.jcs3.jcache.extras.cdi.CacheProviderBean-37 bean:CachingProvider, WebBeansType:THIRDPARTY, Name:null, API Types:[javax.cache.spi.CachingProvider,java.lang.Object], Qualifiers:[javax.enterprise.inject.Default,javax.enterprise.inject.Any]
         //
         verifyException("org.apache.webbeans.container.BeanManagerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ExtraJCacheExtension extraJCacheExtension0 = new ExtraJCacheExtension();
      WebBeansContext webBeansContext0 = WebBeansContext.getInstance();
      WebBeansType webBeansType0 = WebBeansType.RESOURCEBEAN;
      InjectableBeanManager injectableBeanManager0 = new InjectableBeanManager();
      Class<JCSCachingManager> class0 = JCSCachingManager.class;
      AnnotatedType<JCSCachingManager> annotatedType0 = injectableBeanManager0.createAnnotatedType(class0);
      AnnotatedTypeWrapper<JCSCachingManager> annotatedTypeWrapper0 = new AnnotatedTypeWrapper<JCSCachingManager>(extraJCacheExtension0, annotatedType0);
      ExtensionBean<JCSCachingManager> extensionBean0 = new ExtensionBean<JCSCachingManager>(webBeansContext0, class0);
      ManagedBean<JCSCachingManager> managedBean0 = new ManagedBean<JCSCachingManager>(webBeansContext0, webBeansType0, annotatedTypeWrapper0, extensionBean0, class0);
      ProcessManagedBeanImpl<JCSCachingManager> processManagedBeanImpl0 = new ProcessManagedBeanImpl<JCSCachingManager>(managedBean0, annotatedType0);
      extraJCacheExtension0.processBean((ProcessBean<JCSCachingManager>) processManagedBeanImpl0);
      extraJCacheExtension0.processBean((ProcessBean<JCSCachingManager>) processManagedBeanImpl0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ExtraJCacheExtension extraJCacheExtension0 = new ExtraJCacheExtension();
      AnnotatedField<JCSCachingProvider> annotatedField0 = (AnnotatedField<JCSCachingProvider>) mock(AnnotatedField.class, new ViolatedAssumptionAnswer());
      AnnotatedParameter<JCSCachingProvider> annotatedParameter0 = (AnnotatedParameter<JCSCachingProvider>) mock(AnnotatedParameter.class, new ViolatedAssumptionAnswer());
      ProcessProducerFieldImpl<JCSCachingProvider, CacheManagerBean> processProducerFieldImpl0 = new ProcessProducerFieldImpl<JCSCachingProvider, CacheManagerBean>((ProducerFieldBean<CacheManagerBean>) null, annotatedField0, annotatedParameter0);
      // Undeclared exception!
      try { 
        extraJCacheExtension0.processBean((ProcessBean<CacheManagerBean>) processProducerFieldImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.jcache.extras.cdi.ExtraJCacheExtension", e);
      }
  }
}
