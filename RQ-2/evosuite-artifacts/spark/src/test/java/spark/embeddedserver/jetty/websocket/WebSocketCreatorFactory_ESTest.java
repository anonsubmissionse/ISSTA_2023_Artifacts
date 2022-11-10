/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 17:22:07 GMT 2022
 */

package spark.embeddedserver.jetty.websocket;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.embeddedserver.jetty.websocket.WebSocketCreatorFactory;
import spark.embeddedserver.jetty.websocket.WebSocketHandlerWrapper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WebSocketCreatorFactory_ESTest extends WebSocketCreatorFactory_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        WebSocketCreatorFactory.create((WebSocketHandlerWrapper) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.embeddedserver.jetty.websocket.WebSocketCreatorFactory", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WebSocketCreatorFactory webSocketCreatorFactory0 = new WebSocketCreatorFactory();
  }
}
