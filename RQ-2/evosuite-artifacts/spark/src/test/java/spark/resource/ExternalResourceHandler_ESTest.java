/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 17:10:43 GMT 2022
 */

package spark.resource;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.MalformedURLException;
import javax.servlet.http.HttpServletRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import spark.resource.AbstractFileResolvingResource;
import spark.resource.ExternalResource;
import spark.resource.ExternalResourceHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExternalResourceHandler_ESTest extends ExternalResourceHandler_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExternalResourceHandler externalResourceHandler0 = new ExternalResourceHandler("", "");
      // Undeclared exception!
      try { 
        externalResourceHandler0.getResource("/");
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // external
         //
         verifyException("spark.staticfiles.DirectoryTraversal", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExternalResourceHandler externalResourceHandler0 = null;
      try {
        externalResourceHandler0 = new ExternalResourceHandler((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // [Assertion failed] - this argument is required; it must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ExternalResourceHandler externalResourceHandler0 = null;
      try {
        externalResourceHandler0 = new ExternalResourceHandler((String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // [Assertion failed] - this argument is required; it must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ExternalResourceHandler externalResourceHandler0 = new ExternalResourceHandler("//", "//");
      AbstractFileResolvingResource abstractFileResolvingResource0 = externalResourceHandler0.getResource("//");
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ExternalResourceHandler externalResourceHandler0 = new ExternalResourceHandler("/");
      AbstractFileResolvingResource abstractFileResolvingResource0 = externalResourceHandler0.getResource("/");
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("z#R[2F<2* ,|j2tLqfE/(OB@Afm");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Ecg>g $.;wacH#$");
      ExternalResourceHandler externalResourceHandler0 = new ExternalResourceHandler("z#R[2F<2* ,|j2tLqfE");
      ExternalResource externalResource0 = (ExternalResource)externalResourceHandler0.getResource("/(OB@Afm");
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ExternalResourceHandler externalResourceHandler0 = new ExternalResourceHandler("z#R[2F<2* ,|j2tLqfE");
      try { 
        externalResourceHandler0.getResource("h@B.D?oW");
        fail("Expecting exception: MalformedURLException");
      } catch(MalformedURLException e) {
         //
         // h@B.D?oW
         //
         verifyException("spark.resource.ExternalResourceHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ExternalResourceHandler externalResourceHandler0 = new ExternalResourceHandler("z#R[2F<2* ,|j2tLqfE", "`");
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(httpServletRequest0).getAttribute(anyString());
      doReturn((String) null).when(httpServletRequest0).getPathInfo();
      doReturn((String) null).when(httpServletRequest0).getServletPath();
      try { 
        externalResourceHandler0.getResource(httpServletRequest0);
        fail("Expecting exception: MalformedURLException");
      } catch(MalformedURLException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.resource.ExternalResourceHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ExternalResourceHandler externalResourceHandler0 = new ExternalResourceHandler("z#R[2F<2* ,|j2tLqfE");
      AbstractFileResolvingResource abstractFileResolvingResource0 = externalResourceHandler0.getResource("/(OB@Afm");
      ;
}
}
