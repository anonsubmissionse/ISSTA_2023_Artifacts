/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 04:27:10 GMT 2022
 */

package org.apache.commons.vfs2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.vfs2.FileSystem;
import org.apache.commons.vfs2.FileSystemOptions;
import org.apache.commons.vfs2.FileType;
import org.apache.commons.vfs2.impl.VirtualFileSystem;
import org.apache.commons.vfs2.provider.GenericURLFileName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileSystemOptions_ESTest extends FileSystemOptions_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      fileSystemOptions1.setOption(class0, "com.google.common.collect.FluentIterable$FromIterableFunction", (Object) null);
      boolean boolean0 = fileSystemOptions0.equals(fileSystemOptions1);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      fileSystemOptions1.setOption(class0, "com.google.common.collect.FluentIterable$FromIterableFunction", (Object) null);
      boolean boolean0 = fileSystemOptions0.equals(fileSystemOptions1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      boolean boolean0 = fileSystemOptions0.equals(fileSystemOptions0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      Integer integer0 = fileSystemOptions0.getOption((Class<? extends FileSystem>) class0, "`Ol(j`,`v\"'l^bGT");
      assertNotNull(integer0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      fileSystemOptions0.setOption(class0, "", "`Ol(j`,`v\"'l^bGT");
      String string0 = fileSystemOptions0.getOption((Class<? extends FileSystem>) class0, "");
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      // Undeclared exception!
      try { 
        fileSystemOptions0.setOption(class0, (String) null, fileSystemOptions0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.vfs2.FileSystemOptions$FileSystemOptionKey", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      fileSystemOptions0.setOption(class0, "{e4t++&OunY/?m=`", class0);
      // Undeclared exception!
      try { 
        fileSystemOptions0.getOption((Class<? extends FileSystem>) class0, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.vfs2.FileSystemOptions$FileSystemOptionKey", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      fileSystemOptions0.setOption(class0, "J9=D{", fileSystemOptions0);
      fileSystemOptions1.setOption(class0, "J9=D{", (Object) null);
      // Undeclared exception!
      try { 
        fileSystemOptions0.equals(fileSystemOptions1);
        fail("Expecting exception: StackOverflowError");
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      fileSystemOptions1.setOption(class0, "org.apache.commons.vfs2.FileSystemOptions", fileSystemOptions1);
      fileSystemOptions0.setOption(class0, "org.apache.commons.vfs2.FileSystemOptions", fileSystemOptions1);
      // Undeclared exception!
      try { 
        fileSystemOptions0.compareTo(fileSystemOptions1);
        fail("Expecting exception: StackOverflowError");
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      // Undeclared exception!
      try { 
        fileSystemOptions0.compareTo((FileSystemOptions) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.vfs2.FileSystemOptions", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      int int0 = fileSystemOptions1.compareTo(fileSystemOptions0);
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      int int0 = fileSystemOptions0.compareTo(fileSystemOptions0);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      fileSystemOptions1.setOption(class0, "", class0);
      boolean boolean0 = fileSystemOptions1.equals(fileSystemOptions0);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      fileSystemOptions1.setOption(class0, "", class0);
      boolean boolean0 = fileSystemOptions1.equals(fileSystemOptions0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      boolean boolean0 = fileSystemOptions0.equals((Object) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      boolean boolean0 = fileSystemOptions0.equals("");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      fileSystemOptions0.setOption(class0, "nl", class0);
      fileSystemOptions1.setOption(class0, "", class0);
      int int0 = fileSystemOptions1.compareTo(fileSystemOptions0);
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      fileSystemOptions0.setOption(class0, "nl", class0);
      fileSystemOptions1.setOption(class0, "", class0);
      int int0 = fileSystemOptions1.compareTo(fileSystemOptions0);
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      fileSystemOptions1.setOption(class0, "", "");
      fileSystemOptions0.setOption(class0, "", fileSystemOptions1);
      int int0 = fileSystemOptions0.compareTo(fileSystemOptions1);
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      FileSystemOptions fileSystemOptions1 = (FileSystemOptions)fileSystemOptions0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      FileSystemOptions fileSystemOptions1 = (FileSystemOptions)fileSystemOptions0.clone();
      fileSystemOptions0.setOption(class0, "", fileSystemOptions1);
      int int0 = fileSystemOptions0.compareTo(fileSystemOptions1);
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      FileSystemOptions fileSystemOptions1 = (FileSystemOptions)fileSystemOptions0.clone();
      fileSystemOptions0.setOption(class0, "", fileSystemOptions1);
      int int0 = fileSystemOptions0.compareTo(fileSystemOptions1);
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      fileSystemOptions1.setOption(class0, "", "");
      int int0 = fileSystemOptions0.compareTo(fileSystemOptions1);
      ;
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      FileSystemOptions fileSystemOptions1 = new FileSystemOptions();
      fileSystemOptions1.setOption(class0, "", "");
      int int0 = fileSystemOptions0.compareTo(fileSystemOptions1);
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      fileSystemOptions0.setOption(class0, "sYe%l", "sYe%l");
      boolean boolean0 = fileSystemOptions0.hasOption(class0, "sYe%l");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      fileSystemOptions0.setOption(class0, "sYe%l", "sYe%l");
      FileType fileType0 = FileType.FILE_OR_FOLDER;
      GenericURLFileName genericURLFileName0 = new GenericURLFileName("sYe%l", "sYe%l", (-9), (-9), "sYe%l", "sYe%l", "sYe%l", fileType0, "sYe%l");
      VirtualFileSystem virtualFileSystem0 = new VirtualFileSystem(genericURLFileName0, fileSystemOptions0);
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Object object0 = fileSystemOptions0.clone();
      boolean boolean0 = fileSystemOptions0.equals(object0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      String string0 = fileSystemOptions0.toString();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      Class<VirtualFileSystem> class0 = VirtualFileSystem.class;
      fileSystemOptions0.setOption(class0, "sYe%l", "sYe%l");
      fileSystemOptions0.hashCode();
  }
}
