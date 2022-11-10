/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 10 23:52:42 GMT 2022
 */

package org.apache.commons.imaging.formats.tiff;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TiffImagingParameters_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.imaging.formats.tiff.TiffImagingParameters"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-imaging-1.0-alpha3-src"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TiffImagingParameters_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals",
      "org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants",
      "org.apache.commons.imaging.formats.tiff.TiffRasterDataType",
      "org.apache.commons.imaging.formats.tiff.constants.AliasSketchbookProTagConstants",
      "org.apache.commons.imaging.formats.tiff.datareaders.BitInputStream",
      "org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants",
      "org.apache.commons.imaging.formats.tiff.TiffField",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte",
      "org.apache.commons.imaging.formats.tiff.constants.HylaFaxTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte",
      "org.apache.commons.imaging.common.BufferedImageFactory",
      "org.apache.commons.imaging.formats.tiff.TiffImageData",
      "org.apache.commons.imaging.common.ImageBuilder",
      "org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles",
      "org.apache.commons.imaging.common.BinaryFunctions",
      "org.apache.commons.imaging.formats.tiff.JpegImageData",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterPalette",
      "org.apache.commons.imaging.color.ColorConversions",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCmyk",
      "org.apache.commons.imaging.formats.tiff.constants.DngTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.AdobePhotoshopTagConstants",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputSet",
      "org.apache.commons.imaging.color.ColorCieLch",
      "org.apache.commons.imaging.formats.tiff.TiffRasterStatistics",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat",
      "org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.GdalLibraryTagConstants",
      "org.apache.commons.imaging.color.ColorXyz",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs",
      "org.apache.commons.imaging.common.RationalNumber$Option",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIFD",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds",
      "org.apache.commons.imaging.formats.tiff.constants.WangTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel",
      "org.apache.commons.imaging.color.ColorHsl",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined",
      "org.apache.commons.imaging.formats.tiff.TiffImagingParameters",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong",
      "org.apache.commons.imaging.common.ByteConversions",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong",
      "org.apache.commons.imaging.color.ColorHsv",
      "org.apache.commons.imaging.common.SimpleBufferedImageFactory",
      "org.apache.commons.imaging.ImageReadException",
      "org.apache.commons.imaging.formats.tiff.TiffDirectory",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputItem",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte",
      "org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns",
      "org.apache.commons.imaging.color.ColorCieLuv",
      "org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType",
      "org.apache.commons.imaging.PixelDensity",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputItem$Value",
      "org.apache.commons.imaging.color.ColorCmyk",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText$TextEncoding",
      "org.apache.commons.imaging.formats.tiff.TiffRasterData",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary",
      "org.apache.commons.imaging.common.XmpImagingParameters",
      "org.apache.commons.imaging.common.RationalNumber",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational",
      "org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes",
      "org.apache.commons.imaging.formats.tiff.TiffDirectory$ImageDataElement",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong",
      "org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr",
      "org.apache.commons.imaging.internal.Debug",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort",
      "org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration",
      "org.apache.commons.imaging.formats.tiff.constants.TiffConstants",
      "org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv$TristimulusValues",
      "org.apache.commons.imaging.formats.tiff.TiffElement$DataElement",
      "org.apache.commons.imaging.ImagingException",
      "org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational",
      "org.apache.commons.imaging.formats.tiff.TiffTags",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii",
      "org.apache.commons.imaging.color.ColorDin99Lab",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes",
      "org.apache.commons.imaging.formats.tiff.TiffElement",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat",
      "org.apache.commons.imaging.color.ColorHunterLab",
      "org.apache.commons.imaging.common.BinaryOutputStream",
      "org.apache.commons.imaging.ImageWriteException",
      "org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputField",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv$RgbValues",
      "org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants",
      "org.apache.commons.imaging.common.BinaryConstant",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort",
      "org.apache.commons.imaging.ImagingParameters",
      "org.apache.commons.imaging.color.ColorCmy",
      "org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational",
      "org.apache.commons.imaging.common.RgbBufferedImageFactory",
      "org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants",
      "org.apache.commons.imaging.formats.tiff.write.ImageDataOffsets",
      "org.apache.commons.imaging.color.ColorCieLab",
      "org.apache.commons.imaging.formats.tiff.TiffField$OversizeValueElement",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfo"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TiffImagingParameters_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.imaging.ImagingParameters",
      "org.apache.commons.imaging.common.XmpImagingParameters",
      "org.apache.commons.imaging.formats.tiff.TiffImagingParameters",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputSet",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv",
      "org.apache.commons.imaging.common.ImageBuilder",
      "org.apache.commons.imaging.common.RgbBufferedImageFactory",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputItem",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfo",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText$TextEncoding",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort",
      "org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputField",
      "org.apache.commons.imaging.common.RationalNumber",
      "org.apache.commons.imaging.common.RationalNumber$Option",
      "org.apache.commons.imaging.common.ByteConversions",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputItem$Value",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCmyk",
      "org.apache.commons.imaging.PixelDensity",
      "org.apache.commons.imaging.formats.tiff.constants.TiffConstants",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb",
      "org.apache.commons.imaging.ImagingException",
      "org.apache.commons.imaging.ImageWriteException",
      "org.apache.commons.imaging.ImageReadException",
      "org.apache.commons.imaging.common.SimpleBufferedImageFactory",
      "org.apache.commons.imaging.color.ColorConversions",
      "org.apache.commons.imaging.color.ColorCmy",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterPalette",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte",
      "org.apache.commons.imaging.formats.tiff.TiffElement",
      "org.apache.commons.imaging.formats.tiff.TiffDirectory",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong",
      "org.apache.commons.imaging.internal.Debug",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes",
      "org.apache.commons.imaging.formats.tiff.TiffField",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIFD",
      "org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds",
      "org.apache.commons.imaging.formats.tiff.constants.AdobePhotoshopTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.AliasSketchbookProTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles",
      "org.apache.commons.imaging.formats.tiff.constants.DngTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong",
      "org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.GdalLibraryTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.HylaFaxTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString",
      "org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants",
      "org.apache.commons.imaging.common.BinaryConstant",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat",
      "org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts",
      "org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny",
      "org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.WangTagConstants",
      "org.apache.commons.imaging.formats.tiff.TiffTags",
      "org.apache.commons.imaging.common.BinaryFunctions",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs"
    );
  }
}
