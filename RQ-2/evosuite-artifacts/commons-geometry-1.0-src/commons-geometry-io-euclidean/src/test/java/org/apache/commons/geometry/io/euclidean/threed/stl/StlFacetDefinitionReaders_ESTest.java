/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:00:21 GMT 2022
 */

package org.apache.commons.geometry.io.euclidean.threed.stl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.Enumeration;
import org.apache.commons.geometry.io.euclidean.threed.FacetDefinitionReader;
import org.apache.commons.geometry.io.euclidean.threed.stl.StlFacetDefinitionReaders;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StlFacetDefinitionReaders_ESTest extends StlFacetDefinitionReaders_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        StlFacetDefinitionReaders.create((InputStream) null, charset0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.geometry.io.euclidean.threed.stl.StlFacetDefinitionReaders", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1396), (byte)1);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        StlFacetDefinitionReaders.create(sequenceInputStream0, charset0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Charset charset0 = Charset.defaultCharset();
      FacetDefinitionReader facetDefinitionReader0 = StlFacetDefinitionReaders.create(byteArrayInputStream0, charset0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(dataInputStream0, dataInputStream0);
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        StlFacetDefinitionReaders.create(sequenceInputStream0, charset0);
        fail("Expecting exception: UncheckedIOException");
      } catch(UncheckedIOException e) {
         //
         // MockIOException: null
         //
         verifyException("org.apache.commons.geometry.io.core.internal.GeometryIOUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0);
      // Undeclared exception!
      try { 
        StlFacetDefinitionReaders.create(pushbackInputStream0, (Charset) null);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // Cannot determine STL format: attempted to read 5 bytes but found only -1 available
         //
         verifyException("org.apache.commons.geometry.io.core.internal.GeometryIOUtils", e);
      }
  }
}
