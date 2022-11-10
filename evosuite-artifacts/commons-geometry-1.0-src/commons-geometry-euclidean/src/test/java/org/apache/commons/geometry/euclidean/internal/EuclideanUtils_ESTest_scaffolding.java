/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 01:26:01 GMT 2022
 */

package org.apache.commons.geometry.euclidean.internal;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class EuclideanUtils_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.geometry.euclidean.internal.EuclideanUtils"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-geometry-1.0-src/commons-geometry-euclidean"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EuclideanUtils_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.geometry.core.internal.DoubleFunction2N",
      "org.apache.commons.numbers.core.Norm$Three",
      "org.apache.commons.geometry.core.Transform",
      "org.apache.commons.geometry.euclidean.internal.Matrices",
      "org.apache.commons.geometry.core.Spatial",
      "org.apache.commons.geometry.core.internal.SimpleTupleFormat$TupleParseException",
      "org.apache.commons.numbers.core.Norm$Two",
      "org.apache.commons.geometry.core.internal.SimpleTupleFormat",
      "org.apache.commons.geometry.euclidean.threed.Vector3D$Unit",
      "org.apache.commons.numbers.quaternion.Quaternion$Type",
      "org.apache.commons.geometry.euclidean.threed.rotation.AxisAngleSequence",
      "org.apache.commons.numbers.core.Precision$DoubleEquivalence",
      "org.apache.commons.geometry.euclidean.threed.rotation.AxisReferenceFrame",
      "org.apache.commons.geometry.euclidean.threed.AffineTransformMatrix3D",
      "org.apache.commons.numbers.core.Norm",
      "org.apache.commons.numbers.quaternion.Slerp$Linear",
      "org.apache.commons.numbers.quaternion.Slerp$Spherical",
      "org.apache.commons.geometry.euclidean.internal.EuclideanUtils",
      "org.apache.commons.numbers.quaternion.Quaternion$Type$Normalized",
      "org.apache.commons.numbers.core.ExtendedPrecision",
      "org.apache.commons.geometry.core.Point",
      "org.apache.commons.geometry.euclidean.threed.rotation.AxisSequenceType",
      "org.apache.commons.numbers.core.Sum",
      "org.apache.commons.numbers.quaternion.Quaternion",
      "org.apache.commons.numbers.quaternion.Slerp",
      "org.apache.commons.geometry.core.Vector",
      "org.apache.commons.numbers.quaternion.Quaternion$QuaternionParsingException",
      "org.apache.commons.geometry.core.internal.GeometryInternalError",
      "org.apache.commons.geometry.euclidean.EuclideanVectorSum",
      "org.apache.commons.geometry.euclidean.threed.rotation.AxisSequence",
      "org.apache.commons.geometry.euclidean.AbstractAffineTransformMatrix",
      "org.apache.commons.numbers.quaternion.Quaternion$Type$Default",
      "org.apache.commons.geometry.euclidean.MultiDimensionalEuclideanVector",
      "org.apache.commons.geometry.euclidean.threed.Vector3D",
      "org.apache.commons.geometry.core.internal.DoubleFunction3N",
      "org.apache.commons.geometry.euclidean.EuclideanTransform",
      "org.apache.commons.numbers.core.Precision",
      "org.apache.commons.geometry.euclidean.EuclideanVector",
      "org.apache.commons.geometry.core.internal.DoubleFunction1N",
      "org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation",
      "org.apache.commons.numbers.quaternion.Quaternion$1",
      "org.apache.commons.geometry.euclidean.threed.Vector3D$Sum",
      "org.apache.commons.geometry.euclidean.threed.rotation.Rotation3D",
      "org.apache.commons.numbers.core.Norm$Array",
      "org.apache.commons.geometry.euclidean.internal.Vectors"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.function.Function", false, EuclideanUtils_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EuclideanUtils_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.geometry.euclidean.internal.EuclideanUtils",
      "org.apache.commons.numbers.quaternion.Quaternion$Type$Default",
      "org.apache.commons.numbers.quaternion.Quaternion$Type$Normalized",
      "org.apache.commons.numbers.quaternion.Quaternion$Type",
      "org.apache.commons.numbers.quaternion.Quaternion",
      "org.apache.commons.geometry.euclidean.AbstractAffineTransformMatrix",
      "org.apache.commons.geometry.euclidean.threed.AffineTransformMatrix3D",
      "org.apache.commons.numbers.quaternion.Quaternion$1",
      "org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation",
      "org.apache.commons.geometry.core.internal.SimpleTupleFormat",
      "org.apache.commons.geometry.core.internal.SimpleTupleFormat$TupleParseException",
      "org.apache.commons.geometry.euclidean.internal.Matrices",
      "org.apache.commons.geometry.euclidean.internal.Vectors",
      "org.apache.commons.numbers.core.Sum",
      "org.apache.commons.numbers.core.ExtendedPrecision",
      "org.apache.commons.geometry.euclidean.threed.rotation.AxisAngleSequence",
      "org.apache.commons.numbers.core.Precision",
      "org.apache.commons.geometry.euclidean.EuclideanVectorSum",
      "org.apache.commons.geometry.euclidean.threed.Vector3D$Sum",
      "org.apache.commons.numbers.core.Norm",
      "org.apache.commons.numbers.quaternion.Quaternion$QuaternionParsingException",
      "org.apache.commons.numbers.quaternion.Slerp",
      "org.apache.commons.numbers.quaternion.Slerp$Linear",
      "org.apache.commons.numbers.quaternion.Slerp$Spherical"
    );
  }
}
