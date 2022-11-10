/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 05 20:27:11 GMT 2022
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ISOPeriodFormat_ESTest extends ISOPeriodFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodFormatter periodFormatter0 = ISOPeriodFormat.alternateExtendedWithWeeks();
      PeriodFormatter periodFormatter1 = ISOPeriodFormat.alternateExtendedWithWeeks();
      assertSame(periodFormatter1, periodFormatter0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PeriodFormatter periodFormatter0 = ISOPeriodFormat.alternateWithWeeks();
      PeriodFormatter periodFormatter1 = ISOPeriodFormat.alternateWithWeeks();
      assertSame(periodFormatter1, periodFormatter0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ISOPeriodFormat.alternateExtended();
      PeriodFormatter periodFormatter0 = ISOPeriodFormat.alternateExtended();
      assertTrue(periodFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ISOPeriodFormat.alternate();
      PeriodFormatter periodFormatter0 = ISOPeriodFormat.alternate();
      assertTrue(periodFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ISOPeriodFormat.standard();
      PeriodFormatter periodFormatter0 = ISOPeriodFormat.standard();
      assertTrue(periodFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ISOPeriodFormat iSOPeriodFormat0 = new ISOPeriodFormat();
  }
}
