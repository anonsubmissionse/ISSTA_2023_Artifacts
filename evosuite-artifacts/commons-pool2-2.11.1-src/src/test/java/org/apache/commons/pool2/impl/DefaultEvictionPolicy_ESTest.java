/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 19:00:29 GMT 2022
 */

package org.apache.commons.pool2.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultEvictionPolicy;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.commons.pool2.impl.EvictionConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultEvictionPolicy_ESTest extends DefaultEvictionPolicy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      System.setCurrentTimeMillis((-1L));
      DefaultEvictionPolicy<String> defaultEvictionPolicy0 = new DefaultEvictionPolicy<String>();
      ChronoUnit chronoUnit0 = ChronoUnit.MILLIS;
      Duration duration0 = chronoUnit0.getDuration();
      DefaultPooledObject<String> defaultPooledObject0 = new DefaultPooledObject<String>("&b>T_uhe");
      System.setCurrentTimeMillis(1L);
      EvictionConfig evictionConfig0 = new EvictionConfig(duration0, duration0, 3658000);
      boolean boolean0 = defaultEvictionPolicy0.evict(evictionConfig0, defaultPooledObject0, 684);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      System.setCurrentTimeMillis((-1L));
      DefaultEvictionPolicy<String> defaultEvictionPolicy0 = new DefaultEvictionPolicy<String>();
      ChronoUnit chronoUnit0 = ChronoUnit.MILLIS;
      Duration duration0 = chronoUnit0.getDuration();
      EvictionConfig evictionConfig0 = new EvictionConfig(duration0, duration0, (-1325));
      DefaultPooledObject<String> defaultPooledObject0 = new DefaultPooledObject<String>("&b>T_uhe");
      System.setCurrentTimeMillis(0L);
      boolean boolean0 = defaultEvictionPolicy0.evict(evictionConfig0, defaultPooledObject0, 3658000);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChronoUnit chronoUnit0 = ChronoUnit.MILLIS;
      Duration duration0 = chronoUnit0.getDuration();
      EvictionConfig evictionConfig0 = new EvictionConfig(duration0, duration0, (-1325));
      DefaultEvictionPolicy<Object> defaultEvictionPolicy0 = new DefaultEvictionPolicy<Object>();
      // Undeclared exception!
      try { 
        defaultEvictionPolicy0.evict(evictionConfig0, (PooledObject<Object>) null, 3658000);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.DefaultEvictionPolicy", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      System.setCurrentTimeMillis((-1L));
      DefaultEvictionPolicy<String> defaultEvictionPolicy0 = new DefaultEvictionPolicy<String>();
      ChronoUnit chronoUnit0 = ChronoUnit.MILLIS;
      Duration duration0 = chronoUnit0.getDuration();
      DefaultPooledObject<String> defaultPooledObject0 = new DefaultPooledObject<String>("&b>T_uhe");
      System.setCurrentTimeMillis(1L);
      EvictionConfig evictionConfig0 = new EvictionConfig(duration0, duration0, 3658000);
      boolean boolean0 = defaultEvictionPolicy0.evict(evictionConfig0, defaultPooledObject0, 3658000);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      System.setCurrentTimeMillis((-1L));
      DefaultEvictionPolicy<String> defaultEvictionPolicy0 = new DefaultEvictionPolicy<String>();
      ChronoUnit chronoUnit0 = ChronoUnit.MILLIS;
      Duration duration0 = chronoUnit0.getDuration();
      EvictionConfig evictionConfig0 = new EvictionConfig(duration0, duration0, (-1325));
      DefaultPooledObject<String> defaultPooledObject0 = new DefaultPooledObject<String>("&b>T_uhe");
      System.setCurrentTimeMillis(1L);
      boolean boolean0 = defaultEvictionPolicy0.evict(evictionConfig0, defaultPooledObject0, 3658000);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultEvictionPolicy<String> defaultEvictionPolicy0 = new DefaultEvictionPolicy<String>();
      Duration duration0 = Duration.ofSeconds(1605L, 1605L);
      EvictionConfig evictionConfig0 = new EvictionConfig(duration0, duration0, (-925));
      DefaultPooledObject<String> defaultPooledObject0 = new DefaultPooledObject<String>("");
      boolean boolean0 = defaultEvictionPolicy0.evict(evictionConfig0, defaultPooledObject0, (-925));
      assertFalse(boolean0);
  }
}
