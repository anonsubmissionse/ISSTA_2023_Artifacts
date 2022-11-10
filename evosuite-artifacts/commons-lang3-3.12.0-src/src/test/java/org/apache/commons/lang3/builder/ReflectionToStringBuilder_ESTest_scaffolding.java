/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 10 18:07:27 GMT 2022
 */

package org.apache.commons.lang3.builder;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ReflectionToStringBuilder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.lang3.builder.ReflectionToStringBuilder"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-lang3-3.12.0-src"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ReflectionToStringBuilder_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.lang3.builder.ToStringSummary",
      "org.apache.commons.lang3.StringEscapeUtils$CsvUnescaper",
      "org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover",
      "org.apache.commons.lang3.text.StrBuilder$StrBuilderTokenizer",
      "org.apache.commons.lang3.ClassUtils$Interfaces",
      "org.apache.commons.lang3.text.translate.UnicodeEscaper",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.lang3.ClassUtils",
      "org.apache.commons.lang3.builder.ToStringStyle$NoClassNameToStringStyle",
      "org.apache.commons.lang3.text.translate.AggregateTranslator",
      "org.apache.commons.lang3.builder.ToStringStyle$JsonToStringStyle",
      "org.apache.commons.lang3.StringEscapeUtils",
      "org.apache.commons.lang3.text.translate.OctalUnescaper",
      "org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle",
      "org.apache.commons.lang3.ArraySorter",
      "org.apache.commons.lang3.text.translate.UnicodeUnescaper",
      "org.apache.commons.lang3.text.translate.NumericEntityEscaper",
      "org.apache.commons.lang3.builder.ToStringBuilder",
      "org.apache.commons.lang3.text.StrBuilder",
      "org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle",
      "org.apache.commons.lang3.text.StrTokenizer",
      "org.apache.commons.lang3.ObjectUtils$Null",
      "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper",
      "org.apache.commons.lang3.text.StrMatcher$CharMatcher",
      "org.apache.commons.lang3.builder.ToStringStyle",
      "org.apache.commons.lang3.text.StrMatcher$NoMatcher",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.lang3.text.translate.CodePointTranslator",
      "org.apache.commons.lang3.builder.ToStringExclude",
      "org.apache.commons.lang3.builder.StandardToStringStyle",
      "org.apache.commons.lang3.CharSequenceUtils",
      "org.apache.commons.lang3.text.StrMatcher",
      "org.apache.commons.lang3.builder.RecursiveToStringStyle",
      "org.apache.commons.lang3.text.StrMatcher$TrimMatcher",
      "org.apache.commons.lang3.ObjectUtils",
      "org.apache.commons.lang3.text.StrMatcher$StringMatcher",
      "org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle",
      "org.apache.commons.lang3.function.ToBooleanBiFunction",
      "org.apache.commons.lang3.text.StrBuilder$StrBuilderReader",
      "org.apache.commons.lang3.text.translate.EntityArrays",
      "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter",
      "org.apache.commons.lang3.builder.ReflectionToStringBuilder",
      "org.apache.commons.lang3.text.translate.CharSequenceTranslator",
      "org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle",
      "org.apache.commons.lang3.text.translate.NumericEntityUnescaper",
      "org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION",
      "org.apache.commons.lang3.StringEscapeUtils$CsvEscaper",
      "org.apache.commons.lang3.Validate",
      "org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle",
      "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher",
      "org.apache.commons.lang3.builder.Builder",
      "org.apache.commons.lang3.text.translate.LookupTranslator",
      "org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle",
      "org.apache.commons.lang3.exception.CloneFailedException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ReflectionToStringBuilder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$NoClassNameToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$JsonToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle",
      "org.apache.commons.lang3.builder.ToStringBuilder",
      "org.apache.commons.lang3.builder.ReflectionToStringBuilder",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.lang3.Validate",
      "org.apache.commons.lang3.ArraySorter",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.lang3.CharSequenceUtils",
      "org.apache.commons.lang3.builder.RecursiveToStringStyle",
      "org.apache.commons.lang3.ClassUtils",
      "org.apache.commons.lang3.ObjectUtils$Null",
      "org.apache.commons.lang3.ObjectUtils",
      "org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle",
      "org.apache.commons.lang3.builder.StandardToStringStyle",
      "org.apache.commons.lang3.text.translate.CharSequenceTranslator",
      "org.apache.commons.lang3.text.translate.LookupTranslator",
      "org.apache.commons.lang3.text.translate.EntityArrays",
      "org.apache.commons.lang3.text.translate.AggregateTranslator",
      "org.apache.commons.lang3.text.translate.CodePointTranslator",
      "org.apache.commons.lang3.text.translate.UnicodeEscaper",
      "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper",
      "org.apache.commons.lang3.text.translate.NumericEntityEscaper",
      "org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover",
      "org.apache.commons.lang3.StringEscapeUtils$CsvEscaper",
      "org.apache.commons.lang3.text.translate.OctalUnescaper",
      "org.apache.commons.lang3.text.translate.UnicodeUnescaper",
      "org.apache.commons.lang3.text.translate.NumericEntityUnescaper",
      "org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION",
      "org.apache.commons.lang3.StringEscapeUtils$CsvUnescaper",
      "org.apache.commons.lang3.StringEscapeUtils"
    );
  }
}
