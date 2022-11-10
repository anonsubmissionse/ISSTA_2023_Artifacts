/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 22:29:46 GMT 2022
 */

package org.apache.commons.jcs3.jcache;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class JCSCache_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.jcs3.jcache.JCSCache"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-jcs3-3.1-src/commons-jcs-jcache"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JCSCache_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.jcs3.auxiliary.remote.server.behavior.RemoteType",
      "org.apache.commons.jcs3.utils.discovery.UDPDiscoveryReceiver",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.jcs3.engine.behavior.ICacheElement",
      "org.apache.commons.jcs3.utils.struct.DoubleLinkedList",
      "org.apache.commons.jcs3.utils.threadpool.DaemonThreadFactory",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCache",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheAttributes",
      "org.apache.commons.text.matcher.AbstractStringMatcher",
      "org.apache.commons.jcs3.admin.CountingOnlyOutputStream",
      "org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal$ZombieEvent",
      "org.apache.commons.jcs3.engine.behavior.ICache",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteLocation",
      "org.apache.commons.jcs3.log.LogFactory",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheFactory",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCacheAttributes",
      "org.apache.commons.jcs3.jcache.jmx.JCSCacheMXBean",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager$ThreadPoolManagerHolder",
      "org.apache.commons.jcs3.engine.behavior.ICompositeCacheManager",
      "org.apache.commons.jcs3.engine.CacheStatus",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$RemoveAllEvent",
      "org.apache.commons.jcs3.engine.control.CompositeCacheConfigurator",
      "org.apache.commons.jcs3.auxiliary.remote.CommonRemoteCacheAttributes",
      "org.apache.commons.text.matcher.AbstractStringMatcher$CharMatcher",
      "org.apache.commons.jcs3.jcache.proxy.ExceptionWrapperHandler",
      "org.apache.commons.jcs3.engine.CacheEventQueue",
      "org.apache.commons.jcs3.utils.struct.DoubleLinkedListNode",
      "org.apache.commons.text.matcher.AbstractStringMatcher$CharArrayMatcher",
      "org.apache.commons.jcs3.log.JulLogFactory",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue",
      "org.apache.commons.jcs3.access.exception.CacheException",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheEventLogging",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPListener",
      "org.apache.commons.jcs3.access.exception.ObjectExistsException",
      "org.apache.commons.jcs3.engine.stats.StatElement",
      "org.apache.commons.jcs3.engine.behavior.IShutdownObserver",
      "org.apache.commons.jcs3.engine.control.event.behavior.ElementEventType",
      "org.apache.commons.jcs3.engine.behavior.ICacheEventQueue$QueueType",
      "org.apache.commons.jcs3.utils.discovery.DiscoveredService",
      "org.apache.commons.lang3.Validate",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$AbstractCacheEvent",
      "org.apache.commons.jcs3.io.ObjectInputStreamClassLoaderAware$BlacklistClassResolver",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$RemoveEvent",
      "org.apache.commons.jcs3.engine.behavior.ICompositeCacheAttributes",
      "org.apache.commons.jcs3.engine.control.CompositeCache",
      "org.apache.commons.jcs3.utils.discovery.UDPDiscoveryMessage$BroadcastType",
      "org.apache.commons.jcs3.engine.behavior.IRequireScheduler",
      "org.apache.commons.text.matcher.StringMatcherFactory",
      "org.apache.commons.jcs3.jcache.JCSCachingManager",
      "org.apache.commons.jcs3.utils.timing.ElapsedTimer",
      "org.apache.commons.jcs3.engine.control.group.GroupId",
      "org.apache.commons.jcs3.utils.serialization.StandardSerializer",
      "org.apache.commons.jcs3.engine.control.event.behavior.IElementEventQueue",
      "org.apache.commons.jcs3.jcache.ImmutableIterable",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager$1",
      "org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal$PutEvent",
      "org.apache.commons.text.StringSubstitutor$Result",
      "org.apache.commons.jcs3.jcache.NoWriter",
      "org.apache.commons.jcs3.engine.behavior.ICacheListener",
      "org.apache.commons.jcs3.utils.discovery.behavior.IDiscoveryListener",
      "org.apache.commons.jcs3.engine.logging.CacheEvent",
      "org.apache.commons.jcs3.engine.memory.lru.LRUMemoryCache",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheMonitor",
      "org.apache.commons.jcs3.jcache.jmx.JMXs",
      "org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCache",
      "org.apache.commons.jcs3.jcache.lang.Lang3Substitutor",
      "org.apache.commons.jcs3.utils.config.PropertySetterException",
      "org.apache.commons.jcs3.auxiliary.remote.AbstractRemoteCacheListener",
      "org.apache.commons.jcs3.engine.behavior.ICacheType$CacheType",
      "org.apache.commons.jcs3.engine.logging.CacheEventLoggerDebugLogger",
      "org.apache.commons.jcs3.engine.control.event.ElementEventQueue",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPCacheFactory",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.jcs3.engine.stats.behavior.IStatElement",
      "org.apache.commons.text.matcher.AbstractStringMatcher$CharSetMatcher",
      "org.apache.commons.text.matcher.AbstractStringMatcher$NoneMatcher",
      "org.apache.commons.text.TextStringBuilder$TextStringBuilderWriter",
      "org.apache.commons.jcs3.engine.CacheElementSerialized",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$PutEvent",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralElementDescriptor",
      "org.apache.commons.jcs3.engine.stats.behavior.IStats",
      "org.apache.commons.jcs3.jcache.thread.DaemonThreadFactory",
      "org.apache.commons.jcs3.jcache.JCSConfiguration",
      "org.apache.commons.text.StringTokenizer",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCacheNoWait",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$DisposeEvent",
      "org.apache.commons.text.matcher.AbstractStringMatcher$TrimMatcher",
      "org.apache.commons.jcs3.engine.ZombieCacheService",
      "org.apache.commons.jcs3.engine.control.group.GroupAttrName",
      "org.apache.commons.jcs3.engine.logging.behavior.ICacheEventLogger",
      "org.apache.commons.jcs3.engine.control.event.behavior.IElementEvent",
      "org.apache.commons.jcs3.auxiliary.lateral.behavior.ILateralCacheAttributes",
      "org.apache.commons.jcs3.jcache.JCSCachingManager$InternalManager$1",
      "org.apache.commons.jcs3.jcache.JCSEntry",
      "org.apache.commons.jcs3.jcache.lang.Subsitutor$Helper",
      "org.apache.commons.text.lookup.FunctionStringLookup",
      "org.apache.commons.jcs3.jcache.NoLoader",
      "org.apache.commons.text.StringSubstitutor",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.apache.commons.jcs3.jcache.lang.Lang3Substitutor$1",
      "org.apache.commons.jcs3.utils.net.HostNameUtil",
      "org.apache.commons.jcs3.log.Log",
      "org.hsqldb.jdbc.JDBCDriver$1",
      "org.apache.commons.jcs3.engine.memory.behavior.IMemoryCache",
      "org.apache.commons.jcs3.utils.zip.CompressionUtil",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteUtils$1",
      "org.apache.commons.jcs3.jcache.NoFilter",
      "org.apache.commons.text.TextStringBuilder",
      "org.apache.commons.jcs3.jcache.JCSCache$1",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.behavior.ITCPLateralCacheAttributes",
      "org.apache.commons.jcs3.jcache.EvictionListener",
      "org.apache.commons.jcs3.engine.logging.behavior.ICacheEvent",
      "org.apache.commons.jcs3.jcache.lang.DefaultSubsitutor",
      "org.apache.commons.jcs3.engine.behavior.IZombie",
      "org.apache.commons.jcs3.auxiliary.remote.behavior.IRemoteCacheConstants",
      "org.apache.commons.jcs3.jcache.JCSCachingManager$InternalManager",
      "org.apache.commons.text.Builder",
      "org.apache.commons.text.lookup.AbstractStringLookup",
      "org.apache.commons.jcs3.utils.config.PropertySetter",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheNoWaitFacade",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.TCPLateralCacheAttributes",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer$1",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPDiscoveryListener",
      "org.apache.commons.jcs3.engine.CacheInfo",
      "org.apache.commons.jcs3.engine.ElementAttributes",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheFactory",
      "org.apache.commons.jcs3.auxiliary.lateral.behavior.ILateralCacheListener",
      "org.apache.commons.jcs3.engine.stats.CacheStats",
      "org.apache.commons.jcs3.admin.CacheRegionInfo",
      "org.apache.commons.jcs3.auxiliary.AuxiliaryCache",
      "org.apache.commons.jcs3.jcache.serialization.Serializations",
      "org.apache.commons.jcs3.engine.control.event.behavior.IElementEventHandler",
      "org.apache.commons.jcs3.auxiliary.remote.behavior.IRemoteCacheListener",
      "org.apache.commons.jcs3.auxiliary.remote.AbstractRemoteAuxiliaryCache",
      "org.apache.commons.jcs3.admin.JCSAdminBean",
      "org.apache.commons.jcs3.jcache.JCSListener",
      "org.apache.commons.jcs3.engine.match.KeyMatcherPatternImpl",
      "org.apache.commons.jcs3.engine.behavior.ICacheObserver",
      "org.apache.commons.jcs3.jcache.proxy.ClassLoaderAwareCache",
      "org.apache.commons.jcs3.jcache.JCSMutableEntry",
      "org.apache.commons.jcs3.utils.threadpool.PoolConfiguration$WhenBlockedPolicy",
      "org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal",
      "org.apache.commons.jcs3.utils.threadpool.PoolConfiguration",
      "org.apache.commons.jcs3.jcache.jmx.JCSCacheStatisticsMXBean",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCache",
      "org.apache.commons.jcs3.engine.memory.util.MemoryElementDescriptor",
      "org.apache.commons.jcs3.io.ObjectInputStreamClassLoaderAware",
      "org.apache.commons.text.lookup.BiStringLookup",
      "org.apache.commons.jcs3.log.MessageFormatter",
      "org.apache.commons.jcs3.engine.behavior.ICacheServiceNonLocal",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheManager",
      "org.apache.commons.jcs3.engine.behavior.ICacheEventQueue",
      "org.apache.commons.jcs3.engine.behavior.ICacheElementSerialized",
      "org.apache.commons.jcs3.engine.behavior.IElementAttributes",
      "org.apache.commons.jcs3.admin.JCSJMXBean",
      "org.apache.commons.jcs3.engine.control.event.ElementEvent",
      "org.apache.commons.jcs3.utils.serialization.EncryptingSerializer",
      "org.apache.commons.jcs3.utils.discovery.UDPDiscoveryService",
      "org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal$RemoveEvent",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCacheMonitor",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCache",
      "org.apache.commons.jcs3.engine.behavior.ICompositeCacheAttributes$DiskUsagePattern",
      "org.apache.commons.jcs3.auxiliary.remote.behavior.IRemoteCacheAttributes",
      "org.apache.commons.jcs3.jcache.Asserts",
      "org.apache.commons.jcs3.utils.discovery.UDPDiscoveryAttributes",
      "org.apache.commons.jcs3.auxiliary.AuxiliaryCacheFactory",
      "org.apache.commons.jcs3.log.JulLogAdapter",
      "org.apache.commons.text.TextStringBuilder$TextStringBuilderTokenizer",
      "org.apache.commons.jcs3.jcache.Times",
      "org.apache.commons.jcs3.utils.discovery.UDPDiscoveryMessage",
      "org.apache.commons.jcs3.engine.CacheEventQueueFactory",
      "org.apache.commons.jcs3.jcache.Statistics",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheMonitor",
      "org.apache.commons.jcs3.engine.CacheAdaptor",
      "org.apache.commons.jcs3.auxiliary.AuxiliaryCacheAttributes",
      "org.apache.commons.jcs3.engine.behavior.ICacheService",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager",
      "org.apache.commons.jcs3.engine.behavior.IProvideScheduler",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer",
      "org.apache.commons.jcs3.log.LogManager$LogFactoryHolder",
      "org.apache.commons.jcs3.access.exception.ObjectNotFoundException",
      "org.apache.commons.text.lookup.StringLookupFactory",
      "org.apache.commons.jcs3.jcache.JCSCachingProvider",
      "org.apache.commons.text.TextStringBuilder$TextStringBuilderReader",
      "org.apache.commons.jcs3.auxiliary.lateral.behavior.ILateralCacheAttributes$Type",
      "org.apache.commons.jcs3.jcache.EvictionListener$1",
      "org.apache.commons.jcs3.engine.control.CompositeCacheManager",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCommand",
      "org.apache.commons.jcs3.log.LogManager",
      "org.apache.commons.jcs3.engine.PooledCacheEventQueue",
      "org.apache.commons.jcs3.engine.CacheElement",
      "org.apache.commons.jcs3.engine.memory.AbstractMemoryCache",
      "org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal$RemoveAllEvent",
      "org.apache.commons.jcs3.auxiliary.remote.AbstractRemoteCacheNoWaitFacade",
      "org.apache.commons.jcs3.engine.stats.behavior.ICacheStats",
      "org.apache.commons.jcs3.jcache.lang.Subsitutor",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteUtils",
      "org.apache.commons.jcs3.engine.match.behavior.IKeyMatcher",
      "org.apache.commons.jcs3.auxiliary.remote.behavior.ICommonRemoteCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.remote.behavior.IRemoteCacheClient",
      "org.apache.commons.jcs3.engine.CompositeCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCacheNoWaitFacade",
      "org.apache.commons.jcs3.engine.behavior.ICacheType",
      "org.apache.commons.jcs3.utils.config.OptionConverter",
      "org.apache.commons.jcs3.jcache.ExpiryAwareCache",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheNoWait",
      "org.apache.commons.jcs3.jcache.JCSCache",
      "org.apache.commons.jcs3.utils.serialization.CompressingSerializer",
      "org.apache.commons.text.matcher.StringMatcher",
      "org.apache.commons.jcs3.admin.CacheElementInfo",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheAttributes",
      "org.apache.commons.jcs3.jcache.TempStateCacheView",
      "org.apache.commons.jcs3.engine.memory.AbstractDoubleLinkedListMemoryCache",
      "org.apache.commons.jcs3.engine.stats.Stats",
      "org.apache.commons.text.lookup.StringLookup",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheListener",
      "org.apache.commons.jcs3.engine.behavior.IShutdownObservable"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.lang.ThreadGroup", false, JCSCache_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.util.function.Consumer", false, JCSCache_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("javax.cache.event.CacheEntryEventFilter", false, JCSCache_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("javax.cache.processor.EntryProcessor", false, JCSCache_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JCSCache_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.jcs3.jcache.JCSCache",
      "org.apache.commons.jcs3.jcache.JCSCache$1",
      "org.apache.commons.jcs3.jcache.NoLoader",
      "org.apache.commons.jcs3.jcache.NoWriter",
      "org.apache.commons.jcs3.jcache.jmx.JMXs",
      "org.apache.commons.jcs3.jcache.JCSCachingProvider",
      "org.apache.commons.jcs3.log.LogManager",
      "org.apache.commons.jcs3.log.JulLogFactory",
      "org.apache.commons.jcs3.log.LogManager$LogFactoryHolder",
      "org.apache.commons.jcs3.log.JulLogAdapter",
      "org.apache.commons.jcs3.engine.control.CompositeCacheManager",
      "org.apache.commons.jcs3.log.MessageFormatter",
      "org.apache.commons.jcs3.engine.CompositeCacheAttributes",
      "org.apache.commons.jcs3.engine.behavior.ICompositeCacheAttributes$DiskUsagePattern",
      "org.apache.commons.jcs3.engine.ElementAttributes",
      "org.apache.commons.jcs3.utils.threadpool.DaemonThreadFactory",
      "org.apache.commons.jcs3.admin.JCSAdminBean",
      "org.apache.commons.jcs3.engine.control.CompositeCacheConfigurator",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager",
      "org.apache.commons.jcs3.utils.threadpool.PoolConfiguration$WhenBlockedPolicy",
      "org.apache.commons.jcs3.utils.threadpool.PoolConfiguration",
      "org.apache.commons.jcs3.utils.config.PropertySetter",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager$ThreadPoolManagerHolder",
      "org.apache.commons.jcs3.engine.control.event.ElementEventQueue",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager$1",
      "org.apache.commons.jcs3.utils.timing.ElapsedTimer",
      "org.apache.commons.jcs3.utils.config.OptionConverter",
      "org.apache.commons.text.matcher.AbstractStringMatcher",
      "org.apache.commons.text.matcher.AbstractStringMatcher$CharMatcher",
      "org.apache.commons.text.matcher.AbstractStringMatcher$NoneMatcher",
      "org.apache.commons.text.matcher.AbstractStringMatcher$CharSetMatcher",
      "org.apache.commons.text.matcher.AbstractStringMatcher$TrimMatcher",
      "org.apache.commons.text.matcher.StringMatcherFactory",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.text.matcher.AbstractStringMatcher$CharArrayMatcher",
      "org.apache.commons.text.StringSubstitutor",
      "org.apache.commons.jcs3.jcache.lang.Lang3Substitutor$1",
      "org.apache.commons.text.lookup.AbstractStringLookup",
      "org.apache.commons.text.lookup.FunctionStringLookup",
      "org.apache.commons.text.lookup.StringLookupFactory",
      "org.apache.commons.lang3.Validate",
      "org.apache.commons.jcs3.jcache.lang.Lang3Substitutor",
      "org.apache.commons.text.TextStringBuilder",
      "org.apache.commons.text.StringSubstitutor$Result",
      "org.apache.commons.jcs3.jcache.lang.DefaultSubsitutor",
      "org.apache.commons.jcs3.jcache.lang.Subsitutor$Helper",
      "org.apache.commons.jcs3.jcache.JCSCachingManager",
      "org.apache.commons.jcs3.jcache.JCSCachingManager$InternalManager",
      "org.apache.commons.jcs3.jcache.JCSCachingManager$InternalManager$1",
      "org.apache.commons.jcs3.jcache.JCSConfiguration",
      "org.apache.commons.jcs3.engine.control.CompositeCache",
      "org.apache.commons.jcs3.jcache.ExpiryAwareCache",
      "org.apache.commons.jcs3.engine.match.KeyMatcherPatternImpl",
      "org.apache.commons.jcs3.engine.memory.AbstractMemoryCache",
      "org.apache.commons.jcs3.engine.memory.AbstractDoubleLinkedListMemoryCache",
      "org.apache.commons.jcs3.engine.memory.lru.LRUMemoryCache",
      "org.apache.commons.jcs3.utils.struct.DoubleLinkedList",
      "org.apache.commons.jcs3.jcache.Statistics",
      "org.apache.commons.jcs3.jcache.EvictionListener",
      "org.apache.commons.jcs3.jcache.thread.DaemonThreadFactory",
      "org.apache.commons.jcs3.utils.discovery.UDPDiscoveryAttributes",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer$1",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer",
      "org.apache.commons.jcs3.utils.serialization.StandardSerializer",
      "org.apache.commons.jcs3.utils.serialization.EncryptingSerializer",
      "org.apache.commons.jcs3.utils.discovery.UDPDiscoveryService",
      "org.apache.commons.jcs3.utils.net.HostNameUtil",
      "org.apache.commons.jcs3.utils.discovery.UDPDiscoveryReceiver",
      "org.apache.commons.jcs3.engine.CacheElement",
      "org.apache.commons.jcs3.engine.CacheElementSerialized",
      "org.apache.commons.jcs3.utils.serialization.CompressingSerializer",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheMonitor",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheMonitor",
      "org.apache.commons.jcs3.jcache.Asserts",
      "org.apache.commons.jcs3.jcache.Times",
      "org.apache.commons.jcs3.jcache.serialization.Serializations",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheFactory",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPCacheFactory",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCacheMonitor",
      "org.apache.commons.jcs3.utils.struct.DoubleLinkedListNode",
      "org.apache.commons.jcs3.engine.memory.util.MemoryElementDescriptor",
      "org.apache.commons.jcs3.utils.config.PropertySetterException",
      "org.apache.commons.jcs3.jcache.TempStateCacheView",
      "org.apache.commons.jcs3.jcache.JCSMutableEntry",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.TCPLateralCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.lateral.behavior.ILateralCacheAttributes$Type",
      "org.apache.commons.jcs3.jcache.jmx.JCSCacheMXBean",
      "org.apache.commons.jcs3.jcache.jmx.JCSCacheStatisticsMXBean",
      "org.apache.commons.jcs3.jcache.proxy.ClassLoaderAwareCache",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.apache.commons.jcs3.utils.zip.CompressionUtil",
      "org.apache.commons.jcs3.io.ObjectInputStreamClassLoaderAware",
      "org.apache.commons.jcs3.engine.stats.Stats",
      "org.apache.commons.jcs3.engine.stats.CacheStats",
      "org.apache.commons.jcs3.engine.stats.StatElement",
      "org.apache.commons.jcs3.jcache.ImmutableIterable",
      "org.apache.commons.jcs3.engine.logging.CacheEventLoggerDebugLogger",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheFactory",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCache",
      "org.apache.commons.jcs3.auxiliary.remote.AbstractRemoteCacheNoWaitFacade",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheNoWaitFacade",
      "org.apache.commons.jcs3.engine.ZombieCacheService",
      "org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal",
      "org.apache.commons.jcs3.auxiliary.remote.AbstractRemoteCacheListener",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheListener",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPListener",
      "org.apache.commons.jcs3.engine.CacheInfo",
      "org.apache.commons.jcs3.access.exception.CacheException",
      "org.apache.commons.jcs3.access.exception.ObjectNotFoundException",
      "org.apache.commons.jcs3.jcache.JCSListener",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheEventLogging",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCache",
      "org.apache.commons.jcs3.auxiliary.remote.CommonRemoteCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.remote.behavior.IRemoteCacheConstants",
      "org.apache.commons.jcs3.auxiliary.remote.server.behavior.RemoteType",
      "org.apache.commons.jcs3.auxiliary.remote.AbstractRemoteAuxiliaryCache",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCache",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteUtils",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteUtils$1",
      "org.apache.commons.jcs3.auxiliary.remote.RemoteCacheNoWait",
      "org.apache.commons.jcs3.engine.CacheEventQueueFactory",
      "org.apache.commons.jcs3.engine.CacheAdaptor",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue",
      "org.apache.commons.jcs3.engine.PooledCacheEventQueue",
      "org.apache.commons.jcs3.engine.CacheEventQueue",
      "org.apache.commons.jcs3.engine.CacheStatus",
      "org.apache.commons.jcs3.io.ObjectInputStreamClassLoaderAware$BlacklistClassResolver",
      "org.apache.commons.jcs3.engine.logging.CacheEvent",
      "org.apache.commons.jcs3.engine.control.event.ElementEvent",
      "org.apache.commons.jcs3.jcache.EvictionListener$1",
      "org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCache",
      "org.apache.commons.jcs3.jcache.JCSEntry",
      "org.apache.commons.jcs3.jcache.proxy.ExceptionWrapperHandler",
      "org.apache.commons.jcs3.jcache.NoFilter",
      "org.apache.commons.jcs3.engine.behavior.ICacheType$CacheType",
      "org.apache.commons.jcs3.engine.control.event.behavior.ElementEventType"
    );
  }
}
