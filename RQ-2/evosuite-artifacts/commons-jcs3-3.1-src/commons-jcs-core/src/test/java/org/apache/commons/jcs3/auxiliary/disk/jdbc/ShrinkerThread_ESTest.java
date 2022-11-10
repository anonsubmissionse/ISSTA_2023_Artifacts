/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:01:06 GMT 2022
 */

package org.apache.commons.jcs3.auxiliary.disk.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jcs3.auxiliary.disk.jdbc.JDBCDiskCache;
import org.apache.commons.jcs3.auxiliary.disk.jdbc.JDBCDiskCacheAttributes;
import org.apache.commons.jcs3.auxiliary.disk.jdbc.ShrinkerThread;
import org.apache.commons.jcs3.auxiliary.disk.jdbc.TableState;
import org.apache.commons.jcs3.auxiliary.disk.jdbc.dsfactory.JndiDataSourceFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShrinkerThread_ESTest extends ShrinkerThread_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ShrinkerThread shrinkerThread0 = new ShrinkerThread();
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      JndiDataSourceFactory jndiDataSourceFactory0 = new JndiDataSourceFactory();
      TableState tableState0 = new TableState("m?},Q\"N/Vx");
      JDBCDiskCache<Integer, Object> jDBCDiskCache0 = new JDBCDiskCache<Integer, Object>(jDBCDiskCacheAttributes0, jndiDataSourceFactory0, tableState0);
      shrinkerThread0.addDiskCacheToShrinkList(jDBCDiskCache0);
      shrinkerThread0.run();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ShrinkerThread shrinkerThread0 = new ShrinkerThread();
      shrinkerThread0.setPauseBetweenRegionCallsMillis(0L);
      long long0 = shrinkerThread0.getPauseBetweenRegionCallsMillis();
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ShrinkerThread shrinkerThread0 = new ShrinkerThread();
      shrinkerThread0.setPauseBetweenRegionCallsMillis((-4321L));
      long long0 = shrinkerThread0.getPauseBetweenRegionCallsMillis();
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ShrinkerThread shrinkerThread0 = new ShrinkerThread();
      long long0 = shrinkerThread0.getPauseBetweenRegionCallsMillis();
      assertEquals(0, long0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ShrinkerThread shrinkerThread0 = new ShrinkerThread();
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      JndiDataSourceFactory jndiDataSourceFactory0 = new JndiDataSourceFactory();
      TableState tableState0 = new TableState("76t!U}Rk2)/>U +$3");
      JDBCDiskCache<Integer, Object> jDBCDiskCache0 = new JDBCDiskCache<Integer, Object>(jDBCDiskCacheAttributes0, jndiDataSourceFactory0, tableState0);
      shrinkerThread0.addDiskCacheToShrinkList(jDBCDiskCache0);
      jndiDataSourceFactory0.initialize(jDBCDiskCacheAttributes0);
      JDBCDiskCache<String, Object> jDBCDiskCache1 = new JDBCDiskCache<String, Object>(jDBCDiskCacheAttributes0, jndiDataSourceFactory0, tableState0);
      shrinkerThread0.addDiskCacheToShrinkList(jDBCDiskCache1);
      shrinkerThread0.run();
      ;
}
}
