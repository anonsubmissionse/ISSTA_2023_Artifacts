/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:47:19 GMT 2022
 */

package org.asynchttpclient.request.body.multipart.part;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.util.List;
import org.apache.tomcat.util.buf.Utf8Encoder;
import org.asynchttpclient.request.body.multipart.ByteArrayPart;
import org.asynchttpclient.request.body.multipart.InputStreamPart;
import org.asynchttpclient.request.body.multipart.part.ByteArrayMultipartPart;
import org.asynchttpclient.request.body.multipart.part.InputStreamMultipartPart;
import org.asynchttpclient.request.body.multipart.part.MultipartState;
import org.asynchttpclient.request.body.multipart.part.PartVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileLikeMultipartPart_ESTest extends FileLikeMultipartPart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayPart byteArrayPart0 = new ByteArrayPart("", byteArray0, "", (Charset) null, "org.asynchttpclient.request.body.multipart.part.FileLikeMultipartPart", "0\tu", "0\tu");
      ByteArrayMultipartPart byteArrayMultipartPart0 = new ByteArrayMultipartPart(byteArrayPart0, byteArray0);
      PartVisitor.CounterPartVisitor partVisitor_CounterPartVisitor0 = new PartVisitor.CounterPartVisitor();
      byteArrayMultipartPart0.visitDispositionHeader(partVisitor_CounterPartVisitor0);
      assertEquals(123, partVisitor_CounterPartVisitor0.getCount());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      Charset charset0 = utf8Encoder0.charset();
      ByteArrayPart byteArrayPart0 = new ByteArrayPart("; filename=", byteArray0, "", charset0, "org.asynchttpclient.request.body.multipart.part.FileLikeMultipartPart");
      ByteArrayMultipartPart byteArrayMultipartPart0 = new ByteArrayMultipartPart(byteArrayPart0, byteArray0);
      // Undeclared exception!
      try { 
        byteArrayMultipartPart0.visitDispositionHeader((PartVisitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.request.body.multipart.part.MultipartPart", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      InputStreamPart inputStreamPart0 = mock(InputStreamPart.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(inputStreamPart0).getFileName();
      doReturn((String) null).when(inputStreamPart0).getContentId();
      doReturn((String) null).when(inputStreamPart0).getContentType();
      doReturn((List) null).when(inputStreamPart0).getCustomHeaders();
      doReturn((String) null).when(inputStreamPart0).getDispositionType();
      doReturn((String) null).when(inputStreamPart0).getName();
      doReturn((String) null).when(inputStreamPart0).getTransferEncoding();
      InputStreamMultipartPart inputStreamMultipartPart0 = new InputStreamMultipartPart(inputStreamPart0, byteArray0);
      assertEquals(MultipartState.PRE_CONTENT, inputStreamMultipartPart0.getState());
  }
}
