/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 05:35:55 GMT 2022
 */

package org.apache.commons.vfs2.example.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.VFS;
import org.apache.commons.vfs2.example.filter.NameFileFilterExample;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NameFileFilterExample_ESTest extends NameFileFilterExample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileObject[] fileObjectArray0 = new FileObject[7];
      FileSystemManager fileSystemManager0 = mock(FileSystemManager.class, new ViolatedAssumptionAnswer());
      doReturn(fileObjectArray0[1]).when(fileSystemManager0).toFileObject(any(java.io.File.class));
      VFS.setManager(fileSystemManager0);
      try { 
        NameFileFilterExample.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.vfs2.example.filter.NameFileFilterExample", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileObject[] fileObjectArray0 = new FileObject[4];
      FileObject fileObject0 = mock(FileObject.class, new ViolatedAssumptionAnswer());
      doReturn(fileObjectArray0).when(fileObject0).findFiles(any(org.apache.commons.vfs2.FileSelector.class));
      FileSystemManager fileSystemManager0 = mock(FileSystemManager.class, new ViolatedAssumptionAnswer());
      doReturn(fileObject0).when(fileSystemManager0).toFileObject(any(java.io.File.class));
      VFS.setManager(fileSystemManager0);
      NameFileFilterExample.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NameFileFilterExample nameFileFilterExample0 = new NameFileFilterExample();
  }
}
