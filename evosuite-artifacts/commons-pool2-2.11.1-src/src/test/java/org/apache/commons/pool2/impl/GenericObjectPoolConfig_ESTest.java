/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 19:08:16 GMT 2022
 */

package org.apache.commons.pool2.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GenericObjectPoolConfig_ESTest extends GenericObjectPoolConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      genericObjectPoolConfig0.setMinIdle(1448);
      genericObjectPoolConfig0.toString();
      assertEquals(1448, genericObjectPoolConfig0.getMinIdle());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      genericObjectPoolConfig0.setMaxIdle((-2354));
      genericObjectPoolConfig0.toString();
      assertEquals((-2354), genericObjectPoolConfig0.getMaxIdle());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      genericObjectPoolConfig0.setMaxTotal((-2354));
      genericObjectPoolConfig0.toString();
      assertEquals((-2354), genericObjectPoolConfig0.getMaxTotal());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GenericObjectPoolConfig<String> genericObjectPoolConfig0 = new GenericObjectPoolConfig<String>();
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "pool");
      genericObjectPoolConfig0.toStringAppendFields(stringBuilder0);
      assertEquals("poollifo=true, fairness=false, maxWaitDuration=PT-0.001S, minEvictableIdleTime=PT30M, softMinEvictableIdleTime=PT-0.001S, numTestsPerEvictionRun=3, evictionPolicyClassName=org.apache.commons.pool2.impl.DefaultEvictionPolicy, testOnCreate=false, testOnBorrow=false, testOnReturn=false, testWhileIdle=false, timeBetweenEvictionRuns=PT-0.001S, blockWhenExhausted=true, jmxEnabled=true, jmxNamePrefix=pool, jmxNameBase=null, maxTotal=8, maxIdle=8, minIdle=0", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GenericObjectPoolConfig<GenericObjectPoolConfig<String>> genericObjectPoolConfig0 = new GenericObjectPoolConfig<GenericObjectPoolConfig<String>>();
      genericObjectPoolConfig0.setMinIdle((-3413));
      int int0 = genericObjectPoolConfig0.getMinIdle();
      assertEquals((-3413), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      assertEquals(8, genericObjectPoolConfig0.getMaxTotal());
      
      genericObjectPoolConfig0.setMaxTotal(0);
      int int0 = genericObjectPoolConfig0.getMaxTotal();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GenericObjectPoolConfig<Integer> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Integer>();
      genericObjectPoolConfig0.setMaxTotal((-1187));
      int int0 = genericObjectPoolConfig0.getMaxTotal();
      assertEquals((-1187), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GenericObjectPoolConfig<Integer> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Integer>();
      assertEquals(8, genericObjectPoolConfig0.getMaxIdle());
      
      genericObjectPoolConfig0.setMaxIdle(0);
      int int0 = genericObjectPoolConfig0.getMaxIdle();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GenericObjectPoolConfig<String> genericObjectPoolConfig0 = new GenericObjectPoolConfig<String>();
      genericObjectPoolConfig0.setMaxIdle((-569));
      int int0 = genericObjectPoolConfig0.getMaxIdle();
      assertEquals((-569), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GenericObjectPoolConfig<Integer> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Integer>();
      genericObjectPoolConfig0.setTestWhileIdle(true);
      GenericObjectPoolConfig<Integer> genericObjectPoolConfig1 = genericObjectPoolConfig0.clone();
      assertEquals(8, genericObjectPoolConfig1.getMaxTotal());
      assertEquals(8, genericObjectPoolConfig1.getMaxIdle());
      assertEquals(0, genericObjectPoolConfig1.getMinIdle());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      genericObjectPoolConfig0.setTestOnReturn(true);
      GenericObjectPoolConfig<Object> genericObjectPoolConfig1 = genericObjectPoolConfig0.clone();
      assertEquals(8, genericObjectPoolConfig1.getMaxTotal());
      assertEquals(8, genericObjectPoolConfig1.getMaxIdle());
      assertEquals(0, genericObjectPoolConfig1.getMinIdle());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      genericObjectPoolConfig0.setTestOnCreate(true);
      GenericObjectPoolConfig<Object> genericObjectPoolConfig1 = genericObjectPoolConfig0.clone();
      assertEquals(8, genericObjectPoolConfig1.getMaxTotal());
      assertEquals(0, genericObjectPoolConfig1.getMinIdle());
      assertEquals(8, genericObjectPoolConfig1.getMaxIdle());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      genericObjectPoolConfig0.setTestOnBorrow(true);
      GenericObjectPoolConfig<Object> genericObjectPoolConfig1 = genericObjectPoolConfig0.clone();
      assertEquals(8, genericObjectPoolConfig1.getMaxIdle());
      assertEquals(0, genericObjectPoolConfig1.getMinIdle());
      assertEquals(8, genericObjectPoolConfig1.getMaxTotal());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      genericObjectPoolConfig0.setNumTestsPerEvictionRun(0);
      GenericObjectPoolConfig<Object> genericObjectPoolConfig1 = genericObjectPoolConfig0.clone();
      assertEquals(8, genericObjectPoolConfig1.getMaxTotal());
      assertEquals(0, genericObjectPoolConfig1.getMinIdle());
      assertEquals(8, genericObjectPoolConfig1.getMaxIdle());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      genericObjectPoolConfig0.setNumTestsPerEvictionRun((-572));
      GenericObjectPoolConfig<Object> genericObjectPoolConfig1 = genericObjectPoolConfig0.clone();
      assertEquals(8, genericObjectPoolConfig1.getMaxTotal());
      assertEquals(0, genericObjectPoolConfig1.getMinIdle());
      assertEquals(8, genericObjectPoolConfig1.getMaxIdle());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      genericObjectPoolConfig0.setMinIdle(2050);
      genericObjectPoolConfig0.clone();
      assertEquals(2050, genericObjectPoolConfig0.getMinIdle());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GenericObjectPoolConfig<GenericObjectPoolConfig<String>> genericObjectPoolConfig0 = new GenericObjectPoolConfig<GenericObjectPoolConfig<String>>();
      genericObjectPoolConfig0.setMinIdle((-3413));
      genericObjectPoolConfig0.clone();
      assertEquals((-3413), genericObjectPoolConfig0.getMinIdle());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GenericObjectPoolConfig<GenericObjectPoolConfig<String>> genericObjectPoolConfig0 = new GenericObjectPoolConfig<GenericObjectPoolConfig<String>>();
      assertEquals(8, genericObjectPoolConfig0.getMaxTotal());
      
      genericObjectPoolConfig0.setMaxTotal(0);
      genericObjectPoolConfig0.clone();
      assertEquals(0, genericObjectPoolConfig0.getMaxTotal());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      assertEquals(8, genericObjectPoolConfig0.getMaxTotal());
      
      genericObjectPoolConfig0.setMaxTotal((-1));
      genericObjectPoolConfig0.clone();
      assertEquals((-1), genericObjectPoolConfig0.getMaxTotal());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      assertEquals(8, genericObjectPoolConfig0.getMaxIdle());
      
      genericObjectPoolConfig0.setMaxIdle(0);
      genericObjectPoolConfig0.clone();
      assertEquals(0, genericObjectPoolConfig0.getMaxIdle());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GenericObjectPoolConfig<String> genericObjectPoolConfig0 = new GenericObjectPoolConfig<String>();
      genericObjectPoolConfig0.setMaxIdle((-569));
      genericObjectPoolConfig0.clone();
      assertEquals((-569), genericObjectPoolConfig0.getMaxIdle());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GenericObjectPoolConfig<String> genericObjectPoolConfig0 = new GenericObjectPoolConfig<String>();
      genericObjectPoolConfig0.setLifo(false);
      GenericObjectPoolConfig<String> genericObjectPoolConfig1 = genericObjectPoolConfig0.clone();
      assertEquals(8, genericObjectPoolConfig1.getMaxIdle());
      assertEquals(8, genericObjectPoolConfig1.getMaxTotal());
      assertEquals(0, genericObjectPoolConfig1.getMinIdle());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      genericObjectPoolConfig0.setJmxEnabled(false);
      GenericObjectPoolConfig<Object> genericObjectPoolConfig1 = genericObjectPoolConfig0.clone();
      assertEquals(8, genericObjectPoolConfig1.getMaxIdle());
      assertEquals(8, genericObjectPoolConfig1.getMaxTotal());
      assertEquals(0, genericObjectPoolConfig1.getMinIdle());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GenericObjectPoolConfig<String> genericObjectPoolConfig0 = new GenericObjectPoolConfig<String>();
      genericObjectPoolConfig0.setFairness(true);
      GenericObjectPoolConfig<String> genericObjectPoolConfig1 = genericObjectPoolConfig0.clone();
      assertEquals(8, genericObjectPoolConfig1.getMaxIdle());
      assertEquals(0, genericObjectPoolConfig1.getMinIdle());
      assertEquals(8, genericObjectPoolConfig1.getMaxTotal());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      genericObjectPoolConfig0.setBlockWhenExhausted(false);
      GenericObjectPoolConfig<Object> genericObjectPoolConfig1 = genericObjectPoolConfig0.clone();
      assertEquals(8, genericObjectPoolConfig1.getMaxTotal());
      assertEquals(8, genericObjectPoolConfig1.getMaxIdle());
      assertEquals(0, genericObjectPoolConfig1.getMinIdle());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GenericObjectPoolConfig<Integer> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Integer>();
      // Undeclared exception!
      try { 
        genericObjectPoolConfig0.toStringAppendFields((StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.BaseObjectPoolConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      int int0 = genericObjectPoolConfig0.getMinIdle();
      assertEquals(8, genericObjectPoolConfig0.getMaxIdle());
      assertEquals(0, int0);
      assertEquals(8, genericObjectPoolConfig0.getMaxTotal());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      int int0 = genericObjectPoolConfig0.getMaxTotal();
      assertEquals(8, int0);
      assertEquals(8, genericObjectPoolConfig0.getMaxIdle());
      assertEquals(0, genericObjectPoolConfig0.getMinIdle());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GenericObjectPoolConfig<String> genericObjectPoolConfig0 = new GenericObjectPoolConfig<String>();
      int int0 = genericObjectPoolConfig0.getMaxIdle();
      assertEquals(8, int0);
      assertEquals(8, genericObjectPoolConfig0.getMaxTotal());
      assertEquals(0, genericObjectPoolConfig0.getMinIdle());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      assertEquals(0, genericObjectPoolConfig0.getMinIdle());
      
      genericObjectPoolConfig0.setMinIdle(8);
      int int0 = genericObjectPoolConfig0.getMinIdle();
      assertEquals(8, int0);
  }
}
