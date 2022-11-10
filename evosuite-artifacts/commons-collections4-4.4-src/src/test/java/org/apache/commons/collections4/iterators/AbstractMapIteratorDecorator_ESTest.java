/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:09:14 GMT 2022
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator;
import org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator;
import org.apache.commons.collections4.iterators.EmptyMapIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedMapIterator;
import org.apache.commons.collections4.iterators.EntrySetMapIterator;
import org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractMapIteratorDecorator_ESTest extends AbstractMapIteratorDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("1KQ@=Q]6eSm)R-p]", "1KQ@=Q]6eSm)R-p]");
      EntrySetMapIterator<String, String> entrySetMapIterator0 = new EntrySetMapIterator<String, String>(hashMap0);
      entrySetMapIterator0.next();
      AbstractMapIteratorDecorator<String, String> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<String, String>(entrySetMapIterator0);
      String string0 = abstractMapIteratorDecorator0.setValue("IPYzMLJ+qcug");
      assertEquals("1KQ@=Q]6eSm)R-p]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = new Integer(0);
      hashMap0.put(integer0, (Object) null);
      EntrySetMapIterator<Integer, Object> entrySetMapIterator0 = new EntrySetMapIterator<Integer, Object>(hashMap0);
      AbstractMapIteratorDecorator<Integer, Object> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<Integer, Object>(entrySetMapIterator0);
      abstractMapIteratorDecorator0.next();
      abstractMapIteratorDecorator0.remove();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = new Integer(0);
      hashMap0.put(integer0, (Object) null);
      EntrySetMapIterator<Integer, Object> entrySetMapIterator0 = new EntrySetMapIterator<Integer, Object>(hashMap0);
      AbstractMapIteratorDecorator<Integer, Object> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<Integer, Object>(entrySetMapIterator0);
      boolean boolean0 = abstractMapIteratorDecorator0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "Cannot store a duplicate key (\"");
      EntrySetMapIterator<String, String> entrySetMapIterator0 = new EntrySetMapIterator<String, String>(hashMap0);
      AbstractMapIteratorDecorator<String, String> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<String, String>(entrySetMapIterator0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      abstractMapIteratorDecorator0.forEachRemaining(consumer0);
      String string0 = abstractMapIteratorDecorator0.getKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OrderedMapIterator<Object, Object> orderedMapIterator0 = EmptyOrderedMapIterator.emptyOrderedMapIterator();
      OrderedMapIterator<Object, Object> orderedMapIterator1 = UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator((OrderedMapIterator<Object, ?>) orderedMapIterator0);
      AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator0 = new AbstractOrderedMapIteratorDecorator<Object, Object>(orderedMapIterator1);
      AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<Object, Object>(abstractOrderedMapIteratorDecorator0);
      // Undeclared exception!
      try { 
        abstractMapIteratorDecorator0.setValue(orderedMapIterator1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // setValue() is not supported
         //
         verifyException("org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("1KQ@=Q]6eSm)R-p]", "1KQ@=Q]6eSm)R-p]");
      EntrySetMapIterator<String, String> entrySetMapIterator0 = new EntrySetMapIterator<String, String>(hashMap0);
      entrySetMapIterator0.next();
      hashMap0.put("org.apache.commons.collections4.bidimap.TreeBidiMap$InverseViewMapIterator", "1KQ@=Q]6eSm)R-p]");
      AbstractMapIteratorDecorator<String, String> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<String, String>(entrySetMapIterator0);
      // Undeclared exception!
      try { 
        abstractMapIteratorDecorator0.remove();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap$HashIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EmptyOrderedMapIterator<Object, String> emptyOrderedMapIterator0 = new EmptyOrderedMapIterator<Object, String>();
      OrderedMapIterator<Object, String> orderedMapIterator0 = UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator((OrderedMapIterator<Object, ? extends String>) emptyOrderedMapIterator0);
      AbstractMapIteratorDecorator<Object, String> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<Object, String>(orderedMapIterator0);
      // Undeclared exception!
      try { 
        abstractMapIteratorDecorator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // remove() is not supported
         //
         verifyException("org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EmptyMapIterator<Object, String> emptyMapIterator0 = new EmptyMapIterator<Object, String>();
      AbstractMapIteratorDecorator<Object, String> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<Object, String>(emptyMapIterator0);
      // Undeclared exception!
      try { 
        abstractMapIteratorDecorator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // Iterator contains no elements
         //
         verifyException("org.apache.commons.collections4.iterators.AbstractEmptyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      EntrySetMapIterator<Object, String> entrySetMapIterator0 = new EntrySetMapIterator<Object, String>(hashMap0);
      AbstractMapIteratorDecorator<Object, String> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<Object, String>(entrySetMapIterator0);
      Integer integer0 = new Integer(0);
      hashMap0.put(integer0, "js");
      // Undeclared exception!
      try { 
        abstractMapIteratorDecorator0.next();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap$HashIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AbstractMapIteratorDecorator<Integer, Object> abstractMapIteratorDecorator0 = null;
      try {
        abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<Integer, Object>((MapIterator<Integer, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // MapIterator must not be null
         //
         verifyException("org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EmptyOrderedMapIterator<Object, String> emptyOrderedMapIterator0 = new EmptyOrderedMapIterator<Object, String>();
      AbstractMapIteratorDecorator<Object, String> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<Object, String>(emptyOrderedMapIterator0);
      // Undeclared exception!
      try { 
        abstractMapIteratorDecorator0.getValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator contains no elements
         //
         verifyException("org.apache.commons.collections4.iterators.AbstractEmptyMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      EntrySetMapIterator<Integer, Object> entrySetMapIterator0 = new EntrySetMapIterator<Integer, Object>(hashMap0);
      AbstractMapIteratorDecorator<Integer, Object> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<Integer, Object>(entrySetMapIterator0);
      boolean boolean0 = abstractMapIteratorDecorator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OrderedMapIterator<Object, Integer> orderedMapIterator0 = EmptyOrderedMapIterator.emptyOrderedMapIterator();
      AbstractMapIteratorDecorator<Object, Integer> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<Object, Integer>(orderedMapIterator0);
      // Undeclared exception!
      try { 
        abstractMapIteratorDecorator0.getKey();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator contains no elements
         //
         verifyException("org.apache.commons.collections4.iterators.AbstractEmptyMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EmptyMapIterator<Object, Object> emptyMapIterator0 = new EmptyMapIterator<Object, Object>();
      AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<Object, Object>(emptyMapIterator0);
      MapIterator<Object, Object> mapIterator0 = abstractMapIteratorDecorator0.getMapIterator();
      assertNotNull(mapIterator0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      EntrySetMapIterator<Integer, Object> entrySetMapIterator0 = new EntrySetMapIterator<Integer, Object>(hashMap0);
      AbstractMapIteratorDecorator<Integer, Object> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<Integer, Object>(entrySetMapIterator0);
      // Undeclared exception!
      try { 
        abstractMapIteratorDecorator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap$HashIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      EntrySetMapIterator<String, String> entrySetMapIterator0 = new EntrySetMapIterator<String, String>(hashMap0);
      AbstractMapIteratorDecorator<String, String> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<String, String>(entrySetMapIterator0);
      // Undeclared exception!
      try { 
        abstractMapIteratorDecorator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator remove() can only be called once after next()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EmptyMapIterator<Object, String> emptyMapIterator0 = new EmptyMapIterator<Object, String>();
      AbstractMapIteratorDecorator<Object, String> abstractMapIteratorDecorator0 = new AbstractMapIteratorDecorator<Object, String>(emptyMapIterator0);
      // Undeclared exception!
      try { 
        abstractMapIteratorDecorator0.setValue("qF5V}ql");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator contains no elements
         //
         verifyException("org.apache.commons.collections4.iterators.AbstractEmptyMapIterator", e);
      }
  }
}
