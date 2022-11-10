/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:20:52 GMT 2022
 */

package org.apache.commons.rng.simple;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.RestorableUniformRandomProvider;
import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.core.source64.XoRoShiRo128Plus;
import org.apache.commons.rng.simple.RandomSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RandomSource_ESTest extends RandomSource_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.valueOf("XO_RO_SHI_RO_1024_SS");
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.XO_SHI_RO_256_PLUS;
      boolean boolean0 = randomSource0.isLongJumpable();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.XO_RO_SHI_RO_128_PP;
      boolean boolean0 = randomSource0.isJumpable();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.MSWS;
      randomSource0.getInternalIdentifier();
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      long[] longArray0 = RandomSource.createLongArray(47);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      long[] longArray0 = RandomSource.createLongArray(0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = RandomSource.createIntArray(1365);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int[] intArray0 = RandomSource.createIntArray(0);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.PCG_XSH_RS_32_OS;
      RestorableUniformRandomProvider restorableUniformRandomProvider0 = RandomSource.create(randomSource0, (Object) null, (Object[]) null);
      assertNotNull(restorableUniformRandomProvider0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.WELL_44497_B;
      Object[] objectArray0 = new Object[0];
      RestorableUniformRandomProvider restorableUniformRandomProvider0 = randomSource0.create((Object) null, objectArray0);
      assertNotNull(restorableUniformRandomProvider0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XoRoShiRo128Plus xoRoShiRo128Plus0 = new XoRoShiRo128Plus(0L, 0L);
      RandomSource randomSource0 = RandomSource.MSWS;
      // Undeclared exception!
      randomSource0.createSeed((UniformRandomProvider) xoRoShiRo128Plus0);
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.XO_RO_SHI_RO_1024_SS;
      // Undeclared exception!
      try { 
        randomSource0.createSeed((UniformRandomProvider) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.simple.internal.SeedFactory", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        RandomSource.createLongArray((-279458192));
        fail("Expecting exception: NegativeArraySizeException");
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.simple.internal.SeedFactory", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      RandomSource.createIntArray(100747837);
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.TWO_CMRES;
      UniformRandomProvider uniformRandomProvider0 = RandomSource.unrestorable((UniformRandomProvider) null);
      RandomSource[] randomSourceArray0 = RandomSource.values();
      // Undeclared exception!
      try { 
        RandomSource.create(randomSource0, (Object) uniformRandomProvider0, (Object[]) randomSourceArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.PCG_XSH_RS_32_OS;
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        RandomSource.create(randomSource0, (Object) null, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        RandomSource.create((RandomSource) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.simple.RandomSource", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.TWO_CMRES_SELECT;
      // Undeclared exception!
      try { 
        RandomSource.create(randomSource0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.TWO_CMRES;
      UniformRandomProvider uniformRandomProvider0 = RandomSource.unrestorable((UniformRandomProvider) null);
      // Undeclared exception!
      try { 
        randomSource0.create((Object) uniformRandomProvider0, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.WELL_44497_A;
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        randomSource0.create((Object) null, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.TWO_CMRES_SELECT;
      // Undeclared exception!
      try { 
        randomSource0.create();
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.TWO_CMRES;
      boolean boolean0 = randomSource0.isJumpable();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.XOR_SHIFT_1024_S;
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        RandomSource.create(randomSource0, (Object) randomSource0, objectArray0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // Unrecognized seed type: XOR_SHIFT_1024_S
         //
         verifyException("org.apache.commons.rng.simple.internal.NativeSeedType", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RandomSource[] randomSourceArray0 = RandomSource.values();
      boolean boolean0 = randomSourceArray0[0].isLongJumpable();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        RandomSource.createIntArray((-3450));
        fail("Expecting exception: NegativeArraySizeException");
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.simple.internal.SeedFactory", e);
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.MSWS;
      RestorableUniformRandomProvider restorableUniformRandomProvider0 = RandomSource.create(randomSource0);
      assertNotNull(restorableUniformRandomProvider0);
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.WELL_44497_A;
      boolean boolean0 = randomSource0.isNativeSeed(randomSource0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      RandomSource.createLongArray(44497);
  }
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XoRoShiRo128Plus xoRoShiRo128Plus0 = new XoRoShiRo128Plus((-1884L), (-1884L));
      UniformRandomProvider uniformRandomProvider0 = RandomSource.unrestorable(xoRoShiRo128Plus0);
      RandomSource[] randomSourceArray0 = RandomSource.values();
      RandomSource randomSource0 = RandomSource.TWO_CMRES_SELECT;
      // Undeclared exception!
      try { 
        randomSource0.create((Object) uniformRandomProvider0, (Object[]) randomSourceArray0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // Unrecognized seed type: org.apache.commons.rng.core.source64.XoRoShiRo128Plus@0000000001
         //
         verifyException("org.apache.commons.rng.simple.internal.NativeSeedType", e);
      }
  }
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RandomSource randomSource0 = RandomSource.XOR_SHIFT_1024_S;
      RestorableUniformRandomProvider restorableUniformRandomProvider0 = randomSource0.create();
      UniformRandomProvider uniformRandomProvider0 = RandomSource.unrestorable(restorableUniformRandomProvider0);
      byte[] byteArray0 = randomSource0.createSeed(uniformRandomProvider0);
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XoRoShiRo128Plus xoRoShiRo128Plus0 = new XoRoShiRo128Plus((-1884L), (-1884L));
      UniformRandomProvider uniformRandomProvider0 = RandomSource.unrestorable(xoRoShiRo128Plus0);
      RandomSource randomSource0 = RandomSource.MSWS;
      byte[] byteArray0 = randomSource0.createSeed(uniformRandomProvider0);
      ;
}
}
