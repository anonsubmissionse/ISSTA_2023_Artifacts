/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 17:13:58 GMT 2022
 */

package spark.serialization;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import spark.serialization.BytesSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BytesSerializer_ESTest extends BytesSerializer_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      byte[] byteArray0 = new byte[20];
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      // Undeclared exception!
      try { 
        bytesSerializer0.process(byteArrayOutputStream0, byteBuffer1);
        fail("Expecting exception: ReadOnlyBufferException");
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      MockPrintStream mockPrintStream0 = new MockPrintStream("|>)+'?toN8YVK");
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1);
      // Undeclared exception!
      try { 
        bytesSerializer0.process(mockPrintStream0, byteBuffer0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[3];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, (int) (byte)0, 0);
      try { 
        bytesSerializer0.process(filterOutputStream0, byteBuffer0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      // Undeclared exception!
      try { 
        bytesSerializer0.process(byteArrayOutputStream0, byteArrayOutputStream0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      byte[] byteArray0 = new byte[1];
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      bytesSerializer0.process(byteArrayOutputStream0, byteBuffer0);
      assertEquals(1, byteArrayOutputStream0.size());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      byte[] byteArray0 = new byte[1];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      boolean boolean0 = bytesSerializer0.canProcess(byteBuffer0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      Object object0 = new Object();
      boolean boolean0 = bytesSerializer0.canProcess(object0);
      assertTrue(boolean0);
}
}
