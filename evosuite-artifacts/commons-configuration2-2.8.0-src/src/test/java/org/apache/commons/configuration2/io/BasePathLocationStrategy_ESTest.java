/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 01:07:27 GMT 2022
 */

package org.apache.commons.configuration2.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URL;
import org.apache.commons.configuration2.io.BasePathLocationStrategy;
import org.apache.commons.configuration2.io.FileLocationStrategy;
import org.apache.commons.configuration2.io.FileLocator;
import org.apache.commons.configuration2.io.FileSystem;
import org.apache.commons.configuration2.io.URLConnectionOptions;
import org.apache.commons.configuration2.io.VFSFileSystem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasePathLocationStrategy_ESTest extends BasePathLocationStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasePathLocationStrategy basePathLocationStrategy0 = new BasePathLocationStrategy();
      // Undeclared exception!
      try { 
        basePathLocationStrategy0.locate((FileSystem) null, (FileLocator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.configuration2.io.BasePathLocationStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasePathLocationStrategy basePathLocationStrategy0 = new BasePathLocationStrategy();
      URLConnectionOptions uRLConnectionOptions0 = URLConnectionOptions.DEFAULT;
      FileLocator fileLocator0 = mock(FileLocator.class, new ViolatedAssumptionAnswer());
      doReturn("0pK5g=XD5]ttWE7").when(fileLocator0).getBasePath();
      doReturn("Z!BE^0r!KFFvsoR()").when(fileLocator0).getEncoding();
      doReturn("/").when(fileLocator0).getFileName();
      doReturn((FileSystem) null).when(fileLocator0).getFileSystem();
      doReturn(basePathLocationStrategy0).when(fileLocator0).getLocationStrategy();
      doReturn((URL) null).when(fileLocator0).getSourceURL();
      doReturn(uRLConnectionOptions0).when(fileLocator0).getURLConnectionOptions();
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = new FileLocator.FileLocatorBuilder(fileLocator0);
      FileLocator fileLocator1 = new FileLocator(fileLocator_FileLocatorBuilder0);
      URL uRL0 = basePathLocationStrategy0.locate((FileSystem) null, fileLocator1);
      assertNull(uRL0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasePathLocationStrategy basePathLocationStrategy0 = new BasePathLocationStrategy();
      FileLocator fileLocator0 = mock(FileLocator.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(fileLocator0).getBasePath();
      doReturn((String) null).when(fileLocator0).getEncoding();
      doReturn((String) null).when(fileLocator0).getFileName();
      doReturn((FileSystem) null).when(fileLocator0).getFileSystem();
      doReturn((FileLocationStrategy) null).when(fileLocator0).getLocationStrategy();
      doReturn((URL) null).when(fileLocator0).getSourceURL();
      doReturn((URLConnectionOptions) null).when(fileLocator0).getURLConnectionOptions();
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = new FileLocator.FileLocatorBuilder(fileLocator0);
      fileLocator_FileLocatorBuilder0.fileName("[Q5dG15#Nj{>");
      FileLocator fileLocator1 = new FileLocator(fileLocator_FileLocatorBuilder0);
      URL uRL0 = basePathLocationStrategy0.locate((FileSystem) null, fileLocator1);
      assertEquals("", uRL0.getHost());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasePathLocationStrategy basePathLocationStrategy0 = new BasePathLocationStrategy();
      FileLocator fileLocator0 = mock(FileLocator.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(fileLocator0).getFileName();
      VFSFileSystem vFSFileSystem0 = new VFSFileSystem();
      URL uRL0 = basePathLocationStrategy0.locate(vFSFileSystem0, fileLocator0);
      assertNull(uRL0);
  }
}
