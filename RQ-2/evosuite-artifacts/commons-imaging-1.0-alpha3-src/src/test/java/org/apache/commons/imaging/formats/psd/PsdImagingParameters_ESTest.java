/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:06:10 GMT 2022
 */

package org.apache.commons.imaging.formats.psd;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.imaging.formats.psd.PsdImagingParameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PsdImagingParameters_ESTest extends PsdImagingParameters_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PsdImagingParameters psdImagingParameters0 = new PsdImagingParameters();
      assertNotNull(psdImagingParameters0.getFileName());
}
}
