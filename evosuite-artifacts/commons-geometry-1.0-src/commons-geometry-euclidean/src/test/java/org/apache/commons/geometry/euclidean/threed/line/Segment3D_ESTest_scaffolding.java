/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 01:27:48 GMT 2022
 */

package org.apache.commons.geometry.euclidean.threed.line;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Segment3D_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.geometry.euclidean.threed.line.Segment3D"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Segment3D_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.geometry.core.internal.DoubleFunction2N",
      "org.apache.commons.geometry.euclidean.threed.line.LineSubset3D",
      "org.apache.commons.geometry.core.internal.SimpleTupleFormat",
      "org.apache.commons.geometry.euclidean.threed.Vector3D$Unit",
      "org.apache.commons.numbers.quaternion.Quaternion$Type",
      "org.apache.commons.geometry.euclidean.threed.rotation.AxisAngleSequence",
      "org.apache.commons.numbers.core.Precision$DoubleEquivalence",
      "org.apache.commons.geometry.euclidean.threed.mesh.Mesh",
      "org.apache.commons.geometry.euclidean.threed.rotation.AxisReferenceFrame",
      "org.apache.commons.geometry.euclidean.threed.Bounds3D",
      "org.apache.commons.geometry.euclidean.threed.AffineTransformMatrix3D",
      "org.apache.commons.geometry.euclidean.oned.Interval",
      "org.apache.commons.geometry.euclidean.threed.line.ReverseRay3D",
      "org.apache.commons.numbers.core.Norm",
      "org.apache.commons.geometry.euclidean.threed.ConvexVolume",
      "org.apache.commons.numbers.quaternion.Quaternion$Type$Normalized",
      "org.apache.commons.geometry.euclidean.oned.Vector1D$Sum",
      "org.apache.commons.geometry.euclidean.oned.Vector1D$Unit",
      "org.apache.commons.geometry.core.partitioning.Split",
      "org.apache.commons.numbers.core.ExtendedPrecision",
      "org.apache.commons.geometry.core.Point",
      "org.apache.commons.geometry.euclidean.threed.line.LineSpanningSubset3D",
      "org.apache.commons.geometry.euclidean.threed.rotation.AxisSequenceType",
      "org.apache.commons.numbers.core.Sum",
      "org.apache.commons.geometry.core.partitioning.SplitLocation",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree",
      "org.apache.commons.geometry.core.internal.GeometryInternalError",
      "org.apache.commons.geometry.core.partitioning.AbstractConvexHyperplaneBoundedRegion",
      "org.apache.commons.geometry.euclidean.AbstractAffineTransformMatrix",
      "org.apache.commons.geometry.euclidean.MultiDimensionalEuclideanVector",
      "org.apache.commons.geometry.euclidean.threed.Vector3D",
      "org.apache.commons.geometry.core.Embedding",
      "org.apache.commons.numbers.core.Precision",
      "org.apache.commons.geometry.euclidean.EuclideanTransform",
      "org.apache.commons.geometry.euclidean.threed.Plane",
      "org.apache.commons.geometry.core.partitioning.HyperplaneBoundedRegion",
      "org.apache.commons.geometry.core.internal.DoubleFunction1N",
      "org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation",
      "org.apache.commons.geometry.euclidean.threed.Vector3D$Sum",
      "org.apache.commons.geometry.core.partitioning.HyperplaneSubset",
      "org.apache.commons.geometry.euclidean.AbstractBounds",
      "org.apache.commons.geometry.euclidean.threed.RegionBSPTree3D",
      "org.apache.commons.geometry.euclidean.threed.shape.Parallelepiped$Builder",
      "org.apache.commons.geometry.euclidean.threed.Bounds3D$Builder",
      "org.apache.commons.geometry.core.Transform",
      "org.apache.commons.geometry.euclidean.internal.Matrices",
      "org.apache.commons.geometry.core.RegionEmbedding",
      "org.apache.commons.geometry.core.Spatial",
      "org.apache.commons.geometry.core.internal.SimpleTupleFormat$TupleParseException",
      "org.apache.commons.geometry.euclidean.oned.RegionBSPTree1D",
      "org.apache.commons.geometry.core.Sized",
      "org.apache.commons.geometry.core.partitioning.Hyperplane",
      "org.apache.commons.geometry.euclidean.threed.line.LinecastPoint3D",
      "org.apache.commons.geometry.euclidean.AbstractLinecastPoint",
      "org.apache.commons.geometry.core.partitioning.Splittable",
      "org.apache.commons.geometry.core.partitioning.HyperplaneLocation",
      "org.apache.commons.geometry.euclidean.threed.mesh.TriangleMesh",
      "org.apache.commons.numbers.quaternion.Slerp$Linear",
      "org.apache.commons.numbers.quaternion.Slerp$Spherical",
      "org.apache.commons.geometry.euclidean.threed.shape.Parallelepiped",
      "org.apache.commons.geometry.core.partitioning.AbstractHyperplane",
      "org.apache.commons.geometry.core.partitioning.BoundarySource",
      "org.apache.commons.geometry.euclidean.threed.line.Lines3D",
      "org.apache.commons.geometry.euclidean.oned.Vector1D",
      "org.apache.commons.numbers.quaternion.Quaternion",
      "org.apache.commons.geometry.euclidean.oned.OrientedPoint",
      "org.apache.commons.numbers.quaternion.Slerp",
      "org.apache.commons.geometry.core.Vector",
      "org.apache.commons.numbers.quaternion.Quaternion$QuaternionParsingException",
      "org.apache.commons.geometry.euclidean.threed.line.Line3D$SubspaceTransform",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractBSPTree",
      "org.apache.commons.geometry.euclidean.threed.rotation.AxisSequence",
      "org.apache.commons.geometry.euclidean.EuclideanVectorSum",
      "org.apache.commons.numbers.quaternion.Quaternion$Type$Default",
      "org.apache.commons.geometry.core.internal.DoubleFunction3N",
      "org.apache.commons.geometry.euclidean.threed.line.Line3D",
      "org.apache.commons.geometry.core.RegionLocation",
      "org.apache.commons.geometry.core.partitioning.HyperplaneConvexSubset",
      "org.apache.commons.geometry.core.partitioning.bsp.BSPTree",
      "org.apache.commons.geometry.euclidean.EuclideanVector",
      "org.apache.commons.geometry.euclidean.threed.line.Linecastable3D",
      "org.apache.commons.geometry.core.partitioning.bsp.BSPSubtree",
      "org.apache.commons.geometry.euclidean.threed.line.Segment3D",
      "org.apache.commons.geometry.euclidean.threed.line.LineConvexSubset3D",
      "org.apache.commons.geometry.euclidean.threed.BoundarySource3D",
      "org.apache.commons.numbers.quaternion.Quaternion$1",
      "org.apache.commons.geometry.core.Region",
      "org.apache.commons.geometry.euclidean.oned.OrientedPoints",
      "org.apache.commons.geometry.euclidean.threed.rotation.Rotation3D",
      "org.apache.commons.geometry.euclidean.oned.AffineTransformMatrix1D",
      "org.apache.commons.geometry.euclidean.threed.BoundaryList3D",
      "org.apache.commons.geometry.euclidean.threed.PlaneSubset",
      "org.apache.commons.geometry.core.partitioning.BoundaryList",
      "org.apache.commons.geometry.euclidean.internal.Vectors",
      "org.apache.commons.geometry.euclidean.threed.PlaneConvexSubset",
      "org.apache.commons.geometry.euclidean.threed.line.Ray3D"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.numbers.core.Precision$DoubleEquivalence", false, Segment3D_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Segment3D_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.geometry.euclidean.threed.line.LineSubset3D",
      "org.apache.commons.geometry.euclidean.threed.line.LineConvexSubset3D",
      "org.apache.commons.geometry.euclidean.threed.line.Segment3D",
      "org.apache.commons.geometry.euclidean.threed.line.Line3D",
      "org.apache.commons.geometry.euclidean.threed.line.Lines3D",
      "org.apache.commons.geometry.euclidean.AbstractAffineTransformMatrix",
      "org.apache.commons.geometry.euclidean.threed.AffineTransformMatrix3D",
      "org.apache.commons.geometry.euclidean.internal.Vectors",
      "org.apache.commons.numbers.core.Sum",
      "org.apache.commons.numbers.core.ExtendedPrecision",
      "org.apache.commons.geometry.euclidean.AbstractBounds",
      "org.apache.commons.geometry.euclidean.threed.Bounds3D",
      "org.apache.commons.geometry.euclidean.threed.Bounds3D$Builder",
      "org.apache.commons.geometry.euclidean.EuclideanVectorSum",
      "org.apache.commons.geometry.euclidean.threed.Vector3D$Sum",
      "org.apache.commons.geometry.core.internal.SimpleTupleFormat",
      "org.apache.commons.numbers.quaternion.Quaternion$Type$Default",
      "org.apache.commons.numbers.quaternion.Quaternion$Type$Normalized",
      "org.apache.commons.numbers.quaternion.Quaternion$Type",
      "org.apache.commons.numbers.quaternion.Quaternion",
      "org.apache.commons.numbers.quaternion.Quaternion$1",
      "org.apache.commons.geometry.euclidean.threed.rotation.QuaternionRotation",
      "org.apache.commons.geometry.euclidean.threed.rotation.AxisAngleSequence",
      "org.apache.commons.numbers.core.Precision",
      "org.apache.commons.geometry.euclidean.threed.line.Ray3D",
      "org.apache.commons.geometry.euclidean.oned.Vector1D",
      "org.apache.commons.numbers.core.Norm",
      "org.apache.commons.geometry.core.internal.SimpleTupleFormat$TupleParseException",
      "org.apache.commons.geometry.euclidean.oned.Vector1D$Unit",
      "org.apache.commons.geometry.euclidean.oned.AffineTransformMatrix1D",
      "org.apache.commons.geometry.euclidean.threed.line.ReverseRay3D",
      "org.apache.commons.geometry.euclidean.internal.Matrices",
      "org.apache.commons.geometry.euclidean.threed.line.LineSpanningSubset3D",
      "org.apache.commons.geometry.euclidean.oned.Interval",
      "org.apache.commons.geometry.euclidean.oned.OrientedPoints",
      "org.apache.commons.geometry.core.partitioning.AbstractHyperplane",
      "org.apache.commons.geometry.euclidean.oned.OrientedPoint",
      "org.apache.commons.numbers.quaternion.Slerp",
      "org.apache.commons.numbers.quaternion.Slerp$Linear",
      "org.apache.commons.numbers.quaternion.Quaternion$QuaternionParsingException",
      "org.apache.commons.numbers.quaternion.Slerp$Spherical",
      "org.apache.commons.geometry.euclidean.threed.line.Line3D$SubspaceTransform",
      "org.apache.commons.geometry.euclidean.oned.Vector1D$Sum",
      "org.apache.commons.geometry.euclidean.threed.rotation.AxisReferenceFrame"
    );
  }
}
