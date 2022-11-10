/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 17:15:37 GMT 2022
 */

package spark.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.jetty.util.InetAddressSet;
import org.eclipse.jetty.util.RegexSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.utils.CollectionUtils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CollectionUtils_ESTest extends CollectionUtils_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      List<Object> list0 = linkedList0.subList(0, 0);
      linkedList0.add(object0);
      // Undeclared exception!
      try { 
        CollectionUtils.isEmpty(list0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<InetAddressSet> linkedList0 = new LinkedList<InetAddressSet>();
      boolean boolean0 = CollectionUtils.isEmpty(linkedList0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedHashSet<RegexSet> linkedHashSet0 = new LinkedHashSet<RegexSet>();
      RegexSet regexSet0 = new RegexSet();
      linkedHashSet0.add(regexSet0);
      boolean boolean0 = CollectionUtils.isEmpty(linkedHashSet0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<InetAddressSet> linkedList0 = new LinkedList<InetAddressSet>();
      linkedList0.add((InetAddressSet) null);
      boolean boolean0 = CollectionUtils.isNotEmpty(linkedList0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<InetAddressSet> linkedList0 = new LinkedList<InetAddressSet>();
      boolean boolean0 = CollectionUtils.isNotEmpty(linkedList0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      boolean boolean0 = CollectionUtils.isEmpty((Collection<?>) null);
      assertTrue(boolean0);
}
}
