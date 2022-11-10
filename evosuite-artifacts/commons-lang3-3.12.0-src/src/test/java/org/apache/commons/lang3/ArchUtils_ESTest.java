/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:20:32 GMT 2022
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.ArchUtils;
import org.apache.commons.lang3.arch.Processor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchUtils_ESTest extends ArchUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Processor processor0 = ArchUtils.getProcessor("java.endorsed.dirs");
      assertNull(processor0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Processor processor0 = ArchUtils.getProcessor("ppc");
      assertEquals(Processor.Arch.BIT_32, processor0.getArch());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Processor processor0 = ArchUtils.getProcessor("ia64w");
      assertEquals(Processor.Type.IA_64, processor0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Processor processor0 = ArchUtils.getProcessor("i386");
      assertFalse(processor0.is64Bit());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArchUtils archUtils0 = new ArchUtils();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Processor processor0 = ArchUtils.getProcessor();
      assertTrue(processor0.is64Bit());
  }
}
