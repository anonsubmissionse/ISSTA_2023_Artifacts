/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:54:17 GMT 2022
 */

package org.asynchttpclient;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.handler.codec.http.HttpHeaders;
import java.net.InetAddress;
import org.asynchttpclient.AsyncHandler;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.BoundRequestBuilder;
import org.asynchttpclient.ListenableFuture;
import org.asynchttpclient.Request;
import org.asynchttpclient.RequestBuilder;
import org.asynchttpclient.Response;
import org.asynchttpclient.uri.Uri;
import org.asynchttpclient.webdav.WebDavResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BoundRequestBuilder_ESTest extends BoundRequestBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenableFuture<WebDavResponse> listenableFuture0 = (ListenableFuture<WebDavResponse>) mock(ListenableFuture.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(listenableFuture0).toString();
      AsyncHttpClient asyncHttpClient0 = mock(AsyncHttpClient.class, new ViolatedAssumptionAnswer());
      doReturn(listenableFuture0).when(asyncHttpClient0).executeRequest(any(org.asynchttpclient.Request.class) , nullable(org.asynchttpclient.AsyncHandler.class));
      BoundRequestBuilder boundRequestBuilder0 = new BoundRequestBuilder(asyncHttpClient0, "jZ.", false, true);
      ListenableFuture<Object> listenableFuture1 = boundRequestBuilder0.execute((AsyncHandler<Object>) null);
      assertNotNull(listenableFuture1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ListenableFuture<Integer> listenableFuture0 = (ListenableFuture<Integer>) mock(ListenableFuture.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(listenableFuture0).toString();
      AsyncHttpClient asyncHttpClient0 = mock(AsyncHttpClient.class, new ViolatedAssumptionAnswer());
      doReturn((ListenableFuture<Iterable<String>>) null, listenableFuture0).when(asyncHttpClient0).executeRequest(any(org.asynchttpclient.Request.class) , nullable(org.asynchttpclient.AsyncHandler.class));
      BoundRequestBuilder boundRequestBuilder0 = new BoundRequestBuilder(asyncHttpClient0, "", false, false);
      AsyncHandler<Object> asyncHandler0 = (AsyncHandler<Object>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      boundRequestBuilder0.execute((AsyncHandler<Object>) asyncHandler0);
      ListenableFuture<Response> listenableFuture1 = boundRequestBuilder0.execute();
      assertNotNull(listenableFuture1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AsyncHttpClient asyncHttpClient0 = mock(AsyncHttpClient.class, new ViolatedAssumptionAnswer());
      BoundRequestBuilder boundRequestBuilder0 = null;
      try {
        boundRequestBuilder0 = new BoundRequestBuilder(asyncHttpClient0, (Request) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.RequestBuilderBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AsyncHttpClient asyncHttpClient0 = mock(AsyncHttpClient.class, new ViolatedAssumptionAnswer());
      RequestBuilder requestBuilder0 = new RequestBuilder((String) null, true);
      Request request0 = requestBuilder0.build();
      BoundRequestBuilder boundRequestBuilder0 = new BoundRequestBuilder(asyncHttpClient0, request0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn((InetAddress) null).when(request0).getAddress();
      doReturn((HttpHeaders) null).when(request0).getHeaders();
      doReturn((InetAddress) null).when(request0).getLocalAddress();
      doReturn((String) null).when(request0).getMethod();
      doReturn((Uri) null).when(request0).getUri();
      BoundRequestBuilder boundRequestBuilder0 = null;
      try {
        boundRequestBuilder0 = new BoundRequestBuilder((AsyncHttpClient) null, request0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // headers
         //
         verifyException("io.netty.util.internal.ObjectUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AsyncHttpClient asyncHttpClient0 = mock(AsyncHttpClient.class, new ViolatedAssumptionAnswer());
      doReturn((ListenableFuture) null).when(asyncHttpClient0).executeRequest(any(org.asynchttpclient.Request.class) , nullable(org.asynchttpclient.AsyncHandler.class));
      BoundRequestBuilder boundRequestBuilder0 = new BoundRequestBuilder(asyncHttpClient0, "", true);
      ListenableFuture<Response> listenableFuture0 = boundRequestBuilder0.execute();
      assertNull(listenableFuture0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BoundRequestBuilder boundRequestBuilder0 = new BoundRequestBuilder((AsyncHttpClient) null, (String) null, false, false);
      // Undeclared exception!
      try { 
        boundRequestBuilder0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.BoundRequestBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BoundRequestBuilder boundRequestBuilder0 = new BoundRequestBuilder((AsyncHttpClient) null, "+itokBov-J", true);
      AsyncHandler<String> asyncHandler0 = (AsyncHandler<String>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        boundRequestBuilder0.execute((AsyncHandler<String>) asyncHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.BoundRequestBuilder", e);
      }
  }
}
