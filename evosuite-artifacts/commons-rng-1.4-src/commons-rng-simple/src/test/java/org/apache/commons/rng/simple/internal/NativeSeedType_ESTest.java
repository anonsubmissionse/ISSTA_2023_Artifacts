/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:22:01 GMT 2022
 */

package org.apache.commons.rng.simple.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.rng.simple.internal.NativeSeedType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeSeedType_ESTest extends NativeSeedType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeSeedType[] nativeSeedTypeArray0 = NativeSeedType.values();
      assertEquals(4, nativeSeedTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.INT;
      Class<?> class0 = nativeSeedType0.getType();
      assertEquals("class java.lang.Integer", class0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.LONG_ARRAY;
      Object object0 = nativeSeedType0.createSeed(0);
      byte[] byteArray0 = NativeSeedType.convertSeedToBytes(object0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.LONG_ARRAY;
      // Undeclared exception!
      try { 
        nativeSeedType0.createSeed((-2957));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.simple.internal.SeedFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.LONG_ARRAY;
      Integer integer0 = new Integer(2);
      nativeSeedType0.convertSeed(integer0, 4805);
      Long long0 = new Long((long) integer0);
      // Undeclared exception!
      nativeSeedType0.convertSeed(long0, 6185);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.LONG_ARRAY;
      // Undeclared exception!
      try { 
        NativeSeedType.convertSeedToBytes(nativeSeedType0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Unrecognized seed type: LONG_ARRAY
         //
         verifyException("org.apache.commons.rng.simple.internal.NativeSeedType", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.INT_ARRAY;
      Object object0 = nativeSeedType0.createSeed(41);
      byte[] byteArray0 = NativeSeedType.convertSeedToBytes(object0);
      assertEquals(164, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Long long0 = new Long((-15L));
      byte[] byteArray0 = NativeSeedType.convertSeedToBytes(long0);
      assertArrayEquals(new byte[] {(byte) (-15), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.INT;
      // Undeclared exception!
      try { 
        nativeSeedType0.convertSeed(nativeSeedType0, (-4268));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Unrecognized seed type: INT
         //
         verifyException("org.apache.commons.rng.simple.internal.NativeSeedType", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.LONG_ARRAY;
      Object object0 = nativeSeedType0.createSeed(10);
      Object object1 = nativeSeedType0.convertSeed(object0, 10);
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.INT_ARRAY;
      Object object0 = nativeSeedType0.createSeed(41);
      NativeSeedType nativeSeedType1 = NativeSeedType.LONG_ARRAY;
      Object object1 = nativeSeedType1.convertSeed(object0, 41);
      Object object2 = nativeSeedType0.convertSeed(object1, 41);
      assertNotSame(object0, object2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.LONG;
      Object object0 = nativeSeedType0.createSeed((-26));
      NativeSeedType nativeSeedType1 = NativeSeedType.INT_ARRAY;
      // Undeclared exception!
      try { 
        nativeSeedType1.convertSeed(object0, (-26));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.rng.simple.internal.Long2IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.INT_ARRAY;
      Object object0 = nativeSeedType0.createSeed(1868);
      Object object1 = nativeSeedType0.convertSeed(object0, 1868);
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.LONG;
      NativeSeedType nativeSeedType1 = NativeSeedType.LONG_ARRAY;
      Object object0 = nativeSeedType1.createSeed(21);
      Object object1 = nativeSeedType0.convertSeed(object0, 21);
      //  // Unstable assertion: assertEquals((-2436105962061085229L), object1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.LONG;
      Object object0 = nativeSeedType0.createSeed((-26));
      Object object1 = nativeSeedType0.convertSeed(object0, (-26));
      //  // Unstable assertion: assertEquals(492760289173505825L, object1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.INT;
      NativeSeedType nativeSeedType1 = NativeSeedType.LONG;
      Object object0 = nativeSeedType0.createSeed((-4268));
      Object object1 = nativeSeedType1.convertSeed(object0, (-4268));
      //  // Unstable assertion: assertEquals((-2739815295961675906L), object1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.LONG;
      NativeSeedType nativeSeedType1 = NativeSeedType.INT_ARRAY;
      Object object0 = nativeSeedType1.createSeed(25);
      Object object1 = nativeSeedType0.convertSeed(object0, 25);
      //  // Unstable assertion: assertEquals(6854829341111402760L, object1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.INT_ARRAY;
      Object object0 = nativeSeedType0.createSeed(41);
      NativeSeedType nativeSeedType1 = NativeSeedType.INT;
      Object object1 = nativeSeedType1.convertSeed(object0, 41);
      //  // Unstable assertion: assertEquals((-1702793915), object1);
      
      byte[] byteArray0 = NativeSeedType.convertSeedToBytes(object1);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)69, (byte)109, (byte) (-127), (byte) (-102)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.INT;
      Long long0 = new Long((-15L));
      Object object0 = nativeSeedType0.convertSeed(long0, 159);
      assertEquals(14, object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Integer integer0 = new Integer(10);
      NativeSeedType nativeSeedType0 = NativeSeedType.INT;
      Object object0 = nativeSeedType0.convertSeed(integer0, 10);
      assertEquals(10, object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.LONG_ARRAY;
      Object object0 = nativeSeedType0.createSeed(10);
      NativeSeedType nativeSeedType1 = NativeSeedType.INT;
      Object object1 = nativeSeedType1.convertSeed(object0, 8);
      assertEquals(1677473233, object1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.LONG_ARRAY;
      Class<?> class0 = nativeSeedType0.getType();
      assertTrue(class0.isArray());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeSeedType nativeSeedType0 = NativeSeedType.LONG_ARRAY;
      int int0 = nativeSeedType0.getBytes();
      assertEquals(8, int0);
  }
}
