/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 04:05:47 GMT 2022
 */

package org.springside.modules.utils.collection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.EvictingQueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.utils.collection.QueueUtil;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QueueUtil_ESTest extends QueueUtil_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvictingQueue<String> evictingQueue0 = QueueUtil.createLRUQueue(1805);
      assertNotNull(evictingQueue0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueueUtil.newLinkedBlockingQeque(0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.LinkedBlockingQueue", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueueUtil.newBlockingDeque((-515));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.LinkedBlockingDeque", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueueUtil.newArrayBlockingQueue(0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ArrayBlockingQueue", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Deque<Object> deque0 = QueueUtil.newConcurrentNonBlockingDeque();
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedBlockingDeque<Object> linkedBlockingDeque0 = QueueUtil.newBlockingUnlimitDeque();
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Queue<Object> queue0 = QueueUtil.createStack(2448);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedBlockingQueue<String> linkedBlockingQueue0 = QueueUtil.newLinkedBlockingQeque(2448);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LinkedBlockingDeque<Object> linkedBlockingDeque0 = QueueUtil.newBlockingDeque(43);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LinkedBlockingQueue<Integer> linkedBlockingQueue0 = QueueUtil.newBlockingUnlimitQueue();
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<String> linkedList0 = QueueUtil.newLinkedDeque();
      assertEquals(1, linkedList0.size());
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Queue<String> queue0 = QueueUtil.createConcurrentStack();
      assertNotNull(queue0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayBlockingQueue<String> arrayBlockingQueue0 = QueueUtil.newArrayBlockingQueue(43);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayDeque<String> arrayDeque0 = QueueUtil.newArrayDeque(2448);
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueueUtil.createLRUQueue((-1555));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // maxSize (-1555) must >= 0
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConcurrentLinkedQueue<Object> concurrentLinkedQueue0 = QueueUtil.newConcurrentNonBlockingQueue();
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QueueUtil queueUtil0 = new QueueUtil();
  }
}
