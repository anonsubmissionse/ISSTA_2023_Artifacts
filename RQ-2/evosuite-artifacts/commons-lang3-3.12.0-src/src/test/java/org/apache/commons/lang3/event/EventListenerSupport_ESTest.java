/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:18:46 GMT 2022
 */

package org.apache.commons.lang3.event;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.event.EventListenerSupport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EventListenerSupport_ESTest extends EventListenerSupport_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        EventListenerSupport.create((Class<Object>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // listenerInterface
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      EventListenerSupport<Integer> eventListenerSupport0 = null;
      try {
        eventListenerSupport0 = new EventListenerSupport<Integer>(class0, (ClassLoader) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // classLoader
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      EventListenerSupport<Object> eventListenerSupport0 = null;
      try {
        eventListenerSupport0 = new EventListenerSupport<Object>(class0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Class java.lang.Object is not an interface
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        EventListenerSupport.create(class0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Class java.lang.Object is not an interface
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EventListenerSupport<Integer> eventListenerSupport0 = null;
      try {
        eventListenerSupport0 = new EventListenerSupport<Integer>((Class<Integer>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // listenerInterface
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      EventListenerSupport<Integer> eventListenerSupport0 = null;
      try {
        eventListenerSupport0 = new EventListenerSupport<Integer>(class0, classLoader0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Class java.lang.Integer is not an interface
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }
}
