/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:07:24 GMT 2022
 */

package org.apache.commons.jcs3.auxiliary.remote.server;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jcs3.auxiliary.remote.server.RemoteCacheServerAttributes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RemoteCacheServerAttributes_ESTest extends RemoteCacheServerAttributes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      assertTrue(remoteCacheServerAttributes0.isStartRegistry());
      
      remoteCacheServerAttributes0.setStartRegistry(false);
      boolean boolean0 = remoteCacheServerAttributes0.isStartRegistry();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      remoteCacheServerAttributes0.setServicePort(1455);
      int int0 = remoteCacheServerAttributes0.getServicePort();
      assertEquals(1455, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      remoteCacheServerAttributes0.setServicePort((-1));
      int int0 = remoteCacheServerAttributes0.getServicePort();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      assertEquals(15000L, remoteCacheServerAttributes0.getRegistryKeepAliveDelayMillis());
      
      remoteCacheServerAttributes0.setRegistryKeepAliveDelayMillis(0);
      remoteCacheServerAttributes0.getRegistryKeepAliveDelayMillis();
      assertTrue(remoteCacheServerAttributes0.isUseRegistryKeepAlive());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      remoteCacheServerAttributes0.setRegistryKeepAliveDelayMillis((-943L));
      long long0 = remoteCacheServerAttributes0.getRegistryKeepAliveDelayMillis();
      assertEquals((-943L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      remoteCacheServerAttributes0.setConfigFileName((String) null);
      remoteCacheServerAttributes0.getConfigFileName();
      assertTrue(remoteCacheServerAttributes0.isStartRegistry());
      assertTrue(remoteCacheServerAttributes0.isAllowClusterGet());
      assertEquals(15000L, remoteCacheServerAttributes0.getRegistryKeepAliveDelayMillis());
      assertTrue(remoteCacheServerAttributes0.isUseRegistryKeepAlive());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      remoteCacheServerAttributes0.setConfigFileName("\"BH5yu~&U9)HT8hLn");
      remoteCacheServerAttributes0.getConfigFileName();
      assertTrue(remoteCacheServerAttributes0.isStartRegistry());
      assertTrue(remoteCacheServerAttributes0.isUseRegistryKeepAlive());
      assertEquals(15000L, remoteCacheServerAttributes0.getRegistryKeepAliveDelayMillis());
      assertTrue(remoteCacheServerAttributes0.isAllowClusterGet());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      remoteCacheServerAttributes0.getConfigFileName();
      assertTrue(remoteCacheServerAttributes0.isAllowClusterGet());
      assertEquals(15000L, remoteCacheServerAttributes0.getRegistryKeepAliveDelayMillis());
      assertTrue(remoteCacheServerAttributes0.isStartRegistry());
      assertTrue(remoteCacheServerAttributes0.isUseRegistryKeepAlive());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      boolean boolean0 = remoteCacheServerAttributes0.isAllowClusterGet();
      assertTrue(remoteCacheServerAttributes0.isStartRegistry());
      assertTrue(boolean0);
      assertTrue(remoteCacheServerAttributes0.isUseRegistryKeepAlive());
      assertEquals(15000L, remoteCacheServerAttributes0.getRegistryKeepAliveDelayMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      boolean boolean0 = remoteCacheServerAttributes0.isUseRegistryKeepAlive();
      assertTrue(remoteCacheServerAttributes0.isStartRegistry());
      assertTrue(remoteCacheServerAttributes0.isAllowClusterGet());
      assertEquals(15000L, remoteCacheServerAttributes0.getRegistryKeepAliveDelayMillis());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      int int0 = remoteCacheServerAttributes0.getServicePort();
      assertEquals(0, int0);
      assertTrue(remoteCacheServerAttributes0.isAllowClusterGet());
      assertEquals(15000L, remoteCacheServerAttributes0.getRegistryKeepAliveDelayMillis());
      assertTrue(remoteCacheServerAttributes0.isStartRegistry());
      assertTrue(remoteCacheServerAttributes0.isUseRegistryKeepAlive());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      long long0 = remoteCacheServerAttributes0.getRegistryKeepAliveDelayMillis();
      assertTrue(remoteCacheServerAttributes0.isUseRegistryKeepAlive());
      assertTrue(remoteCacheServerAttributes0.isAllowClusterGet());
      assertEquals(15000L, long0);
      assertTrue(remoteCacheServerAttributes0.isStartRegistry());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      assertTrue(remoteCacheServerAttributes0.isAllowClusterGet());
      
      remoteCacheServerAttributes0.setAllowClusterGet(false);
      boolean boolean0 = remoteCacheServerAttributes0.isAllowClusterGet();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      boolean boolean0 = remoteCacheServerAttributes0.isStartRegistry();
      assertTrue(remoteCacheServerAttributes0.isAllowClusterGet());
      assertTrue(remoteCacheServerAttributes0.isUseRegistryKeepAlive());
      assertEquals(15000L, remoteCacheServerAttributes0.getRegistryKeepAliveDelayMillis());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      assertTrue(remoteCacheServerAttributes0.isUseRegistryKeepAlive());
      
      remoteCacheServerAttributes0.setUseRegistryKeepAlive(false);
      boolean boolean0 = remoteCacheServerAttributes0.isUseRegistryKeepAlive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      String string0 = remoteCacheServerAttributes0.toString();
      assertEquals("\n RemoteCacheAttributes \n cacheName = [null]\n remoteType = [LOCAL]\n removeUponRemotePut = [true]\n getOnly = [false]\n servicePort = [0]\n allowClusterGet = [true]\n configFileName = []\n rmiSocketFactoryTimeoutMillis = [10000]\n useRegistryKeepAlive = [true]\n registryKeepAliveDelayMillis = [15000]\n eventQueueType = [null]\n eventQueuePoolName = [null]", string0);
      assertTrue(remoteCacheServerAttributes0.isStartRegistry());
  }
}
