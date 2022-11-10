/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 17:20:25 GMT 2022
 */

package spark.embeddedserver.jetty.websocket;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.embeddedserver.jetty.websocket.WebSocketHandlerInstanceWrapper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WebSocketHandlerInstanceWrapper_ESTest extends WebSocketHandlerInstanceWrapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WebSocketHandlerInstanceWrapper webSocketHandlerInstanceWrapper0 = null;
      try {
        webSocketHandlerInstanceWrapper0 = new WebSocketHandlerInstanceWrapper((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // WebSocket handler cannot be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WebSocketHandlerInstanceWrapper webSocketHandlerInstanceWrapper0 = null;
      try {
        webSocketHandlerInstanceWrapper0 = new WebSocketHandlerInstanceWrapper("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // WebSocket handler must implement 'WebSocketListener' or be annotated as '@WebSocket'
         //
         verifyException("spark.embeddedserver.jetty.websocket.WebSocketHandlerWrapper", e);
      }
  }
}
