/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 03:10:47 GMT 2022
 */

package com.github.scribejava.core.services;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.scribejava.core.services.TimestampServiceImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimestampServiceImpl_ESTest extends TimestampServiceImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimestampServiceImpl timestampServiceImpl0 = new TimestampServiceImpl();
      TimestampServiceImpl.Timer timestampServiceImpl_Timer0 = new TimestampServiceImpl.Timer();
      timestampServiceImpl_Timer0.getRandomInteger();
      String string0 = timestampServiceImpl0.getNonce();
      assertEquals("1392409282", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TimestampServiceImpl.Timer timestampServiceImpl_Timer0 = new TimestampServiceImpl.Timer();
      Long long0 = timestampServiceImpl_Timer0.getMilis();
      assertEquals(1392409281320L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimestampServiceImpl timestampServiceImpl0 = new TimestampServiceImpl();
      timestampServiceImpl0.setTimer((TimestampServiceImpl.Timer) null);
      // Undeclared exception!
      try { 
        timestampServiceImpl0.getTimestampInSeconds();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.services.TimestampServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TimestampServiceImpl timestampServiceImpl0 = new TimestampServiceImpl();
      timestampServiceImpl0.setTimer((TimestampServiceImpl.Timer) null);
      // Undeclared exception!
      try { 
        timestampServiceImpl0.getNonce();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.scribejava.core.services.TimestampServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TimestampServiceImpl timestampServiceImpl0 = new TimestampServiceImpl();
      String string0 = timestampServiceImpl0.getTimestampInSeconds();
      assertEquals("1392409281", string0);
  }
}
