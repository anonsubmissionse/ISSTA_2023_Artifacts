/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 02:57:07 GMT 2022
 */

package org.apache.commons.rng.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.core.util.NumberFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumberFactory_ESTest extends NumberFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      float float0 = NumberFactory.makeFloat((-1));
      assertEquals(0.99999994F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = NumberFactory.makeDouble((-3276), (-3276));
      assertEquals(0.9999992400407677, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = NumberFactory.makeDouble(0, 1965);
      assertEquals(6.772360450213455E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = NumberFactory.makeDouble((-2353L));
      assertEquals(0.9999999999999998, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = NumberFactory.makeBoolean(0L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = NumberFactory.makeBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      long[] longArray0 = new long[1];
      byte[] byteArray0 = NumberFactory.makeByteArray(longArray0);
      long long0 = NumberFactory.makeLong(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = NumberFactory.makeByteArray((-1L));
      long long0 = NumberFactory.makeLong(byteArray0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long long0 = NumberFactory.makeLong(0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      long long0 = NumberFactory.makeLong((-246), 1224);
      assertEquals((-1056561953592L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = NumberFactory.makeIntArray(byteArray0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = NumberFactory.makeByteArray(693);
      int int0 = NumberFactory.makeInt(byteArray0);
      assertEquals(693, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = NumberFactory.makeByteArray((-2131));
      int int0 = NumberFactory.makeInt(byteArray0);
      assertEquals((-2131), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = NumberFactory.makeInt(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = NumberFactory.makeInt((-1056561953592L));
      assertEquals((-1086), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      float float0 = NumberFactory.makeFloat(0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = NumberFactory.makeDouble((long) 259);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = NumberFactory.makeDouble(0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[0];
      byte[] byteArray0 = NumberFactory.makeByteArray(intArray0);
      long[] longArray0 = NumberFactory.makeLongArray(byteArray0);
      assertArrayEquals(new long[] {}, longArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = NumberFactory.extractLo(59L);
      assertEquals(59, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = NumberFactory.extractLo((-3046L));
      assertEquals((-3046), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = NumberFactory.extractHi(17179869183L);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = NumberFactory.extractHi((-737L));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberFactory.makeLongArray((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.core.util.NumberFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        NumberFactory.makeLongArray(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array size: Expected 0 but was 1
         //
         verifyException("org.apache.commons.rng.core.util.NumberFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberFactory.makeLong((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.core.util.NumberFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberFactory.makeIntArray((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.core.util.NumberFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        NumberFactory.makeIntArray(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array size: Expected 8 but was 9
         //
         verifyException("org.apache.commons.rng.core.util.NumberFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberFactory.makeInt((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.core.util.NumberFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberFactory.makeByteArray((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.core.util.NumberFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberFactory.makeByteArray((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.core.util.NumberFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = NumberFactory.makeByteArray(2012L);
      long[] longArray0 = NumberFactory.makeLongArray(byteArray0);
      NumberFactory.makeByteArray(longArray0);
      assertArrayEquals(new long[] {2012L}, longArray0);
      assertArrayEquals(new byte[] {(byte) (-36), (byte)7, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = NumberFactory.makeBoolean((-3446L));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = NumberFactory.makeBoolean(2012L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = NumberFactory.makeBoolean((-2144765264));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = NumberFactory.makeBoolean(259);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = NumberFactory.makeByteArray(2012L);
      int[] intArray0 = NumberFactory.makeIntArray(byteArray0);
      assertArrayEquals(new int[] {2012, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = NumberFactory.makeInt(676L);
      assertEquals(676, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = NumberFactory.extractHi(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = NumberFactory.extractLo(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = NumberFactory.makeByteArray(0);
      int int0 = NumberFactory.makeInt(byteArray0);
      assertEquals(0, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      long[] longArray0 = new long[0];
      byte[] byteArray0 = NumberFactory.makeByteArray(longArray0);
      // Undeclared exception!
      try { 
        NumberFactory.makeInt(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array size: Expected 4 but was 0
         //
         verifyException("org.apache.commons.rng.core.util.NumberFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int[] intArray0 = new int[6];
      byte[] byteArray0 = NumberFactory.makeByteArray(intArray0);
      assertEquals(24, byteArray0.length);
      
      long[] longArray0 = NumberFactory.makeLongArray(byteArray0);
      NumberFactory.makeByteArray(longArray0);
      assertArrayEquals(new long[] {0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = NumberFactory.makeByteArray(676L);
      long long0 = NumberFactory.makeLong(byteArray0);
      assertEquals(676L, long0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      long long0 = NumberFactory.makeLong(676, 676);
      assertEquals(2903397892772L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        NumberFactory.makeLong(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array size: Expected 8 but was 3
         //
         verifyException("org.apache.commons.rng.core.util.NumberFactory", e);
      }
  }
}
