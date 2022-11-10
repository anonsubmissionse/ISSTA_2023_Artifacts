/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 22:04:54 GMT 2022
 */

package org.apache.commons.jcs3.auxiliary.remote.http.client;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.Delayed;
import java.util.concurrent.ForkJoinTask;
import org.apache.commons.jcs3.auxiliary.remote.RemoteCacheAttributes;
import org.apache.commons.jcs3.auxiliary.remote.http.client.RemoteHttpClientListener;
import org.apache.commons.jcs3.engine.behavior.ICompositeCacheManager;
import org.apache.commons.jcs3.utils.serialization.EncryptingSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RemoteHttpClientListener_ESTest extends RemoteHttpClientListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RemoteCacheAttributes remoteCacheAttributes0 = new RemoteCacheAttributes();
      EncryptingSerializer encryptingSerializer0 = new EncryptingSerializer();
      RemoteHttpClientListener<Delayed, ForkJoinTask<Delayed>> remoteHttpClientListener0 = new RemoteHttpClientListener<Delayed, ForkJoinTask<Delayed>>(remoteCacheAttributes0, (ICompositeCacheManager) null, encryptingSerializer0);
      remoteHttpClientListener0.dispose();
  }
}
