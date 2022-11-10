/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 16:00:35 GMT 2022
 */

package org.asynchttpclient.extras.registry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.extras.registry.AsyncImplHelper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AsyncImplHelper_ESTest extends AsyncImplHelper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        AsyncImplHelper.getAsyncImplClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        AsyncImplHelper.getAsyncImplClass("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<AsyncHttpClient> class0 = AsyncImplHelper.getAsyncImplClass("4");
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AsyncImplHelper asyncImplHelper0 = new AsyncImplHelper();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        AsyncImplHelper.getAsyncImplClass("os.name");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Class : Linux couldn't be found in  the classpath due to : null
         //
         verifyException("org.asynchttpclient.extras.registry.AsyncImplHelper", e);
      }
  }
}
