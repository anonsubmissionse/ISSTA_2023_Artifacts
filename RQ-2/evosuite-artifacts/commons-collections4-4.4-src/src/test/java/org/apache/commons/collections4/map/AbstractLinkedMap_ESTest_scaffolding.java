/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 01:20:07 GMT 2022
 */

package org.apache.commons.collections4.map;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractLinkedMap_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.collections4.map.AbstractLinkedMap"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractLinkedMap_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.collections4.map.AbstractLinkedMap",
      "org.apache.commons.collections4.MapIterator",
      "org.apache.commons.collections4.KeyValue",
      "org.apache.commons.collections4.map.LinkedMap",
      "org.apache.commons.collections4.map.LRUMap",
      "org.apache.commons.collections4.iterators.AbstractEmptyMapIterator",
      "org.apache.commons.collections4.map.AbstractHashedMap$EntrySet",
      "org.apache.commons.collections4.Get",
      "org.apache.commons.collections4.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections4.map.AbstractLinkedMap$EntrySetIterator",
      "org.apache.commons.collections4.map.AbstractLinkedMap$KeySetIterator",
      "org.apache.commons.collections4.map.AbstractHashedMap$Values",
      "org.apache.commons.collections4.iterators.EmptyOrderedMapIterator",
      "org.apache.commons.collections4.OrderedMap",
      "org.apache.commons.collections4.map.AbstractLinkedMap$LinkIterator",
      "org.apache.commons.collections4.map.AbstractLinkedMap$LinkMapIterator",
      "org.apache.commons.collections4.map.AbstractLinkedMap$ValuesIterator",
      "org.apache.commons.collections4.map.AbstractHashedMap",
      "org.apache.commons.collections4.BoundedMap",
      "org.apache.commons.collections4.ResettableIterator",
      "org.apache.commons.collections4.OrderedMapIterator",
      "org.apache.commons.collections4.Put",
      "org.apache.commons.collections4.map.AbstractHashedMap$HashIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedIterator",
      "org.apache.commons.collections4.IterableMap",
      "org.apache.commons.collections4.map.AbstractLinkedMap$LinkEntry",
      "org.apache.commons.collections4.OrderedIterator",
      "org.apache.commons.collections4.map.AbstractHashedMap$HashEntry",
      "org.apache.commons.collections4.map.AbstractHashedMap$KeySet",
      "org.apache.commons.collections4.IterableGet"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractLinkedMap_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.collections4.map.AbstractHashedMap",
      "org.apache.commons.collections4.map.AbstractLinkedMap",
      "org.apache.commons.collections4.map.AbstractHashedMap$HashEntry",
      "org.apache.commons.collections4.map.AbstractLinkedMap$LinkEntry",
      "org.apache.commons.collections4.map.AbstractLinkedMap$LinkIterator",
      "org.apache.commons.collections4.map.AbstractLinkedMap$LinkMapIterator",
      "org.apache.commons.collections4.map.AbstractLinkedMap$EntrySetIterator",
      "org.apache.commons.collections4.map.AbstractLinkedMap$KeySetIterator",
      "org.apache.commons.collections4.map.AbstractLinkedMap$ValuesIterator",
      "org.apache.commons.collections4.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections4.iterators.AbstractEmptyMapIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedMapIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedIterator",
      "org.apache.commons.collections4.map.LinkedMap",
      "org.apache.commons.collections4.map.LRUMap",
      "org.apache.commons.collections4.map.AbstractHashedMap$KeySet",
      "org.apache.commons.collections4.map.LinkedMap$LinkedMapList",
      "org.apache.commons.collections4.map.AbstractHashedMap$EntrySet",
      "org.apache.commons.collections4.map.AbstractHashedMap$Values",
      "org.apache.commons.collections4.iterators.EmptyIterator",
      "org.apache.commons.collections4.iterators.EmptyMapIterator",
      "org.apache.commons.collections4.map.AbstractHashedMap$HashIterator",
      "org.apache.commons.collections4.map.AbstractHashedMap$EntrySetIterator"
    );
  }
}
