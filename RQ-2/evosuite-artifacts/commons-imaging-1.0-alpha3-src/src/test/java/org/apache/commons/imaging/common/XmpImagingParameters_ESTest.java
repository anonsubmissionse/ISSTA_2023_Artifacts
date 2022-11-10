/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:10:17 GMT 2022
 */

package org.apache.commons.imaging.common;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.imaging.common.XmpImagingParameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmpImagingParameters_ESTest extends XmpImagingParameters_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmpImagingParameters xmpImagingParameters0 = new XmpImagingParameters();
      xmpImagingParameters0.setXmpXml("org.apache.commons.imaging.common.SimpleBufferedImageFactory");
      String string0 = xmpImagingParameters0.getXmpXml();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmpImagingParameters xmpImagingParameters0 = new XmpImagingParameters();
      xmpImagingParameters0.setXmpXml("");
      String string0 = xmpImagingParameters0.getXmpXml();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmpImagingParameters xmpImagingParameters0 = new XmpImagingParameters();
      String string0 = xmpImagingParameters0.getXmpXml();
      assertNotNull(string0);
}
}
