/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:06:01 GMT 2022
 */

package org.apache.commons.collections4.multiset;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.collections4.Equator;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.ComparatorPredicate;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.ExceptionPredicate;
import org.apache.commons.collections4.functors.NullIsFalsePredicate;
import org.apache.commons.collections4.functors.NullPredicate;
import org.apache.commons.collections4.functors.OrPredicate;
import org.apache.commons.collections4.functors.PredicateTransformer;
import org.apache.commons.collections4.functors.TruePredicate;
import org.apache.commons.collections4.multiset.AbstractMapMultiSet;
import org.apache.commons.collections4.multiset.HashMultiSet;
import org.apache.commons.collections4.multiset.PredicatedMultiSet;
import org.apache.commons.collections4.multiset.SynchronizedMultiSet;
import org.apache.commons.collections4.multiset.UnmodifiableMultiSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SynchronizedMultiSet_ESTest extends SynchronizedMultiSet_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMultiSet<Boolean> hashMultiSet0 = new HashMultiSet<Boolean>();
      Set<Boolean> set0 = hashMultiSet0.createUniqueSet();
      SynchronizedMultiSet.SynchronizedSet<Boolean> synchronizedMultiSet_SynchronizedSet0 = new SynchronizedMultiSet.SynchronizedSet<Boolean>(set0, "Set must not be null.");
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMultiSet<Predicate<Object>> hashMultiSet0 = new HashMultiSet<Predicate<Object>>();
      HashMultiSet<Object> hashMultiSet1 = new HashMultiSet<Object>(hashMultiSet0);
      SynchronizedMultiSet<Object> synchronizedMultiSet0 = new SynchronizedMultiSet<Object>(hashMultiSet1);
      MultiSet<Object> multiSet0 = synchronizedMultiSet0.decorated();
      assertNotNull(multiSet0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      HashMultiSet<String> hashMultiSet0 = new HashMultiSet<String>(linkedHashSet0);
      SynchronizedMultiSet<String> synchronizedMultiSet0 = SynchronizedMultiSet.synchronizedMultiSet((MultiSet<String>) hashMultiSet0);
      synchronizedMultiSet0.add("+:|eS", 11);
      assertEquals(0, hashMultiSet0.size());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMultiSet<Object> hashMultiSet0 = new HashMultiSet<Object>();
      SynchronizedMultiSet<Object> synchronizedMultiSet0 = new SynchronizedMultiSet<Object>(hashMultiSet0, "");
      hashMultiSet0.add((Object) "");
      synchronizedMultiSet0.add((Object) "", 0);
      assertEquals(0, hashMultiSet0.size());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        SynchronizedMultiSet.synchronizedMultiSet((MultiSet<SynchronizedMultiSet<Integer>>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.SynchronizedCollection", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HashMultiSet<AbstractMapMultiSet.MultiSetEntry<Object>> hashMultiSet0 = new HashMultiSet<AbstractMapMultiSet.MultiSetEntry<Object>>();
      Predicate<Object> predicate0 = ExceptionPredicate.exceptionPredicate();
      PredicatedMultiSet<AbstractMapMultiSet.MultiSetEntry<Object>> predicatedMultiSet0 = PredicatedMultiSet.predicatedMultiSet((MultiSet<AbstractMapMultiSet.MultiSetEntry<Object>>) hashMultiSet0, (Predicate<? super AbstractMapMultiSet.MultiSetEntry<Object>>) predicate0);
      SynchronizedMultiSet<AbstractMapMultiSet.MultiSetEntry<Object>> synchronizedMultiSet0 = new SynchronizedMultiSet<AbstractMapMultiSet.MultiSetEntry<Object>>(predicatedMultiSet0);
      // Undeclared exception!
      try { 
        synchronizedMultiSet0.setCount((AbstractMapMultiSet.MultiSetEntry<Object>) null, 3044);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // ExceptionPredicate invoked
         //
         verifyException("org.apache.commons.collections4.functors.ExceptionPredicate", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Integer integer0 = new Integer(73);
      HashMultiSet<Object> hashMultiSet0 = new HashMultiSet<Object>();
      MultiSet<Object> multiSet0 = UnmodifiableMultiSet.unmodifiableMultiSet((MultiSet<?>) hashMultiSet0);
      SynchronizedMultiSet<Object> synchronizedMultiSet0 = new SynchronizedMultiSet<Object>(multiSet0);
      // Undeclared exception!
      try { 
        synchronizedMultiSet0.setCount(integer0, (-586));
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.multiset.UnmodifiableMultiSet", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HashMultiSet<HashMultiSet<Object>> hashMultiSet0 = new HashMultiSet<HashMultiSet<Object>>();
      SynchronizedMultiSet<HashMultiSet<Object>> synchronizedMultiSet0 = SynchronizedMultiSet.synchronizedMultiSet((MultiSet<HashMultiSet<Object>>) hashMultiSet0);
      HashMultiSet<Object> hashMultiSet1 = new HashMultiSet<Object>(synchronizedMultiSet0);
      // Undeclared exception!
      try { 
        synchronizedMultiSet0.setCount(hashMultiSet1, (-1));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Count must not be negative.
         //
         verifyException("org.apache.commons.collections4.multiset.AbstractMultiSet", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      HashMultiSet<Predicate<Object>> hashMultiSet0 = new HashMultiSet<Predicate<Object>>();
      SynchronizedMultiSet<Predicate<Object>> synchronizedMultiSet0 = new SynchronizedMultiSet<Predicate<Object>>(hashMultiSet0);
      DefaultEquator<Object> defaultEquator0 = DefaultEquator.defaultEquator();
      Predicate<Object> predicate0 = EqualPredicate.equalPredicate((Object) null, (Equator<Object>) defaultEquator0);
      MultiSet<Object> multiSet0 = UnmodifiableMultiSet.unmodifiableMultiSet((MultiSet<?>) synchronizedMultiSet0);
      PredicateTransformer<SynchronizedMultiSet<Object>> predicateTransformer0 = new PredicateTransformer<SynchronizedMultiSet<Object>>(predicate0);
      SynchronizedMultiSet<Object> synchronizedMultiSet1 = new SynchronizedMultiSet<Object>(multiSet0);
      Boolean boolean0 = predicateTransformer0.transform(synchronizedMultiSet1);
      // Undeclared exception!
      try { 
        synchronizedMultiSet1.remove((Object) boolean0, (-1));
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.multiset.UnmodifiableMultiSet", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      HashMultiSet<AbstractMapMultiSet.MutableInteger> hashMultiSet0 = new HashMultiSet<AbstractMapMultiSet.MutableInteger>();
      Predicate<Object> predicate0 = TruePredicate.truePredicate();
      OrPredicate<Object> orPredicate0 = new OrPredicate<Object>(predicate0, predicate0);
      PredicatedMultiSet<AbstractMapMultiSet.MutableInteger> predicatedMultiSet0 = new PredicatedMultiSet<AbstractMapMultiSet.MutableInteger>(hashMultiSet0, orPredicate0);
      Object object0 = new Object();
      SynchronizedMultiSet<AbstractMapMultiSet.MutableInteger> synchronizedMultiSet0 = new SynchronizedMultiSet<AbstractMapMultiSet.MutableInteger>(predicatedMultiSet0, object0);
      // Undeclared exception!
      try { 
        synchronizedMultiSet0.remove((Object) hashMultiSet0, (-1545));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Occurrences must not be negative.
         //
         verifyException("org.apache.commons.collections4.multiset.AbstractMapMultiSet", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMultiSet<UnmodifiableMultiSet<Integer>> hashMultiSet0 = new HashMultiSet<UnmodifiableMultiSet<Integer>>();
      SynchronizedMultiSet<UnmodifiableMultiSet<Integer>> synchronizedMultiSet0 = new SynchronizedMultiSet<UnmodifiableMultiSet<Integer>>(hashMultiSet0, hashMultiSet0);
      MultiSet<Object> multiSet0 = UnmodifiableMultiSet.unmodifiableMultiSet((MultiSet<?>) synchronizedMultiSet0);
      SynchronizedMultiSet<Object> synchronizedMultiSet1 = new SynchronizedMultiSet<Object>(multiSet0);
      // Undeclared exception!
      try { 
        synchronizedMultiSet1.add((Object) "JX", 5);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.multiset.UnmodifiableMultiSet", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SynchronizedMultiSet<String> synchronizedMultiSet0 = null;
      try {
        synchronizedMultiSet0 = new SynchronizedMultiSet<String>((MultiSet<String>) null, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.SynchronizedCollection", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SynchronizedMultiSet<Integer> synchronizedMultiSet0 = null;
      try {
        synchronizedMultiSet0 = new SynchronizedMultiSet<Integer>((MultiSet<Integer>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.SynchronizedCollection", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMultiSet<Boolean> hashMultiSet0 = new HashMultiSet<Boolean>();
      SynchronizedMultiSet<Boolean> synchronizedMultiSet0 = new SynchronizedMultiSet<Boolean>(hashMultiSet0);
      int int0 = synchronizedMultiSet0.getCount(hashMultiSet0);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMultiSet<Object> hashMultiSet0 = new HashMultiSet<Object>();
      SynchronizedMultiSet<Object> synchronizedMultiSet0 = new SynchronizedMultiSet<Object>(hashMultiSet0, "");
      boolean boolean0 = synchronizedMultiSet0.equals("");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMultiSet<Object> hashMultiSet0 = new HashMultiSet<Object>();
      SynchronizedMultiSet<Object> synchronizedMultiSet0 = new SynchronizedMultiSet<Object>(hashMultiSet0, "");
      boolean boolean0 = hashMultiSet0.add((Object) "");
      SynchronizedMultiSet<Object> synchronizedMultiSet1 = SynchronizedMultiSet.synchronizedMultiSet((MultiSet<Object>) synchronizedMultiSet0);
      boolean boolean1 = synchronizedMultiSet0.equals(synchronizedMultiSet1);
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMultiSet<String> hashMultiSet0 = new HashMultiSet<String>();
      HashMultiSet<AbstractMapMultiSet.MutableInteger> hashMultiSet1 = new HashMultiSet<AbstractMapMultiSet.MutableInteger>();
      SynchronizedMultiSet<AbstractMapMultiSet.MutableInteger> synchronizedMultiSet0 = SynchronizedMultiSet.synchronizedMultiSet((MultiSet<AbstractMapMultiSet.MutableInteger>) hashMultiSet1);
      int int0 = synchronizedMultiSet0.remove((Object) hashMultiSet0, 2);
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMultiSet<Object> hashMultiSet0 = new HashMultiSet<Object>();
      SynchronizedMultiSet<Object> synchronizedMultiSet0 = new SynchronizedMultiSet<Object>(hashMultiSet0, "");
      Set<MultiSet.Entry<Object>> set0 = (Set<MultiSet.Entry<Object>>)synchronizedMultiSet0.entrySet();
      assertTrue(set0.isEmpty());
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMultiSet<String> hashMultiSet0 = new HashMultiSet<String>();
      SynchronizedMultiSet<String> synchronizedMultiSet0 = SynchronizedMultiSet.synchronizedMultiSet((MultiSet<String>) hashMultiSet0);
      synchronizedMultiSet0.setCount("9}", 2);
      assertEquals(0, hashMultiSet0.size());
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMultiSet<PredicatedMultiSet<Object>> hashMultiSet0 = new HashMultiSet<PredicatedMultiSet<Object>>();
      Predicate<Object> predicate0 = NullPredicate.nullPredicate();
      PredicatedMultiSet<PredicatedMultiSet<Object>> predicatedMultiSet0 = PredicatedMultiSet.predicatedMultiSet((MultiSet<PredicatedMultiSet<Object>>) hashMultiSet0, (Predicate<? super PredicatedMultiSet<Object>>) predicate0);
      SynchronizedMultiSet<PredicatedMultiSet<Object>> synchronizedMultiSet0 = new SynchronizedMultiSet<PredicatedMultiSet<Object>>(predicatedMultiSet0);
      synchronizedMultiSet0.hashCode();
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMultiSet<Integer> hashMultiSet0 = new HashMultiSet<Integer>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Predicate<Object> predicate0 = ComparatorPredicate.comparatorPredicate((Object) hashMultiSet0, comparator0);
      Predicate<Integer> predicate1 = NullIsFalsePredicate.nullIsFalsePredicate((Predicate<? super Integer>) predicate0);
      PredicatedMultiSet<Integer> predicatedMultiSet0 = PredicatedMultiSet.predicatedMultiSet((MultiSet<Integer>) hashMultiSet0, (Predicate<? super Integer>) predicate1);
      SynchronizedMultiSet<Integer> synchronizedMultiSet0 = new SynchronizedMultiSet<Integer>(predicatedMultiSet0, "?DKA]:e");
      Set<Integer> set0 = synchronizedMultiSet0.uniqueSet();
      assertTrue(set0.isEmpty());
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMultiSet<Integer> hashMultiSet0 = new HashMultiSet<Integer>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Predicate<Object> predicate0 = ComparatorPredicate.comparatorPredicate((Object) hashMultiSet0, comparator0);
      Predicate<Integer> predicate1 = NullIsFalsePredicate.nullIsFalsePredicate((Predicate<? super Integer>) predicate0);
      PredicatedMultiSet<Integer> predicatedMultiSet0 = PredicatedMultiSet.predicatedMultiSet((MultiSet<Integer>) hashMultiSet0, (Predicate<? super Integer>) predicate1);
      SynchronizedMultiSet<Integer> synchronizedMultiSet0 = new SynchronizedMultiSet<Integer>(predicatedMultiSet0, "?DKA]:e");
      // Undeclared exception!
      try { 
        synchronizedMultiSet0.add((Integer) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Cannot add Object 'null' - Predicate 'org.apache.commons.collections4.functors.NullIsFalsePredicate@3' rejected it
         //
         verifyException("org.apache.commons.collections4.collection.PredicatedCollection", e);
      }
  }
}
