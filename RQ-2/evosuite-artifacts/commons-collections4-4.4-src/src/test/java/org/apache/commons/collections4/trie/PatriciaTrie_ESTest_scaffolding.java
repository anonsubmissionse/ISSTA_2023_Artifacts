/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 02:13:59 GMT 2022
 */

package org.apache.commons.collections4.trie;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PatriciaTrie_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.collections4.trie.PatriciaTrie"; 
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
    java.lang.System.setProperty("user.dir", "/home/ISSTA_USER/Documents/toga-evaluation/toga-eval-issta-2023/artifacts/commons-collections4-4.4-src"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PatriciaTrie_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.collections4.MapIterator",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie",
      "org.apache.commons.collections4.trie.AbstractBitwiseTrie",
      "org.apache.commons.collections4.trie.PatriciaTrie",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry",
      "org.apache.commons.collections4.Get",
      "org.apache.commons.collections4.Trie",
      "org.apache.commons.collections4.OrderedMapIterator",
      "org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieIterator",
      "org.apache.commons.collections4.Put",
      "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry",
      "org.apache.commons.collections4.trie.KeyAnalyzer",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet$EntryIterator",
      "org.apache.commons.collections4.IterableMap",
      "org.apache.commons.collections4.IterableSortedMap",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet",
      "org.apache.commons.collections4.OrderedMap",
      "org.apache.commons.collections4.OrderedIterator",
      "org.apache.commons.collections4.IterableGet"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PatriciaTrie_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.collections4.trie.AbstractBitwiseTrie",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie",
      "org.apache.commons.collections4.trie.PatriciaTrie",
      "org.apache.commons.collections4.trie.KeyAnalyzer",
      "org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer",
      "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeMap",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieIterator",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet$EntryIterator",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$Reference",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$PrefixRangeMap"
    );
  }
}
