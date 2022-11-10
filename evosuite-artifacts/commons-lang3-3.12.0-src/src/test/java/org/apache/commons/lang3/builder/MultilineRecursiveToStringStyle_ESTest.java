/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:17:56 GMT 2022
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Arrays;
import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultilineRecursiveToStringStyle_ESTest extends MultilineRecursiveToStringStyle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer();
      assertNotNull(stringBuffer0);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      
      char[] charArray0 = new char[3];
      multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "]90^(chjW!&K<Eiim&", charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals(3, charArray0.length);
      assertEquals(25, stringBuffer0.length());
      assertEquals("{\n    \u0000,\n    \u0000,\n    \u0000\n  }", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer(0);
      assertNotNull(stringBuffer0);
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      
      boolean[] booleanArray0 = new boolean[3];
      multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "", booleanArray0);
      assertTrue(Arrays.equals(new boolean[] {false, false, false}, booleanArray0));
      assertEquals(3, booleanArray0.length);
      assertEquals(37, stringBuffer0.length());
      assertEquals("{\n    false,\n    false,\n    false\n  }", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer("q%b66y,?~&_Q4E");
      assertNotNull(stringBuffer0);
      assertEquals(14, stringBuffer0.length());
      assertEquals("q%b66y,?~&_Q4E", stringBuffer0.toString());
      
      short[] shortArray0 = new short[23];
      multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "q%b66y,?~&_Q4E", shortArray0);
      assertEquals(23, shortArray0.length);
      assertEquals("q%b66y,?~&_Q4E{\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0\n  }", stringBuffer0.toString());
      assertEquals(179, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer();
      assertNotNull(stringBuffer0);
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      
      float[] floatArray0 = new float[2];
      multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "@U}", floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(2, floatArray0.length);
      assertEquals("{\n    0.0,\n    0.0\n  }", stringBuffer0.toString());
      assertEquals(22, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer("y[qCDv>>8$SEJS5");
      assertNotNull(stringBuffer0);
      assertEquals("y[qCDv>>8$SEJS5", stringBuffer0.toString());
      assertEquals(15, stringBuffer0.length());
      
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try { 
        multilineRecursiveToStringStyle0.reflectionAppendArrayDetail(stringBuffer0, "", objectArray0[0]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "<size=");
      assertNotNull(stringBuffer0);
      assertEquals("<size=", stringBuffer0.toString());
      assertEquals(6, stringBuffer0.length());
      
      Object[] objectArray0 = new Object[8];
      objectArray0[1] = (Object) stringBuffer0;
      objectArray0[2] = (Object) stringBuffer0;
      objectArray0[4] = (Object) stringBuffer0;
      // Undeclared exception!
      multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "<size=", objectArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        multilineRecursiveToStringStyle0.appendDetail((StringBuffer) null, (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      long[] longArray0 = new long[2];
      // Undeclared exception!
      try { 
        multilineRecursiveToStringStyle0.appendDetail((StringBuffer) null, "B", longArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer("]j8K#bl");
      assertNotNull(stringBuffer0);
      assertEquals(7, stringBuffer0.length());
      assertEquals("]j8K#bl", stringBuffer0.toString());
      
      // Undeclared exception!
      try { 
        multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "", (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer(0);
      assertNotNull(stringBuffer0);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      
      // Undeclared exception!
      try { 
        multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, ",<E9", (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer(0);
      assertNotNull(stringBuffer0);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      
      // Undeclared exception!
      try { 
        multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "Lo", (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer("7nNa1C");
      assertNotNull(stringBuffer0);
      assertEquals("7nNa1C", stringBuffer0.toString());
      assertEquals(6, stringBuffer0.length());
      
      // Undeclared exception!
      try { 
        multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "7nNa1C", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer("y[qCDv>>8$SJ5");
      assertNotNull(stringBuffer0);
      assertEquals(13, stringBuffer0.length());
      assertEquals("y[qCDv>>8$SJ5", stringBuffer0.toString());
      
      Boolean boolean0 = new Boolean("");
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "mKv^ETi_1", boolean0);
      assertEquals(18, stringBuffer0.length());
      assertEquals("y[qCDv>>8$SJ5false", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      String string0 = ".xnXTQj<C>\\u)>";
      StringBuffer stringBuffer0 = new StringBuffer(string0);
      assertNotNull(stringBuffer0);
      assertEquals(".xnXTQj<C>\\u)>", stringBuffer0.toString());
      assertEquals(15, stringBuffer0.length());
      
      multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "S", "S");
      assertEquals(16, stringBuffer0.length());
      assertEquals(".xnXTQj<C>\\u)>S", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer();
      assertNotNull(stringBuffer0);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      
      multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "<", stringBuffer0);
      assertEquals(203, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer();
      assertNotNull(stringBuffer0);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      
      // Undeclared exception!
      try { 
        multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "F", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer("]j8K#bl");
      assertNotNull(stringBuffer0);
      assertEquals("]j8K#bl", stringBuffer0.toString());
      assertEquals(7, stringBuffer0.length());
      
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) multilineRecursiveToStringStyle0;
      multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, (String) null, objectArray0);
      assertEquals(1, objectArray0.length);
      assertEquals(681, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer();
      assertNotNull(stringBuffer0);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      
      byte[] byteArray0 = new byte[9];
      multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "mA", byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(9, byteArray0.length);
      assertEquals("{\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0,\n    0\n  }", stringBuffer0.toString());
      assertEquals(67, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      assertNotNull(multilineRecursiveToStringStyle0);
      
      StringBuffer stringBuffer0 = new StringBuffer();
      assertNotNull(stringBuffer0);
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      
      // Undeclared exception!
      try { 
        multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "<", (float[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer(0);
      // Undeclared exception!
      try { 
        multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "", (short[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer("!|;|(<");
      double[] doubleArray0 = new double[4];
      multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "!|;|(<", doubleArray0);
      assertEquals(46, stringBuffer0.length());
      assertEquals("!|;|(<{\n    0.0,\n    0.0,\n    0.0,\n    0.0\n  }", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer("!|;|(<");
      int[] intArray0 = new int[4];
      multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "!|;|(<", intArray0);
      assertEquals("!|;|(<{\n    0,\n    0,\n    0,\n    0\n  }", stringBuffer0.toString());
      assertEquals(38, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      boolean[] booleanArray0 = new boolean[6];
      // Undeclared exception!
      try { 
        multilineRecursiveToStringStyle0.appendDetail((StringBuffer) null, (String) null, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer("!|;|(<");
      long[] longArray0 = new long[6];
      multilineRecursiveToStringStyle0.appendDetail(stringBuffer0, "!|;|(<", longArray0);
      assertEquals("!|;|(<{\n    0,\n    0,\n    0,\n    0,\n    0,\n    0\n  }", stringBuffer0.toString());
      assertEquals(52, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer("y[qCDv>>8$SEJS5");
      // Undeclared exception!
      try { 
        multilineRecursiveToStringStyle0.reflectionAppendArrayDetail(stringBuffer0, "", multilineRecursiveToStringStyle0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument is not an array
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }
}
