/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 00:50:10 GMT 2022
 */

package org.apache.commons.configuration2.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.configuration2.convert.DefaultListDelimiterHandler;
import org.apache.commons.configuration2.convert.ListDelimiterHandler;
import org.apache.commons.configuration2.convert.ValueTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultListDelimiterHandler_ESTest extends DefaultListDelimiterHandler_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('6');
      Collection<?> collection0 = defaultListDelimiterHandler0.flatten("!BK2RU>4^.{b", 0);
      assertNotNull(defaultListDelimiterHandler0.getDelimiter());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('6');
      Collection<?> collection0 = defaultListDelimiterHandler0.flatten("!BK2RU>4^.{b", 0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('m');
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("ripn8W");
      // Undeclared exception!
      try { 
        defaultListDelimiterHandler0.escapeList(linkedList0, (ValueTransformer) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.configuration2.convert.AbstractListDelimiterHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('4');
      char char0 = defaultListDelimiterHandler0.getDelimiter();
      assertNotNull(char0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('t');
      char char0 = defaultListDelimiterHandler0.getDelimiter();
      assertNotNull(char0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('@');
      defaultListDelimiterHandler0.escapeString("");
      assertNotNull(defaultListDelimiterHandler0.getDelimiter());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('S');
      // Undeclared exception!
      try { 
        defaultListDelimiterHandler0.splitString((String) null, true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.configuration2.convert.DefaultListDelimiterHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('u');
      // Undeclared exception!
      try { 
        defaultListDelimiterHandler0.escapeString((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.configuration2.convert.DefaultListDelimiterHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('t');
      Collection<?> collection0 = defaultListDelimiterHandler0.flatten("WebTes\\\tClien\\\t-Reques\\\t-Id", (-1));
      assertNotNull(defaultListDelimiterHandler0.getDelimiter());
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('t');
      Collection<?> collection0 = defaultListDelimiterHandler0.flatten("WebTes\\\tClien\\\t-Reques\\\t-Id", (-1));
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('t');
      ValueTransformer valueTransformer0 = ListDelimiterHandler.NOOP_TRANSFORMER;
      Object object0 = defaultListDelimiterHandler0.escape("WebTestClient-Request-Id", valueTransformer0);
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('\"');
      char char0 = defaultListDelimiterHandler0.getDelimiter();
      assertNotNull(char0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('@');
      Collection<String> collection0 = defaultListDelimiterHandler0.splitString("", false);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('@');
      Collection<String> collection0 = defaultListDelimiterHandler0.splitString("", false);
      assertNotNull(defaultListDelimiterHandler0.getDelimiter());
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('u');
      Collection<String> collection0 = defaultListDelimiterHandler0.splitString("WebTestClient-Request-Id", true);
      assertNotNull(defaultListDelimiterHandler0.getDelimiter());
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('u');
      Collection<String> collection0 = defaultListDelimiterHandler0.splitString("WebTestClient-Request-Id", true);
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('y');
      Collection<String> collection0 = defaultListDelimiterHandler0.split("h;qJ5y", false);
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('p');
      Collection<String> collection0 = defaultListDelimiterHandler0.splitString("org.a\\pache.commos.configuration2.onvert.efaultListDliiterHandler", false);
      assertNotNull(defaultListDelimiterHandler0.getDelimiter());
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('p');
      Collection<String> collection0 = defaultListDelimiterHandler0.splitString("org.a\\pache.commos.configuration2.onvert.efaultListDliiterHandler", false);
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('p');
      String string0 = defaultListDelimiterHandler0.escapeString("org.apache.commos.configuration2.onvert.efaultListDliiterHandler");
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultListDelimiterHandler defaultListDelimiterHandler0 = new DefaultListDelimiterHandler('u');
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      ValueTransformer valueTransformer0 = ListDelimiterHandler.NOOP_TRANSFORMER;
      defaultListDelimiterHandler0.escapeList(linkedList0, valueTransformer0);
      assertNotNull(defaultListDelimiterHandler0.getDelimiter());
}
}
