/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 04:33:47 GMT 2022
 */

package org.apache.commons.vfs2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.vfs2.FileSystemOptions;
import org.apache.commons.vfs2.impl.DefaultFileSystemConfigBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileSystemConfigBuilder_ESTest extends FileSystemConfigBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultFileSystemConfigBuilder defaultFileSystemConfigBuilder0 = DefaultFileSystemConfigBuilder.getInstance();
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      defaultFileSystemConfigBuilder0.setRootURI(fileSystemOptions0, "");
      String string0 = defaultFileSystemConfigBuilder0.getRootURI(fileSystemOptions0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultFileSystemConfigBuilder defaultFileSystemConfigBuilder0 = new DefaultFileSystemConfigBuilder();
      // Undeclared exception!
      try { 
        defaultFileSystemConfigBuilder0.setRootURI((FileSystemOptions) null, "V*osAa.L;21rH;tX+");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // fileSystemOptions
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultFileSystemConfigBuilder defaultFileSystemConfigBuilder0 = new DefaultFileSystemConfigBuilder();
      String string0 = defaultFileSystemConfigBuilder0.getRootURI((FileSystemOptions) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultFileSystemConfigBuilder defaultFileSystemConfigBuilder0 = new DefaultFileSystemConfigBuilder();
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      defaultFileSystemConfigBuilder0.setRootURI(fileSystemOptions0, "PxM#iCDZTs>");
      String string0 = defaultFileSystemConfigBuilder0.getRootURI(fileSystemOptions0);
      assertEquals("PxM#iCDZTs>", string0);
  }
}
