/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:10:02 GMT 2022
 */

package org.apache.commons.imaging.formats.icns;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.imaging.formats.icns.IcnsImagingParameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IcnsImagingParameters_ESTest extends IcnsImagingParameters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IcnsImagingParameters icnsImagingParameters0 = new IcnsImagingParameters();
      assertNull(icnsImagingParameters0.getFileName());
  }
}
