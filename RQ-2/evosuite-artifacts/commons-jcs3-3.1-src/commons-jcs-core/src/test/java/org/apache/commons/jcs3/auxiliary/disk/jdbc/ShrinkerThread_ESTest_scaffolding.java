/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 22:01:06 GMT 2022
 */

package org.apache.commons.jcs3.auxiliary.disk.jdbc;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ShrinkerThread_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.jcs3.auxiliary.disk.jdbc.ShrinkerThread"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-jcs3-3.1-src/commons-jcs-core"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ShrinkerThread_ESTest_scaffolding.class.getClassLoader() ,
      "org.hsqldb.lib.FileUtil",
      "org.apache.commons.pool2.DestroyMode",
      "org.apache.commons.dbcp2.datasources.UserPassKey",
      "org.apache.commons.pool2.impl.BaseObjectPoolConfig",
      "org.apache.commons.jcs3.engine.behavior.ICacheElement",
      "org.apache.commons.jcs3.utils.struct.DoubleLinkedList",
      "org.hsqldb.SessionManager",
      "org.hsqldb.store.ValuePool",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.apache.commons.jcs3.auxiliary.disk.jdbc.JDBCDiskCacheAttributes",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.hsqldb.Column",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCache",
      "org.apache.commons.jcs3.utils.threadpool.DaemonThreadFactory",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheAttributes",
      "org.hsqldb.CachedRow",
      "org.hsqldb.lib.Set",
      "org.hsqldb.Node",
      "org.hsqldb.SubQuery",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.hsqldb.Record",
      "org.apache.commons.jcs3.log.Log",
      "org.apache.commons.pool2.BaseObject",
      "org.hsqldb.jdbc.JDBCDriver$1",
      "org.hsqldb.lib.HsqlList",
      "org.hsqldb.GrantConstants",
      "org.apache.commons.jcs3.engine.behavior.ICache",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.apache.commons.jcs3.log.LogFactory",
      "org.hsqldb.SchemaManager$Schema",
      "org.apache.commons.pool2.impl.EvictionPolicy",
      "org.hsqldb.PointerNode",
      "org.hsqldb.Row",
      "org.hsqldb.lib.IntKeyHashMap",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager$ThreadPoolManagerHolder",
      "org.apache.commons.jcs3.engine.logging.behavior.ICacheEvent",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.Select",
      "org.hsqldb.Table",
      "org.hsqldb.lib.Collection",
      "org.apache.commons.jcs3.utils.config.PropertySetter",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.apache.commons.pool2.impl.DefaultEvictionPolicy",
      "org.apache.commons.jcs3.engine.CacheStatus",
      "org.hsqldb.UserManager",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$RemoveAllEvent",
      "org.hsqldb.SessionInterface",
      "org.apache.commons.jcs3.auxiliary.disk.PurgatoryElement",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer$1",
      "org.apache.commons.jcs3.engine.CacheInfo",
      "org.apache.commons.pool2.KeyedPooledObjectFactory",
      "org.apache.commons.jcs3.engine.CacheEventQueue",
      "org.hsqldb.User",
      "org.apache.commons.dbcp2.datasources.SharedPoolDataSource",
      "org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCacheAttributes",
      "org.apache.commons.jcs3.utils.struct.DoubleLinkedListNode",
      "org.apache.commons.jcs3.engine.ElementAttributes",
      "org.hsqldb.jdbc.jdbcPreparedStatement",
      "org.apache.commons.jcs3.log.JulLogFactory",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.types.JavaObject",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheEventLogging",
      "org.hsqldb.persist.CachedObject",
      "org.hsqldb.BaseMemoryNode",
      "org.apache.commons.dbcp2.cpdsadapter.DriverAdapterCPDS",
      "org.apache.commons.jcs3.engine.stats.StatElement",
      "org.apache.commons.jcs3.auxiliary.disk.jdbc.TableState",
      "org.apache.commons.jcs3.auxiliary.AuxiliaryCache",
      "org.apache.commons.jcs3.engine.control.event.behavior.IElementEventHandler",
      "org.apache.commons.pool2.KeyedObjectPool",
      "org.apache.commons.jcs3.engine.behavior.ICacheEventQueue$QueueType",
      "org.hsqldb.HsqlNameManager$HsqlName",
      "org.apache.commons.jcs3.engine.control.event.behavior.ElementEventType",
      "org.hsqldb.lib.IntLookup",
      "org.apache.commons.jcs3.engine.match.KeyMatcherPatternImpl",
      "org.hsqldb.Grantee",
      "org.hsqldb.View",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$AbstractCacheEvent",
      "org.hsqldb.Index$IndexRowIterator",
      "org.apache.commons.jcs3.auxiliary.disk.jdbc.dsfactory.SharedPoolDataSourceFactory",
      "org.hsqldb.jdbc.Util",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$RemoveEvent",
      "org.apache.commons.jcs3.utils.threadpool.PoolConfiguration$WhenBlockedPolicy",
      "org.hsqldb.types.Binary",
      "org.hsqldb.lib.IntValueHashMap",
      "org.apache.commons.dbcp2.datasources.PooledConnectionManager",
      "org.hsqldb.lib.HashMap",
      "org.apache.commons.jcs3.auxiliary.disk.jdbc.dsfactory.DataSourceFactory",
      "org.apache.commons.jcs3.utils.threadpool.PoolConfiguration",
      "org.apache.commons.pool2.PooledObject",
      "org.hsqldb.MemoryNode",
      "org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCache$MyCacheListener",
      "org.apache.commons.jcs3.utils.struct.LRUMap",
      "org.hsqldb.rowio.RowInputBinary",
      "org.hsqldb.lib.HashSet",
      "org.hsqldb.lib.HsqlByteArrayInputStream",
      "org.hsqldb.lib.Iterator",
      "org.apache.commons.pool2.PooledObjectState",
      "org.hsqldb.TriggerDef$TriggerData",
      "org.apache.commons.jcs3.utils.timing.ElapsedTimer",
      "org.hsqldb.store.ValuePoolHashMap",
      "org.apache.commons.jcs3.io.ObjectInputStreamClassLoaderAware",
      "org.apache.commons.jcs3.log.MessageFormatter",
      "org.apache.commons.jcs3.utils.serialization.StandardSerializer",
      "org.apache.commons.jcs3.engine.behavior.ICacheEventQueue",
      "org.apache.commons.jcs3.engine.behavior.ICacheElementSerialized",
      "org.apache.commons.jcs3.engine.behavior.IElementAttributes",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager$1",
      "org.hsqldb.CompiledStatement",
      "org.apache.commons.jcs3.utils.serialization.EncryptingSerializer",
      "org.apache.commons.jcs3.engine.behavior.ICacheListener",
      "org.hsqldb.CachedDataRow",
      "org.hsqldb.rowio.RowOutputInterface",
      "org.hsqldb.DiskNode",
      "org.hsqldb.lib.FileAccess",
      "org.apache.commons.jcs3.engine.logging.CacheEvent",
      "org.hsqldb.persist.DataFileCache",
      "org.hsqldb.lib.HsqlArrayList",
      "org.apache.commons.jcs3.log.JulLogAdapter",
      "org.hsqldb.HsqlInternalException",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.persist.PersistentStore",
      "org.hsqldb.NumberSequence",
      "org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCache",
      "org.apache.commons.jcs3.engine.CacheEventQueueFactory",
      "org.apache.commons.jcs3.auxiliary.AuxiliaryCacheAttributes",
      "org.apache.commons.jcs3.utils.config.PropertySetterException",
      "org.apache.commons.jcs3.auxiliary.disk.jdbc.dsfactory.JndiDataSourceFactory",
      "org.hsqldb.HsqlException",
      "org.hsqldb.rowio.RowInputInterface",
      "org.apache.commons.jcs3.utils.threadpool.ThreadPoolManager",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer",
      "org.apache.commons.jcs3.engine.behavior.ICacheType$CacheType",
      "org.hsqldb.Trace",
      "org.apache.commons.jcs3.log.LogManager$LogFactoryHolder",
      "org.apache.commons.jcs3.engine.logging.CacheEventLoggerDebugLogger",
      "org.hsqldb.persist.HsqlDatabaseProperties",
      "org.hsqldb.Collation",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.store.HashIndex",
      "org.apache.commons.jcs3.auxiliary.disk.jdbc.ShrinkerThread",
      "org.hsqldb.Result",
      "org.hsqldb.Expression",
      "org.apache.commons.jcs3.engine.stats.behavior.IStatElement",
      "org.hsqldb.index.RowIterator",
      "org.apache.commons.dbcp2.datasources.InstanceKeyDataSource",
      "org.hsqldb.Index",
      "org.apache.commons.pool2.impl.EvictionConfig",
      "org.apache.commons.jcs3.utils.struct.AbstractLRUMap",
      "org.apache.commons.jcs3.log.LogManager",
      "org.hsqldb.GranteeManager",
      "org.apache.commons.jcs3.engine.PooledCacheEventQueue",
      "org.hsqldb.lib.FileAccess$FileSync",
      "org.apache.commons.jcs3.engine.CacheElementSerialized",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$PutEvent",
      "org.hsqldb.lib.HashMappedList",
      "org.apache.commons.jcs3.utils.struct.LRUElementDescriptor",
      "org.apache.commons.jcs3.engine.CacheElement",
      "org.apache.commons.jcs3.auxiliary.disk.behavior.IDiskCacheAttributes$DiskLimitType",
      "org.hsqldb.rowio.RowInputBase",
      "org.apache.commons.jcs3.engine.match.behavior.IKeyMatcher",
      "org.apache.commons.jcs3.engine.stats.behavior.IStats",
      "org.hsqldb.Constraint",
      "org.apache.commons.jcs3.auxiliary.disk.behavior.IDiskCacheAttributes",
      "org.hsqldb.TableFilter",
      "org.apache.commons.jcs3.engine.behavior.ICacheType",
      "org.hsqldb.lib.ObjectComparator",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$DisposeEvent",
      "org.apache.commons.dbcp2.datasources.PooledConnectionAndInfo",
      "org.apache.commons.jcs3.utils.serialization.CompressingSerializer",
      "org.hsqldb.lib.ArrayUtil",
      "org.hsqldb.BaseTable",
      "org.hsqldb.Result$ResultMetaData",
      "org.hsqldb.Database",
      "org.apache.commons.jcs3.engine.stats.Stats",
      "org.hsqldb.Session",
      "org.apache.commons.jcs3.engine.logging.behavior.ICacheEventLogger",
      "org.hsqldb.TriggerDef",
      "org.apache.commons.jcs3.engine.control.event.behavior.IElementEvent",
      "org.apache.commons.jcs3.auxiliary.disk.jdbc.JDBCDiskCache"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ShrinkerThread_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.jcs3.log.LogManager",
      "org.apache.commons.jcs3.log.JulLogFactory",
      "org.apache.commons.jcs3.log.LogManager$LogFactoryHolder",
      "org.apache.commons.jcs3.log.JulLogAdapter",
      "org.apache.commons.jcs3.auxiliary.disk.jdbc.ShrinkerThread",
      "org.apache.commons.jcs3.log.MessageFormatter",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.disk.jdbc.JDBCDiskCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.disk.jdbc.dsfactory.SharedPoolDataSourceFactory",
      "org.apache.commons.jcs3.auxiliary.disk.jdbc.TableState",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCache",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheEventLogging",
      "org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCache",
      "org.apache.commons.jcs3.auxiliary.disk.jdbc.JDBCDiskCache",
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
      "org.apache.commons.jcs3.utils.struct.AbstractLRUMap",
      "org.apache.commons.jcs3.utils.struct.LRUMap",
      "org.apache.commons.jcs3.utils.struct.DoubleLinkedList",
      "org.apache.commons.jcs3.engine.stats.Stats",
      "org.apache.commons.jcs3.engine.stats.StatElement",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.apache.commons.dbcp2.cpdsadapter.DriverAdapterCPDS",
      "org.apache.commons.pool2.BaseObject",
      "org.apache.commons.pool2.impl.BaseObjectPoolConfig",
      "org.apache.commons.jcs3.utils.timing.ElapsedTimer",
      "org.apache.commons.jcs3.engine.logging.CacheEventLoggerDebugLogger",
      "org.apache.commons.jcs3.auxiliary.disk.jdbc.dsfactory.JndiDataSourceFactory",
      "org.apache.commons.jcs3.utils.serialization.CompressingSerializer",
      "org.apache.commons.jcs3.engine.logging.CacheEvent",
      "org.apache.commons.jcs3.engine.CacheElement",
      "org.apache.commons.jcs3.utils.serialization.EncryptingSerializer",
      "org.hsqldb.lib.FileUtil",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.jdbc.Util",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HashMap",
      "org.hsqldb.store.HashIndex",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.apache.commons.jcs3.engine.ElementAttributes",
      "org.apache.commons.jcs3.engine.CacheElementSerialized",
      "org.apache.commons.jcs3.auxiliary.disk.PurgatoryElement",
      "org.apache.commons.jcs3.utils.struct.DoubleLinkedListNode",
      "org.apache.commons.jcs3.utils.struct.LRUElementDescriptor",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$AbstractCacheEvent",
      "org.apache.commons.jcs3.engine.AbstractCacheEventQueue$PutEvent",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.hsqldb.jdbc.jdbcPreparedStatement",
      "org.hsqldb.Result",
      "org.hsqldb.lib.IntValueHashMap",
      "org.hsqldb.lib.ArrayUtil",
      "org.apache.commons.jcs3.auxiliary.disk.behavior.IDiskCacheAttributes$DiskLimitType",
      "org.apache.commons.jcs3.engine.CacheStatus",
      "org.apache.commons.jcs3.engine.behavior.ICacheType$CacheType"
    );
  }
}
