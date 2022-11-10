/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:11:23 GMT 2022
 */

package org.apache.commons.rng.core.source32;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.core.source32.PcgMcgXshRs32;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PcgMcgXshRs32_ESTest extends PcgMcgXshRs32_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Long long0 = new Long(2317L);
      PcgMcgXshRs32 pcgMcgXshRs32_0 = new PcgMcgXshRs32(long0);
      int int0 = pcgMcgXshRs32_0.transform(2317L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Long long0 = new Long(2317L);
      PcgMcgXshRs32 pcgMcgXshRs32_0 = new PcgMcgXshRs32(long0);
      int int0 = pcgMcgXshRs32_0.transform(6364136223846793005L);
      assertEquals(1375030283, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PcgMcgXshRs32 pcgMcgXshRs32_0 = null;
      try {
        pcgMcgXshRs32_0 = new PcgMcgXshRs32((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.core.source32.AbstractPcgMcg6432", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Long long0 = new Long((-2710L));
      PcgMcgXshRs32 pcgMcgXshRs32_0 = new PcgMcgXshRs32(long0);
      int int0 = pcgMcgXshRs32_0.transform((-2710L));
      assertEquals((-8192), int0);
  }
}
