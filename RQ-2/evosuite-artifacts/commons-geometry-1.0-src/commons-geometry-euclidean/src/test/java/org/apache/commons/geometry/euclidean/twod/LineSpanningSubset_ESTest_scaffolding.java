/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 01:29:15 GMT 2022
 */

package org.apache.commons.geometry.euclidean.twod;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class LineSpanningSubset_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.geometry.euclidean.twod.LineSpanningSubset"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LineSpanningSubset_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.geometry.core.internal.DoubleFunction2N",
      "org.apache.commons.geometry.euclidean.twod.LineConvexSubset",
      "org.apache.commons.geometry.core.internal.SimpleTupleFormat",
      "org.apache.commons.geometry.euclidean.twod.Bounds2D$Builder",
      "org.apache.commons.numbers.core.Precision$DoubleEquivalence",
      "org.apache.commons.geometry.euclidean.twod.Line",
      "org.apache.commons.geometry.euclidean.oned.Interval",
      "org.apache.commons.geometry.euclidean.twod.Segment",
      "org.apache.commons.geometry.euclidean.twod.Vector2D",
      "org.apache.commons.geometry.euclidean.twod.Ray",
      "org.apache.commons.geometry.core.partitioning.Split",
      "org.apache.commons.geometry.euclidean.oned.Vector1D$Unit",
      "org.apache.commons.numbers.core.ExtendedPrecision",
      "org.apache.commons.geometry.core.Point",
      "org.apache.commons.geometry.euclidean.twod.BoundarySource2D",
      "org.apache.commons.numbers.core.Sum",
      "org.apache.commons.geometry.core.partitioning.SplitLocation",
      "org.apache.commons.geometry.euclidean.twod.LineSpanningSubset",
      "org.apache.commons.geometry.euclidean.twod.AffineTransformMatrix2D",
      "org.apache.commons.geometry.core.partitioning.AbstractConvexHyperplaneBoundedRegion",
      "org.apache.commons.geometry.euclidean.AbstractAffineTransformMatrix",
      "org.apache.commons.geometry.euclidean.MultiDimensionalEuclideanVector",
      "org.apache.commons.geometry.core.Embedding",
      "org.apache.commons.geometry.euclidean.twod.ReverseRay",
      "org.apache.commons.numbers.core.Precision",
      "org.apache.commons.geometry.euclidean.EuclideanTransform",
      "org.apache.commons.geometry.core.partitioning.HyperplaneBoundedRegion",
      "org.apache.commons.geometry.euclidean.twod.Line$SubspaceTransform",
      "org.apache.commons.geometry.core.partitioning.HyperplaneSubset",
      "org.apache.commons.geometry.euclidean.twod.rotation.Rotation2D",
      "org.apache.commons.geometry.euclidean.AbstractBounds",
      "org.apache.commons.geometry.euclidean.twod.Vector2D$Unit",
      "org.apache.commons.geometry.core.Transform",
      "org.apache.commons.geometry.core.RegionEmbedding",
      "org.apache.commons.geometry.core.Spatial",
      "org.apache.commons.geometry.core.internal.SimpleTupleFormat$TupleParseException",
      "org.apache.commons.geometry.core.Sized",
      "org.apache.commons.geometry.core.partitioning.Hyperplane",
      "org.apache.commons.geometry.core.partitioning.EmbeddingHyperplane",
      "org.apache.commons.geometry.core.partitioning.Splittable",
      "org.apache.commons.geometry.core.partitioning.HyperplaneLocation",
      "org.apache.commons.geometry.core.partitioning.AbstractHyperplane",
      "org.apache.commons.geometry.core.partitioning.BoundarySource",
      "org.apache.commons.geometry.euclidean.oned.Vector1D",
      "org.apache.commons.geometry.core.Vector",
      "org.apache.commons.geometry.euclidean.twod.Lines",
      "org.apache.commons.geometry.euclidean.twod.Bounds2D",
      "org.apache.commons.geometry.euclidean.EuclideanVectorSum",
      "org.apache.commons.geometry.core.RegionLocation",
      "org.apache.commons.geometry.core.partitioning.HyperplaneConvexSubset",
      "org.apache.commons.geometry.euclidean.twod.Vector2D$Sum",
      "org.apache.commons.geometry.euclidean.EuclideanVector",
      "org.apache.commons.geometry.euclidean.twod.ConvexArea",
      "org.apache.commons.geometry.euclidean.twod.shape.Parallelogram",
      "org.apache.commons.geometry.core.Region",
      "org.apache.commons.geometry.euclidean.twod.LineSubset",
      "org.apache.commons.geometry.euclidean.twod.Linecastable2D",
      "org.apache.commons.geometry.euclidean.internal.Vectors"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.numbers.core.Precision$DoubleEquivalence", false, LineSpanningSubset_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(LineSpanningSubset_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.geometry.euclidean.twod.LineSubset",
      "org.apache.commons.geometry.euclidean.twod.LineConvexSubset",
      "org.apache.commons.geometry.euclidean.twod.LineSpanningSubset",
      "org.apache.commons.geometry.core.RegionLocation",
      "org.apache.commons.geometry.euclidean.EuclideanVector",
      "org.apache.commons.geometry.euclidean.MultiDimensionalEuclideanVector",
      "org.apache.commons.geometry.euclidean.twod.Vector2D",
      "org.apache.commons.geometry.core.partitioning.AbstractHyperplane",
      "org.apache.commons.geometry.euclidean.twod.Line",
      "org.apache.commons.geometry.euclidean.AbstractAffineTransformMatrix",
      "org.apache.commons.geometry.euclidean.twod.AffineTransformMatrix2D",
      "org.apache.commons.geometry.euclidean.twod.rotation.Rotation2D",
      "org.apache.commons.geometry.euclidean.twod.Vector2D$Unit",
      "org.apache.commons.geometry.euclidean.internal.Vectors",
      "org.apache.commons.numbers.core.Sum",
      "org.apache.commons.numbers.core.ExtendedPrecision",
      "org.apache.commons.geometry.euclidean.oned.Vector1D",
      "org.apache.commons.geometry.euclidean.twod.Lines",
      "org.apache.commons.geometry.core.internal.SimpleTupleFormat",
      "org.apache.commons.geometry.euclidean.internal.Matrices",
      "org.apache.commons.geometry.core.internal.SimpleTupleFormat$TupleParseException",
      "org.apache.commons.geometry.euclidean.twod.Ray",
      "org.apache.commons.geometry.euclidean.twod.EmbeddedTreeLineSubset",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractBSPTree",
      "org.apache.commons.geometry.core.partitioning.bsp.RegionCutRule",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree",
      "org.apache.commons.geometry.euclidean.oned.RegionBSPTree1D",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractBSPTree$AbstractNode",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree$AbstractRegionNode",
      "org.apache.commons.geometry.euclidean.oned.RegionBSPTree1D$RegionNode1D",
      "org.apache.commons.geometry.euclidean.oned.RegionBSPTree1D$RegionSizePropertiesVisitor",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractBSPTree$NodeIterator",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree$RegionSizeProperties",
      "org.apache.commons.geometry.euclidean.oned.Interval",
      "org.apache.commons.geometry.euclidean.twod.Segment",
      "org.apache.commons.geometry.core.partitioning.Split",
      "org.apache.commons.geometry.euclidean.EuclideanVectorSum",
      "org.apache.commons.geometry.euclidean.twod.Vector2D$Sum",
      "org.apache.commons.geometry.euclidean.oned.Vector1D$Unit",
      "org.apache.commons.geometry.core.internal.HyperplaneSubsets",
      "org.apache.commons.geometry.euclidean.twod.ReverseRay",
      "org.apache.commons.geometry.euclidean.oned.AffineTransformMatrix1D",
      "org.apache.commons.geometry.core.partitioning.SplitLocation",
      "org.apache.commons.geometry.euclidean.oned.OrientedPoints",
      "org.apache.commons.geometry.euclidean.oned.OrientedPoint",
      "org.apache.commons.geometry.core.partitioning.bsp.BSPTreeVisitor$TargetPointVisitor",
      "org.apache.commons.geometry.core.partitioning.bsp.BSPTreeVisitor$ClosestFirstVisitor",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree$BoundaryProjector",
      "org.apache.commons.geometry.euclidean.oned.RegionBSPTree1D$BoundaryProjector1D",
      "org.apache.commons.geometry.core.partitioning.bsp.BSPTreeVisitor$Result",
      "org.apache.commons.numbers.angle.Angle",
      "org.apache.commons.numbers.angle.Angle$Normalizer",
      "org.apache.commons.numbers.angle.Reduce",
      "org.apache.commons.numbers.angle.Angle$Rad",
      "org.apache.commons.geometry.euclidean.oned.OrientedPoint$OrientedPointConvexSubset"
    );
  }
}
