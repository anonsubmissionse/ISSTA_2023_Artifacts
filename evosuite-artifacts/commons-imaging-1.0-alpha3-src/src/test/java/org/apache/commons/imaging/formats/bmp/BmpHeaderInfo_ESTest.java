/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:08:17 GMT 2022
 */

package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.imaging.formats.bmp.BmpHeaderInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BmpHeaderInfo_ESTest extends BmpHeaderInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BmpHeaderInfo.ColorSpace bmpHeaderInfo_ColorSpace0 = new BmpHeaderInfo.ColorSpace();
      BmpHeaderInfo bmpHeaderInfo0 = new BmpHeaderInfo((byte) (-7), (byte)0, 1678, 3205, 1678, 2894, 1678, (byte) (-7), 2894, 1, 2894, 0, 1, (-1), 1, 3205, 0, 0, 3205, 0, 0, bmpHeaderInfo_ColorSpace0, (-1), 1, (-1), 2894, (-505), 1678, 0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BmpHeaderInfo.ColorSpaceCoordinate bmpHeaderInfo_ColorSpaceCoordinate0 = new BmpHeaderInfo.ColorSpaceCoordinate();
  }
}
