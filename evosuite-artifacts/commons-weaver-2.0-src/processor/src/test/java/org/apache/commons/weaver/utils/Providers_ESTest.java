/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 16:44:39 GMT 2022
 */

package org.apache.commons.weaver.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Stack;
import org.apache.commons.weaver.utils.Providers;
import org.apache.commons.weaver.utils.ProvidersTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Providers_ESTest extends Providers_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        Providers.sort((Iterable<ProvidersTest.Z>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The validated object is null
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<ProvidersTest.A> arrayList0 = new ArrayList<ProvidersTest.A>();
      arrayList0.add((ProvidersTest.A) null);
      // Undeclared exception!
      try { 
        Providers.sort((Iterable<ProvidersTest.A>) arrayList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The validated collection contains null element at index: 0
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Stack<ProvidersTest.X> stack0 = new Stack<ProvidersTest.X>();
      ProvidersTest providersTest0 = new ProvidersTest();
      ProvidersTest.X providersTest_X0 = providersTest0.new X();
      stack0.add(providersTest_X0);
      // Undeclared exception!
      try { 
        Providers.sort((Iterable<ProvidersTest.X>) stack0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.weaver.utils.Providers$SortWorker", e);
      }
  }
}
