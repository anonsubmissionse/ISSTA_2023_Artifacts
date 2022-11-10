/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:43:32 GMT 2022
 */

package org.apache.commons.rng.sampling;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;
import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.sampling.CollectionSampler;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CollectionSampler_ESTest extends CollectionSampler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      CollectionSampler<String> collectionSampler0 = new CollectionSampler<String>(jDKRandomWrapper0, linkedList0);
      String string0 = collectionSampler0.sample();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      linkedList0.add(integer0);
      CollectionSampler<Integer> collectionSampler0 = new CollectionSampler<Integer>(jDKRandomWrapper0, linkedList0);
      Integer integer1 = collectionSampler0.sample();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      CollectionSampler<Object> collectionSampler0 = null;
      try {
        collectionSampler0 = new CollectionSampler<Object>(jDKRandomWrapper0, (Collection<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper((Random) null);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      CollectionSampler<Integer> collectionSampler0 = null;
      try {
        collectionSampler0 = new CollectionSampler<Integer>(jDKRandomWrapper0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty collection
         //
         verifyException("org.apache.commons.rng.sampling.CollectionSampler", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(0);
      linkedList0.offer(integer0);
      CollectionSampler<Object> collectionSampler0 = new CollectionSampler<Object>((UniformRandomProvider) null, linkedList0);
      // Undeclared exception!
      try { 
        collectionSampler0.sample();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.sampling.CollectionSampler", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      CollectionSampler<String> collectionSampler0 = new CollectionSampler<String>(jDKRandomWrapper0, linkedList0);
      CollectionSampler<String> collectionSampler1 = collectionSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      assertFalse(collectionSampler1.equals((Object)collectionSampler0));
  }
}
