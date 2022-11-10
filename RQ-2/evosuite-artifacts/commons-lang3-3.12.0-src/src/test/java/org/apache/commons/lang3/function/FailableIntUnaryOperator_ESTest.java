/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:26:29 GMT 2022
 */

package org.apache.commons.lang3.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.function.FailableIntUnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FailableIntUnaryOperator_ESTest extends FailableIntUnaryOperator_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FailableIntUnaryOperator<Throwable> failableIntUnaryOperator0 = FailableIntUnaryOperator.identity();
      FailableIntUnaryOperator<Throwable> failableIntUnaryOperator1 = failableIntUnaryOperator0.compose(failableIntUnaryOperator0);
      FailableIntUnaryOperator<Throwable> failableIntUnaryOperator2 = failableIntUnaryOperator0.compose(failableIntUnaryOperator1);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FailableIntUnaryOperator<Throwable> failableIntUnaryOperator0 = FailableIntUnaryOperator.nop();
      int int0 = failableIntUnaryOperator0.applyAsInt(0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FailableIntUnaryOperator<Throwable> failableIntUnaryOperator0 = FailableIntUnaryOperator.identity();
      int int0 = failableIntUnaryOperator0.applyAsInt(3113);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FailableIntUnaryOperator<Throwable> failableIntUnaryOperator0 = FailableIntUnaryOperator.identity();
      int int0 = failableIntUnaryOperator0.applyAsInt((-1944));
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FailableIntUnaryOperator<Throwable> failableIntUnaryOperator0 = FailableIntUnaryOperator.nop();
      // Undeclared exception!
      try { 
        failableIntUnaryOperator0.compose((FailableIntUnaryOperator<Throwable>) null);
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
      FailableIntUnaryOperator<Throwable> failableIntUnaryOperator0 = FailableIntUnaryOperator.identity();
      FailableIntUnaryOperator<Throwable> failableIntUnaryOperator1 = failableIntUnaryOperator0.andThen(failableIntUnaryOperator0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FailableIntUnaryOperator<Throwable> failableIntUnaryOperator0 = FailableIntUnaryOperator.identity();
      FailableIntUnaryOperator<Throwable> failableIntUnaryOperator1 = failableIntUnaryOperator0.compose(failableIntUnaryOperator0);
      FailableIntUnaryOperator<Throwable> failableIntUnaryOperator2 = failableIntUnaryOperator0.andThen(failableIntUnaryOperator1);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FailableIntUnaryOperator<Throwable> failableIntUnaryOperator0 = FailableIntUnaryOperator.nop();
      // Undeclared exception!
      try { 
        failableIntUnaryOperator0.andThen((FailableIntUnaryOperator<Throwable>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }
}
