/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:53:30 GMT 2022
 */

package org.asynchttpclient.request.body.multipart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import org.asynchttpclient.request.body.multipart.ByteArrayPart;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteArrayPart_ESTest extends ByteArrayPart_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Charset charset0 = Charset.defaultCharset();
      ByteArrayPart byteArrayPart0 = new ByteArrayPart("vdjJK:!NZu", byteArray0, ":VbCml$:1Ne", charset0, "org.asynchttpclient.request.body.multipart.ByteArrayPart", "vdjJK:!NZu", "");
      assertNotNull(byteArrayPart0.getContentType());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayPart byteArrayPart0 = new ByteArrayPart("JZQaKCg0#kG(", byteArray0, "JZQaKCg0#kG(");
      byte[] byteArray1 = byteArrayPart0.getBytes();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteArrayPart byteArrayPart0 = null;
      try {
        byteArrayPart0 = new ByteArrayPart("lz", (byte[]) null, "", charset0, "", "lz");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // bytes
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteArrayPart byteArrayPart0 = null;
      try {
        byteArrayPart0 = new ByteArrayPart((String) null, (byte[]) null, "uVP<RtSJ*<C{p", charset0, "org.asynchttpclient.request.body.multipart.ByteArrayPart");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // bytes
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteArrayPart byteArrayPart0 = null;
      try {
        byteArrayPart0 = new ByteArrayPart("EnD!J~J\"BPABt9^[", (byte[]) null, "org.eclipse.jetty.util.InetAddressSet$SingletonInetRange", charset0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // bytes
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ByteArrayPart byteArrayPart0 = null;
      try {
        byteArrayPart0 = new ByteArrayPart(";U", (byte[]) null, "arDh?-3<S/nyx`m>pC");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // bytes
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Charset charset0 = Charset.defaultCharset();
      ByteArrayPart byteArrayPart0 = new ByteArrayPart("2$*L{", byteArray0, "2$*L{", charset0, "S$%jVq.(g 8z_nu");
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Charset charset0 = Charset.defaultCharset();
      ByteArrayPart byteArrayPart0 = new ByteArrayPart("#G0:I@Kx3]", byteArray0, "#G0:I@Kx3]", charset0);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ByteArrayPart byteArrayPart0 = null;
      try {
        byteArrayPart0 = new ByteArrayPart("V $c,MpC2QS!Z:M~_%v", (byte[]) null, "V $c,MpC2QS!Z:M~_%v", (Charset) null, "V $c,MpC2QS!Z:M~_%v", "V $c,MpC2QS!Z:M~_%v", (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // bytes
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayPart byteArrayPart0 = new ByteArrayPart("OE*wG", byteArray0, "OE*wG", (Charset) null, (String) null, "Include Predicate");
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayPart byteArrayPart0 = new ByteArrayPart("", byteArray0);
      byte[] byteArray1 = byteArrayPart0.getBytes();
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteArrayPart byteArrayPart0 = null;
      try {
        byteArrayPart0 = new ByteArrayPart("", (byte[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // bytes
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }
}
