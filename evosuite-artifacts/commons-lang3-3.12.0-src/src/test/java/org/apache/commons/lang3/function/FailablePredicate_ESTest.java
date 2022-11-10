/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:28:18 GMT 2022
 */

package org.apache.commons.lang3.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.function.FailablePredicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FailablePredicate_ESTest extends FailablePredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FailablePredicate<Object, Throwable> failablePredicate0 = FailablePredicate.truePredicate();
      FailablePredicate<Throwable, Throwable> failablePredicate1 = FailablePredicate.falsePredicate();
      FailablePredicate<Throwable, Throwable> failablePredicate2 = failablePredicate1.or(failablePredicate0);
      assertFalse(failablePredicate2.equals((Object)failablePredicate1));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FailablePredicate<Object, Throwable> failablePredicate0 = FailablePredicate.falsePredicate();
      FailablePredicate<Object, Throwable> failablePredicate1 = failablePredicate0.negate();
      FailablePredicate<Object, Throwable> failablePredicate2 = failablePredicate0.and(failablePredicate1);
      assertFalse(failablePredicate2.equals((Object)failablePredicate1));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FailablePredicate<String, Throwable> failablePredicate0 = FailablePredicate.truePredicate();
      FailablePredicate<String, Throwable> failablePredicate1 = failablePredicate0.negate();
      boolean boolean0 = failablePredicate1.test("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FailablePredicate<String, Throwable> failablePredicate0 = FailablePredicate.truePredicate();
      // Undeclared exception!
      try { 
        failablePredicate0.or((FailablePredicate<? super String, Throwable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FailablePredicate<Object, Throwable> failablePredicate0 = FailablePredicate.falsePredicate();
      // Undeclared exception!
      try { 
        failablePredicate0.and((FailablePredicate<? super Object, Throwable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FailablePredicate<Object, Throwable> failablePredicate0 = FailablePredicate.falsePredicate();
      FailablePredicate<Object, Throwable> failablePredicate1 = failablePredicate0.negate();
      boolean boolean0 = failablePredicate1.test(failablePredicate1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FailablePredicate<Integer, Throwable> failablePredicate0 = FailablePredicate.falsePredicate();
      FailablePredicate<Object, Throwable> failablePredicate1 = FailablePredicate.falsePredicate();
      FailablePredicate<Integer, Throwable> failablePredicate2 = failablePredicate0.or(failablePredicate1);
      assertFalse(failablePredicate2.equals((Object)failablePredicate0));
  }
}
