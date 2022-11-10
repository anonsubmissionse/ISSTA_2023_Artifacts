/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:37:59 GMT 2022
 */

package org.apache.commons.rng.sampling.shape;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.sampling.shape.TriangleSampler;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TriangleSampler_ESTest extends TriangleSampler_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(3254L);
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[5];
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      double[] doubleArray1 = triangleSampler0.sample();
      TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray1, doubleArray1);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(3254L);
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[5];
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      double[] doubleArray1 = triangleSampler0.sample();
      TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray1, doubleArray0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[2];
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      double[] doubleArray1 = triangleSampler0.sample();
      TriangleSampler.of(jDKRandomWrapper0, doubleArray1, doubleArray1, doubleArray0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[2];
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      double[] doubleArray1 = triangleSampler0.sample();
      TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray1, doubleArray0);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-635L));
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[3];
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray1);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[3];
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray1, doubleArray0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[4];
      // Undeclared exception!
      try { 
        TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Mismatch of vertex dimensions: 2,2,4
         //
         verifyException("org.apache.commons.rng.sampling.shape.TriangleSampler", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[0];
      // Undeclared exception!
      try { 
        TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Mismatch of vertex dimensions: 4,0,4
         //
         verifyException("org.apache.commons.rng.sampling.shape.TriangleSampler", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[2];
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      triangleSampler0.sample();
      triangleSampler0.sample();
      triangleSampler0.sample();
      double[] doubleArray1 = triangleSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 1.0;
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      double[] doubleArray1 = triangleSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 1.0;
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      double[] doubleArray1 = triangleSampler0.sample();
      double[] doubleArray2 = triangleSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-635L));
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (double) (-635L);
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      double[] doubleArray1 = triangleSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-635L));
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (double) (-635L);
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      double[] doubleArray1 = triangleSampler0.sample();
      double[] doubleArray2 = triangleSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-635L));
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) (-635L);
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      triangleSampler0.sample();
      double[] doubleArray1 = triangleSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-635L));
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) (-635L);
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      double[] doubleArray1 = triangleSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-635L));
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) (-635L);
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      double[] doubleArray1 = triangleSampler0.sample();
      double[] doubleArray2 = triangleSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(3393L);
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      mockRandom0.nextDouble();
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 1282.358744;
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      double[] doubleArray1 = triangleSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1.0);
      jDKRandomWrapper0.nextLong();
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      double[] doubleArray1 = triangleSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      // Undeclared exception!
      try { 
        TriangleSampler.of(jDKRandomWrapper0, (double[]) null, (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.sampling.shape.TriangleSampler", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        TriangleSampler.of((UniformRandomProvider) null, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Unsupported dimension: 1
         //
         verifyException("org.apache.commons.rng.sampling.shape.TriangleSampler", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[5];
      // Undeclared exception!
      try { 
        TriangleSampler.of((UniformRandomProvider) null, doubleArray1, doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Mismatch of vertex dimensions: 5,5,2
         //
         verifyException("org.apache.commons.rng.sampling.shape.TriangleSampler", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[4];
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[15];
      double[] doubleArray2 = triangleSampler0.sample();
      // Undeclared exception!
      try { 
        TriangleSampler.of(jDKRandomWrapper0, doubleArray2, doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Mismatch of vertex dimensions: 4,15,4
         //
         verifyException("org.apache.commons.rng.sampling.shape.TriangleSampler", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Random.setNextRandom((-2575));
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      double[] doubleArray1 = triangleSampler0.sample();
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      double[] doubleArray0 = new double[4];
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      TriangleSampler triangleSampler1 = triangleSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      TriangleSampler triangleSampler1 = triangleSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      TriangleSampler triangleSampler1 = triangleSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper((java.util.Random) null);
      double[] doubleArray0 = new double[5];
      TriangleSampler triangleSampler0 = TriangleSampler.of(jDKRandomWrapper0, doubleArray0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        triangleSampler0.sample();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.simple.JDKRandomWrapper", e);
      }
  }
}
