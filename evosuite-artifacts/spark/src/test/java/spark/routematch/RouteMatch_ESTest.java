/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 17:21:29 GMT 2022
 */

package spark.routematch;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.route.HttpMethod;
import spark.routematch.RouteMatch;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RouteMatch_ESTest extends RouteMatch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HttpMethod httpMethod0 = HttpMethod.post;
      RouteMatch routeMatch0 = new RouteMatch((Object) null, "$r", ";", "2?{F,KOK/", httpMethod0);
      routeMatch0.getTarget();
      assertEquals("$r", routeMatch0.getMatchUri());
      assertEquals("2?{F,KOK/", routeMatch0.getAcceptType());
      assertEquals(";", routeMatch0.getRequestURI());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      RouteMatch routeMatch0 = new RouteMatch(object0, (String) null, (String) null, "spark.routematch.RouteMatch");
      String string0 = routeMatch0.getRequestURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RouteMatch routeMatch0 = new RouteMatch("spark.route.HttpMethod", "", "", "");
      String string0 = routeMatch0.getRequestURI();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HttpMethod httpMethod0 = HttpMethod.post;
      RouteMatch routeMatch0 = new RouteMatch((Object) null, "$r", ";", "2?{F,KOK/", httpMethod0);
      String string0 = routeMatch0.getMatchUri();
      assertEquals("$r", string0);
      assertEquals("2?{F,KOK/", routeMatch0.getAcceptType());
      assertEquals(";", routeMatch0.getRequestURI());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RouteMatch routeMatch0 = new RouteMatch("spark.route.HttpMethod", "", "", "");
      String string0 = routeMatch0.getMatchUri();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RouteMatch routeMatch0 = new RouteMatch("spark.route.HttpMethod", "", "", "");
      routeMatch0.getHttpMethod();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      HttpMethod httpMethod0 = HttpMethod.head;
      RouteMatch routeMatch0 = new RouteMatch(object0, "afterafter", "afterafter", (String) null, httpMethod0);
      String string0 = routeMatch0.getAcceptType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RouteMatch routeMatch0 = new RouteMatch("spark.route.HttpMethod", "", "", "");
      String string0 = routeMatch0.getAcceptType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      RouteMatch routeMatch0 = new RouteMatch(object0, (String) null, (String) null, "spark.routematch.RouteMatch");
      String string0 = routeMatch0.getAcceptType();
      assertEquals("spark.routematch.RouteMatch", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      RouteMatch routeMatch0 = new RouteMatch(object0, (String) null, (String) null, "spark.routematch.RouteMatch");
      Object object1 = routeMatch0.getTarget();
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      RouteMatch routeMatch0 = new RouteMatch(object0, (String) null, (String) null, "spark.routematch.RouteMatch");
      String string0 = routeMatch0.getMatchUri();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HttpMethod httpMethod0 = HttpMethod.post;
      RouteMatch routeMatch0 = new RouteMatch((Object) null, "$r", ";", "2?{F,KOK/", httpMethod0);
      routeMatch0.getHttpMethod();
      assertEquals(";", routeMatch0.getRequestURI());
      assertEquals("2?{F,KOK/", routeMatch0.getAcceptType());
      assertEquals("$r", routeMatch0.getMatchUri());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HttpMethod httpMethod0 = HttpMethod.post;
      RouteMatch routeMatch0 = new RouteMatch((Object) null, "$r", ";", "2?{F,KOK/", httpMethod0);
      String string0 = routeMatch0.getRequestURI();
      assertEquals("$r", routeMatch0.getMatchUri());
      assertEquals(";", string0);
      assertEquals("2?{F,KOK/", routeMatch0.getAcceptType());
  }
}
