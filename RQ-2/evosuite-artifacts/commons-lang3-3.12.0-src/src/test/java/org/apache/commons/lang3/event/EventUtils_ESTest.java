/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:26:14 GMT 2022
 */

package org.apache.commons.lang3.event;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.event.EventUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EventUtils_ESTest extends EventUtils_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        EventUtils.bindEventsToMethod(object0, "annotationCls", object1, class0, stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // java.lang.Object is not an interface
         //
         verifyException("java.lang.reflect.Proxy$ProxyClassFactory", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      Class<Integer> class0 = Integer.class;
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        EventUtils.addEventListener(object0, class0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Class java.lang.Object does not have a public addInteger method which takes a parameter of type java.lang.Integer.
         //
         verifyException("org.apache.commons.lang3.event.EventUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EventUtils eventUtils0 = new EventUtils();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        EventUtils.addEventListener((Object) null, class0, (Object) eventUtils0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.MethodUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        EventUtils.bindEventsToMethod((Object) "v", "v", (Object) "v", class0, (String[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }
}
