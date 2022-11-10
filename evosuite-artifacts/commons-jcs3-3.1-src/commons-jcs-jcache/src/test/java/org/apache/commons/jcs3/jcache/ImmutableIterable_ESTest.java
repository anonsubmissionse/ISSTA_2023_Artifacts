/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:21:18 GMT 2022
 */

package org.apache.commons.jcs3.jcache;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.jcs3.jcache.ImmutableIterable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ImmutableIterable_ESTest extends ImmutableIterable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      List<Object> list0 = linkedList0.subList(0, 0);
      linkedList0.addFirst(list0);
      ImmutableIterable<Object> immutableIterable0 = null;
      try {
        immutableIterable0 = new ImmutableIterable<Object>(list0);
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
      ImmutableIterable<Integer> immutableIterable0 = null;
      try {
        immutableIterable0 = new ImmutableIterable<Integer>((Collection<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ImmutableIterable<Object> immutableIterable0 = new ImmutableIterable<Object>(linkedList0);
      Iterator<Object> iterator0 = immutableIterable0.iterator();
      assertNotNull(iterator0);
  }
}
