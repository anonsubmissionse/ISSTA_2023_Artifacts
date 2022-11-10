/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:01:45 GMT 2022
 */

package org.apache.commons.geometry.io.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import org.apache.commons.geometry.euclidean.threed.BoundaryList3D;
import org.apache.commons.geometry.euclidean.threed.ConvexVolume;
import org.apache.commons.geometry.euclidean.threed.Plane;
import org.apache.commons.geometry.euclidean.threed.PlaneConvexSubset;
import org.apache.commons.geometry.euclidean.threed.RegionBSPTree3D;
import org.apache.commons.geometry.euclidean.threed.mesh.TriangleMesh;
import org.apache.commons.geometry.io.core.GeometryFormat;
import org.apache.commons.geometry.io.core.input.GeometryInput;
import org.apache.commons.geometry.io.core.output.GeometryOutput;
import org.apache.commons.geometry.io.euclidean.threed.BoundaryIOManager3D;
import org.apache.commons.geometry.io.euclidean.threed.FacetDefinition;
import org.apache.commons.geometry.io.euclidean.threed.SimpleFacetDefinition;
import org.apache.commons.geometry.io.euclidean.threed.obj.ObjBoundaryWriteHandler3D;
import org.apache.commons.geometry.io.euclidean.threed.stl.StlBoundaryWriteHandler3D;
import org.apache.commons.geometry.io.euclidean.threed.txt.CsvBoundaryWriteHandler3D;
import org.apache.commons.geometry.io.euclidean.threed.txt.TextBoundaryWriteHandler3D;
import org.apache.commons.numbers.core.Precision;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BoundaryIOManager3D_ESTest extends BoundaryIOManager3D_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      Iterator<SimpleFacetDefinition> iterator0 = (Iterator<SimpleFacetDefinition>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iterator0).hasNext();
      Stream<SimpleFacetDefinition> stream0 = (Stream<SimpleFacetDefinition>) mock(Stream.class, new ViolatedAssumptionAnswer());
      doReturn(iterator0).when(stream0).iterator();
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D0 = new CsvBoundaryWriteHandler3D();
      Charset charset0 = csvBoundaryWriteHandler3D0.getDefaultCharset();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      GeometryOutput geometryOutput0 = mock(GeometryOutput.class, new ViolatedAssumptionAnswer());
      doReturn(charset0, charset0).when(geometryOutput0).getCharset();
      doReturn("org.apache.commons.geometry.io.euclidean.threed.BoundaryIOManager3D").when(geometryOutput0).getFileName();
      doReturn(outputStream0).when(geometryOutput0).getOutputStream();
      boundaryIOManager3D0.registerDefaultHandlers();
      GeometryFormat geometryFormat0 = csvBoundaryWriteHandler3D0.getFormat();
      boundaryIOManager3D0.writeFacets(stream0, geometryOutput0, geometryFormat0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      boundaryIOManager3D0.registerDefaultHandlers();
      ConvexVolume convexVolume0 = ConvexVolume.full();
      List<PlaneConvexSubset> list0 = convexVolume0.getBoundaries();
      BoundaryList3D boundaryList3D0 = new BoundaryList3D(list0);
      Stream<PlaneConvexSubset> stream0 = boundaryList3D0.boundaryStream();
      ObjBoundaryWriteHandler3D objBoundaryWriteHandler3D0 = new ObjBoundaryWriteHandler3D();
      Charset charset0 = objBoundaryWriteHandler3D0.getDefaultCharset();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      GeometryOutput geometryOutput0 = mock(GeometryOutput.class, new ViolatedAssumptionAnswer());
      doReturn(charset0, (Charset) null).when(geometryOutput0).getCharset();
      doReturn((String) null).when(geometryOutput0).getFileName();
      doReturn(outputStream0).when(geometryOutput0).getOutputStream();
      TextBoundaryWriteHandler3D textBoundaryWriteHandler3D0 = new TextBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = textBoundaryWriteHandler3D0.getFormat();
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.write(stream0, geometryOutput0, geometryFormat0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // charset
         //
         verifyException("java.io.OutputStreamWriter", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      boundaryIOManager3D0.registerDefaultHandlers();
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D0 = new CsvBoundaryWriteHandler3D();
      Charset charset0 = csvBoundaryWriteHandler3D0.getDefaultCharset();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn((-3360)).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      GeometryInput geometryInput0 = mock(GeometryInput.class, new ViolatedAssumptionAnswer());
      doReturn(charset0, charset0).when(geometryInput0).getCharset();
      doReturn("org.apache.commons.geometry.core.partitioning.bsp.AbstractBSPTreeMergeOperator").when(geometryInput0).getFileName();
      doReturn(inputStream0).when(geometryInput0).getInputStream();
      ObjBoundaryWriteHandler3D objBoundaryWriteHandler3D0 = new ObjBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = objBoundaryWriteHandler3D0.getFormat();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      TriangleMesh triangleMesh0 = boundaryIOManager3D0.readTriangleMesh(geometryInput0, geometryFormat0, precision_DoubleEquivalence0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      boundaryIOManager3D0.registerDefaultHandlers();
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D0 = new CsvBoundaryWriteHandler3D();
      Charset charset0 = csvBoundaryWriteHandler3D0.getDefaultCharset();
      ObjBoundaryWriteHandler3D objBoundaryWriteHandler3D0 = new ObjBoundaryWriteHandler3D();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      GeometryInput geometryInput0 = mock(GeometryInput.class, new ViolatedAssumptionAnswer());
      doReturn(charset0, charset0).when(geometryInput0).getCharset();
      doReturn("Cannot determine STL format: attempted to read {0} bytes but found only {1} available").when(geometryInput0).getFileName();
      doReturn(inputStream0, inputStream0).when(geometryInput0).getInputStream();
      GeometryFormat geometryFormat0 = objBoundaryWriteHandler3D0.getFormat();
      Stream<FacetDefinition> stream0 = boundaryIOManager3D0.facets(geometryInput0, geometryFormat0);
      assertNotNull(stream0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      Stream<SimpleFacetDefinition> stream0 = (Stream<SimpleFacetDefinition>) mock(Stream.class, new ViolatedAssumptionAnswer());
      boundaryIOManager3D0.registerDefaultHandlers();
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D0 = new CsvBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = csvBoundaryWriteHandler3D0.getFormat();
      GeometryOutput geometryOutput0 = mock(GeometryOutput.class, new ViolatedAssumptionAnswer());
      doReturn((Charset) null).when(geometryOutput0).getCharset();
      doReturn((String) null).when(geometryOutput0).getFileName();
      doReturn((OutputStream) null).when(geometryOutput0).getOutputStream();
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.writeFacets(stream0, geometryOutput0, geometryFormat0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      Stream<SimpleFacetDefinition> stream0 = (Stream<SimpleFacetDefinition>) mock(Stream.class, new ViolatedAssumptionAnswer());
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D0 = new CsvBoundaryWriteHandler3D();
      Charset charset0 = csvBoundaryWriteHandler3D0.getDefaultCharset();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      GeometryOutput geometryOutput0 = mock(GeometryOutput.class, new ViolatedAssumptionAnswer());
      doReturn(charset0, (Charset) null).when(geometryOutput0).getCharset();
      doReturn("org.apache.commons.geometry.io.euclidean.threed.BoundaryIOManager3D").when(geometryOutput0).getFileName();
      doReturn(outputStream0).when(geometryOutput0).getOutputStream();
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D1 = new CsvBoundaryWriteHandler3D();
      boundaryIOManager3D0.registerDefaultHandlers();
      GeometryFormat geometryFormat0 = csvBoundaryWriteHandler3D1.getFormat();
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.writeFacets(stream0, geometryOutput0, geometryFormat0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // charset
         //
         verifyException("java.io.OutputStreamWriter", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      GeometryOutput geometryOutput0 = mock(GeometryOutput.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(geometryOutput0).getFileName();
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.writeFacets((Collection<? extends FacetDefinition>) null, geometryOutput0, (GeometryFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Failed to find handler: no format specified and no file extension available
         //
         verifyException("org.apache.commons.geometry.io.core.BoundaryIOManager$HandlerRegistry", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      boundaryIOManager3D0.registerDefaultHandlers();
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D0 = new CsvBoundaryWriteHandler3D();
      Charset charset0 = csvBoundaryWriteHandler3D0.getDefaultCharset();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      GeometryOutput geometryOutput0 = mock(GeometryOutput.class, new ViolatedAssumptionAnswer());
      doReturn(charset0, (Charset) null).when(geometryOutput0).getCharset();
      doReturn("=,P\"").when(geometryOutput0).getFileName();
      doReturn(outputStream0).when(geometryOutput0).getOutputStream();
      TextBoundaryWriteHandler3D textBoundaryWriteHandler3D0 = new TextBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = textBoundaryWriteHandler3D0.getFormat();
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.write((Stream<? extends PlaneConvexSubset>) null, geometryOutput0, geometryFormat0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // charset
         //
         verifyException("java.io.OutputStreamWriter", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      boundaryIOManager3D0.registerDefaultHandlers();
      GeometryInput geometryInput0 = mock(GeometryInput.class, new ViolatedAssumptionAnswer());
      doReturn((Charset) null).when(geometryInput0).getCharset();
      doReturn((String) null).when(geometryInput0).getFileName();
      doReturn((InputStream) null, (InputStream) null).when(geometryInput0).getInputStream();
      StlBoundaryWriteHandler3D stlBoundaryWriteHandler3D0 = new StlBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = stlBoundaryWriteHandler3D0.getFormat();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.triangles(geometryInput0, geometryFormat0, precision_DoubleEquivalence0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.io.euclidean.threed.stl.StlFacetDefinitionReaders", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      boundaryIOManager3D0.registerDefaultHandlers();
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D0 = new CsvBoundaryWriteHandler3D();
      Charset charset0 = csvBoundaryWriteHandler3D0.getDefaultCharset();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream0).read(any(byte[].class));
      GeometryInput geometryInput0 = mock(GeometryInput.class, new ViolatedAssumptionAnswer());
      doReturn(charset0, (Charset) null).when(geometryInput0).getCharset();
      doReturn("w}&6r").when(geometryInput0).getFileName();
      doReturn(inputStream0, inputStream0).when(geometryInput0).getInputStream();
      StlBoundaryWriteHandler3D stlBoundaryWriteHandler3D0 = new StlBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = stlBoundaryWriteHandler3D0.getFormat();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.triangles(geometryInput0, geometryFormat0, precision_DoubleEquivalence0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // Cannot determine STL format: attempted to read 5 bytes but found only 0 available
         //
         verifyException("org.apache.commons.geometry.io.core.internal.GeometryIOUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      GeometryInput geometryInput0 = mock(GeometryInput.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(geometryInput0).getFileName();
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D0 = new CsvBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = csvBoundaryWriteHandler3D0.getFormat();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.triangles(geometryInput0, geometryFormat0, precision_DoubleEquivalence0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Failed to find handler for format \"CSV\"
         //
         verifyException("org.apache.commons.geometry.io.core.BoundaryIOManager$HandlerRegistry", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      boundaryIOManager3D0.registerDefaultHandlers();
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D0 = new CsvBoundaryWriteHandler3D();
      Charset charset0 = csvBoundaryWriteHandler3D0.getDefaultCharset();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      GeometryInput geometryInput0 = mock(GeometryInput.class, new ViolatedAssumptionAnswer());
      doReturn(charset0, (Charset) null).when(geometryInput0).getCharset();
      doReturn("org.apache.commons.geometry.core.partitioning.bsp.AbstractBSPTreeMergeOperator").when(geometryInput0).getFileName();
      doReturn(inputStream0).when(geometryInput0).getInputStream();
      ObjBoundaryWriteHandler3D objBoundaryWriteHandler3D0 = new ObjBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = objBoundaryWriteHandler3D0.getFormat();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.readTriangleMesh(geometryInput0, geometryFormat0, precision_DoubleEquivalence0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // charset
         //
         verifyException("java.io.InputStreamReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      boundaryIOManager3D0.registerDefaultHandlers();
      GeometryInput geometryInput0 = mock(GeometryInput.class, new ViolatedAssumptionAnswer());
      doReturn((Charset) null).when(geometryInput0).getCharset();
      doReturn((String) null).when(geometryInput0).getFileName();
      doReturn((InputStream) null).when(geometryInput0).getInputStream();
      StlBoundaryWriteHandler3D stlBoundaryWriteHandler3D0 = new StlBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = stlBoundaryWriteHandler3D0.getFormat();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.readTriangleMesh(geometryInput0, geometryFormat0, precision_DoubleEquivalence0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.io.euclidean.threed.stl.StlFacetDefinitionReaders", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      boundaryIOManager3D0.registerDefaultHandlers();
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D0 = new CsvBoundaryWriteHandler3D();
      Charset charset0 = csvBoundaryWriteHandler3D0.getDefaultCharset();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream0).read(any(byte[].class));
      GeometryInput geometryInput0 = mock(GeometryInput.class, new ViolatedAssumptionAnswer());
      doReturn(charset0, (Charset) null).when(geometryInput0).getCharset();
      doReturn("No token has been read from the character stream").when(geometryInput0).getFileName();
      doReturn(inputStream0).when(geometryInput0).getInputStream();
      StlBoundaryWriteHandler3D stlBoundaryWriteHandler3D0 = new StlBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = stlBoundaryWriteHandler3D0.getFormat();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.readTriangleMesh(geometryInput0, geometryFormat0, precision_DoubleEquivalence0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // Cannot determine STL format: attempted to read 5 bytes but found only 0 available
         //
         verifyException("org.apache.commons.geometry.io.core.internal.GeometryIOUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      TextBoundaryWriteHandler3D textBoundaryWriteHandler3D0 = new TextBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = textBoundaryWriteHandler3D0.getFormat();
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.facets((GeometryInput) null, geometryFormat0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // Input cannot be null
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D0 = new CsvBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = csvBoundaryWriteHandler3D0.getFormat();
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.facetDefinitionReader((GeometryInput) null, geometryFormat0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // Input cannot be null
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      GeometryInput geometryInput0 = mock(GeometryInput.class, new ViolatedAssumptionAnswer());
      doReturn((Charset) null).when(geometryInput0).getCharset();
      doReturn((String) null).when(geometryInput0).getFileName();
      doReturn((InputStream) null).when(geometryInput0).getInputStream();
      StlBoundaryWriteHandler3D stlBoundaryWriteHandler3D0 = new StlBoundaryWriteHandler3D();
      boundaryIOManager3D0.registerDefaultHandlers();
      GeometryFormat geometryFormat0 = stlBoundaryWriteHandler3D0.getFormat();
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.facetDefinitionReader(geometryInput0, geometryFormat0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.io.euclidean.threed.stl.StlFacetDefinitionReaders", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      CsvBoundaryWriteHandler3D csvBoundaryWriteHandler3D0 = new CsvBoundaryWriteHandler3D();
      Charset charset0 = csvBoundaryWriteHandler3D0.getDefaultCharset();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream0).read(any(byte[].class));
      GeometryInput geometryInput0 = mock(GeometryInput.class, new ViolatedAssumptionAnswer());
      doReturn(charset0, (Charset) null).when(geometryInput0).getCharset();
      doReturn("'WoIs").when(geometryInput0).getFileName();
      doReturn(inputStream0).when(geometryInput0).getInputStream();
      StlBoundaryWriteHandler3D stlBoundaryWriteHandler3D0 = new StlBoundaryWriteHandler3D();
      boundaryIOManager3D0.registerDefaultHandlers();
      GeometryFormat geometryFormat0 = stlBoundaryWriteHandler3D0.getFormat();
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.facetDefinitionReader(geometryInput0, geometryFormat0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // Cannot determine STL format: attempted to read 5 bytes but found only 0 available
         //
         verifyException("org.apache.commons.geometry.io.core.internal.GeometryIOUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      ObjBoundaryWriteHandler3D objBoundaryWriteHandler3D0 = new ObjBoundaryWriteHandler3D();
      GeometryInput geometryInput0 = mock(GeometryInput.class, new ViolatedAssumptionAnswer());
      doReturn("Cannot determine STL format: attempted to read {0} bytes but found only {1} available").when(geometryInput0).getFileName();
      GeometryFormat geometryFormat0 = objBoundaryWriteHandler3D0.getFormat();
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.facets(geometryInput0, geometryFormat0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Failed to find handler for format \"OBJ\"
         //
         verifyException("org.apache.commons.geometry.io.core.BoundaryIOManager$HandlerRegistry", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      boundaryIOManager3D0.registerDefaultHandlers();
      GeometryInput geometryInput0 = mock(GeometryInput.class, new ViolatedAssumptionAnswer());
      doReturn((Charset) null).when(geometryInput0).getCharset();
      doReturn((String) null).when(geometryInput0).getFileName();
      doReturn((InputStream) null, (InputStream) null).when(geometryInput0).getInputStream();
      ObjBoundaryWriteHandler3D objBoundaryWriteHandler3D0 = new ObjBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = objBoundaryWriteHandler3D0.getFormat();
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.facets(geometryInput0, geometryFormat0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      Stream<SimpleFacetDefinition> stream0 = (Stream<SimpleFacetDefinition>) mock(Stream.class, new ViolatedAssumptionAnswer());
      GeometryOutput geometryOutput0 = mock(GeometryOutput.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(geometryOutput0).getFileName();
      TextBoundaryWriteHandler3D textBoundaryWriteHandler3D0 = new TextBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = textBoundaryWriteHandler3D0.getFormat();
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.writeFacets(stream0, geometryOutput0, geometryFormat0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Failed to find handler for format \"TXT\"
         //
         verifyException("org.apache.commons.geometry.io.core.BoundaryIOManager$HandlerRegistry", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      GeometryInput geometryInput0 = mock(GeometryInput.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(geometryInput0).getFileName();
      TextBoundaryWriteHandler3D textBoundaryWriteHandler3D0 = new TextBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = textBoundaryWriteHandler3D0.getFormat();
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.facetDefinitionReader(geometryInput0, geometryFormat0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Failed to find handler for format \"TXT\"
         //
         verifyException("org.apache.commons.geometry.io.core.BoundaryIOManager$HandlerRegistry", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      TextBoundaryWriteHandler3D textBoundaryWriteHandler3D0 = new TextBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = textBoundaryWriteHandler3D0.getFormat();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.triangles((GeometryInput) null, geometryFormat0, precision_DoubleEquivalence0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // Input cannot be null
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      TextBoundaryWriteHandler3D textBoundaryWriteHandler3D0 = new TextBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = textBoundaryWriteHandler3D0.getFormat();
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.writeFacets((Collection<? extends FacetDefinition>) null, (GeometryOutput) null, geometryFormat0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // Output cannot be null
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      ConvexVolume convexVolume0 = ConvexVolume.full();
      Stream<PlaneConvexSubset> stream0 = convexVolume0.boundaryStream();
      GeometryOutput geometryOutput0 = mock(GeometryOutput.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(geometryOutput0).getFileName();
      TextBoundaryWriteHandler3D textBoundaryWriteHandler3D0 = new TextBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = textBoundaryWriteHandler3D0.getFormat();
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.write(stream0, geometryOutput0, geometryFormat0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Failed to find handler for format \"TXT\"
         //
         verifyException("org.apache.commons.geometry.io.core.BoundaryIOManager$HandlerRegistry", e);
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BoundaryIOManager3D boundaryIOManager3D0 = new BoundaryIOManager3D();
      GeometryInput geometryInput0 = mock(GeometryInput.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(geometryInput0).getFileName();
      ObjBoundaryWriteHandler3D objBoundaryWriteHandler3D0 = new ObjBoundaryWriteHandler3D();
      GeometryFormat geometryFormat0 = objBoundaryWriteHandler3D0.getFormat();
      Precision.DoubleEquivalence precision_DoubleEquivalence0 = mock(Precision.DoubleEquivalence.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        boundaryIOManager3D0.readTriangleMesh(geometryInput0, geometryFormat0, precision_DoubleEquivalence0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Failed to find handler for format \"OBJ\"
         //
         verifyException("org.apache.commons.geometry.io.core.BoundaryIOManager$HandlerRegistry", e);
      }
  }
}
