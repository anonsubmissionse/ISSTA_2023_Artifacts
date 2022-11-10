/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:22:33 GMT 2022
 */

package org.apache.commons.lang3.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.function.FailableDoublePredicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FailableDoublePredicate_ESTest extends FailableDoublePredicate_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FailableDoublePredicate<Throwable> failableDoublePredicate0 = FailableDoublePredicate.falsePredicate();
      FailableDoublePredicate<Throwable> failableDoublePredicate1 = FailableDoublePredicate.truePredicate();
      FailableDoublePredicate<Throwable> failableDoublePredicate2 = failableDoublePredicate0.or(failableDoublePredicate1);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FailableDoublePredicate<Throwable> failableDoublePredicate0 = FailableDoublePredicate.falsePredicate();
      FailableDoublePredicate<Throwable> failableDoublePredicate1 = FailableDoublePredicate.truePredicate();
      FailableDoublePredicate<Throwable> failableDoublePredicate2 = failableDoublePredicate1.and(failableDoublePredicate0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FailableDoublePredicate<Throwable> failableDoublePredicate0 = FailableDoublePredicate.truePredicate();
      boolean boolean0 = failableDoublePredicate0.test(0.0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FailableDoublePredicate<Throwable> failableDoublePredicate0 = FailableDoublePredicate.falsePredicate();
      boolean boolean0 = failableDoublePredicate0.test(1386.0);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FailableDoublePredicate<Throwable> failableDoublePredicate0 = FailableDoublePredicate.falsePredicate();
      // Undeclared exception!
      try { 
        failableDoublePredicate0.or((FailableDoublePredicate<Throwable>) null);
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
      FailableDoublePredicate<Throwable> failableDoublePredicate0 = FailableDoublePredicate.falsePredicate();
      FailableDoublePredicate<Throwable> failableDoublePredicate1 = failableDoublePredicate0.or(failableDoublePredicate0);
      FailableDoublePredicate<Throwable> failableDoublePredicate2 = failableDoublePredicate0.and(failableDoublePredicate1);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FailableDoublePredicate<Throwable> failableDoublePredicate0 = FailableDoublePredicate.falsePredicate();
      FailableDoublePredicate<Throwable> failableDoublePredicate1 = failableDoublePredicate0.negate();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FailableDoublePredicate<Throwable> failableDoublePredicate0 = FailableDoublePredicate.truePredicate();
      // Undeclared exception!
      try { 
        failableDoublePredicate0.and((FailableDoublePredicate<Throwable>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }
}
