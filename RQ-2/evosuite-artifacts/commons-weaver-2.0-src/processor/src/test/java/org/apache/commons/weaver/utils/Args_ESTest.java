/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 16:40:24 GMT 2022
 */

package org.apache.commons.weaver.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.apache.commons.weaver.utils.Args;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Args_ESTest extends Args_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      Class<String>[] classArray1 = (Class<String>[]) Array.newInstance(Class.class, 3);
      Class<String> class1 = String.class;
      classArray1[0] = class1;
      int int0 = Args.compare(classArray0, classArray1);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      Class<String>[] classArray1 = (Class<String>[]) Array.newInstance(Class.class, 2);
      classArray1[0] = class0;
      int int0 = Args.compare(classArray0, classArray1);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      int int0 = Args.compare(classArray0, classArray0);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      Class<Object>[] classArray1 = (Class<Object>[]) Array.newInstance(Class.class, 5);
      Class<Object> class1 = Object.class;
      classArray1[0] = class1;
      int int0 = Args.compare(classArray0, classArray1);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      // Undeclared exception!
      try { 
        Args.compare(classArray0, classArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.weaver.utils.Args", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 0);
      Class<String>[] classArray1 = (Class<String>[]) Array.newInstance(Class.class, 2);
      int int0 = Args.compare(classArray1, classArray0);
      assertEquals(1, int0);
}
}
