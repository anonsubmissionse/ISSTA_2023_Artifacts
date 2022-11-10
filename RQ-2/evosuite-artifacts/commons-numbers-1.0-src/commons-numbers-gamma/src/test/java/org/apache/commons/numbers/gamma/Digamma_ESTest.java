/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 20:15:49 GMT 2022
 */

package org.apache.commons.numbers.gamma;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.numbers.gamma.Digamma;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Digamma_ESTest extends Digamma_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = Digamma.value(1.0E-5);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = Digamma.value((-100000.57721566489));
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = Digamma.value(Double.NEGATIVE_INFINITY);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = Digamma.value(0.0);
      ;
}
}
