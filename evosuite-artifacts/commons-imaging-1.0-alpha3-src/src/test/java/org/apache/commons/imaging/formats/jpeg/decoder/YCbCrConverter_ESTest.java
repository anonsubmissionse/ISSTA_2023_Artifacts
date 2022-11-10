/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:08:32 GMT 2022
 */

package org.apache.commons.imaging.formats.jpeg.decoder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.imaging.formats.jpeg.decoder.YCbCrConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class YCbCrConverter_ESTest extends YCbCrConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = YCbCrConverter.convertYCbCrToRGB(2960, 99, 0);
      assertEquals(60524, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        YCbCrConverter.convertYCbCrToRGB(34304, 0, 2179);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 558848
         //
         verifyException("org.apache.commons.imaging.formats.jpeg.decoder.YCbCrConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = YCbCrConverter.convertYCbCrToRGB(0, 128, 128);
      assertEquals(0, int0);
  }
}
