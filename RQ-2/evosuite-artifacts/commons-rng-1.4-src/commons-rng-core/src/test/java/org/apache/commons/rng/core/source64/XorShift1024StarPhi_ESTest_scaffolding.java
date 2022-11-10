/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 03:12:15 GMT 2022
 */

package org.apache.commons.rng.core.source64;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class XorShift1024StarPhi_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.rng.core.source64.XorShift1024StarPhi"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-rng-1.4-src/commons-rng-core"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(XorShift1024StarPhi_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.rng.core.BaseProvider",
      "org.apache.commons.rng.LongJumpableUniformRandomProvider",
      "org.apache.commons.rng.RestorableUniformRandomProvider",
      "org.apache.commons.rng.core.RandomProviderDefaultState",
      "org.apache.commons.rng.core.source64.XoShiRo512Plus",
      "org.apache.commons.rng.core.source64.AbstractXoRoShiRo128",
      "org.apache.commons.rng.RandomProviderState",
      "org.apache.commons.rng.core.source64.XorShift1024Star",
      "org.apache.commons.rng.core.source64.AbstractXoShiRo512",
      "org.apache.commons.rng.core.source64.PcgRxsMXs64",
      "org.apache.commons.rng.core.source64.AbstractXoShiRo256",
      "org.apache.commons.rng.core.source64.XoShiRo512StarStar",
      "org.apache.commons.rng.core.source64.XoRoShiRo1024Star",
      "org.apache.commons.rng.core.source64.TwoCmres$Cmres$Factory",
      "org.apache.commons.rng.core.source64.MersenneTwister64",
      "org.apache.commons.rng.JumpableUniformRandomProvider",
      "org.apache.commons.rng.core.source64.XoShiRo256StarStar",
      "org.apache.commons.rng.core.source64.DotyHumphreySmallFastCounting64",
      "org.apache.commons.rng.core.source64.XorShift1024StarPhi",
      "org.apache.commons.rng.UniformRandomProvider",
      "org.apache.commons.rng.core.source64.XoShiRo256PlusPlus",
      "org.apache.commons.rng.core.source64.XoRoShiRo128StarStar",
      "org.apache.commons.rng.core.source64.XoRoShiRo1024PlusPlus",
      "org.apache.commons.rng.core.source64.AbstractXoRoShiRo1024",
      "org.apache.commons.rng.core.source64.LongProvider",
      "org.apache.commons.rng.core.source64.XoRoShiRo1024StarStar",
      "org.apache.commons.rng.core.source64.TwoCmres$Cmres",
      "org.apache.commons.rng.core.source64.RandomLongSource",
      "org.apache.commons.rng.core.util.NumberFactory",
      "org.apache.commons.rng.core.source64.XoShiRo512PlusPlus",
      "org.apache.commons.rng.core.source64.XoRoShiRo128Plus",
      "org.apache.commons.rng.core.source64.TwoCmres"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(XorShift1024StarPhi_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.rng.core.BaseProvider",
      "org.apache.commons.rng.core.source64.LongProvider",
      "org.apache.commons.rng.core.source64.XorShift1024Star",
      "org.apache.commons.rng.core.source64.XorShift1024StarPhi",
      "org.apache.commons.rng.core.util.NumberFactory",
      "org.apache.commons.rng.core.RandomProviderDefaultState",
      "org.apache.commons.rng.core.source64.AbstractXoRoShiRo128",
      "org.apache.commons.rng.core.source64.XoRoShiRo128StarStar",
      "org.apache.commons.rng.core.source64.MersenneTwister64",
      "org.apache.commons.rng.core.source64.PcgRxsMXs64",
      "org.apache.commons.rng.core.source64.AbstractXoRoShiRo1024",
      "org.apache.commons.rng.core.source64.XoRoShiRo1024Star",
      "org.apache.commons.rng.core.source64.XoRoShiRo128Plus",
      "org.apache.commons.rng.core.source64.DotyHumphreySmallFastCounting64",
      "org.apache.commons.rng.core.source64.AbstractXoShiRo512",
      "org.apache.commons.rng.core.source64.XoShiRo512Plus",
      "org.apache.commons.rng.core.source64.AbstractXoShiRo256",
      "org.apache.commons.rng.core.source64.XoShiRo256PlusPlus",
      "org.apache.commons.rng.core.source64.XoShiRo512StarStar",
      "org.apache.commons.rng.core.source64.XoRoShiRo1024StarStar",
      "org.apache.commons.rng.core.source64.XoShiRo256StarStar",
      "org.apache.commons.rng.core.source64.TwoCmres$Cmres",
      "org.apache.commons.rng.core.source64.TwoCmres$Cmres$Factory",
      "org.apache.commons.rng.core.source64.TwoCmres",
      "org.apache.commons.rng.core.source64.XoShiRo512PlusPlus",
      "org.apache.commons.rng.core.source64.XoRoShiRo1024PlusPlus"
    );
  }
}
