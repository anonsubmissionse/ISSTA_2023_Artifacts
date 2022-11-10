/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:48:30 GMT 2022
 */

package org.asynchttpclient.netty.channel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.asynchttpclient.netty.channel.KQueueTransportFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KQueueTransportFactory_ESTest extends KQueueTransportFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KQueueTransportFactory kQueueTransportFactory0 = null;
      try {
        kQueueTransportFactory0 = new KQueueTransportFactory();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The kqueue transport is not supported
         //
         verifyException("org.asynchttpclient.netty.channel.KQueueTransportFactory", e);
      }
  }
}
