/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:12:35 GMT 2022
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FalsePredicate_ESTest extends FalsePredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Predicate<Object> predicate0 = FalsePredicate.falsePredicate();
      assertNotNull(predicate0);
  }
}
