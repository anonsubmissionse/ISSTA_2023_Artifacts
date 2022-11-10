/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 21:52:23 GMT 2022
 */

package org.apache.commons.jcs3.auxiliary.remote.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.apache.commons.jcs3.auxiliary.remote.server.RemoteCacheStartupServlet;
import org.apache.commons.jcs3.engine.control.CompositeCacheManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RemoteCacheStartupServlet_ESTest extends RemoteCacheStartupServlet_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RemoteCacheStartupServlet remoteCacheStartupServlet0 = new RemoteCacheStartupServlet();
      CompositeCacheManager.getInstance("");
      remoteCacheStartupServlet0.destroy();
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RemoteCacheStartupServlet remoteCacheStartupServlet0 = new RemoteCacheStartupServlet();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      CompositeCacheManager.getInstance("");
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      httpServletResponseWrapper0.setResponse(httpServletResponseWrapper0);
      // Undeclared exception!
      try { 
        remoteCacheStartupServlet0.service((HttpServletRequest) httpServletRequestWrapper0, (HttpServletResponse) httpServletResponseWrapper0);
        fail("Expecting exception: StackOverflowError");
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RemoteCacheStartupServlet remoteCacheStartupServlet0 = new RemoteCacheStartupServlet();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      // Undeclared exception!
      try { 
        remoteCacheStartupServlet0.service((HttpServletRequest) httpServletRequestWrapper0, (HttpServletResponse) httpServletResponseWrapper0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Properties$LineReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RemoteCacheStartupServlet remoteCacheStartupServlet0 = new RemoteCacheStartupServlet();
      // Undeclared exception!
      try { 
        remoteCacheStartupServlet0.init();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.auxiliary.remote.server.RemoteCacheStartupServlet", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      CompositeCacheManager.getInstance("");
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(httpServletResponse0).getCharacterEncoding();
      doReturn((ServletOutputStream) null).when(httpServletResponse0).getOutputStream();
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      RemoteCacheStartupServlet remoteCacheStartupServlet0 = new RemoteCacheStartupServlet();
      // Undeclared exception!
      try { 
        remoteCacheStartupServlet0.service((HttpServletRequest) httpServletRequestWrapper0, (HttpServletResponse) httpServletResponseWrapper0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.auxiliary.remote.server.RemoteCacheStartupServlet", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      CompositeCacheManager.getInstance("");
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      doReturn("org.apache.commons.jcs3:type=JCSAdminBean").when(httpServletResponse0).getCharacterEncoding();
      doReturn((ServletOutputStream) null).when(httpServletResponse0).getOutputStream();
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      RemoteCacheStartupServlet remoteCacheStartupServlet0 = new RemoteCacheStartupServlet();
      remoteCacheStartupServlet0.service((HttpServletRequest) httpServletRequestWrapper0, (HttpServletResponse) httpServletResponseWrapper0);
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RemoteCacheStartupServlet remoteCacheStartupServlet0 = new RemoteCacheStartupServlet();
      // Undeclared exception!
      try { 
        remoteCacheStartupServlet0.destroy();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Properties$LineReader", e);
      }
  }
}
