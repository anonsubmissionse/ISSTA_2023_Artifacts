/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:04:08 GMT 2022
 */

package org.apache.commons.jcs3.auxiliary.remote;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import org.apache.commons.jcs3.auxiliary.lateral.LateralCache;
import org.apache.commons.jcs3.auxiliary.lateral.LateralCacheAttributes;
import org.apache.commons.jcs3.auxiliary.lateral.LateralCacheMonitor;
import org.apache.commons.jcs3.auxiliary.lateral.socket.tcp.LateralTCPCacheFactory;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCacheAttributes;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCacheListener;
import org.apache.commons.jcs3.auxiliary.remote.behavior.IRemoteCacheAttributes;
import org.apache.commons.jcs3.engine.ZombieCacheServiceNonLocal;
import org.apache.commons.jcs3.engine.behavior.IElementSerializer;
import org.apache.commons.jcs3.engine.control.CompositeCacheManager;
import org.apache.commons.jcs3.utils.serialization.CompressingSerializer;
import org.apache.commons.jcs3.utils.serialization.EncryptingSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RemoteCacheListener_ESTest extends RemoteCacheListener_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LateralCacheAttributes lateralCacheAttributes0 = new LateralCacheAttributes();
      ZombieCacheServiceNonLocal<String, Object> zombieCacheServiceNonLocal0 = new ZombieCacheServiceNonLocal<String, Object>((-277));
      LateralCacheMonitor lateralCacheMonitor0 = new LateralCacheMonitor((LateralTCPCacheFactory) null);
      LateralCache<String, Object> lateralCache0 = new LateralCache<String, Object>(lateralCacheAttributes0, zombieCacheServiceNonLocal0, lateralCacheMonitor0);
      IElementSerializer iElementSerializer0 = lateralCache0.getElementSerializer();
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      RemoteCacheListener<RemoteCacheListener<Object, Object>, RemoteCacheListener<String, Object>> remoteCacheListener0 = null;
      try {
        remoteCacheListener0 = new RemoteCacheListener<RemoteCacheListener<Object, Object>, RemoteCacheListener<String, Object>>((IRemoteCacheAttributes) null, compositeCacheManager0, iElementSerializer0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.auxiliary.remote.RemoteCacheListener", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      EncryptingSerializer encryptingSerializer0 = new EncryptingSerializer();
      CompressingSerializer compressingSerializer0 = new CompressingSerializer(encryptingSerializer0);
      remoteCacheAttributes0.setLocalPort((-41));
      CompositeCacheManager compositeCacheManager0 = CompositeCacheManager.getUnconfiguredInstance();
      RemoteCacheListener<InputStream, InputStream> remoteCacheListener0 = null;
      try {
        remoteCacheListener0 = new RemoteCacheListener<InputStream, InputStream>(remoteCacheAttributes0, compositeCacheManager0, compressingSerializer0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Port value out of range: -41
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockServerSocket", e);
      }
  }
}
