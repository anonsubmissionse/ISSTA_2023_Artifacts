/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Oct 09 22:42:35 GMT 2022
 */

package org.apache.bcel.classfile;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class PMGClass_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.bcel.classfile.PMGClass"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/bcel-6.5.0-src"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
    java.lang.System.setProperty("sun.boot.class.path", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jfr.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/classes"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PMGClass_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.bcel.util.ClassLoaderRepository",
      "org.apache.bcel.classfile.Module",
      "org.apache.bcel.classfile.ConstantLong",
      "org.apache.bcel.Const",
      "org.apache.bcel.classfile.Method",
      "org.apache.bcel.classfile.Signature$MyByteArrayInputStream",
      "org.apache.bcel.classfile.ConstantMethodType",
      "org.apache.bcel.classfile.ConstantModule",
      "org.apache.bcel.classfile.Node",
      "org.apache.bcel.generic.Type",
      "org.apache.bcel.classfile.ClassFormatException",
      "org.apache.bcel.classfile.AnnotationEntry",
      "org.apache.bcel.util.BCELComparator",
      "org.apache.bcel.classfile.ModuleProvides",
      "org.apache.bcel.classfile.JavaClass$1",
      "org.apache.bcel.classfile.SourceFile",
      "org.apache.bcel.classfile.MethodParameters",
      "org.apache.bcel.classfile.Visitor",
      "org.apache.bcel.classfile.ParameterAnnotations",
      "org.apache.bcel.classfile.ElementValue",
      "org.apache.bcel.classfile.NestMembers",
      "org.apache.bcel.classfile.MethodParameter",
      "org.apache.bcel.classfile.Unknown",
      "org.apache.bcel.classfile.RuntimeVisibleParameterAnnotations",
      "org.apache.bcel.classfile.Synthetic",
      "org.apache.bcel.classfile.ConstantInteger",
      "org.apache.bcel.classfile.ConstantDouble",
      "org.apache.bcel.classfile.StackMapEntry",
      "org.apache.bcel.classfile.InnerClasses",
      "org.apache.bcel.classfile.StackMap",
      "org.apache.bcel.classfile.ConstantDynamic",
      "org.apache.bcel.classfile.Constant$1",
      "org.apache.bcel.classfile.Field$1",
      "org.apache.bcel.classfile.ModuleRequires",
      "org.apache.bcel.classfile.ConstantClass",
      "org.apache.bcel.classfile.ParameterAnnotationEntry",
      "org.apache.bcel.classfile.LocalVariableTable",
      "org.apache.bcel.util.LruCacheClassPathRepository$1",
      "org.apache.bcel.classfile.ConstantUtf8",
      "org.apache.bcel.classfile.ConstantString",
      "org.apache.bcel.util.ClassPathRepository",
      "org.apache.bcel.classfile.ConstantValue",
      "org.apache.bcel.classfile.ConstantInvokeDynamic",
      "org.apache.bcel.classfile.ConstantCP",
      "org.apache.bcel.classfile.ConstantMethodHandle",
      "org.apache.bcel.classfile.LineNumber",
      "org.apache.bcel.classfile.ConstantFloat",
      "org.apache.bcel.util.ClassPath$ClassFile",
      "org.apache.bcel.classfile.ConstantUtf8$Cache$1",
      "org.apache.bcel.classfile.PMGClass",
      "org.apache.bcel.classfile.Field",
      "org.apache.bcel.util.LruCacheClassPathRepository",
      "org.apache.bcel.Constants",
      "org.apache.bcel.classfile.AccessFlags",
      "org.apache.bcel.classfile.StackMapType",
      "org.apache.bcel.classfile.NestHost",
      "org.apache.bcel.classfile.ConstantInterfaceMethodref",
      "org.apache.bcel.classfile.DescendingVisitor",
      "org.apache.bcel.classfile.ModuleOpens",
      "org.apache.bcel.classfile.BootstrapMethod",
      "org.apache.bcel.classfile.Annotations",
      "org.apache.bcel.classfile.LineNumberTable",
      "org.apache.bcel.classfile.ConstantUtf8$Cache",
      "org.apache.bcel.classfile.ConstantUtf8$1",
      "org.apache.bcel.classfile.BootstrapMethods",
      "org.apache.bcel.classfile.ConstantPackage",
      "org.apache.bcel.util.AbstractClassPathRepository",
      "org.apache.bcel.util.Repository",
      "org.apache.bcel.classfile.RuntimeInvisibleAnnotations",
      "org.apache.bcel.classfile.Signature",
      "org.apache.bcel.classfile.ConstantFieldref",
      "org.apache.bcel.classfile.AnnotationDefault",
      "org.apache.bcel.classfile.ModuleMainClass",
      "org.apache.bcel.classfile.ConstantPool",
      "org.apache.bcel.util.ClassPath",
      "org.apache.bcel.classfile.FieldOrMethod",
      "org.apache.bcel.classfile.ModulePackages",
      "org.apache.bcel.classfile.ConstantObject",
      "org.apache.bcel.classfile.EmptyVisitor",
      "org.apache.bcel.classfile.Attribute",
      "org.apache.bcel.classfile.Method$1",
      "org.apache.bcel.classfile.Constant",
      "org.apache.bcel.classfile.CodeException",
      "org.apache.bcel.classfile.Deprecated",
      "org.apache.bcel.classfile.JavaClass",
      "org.apache.bcel.classfile.ElementValuePair",
      "org.apache.bcel.classfile.Code",
      "org.apache.bcel.classfile.RuntimeInvisibleParameterAnnotations",
      "org.apache.bcel.classfile.EnclosingMethod",
      "org.apache.bcel.classfile.AttributeReader",
      "org.apache.bcel.classfile.UnknownAttributeReader",
      "org.apache.bcel.classfile.LocalVariable",
      "org.apache.bcel.classfile.RuntimeVisibleAnnotations",
      "org.apache.bcel.classfile.LocalVariableTypeTable",
      "org.apache.bcel.classfile.ConstantMethodref",
      "org.apache.bcel.classfile.ModuleExports",
      "org.apache.bcel.classfile.ConstantNameAndType",
      "org.apache.bcel.classfile.InnerClass",
      "org.apache.bcel.classfile.ExceptionTable"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Enumeration", false, PMGClass_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PMGClass_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.bcel.classfile.Attribute",
      "org.apache.bcel.classfile.PMGClass",
      "org.apache.bcel.util.ClassPath",
      "org.apache.bcel.classfile.Constant$1",
      "org.apache.bcel.classfile.Constant",
      "org.apache.bcel.classfile.ConstantModule",
      "org.apache.bcel.classfile.ConstantCP",
      "org.apache.bcel.classfile.ConstantDynamic",
      "org.apache.bcel.classfile.ConstantNameAndType",
      "org.apache.bcel.classfile.ConstantFieldref",
      "org.apache.bcel.classfile.ConstantInteger",
      "org.apache.bcel.classfile.ConstantPool",
      "org.apache.bcel.classfile.ConstantFloat",
      "org.apache.bcel.classfile.ClassFormatException",
      "org.apache.bcel.classfile.ConstantLong",
      "org.apache.bcel.util.ClassLoaderRepository",
      "org.apache.bcel.classfile.ConstantClass",
      "org.apache.bcel.classfile.EmptyVisitor",
      "org.apache.bcel.util.AbstractClassPathRepository",
      "org.apache.bcel.util.LruCacheClassPathRepository",
      "org.apache.bcel.classfile.ConstantDouble",
      "org.apache.bcel.classfile.ConstantMethodHandle",
      "org.apache.bcel.classfile.ConstantPackage",
      "org.apache.bcel.classfile.ConstantUtf8$Cache$1",
      "org.apache.bcel.classfile.ConstantUtf8$Cache",
      "org.apache.bcel.classfile.ConstantUtf8",
      "org.apache.bcel.classfile.ConstantInvokeDynamic",
      "org.apache.bcel.classfile.ConstantMethodref",
      "org.apache.bcel.classfile.ConstantInterfaceMethodref",
      "org.apache.bcel.classfile.DescendingVisitor",
      "org.apache.bcel.classfile.ConstantString",
      "org.apache.bcel.classfile.ConstantMethodType",
      "org.apache.bcel.classfile.EnclosingMethod",
      "org.apache.bcel.Const",
      "org.apache.bcel.util.ClassPathRepository"
    );
  }
}
