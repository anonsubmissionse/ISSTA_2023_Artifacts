/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 04:12:46 GMT 2022
 */

package org.apache.commons.vfs2.cache;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.apache.commons.vfs2.FileName;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemOptions;
import org.apache.commons.vfs2.FileType;
import org.apache.commons.vfs2.cache.SoftRefFilesCache;
import org.apache.commons.vfs2.impl.VirtualFileSystem;
import org.apache.commons.vfs2.provider.AbstractFileName;
import org.apache.commons.vfs2.provider.GenericURLFileName;
import org.apache.commons.vfs2.provider.LayeredFileName;
import org.apache.commons.vfs2.provider.ftp.FtpClient;
import org.apache.commons.vfs2.provider.ftps.FtpsFileSystem;
import org.apache.commons.vfs2.provider.gzip.GzipFileSystem;
import org.apache.commons.vfs2.provider.local.LocalFileSystem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SoftRefFilesCache_ESTest extends SoftRefFilesCache_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SoftRefFilesCache softRefFilesCache0 = new SoftRefFilesCache();
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      LocalFileSystem localFileSystem0 = new LocalFileSystem((FileName) null, "w2Mn6I%}q.Zg9cA", fileSystemOptions0);
      FileType fileType0 = FileType.IMAGINARY;
      LayeredFileName layeredFileName0 = new LayeredFileName("", (FileName) null, "7el0$vc_N[2Tj{a", fileType0);
      // Undeclared exception!
      try { 
        softRefFilesCache0.removeFile(localFileSystem0, layeredFileName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.vfs2.provider.LayeredFileName", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SoftRefFilesCache softRefFilesCache0 = new SoftRefFilesCache();
      GzipFileSystem gzipFileSystem0 = mock(GzipFileSystem.class, new ViolatedAssumptionAnswer());
      FileType fileType0 = FileType.IMAGINARY;
      LayeredFileName layeredFileName0 = new LayeredFileName("&7", (FileName) null, "&7", fileType0);
      // Undeclared exception!
      try { 
        softRefFilesCache0.getFile(gzipFileSystem0, layeredFileName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.vfs2.provider.LayeredFileName", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SoftRefFilesCache softRefFilesCache0 = new SoftRefFilesCache();
      String string0 = softRefFilesCache0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SoftRefFilesCache softRefFilesCache0 = new SoftRefFilesCache();
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      FileType fileType0 = FileType.FOLDER;
      GenericURLFileName genericURLFileName0 = new GenericURLFileName("b", "b", 77, 77, "b", "b", "b", fileType0, "b");
      FtpClient ftpClient0 = mock(FtpClient.class, new ViolatedAssumptionAnswer());
      FtpsFileSystem ftpsFileSystem0 = new FtpsFileSystem(genericURLFileName0, ftpClient0, fileSystemOptions0);
      softRefFilesCache0.removeFile(ftpsFileSystem0, genericURLFileName0);
      assertEquals(FileType.FOLDER, genericURLFileName0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SoftRefFilesCache softRefFilesCache0 = new SoftRefFilesCache();
      // Undeclared exception!
      try { 
        softRefFilesCache0.putFileIfAbsent((FileObject) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.vfs2.cache.SoftRefFilesCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SoftRefFilesCache softRefFilesCache0 = new SoftRefFilesCache();
      // Undeclared exception!
      try { 
        softRefFilesCache0.putFile((FileObject) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.vfs2.cache.SoftRefFilesCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SoftRefFilesCache softRefFilesCache0 = new SoftRefFilesCache();
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      VirtualFileSystem virtualFileSystem0 = new VirtualFileSystem((AbstractFileName) null, fileSystemOptions0);
      softRefFilesCache0.getFile(virtualFileSystem0, (FileName) null);
      String string0 = softRefFilesCache0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SoftRefFilesCache softRefFilesCache0 = new SoftRefFilesCache();
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      FileType fileType0 = FileType.FOLDER;
      GenericURLFileName genericURLFileName0 = new GenericURLFileName("b", "b", 77, 77, "b", "b", "b", fileType0, "b");
      FtpClient ftpClient0 = mock(FtpClient.class, new ViolatedAssumptionAnswer());
      FtpsFileSystem ftpsFileSystem0 = new FtpsFileSystem(genericURLFileName0, ftpClient0, fileSystemOptions0);
      VirtualFileSystem virtualFileSystem0 = new VirtualFileSystem((AbstractFileName) null, fileSystemOptions0);
      softRefFilesCache0.getOrCreateFilesystemCache(ftpsFileSystem0);
      softRefFilesCache0.clear(virtualFileSystem0);
      assertFalse(virtualFileSystem0.isOpen());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SoftRefFilesCache softRefFilesCache0 = new SoftRefFilesCache();
      softRefFilesCache0.close();
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SoftRefFilesCache softRefFilesCache0 = new SoftRefFilesCache();
      Reference<FileObject> reference0 = softRefFilesCache0.createReference((FileObject) null, (ReferenceQueue<FileObject>) null);
      assertFalse(reference0.isEnqueued());
  }
}
