/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:41:42 GMT 2022
 */

package org.asynchttpclient.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.asynchttpclient.Param;
import org.asynchttpclient.uri.Uri;
import org.asynchttpclient.util.UriEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UriEncoder_ESTest extends UriEncoder_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UriEncoder[] uriEncoderArray0 = UriEncoder.values();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UriEncoder.valueOf("RAW");
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      Uri uri0 = mock(Uri.class, new ViolatedAssumptionAnswer());
      doReturn("wss").when(uri0).getFragment();
      doReturn("wss").when(uri0).getHost();
      doReturn("wss").when(uri0).getPath();
      doReturn(303).when(uri0).getPort();
      doReturn("E~#q(r,-,%-e").when(uri0).getQuery();
      doReturn("wss").when(uri0).getScheme();
      doReturn("E~#q(r,-,%-e").when(uri0).getUserInfo();
      Uri uri1 = uriEncoder0.encode(uri0, (List<Param>) null);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      Uri uri0 = mock(Uri.class, new ViolatedAssumptionAnswer());
      doReturn("wss").when(uri0).getFragment();
      doReturn("wss").when(uri0).getHost();
      doReturn("wss").when(uri0).getPath();
      doReturn(303).when(uri0).getPort();
      doReturn("E~#q(r,-,%-e").when(uri0).getQuery();
      doReturn("wss").when(uri0).getScheme();
      doReturn("E~#q(r,-,%-e").when(uri0).getUserInfo();
      Uri uri1 = uriEncoder0.encode(uri0, (List<Param>) null);
      assertNotNull(uri1.getPath());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.RAW;
      Uri uri0 = new Uri("FIXING", "$VALUES", "$VALUES", 0, "&;R)~@3>\"dpO)%pj}", "", "~l=nhqqv{PA!C");
      Uri uri1 = uriEncoder0.encode(uri0, (List<Param>) null);
      assertEquals(0, uri1.getPort());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      Uri uri0 = mock(Uri.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(uri0).getPath();
      // Undeclared exception!
      try { 
        uriEncoder0.encode(uri0, (List<Param>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.util.Utf8UrlEncoder", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.uriEncoder(true);
      Uri uri0 = mock(Uri.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(uri0).getFragment();
      doReturn((String) null).when(uri0).getHost();
      doReturn("-<$FTD*tw").when(uri0).getPath();
      doReturn(0).when(uri0).getPort();
      doReturn("Q").when(uri0).getQuery();
      doReturn("").when(uri0).getScheme();
      doReturn("8Gx").when(uri0).getUserInfo();
      // Undeclared exception!
      try { 
        uriEncoder0.encode(uri0, (List<Param>) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // empty scheme
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.uriEncoder(true);
      Uri uri0 = mock(Uri.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(uri0).getFragment();
      doReturn((String) null).when(uri0).getHost();
      doReturn((String) null).when(uri0).getPath();
      doReturn(0).when(uri0).getPort();
      doReturn((String) null).when(uri0).getQuery();
      doReturn((String) null).when(uri0).getScheme();
      doReturn((String) null).when(uri0).getUserInfo();
      // Undeclared exception!
      try { 
        uriEncoder0.encode(uri0, (List<Param>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // scheme
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.uriEncoder(false);
      Uri uri0 = new Uri("nnYRt", "nnYRt", "nnYRt", (-1), "nnYRt", "nnYRt", "nnYRt");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("ws");
      hashMap0.put("io.netty.handler.ssl.JdkAlpnSslEngine$AlpnSelector", linkedList0);
      List<Param> list0 = Param.map2ParamList(hashMap0);
      Uri uri1 = uriEncoder0.encode(uri0, list0);
      assertNotNull(uri1.getQuery());
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.uriEncoder(false);
      Uri uri0 = new Uri("nnYRt", "nnYRt", "nnYRt", (-1), "nnYRt", "nnYRt", "nnYRt");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("ws");
      hashMap0.put("io.netty.handler.ssl.JdkAlpnSslEngine$AlpnSelector", linkedList0);
      List<Param> list0 = Param.map2ParamList(hashMap0);
      Uri uri1 = uriEncoder0.encode(uri0, list0);
      assertNotNull(uri1.getPath());
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Uri uri0 = new Uri(" &Rt", " &Rt", " &Rt", 48, " &Rt", " &Rt", " &Rt");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      hashMap0.put("ws", linkedList0);
      List<Param> list0 = Param.map2ParamList(hashMap0);
      UriEncoder uriEncoder0 = UriEncoder.uriEncoder(true);
      Uri uri1 = uriEncoder0.encode(uri0, list0);
      assertNotNull(uri1.getPath());
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Uri uri0 = new Uri(" &Rt", " &Rt", " &Rt", 48, " &Rt", " &Rt", " &Rt");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      hashMap0.put("ws", linkedList0);
      List<Param> list0 = Param.map2ParamList(hashMap0);
      UriEncoder uriEncoder0 = UriEncoder.uriEncoder(true);
      Uri uri1 = uriEncoder0.encode(uri0, list0);
      assertNotNull(uri1.getQuery());
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.RAW;
      Uri uri0 = new Uri("org.eclipse.jetty.util.thread.SerializedExecutor", "org.eclipse.jetty.util.thread.SerializedExecutor", "org.eclipse.jetty.util.thread.SerializedExecutor", (-3949), "org.eclipse.jetty.util.thread.SerializedExecutor", "org.eclipse.jetty.util.thread.SerializedExecutor", (String) null);
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      Param param0 = new Param("ws", "http");
      linkedList0.add(param0);
      Uri uri1 = Uri.create(uri0, "http");
      Uri uri2 = uriEncoder0.encode(uri1, linkedList0);
      assertNotNull(uri2.getQuery());
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.RAW;
      Uri uri0 = new Uri("org.eclipse.jetty.util.thread.SerializedExecutor", "org.eclipse.jetty.util.thread.SerializedExecutor", "org.eclipse.jetty.util.thread.SerializedExecutor", (-3949), "org.eclipse.jetty.util.thread.SerializedExecutor", "org.eclipse.jetty.util.thread.SerializedExecutor", (String) null);
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      Param param0 = new Param("ws", "http");
      linkedList0.add(param0);
      Uri uri1 = Uri.create(uri0, "http");
      Uri uri2 = uriEncoder0.encode(uri1, linkedList0);
      assertNotNull(uri2.getPath());
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.RAW;
      Uri uri0 = new Uri("org.eclipse.jetty.util.thread.SerializedExecutor", "org.eclipse.jetty.util.thread.SerializedExecutor", "org.eclipse.jetty.util.thread.SerializedExecutor", (-3949), "org.eclipse.jetty.util.thread.SerializedExecutor", "org.eclipse.jetty.util.thread.SerializedExecutor", (String) null);
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      Param param0 = new Param("ws", "http");
      linkedList0.add(param0);
      Uri uri1 = Uri.create(uri0, "http");
      Uri uri2 = uriEncoder0.encode(uri1, linkedList0);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Uri uri0 = new Uri(" &Rt", " &Rt", " &Rt", 48, " &Rt", " &Rt", " &Rt");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      hashMap0.put("ws", linkedList0);
      List<Param> list0 = Param.map2ParamList(hashMap0);
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      Uri uri1 = uriEncoder0.encode(uri0, list0);
      assertNotNull(uri1.getPath());
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Uri uri0 = new Uri(" &Rt", " &Rt", " &Rt", 48, " &Rt", " &Rt", " &Rt");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      hashMap0.put("ws", linkedList0);
      List<Param> list0 = Param.map2ParamList(hashMap0);
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      Uri uri1 = uriEncoder0.encode(uri0, list0);
      assertNotNull(uri1.getQuery());
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      Uri uri0 = new Uri("org.asynchttpclient.util.UriEncoder", "org.asynchttpclient.util.UriEncoder", "org.asynchttpclient.util.UriEncoder", (-1027), "org.asynchttpclient.util.UriEncoder", "org.asynchttpclient.util.UriEncoder", (String) null);
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      Param param0 = new Param("ws", "ws");
      linkedList0.add(param0);
      Uri uri1 = Uri.create(uri0, "https");
      Uri uri2 = uriEncoder0.encode(uri1, linkedList0);
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      Uri uri0 = new Uri("org.asynchttpclient.util.UriEncoder", "org.asynchttpclient.util.UriEncoder", "org.asynchttpclient.util.UriEncoder", (-1027), "org.asynchttpclient.util.UriEncoder", "org.asynchttpclient.util.UriEncoder", (String) null);
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      Param param0 = new Param("ws", "ws");
      linkedList0.add(param0);
      Uri uri1 = Uri.create(uri0, "https");
      Uri uri2 = uriEncoder0.encode(uri1, linkedList0);
      assertNotNull(uri2.getQuery());
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UriEncoder uriEncoder0 = UriEncoder.FIXING;
      Uri uri0 = new Uri("org.asynchttpclient.util.UriEncoder", "org.asynchttpclient.util.UriEncoder", "org.asynchttpclient.util.UriEncoder", (-1027), "org.asynchttpclient.util.UriEncoder", "org.asynchttpclient.util.UriEncoder", (String) null);
      LinkedList<Param> linkedList0 = new LinkedList<Param>();
      Param param0 = new Param("ws", "ws");
      linkedList0.add(param0);
      Uri uri1 = Uri.create(uri0, "https");
      Uri uri2 = uriEncoder0.encode(uri1, linkedList0);
      assertNotNull(uri2.getPath());
}
}
