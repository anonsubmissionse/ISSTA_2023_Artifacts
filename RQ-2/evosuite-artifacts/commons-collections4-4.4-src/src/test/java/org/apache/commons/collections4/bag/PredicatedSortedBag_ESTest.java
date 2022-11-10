/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:14:56 GMT 2022
 */

package org.apache.commons.collections4.bag;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.SortedBag;
import org.apache.commons.collections4.bag.PredicatedSortedBag;
import org.apache.commons.collections4.bag.UnmodifiableSortedBag;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PredicatedSortedBag_ESTest extends PredicatedSortedBag_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      PredicatedSortedBag<UnmodifiableSortedBag<Integer>> predicatedSortedBag0 = null;
      try {
        predicatedSortedBag0 = new PredicatedSortedBag<UnmodifiableSortedBag<Integer>>((SortedBag<UnmodifiableSortedBag<Integer>>) null, predicate0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        PredicatedSortedBag.predicatedSortedBag((SortedBag<Object>) null, (Predicate<? super Object>) predicate0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }
}
