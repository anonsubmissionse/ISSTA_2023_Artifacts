/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 20:11:51 GMT 2022
 */

package org.apache.commons.numbers.angle;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.numbers.angle.Reduce;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Reduce_ESTest extends Reduce_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Reduce reduce0 = new Reduce((-1.0), (-351.171057452872));
      double double0 = reduce0.applyAsDouble(0.0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Reduce reduce0 = new Reduce(42.58, (-1.0));
      double double0 = reduce0.applyAsDouble((-1.0));
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Reduce reduce0 = new Reduce((-1073.0221455012659), (-1073.0221455012659));
      double double0 = reduce0.applyAsDouble((-1073.0221455012659));
      ;
}
}
