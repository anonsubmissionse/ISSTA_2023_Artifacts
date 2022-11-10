/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 06 15:27:47 GMT 2022
 */

package org.jsoup.internal;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class StringUtil_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jsoup.internal.StringUtil"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup"); 
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
    java.lang.System.setProperty("extra_timeout", "56"); 
    java.lang.System.setProperty("sun.desktop", "gnome"); 
    java.lang.System.setProperty("process_communication_port", "20145"); 
    java.lang.System.setProperty("initialization_timeout", "56"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.factory", "org.evosuite.shaded.org.dom4j.DocumentFactory"); 
    java.lang.System.setProperty("assertion_timeout", "56"); 
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
    java.lang.System.setProperty("write_pool", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/tmp_2022_10_06_10_56_15/pools/org.jsoup.internal.StringUtil.pool"); 
    java.lang.System.setProperty("save_all_data", "false"); 
    java.lang.System.setProperty("logback.configurationFile", "logback-ctg.xml"); 
    java.lang.System.setProperty("junit_check_timeout", "56"); 
    java.lang.System.setProperty("replace_calls", "true"); 
    java.lang.System.setProperty("coverage", "true"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.DocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("ctg_schedule", "BUDGET"); 
    java.lang.System.setProperty("sun.io.unicode.encoding", "UnicodeLittle"); 
    java.lang.System.setProperty("stopping_condition", "MAXTIME"); 
    java.lang.System.setProperty("print_to_system", "false"); 
    java.lang.System.setProperty("ctg_seeds_file_in", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/evosuite-seeds/org.jsoup.internal.StringUtil.seed"); 
    java.lang.System.setProperty("output_variables", "TARGET_CLASS,configuration_id,criterion,ctg_min_time_per_job,ctg_schedule,search_budget,p_object_pool,ctg_time_per_class,Size,Length,Total_Time,Random_Seed,LineCoverage,LineCoverageBitString,BranchCoverage,BranchCoverageBitString,ExceptionCoverage,ExceptionCoverageBitString,Explicit_MethodExceptions,Explicit_TypeExceptions,Implicit_MethodExceptions,Implicit_TypeExceptions,WeakMutationScore,WeakMutationCoverageBitString,OutputCoverage,OutputCoverageBitString,MethodCoverage,MethodCoverageBitString,MethodNoExceptionCoverage,MethodNoExceptionCoverageBitString,CBranchCoverage,CBranchCoverageBitString"); 
    java.lang.System.setProperty("global_timeout", "337"); 
    java.lang.System.setProperty("assertions", "true"); 
    java.lang.System.setProperty("log_timeout", "false"); 
    java.lang.System.setProperty("master_log_port", "38143"); 
    java.lang.System.setProperty("reset_static_fields", "true"); 
    java.lang.System.setProperty("sun.java.command", "org.evosuite.ClientProcess"); 
    java.lang.System.setProperty("junit_check", "true"); 
    java.lang.System.setProperty("evosuite.log.folder", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/tmp_2022_10_06_10_56_15/logs/org.jsoup.internal.StringUtil"); 
    java.lang.System.setProperty("minimize", "true"); 
    java.lang.System.setProperty("max_size", "100"); 
    java.lang.System.setProperty("sun.os.patch.level", "unknown"); 
    java.lang.System.setProperty("sun.cpu.endian", "little"); 
    java.lang.System.setProperty("ctg_min_time_per_job", "1"); 
    java.lang.System.setProperty("junit_suffix", "_ESTest"); 
    java.lang.System.setProperty("java.vendor.url.bug", "http://bugreport.sun.com/bugreport/"); 
    java.lang.System.setProperty("report_dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/tmp_2022_10_06_10_56_15/reports/org.jsoup.internal.StringUtil"); 
    java.lang.System.setProperty("minimization_timeout", "56"); 
    java.lang.System.setProperty("CP_file_path", "/tmp/EvoSuite_classpathFile9021710528223863190.txt"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
    java.lang.System.setProperty("inline", "true"); 
    java.lang.System.setProperty("ctg_seeds_file_out", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/tmp_2022_10_06_10_56_15/seeds/org.jsoup.internal.StringUtil.seed"); 
    java.lang.System.setProperty("TARGET_CLASS", "org.jsoup.internal.StringUtil"); 
    java.lang.System.setProperty("spawn_process_manager_port", "42977"); 
    java.lang.System.setProperty("evosuite.log.appender", "CLIENT"); 
    java.lang.System.setProperty("write_junit_timeout", "56"); 
    java.lang.System.setProperty("test_dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/tmp_2022_10_06_10_56_15/tests"); 
    java.lang.System.setProperty("search_budget", "337"); 
    java.lang.System.setProperty("plot", "false"); 
    java.lang.System.setProperty("p_object_pool", "0.3"); 
    java.lang.System.setProperty("criterion", "LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH"); 
    java.lang.System.setProperty("test_comments", "false"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StringUtil_ESTest_scaffolding.class.getClassLoader() ,
      "org.eclipse.jetty.io.ManagedSelector$SelectorProducer",
      "org.eclipse.jetty.io.EofException",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool",
      "org.eclipse.jetty.io.ManagedSelector$DumpKeys",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget$Lease",
      "org.eclipse.jetty.io.ArrayByteBufferPool",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "org.eclipse.jetty.util.thread.TimerScheduler$SimpleTask",
      "org.eclipse.jetty.util.AbstractTrie",
      "org.eclipse.jetty.util.annotation.ManagedObject",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.util.Callback",
      "org.eclipse.jetty.io.NetworkTrafficSocketChannelEndPoint",
      "org.eclipse.jetty.util.BlockingArrayQueue",
      "org.eclipse.jetty.util.InetAddressSet$SingletonInetRange",
      "org.eclipse.jetty.io.MappedByteBufferPool$Tagged",
      "org.eclipse.jetty.util.thread.TryExecutor$NoTryExecutor",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.io.WriteFlusher",
      "org.eclipse.jetty.util.TypeUtil",
      "org.eclipse.jetty.util.InetAddressSet$MinMaxInetRange",
      "org.eclipse.jetty.io.FillInterest",
      "org.eclipse.jetty.util.thread.ThreadPool",
      "org.eclipse.jetty.util.thread.Invocable",
      "org.jsoup.internal.StringUtil$StringJoiner",
      "org.eclipse.jetty.util.thread.strategy.EatWhatYouKill",
      "org.eclipse.jetty.util.statistic.CounterStatistic",
      "org.eclipse.jetty.util.log.JettyAwareLogger",
      "org.eclipse.jetty.util.InetAddressSet$CidrInetRange",
      "org.eclipse.jetty.io.MappedByteBufferPool",
      "org.eclipse.jetty.io.NullByteBufferPool",
      "org.eclipse.jetty.io.WriteFlusher$CompletingState",
      "org.eclipse.jetty.util.BufferUtil",
      "org.eclipse.jetty.util.LeakDetector",
      "org.eclipse.jetty.util.component.Destroyable",
      "org.eclipse.jetty.util.thread.TryExecutor",
      "org.eclipse.jetty.util.MemoryUtils",
      "org.eclipse.jetty.util.InetAddressSet$InetPattern",
      "org.eclipse.jetty.util.thread.ThreadPool$SizedThreadPool",
      "org.eclipse.jetty.io.AbstractEndPoint",
      "org.eclipse.jetty.util.ArrayTrie",
      "org.eclipse.jetty.util.StringUtil",
      "org.eclipse.jetty.io.ManagedSelector$SelectorUpdate",
      "org.eclipse.jetty.util.thread.Scheduler$Task",
      "org.eclipse.jetty.util.component.LifeCycle$Listener",
      "org.eclipse.jetty.util.log.Log$1",
      "org.eclipse.jetty.io.SelectorManager$AcceptListener",
      "org.eclipse.jetty.util.thread.MonitoredQueuedThreadPool",
      "org.jsoup.helper.ValidationException",
      "org.eclipse.jetty.util.component.Dumpable",
      "org.eclipse.jetty.util.LeakDetector$LeakInfo",
      "org.eclipse.jetty.io.WriteFlusher$State",
      "org.eclipse.jetty.util.resource.Resource",
      "org.eclipse.jetty.io.WriteFlusher$FailedState",
      "org.eclipse.jetty.util.Callback$1",
      "org.eclipse.jetty.io.Connection",
      "org.eclipse.jetty.io.AbstractEndPoint$State",
      "org.eclipse.jetty.util.resource.JarFileResource",
      "org.eclipse.jetty.io.AbstractEndPoint$2",
      "org.eclipse.jetty.util.InetAddressSet$LegacyInetRange",
      "org.eclipse.jetty.io.ManagedSelector$StopSelector",
      "org.eclipse.jetty.io.AbstractEndPoint$1",
      "org.jsoup.internal.StringUtil",
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "org.eclipse.jetty.util.component.Dumpable$DumpableContainer",
      "org.eclipse.jetty.util.Attributes",
      "org.eclipse.jetty.util.component.LifeCycle",
      "org.eclipse.jetty.io.EndPoint",
      "org.eclipse.jetty.io.ChannelEndPoint$2",
      "org.eclipse.jetty.util.component.AttributeContainerMap",
      "org.eclipse.jetty.util.thread.strategy.EatWhatYouKill$State",
      "org.eclipse.jetty.io.ChannelEndPoint$1",
      "org.eclipse.jetty.io.ChannelEndPoint",
      "org.eclipse.jetty.util.ModuleLocation",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Bean",
      "org.eclipse.jetty.util.thread.QueuedThreadPool$Runner",
      "org.eclipse.jetty.io.SelectorManager",
      "org.eclipse.jetty.io.ByteBufferPool$Bucket",
      "org.eclipse.jetty.util.RegexSet",
      "org.eclipse.jetty.util.Uptime$Impl",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "org.eclipse.jetty.util.component.Container",
      "org.eclipse.jetty.util.resource.BadResource",
      "org.eclipse.jetty.io.WriteFlusher$WritingState",
      "org.eclipse.jetty.util.thread.QueuedThreadPool",
      "org.eclipse.jetty.util.thread.PrivilegedThreadFactory$1",
      "org.eclipse.jetty.util.IncludeExclude",
      "org.eclipse.jetty.io.ManagedSelector$Start",
      "org.eclipse.jetty.util.thread.PrivilegedThreadFactory",
      "org.eclipse.jetty.io.WriteFlusher$Listener",
      "org.eclipse.jetty.util.Loader",
      "org.eclipse.jetty.io.ChannelEndPoint$RunnableTask",
      "org.eclipse.jetty.io.ManagedSelector$Selectable",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Managed",
      "org.eclipse.jetty.io.ManagedSelector$DestroyEndPoint",
      "org.eclipse.jetty.util.thread.ScheduledExecutorScheduler",
      "org.eclipse.jetty.util.AtomicBiInteger",
      "org.eclipse.jetty.io.ByteBufferPool",
      "org.eclipse.jetty.io.ManagedSelector$CloseConnections",
      "org.eclipse.jetty.util.resource.JarResource$1",
      "org.eclipse.jetty.io.AbstractByteBufferPool",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget$1",
      "org.eclipse.jetty.util.component.Container$Listener",
      "org.eclipse.jetty.util.thread.Invocable$InvocationType",
      "org.eclipse.jetty.io.ManagedSelector$Connect",
      "org.eclipse.jetty.util.InetAddressSet",
      "org.eclipse.jetty.io.WriteFlusher$StateType",
      "org.eclipse.jetty.util.Trie",
      "org.eclipse.jetty.io.ChannelEndPoint$3",
      "org.eclipse.jetty.io.ChannelEndPoint$RunnableCloseable",
      "org.eclipse.jetty.util.AttributesMap",
      "org.eclipse.jetty.util.Uptime",
      "org.eclipse.jetty.util.resource.PathResource",
      "org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool$1",
      "org.eclipse.jetty.util.resource.JarResource",
      "org.eclipse.jetty.util.thread.strategy.EatWhatYouKill$Mode",
      "org.eclipse.jetty.util.resource.URLResource",
      "org.eclipse.jetty.util.thread.Scheduler",
      "org.eclipse.jetty.util.resource.ResourceFactory",
      "org.eclipse.jetty.io.ManagedSelector",
      "org.eclipse.jetty.io.ManagedSelector$Acceptor",
      "org.eclipse.jetty.util.thread.TimerScheduler",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.util.MemoryUtils$1",
      "org.eclipse.jetty.io.WriteFlusher$PendingState",
      "org.jsoup.internal.StringUtil$1",
      "org.jsoup.helper.Validate",
      "org.eclipse.jetty.io.ManagedSelector$Accept",
      "org.eclipse.jetty.io.LogarithmicArrayByteBufferPool",
      "org.eclipse.jetty.io.WriteFlusher$IdleState",
      "org.eclipse.jetty.util.MathUtils",
      "org.eclipse.jetty.io.QuietException",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget$Leased",
      "org.eclipse.jetty.util.thread.ExecutionStrategy",
      "org.eclipse.jetty.util.thread.ExecutionStrategy$Producer",
      "org.eclipse.jetty.util.thread.TryExecutor$1",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget",
      "org.eclipse.jetty.io.SocketChannelEndPoint",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.io.IdleTimeout",
      "org.eclipse.jetty.util.statistic.SampleStatistic",
      "org.eclipse.jetty.util.log.Logger",
      "org.eclipse.jetty.io.ManagedSelector$CreateEndPoint",
      "org.eclipse.jetty.io.Connection$Listener",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StringUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jsoup.internal.StringUtil$1",
      "org.jsoup.internal.StringUtil",
      "org.jsoup.internal.StringUtil$StringJoiner",
      "org.jsoup.helper.Validate",
      "org.jsoup.helper.ValidationException",
      "org.eclipse.jetty.io.AbstractByteBufferPool",
      "org.eclipse.jetty.util.log.Log$1",
      "org.eclipse.jetty.util.Loader",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.util.log.JettyAwareLogger",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "org.eclipse.jetty.util.Uptime",
      "org.eclipse.jetty.io.ArrayByteBufferPool",
      "org.eclipse.jetty.io.MappedByteBufferPool",
      "org.eclipse.jetty.io.MappedByteBufferPool$Tagged",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool",
      "org.eclipse.jetty.util.LeakDetector",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool$1",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Managed",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Bean",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$1",
      "org.eclipse.jetty.util.InetAddressSet",
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "org.eclipse.jetty.util.IncludeExclude",
      "org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate",
      "org.eclipse.jetty.util.AbstractTrie",
      "org.eclipse.jetty.util.ArrayTrie",
      "org.eclipse.jetty.util.MathUtils",
      "org.eclipse.jetty.util.StringUtil",
      "org.eclipse.jetty.io.LogarithmicArrayByteBufferPool",
      "org.eclipse.jetty.io.ByteBufferPool$Bucket",
      "org.eclipse.jetty.util.thread.TryExecutor$1",
      "org.eclipse.jetty.util.thread.TryExecutor",
      "org.eclipse.jetty.util.thread.QueuedThreadPool",
      "org.eclipse.jetty.util.AtomicBiInteger",
      "org.eclipse.jetty.util.thread.QueuedThreadPool$Runner",
      "org.eclipse.jetty.io.NullByteBufferPool",
      "org.eclipse.jetty.util.RegexSet",
      "org.eclipse.jetty.util.BufferUtil",
      "org.eclipse.jetty.util.ModuleLocation",
      "org.eclipse.jetty.util.TypeUtil",
      "org.eclipse.jetty.util.InetAddressSet$InetPattern",
      "org.eclipse.jetty.util.InetAddressSet$SingletonInetRange",
      "org.eclipse.jetty.util.component.AttributeContainerMap",
      "org.eclipse.jetty.util.AttributesMap",
      "org.eclipse.jetty.io.SelectorManager",
      "org.eclipse.jetty.io.ManagedSelector",
      "org.eclipse.jetty.util.statistic.SampleStatistic",
      "org.eclipse.jetty.io.ManagedSelector$SelectorProducer",
      "org.eclipse.jetty.util.thread.strategy.EatWhatYouKill",
      "org.eclipse.jetty.util.thread.strategy.EatWhatYouKill$State",
      "org.eclipse.jetty.util.thread.TryExecutor$NoTryExecutor",
      "org.eclipse.jetty.util.thread.TimerScheduler",
      "org.eclipse.jetty.io.IdleTimeout",
      "org.eclipse.jetty.io.AbstractEndPoint",
      "org.eclipse.jetty.io.ChannelEndPoint",
      "org.eclipse.jetty.io.SocketChannelEndPoint",
      "org.eclipse.jetty.io.NetworkTrafficSocketChannelEndPoint",
      "org.eclipse.jetty.io.AbstractEndPoint$State",
      "org.eclipse.jetty.io.FillInterest",
      "org.eclipse.jetty.io.AbstractEndPoint$1",
      "org.eclipse.jetty.io.WriteFlusher$StateType",
      "org.eclipse.jetty.io.WriteFlusher$State",
      "org.eclipse.jetty.io.WriteFlusher$IdleState",
      "org.eclipse.jetty.io.WriteFlusher$WritingState",
      "org.eclipse.jetty.io.WriteFlusher$CompletingState",
      "org.eclipse.jetty.io.WriteFlusher",
      "org.eclipse.jetty.io.AbstractEndPoint$2",
      "org.eclipse.jetty.util.thread.Invocable",
      "org.eclipse.jetty.io.ChannelEndPoint$RunnableTask",
      "org.eclipse.jetty.io.ChannelEndPoint$RunnableCloseable",
      "org.eclipse.jetty.io.ChannelEndPoint$1",
      "org.eclipse.jetty.io.ChannelEndPoint$2",
      "org.eclipse.jetty.io.ChannelEndPoint$3",
      "org.eclipse.jetty.util.MemoryUtils$1",
      "org.eclipse.jetty.util.MemoryUtils",
      "org.eclipse.jetty.util.BlockingArrayQueue",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget$1",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget",
      "org.eclipse.jetty.util.thread.ScheduledExecutorScheduler",
      "org.eclipse.jetty.util.thread.MonitoredQueuedThreadPool",
      "org.eclipse.jetty.util.statistic.CounterStatistic",
      "org.eclipse.jetty.util.thread.PrivilegedThreadFactory",
      "org.eclipse.jetty.util.thread.PrivilegedThreadFactory$1"
    );
  }
}
