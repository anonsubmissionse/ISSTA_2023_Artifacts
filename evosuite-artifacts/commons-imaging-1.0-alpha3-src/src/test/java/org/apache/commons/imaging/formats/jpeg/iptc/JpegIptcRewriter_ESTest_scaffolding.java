/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 10 23:58:51 GMT 2022
 */

package org.apache.commons.imaging.formats.jpeg.iptc;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class JpegIptcRewriter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.imaging.formats.jpeg.iptc.JpegIptcRewriter"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-imaging-1.0-alpha3-src"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JpegIptcRewriter_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.imaging.common.bytesource.ByteSourceInputStream$CacheReadingInputStream",
      "org.apache.commons.imaging.common.bytesource.ByteSourceArray",
      "org.apache.commons.imaging.common.XmpImagingParameters",
      "org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter$JFIFPieceSegment",
      "org.apache.commons.imaging.ImageWriteException",
      "org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter$SegmentFilter",
      "org.apache.commons.imaging.formats.jpeg.iptc.JpegIptcRewriter",
      "org.apache.commons.imaging.common.BufferedImageFactory",
      "org.apache.commons.imaging.common.bytesource.ByteSourceInputStream",
      "org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter$JFIFPiece",
      "org.apache.commons.imaging.formats.jpeg.JpegImagingParameters",
      "org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter$JFIFPieces",
      "org.apache.commons.imaging.common.bytesource.ByteSource",
      "org.apache.commons.imaging.common.BinaryConstant",
      "org.apache.commons.imaging.common.BinaryFunctions",
      "org.apache.commons.imaging.ImagingException",
      "org.apache.commons.imaging.ImagingParameters",
      "org.apache.commons.imaging.common.bytesource.ByteSourceInputStream$CacheBlock",
      "org.apache.commons.imaging.formats.jpeg.JpegUtils$Visitor",
      "org.apache.commons.imaging.ImageReadException",
      "org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter$1",
      "org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter",
      "org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data",
      "org.apache.commons.imaging.PixelDensity",
      "org.apache.commons.imaging.common.bytesource.ByteSourceFile",
      "org.apache.commons.imaging.common.BinaryFileParser",
      "org.apache.commons.imaging.ImagingConstants",
      "org.apache.commons.imaging.formats.jpeg.JpegUtils",
      "org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord",
      "org.apache.commons.imaging.formats.jpeg.JpegConstants",
      "org.apache.commons.imaging.formats.jpeg.iptc.IptcBlock"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Enumeration", false, JpegIptcRewriter_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JpegIptcRewriter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.imaging.common.BinaryFileParser",
      "org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter",
      "org.apache.commons.imaging.formats.jpeg.iptc.JpegIptcRewriter",
      "org.apache.commons.imaging.ImagingConstants",
      "org.apache.commons.imaging.common.bytesource.ByteSource",
      "org.apache.commons.imaging.common.bytesource.ByteSourceArray",
      "org.apache.commons.imaging.common.bytesource.ByteSourceFile",
      "org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter$1",
      "org.apache.commons.imaging.formats.jpeg.JpegUtils",
      "org.apache.commons.imaging.common.bytesource.ByteSourceInputStream",
      "org.apache.commons.imaging.common.BinaryConstant",
      "org.apache.commons.imaging.common.BinaryFunctions",
      "org.apache.commons.imaging.formats.jpeg.JpegConstants",
      "org.apache.commons.imaging.ImagingException",
      "org.apache.commons.imaging.ImageReadException",
      "org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data",
      "org.apache.commons.imaging.common.bytesource.ByteSourceInputStream$CacheReadingInputStream",
      "org.apache.commons.imaging.common.bytesource.ByteSourceInputStream$CacheBlock",
      "org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord",
      "org.apache.commons.imaging.formats.jpeg.iptc.IptcBlock"
    );
  }
}
