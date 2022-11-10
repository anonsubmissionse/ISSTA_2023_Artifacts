/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 21:26:47 GMT 2022
 */

package org.apache.commons.jcs3.utils.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Properties;
import org.apache.commons.jcs3.utils.config.OptionConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OptionConverter_ESTest extends OptionConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Properties properties0 = new Properties();
      try { 
        OptionConverter.substVars("G${", properties0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // \"G${\" has no closing brace. Opening brace at position 1.
         //
         verifyException("org.apache.commons.jcs3.utils.config.OptionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = OptionConverter.toFileSize("5KB", (-1813L));
      assertEquals(5120L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long long0 = OptionConverter.toFileSize("6", (-3459L));
      assertEquals(6L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long long0 = OptionConverter.toFileSize("gb", (-3040L));
      assertEquals((-3040L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long long0 = OptionConverter.toFileSize("mb", (-2648L));
      assertEquals((-2648L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long long0 = OptionConverter.toFileSize("kb", (-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = OptionConverter.toInt(" DN4", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = OptionConverter.convertSpecialChars("\u0002wpZZ");
      assertEquals("\u0002wpZZ", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[8];
      String string0 = "C@;@uS`_A\\u|Me^$Mu";
      stringArray0[0] = string0;
      String string1 = OptionConverter.convertSpecialChars(stringArray0[0]);
      assertEquals("C@;@uS`_Au|Me^$Mu", string1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String[] stringArray1 = new String[8];
      String[] stringArray2 = OptionConverter.concatanateArrays(stringArray1, stringArray0);
      assertEquals(9, stringArray2.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = OptionConverter.instantiateByClassName("org.apache.commons.jcs3.utils.config.OptionConverter", (Object) "org.apache.commons.jcs3.utils.config.OptionConverter");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = OptionConverter.toInt((String) null, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = OptionConverter.toInt("h3rlIgq[Kj5I9", (-438));
      assertEquals((-438), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      long long0 = OptionConverter.toFileSize("", 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Properties properties0 = new Properties();
      String string0 = OptionConverter.substVars("", properties0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Properties properties0 = new Properties();
      String string0 = OptionConverter.instantiateByKey(properties0, "4^F,i", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = OptionConverter.instantiateByClassName("RNcF,&l~01'Oke>G'Aq", (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = OptionConverter.getSystemProperty("[>Vmk^/!c/nhV", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = OptionConverter.getSystemProperty((String) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.put("=O 4y", "");
      String string0 = OptionConverter.findAndSubst("=O 4y", properties0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = OptionConverter.convertSpecialChars("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String[] stringArray1 = OptionConverter.concatanateArrays(stringArray0, stringArray0);
      assertEquals(0, stringArray1.length);
      assertNotSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Properties properties0 = new Properties();
      // Undeclared exception!
      try { 
        OptionConverter.substVars((String) null, properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.utils.config.OptionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer integer0 = new Integer(740);
      // Undeclared exception!
      try { 
        OptionConverter.instantiateByKey((Properties) null, "/@*fuf[9+A0`j", integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.utils.config.OptionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Properties properties0 = new Properties();
      // Undeclared exception!
      try { 
        OptionConverter.findAndSubst((String) null, properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        OptionConverter.convertSpecialChars((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.utils.config.OptionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        OptionConverter.concatanateArrays((String[]) null, (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.utils.config.OptionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Properties properties0 = new Properties();
      String string0 = OptionConverter.findAndSubst("{g_@(jd.\fy3'", properties0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.put("'i", "[4'@+qdR2-N");
      String string0 = OptionConverter.findAndSubst("'i", properties0);
      assertEquals("[4'@+qdR2-N", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Properties properties0 = new Properties();
      String string0 = OptionConverter.substVars("true", properties0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Integer integer0 = new Integer((-5972));
      Object object0 = OptionConverter.instantiateByClassName((String) null, (Object) integer0);
      assertEquals((-5972), object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      long long0 = OptionConverter.toFileSize((String) null, (-5972));
      assertEquals((-5972L), long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = OptionConverter.toInt("GB", 42);
      assertEquals(42, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = OptionConverter.toBoolean("false", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = OptionConverter.toBoolean("true", true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = OptionConverter.toBoolean((String) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean boolean0 = OptionConverter.toBoolean(" -ay", true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Properties properties0 = new Properties();
      String string0 = OptionConverter.instantiateByKey(properties0, "'~,tbVH>@\"-(t++j", "'~,tbVH>@\"-(t++j");
      assertEquals("'~,tbVH>@\"-(t++j", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.put("org.apache.commons.jcs3.log.JulLogFactory", "${");
      Object object0 = OptionConverter.instantiateByKey(properties0, "org.apache.commons.jcs3.log.JulLogFactory", (Object) "${");
      assertEquals("${", object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = OptionConverter.convertSpecialChars("Lep\\e)");
      assertEquals("Lepe)", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = OptionConverter.getSystemProperty("", "]fU");
      assertEquals("]fU", string0);
  }
}
