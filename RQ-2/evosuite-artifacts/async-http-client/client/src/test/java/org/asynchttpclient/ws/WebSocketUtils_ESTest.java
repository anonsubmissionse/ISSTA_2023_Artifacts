/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:49:31 GMT 2022
 */

package org.asynchttpclient.ws;

import org.junit.Test;
import static org.junit.Assert.*;
import org.asynchttpclient.ws.WebSocketUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WebSocketUtils_ESTest extends WebSocketUtils_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = WebSocketUtils.getWebSocketKey();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WebSocketUtils webSocketUtils0 = new WebSocketUtils();
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = WebSocketUtils.getAcceptKey("AAAAAAAAAAAAAAAAAAAAAA==");
      assertNotNull(string0);
}
}
