/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:14:28 GMT 2022
 */

package org.apache.commons.collections4.multimap;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractSetValuedMap_ESTest extends AbstractSetValuedMap_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashSetValuedHashMap<String, Object> hashSetValuedHashMap0 = new HashSetValuedHashMap<String, Object>(0);
      Set<Object> set0 = hashSetValuedHashMap0.wrappedCollection("lNff");
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashSetValuedHashMap<Integer, Object> hashSetValuedHashMap0 = new HashSetValuedHashMap<Integer, Object>(726);
      Integer integer0 = new Integer(726);
      hashSetValuedHashMap0.put(integer0, integer0);
      Set<Object> set0 = hashSetValuedHashMap0.remove(integer0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashSetValuedHashMap<Collection<String>, Collection<String>> hashSetValuedHashMap0 = new HashSetValuedHashMap<Collection<String>, Collection<String>>();
      Map<Collection<String>, Set<Collection<String>>> map0 = hashSetValuedHashMap0.getMap();
      assertEquals(0, map0.size());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashSetValuedHashMap<String, Object> hashSetValuedHashMap0 = new HashSetValuedHashMap<String, Object>();
      hashSetValuedHashMap0.put((String) null, (Object) null);
      Map<String, Set<Object>> map0 = hashSetValuedHashMap0.getMap();
      assertEquals(0, map0.size());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashSetValuedHashMap<Integer, Object> hashSetValuedHashMap0 = new HashSetValuedHashMap<Integer, Object>();
      Set<Object> set0 = hashSetValuedHashMap0.get((Integer) null);
      HashSetValuedHashMap<String, LinkedHashSet<Object>> hashSetValuedHashMap1 = new HashSetValuedHashMap<String, LinkedHashSet<Object>>();
      Set<LinkedHashSet<Object>> set1 = hashSetValuedHashMap1.remove(set0);
      assertEquals(1, set1.size());
}
}
