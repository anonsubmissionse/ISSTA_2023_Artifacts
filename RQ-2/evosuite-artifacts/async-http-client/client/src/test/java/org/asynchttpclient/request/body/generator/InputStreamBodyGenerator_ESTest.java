/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 15:52:43 GMT 2022
 */

package org.asynchttpclient.request.body.generator;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FileDescriptor;
import java.io.InputStream;
import org.asynchttpclient.request.body.Body;
import org.asynchttpclient.request.body.generator.InputStreamBodyGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InputStreamBodyGenerator_ESTest extends InputStreamBodyGenerator_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      InputStreamBodyGenerator inputStreamBodyGenerator0 = new InputStreamBodyGenerator(mockFileInputStream0, 9223372036854775807L);
      inputStreamBodyGenerator0.getInputStream();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InputStreamBodyGenerator inputStreamBodyGenerator0 = new InputStreamBodyGenerator((InputStream) null, 0L);
      long long0 = inputStreamBodyGenerator0.getContentLength();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      InputStreamBodyGenerator inputStreamBodyGenerator0 = new InputStreamBodyGenerator(mockFileInputStream0, 9223372036854775807L);
      long long0 = inputStreamBodyGenerator0.getContentLength();
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InputStreamBodyGenerator inputStreamBodyGenerator0 = new InputStreamBodyGenerator((InputStream) null);
      Body body0 = inputStreamBodyGenerator0.createBody();
      assertEquals(1, body0.getContentLength());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InputStreamBodyGenerator inputStreamBodyGenerator0 = new InputStreamBodyGenerator((InputStream) null);
      inputStreamBodyGenerator0.getInputStream();
      assertEquals(0, inputStreamBodyGenerator0.getContentLength());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      InputStreamBodyGenerator inputStreamBodyGenerator0 = new InputStreamBodyGenerator((InputStream) null);
      long long0 = inputStreamBodyGenerator0.getContentLength();
      assertEquals(1, long0);
}
}
