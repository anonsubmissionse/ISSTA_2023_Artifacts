/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 05:07:10 GMT 2022
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
public class FileContentInfoFilenameFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.vfs2.impl.FileContentInfoFilenameFactory"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FileContentInfoFilenameFactory_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.vfs2.FileChangeEvent",
      "org.apache.commons.vfs2.events.AbstractFileChangeEvent",
      "org.apache.commons.vfs2.FileNotFolderException",
      "org.apache.commons.vfs2.FileSelector",
      "org.apache.commons.vfs2.impl.SynchronizedFileObject",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.log4j.or.RendererMap",
      "org.apache.commons.vfs2.events.CreateEvent",
      "org.apache.commons.vfs2.provider.TemporaryFileStore",
      "org.apache.commons.vfs2.provider.DefaultFileContent",
      "org.apache.log4j.Level",
      "org.apache.commons.vfs2.FileSystemException",
      "org.apache.commons.vfs2.provider.FileContentThreadData",
      "org.apache.commons.vfs2.provider.DefaultFileContent$RawFileContentInputStream",
      "org.apache.log4j.spi.Filter",
      "org.apache.commons.vfs2.provider.FileNameParser",
      "org.apache.commons.vfs2.impl.DefaultFileContentInfo",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.Layout",
      "org.apache.commons.vfs2.impl.FileContentInfoFilenameFactory",
      "org.apache.commons.vfs2.util.URIUtils$URLCodecUtils",
      "org.apache.commons.vfs2.util.RawMonitorInputStream",
      "org.apache.commons.vfs2.provider.DefaultURLStreamHandler",
      "org.apache.commons.vfs2.UserAuthenticator",
      "org.apache.commons.vfs2.provider.UriParser",
      "org.apache.commons.vfs2.util.MonitorInputStream",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "org.apache.commons.vfs2.provider.FileSystemKey",
      "org.apache.commons.vfs2.provider.VfsComponentContext",
      "org.apache.commons.vfs2.events.ChangedEvent",
      "org.apache.commons.vfs2.FileContentInfo",
      "org.apache.commons.vfs2.operations.FileOperation",
      "org.apache.commons.vfs2.FileSystemOptions",
      "org.apache.commons.vfs2.VFS",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.commons.vfs2.provider.VfsComponent",
      "org.apache.commons.vfs2.impl.DecoratedFileObject",
      "org.apache.log4j.spi.ErrorHandler",
      "org.apache.commons.vfs2.FileObject",
      "org.apache.commons.vfs2.events.DeleteEvent",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.commons.vfs2.provider.GenericFileName",
      "org.apache.commons.vfs2.FileNotFoundException",
      "org.apache.commons.vfs2.util.URIUtils$EncodingUtils",
      "org.apache.commons.vfs2.Capability",
      "org.apache.commons.vfs2.FileType",
      "org.apache.commons.vfs2.provider.AbstractFileObject",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.commons.vfs2.cache.OnCallRefreshFileObject",
      "org.apache.commons.vfs2.FileContentInfoFactory",
      "org.apache.commons.vfs2.provider.DefaultFileContent$FileContentOutputStream",
      "org.apache.commons.vfs2.FileSystem",
      "org.apache.commons.vfs2.util.MonitorOutputStream",
      "org.apache.commons.vfs2.util.RandomAccessMode",
      "org.apache.commons.vfs2.operations.FileOperationProvider",
      "org.apache.commons.vfs2.util.URIBitSets",
      "org.apache.commons.vfs2.NameScope",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.commons.vfs2.provider.AbstractFileSystem",
      "org.apache.log4j.Logger",
      "org.apache.commons.vfs2.provider.DelegateFileObject",
      "org.apache.commons.vfs2.FileSystemManager",
      "org.apache.commons.vfs2.CacheStrategy",
      "org.apache.commons.vfs2.provider.DefaultFileSelectorInfo",
      "org.apache.commons.vfs2.provider.DefaultURLConnection",
      "org.apache.commons.vfs2.provider.bzip2.Bzip2FileSystem",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "org.apache.commons.vfs2.provider.LayeredFileName",
      "org.apache.commons.vfs2.RandomAccessContent",
      "org.apache.commons.vfs2.util.URIUtils",
      "org.apache.commons.vfs2.FilesCache",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.commons.vfs2.provider.AbstractFileName",
      "org.apache.commons.vfs2.provider.AbstractVfsComponent",
      "org.apache.commons.vfs2.FileName",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.apache.commons.vfs2.provider.DefaultFileContent$FileContentInputStream",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.commons.vfs2.provider.compressed.CompressedFileFileSystem",
      "org.apache.log4j.spi.LocationInfo",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.spi.ThrowableRenderer",
      "org.apache.commons.vfs2.provider.FileReplicator",
      "org.apache.log4j.Appender",
      "org.apache.commons.vfs2.impl.DefaultFileSystemConfigBuilder",
      "org.apache.commons.vfs2.operations.FileOperations",
      "org.apache.commons.vfs2.FileSelectInfo",
      "org.apache.commons.vfs2.provider.GenericURLFileName",
      "org.apache.commons.lang3.function.ToBooleanBiFunction",
      "org.apache.commons.vfs2.FileListener",
      "org.apache.log4j.spi.HierarchyEventListener",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.LoggingEvent",
      "org.apache.commons.vfs2.FileSystemConfigBuilder",
      "org.apache.log4j.spi.ThrowableInformation",
      "org.apache.log4j.Priority",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.apache.commons.vfs2.FileContent"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FileContentInfoFilenameFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.vfs2.impl.DefaultFileContentInfo",
      "org.apache.commons.vfs2.impl.FileContentInfoFilenameFactory",
      "org.apache.commons.vfs2.FileObject",
      "org.apache.commons.vfs2.impl.DecoratedFileObject",
      "org.apache.commons.vfs2.impl.SynchronizedFileObject",
      "org.apache.commons.vfs2.provider.AbstractFileName",
      "org.apache.commons.vfs2.provider.GenericFileName",
      "org.apache.commons.vfs2.provider.GenericURLFileName",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.vfs2.provider.AbstractVfsComponent",
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
      "org.apache.commons.vfs2.provider.AbstractFileSystem",
      "org.apache.commons.vfs2.provider.compressed.CompressedFileFileSystem",
      "org.apache.commons.vfs2.provider.bzip2.Bzip2FileSystem",
      "org.apache.commons.vfs2.provider.AbstractFileObject",
      "org.apache.commons.vfs2.provider.DelegateFileObject",
      "org.apache.commons.vfs2.cache.OnCallRefreshFileObject",
      "org.apache.commons.vfs2.provider.LayeredFileName",
      "org.apache.commons.vfs2.provider.DefaultFileContent",
      "org.apache.commons.vfs2.provider.UriParser",
      "org.apache.commons.vfs2.VFS",
      "org.apache.commons.vfs2.util.URIUtils",
      "org.apache.commons.vfs2.util.URIBitSets",
      "org.apache.commons.vfs2.util.URIUtils$EncodingUtils",
      "org.apache.commons.vfs2.util.URIUtils$URLCodecUtils",
      "org.apache.commons.vfs2.FileSystemException",
      "org.apache.commons.vfs2.provider.FileContentThreadData"
    );
  }
}
