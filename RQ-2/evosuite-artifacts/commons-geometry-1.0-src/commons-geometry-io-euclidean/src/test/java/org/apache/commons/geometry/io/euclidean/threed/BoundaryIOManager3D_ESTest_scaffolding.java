/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 02:01:45 GMT 2022
 */

package org.apache.commons.geometry.io.euclidean.threed;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class BoundaryIOManager3D_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.geometry.io.euclidean.threed.BoundaryIOManager3D"; 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-geometry-1.0-src/commons-geometry-io-euclidean"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BoundaryIOManager3D_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.geometry.io.euclidean.threed.stl.StlBoundaryWriteHandler3D",
      "org.apache.commons.geometry.euclidean.threed.line.LineSubset3D",
      "org.apache.commons.geometry.euclidean.threed.Vector3D$Unit",
      "org.apache.commons.geometry.core.partitioning.bsp.BSPTree$FindNodeCutRule",
      "org.apache.commons.geometry.euclidean.threed.Bounds3D",
      "org.apache.commons.geometry.euclidean.threed.ConvexVolume",
      "org.apache.commons.geometry.io.euclidean.threed.BoundaryReadHandler3D",
      "org.apache.commons.geometry.core.partitioning.Split",
      "org.apache.commons.geometry.io.euclidean.threed.BoundaryWriteHandler3D",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractBSPTree$SubtreeInitializer",
      "org.apache.commons.geometry.core.Point",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree$AbstractRegionNode",
      "org.apache.commons.geometry.euclidean.MultiDimensionalEuclideanVector",
      "org.apache.commons.geometry.euclidean.threed.Vector3D",
      "org.apache.commons.geometry.io.core.output.GeometryOutput",
      "org.apache.commons.geometry.io.core.internal.SimpleTextParser",
      "org.apache.commons.numbers.core.Precision",
      "org.apache.commons.geometry.core.partitioning.HyperplaneBoundedRegion",
      "org.apache.commons.geometry.io.core.GeometryIOMetadata",
      "org.apache.commons.geometry.io.euclidean.threed.stl.StlBoundaryReadHandler3D",
      "org.apache.commons.geometry.euclidean.AbstractBounds",
      "org.apache.commons.geometry.io.core.input.GeometryInput",
      "org.apache.commons.geometry.euclidean.threed.RegionBSPTree3D$RegionNode3D",
      "org.apache.commons.geometry.io.euclidean.threed.txt.TextFacetDefinitionWriter",
      "org.apache.commons.geometry.euclidean.threed.ConvexPolygon3D",
      "org.apache.commons.geometry.io.euclidean.threed.obj.AbstractObjParser",
      "org.apache.commons.geometry.io.euclidean.threed.obj.ObjFacetDefinitionReader",
      "org.apache.commons.geometry.io.euclidean.threed.SimpleFacetDefinition",
      "org.apache.commons.geometry.core.partitioning.bsp.BSPTreeVisitor",
      "org.apache.commons.geometry.io.euclidean.threed.FacetDefinition",
      "org.apache.commons.geometry.core.partitioning.bsp.RegionCutRule",
      "org.apache.commons.geometry.euclidean.threed.Triangle3D",
      "org.apache.commons.geometry.core.partitioning.bsp.BSPTreeVisitor$Result",
      "org.apache.commons.geometry.io.euclidean.threed.txt.CsvBoundaryReadHandler3D",
      "org.apache.commons.geometry.io.euclidean.threed.BoundaryIOManager3D",
      "org.apache.commons.geometry.io.euclidean.threed.stl.StlFacetDefinitionReaders",
      "org.apache.commons.geometry.core.partitioning.bsp.BSPSubtree",
      "org.apache.commons.geometry.io.core.internal.IOSupplier",
      "org.apache.commons.geometry.io.core.BoundaryIOManager",
      "org.apache.commons.geometry.euclidean.threed.BoundarySource3D",
      "org.apache.commons.geometry.io.core.BoundaryReadHandler",
      "org.apache.commons.geometry.io.core.internal.GeometryIOUtils",
      "org.apache.commons.geometry.euclidean.threed.PlaneConvexSubset",
      "org.apache.commons.geometry.io.core.internal.IOToIntFunction",
      "org.apache.commons.geometry.io.euclidean.threed.txt.TextBoundaryReadHandler3D",
      "org.apache.commons.geometry.euclidean.threed.mesh.TriangleMesh$Face",
      "org.apache.commons.numbers.core.Precision$DoubleEquivalence",
      "org.apache.commons.geometry.euclidean.threed.mesh.Mesh",
      "org.apache.commons.geometry.io.core.internal.IOFunction",
      "org.apache.commons.geometry.io.euclidean.threed.stl.StlConstants",
      "org.apache.commons.geometry.io.euclidean.threed.obj.ObjBoundaryReadHandler3D",
      "org.apache.commons.geometry.core.partitioning.SplitLocation",
      "org.apache.commons.geometry.io.core.internal.CharReadBuffer",
      "org.apache.commons.geometry.io.euclidean.threed.txt.CsvBoundaryWriteHandler3D",
      "org.apache.commons.geometry.core.partitioning.AbstractConvexHyperplaneBoundedRegion",
      "org.apache.commons.geometry.euclidean.threed.RegionBSPTree3D$PartitionedRegionBuilder3D",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractBSPTree$AbstractNode",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractPartitionedRegionBuilder",
      "org.apache.commons.geometry.core.Embedding",
      "org.apache.commons.geometry.core.partitioning.bsp.BSPTree$Node",
      "org.apache.commons.geometry.io.euclidean.threed.txt.TextBoundaryWriteHandler3D",
      "org.apache.commons.geometry.euclidean.threed.Plane",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree$RegionSizeProperties",
      "org.apache.commons.geometry.io.euclidean.threed.AbstractBoundaryWriteHandler3D",
      "org.apache.commons.geometry.core.partitioning.HyperplaneSubset",
      "org.apache.commons.geometry.euclidean.threed.mesh.SimpleTriangleMesh",
      "org.apache.commons.geometry.euclidean.threed.RegionBSPTree3D",
      "org.apache.commons.geometry.io.euclidean.threed.obj.AbstractObjPolygonReader",
      "org.apache.commons.geometry.euclidean.threed.Bounds3D$Builder",
      "org.apache.commons.geometry.core.Transform",
      "org.apache.commons.geometry.euclidean.threed.mesh.Mesh$Face",
      "org.apache.commons.geometry.core.Spatial",
      "org.apache.commons.geometry.core.RegionEmbedding",
      "org.apache.commons.geometry.core.Sized",
      "org.apache.commons.geometry.core.partitioning.Hyperplane",
      "org.apache.commons.geometry.io.core.BoundaryWriteHandler",
      "org.apache.commons.geometry.euclidean.threed.line.LinecastPoint3D",
      "org.apache.commons.geometry.euclidean.AbstractLinecastPoint",
      "org.apache.commons.geometry.core.partitioning.Splittable",
      "org.apache.commons.geometry.io.euclidean.threed.obj.ObjWriter",
      "org.apache.commons.geometry.io.euclidean.threed.AbstractBoundaryReadHandler3D$FacetDefinitionReaderIterator",
      "org.apache.commons.geometry.io.core.utils.AbstractTextFormatWriter",
      "org.apache.commons.geometry.euclidean.threed.mesh.TriangleMesh",
      "org.apache.commons.geometry.io.euclidean.threed.obj.PolygonObjParser",
      "org.apache.commons.geometry.core.partitioning.AbstractHyperplane",
      "org.apache.commons.geometry.core.partitioning.BoundarySource",
      "org.apache.commons.geometry.io.euclidean.threed.FacetDefinitionReader",
      "org.apache.commons.geometry.io.euclidean.threed.obj.ObjConstants",
      "org.apache.commons.geometry.io.euclidean.threed.obj.ObjTriangleMeshReader",
      "org.apache.commons.geometry.core.Vector",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractBSPTree",
      "org.apache.commons.geometry.io.euclidean.threed.GeometryFormat3D",
      "org.apache.commons.geometry.io.euclidean.threed.txt.AbstractTextBoundaryWriteHandler3D",
      "org.apache.commons.geometry.euclidean.threed.mesh.SimpleTriangleMesh$Builder",
      "org.apache.commons.geometry.core.RegionLocation",
      "org.apache.commons.geometry.euclidean.threed.line.Line3D",
      "org.apache.commons.geometry.core.partitioning.HyperplaneConvexSubset",
      "org.apache.commons.geometry.core.partitioning.bsp.BSPTree",
      "org.apache.commons.geometry.euclidean.threed.line.Linecastable3D",
      "org.apache.commons.geometry.euclidean.EuclideanVector",
      "org.apache.commons.geometry.euclidean.threed.line.LineConvexSubset3D",
      "org.apache.commons.geometry.core.Region",
      "org.apache.commons.geometry.euclidean.threed.BoundaryList3D",
      "org.apache.commons.geometry.io.core.GeometryFormat",
      "org.apache.commons.geometry.euclidean.threed.PlaneSubset",
      "org.apache.commons.geometry.core.partitioning.BoundaryList",
      "org.apache.commons.geometry.io.core.BoundaryIOManager$HandlerRegistry",
      "org.apache.commons.geometry.io.euclidean.threed.AbstractBoundaryReadHandler3D",
      "org.apache.commons.geometry.io.euclidean.threed.obj.ObjBoundaryWriteHandler3D"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.io.InputStream", false, BoundaryIOManager3D_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.io.OutputStream", false, BoundaryIOManager3D_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.util.Iterator", false, BoundaryIOManager3D_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.util.stream.Stream", false, BoundaryIOManager3D_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.geometry.io.core.input.GeometryInput", false, BoundaryIOManager3D_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.geometry.io.core.output.GeometryOutput", false, BoundaryIOManager3D_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.numbers.core.Precision$DoubleEquivalence", false, BoundaryIOManager3D_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BoundaryIOManager3D_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.geometry.io.core.BoundaryIOManager",
      "org.apache.commons.geometry.io.euclidean.threed.BoundaryIOManager3D",
      "org.apache.commons.geometry.io.core.BoundaryIOManager$HandlerRegistry",
      "org.apache.commons.geometry.io.euclidean.threed.AbstractBoundaryWriteHandler3D",
      "org.apache.commons.geometry.io.euclidean.threed.txt.AbstractTextBoundaryWriteHandler3D",
      "org.apache.commons.geometry.io.euclidean.threed.txt.TextBoundaryWriteHandler3D",
      "org.apache.commons.geometry.io.euclidean.threed.GeometryFormat3D",
      "org.apache.commons.geometry.core.partitioning.AbstractConvexHyperplaneBoundedRegion",
      "org.apache.commons.geometry.euclidean.threed.ConvexVolume",
      "org.apache.commons.geometry.core.partitioning.AbstractConvexHyperplaneBoundedRegion$ConvexRegionBoundaryBuilder",
      "org.apache.commons.geometry.io.euclidean.threed.AbstractBoundaryReadHandler3D",
      "org.apache.commons.geometry.io.euclidean.threed.obj.ObjBoundaryReadHandler3D",
      "org.apache.commons.geometry.io.euclidean.threed.obj.ObjBoundaryWriteHandler3D",
      "org.apache.commons.geometry.io.euclidean.threed.obj.ObjConstants",
      "org.apache.commons.geometry.io.euclidean.threed.stl.StlBoundaryReadHandler3D",
      "org.apache.commons.geometry.io.euclidean.threed.stl.StlConstants",
      "org.apache.commons.geometry.io.euclidean.threed.stl.StlBoundaryWriteHandler3D",
      "org.apache.commons.geometry.io.euclidean.threed.txt.TextBoundaryReadHandler3D",
      "org.apache.commons.geometry.io.euclidean.threed.txt.CsvBoundaryReadHandler3D",
      "org.apache.commons.geometry.io.euclidean.threed.txt.CsvBoundaryWriteHandler3D",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractBSPTree",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree",
      "org.apache.commons.geometry.euclidean.threed.RegionBSPTree3D",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractBSPTree$AbstractNode",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree$AbstractRegionNode",
      "org.apache.commons.geometry.euclidean.threed.RegionBSPTree3D$RegionNode3D",
      "org.apache.commons.geometry.core.RegionLocation",
      "org.apache.commons.geometry.core.internal.IteratorTransform",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree$RegionBoundaryIterator",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractBSPTree$NodeIterator",
      "org.apache.commons.geometry.core.partitioning.AbstractHyperplane",
      "org.apache.commons.geometry.euclidean.threed.Plane",
      "org.apache.commons.geometry.io.core.utils.AbstractTextFormatWriter",
      "org.apache.commons.geometry.io.euclidean.threed.txt.TextFacetDefinitionWriter",
      "org.apache.commons.geometry.io.core.internal.GeometryIOUtils",
      "org.apache.commons.geometry.io.euclidean.threed.stl.BinaryStlWriter",
      "org.apache.commons.geometry.io.euclidean.threed.stl.StlUtils",
      "org.apache.commons.geometry.euclidean.threed.mesh.SimpleTriangleMesh",
      "org.apache.commons.geometry.euclidean.threed.mesh.SimpleTriangleMesh$Builder",
      "org.apache.commons.geometry.euclidean.AbstractBounds",
      "org.apache.commons.geometry.euclidean.threed.Bounds3D",
      "org.apache.commons.geometry.euclidean.threed.Bounds3D$Builder",
      "org.apache.commons.geometry.core.partitioning.BoundaryList",
      "org.apache.commons.geometry.euclidean.threed.BoundaryList3D",
      "org.apache.commons.geometry.io.euclidean.threed.obj.ObjWriter",
      "org.apache.commons.geometry.io.euclidean.threed.obj.AbstractObjPolygonReader",
      "org.apache.commons.geometry.io.euclidean.threed.obj.ObjFacetDefinitionReader",
      "org.apache.commons.geometry.euclidean.threed.line.LineSubset3D",
      "org.apache.commons.geometry.euclidean.threed.line.LineConvexSubset3D",
      "org.apache.commons.geometry.euclidean.threed.RegionBSPTree3D$LinecastVisitor",
      "org.apache.commons.geometry.core.partitioning.bsp.BSPTreeVisitor$Result",
      "org.apache.commons.geometry.euclidean.AbstractLinecastPoint",
      "org.apache.commons.geometry.euclidean.threed.line.LinecastPoint3D",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree$1",
      "org.apache.commons.geometry.io.euclidean.threed.stl.StlFacetDefinitionReaders",
      "org.apache.commons.geometry.io.euclidean.threed.obj.ObjTriangleMeshReader",
      "org.apache.commons.geometry.io.euclidean.threed.txt.TextFacetDefinitionReader",
      "org.apache.commons.geometry.euclidean.threed.BoundarySourceLinecaster3D",
      "org.apache.commons.geometry.io.euclidean.threed.obj.ObjWriter$MeshBuffer",
      "org.apache.commons.geometry.io.euclidean.threed.obj.AbstractObjParser",
      "org.apache.commons.geometry.io.euclidean.threed.obj.PolygonObjParser",
      "org.apache.commons.geometry.io.core.internal.SimpleTextParser",
      "org.apache.commons.geometry.io.core.internal.CharReadBuffer",
      "org.apache.commons.geometry.core.partitioning.bsp.BSPTreePrinter",
      "org.apache.commons.geometry.core.partitioning.bsp.BSPTreeVisitor$TargetPointVisitor",
      "org.apache.commons.geometry.core.partitioning.bsp.BSPTreeVisitor$ClosestFirstVisitor",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree$BoundaryProjector",
      "org.apache.commons.geometry.euclidean.threed.RegionBSPTree3D$BoundaryProjector3D",
      "org.apache.commons.geometry.io.euclidean.threed.AbstractBoundaryReadHandler3D$FacetDefinitionReaderIterator",
      "org.apache.commons.geometry.euclidean.threed.BoundarySourceBoundsBuilder3D",
      "org.apache.commons.geometry.io.euclidean.threed.stl.BinaryStlFacetDefinitionReader",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractBSPTreeMergeOperator",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree$RegionMergeOperator",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree$XorOperator",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree$Condenser",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractPartitionedRegionBuilder",
      "org.apache.commons.geometry.euclidean.threed.RegionBSPTree3D$PartitionedRegionBuilder3D",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree$RegionSizeProperties",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree$IntersectionOperator",
      "org.apache.commons.geometry.euclidean.threed.line.Line3D",
      "org.apache.commons.geometry.core.partitioning.bsp.AbstractRegionBSPTree$UnionOperator"
    );
  }
}
