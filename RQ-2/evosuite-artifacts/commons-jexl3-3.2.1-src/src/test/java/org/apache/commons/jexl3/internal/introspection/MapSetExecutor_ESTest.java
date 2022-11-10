/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 18:07:48 GMT 2022
 */

package org.apache.commons.jexl3.internal.introspection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jexl3.internal.introspection.Introspector;
import org.apache.commons.jexl3.internal.introspection.MapSetExecutor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MapSetExecutor_ESTest extends MapSetExecutor_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        MapSetExecutor.discover((Introspector) null, (Class<?>) null, class0, class0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<String> class0 = String.class;
      MapSetExecutor mapSetExecutor0 = MapSetExecutor.discover((Introspector) null, class0, class0, class0);
      ;
}
}
