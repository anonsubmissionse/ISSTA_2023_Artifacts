/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:06:56 GMT 2022
 */

package org.apache.commons.imaging.formats.xpm;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.imaging.formats.xpm.XpmImagingParameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XpmImagingParameters_ESTest extends XpmImagingParameters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XpmImagingParameters xpmImagingParameters0 = new XpmImagingParameters();
      assertFalse(xpmImagingParameters0.isStrict());
  }
}
