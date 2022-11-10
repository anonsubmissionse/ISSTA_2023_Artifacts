/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 03:40:05 GMT 2022
 */

package org.springside.modules.utils.collection.type.primitive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.springside.modules.utils.collection.type.primitive.IntObjectHashMap;
import org.springside.modules.utils.collection.type.primitive.IntObjectMap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IntObjectHashMap_ESTest extends IntObjectHashMap_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(2);
      intObjectHashMap0.put(0, "");
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>(1);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Integer integer0 = new Integer(1);
      hashMap0.put(integer0, (String) null);
      intObjectHashMap0.putAll(hashMap0);
      Integer integer1 = new Integer(1147);
      intObjectHashMap0.putIfAbsent(integer1, integer1);
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>(1);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      hashMap0.put((Integer) 8, "}G*x:q7(6W%=\"lKgV");
      intObjectHashMap0.putAll(hashMap0);
      Integer integer0 = new Integer(1124);
      intObjectHashMap0.putIfAbsent(integer0, integer0);
      intObjectHashMap0.remove(1124);
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>(1);
      Integer integer0 = new Integer(1124);
      intObjectHashMap0.putIfAbsent(integer0, integer0);
      IntObjectHashMap<IntObjectHashMap<String>> intObjectHashMap1 = new IntObjectHashMap<IntObjectHashMap<String>>(8);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(biFunction0).apply(any() , any());
      intObjectHashMap0.compute((Integer) intObjectHashMap1.DEFAULT_CAPACITY, biFunction0);
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IntObjectHashMap<AbstractMap.SimpleEntry<Object, String>> intObjectHashMap0 = new IntObjectHashMap<AbstractMap.SimpleEntry<Object, String>>();
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(intObjectHashMap0, "-13x-kG:B");
      intObjectHashMap0.putIfAbsent((Integer) intObjectHashMap0.DEFAULT_CAPACITY, abstractMap_SimpleEntry0);
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>();
      intObjectHashMap0.equals(intObjectHashMap1);
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Integer integer0 = new Integer(1575);
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      hashMap0.put(integer0, ", ");
      intObjectHashMap0.putAll(hashMap0);
      intObjectHashMap0.hashCode();
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>();
      Integer integer0 = new Integer(2018);
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("(this Map)").when(biFunction0).apply(any() , any());
      intObjectHashMap0.compute(integer0, biFunction0);
      intObjectHashMap0.containsKey(2018);
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>(1);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      hashMap0.put((Integer) 8, "}G*x:q7(6W%=\"lKgV");
      intObjectHashMap0.putAll(hashMap0);
      Integer integer0 = new Integer(1124);
      intObjectHashMap0.putIfAbsent(integer0, integer0);
      IntObjectHashMap<IntObjectHashMap<String>> intObjectHashMap1 = new IntObjectHashMap<IntObjectHashMap<String>>(8);
      intObjectHashMap0.put(1124, (Object) intObjectHashMap1.DEFAULT_CAPACITY);
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>(1);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Integer integer0 = new Integer(1);
      hashMap0.put(integer0, "}G*x:q7(6W%=\"lKgV");
      hashMap0.put((Integer) 8, "}G*x:q7(6W%=\"lKgV");
      intObjectHashMap0.putAll(hashMap0);
      Integer integer1 = new Integer(1124);
      intObjectHashMap0.putIfAbsent(integer1, integer1);
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      IntObjectHashMap<AbstractMap.SimpleEntry<String, Object>> intObjectHashMap0 = new IntObjectHashMap<AbstractMap.SimpleEntry<String, Object>>(1999);
      intObjectHashMap0.put(8, (AbstractMap.SimpleEntry<String, Object>) null);
      IntObjectHashMap.MapEntry intObjectHashMap_MapEntry0 = intObjectHashMap0.new MapEntry(8);
      intObjectHashMap_MapEntry0.setValue((Integer) intObjectHashMap0.DEFAULT_CAPACITY);
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IntObjectHashMap<AbstractMap.SimpleEntry<String, Object>> intObjectHashMap0 = new IntObjectHashMap<AbstractMap.SimpleEntry<String, Object>>(1999);
      intObjectHashMap0.put(8, (AbstractMap.SimpleEntry<String, Object>) null);
      IntObjectHashMap.MapEntry intObjectHashMap_MapEntry0 = intObjectHashMap0.new MapEntry(8);
      intObjectHashMap_MapEntry0.getValue();
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>();
      intObjectHashMap0.put((Integer) intObjectHashMap0.DEFAULT_CAPACITY, "a^Y@sD=");
      IntObjectHashMap.MapEntry intObjectHashMap_MapEntry0 = intObjectHashMap0.new MapEntry(0);
      intObjectHashMap_MapEntry0.getKey();
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IntObjectHashMap<AbstractMap.SimpleEntry<String, Object>> intObjectHashMap0 = new IntObjectHashMap<AbstractMap.SimpleEntry<String, Object>>(1999);
      IntObjectHashMap.MapEntry intObjectHashMap_MapEntry0 = intObjectHashMap0.new MapEntry(8);
      // Undeclared exception!
      try { 
        intObjectHashMap_MapEntry0.getValue();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // The map entry has been removed
         //
         verifyException("org.springside.modules.utils.collection.type.primitive.IntObjectHashMap$MapEntry", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>(8);
      intObjectHashMap0.entrySet();
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>();
      intObjectHashMap0.equals(intObjectHashMap0);
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>();
      IntObjectHashMap<String> intObjectHashMap1 = new IntObjectHashMap<String>();
      intObjectHashMap0.put((-2638), (Object) intObjectHashMap1);
      intObjectHashMap0.size();
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IntObjectHashMap<IntObjectHashMap<Object>> intObjectHashMap0 = new IntObjectHashMap<IntObjectHashMap<Object>>();
      intObjectHashMap0.remove((Object) intObjectHashMap0.DEFAULT_CAPACITY);
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IntObjectHashMap<IntObjectHashMap<String>> intObjectHashMap0 = new IntObjectHashMap<IntObjectHashMap<String>>(8);
      IntObjectHashMap<Integer> intObjectHashMap1 = new IntObjectHashMap<Integer>();
      BiFunction<Integer, Integer, Integer> biFunction0 = (BiFunction<Integer, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      Integer integer0 = intObjectHashMap1.merge((Integer) 8, (Integer) intObjectHashMap0.DEFAULT_CAPACITY, biFunction0);
      intObjectHashMap1.remove((Object) integer0);
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>(1);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      hashMap0.put((Integer) 8, "}G*x:q7(6W%=\"lKgV");
      intObjectHashMap0.putAll(hashMap0);
      IntObjectHashMap<String> intObjectHashMap1 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put((Integer) intObjectHashMap1.DEFAULT_CAPACITY, (Object) "");
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.keyToString(2);
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IntObjectHashMap<Integer> intObjectHashMap0 = new IntObjectHashMap<Integer>();
      IntObjectHashMap<String> intObjectHashMap1 = new IntObjectHashMap<String>();
      intObjectHashMap1.get((Object) intObjectHashMap0.DEFAULT_CAPACITY);
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>();
      intObjectHashMap0.putIfAbsent((Integer) intObjectHashMap0.DEFAULT_CAPACITY, intObjectHashMap0.DEFAULT_CAPACITY);
      intObjectHashMap0.get((Object) intObjectHashMap0.DEFAULT_CAPACITY);
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("(this Map)").when(biFunction0).apply(any() , any());
      intObjectHashMap0.compute((Integer) intObjectHashMap0.DEFAULT_CAPACITY, biFunction0);
      intObjectHashMap0.containsKey((Object) intObjectHashMap0.DEFAULT_CAPACITY);
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>();
      intObjectHashMap0.containsKey((Object) intObjectHashMap0.DEFAULT_CAPACITY);
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IntObjectHashMap<IntObjectHashMap<Integer>> intObjectHashMap0 = new IntObjectHashMap<IntObjectHashMap<Integer>>(120, 1.0F);
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>(40320);
      intObjectHashMap1.put((Integer) intObjectHashMap0.DEFAULT_CAPACITY, (Object) intObjectHashMap1);
      // Undeclared exception!
      intObjectHashMap1.toString();
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>(792);
      // Undeclared exception!
      try { 
        intObjectHashMap0.remove((Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.type.primitive.IntObjectHashMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(1907);
      IntObjectHashMap<String> intObjectHashMap1 = new IntObjectHashMap<String>(10080);
      // Undeclared exception!
      intObjectHashMap0.putAll(intObjectHashMap1);
  }
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>();
      // Undeclared exception!
      try { 
        intObjectHashMap0.putAll((Map<? extends Integer, ?>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.type.primitive.IntObjectHashMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IntObjectHashMap<Integer> intObjectHashMap0 = new IntObjectHashMap<Integer>();
      IntObjectHashMap<AbstractMap.SimpleImmutableEntry<String, Object>> intObjectHashMap1 = new IntObjectHashMap<AbstractMap.SimpleImmutableEntry<String, Object>>(673);
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>("", intObjectHashMap0);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>(abstractMap_SimpleEntry0);
      // Undeclared exception!
      try { 
        intObjectHashMap1.put((Integer) null, abstractMap_SimpleImmutableEntry0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.type.primitive.IntObjectHashMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IntObjectHashMap<IntObjectHashMap<String>> intObjectHashMap0 = new IntObjectHashMap<IntObjectHashMap<String>>(9983, 0.5F);
      // Undeclared exception!
      intObjectHashMap0.hashCode();
  }
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IntObjectHashMap<AbstractMap.SimpleImmutableEntry<String, Integer>> intObjectHashMap0 = new IntObjectHashMap<AbstractMap.SimpleImmutableEntry<String, Integer>>();
      // Undeclared exception!
      try { 
        intObjectHashMap0.get((Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.type.primitive.IntObjectHashMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>();
      // Undeclared exception!
      try { 
        intObjectHashMap0.get((Object) intObjectHashMap0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // org.springside.modules.utils.collection.type.primitive.IntObjectHashMap cannot be cast to java.lang.Integer
         //
         verifyException("org.springside.modules.utils.collection.type.primitive.IntObjectHashMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>();
      IntObjectHashMap<Comparable<Object>> intObjectHashMap1 = new IntObjectHashMap<Comparable<Object>>(9973);
      // Undeclared exception!
      intObjectHashMap1.equals(intObjectHashMap0);
  }
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IntObjectHashMap<AbstractMap.SimpleEntry<Object, Object>> intObjectHashMap0 = new IntObjectHashMap<AbstractMap.SimpleEntry<Object, Object>>(1151, 0.5F);
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>(31622, 0.5F);
      // Undeclared exception!
      intObjectHashMap1.containsValue(intObjectHashMap0);
  }
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IntObjectHashMap<AbstractMap.SimpleImmutableEntry<Integer, String>> intObjectHashMap0 = new IntObjectHashMap<AbstractMap.SimpleImmutableEntry<Integer, String>>();
      // Undeclared exception!
      try { 
        intObjectHashMap0.containsKey((Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.type.primitive.IntObjectHashMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IntObjectHashMap<IntObjectHashMap<Object>> intObjectHashMap0 = new IntObjectHashMap<IntObjectHashMap<Object>>();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        intObjectHashMap0.containsKey(object0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Integer
         //
         verifyException("org.springside.modules.utils.collection.type.primitive.IntObjectHashMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IntObjectHashMap<IntObjectHashMap<Object>> intObjectHashMap0 = null;
      try {
        intObjectHashMap0 = new IntObjectHashMap<IntObjectHashMap<Object>>(2081450105, 0.5F);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // ceilingPowerOfTwo(2081450105) not representable as an int
         //
         verifyException("com.google.common.math.IntMath", e);
      }
  }
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IntObjectHashMap<IntObjectHashMap<Integer>> intObjectHashMap0 = null;
      try {
        intObjectHashMap0 = new IntObjectHashMap<IntObjectHashMap<Integer>>((-737));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // x (-737) must be > 0
         //
         verifyException("com.google.common.math.MathPreconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IntObjectHashMap<Integer> intObjectHashMap0 = null;
      try {
        intObjectHashMap0 = new IntObjectHashMap<Integer>(Integer.MAX_VALUE);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // ceilingPowerOfTwo(2147483647) not representable as an int
         //
         verifyException("com.google.common.math.IntMath", e);
      }
  }
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>(1);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Integer integer0 = new Integer(1);
      Integer integer1 = Integer.getInteger("", 23);
      hashMap0.put(integer1, "Fy=1s.<.`-<ZB");
      hashMap0.put(integer0, "}G*x:q7(6W%=\"lKgV");
      hashMap0.put((Integer) 8, "}G*x:q7(6W%=\"lKgV");
      intObjectHashMap0.putAll(hashMap0);
      ;
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>();
      boolean boolean0 = intObjectHashMap0.containsKey((-1));
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put((Integer) 8, "");
      boolean boolean0 = intObjectHashMap0.isEmpty();
      assertEquals(0, intObjectHashMap0.size());
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put((Integer) 8, "");
      boolean boolean0 = intObjectHashMap0.isEmpty();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IntObjectHashMap<AbstractMap.SimpleImmutableEntry<Object, Object>> intObjectHashMap0 = new IntObjectHashMap<AbstractMap.SimpleImmutableEntry<Object, Object>>();
      boolean boolean0 = intObjectHashMap0.isEmpty();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IntObjectHashMap<AbstractMap.SimpleEntry<String, Object>> intObjectHashMap0 = new IntObjectHashMap<AbstractMap.SimpleEntry<String, Object>>(1999);
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = intObjectHashMap0.get(1999);
      assertNotNull(abstractMap_SimpleEntry0);
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>(1);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      hashMap0.put((Integer) 8, "}G*x:q7(6W%=\"lKgV");
      intObjectHashMap0.putAll(hashMap0);
      intObjectHashMap0.get(8);
      assertEquals(0, intObjectHashMap0.size());
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IntObjectHashMap<AbstractMap.SimpleEntry<String, Object>> intObjectHashMap0 = new IntObjectHashMap<AbstractMap.SimpleEntry<String, Object>>();
      int int0 = intObjectHashMap0.size();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>();
      intObjectHashMap0.put(581, "X%gP$/8E/P[");
      Collection<String> collection0 = intObjectHashMap0.values();
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>();
      intObjectHashMap1.put((Integer) 8, (Object) collection0);
      intObjectHashMap1.putAll(intObjectHashMap0);
      assertEquals(0, intObjectHashMap0.size());
}
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>();
      intObjectHashMap0.put(581, "X%gP$/8E/P[");
      Collection<String> collection0 = intObjectHashMap0.values();
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>();
      intObjectHashMap1.put((Integer) 8, (Object) collection0);
      intObjectHashMap1.putAll(intObjectHashMap0);
      String string0 = intObjectHashMap1.toString();
      ;
}
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>(1);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Integer integer0 = new Integer(1);
      hashMap0.put(integer0, (String) null);
      hashMap0.put((Integer) 8, (String) null);
      intObjectHashMap0.putAll(hashMap0);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null).when(biFunction0).apply(any() , any());
      intObjectHashMap0.compute((Integer) intObjectHashMap0.DEFAULT_CAPACITY, biFunction0);
      assertTrue(intObjectHashMap0.isEmpty());
}
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put(8, "X%g!P$/8mE/([");
      intObjectHashMap0.put((-1), (String) null);
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>();
      intObjectHashMap1.putAll(intObjectHashMap0);
      assertEquals(0, intObjectHashMap0.size());
}
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put(8, "X%g!P$/8mE/([");
      intObjectHashMap0.put((-1), (String) null);
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>();
      intObjectHashMap1.putAll(intObjectHashMap0);
      intObjectHashMap1.remove((-1));
      ;
}
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IntObjectHashMap<Object> intObjectHashMap0 = new IntObjectHashMap<Object>(1);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      hashMap0.put((Integer) 8, "}G*x:q7(6W%=\"lKgV");
      intObjectHashMap0.putAll(hashMap0);
      Integer integer0 = new Integer(1124);
      intObjectHashMap0.putIfAbsent(integer0, integer0);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      intObjectHashMap0.compute((Integer) intObjectHashMap0.DEFAULT_CAPACITY, biFunction0);
      ;
}
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put((-1), (String) null);
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>();
      intObjectHashMap1.putAll(intObjectHashMap0);
      boolean boolean0 = intObjectHashMap1.equals(intObjectHashMap0);
      assertTrue(intObjectHashMap0.isEmpty());
}
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put((-1), (String) null);
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>();
      intObjectHashMap1.putAll(intObjectHashMap0);
      boolean boolean0 = intObjectHashMap1.equals(intObjectHashMap0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put(8, "");
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>();
      intObjectHashMap1.putAll(intObjectHashMap0);
      BiFunction<Integer, Object, String> biFunction0 = (BiFunction<Integer, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(biFunction0).apply(anyInt() , any());
      intObjectHashMap1.replaceAll(biFunction0);
      boolean boolean0 = intObjectHashMap1.equals(intObjectHashMap0);
      assertEquals(0, intObjectHashMap0.size());
}
 @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put(8, "");
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>();
      intObjectHashMap1.putAll(intObjectHashMap0);
      BiFunction<Integer, Object, String> biFunction0 = (BiFunction<Integer, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(biFunction0).apply(anyInt() , any());
      intObjectHashMap1.replaceAll(biFunction0);
      boolean boolean0 = intObjectHashMap1.equals(intObjectHashMap0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put(8, "");
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>();
      intObjectHashMap1.putAll(intObjectHashMap0);
      boolean boolean0 = intObjectHashMap1.equals(intObjectHashMap0);
      assertTrue(intObjectHashMap1.isEmpty());
}
 @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put(8, "");
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>();
      intObjectHashMap1.putAll(intObjectHashMap0);
      boolean boolean0 = intObjectHashMap1.equals(intObjectHashMap0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      IntObjectHashMap<AbstractMap.SimpleEntry<String, Integer>> intObjectHashMap0 = new IntObjectHashMap<AbstractMap.SimpleEntry<String, Integer>>();
      boolean boolean0 = intObjectHashMap0.equals("X%gP$/8E/P[");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put(8, "");
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>();
      boolean boolean0 = intObjectHashMap1.equals(intObjectHashMap0);
      assertTrue(intObjectHashMap0.isEmpty());
}
 @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put(8, "");
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>();
      boolean boolean0 = intObjectHashMap1.equals(intObjectHashMap0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put(8, "X%g!P$/8mE/([");
      BiFunction<Integer, Object, String> biFunction0 = (BiFunction<Integer, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(biFunction0).apply(anyInt() , any());
      intObjectHashMap0.replaceAll(biFunction0);
      boolean boolean0 = intObjectHashMap0.containsValue((Object) null);
      ;
}
 @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put(8, "X%g!P$/8mE/([");
      BiFunction<Integer, Object, String> biFunction0 = (BiFunction<Integer, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(biFunction0).apply(anyInt() , any());
      intObjectHashMap0.replaceAll(biFunction0);
      boolean boolean0 = intObjectHashMap0.containsValue((Object) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put(8, "");
      boolean boolean0 = intObjectHashMap0.containsValue((Object) null);
      assertTrue(intObjectHashMap0.isEmpty());
}
 @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put(8, "");
      boolean boolean0 = intObjectHashMap0.containsValue((Object) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      IntObjectHashMap<IntObjectHashMap<String>> intObjectHashMap0 = new IntObjectHashMap<IntObjectHashMap<String>>(8);
      String string0 = intObjectHashMap0.toString();
      assertTrue(intObjectHashMap0.isEmpty());
}
 @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      IntObjectHashMap<IntObjectHashMap<String>> intObjectHashMap0 = new IntObjectHashMap<IntObjectHashMap<String>>(8);
      String string0 = intObjectHashMap0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      IntObjectHashMap<AbstractMap.SimpleEntry<String, Integer>> intObjectHashMap0 = new IntObjectHashMap<AbstractMap.SimpleEntry<String, Integer>>();
      intObjectHashMap0.remove(8);
      assertTrue(intObjectHashMap0.isEmpty());
}
 @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      IntObjectHashMap<Comparable<Object>> intObjectHashMap0 = null;
      try {
        intObjectHashMap0 = new IntObjectHashMap<Comparable<Object>>(8, 8);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // loadFactor must be > 0 and <= 1
         //
         verifyException("org.springside.modules.utils.collection.type.primitive.IntObjectHashMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      IntObjectHashMap<Comparable<Object>> intObjectHashMap0 = null;
      try {
        intObjectHashMap0 = new IntObjectHashMap<Comparable<Object>>((-2343), (-2343));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // loadFactor must be > 0 and <= 1
         //
         verifyException("org.springside.modules.utils.collection.type.primitive.IntObjectHashMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put(8, "X%g!P$/8mE/([");
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>(8);
      intObjectHashMap1.putAll(intObjectHashMap0);
      BiFunction<Integer, Object, String> biFunction0 = (BiFunction<Integer, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("8").when(biFunction0).apply(anyInt() , any());
      intObjectHashMap1.replaceAll(biFunction0);
      boolean boolean0 = intObjectHashMap1.equals(intObjectHashMap0);
      assertEquals(0, intObjectHashMap0.size());
}
 @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>(8);
      intObjectHashMap0.put(8, "X%g!P$/8mE/([");
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>(8);
      intObjectHashMap1.putAll(intObjectHashMap0);
      BiFunction<Integer, Object, String> biFunction0 = (BiFunction<Integer, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("8").when(biFunction0).apply(anyInt() , any());
      intObjectHashMap1.replaceAll(biFunction0);
      boolean boolean0 = intObjectHashMap1.equals(intObjectHashMap0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      IntObjectHashMap<AbstractMap.SimpleEntry<String, Integer>> intObjectHashMap0 = new IntObjectHashMap<AbstractMap.SimpleEntry<String, Integer>>();
      Iterable<IntObjectMap.PrimitiveEntry<AbstractMap.SimpleEntry<String, Integer>>> iterable0 = (Iterable<IntObjectMap.PrimitiveEntry<AbstractMap.SimpleEntry<String, Integer>>>)intObjectHashMap0.entries();
      ;
}
 @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      IntObjectHashMap<IntObjectHashMap<Integer>> intObjectHashMap0 = new IntObjectHashMap<IntObjectHashMap<Integer>>(120, 1.0F);
      Set<Integer> set0 = intObjectHashMap0.keySet();
      assertTrue(set0.isEmpty());
}
 @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      IntObjectHashMap<IntObjectHashMap<Integer>> intObjectHashMap0 = new IntObjectHashMap<IntObjectHashMap<Integer>>();
      // Undeclared exception!
      try { 
        intObjectHashMap0.remove((Object) "H}p?w:kZ,ux!");
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Integer
         //
         verifyException("org.springside.modules.utils.collection.type.primitive.IntObjectHashMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>();
      intObjectHashMap0.clear();
      ;
}
 @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      IntObjectHashMap<String> intObjectHashMap0 = new IntObjectHashMap<String>();
      Collection<String> collection0 = intObjectHashMap0.values();
      IntObjectHashMap<Object> intObjectHashMap1 = new IntObjectHashMap<Object>();
      intObjectHashMap1.put((Integer) 8, (Object) collection0);
      intObjectHashMap1.toString();
      ;
}
}
