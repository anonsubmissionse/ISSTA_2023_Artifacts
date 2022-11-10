/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:59:26 GMT 2022
 */

package org.apache.commons.geometry.io.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashSet;
import java.util.Stack;
import org.apache.commons.geometry.euclidean.threed.BoundarySource3D;
import org.apache.commons.geometry.euclidean.threed.ConvexVolume;
import org.apache.commons.geometry.euclidean.threed.RegionBSPTree3D;
import org.apache.commons.geometry.io.core.output.FileGeometryOutput;
import org.apache.commons.geometry.io.core.output.GeometryOutput;
import org.apache.commons.geometry.io.core.output.StreamGeometryOutput;
import org.apache.commons.geometry.io.euclidean.threed.FacetDefinition;
import org.apache.commons.geometry.io.euclidean.threed.SimpleFacetDefinition;
import org.apache.commons.geometry.io.euclidean.threed.obj.ObjBoundaryWriteHandler3D;
import org.apache.commons.geometry.io.euclidean.threed.stl.StlBoundaryWriteHandler3D;
import org.apache.commons.geometry.io.euclidean.threed.txt.CsvBoundaryWriteHandler3D;
import org.apache.commons.geometry.io.euclidean.threed.txt.TextBoundaryWriteHandler3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractBoundaryWriteHandler3D_ESTest extends AbstractBoundaryWriteHandler3D_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjBoundaryWriteHandler3D objBoundaryWriteHandler3D0 = new ObjBoundaryWriteHandler3D();
      HashSet<SimpleFacetDefinition> hashSet0 = new HashSet<SimpleFacetDefinition>();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      StreamGeometryOutput streamGeometryOutput0 = new StreamGeometryOutput(pipedOutputStream0, (String) null);
      objBoundaryWriteHandler3D0.writeFacets((Collection<? extends FacetDefinition>) hashSet0, (GeometryOutput) streamGeometryOutput0);
      assertTrue(hashSet0.isEmpty());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StlBoundaryWriteHandler3D stlBoundaryWriteHandler3D0 = new StlBoundaryWriteHandler3D();
      Stack<SimpleFacetDefinition> stack0 = new Stack<SimpleFacetDefinition>();
      MockFile mockFile0 = new MockFile(";J(6oKhT^M_", ";J(6oKhT^M_");
      Path path0 = mockFile0.toPath();
      stack0.setSize(1557);
      FileGeometryOutput fileGeometryOutput0 = new FileGeometryOutput(path0);
      // Undeclared exception!
      try { 
        stlBoundaryWriteHandler3D0.writeFacets((Collection<? extends FacetDefinition>) stack0, (GeometryOutput) fileGeometryOutput0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.io.euclidean.threed.stl.StlBoundaryWriteHandler3D", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StlBoundaryWriteHandler3D stlBoundaryWriteHandler3D0 = new StlBoundaryWriteHandler3D();
      ArrayDeque<SimpleFacetDefinition> arrayDeque0 = new ArrayDeque<SimpleFacetDefinition>();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("E&xi%;0O  O");
      StreamGeometryOutput streamGeometryOutput0 = new StreamGeometryOutput(mockFileOutputStream0, "E&xi%;0O  O");
      // Undeclared exception!
      try { 
        stlBoundaryWriteHandler3D0.writeFacets((Collection<? extends FacetDefinition>) arrayDeque0, (GeometryOutput) streamGeometryOutput0);
        fail("Expecting exception: UncheckedIOException");
      } catch(UncheckedIOException e) {
         //
         // MockIOException: Error in writing to file
         //
         verifyException("org.apache.commons.geometry.io.core.internal.GeometryIOUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D0 = new CsvBoundaryWriteHandler3D();
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      FileGeometryOutput fileGeometryOutput0 = new FileGeometryOutput(path0);
      // Undeclared exception!
      try { 
        csvBoundaryWriteHandler3D0.write((BoundarySource3D) null, (GeometryOutput) fileGeometryOutput0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.io.euclidean.threed.AbstractBoundaryWriteHandler3D", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D0 = new CsvBoundaryWriteHandler3D();
      ConvexVolume convexVolume0 = ConvexVolume.full();
      // Undeclared exception!
      try { 
        csvBoundaryWriteHandler3D0.write((BoundarySource3D) convexVolume0, (GeometryOutput) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.io.core.internal.GeometryIOUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RegionBSPTree3D regionBSPTree3D0 = new RegionBSPTree3D();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      StreamGeometryOutput streamGeometryOutput0 = new StreamGeometryOutput(byteArrayOutputStream0);
      TextBoundaryWriteHandler3D textBoundaryWriteHandler3D0 = new TextBoundaryWriteHandler3D();
      textBoundaryWriteHandler3D0.write((BoundarySource3D) regionBSPTree3D0, (GeometryOutput) streamGeometryOutput0);
      assertNotNull(textBoundaryWriteHandler3D0.getLineSeparator());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RegionBSPTree3D regionBSPTree3D0 = new RegionBSPTree3D();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      StreamGeometryOutput streamGeometryOutput0 = new StreamGeometryOutput(byteArrayOutputStream0);
      TextBoundaryWriteHandler3D textBoundaryWriteHandler3D0 = new TextBoundaryWriteHandler3D();
      textBoundaryWriteHandler3D0.setFacetVertexCount(1);
      // Undeclared exception!
      try { 
        textBoundaryWriteHandler3D0.write((BoundarySource3D) regionBSPTree3D0, (GeometryOutput) streamGeometryOutput0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Facet vertex count must be less than 0 or greater than 2; was 1
         //
         verifyException("org.apache.commons.geometry.io.euclidean.threed.txt.TextFacetDefinitionWriter", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D0 = new CsvBoundaryWriteHandler3D();
      HashSet<SimpleFacetDefinition> hashSet0 = new HashSet<SimpleFacetDefinition>();
      StreamGeometryOutput streamGeometryOutput0 = new StreamGeometryOutput((OutputStream) null, "Sj(E#6a");
      // Undeclared exception!
      try { 
        csvBoundaryWriteHandler3D0.writeFacets((Collection<? extends FacetDefinition>) hashSet0, (GeometryOutput) streamGeometryOutput0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }
}
