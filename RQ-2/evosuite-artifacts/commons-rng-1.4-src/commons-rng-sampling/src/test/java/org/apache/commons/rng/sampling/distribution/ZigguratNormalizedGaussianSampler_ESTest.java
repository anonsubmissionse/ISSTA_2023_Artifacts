/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:37:27 GMT 2022
 */

package org.apache.commons.rng.sampling.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.sampling.distribution.SharedStateContinuousSampler;
import org.apache.commons.rng.sampling.distribution.ZigguratNormalizedGaussianSampler;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZigguratNormalizedGaussianSampler_ESTest extends ZigguratNormalizedGaussianSampler_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      ZigguratNormalizedGaussianSampler zigguratNormalizedGaussianSampler0 = new ZigguratNormalizedGaussianSampler(jDKRandomWrapper0);
      Random.setNextRandom((-2147483647));
      double double0 = zigguratNormalizedGaussianSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      ZigguratNormalizedGaussianSampler zigguratNormalizedGaussianSampler0 = new ZigguratNormalizedGaussianSampler(jDKRandomWrapper0);
      Random.setNextRandom((-2147483647));
      double double0 = zigguratNormalizedGaussianSampler0.sample();
      double double1 = zigguratNormalizedGaussianSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ZigguratNormalizedGaussianSampler zigguratNormalizedGaussianSampler0 = ZigguratNormalizedGaussianSampler.of((UniformRandomProvider) null);
      // Undeclared exception!
      try { 
        zigguratNormalizedGaussianSampler0.toString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper((java.util.Random) null);
      ZigguratNormalizedGaussianSampler zigguratNormalizedGaussianSampler0 = new ZigguratNormalizedGaussianSampler(jDKRandomWrapper0);
      // Undeclared exception!
      try { 
        zigguratNormalizedGaussianSampler0.sample();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.simple.JDKRandomWrapper", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      ZigguratNormalizedGaussianSampler zigguratNormalizedGaussianSampler0 = ZigguratNormalizedGaussianSampler.of((UniformRandomProvider) jDKRandomWrapper0);
      double double0 = zigguratNormalizedGaussianSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Random.setNextRandom(257);
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      ZigguratNormalizedGaussianSampler zigguratNormalizedGaussianSampler0 = new ZigguratNormalizedGaussianSampler(jDKRandomWrapper0);
      double double0 = zigguratNormalizedGaussianSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      ZigguratNormalizedGaussianSampler zigguratNormalizedGaussianSampler0 = new ZigguratNormalizedGaussianSampler(jDKRandomWrapper0);
      String string0 = zigguratNormalizedGaussianSampler0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      ZigguratNormalizedGaussianSampler zigguratNormalizedGaussianSampler0 = new ZigguratNormalizedGaussianSampler(jDKRandomWrapper0);
      SharedStateContinuousSampler sharedStateContinuousSampler0 = zigguratNormalizedGaussianSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      ;
}
}
