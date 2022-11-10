/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:22:34 GMT 2022
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.text.translate.EntityArrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EntityArrays_ESTest extends EntityArrays_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EntityArrays entityArrays0 = new EntityArrays();
      String[][] stringArray0 = EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
      EntityArrays.APOS_UNESCAPE();
      EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
      EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
      EntityArrays.BASIC_UNESCAPE();
      EntityArrays.ISO8859_1_UNESCAPE();
      EntityArrays.invert(stringArray0);
      EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
      EntityArrays.APOS_ESCAPE();
      EntityArrays.ISO8859_1_UNESCAPE();
      EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
      EntityArrays.APOS_UNESCAPE();
      EntityArrays.APOS_ESCAPE();
      EntityArrays.ISO8859_1_UNESCAPE();
      EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
      EntityArrays.HTML40_EXTENDED_UNESCAPE();
      EntityArrays.BASIC_ESCAPE();
      EntityArrays.HTML40_EXTENDED_UNESCAPE();
      EntityArrays.ISO8859_1_UNESCAPE();
      EntityArrays.ISO8859_1_UNESCAPE();
      EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
      EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
      EntityArrays.BASIC_UNESCAPE();
      EntityArrays.HTML40_EXTENDED_ESCAPE();
      EntityArrays.BASIC_UNESCAPE();
      EntityArrays.HTML40_EXTENDED_UNESCAPE();
      EntityArrays.APOS_ESCAPE();
      EntityArrays.ISO8859_1_UNESCAPE();
      EntityArrays.BASIC_ESCAPE();
      EntityArrays.HTML40_EXTENDED_UNESCAPE();
      EntityArrays.APOS_ESCAPE();
      // Undeclared exception!
      try { 
        EntityArrays.invert((String[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.EntityArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EntityArrays.ISO8859_1_UNESCAPE();
      EntityArrays.APOS_ESCAPE();
      EntityArrays entityArrays0 = new EntityArrays();
      String[][] stringArray0 = EntityArrays.HTML40_EXTENDED_ESCAPE();
      assertEquals(152, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.ISO8859_1_ESCAPE();
      assertEquals(96, stringArray0.length);
      
      EntityArrays.ISO8859_1_UNESCAPE();
      EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
      EntityArrays.APOS_ESCAPE();
      String[][] stringArray1 = EntityArrays.BASIC_ESCAPE();
      assertEquals(4, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.APOS_ESCAPE();
      assertEquals(1, stringArray0.length);
      
      String[][] stringArray1 = EntityArrays.BASIC_ESCAPE();
      EntityArrays.APOS_UNESCAPE();
      EntityArrays.HTML40_EXTENDED_UNESCAPE();
      EntityArrays.HTML40_EXTENDED_UNESCAPE();
      EntityArrays entityArrays0 = new EntityArrays();
      String[][] stringArray2 = EntityArrays.BASIC_UNESCAPE();
      assertFalse(stringArray2.equals((Object)stringArray1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.HTML40_EXTENDED_ESCAPE();
      EntityArrays.BASIC_UNESCAPE();
      String[][] stringArray1 = EntityArrays.HTML40_EXTENDED_ESCAPE();
      String[][] stringArray2 = EntityArrays.invert(stringArray1);
      EntityArrays.BASIC_UNESCAPE();
      String[][] stringArray3 = EntityArrays.ISO8859_1_UNESCAPE();
      EntityArrays.invert(stringArray0);
      EntityArrays.invert(stringArray0);
      EntityArrays.ISO8859_1_ESCAPE();
      EntityArrays.invert(stringArray2);
      EntityArrays.ISO8859_1_ESCAPE();
      EntityArrays.invert(stringArray3);
      EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
      String[][] stringArray4 = EntityArrays.ISO8859_1_UNESCAPE();
      EntityArrays entityArrays0 = new EntityArrays();
      EntityArrays.APOS_ESCAPE();
      EntityArrays.ISO8859_1_ESCAPE();
      String[][] stringArray5 = EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
      EntityArrays.invert(stringArray5);
      EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
      EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
      EntityArrays.HTML40_EXTENDED_ESCAPE();
      EntityArrays.HTML40_EXTENDED_UNESCAPE();
      EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
      EntityArrays.invert(stringArray4);
      EntityArrays.invert(stringArray5);
      EntityArrays.ISO8859_1_UNESCAPE();
      EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
      EntityArrays.BASIC_ESCAPE();
      EntityArrays.ISO8859_1_UNESCAPE();
      String[][] stringArray6 = new String[7][1];
      String[] stringArray7 = new String[5];
      stringArray7[0] = "/zMp0}caLg#I";
      stringArray7[1] = "3kuTpjQWpm$`b?2";
      stringArray7[2] = "";
      stringArray7[3] = "!H\"(f";
      stringArray7[4] = "";
      stringArray6[0] = stringArray7;
      String[] stringArray8 = new String[1];
      stringArray8[0] = "!H\"(f";
      stringArray6[1] = stringArray8;
      String[] stringArray9 = new String[2];
      stringArray9[0] = "";
      stringArray9[1] = "JL:UO3WY#xIQO:N";
      stringArray6[2] = stringArray9;
      String[] stringArray10 = new String[4];
      stringArray10[0] = "3kuTpjQWpm$`b?2";
      stringArray10[1] = "!H\"(f";
      stringArray10[2] = "";
      stringArray10[3] = "";
      stringArray6[3] = stringArray10;
      String[] stringArray11 = new String[9];
      stringArray11[0] = "3kuTpjQWpm$`b?2";
      stringArray11[1] = "JL:UO3WY#xIQO:N";
      stringArray11[2] = "";
      stringArray11[3] = "/zMp0}caLg#I";
      stringArray11[4] = "/zMp0}caLg#I";
      stringArray11[5] = "3kuTpjQWpm$`b?2";
      stringArray11[6] = "3kuTpjQWpm$`b?2";
      stringArray11[7] = "3kuTpjQWpm$`b?2";
      stringArray11[8] = "";
      stringArray6[4] = stringArray11;
      String[] stringArray12 = new String[0];
      stringArray6[5] = stringArray12;
      String[] stringArray13 = new String[5];
      stringArray13[0] = "";
      stringArray13[1] = "";
      stringArray13[2] = "3kuTpjQWpm$`b?2";
      stringArray13[3] = "";
      stringArray13[4] = "!H\"(f";
      stringArray6[6] = stringArray13;
      // Undeclared exception!
      try { 
        EntityArrays.invert(stringArray6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.lang3.text.translate.EntityArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.APOS_UNESCAPE();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EntityArrays.HTML40_EXTENDED_ESCAPE();
      String[][] stringArray0 = EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
      String[][] stringArray1 = EntityArrays.invert(stringArray0);
      assertNotSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[][] stringArray0 = new String[0][0];
      String[][] stringArray1 = EntityArrays.invert(stringArray0);
      assertNotSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
      String[][] stringArray1 = EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EntityArrays entityArrays0 = new EntityArrays();
      String[][] stringArray0 = EntityArrays.HTML40_EXTENDED_UNESCAPE();
      assertEquals(152, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EntityArrays.BASIC_UNESCAPE();
      String[][] stringArray0 = EntityArrays.HTML40_EXTENDED_ESCAPE();
      String[][] stringArray1 = EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
      EntityArrays.BASIC_ESCAPE();
      String[][] stringArray0 = EntityArrays.BASIC_ESCAPE();
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EntityArrays.ISO8859_1_UNESCAPE();
      String[][] stringArray0 = EntityArrays.HTML40_EXTENDED_ESCAPE();
      assertEquals(152, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EntityArrays.APOS_ESCAPE();
      EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
      EntityArrays.APOS_UNESCAPE();
      String[][] stringArray0 = EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
      EntityArrays.invert(stringArray0);
      EntityArrays.ISO8859_1_ESCAPE();
      EntityArrays.HTML40_EXTENDED_ESCAPE();
      EntityArrays.BASIC_ESCAPE();
      EntityArrays.HTML40_EXTENDED_UNESCAPE();
      EntityArrays entityArrays0 = new EntityArrays();
      String[][] stringArray1 = EntityArrays.BASIC_UNESCAPE();
      String[][] stringArray2 = EntityArrays.ISO8859_1_UNESCAPE();
      assertFalse(stringArray2.equals((Object)stringArray1));
  }
}
