/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 21:49:22 GMT 2022
 */

package org.apache.commons.jcs3.auxiliary.lateral.socket.tcp;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class LateralTCPSender_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPSender"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LateralTCPSender_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.jcs3.io.ObjectInputStreamClassLoaderAware$BlacklistClassResolver",
      "org.apache.commons.jcs3.auxiliary.lateral.behavior.ILateralCacheAttributes$Type",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.TCPLateralCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCommand",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer$1",
      "org.apache.commons.jcs3.engine.behavior.ICacheElement",
      "org.apache.commons.jcs3.io.ObjectInputStreamClassLoaderAware",
      "org.apache.commons.jcs3.log.MessageFormatter",
      "org.apache.commons.jcs3.log.LogManager",
      "org.apache.commons.jcs3.utils.serialization.StandardSerializer",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPSender",
      "org.apache.commons.jcs3.engine.behavior.ICacheElementSerialized",
      "org.apache.commons.jcs3.engine.CacheElementSerialized",
      "org.apache.commons.jcs3.engine.behavior.IElementAttributes",
      "org.apache.commons.jcs3.utils.threadpool.DaemonThreadFactory",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheAttributes",
      "org.apache.commons.jcs3.engine.ElementAttributes",
      "org.apache.commons.jcs3.utils.serialization.EncryptingSerializer",
      "org.apache.commons.jcs3.engine.CacheElement",
      "org.apache.commons.jcs3.log.Log",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralElementDescriptor",
      "org.apache.commons.jcs3.log.JulLogFactory",
      "org.apache.commons.jcs3.utils.zip.CompressionUtil",
      "org.apache.commons.jcs3.log.LogFactory",
      "org.apache.commons.jcs3.utils.serialization.CompressingSerializer",
      "org.apache.commons.jcs3.engine.control.event.behavior.IElementEventHandler",
      "org.apache.commons.jcs3.log.JulLogAdapter",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCacheAttributes",
      "org.apache.commons.jcs3.engine.behavior.ICacheEventQueue$QueueType",
      "org.apache.commons.jcs3.engine.control.event.behavior.ElementEventType",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.behavior.ITCPLateralCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.AuxiliaryCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.lateral.behavior.ILateralCacheAttributes",
      "org.apache.commons.jcs3.engine.control.event.behavior.IElementEvent",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer",
      "org.apache.commons.jcs3.log.LogManager$LogFactoryHolder"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(LateralTCPSender_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.jcs3.log.LogManager",
      "org.apache.commons.jcs3.log.JulLogFactory",
      "org.apache.commons.jcs3.log.LogManager$LogFactoryHolder",
      "org.apache.commons.jcs3.log.JulLogAdapter",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPSender",
      "org.apache.commons.jcs3.auxiliary.AbstractAuxiliaryCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralCacheAttributes",
      "org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.TCPLateralCacheAttributes",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer$1",
      "org.apache.commons.jcs3.engine.behavior.IElementSerializer",
      "org.apache.commons.jcs3.utils.serialization.StandardSerializer",
      "org.apache.commons.jcs3.utils.serialization.EncryptingSerializer",
      "org.apache.commons.jcs3.utils.serialization.CompressingSerializer",
      "org.apache.commons.jcs3.utils.zip.CompressionUtil",
      "org.apache.commons.jcs3.io.ObjectInputStreamClassLoaderAware",
      "org.apache.commons.jcs3.engine.ElementAttributes",
      "org.apache.commons.jcs3.engine.CacheElement",
      "org.apache.commons.jcs3.auxiliary.lateral.LateralElementDescriptor",
      "org.apache.commons.jcs3.engine.CacheElementSerialized",
      "org.apache.commons.jcs3.utils.threadpool.DaemonThreadFactory",
      "org.apache.commons.jcs3.log.MessageFormatter",
      "org.apache.commons.jcs3.io.ObjectInputStreamClassLoaderAware$BlacklistClassResolver",
      "org.apache.commons.jcs3.auxiliary.lateral.behavior.ILateralCacheAttributes$Type"
    );
  }
}
