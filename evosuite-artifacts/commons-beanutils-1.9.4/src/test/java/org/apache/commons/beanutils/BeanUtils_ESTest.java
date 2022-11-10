/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 18:32:04 GMT 2022
 */

package org.apache.commons.beanutils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.WeakFastHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BeanUtils_ESTest extends BeanUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WeakFastHashMap<Object, String> weakFastHashMap0 = new WeakFastHashMap<Object, String>();
      BeanUtils.copyProperty("+xN;AD'wb=sVZ*o3", "+xN;AD'wb=sVZ*o3", weakFastHashMap0);
      assertEquals(0, weakFastHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      MockThrowable mockThrowable1 = new MockThrowable("Exception during introspection");
      boolean boolean0 = BeanUtils.initCause(mockThrowable0, mockThrowable1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Map<Integer, Object> map0 = BeanUtils.createCache();
      String string0 = BeanUtils.getProperty(map0, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WeakFastHashMap<String, String> weakFastHashMap0 = new WeakFastHashMap<String, String>();
      weakFastHashMap0.put("<NULL>", "");
      String string0 = BeanUtils.getProperty(weakFastHashMap0, "<NULL>");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WeakFastHashMap<String, Object> weakFastHashMap0 = new WeakFastHashMap<String, Object>();
      Integer integer0 = new Integer(0);
      weakFastHashMap0.put("", integer0);
      String string0 = BeanUtils.getNestedProperty(weakFastHashMap0, "");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BeanUtils.setDebug(1);
      int int0 = BeanUtils.getDebug();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BeanUtils.setDebug((-434));
      int int0 = BeanUtils.getDebug();
      assertEquals((-434), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WeakFastHashMap<Object, Integer> weakFastHashMap0 = new WeakFastHashMap<Object, Integer>();
      weakFastHashMap0.setFast(true);
      boolean boolean0 = BeanUtils.getCacheFast(weakFastHashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WeakFastHashMap<String, Object> weakFastHashMap0 = new WeakFastHashMap<String, Object>(0);
      weakFastHashMap0.put("Bv]l]X:o1bP136L^K-", "Bv]l]X:o1bP136L^K-");
      String[] stringArray0 = BeanUtils.getArrayProperty(weakFastHashMap0, "Bv]l]X:o1bP136L^K-");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Map<String, String> map0 = BeanUtils.describe("Bv]l]X:o1bP136L^K-");
      assertEquals(2, map0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WeakFastHashMap<Object, String> weakFastHashMap0 = new WeakFastHashMap<Object, String>();
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        BeanUtils.setProperty(weakFastHashMap0, (String) null, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No name specified for bean class 'class org.apache.commons.beanutils.WeakFastHashMap'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WeakFastHashMap<String, Object> weakFastHashMap0 = new WeakFastHashMap<String, Object>(3195, 3195);
      weakFastHashMap0.put("|Vmi;6_wO=0QS(Psl3A", "|Vmi;6_wO=0QS(Psl3A");
      // Undeclared exception!
      try { 
        BeanUtils.populate("org.apache.commons.beanutils.BeanUtils", weakFastHashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing End Delimiter
         //
         verifyException("org.apache.commons.beanutils.expression.DefaultResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        BeanUtils.getSimpleProperty(integer0, "org.apache.commons.beanutils.BeanUtils");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Nested property names are not allowed: Property 'org.apache.commons.beanutils.BeanUtils' on bean class 'class java.lang.Integer'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Map<String, String> map0 = BeanUtils.createCache();
      WeakFastHashMap<String, Object> weakFastHashMap0 = new WeakFastHashMap<String, Object>(map0);
      Object object0 = BeanUtils.cloneBean(weakFastHashMap0);
      // Undeclared exception!
      try { 
        BeanUtils.getProperty(object0, "Yfq y; =.w");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null property value for 'Yfq y; =.w' on bean class 'class org.apache.commons.beanutils.WeakFastHashMap'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      try { 
        BeanUtils.getProperty(object0, "Zr");
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // Unknown property 'Zr' on class 'class java.lang.Object'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Map<Object, String> map0 = BeanUtils.createCache();
      // Undeclared exception!
      try { 
        BeanUtils.getNestedProperty(map0, "q.^`ArOO");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null property value for 'q.^`ArOO' on bean class 'class org.apache.commons.beanutils.WeakFastHashMap'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      try { 
        BeanUtils.getNestedProperty(mockThrowable0, "6PD|M$SUADLX^sM<MO=");
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // Unknown property '6PD|M$SUADLX^sM<MO=' on class 'class org.evosuite.runtime.mock.java.lang.MockThrowable'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        BeanUtils.getNestedProperty(object0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No name specified for bean class 'class java.lang.Object'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      WeakFastHashMap<String, Object> weakFastHashMap0 = new WeakFastHashMap<String, Object>();
      WeakFastHashMap<Object, Object> weakFastHashMap1 = new WeakFastHashMap<Object, Object>(weakFastHashMap0);
      // Undeclared exception!
      try { 
        BeanUtils.getMappedProperty((Object) weakFastHashMap1, ".", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null property value for '' on bean class 'class org.apache.commons.beanutils.WeakFastHashMap'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      try { 
        BeanUtils.getMappedProperty(object0, "uCc", "uCc");
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // Unknown property 'uCc'+ on bean class 'class java.lang.Object'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      try { 
        BeanUtils.getMappedProperty((Object) mockThrowable0, "Error getting the Throwable initCause() method");
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // Unknown property 'Error getting the Throwable initCause'+ on bean class 'class org.evosuite.runtime.mock.java.lang.MockThrowable'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer(783);
      try { 
        BeanUtils.getIndexedProperty((Object) integer0, "Udl5:WaM|*`6Hv~/`", 783);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // Unknown property 'Udl5:WaM|*`6Hv~/`' on bean class 'class java.lang.Integer'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      WeakFastHashMap<Object, String> weakFastHashMap0 = new WeakFastHashMap<Object, String>(2644, 2644);
      // Undeclared exception!
      try { 
        BeanUtils.getIndexedProperty((Object) weakFastHashMap0, (String) null, (-2135));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No name specified for bean class 'class org.apache.commons.beanutils.WeakFastHashMap'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      WeakFastHashMap<String, Object> weakFastHashMap0 = new WeakFastHashMap<String, Object>(1548, 3195);
      // Undeclared exception!
      try { 
        BeanUtils.getArrayProperty(weakFastHashMap0, "org.apache.commons.beanutils.BeanUtils");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null property value for 'org.apache.commons.beanutils.BeanUtils' on bean class 'class org.apache.commons.beanutils.WeakFastHashMap'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer integer0 = new Integer((-10));
      try { 
        BeanUtils.getArrayProperty(integer0, "S5k#_bJb%|N+BI{s&");
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // Unknown property 'S5k#_bJb%|N+BI{s&' on class 'class java.lang.Integer'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        BeanUtils.getArrayProperty(object0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No name specified for bean class 'class java.lang.Object'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        BeanUtils.copyProperties((Object) null, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No destination bean specified
         //
         verifyException("org.apache.commons.beanutils.BeanUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      WeakFastHashMap<Object, String> weakFastHashMap0 = new WeakFastHashMap<Object, String>();
      WeakFastHashMap<String, Integer> weakFastHashMap1 = new WeakFastHashMap<String, Integer>(0);
      Object object0 = BeanUtils.cloneBean(weakFastHashMap1);
      weakFastHashMap0.put(object0, "JieT");
      // Undeclared exception!
      try { 
        BeanUtils.copyProperties(" ", weakFastHashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.beanutils.WeakFastHashMap cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.beanutils.BeanUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      WeakFastHashMap<String, Object> weakFastHashMap0 = new WeakFastHashMap<String, Object>(32, 32);
      weakFastHashMap0.put(".~}~SCqiU1Ph-f", (Object) null);
      // Undeclared exception!
      try { 
        BeanUtils.cloneBean(weakFastHashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null property value for '' on bean class 'class org.apache.commons.beanutils.WeakFastHashMap'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        BeanUtils.cloneBean((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.beanutils.BeanUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Integer integer0 = new Integer(0);
      try { 
        BeanUtils.cloneBean(integer0);
        fail("Expecting exception: InstantiationException");
      
      } catch(InstantiationException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      WeakFastHashMap<Integer, String> weakFastHashMap0 = new WeakFastHashMap<Integer, String>(0);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge((Object) null, weakFastHashMap0, biFunction0);
      // Undeclared exception!
      try { 
        BeanUtils.cloneBean(hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No name specified for bean class 'class java.util.HashMap'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      WeakFastHashMap<Object, String> weakFastHashMap0 = new WeakFastHashMap<Object, String>(0);
      weakFastHashMap0.put(mockThrowable0, "Exception during introspection");
      // Undeclared exception!
      try { 
        BeanUtils.cloneBean(weakFastHashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      WeakFastHashMap<Object, Object> weakFastHashMap0 = new WeakFastHashMap<Object, Object>(0);
      BeanUtils.setCacheFast(weakFastHashMap0, false);
      assertFalse(weakFastHashMap0.getFast());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BeanUtils.setCacheFast(hashMap0, false);
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Map<WeakFastHashMap<Integer, Object>, Integer> map0 = BeanUtils.createCache();
      boolean boolean0 = BeanUtils.getCacheFast(map0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean boolean0 = BeanUtils.getCacheFast((Map<?, ?>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      try { 
        BeanUtils.getSimpleProperty("CZj'", "^{_6vB");
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // Unknown property '^{_6vB' on class 'class java.lang.String'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = BeanUtils.getDebug();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BeanUtils beanUtils0 = new BeanUtils();
      assertEquals(0, beanUtils0.getDebug());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      boolean boolean0 = BeanUtils.initCause(mockThrowable0, mockThrowable0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Integer integer0 = new Integer(3195);
      BeanUtils.populate(integer0, (Map<String, ?>) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      WeakFastHashMap<Integer, String> weakFastHashMap0 = new WeakFastHashMap<Integer, String>(0);
      String[] stringArray0 = BeanUtils.getArrayProperty(weakFastHashMap0, "' is null, so skipping ths setter");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Integer integer0 = new Integer(783);
      Map<String, String> map0 = BeanUtils.describe(integer0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      WeakFastHashMap<Object, String> weakFastHashMap0 = new WeakFastHashMap<Object, String>();
      BeanUtils.copyProperties(" ", weakFastHashMap0);
      assertFalse(weakFastHashMap0.getFast());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      // Undeclared exception!
      try { 
        BeanUtils.getMappedProperty((Object) mockThrowable0, "Tq");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid mapped property 'Tq' on bean class 'class org.evosuite.runtime.mock.java.lang.MockThrowable'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      BeanUtils.setProperty(mockThrowable0, "UIxxZ\"xn7$", "UIxxZ\"xn7$");
      assertNull(mockThrowable0.getMessage());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      WeakFastHashMap<Integer, String> weakFastHashMap0 = new WeakFastHashMap<Integer, String>(0);
      String string0 = BeanUtils.getNestedProperty(weakFastHashMap0, "' is null, so skipping ths setter");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        BeanUtils.getProperty("", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No name specified for bean class 'class java.lang.String'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        BeanUtils.getMappedProperty((Object) null, (String) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No bean specified
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        BeanUtils.getIndexedProperty((Object) "", "ROVZ&/T#dky");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid indexed property 'ROVZ&/T#dky' on bean class 'class java.lang.String'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Map<String, String> map0 = BeanUtils.createCache();
      WeakFastHashMap<String, String> weakFastHashMap0 = new WeakFastHashMap<String, String>(map0);
      // Undeclared exception!
      try { 
        BeanUtils.getIndexedProperty((Object) weakFastHashMap0, "org.apache.commons.beanutils.BeanUtils", (-2470));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null property value for 'org' on bean class 'class org.apache.commons.beanutils.WeakFastHashMap'
         //
         verifyException("org.apache.commons.beanutils.PropertyUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        BeanUtils.copyProperty("", "1G}5<O$_#(=Pyq|iWUz", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing End Delimiter
         //
         verifyException("org.apache.commons.beanutils.expression.DefaultResolver", e);
      }
  }
}
