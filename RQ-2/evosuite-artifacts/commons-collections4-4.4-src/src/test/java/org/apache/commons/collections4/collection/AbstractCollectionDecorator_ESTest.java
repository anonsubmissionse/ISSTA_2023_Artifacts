/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 01:54:47 GMT 2022
 */

package org.apache.commons.collections4.collection;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.collection.IndexedCollection;
import org.apache.commons.collections4.collection.PredicatedCollection;
import org.apache.commons.collections4.collection.TransformedCollection;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.NullPredicate;
import org.apache.commons.collections4.functors.PredicateTransformer;
import org.apache.commons.collections4.list.FixedSizeList;
import org.apache.commons.collections4.queue.CircularFifoQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCollectionDecorator_ESTest extends AbstractCollectionDecorator_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      FixedSizeList<String> fixedSizeList0 = FixedSizeList.fixedSizeList((List<String>) linkedList0);
      int int0 = fixedSizeList0.size();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      FixedSizeList<Object> fixedSizeList0 = FixedSizeList.fixedSizeList((List<Object>) linkedList0);
      PredicateTransformer<Object> predicateTransformer0 = new PredicateTransformer<Object>((Predicate<? super Object>) null);
      IndexedCollection<Boolean, Object> indexedCollection0 = IndexedCollection.uniqueIndexedCollection((Collection<Object>) fixedSizeList0, (Transformer<Object, Boolean>) predicateTransformer0);
      java.util.function.Predicate<Object> predicate0 = java.util.function.Predicate.isEqual((Object) predicateTransformer0);
      boolean boolean0 = indexedCollection0.removeIf(predicate0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CircularFifoQueue<InstanceofPredicate> circularFifoQueue0 = new CircularFifoQueue<InstanceofPredicate>(4826);
      Class<InstanceofPredicate> class0 = InstanceofPredicate.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      Transformer<Object, InstanceofPredicate> transformer0 = ConstantTransformer.constantTransformer(instanceofPredicate0);
      TransformedCollection<InstanceofPredicate> transformedCollection0 = TransformedCollection.transformingCollection((Collection<InstanceofPredicate>) circularFifoQueue0, (Transformer<? super InstanceofPredicate, ? extends InstanceofPredicate>) transformer0);
      boolean boolean0 = transformedCollection0.removeAll(circularFifoQueue0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Closure<Object>> linkedList0 = new LinkedList<Closure<Object>>();
      FixedSizeList<Closure<Object>> fixedSizeList0 = FixedSizeList.fixedSizeList((List<Closure<Object>>) linkedList0);
      Iterator<Closure<Object>> iterator0 = fixedSizeList0.iterator();
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Predicate<Object> predicate0 = NullPredicate.nullPredicate();
      PredicatedCollection<Integer> predicatedCollection0 = new PredicatedCollection<Integer>(linkedList0, predicate0);
      Collection<Integer> collection0 = predicatedCollection0.decorated();
      assertNotNull(collection0);
}
}
