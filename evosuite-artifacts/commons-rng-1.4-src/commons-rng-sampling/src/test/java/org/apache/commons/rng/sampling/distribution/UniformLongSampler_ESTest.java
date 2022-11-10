/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:34:09 GMT 2022
 */

package org.apache.commons.rng.sampling.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.sampling.distribution.UniformLongSampler;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UniformLongSampler_ESTest extends UniformLongSampler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper((Random) null);
      UniformLongSampler uniformLongSampler0 = UniformLongSampler.of(jDKRandomWrapper0, (-560L), 1L);
      JDKRandomWrapper jDKRandomWrapper1 = new JDKRandomWrapper((Random) null);
      UniformLongSampler uniformLongSampler1 = uniformLongSampler0.withUniformRandomProvider(jDKRandomWrapper1);
      assertNotSame(uniformLongSampler1, uniformLongSampler0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      org.evosuite.runtime.Random.setNextRandom(Integer.MAX_VALUE);
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      jDKRandomWrapper0.nextFloat();
      UniformLongSampler uniformLongSampler0 = UniformLongSampler.of(jDKRandomWrapper0, 1194L, 1753L);
      long long0 = uniformLongSampler0.sample();
      assertEquals(1418L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UniformLongSampler uniformLongSampler0 = UniformLongSampler.of((UniformRandomProvider) null, (-1L), 0L);
      MockRandom mockRandom0 = new MockRandom((-4914L));
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      UniformLongSampler uniformLongSampler1 = uniformLongSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      assertNotSame(uniformLongSampler1, uniformLongSampler0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      UniformLongSampler uniformLongSampler0 = UniformLongSampler.of(jDKRandomWrapper0, 0L, 1L);
      uniformLongSampler0.sample();
      long long0 = uniformLongSampler0.sample();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UniformLongSampler uniformLongSampler0 = UniformLongSampler.of((UniformRandomProvider) null, (-243L), 1187L);
      // Undeclared exception!
      try { 
        uniformLongSampler0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      UniformLongSampler uniformLongSampler0 = UniformLongSampler.of(jDKRandomWrapper0, 0L, 1L);
      String string0 = uniformLongSampler0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(1091L);
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      UniformLongSampler uniformLongSampler0 = UniformLongSampler.of(jDKRandomWrapper0, 0L, 1091L);
      assertNotNull(uniformLongSampler0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      // Undeclared exception!
      try { 
        UniformLongSampler.of(jDKRandomWrapper0, 5059L, 0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5059 > 0
         //
         verifyException("org.apache.commons.rng.sampling.distribution.UniformLongSampler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(1091L);
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      UniformLongSampler uniformLongSampler0 = UniformLongSampler.of(jDKRandomWrapper0, 1091L, 1091L);
      UniformLongSampler uniformLongSampler1 = uniformLongSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      assertSame(uniformLongSampler1, uniformLongSampler0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(1091L);
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      UniformLongSampler uniformLongSampler0 = UniformLongSampler.of(jDKRandomWrapper0, 1091L, 1091L);
      String string0 = uniformLongSampler0.toString();
      assertEquals("Uniform deviate [X=1091]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      UniformLongSampler uniformLongSampler0 = UniformLongSampler.of(jDKRandomWrapper0, 1L, 1L);
      long long0 = uniformLongSampler0.sample();
      assertEquals(1L, long0);
  }
}
