/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 16:57:06 GMT 2022
 */

package org.apache.commons.weaver.ant;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractWeaverTask_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.weaver.ant.AbstractWeaverTask"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-weaver-2.0-src/ant"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
    java.lang.System.setProperty("sun.boot.class.path", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jfr.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/classes"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractWeaverTask_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.weaver.ant.WeaverSettings",
      "org.apache.commons.weaver.model.WeavableExecutable",
      "org.apache.commons.weaver.model.WeavableMethod",
      "org.apache.commons.weaver.model.WeavableMethodParameter",
      "org.apache.commons.weaver.model.WeavableConstructorParameter",
      "org.apache.commons.weaver.ant.AbstractWeaverTask",
      "org.apache.commons.weaver.WeaveProcessor",
      "org.apache.commons.weaver.model.ScanResult",
      "org.apache.commons.weaver.ProcessorBase",
      "org.apache.commons.weaver.ant.WeaveTask",
      "org.apache.commons.weaver.ant.InlineProperties$InlineProperty",
      "org.apache.commons.weaver.model.WeavableParameter",
      "org.apache.commons.weaver.model.WeavableClass",
      "org.apache.commons.weaver.model.WeavablePackage",
      "org.apache.commons.weaver.model.Scanner",
      "org.apache.commons.weaver.model.WeaveInterest",
      "org.apache.commons.weaver.ant.InlineProperties",
      "org.apache.commons.weaver.LocalWeaveEnvironment",
      "org.apache.commons.weaver.model.Weavable",
      "org.apache.commons.weaver.model.WeaveEnvironment",
      "org.apache.commons.weaver.model.AnnotatedElements",
      "org.apache.commons.weaver.model.WeavableField",
      "org.apache.commons.weaver.model.WeaveEnvironment$Resource",
      "org.apache.commons.lang3.Validate",
      "org.apache.commons.weaver.model.NestedWeavable",
      "org.apache.commons.weaver.model.WeavableConstructor",
      "org.apache.commons.weaver.CleanProcessor",
      "org.apache.xbean.finder.archive.Archive",
      "org.apache.commons.weaver.model.ScanRequest",
      "org.apache.commons.weaver.ant.CleanTask"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractWeaverTask_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.weaver.ant.AbstractWeaverTask",
      "org.apache.commons.weaver.ant.WeaveTask",
      "org.apache.commons.weaver.ant.CleanTask",
      "org.apache.commons.lang3.Validate",
      "org.apache.commons.weaver.ant.WeaverSettings",
      "org.apache.commons.weaver.ProcessorBase",
      "org.apache.commons.weaver.CleanProcessor",
      "org.apache.commons.weaver.WeaveProcessor"
    );
  }
}
