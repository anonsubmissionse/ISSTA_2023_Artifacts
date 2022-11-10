/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:26:25 GMT 2022
 */

package org.apache.commons.lang3.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.function.FailableLongConsumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FailableLongConsumer_ESTest extends FailableLongConsumer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FailableLongConsumer<Throwable> failableLongConsumer0 = FailableLongConsumer.nop();
      failableLongConsumer0.accept((-696L));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FailableLongConsumer<Throwable> failableLongConsumer0 = FailableLongConsumer.nop();
      // Undeclared exception!
      try { 
        failableLongConsumer0.andThen((FailableLongConsumer<Throwable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FailableLongConsumer<Throwable> failableLongConsumer0 = FailableLongConsumer.nop();
      FailableLongConsumer<Throwable> failableLongConsumer1 = failableLongConsumer0.andThen(failableLongConsumer0);
      FailableLongConsumer<Throwable> failableLongConsumer2 = failableLongConsumer0.andThen(failableLongConsumer1);
      assertFalse(failableLongConsumer2.equals((Object)failableLongConsumer1));
  }
}
