/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 05:20:16 GMT 2022
 */

package org.apache.commons.vfs2.impl;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class URLStreamHandlerProxy_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.vfs2.impl.URLStreamHandlerProxy"; 
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
    java.lang.System.setProperty("user.dir", "/home/ISSTA_USER/Documents/toga-evaluation/toga-eval-issta-2023/artifacts/commons-vfs-2.9.0/commons-vfs2"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(URLStreamHandlerProxy_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.vfs2.impl.URLStreamHandlerProxy"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(URLStreamHandlerProxy_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.vfs2.impl.URLStreamHandlerProxy",
      "org.codehaus.stax2.XMLInputFactory2",
      "com.ctc.wstx.util.SymbolTable",
      "com.ctc.wstx.util.SymbolTable$Bucket",
      "com.ctc.wstx.util.DefaultXmlSymbolTable",
      "com.ctc.wstx.stax.WstxInputFactory",
      "com.ctc.wstx.api.CommonConfig",
      "com.ctc.wstx.api.ReaderConfig",
      "com.ctc.wstx.api.WstxInputProperties$ParsingMode",
      "com.ctc.wstx.api.WstxInputProperties",
      "org.apache.hadoop.conf.Configuration$DeprecationDelta",
      "org.apache.hadoop.thirdparty.com.google.common.base.Java8Usage",
      "org.apache.hadoop.thirdparty.com.google.common.base.Preconditions",
      "org.apache.hadoop.conf.Configuration$DeprecationContext",
      "org.apache.hadoop.conf.Configuration$DeprecatedKeyInfo",
      "org.apache.commons.collections.map.AbstractMapDecorator",
      "org.apache.commons.collections.map.UnmodifiableMap",
      "org.apache.hadoop.conf.Configuration",
      "org.apache.hadoop.conf.Configuration$Resource",
      "com.ctc.wstx.io.SystemId",
      "com.ctc.wstx.io.InputBootstrapper",
      "com.ctc.wstx.io.StreamBootstrapper",
      "com.ctc.wstx.io.BaseReader",
      "com.ctc.wstx.io.UTF8Reader",
      "com.ctc.wstx.io.InputSourceFactory",
      "com.ctc.wstx.io.WstxInputSource",
      "com.ctc.wstx.io.BaseInputSource",
      "com.ctc.wstx.io.ReaderSource",
      "com.ctc.wstx.io.BranchingReaderSource",
      "com.ctc.wstx.io.WstxInputData",
      "com.ctc.wstx.sr.StreamScanner",
      "com.ctc.wstx.sr.BasicStreamReader",
      "com.ctc.wstx.sr.TypedStreamReader",
      "com.ctc.wstx.sr.ValidatingStreamReader",
      "com.ctc.wstx.sr.InputElementStack",
      "com.ctc.wstx.util.StringVector",
      "com.ctc.wstx.util.InternCache",
      "com.ctc.wstx.sr.AttributeCollector",
      "com.ctc.wstx.util.TextBuilder",
      "com.ctc.wstx.util.TextBuffer",
      "org.apache.hadoop.conf.Configuration$Parser",
      "com.ctc.wstx.sr.Element",
      "org.apache.hadoop.thirdparty.com.google.common.collect.Interners",
      "org.apache.hadoop.thirdparty.com.google.common.collect.Interners$InternerBuilder",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMaker",
      "org.apache.hadoop.thirdparty.com.google.common.collect.Interners$InternerImpl",
      "org.apache.hadoop.thirdparty.com.google.common.base.Equivalence",
      "org.apache.hadoop.thirdparty.com.google.common.base.Equivalence$Equals",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$1",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$Strength",
      "org.apache.hadoop.thirdparty.com.google.common.base.MoreObjects",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry$Helper",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$Segment",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment",
      "org.apache.hadoop.util.StringInterner",
      "org.apache.hadoop.conf.Configuration$ParsedItem",
      "org.apache.commons.vfs2.impl.DefaultFileSystemManager",
      "org.apache.commons.vfs2.impl.DefaultVfsComponentContext",
      "org.apache.commons.vfs2.impl.FileTypeMap",
      "org.apache.log4j.Level",
      "org.apache.log4j.Priority",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.apache.commons.vfs2.FileSystemException",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.vfs2.FileObject",
      "org.apache.commons.vfs2.impl.DecoratedFileObject",
      "org.apache.commons.vfs2.cache.OnCallRefreshFileObject",
      "org.apache.commons.vfs2.provider.DefaultURLStreamHandler",
      "org.apache.commons.vfs2.provider.AbstractVfsComponent",
      "org.apache.commons.vfs2.provider.AbstractVfsContainer",
      "org.apache.commons.vfs2.provider.AbstractFileProvider",
      "org.apache.commons.vfs2.provider.temp.TemporaryFileProvider",
      "org.apache.commons.vfs2.provider.AbstractFileNameParser",
      "org.apache.commons.vfs2.provider.local.LocalFileNameParser",
      "org.apache.commons.vfs2.provider.local.GenericFileNameParser",
      "org.apache.commons.vfs2.provider.UriParser",
      "org.apache.commons.vfs2.util.CombinedResources",
      "org.apache.commons.vfs2.util.Messages",
      "org.apache.commons.vfs2.provider.AbstractFileName",
      "org.apache.commons.vfs2.provider.GenericFileName",
      "org.apache.commons.vfs2.provider.GenericURLFileName",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.vfs2.VFS",
      "org.apache.commons.vfs2.provider.AbstractFileSystem",
      "org.apache.commons.vfs2.provider.tar.TarFileSystem",
      "org.apache.commons.vfs2.FileSystemOptions",
      "org.apache.commons.vfs2.impl.VirtualFileSystem",
      "org.apache.commons.vfs2.FileSystemConfigBuilder",
      "org.apache.commons.vfs2.impl.DefaultFileSystemConfigBuilder",
      "org.apache.commons.vfs2.FileSystemOptions$FileSystemOptionKey",
      "org.apache.commons.vfs2.provider.AbstractFileObject",
      "org.apache.commons.vfs2.provider.DelegateFileObject"
    );
  }
}
