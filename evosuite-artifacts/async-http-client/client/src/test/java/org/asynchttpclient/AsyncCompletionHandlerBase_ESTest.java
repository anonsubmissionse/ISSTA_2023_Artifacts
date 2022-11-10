/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:54:36 GMT 2022
 */

package org.asynchttpclient;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import io.netty.handler.codec.http.HttpHeaders;
import java.util.Iterator;
import java.util.List;
import org.asynchttpclient.AsyncCompletionHandlerBase;
import org.asynchttpclient.HttpResponseBodyPart;
import org.asynchttpclient.HttpResponseStatus;
import org.asynchttpclient.Response;
import org.asynchttpclient.netty.NettyResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AsyncCompletionHandlerBase_ESTest extends AsyncCompletionHandlerBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AsyncCompletionHandlerBase asyncCompletionHandlerBase0 = new AsyncCompletionHandlerBase();
      Response response0 = asyncCompletionHandlerBase0.onCompleted((Response) null);
      assertNull(response0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsyncCompletionHandlerBase asyncCompletionHandlerBase0 = new AsyncCompletionHandlerBase();
      HttpResponseStatus httpResponseStatus0 = mock(HttpResponseStatus.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(httpResponseStatus0).getStatusCode();
      HttpHeaders httpHeaders0 = mock(HttpHeaders.class, new ViolatedAssumptionAnswer());
      doReturn((Iterator) null).when(httpHeaders0).iterator();
      NettyResponse nettyResponse0 = new NettyResponse(httpResponseStatus0, httpHeaders0, (List<HttpResponseBodyPart>) null);
      Response response0 = asyncCompletionHandlerBase0.onCompleted((Response) nettyResponse0);
      assertTrue(response0.hasResponseStatus());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AsyncCompletionHandlerBase asyncCompletionHandlerBase0 = new AsyncCompletionHandlerBase();
      HttpHeaders httpHeaders0 = mock(HttpHeaders.class, new ViolatedAssumptionAnswer());
      NettyResponse nettyResponse0 = new NettyResponse((HttpResponseStatus) null, httpHeaders0, (List<HttpResponseBodyPart>) null);
      Response response0 = asyncCompletionHandlerBase0.onCompleted((Response) nettyResponse0);
      assertSame(response0, nettyResponse0);
  }
}
