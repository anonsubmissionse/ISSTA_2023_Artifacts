/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:10:32 GMT 2022
 */

package org.apache.commons.collections4.multimap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArrayListValuedHashMap_ESTest extends ArrayListValuedHashMap_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayListValuedHashMap<Predicate<Object>, Predicate<Object>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Predicate<Object>, Predicate<Object>>(0, (-692));
      // Undeclared exception!
      try { 
        arrayListValuedHashMap0.createCollection();
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -692
         //
         verifyException("java.util.ArrayList", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayListValuedHashMap<String, Integer> arrayListValuedHashMap0 = null;
      try {
        arrayListValuedHashMap0 = new ArrayListValuedHashMap<String, Integer>((MultiValuedMap<? extends String, ? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.multimap.ArrayListValuedHashMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayListValuedHashMap<Transformer<Object, Locale.FilteringMode>, Object> arrayListValuedHashMap0 = null;
      try {
        arrayListValuedHashMap0 = new ArrayListValuedHashMap<Transformer<Object, Locale.FilteringMode>, Object>((-1025), (-1025));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1025
         //
         verifyException("java.util.HashMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<Collection<ArrayList<Integer>>, Collection<ArrayList<Integer>>> hashMap0 = new HashMap<Collection<ArrayList<Integer>>, Collection<ArrayList<Integer>>>();
      LinkedList<ArrayList<Integer>> linkedList0 = new LinkedList<ArrayList<Integer>>();
      hashMap0.put(linkedList0, linkedList0);
      ArrayListValuedHashMap<Collection<ArrayList<Integer>>, Collection<ArrayList<Integer>>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Collection<ArrayList<Integer>>, Collection<ArrayList<Integer>>>(hashMap0);
      arrayListValuedHashMap0.trimToSize();
      assertTrue(arrayListValuedHashMap0.isEmpty());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayListValuedHashMap<Integer, Transformer<Object, Locale.FilteringMode>> arrayListValuedHashMap0 = null;
      try {
        arrayListValuedHashMap0 = new ArrayListValuedHashMap<Integer, Transformer<Object, Locale.FilteringMode>>((Map<? extends Integer, ? extends Transformer<Object, Locale.FilteringMode>>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.multimap.ArrayListValuedHashMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayListValuedHashMap<Integer, FilterInputStream> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Integer, FilterInputStream>();
      ArrayListValuedHashMap<Integer, FilterInputStream> arrayListValuedHashMap1 = new ArrayListValuedHashMap<Integer, FilterInputStream>(arrayListValuedHashMap0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ArrayListValuedHashMap<Collection<String>, FilterInputStream> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Collection<String>, FilterInputStream>();
      ArrayList<FilterInputStream> arrayList0 = arrayListValuedHashMap0.createCollection();
      assertTrue(arrayList0.isEmpty());
}
}
