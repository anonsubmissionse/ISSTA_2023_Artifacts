/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 04:08:57 GMT 2022
 */

package org.springside.modules.utils.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.utils.base.EnumUtil;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EnumUtil_ESTest extends EnumUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
      Locale.FilteringMode[] locale_FilteringModeArray0 = new Locale.FilteringMode[0];
      long long0 = EnumUtil.generateBits(class0, locale_FilteringModeArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
      Locale.FilteringMode[] locale_FilteringModeArray0 = new Locale.FilteringMode[7];
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      locale_FilteringModeArray0[0] = locale_FilteringMode0;
      locale_FilteringModeArray0[1] = locale_FilteringMode0;
      locale_FilteringModeArray0[2] = locale_FilteringModeArray0[0];
      locale_FilteringModeArray0[3] = locale_FilteringModeArray0[1];
      locale_FilteringModeArray0[4] = locale_FilteringMode0;
      locale_FilteringModeArray0[5] = locale_FilteringModeArray0[0];
      locale_FilteringModeArray0[6] = locale_FilteringMode0;
      long long0 = EnumUtil.generateBits(class0, locale_FilteringModeArray0);
      assertEquals(16L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
      LinkedList<Locale.FilteringMode> linkedList0 = new LinkedList<Locale.FilteringMode>();
      long long0 = EnumUtil.generateBits(class0, (Iterable<? extends Locale.FilteringMode>) linkedList0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      EnumSet<Locale.FilteringMode> enumSet0 = EnumSet.of(locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0);
      long long0 = EnumUtil.generateBits(class0, (Iterable<? extends Locale.FilteringMode>) enumSet0);
      assertEquals(16L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnumUtil.processBits((Class<Locale.FilteringMode>) null, 1029L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // EnumClass must be defined.
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
      // Undeclared exception!
      try { 
        EnumUtil.generateBits(class0, (Iterable<? extends Locale.FilteringMode>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The validated object is null
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
      Locale.FilteringMode[] locale_FilteringModeArray0 = new Locale.FilteringMode[7];
      // Undeclared exception!
      try { 
        EnumUtil.generateBits(class0, locale_FilteringModeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The validated array contains null element at index: 0
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EnumUtil enumUtil0 = new EnumUtil();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
      EnumSet<Locale.FilteringMode> enumSet0 = EnumUtil.processBits(class0, 0L);
      assertEquals(0, enumSet0.size());
  }
}
