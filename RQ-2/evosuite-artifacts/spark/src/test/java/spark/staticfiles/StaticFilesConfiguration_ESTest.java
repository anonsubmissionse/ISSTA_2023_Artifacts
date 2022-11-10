/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 16:58:49 GMT 2022
 */

package spark.staticfiles;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import spark.staticfiles.StaticFilesConfiguration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StaticFilesConfiguration_ESTest extends StaticFilesConfiguration_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.servletInstance;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/*5[]Kx/*5[]Kx");
      byte[] byteArray0 = new byte[1];
      staticFilesConfiguration0.configureExternal("");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("/*5[]Kx/", "/*5[]Kx/", "/*5[]Kx/").when(httpServletRequest0).getAttribute(anyString());
      doReturn("").when(httpServletRequest0).getPathInfo();
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter1 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      doReturn(printWriter0, printWriter1).when(httpServletResponse0).getWriter();
      boolean boolean0 = staticFilesConfiguration0.consume(httpServletRequest0, httpServletResponse0);
      assertTrue(staticFilesConfiguration0.isExternalStaticResourcesSet());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.servletInstance;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/*5[]Kx/*5[]Kx");
      byte[] byteArray0 = new byte[1];
      staticFilesConfiguration0.configureExternal("");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("/*5[]Kx/", "/*5[]Kx/", "/*5[]Kx/").when(httpServletRequest0).getAttribute(anyString());
      doReturn("").when(httpServletRequest0).getPathInfo();
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter1 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      doReturn(printWriter0, printWriter1).when(httpServletResponse0).getWriter();
      boolean boolean0 = staticFilesConfiguration0.consume(httpServletRequest0, httpServletResponse0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.create();
      assertTrue(staticFilesConfiguration0.isStaticResourcesSet());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.create();
      staticFilesConfiguration0.configure("");
      boolean boolean0 = staticFilesConfiguration0.isStaticResourcesSet();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = new StaticFilesConfiguration();
      assertFalse(staticFilesConfiguration0.isExternalStaticResourcesSet());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = new StaticFilesConfiguration();
      staticFilesConfiguration0.configureExternal("");
      boolean boolean0 = staticFilesConfiguration0.isExternalStaticResourcesSet();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = new StaticFilesConfiguration();
      Map<String, String> map0 = null;
      // Undeclared exception!
      try { 
        staticFilesConfiguration0.servletInstance.putCustomHeaders(map0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.servletInstance;
      staticFilesConfiguration0.configure(",=");
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(httpServletRequest0).getAttribute(anyString());
      doReturn((String) null).when(httpServletRequest0).getPathInfo();
      doReturn((String) null).when(httpServletRequest0).getServletPath();
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      try { 
        staticFilesConfiguration0.servletInstance.consume(httpServletRequestWrapper0, httpServletResponseWrapper0);
        fail("Expecting exception: MalformedURLException");
      } catch(MalformedURLException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.resource.ClassPathResourceHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.servletInstance;
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      httpServletRequestWrapper0.setRequest(httpServletRequestWrapper0);
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      boolean boolean0 = staticFilesConfiguration0.consume(httpServletRequestWrapper0, httpServletResponseWrapper0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = new StaticFilesConfiguration();
      // Undeclared exception!
      try { 
        staticFilesConfiguration0.configureExternal((String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // 'folder' must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.servletInstance;
      // Undeclared exception!
      try { 
        staticFilesConfiguration0.configure((String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // 'folder' must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.servletInstance;
      staticFilesConfiguration0.configure("");
      staticFilesConfiguration0.configureExternal("");
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = new StaticFilesConfiguration();
      assertTrue(staticFilesConfiguration0.isExternalStaticResourcesSet());
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = new StaticFilesConfiguration();
      staticFilesConfiguration0.configureExternal("");
      staticFilesConfiguration0.configureExternal("0r");
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.create();
      staticFilesConfiguration0.configureExternal("mo<iC|'+l^");
      assertFalse(staticFilesConfiguration0.isExternalStaticResourcesSet());
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.create();
      staticFilesConfiguration0.configureExternal("mo<iC|'+l^");
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.create();
      String string0 = "video/msvideo,video/avi,video/x-msvideo";
      StaticFilesConfiguration staticFilesConfiguration1 = StaticFilesConfiguration.create();
      Object object0 = new Object();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn(object0, (Object) null, (Object) null).when(httpServletRequest0).getAttribute(anyString());
      doReturn((String) null).when(httpServletRequest0).getPathInfo();
      doReturn((String) null).when(httpServletRequest0).getServletPath();
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      StaticFilesConfiguration staticFilesConfiguration2 = StaticFilesConfiguration.create();
      staticFilesConfiguration2.servletInstance.configure("video/msvideo,video/avi,video/x-msvideo");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      staticFilesConfiguration1.putCustomHeaders(hashMap0);
      String string1 = "XGIvsgMmm~y";
      staticFilesConfiguration0.configure("RrF");
      httpServletRequestWrapper0.login("XGIvsgMmm~y", "XGIvsgMmm~y");
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      try { 
        staticFilesConfiguration0.servletInstance.consume(httpServletRequestWrapper0, httpServletResponseWrapper0);
        fail("Expecting exception: MalformedURLException");
      } catch(MalformedURLException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.resource.ClassPathResourceHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.create();
      staticFilesConfiguration0.configure("PathSpec ");
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      // Undeclared exception!
      try { 
        staticFilesConfiguration0.consume((HttpServletRequest) null, httpServletResponseWrapper0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.resource.AbstractResourceHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.create();
      staticFilesConfiguration0.servletInstance.configure("video/msvideo,video/avi,video/x-msvideo");
      assertTrue(staticFilesConfiguration0.isStaticResourcesSet());
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.create();
      staticFilesConfiguration0.servletInstance.configure("video/msvideo,video/avi,video/x-msvideo");
      assertFalse(staticFilesConfiguration0.isExternalStaticResourcesSet());
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = new StaticFilesConfiguration();
      staticFilesConfiguration0.configureExternal("");
      assertTrue(staticFilesConfiguration0.isExternalStaticResourcesSet());
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = new StaticFilesConfiguration();
      staticFilesConfiguration0.configureExternal("");
      staticFilesConfiguration0.clear();
      assertFalse(staticFilesConfiguration0.isExternalStaticResourcesSet());
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.create();
      staticFilesConfiguration0.clear();
      assertTrue(staticFilesConfiguration0.isStaticResourcesSet());
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.create();
      staticFilesConfiguration0.clear();
      assertTrue(staticFilesConfiguration0.isExternalStaticResourcesSet());
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = new StaticFilesConfiguration();
      staticFilesConfiguration0.putCustomHeader("", "0r");
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = new StaticFilesConfiguration();
      staticFilesConfiguration0.putCustomHeader("", "0r");
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.create();
      staticFilesConfiguration0.setExpireTimeSeconds(30000L);
      assertTrue(staticFilesConfiguration0.isStaticResourcesSet());
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.create();
      staticFilesConfiguration0.setExpireTimeSeconds(30000L);
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = new StaticFilesConfiguration();
      boolean boolean0 = staticFilesConfiguration0.isStaticResourcesSet();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = new StaticFilesConfiguration();
      boolean boolean0 = staticFilesConfiguration0.isStaticResourcesSet();
      assertFalse(staticFilesConfiguration0.isExternalStaticResourcesSet());
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StaticFilesConfiguration staticFilesConfiguration0 = StaticFilesConfiguration.servletInstance;
      boolean boolean0 = staticFilesConfiguration0.isExternalStaticResourcesSet();
      assertTrue(boolean0);
}
}
