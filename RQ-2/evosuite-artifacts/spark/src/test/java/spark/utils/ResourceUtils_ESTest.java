/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 17:07:01 GMT 2022
 */

package spark.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import spark.utils.ResourceUtils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ResourceUtils_ESTest extends ResourceUtils_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URLConnection uRLConnection0 = MockURL.openConnection(uRL0);
      ResourceUtils.useCachesIfNecessary(uRLConnection0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = ResourceUtils.isUrl("file:");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("file", "file", 2124, ".", uRLStreamHandler0);
      URL uRL1 = MockURL.URL(uRL0, "file");
      URI uRI0 = ResourceUtils.toURI(uRL1);
      assertNotNull(uRI0.getRawAuthority());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      URI uRI0 = ResourceUtils.toURI("classpath:t&");
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      boolean boolean0 = ResourceUtils.isFileURL(uRL0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      URL uRL0 = ResourceUtils.getURL("..");
      File file0 = ResourceUtils.getFile(uRL0, "..");
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      URL uRL0 = ResourceUtils.getURL("file:");
      File file0 = ResourceUtils.getFile(uRL0, (String) null);
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      URL uRL0 = ResourceUtils.getURL("] is neither a URL not a well-formed file path");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("] is neither a URL not a well-formed file path");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ";");
      File file0 = ResourceUtils.getFile(uRL0);
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      URL uRL0 = ResourceUtils.getURL("..");
      File file0 = ResourceUtils.getFile(uRL0);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      URL uRL0 = MockURL.URL("file:");
      File file0 = ResourceUtils.getFile(uRL0);
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URI uRI0 = MockURI.URI("file:", "file:", "classpath:t&");
      File file0 = ResourceUtils.getFile(uRI0, "classpath:t&");
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URL uRL0 = ResourceUtils.getURL("");
      URI uRI0 = ResourceUtils.toURI(uRL0);
      File file0 = ResourceUtils.getFile(uRI0, "");
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      URI uRI0 = MockURI.URI("file:", "file:", (String) null);
      File file0 = ResourceUtils.getFile(uRI0);
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(";C*lK[6]]");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ";C*lK[6]]");
      URL uRL0 = ResourceUtils.getURL(";C*lK[6]]");
      URI uRI0 = ResourceUtils.toURI(uRL0);
      File file0 = ResourceUtils.getFile(uRI0);
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      URL uRL0 = ResourceUtils.getURL("..");
      URI uRI0 = ResourceUtils.toURI(uRL0);
      File file0 = ResourceUtils.getFile(uRI0);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      File file0 = ResourceUtils.getFile("..");
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      File file0 = ResourceUtils.getFile("");
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(";C*lK[6]]");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ";C*lK[6]]");
      File file0 = ResourceUtils.getFile(";C*lK[6]]");
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("%20", "&$N8$No>Jh>P^d;l", 0, "%20", uRLStreamHandler0);
      URL uRL1 = ResourceUtils.extractJarFileURL(uRL0);
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("file", "file", 2124, ".", uRLStreamHandler0);
      URL uRL1 = ResourceUtils.extractJarFileURL(uRL0);
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("", (String) null, 0, "", uRLStreamHandler0);
      URL uRL1 = ResourceUtils.extractJarFileURL(uRL0);
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      URL uRL1 = MockURL.URL(uRL0, "] is neither a URL not a well-formed file path");
      try { 
        ResourceUtils.toURI(uRL1);
        fail("Expecting exception: URISyntaxException");
      } catch(URISyntaxException e) {
         //
         // Illegal character in path at index 39: ftp://ftp.someFakeButWellFormedURL.org/]%20is%20neither%20a%20URL%20not%20a%20well-formed%20file%20path
         //
         verifyException("java.net.URI$Parser", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, "rwuVLg>QF$+45#'$(`", uRLStreamHandler0);
      // Undeclared exception!
      try { 
        ResourceUtils.toURI(uRL1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtils.toURI((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtils.isJarURL((URL) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtils.isFileURL((URL) null);
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
        ResourceUtils.getURL((String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Resource location must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      URL uRL0 = ResourceUtils.getURL("Name must not be null");
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, "eBaQP^*Ne!,]W~", uRLStreamHandler0);
      // Undeclared exception!
      try { 
        ResourceUtils.getFile(uRL1, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtils.getFile((URL) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Resource URL must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, "[L", uRLStreamHandler0);
      // Undeclared exception!
      try { 
        ResourceUtils.getFile(uRL1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtils.getFile((URL) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Resource URL must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtils.getFile((URI) null, "URL");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Resource URI must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtils.getFile((URI) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Resource URI must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtils.getFile((String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Resource location must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtils.extractJarFileURL((URL) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      URI uRI0 = ResourceUtils.toURI("..");
      try { 
        ResourceUtils.getFile(uRI0, "x|?QGwO[#1/*5d");
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
         //
         // x|?QGwO[#1/*5d cannot be resolved to absolute file path because it does not reside in the file system: ..
         //
         verifyException("spark.utils.ResourceUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      try { 
        ResourceUtils.getFile(uRL0, (String) null);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
         //
         // null cannot be resolved to absolute file path because it does not reside in the file system: http://www.someFakeButWellFormedURL.org/fooExample
         //
         verifyException("spark.utils.ResourceUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      try { 
        ResourceUtils.toURI("]");
        fail("Expecting exception: URISyntaxException");
      } catch(URISyntaxException e) {
         //
         // Illegal character in path at index 0: ]
         //
         verifyException("java.net.URI$Parser", e);
      }
  }
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("classpath:", "classpa]h:", 1798, "QQ`|n!/yF3< ", uRLStreamHandler0);
      URL uRL1 = ResourceUtils.extractJarFileURL(uRL0);
      ;
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("wsjar", "wsjar", 649, ".", uRLStreamHandler0);
      boolean boolean0 = ResourceUtils.isJarURL(uRL0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("zip", "zip", 643, "oFujo^OqsqDsl", uRLStreamHandler0);
      boolean boolean0 = ResourceUtils.isJarURL(uRL0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      URL uRL0 = ResourceUtils.getURL("..");
      boolean boolean0 = ResourceUtils.isJarURL(uRL0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      URL uRL0 = MockURL.URL("jar", "oFujo^OqsqDsl", "zip");
      boolean boolean0 = ResourceUtils.isJarURL(uRL0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      URL uRL0 = ResourceUtils.getURL("..");
      URI uRI0 = ResourceUtils.toURI(uRL0);
      File file0 = ResourceUtils.getFile(uRI0, "..");
      ;
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("EgoH", "classpath:R@l,", 75, "classpath:R@l,", uRLStreamHandler0);
      try { 
        ResourceUtils.getFile(uRL0);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
         //
         // URL cannot be resolved to absolute file path because it does not reside in the file system: null
         //
         verifyException("spark.utils.ResourceUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      try { 
        ResourceUtils.getFile("classpath:`Bcg_`d8i`S:%~gsh");
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
         //
         // class path resource [`Bcg_`d8i`S:%~gsh] cannot be resolved to absolute file path because it does not reside in the file system
         //
         verifyException("spark.utils.ResourceUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      URL uRL0 = ResourceUtils.getURL("classpath:");
      URL uRL1 = MockURL.URL(uRL0, "QQ`|n!/yF3< ");
      URL uRL2 = ResourceUtils.extractJarFileURL(uRL1);
      ;
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      URL uRL0 = ResourceUtils.getURL("classpath:");
      URL uRL1 = MockURL.URL(uRL0, "QQ`|n!/yF3< ");
      URL uRL2 = ResourceUtils.extractJarFileURL(uRL1);
      ;
}
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      URL uRL0 = ResourceUtils.getURL("classpath:");
      URL uRL1 = MockURL.URL(uRL0, "QQ`|n!/yF3< ");
      URL uRL2 = ResourceUtils.extractJarFileURL(uRL1);
      ;
}
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      try { 
        ResourceUtils.getURL("classpath:classpath:`Bc!_`d8i`S:%~Rg3h");
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
         //
         // class path resource [classpath:`Bc!_`d8i`S:%~Rg3h] cannot be resolved to URL because it does not exist
         //
         verifyException("spark.utils.ResourceUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      URL uRL0 = ResourceUtils.getURL("");
      URI uRI0 = ResourceUtils.toURI(uRL0);
      ResourceUtils.getFile(uRI0);
      ;
}
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      URL uRL0 = ResourceUtils.getURL("");
      URI uRI0 = ResourceUtils.toURI(uRL0);
      ResourceUtils.getFile(uRI0);
      ;
}
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      boolean boolean0 = ResourceUtils.isUrl("classpath:`Bcg_`d8i`S:%~gsh");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      boolean boolean0 = ResourceUtils.isUrl((String) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      boolean boolean0 = ResourceUtils.isUrl("");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      try { 
        ResourceUtils.getFile(uRI0);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
         //
         // URI cannot be resolved to absolute file path because it does not reside in the file system: http://foo.bar
         //
         verifyException("spark.utils.ResourceUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtils.useCachesIfNecessary((URLConnection) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.utils.ResourceUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      boolean boolean0 = ResourceUtils.isFileURL(uRL0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      File file0 = ResourceUtils.getFile("classpath:");
      ;
}
}
