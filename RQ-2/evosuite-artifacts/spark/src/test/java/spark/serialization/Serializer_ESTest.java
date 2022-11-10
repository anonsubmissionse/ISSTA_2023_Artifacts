/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 17:18:49 GMT 2022
 */

package spark.serialization;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import spark.serialization.BytesSerializer;
import spark.serialization.DefaultSerializer;
import spark.serialization.InputStreamSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Serializer_ESTest extends Serializer_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      Object object0 = new Object();
      pipedOutputStream0.flush();
      InputStreamSerializer inputStreamSerializer0 = new InputStreamSerializer();
      Object object1 = new Object();
      inputStreamSerializer0.canProcess(object1);
      mockPrintStream0.write(4810);
      Object object2 = new Object();
      String string0 = "spark.serialization.Serializer";
      // Undeclared exception!
      inputStreamSerializer0.process(pipedOutputStream0, pipedInputStream0);
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        defaultSerializer0.process(dataOutputStream0, dataOutputStream0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      Object object0 = new Object();
      defaultSerializer0.canProcess(object0);
      Object object1 = new Object();
      bytesSerializer0.canProcess(object1);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      bytesSerializer0.processElement(mockPrintStream0, "pAoMhv/)PPm5");
      // Undeclared exception!
      try { 
        defaultSerializer0.process(pipedOutputStream0, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)1;
      Object object0 = new Object();
      try { 
        defaultSerializer0.processElement(pipedOutputStream0, object0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      Object object0 = new Object();
      bytesSerializer0.canProcess(object0);
      InputStreamSerializer inputStreamSerializer0 = new InputStreamSerializer();
      inputStreamSerializer0.setNext(bytesSerializer0);
      OutputStream outputStream0 = null;
      Object object1 = new Object();
      inputStreamSerializer0.processElement((OutputStream) null, object1);
      // Undeclared exception!
      try { 
        inputStreamSerializer0.process((OutputStream) null, bytesSerializer0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // spark.serialization.BytesSerializer cannot be cast to java.io.InputStream
         //
         verifyException("spark.serialization.InputStreamSerializer", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(92);
      defaultSerializer0.process(byteArrayOutputStream0, byteArrayOutputStream0);
      assertEquals(0, byteArrayOutputStream0.size());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InputStreamSerializer inputStreamSerializer0 = new InputStreamSerializer();
      // Undeclared exception!
      try { 
        inputStreamSerializer0.process((OutputStream) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.utils.IOUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      boolean boolean0 = bytesSerializer0.canProcess("windows");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      DefaultSerializer defaultSerializer1 = new DefaultSerializer();
      MockPrintStream mockPrintStream0 = new MockPrintStream("k E");
      Locale locale0 = Locale.JAPAN;
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) "r~A7n`Hn>vHoz=D";
      objectArray0[1] = (Object) locale0;
      objectArray0[2] = (Object) "k E";
      Object object0 = new Object();
      objectArray0[3] = object0;
      objectArray0[4] = (Object) defaultSerializer0;
      objectArray0[5] = (Object) defaultSerializer0;
      objectArray0[6] = (Object) mockPrintStream0;
      PrintStream printStream0 = mockPrintStream0.printf(locale0, "r~A7n`Hn>vHoz=D", objectArray0);
      defaultSerializer0.process(printStream0, "r~A7n`Hn>vHoz=D");
      defaultSerializer0.setNext(defaultSerializer1);
      InputStreamSerializer inputStreamSerializer0 = new InputStreamSerializer();
      inputStreamSerializer0.canProcess(defaultSerializer1);
      String string0 = "%#";
      MockFile mockFile0 = new MockFile("%#");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      // Undeclared exception!
      try { 
        defaultSerializer0.processElement(mockFileOutputStream0, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      DefaultSerializer defaultSerializer1 = new DefaultSerializer();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      defaultSerializer0.processElement(byteArrayOutputStream0, "");
      defaultSerializer1.process(byteArrayOutputStream0, byteArrayOutputStream0);
      defaultSerializer0.setNext(defaultSerializer1);
      Object object0 = new Object();
      defaultSerializer0.canProcess(object0);
      defaultSerializer1.canProcess(defaultSerializer0);
      defaultSerializer0.setNext(defaultSerializer1);
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      Object object0 = new Object();
      bytesSerializer0.processElement(dataOutputStream0, object0);
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InputStreamSerializer inputStreamSerializer0 = new InputStreamSerializer();
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      inputStreamSerializer0.setNext(bytesSerializer0);
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      bytesSerializer0.processElement(pipedOutputStream0, pipedOutputStream0);
      bytesSerializer0.setNext(defaultSerializer0);
      bytesSerializer0.processElement(mockPrintStream0, pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
}
}
