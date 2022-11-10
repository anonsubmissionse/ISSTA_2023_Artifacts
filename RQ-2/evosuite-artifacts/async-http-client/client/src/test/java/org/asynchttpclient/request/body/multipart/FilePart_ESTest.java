/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:44:10 GMT 2022
 */

package org.asynchttpclient.request.body.multipart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.nio.charset.Charset;
import org.apache.tomcat.util.buf.Utf8Encoder;
import org.asynchttpclient.request.body.multipart.FilePart;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FilePart_ESTest extends FilePart_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      File file0 = MockFile.createTempFile("^l#Inr4jAD.pM^K", "^l#Inr4jAD.pM^K");
      Charset charset0 = Charset.defaultCharset();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/^l#Inr4jAD.pM^K0^l#Inr4jAD.pM^K");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "\"S;IfvY4L");
      FilePart filePart0 = new FilePart("[]Ig5g", file0, "?S hn|Z|z=YK4$g@}Ni", charset0, "File is not readable ", "[]Ig5g");
      File file1 = filePart0.getFile();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File file0 = MockFile.createTempFile("$:m'#W): /.g&l=yQ", "$:m'#W): /.g&l=yQ");
      FilePart filePart0 = new FilePart("$:m'#W): /.g&l=yQ", file0);
      File file1 = filePart0.getFile();
      assertFalse(file1.canRead());
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("`fX6ouLA");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      MockFile mockFile0 = new MockFile("`fX6ouLA");
      FilePart filePart0 = new FilePart("", mockFile0);
      File file0 = filePart0.getFile();
      assertFalse(file0.canRead());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      File file0 = MockFile.createTempFile("3>DN", "3>DN", (File) null);
      FilePart filePart0 = new FilePart("3>DN", file0, "3>DN");
      file0.delete();
      File file1 = filePart0.getFile();
      assertEquals(1, file1.lastModified());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("Invaid IOCase nam: ", (File) null, (String) null, charset0, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("Zj.`\"k$rq}Ah)n\"4", (File) null, "Zj.`\"k$rq}Ah)n\"4", (Charset) null, "Zj.`\"k$rq}Ah)n\"4", "Zj.`\"k$rq}Ah)n\"4");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // file
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      Charset charset0 = utf8Encoder0.charset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("", (File) null, "", charset0, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("t/H]C9F{;R|_90", (File) null, "t/H]C9F{;R|_90", (Charset) null, "h'pa$xPaNU2}lH");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // file
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Charset charset0 = Charset.defaultCharset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("", mockFile0, "", charset0, "");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // File is not a normal file /
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("", (File) null, "PAUSED {}", charset0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("File is not readable ", "File is not readable ");
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      Charset charset0 = utf8Encoder0.charset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("", mockFile0, "m9 bJ$[\"", charset0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // File is not readable /media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/async-http-client/client/File is not readable /File is not readable 
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("", mockFile0, "");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // File is not a normal file /media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/async-http-client/client
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("|PTe", (File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("q9iF_o@`F:Wf@l", mockFile0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // File is not a normal file /
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("UJ]q`OJX");
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      Charset charset0 = utf8Encoder0.charset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("UJ]q`OJX", mockFile0, "UJ]q`OJX", charset0, ".)|", ".)|", ">|qMv}d");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // File is not readable /media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/async-http-client/client/UJ]q`OJX
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.eclipse.jetty.util.PathWatcher$PathMatcherSet", "8}U6d~gR?");
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      Charset charset0 = utf8Encoder0.charset();
      FilePart filePart0 = new FilePart("org.eclipse.jetty.util.PathWatcher$PathMatcherSet", file0, (String) null, charset0, "", "", "The filter must not be null");
      assertNotNull(filePart0.getContentId());
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Charset charset0 = Charset.defaultCharset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("", mockFile0, "", charset0, "", "", "");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // File is not a normal file /media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/async-http-client/client
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("", (File) null, "", (Charset) null, "f'g#[eFj,B", "The offset cannot be negative", "f'g#[eFj,B");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // file
         //
         verifyException("org.asynchttpclient.util.Assertions", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart((String) null, (File) null, "j", charset0, (String) null, "(b$", "(b$");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      File file0 = MockFile.createTempFile("File is not a normal file ", (String) null);
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      Charset charset0 = utf8Encoder0.charset();
      FilePart filePart0 = new FilePart("File is not a normal file ", file0, "", charset0, "stopping {}");
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      File file0 = MockFile.createTempFile("p2L", (String) null);
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      Charset charset0 = utf8Encoder0.charset();
      FilePart filePart0 = new FilePart("p2L", file0, "p2L", charset0);
      assertNotNull(filePart0.getFileName());
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("HR9@;HF1!\"1!H", "HR9@;HF1!\"1!H");
      Charset charset0 = Charset.defaultCharset();
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("HR9@;HF1!\"1!H", mockFile0, "H!,", charset0, "H!,", "HR9@;HF1!\"1!H");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // File is not readable /media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/async-http-client/client/HR9@;HF1!\"1!H/HR9@;HF1!\"1!H
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FilePart filePart0 = null;
      try {
        filePart0 = new FilePart("", (File) null, "kO?MMUZ4H[L");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.request.body.multipart.FilePart", e);
      }
  }
}
