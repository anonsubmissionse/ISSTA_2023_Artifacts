/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 06 17:21:25 GMT 2022
 */

package spark.embeddedserver.jetty;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class EmbeddedJettyFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "spark.embeddedserver.jetty.EmbeddedJettyFactory"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/spark"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", ""); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.dom.DOMDocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("strategy", "EvoSuite"); 
    java.lang.System.setProperty("sun.java.launcher", "SUN_STANDARD"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("sun.boot.class.path", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jfr.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/classes"); 
    java.lang.System.setProperty("show_progress", "false"); 
    java.lang.System.setProperty("extra_timeout", "5"); 
    java.lang.System.setProperty("sun.desktop", "gnome"); 
    java.lang.System.setProperty("process_communication_port", "6476"); 
    java.lang.System.setProperty("initialization_timeout", "5"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.factory", "org.evosuite.shaded.org.dom4j.DocumentFactory"); 
    java.lang.System.setProperty("assertion_timeout", "5"); 
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
    java.lang.System.setProperty("write_pool", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/spark/.evosuite/tmp_2022_10_06_12_30_25/pools/spark.embeddedserver.jetty.EmbeddedJettyFactory.pool"); 
    java.lang.System.setProperty("save_all_data", "false"); 
    java.lang.System.setProperty("logback.configurationFile", "logback-ctg.xml"); 
    java.lang.System.setProperty("junit_check_timeout", "5"); 
    java.lang.System.setProperty("replace_calls", "true"); 
    java.lang.System.setProperty("coverage", "true"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.DocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("ctg_schedule", "BUDGET"); 
    java.lang.System.setProperty("sun.io.unicode.encoding", "UnicodeLittle"); 
    java.lang.System.setProperty("stopping_condition", "MAXTIME"); 
    java.lang.System.setProperty("print_to_system", "false"); 
    java.lang.System.setProperty("ctg_seeds_file_in", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/spark/.evosuite/evosuite-seeds/spark.embeddedserver.jetty.EmbeddedJettyFactory.seed"); 
    java.lang.System.setProperty("output_variables", "TARGET_CLASS,configuration_id,criterion,ctg_min_time_per_job,ctg_schedule,search_budget,p_object_pool,ctg_time_per_class,Size,Length,Total_Time,Random_Seed,LineCoverage,LineCoverageBitString,BranchCoverage,BranchCoverageBitString,ExceptionCoverage,ExceptionCoverageBitString,Explicit_MethodExceptions,Explicit_TypeExceptions,Implicit_MethodExceptions,Implicit_TypeExceptions,WeakMutationScore,WeakMutationCoverageBitString,OutputCoverage,OutputCoverageBitString,MethodCoverage,MethodCoverageBitString,MethodNoExceptionCoverage,MethodNoExceptionCoverageBitString,CBranchCoverage,CBranchCoverageBitString"); 
    java.lang.System.setProperty("global_timeout", "30"); 
    java.lang.System.setProperty("assertions", "true"); 
    java.lang.System.setProperty("log_timeout", "false"); 
    java.lang.System.setProperty("master_log_port", "40201"); 
    java.lang.System.setProperty("reset_static_fields", "true"); 
    java.lang.System.setProperty("sun.java.command", "org.evosuite.ClientProcess"); 
    java.lang.System.setProperty("junit_check", "true"); 
    java.lang.System.setProperty("evosuite.log.folder", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/spark/.evosuite/tmp_2022_10_06_12_30_25/logs/spark.embeddedserver.jetty.EmbeddedJettyFactory"); 
    java.lang.System.setProperty("minimize", "true"); 
    java.lang.System.setProperty("max_size", "100"); 
    java.lang.System.setProperty("sun.os.patch.level", "unknown"); 
    java.lang.System.setProperty("sun.cpu.endian", "little"); 
    java.lang.System.setProperty("ctg_min_time_per_job", "1"); 
    java.lang.System.setProperty("junit_suffix", "_ESTest"); 
    java.lang.System.setProperty("java.vendor.url.bug", "http://bugreport.sun.com/bugreport/"); 
    java.lang.System.setProperty("report_dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/spark/.evosuite/tmp_2022_10_06_12_30_25/reports/spark.embeddedserver.jetty.EmbeddedJettyFactory"); 
    java.lang.System.setProperty("minimization_timeout", "5"); 
    java.lang.System.setProperty("CP_file_path", "/tmp/EvoSuite_classpathFile5612412772179427269.txt"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
    java.lang.System.setProperty("inline", "true"); 
    java.lang.System.setProperty("ctg_seeds_file_out", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/spark/.evosuite/tmp_2022_10_06_12_30_25/seeds/spark.embeddedserver.jetty.EmbeddedJettyFactory.seed"); 
    java.lang.System.setProperty("TARGET_CLASS", "spark.embeddedserver.jetty.EmbeddedJettyFactory"); 
    java.lang.System.setProperty("spawn_process_manager_port", "40249"); 
    java.lang.System.setProperty("evosuite.log.appender", "CLIENT"); 
    java.lang.System.setProperty("write_junit_timeout", "5"); 
    java.lang.System.setProperty("test_dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/spark/.evosuite/tmp_2022_10_06_12_30_25/tests"); 
    java.lang.System.setProperty("search_budget", "30"); 
    java.lang.System.setProperty("plot", "false"); 
    java.lang.System.setProperty("p_object_pool", "0.3"); 
    java.lang.System.setProperty("criterion", "LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH"); 
    java.lang.System.setProperty("test_comments", "false"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EmbeddedJettyFactory_ESTest_scaffolding.class.getClassLoader() ,
      "org.eclipse.jetty.server.Request",
      "spark.route.RouteEntry",
      "org.eclipse.jetty.server.handler.AbstractHandlerContainer",
      "spark.resource.AbstractResource",
      "spark.utils.Wrapper",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget$Lease",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "org.eclipse.jetty.util.component.FileNoticeLifeCycleListener",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.eclipse.jetty.server.handler.ErrorHandler",
      "spark.route.HttpMethod",
      "org.eclipse.jetty.util.AbstractTrie",
      "org.eclipse.jetty.util.annotation.ManagedObject",
      "org.eclipse.jetty.util.MultiException",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.server.Server",
      "org.eclipse.jetty.util.BlockingArrayQueue",
      "org.hsqldb.jdbc.JDBCDriver$1",
      "org.eclipse.jetty.server.HandlerContainer",
      "spark.RouteImpl$1",
      "org.eclipse.jetty.server.session.SessionContext",
      "org.eclipse.jetty.util.thread.TryExecutor$NoTryExecutor",
      "org.eclipse.jetty.util.thread.ReservedThreadExecutor$1",
      "spark.embeddedserver.jetty.JettyServer",
      "spark.embeddedserver.EmbeddedServer",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.util.thread.ExecutorThreadPool$1",
      "spark.embeddedserver.EmbeddedServerFactory",
      "org.eclipse.jetty.util.thread.ThreadPool",
      "spark.ExceptionHandlerImpl",
      "org.eclipse.jetty.server.session.UnreadableSessionDataException",
      "org.eclipse.jetty.util.statistic.CounterStatistic",
      "org.eclipse.jetty.http.PreEncodedHttpField",
      "spark.TemplateViewRouteImpl",
      "spark.serialization.BytesSerializer",
      "org.eclipse.jetty.util.ProcessorUtils",
      "spark.ExceptionMapper",
      "org.eclipse.jetty.util.thread.ReservedThreadExecutor",
      "spark.staticfiles.DirectoryTraversal$DirectoryTraversalDetection",
      "spark.route.Routes",
      "org.eclipse.jetty.server.Response",
      "org.eclipse.jetty.server.Handler",
      "org.eclipse.jetty.util.component.Destroyable",
      "spark.FilterImpl$1",
      "spark.resource.AbstractFileResolvingResource",
      "org.eclipse.jetty.util.thread.TryExecutor",
      "org.eclipse.jetty.util.MemoryUtils",
      "org.eclipse.jetty.server.SessionIdManager",
      "org.eclipse.jetty.util.thread.ThreadPool$SizedThreadPool",
      "spark.ssl.SslStores",
      "org.eclipse.jetty.util.ArrayTrie",
      "org.eclipse.jetty.util.StringUtil",
      "org.eclipse.jetty.util.thread.Scheduler$Task",
      "spark.utils.StringUtils",
      "org.eclipse.jetty.util.component.LifeCycle$Listener",
      "spark.resource.Resource",
      "spark.Route",
      "org.eclipse.jetty.util.log.Log$1",
      "spark.embeddedserver.jetty.JettyHandler",
      "org.eclipse.jetty.util.component.StopLifeCycle",
      "org.eclipse.jetty.util.thread.Locker$UnLock",
      "org.eclipse.jetty.server.RequestLog",
      "org.eclipse.jetty.util.thread.MonitoredQueuedThreadPool",
      "spark.QueryParamsMap",
      "spark.resource.ClassPathResourceHandler",
      "spark.embeddedserver.jetty.EmbeddedJettyServer",
      "org.eclipse.jetty.util.thread.ExecutorThreadPool",
      "spark.utils.Assert",
      "spark.ModelAndView",
      "org.eclipse.jetty.util.component.Dumpable",
      "org.eclipse.jetty.http.HttpCookie$SameSite",
      "spark.HaltException",
      "org.eclipse.jetty.util.thread.Locker",
      "spark.staticfiles.StaticFilesConfiguration",
      "spark.TemplateViewRoute",
      "spark.http.matching.RequestWrapper",
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "org.eclipse.jetty.util.component.Dumpable$DumpableContainer",
      "org.eclipse.jetty.util.Attributes",
      "org.eclipse.jetty.util.component.LifeCycle",
      "org.eclipse.jetty.util.component.AttributeContainerMap",
      "spark.ResponseTransformerRouteImpl",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Bean",
      "org.eclipse.jetty.util.thread.QueuedThreadPool$Runner",
      "spark.TemplateViewRouteImpl$1",
      "spark.embeddedserver.jetty.EmbeddedJettyFactory",
      "org.eclipse.jetty.server.session.HouseKeeper",
      "org.eclipse.jetty.util.RegexSet",
      "org.eclipse.jetty.util.component.Container",
      "org.eclipse.jetty.util.Uptime$Impl",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "org.eclipse.jetty.server.session.SessionHandler$1",
      "spark.serialization.Serializer",
      "spark.RouteImpl",
      "org.eclipse.jetty.util.thread.QueuedThreadPool",
      "spark.resource.ExternalResource",
      "org.eclipse.jetty.util.component.DumpableCollection",
      "org.eclipse.jetty.util.IncludeExclude",
      "spark.serialization.DefaultSerializer",
      "org.eclipse.jetty.util.Loader",
      "spark.serialization.InputStreamSerializer",
      "spark.http.matching.MatcherFilter",
      "org.eclipse.jetty.util.component.Graceful",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Managed",
      "org.eclipse.jetty.util.AtomicBiInteger",
      "org.eclipse.jetty.server.session.SessionDataMap",
      "org.eclipse.jetty.server.session.SessionDataStore",
      "spark.utils.CollectionUtils",
      "org.eclipse.jetty.server.session.SessionCache",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget$1",
      "org.eclipse.jetty.util.component.Container$Listener",
      "spark.embeddedserver.jetty.JettyServerFactory",
      "spark.ExceptionHandler",
      "spark.resource.ClassPathResource",
      "spark.routematch.RouteMatch",
      "org.eclipse.jetty.util.Trie",
      "org.eclipse.jetty.http.BadMessageException",
      "org.eclipse.jetty.util.Uptime",
      "org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate",
      "org.eclipse.jetty.server.handler.AbstractHandler",
      "org.eclipse.jetty.server.HttpChannel",
      "org.eclipse.jetty.util.thread.Scheduler",
      "org.eclipse.jetty.server.session.Session",
      "org.eclipse.jetty.server.session.SessionHandler$CookieConfig",
      "spark.serialization.SerializerChain",
      "spark.TemplateEngine",
      "spark.Request",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.util.thread.Locker$Lock",
      "spark.ResponseTransformerRouteImpl$1",
      "org.eclipse.jetty.util.MemoryUtils$1",
      "spark.utils.ResourceUtils",
      "spark.Filter",
      "org.eclipse.jetty.server.session.SessionData",
      "org.eclipse.jetty.server.session.SessionHandler$SessionIf",
      "spark.http.matching.ResponseWrapper",
      "spark.resource.AbstractResourceHandler",
      "org.eclipse.jetty.http.HttpCookie",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget$Leased",
      "org.eclipse.jetty.server.HttpOutput$Interceptor",
      "org.eclipse.jetty.server.handler.HandlerWrapper",
      "spark.Session",
      "org.eclipse.jetty.server.session.SessionHandler",
      "org.eclipse.jetty.util.thread.TryExecutor$1",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget",
      "spark.FilterImpl",
      "spark.resource.InputStreamResource",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.http.HttpField",
      "org.eclipse.jetty.server.handler.ScopedHandler",
      "org.eclipse.jetty.util.statistic.SampleStatistic",
      "spark.Response",
      "spark.resource.ExternalResourceHandler",
      "org.eclipse.jetty.util.log.Logger",
      "org.eclipse.jetty.server.Connector",
      "spark.ResponseTransformer",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EmbeddedJettyFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "spark.embeddedserver.jetty.EmbeddedJettyFactory",
      "spark.embeddedserver.jetty.JettyServer",
      "spark.http.matching.MatcherFilter",
      "spark.serialization.SerializerChain",
      "spark.serialization.Serializer",
      "spark.serialization.DefaultSerializer",
      "spark.serialization.InputStreamSerializer",
      "spark.serialization.BytesSerializer",
      "org.eclipse.jetty.util.log.Log$1",
      "org.eclipse.jetty.util.Loader",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "org.eclipse.jetty.util.Uptime",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "org.eclipse.jetty.server.handler.AbstractHandler",
      "org.eclipse.jetty.server.handler.AbstractHandlerContainer",
      "org.eclipse.jetty.server.handler.HandlerWrapper",
      "org.eclipse.jetty.server.handler.ScopedHandler",
      "org.eclipse.jetty.server.session.SessionHandler$1",
      "org.eclipse.jetty.server.session.SessionHandler",
      "spark.embeddedserver.jetty.JettyHandler",
      "org.eclipse.jetty.util.statistic.SampleStatistic",
      "org.eclipse.jetty.util.statistic.CounterStatistic",
      "org.eclipse.jetty.server.session.SessionHandler$CookieConfig",
      "spark.embeddedserver.jetty.EmbeddedJettyServer",
      "org.eclipse.jetty.util.thread.TryExecutor$1",
      "org.eclipse.jetty.util.thread.TryExecutor",
      "org.eclipse.jetty.util.thread.ExecutorThreadPool",
      "org.eclipse.jetty.util.thread.QueuedThreadPool",
      "org.eclipse.jetty.util.AtomicBiInteger",
      "org.eclipse.jetty.util.thread.QueuedThreadPool$Runner",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget$1",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget",
      "org.eclipse.jetty.server.Server",
      "org.eclipse.jetty.util.component.AttributeContainerMap",
      "org.eclipse.jetty.util.thread.Locker",
      "org.eclipse.jetty.util.thread.Locker$Lock",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Managed",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Bean",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$1",
      "spark.staticfiles.StaticFilesConfiguration",
      "spark.ExceptionMapper",
      "spark.route.Routes",
      "org.eclipse.jetty.util.thread.MonitoredQueuedThreadPool",
      "org.eclipse.jetty.util.MemoryUtils$1",
      "org.eclipse.jetty.util.MemoryUtils",
      "org.eclipse.jetty.util.BlockingArrayQueue",
      "spark.utils.Assert",
      "spark.utils.StringUtils",
      "spark.resource.AbstractResourceHandler",
      "spark.resource.ClassPathResourceHandler",
      "spark.resource.AbstractResource",
      "spark.resource.AbstractFileResolvingResource",
      "spark.resource.ExternalResource",
      "spark.utils.CollectionUtils",
      "spark.utils.ResourceUtils",
      "org.eclipse.jetty.util.ProcessorUtils",
      "spark.FilterImpl",
      "spark.route.RouteEntry",
      "spark.TemplateEngine",
      "spark.RouteImpl",
      "spark.TemplateViewRouteImpl",
      "spark.TemplateViewRouteImpl$1",
      "spark.RouteImpl$1",
      "spark.ResponseTransformerRouteImpl",
      "spark.ResponseTransformerRouteImpl$1",
      "org.eclipse.jetty.util.component.DumpableCollection",
      "org.eclipse.jetty.util.AbstractTrie",
      "org.eclipse.jetty.util.ArrayTrie",
      "org.eclipse.jetty.util.StringUtil",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.eclipse.jetty.util.component.StopLifeCycle",
      "spark.Request",
      "spark.resource.ExternalResourceHandler",
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "org.eclipse.jetty.util.IncludeExclude",
      "org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate",
      "spark.ExceptionHandlerImpl",
      "org.eclipse.jetty.util.component.FileNoticeLifeCycleListener",
      "org.eclipse.jetty.util.thread.ReservedThreadExecutor$1",
      "org.eclipse.jetty.util.thread.ReservedThreadExecutor",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget$Leased",
      "spark.routematch.RouteMatch",
      "spark.ModelAndView",
      "org.eclipse.jetty.util.RegexSet",
      "org.eclipse.jetty.util.thread.TryExecutor$NoTryExecutor",
      "spark.Response"
    );
  }
}
