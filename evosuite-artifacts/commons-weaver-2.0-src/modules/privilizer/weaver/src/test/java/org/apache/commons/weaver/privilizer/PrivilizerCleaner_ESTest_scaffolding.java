/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 17:03:23 GMT 2022
 */

package org.apache.commons.weaver.privilizer;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class PrivilizerCleaner_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.weaver.privilizer.PrivilizerCleaner"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-weaver-2.0-src/modules/privilizer/weaver"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PrivilizerCleaner_ESTest_scaffolding.class.getClassLoader() ,
      "org.objectweb.asm.tree.FieldInsnNode",
      "org.objectweb.asm.util.TraceSignatureVisitor",
      "org.apache.commons.weaver.model.WeavableMethodParameter",
      "org.objectweb.asm.SymbolTable",
      "org.objectweb.asm.ModuleWriter",
      "org.objectweb.asm.commons.LocalVariablesSorter",
      "org.apache.commons.lang3.tuple.Pair",
      "org.apache.commons.weaver.spi.Cleaner",
      "org.apache.commons.weaver.privilizer.FieldAccess",
      "org.apache.commons.weaver.model.Scanner",
      "org.objectweb.asm.tree.VarInsnNode",
      "org.apache.commons.weaver.privilizer.BlueprintingVisitor$1",
      "org.objectweb.asm.signature.SignatureVisitor",
      "org.objectweb.asm.MethodWriter",
      "org.apache.commons.weaver.privilizer.BlueprintingVisitor$2",
      "org.objectweb.asm.tree.ClassNode",
      "org.objectweb.asm.ClassTooLargeException",
      "org.objectweb.asm.util.Textifier",
      "org.objectweb.asm.util.TraceMethodVisitor",
      "org.apache.commons.weaver.privilizer.BlueprintingVisitor",
      "org.objectweb.asm.ClassWriter",
      "org.objectweb.asm.tree.AnnotationNode",
      "org.objectweb.asm.AnnotationVisitor",
      "org.objectweb.asm.tree.MethodInsnNode",
      "org.apache.commons.weaver.privilizer.AccessLevel",
      "org.objectweb.asm.tree.LineNumberNode",
      "org.apache.commons.weaver.model.WeavableExecutable",
      "org.apache.commons.weaver.model.WeavableMethod",
      "org.objectweb.asm.tree.IntInsnNode",
      "org.objectweb.asm.commons.GeneratorAdapter",
      "org.apache.commons.weaver.privilizer.BlueprintingVisitor$NestedMethodInvocationHandler",
      "org.apache.commons.weaver.privilizer.Privilizer$PrivilizerClassVisitor",
      "org.objectweb.asm.Attribute",
      "org.objectweb.asm.tree.JumpInsnNode",
      "org.objectweb.asm.MethodTooLargeException",
      "org.apache.commons.weaver.model.WeavableClass",
      "org.apache.commons.weaver.privilizer.Privilizer$CustomClassWriter",
      "org.apache.commons.weaver.model.WeavablePackage",
      "org.objectweb.asm.Opcodes",
      "org.objectweb.asm.util.TraceFieldVisitor",
      "org.objectweb.asm.ByteVector",
      "org.apache.commons.weaver.model.Weavable",
      "org.apache.commons.weaver.model.WeaveEnvironment",
      "org.apache.commons.weaver.model.AnnotatedElements",
      "org.apache.commons.weaver.privilizer.BlueprintingVisitor$TypeInfo",
      "org.objectweb.asm.tree.ModuleNode",
      "org.objectweb.asm.Handle",
      "org.apache.commons.weaver.privilizer.Privilizer$1",
      "org.objectweb.asm.util.Printer",
      "org.objectweb.asm.AnnotationWriter",
      "org.objectweb.asm.tree.LookupSwitchInsnNode",
      "org.objectweb.asm.tree.TableSwitchInsnNode",
      "org.objectweb.asm.MethodVisitor",
      "org.apache.commons.weaver.privilizer.Field",
      "org.objectweb.asm.FieldWriter",
      "org.objectweb.asm.tree.IincInsnNode",
      "org.apache.commons.weaver.privilizer.PrivilizerCleaner$1",
      "org.apache.commons.weaver.privilizer.PrivilizingVisitor$1",
      "org.objectweb.asm.Type",
      "org.apache.commons.weaver.privilizer.Privilizer",
      "org.objectweb.asm.tree.MultiANewArrayInsnNode",
      "org.apache.commons.weaver.model.ScanResult",
      "org.objectweb.asm.tree.TypeAnnotationNode",
      "org.objectweb.asm.tree.LocalVariableAnnotationNode",
      "org.apache.commons.weaver.model.WeavableParameter",
      "org.apache.commons.weaver.privilizer.Privilizing$CallTo",
      "org.objectweb.asm.ClassVisitor",
      "org.objectweb.asm.util.TraceClassVisitor",
      "org.apache.commons.weaver.model.WeaveInterest",
      "org.apache.commons.weaver.privilizer.Privilizer$WriteClass",
      "org.objectweb.asm.util.TraceModuleVisitor",
      "org.apache.commons.weaver.model.NestedWeavable",
      "org.objectweb.asm.ClassReader",
      "org.apache.commons.weaver.model.WeavableConstructor",
      "org.objectweb.asm.tree.InvokeDynamicInsnNode",
      "org.objectweb.asm.tree.FrameNode",
      "org.objectweb.asm.tree.FieldNode",
      "org.apache.commons.weaver.privilizer.PrivilizerCleaner",
      "org.apache.commons.weaver.privilizer.Policy",
      "org.objectweb.asm.FieldVisitor",
      "org.objectweb.asm.commons.AdviceAdapter",
      "org.objectweb.asm.Label",
      "org.apache.commons.weaver.privilizer.InlineNestedPrivilegedCalls",
      "org.apache.commons.weaver.model.WeavableConstructorParameter",
      "org.apache.commons.weaver.privilizer.InlineNestedPrivilegedCalls$VisitEnd",
      "org.objectweb.asm.tree.MethodNode",
      "org.objectweb.asm.commons.Method",
      "org.objectweb.asm.tree.TypeInsnNode",
      "org.objectweb.asm.commons.TableSwitchGenerator",
      "org.objectweb.asm.commons.StaticInitMerger",
      "org.apache.commons.weaver.privilizer.BlueprintingVisitor$AccessibleAdvisor",
      "org.objectweb.asm.ModuleVisitor",
      "org.apache.commons.weaver.privilizer.PrivilizingVisitor",
      "org.apache.commons.weaver.model.WeavableField",
      "org.objectweb.asm.tree.UnsupportedClassVersionException",
      "org.objectweb.asm.tree.LabelNode",
      "org.apache.commons.weaver.model.WeaveEnvironment$Resource",
      "org.apache.commons.lang3.tuple.ImmutablePair",
      "org.objectweb.asm.tree.LdcInsnNode",
      "org.objectweb.asm.TypePath",
      "org.objectweb.asm.tree.AbstractInsnNode",
      "org.objectweb.asm.util.TraceAnnotationVisitor",
      "org.apache.commons.weaver.privilizer.BlueprintingVisitor$MethodInvocationHandler",
      "org.apache.commons.weaver.spi.WeaveLifecycleProvider",
      "org.objectweb.asm.tree.InsnNode",
      "org.apache.commons.weaver.model.ScanRequest",
      "org.apache.commons.weaver.privilizer.Privilizing"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.weaver.model.Scanner", false, PrivilizerCleaner_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.weaver.model.WeaveEnvironment", false, PrivilizerCleaner_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PrivilizerCleaner_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.weaver.privilizer.PrivilizerCleaner",
      "org.objectweb.asm.ClassVisitor",
      "org.apache.commons.weaver.privilizer.PrivilizerCleaner$1",
      "org.apache.commons.weaver.privilizer.Policy",
      "org.apache.commons.weaver.privilizer.Privilizer",
      "org.apache.commons.weaver.model.WeaveEnvironment"
    );
  }
}
