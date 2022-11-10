/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:15:06 GMT 2022
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.text.StrMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StrMatcher_ESTest extends StrMatcher_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      char[] charArray0 = new char[8];
      charArray0[0] = ' ';
      int int0 = strMatcher_TrimMatcher0.isMatch(charArray0, 0, 317, 317);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("khV`OH.%JOK");
      char[] charArray0 = new char[5];
      charArray0[1] = 'm';
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 1, 0, (int) 'm');
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("khV`OH.%JOK");
      char[] charArray0 = new char[5];
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 1, 0, (int) 'm');
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("");
      char[] charArray0 = new char[1];
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 0, 0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      char[] charArray0 = new char[2];
      charArray0[0] = 'k';
      int int0 = strMatcher0.isMatch(charArray0, 0, (int) 'k', 0);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      int int0 = strMatcher_CharSetMatcher0.isMatch(charArray0, 0, 0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      int int0 = strMatcher0.isMatch((char[]) null, (-3656), (-3656), 0);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      char[] charArray0 = new char[0];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      // Undeclared exception!
      try { 
        strMatcher_CharSetMatcher0.isMatch(charArray0, (-3117), 0, (-3117));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3117
         //
         verifyException("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      char[] charArray0 = new char[4];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      int int0 = strMatcher0.isMatch(charArray0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('*');
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        strMatcher_CharMatcher0.isMatch(charArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.lang3.text.StrMatcher$CharMatcher", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      int int0 = strMatcher_TrimMatcher0.isMatch(charArray0, 0, 0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("87b5!?");
      int int0 = strMatcher0.isMatch(charArray0, 0, (int) 'k', (int) 'k');
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("");
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, (int) '+', 1, 44);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher(':');
      char[] charArray0 = new char[1];
      charArray0[0] = ':';
      int int0 = strMatcher_CharMatcher0.isMatch(charArray0, 0, (int) ':', 0);
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      int int0 = strMatcher0.isMatch(charArray0, (int) '\u0000');
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("");
      assertNotNull(strMatcher0);
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("n");
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("");
      assertNotNull(strMatcher0);
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[0];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[5];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      int int0 = strMatcher0.isMatch(charArray0, 0, 0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      char[] charArray0 = new char[2];
      int int0 = strMatcher0.isMatch(charArray0, 0, (int) 'k', 0);
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.spaceMatcher();
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        strMatcher0.isMatch(charArray0, 2536, 1064, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2536
         //
         verifyException("org.apache.commons.lang3.text.StrMatcher$CharMatcher", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.noneMatcher();
      assertNotNull(strMatcher0);
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.singleQuoteMatcher();
      assertNotNull(strMatcher0);
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      // Undeclared exception!
      try { 
        strMatcher0.isMatch((char[]) null, 9, 0, 1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", e);
      }
  }
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      assertNotNull(strMatcher0);
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.tabMatcher();
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.commaMatcher();
      assertNotNull(strMatcher0);
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      assertNotNull(strMatcher0);
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("org.apachecommons.lang3.ArraySorter");
      String string0 = ((StrMatcher.StringMatcher) strMatcher0).toString();
      ;
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("izyR");
      int int0 = strMatcher0.isMatch((char[]) null, 0, 0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      int int0 = strMatcher0.isMatch((char[]) null, 0, 0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
  }
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("DsW*5\"");
      // Undeclared exception!
      try { 
        strMatcher0.isMatch((char[]) null, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrMatcher", e);
      }
  }
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      char[] charArray0 = new char[2];
      charArray0[0] = 'k';
      int int0 = strMatcher_TrimMatcher0.isMatch(charArray0, 0, (int) 'k', (int) 'k');
      ;
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charMatcher('k');
      assertNotNull(strMatcher0);
}
}
