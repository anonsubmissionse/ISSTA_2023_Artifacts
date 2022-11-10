/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:58:26 GMT 2022
 */

package org.apache.commons.collections4.set;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ChainedClosure;
import org.apache.commons.collections4.functors.ComparatorPredicate;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.ExceptionTransformer;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.apache.commons.collections4.functors.IfTransformer;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.MapTransformer;
import org.apache.commons.collections4.functors.NOPTransformer;
import org.apache.commons.collections4.functors.PredicateTransformer;
import org.apache.commons.collections4.functors.StringValueTransformer;
import org.apache.commons.collections4.set.TransformedNavigableSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TransformedNavigableSet_ESTest extends TransformedNavigableSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Transformer<String, String> transformer0 = MapTransformer.mapTransformer((Map<? super String, ? extends String>) hashMap0);
      TransformedNavigableSet<String> transformedNavigableSet0 = TransformedNavigableSet.transformingNavigableSet((NavigableSet<String>) treeSet0, (Transformer<? super String, ? extends String>) transformer0);
      NavigableSet<String> navigableSet0 = transformedNavigableSet0.decorated();
      assertTrue(navigableSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TreeSet<Boolean> treeSet0 = new TreeSet<Boolean>();
      Class<Integer> class0 = Integer.class;
      Predicate<Object> predicate0 = InstanceofPredicate.instanceOfPredicate(class0);
      HashMap<Object, Boolean> hashMap0 = new HashMap<Object, Boolean>();
      Transformer<Object, Boolean> transformer0 = MapTransformer.mapTransformer((Map<? super Object, ? extends Boolean>) hashMap0);
      TransformedNavigableSet<Boolean> transformedNavigableSet0 = TransformedNavigableSet.transformedNavigableSet((NavigableSet<Boolean>) treeSet0, (Transformer<? super Boolean, ? extends Boolean>) transformer0);
      PredicateTransformer<Object> predicateTransformer0 = new PredicateTransformer<Object>(predicate0);
      Boolean boolean0 = predicateTransformer0.transform(class0);
      NavigableSet<Boolean> navigableSet0 = transformedNavigableSet0.tailSet(boolean0, true);
      assertEquals(0, navigableSet0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      InvokerTransformer<Object, Integer> invokerTransformer0 = new InvokerTransformer<Object, Integer>("0^L>:u%!Oc&jc7", (Class<?>[]) null, (Object[]) null);
      TransformedNavigableSet<Integer> transformedNavigableSet0 = TransformedNavigableSet.transformingNavigableSet((NavigableSet<Integer>) treeSet0, (Transformer<? super Integer, ? extends Integer>) invokerTransformer0);
      Integer integer0 = new Integer(0);
      NavigableSet<Integer> navigableSet0 = transformedNavigableSet0.subSet(integer0, false, integer0, true);
      assertFalse(navigableSet0.contains(integer0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      Transformer<Integer, Integer> transformer0 = NOPTransformer.nopTransformer();
      TransformedNavigableSet<Integer> transformedNavigableSet0 = TransformedNavigableSet.transformingNavigableSet((NavigableSet<Integer>) treeSet0, (Transformer<? super Integer, ? extends Integer>) transformer0);
      Integer integer0 = new Integer(3040);
      treeSet0.add(integer0);
      Integer integer1 = transformedNavigableSet0.pollLast();
      assertEquals(3040, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      Integer integer0 = new Integer(0);
      ConstantTransformer<Object, Integer> constantTransformer0 = new ConstantTransformer<Object, Integer>(integer0);
      TransformedNavigableSet<Integer> transformedNavigableSet0 = TransformedNavigableSet.transformingNavigableSet((NavigableSet<Integer>) treeSet0, (Transformer<? super Integer, ? extends Integer>) constantTransformer0);
      Integer integer1 = new Integer((-1427));
      treeSet0.add(integer1);
      Integer integer2 = transformedNavigableSet0.lower(integer0);
      assertEquals((-1427), (int)integer2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      Transformer<Object, Integer> transformer0 = ConstantTransformer.nullTransformer();
      TransformedNavigableSet<Integer> transformedNavigableSet0 = new TransformedNavigableSet<Integer>(treeSet0, transformer0);
      Integer integer0 = new Integer((-700));
      treeSet0.add(integer0);
      Integer integer1 = transformedNavigableSet0.floor(integer0);
      assertEquals((-700), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      Transformer<Object, Integer> transformer0 = InvokerTransformer.invokerTransformer("@]~x^R@/-R~\"/");
      TransformedNavigableSet<Integer> transformedNavigableSet0 = new TransformedNavigableSet<Integer>(treeSet0, transformer0);
      Integer integer0 = new Integer((-292));
      treeSet0.add(integer0);
      Integer integer1 = transformedNavigableSet0.ceiling(integer0);
      assertEquals((-292), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 2);
      Transformer<Object, Predicate<Object>> transformer0 = InvokerTransformer.invokerTransformer("burxV` s+", (Class<?>[]) classArray0, (Object[]) classArray0);
      // Undeclared exception!
      try { 
        TransformedNavigableSet.transformingNavigableSet((NavigableSet<Predicate<Object>>) null, (Transformer<? super Predicate<Object>, ? extends Predicate<Object>>) transformer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      treeSet0.add("CE?a$TxWug:BK2#YD");
      Transformer<Object, Transformer<Object, Object>> transformer0 = InvokerTransformer.invokerTransformer("c-", (Class<?>[]) null, (Object[]) null);
      TransformedNavigableSet<Object> transformedNavigableSet0 = new TransformedNavigableSet<Object>(treeSet0, transformer0);
      // Undeclared exception!
      try { 
        TransformedNavigableSet.transformedNavigableSet((NavigableSet<Object>) transformedNavigableSet0, (Transformer<? super Object, ?>) transformer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // InvokerTransformer: The method 'c-' on 'class java.lang.String' does not exist
         //
         verifyException("org.apache.commons.collections4.functors.InvokerTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      treeSet0.add("B");
      Transformer<String, String> transformer0 = MapTransformer.mapTransformer((Map<? super String, ? extends String>) hashMap0);
      // Undeclared exception!
      try { 
        TransformedNavigableSet.transformedNavigableSet((NavigableSet<String>) treeSet0, (Transformer<? super String, ? extends String>) transformer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Predicate<Object> predicate0 = FalsePredicate.falsePredicate();
      Transformer<Object, String> transformer0 = StringValueTransformer.stringValueTransformer();
      IfTransformer<Object, String> ifTransformer0 = new IfTransformer<Object, String>(predicate0, transformer0, transformer0);
      // Undeclared exception!
      try { 
        TransformedNavigableSet.transformedNavigableSet((NavigableSet<String>) null, (Transformer<? super String, ? extends String>) ifTransformer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TreeSet<TreeSet<Object>> treeSet0 = new TreeSet<TreeSet<Object>>();
      Transformer<Object, TreeSet<Object>> transformer0 = ExceptionTransformer.exceptionTransformer();
      TransformedNavigableSet<TreeSet<Object>> transformedNavigableSet0 = new TransformedNavigableSet<TreeSet<Object>>(treeSet0, transformer0);
      TreeSet<Object> treeSet1 = new TreeSet<Object>((Collection<?>) treeSet0);
      // Undeclared exception!
      try { 
        transformedNavigableSet0.tailSet(treeSet1, false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.TreeSet cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      Transformer<Object, String> transformer0 = ExceptionTransformer.exceptionTransformer();
      TransformedNavigableSet<Object> transformedNavigableSet0 = TransformedNavigableSet.transformingNavigableSet((NavigableSet<Object>) treeSet0, (Transformer<? super Object, ?>) transformer0);
      // Undeclared exception!
      try { 
        transformedNavigableSet0.subSet((Object) null, false, (Object) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Transformer<Object, String> transformer0 = StringValueTransformer.stringValueTransformer();
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      TransformedNavigableSet<Object> transformedNavigableSet0 = new TransformedNavigableSet<Object>(treeSet0, transformer0);
      Integer integer0 = new Integer((-651));
      // Undeclared exception!
      try { 
        transformedNavigableSet0.subSet((Object) integer0, true, (Object) "27TKr8@M4la;?4", true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Integer
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer((-316));
      ConstantTransformer<Object, Integer> constantTransformer0 = new ConstantTransformer<Object, Integer>(integer0);
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      TransformedNavigableSet<Object> transformedNavigableSet0 = TransformedNavigableSet.transformedNavigableSet((NavigableSet<Object>) treeSet0, (Transformer<? super Object, ?>) constantTransformer0);
      // Undeclared exception!
      try { 
        transformedNavigableSet0.headSet((Object) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Transformer<Object, String> transformer0 = MapTransformer.mapTransformer((Map<? super Object, ? extends String>) hashMap0);
      TransformedNavigableSet<Object> transformedNavigableSet0 = new TransformedNavigableSet<Object>(treeSet0, transformer0);
      // Undeclared exception!
      try { 
        transformedNavigableSet0.headSet((Object) transformer0, false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.collections4.functors.MapTransformer cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Transformer<Object, Integer> transformer0 = InvokerTransformer.invokerTransformer("24[=oolv$ky9dd[L!");
      TransformedNavigableSet<Integer> transformedNavigableSet0 = null;
      try {
        transformedNavigableSet0 = new TransformedNavigableSet<Integer>((NavigableSet<Integer>) null, transformer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      Integer integer0 = new Integer((-304));
      treeSet0.add(integer0);
      Transformer<Object, Integer> transformer0 = ConstantTransformer.constantTransformer(integer0);
      TransformedNavigableSet<Integer> transformedNavigableSet0 = TransformedNavigableSet.transformingNavigableSet((NavigableSet<Integer>) treeSet0, (Transformer<? super Integer, ? extends Integer>) transformer0);
      TransformedNavigableSet<Integer> transformedNavigableSet1 = TransformedNavigableSet.transformedNavigableSet((NavigableSet<Integer>) transformedNavigableSet0, (Transformer<? super Integer, ? extends Integer>) transformer0);
      assertTrue(transformedNavigableSet1.contains((-304)));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Transformer<Object, String> transformer0 = StringValueTransformer.stringValueTransformer();
      TransformedNavigableSet<String> transformedNavigableSet0 = TransformedNavigableSet.transformingNavigableSet((NavigableSet<String>) treeSet0, (Transformer<? super String, ? extends String>) transformer0);
      String string0 = transformedNavigableSet0.ceiling("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      Transformer<Object, Integer> transformer0 = ExceptionTransformer.exceptionTransformer();
      TransformedNavigableSet<Integer> transformedNavigableSet0 = new TransformedNavigableSet<Integer>(treeSet0, transformer0);
      Integer integer0 = new Integer(5);
      Integer integer1 = transformedNavigableSet0.floor(integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TreeSet<Closure<Object>> treeSet0 = new TreeSet<Closure<Object>>();
      Closure<Object> closure0 = ChainedClosure.chainedClosure((Collection<? extends Closure<? super Object>>) treeSet0);
      ConstantTransformer<Object, Closure<Object>> constantTransformer0 = new ConstantTransformer<Object, Closure<Object>>(closure0);
      TransformedNavigableSet<Closure<Object>> transformedNavigableSet0 = TransformedNavigableSet.transformingNavigableSet((NavigableSet<Closure<Object>>) treeSet0, (Transformer<? super Closure<Object>, ? extends Closure<Object>>) constantTransformer0);
      NavigableSet<Closure<Object>> navigableSet0 = transformedNavigableSet0.descendingSet();
      assertTrue(navigableSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TreeSet<Closure<Object>> treeSet0 = new TreeSet<Closure<Object>>();
      Closure<Object> closure0 = ChainedClosure.chainedClosure((Collection<? extends Closure<? super Object>>) treeSet0);
      ConstantTransformer<Object, Closure<Object>> constantTransformer0 = new ConstantTransformer<Object, Closure<Object>>(closure0);
      TransformedNavigableSet<Closure<Object>> transformedNavigableSet0 = TransformedNavigableSet.transformingNavigableSet((NavigableSet<Closure<Object>>) treeSet0, (Transformer<? super Closure<Object>, ? extends Closure<Object>>) constantTransformer0);
      Closure<Object> closure1 = transformedNavigableSet0.lower(closure0);
      assertNull(closure1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Transformer<Object, String> transformer0 = StringValueTransformer.stringValueTransformer();
      TransformedNavigableSet<String> transformedNavigableSet0 = TransformedNavigableSet.transformingNavigableSet((NavigableSet<String>) treeSet0, (Transformer<? super String, ? extends String>) transformer0);
      String string0 = transformedNavigableSet0.pollLast();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Transformer<Object, String> transformer0 = StringValueTransformer.stringValueTransformer();
      TransformedNavigableSet<String> transformedNavigableSet0 = TransformedNavigableSet.transformingNavigableSet((NavigableSet<String>) treeSet0, (Transformer<? super String, ? extends String>) transformer0);
      NavigableSet<String> navigableSet0 = transformedNavigableSet0.headSet("", true);
      assertTrue(navigableSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TreeSet<Closure<Object>> treeSet0 = new TreeSet<Closure<Object>>();
      Transformer<Object, Closure<Object>> transformer0 = ConstantTransformer.nullTransformer();
      TransformedNavigableSet<Closure<Object>> transformedNavigableSet0 = TransformedNavigableSet.transformingNavigableSet((NavigableSet<Closure<Object>>) treeSet0, (Transformer<? super Closure<Object>, ? extends Closure<Object>>) transformer0);
      // Undeclared exception!
      try { 
        transformedNavigableSet0.tailSet((Closure<Object>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Transformer<String, String> transformer0 = StringValueTransformer.stringValueTransformer();
      TransformedNavigableSet<String> transformedNavigableSet0 = TransformedNavigableSet.transformedNavigableSet((NavigableSet<String>) treeSet0, (Transformer<? super String, ? extends String>) transformer0);
      // Undeclared exception!
      try { 
        transformedNavigableSet0.subSet("org.apache.commons.collections4.functors.DefaultEquator", true, "SQhy@8|", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromKey > toKey
         //
         verifyException("java.util.TreeMap$NavigableSubMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      Integer integer0 = new Integer((-304));
      Transformer<Object, Integer> transformer0 = ConstantTransformer.constantTransformer(integer0);
      TransformedNavigableSet<Integer> transformedNavigableSet0 = TransformedNavigableSet.transformingNavigableSet((NavigableSet<Integer>) treeSet0, (Transformer<? super Integer, ? extends Integer>) transformer0);
      Iterator<Integer> iterator0 = transformedNavigableSet0.descendingIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TreeSet<Closure<Object>> treeSet0 = new TreeSet<Closure<Object>>();
      Transformer<Object, Closure<Object>> transformer0 = ConstantTransformer.nullTransformer();
      TransformedNavigableSet<Closure<Object>> transformedNavigableSet0 = TransformedNavigableSet.transformingNavigableSet((NavigableSet<Closure<Object>>) treeSet0, (Transformer<? super Closure<Object>, ? extends Closure<Object>>) transformer0);
      Closure<Object> closure0 = transformedNavigableSet0.pollFirst();
      assertNull(closure0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TreeSet<Predicate<Object>> treeSet0 = new TreeSet<Predicate<Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Predicate<Object> predicate0 = ComparatorPredicate.comparatorPredicate((Object) treeSet0, comparator0);
      ConstantTransformer<Object, Predicate<Object>> constantTransformer0 = new ConstantTransformer<Object, Predicate<Object>>(predicate0);
      TransformedNavigableSet<Predicate<Object>> transformedNavigableSet0 = TransformedNavigableSet.transformedNavigableSet((NavigableSet<Predicate<Object>>) treeSet0, (Transformer<? super Predicate<Object>, ? extends Predicate<Object>>) constantTransformer0);
      Predicate<Object> predicate1 = transformedNavigableSet0.higher(predicate0);
      assertNull(predicate1);
  }
}
