/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 17:05:50 GMT 2022
 */

package org.apache.commons.weaver.normalizer;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class NormalizerWeaver_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.weaver.normalizer.NormalizerWeaver"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-weaver-2.0-src/modules/normalizer"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NormalizerWeaver_ESTest_scaffolding.class.getClassLoader() ,
      "org.objectweb.asm.MethodVisitor",
      "org.objectweb.asm.FieldWriter",
      "org.apache.commons.weaver.model.WeavableMethodParameter",
      "org.objectweb.asm.Type",
      "org.objectweb.asm.SymbolTable",
      "org.objectweb.asm.ModuleWriter",
      "org.apache.commons.weaver.model.ScanResult",
      "org.apache.commons.lang3.tuple.Pair",
      "org.objectweb.asm.signature.SignatureWriter",
      "org.apache.commons.weaver.model.WeavableParameter",
      "org.objectweb.asm.ClassVisitor",
      "org.apache.commons.weaver.model.Scanner",
      "org.apache.commons.weaver.model.WeaveInterest",
      "org.objectweb.asm.commons.AnnotationRemapper",
      "org.objectweb.asm.commons.ModuleRemapper",
      "org.apache.commons.weaver.model.NestedWeavable",
      "org.objectweb.asm.ClassReader",
      "org.apache.commons.weaver.model.WeavableConstructor",
      "org.objectweb.asm.commons.SignatureRemapper",
      "org.objectweb.asm.commons.MethodRemapper",
      "org.objectweb.asm.signature.SignatureVisitor",
      "org.objectweb.asm.MethodWriter",
      "org.objectweb.asm.ClassTooLargeException",
      "org.apache.commons.weaver.normalizer.Normalizer$Inspector$InspectConstructor",
      "org.objectweb.asm.ClassWriter",
      "org.objectweb.asm.AnnotationVisitor",
      "org.objectweb.asm.commons.Remapper",
      "org.objectweb.asm.FieldVisitor",
      "org.apache.commons.weaver.model.WeavableExecutable",
      "org.apache.commons.weaver.model.WeavableMethod",
      "org.apache.commons.weaver.normalizer.Normalizer$Inspector",
      "org.objectweb.asm.Label",
      "org.apache.commons.weaver.model.WeavableConstructorParameter",
      "org.objectweb.asm.Attribute",
      "org.objectweb.asm.MethodTooLargeException",
      "org.apache.commons.weaver.model.WeavableClass",
      "org.apache.commons.weaver.normalizer.Normalizer$ClassWrapper",
      "org.apache.commons.weaver.model.WeavablePackage",
      "org.apache.commons.weaver.normalizer.Normalizer$1",
      "org.apache.commons.weaver.normalizer.Normalizer$Remap$RewriteConstructor",
      "org.apache.commons.weaver.normalizer.NormalizerWeaver",
      "org.objectweb.asm.ByteVector",
      "org.objectweb.asm.commons.FieldRemapper",
      "org.objectweb.asm.ModuleVisitor",
      "org.apache.commons.weaver.model.Weavable",
      "org.apache.commons.weaver.model.WeaveEnvironment",
      "org.apache.commons.weaver.model.AnnotatedElements",
      "org.apache.commons.weaver.model.WeavableField",
      "org.apache.commons.weaver.normalizer.Normalizer",
      "org.apache.commons.weaver.model.WeaveEnvironment$Resource",
      "org.apache.commons.lang3.tuple.ImmutablePair",
      "org.objectweb.asm.Handle",
      "org.objectweb.asm.TypePath",
      "org.objectweb.asm.commons.SimpleRemapper",
      "org.apache.commons.weaver.normalizer.Normalizer$CustomClassWriter",
      "org.apache.commons.weaver.normalizer.Normalizer$WriteClass",
      "org.objectweb.asm.AnnotationWriter",
      "org.apache.commons.weaver.spi.WeaveLifecycleProvider",
      "org.apache.commons.weaver.spi.Weaver",
      "org.apache.commons.weaver.normalizer.Normalizer$Remap",
      "org.apache.commons.weaver.model.ScanRequest",
      "org.objectweb.asm.commons.ClassRemapper"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.weaver.model.Scanner", false, NormalizerWeaver_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.weaver.model.WeaveEnvironment", false, NormalizerWeaver_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NormalizerWeaver_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.weaver.normalizer.NormalizerWeaver",
      "org.apache.commons.weaver.model.WeaveEnvironment",
      "org.objectweb.asm.Type",
      "org.apache.commons.weaver.normalizer.Normalizer"
    );
  }
}
