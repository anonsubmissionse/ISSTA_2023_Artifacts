/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 06 15:36:23 GMT 2022
 */

package org.jsoup.helper;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class CookieUtil_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jsoup.helper.CookieUtil"; 
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
    java.lang.System.setProperty("extra_timeout", "14"); 
    java.lang.System.setProperty("sun.desktop", "gnome"); 
    java.lang.System.setProperty("process_communication_port", "13897"); 
    java.lang.System.setProperty("initialization_timeout", "14"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.factory", "org.evosuite.shaded.org.dom4j.DocumentFactory"); 
    java.lang.System.setProperty("assertion_timeout", "14"); 
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
    java.lang.System.setProperty("write_pool", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/tmp_2022_10_06_10_56_15/pools/org.jsoup.helper.CookieUtil.pool"); 
    java.lang.System.setProperty("save_all_data", "false"); 
    java.lang.System.setProperty("logback.configurationFile", "logback-ctg.xml"); 
    java.lang.System.setProperty("junit_check_timeout", "14"); 
    java.lang.System.setProperty("replace_calls", "true"); 
    java.lang.System.setProperty("coverage", "true"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.DocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("ctg_schedule", "BUDGET"); 
    java.lang.System.setProperty("sun.io.unicode.encoding", "UnicodeLittle"); 
    java.lang.System.setProperty("stopping_condition", "MAXTIME"); 
    java.lang.System.setProperty("print_to_system", "false"); 
    java.lang.System.setProperty("ctg_seeds_file_in", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/evosuite-seeds/org.jsoup.helper.CookieUtil.seed"); 
    java.lang.System.setProperty("output_variables", "TARGET_CLASS,configuration_id,criterion,ctg_min_time_per_job,ctg_schedule,search_budget,p_object_pool,ctg_time_per_class,Size,Length,Total_Time,Random_Seed,LineCoverage,LineCoverageBitString,BranchCoverage,BranchCoverageBitString,ExceptionCoverage,ExceptionCoverageBitString,Explicit_MethodExceptions,Explicit_TypeExceptions,Implicit_MethodExceptions,Implicit_TypeExceptions,WeakMutationScore,WeakMutationCoverageBitString,OutputCoverage,OutputCoverageBitString,MethodCoverage,MethodCoverageBitString,MethodNoExceptionCoverage,MethodNoExceptionCoverageBitString,CBranchCoverage,CBranchCoverageBitString"); 
    java.lang.System.setProperty("global_timeout", "88"); 
    java.lang.System.setProperty("assertions", "true"); 
    java.lang.System.setProperty("log_timeout", "false"); 
    java.lang.System.setProperty("master_log_port", "38045"); 
    java.lang.System.setProperty("reset_static_fields", "true"); 
    java.lang.System.setProperty("sun.java.command", "org.evosuite.ClientProcess"); 
    java.lang.System.setProperty("junit_check", "true"); 
    java.lang.System.setProperty("evosuite.log.folder", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/tmp_2022_10_06_10_56_15/logs/org.jsoup.helper.CookieUtil"); 
    java.lang.System.setProperty("minimize", "true"); 
    java.lang.System.setProperty("max_size", "100"); 
    java.lang.System.setProperty("sun.os.patch.level", "unknown"); 
    java.lang.System.setProperty("sun.cpu.endian", "little"); 
    java.lang.System.setProperty("ctg_min_time_per_job", "1"); 
    java.lang.System.setProperty("junit_suffix", "_ESTest"); 
    java.lang.System.setProperty("java.vendor.url.bug", "http://bugreport.sun.com/bugreport/"); 
    java.lang.System.setProperty("report_dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/tmp_2022_10_06_10_56_15/reports/org.jsoup.helper.CookieUtil"); 
    java.lang.System.setProperty("minimization_timeout", "14"); 
    java.lang.System.setProperty("CP_file_path", "/tmp/EvoSuite_classpathFile3472884784943338234.txt"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
    java.lang.System.setProperty("inline", "true"); 
    java.lang.System.setProperty("ctg_seeds_file_out", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/tmp_2022_10_06_10_56_15/seeds/org.jsoup.helper.CookieUtil.seed"); 
    java.lang.System.setProperty("TARGET_CLASS", "org.jsoup.helper.CookieUtil"); 
    java.lang.System.setProperty("spawn_process_manager_port", "42977"); 
    java.lang.System.setProperty("evosuite.log.appender", "CLIENT"); 
    java.lang.System.setProperty("write_junit_timeout", "14"); 
    java.lang.System.setProperty("test_dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/tmp_2022_10_06_10_56_15/tests"); 
    java.lang.System.setProperty("search_budget", "88"); 
    java.lang.System.setProperty("plot", "false"); 
    java.lang.System.setProperty("p_object_pool", "0.3"); 
    java.lang.System.setProperty("criterion", "LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH"); 
    java.lang.System.setProperty("test_comments", "false"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CookieUtil_ESTest_scaffolding.class.getClassLoader() ,
      "org.jsoup.nodes.Document$QuirksMode",
      "org.jsoup.helper.DataUtil",
      "org.jsoup.parser.HtmlTreeBuilderState$18",
      "org.jsoup.parser.HtmlTreeBuilderState$19",
      "org.jsoup.Connection$Response",
      "org.jsoup.helper.ChangeNotifyingArrayList",
      "org.jsoup.parser.HtmlTreeBuilderState$16",
      "org.jsoup.parser.HtmlTreeBuilderState$17",
      "org.jsoup.parser.HtmlTreeBuilderState$14",
      "org.jsoup.nodes.Range",
      "org.jsoup.parser.HtmlTreeBuilderState$15",
      "org.jsoup.select.Evaluator$IndexEvaluator",
      "org.jsoup.select.Evaluator$IsOnlyOfType",
      "org.jsoup.select.Evaluator$ContainsWholeText",
      "org.eclipse.jetty.io.ManagedSelector$DumpKeys",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget$Lease",
      "org.jsoup.nodes.Entities$CoreCharset",
      "org.jsoup.nodes.Element",
      "org.jsoup.parser.HtmlTreeBuilderState$12",
      "org.jsoup.helper.HttpConnection",
      "org.jsoup.parser.HtmlTreeBuilderState$13",
      "org.jsoup.parser.HtmlTreeBuilderState$10",
      "org.eclipse.jetty.util.annotation.ManagedObject",
      "org.jsoup.parser.HtmlTreeBuilderState$11",
      "org.eclipse.jetty.util.Callback",
      "org.eclipse.jetty.io.NetworkTrafficSocketChannelEndPoint",
      "org.eclipse.jetty.util.InetAddressSet$SingletonInetRange",
      "org.jsoup.select.NodeTraversor",
      "org.eclipse.jetty.util.thread.TryExecutor$NoTryExecutor",
      "org.eclipse.jetty.util.InetAddressSet$MinMaxInetRange",
      "org.jsoup.select.Evaluator$MatchesOwn",
      "org.eclipse.jetty.util.thread.ThreadPool",
      "org.eclipse.jetty.util.thread.Invocable",
      "org.eclipse.jetty.util.thread.strategy.EatWhatYouKill",
      "org.jsoup.parser.Token$EndTag",
      "org.jsoup.helper.HttpConnection$Request",
      "org.jsoup.nodes.Document",
      "org.eclipse.jetty.io.MappedByteBufferPool",
      "org.eclipse.jetty.io.NullByteBufferPool",
      "org.eclipse.jetty.io.WriteFlusher$CompletingState",
      "org.jsoup.parser.HtmlTreeBuilder",
      "org.jsoup.nodes.FormElement",
      "org.jsoup.UnsupportedMimeTypeException",
      "org.eclipse.jetty.util.component.Destroyable",
      "org.eclipse.jetty.util.thread.TryExecutor",
      "org.eclipse.jetty.io.ConnectionStatistics$Stats",
      "org.eclipse.jetty.util.InetAddressSet$InetPattern",
      "org.eclipse.jetty.util.thread.ThreadPool$SizedThreadPool",
      "org.eclipse.jetty.io.ConnectionStatistics",
      "org.eclipse.jetty.util.StringUtil",
      "org.eclipse.jetty.util.thread.Scheduler$Task",
      "org.jsoup.nodes.EntitiesData",
      "org.eclipse.jetty.util.log.Log$1",
      "org.eclipse.jetty.util.component.StopLifeCycle",
      "org.jsoup.select.Evaluator$IndexEquals",
      "org.eclipse.jetty.util.thread.Locker$UnLock",
      "org.jsoup.parser.HtmlTreeBuilderState$25",
      "org.jsoup.parser.Token$Tag",
      "org.jsoup.nodes.XmlDeclaration",
      "org.eclipse.jetty.util.component.Dumpable",
      "org.jsoup.parser.Token$Doctype",
      "org.jsoup.select.Evaluator$TagEndsWith",
      "org.eclipse.jetty.io.WriteFlusher$State",
      "org.jsoup.helper.CookieUtil",
      "org.eclipse.jetty.util.resource.Resource",
      "org.eclipse.jetty.io.Connection",
      "org.eclipse.jetty.util.thread.Locker",
      "org.jsoup.parser.HtmlTreeBuilderState$23",
      "org.eclipse.jetty.io.AbstractEndPoint$3",
      "org.jsoup.parser.HtmlTreeBuilderState$24",
      "org.eclipse.jetty.io.AbstractEndPoint$2",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.parser.HtmlTreeBuilderState$21",
      "org.jsoup.nodes.Document$OutputSettings$Syntax",
      "org.jsoup.parser.HtmlTreeBuilderState$22",
      "org.jsoup.parser.HtmlTreeBuilderState$20",
      "org.eclipse.jetty.io.AbstractEndPoint$1",
      "org.jsoup.internal.StringUtil",
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "org.eclipse.jetty.util.thread.strategy.EatWhatYouKill$State",
      "org.eclipse.jetty.util.component.AttributeContainerMap",
      "org.eclipse.jetty.io.ByteArrayEndPoint$1",
      "org.jsoup.parser.Tokeniser",
      "org.jsoup.nodes.Comment",
      "org.jsoup.select.Evaluator$IndexGreaterThan",
      "org.jsoup.nodes.LeafNode",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Bean",
      "org.eclipse.jetty.io.SelectorManager",
      "org.eclipse.jetty.io.ByteBufferPool$Bucket",
      "org.eclipse.jetty.util.component.Container",
      "org.eclipse.jetty.util.CountingCallback",
      "org.eclipse.jetty.util.resource.BadResource",
      "org.jsoup.select.Evaluator$AttributeWithValueEnding",
      "org.eclipse.jetty.util.thread.QueuedThreadPool",
      "org.jsoup.select.Collector$FirstFinder",
      "org.eclipse.jetty.util.IncludeExclude",
      "org.eclipse.jetty.io.ManagedSelector$Start",
      "org.jsoup.helper.HttpConnection$KeyVal",
      "org.eclipse.jetty.util.Loader",
      "org.eclipse.jetty.io.IncludeExcludeConnectionStatistics$ConnectionSet",
      "org.jsoup.helper.Consumer",
      "org.eclipse.jetty.io.ManagedSelector$Selectable",
      "org.eclipse.jetty.util.thread.ScheduledExecutorScheduler",
      "org.eclipse.jetty.util.AtomicBiInteger",
      "org.eclipse.jetty.util.resource.JarResource$1",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget$1",
      "org.jsoup.nodes.Node",
      "org.eclipse.jetty.util.component.Container$Listener",
      "org.eclipse.jetty.util.thread.Invocable$InvocationType",
      "org.jsoup.helper.DataUtil$BomCharset",
      "org.jsoup.parser.HtmlTreeBuilderState",
      "org.jsoup.select.Evaluator$AttributeStarting",
      "org.eclipse.jetty.util.InetAddressSet",
      "org.jsoup.nodes.DataNode",
      "org.eclipse.jetty.util.Trie",
      "org.eclipse.jetty.io.ByteArrayEndPoint",
      "org.eclipse.jetty.io.ChannelEndPoint$RunnableCloseable",
      "org.jsoup.nodes.Attributes",
      "org.eclipse.jetty.util.AttributesMap",
      "org.eclipse.jetty.util.resource.PathResource",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool$1",
      "org.eclipse.jetty.util.resource.URLResource",
      "org.jsoup.parser.XmlTreeBuilder",
      "org.eclipse.jetty.util.resource.ResourceFactory",
      "org.eclipse.jetty.io.ManagedSelector$Acceptor",
      "org.jsoup.nodes.Document$OutputSettings",
      "org.eclipse.jetty.util.thread.TimerScheduler",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.util.thread.Locker$Lock",
      "org.jsoup.select.Evaluator$ContainsData",
      "org.jsoup.nodes.Attributes$Dataset$EntrySet",
      "org.jsoup.internal.Normalizer",
      "org.jsoup.nodes.Attributes$Dataset",
      "org.jsoup.helper.Validate",
      "org.jsoup.internal.StringUtil$1",
      "org.eclipse.jetty.io.ManagedSelector$Accept",
      "org.eclipse.jetty.io.LogarithmicArrayByteBufferPool",
      "org.jsoup.parser.Tokeniser$1",
      "org.eclipse.jetty.util.MathUtils",
      "org.eclipse.jetty.io.QuietException",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget$Leased",
      "org.eclipse.jetty.util.thread.ExecutionStrategy",
      "org.eclipse.jetty.util.thread.TryExecutor$1",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.io.IdleTimeout",
      "org.jsoup.select.Evaluator$CssNthEvaluator",
      "org.eclipse.jetty.util.statistic.SampleStatistic",
      "org.jsoup.parser.Token$Comment",
      "org.eclipse.jetty.util.log.Logger",
      "org.eclipse.jetty.io.ManagedSelector$CreateEndPoint",
      "org.jsoup.select.Evaluator$IsFirstOfType",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$1",
      "org.jsoup.nodes.Element$NodeList",
      "org.jsoup.parser.TokeniserState$56",
      "org.jsoup.parser.TokeniserState$57",
      "org.eclipse.jetty.util.Callback$Completing",
      "org.jsoup.parser.TokeniserState$58",
      "org.jsoup.parser.TokeniserState$59",
      "org.jsoup.parser.TokeniserState$52",
      "org.eclipse.jetty.io.ManagedSelector$SelectorProducer",
      "org.jsoup.parser.TokeniserState$53",
      "org.jsoup.parser.TreeBuilder",
      "org.jsoup.parser.TokeniserState$54",
      "org.jsoup.parser.TokeniserState$55",
      "org.jsoup.nodes.PseudoTextElement",
      "org.jsoup.parser.TokeniserState$50",
      "org.jsoup.parser.TokeniserState$51",
      "org.eclipse.jetty.io.EofException",
      "org.jsoup.parser.Parser",
      "org.jsoup.select.Evaluator$IsEmpty",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool",
      "org.eclipse.jetty.io.ArrayByteBufferPool",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "org.jsoup.select.Evaluator$AttributeWithValueMatching",
      "org.eclipse.jetty.util.thread.TimerScheduler$SimpleTask",
      "org.jsoup.nodes.Range$Position",
      "org.jsoup.select.Evaluator$IsNthChild",
      "org.eclipse.jetty.util.AbstractTrie",
      "org.jsoup.parser.HtmlTreeBuilderState$Constants",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.util.BlockingArrayQueue",
      "org.jsoup.select.Evaluator$Class",
      "org.jsoup.parser.TokeniserState$67",
      "org.jsoup.parser.TokeniserState$63",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.jsoup.parser.TokeniserState$64",
      "org.eclipse.jetty.io.WriteFlusher",
      "org.jsoup.parser.TokeniserState$65",
      "org.jsoup.parser.Token",
      "org.jsoup.parser.TokeniserState$66",
      "org.eclipse.jetty.io.FillInterest",
      "org.jsoup.parser.TokeniserState$60",
      "org.jsoup.select.Evaluator$AttributeKeyPair",
      "org.jsoup.parser.TokeniserState$61",
      "org.jsoup.select.Evaluator$ContainsWholeOwnText",
      "org.jsoup.parser.TokeniserState$62",
      "org.jsoup.select.Evaluator$IsNthLastOfType",
      "org.jsoup.parser.Token$Character",
      "org.jsoup.parser.Tag",
      "org.jsoup.select.Evaluator$IsLastOfType",
      "org.jsoup.select.Evaluator$Attribute",
      "org.jsoup.internal.StringUtil$StringJoiner",
      "org.jsoup.select.NodeFilter$FilterResult",
      "org.eclipse.jetty.util.statistic.CounterStatistic",
      "org.eclipse.jetty.util.log.JettyAwareLogger",
      "org.jsoup.Connection$KeyVal",
      "org.eclipse.jetty.util.InetAddressSet$CidrInetRange",
      "org.jsoup.nodes.Entities",
      "org.jsoup.select.Evaluator$AttributeWithValueContaining",
      "org.jsoup.select.Elements",
      "org.jsoup.parser.Token$CData",
      "org.eclipse.jetty.io.IncludeExcludeConnectionStatistics",
      "org.eclipse.jetty.util.BufferUtil",
      "org.jsoup.select.Evaluator$AllElements",
      "org.eclipse.jetty.util.LeakDetector",
      "org.eclipse.jetty.util.MemoryUtils",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.select.Evaluator$AttributeWithValue",
      "org.jsoup.select.Evaluator$AttributeWithValueNot",
      "org.eclipse.jetty.util.Callback$Nested",
      "org.jsoup.parser.ParseErrorList",
      "org.eclipse.jetty.io.AbstractEndPoint",
      "org.eclipse.jetty.util.ArrayTrie",
      "org.eclipse.jetty.io.ManagedSelector$SelectorUpdate",
      "org.jsoup.SerializationException",
      "org.jsoup.select.Evaluator$ContainsText",
      "org.jsoup.Connection$Base",
      "org.eclipse.jetty.util.component.LifeCycle$Listener",
      "org.jsoup.select.Evaluator$Id",
      "org.jsoup.select.Evaluator$IsNthOfType",
      "org.eclipse.jetty.io.SelectorManager$AcceptListener",
      "org.jsoup.select.Collector",
      "org.jsoup.select.Collector$Accumulator",
      "org.eclipse.jetty.util.thread.MonitoredQueuedThreadPool",
      "org.jsoup.helper.ValidationException",
      "org.jsoup.nodes.Attributes$Dataset$DatasetIterator",
      "org.jsoup.parser.XmlTreeBuilder$1",
      "org.eclipse.jetty.util.LeakDetector$LeakInfo",
      "org.jsoup.internal.ConstrainableInputStream",
      "org.jsoup.parser.CharacterReader",
      "org.eclipse.jetty.io.WriteFlusher$FailedState",
      "org.eclipse.jetty.util.Callback$1",
      "org.jsoup.select.Evaluator$IsFirstChild",
      "org.eclipse.jetty.io.AbstractEndPoint$State",
      "org.eclipse.jetty.util.Callback$2",
      "org.eclipse.jetty.util.resource.JarFileResource",
      "org.eclipse.jetty.util.InetAddressSet$LegacyInetRange",
      "org.eclipse.jetty.io.ManagedSelector$StopSelector",
      "org.jsoup.helper.HttpConnection$Response",
      "org.jsoup.select.NodeVisitor",
      "org.jsoup.parser.TokeniserState$2",
      "org.jsoup.parser.TokeniserState$12",
      "org.jsoup.nodes.Attributes$1",
      "org.jsoup.parser.TokeniserState$1",
      "org.jsoup.parser.TokeniserState$13",
      "org.jsoup.parser.TokeniserState$14",
      "org.eclipse.jetty.util.component.Dumpable$DumpableContainer",
      "org.jsoup.parser.TokeniserState$15",
      "org.eclipse.jetty.util.Attributes",
      "org.eclipse.jetty.util.component.LifeCycle",
      "org.eclipse.jetty.io.EndPoint",
      "org.eclipse.jetty.io.ChannelEndPoint$2",
      "org.eclipse.jetty.io.ChannelEndPoint$1",
      "org.jsoup.parser.Token$StartTag",
      "org.jsoup.select.Evaluator$AttributeWithValueStarting",
      "org.jsoup.parser.Token$EOF",
      "org.jsoup.parser.TokeniserState$10",
      "org.jsoup.parser.TokeniserState$11",
      "org.jsoup.nodes.DocumentType",
      "org.eclipse.jetty.io.ChannelEndPoint",
      "org.jsoup.parser.TokeniserState$9",
      "org.jsoup.Connection$Request",
      "org.jsoup.parser.TokeniserState$8",
      "org.jsoup.parser.TokeniserState$7",
      "org.jsoup.parser.TokeniserState$6",
      "org.eclipse.jetty.util.thread.QueuedThreadPool$Runner",
      "org.jsoup.HttpStatusException",
      "org.jsoup.parser.TokeniserState$5",
      "org.jsoup.parser.TokeniserState$4",
      "org.jsoup.select.Evaluator$MatchesWholeText",
      "org.jsoup.parser.TokeniserState$3",
      "org.eclipse.jetty.util.RegexSet",
      "org.eclipse.jetty.util.Uptime$Impl",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "org.jsoup.nodes.NodeUtils",
      "org.jsoup.select.Evaluator$Matches",
      "org.eclipse.jetty.io.WriteFlusher$WritingState",
      "org.jsoup.select.Evaluator$IsOnlyChild",
      "org.eclipse.jetty.util.thread.PrivilegedThreadFactory$1",
      "org.jsoup.parser.TokeniserState$16",
      "org.eclipse.jetty.io.RuntimeIOException",
      "org.eclipse.jetty.util.thread.PrivilegedThreadFactory",
      "org.jsoup.parser.TokeniserState$17",
      "org.jsoup.parser.TokeniserState$18",
      "org.jsoup.parser.TokeniserState$19",
      "org.eclipse.jetty.io.WriteFlusher$Listener",
      "org.jsoup.parser.TokeniserState$23",
      "org.jsoup.Connection$Method",
      "org.jsoup.UncheckedIOException",
      "org.jsoup.parser.TokeniserState$24",
      "org.jsoup.parser.TokeniserState$25",
      "org.jsoup.parser.TokeniserState$26",
      "org.eclipse.jetty.io.ChannelEndPoint$RunnableTask",
      "org.jsoup.parser.TokeniserState$20",
      "org.jsoup.helper.HttpConnection$Base",
      "org.jsoup.parser.TokeniserState$21",
      "org.jsoup.parser.TokeniserState$22",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Managed",
      "org.eclipse.jetty.io.ManagedSelector$DestroyEndPoint",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.select.NodeFilter",
      "org.eclipse.jetty.io.ManagedSelector$CloseConnections",
      "org.eclipse.jetty.io.ByteBufferPool",
      "org.jsoup.select.Evaluator$MatchesWholeOwnText",
      "org.eclipse.jetty.io.AbstractByteBufferPool",
      "org.eclipse.jetty.io.ManagedSelector$Connect",
      "org.eclipse.jetty.io.WriteFlusher$StateType",
      "org.jsoup.select.Evaluator$ContainsOwnText",
      "org.eclipse.jetty.io.ChannelEndPoint$3",
      "org.jsoup.parser.TokeniserState$27",
      "org.jsoup.parser.TokeniserState",
      "org.jsoup.parser.TokeniserState$28",
      "org.jsoup.parser.TokeniserState$29",
      "org.jsoup.parser.TokeniserState$34",
      "org.jsoup.select.Evaluator$IndexLessThan",
      "org.jsoup.parser.TokeniserState$35",
      "org.eclipse.jetty.util.Uptime",
      "org.jsoup.parser.TokeniserState$36",
      "org.jsoup.parser.TokeniserState$37",
      "org.jsoup.parser.TokeniserState$30",
      "org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate",
      "org.jsoup.parser.TokeniserState$31",
      "org.eclipse.jetty.util.resource.JarResource",
      "org.eclipse.jetty.util.thread.strategy.EatWhatYouKill$Mode",
      "org.jsoup.parser.TokeniserState$32",
      "org.eclipse.jetty.util.thread.Scheduler",
      "org.jsoup.parser.TokeniserState$33",
      "org.jsoup.nodes.Entities$EscapeMode",
      "org.jsoup.select.Evaluator$MatchText",
      "org.eclipse.jetty.io.ManagedSelector",
      "org.jsoup.select.Evaluator",
      "org.jsoup.Connection",
      "org.eclipse.jetty.util.MemoryUtils$1",
      "org.jsoup.select.Evaluator$IsRoot",
      "org.eclipse.jetty.util.Callback$Completable",
      "org.jsoup.parser.TokeniserState$38",
      "org.jsoup.parser.TokeniserState$39",
      "org.jsoup.nodes.CDataNode",
      "org.jsoup.parser.TokeniserState$45",
      "org.jsoup.parser.TokeniserState$46",
      "org.eclipse.jetty.io.WriteFlusher$PendingState",
      "org.jsoup.parser.TokeniserState$47",
      "org.jsoup.parser.TokeniserState$48",
      "org.jsoup.select.Evaluator$IsLastChild",
      "org.jsoup.parser.TokeniserState$41",
      "org.eclipse.jetty.io.WriteFlusher$IdleState",
      "org.jsoup.select.Evaluator$IsNthLastChild",
      "org.jsoup.parser.TokeniserState$42",
      "org.jsoup.parser.TokeniserState$43",
      "org.jsoup.parser.TokeniserState$44",
      "org.jsoup.parser.TokeniserState$40",
      "org.eclipse.jetty.util.thread.ExecutionStrategy$Producer",
      "org.jsoup.parser.Token$TokenType",
      "org.jsoup.parser.HtmlTreeBuilderState$2",
      "org.jsoup.parser.HtmlTreeBuilderState$1",
      "org.eclipse.jetty.io.SocketChannelEndPoint",
      "org.jsoup.parser.HtmlTreeBuilderState$4",
      "org.jsoup.nodes.Attribute",
      "org.jsoup.parser.HtmlTreeBuilderState$3",
      "org.jsoup.parser.HtmlTreeBuilderState$9",
      "org.jsoup.parser.TokeniserState$49",
      "org.jsoup.parser.HtmlTreeBuilderState$6",
      "org.jsoup.parser.HtmlTreeBuilderState$5",
      "org.jsoup.parser.HtmlTreeBuilderState$8",
      "org.eclipse.jetty.io.Connection$Listener",
      "org.jsoup.parser.HtmlTreeBuilderState$7"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.net.HttpURLConnection", false, CookieUtil_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.net.URLStreamHandler", false, CookieUtil_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CookieUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jsoup.helper.CookieUtil",
      "org.jsoup.helper.HttpConnection$Base",
      "org.jsoup.helper.HttpConnection$Request",
      "org.jsoup.helper.DataUtil",
      "org.jsoup.helper.Validate",
      "org.jsoup.helper.HttpConnection",
      "org.jsoup.parser.Parser",
      "org.jsoup.parser.TreeBuilder",
      "org.jsoup.parser.HtmlTreeBuilder",
      "org.jsoup.parser.Token",
      "org.jsoup.parser.Token$Tag",
      "org.jsoup.parser.Token$StartTag",
      "org.jsoup.parser.Token$TokenType",
      "org.jsoup.parser.Token$EndTag",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.parser.ParseErrorList",
      "org.jsoup.parser.XmlTreeBuilder",
      "org.jsoup.internal.StringUtil$1",
      "org.jsoup.internal.StringUtil",
      "org.jsoup.helper.HttpConnection$KeyVal",
      "org.jsoup.helper.ValidationException",
      "org.jsoup.internal.Normalizer",
      "org.jsoup.nodes.Document$OutputSettings$Syntax",
      "org.jsoup.nodes.Node",
      "org.jsoup.nodes.Attributes",
      "org.jsoup.nodes.Element",
      "org.jsoup.select.Evaluator",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.nodes.Document",
      "org.jsoup.parser.Tag",
      "org.jsoup.nodes.Document$OutputSettings",
      "org.jsoup.nodes.EntitiesData",
      "org.jsoup.nodes.Entities",
      "org.jsoup.parser.CharacterReader",
      "org.jsoup.nodes.Entities$EscapeMode",
      "org.jsoup.nodes.Document$QuirksMode",
      "org.jsoup.nodes.PseudoTextElement",
      "org.jsoup.nodes.LeafNode",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.nodes.CDataNode",
      "org.eclipse.jetty.util.log.Log$1",
      "org.eclipse.jetty.util.Loader",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.util.log.JettyAwareLogger",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "org.eclipse.jetty.util.Uptime",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "org.eclipse.jetty.io.SelectorManager",
      "org.eclipse.jetty.io.ManagedSelector",
      "org.eclipse.jetty.util.statistic.SampleStatistic",
      "org.eclipse.jetty.io.ManagedSelector$SelectorProducer",
      "org.eclipse.jetty.util.thread.strategy.EatWhatYouKill",
      "org.eclipse.jetty.util.thread.strategy.EatWhatYouKill$State",
      "org.eclipse.jetty.util.thread.TryExecutor$1",
      "org.eclipse.jetty.util.thread.TryExecutor",
      "org.eclipse.jetty.util.thread.TryExecutor$NoTryExecutor",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Managed",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Bean",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$1",
      "org.jsoup.nodes.NodeUtils",
      "org.jsoup.helper.ChangeNotifyingArrayList",
      "org.jsoup.nodes.Element$NodeList",
      "org.jsoup.parser.Tokeniser",
      "org.jsoup.parser.TokeniserState",
      "org.jsoup.parser.Token$Character",
      "org.jsoup.parser.Token$Doctype",
      "org.jsoup.parser.Token$Comment",
      "org.jsoup.parser.HtmlTreeBuilderState$7",
      "org.jsoup.parser.HtmlTreeBuilderState",
      "org.jsoup.parser.Token$EOF",
      "org.jsoup.parser.HtmlTreeBuilderState$25",
      "org.jsoup.nodes.Attributes$Dataset",
      "org.jsoup.nodes.Attributes$Dataset$EntrySet",
      "org.jsoup.nodes.Attributes$Dataset$DatasetIterator",
      "org.jsoup.nodes.Attributes$1",
      "org.jsoup.nodes.Attribute",
      "org.eclipse.jetty.util.component.AttributeContainerMap",
      "org.jsoup.parser.Tokeniser$1",
      "org.eclipse.jetty.io.NullByteBufferPool",
      "org.jsoup.internal.StringUtil$StringJoiner",
      "org.jsoup.parser.XmlTreeBuilder$1",
      "org.jsoup.helper.HttpConnection$Response",
      "org.eclipse.jetty.io.IdleTimeout",
      "org.eclipse.jetty.io.AbstractEndPoint",
      "org.eclipse.jetty.util.BufferUtil",
      "org.eclipse.jetty.io.ByteArrayEndPoint",
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
      "org.eclipse.jetty.io.ByteArrayEndPoint$1",
      "org.eclipse.jetty.util.thread.Locker",
      "org.eclipse.jetty.util.thread.Locker$Lock",
      "org.eclipse.jetty.io.AbstractEndPoint$3",
      "org.eclipse.jetty.io.ChannelEndPoint",
      "org.eclipse.jetty.io.SocketChannelEndPoint",
      "org.eclipse.jetty.io.NetworkTrafficSocketChannelEndPoint",
      "org.eclipse.jetty.util.thread.ScheduledExecutorScheduler",
      "org.eclipse.jetty.util.AbstractTrie",
      "org.eclipse.jetty.util.ArrayTrie",
      "org.eclipse.jetty.util.MathUtils",
      "org.eclipse.jetty.util.StringUtil",
      "org.eclipse.jetty.util.thread.TimerScheduler",
      "org.eclipse.jetty.util.AttributesMap",
      "org.jsoup.nodes.FormElement",
      "org.jsoup.select.Elements",
      "org.eclipse.jetty.io.AbstractByteBufferPool",
      "org.eclipse.jetty.io.MappedByteBufferPool",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool",
      "org.eclipse.jetty.util.LeakDetector",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool$1",
      "org.eclipse.jetty.util.RegexSet",
      "org.eclipse.jetty.util.InetAddressSet",
      "org.jsoup.nodes.XmlDeclaration",
      "org.eclipse.jetty.util.thread.QueuedThreadPool",
      "org.eclipse.jetty.util.AtomicBiInteger",
      "org.eclipse.jetty.util.thread.QueuedThreadPool$Runner",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget$1",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget",
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "org.eclipse.jetty.io.IncludeExcludeConnectionStatistics$ConnectionSet",
      "org.eclipse.jetty.util.thread.Invocable",
      "org.eclipse.jetty.io.ChannelEndPoint$RunnableTask",
      "org.eclipse.jetty.io.ChannelEndPoint$RunnableCloseable",
      "org.eclipse.jetty.io.ChannelEndPoint$1",
      "org.eclipse.jetty.io.ChannelEndPoint$2",
      "org.eclipse.jetty.io.ChannelEndPoint$3",
      "org.eclipse.jetty.util.MemoryUtils$1",
      "org.eclipse.jetty.util.MemoryUtils",
      "org.eclipse.jetty.util.BlockingArrayQueue",
      "org.eclipse.jetty.util.component.StopLifeCycle",
      "org.jsoup.select.Collector",
      "org.jsoup.select.Collector$Accumulator",
      "org.jsoup.select.NodeTraversor",
      "org.eclipse.jetty.io.ArrayByteBufferPool",
      "org.eclipse.jetty.io.LogarithmicArrayByteBufferPool",
      "org.eclipse.jetty.io.ByteBufferPool$Bucket",
      "org.eclipse.jetty.util.thread.MonitoredQueuedThreadPool",
      "org.eclipse.jetty.util.statistic.CounterStatistic",
      "org.eclipse.jetty.util.thread.PrivilegedThreadFactory",
      "org.eclipse.jetty.util.thread.PrivilegedThreadFactory$1",
      "org.jsoup.nodes.Comment",
      "org.eclipse.jetty.util.IncludeExclude",
      "org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate",
      "org.eclipse.jetty.util.Callback$1",
      "org.eclipse.jetty.util.Callback",
      "org.eclipse.jetty.util.thread.Invocable$InvocationType",
      "org.eclipse.jetty.util.Callback$2",
      "org.eclipse.jetty.util.Callback$Completing",
      "org.eclipse.jetty.util.Callback$Nested",
      "org.eclipse.jetty.util.CountingCallback",
      "org.jsoup.parser.HtmlTreeBuilderState$Constants",
      "org.jsoup.Connection$Method"
    );
  }
}
