/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:10:31 GMT 2022
 */

package org.apache.commons.imaging.formats.jpeg;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.imaging.formats.jpeg.JpegImagingParameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JpegImagingParameters_ESTest extends JpegImagingParameters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JpegImagingParameters jpegImagingParameters0 = new JpegImagingParameters();
      assertNull(jpegImagingParameters0.getFileName());
  }
}
