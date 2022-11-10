/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 06 15:33:03 GMT 2022
 */

package org.jsoup.parser;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class XmlTreeBuilder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jsoup.parser.XmlTreeBuilder"; 
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
    java.lang.System.setProperty("extra_timeout", "25"); 
    java.lang.System.setProperty("sun.desktop", "gnome"); 
    java.lang.System.setProperty("process_communication_port", "7054"); 
    java.lang.System.setProperty("initialization_timeout", "25"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.factory", "org.evosuite.shaded.org.dom4j.DocumentFactory"); 
    java.lang.System.setProperty("assertion_timeout", "25"); 
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
    java.lang.System.setProperty("write_pool", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/tmp_2022_10_06_10_56_15/pools/org.jsoup.parser.XmlTreeBuilder.pool"); 
    java.lang.System.setProperty("save_all_data", "false"); 
    java.lang.System.setProperty("logback.configurationFile", "logback-ctg.xml"); 
    java.lang.System.setProperty("junit_check_timeout", "25"); 
    java.lang.System.setProperty("replace_calls", "true"); 
    java.lang.System.setProperty("coverage", "true"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.DocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("ctg_schedule", "BUDGET"); 
    java.lang.System.setProperty("sun.io.unicode.encoding", "UnicodeLittle"); 
    java.lang.System.setProperty("stopping_condition", "MAXTIME"); 
    java.lang.System.setProperty("print_to_system", "false"); 
    java.lang.System.setProperty("ctg_seeds_file_in", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/evosuite-seeds/org.jsoup.parser.XmlTreeBuilder.seed"); 
    java.lang.System.setProperty("output_variables", "TARGET_CLASS,configuration_id,criterion,ctg_min_time_per_job,ctg_schedule,search_budget,p_object_pool,ctg_time_per_class,Size,Length,Total_Time,Random_Seed,LineCoverage,LineCoverageBitString,BranchCoverage,BranchCoverageBitString,ExceptionCoverage,ExceptionCoverageBitString,Explicit_MethodExceptions,Explicit_TypeExceptions,Implicit_MethodExceptions,Implicit_TypeExceptions,WeakMutationScore,WeakMutationCoverageBitString,OutputCoverage,OutputCoverageBitString,MethodCoverage,MethodCoverageBitString,MethodNoExceptionCoverage,MethodNoExceptionCoverageBitString,CBranchCoverage,CBranchCoverageBitString"); 
    java.lang.System.setProperty("global_timeout", "160"); 
    java.lang.System.setProperty("assertions", "true"); 
    java.lang.System.setProperty("log_timeout", "false"); 
    java.lang.System.setProperty("master_log_port", "38859"); 
    java.lang.System.setProperty("reset_static_fields", "true"); 
    java.lang.System.setProperty("sun.java.command", "org.evosuite.ClientProcess"); 
    java.lang.System.setProperty("junit_check", "true"); 
    java.lang.System.setProperty("evosuite.log.folder", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/tmp_2022_10_06_10_56_15/logs/org.jsoup.parser.XmlTreeBuilder"); 
    java.lang.System.setProperty("minimize", "true"); 
    java.lang.System.setProperty("max_size", "100"); 
    java.lang.System.setProperty("sun.os.patch.level", "unknown"); 
    java.lang.System.setProperty("sun.cpu.endian", "little"); 
    java.lang.System.setProperty("ctg_min_time_per_job", "1"); 
    java.lang.System.setProperty("junit_suffix", "_ESTest"); 
    java.lang.System.setProperty("java.vendor.url.bug", "http://bugreport.sun.com/bugreport/"); 
    java.lang.System.setProperty("report_dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/tmp_2022_10_06_10_56_15/reports/org.jsoup.parser.XmlTreeBuilder"); 
    java.lang.System.setProperty("minimization_timeout", "25"); 
    java.lang.System.setProperty("CP_file_path", "/tmp/EvoSuite_classpathFile4202070126851924688.txt"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
    java.lang.System.setProperty("inline", "true"); 
    java.lang.System.setProperty("ctg_seeds_file_out", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/tmp_2022_10_06_10_56_15/seeds/org.jsoup.parser.XmlTreeBuilder.seed"); 
    java.lang.System.setProperty("TARGET_CLASS", "org.jsoup.parser.XmlTreeBuilder"); 
    java.lang.System.setProperty("spawn_process_manager_port", "42977"); 
    java.lang.System.setProperty("evosuite.log.appender", "CLIENT"); 
    java.lang.System.setProperty("write_junit_timeout", "25"); 
    java.lang.System.setProperty("test_dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/jsoup/.evosuite/tmp_2022_10_06_10_56_15/tests"); 
    java.lang.System.setProperty("search_budget", "160"); 
    java.lang.System.setProperty("plot", "false"); 
    java.lang.System.setProperty("p_object_pool", "0.3"); 
    java.lang.System.setProperty("criterion", "LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH"); 
    java.lang.System.setProperty("test_comments", "false"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(XmlTreeBuilder_ESTest_scaffolding.class.getClassLoader() ,
      "org.jsoup.nodes.Document$QuirksMode",
      "org.jsoup.helper.DataUtil",
      "org.jsoup.parser.HtmlTreeBuilderState$18",
      "org.jsoup.select.StructuralEvaluator$ImmediateParent",
      "org.jsoup.parser.HtmlTreeBuilderState$19",
      "org.jsoup.helper.ChangeNotifyingArrayList",
      "org.jsoup.parser.HtmlTreeBuilderState$16",
      "org.jsoup.Connection$Response",
      "org.jsoup.parser.HtmlTreeBuilderState$17",
      "org.jsoup.parser.HtmlTreeBuilderState$14",
      "org.jsoup.nodes.Range",
      "org.jsoup.parser.HtmlTreeBuilderState$15",
      "org.jsoup.select.Evaluator$IndexEvaluator",
      "org.jsoup.select.Evaluator$IsOnlyOfType",
      "org.jsoup.select.Evaluator$ContainsWholeText",
      "org.jsoup.nodes.Entities$CoreCharset",
      "org.jsoup.nodes.Element",
      "org.jsoup.parser.HtmlTreeBuilderState$12",
      "org.jsoup.parser.HtmlTreeBuilderState$13",
      "org.jsoup.helper.HttpConnection",
      "org.jsoup.parser.HtmlTreeBuilderState$10",
      "org.jsoup.parser.HtmlTreeBuilderState$11",
      "org.eclipse.jetty.util.annotation.ManagedObject",
      "org.eclipse.jetty.util.InetAddressSet$SingletonInetRange",
      "org.jsoup.select.NodeTraversor",
      "org.eclipse.jetty.util.InetAddressSet$MinMaxInetRange",
      "org.jsoup.select.Evaluator$MatchesOwn",
      "org.jsoup.select.CombiningEvaluator$And",
      "org.jsoup.parser.Token$EndTag",
      "org.jsoup.helper.HttpConnection$Request",
      "org.jsoup.nodes.Document",
      "org.eclipse.jetty.io.MappedByteBufferPool",
      "org.jsoup.Jsoup",
      "org.jsoup.parser.HtmlTreeBuilder",
      "org.jsoup.nodes.FormElement",
      "org.jsoup.UnsupportedMimeTypeException",
      "org.jsoup.select.StructuralEvaluator",
      "org.eclipse.jetty.util.component.Destroyable",
      "org.eclipse.jetty.util.InetAddressSet$InetPattern",
      "org.jsoup.nodes.EntitiesData",
      "org.eclipse.jetty.util.log.Log$1",
      "org.jsoup.select.Evaluator$IndexEquals",
      "org.jsoup.select.Selector$SelectorParseException",
      "org.jsoup.parser.HtmlTreeBuilderState$25",
      "org.jsoup.parser.Token$Tag",
      "org.jsoup.nodes.XmlDeclaration",
      "org.eclipse.jetty.util.component.Dumpable",
      "org.jsoup.parser.Token$Doctype",
      "org.jsoup.select.Evaluator$TagEndsWith",
      "org.jsoup.parser.HtmlTreeBuilderState$23",
      "org.jsoup.parser.HtmlTreeBuilderState$24",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.parser.HtmlTreeBuilderState$21",
      "org.jsoup.nodes.Document$OutputSettings$Syntax",
      "org.jsoup.parser.HtmlTreeBuilderState$22",
      "org.jsoup.parser.HtmlTreeBuilderState$20",
      "org.jsoup.internal.StringUtil",
      "org.eclipse.jetty.util.component.AttributeContainerMap",
      "org.jsoup.parser.Tokeniser",
      "org.jsoup.nodes.Comment",
      "org.jsoup.select.Evaluator$IndexGreaterThan",
      "org.jsoup.nodes.LeafNode",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Bean",
      "org.eclipse.jetty.io.ByteBufferPool$Bucket",
      "org.eclipse.jetty.util.component.Container",
      "org.jsoup.select.Selector",
      "org.jsoup.select.Evaluator$AttributeWithValueEnding",
      "org.jsoup.select.Collector$FirstFinder",
      "org.jsoup.select.StructuralEvaluator$ImmediatePreviousSibling",
      "org.jsoup.helper.HttpConnection$KeyVal",
      "org.eclipse.jetty.util.Loader",
      "org.jsoup.helper.Consumer",
      "org.jsoup.nodes.Node",
      "org.eclipse.jetty.util.component.Container$Listener",
      "org.jsoup.parser.HtmlTreeBuilderState",
      "org.jsoup.helper.DataUtil$BomCharset",
      "org.jsoup.select.Evaluator$AttributeStarting",
      "org.eclipse.jetty.util.InetAddressSet",
      "org.jsoup.nodes.DataNode",
      "org.jsoup.nodes.Attributes",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool$1",
      "org.jsoup.helper.W3CDom",
      "org.jsoup.parser.XmlTreeBuilder",
      "org.jsoup.nodes.Document$OutputSettings",
      "org.jsoup.select.CombiningEvaluator",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.jsoup.select.Evaluator$ContainsData",
      "org.eclipse.jetty.util.HttpCookieStore",
      "org.jsoup.internal.Normalizer",
      "org.jsoup.nodes.Attributes$Dataset",
      "org.jsoup.helper.Validate",
      "org.jsoup.internal.StringUtil$1",
      "org.jsoup.parser.Tokeniser$1",
      "org.eclipse.jetty.util.log.Log",
      "org.jsoup.select.Evaluator$CssNthEvaluator",
      "org.jsoup.parser.Token$Comment",
      "org.eclipse.jetty.util.log.Logger",
      "org.jsoup.select.Evaluator$IsFirstOfType",
      "org.jsoup.nodes.Element$NodeList",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$1",
      "org.jsoup.parser.TokeniserState$56",
      "org.jsoup.parser.TokeniserState$57",
      "org.jsoup.parser.ParseError",
      "org.jsoup.parser.TokeniserState$58",
      "org.jsoup.safety.Safelist",
      "org.jsoup.parser.TokeniserState$59",
      "org.jsoup.parser.TokeniserState$52",
      "org.jsoup.parser.TokeniserState$53",
      "org.jsoup.parser.TreeBuilder",
      "org.jsoup.parser.TokeniserState$54",
      "org.jsoup.parser.TokeniserState$55",
      "org.jsoup.nodes.PseudoTextElement",
      "org.jsoup.parser.TokeniserState$50",
      "org.jsoup.parser.TokeniserState$51",
      "org.jsoup.parser.Parser",
      "org.jsoup.select.Evaluator$IsEmpty",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "org.jsoup.select.Evaluator$AttributeWithValueMatching",
      "org.jsoup.nodes.Range$Position",
      "org.jsoup.select.Evaluator$IsNthChild",
      "org.jsoup.parser.HtmlTreeBuilderState$Constants",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.jsoup.select.Evaluator$Class",
      "org.jsoup.parser.TokeniserState$67",
      "org.jsoup.select.StructuralEvaluator$Has",
      "org.jsoup.parser.TokeniserState$63",
      "org.jsoup.nodes.Node$OuterHtmlVisitor",
      "org.jsoup.parser.TokeniserState$64",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.jsoup.parser.TokeniserState$65",
      "org.jsoup.parser.Token",
      "org.jsoup.parser.TokeniserState$66",
      "org.jsoup.parser.TokeniserState$60",
      "org.jsoup.select.Evaluator$AttributeKeyPair",
      "org.jsoup.parser.TokeniserState$61",
      "org.jsoup.parser.TokeniserState$62",
      "org.jsoup.select.Evaluator$ContainsWholeOwnText",
      "org.jsoup.select.Evaluator$IsNthLastOfType",
      "org.jsoup.parser.Token$Character",
      "org.jsoup.parser.Tag",
      "org.jsoup.select.Evaluator$IsLastOfType",
      "org.jsoup.select.Evaluator$Attribute",
      "org.jsoup.select.NodeFilter$FilterResult",
      "org.eclipse.jetty.util.log.JettyAwareLogger",
      "org.jsoup.Connection$KeyVal",
      "org.eclipse.jetty.util.InetAddressSet$CidrInetRange",
      "org.jsoup.nodes.Entities",
      "org.jsoup.select.Evaluator$AttributeWithValueContaining",
      "org.jsoup.parser.Token$CData",
      "org.jsoup.select.Elements",
      "org.jsoup.select.Evaluator$AllElements",
      "org.jsoup.nodes.Element$1",
      "org.eclipse.jetty.util.LeakDetector",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.select.Evaluator$AttributeWithValue",
      "org.jsoup.select.Evaluator$AttributeWithValueNot",
      "org.jsoup.parser.ParseErrorList",
      "org.jsoup.SerializationException",
      "org.jsoup.select.CombiningEvaluator$Or",
      "org.jsoup.select.Evaluator$ContainsText",
      "org.jsoup.Connection$Base",
      "org.eclipse.jetty.util.component.LifeCycle$Listener",
      "org.jsoup.select.Evaluator$Id",
      "org.jsoup.select.Evaluator$IsNthOfType",
      "org.jsoup.select.StructuralEvaluator$PreviousSibling",
      "org.jsoup.select.Collector",
      "org.jsoup.select.Collector$Accumulator",
      "org.jsoup.helper.ValidationException",
      "org.jsoup.select.StructuralEvaluator$Not",
      "org.jsoup.parser.XmlTreeBuilder$1",
      "org.eclipse.jetty.util.LeakDetector$LeakInfo",
      "org.jsoup.internal.ConstrainableInputStream",
      "org.jsoup.parser.CharacterReader",
      "org.jsoup.select.Evaluator$IsFirstChild",
      "org.eclipse.jetty.util.InetAddressSet$LegacyInetRange",
      "org.jsoup.select.StructuralEvaluator$Root",
      "org.jsoup.helper.HttpConnection$Response",
      "org.jsoup.select.NodeVisitor",
      "org.jsoup.parser.TokeniserState$2",
      "org.jsoup.parser.TokeniserState$12",
      "org.jsoup.parser.TokeniserState$1",
      "org.jsoup.parser.TokeniserState$13",
      "org.jsoup.nodes.Attributes$1",
      "org.jsoup.parser.TokeniserState$14",
      "org.jsoup.parser.TokeniserState$15",
      "org.eclipse.jetty.util.component.Dumpable$DumpableContainer",
      "org.eclipse.jetty.util.Attributes",
      "org.eclipse.jetty.util.component.LifeCycle",
      "org.jsoup.parser.Token$StartTag",
      "org.jsoup.select.Evaluator$AttributeWithValueStarting",
      "org.jsoup.parser.Token$EOF",
      "org.jsoup.parser.TokeniserState$10",
      "org.jsoup.parser.TokeniserState$11",
      "org.jsoup.nodes.DocumentType",
      "org.jsoup.parser.TokeniserState$9",
      "org.jsoup.parser.TokeniserState$8",
      "org.jsoup.Connection$Request",
      "org.jsoup.parser.TokeniserState$7",
      "org.jsoup.parser.TokeniserState$6",
      "org.jsoup.parser.TokeniserState$5",
      "org.jsoup.HttpStatusException",
      "org.jsoup.parser.TokeniserState$4",
      "org.jsoup.select.QueryParser",
      "org.jsoup.parser.TokeniserState$3",
      "org.jsoup.select.Evaluator$MatchesWholeText",
      "org.jsoup.nodes.NodeUtils",
      "org.eclipse.jetty.util.Uptime$Impl",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "org.jsoup.select.Evaluator$Matches",
      "org.jsoup.select.Evaluator$IsOnlyChild",
      "org.jsoup.parser.TokeniserState$16",
      "org.jsoup.parser.TokeniserState$17",
      "org.jsoup.parser.TokeniserState$18",
      "org.jsoup.parser.TokeniserState$19",
      "org.jsoup.nodes.Entities$1",
      "org.jsoup.parser.TokeniserState$23",
      "org.jsoup.UncheckedIOException",
      "org.jsoup.parser.TokeniserState$24",
      "org.jsoup.Connection$Method",
      "org.jsoup.parser.TokeniserState$25",
      "org.jsoup.parser.TokeniserState$26",
      "org.jsoup.parser.TokeniserState$20",
      "org.jsoup.parser.TokeniserState$21",
      "org.jsoup.helper.HttpConnection$Base",
      "org.jsoup.parser.TokeniserState$22",
      "org.jsoup.parser.TokenQueue",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Managed",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.select.NodeFilter",
      "org.eclipse.jetty.io.ByteBufferPool",
      "org.jsoup.select.Evaluator$MatchesWholeOwnText",
      "org.eclipse.jetty.io.AbstractByteBufferPool",
      "org.jsoup.helper.W3CDom$W3CBuilder",
      "org.jsoup.select.Evaluator$ContainsOwnText",
      "org.eclipse.jetty.util.HttpCookieStore$Empty",
      "org.jsoup.parser.TokeniserState$27",
      "org.jsoup.parser.TokeniserState",
      "org.jsoup.parser.TokeniserState$28",
      "org.jsoup.parser.TokeniserState$29",
      "org.jsoup.parser.TokeniserState$34",
      "org.jsoup.select.Evaluator$IndexLessThan",
      "org.jsoup.parser.TokeniserState$35",
      "org.jsoup.parser.TokeniserState$36",
      "org.eclipse.jetty.util.Uptime",
      "org.jsoup.parser.TokeniserState$37",
      "org.jsoup.parser.TokeniserState$30",
      "org.jsoup.parser.TokeniserState$31",
      "org.jsoup.parser.TokeniserState$32",
      "org.jsoup.parser.TokeniserState$33",
      "org.jsoup.nodes.Entities$EscapeMode",
      "org.jsoup.select.Evaluator$MatchText",
      "org.jsoup.select.Evaluator",
      "org.jsoup.Connection",
      "org.jsoup.select.Evaluator$IsRoot",
      "org.jsoup.parser.TokeniserState$38",
      "org.jsoup.parser.TokeniserState$39",
      "org.jsoup.nodes.CDataNode",
      "org.jsoup.parser.TokeniserState$45",
      "org.jsoup.parser.TokeniserState$46",
      "org.jsoup.parser.TokeniserState$47",
      "org.jsoup.select.StructuralEvaluator$Parent",
      "org.jsoup.parser.TokeniserState$48",
      "org.jsoup.parser.TokeniserState$41",
      "org.jsoup.select.Evaluator$IsLastChild",
      "org.jsoup.parser.TokeniserState$42",
      "org.jsoup.select.Evaluator$IsNthLastChild",
      "org.jsoup.parser.TokeniserState$43",
      "org.jsoup.parser.TokeniserState$44",
      "org.jsoup.parser.TokeniserState$40",
      "org.jsoup.parser.Token$TokenType",
      "org.jsoup.parser.HtmlTreeBuilderState$2",
      "org.jsoup.parser.HtmlTreeBuilderState$1",
      "org.jsoup.parser.HtmlTreeBuilderState$4",
      "org.jsoup.parser.HtmlTreeBuilderState$3",
      "org.jsoup.nodes.Attribute",
      "org.jsoup.parser.HtmlTreeBuilderState$9",
      "org.jsoup.parser.HtmlTreeBuilderState$6",
      "org.jsoup.parser.TokeniserState$49",
      "org.jsoup.parser.HtmlTreeBuilderState$5",
      "org.jsoup.parser.HtmlTreeBuilderState$8",
      "org.jsoup.parser.HtmlTreeBuilderState$7"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(XmlTreeBuilder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jsoup.parser.TreeBuilder",
      "org.jsoup.parser.XmlTreeBuilder",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.nodes.Document$OutputSettings$Syntax",
      "org.jsoup.nodes.EntitiesData",
      "org.jsoup.nodes.Document$OutputSettings",
      "org.jsoup.helper.DataUtil",
      "org.jsoup.nodes.Entities",
      "org.jsoup.parser.CharacterReader",
      "org.jsoup.helper.Validate",
      "org.jsoup.nodes.Entities$EscapeMode",
      "org.jsoup.parser.Token$TokenType",
      "org.jsoup.parser.XmlTreeBuilder$1",
      "org.jsoup.parser.Token",
      "org.jsoup.parser.Token$Tag",
      "org.jsoup.parser.Token$StartTag",
      "org.jsoup.parser.Token$EndTag",
      "org.jsoup.parser.Token$Doctype",
      "org.jsoup.nodes.Node",
      "org.jsoup.nodes.LeafNode",
      "org.jsoup.nodes.DocumentType",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.parser.Parser",
      "org.jsoup.parser.Tokeniser",
      "org.jsoup.parser.ParseErrorList",
      "org.jsoup.parser.Token$Character",
      "org.jsoup.parser.Token$Comment",
      "org.jsoup.internal.StringUtil$1",
      "org.jsoup.internal.StringUtil",
      "org.jsoup.helper.ValidationException",
      "org.jsoup.nodes.CDataNode",
      "org.jsoup.parser.Token$CData",
      "org.jsoup.parser.HtmlTreeBuilder",
      "org.jsoup.nodes.Attributes",
      "org.jsoup.nodes.Element",
      "org.jsoup.select.Evaluator",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.nodes.Document",
      "org.jsoup.internal.Normalizer",
      "org.jsoup.parser.Tag",
      "org.jsoup.parser.Token$EOF",
      "org.jsoup.helper.ChangeNotifyingArrayList",
      "org.jsoup.nodes.Element$NodeList",
      "org.jsoup.nodes.Node$OuterHtmlVisitor",
      "org.jsoup.nodes.NodeUtils",
      "org.jsoup.nodes.Entities$CoreCharset",
      "org.jsoup.select.NodeTraversor",
      "org.jsoup.nodes.Entities$1",
      "org.jsoup.select.Evaluator$AttributeKeyPair",
      "org.jsoup.select.Evaluator$AttributeWithValue",
      "org.jsoup.nodes.DataNode",
      "org.jsoup.parser.Tokeniser$1",
      "org.jsoup.nodes.Comment",
      "org.jsoup.parser.HtmlTreeBuilderState$7",
      "org.jsoup.parser.HtmlTreeBuilderState",
      "org.jsoup.parser.HtmlTreeBuilderState$25",
      "org.jsoup.select.Evaluator$AttributeWithValueStarting",
      "org.jsoup.select.Evaluator$Attribute",
      "org.jsoup.select.Collector",
      "org.jsoup.select.Elements",
      "org.jsoup.select.Collector$Accumulator",
      "org.jsoup.helper.HttpConnection",
      "org.jsoup.helper.HttpConnection$Base",
      "org.jsoup.helper.HttpConnection$Request",
      "org.jsoup.Connection$Method",
      "org.jsoup.helper.HttpConnection$Response",
      "org.jsoup.parser.ParseError",
      "org.jsoup.nodes.FormElement",
      "org.jsoup.UncheckedIOException",
      "org.jsoup.select.NodeFilter$FilterResult",
      "org.jsoup.select.Evaluator$AttributeWithValueContaining",
      "org.jsoup.nodes.PseudoTextElement",
      "org.jsoup.select.Evaluator$AttributeWithValueMatching",
      "org.jsoup.select.Evaluator$Matches",
      "org.jsoup.nodes.Element$1",
      "org.jsoup.parser.HtmlTreeBuilderState$Constants",
      "org.jsoup.nodes.XmlDeclaration",
      "org.jsoup.select.Collector$FirstFinder",
      "org.jsoup.nodes.Attributes$1",
      "org.jsoup.nodes.Attribute",
      "org.jsoup.Jsoup",
      "org.jsoup.helper.W3CDom",
      "org.jsoup.select.Evaluator$AttributeStarting",
      "org.jsoup.nodes.Range$Position",
      "org.jsoup.nodes.Range",
      "org.jsoup.select.Selector",
      "org.jsoup.select.QueryParser",
      "org.jsoup.parser.TokenQueue",
      "org.jsoup.select.Evaluator$MatchesOwn",
      "org.jsoup.nodes.Attributes$Dataset",
      "org.jsoup.select.Evaluator$ContainsOwnText",
      "org.jsoup.select.CombiningEvaluator",
      "org.jsoup.select.CombiningEvaluator$And",
      "org.jsoup.select.StructuralEvaluator",
      "org.jsoup.select.StructuralEvaluator$Parent",
      "org.jsoup.select.Selector$SelectorParseException",
      "org.jsoup.select.Evaluator$AttributeWithValueNot",
      "org.jsoup.select.StructuralEvaluator$Not",
      "org.jsoup.select.Evaluator$IndexEvaluator",
      "org.jsoup.select.Evaluator$IndexEquals",
      "org.jsoup.select.Evaluator$IndexGreaterThan",
      "org.jsoup.select.Evaluator$ContainsWholeOwnText",
      "org.jsoup.select.Evaluator$Class",
      "org.jsoup.select.Evaluator$CssNthEvaluator",
      "org.jsoup.select.Evaluator$IsNthLastChild",
      "org.jsoup.select.Evaluator$Id",
      "org.jsoup.select.Evaluator$AllElements",
      "org.jsoup.select.Evaluator$AttributeWithValueEnding",
      "org.jsoup.select.Evaluator$ContainsWholeText",
      "org.jsoup.select.Evaluator$IndexLessThan",
      "org.eclipse.jetty.util.HttpCookieStore$Empty",
      "org.jsoup.select.StructuralEvaluator$Root",
      "org.jsoup.select.Evaluator$ContainsText",
      "org.jsoup.helper.W3CDom$W3CBuilder",
      "org.jsoup.select.StructuralEvaluator$PreviousSibling",
      "org.eclipse.jetty.util.InetAddressSet",
      "org.jsoup.select.Evaluator$IsFirstChild",
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
      "org.eclipse.jetty.util.component.AttributeContainerMap",
      "org.jsoup.select.Evaluator$IsNthOfType",
      "org.jsoup.helper.HttpConnection$KeyVal",
      "org.eclipse.jetty.io.AbstractByteBufferPool",
      "org.eclipse.jetty.io.MappedByteBufferPool",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool",
      "org.eclipse.jetty.util.LeakDetector",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool$1",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Managed",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Bean",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$1",
      "org.jsoup.nodes.Document$QuirksMode",
      "org.jsoup.parser.TokeniserState"
    );
  }
}
