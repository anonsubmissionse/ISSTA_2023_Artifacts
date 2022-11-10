/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:33:42 GMT 2022
 */

package org.apache.commons.rng.sampling;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.apache.commons.rng.sampling.DiscreteProbabilityCollectionSampler;
import org.apache.commons.rng.sampling.distribution.AliasMethodDiscreteSampler;
import org.apache.commons.rng.sampling.distribution.GuideTableDiscreteSampler;
import org.apache.commons.rng.sampling.distribution.InverseTransformDiscreteSampler;
import org.apache.commons.rng.sampling.distribution.RejectionInversionZipfSampler;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiscreteProbabilityCollectionSampler_ESTest extends DiscreteProbabilityCollectionSampler_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1879.3437560904;
      LinkedList<AliasMethodDiscreteSampler> linkedList0 = new LinkedList<AliasMethodDiscreteSampler>();
      linkedList0.add((AliasMethodDiscreteSampler) null);
      DiscreteProbabilityCollectionSampler<AliasMethodDiscreteSampler> discreteProbabilityCollectionSampler0 = new DiscreteProbabilityCollectionSampler<AliasMethodDiscreteSampler>(jDKRandomWrapper0, linkedList0, doubleArray0);
      AliasMethodDiscreteSampler aliasMethodDiscreteSampler0 = discreteProbabilityCollectionSampler0.sample();
      assertNotNull(aliasMethodDiscreteSampler0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      double[] doubleArray0 = new double[1];
      Integer integer0 = new Integer(1);
      linkedList0.add(integer0);
      doubleArray0[0] = 1879.3437560904;
      DiscreteProbabilityCollectionSampler<Integer> discreteProbabilityCollectionSampler0 = new DiscreteProbabilityCollectionSampler<Integer>(jDKRandomWrapper0, linkedList0, doubleArray0);
      Integer integer1 = discreteProbabilityCollectionSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(207L);
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      DiscreteProbabilityCollectionSampler<Double> discreteProbabilityCollectionSampler0 = null;
      try {
        discreteProbabilityCollectionSampler0 = new DiscreteProbabilityCollectionSampler<Double>(jDKRandomWrapper0, (Map<Double, Double>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[2];
      DiscreteProbabilityCollectionSampler<InverseTransformDiscreteSampler> discreteProbabilityCollectionSampler0 = null;
      try {
        discreteProbabilityCollectionSampler0 = new DiscreteProbabilityCollectionSampler<InverseTransformDiscreteSampler>(jDKRandomWrapper0, (List<InverseTransformDiscreteSampler>) null, doubleArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      LinkedList<RejectionInversionZipfSampler> linkedList0 = new LinkedList<RejectionInversionZipfSampler>();
      double[] doubleArray0 = new double[4];
      linkedList0.add((RejectionInversionZipfSampler) null);
      DiscreteProbabilityCollectionSampler<RejectionInversionZipfSampler> discreteProbabilityCollectionSampler0 = null;
      try {
        discreteProbabilityCollectionSampler0 = new DiscreteProbabilityCollectionSampler<RejectionInversionZipfSampler>(jDKRandomWrapper0, linkedList0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Size mismatch: 4 != 1
         //
         verifyException("org.apache.commons.rng.sampling.DiscreteProbabilityCollectionSampler", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[1];
      LinkedList<AliasMethodDiscreteSampler> linkedList0 = new LinkedList<AliasMethodDiscreteSampler>();
      DiscreteProbabilityCollectionSampler<AliasMethodDiscreteSampler> discreteProbabilityCollectionSampler0 = null;
      try {
        discreteProbabilityCollectionSampler0 = new DiscreteProbabilityCollectionSampler<AliasMethodDiscreteSampler>(jDKRandomWrapper0, linkedList0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Empty collection
         //
         verifyException("org.apache.commons.rng.sampling.DiscreteProbabilityCollectionSampler", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper((Random) null);
      HashMap<RejectionInversionZipfSampler, Double> hashMap0 = new HashMap<RejectionInversionZipfSampler, Double>();
      DiscreteProbabilityCollectionSampler<RejectionInversionZipfSampler> discreteProbabilityCollectionSampler0 = null;
      try {
        discreteProbabilityCollectionSampler0 = new DiscreteProbabilityCollectionSampler<RejectionInversionZipfSampler>(jDKRandomWrapper0, hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Empty collection
         //
         verifyException("org.apache.commons.rng.sampling.DiscreteProbabilityCollectionSampler", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper((Random) null);
      HashMap<GuideTableDiscreteSampler, Double> hashMap0 = new HashMap<GuideTableDiscreteSampler, Double>();
      GuideTableDiscreteSampler guideTableDiscreteSampler0 = mock(GuideTableDiscreteSampler.class, new ViolatedAssumptionAnswer());
      Double double0 = new Double(1968.0159);
      hashMap0.put(guideTableDiscreteSampler0, double0);
      DiscreteProbabilityCollectionSampler<GuideTableDiscreteSampler> discreteProbabilityCollectionSampler0 = new DiscreteProbabilityCollectionSampler<GuideTableDiscreteSampler>(jDKRandomWrapper0, hashMap0);
      // Undeclared exception!
      try { 
        discreteProbabilityCollectionSampler0.sample();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.simple.JDKRandomWrapper", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper((Random) null);
      HashMap<GuideTableDiscreteSampler, Double> hashMap0 = new HashMap<GuideTableDiscreteSampler, Double>();
      GuideTableDiscreteSampler guideTableDiscreteSampler0 = mock(GuideTableDiscreteSampler.class, new ViolatedAssumptionAnswer());
      Double double0 = new Double(1968.0159);
      hashMap0.put(guideTableDiscreteSampler0, double0);
      DiscreteProbabilityCollectionSampler<GuideTableDiscreteSampler> discreteProbabilityCollectionSampler0 = new DiscreteProbabilityCollectionSampler<GuideTableDiscreteSampler>(jDKRandomWrapper0, hashMap0);
      DiscreteProbabilityCollectionSampler<GuideTableDiscreteSampler> discreteProbabilityCollectionSampler1 = discreteProbabilityCollectionSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      ;
}
}
