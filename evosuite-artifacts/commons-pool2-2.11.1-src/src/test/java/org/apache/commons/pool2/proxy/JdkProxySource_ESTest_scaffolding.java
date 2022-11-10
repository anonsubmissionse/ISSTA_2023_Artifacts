/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 10 19:09:27 GMT 2022
 */

package org.apache.commons.pool2.proxy;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class JdkProxySource_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.pool2.proxy.JdkProxySource"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-pool2-2.11.1-src"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JdkProxySource_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.pool2.DestroyMode",
      "org.apache.commons.pool2.impl.LinkedBlockingDeque$Node",
      "org.apache.commons.pool2.impl.DefaultEvictionPolicy",
      "org.apache.commons.pool2.PooledObject",
      "org.apache.commons.pool2.impl.BaseObjectPoolConfig",
      "org.apache.commons.pool2.impl.GenericKeyedObjectPool$ObjectDeque",
      "org.apache.commons.pool2.proxy.JdkProxyHandler",
      "org.apache.commons.pool2.PooledObjectState",
      "org.apache.commons.pool2.ObjectPool",
      "org.apache.commons.pool2.impl.DefaultPooledObject",
      "org.apache.commons.pool2.impl.EvictionConfig",
      "org.apache.commons.pool2.impl.GenericObjectPoolConfig",
      "org.apache.commons.pool2.impl.LinkedBlockingDeque$Itr",
      "org.apache.commons.pool2.KeyedPooledObjectFactory",
      "org.apache.commons.pool2.impl.PooledSoftReference",
      "org.apache.commons.pool2.impl.InterruptibleReentrantLock",
      "org.apache.commons.pool2.impl.NoOpCallStack",
      "org.apache.commons.pool2.UsageTracking",
      "org.apache.commons.pool2.impl.DefaultPooledObjectInfoMBean",
      "org.apache.commons.pool2.impl.CallStack",
      "org.apache.commons.pool2.BaseObject",
      "org.apache.commons.pool2.proxy.BaseProxyHandler",
      "org.apache.commons.pool2.proxy.ProxySource",
      "org.apache.commons.pool2.impl.BaseGenericObjectPool$StatsStore",
      "org.apache.commons.pool2.proxy.JdkProxySource",
      "org.apache.commons.pool2.impl.BaseGenericObjectPool",
      "org.apache.commons.pool2.impl.LinkedBlockingDeque$DescendingItr",
      "org.apache.commons.pool2.impl.GenericKeyedObjectPool",
      "org.apache.commons.pool2.impl.GenericObjectPool",
      "org.apache.commons.pool2.impl.LinkedBlockingDeque",
      "org.apache.commons.pool2.impl.GenericKeyedObjectPoolMXBean",
      "org.apache.commons.pool2.impl.LinkedBlockingDeque$AbstractItr",
      "org.apache.commons.pool2.KeyedObjectPool",
      "org.apache.commons.pool2.impl.GenericObjectPoolMXBean",
      "org.apache.commons.pool2.impl.EvictionPolicy",
      "org.apache.commons.pool2.SwallowedExceptionListener",
      "org.apache.commons.pool2.impl.DefaultPooledObjectInfo",
      "org.apache.commons.pool2.impl.PoolImplUtils",
      "org.apache.commons.pool2.impl.BaseGenericObjectPool$IdentityWrapper",
      "org.apache.commons.pool2.impl.AbandonedConfig",
      "org.apache.commons.pool2.PooledObjectFactory",
      "org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.pool2.KeyedPooledObjectFactory", false, JdkProxySource_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JdkProxySource_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.pool2.proxy.JdkProxySource",
      "org.apache.commons.pool2.BaseObject",
      "org.apache.commons.pool2.impl.BaseGenericObjectPool",
      "org.apache.commons.pool2.impl.GenericKeyedObjectPool",
      "org.apache.commons.pool2.impl.BaseObjectPoolConfig",
      "org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig",
      "org.apache.commons.pool2.proxy.BaseProxyHandler",
      "org.apache.commons.pool2.proxy.JdkProxyHandler",
      "org.apache.commons.pool2.impl.GenericObjectPool",
      "org.apache.commons.pool2.impl.GenericObjectPoolConfig",
      "org.apache.commons.pool2.impl.BaseGenericObjectPool$StatsStore",
      "org.apache.commons.pool2.impl.LinkedBlockingDeque",
      "org.apache.commons.pool2.impl.InterruptibleReentrantLock",
      "org.apache.commons.pool2.impl.PoolImplUtils",
      "org.apache.commons.pool2.impl.DefaultEvictionPolicy",
      "org.apache.commons.pool2.impl.AbandonedConfig",
      "org.apache.commons.pool2.impl.BaseGenericObjectPool$IdentityWrapper",
      "org.apache.commons.pool2.impl.EvictionConfig",
      "org.apache.commons.pool2.impl.DefaultPooledObject",
      "org.apache.commons.pool2.PooledObjectState",
      "org.apache.commons.pool2.impl.NoOpCallStack",
      "org.apache.commons.pool2.impl.PooledSoftReference",
      "org.apache.commons.pool2.impl.LinkedBlockingDeque$Node",
      "org.apache.commons.pool2.impl.LinkedBlockingDeque$AbstractItr",
      "org.apache.commons.pool2.impl.LinkedBlockingDeque$Itr",
      "org.apache.commons.pool2.impl.GenericKeyedObjectPool$ObjectDeque"
    );
  }
}
