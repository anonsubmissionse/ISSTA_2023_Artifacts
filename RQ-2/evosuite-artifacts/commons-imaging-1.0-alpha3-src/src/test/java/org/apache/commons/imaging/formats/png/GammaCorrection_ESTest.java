/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 00:01:49 GMT 2022
 */

package org.apache.commons.imaging.formats.png;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.imaging.formats.png.GammaCorrection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GammaCorrection_ESTest extends GammaCorrection_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GammaCorrection gammaCorrection0 = new GammaCorrection((-745.65), (-745.65));
      int int0 = gammaCorrection0.correctARGB(531);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GammaCorrection gammaCorrection0 = new GammaCorrection(0.0, 1608.37);
      int int0 = gammaCorrection0.correctSample(0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GammaCorrection gammaCorrection0 = new GammaCorrection(1.0, (-276.56));
      int int0 = gammaCorrection0.correctSample(0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GammaCorrection gammaCorrection0 = new GammaCorrection((-4732.4700609847), (-4732.4700609847));
      int int0 = gammaCorrection0.correctARGB(0);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GammaCorrection gammaCorrection0 = new GammaCorrection(1.0, (-276.56));
      int int0 = gammaCorrection0.correctARGB(0);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GammaCorrection gammaCorrection0 = new GammaCorrection(0.0, 0.0);
      // Undeclared exception!
      try { 
        gammaCorrection0.correctSample((-422));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -422
         //
         verifyException("org.apache.commons.imaging.formats.png.GammaCorrection", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GammaCorrection gammaCorrection0 = new GammaCorrection(0.0, 0.0);
      int int0 = gammaCorrection0.correctSample(16);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GammaCorrection gammaCorrection0 = new GammaCorrection((-26), (-26));
      int int0 = gammaCorrection0.correctARGB((-26));
      assertEquals(1, int0);
}
}
