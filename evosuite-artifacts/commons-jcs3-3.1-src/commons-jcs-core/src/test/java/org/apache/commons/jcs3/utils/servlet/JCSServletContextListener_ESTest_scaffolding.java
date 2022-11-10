/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 22:06:23 GMT 2022
 */

package org.apache.commons.jcs3.utils.servlet;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class JCSServletContextListener_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.jcs3.utils.servlet.JCSServletContextListener"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-jcs3-3.1-src/commons-jcs-core"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JCSServletContextListener_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.jcs3.engine.behavior.ICompositeCacheAttributes",
      "org.apache.commons.jcs3.access.behavior.ICacheAccessManagement",
      "org.apache.commons.jcs3.access.GroupCacheAccess",
      "org.apache.commons.jcs3.engine.control.CompositeCache",
      "org.apache.commons.jcs3.engine.behavior.IRequireScheduler",
      "org.apache.commons.jcs3.engine.behavior.ICacheElement",
      "org.apache.commons.jcs3.engine.control.group.GroupId",
      "org.apache.commons.jcs3.engine.behavior.ICacheServiceNonLocal",
      "org.apache.commons.jcs3.engine.control.event.behavior.IElementEventQueue",
      "org.apache.commons.jcs3.engine.behavior.IElementAttributes",
      "org.apache.commons.jcs3.log.Log",
      "org.apache.commons.jcs3.engine.memory.behavior.IMemoryCache",
      "org.apache.commons.jcs3.utils.servlet.JCSServletContextListener",
      "org.apache.commons.jcs3.engine.behavior.ICache",
      "org.apache.commons.jcs3.engine.behavior.ICompositeCacheAttributes$DiskUsagePattern",
      "org.apache.commons.jcs3.log.LogFactory",
      "org.apache.commons.jcs3.log.JulLogAdapter",
      "org.apache.commons.jcs3.auxiliary.AuxiliaryCacheFactory",
      "org.apache.commons.jcs3.auxiliary.AuxiliaryCacheAttributes",
      "org.apache.commons.jcs3.engine.behavior.ICacheService",
      "org.apache.commons.jcs3.engine.behavior.IProvideScheduler",
      "org.apache.commons.jcs3.engine.behavior.ICacheType$CacheType",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer",
      "org.apache.commons.jcs3.log.LogManager$LogFactoryHolder",
      "org.apache.commons.jcs3.access.exception.ObjectNotFoundException",
      "org.apache.commons.jcs3.access.behavior.IGroupCacheAccess",
      "org.apache.commons.jcs3.auxiliary.remote.behavior.IRemoteCacheConstants",
      "org.apache.commons.jcs3.access.CacheAccess",
      "org.apache.commons.jcs3.engine.behavior.ICompositeCacheManager",
      "org.apache.commons.jcs3.engine.CacheStatus",
      "org.apache.commons.jcs3.JCS",
      "org.apache.commons.jcs3.engine.control.CompositeCacheManager",
      "org.apache.commons.jcs3.engine.control.CompositeCacheConfigurator",
      "org.apache.commons.jcs3.log.LogManager",
      "org.apache.commons.jcs3.access.behavior.ICacheAccess",
      "org.apache.commons.jcs3.engine.stats.behavior.ICacheStats",
      "org.apache.commons.jcs3.log.JulLogFactory",
      "org.apache.commons.jcs3.engine.stats.behavior.IStats",
      "org.apache.commons.jcs3.engine.match.behavior.IKeyMatcher",
      "org.apache.commons.jcs3.access.exception.CacheException",
      "org.apache.commons.jcs3.engine.behavior.ICacheType",
      "org.apache.commons.jcs3.access.exception.ObjectExistsException",
      "org.apache.commons.jcs3.access.exception.InvalidHandleException",
      "org.apache.commons.jcs3.auxiliary.AuxiliaryCache",
      "org.apache.commons.jcs3.engine.behavior.IShutdownObserver",
      "org.apache.commons.jcs3.engine.control.event.behavior.IElementEventHandler",
      "org.apache.commons.jcs3.access.exception.InvalidArgumentException",
      "org.apache.commons.jcs3.engine.control.event.behavior.ElementEventType",
      "org.apache.commons.jcs3.engine.behavior.ICacheEventQueue$QueueType",
      "org.apache.commons.jcs3.engine.control.group.GroupAttrName",
      "org.apache.commons.jcs3.engine.logging.behavior.ICacheEventLogger",
      "org.apache.commons.jcs3.engine.control.event.behavior.IElementEvent",
      "org.apache.commons.jcs3.access.AbstractCacheAccess",
      "org.apache.commons.jcs3.engine.behavior.IShutdownObservable"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("javax.servlet.ServletContext", false, JCSServletContextListener_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JCSServletContextListener_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.jcs3.log.LogManager",
      "org.apache.commons.jcs3.log.JulLogFactory",
      "org.apache.commons.jcs3.log.LogManager$LogFactoryHolder",
      "org.apache.commons.jcs3.log.JulLogAdapter",
      "org.apache.commons.jcs3.utils.servlet.JCSServletContextListener",
      "org.apache.commons.jcs3.JCS"
    );
  }
}
