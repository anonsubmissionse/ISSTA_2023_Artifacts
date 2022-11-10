/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 01:02:15 GMT 2022
 */

package org.apache.commons.collections4.map;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class StaticBucketMap_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.collections4.map.StaticBucketMap"; 
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

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
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
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StaticBucketMap_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.collections4.MapIterator",
      "org.apache.commons.collections4.map.StaticBucketMap$ValueIterator",
      "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter",
      "org.apache.commons.collections4.KeyValue",
      "org.apache.commons.collections4.map.StaticBucketMap$Node",
      "org.apache.commons.collections4.Get",
      "org.apache.commons.collections4.ResettableIterator",
      "org.apache.commons.collections4.map.StaticBucketMap$EntrySet",
      "org.apache.commons.collections4.map.StaticBucketMap$Lock",
      "org.apache.commons.collections4.Put",
      "org.apache.commons.collections4.map.StaticBucketMap",
      "org.apache.commons.collections4.map.StaticBucketMap$EntryIterator",
      "org.apache.commons.collections4.IterableMap",
      "org.apache.commons.collections4.map.StaticBucketMap$BaseIterator",
      "org.apache.commons.collections4.map.StaticBucketMap$KeySet",
      "org.apache.commons.collections4.map.StaticBucketMap$KeyIterator",
      "org.apache.commons.collections4.map.AbstractIterableMap",
      "org.apache.commons.collections4.map.StaticBucketMap$1",
      "org.apache.commons.collections4.IterableGet",
      "org.apache.commons.collections4.map.StaticBucketMap$Values"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StaticBucketMap_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.collections4.map.AbstractIterableMap",
      "org.apache.commons.collections4.map.StaticBucketMap",
      "org.apache.commons.collections4.map.StaticBucketMap$Lock",
      "org.apache.commons.collections4.map.StaticBucketMap$Node",
      "org.apache.commons.collections4.map.StaticBucketMap$KeySet",
      "org.apache.commons.collections4.map.StaticBucketMap$Values",
      "org.apache.commons.collections4.map.StaticBucketMap$EntrySet",
      "org.apache.commons.collections4.map.StaticBucketMap$BaseIterator",
      "org.apache.commons.collections4.map.StaticBucketMap$KeyIterator",
      "org.apache.commons.collections4.map.StaticBucketMap$EntryIterator",
      "org.apache.commons.collections4.map.StaticBucketMap$ValueIterator",
      "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter"
    );
  }
}
