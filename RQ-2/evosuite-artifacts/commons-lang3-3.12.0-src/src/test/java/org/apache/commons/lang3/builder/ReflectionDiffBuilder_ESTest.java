/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:14:13 GMT 2022
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.builder.Diff;
import org.apache.commons.lang3.builder.DiffResult;
import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.RecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionDiffBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReflectionDiffBuilder_ESTest extends ReflectionDiffBuilder_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RecursiveToStringStyle recursiveToStringStyle0 = new RecursiveToStringStyle();
      ReflectionDiffBuilder<Object> reflectionDiffBuilder0 = null;
      try {
        reflectionDiffBuilder0 = new ReflectionDiffBuilder<Object>((Object) null, recursiveToStringStyle0, recursiveToStringStyle0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // lhs
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer();
      Integer integer0 = new Integer(1456);
      ReflectionDiffBuilder<Object> reflectionDiffBuilder0 = new ReflectionDiffBuilder<Object>(stringBuffer0, integer0, multilineRecursiveToStringStyle0);
      // Undeclared exception!
      try { 
        reflectionDiffBuilder0.build();
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      Integer integer0 = new Integer(1456);
      ReflectionDiffBuilder<Integer> reflectionDiffBuilder0 = new ReflectionDiffBuilder<Integer>(integer0, integer0, multilineRecursiveToStringStyle0);
      DiffResult<Integer> diffResult0 = reflectionDiffBuilder0.build();
      assertEquals(0, diffResult0.getNumberOfDiffs());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Diff<String> diff0 = (Diff<String>) mock(Diff.class, new ViolatedAssumptionAnswer());
      Diff<String> diff1 = (Diff<String>) mock(Diff.class, new ViolatedAssumptionAnswer());
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      ReflectionDiffBuilder<Diff<String>> reflectionDiffBuilder0 = new ReflectionDiffBuilder<Diff<String>>(diff0, diff1, multilineRecursiveToStringStyle0);
      DiffResult<Diff<String>> diffResult0 = reflectionDiffBuilder0.build();
      assertEquals(1, diffResult0.getNumberOfDiffs());
}
}
