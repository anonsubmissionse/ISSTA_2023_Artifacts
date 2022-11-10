/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:03:29 GMT 2022
 */

package org.apache.commons.imaging.formats.jpeg.segments;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.imaging.formats.jpeg.segments.SosSegment;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SosSegment_ESTest extends SosSegment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)87;
      byteArray0[4] = (byte)35;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.read();
      SosSegment sosSegment0 = null;
      try {
        sosSegment0 = new SosSegment(0, 15, byteArrayInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Not a Valid JPEG File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      SosSegment sosSegment0 = new SosSegment((-360), byteArray0);
      assertEquals(0, sosSegment0.successiveApproximationBitLow);
      assertEquals(0, sosSegment0.successiveApproximationBitHigh);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)1;
      SosSegment sosSegment0 = new SosSegment((-2239), byteArray0);
      SosSegment.Component sosSegment_Component0 = sosSegment0.getComponents((int) (byte)0);
      assertEquals(0, sosSegment0.successiveApproximationBitHigh);
      assertEquals(0, sosSegment_Component0.dcCodingTableSelector);
      assertNotNull(sosSegment_Component0);
      assertEquals(0, sosSegment_Component0.acCodingTableSelector);
      assertEquals(0, sosSegment_Component0.scanComponentSelector);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SosSegment sosSegment0 = null;
      try {
        sosSegment0 = new SosSegment(0, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.jpeg.segments.SosSegment", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-88);
      SosSegment sosSegment0 = null;
      try {
        sosSegment0 = new SosSegment((-2384), byteArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.jpeg.segments.SosSegment", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      SosSegment sosSegment0 = null;
      try {
        sosSegment0 = new SosSegment((-20), byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Not a Valid JPEG File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SosSegment sosSegment0 = null;
      try {
        sosSegment0 = new SosSegment((-450), (-450), (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-54);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 4);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      SosSegment sosSegment0 = null;
      try {
        sosSegment0 = new SosSegment(0, 0, bufferedInputStream0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.jpeg.segments.SosSegment", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-104), 16);
      SosSegment sosSegment0 = null;
      try {
        sosSegment0 = new SosSegment(16, (-480), byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SosSegment sosSegment0 = new SosSegment(0, 15, byteArrayInputStream0);
      assertEquals(0, sosSegment0.successiveApproximationBitLow);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)1;
      SosSegment sosSegment0 = new SosSegment(0, byteArray0);
      SosSegment.Component[] sosSegment_ComponentArray0 = sosSegment0.getComponents();
      assertEquals(0, sosSegment0.successiveApproximationBitLow);
      assertEquals(1, sosSegment_ComponentArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      SosSegment sosSegment0 = new SosSegment(0, byteArray0);
      // Undeclared exception!
      try { 
        sosSegment0.getComponents((int) (byte) (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.imaging.formats.jpeg.segments.SosSegment", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      SosSegment sosSegment0 = new SosSegment(0, byteArray0);
      SosSegment.Component[] sosSegment_ComponentArray0 = sosSegment0.getComponents();
      assertEquals(0, sosSegment0.successiveApproximationBitLow);
      assertEquals(0, sosSegment_ComponentArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      SosSegment sosSegment0 = new SosSegment(0, byteArray0);
      String string0 = sosSegment0.getDescription();
      assertEquals("SOS (Unknown)", string0);
      assertEquals(0, sosSegment0.successiveApproximationBitLow);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SosSegment.Component sosSegment_Component0 = new SosSegment.Component(435, 435, (-10));
      assertEquals((-10), sosSegment_Component0.acCodingTableSelector);
      assertEquals(435, sosSegment_Component0.dcCodingTableSelector);
      assertEquals(435, sosSegment_Component0.scanComponentSelector);
  }
}
