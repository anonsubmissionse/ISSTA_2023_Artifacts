/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 03:50:37 GMT 2022
 */

package org.springside.modules.utils.collection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.springside.modules.utils.collection.ListUtil;
import org.springside.modules.utils.collection.type.SortedArrayList;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ListUtil_ESTest extends ListUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ArrayList<String> arrayList0 = ListUtil.newArrayList(stringArray0);
      List<String> list0 = ListUtil.disjoint((List<? extends String>) arrayList0, (List<? extends String>) arrayList0);
      List<String> list1 = ListUtil.disjoint((List<? extends String>) list0, (List<? extends String>) arrayList0);
      assertEquals(3, list1.size());
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      vector0.add("");
      vector0.add("");
      String string0 = ListUtil.getLast((List<String>) vector0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<Integer> arrayList0 = ListUtil.newArrayList();
      ListUtil.sort((List<Integer>) arrayList0, (Comparator<? super Integer>) null);
      assertTrue(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      ListUtil.union((List<? extends Integer>) arrayList0, (List<? extends Integer>) arrayList0);
      assertEquals(1, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<Integer> arrayList0 = ListUtil.newArrayListWithCapacity(1753);
      List<Integer> list0 = ListUtil.reverse((List<Integer>) arrayList0);
      List<Integer> list1 = ListUtil.reverse((List<Integer>) list0);
      assertTrue(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Stack<ListUtil> stack0 = new Stack<ListUtil>();
      List<ListUtil> list0 = ListUtil.reverse((List<ListUtil>) stack0);
      stack0.add((ListUtil) null);
      List<ListUtil> list1 = ListUtil.reverse((List<ListUtil>) list0);
      assertTrue(list1.equals((Object)list0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayDeque<Integer> arrayDeque0 = new ArrayDeque<Integer>();
      Integer integer0 = new Integer(0);
      arrayDeque0.add(integer0);
      HashSet<Integer> hashSet0 = new HashSet<Integer>(arrayDeque0);
      LinkedList<Integer> linkedList0 = ListUtil.newLinkedList((Iterable<? extends Integer>) hashSet0);
      assertEquals(1, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparable[] comparableArray0 = (Comparable[]) Array.newInstance(Comparable.class, 0);
      CopyOnWriteArrayList<Comparable<String>> copyOnWriteArrayList0 = ListUtil.newCopyOnWriteArrayList((Comparable<String>[]) comparableArray0);
      assertTrue(copyOnWriteArrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Locale.FilteringMode> arrayList0 = ListUtil.newArrayListWithCapacity(0);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      arrayList0.add(locale_FilteringMode0);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>(arrayList0);
      ArrayList<Object> arrayList1 = ListUtil.newArrayList((Iterable<Object>) linkedHashSet0);
      assertFalse(arrayList1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Stack<ListUtil> stack0 = new Stack<ListUtil>();
      stack0.add((ListUtil) null);
      List<ListUtil> list0 = ListUtil.emptyListIfNull((List<ListUtil>) stack0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer[] integerArray0 = new Integer[9];
      CopyOnWriteArrayList<Integer> copyOnWriteArrayList0 = ListUtil.newCopyOnWriteArrayList(integerArray0);
      SortedArrayList<Integer> sortedArrayList0 = ListUtil.createSortedArrayList();
      List<Integer> list0 = ListUtil.difference((List<? extends Integer>) copyOnWriteArrayList0, (List<? extends Integer>) sortedArrayList0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayList<String> arrayList0 = ListUtil.newArrayList();
      arrayList0.add("");
      int int0 = ListUtil.binarySearch((List<? extends String>) arrayList0, "", (Comparator<? super String>) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer[] integerArray0 = new Integer[4];
      Integer integer0 = new Integer((-3454));
      ArrayList<Integer> arrayList0 = ListUtil.newArrayList(integerArray0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      int int0 = ListUtil.binarySearch((List<? extends Integer>) arrayList0, integer0, (Comparator<? super Integer>) comparator0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      List<Locale.FilteringMode> list0 = ListUtil.singletonList(locale_FilteringMode0);
      int int0 = ListUtil.binarySearch((List<? extends Comparable<? super Locale.FilteringMode>>) list0, locale_FilteringMode0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<String> linkedList0 = ListUtil.newLinkedList();
      linkedList0.add("org.springside.modules.utils.collection.ListUtil");
      linkedList0.add("org.springside.modules.utils.collection.ListUtil");
      linkedList0.addFirst("org.springside.modules.utils.collection.ListUtil");
      int int0 = ListUtil.binarySearch((List<? extends Comparable<? super String>>) linkedList0, "org.springside.modules.utils.collection.ListUtil");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListUtil.unmodifiableList((List<? extends String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListUtil.union((List<? extends Locale.LanguageRange>) null, (List<? extends Locale.LanguageRange>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.ListUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListUtil.synchronizedList((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Locale.FilteringMode> linkedList0 = ListUtil.newLinkedList();
      List<Locale.FilteringMode> list0 = ListUtil.unmodifiableList((List<? extends Locale.FilteringMode>) linkedList0);
      Comparator<Locale.FilteringMode> comparator0 = (Comparator<Locale.FilteringMode>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ListUtil.sortReverse((List<Locale.FilteringMode>) list0, (Comparator<? super Locale.FilteringMode>) comparator0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ListUtil.sortReverse((List<Comparable<Object>>) null, (Comparator<? super Comparable<Object>>) comparator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      List<String> list0 = ListUtil.emptyList();
      List<String> list1 = ListUtil.unmodifiableList((List<? extends String>) list0);
      // Undeclared exception!
      try { 
        ListUtil.sortReverse((List<String>) list1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListUtil.sortReverse((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<Comparable<Integer>> linkedList0 = ListUtil.newLinkedList();
      List<Object> list0 = ListUtil.unmodifiableList((List<?>) linkedList0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ListUtil.sort((List<Object>) list0, (Comparator<? super Object>) comparator0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Object[] objectArray0 = new Object[2];
      objectArray0[1] = (Object) vector0;
      CopyOnWriteArrayList<Object> copyOnWriteArrayList0 = ListUtil.newCopyOnWriteArrayList(objectArray0);
      // Undeclared exception!
      try { 
        ListUtil.sort((List<Object>) copyOnWriteArrayList0, (Comparator<? super Object>) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      SortedArrayList<String> sortedArrayList0 = ListUtil.createSortedArrayList((Comparator<? super String>) comparator0);
      List<String> list0 = ListUtil.unmodifiableList((List<? extends String>) sortedArrayList0);
      // Undeclared exception!
      try { 
        ListUtil.sort((List<String>) list0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListUtil.sort((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[3];
      CopyOnWriteArrayList<String> copyOnWriteArrayList0 = ListUtil.newCopyOnWriteArrayList(stringArray0);
      List<String> list0 = ListUtil.unmodifiableList((List<? extends String>) copyOnWriteArrayList0);
      MockRandom mockRandom0 = new MockRandom((-675L));
      // Undeclared exception!
      try { 
        ListUtil.shuffle((List<?>) list0, (Random) mockRandom0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SortedArrayList<Integer> sortedArrayList0 = ListUtil.createSortedArrayList();
      Integer integer0 = new Integer((-1));
      sortedArrayList0.add(integer0);
      sortedArrayList0.add(integer0);
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        ListUtil.shuffle((List<?>) sortedArrayList0, (Random) mockRandom0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.type.SortedArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-264L));
      // Undeclared exception!
      try { 
        ListUtil.shuffle((List<?>) null, (Random) mockRandom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale.Category[] locale_CategoryArray0 = new Locale.Category[1];
      ArrayList<Locale.Category> arrayList0 = ListUtil.newArrayList(locale_CategoryArray0);
      List<Locale.Category> list0 = ListUtil.unmodifiableList((List<? extends Locale.Category>) arrayList0);
      arrayList0.add(locale_CategoryArray0[0]);
      // Undeclared exception!
      try { 
        ListUtil.shuffle(list0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableList", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListUtil.shuffle((List<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListUtil.reverse((List<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListUtil.newLinkedList((Iterable<? extends Locale.FilteringMode>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListUtil.newCopyOnWriteArrayList((Comparable<Integer>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.CopyOnWriteArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListUtil.newArrayListWithCapacity((-1099));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1099
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListUtil.newArrayList((Comparable<String>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListUtil.newArrayList((Iterable<Locale.FilteringMode>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedList<String> linkedList0 = ListUtil.newLinkedList();
      // Undeclared exception!
      try { 
        ListUtil.intersection((List<? extends String>) null, (List<? extends String>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.ListUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListUtil.disjoint((List<? extends Integer>) null, (List<? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.ListUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListUtil.difference((List<? extends Integer>) null, (List<? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ListUtil.binarySearch((List<? extends Comparable<Integer>>) null, (Comparable<Integer>) integer0, (Comparator<? super Comparable<Integer>>) comparator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      List<String> list0 = ListUtil.emptyList();
      List<String> list1 = ListUtil.unmodifiableList((List<? extends String>) list0);
      List[] listArray0 = (List[]) Array.newInstance(List.class, 2);
      listArray0[0] = list1;
      CopyOnWriteArrayList<List<String>> copyOnWriteArrayList0 = ListUtil.newCopyOnWriteArrayList((List<String>[]) listArray0);
      // Undeclared exception!
      try { 
        ListUtil.binarySearch((List<? extends List<String>>) copyOnWriteArrayList0, list1, (Comparator<? super List<String>>) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      SortedArrayList<Comparable<Object>> sortedArrayList0 = ListUtil.createSortedArrayList((Comparator<? super Comparable<Object>>) comparator0);
      LinkedList<Comparable<Object>> linkedList0 = ListUtil.newLinkedList((Iterable<? extends Comparable<Object>>) sortedArrayList0);
      linkedList0.add((Comparable<Object>) null);
      // Undeclared exception!
      try { 
        ListUtil.binarySearch((List<? extends Comparable<? super Object>>) linkedList0, (Object) "&}3ig>O+im,7i");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ArrayList<Locale.FilteringMode> arrayList0 = new ArrayList<Locale.FilteringMode>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      arrayList0.add(locale_FilteringMode0);
      List<Object> list0 = ListUtil.intersection((List<?>) arrayList0, (List<?>) arrayList0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ArrayList<Locale.FilteringMode> arrayList0 = new ArrayList<Locale.FilteringMode>();
      List<Object> list0 = ListUtil.intersection((List<?>) arrayList0, (List<?>) arrayList0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      vector0.add("O4Ea6T4_09zp[},&");
      List<String> list0 = ListUtil.difference((List<? extends String>) vector0, (List<? extends String>) vector0);
      List<String> list1 = ListUtil.intersection((List<? extends String>) vector0, (List<? extends String>) list0);
      assertNotSame(list1, list0);
      assertFalse(list1.contains("O4Ea6T4_09zp[},&"));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ArrayList<String> arrayList0 = ListUtil.newArrayList(stringArray0);
      boolean boolean0 = ListUtil.isEmpty(arrayList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = ListUtil.isEmpty((List<?>) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      List<Locale.Category> list0 = ListUtil.emptyList();
      boolean boolean0 = ListUtil.isEmpty(list0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      List<String> list0 = ListUtil.union((List<? extends String>) vector0, (List<? extends String>) vector0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      List<ArrayList<Object>> list0 = ListUtil.emptyListIfNull((List<ArrayList<Object>>) null);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      List<String> list0 = ListUtil.emptyListIfNull((List<String>) vector0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      linkedList0.add(integer0);
      boolean boolean0 = ListUtil.isNotEmpty(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ArrayList<Integer> arrayList0 = ListUtil.newArrayListWithCapacity(1753);
      boolean boolean0 = ListUtil.isNotEmpty(arrayList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      boolean boolean0 = ListUtil.isNotEmpty((List<?>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedList<String> linkedList0 = ListUtil.newLinkedList();
      linkedList0.add("org.springside.modules.utils.collection.ListUtil");
      String string0 = ListUtil.getFirst((List<String>) linkedList0);
      assertTrue(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Object object0 = ListUtil.getLast((List<Object>) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CopyOnWriteArrayList<String> copyOnWriteArrayList0 = ListUtil.newCopyOnWriteArrayList();
      assertTrue(copyOnWriteArrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String[] stringArray0 = new String[1];
      CopyOnWriteArrayList<Object> copyOnWriteArrayList0 = ListUtil.newCopyOnWriteArrayList((Object[]) stringArray0);
      ListUtil.shuffle((List<?>) copyOnWriteArrayList0);
      assertFalse(copyOnWriteArrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LinkedList<Locale.FilteringMode> linkedList0 = ListUtil.newLinkedList();
      Comparator<Locale.FilteringMode> comparator0 = (Comparator<Locale.FilteringMode>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      ListUtil.sortReverse((List<Locale.FilteringMode>) linkedList0, (Comparator<? super Locale.FilteringMode>) comparator0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LinkedList<String> linkedList0 = ListUtil.newLinkedList();
      String string0 = ListUtil.getFirst((List<String>) linkedList0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = ListUtil.createSortedArrayList();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      int int0 = ListUtil.binarySearch((List<?>) sortedArrayList0, (Object) sortedArrayList0, (Comparator<? super Object>) comparator0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      SortedArrayList<String> sortedArrayList0 = ListUtil.createSortedArrayList();
      ListUtil.sort((List<String>) sortedArrayList0);
      assertEquals(0, sortedArrayList0.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ArrayList<String> arrayList0 = ListUtil.newArrayList(stringArray0);
      MockRandom mockRandom0 = new MockRandom();
      ListUtil.shuffle((List<?>) arrayList0, (Random) mockRandom0);
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      CopyOnWriteArrayList<Object> copyOnWriteArrayList0 = ListUtil.newCopyOnWriteArrayList(objectArray0);
      // Undeclared exception!
      try { 
        ListUtil.sort((List<Object>) copyOnWriteArrayList0, (Comparator<? super Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ListUtil listUtil0 = new ListUtil();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      SortedArrayList<Object> sortedArrayList0 = ListUtil.createSortedArrayList((Comparator<? super Object>) comparator0);
      Object object0 = new Object();
      sortedArrayList0.add(object0);
      sortedArrayList0.add((Object) listUtil0);
      // Undeclared exception!
      try { 
        ListUtil.shuffle((List<?>) sortedArrayList0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.collection.type.SortedArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      List<Integer> list0 = ListUtil.emptyList();
      ArrayList<Integer> arrayList0 = ListUtil.newArrayList((Iterable<Integer>) list0);
      List<Integer> list1 = ListUtil.unmodifiableList((List<? extends Integer>) arrayList0);
      assertTrue(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ArrayList<String> arrayList0 = ListUtil.newArrayList();
      ListUtil.sortReverse((List<String>) arrayList0);
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      SortedArrayList<Object> sortedArrayList0 = ListUtil.createSortedArrayList((Comparator<? super Object>) comparator0);
      List<Object> list0 = ListUtil.synchronizedList((List<Object>) sortedArrayList0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      List<String> list0 = ListUtil.emptyList();
      int int0 = ListUtil.binarySearch((List<? extends Comparable<? super String>>) list0, "com.google.common.io.PatternFilenameFilter");
      assertEquals((-1), int0);
  }
}
