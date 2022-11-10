/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:42:45 GMT 2022
 */

package org.asynchttpclient.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.asynchttpclient.util.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("^(");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)57;
      StringUtils.appendBase16(stringBuilder0, byteArray0);
      assertEquals("^(39", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-106);
      // Undeclared exception!
      try { 
        StringUtils.appendBase16((StringBuilder) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.util.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-19);
      String string0 = StringUtils.toHexString(byteArray0);
      assertEquals("ed00", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = StringUtils.charSequence2ByteBuffer(stringBuilder0, charset0);
      assertEquals(0, byteBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = StringUtils.toHexString(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      byte[] byteArray0 = StringUtils.charSequence2Bytes("ed00", charset0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Charset charset0 = Charset.defaultCharset();
      byte[] byteArray0 = StringUtils.charSequence2Bytes(stringBuffer0, charset0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(4613);
      byte[] byteArray0 = StringUtils.byteBuffer2ByteArray(byteBuffer0);
      assertEquals(4613, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      byte[] byteArray0 = StringUtils.byteBuffer2ByteArray(byteBuffer0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtils.toHexString((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.util.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        StringUtils.charSequence2ByteBuffer((CharSequence) null, charset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte) (-17);
      StringUtils.appendBase16(stringBuilder0, byteArray0);
      assertEquals("0000ef", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtils.byteBuffer2ByteArray((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.util.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        StringUtils.charSequence2Bytes((CharSequence) null, charset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }
}
