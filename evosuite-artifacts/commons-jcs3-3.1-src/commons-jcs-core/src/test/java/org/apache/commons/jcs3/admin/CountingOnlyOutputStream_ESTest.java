/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:03:38 GMT 2022
 */

package org.apache.commons.jcs3.admin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jcs3.admin.CountingOnlyOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CountingOnlyOutputStream_ESTest extends CountingOnlyOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CountingOnlyOutputStream countingOnlyOutputStream0 = new CountingOnlyOutputStream();
      byte[] byteArray0 = new byte[2];
      countingOnlyOutputStream0.write(byteArray0, (-3268), (-612));
      int int0 = countingOnlyOutputStream0.getCount();
      assertEquals((-612), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CountingOnlyOutputStream countingOnlyOutputStream0 = new CountingOnlyOutputStream();
      // Undeclared exception!
      try { 
        countingOnlyOutputStream0.write((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.admin.CountingOnlyOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CountingOnlyOutputStream countingOnlyOutputStream0 = new CountingOnlyOutputStream();
      int int0 = countingOnlyOutputStream0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CountingOnlyOutputStream countingOnlyOutputStream0 = new CountingOnlyOutputStream();
      countingOnlyOutputStream0.write((-1));
      int int0 = countingOnlyOutputStream0.getCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CountingOnlyOutputStream countingOnlyOutputStream0 = new CountingOnlyOutputStream();
      byte[] byteArray0 = new byte[6];
      countingOnlyOutputStream0.write(byteArray0);
      assertEquals(6, countingOnlyOutputStream0.getCount());
  }
}
