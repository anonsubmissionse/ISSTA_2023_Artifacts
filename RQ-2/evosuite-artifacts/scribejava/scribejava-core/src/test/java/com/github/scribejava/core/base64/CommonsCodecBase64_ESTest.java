/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 03:10:21 GMT 2022
 */

package com.github.scribejava.core.base64;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.scribejava.core.base64.CommonsCodecBase64;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CommonsCodecBase64_ESTest extends CommonsCodecBase64_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CommonsCodecBase64 commonsCodecBase64_0 = new CommonsCodecBase64();
      String string0 = commonsCodecBase64_0.internalEncodeUrlWithoutPadding((byte[]) null);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CommonsCodecBase64 commonsCodecBase64_0 = new CommonsCodecBase64();
      byte[] byteArray0 = new byte[0];
      String string0 = commonsCodecBase64_0.internalEncodeUrlWithoutPadding(byteArray0);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CommonsCodecBase64 commonsCodecBase64_0 = new CommonsCodecBase64();
      String string0 = commonsCodecBase64_0.internalEncode((byte[]) null);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CommonsCodecBase64 commonsCodecBase64_0 = new CommonsCodecBase64();
      byte[] byteArray0 = new byte[0];
      String string0 = commonsCodecBase64_0.internalEncode(byteArray0);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CommonsCodecBase64 commonsCodecBase64_0 = new CommonsCodecBase64();
      byte[] byteArray0 = new byte[38];
      String string0 = commonsCodecBase64_0.internalEncode(byteArray0);
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      boolean boolean0 = CommonsCodecBase64.isAvailable();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CommonsCodecBase64 commonsCodecBase64_0 = new CommonsCodecBase64();
      byte[] byteArray0 = new byte[38];
      String string0 = commonsCodecBase64_0.internalEncodeUrlWithoutPadding(byteArray0);
      ;
}
}
