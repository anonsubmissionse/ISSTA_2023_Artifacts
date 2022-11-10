/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 16:59:43 GMT 2022
 */

package spark.route;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import spark.FilterImpl;
import spark.Route;
import spark.RouteImpl;
import spark.TemplateEngine;
import spark.TemplateViewRoute;
import spark.TemplateViewRouteImpl;
import spark.route.HttpMethod;
import spark.route.Routes;
import spark.routematch.RouteMatch;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Routes_ESTest extends Routes_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Routes routes0 = Routes.create();
      HttpMethod httpMethod0 = HttpMethod.before;
      RouteImpl routeImpl0 = RouteImpl.create("tQS!(u70", (Route) null);
      routes0.add(httpMethod0, routeImpl0);
      List<RouteMatch> list0 = routes0.findMultiple(httpMethod0, "tQS!(u70", "HSpy~y;SVRN3[hk\"");
      assertTrue(list0.isEmpty());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Routes routes0 = Routes.create();
      routes0.add("Z=S+'J'4*\"YF", "", (Object) "ZTo");
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Routes routes0 = Routes.create();
      HttpMethod httpMethod0 = HttpMethod.patch;
      FilterImpl filterImpl0 = mock(FilterImpl.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(filterImpl0).toString();
      doReturn((String) null).when(filterImpl0).getAcceptType();
      doReturn((String) null).when(filterImpl0).getPath();
      routes0.add(httpMethod0, filterImpl0);
      // Undeclared exception!
      try { 
        routes0.remove("patch", "patch");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.route.RouteEntry", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Routes routes0 = new Routes();
      HttpMethod httpMethod0 = HttpMethod.afterafter;
      FilterImpl filterImpl0 = mock(FilterImpl.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(filterImpl0).toString();
      doReturn((String) null).when(filterImpl0).getAcceptType();
      doReturn((String) null).when(filterImpl0).getPath();
      routes0.add(httpMethod0, filterImpl0);
      // Undeclared exception!
      try { 
        routes0.remove("0CF2^4k^`<K9LRbL");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.route.RouteEntry", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Routes routes0 = new Routes();
      HttpMethod httpMethod0 = HttpMethod.connect;
      FilterImpl filterImpl0 = mock(FilterImpl.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(filterImpl0).toString();
      doReturn((String) null).when(filterImpl0).getAcceptType();
      doReturn((String) null).when(filterImpl0).getPath();
      routes0.add(httpMethod0, filterImpl0);
      // Undeclared exception!
      try { 
        routes0.findMultiple(httpMethod0, "iWB8OV", "iWB8OV");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.route.RouteEntry", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Routes routes0 = Routes.create();
      HttpMethod httpMethod0 = HttpMethod.post;
      RouteImpl routeImpl0 = RouteImpl.create("", (Route) null);
      routes0.add(httpMethod0, routeImpl0);
      // Undeclared exception!
      try { 
        routes0.findMultiple(httpMethod0, "", ";");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("spark.utils.MimeParse", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Routes routes0 = new Routes();
      HttpMethod httpMethod0 = HttpMethod.afterafter;
      FilterImpl filterImpl0 = mock(FilterImpl.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(filterImpl0).toString();
      doReturn((String) null).when(filterImpl0).getAcceptType();
      doReturn((String) null).when(filterImpl0).getPath();
      routes0.add(httpMethod0, filterImpl0);
      // Undeclared exception!
      try { 
        routes0.find(httpMethod0, "m*0p|op|", "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.route.RouteEntry", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Routes routes0 = Routes.create();
      HttpMethod httpMethod0 = HttpMethod.get;
      RouteImpl routeImpl0 = RouteImpl.create(";", ";", (Route) null);
      routes0.add(httpMethod0, routeImpl0);
      // Undeclared exception!
      try { 
        routes0.find(httpMethod0, ";", ";");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("spark.utils.MimeParse", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Routes routes0 = Routes.create();
      HttpMethod httpMethod0 = HttpMethod.options;
      // Undeclared exception!
      try { 
        routes0.add(httpMethod0, (FilterImpl) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.route.Routes", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Routes routes0 = new Routes();
      HttpMethod httpMethod0 = HttpMethod.patch;
      FilterImpl filterImpl0 = mock(FilterImpl.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(filterImpl0).toString();
      doReturn((String) null).when(filterImpl0).getAcceptType();
      doReturn("patch").when(filterImpl0).getPath();
      routes0.add(httpMethod0, filterImpl0);
      boolean boolean0 = routes0.remove("patch", "patch");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Routes routes0 = Routes.create();
      HttpMethod httpMethod0 = HttpMethod.put;
      TemplateEngine templateEngine0 = mock(TemplateEngine.class, new ViolatedAssumptionAnswer());
      TemplateViewRouteImpl templateViewRouteImpl0 = TemplateViewRouteImpl.create("c3H*`#?*wooH95RbRX", "qAt>}h||l", (TemplateViewRoute) null, templateEngine0);
      routes0.add(httpMethod0, (RouteImpl) templateViewRouteImpl0);
      boolean boolean0 = routes0.remove("+rkdO0]#q2w5s(7}~L", "post");
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Routes routes0 = Routes.create();
      HttpMethod httpMethod0 = HttpMethod.put;
      TemplateEngine templateEngine0 = mock(TemplateEngine.class, new ViolatedAssumptionAnswer());
      TemplateViewRouteImpl templateViewRouteImpl0 = TemplateViewRouteImpl.create("c3H*`#?*wooH95RbRX", "qAt>}h||l", (TemplateViewRoute) null, templateEngine0);
      routes0.add(httpMethod0, (RouteImpl) templateViewRouteImpl0);
      boolean boolean0 = routes0.remove("c3H*`#?*wooH95RbRX");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Routes routes0 = Routes.create();
      HttpMethod httpMethod0 = HttpMethod.unsupported;
      TemplateEngine templateEngine0 = mock(TemplateEngine.class, new ViolatedAssumptionAnswer());
      TemplateViewRouteImpl templateViewRouteImpl0 = TemplateViewRouteImpl.create("ci3H*`?*w~oH5*RX", "qAt>}h||8", (TemplateViewRoute) null, templateEngine0);
      RouteImpl routeImpl0 = RouteImpl.create("qAt>}h||8", "ci3H*`?*w~oH5*RX", (Route) templateViewRouteImpl0);
      routes0.add(httpMethod0, routeImpl0);
      RouteMatch routeMatch0 = routes0.find(httpMethod0, "qAt>}h||8", (String) null);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Routes routes0 = Routes.create();
      HttpMethod httpMethod0 = HttpMethod.post;
      TemplateEngine templateEngine0 = mock(TemplateEngine.class, new ViolatedAssumptionAnswer());
      TemplateViewRouteImpl templateViewRouteImpl0 = TemplateViewRouteImpl.create("c3H*`#?*w~oHv5R*RX", "qAt>}h||l", (TemplateViewRoute) null, templateEngine0);
      RouteImpl routeImpl0 = RouteImpl.create("qAt>}h||l", "c3H*`#?*w~oHv5R*RX", (Route) templateViewRouteImpl0);
      routes0.add(httpMethod0, routeImpl0);
      RouteMatch routeMatch0 = routes0.find(httpMethod0, "qAt>}h||l", "xCV*k4z|ge4Ilf");
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Routes routes0 = Routes.create();
      HttpMethod httpMethod0 = HttpMethod.unsupported;
      RouteMatch routeMatch0 = routes0.find(httpMethod0, "qAt>}h||8", (String) null);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Routes routes0 = Routes.create();
      HttpMethod httpMethod0 = HttpMethod.put;
      TemplateEngine templateEngine0 = mock(TemplateEngine.class, new ViolatedAssumptionAnswer());
      TemplateViewRouteImpl templateViewRouteImpl0 = TemplateViewRouteImpl.create("c3H*`#?*wooH95RbRX", "qAt>}h||l", (TemplateViewRoute) null, templateEngine0);
      routes0.add(httpMethod0, (RouteImpl) templateViewRouteImpl0);
      List<RouteMatch> list0 = routes0.findMultiple(httpMethod0, "", "");
      assertEquals(1, list0.size());
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Routes routes0 = Routes.create();
      HttpMethod httpMethod0 = HttpMethod.patch;
      RouteImpl routeImpl0 = RouteImpl.create("y", "y", (Route) null);
      routes0.add(httpMethod0, routeImpl0);
      routes0.add(httpMethod0, routeImpl0);
      RouteMatch routeMatch0 = routes0.find(httpMethod0, "y", "y");
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Routes routes0 = Routes.create();
      // Undeclared exception!
      try { 
        routes0.remove("");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // path cannot be null or blank
         //
         verifyException("spark.route.Routes", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Routes routes0 = Routes.create();
      boolean boolean0 = routes0.remove("c3H*`#?*wooH95RbRX");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Routes routes0 = Routes.create();
      // Undeclared exception!
      try { 
        routes0.remove("U(4g^2B,y`Lmj*pD7P9", "");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // httpMethod cannot be null or blank
         //
         verifyException("spark.route.Routes", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Routes routes0 = Routes.create();
      // Undeclared exception!
      try { 
        routes0.remove((String) null, "%[|qG+yh ;\"1UXzZ{");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // path cannot be null or blank
         //
         verifyException("spark.route.Routes", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Routes routes0 = Routes.create();
      HttpMethod httpMethod0 = HttpMethod.put;
      TemplateEngine templateEngine0 = mock(TemplateEngine.class, new ViolatedAssumptionAnswer());
      TemplateViewRouteImpl templateViewRouteImpl0 = TemplateViewRouteImpl.create("c3H*`#?*wooH95RbRX", "qAt>}h||l", (TemplateViewRoute) null, templateEngine0);
      routes0.add(httpMethod0, (RouteImpl) templateViewRouteImpl0);
      List<RouteMatch> list0 = routes0.findAll();
      assertEquals(1, list0.size());
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Routes routes0 = new Routes();
      HttpMethod httpMethod0 = HttpMethod.delete;
      TemplateEngine templateEngine0 = mock(TemplateEngine.class, new ViolatedAssumptionAnswer());
      TemplateViewRouteImpl templateViewRouteImpl0 = TemplateViewRouteImpl.create("", "", (TemplateViewRoute) null, templateEngine0);
      routes0.add(httpMethod0, (RouteImpl) templateViewRouteImpl0);
      List<RouteMatch> list0 = routes0.findMultiple(httpMethod0, "", "");
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Routes routes0 = new Routes();
      HttpMethod httpMethod0 = HttpMethod.connect;
      TemplateEngine templateEngine0 = mock(TemplateEngine.class, new ViolatedAssumptionAnswer());
      TemplateViewRouteImpl templateViewRouteImpl0 = TemplateViewRouteImpl.create("cH@>", "cH@>", (TemplateViewRoute) null, templateEngine0);
      routes0.add(httpMethod0, (RouteImpl) templateViewRouteImpl0);
      List<RouteMatch> list0 = routes0.findMultiple(httpMethod0, "cH@>", (String) null);
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Routes routes0 = Routes.create();
      HttpMethod httpMethod0 = HttpMethod.put;
      RouteMatch routeMatch0 = routes0.find(httpMethod0, "", "");
      assertNotNull(routeMatch0);
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Routes routes0 = Routes.create();
      HttpMethod httpMethod0 = HttpMethod.put;
      // Undeclared exception!
      try { 
        routes0.add(httpMethod0, (RouteImpl) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.route.Routes", e);
      }
  }
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Routes routes0 = Routes.create();
      List<RouteMatch> list0 = routes0.findAll();
      routes0.add("~~N&", (String) null, (Object) list0);
      assertEquals(0, list0.size());
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Routes routes0 = Routes.create();
      routes0.clear();
  }
}
