/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:10:30 GMT 2022
 */

package org.apache.commons.imaging.formats.jpeg.segments;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.apache.commons.imaging.formats.jpeg.segments.UnknownSegment;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnknownSegment_ESTest extends UnknownSegment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnknownSegment unknownSegment0 = null;
      try {
        unknownSegment0 = new UnknownSegment(65495, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.jpeg.segments.GenericSegment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnknownSegment unknownSegment0 = null;
      try {
        unknownSegment0 = new UnknownSegment((-1), 519, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnknownSegment unknownSegment0 = new UnknownSegment(0, 0, (InputStream) null);
      assertEquals(0, unknownSegment0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      UnknownSegment unknownSegment0 = new UnknownSegment((byte)5, byteArray0);
      String string0 = unknownSegment0.getDescription();
      assertEquals("Unknown (Unknown)", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1074);
      UnknownSegment unknownSegment0 = null;
      try {
        unknownSegment0 = new UnknownSegment(1074, 1074, pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
}
