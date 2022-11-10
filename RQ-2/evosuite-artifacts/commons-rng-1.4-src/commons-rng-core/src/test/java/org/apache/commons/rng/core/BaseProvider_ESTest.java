/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:07:45 GMT 2022
 */

package org.apache.commons.rng.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.RandomProviderState;
import org.apache.commons.rng.core.RandomProviderDefaultState;
import org.apache.commons.rng.core.source32.JDKRandom;
import org.apache.commons.rng.core.source32.KISSRandom;
import org.apache.commons.rng.core.source32.MiddleSquareWeylSequence;
import org.apache.commons.rng.core.source32.MultiplyWithCarry256;
import org.apache.commons.rng.core.source32.Well1024a;
import org.apache.commons.rng.core.source32.Well512a;
import org.apache.commons.rng.core.source32.XoRoShiRo64Star;
import org.apache.commons.rng.core.source64.SplitMix64;
import org.apache.commons.rng.core.source64.TwoCmres;
import org.apache.commons.rng.core.source64.XoRoShiRo1024StarStar;
import org.apache.commons.rng.core.source64.XoRoShiRo128PlusPlus;
import org.apache.commons.rng.core.source64.XoShiRo256Plus;
import org.apache.commons.rng.core.source64.XoShiRo256PlusPlus;
import org.apache.commons.rng.core.source64.XoShiRo512StarStar;
import org.apache.commons.rng.core.source64.XorShift1024Star;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseProvider_ESTest extends BaseProvider_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Integer integer0 = new Integer((byte)0);
      TwoCmres twoCmres0 = new TwoCmres(integer0);
      // Undeclared exception!
      try { 
        twoCmres0.nextBytes(byteArray0, (int) (byte)0, 2150);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
         //
         // 2150 is out of interval [0, 1]
         //
         verifyException("org.apache.commons.rng.core.BaseProvider", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XoShiRo256Plus xoShiRo256Plus0 = new XoShiRo256Plus(8202884508482404352L, 8202884508482404352L, 8202884508482404352L, (-840L));
      byte[] byteArray0 = new byte[5];
      xoShiRo256Plus0.nextBytes(byteArray0, 0, (int) (byte)0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[4];
      KISSRandom kISSRandom0 = new KISSRandom(intArray0);
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      long[] longArray0 = new long[5];
      XoShiRo512StarStar xoShiRo512StarStar0 = new XoShiRo512StarStar(longArray0);
      long long0 = xoShiRo512StarStar0.nextLong(1L);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XoShiRo256Plus xoShiRo256Plus0 = new XoShiRo256Plus(8202884508482404352L, 8202884508482404352L, 8202884508482404352L, (-840L));
      // Undeclared exception!
      try { 
        xoShiRo256Plus0.nextLong((-2862L));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Must be strictly positive: -2862
         //
         verifyException("org.apache.commons.rng.core.BaseProvider", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XoShiRo256PlusPlus xoShiRo256PlusPlus0 = new XoShiRo256PlusPlus(0L, 0L, 0L, 0L);
      int int0 = xoShiRo256PlusPlus0.nextInt(2);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XoRoShiRo64Star xoRoShiRo64Star0 = new XoRoShiRo64Star(Integer.MIN_VALUE, Integer.MIN_VALUE);
      int int0 = xoRoShiRo64Star0.nextInt(248);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[1] = 4294967295L;
      MiddleSquareWeylSequence middleSquareWeylSequence0 = new MiddleSquareWeylSequence(longArray0);
      int int0 = middleSquareWeylSequence0.nextInt(248);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      long[] longArray0 = new long[6];
      MiddleSquareWeylSequence middleSquareWeylSequence0 = new MiddleSquareWeylSequence(longArray0);
      // Undeclared exception!
      try { 
        middleSquareWeylSequence0.nextInt(0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Must be strictly positive: 0
         //
         verifyException("org.apache.commons.rng.core.BaseProvider", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      long[] longArray0 = new long[1];
      XoRoShiRo1024StarStar xoRoShiRo1024StarStar0 = new XoRoShiRo1024StarStar(longArray0);
      long long0 = xoRoShiRo1024StarStar0.nextLong((long) (byte)116);
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[2];
      Well512a well512a0 = new Well512a(intArray0);
      int int0 = well512a0.nextInt(1123);
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Long long0 = new Long(161L);
      JDKRandom jDKRandom0 = new JDKRandom(long0);
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte) (-57);
      RandomProviderDefaultState randomProviderDefaultState0 = new RandomProviderDefaultState(byteArray0);
      // Undeclared exception!
      try { 
        jDKRandom0.restoreState(randomProviderDefaultState0);
        fail("Expecting exception: NegativeArraySizeException");
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.core.BaseProvider", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      long[] longArray0 = new long[16];
      XorShift1024Star xorShift1024Star0 = new XorShift1024Star(longArray0);
      byte[] byteArray0 = new byte[13];
      // Undeclared exception!
      try { 
        xorShift1024Star0.nextBytes(byteArray0, (int) (byte) (-122), (int) (byte)0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
         //
         // -122 is out of interval [0, 12]
         //
         verifyException("org.apache.commons.rng.core.BaseProvider", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[39];
      KISSRandom kISSRandom0 = new KISSRandom(intArray0);
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      long[] longArray0 = new long[1];
      XoRoShiRo1024StarStar xoRoShiRo1024StarStar0 = new XoRoShiRo1024StarStar(longArray0);
      RandomProviderState randomProviderState0 = xoRoShiRo1024StarStar0.saveState();
      XoRoShiRo128PlusPlus xoRoShiRo128PlusPlus0 = new XoRoShiRo128PlusPlus(longArray0);
      // Undeclared exception!
      try { 
        xoRoShiRo128PlusPlus0.restoreState(randomProviderState0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // State not fully recovered by subclasses
         //
         verifyException("org.apache.commons.rng.core.BaseProvider", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Long long0 = new Long(0);
      SplitMix64 splitMix64_0 = new SplitMix64(long0);
      // Undeclared exception!
      try { 
        splitMix64_0.restoreState((RandomProviderState) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Foreign instance
         //
         verifyException("org.apache.commons.rng.core.BaseProvider", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      long[] longArray0 = new long[16];
      longArray0[1] = (long) 231265814;
      XorShift1024Star xorShift1024Star0 = new XorShift1024Star(longArray0);
      long long0 = xorShift1024Star0.nextLong(2708408564748875214L);
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XoRoShiRo128PlusPlus xoRoShiRo128PlusPlus0 = new XoRoShiRo128PlusPlus((byte)66, (byte)66);
      // Undeclared exception!
      try { 
        xoRoShiRo128PlusPlus0.nextLong((long) 0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Must be strictly positive: 0
         //
         verifyException("org.apache.commons.rng.core.BaseProvider", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long[] longArray0 = new long[17];
      XoRoShiRo1024StarStar xoRoShiRo1024StarStar0 = new XoRoShiRo1024StarStar(longArray0);
      long long0 = xoRoShiRo1024StarStar0.nextLong((long) (byte)116);
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[8];
      Well1024a well1024a0 = new Well1024a(intArray0);
      // Undeclared exception!
      try { 
        well1024a0.nextInt((-1479));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Must be strictly positive: -1479
         //
         verifyException("org.apache.commons.rng.core.BaseProvider", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      long[] longArray0 = new long[17];
      XoRoShiRo128PlusPlus xoRoShiRo128PlusPlus0 = new XoRoShiRo128PlusPlus(longArray0);
      // Undeclared exception!
      xoRoShiRo128PlusPlus0.nextInt(1735);
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long[] longArray0 = new long[17];
      XoRoShiRo1024StarStar xoRoShiRo1024StarStar0 = new XoRoShiRo1024StarStar(longArray0);
      String string0 = xoRoShiRo1024StarStar0.toString();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      long[] longArray0 = new long[17];
      XoRoShiRo1024StarStar xoRoShiRo1024StarStar0 = new XoRoShiRo1024StarStar(longArray0);
      RandomProviderState randomProviderState0 = xoRoShiRo1024StarStar0.saveState();
      xoRoShiRo1024StarStar0.restoreState(randomProviderState0);
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[5];
      MultiplyWithCarry256 multiplyWithCarry256_0 = new MultiplyWithCarry256(intArray0);
      byte[] byteArray0 = new byte[6];
      RandomProviderDefaultState randomProviderDefaultState0 = new RandomProviderDefaultState(byteArray0);
      // Undeclared exception!
      try { 
        multiplyWithCarry256_0.restoreState(randomProviderDefaultState0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // State size must be larger than 1032 but was 6
         //
         verifyException("org.apache.commons.rng.core.BaseProvider", e);
      }
  }
}
