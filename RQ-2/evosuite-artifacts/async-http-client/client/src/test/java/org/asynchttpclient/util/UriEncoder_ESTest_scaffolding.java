/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 07 15:41:42 GMT 2022
 */

package org.asynchttpclient.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class UriEncoder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.asynchttpclient.util.UriEncoder"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/async-http-client/client"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.dom.DOMDocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("strategy", "EvoSuite"); 
    java.lang.System.setProperty("sun.java.launcher", "SUN_STANDARD"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("sun.boot.class.path", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jfr.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/classes"); 
    java.lang.System.setProperty("show_progress", "false"); 
    java.lang.System.setProperty("extra_timeout", "18"); 
    java.lang.System.setProperty("sun.desktop", "gnome"); 
    java.lang.System.setProperty("process_communication_port", "15465"); 
    java.lang.System.setProperty("initialization_timeout", "18"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.factory", "org.evosuite.shaded.org.dom4j.DocumentFactory"); 
    java.lang.System.setProperty("assertion_timeout", "18"); 
    java.lang.System.setProperty("junit_tests", "true"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("analysis_criteria", ""); 
    java.lang.System.setProperty("sun.boot.library.path", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/amd64"); 
    java.lang.System.setProperty("enable_asserts_for_evosuite", "false"); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
    java.lang.System.setProperty("sun.cpu.isalist", ""); 
    java.lang.System.setProperty("sun.jnu.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.encoding.pkg", "sun.io"); 
    java.lang.System.setProperty("configuration_id", "default"); 
    java.lang.System.setProperty("PROJECT_PREFIX", ""); 
    java.lang.System.setProperty("ctg_time_per_class", "6"); 
    java.lang.System.setProperty("write_pool", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/async-http-client/client/.evosuite/tmp_2022_10_07_10_30_22/pools/org.asynchttpclient.util.UriEncoder.pool"); 
    java.lang.System.setProperty("save_all_data", "false"); 
    java.lang.System.setProperty("logback.configurationFile", "logback-ctg.xml"); 
    java.lang.System.setProperty("junit_check_timeout", "18"); 
    java.lang.System.setProperty("replace_calls", "true"); 
    java.lang.System.setProperty("coverage", "true"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.DocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("ctg_schedule", "BUDGET"); 
    java.lang.System.setProperty("sun.io.unicode.encoding", "UnicodeLittle"); 
    java.lang.System.setProperty("stopping_condition", "MAXTIME"); 
    java.lang.System.setProperty("print_to_system", "false"); 
    java.lang.System.setProperty("ctg_seeds_file_in", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/async-http-client/client/.evosuite/evosuite-seeds/org.asynchttpclient.util.UriEncoder.seed"); 
    java.lang.System.setProperty("output_variables", "TARGET_CLASS,configuration_id,criterion,ctg_min_time_per_job,ctg_schedule,search_budget,p_object_pool,ctg_time_per_class,Size,Length,Total_Time,Random_Seed,LineCoverage,LineCoverageBitString,BranchCoverage,BranchCoverageBitString,ExceptionCoverage,ExceptionCoverageBitString,Explicit_MethodExceptions,Explicit_TypeExceptions,Implicit_MethodExceptions,Implicit_TypeExceptions,WeakMutationScore,WeakMutationCoverageBitString,OutputCoverage,OutputCoverageBitString,MethodCoverage,MethodCoverageBitString,MethodNoExceptionCoverage,MethodNoExceptionCoverageBitString,CBranchCoverage,CBranchCoverageBitString"); 
    java.lang.System.setProperty("global_timeout", "109"); 
    java.lang.System.setProperty("assertions", "true"); 
    java.lang.System.setProperty("log_timeout", "false"); 
    java.lang.System.setProperty("master_log_port", "40459"); 
    java.lang.System.setProperty("reset_static_fields", "true"); 
    java.lang.System.setProperty("sun.java.command", "org.evosuite.ClientProcess"); 
    java.lang.System.setProperty("junit_check", "true"); 
    java.lang.System.setProperty("evosuite.log.folder", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/async-http-client/client/.evosuite/tmp_2022_10_07_10_30_22/logs/org.asynchttpclient.util.UriEncoder"); 
    java.lang.System.setProperty("minimize", "true"); 
    java.lang.System.setProperty("max_size", "100"); 
    java.lang.System.setProperty("sun.os.patch.level", "unknown"); 
    java.lang.System.setProperty("sun.cpu.endian", "little"); 
    java.lang.System.setProperty("ctg_min_time_per_job", "1"); 
    java.lang.System.setProperty("junit_suffix", "_ESTest"); 
    java.lang.System.setProperty("java.vendor.url.bug", "http://bugreport.sun.com/bugreport/"); 
    java.lang.System.setProperty("report_dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/async-http-client/client/.evosuite/tmp_2022_10_07_10_30_22/reports/org.asynchttpclient.util.UriEncoder"); 
    java.lang.System.setProperty("minimization_timeout", "18"); 
    java.lang.System.setProperty("CP_file_path", "/tmp/EvoSuite_classpathFile2801886382766616979.txt"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
    java.lang.System.setProperty("inline", "true"); 
    java.lang.System.setProperty("ctg_seeds_file_out", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/async-http-client/client/.evosuite/tmp_2022_10_07_10_30_22/seeds/org.asynchttpclient.util.UriEncoder.seed"); 
    java.lang.System.setProperty("TARGET_CLASS", "org.asynchttpclient.util.UriEncoder"); 
    java.lang.System.setProperty("spawn_process_manager_port", "38109"); 
    java.lang.System.setProperty("evosuite.log.appender", "CLIENT"); 
    java.lang.System.setProperty("write_junit_timeout", "18"); 
    java.lang.System.setProperty("test_dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/async-http-client/client/.evosuite/tmp_2022_10_07_10_30_22/tests"); 
    java.lang.System.setProperty("search_budget", "109"); 
    java.lang.System.setProperty("plot", "false"); 
    java.lang.System.setProperty("p_object_pool", "0.3"); 
    java.lang.System.setProperty("criterion", "LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH"); 
    java.lang.System.setProperty("test_comments", "false"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(UriEncoder_ESTest_scaffolding.class.getClassLoader() ,
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "org.eclipse.jetty.util.PathWatcher$PathWatchEvent",
      "org.asynchttpclient.uri.UriParser",
      "org.eclipse.jetty.util.Uptime",
      "org.eclipse.jetty.util.PathWatcher$Config",
      "org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate",
      "org.eclipse.jetty.util.component.LifeCycle",
      "org.asynchttpclient.util.Utf8UrlEncoder",
      "org.eclipse.jetty.util.InetAddressSet$InetPattern",
      "org.eclipse.jetty.util.RegexSet",
      "org.eclipse.jetty.util.Uptime$Impl",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.asynchttpclient.util.MiscUtils",
      "org.eclipse.jetty.util.component.LifeCycle$Listener",
      "org.eclipse.jetty.util.IncludeExclude",
      "org.eclipse.jetty.util.annotation.ManagedObject",
      "org.eclipse.jetty.util.log.Log$1",
      "org.eclipse.jetty.util.PathWatcher$PathWatchEventType",
      "org.eclipse.jetty.util.MultiException",
      "org.eclipse.jetty.util.PathWatcher",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.util.InetAddressSet$SingletonInetRange",
      "org.eclipse.jetty.util.Loader",
      "org.asynchttpclient.Param",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.util.PathWatcher$DirAction",
      "org.eclipse.jetty.util.InetAddressSet$MinMaxInetRange",
      "org.eclipse.jetty.util.PathWatcher$PathMatcherSet",
      "org.asynchttpclient.util.UriEncoder$1",
      "org.asynchttpclient.util.UriEncoder$2",
      "org.asynchttpclient.util.Assertions",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.util.log.JettyAwareLogger",
      "org.asynchttpclient.util.UriEncoder",
      "org.asynchttpclient.util.StringBuilderPool",
      "org.eclipse.jetty.util.InetAddressSet$CidrInetRange",
      "org.asynchttpclient.uri.Uri",
      "org.eclipse.jetty.util.InetAddressSet",
      "org.eclipse.jetty.util.InetAddressSet$LegacyInetRange",
      "org.eclipse.jetty.util.PathWatcher$Listener",
      "org.eclipse.jetty.util.log.Logger"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.asynchttpclient.uri.Uri", false, UriEncoder_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(UriEncoder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.asynchttpclient.util.UriEncoder",
      "org.asynchttpclient.uri.Uri",
      "org.asynchttpclient.util.Assertions",
      "org.asynchttpclient.util.StringBuilderPool",
      "org.asynchttpclient.util.MiscUtils",
      "org.asynchttpclient.Param",
      "org.asynchttpclient.util.Utf8UrlEncoder",
      "org.asynchttpclient.uri.UriParser",
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "org.eclipse.jetty.util.IncludeExclude",
      "org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate",
      "org.eclipse.jetty.util.RegexSet",
      "org.eclipse.jetty.util.InetAddressSet",
      "org.eclipse.jetty.util.PathWatcher$PathMatcherSet"
    );
  }
}
