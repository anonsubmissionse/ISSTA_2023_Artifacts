/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 19:05:33 GMT 2022
 */

package org.apache.commons.pool2.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import org.apache.commons.pool2.impl.InterruptibleReentrantLock;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InterruptibleReentrantLock_ESTest extends InterruptibleReentrantLock_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InterruptibleReentrantLock interruptibleReentrantLock0 = new InterruptibleReentrantLock(false);
      Condition condition0 = interruptibleReentrantLock0.newCondition();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      interruptibleReentrantLock0.tryLock((-2819L), timeUnit0);
      interruptibleReentrantLock0.interruptWaiters(condition0);
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InterruptibleReentrantLock interruptibleReentrantLock0 = new InterruptibleReentrantLock(true);
      Condition condition0 = interruptibleReentrantLock0.newCondition();
      // Undeclared exception!
      try { 
        interruptibleReentrantLock0.interruptWaiters(condition0);
        fail("Expecting exception: IllegalMonitorStateException");
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InterruptibleReentrantLock interruptibleReentrantLock0 = new InterruptibleReentrantLock(false);
      AbstractQueuedSynchronizer abstractQueuedSynchronizer0 = mock(AbstractQueuedSynchronizer.class, new ViolatedAssumptionAnswer());
      AbstractQueuedSynchronizer.ConditionObject abstractQueuedSynchronizer_ConditionObject0 = abstractQueuedSynchronizer0.new ConditionObject();
      // Undeclared exception!
      try { 
        interruptibleReentrantLock0.interruptWaiters(abstractQueuedSynchronizer_ConditionObject0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Not owner
         //
         verifyException("java.util.concurrent.locks.AbstractQueuedSynchronizer", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InterruptibleReentrantLock interruptibleReentrantLock0 = new InterruptibleReentrantLock(false);
      // Undeclared exception!
      try { 
        interruptibleReentrantLock0.interruptWaiters((Condition) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.locks.ReentrantLock", e);
      }
  }
}
