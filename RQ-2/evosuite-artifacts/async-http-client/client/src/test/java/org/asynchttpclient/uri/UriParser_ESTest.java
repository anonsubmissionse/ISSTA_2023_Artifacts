/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:10:26 GMT 2022
 */

package org.asynchttpclient.uri;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.asynchttpclient.uri.Uri;
import org.asynchttpclient.uri.UriParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UriParser_ESTest extends UriParser_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      uriParser0.parse((Uri) null, "//`]i}Zxr:6");
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      Uri uri0 = new Uri("?M`x)}Zxr:hu", (String) null, "_FEb5H2jFz", 0, (String) null, "a0+N/uk", "/.");
      uriParser0.parse(uri0, "/../..");
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      uriParser0.parse((Uri) null, "hYsHu/S#dVg");
      uriParser0.parse((Uri) null, ".//../");
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      Uri uri0 = mock(Uri.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(uri0).getFragment();
      doReturn((String) null).when(uri0).getHost();
      doReturn((String) null).when(uri0).getPath();
      doReturn(0).when(uri0).getPort();
      doReturn((String) null).when(uri0).getQuery();
      doReturn((String) null).when(uri0).getScheme();
      doReturn((String) null).when(uri0).getUserInfo();
      uriParser0.parse(uri0, "url:");
      Uri uri1 = mock(Uri.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(uri1).getHost();
      doReturn((String) null).when(uri1).getPath();
      doReturn(0).when(uri1).getPort();
      doReturn((String) null).when(uri1).getScheme();
      doReturn((String) null).when(uri1).getUserInfo();
      uriParser0.parse(uri1, "ws");
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      Uri uri0 = new Uri("i-ft\"f6", "ws", "[`zYD*<:q,x}/>X&lM", (-1), "http", "\";}|aec~i@a4.", "");
      // Undeclared exception!
      try { 
        uriParser0.parse(uri0, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // originalUrl
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      uriParser0.parse((Uri) null, "////");
      uriParser0.parse((Uri) null, "?c]5*D}4Y5Rn");
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      Uri uri0 = new Uri("\">", (String) null, "\">", (-1), "\">", "\">", (String) null);
      uriParser0.parse(uri0, "//");
      uriParser0.parse(uri0, "tnI9*oH+qh+");
      assertEquals(0, uri0.getSchemeDefaultPort());
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      uriParser0.parse((Uri) null, ".//.");
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      uriParser0.parse((Uri) null, "/..");
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      uriParser0.parse((Uri) null, ".//../");
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      uriParser0.parse((Uri) null, "//valid port number :");
      uriParser0.parse((Uri) null, "?c]5*D}4Y5Rn");
      uriParser0.parse((Uri) null, "?c]5*D}4Y5Rn");
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      // Undeclared exception!
      try { 
        uriParser0.parse((Uri) null, "//[T'Y7");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Invalid authority field: [T'Y7
         //
         verifyException("org.asynchttpclient.uri.UriParser", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      uriParser0.parse((Uri) null, "//G{xgSZ@#+_)`h-dr");
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      uriParser0.parse((Uri) null, "//jmt?g wn@q_");
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      uriParser0.parse((Uri) null, "?c]5*D}4Y5Rn");
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      uriParser0.parse((Uri) null, "!.V/@#?g@>fh>");
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      Uri uri0 = new Uri("{?q:(90tR", ".//!.0/`%1/host", ".//!.0/`%1/host", (-1201), "", (String) null, "URI");
      Uri uri1 = Uri.create(uri0, "{?q:(90tR");
      uriParser0.parse(uri1, "///:_");
      assertNotNull(uri1.getPath());
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      Uri uri0 = mock(Uri.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(uri0).getHost();
      doReturn("HptH ").when(uri0).getPath();
      doReturn((-1)).when(uri0).getPort();
      doReturn("https").when(uri0).getScheme();
      doReturn((String) null).when(uri0).getUserInfo();
      uriParser0.parse(uri0, "./");
      Uri uri1 = mock(Uri.class, new ViolatedAssumptionAnswer());
      doReturn("HptH ").when(uri1).getScheme();
      uriParser0.parse(uri1, "HptH ");
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      Uri uri0 = new Uri("{?q:(90tR", ".//!.0/`%1/host", ".//!.0/`%1/host", (-1201), "", (String) null, "URI");
      uriParser0.parse(uri0, "URI");
      uriParser0.parse(uri0, " could not be parsed into a proper Uri, missing scheme");
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      uriParser0.parse((Uri) null, ":");
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      uriParser0.parse((Uri) null, "uHl:");
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      uriParser0.parse((Uri) null, "BZ0DtB<:W2xrk");
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      uriParser0.parse((Uri) null, "#");
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      Uri uri0 = new Uri("{?q:(90tR", ".//!.0/`%1/host", ".//!.0/`%1/host", (-1201), "", (String) null, "URI");
      uriParser0.parse(uri0, " could not be parsed into a proper Uri, missing scheme");
      // Undeclared exception!
      try { 
        uriParser0.parse(uri0, "///:_");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
         //
         // For input string: \"_\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UriParser uriParser0 = new UriParser();
      Uri uri0 = new Uri("url:h", "gLQ)jgO9Z0}i.pJ%*", "T9n}ed,NJl", (-1), ";/", (String) null, (String) null);
      uriParser0.parse(uri0, "");
      // Undeclared exception!
      uriParser0.parse((Uri) null, "../");
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        Uri.create("/../../..");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // /../../.. could not be parsed into a proper Uri, missing scheme
         //
         verifyException("org.asynchttpclient.uri.Uri", e);
      }
  }
}
