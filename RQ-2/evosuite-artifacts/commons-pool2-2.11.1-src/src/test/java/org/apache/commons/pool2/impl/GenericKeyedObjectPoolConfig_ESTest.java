/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 19:09:43 GMT 2022
 */

package org.apache.commons.pool2.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.chrono.ChronoLocalDate;
import org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GenericKeyedObjectPoolConfig_ESTest extends GenericKeyedObjectPoolConfig_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setMaxTotal(8);
      genericKeyedObjectPoolConfig0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GenericKeyedObjectPoolConfig<GenericKeyedObjectPoolConfig<String>> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<GenericKeyedObjectPoolConfig<String>>();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GenericKeyedObjectPoolConfig<GenericKeyedObjectPoolConfig<String>> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<GenericKeyedObjectPoolConfig<String>>();
      genericKeyedObjectPoolConfig0.setMaxTotalPerKey(0);
      genericKeyedObjectPoolConfig0.toString();
      assertEquals(0, genericKeyedObjectPoolConfig0.getMaxTotalPerKey());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setMaxIdlePerKey(0);
      StringBuilder stringBuilder0 = new StringBuilder(8);
      genericKeyedObjectPoolConfig0.toStringAppendFields(stringBuilder0);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      genericKeyedObjectPoolConfig0.setMinIdlePerKey((-568));
      genericKeyedObjectPoolConfig0.toString();
      assertEquals(0, genericKeyedObjectPoolConfig0.getMinIdlePerKey());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      genericKeyedObjectPoolConfig0.setMinIdlePerKey(981);
      int int0 = genericKeyedObjectPoolConfig0.getMinIdlePerKey();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      genericKeyedObjectPoolConfig0.setMinIdlePerKey((-436));
      int int0 = genericKeyedObjectPoolConfig0.getMinIdlePerKey();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      assertEquals(0, genericKeyedObjectPoolConfig0.getMaxTotalPerKey());
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setMaxTotalPerKey(0);
      int int0 = genericKeyedObjectPoolConfig0.getMaxTotalPerKey();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      assertEquals(0, genericKeyedObjectPoolConfig0.getMaxTotalPerKey());
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setMaxTotalPerKey((-1));
      int int0 = genericKeyedObjectPoolConfig0.getMaxTotalPerKey();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      assertEquals(1, genericKeyedObjectPoolConfig0.getMaxTotal());
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setMaxTotal(0);
      int int0 = genericKeyedObjectPoolConfig0.getMaxTotal();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setMaxTotal(1152);
      int int0 = genericKeyedObjectPoolConfig0.getMaxTotal();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      assertEquals(0, genericKeyedObjectPoolConfig0.getMaxIdlePerKey());
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      genericKeyedObjectPoolConfig0.setMaxIdlePerKey(0);
      int int0 = genericKeyedObjectPoolConfig0.getMaxIdlePerKey();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setMaxIdlePerKey((-302));
      int int0 = genericKeyedObjectPoolConfig0.getMaxIdlePerKey();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setTestWhileIdle(true);
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMaxIdlePerKey());
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setTestWhileIdle(true);
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setTestWhileIdle(true);
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMinIdlePerKey());
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setTestWhileIdle(true);
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMaxTotal());
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setTestOnReturn(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setTestOnReturn(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setTestOnReturn(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMaxTotal());
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setTestOnReturn(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMaxTotalPerKey());
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setTestOnCreate(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setTestOnCreate(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMaxTotal());
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setTestOnCreate(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMaxTotalPerKey());
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setTestOnCreate(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setTestOnBorrow(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setTestOnBorrow(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMaxTotal());
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setTestOnBorrow(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setTestOnBorrow(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      genericKeyedObjectPoolConfig0.setNumTestsPerEvictionRun(0);
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMaxTotal());
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      genericKeyedObjectPoolConfig0.setNumTestsPerEvictionRun(0);
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      genericKeyedObjectPoolConfig0.setNumTestsPerEvictionRun(0);
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMaxTotalPerKey());
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      genericKeyedObjectPoolConfig0.setNumTestsPerEvictionRun(0);
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      genericKeyedObjectPoolConfig0.setNumTestsPerEvictionRun((-301));
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMaxTotalPerKey());
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      genericKeyedObjectPoolConfig0.setNumTestsPerEvictionRun((-301));
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      genericKeyedObjectPoolConfig0.setNumTestsPerEvictionRun((-301));
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      genericKeyedObjectPoolConfig0.setNumTestsPerEvictionRun((-301));
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMaxTotal());
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      genericKeyedObjectPoolConfig0.setMinIdlePerKey(8);
      genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig0.getMinIdlePerKey());
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setMinIdlePerKey((-2769));
      genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig0.getMinIdlePerKey());
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GenericKeyedObjectPoolConfig<GenericKeyedObjectPoolConfig<String>> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<GenericKeyedObjectPoolConfig<String>>();
      assertEquals(0, genericKeyedObjectPoolConfig0.getMaxTotalPerKey());
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GenericKeyedObjectPoolConfig<GenericKeyedObjectPoolConfig<String>> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<GenericKeyedObjectPoolConfig<String>>();
      genericKeyedObjectPoolConfig0.setMaxTotalPerKey(0);
      genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig0.getMaxTotalPerKey());
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      ;
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setMaxTotal(0);
      genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setMaxTotal(1152);
      genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig0.getMaxTotal());
}
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      assertEquals(0, genericKeyedObjectPoolConfig0.getMaxIdlePerKey());
}
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setMaxIdlePerKey(0);
      genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      assertEquals(0, genericKeyedObjectPoolConfig0.getMaxIdlePerKey());
}
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setMaxIdlePerKey((-1));
      genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      GenericKeyedObjectPoolConfig<ChronoLocalDate> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<ChronoLocalDate>();
      genericKeyedObjectPoolConfig0.setLifo(false);
      GenericKeyedObjectPoolConfig<ChronoLocalDate> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMaxTotalPerKey());
}
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      GenericKeyedObjectPoolConfig<ChronoLocalDate> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<ChronoLocalDate>();
      genericKeyedObjectPoolConfig0.setLifo(false);
      GenericKeyedObjectPoolConfig<ChronoLocalDate> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMaxTotal());
}
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      GenericKeyedObjectPoolConfig<ChronoLocalDate> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<ChronoLocalDate>();
      genericKeyedObjectPoolConfig0.setLifo(false);
      GenericKeyedObjectPoolConfig<ChronoLocalDate> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMaxIdlePerKey());
}
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      GenericKeyedObjectPoolConfig<ChronoLocalDate> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<ChronoLocalDate>();
      genericKeyedObjectPoolConfig0.setLifo(false);
      GenericKeyedObjectPoolConfig<ChronoLocalDate> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setJmxEnabled(false);
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setJmxEnabled(false);
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setJmxEnabled(false);
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setJmxEnabled(false);
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setFairness(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setFairness(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      assertEquals(0, genericKeyedObjectPoolConfig1.getMaxTotal());
}
 @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setFairness(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      genericKeyedObjectPoolConfig0.setFairness(true);
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setBlockWhenExhausted(false);
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setBlockWhenExhausted(false);
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setBlockWhenExhausted(false);
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      genericKeyedObjectPoolConfig0.setBlockWhenExhausted(false);
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig1 = genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      // Undeclared exception!
      try { 
        genericKeyedObjectPoolConfig0.toStringAppendFields((StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.BaseObjectPoolConfig", e);
      }
  }
 @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      int int0 = genericKeyedObjectPoolConfig0.getMinIdlePerKey();
      ;
}
 @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      int int0 = genericKeyedObjectPoolConfig0.getMinIdlePerKey();
      ;
}
 @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      int int0 = genericKeyedObjectPoolConfig0.getMinIdlePerKey();
      ;
}
 @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      int int0 = genericKeyedObjectPoolConfig0.getMinIdlePerKey();
      ;
}
 @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      int int0 = genericKeyedObjectPoolConfig0.getMaxIdlePerKey();
      ;
}
 @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      int int0 = genericKeyedObjectPoolConfig0.getMaxIdlePerKey();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      int int0 = genericKeyedObjectPoolConfig0.getMaxIdlePerKey();
      assertEquals(0, genericKeyedObjectPoolConfig0.getMaxTotal());
}
 @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Object> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Object>();
      int int0 = genericKeyedObjectPoolConfig0.getMaxIdlePerKey();
      ;
}
 @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      genericKeyedObjectPoolConfig0.setMaxTotalPerKey((-185));
      genericKeyedObjectPoolConfig0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      int int0 = genericKeyedObjectPoolConfig0.getMaxTotalPerKey();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      int int0 = genericKeyedObjectPoolConfig0.getMaxTotalPerKey();
      ;
}
 @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      int int0 = genericKeyedObjectPoolConfig0.getMaxTotalPerKey();
      assertEquals(0, genericKeyedObjectPoolConfig0.getMaxTotal());
}
 @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      GenericKeyedObjectPoolConfig<Integer> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<Integer>();
      int int0 = genericKeyedObjectPoolConfig0.getMaxTotalPerKey();
      ;
}
 @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      int int0 = genericKeyedObjectPoolConfig0.getMaxTotal();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      int int0 = genericKeyedObjectPoolConfig0.getMaxTotal();
      ;
}
 @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      int int0 = genericKeyedObjectPoolConfig0.getMaxTotal();
      ;
}
 @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      GenericKeyedObjectPoolConfig<String> genericKeyedObjectPoolConfig0 = new GenericKeyedObjectPoolConfig<String>();
      int int0 = genericKeyedObjectPoolConfig0.getMaxTotal();
      ;
}
}
