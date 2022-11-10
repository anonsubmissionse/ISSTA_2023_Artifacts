/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 05:32:02 GMT 2022
 */

package org.apache.commons.vfs2.example.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.VFS;
import org.apache.commons.vfs2.example.filter.FileFileFilterExample;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileFileFilterExample_ESTest extends FileFileFilterExample_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileSystemManager fileSystemManager0 = VFS.reset();
      VFS.close();
      VFS.setManager(fileSystemManager0);
      String[] stringArray0 = new String[1];
      try { 
        FileFileFilterExample.main(stringArray0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Could not find a file provider which can handle local files.
         //
         verifyException("org.apache.commons.vfs2.FileSystemException", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[0];
      FileSystemManager fileSystemManager0 = mock(FileSystemManager.class, new ViolatedAssumptionAnswer());
      doReturn((FileObject) null).when(fileSystemManager0).toFileObject(any(java.io.File.class));
      VFS.setManager(fileSystemManager0);
      try { 
        FileFileFilterExample.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.vfs2.example.filter.FileFileFilterExample", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileObject[] fileObjectArray0 = new FileObject[2];
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn(fileObjectArray0).when(fileObject0).findFiles(any(org.apache.commons.vfs2.FileSelector.class));
      FileSystemManager fileSystemManager0 = mock(FileSystemManager.class, new ViolatedAssumptionAnswer());
      doReturn(fileObject0).when(fileSystemManager0).toFileObject(any(java.io.File.class));
      VFS.setManager(fileSystemManager0);
      String[] stringArray0 = new String[33];
      FileFileFilterExample.main(stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileFileFilterExample fileFileFilterExample0 = new FileFileFilterExample();
  }
}
