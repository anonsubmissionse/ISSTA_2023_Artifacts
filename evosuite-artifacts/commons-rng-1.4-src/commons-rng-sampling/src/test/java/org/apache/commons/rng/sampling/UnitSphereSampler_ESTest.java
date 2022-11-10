/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 03:41:26 GMT 2022
 */

package org.apache.commons.rng.sampling;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.sampling.UnitSphereSampler;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnitSphereSampler_ESTest extends UnitSphereSampler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 1914;
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      boolean boolean0 = mockRandom0.nextBoolean();
      assertFalse(boolean0);
      
      mockRandom0.setSeed(1914);
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      assertNotNull(jDKRandomWrapper0);
      
      UnitSphereSampler unitSphereSampler0 = new UnitSphereSampler(1914, jDKRandomWrapper0);
      assertNotNull(unitSphereSampler0);
      
      double[] doubleArray0 = unitSphereSampler0.sample();
      assertNotNull(doubleArray0);
      assertEquals(1914, doubleArray0.length);
      
      UnitSphereSampler unitSphereSampler1 = unitSphereSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler0));
      assertNotNull(unitSphereSampler1);
      
      boolean boolean1 = jDKRandomWrapper0.nextBoolean();
      assertFalse(boolean1);
      assertTrue(boolean1 == boolean0);
      
      UnitSphereSampler unitSphereSampler2 = UnitSphereSampler.of(jDKRandomWrapper0, 30);
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler0));
      assertNotSame(unitSphereSampler2, unitSphereSampler1);
      assertNotNull(unitSphereSampler2);
      
      UnitSphereSampler unitSphereSampler3 = unitSphereSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler3.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler3.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler3.equals((Object)unitSphereSampler0));
      assertNotSame(unitSphereSampler3, unitSphereSampler1);
      assertNotSame(unitSphereSampler3, unitSphereSampler2);
      assertNotNull(unitSphereSampler3);
      
      double[] doubleArray1 = unitSphereSampler1.nextVector();
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler3));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler0));
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler3));
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler2));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotSame(unitSphereSampler1, unitSphereSampler3);
      assertNotSame(unitSphereSampler1, unitSphereSampler2);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotNull(doubleArray1);
      assertEquals(1914, doubleArray1.length);
      
      double[] doubleArray2 = unitSphereSampler3.nextVector();
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler3));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler3.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler3.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler3.equals((Object)unitSphereSampler0));
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      assertNotSame(unitSphereSampler3, unitSphereSampler1);
      assertNotSame(unitSphereSampler3, unitSphereSampler2);
      assertNotSame(doubleArray2, doubleArray1);
      assertNotSame(doubleArray2, doubleArray0);
      assertNotNull(doubleArray2);
      assertEquals(1914, doubleArray2.length);
      
      double[] doubleArray3 = unitSphereSampler1.nextVector();
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler3));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler0));
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler3));
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler2));
      assertFalse(doubleArray3.equals((Object)doubleArray1));
      assertFalse(doubleArray3.equals((Object)doubleArray0));
      assertFalse(doubleArray3.equals((Object)doubleArray2));
      assertNotSame(unitSphereSampler1, unitSphereSampler3);
      assertNotSame(unitSphereSampler1, unitSphereSampler2);
      assertNotSame(doubleArray3, doubleArray1);
      assertNotSame(doubleArray3, doubleArray0);
      assertNotSame(doubleArray3, doubleArray2);
      assertNotNull(doubleArray3);
      assertEquals(1914, doubleArray3.length);
      
      double[] doubleArray4 = unitSphereSampler0.nextVector();
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler3));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(doubleArray4.equals((Object)doubleArray3));
      assertFalse(doubleArray4.equals((Object)doubleArray2));
      assertFalse(doubleArray4.equals((Object)doubleArray0));
      assertFalse(doubleArray4.equals((Object)doubleArray1));
      assertNotSame(doubleArray4, doubleArray3);
      assertNotSame(doubleArray4, doubleArray2);
      assertNotSame(doubleArray4, doubleArray0);
      assertNotSame(doubleArray4, doubleArray1);
      assertNotNull(doubleArray4);
      assertEquals(1914, doubleArray4.length);
      
      UnitSphereSampler unitSphereSampler4 = unitSphereSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler3));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler4.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler4.equals((Object)unitSphereSampler0));
      assertFalse(unitSphereSampler4.equals((Object)unitSphereSampler3));
      assertFalse(unitSphereSampler4.equals((Object)unitSphereSampler1));
      assertNotSame(unitSphereSampler4, unitSphereSampler2);
      assertNotSame(unitSphereSampler4, unitSphereSampler3);
      assertNotSame(unitSphereSampler4, unitSphereSampler1);
      assertNotNull(unitSphereSampler4);
      
      // Undeclared exception!
      unitSphereSampler0.sample();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      assertNotNull(jDKRandomWrapper0);
      
      UnitSphereSampler unitSphereSampler0 = UnitSphereSampler.of(jDKRandomWrapper0, 1);
      assertNotNull(unitSphereSampler0);
      
      UnitSphereSampler unitSphereSampler1 = unitSphereSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler0));
      assertNotSame(unitSphereSampler0, unitSphereSampler1);
      assertNotSame(unitSphereSampler1, unitSphereSampler0);
      assertNotNull(unitSphereSampler1);
      
      double[] doubleArray0 = unitSphereSampler0.nextVector();
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertNotSame(unitSphereSampler0, unitSphereSampler1);
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
      assertEquals(1, doubleArray0.length);
      
      double[] doubleArray1 = unitSphereSampler0.nextVector();
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotSame(unitSphereSampler0, unitSphereSampler1);
      assertNotSame(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {1.0}, doubleArray1, 0.01);
      assertNotNull(doubleArray1);
      assertEquals(1, doubleArray1.length);
      
      JDKRandomWrapper jDKRandomWrapper1 = new JDKRandomWrapper(mockRandom0);
      assertFalse(jDKRandomWrapper1.equals((Object)jDKRandomWrapper0));
      assertNotNull(jDKRandomWrapper1);
      
      long long0 = (-1L);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      UnitSphereSampler unitSphereSampler2 = UnitSphereSampler.of(jDKRandomWrapper0, 2705);
      assertFalse(jDKRandomWrapper0.equals((Object)jDKRandomWrapper1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler0));
      assertNotSame(jDKRandomWrapper0, jDKRandomWrapper1);
      assertNotNull(unitSphereSampler2);
      
      byteArray0[1] = (byte) (-58);
      // Undeclared exception!
      try { 
        jDKRandomWrapper0.nextBytes(byteArray0, (int) (byte) (-58), (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UniformRandomProvider uniformRandomProvider0 = null;
      int int0 = 2866;
      UnitSphereSampler unitSphereSampler0 = UnitSphereSampler.of((UniformRandomProvider) null, 2866);
      assertNotNull(unitSphereSampler0);
      
      // Undeclared exception!
      try { 
        unitSphereSampler0.nextVector();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      assertNotNull(jDKRandomWrapper0);
      
      UnitSphereSampler unitSphereSampler0 = new UnitSphereSampler(1, jDKRandomWrapper0);
      assertNotNull(unitSphereSampler0);
      
      double[] doubleArray0 = unitSphereSampler0.sample();
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
      assertEquals(1, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      assertNotNull(jDKRandomWrapper0);
      
      UnitSphereSampler unitSphereSampler0 = new UnitSphereSampler(3, jDKRandomWrapper0);
      assertNotNull(unitSphereSampler0);
      
      mockRandom0.setSeed(0L);
      double[] doubleArray0 = unitSphereSampler0.nextVector();
      assertArrayEquals(new double[] {0.0, 0.4608148613314088, 0.8874962893308989}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
      assertEquals(3, doubleArray0.length);
      
      double[] doubleArray1 = unitSphereSampler0.nextVector();
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotSame(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {0.43692578682666433, 0.5688886990552842, 0.6967506762774519}, doubleArray1, 0.01);
      assertNotNull(doubleArray1);
      assertEquals(3, doubleArray1.length);
      
      double[] doubleArray2 = unitSphereSampler0.nextVector();
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      assertNotSame(doubleArray2, doubleArray1);
      assertNotSame(doubleArray2, doubleArray0);
      assertArrayEquals(new double[] {0.500715554229503, 0.5747766175174068, 0.6472370305443671}, doubleArray2, 0.01);
      assertNotNull(doubleArray2);
      assertEquals(3, doubleArray2.length);
      
      UnitSphereSampler unitSphereSampler1 = UnitSphereSampler.of(jDKRandomWrapper0, 3);
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler0));
      assertNotNull(unitSphereSampler1);
      
      UnitSphereSampler unitSphereSampler2 = UnitSphereSampler.of(jDKRandomWrapper0, 3);
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler0));
      assertNotSame(unitSphereSampler2, unitSphereSampler1);
      assertNotNull(unitSphereSampler2);
      
      UnitSphereSampler unitSphereSampler3 = unitSphereSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler3.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler3.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler3.equals((Object)unitSphereSampler0));
      assertNotSame(unitSphereSampler3, unitSphereSampler1);
      assertNotSame(unitSphereSampler3, unitSphereSampler2);
      assertNotNull(unitSphereSampler3);
      
      double[] doubleArray3 = unitSphereSampler3.sample();
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler3));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler3.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler3.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler3.equals((Object)unitSphereSampler0));
      assertFalse(doubleArray3.equals((Object)doubleArray1));
      assertFalse(doubleArray3.equals((Object)doubleArray2));
      assertFalse(doubleArray3.equals((Object)doubleArray0));
      assertNotSame(unitSphereSampler3, unitSphereSampler1);
      assertNotSame(unitSphereSampler3, unitSphereSampler2);
      assertNotSame(doubleArray3, doubleArray1);
      assertNotSame(doubleArray3, doubleArray2);
      assertNotSame(doubleArray3, doubleArray0);
      assertArrayEquals(new double[] {0.5251970550408512, 0.5761686519007477, 0.6262569264633263}, doubleArray3, 0.01);
      assertNotNull(doubleArray3);
      assertEquals(3, doubleArray3.length);
      
      UnitSphereSampler unitSphereSampler4 = UnitSphereSampler.of(jDKRandomWrapper0, 2);
      assertFalse(unitSphereSampler4.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler4.equals((Object)unitSphereSampler3));
      assertFalse(unitSphereSampler4.equals((Object)unitSphereSampler0));
      assertFalse(unitSphereSampler4.equals((Object)unitSphereSampler2));
      assertNotNull(unitSphereSampler4);
      
      // Undeclared exception!
      try { 
        UnitSphereSampler.of(jDKRandomWrapper0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Dimension must be strictly positive
         //
         verifyException("org.apache.commons.rng.sampling.UnitSphereSampler", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnitSphereSampler unitSphereSampler0 = new UnitSphereSampler(3, (UniformRandomProvider) null);
      assertNotNull(unitSphereSampler0);
      
      // Undeclared exception!
      try { 
        unitSphereSampler0.sample();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-716L));
      assertNotNull(mockRandom0);
      
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      assertNotNull(jDKRandomWrapper0);
      
      double double0 = mockRandom0.nextDouble();
      assertEquals(0.0, double0, 0.01);
      
      UnitSphereSampler unitSphereSampler0 = new UnitSphereSampler(2, jDKRandomWrapper0);
      assertNotNull(unitSphereSampler0);
      
      UnitSphereSampler unitSphereSampler1 = UnitSphereSampler.of(jDKRandomWrapper0, 2);
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler0));
      assertNotNull(unitSphereSampler1);
      
      UnitSphereSampler unitSphereSampler2 = unitSphereSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler0));
      assertNotSame(unitSphereSampler2, unitSphereSampler1);
      assertNotNull(unitSphereSampler2);
      
      double[] doubleArray0 = unitSphereSampler2.sample();
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler0));
      assertNotSame(unitSphereSampler2, unitSphereSampler1);
      assertArrayEquals(new double[] {0.4608148613314088, 0.8874962893308989}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
      assertEquals(2, doubleArray0.length);
      
      double[] doubleArray1 = unitSphereSampler2.nextVector();
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler0));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotSame(unitSphereSampler2, unitSphereSampler1);
      assertNotSame(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {0.6091142236736199, 0.7930825067535429}, doubleArray1, 0.01);
      assertNotNull(doubleArray1);
      assertEquals(2, doubleArray1.length);
      
      UnitSphereSampler unitSphereSampler3 = unitSphereSampler2.withUniformRandomProvider(jDKRandomWrapper0);
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler0));
      assertFalse(unitSphereSampler3.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler3.equals((Object)unitSphereSampler0));
      assertFalse(unitSphereSampler3.equals((Object)unitSphereSampler1));
      assertNotSame(unitSphereSampler2, unitSphereSampler1);
      assertNotSame(unitSphereSampler2, unitSphereSampler3);
      assertNotSame(unitSphereSampler3, unitSphereSampler2);
      assertNotSame(unitSphereSampler3, unitSphereSampler1);
      assertNotNull(unitSphereSampler3);
      
      double[] doubleArray2 = unitSphereSampler2.sample();
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler3));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler3));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler0));
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      assertNotSame(unitSphereSampler2, unitSphereSampler1);
      assertNotSame(unitSphereSampler2, unitSphereSampler3);
      assertNotSame(doubleArray2, doubleArray0);
      assertNotSame(doubleArray2, doubleArray1);
      assertArrayEquals(new double[] {0.6469731840540237, 0.7625127534113761}, doubleArray2, 0.01);
      assertNotNull(doubleArray2);
      assertEquals(2, doubleArray2.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      assertNotNull(mockRandom0);
      
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      assertNotNull(jDKRandomWrapper0);
      
      UnitSphereSampler unitSphereSampler0 = UnitSphereSampler.of(jDKRandomWrapper0, 1902);
      assertNotNull(unitSphereSampler0);
      
      JDKRandomWrapper jDKRandomWrapper1 = new JDKRandomWrapper((Random) null);
      assertFalse(jDKRandomWrapper1.equals((Object)jDKRandomWrapper0));
      assertNotNull(jDKRandomWrapper1);
      
      UnitSphereSampler unitSphereSampler1 = UnitSphereSampler.of(jDKRandomWrapper1, 2);
      assertFalse(jDKRandomWrapper1.equals((Object)jDKRandomWrapper0));
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler0));
      assertNotSame(jDKRandomWrapper1, jDKRandomWrapper0);
      assertNotNull(unitSphereSampler1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      assertNotNull(jDKRandomWrapper0);
      
      int int0 = jDKRandomWrapper0.nextInt();
      assertEquals(0, int0);
      
      float float0 = jDKRandomWrapper0.nextFloat();
      assertEquals(0.1F, float0, 0.01F);
      
      double double0 = mockRandom0.nextGaussian();
      assertEquals(0.2, double0, 0.01);
      
      UnitSphereSampler unitSphereSampler0 = new UnitSphereSampler(2705, jDKRandomWrapper0);
      assertNotNull(unitSphereSampler0);
      
      boolean boolean0 = jDKRandomWrapper0.nextBoolean();
      assertFalse(boolean0);
      
      double[] doubleArray0 = unitSphereSampler0.nextVector();
      assertNotNull(doubleArray0);
      assertEquals(2705, doubleArray0.length);
      
      UnitSphereSampler unitSphereSampler1 = unitSphereSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler0));
      assertNotNull(unitSphereSampler1);
      
      double[] doubleArray1 = unitSphereSampler1.sample();
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler0));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotSame(doubleArray1, doubleArray0);
      assertNotNull(doubleArray1);
      assertEquals(2705, doubleArray1.length);
      
      UnitSphereSampler unitSphereSampler2 = unitSphereSampler1.withUniformRandomProvider(jDKRandomWrapper0);
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler0));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler0));
      assertNotSame(unitSphereSampler1, unitSphereSampler2);
      assertNotSame(unitSphereSampler2, unitSphereSampler1);
      assertNotNull(unitSphereSampler2);
      
      double[] doubleArray2 = unitSphereSampler2.sample();
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler0));
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler2));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler1));
      assertFalse(unitSphereSampler2.equals((Object)unitSphereSampler0));
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      assertNotSame(unitSphereSampler1, unitSphereSampler2);
      assertNotSame(unitSphereSampler2, unitSphereSampler1);
      assertNotSame(doubleArray2, doubleArray0);
      assertNotSame(doubleArray2, doubleArray1);
      assertNotNull(doubleArray2);
      assertEquals(2705, doubleArray2.length);
      
      // Undeclared exception!
      unitSphereSampler0.nextVector();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper((Random) null);
      assertNotNull(jDKRandomWrapper0);
      
      UnitSphereSampler unitSphereSampler0 = UnitSphereSampler.of(jDKRandomWrapper0, 1114);
      assertNotNull(unitSphereSampler0);
      
      // Undeclared exception!
      try { 
        unitSphereSampler0.nextVector();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      assertNotNull(jDKRandomWrapper0);
      
      UnitSphereSampler unitSphereSampler0 = new UnitSphereSampler(992, jDKRandomWrapper0);
      assertNotNull(unitSphereSampler0);
      
      double[] doubleArray0 = unitSphereSampler0.sample();
      assertNotNull(doubleArray0);
      assertEquals(992, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      assertNotNull(jDKRandomWrapper0);
      
      UnitSphereSampler unitSphereSampler0 = UnitSphereSampler.of(jDKRandomWrapper0, 25);
      assertNotNull(unitSphereSampler0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper((Random) null);
      assertNotNull(jDKRandomWrapper0);
      
      UnitSphereSampler unitSphereSampler0 = UnitSphereSampler.of(jDKRandomWrapper0, 71);
      assertNotNull(unitSphereSampler0);
      
      UnitSphereSampler unitSphereSampler1 = unitSphereSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler0));
      assertNotSame(unitSphereSampler0, unitSphereSampler1);
      assertNotSame(unitSphereSampler1, unitSphereSampler0);
      assertNotNull(unitSphereSampler1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(4294967296L);
      assertNotNull(mockRandom0);
      
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      assertNotNull(jDKRandomWrapper0);
      
      UnitSphereSampler unitSphereSampler0 = new UnitSphereSampler(1, jDKRandomWrapper0);
      assertNotNull(unitSphereSampler0);
      
      UnitSphereSampler unitSphereSampler1 = unitSphereSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler0));
      assertNotNull(unitSphereSampler1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-174L));
      assertNotNull(mockRandom0);
      
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      assertNotNull(jDKRandomWrapper0);
      
      // Undeclared exception!
      try { 
        UnitSphereSampler.of(jDKRandomWrapper0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Dimension must be strictly positive
         //
         verifyException("org.apache.commons.rng.sampling.UnitSphereSampler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 0;
      MockRandom mockRandom0 = new MockRandom(0);
      assertNotNull(mockRandom0);
      
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      assertNotNull(jDKRandomWrapper0);
      
      UnitSphereSampler unitSphereSampler0 = null;
      try {
        unitSphereSampler0 = new UnitSphereSampler(0, jDKRandomWrapper0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Dimension must be strictly positive
         //
         verifyException("org.apache.commons.rng.sampling.UnitSphereSampler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnitSphereSampler.of((UniformRandomProvider) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Dimension must be strictly positive
         //
         verifyException("org.apache.commons.rng.sampling.UnitSphereSampler", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UnitSphereSampler unitSphereSampler0 = new UnitSphereSampler(1811, (UniformRandomProvider) null);
      assertNotNull(unitSphereSampler0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      assertNotNull(jDKRandomWrapper0);
      
      UnitSphereSampler unitSphereSampler0 = UnitSphereSampler.of(jDKRandomWrapper0, 1);
      assertNotNull(unitSphereSampler0);
      
      UnitSphereSampler unitSphereSampler1 = unitSphereSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler0));
      assertNotSame(unitSphereSampler0, unitSphereSampler1);
      assertNotSame(unitSphereSampler1, unitSphereSampler0);
      assertNotNull(unitSphereSampler1);
      
      double[] doubleArray0 = unitSphereSampler0.sample();
      assertFalse(unitSphereSampler0.equals((Object)unitSphereSampler1));
      assertNotSame(unitSphereSampler0, unitSphereSampler1);
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
      assertEquals(1, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      UnitSphereSampler unitSphereSampler0 = UnitSphereSampler.of(jDKRandomWrapper0, 2);
      UnitSphereSampler unitSphereSampler1 = unitSphereSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      unitSphereSampler1.nextVector();
      unitSphereSampler0.nextVector();
      // Undeclared exception!
      try { 
        UnitSphereSampler.of(jDKRandomWrapper0, (-352));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Dimension must be strictly positive
         //
         verifyException("org.apache.commons.rng.sampling.UnitSphereSampler", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      UnitSphereSampler unitSphereSampler0 = UnitSphereSampler.of(jDKRandomWrapper0, 28);
      UnitSphereSampler unitSphereSampler1 = unitSphereSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      unitSphereSampler1.nextVector();
      double[] doubleArray0 = unitSphereSampler1.nextVector();
      assertEquals(28, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      JDKRandomWrapper jDKRandomWrapper0 = new JDKRandomWrapper(mockRandom0);
      UnitSphereSampler unitSphereSampler0 = new UnitSphereSampler(3, jDKRandomWrapper0);
      unitSphereSampler0.sample();
      unitSphereSampler0.nextVector();
      UnitSphereSampler unitSphereSampler1 = unitSphereSampler0.withUniformRandomProvider(jDKRandomWrapper0);
      assertFalse(unitSphereSampler1.equals((Object)unitSphereSampler0));
  }
}
