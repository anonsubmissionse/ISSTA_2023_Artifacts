/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 18:20:20 GMT 2022
 */

package org.apache.commons.beanutils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.collections.Factory;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.ChainedTransformer;
import org.apache.commons.collections.functors.ClosureTransformer;
import org.apache.commons.collections.functors.ConstantTransformer;
import org.apache.commons.collections.functors.ExceptionFactory;
import org.apache.commons.collections.functors.ExceptionTransformer;
import org.apache.commons.collections.functors.FactoryTransformer;
import org.apache.commons.collections.functors.InstantiateTransformer;
import org.apache.commons.collections.functors.NOPTransformer;
import org.apache.commons.collections.functors.NonePredicate;
import org.apache.commons.collections.functors.OnePredicate;
import org.apache.commons.collections.functors.PredicateTransformer;
import org.apache.commons.collections.functors.TransformerPredicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BeanMap_ESTest extends BeanMap_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      BeanMap beanMap1 = new BeanMap((Object) null);
      ExceptionFactory exceptionFactory0 = (ExceptionFactory)ExceptionFactory.INSTANCE;
      FactoryTransformer factoryTransformer0 = new FactoryTransformer(exceptionFactory0);
      BeanMap.Entry beanMap_Entry0 = new BeanMap.Entry(beanMap1, beanMap1, factoryTransformer0);
      beanMap_Entry0.setValue(beanMap0);
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      BeanMap beanMap1 = new BeanMap(beanMap0);
      beanMap0.setBean(beanMap1);
      // Undeclared exception!
      try { 
        beanMap1.putAllWriteable(beanMap0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap$HashIterator", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      beanMap0.reinitialise();
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Set<Map.Entry<Object, Object>> set0 = (Set<Map.Entry<Object, Object>>)beanMap0.entrySet();
      beanMap0.firePropertyChange((Object) null, set0, (Object) null);
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<ConstantTransformer> linkedList0 = new LinkedList<ConstantTransformer>();
      BeanMap beanMap0 = new BeanMap(linkedList0);
      Class<ConstantTransformer>[] classArray0 = (Class<ConstantTransformer>[]) Array.newInstance(Class.class, 5);
      InstantiateTransformer instantiateTransformer0 = new InstantiateTransformer(classArray0, classArray0);
      beanMap0.containsValue(instantiateTransformer0);
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      beanMap0.setBean("");
      beanMap0.clear();
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      BeanMap beanMap1 = new BeanMap(beanMap0);
      beanMap1.size();
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Object object0 = new Object();
      beanMap0.put((Object) null, object0);
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Collection<Object> collection0 = beanMap0.values();
      beanMap0.setBean(collection0);
      beanMap0.getBean();
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      BeanMap beanMap1 = new BeanMap(beanMap0);
      beanMap1.containsValue((Object) null);
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      // Undeclared exception!
      try { 
        beanMap0.putAllWriteable((BeanMap) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.beanutils.BeanMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<ExceptionTransformer>[] classArray0 = (Class<ExceptionTransformer>[]) Array.newInstance(Class.class, 5);
      InstantiateTransformer instantiateTransformer0 = new InstantiateTransformer(classArray0, classArray0);
      BeanMap beanMap0 = new BeanMap(instantiateTransformer0);
      try { 
        beanMap0.put("fiqwv", classArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // The bean of type: org.apache.commons.collections.functors.InstantiateTransformer has no property called: fiqwv
         //
         verifyException("org.apache.commons.beanutils.BeanMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      // Undeclared exception!
      try { 
        beanMap0.logWarn((Exception) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.beanutils.BeanMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Class<Integer> class0 = Integer.class;
      try { 
        beanMap0.convertType(class0, "o");
        fail("Expecting exception: InvocationTargetException");
      } catch(InvocationTargetException e) {
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Factory factory0 = ExceptionFactory.getInstance();
      FactoryTransformer factoryTransformer0 = new FactoryTransformer(factory0);
      BeanMap beanMap0 = new BeanMap(factoryTransformer0);
      Class<ClosureTransformer> class0 = ClosureTransformer.class;
      // Undeclared exception!
      try { 
        beanMap0.convertType(class0, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.beanutils.BeanMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Transformer transformer0 = NOPTransformer.getInstance();
      TransformerPredicate transformerPredicate0 = new TransformerPredicate(transformer0);
      PredicateTransformer predicateTransformer0 = new PredicateTransformer(transformerPredicate0);
      Object object0 = beanMap0.getOrDefault(predicateTransformer0, (Object) null);
      assertEquals(beanMap0, object0);
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      BeanMap beanMap1 = new BeanMap(beanMap0);
      ConstantTransformer constantTransformer0 = new ConstantTransformer((Object) null);
      beanMap1.get(constantTransformer0);
      assertEquals(1, beanMap1.size());
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      ConstantTransformer constantTransformer0 = new ConstantTransformer(beanMap0);
      Method method0 = beanMap0.getWriteMethod((Object) constantTransformer0);
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Iterator<Map.Entry<Object, Object>> iterator0 = (Iterator<Map.Entry<Object, Object>>)beanMap0.entryIterator();
      // Undeclared exception!
      try { 
        beanMap0.createWriteMethodArguments((Method) null, iterator0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.beanutils.BeanMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      int int0 = beanMap0.size();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Object object0 = beanMap0.getBean();
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Iterator<String> iterator0 = beanMap0.keyIterator();
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Method method0 = beanMap0.getReadMethod((Object) null);
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<BeanMap>[] classArray0 = (Class<BeanMap>[]) Array.newInstance(Class.class, 8);
      Class<BeanMap> class0 = BeanMap.class;
      InstantiateTransformer instantiateTransformer0 = new InstantiateTransformer(classArray0, classArray0);
      BeanMap beanMap0 = new BeanMap(instantiateTransformer0);
      Class<ChainedTransformer> class1 = ChainedTransformer.class;
      beanMap0.convertType(class1, class0);
      assertEquals(0, beanMap0.size());
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Object[] objectArray0 = beanMap0.createWriteMethodArguments((Method) null, (Object) null);
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("o");
      BeanMap beanMap0 = new BeanMap(mockThrowable0);
      assertEquals(0, beanMap0.size());
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      beanMap0.clear();
      assertEquals(0, beanMap0.size());
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Predicate[] predicateArray0 = new Predicate[9];
      OnePredicate onePredicate0 = new OnePredicate(predicateArray0);
      PredicateTransformer predicateTransformer0 = new PredicateTransformer(onePredicate0);
      BeanMap beanMap0 = new BeanMap(predicateTransformer0);
      // Undeclared exception!
      try { 
        beanMap0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // Could not create new instance of class: class org.apache.commons.collections.functors.PredicateTransformer
         //
         verifyException("org.apache.commons.beanutils.BeanMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      beanMap0.putAllWriteable(beanMap0);
      assertEquals(0, beanMap0.size());
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Object object0 = beanMap0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<BeanMap>[] classArray0 = (Class<BeanMap>[]) Array.newInstance(Class.class, 8);
      InstantiateTransformer instantiateTransformer0 = new InstantiateTransformer(classArray0, classArray0);
      BeanMap beanMap0 = new BeanMap(instantiateTransformer0);
      try { 
        beanMap0.clone();
        fail("Expecting exception: CloneNotSupportedException");
      } catch(CloneNotSupportedException e) {
         //
         // Unable to instantiate the underlying bean \"org.apache.commons.collections.functors.InstantiateTransformer\": java.lang.IllegalAccessException: Class org.apache.commons.beanutils.BeanMap can not access a member of class org.apache.commons.collections.functors.InstantiateTransformer with modifiers \"private\"
         //
         verifyException("org.apache.commons.beanutils.BeanMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Set<Map.Entry<Object, Object>> set0 = (Set<Map.Entry<Object, Object>>)beanMap0.entrySet();
      Predicate predicate0 = NonePredicate.getInstance((Collection) set0);
      ;
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      beanMap0.putAll(BeanMap.defaultTransformers);
      ;
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Class<ExceptionTransformer> class0 = ExceptionTransformer.class;
      Transformer transformer0 = beanMap0.getTypeTransformer(class0);
      assertNotNull(transformer0);
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<BeanMap>[] classArray0 = (Class<BeanMap>[]) Array.newInstance(Class.class, 8);
      InstantiateTransformer instantiateTransformer0 = new InstantiateTransformer(classArray0, classArray0);
      BeanMap beanMap0 = new BeanMap(instantiateTransformer0);
      beanMap0.values();
      assertEquals(0, beanMap0.size());
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      MockThrowable mockThrowable0 = new MockThrowable("o");
      MockException mockException0 = new MockException(mockThrowable0);
      beanMap0.logWarn(mockException0);
      assertEquals(0, beanMap0.size());
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      beanMap0.setBean(beanMap0);
      boolean boolean0 = beanMap0.containsKey(beanMap0);
      assertEquals(0, beanMap0.size());
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      beanMap0.setBean(beanMap0);
      boolean boolean0 = beanMap0.containsKey(beanMap0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Class<?> class0 = beanMap0.getType((String) null);
      ;
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Set<Object> set0 = beanMap0.keySet();
      assertEquals(0, set0.size());
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      MockThrowable mockThrowable0 = new MockThrowable("o");
      MockException mockException0 = new MockException(mockThrowable0);
      beanMap0.logInfo(mockException0);
      assertEquals(0, beanMap0.size());
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      String string0 = beanMap0.toString();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Method method0 = beanMap0.getReadMethod("BO4Ib0JtVziaN2");
      ;
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Method method0 = beanMap0.getWriteMethod("o-;$A");
      ;
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BeanMap beanMap0 = new BeanMap();
      Iterator<Object> iterator0 = beanMap0.valueIterator();
      boolean boolean0 = beanMap0.containsValue(iterator0);
      assertTrue(boolean0);
}
}
