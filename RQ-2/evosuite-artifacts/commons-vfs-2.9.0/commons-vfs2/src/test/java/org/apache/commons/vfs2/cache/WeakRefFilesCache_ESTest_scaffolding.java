/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 05:24:07 GMT 2022
 */

package org.apache.commons.vfs2.cache;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class WeakRefFilesCache_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.vfs2.cache.WeakRefFilesCache"; 
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
    java.lang.System.setProperty("user.dir", "/home/ISSTA_USER/Documents/toga-evaluation/toga-eval-issta-2023/artifacts/commons-vfs-2.9.0/commons-vfs2"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(WeakRefFilesCache_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.vfs2.FileSystem",
      "org.apache.commons.vfs2.cache.WeakRefFilesCache",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.or.RendererMap",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.Logger",
      "org.apache.commons.vfs2.provider.VfsComponentContext",
      "org.apache.commons.vfs2.cache.SoftRefFilesCache",
      "org.apache.log4j.Level",
      "org.apache.commons.vfs2.cache.FileSystemAndNameKey",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.commons.vfs2.FilesCache",
      "org.apache.commons.vfs2.provider.VfsComponent",
      "org.apache.commons.vfs2.cache.AbstractFilesCache",
      "org.apache.commons.vfs2.FileSystemException",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.commons.vfs2.FileObject",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.commons.vfs2.provider.AbstractVfsComponent",
      "org.apache.log4j.Priority",
      "org.apache.commons.vfs2.FileName",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.spi.Configurator",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.helpers.OptionConverter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(WeakRefFilesCache_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.vfs2.provider.AbstractVfsComponent",
      "org.apache.commons.vfs2.cache.AbstractFilesCache",
      "org.apache.log4j.Level",
      "org.apache.log4j.Priority",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.apache.commons.vfs2.cache.SoftRefFilesCache",
      "org.apache.commons.vfs2.cache.WeakRefFilesCache",
      "org.apache.commons.vfs2.cache.SoftRefFilesCache$ReleaseThread",
      "org.apache.commons.vfs2.cache.FileSystemAndNameKey"
    );
  }
}
