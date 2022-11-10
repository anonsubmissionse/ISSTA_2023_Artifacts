/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:07:36 GMT 2022
 */

package org.apache.commons.jcs3.auxiliary.remote;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCacheAttributes;
import org.apache.commons.jcs3.auxiliary.remote.RemoteLocation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RemoteCacheAttributes_ESTest extends RemoteCacheAttributes_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      assertFalse(remoteCacheAttributes0.isReceive());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setReceive(false);
      boolean boolean0 = remoteCacheAttributes0.isReceive();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      assertEquals(0, remoteCacheAttributes0.getZombieQueueMaxSize());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setZombieQueueMaxSize(0);
      int int0 = remoteCacheAttributes0.getZombieQueueMaxSize();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setZombieQueueMaxSize((-1575));
      int int0 = remoteCacheAttributes0.getZombieQueueMaxSize();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      assertNotNull(remoteCacheAttributes0.getThreadPoolName());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setThreadPoolName((String) null);
      remoteCacheAttributes0.getThreadPoolName();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setThreadPoolName((String) null);
      remoteCacheAttributes0.getThreadPoolName();
      assertEquals(0, remoteCacheAttributes0.getZombieQueueMaxSize());
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setThreadPoolName((String) null);
      remoteCacheAttributes0.getThreadPoolName();
      assertEquals(0, remoteCacheAttributes0.getGetTimeoutMillis());
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      assertNotNull(remoteCacheAttributes0.getThreadPoolName());
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setThreadPoolName("");
      remoteCacheAttributes0.getThreadPoolName();
      assertEquals(0, remoteCacheAttributes0.getZombieQueueMaxSize());
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setLocalPort(1000);
      int int0 = remoteCacheAttributes0.getLocalPort();
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setLocalPort((-811));
      int int0 = remoteCacheAttributes0.getLocalPort();
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      assertEquals(0, remoteCacheAttributes0.getGetTimeoutMillis());
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setGetTimeoutMillis(0);
      int int0 = remoteCacheAttributes0.getGetTimeoutMillis();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      LinkedList<RemoteLocation> linkedList0 = new LinkedList<RemoteLocation>();
      remoteCacheAttributes0.setFailovers(linkedList0);
      remoteCacheAttributes0.getFailovers();
      assertEquals(0, remoteCacheAttributes0.getGetTimeoutMillis());
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      LinkedList<RemoteLocation> linkedList0 = new LinkedList<RemoteLocation>();
      remoteCacheAttributes0.setFailovers(linkedList0);
      remoteCacheAttributes0.getFailovers();
      assertNotNull(remoteCacheAttributes0.getThreadPoolName());
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      LinkedList<RemoteLocation> linkedList0 = new LinkedList<RemoteLocation>();
      remoteCacheAttributes0.setFailovers(linkedList0);
      remoteCacheAttributes0.getFailovers();
      assertTrue(remoteCacheAttributes0.isReceive());
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      LinkedList<RemoteLocation> linkedList0 = new LinkedList<RemoteLocation>();
      remoteCacheAttributes0.setFailovers(linkedList0);
      remoteCacheAttributes0.getFailovers();
      assertEquals(0, remoteCacheAttributes0.getZombieQueueMaxSize());
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      LinkedList<RemoteLocation> linkedList0 = new LinkedList<RemoteLocation>();
      RemoteLocation remoteLocation0 = remoteCacheAttributes0.getRemoteLocation();
      linkedList0.add(remoteLocation0);
      remoteCacheAttributes0.setFailovers(linkedList0);
      remoteCacheAttributes0.getFailovers();
      assertNotNull(remoteCacheAttributes0.getThreadPoolName());
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      LinkedList<RemoteLocation> linkedList0 = new LinkedList<RemoteLocation>();
      RemoteLocation remoteLocation0 = remoteCacheAttributes0.getRemoteLocation();
      linkedList0.add(remoteLocation0);
      remoteCacheAttributes0.setFailovers(linkedList0);
      remoteCacheAttributes0.getFailovers();
      assertEquals(0, remoteCacheAttributes0.getZombieQueueMaxSize());
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      LinkedList<RemoteLocation> linkedList0 = new LinkedList<RemoteLocation>();
      RemoteLocation remoteLocation0 = remoteCacheAttributes0.getRemoteLocation();
      linkedList0.add(remoteLocation0);
      remoteCacheAttributes0.setFailovers(linkedList0);
      remoteCacheAttributes0.getFailovers();
      assertEquals(0, remoteCacheAttributes0.getGetTimeoutMillis());
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      LinkedList<RemoteLocation> linkedList0 = new LinkedList<RemoteLocation>();
      RemoteLocation remoteLocation0 = remoteCacheAttributes0.getRemoteLocation();
      linkedList0.add(remoteLocation0);
      remoteCacheAttributes0.setFailovers(linkedList0);
      remoteCacheAttributes0.getFailovers();
      assertTrue(remoteCacheAttributes0.isReceive());
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setFailoverServers((String) null);
      remoteCacheAttributes0.getFailoverServers();
      assertNotNull(remoteCacheAttributes0.getThreadPoolName());
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setFailoverServers((String) null);
      remoteCacheAttributes0.getFailoverServers();
      assertEquals(0, remoteCacheAttributes0.getZombieQueueMaxSize());
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setFailoverServers((String) null);
      remoteCacheAttributes0.getFailoverServers();
      ;
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setFailoverServers((String) null);
      remoteCacheAttributes0.getFailoverServers();
      assertEquals(0, remoteCacheAttributes0.getGetTimeoutMillis());
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setFailoverServers("9YZbQCr+\"C");
      remoteCacheAttributes0.getFailoverServers();
      assertTrue(remoteCacheAttributes0.isReceive());
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setFailoverServers("9YZbQCr+\"C");
      remoteCacheAttributes0.getFailoverServers();
      assertEquals(0, remoteCacheAttributes0.getZombieQueueMaxSize());
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setFailoverServers("9YZbQCr+\"C");
      remoteCacheAttributes0.getFailoverServers();
      assertNotNull(remoteCacheAttributes0.getThreadPoolName());
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setFailoverServers("9YZbQCr+\"C");
      remoteCacheAttributes0.getFailoverServers();
      assertEquals(0, remoteCacheAttributes0.getGetTimeoutMillis());
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setFailoverIndex(1047);
      int int0 = remoteCacheAttributes0.getFailoverIndex();
      ;
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setFailoverIndex((-811));
      int int0 = remoteCacheAttributes0.getFailoverIndex();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      String string0 = remoteCacheAttributes0.getThreadPoolName();
      assertEquals(0, remoteCacheAttributes0.getGetTimeoutMillis());
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      String string0 = remoteCacheAttributes0.getThreadPoolName();
      ;
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      String string0 = remoteCacheAttributes0.getThreadPoolName();
      assertEquals(0, remoteCacheAttributes0.getZombieQueueMaxSize());
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      String string0 = remoteCacheAttributes0.getThreadPoolName();
      assertFalse(remoteCacheAttributes0.isReceive());
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getZombieQueueMaxSize();
      ;
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getZombieQueueMaxSize();
      ;
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getZombieQueueMaxSize();
      assertFalse(remoteCacheAttributes0.isReceive());
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getZombieQueueMaxSize();
      ;
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      boolean boolean0 = remoteCacheAttributes0.isReceive();
      ;
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      boolean boolean0 = remoteCacheAttributes0.isReceive();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      boolean boolean0 = remoteCacheAttributes0.isReceive();
      assertEquals(0, remoteCacheAttributes0.getGetTimeoutMillis());
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      boolean boolean0 = remoteCacheAttributes0.isReceive();
      assertEquals(0, remoteCacheAttributes0.getZombieQueueMaxSize());
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getGetTimeoutMillis();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getGetTimeoutMillis();
      assertEquals(0, remoteCacheAttributes0.getZombieQueueMaxSize());
}
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getGetTimeoutMillis();
      assertNotNull(remoteCacheAttributes0.getThreadPoolName());
}
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getGetTimeoutMillis();
      assertFalse(remoteCacheAttributes0.isReceive());
}
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.getFailovers();
      assertNotNull(remoteCacheAttributes0.getThreadPoolName());
}
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.getFailovers();
      ;
}
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.getFailovers();
      ;
}
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.getFailovers();
      assertEquals(0, remoteCacheAttributes0.getZombieQueueMaxSize());
}
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.getFailoverServers();
      assertNotNull(remoteCacheAttributes0.getThreadPoolName());
}
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.getFailoverServers();
      assertTrue(remoteCacheAttributes0.isReceive());
}
 @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.getFailoverServers();
      assertEquals(0, remoteCacheAttributes0.getZombieQueueMaxSize());
}
 @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.getFailoverServers();
      assertEquals(0, remoteCacheAttributes0.getGetTimeoutMillis());
}
 @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getLocalPort();
      assertTrue(remoteCacheAttributes0.isReceive());
}
 @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getLocalPort();
      assertEquals(0, remoteCacheAttributes0.getGetTimeoutMillis());
}
 @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getLocalPort();
      ;
}
 @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getLocalPort();
      assertNotNull(remoteCacheAttributes0.getThreadPoolName());
}
 @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getLocalPort();
      assertEquals(0, remoteCacheAttributes0.getZombieQueueMaxSize());
}
 @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      assertEquals(0, remoteCacheAttributes0.getGetTimeoutMillis());
}
 @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      remoteCacheAttributes0.setGetTimeoutMillis(1000);
      int int0 = remoteCacheAttributes0.getGetTimeoutMillis();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      String string0 = remoteCacheAttributes0.toString();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getFailoverIndex();
      assertFalse(remoteCacheAttributes0.isReceive());
}
 @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getFailoverIndex();
      assertEquals(0, remoteCacheAttributes0.getZombieQueueMaxSize());
}
 @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getFailoverIndex();
      ;
}
 @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getFailoverIndex();
      ;
}
 @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      int int0 = remoteCacheAttributes0.getFailoverIndex();
      ;
}
}
