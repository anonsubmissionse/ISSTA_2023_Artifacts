/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:32:12 GMT 2022
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.LocalDate;
import org.joda.time.MonthDay;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseLocal_ESTest extends BaseLocal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(1L);
      LocalDate localDate0 = monthDay0.toLocalDate(168);
      assertEquals(3, localDate0.size());
  }
}
