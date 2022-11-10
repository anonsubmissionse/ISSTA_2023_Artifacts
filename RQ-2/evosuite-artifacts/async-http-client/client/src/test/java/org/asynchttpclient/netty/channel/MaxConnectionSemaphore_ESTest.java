/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:47:55 GMT 2022
 */

package org.asynchttpclient.netty.channel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.asynchttpclient.netty.channel.MaxConnectionSemaphore;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MaxConnectionSemaphore_ESTest extends MaxConnectionSemaphore_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MaxConnectionSemaphore maxConnectionSemaphore0 = new MaxConnectionSemaphore(Integer.MAX_VALUE, Integer.MAX_VALUE);
      MockThrowable mockThrowable0 = new MockThrowable((String) null);
      MockIOException mockIOException0 = new MockIOException(mockThrowable0);
      // Undeclared exception!
      try { 
        maxConnectionSemaphore0.releaseChannelLock(mockIOException0);
        fail("Expecting exception: Error");
      } catch(Error e) {
         //
         // Maximum permit count exceeded
         //
         verifyException("java.util.concurrent.Semaphore$Sync", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MaxConnectionSemaphore maxConnectionSemaphore0 = new MaxConnectionSemaphore(1, 1);
      Object object0 = new Object();
      maxConnectionSemaphore0.acquireChannelLock(object0);
      try { 
        maxConnectionSemaphore0.acquireChannelLock(object0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Too many connections: 1
         //
         verifyException("org.asynchttpclient.netty.channel.MaxConnectionSemaphore", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MaxConnectionSemaphore maxConnectionSemaphore0 = new MaxConnectionSemaphore((-1), (-123));
      MockIOException mockIOException0 = new MockIOException();
      maxConnectionSemaphore0.acquireChannelLock(mockIOException0);
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxConnectionSemaphore maxConnectionSemaphore0 = new MaxConnectionSemaphore((-1), (-123));
      maxConnectionSemaphore0.releaseChannelLock(maxConnectionSemaphore0);
  }
}
