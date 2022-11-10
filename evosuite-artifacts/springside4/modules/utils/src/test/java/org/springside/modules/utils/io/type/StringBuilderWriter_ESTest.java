/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 04:02:37 GMT 2022
 */

package org.springside.modules.utils.io.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springside.modules.utils.io.type.StringBuilderWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringBuilderWriter_ESTest extends StringBuilderWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(1);
      StringBuilderWriter stringBuilderWriter0 = new StringBuilderWriter(stringBuilder0);
      stringBuilderWriter0.append('v');
      stringBuilderWriter0.append((CharSequence) stringBuilder0, 1, 1);
      assertEquals("v", stringBuilderWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringBuilderWriter stringBuilderWriter0 = new StringBuilderWriter();
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        stringBuilderWriter0.write(charArray0, (-3018), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringBuilderWriter stringBuilderWriter0 = null;
      try {
        stringBuilderWriter0 = new StringBuilderWriter((-711));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringBuilderWriter stringBuilderWriter0 = new StringBuilderWriter(35);
      stringBuilderWriter0.write(35);
      assertEquals("#", stringBuilderWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringBuilderWriter stringBuilderWriter0 = new StringBuilderWriter(945);
      stringBuilderWriter0.write((char[]) null, 945, 945);
      assertEquals("", stringBuilderWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringBuilderWriter stringBuilderWriter0 = new StringBuilderWriter();
      stringBuilderWriter0.write("");
      assertEquals("", stringBuilderWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringBuilderWriter stringBuilderWriter0 = new StringBuilderWriter();
      stringBuilderWriter0.write((String) null);
      assertEquals("", stringBuilderWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringBuilderWriter stringBuilderWriter0 = new StringBuilderWriter((StringBuilder) null);
      assertEquals("", stringBuilderWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringBuilderWriter stringBuilderWriter0 = new StringBuilderWriter(1);
      stringBuilderWriter0.close();
      assertEquals("", stringBuilderWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringBuilderWriter stringBuilderWriter0 = new StringBuilderWriter(1);
      stringBuilderWriter0.append('m');
      stringBuilderWriter0.toString();
      assertEquals("m", stringBuilderWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringBuilderWriter stringBuilderWriter0 = new StringBuilderWriter(1);
      // Undeclared exception!
      try { 
        stringBuilderWriter0.append((CharSequence) "m", (-1), (-3433));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // start -1, end -3433, s.length() 1
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringBuilderWriter stringBuilderWriter0 = new StringBuilderWriter(1);
      String string0 = stringBuilderWriter0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(1);
      StringBuilderWriter stringBuilderWriter0 = new StringBuilderWriter(stringBuilder0);
      StringBuilder stringBuilder1 = stringBuilderWriter0.getBuilder();
      assertSame(stringBuilder1, stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringBuilderWriter stringBuilderWriter0 = new StringBuilderWriter();
      stringBuilderWriter0.flush();
      assertEquals("", stringBuilderWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringBuilderWriter stringBuilderWriter0 = new StringBuilderWriter(1);
      Writer writer0 = stringBuilderWriter0.append((CharSequence) "m");
      assertSame(stringBuilderWriter0, writer0);
  }
}
