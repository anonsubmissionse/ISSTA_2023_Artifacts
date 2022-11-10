/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 03:38:23 GMT 2022
 */

package org.springside.modules.utils.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.utils.text.WildcardMatcher;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WildcardMatcher_ESTest extends WildcardMatcher_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = WildcardMatcher.matchPath("1-uPQlhRuCJHs+oU:", "**");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "**";
      // Undeclared exception!
      try { 
        WildcardMatcher.matchTokens(stringArray0, stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "0CFhm~}";
      int int0 = WildcardMatcher.matchOne("0CFhm~}", stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      boolean boolean0 = WildcardMatcher.match("/", "/");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "1-uPQlhRuCJHs+oU:";
      int int0 = WildcardMatcher.matchPathOne("1-uPQlhRuCJHs+oU:", stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      boolean boolean0 = WildcardMatcher.matchPath("9-rpt6>vL}.k\"nsCOU", "OS/2");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "/";
      stringArray0[1] = "(OYC{u";
      int int0 = WildcardMatcher.matchOne("(OYC{u", stringArray0);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      boolean boolean0 = WildcardMatcher.match("**", "**");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Undeclared exception!
      try { 
        WildcardMatcher.matchPath((String) null, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.text.WildcardMatcher", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      // Undeclared exception!
      try { 
        WildcardMatcher.match((CharSequence) null, (CharSequence) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.text.WildcardMatcher", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "1-uPQlhRuAlCJHs+oU:";
      stringArray0[1] = "1-uPQlhRuAlCJHs+oU:";
      String[] stringArray1 = new String[8];
      stringArray1[0] = "**";
      stringArray1[1] = "1-uPQlhRuAlCJHs+oU:";
      stringArray1[2] = "1-uPQlhRuAlCJHs+oU:";
      stringArray1[3] = "**";
      stringArray1[4] = "1-uPQlhRuAlCJHs+oU:";
      stringArray1[7] = "**";
      boolean boolean0 = WildcardMatcher.matchTokens(stringArray0, stringArray1);
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "T-uPQlhRuCJHsoxi:";
      String[] stringArray1 = new String[6];
      stringArray1[0] = "T-uPQlhRuCJHsoxi:";
      stringArray1[1] = "**";
      stringArray1[2] = "**";
      stringArray1[3] = "T-uPQlhRuCJHsoxi:";
      stringArray1[4] = "T-uPQlhRuCJHsoxi:";
      stringArray1[5] = "**";
      boolean boolean0 = WildcardMatcher.matchTokens(stringArray0, stringArray1);
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "T-uPQlhRuCJHsoxi:";
      stringArray0[1] = "**";
      stringArray0[2] = "**";
      stringArray0[3] = "T-uPQlhRuCJHsoxi:";
      stringArray0[4] = "T-uPQlhRuCJHsoxi:";
      stringArray0[5] = "**";
      boolean boolean0 = WildcardMatcher.matchTokens(stringArray0, stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "1-uPQlhRuCJHs+oU:";
      stringArray0[1] = "1-uPQlhRuCJHs+oU:";
      String[] stringArray1 = new String[7];
      stringArray1[0] = "1-uPQlhRuCJHs+oU:";
      stringArray1[1] = "**";
      stringArray1[2] = "1-uPQlhRuCJHs+oU:";
      stringArray1[6] = "1-uPQlhRuCJHs+oU:";
      boolean boolean0 = WildcardMatcher.matchTokens(stringArray0, stringArray1);
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "1-uPQlhRuCJHs+oU:";
      stringArray0[1] = "1-uPQlhRuCJHs+oU:";
      String[] stringArray1 = new String[3];
      stringArray1[0] = "1-uPQlhRuCJHs+oU:";
      stringArray1[1] = "**";
      stringArray1[2] = "1-uPQlhRuCJHs+oU:";
      boolean boolean0 = WildcardMatcher.matchTokens(stringArray0, stringArray1);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "java.specification.vendor";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        WildcardMatcher.matchPathOne("4MY#vQwVC", stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.text.WildcardMatcher", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "1-uPQlhRuCJHs+oU:";
      stringArray0[1] = "1-uPQlhRuCJHs+oU:";
      String[] stringArray1 = new String[7];
      stringArray1[0] = "1-uPQlhRuCJHs+oU:";
      stringArray1[2] = "**";
      stringArray1[1] = "1-uPQlhRuCJHs+oU:";
      // Undeclared exception!
      try { 
        WildcardMatcher.matchTokens(stringArray0, stringArray1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "*(/&@a&@fm:Ol";
      stringArray0[1] = "/";
      int int0 = WildcardMatcher.matchPathOne("/", stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "*(/&@a&@fm:Ol";
      stringArray0[1] = "/";
      stringArray0[2] = "/";
      int int0 = WildcardMatcher.matchOne("", stringArray0);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "??hm4,CnzgsKF'";
      int int0 = WildcardMatcher.matchOne("??hm4,CnzgsKF'", stringArray0);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "*(/&@a&@fm:Ol";
      // Undeclared exception!
      try { 
        WildcardMatcher.matchOne("", stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.modules.utils.text.WildcardMatcher", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = WildcardMatcher.matchPath("*", "*");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      WildcardMatcher wildcardMatcher0 = new WildcardMatcher();
  }
}
