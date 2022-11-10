/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:29:15 GMT 2022
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.joda.time.IllegalInstantException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IllegalInstantException_ESTest extends IllegalInstantException_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        IllegalInstantException.isIllegalInstant((Throwable) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.IllegalInstantException", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IllegalInstantException illegalInstantException0 = new IllegalInstantException("%=:A,mE&{y5fvDBn{Yq");
      boolean boolean0 = IllegalInstantException.isIllegalInstant(illegalInstantException0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      boolean boolean0 = IllegalInstantException.isIllegalInstant(mockThrowable0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IllegalInstantException illegalInstantException0 = new IllegalInstantException(0L, (String) null);
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IllegalInstantException illegalInstantException0 = new IllegalInstantException(0L, "zvO");
      MockThrowable mockThrowable0 = new MockThrowable(illegalInstantException0);
      boolean boolean0 = IllegalInstantException.isIllegalInstant(mockThrowable0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IllegalInstantException illegalInstantException0 = new IllegalInstantException(0L, "zvO");
      MockThrowable mockThrowable0 = new MockThrowable(illegalInstantException0);
      boolean boolean0 = IllegalInstantException.isIllegalInstant(mockThrowable0);
      assertNotNull(mockThrowable0.toString());
}
}
