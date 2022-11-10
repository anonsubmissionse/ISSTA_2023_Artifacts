/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 21:13:47 GMT 2022
 */

package org.apache.commons.jcs3.auxiliary.remote.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.rmi.server.RMISocketFactory;
import java.util.Properties;
import org.apache.commons.jcs3.auxiliary.remote.server.RemoteCacheServer;
import org.apache.commons.jcs3.auxiliary.remote.server.RemoteCacheServerAttributes;
import org.apache.commons.jcs3.auxiliary.remote.server.behavior.IRemoteCacheServerAttributes;
import org.apache.commons.jcs3.auxiliary.remote.server.behavior.RemoteType;
import org.apache.commons.jcs3.engine.CacheElement;
import org.apache.commons.jcs3.engine.PooledCacheEventQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RemoteCacheServer_ESTest extends RemoteCacheServer_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      Properties properties0 = new Properties();
      remoteCacheServerAttributes0.setServicePort((-3246));
      RemoteCacheServer<CacheElement<RemoteType, Object>, Object> remoteCacheServer0 = null;
      try {
        remoteCacheServer0 = new RemoteCacheServer<CacheElement<RemoteType, Object>, Object>(remoteCacheServerAttributes0, properties0, (RMISocketFactory) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -3246
         //
         verifyException("java.net.ServerSocket", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Properties properties0 = new Properties();
      RemoteCacheServer<Object, RemoteCacheServer<Object, RemoteType>> remoteCacheServer0 = null;
      try {
        remoteCacheServer0 = new RemoteCacheServer<Object, RemoteCacheServer<Object, RemoteType>>((IRemoteCacheServerAttributes) null, properties0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.auxiliary.remote.server.RemoteCacheServer", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Properties properties0 = new Properties();
      RemoteCacheServerAttributes remoteCacheServerAttributes0 = new RemoteCacheServerAttributes();
      remoteCacheServerAttributes0.setServicePort((-592));
      RemoteCacheServer<InputStream, Long> remoteCacheServer0 = null;
      try {
        remoteCacheServer0 = new RemoteCacheServer<InputStream, Long>(remoteCacheServerAttributes0, properties0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -592
         //
         verifyException("java.net.ServerSocket", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Properties properties0 = new Properties();
      RMISocketFactory rMISocketFactory0 = RMISocketFactory.getDefaultSocketFactory();
      RemoteCacheServer<CacheElement<Long, Object>, PooledCacheEventQueue<String, Long>> remoteCacheServer0 = null;
      try {
        remoteCacheServer0 = new RemoteCacheServer<CacheElement<Long, Object>, PooledCacheEventQueue<String, Long>>((IRemoteCacheServerAttributes) null, properties0, rMISocketFactory0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.auxiliary.remote.server.RemoteCacheServer", e);
      }
  }
}
