/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 21:23:14 GMT 2022
 */

package org.apache.commons.jcs3.auxiliary.disk.indexed;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@EvoSuiteClassExclude
public class IndexedDiskCache_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDiskCache"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-jcs3-3.1-src/commons-jcs-core"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(IndexedDiskCache_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$RemoveEvent",
      "org.apache.commons.jcs3.utils.threadpool.PoolConfiguration$WhenBlockedPolicy",
      "org.apache.commons.jcs3.io.ObjectInputStreamClassLoaderAware$BlacklistClassResolver",
      "org.apache.commons.jcs3.utils.threadpool.PoolConfiguration",
      "org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCache$MyCacheListener",
      "org.apache.commons.jcs3.utils.struct.LRUMap",
      "org.apache.commons.jcs3.engine.behavior.ICacheElement",
      "org.apache.commons.jcs3.utils.struct.DoubleLinkedList",
      "org.apache.commons.jcs3.io.ObjectInputStreamClassLoaderAware",
      "org.apache.commons.jcs3.log.MessageFormatter",
      "org.apache.commons.jcs3.engine.control.group.GroupId",
      "org.apache.commons.jcs3.utils.serialization.StandardSerializer",
      "org.apache.commons.jcs3.engine.behavior.ICacheEventQueue",
      "org.apache.commons.jcs3.engine.behavior.ICacheElementSerialized",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCache",
      "org.apache.commons.jcs3.utils.threadpool.DaemonThreadFactory",
      "org.apache.commons.jcs3.engine.behavior.IElementAttributes",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheAttributes",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager$1",
      "org.apache.commons.jcs3.utils.serialization.EncryptingSerializer",
      "org.apache.commons.jcs3.log.Log",
      "org.apache.commons.jcs3.engine.behavior.ICacheListener",
      "org.apache.commons.jcs3.utils.zip.CompressionUtil",
      "org.apache.commons.jcs3.engine.behavior.ICache",
      "org.apache.commons.jcs3.log.LogFactory",
      "org.apache.commons.jcs3.log.JulLogAdapter",
      "org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCache",
      "org.apache.commons.jcs3.engine.CacheEventQueueFactory",
      "org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDiskCacheAttributes",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager$ThreadPoolManagerHolder",
      "org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDiskCache$LRUMapSizeLimited",
      "org.apache.commons.jcs3.auxiliary.AuxiliaryCacheAttributes",
      "org.apache.commons.jcs3.utils.config.PropertySetterException",
      "org.apache.commons.jcs3.engine.logging.behavior.ICacheEvent",
      "org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDisk",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer",
      "org.apache.commons.jcs3.engine.behavior.ICacheType$CacheType",
      "org.apache.commons.jcs3.log.LogManager$LogFactoryHolder",
      "org.apache.commons.jcs3.engine.logging.CacheEventLoggerDebugLogger",
      "org.apache.commons.jcs3.utils.config.PropertySetter",
      "org.apache.commons.jcs3.engine.CacheStatus",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$RemoveAllEvent",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer$1",
      "org.apache.commons.jcs3.utils.struct.AbstractLRUMap",
      "org.apache.commons.jcs3.log.LogManager",
      "org.apache.commons.jcs3.engine.CacheInfo",
      "org.apache.commons.jcs3.engine.CacheEventQueue",
      "org.apache.commons.jcs3.engine.PooledCacheEventQueue",
      "org.apache.commons.jcs3.engine.CacheElementSerialized",
      "org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCacheAttributes",
      "org.apache.commons.jcs3.utils.struct.DoubleLinkedListNode",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$PutEvent",
      "org.apache.commons.jcs3.engine.ElementAttributes",
      "org.apache.commons.jcs3.utils.struct.LRUElementDescriptor",
      "org.apache.commons.jcs3.engine.CacheElement",
      "org.apache.commons.jcs3.auxiliary.disk.behavior.IDiskCacheAttributes$DiskLimitType",
      "org.apache.commons.jcs3.log.JulLogFactory",
      "org.apache.commons.jcs3.engine.match.behavior.IKeyMatcher",
      "org.apache.commons.jcs3.engine.stats.behavior.IStats",
      "org.apache.commons.jcs3.auxiliary.disk.behavior.IDiskCacheAttributes",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheEventLogging",
      "org.apache.commons.jcs3.engine.behavior.ICacheType",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$DisposeEvent",
      "org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDiskCache$LRUMapCountLimited",
      "org.apache.commons.jcs3.utils.serialization.CompressingSerializer",
      "org.apache.commons.jcs3.auxiliary.AuxiliaryCache",
      "org.apache.commons.jcs3.engine.control.event.behavior.IElementEventHandler",
      "org.apache.commons.jcs3.engine.behavior.ICacheEventQueue$QueueType",
      "org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDiskCache$PositionComparator",
      "org.apache.commons.jcs3.engine.control.event.behavior.ElementEventType",
      "org.apache.commons.jcs3.engine.match.KeyMatcherPatternImpl",
      "org.apache.commons.jcs3.engine.control.group.GroupAttrName",
      "org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDiskElementDescriptor",
      "org.apache.commons.jcs3.engine.logging.behavior.ICacheEventLogger",
      "org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDiskCache",
      "org.apache.commons.jcs3.engine.control.event.behavior.IElementEvent",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$AbstractCacheEvent"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(IndexedDiskCache_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCache",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheEventLogging",
      "org.apache.commons.jcs3.log.LogManager",
      "org.apache.commons.jcs3.log.JulLogFactory",
      "org.apache.commons.jcs3.log.LogManager$LogFactoryHolder",
      "org.apache.commons.jcs3.log.JulLogAdapter",
      "org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCache",
      "org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDiskCache",
      "org.apache.commons.jcs3.utils.struct.AbstractLRUMap",
      "org.apache.commons.jcs3.utils.struct.LRUMap",
      "org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDiskCache$LRUMapCountLimited",
      "org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDiskCache$LRUMapSizeLimited",
      "org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDiskCache$PositionComparator",
      "org.apache.commons.jcs3.auxiliary.disk.behavior.IDiskCacheAttributes$DiskLimitType",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDiskCacheAttributes",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer$1",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer",
      "org.apache.commons.jcs3.utils.serialization.StandardSerializer",
      "org.apache.commons.jcs3.engine.match.KeyMatcherPatternImpl",
      "org.apache.commons.jcs3.engine.CacheEventQueueFactory",
      "org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCache$MyCacheListener",
      "org.apache.commons.jcs3.engine.CacheInfo",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue",
      "org.apache.commons.jcs3.engine.PooledCacheEventQueue",
      "org.apache.commons.jcs3.engine.CacheEventQueue",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager",
      "org.apache.commons.jcs3.utils.threadpool.PoolConfiguration$WhenBlockedPolicy",
      "org.apache.commons.jcs3.utils.threadpool.PoolConfiguration",
      "org.apache.commons.jcs3.utils.config.PropertySetter",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager$ThreadPoolManagerHolder",
      "org.apache.commons.jcs3.utils.threadpool.DaemonThreadFactory",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager$1",
      "org.apache.commons.jcs3.utils.struct.DoubleLinkedList",
      "org.apache.commons.jcs3.utils.serialization.EncryptingSerializer",
      "org.apache.commons.jcs3.utils.serialization.CompressingSerializer",
      "org.apache.commons.jcs3.utils.zip.CompressionUtil",
      "org.apache.commons.jcs3.log.MessageFormatter",
      "org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDisk",
      "org.apache.commons.jcs3.engine.ElementAttributes",
      "org.apache.commons.jcs3.engine.CacheElement",
      "org.apache.commons.jcs3.engine.CacheElementSerialized",
      "org.apache.commons.jcs3.io.ObjectInputStreamClassLoaderAware",
      "org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDiskElementDescriptor",
      "org.apache.commons.jcs3.engine.control.group.GroupId",
      "org.apache.commons.jcs3.engine.control.group.GroupAttrName",
      "org.apache.commons.jcs3.engine.logging.CacheEventLoggerDebugLogger",
      "org.apache.commons.jcs3.io.ObjectInputStreamClassLoaderAware$BlacklistClassResolver"
    );
  }
}
