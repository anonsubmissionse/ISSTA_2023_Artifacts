/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 04:09:21 GMT 2022
 */

package org.springside.modules.utils.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.utils.text.StringBuilderHolder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringBuilderHolder_ESTest extends StringBuilderHolder_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringBuilderHolder stringBuilderHolder0 = new StringBuilderHolder(0);
      StringBuilder stringBuilder0 = stringBuilderHolder0.get();
      assertNotNull(stringBuilder0.toString());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringBuilder stringBuilder0 = StringBuilderHolder.getGlobal();
      assertNotNull(stringBuilder0.toString());
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringBuilderHolder stringBuilderHolder0 = new StringBuilderHolder((-401));
      // Undeclared exception!
      try { 
        stringBuilderHolder0.get();
        fail("Expecting exception: NegativeArraySizeException");
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }
}
