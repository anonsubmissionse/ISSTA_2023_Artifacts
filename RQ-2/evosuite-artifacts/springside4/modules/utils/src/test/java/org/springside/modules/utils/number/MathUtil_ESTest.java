/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 04:07:08 GMT 2022
 */

package org.springside.modules.utils.number;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.RoundingMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.utils.number.MathUtil;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MathUtil_ESTest extends MathUtil_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = MathUtil.gcd(3268, 0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.HALF_UP;
      long long0 = MathUtil.sqrt((long) 1, roundingMode0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.HALF_UP;
      int int0 = MathUtil.sqrt(0, roundingMode0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.HALF_DOWN;
      int int0 = MathUtil.sqrt(869, roundingMode0);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      long long0 = MathUtil.pow(0L, 6);
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      long long0 = MathUtil.pow((-4006L), 1);
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int int0 = MathUtil.pow(58, 58);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int int0 = MathUtil.pow(0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int int0 = MathUtil.modByPowerOfTwo(749, 6);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      int int0 = MathUtil.modByPowerOfTwo((-143), (-143));
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long long0 = MathUtil.mod(1896L, 2429L);
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      long long0 = MathUtil.mod(100000000000L, 892);
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = MathUtil.mod(3345, 25);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = MathUtil.isPowerOfTwo(1L);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = MathUtil.isPowerOfTwo(40);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      long long0 = MathUtil.gcd(2090L, 2090L);
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = MathUtil.gcd(0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.DOWN;
      long long0 = MathUtil.divide(0L, 1L, roundingMode0);
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.DOWN;
      long long0 = MathUtil.divide(2283L, 2283L, roundingMode0);
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.DOWN;
      long long0 = MathUtil.divide(3717L, (-538L), roundingMode0);
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.HALF_DOWN;
      int int0 = MathUtil.divide(5, (-702), roundingMode0);
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.UP;
      int int0 = MathUtil.divide((-3), 117, roundingMode0);
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.sqrt(2083L, (RoundingMode) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.math.IntMath", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.UP;
      // Undeclared exception!
      try { 
        MathUtil.sqrt((long) (-3), roundingMode0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // x (-3) must be >= 0
         //
         verifyException("com.google.common.math.MathPreconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      // Undeclared exception!
      try { 
        MathUtil.sqrt((long) 2248, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // mode was UNNECESSARY, but rounding was necessary
         //
         verifyException("com.google.common.math.MathPreconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.HALF_DOWN;
      // Undeclared exception!
      try { 
        MathUtil.sqrt((-1072), roundingMode0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // x (-1072) must be >= 0
         //
         verifyException("com.google.common.math.MathPreconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      // Undeclared exception!
      try { 
        MathUtil.sqrt(3, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // mode was UNNECESSARY, but rounding was necessary
         //
         verifyException("com.google.common.math.MathPreconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.previousPowerOfTwo(0L);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // x (0) must be > 0
         //
         verifyException("com.google.common.math.MathPreconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.previousPowerOfTwo((-2523));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // x (-2523) must be > 0
         //
         verifyException("com.google.common.math.MathPreconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.pow((long) 12, (-1766153935));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // exponent (-1766153935) must be >= 0
         //
         verifyException("com.google.common.math.MathPreconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.pow(5040, (-3674));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // exponent (-3674) must be >= 0
         //
         verifyException("com.google.common.math.MathPreconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.nextPowerOfTwo((-4006L));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // x (-4006) must be > 0
         //
         verifyException("com.google.common.math.MathPreconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.nextPowerOfTwo(7753736572610479205L);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // ceilingPowerOfTwo(7753736572610479205) is not representable as a long
         //
         verifyException("com.google.common.math.LongMath", e);
      }
  }
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.nextPowerOfTwo((-456));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // x (-456) must be > 0
         //
         verifyException("com.google.common.math.MathPreconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.nextPowerOfTwo(Integer.MAX_VALUE);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // ceilingPowerOfTwo(2147483647) not representable as an int
         //
         verifyException("com.google.common.math.IntMath", e);
      }
  }
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.mod((-911L), (-911L));
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // Modulus must be positive
         //
         verifyException("com.google.common.math.LongMath", e);
      }
  }
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.mod(0L, (-2394));
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // Modulus must be positive
         //
         verifyException("com.google.common.math.LongMath", e);
      }
  }
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.mod(0, 0);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // Modulus 0 must be > 0
         //
         verifyException("com.google.common.math.IntMath", e);
      }
  }
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.gcd((-1557L), (-2678L));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // a (-1557) must be >= 0
         //
         verifyException("com.google.common.math.MathPreconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.gcd((-615), (-615));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // a (-615) must be >= 0
         //
         verifyException("com.google.common.math.MathPreconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.HALF_UP;
      // Undeclared exception!
      try { 
        MathUtil.divide((long) 1, 0L, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("com.google.common.math.LongMath", e);
      }
  }
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      // Undeclared exception!
      try { 
        MathUtil.divide(2783L, (-1039L), roundingMode0);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // mode was UNNECESSARY, but rounding was necessary
         //
         verifyException("com.google.common.math.MathPreconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.divide(0, 869, (RoundingMode) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      // Undeclared exception!
      try { 
        MathUtil.divide(3412, 211, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      } catch(ArithmeticException e) {
         //
         // mode was UNNECESSARY, but rounding was necessary
         //
         verifyException("com.google.common.math.MathPreconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      boolean boolean0 = MathUtil.isPowerOfTwo(1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      long long0 = MathUtil.previousPowerOfTwo((long) 1);
      ;
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      int int0 = MathUtil.previousPowerOfTwo(1);
      ;
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int int0 = MathUtil.nextPowerOfTwo(24);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      long long0 = MathUtil.nextPowerOfTwo((long) 1);
      ;
}
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      int int0 = MathUtil.modByPowerOfTwo(5382, 1);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.sqrt(5, (RoundingMode) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.math.IntMath", e);
      }
  }
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      long long0 = MathUtil.gcd(0L, 0L);
      ;
}
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      long long0 = MathUtil.mod((long) 1845, 1845);
      ;
}
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      int int0 = MathUtil.mod(1, 1);
      ;
}
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      long long0 = MathUtil.mod((long) 1, (long) 1);
      ;
}
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.DOWN;
      int int0 = MathUtil.divide((-4858), (-4858), roundingMode0);
      ;
}
 @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      int int0 = MathUtil.pow((-1491), 12);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      long long0 = MathUtil.pow(1L, 1);
      ;
}
 @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtil.divide((long) 2926, (long) 2926, (RoundingMode) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
 @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MathUtil mathUtil0 = new MathUtil();
  }
 @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      boolean boolean0 = MathUtil.isPowerOfTwo((long) 0);
      ;
}
 @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.HALF_UP;
      long long0 = MathUtil.sqrt(0L, roundingMode0);
      ;
}
}
