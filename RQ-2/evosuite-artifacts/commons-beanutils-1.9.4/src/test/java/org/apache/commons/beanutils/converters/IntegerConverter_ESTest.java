/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 18:35:15 GMT 2022
 */

package org.apache.commons.beanutils.converters;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.beanutils.converters.IntegerConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IntegerConverter_ESTest extends IntegerConverter_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IntegerConverter integerConverter0 = new IntegerConverter();
      Class<Integer> class0 = integerConverter0.getDefaultType();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer((-890));
      IntegerConverter integerConverter0 = new IntegerConverter(integer0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      IntegerConverter integerConverter0 = null;
      try {
        integerConverter0 = new IntegerConverter(object0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Error converting from 'Object' to 'Integer' For input string: \"java.lang.Object@0000000002\"
         //
         verifyException("org.apache.commons.beanutils.converters.AbstractConverter", e);
      }
  }
}
