/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:45:11 GMT 2022
 */

package org.apache.commons.rng.sampling.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.sampling.distribution.PoissonSampler;
import org.apache.commons.rng.sampling.distribution.SharedStateDiscreteSampler;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PoissonSampler_ESTest extends PoissonSampler_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-1534L));
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      SharedStateDiscreteSampler sharedStateDiscreteSampler0 = PoissonSampler.of(jDKRandomWrapper0, 40.0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-1810L));
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      PoissonSampler poissonSampler0 = new PoissonSampler(jDKRandomWrapper0, 6.0);
      int int0 = poissonSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(2114L);
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      PoissonSampler poissonSampler0 = new PoissonSampler(jDKRandomWrapper0, 2114L);
      // Undeclared exception!
      poissonSampler0.sample();
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PoissonSampler poissonSampler0 = new PoissonSampler((UniformRandomProvider) null, 735.8645914318064);
      // Undeclared exception!
      try { 
        poissonSampler0.sample();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.sampling.distribution.KempSmallMeanPoissonSampler", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      PoissonSampler poissonSampler0 = null;
      try {
        poissonSampler0 = new PoissonSampler(jDKRandomWrapper0, (-1430.134));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // mean is not strictly positive: -1430.134
         //
         verifyException("org.apache.commons.rng.sampling.distribution.SmallMeanPoissonSampler", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      // Undeclared exception!
      try { 
        PoissonSampler.of(jDKRandomWrapper0, (-44.79014700404934));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // mean is not strictly positive: -44.79014700404934
         //
         verifyException("org.apache.commons.rng.sampling.distribution.SmallMeanPoissonSampler", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      PoissonSampler poissonSampler0 = new PoissonSampler(jDKRandomWrapper0, 1320.1583093144677);
      int int0 = poissonSampler0.sample();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      PoissonSampler poissonSampler0 = new PoissonSampler(jDKRandomWrapper0, 1320.1583093144677);
      SharedStateDiscreteSampler sharedStateDiscreteSampler0 = poissonSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      PoissonSampler poissonSampler0 = new PoissonSampler(jDKRandomWrapper0, 1320.1583093144677);
      String string0 = poissonSampler0.toString();
      assertNotNull(string0);
}
}
