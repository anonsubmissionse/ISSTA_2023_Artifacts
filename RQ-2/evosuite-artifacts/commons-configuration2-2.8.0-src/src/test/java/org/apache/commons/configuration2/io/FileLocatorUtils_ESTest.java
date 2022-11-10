/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 00:27:29 GMT 2022
 */

package org.apache.commons.configuration2.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.net.URLStreamHandler;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.configuration2.io.BasePathLocationStrategy;
import org.apache.commons.configuration2.io.DefaultFileSystem;
import org.apache.commons.configuration2.io.FileLocationStrategy;
import org.apache.commons.configuration2.io.FileLocator;
import org.apache.commons.configuration2.io.FileLocatorUtils;
import org.apache.commons.configuration2.io.FileSystem;
import org.apache.commons.configuration2.io.FileSystemLocationStrategy;
import org.apache.commons.configuration2.io.VFSFileSystem;
import org.apache.commons.vfs2.FileSystemOptions;
import org.apache.commons.vfs2.provider.DefaultURLStreamHandler;
import org.apache.commons.vfs2.provider.VfsComponentContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileLocatorUtils_ESTest extends FileLocatorUtils_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      File file0 = FileLocatorUtils.getFile("file:file:/tmp/sourceURL", "file:file:/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-configuration2-2.8.0-src/target/test-classes/");
      assertNotNull(file0.toString());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File file0 = FileLocatorUtils.getFile("file://file:/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-configuration2-2.8.0-src/Logger%20name%20must%20not%20be%20null!/Logger%20name%20must%20not%20be%20null!", "file://file:/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-configuration2-2.8.0-src/Logger%20name%20must%20not%20be%20null!/Logger%20name%20must%20not%20be%20null!");
      assertNotNull(file0.toString());
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VfsComponentContext vfsComponentContext0 = mock(VfsComponentContext.class, new ViolatedAssumptionAnswer());
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      DefaultURLStreamHandler defaultURLStreamHandler0 = new DefaultURLStreamHandler(vfsComponentContext0, fileSystemOptions0);
      URL uRL0 = MockURL.URL("qdIl=+69;Q7", "qdIl=+69;Q7", 4537, "qdIl=+69;Q7", (URLStreamHandler) defaultURLStreamHandler0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = FileLocatorUtils.fileLocator(fileLocator0);
      fileLocator_FileLocatorBuilder0.sourceURL(uRL0);
      FileLocator fileLocator1 = new FileLocator(fileLocator_FileLocatorBuilder0);
      URL uRL1 = FileLocatorUtils.locateOrThrow(fileLocator1);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VfsComponentContext vfsComponentContext0 = mock(VfsComponentContext.class, new ViolatedAssumptionAnswer());
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      DefaultURLStreamHandler defaultURLStreamHandler0 = new DefaultURLStreamHandler(vfsComponentContext0, fileSystemOptions0);
      URL uRL0 = MockURL.URL("qdIl=+69;Q7", "qdIl=+69;Q7", 4537, "qdIl=+69;Q7", (URLStreamHandler) defaultURLStreamHandler0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = FileLocatorUtils.fileLocator(fileLocator0);
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder1 = fileLocator_FileLocatorBuilder0.sourceURL(uRL0);
      FileLocator fileLocator1 = new FileLocator(fileLocator_FileLocatorBuilder1);
      URL uRL1 = FileLocatorUtils.locate(fileLocator1);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("sourceURL", uRL0);
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      URL uRL1 = FileLocatorUtils.locate(fileLocator0);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      String string0 = FileLocatorUtils.getFileName(uRL0);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      String string0 = FileLocatorUtils.getFileName(uRL0);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      File file0 = FileLocatorUtils.getFile(".", "http://foo.bar");
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      File file0 = FileLocatorUtils.getFile(".", "./");
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      File file0 = FileLocatorUtils.getFile(".", "./");
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      File file0 = FileLocatorUtils.getFile("/", "");
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      File file0 = FileLocatorUtils.getFile("/", "");
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("<G:E*/y{Y{cO]p]:P`[jFX");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = FileLocatorUtils.getFile("<G:E*", "y{Y{cO]p]:P`[jFX");
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("<G:E*/y{Y{cO]p]:P`[jFX");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = FileLocatorUtils.getFile("<G:E*", "y{Y{cO]p]:P`[jFX");
      assertFalse(file0.canExecute());
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VfsComponentContext vfsComponentContext0 = mock(VfsComponentContext.class, new ViolatedAssumptionAnswer());
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      DefaultURLStreamHandler defaultURLStreamHandler0 = new DefaultURLStreamHandler(vfsComponentContext0, fileSystemOptions0);
      URL uRL0 = MockURL.URL("qdIl=+69;Q7", "qdIl=+69;Q7", 4537, "qdIl=+69;Q7", (URLStreamHandler) defaultURLStreamHandler0);
      String string0 = FileLocatorUtils.getBasePath(uRL0);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemOptions fileSystemOptions0 = new FileSystemOptions();
      DefaultURLStreamHandler defaultURLStreamHandler0 = new DefaultURLStreamHandler((VfsComponentContext) null, fileSystemOptions0);
      URL uRL0 = MockURL.URL("Cannot access property '", "TimeZone", 0, "", (URLStreamHandler) defaultURLStreamHandler0);
      File file0 = FileLocatorUtils.fileFromURL(uRL0);
      assertNotNull(file0);
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VFSFileSystem vFSFileSystem0 = new VFSFileSystem();
      URL uRL0 = vFSFileSystem0.getURL("sourceURL/", ".");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("sourceURL/.");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "sourceURL");
      File file0 = FileLocatorUtils.fileFromURL(uRL0);
      assertEquals(1, file0.lastModified());
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VFSFileSystem vFSFileSystem0 = new VFSFileSystem();
      URL uRL0 = vFSFileSystem0.getURL("sourceURL/", ".");
      File file0 = FileLocatorUtils.fileFromURL(uRL0);
      assertNotNull(file0.toString());
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      URL uRL0 = MockURL.URL("file://");
      File file0 = FileLocatorUtils.fileFromURL(uRL0);
      assertNotNull(file0.toString());
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      URI uRI0 = MockURI.URI("org.apache.commons.vfs2.FileObject", "org.apache.commons.vfs2.FileObject", "java.text.DateFormat");
      URL uRL0 = FileLocatorUtils.convertURIToURL(uRI0);
      assertNotNull(uRL0);
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      File file0 = FileLocatorUtils.constructFile("file:file:/home/ISSTA_USER/y%7BY%7BcO%5Dp%5D:P%60%5BjFX", "...");
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("ISO8601/ISO8601");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = FileLocatorUtils.constructFile("ISO8601", "ISO8601");
      assertNotNull(file0.toString());
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("ISO8601/ISO8601");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "fileName");
      File file0 = FileLocatorUtils.constructFile("ISO8601", "ISO8601");
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileLocatorUtils.toURL((File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.configuration2.io.FileLocatorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = FileLocatorUtils.fileLocator();
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder1 = fileLocator_FileLocatorBuilder0.fileName("$8 _hC0B98xK1jQv");
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder2 = fileLocator_FileLocatorBuilder1.basePath("file:///");
      FileLocator fileLocator0 = new FileLocator(fileLocator_FileLocatorBuilder2);
      // Undeclared exception!
      try { 
        FileLocatorUtils.locateOrThrow(fileLocator0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileLocatorUtils.locateFromClasspath((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileLocatorUtils.getFile((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = FileLocatorUtils.fileLocator();
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder1 = fileLocator_FileLocatorBuilder0.fileName("file:");
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder2 = fileLocator_FileLocatorBuilder1.basePath("file:");
      FileLocator fileLocator0 = new FileLocator(fileLocator_FileLocatorBuilder2);
      // Undeclared exception!
      try { 
        FileLocatorUtils.fullyInitializedLocator(fileLocator0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("fileName", uRL0);
      // Undeclared exception!
      try { 
        FileLocatorUtils.fromMap(hashMap0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // java.net.URL cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.configuration2.io.FileLocatorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileLocatorUtils.convertURIToURL((URI) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      URI uRI0 = MockURI.URI("CD;,o+sd/", "", "CD;,o+sd/", (-1), "", "", "CD;,o+sd/");
      // Undeclared exception!
      try { 
        FileLocatorUtils.convertURIToURL(uRI0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // URI is not absolute
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileLocatorUtils.convertFileToURL((File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.configuration2.io.FileLocatorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileLocatorUtils.constructFile((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileLocatorUtils.appendPath((String) null, "<G:E*");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      URL uRL0 = FileLocatorUtils.locate(fileLocator0);
      ;
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = FileLocatorUtils.fileLocator();
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder1 = fileLocator_FileLocatorBuilder0.fileName("./y{Y{cO]p]:P`[jFX");
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder2 = fileLocator_FileLocatorBuilder1.basePath("./y{Y{cO]p]:P`[jFX");
      FileLocator fileLocator0 = new FileLocator(fileLocator_FileLocatorBuilder2);
      boolean boolean0 = FileLocatorUtils.isFullyInitialized(fileLocator0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HashMap<String, BasePathLocationStrategy> hashMap0 = new HashMap<String, BasePathLocationStrategy>();
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      boolean boolean0 = FileLocatorUtils.isFullyInitialized(fileLocator0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("sourceURL", uRL0);
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      boolean boolean0 = FileLocatorUtils.isFullyInitialized(fileLocator1);
      assertNotNull(fileLocator1.getFileName());
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("sourceURL", uRL0);
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      boolean boolean0 = FileLocatorUtils.isFullyInitialized(fileLocator1);
      assertNotNull(fileLocator1.getBasePath());
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("sourceURL", uRL0);
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      boolean boolean0 = FileLocatorUtils.isFullyInitialized(fileLocator1);
      ;
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("sourceURL", uRL0);
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      boolean boolean0 = FileLocatorUtils.isFullyInitialized(fileLocator1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      FileLocatorUtils.put((FileLocator) null, hashMap0);
      ;
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileLocatorUtils.put((FileLocator) null, (Map<String, Object>) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Map must not be null!
         //
         verifyException("org.apache.commons.configuration2.io.FileLocatorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HashMap<String, FileSystemLocationStrategy> hashMap0 = new HashMap<String, FileSystemLocationStrategy>();
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      FileLocatorUtils.put(fileLocator0, hashMap1);
      ;
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HashMap<String, FileSystemLocationStrategy> hashMap0 = new HashMap<String, FileSystemLocationStrategy>();
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      FileLocatorUtils.put(fileLocator0, hashMap1);
      ;
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileLocationStrategy fileLocationStrategy0 = FileLocatorUtils.obtainLocationStrategy((FileLocator) null);
      ;
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileSystem fileSystem0 = FileLocatorUtils.obtainFileSystem((FileLocator) null);
      ;
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HashMap<String, DefaultFileSystem> hashMap0 = new HashMap<String, DefaultFileSystem>();
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      try { 
        FileLocatorUtils.locateOrThrow(fileLocator0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Could not locate: FileLocator [basePath=null, encoding=null, fileName=null, fileSystem=null, locationStrategy=null, sourceURL=null, urlConnectionOptions=null]
         //
         verifyException("org.apache.commons.configuration2.io.FileLocatorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      URL uRL0 = FileLocatorUtils.locateFromClasspath("sourceURL");
      ;
}
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      URL uRL0 = FileLocatorUtils.locate((FileLocator) null);
      ;
}
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("sourceURL", uRL0);
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      boolean boolean0 = FileLocatorUtils.isLocationDefined(fileLocator0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("sourceURL", uRL0);
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      boolean boolean0 = FileLocatorUtils.isLocationDefined(fileLocator1);
      assertNotNull(fileLocator1.getFileName());
}
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("sourceURL", uRL0);
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      boolean boolean0 = FileLocatorUtils.isLocationDefined(fileLocator1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("sourceURL", uRL0);
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      boolean boolean0 = FileLocatorUtils.isLocationDefined(fileLocator1);
      assertNotNull(fileLocator1.getBasePath());
}
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("sourceURL", uRL0);
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      boolean boolean0 = FileLocatorUtils.isLocationDefined(fileLocator1);
      ;
}
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      boolean boolean0 = FileLocatorUtils.isLocationDefined(fileLocator0);
      ;
}
 @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      boolean boolean0 = FileLocatorUtils.isLocationDefined((FileLocator) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = FileLocatorUtils.fileLocator();
      fileLocator_FileLocatorBuilder0.basePath("");
      FileLocator fileLocator0 = fileLocator_FileLocatorBuilder0.create();
      boolean boolean0 = FileLocatorUtils.isFullyInitialized(fileLocator0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      boolean boolean0 = FileLocatorUtils.isFullyInitialized((FileLocator) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      URL uRL0 = FileLocatorUtils.convertURIToURL(uRI0);
      String string0 = FileLocatorUtils.getFileName(uRL0);
      ;
}
 @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      VFSFileSystem vFSFileSystem0 = new VFSFileSystem();
      URL uRL0 = vFSFileSystem0.getURL("org.apache.commonE.vfs2.util.FileObjectUils", "/");
      String string0 = FileLocatorUtils.getFileName(uRL0);
      ;
}
 @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = FileLocatorUtils.getFileName((URL) null);
      ;
}
 @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      File file0 = FileLocatorUtils.getFile("[<LDu?_CiP", "/;Z.dc");
      ;
}
 @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      String string0 = FileLocatorUtils.getBasePath(uRL0);
      ;
}
 @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      URL uRL0 = FileLocatorUtils.convertURIToURL(uRI0);
      String string0 = FileLocatorUtils.getBasePath(uRL0);
      ;
}
 @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = FileLocatorUtils.getBasePath((URL) null);
      ;
}
 @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FileLocator fileLocator0 = FileLocatorUtils.fromMap((Map<String, ?>) null);
      ;
}
 @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = FileLocatorUtils.fileLocator();
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder1 = fileLocator_FileLocatorBuilder0.fileName("./y{Y{cO]p]:P`[jFX");
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder2 = fileLocator_FileLocatorBuilder1.basePath("./y{Y{cO]p]:P`[jFX");
      FileLocator fileLocator0 = new FileLocator(fileLocator_FileLocatorBuilder2);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      ;
}
 @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = FileLocatorUtils.fileLocator();
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder1 = fileLocator_FileLocatorBuilder0.fileName("./y{Y{cO]p]:P`[jFX");
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder2 = fileLocator_FileLocatorBuilder1.basePath("./y{Y{cO]p]:P`[jFX");
      FileLocator fileLocator0 = new FileLocator(fileLocator_FileLocatorBuilder2);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      ;
}
 @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = FileLocatorUtils.fileLocator();
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder1 = fileLocator_FileLocatorBuilder0.fileName("./y{Y{cO]p]:P`[jFX");
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder2 = fileLocator_FileLocatorBuilder1.basePath("./y{Y{cO]p]:P`[jFX");
      FileLocator fileLocator0 = new FileLocator(fileLocator_FileLocatorBuilder2);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      assertNotNull(fileLocator1.getBasePath());
}
 @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = FileLocatorUtils.fileLocator();
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder1 = fileLocator_FileLocatorBuilder0.fileName("./y{Y{cO]p]:P`[jFX");
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder2 = fileLocator_FileLocatorBuilder1.basePath("./y{Y{cO]p]:P`[jFX");
      FileLocator fileLocator0 = new FileLocator(fileLocator_FileLocatorBuilder2);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      assertNotNull(fileLocator1.getFileName());
}
 @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = FileLocatorUtils.fileLocator();
      fileLocator_FileLocatorBuilder0.fileName("./y{Y{cO]p]:P`[jFX");
      FileLocator fileLocator0 = new FileLocator(fileLocator_FileLocatorBuilder0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      assertNotNull(fileLocator1.getBasePath());
}
 @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = FileLocatorUtils.fileLocator();
      fileLocator_FileLocatorBuilder0.fileName("./y{Y{cO]p]:P`[jFX");
      FileLocator fileLocator0 = new FileLocator(fileLocator_FileLocatorBuilder0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      ;
}
 @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = FileLocatorUtils.fileLocator();
      fileLocator_FileLocatorBuilder0.fileName("./y{Y{cO]p]:P`[jFX");
      FileLocator fileLocator0 = new FileLocator(fileLocator_FileLocatorBuilder0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      assertNotNull(fileLocator1.getFileName());
}
 @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("sourceURL", uRL0);
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      ;
}
 @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("sourceURL", uRL0);
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      FileLocator fileLocator2 = FileLocatorUtils.fullyInitializedLocator(fileLocator1);
      ;
}
 @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("sourceURL", uRL0);
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      FileLocator fileLocator2 = FileLocatorUtils.fullyInitializedLocator(fileLocator1);
      ;
}
 @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("sourceURL", uRL0);
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      FileLocator fileLocator2 = FileLocatorUtils.fullyInitializedLocator(fileLocator1);
      assertNotNull(fileLocator2.getBasePath());
}
 @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = FileLocatorUtils.toURL(mockFile0);
      HashMap<String, URL> hashMap0 = new HashMap<String, URL>();
      hashMap0.put("sourceURL", uRL0);
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(hashMap0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      FileLocator fileLocator2 = FileLocatorUtils.fullyInitializedLocator(fileLocator1);
      ;
}
 @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      File file0 = FileLocatorUtils.constructFile("basePath", "/tmp/sourceURL/");
      assertFalse(file0.isAbsolute());
}
 @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      FileLocator.FileLocatorBuilder fileLocator_FileLocatorBuilder0 = FileLocatorUtils.fileLocator();
      fileLocator_FileLocatorBuilder0.fileName("./U pUBq:/");
      FileLocator fileLocator0 = new FileLocator(fileLocator_FileLocatorBuilder0);
      URL uRL0 = FileLocatorUtils.locateOrThrow(fileLocator0);
      ;
}
 @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      String string0 = FileLocatorUtils.appendPath("./y{Y{cO]p]:P`[jFX", "./y{Y{cO]p]:P`[jFX");
      ;
}
 @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      FileLocator fileLocator0 = FileLocatorUtils.fromMap(map0);
      FileLocator fileLocator1 = FileLocatorUtils.fullyInitializedLocator(fileLocator0);
      ;
}
 @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      MockFile mockFile0 = new MockFile("CD;,o+sd/", "");
      URL uRL0 = FileLocatorUtils.convertFileToURL(mockFile0);
      assertNotNull(uRL0.getProtocol());
}
}
