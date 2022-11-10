/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 00:26:55 GMT 2022
 */

package org.apache.commons.configuration2.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import java.util.Hashtable;
import java.util.Map;
import oracle.jdbc.aq.AQEnqueueOptions;
import org.apache.commons.configuration2.AbstractYAMLBasedConfiguration;
import org.apache.commons.configuration2.CompositeConfiguration;
import org.apache.commons.configuration2.DynamicCombinedConfiguration;
import org.apache.commons.configuration2.INIConfiguration;
import org.apache.commons.configuration2.JSONConfiguration;
import org.apache.commons.configuration2.PatternSubtreeConfigurationWrapper;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.XMLPropertiesConfiguration;
import org.apache.commons.configuration2.YAMLConfiguration;
import org.apache.commons.configuration2.io.BasePathLocationStrategy;
import org.apache.commons.configuration2.io.FileBased;
import org.apache.commons.configuration2.io.FileHandler;
import org.apache.commons.configuration2.io.FileHandlerListener;
import org.apache.commons.configuration2.io.FileHandlerListenerAdapter;
import org.apache.commons.configuration2.io.FileLocationStrategy;
import org.apache.commons.configuration2.io.FileLocator;
import org.apache.commons.configuration2.io.FileSystem;
import org.apache.commons.configuration2.io.URLConnectionOptions;
import org.apache.commons.configuration2.tree.MergeCombiner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hsqldb.lib.FileUtil;
import org.hsqldb.rowio.RowInputBinary;
import org.hsqldb.rowio.RowOutputBinary;
import org.hsqldb.rowio.RowOutputBinary180;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileHandler_ESTest extends FileHandler_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      fileHandler0.setFileName("file:FileLocator must not be null!");
      assertNotNull(fileHandler0.getEncoding());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XMLConfiguration xMLConfiguration0 = new XMLConfiguration();
      JSONConfiguration jSONConfiguration0 = new JSONConfiguration(xMLConfiguration0);
      FileHandler fileHandler0 = new FileHandler();
      FileHandler fileHandler1 = new FileHandler(jSONConfiguration0, fileHandler0);
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        fileHandler1.save((Writer) pipedWriter0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.configuration2.io.FileHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XMLPropertiesConfiguration xMLPropertiesConfiguration0 = new XMLPropertiesConfiguration();
      FileHandler fileHandler0 = new FileHandler(xMLPropertiesConfiguration0);
      MockFile mockFile0 = new MockFile("[G2=.@#8RBA'5iG");
      URL uRL0 = mockFile0.toURL();
      fileHandler0.save(uRL0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PropertiesConfiguration propertiesConfiguration0 = new PropertiesConfiguration();
      FileHandler fileHandler0 = new FileHandler(propertiesConfiguration0);
      MockFile mockFile0 = new MockFile("ISO-8859-1");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0);
      fileHandler0.save((Writer) mockFileWriter0);
      assertNotNull(fileHandler0.getEncoding());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XMLPropertiesConfiguration xMLPropertiesConfiguration0 = new XMLPropertiesConfiguration();
      FileHandler fileHandler0 = new FileHandler(xMLPropertiesConfiguration0);
      boolean boolean0 = fileHandler0.locate();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MergeCombiner mergeCombiner0 = new MergeCombiner();
      DynamicCombinedConfiguration dynamicCombinedConfiguration0 = new DynamicCombinedConfiguration(mergeCombiner0);
      PatternSubtreeConfigurationWrapper patternSubtreeConfigurationWrapper0 = new PatternSubtreeConfigurationWrapper(dynamicCombinedConfiguration0, "");
      FileHandler fileHandler0 = new FileHandler(patternSubtreeConfigurationWrapper0);
      byte[] byteArray0 = new byte[5];
      RowInputBinary rowInputBinary0 = new RowInputBinary(byteArray0);
      try { 
        fileHandler0.load((InputStream) rowInputBinary0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Wrapped configuration does not implement FileBased! No I/O operations are supported.
         //
         verifyException("org.apache.commons.configuration2.PatternSubtreeConfigurationWrapper", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      FileHandler fileHandler0 = new FileHandler(iNIConfiguration0);
      PipedReader pipedReader0 = new PipedReader();
      try { 
        fileHandler0.load((Reader) pipedReader0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.configuration2.io.FileHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      FileHandler fileHandler0 = new FileHandler(iNIConfiguration0);
      fileHandler0.setPath("\"");
      FileSystemHandling.shouldAllThrowIOExceptions();
      fileHandler0.save();
      assertNotNull(fileHandler0.getEncoding());
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      FileHandler fileHandler0 = new FileHandler(iNIConfiguration0);
      fileHandler0.setPath("\"");
      boolean boolean0 = fileHandler0.isLocationDefined();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      JSONConfiguration jSONConfiguration0 = new JSONConfiguration();
      FileHandler fileHandler0 = new FileHandler(jSONConfiguration0);
      fileHandler0.setEncoding("file:0g8I");
      String string0 = fileHandler0.getEncoding();
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      FileHandler fileHandler0 = new FileHandler(iNIConfiguration0);
      FileBased fileBased0 = fileHandler0.getContent();
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      fileHandler0.setBasePath("");
      String string0 = fileHandler0.getBasePath();
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      // Undeclared exception!
      try { 
        fileHandler0.setPath((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      // Undeclared exception!
      try { 
        fileHandler0.setFile((File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.configuration2.io.FileHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      URL uRL0 = MockURL.getFtpExample();
      try { 
        fileHandler0.save(uRL0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // No content available!
         //
         verifyException("org.apache.commons.configuration2.io.FileHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONConfiguration jSONConfiguration0 = new JSONConfiguration();
      INIConfiguration iNIConfiguration0 = new INIConfiguration(jSONConfiguration0);
      FileHandler fileHandler0 = new FileHandler(jSONConfiguration0);
      FileHandler fileHandler1 = new FileHandler(iNIConfiguration0, fileHandler0);
      // Undeclared exception!
      try { 
        fileHandler1.save((Writer) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONConfiguration jSONConfiguration0 = new JSONConfiguration();
      FileHandler fileHandler0 = new FileHandler(jSONConfiguration0);
      // Undeclared exception!
      try { 
        fileHandler0.save((Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // argument \"w\" is null
         //
         verifyException("com.fasterxml.jackson.databind.ObjectWriter", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DynamicCombinedConfiguration dynamicCombinedConfiguration0 = new DynamicCombinedConfiguration();
      PatternSubtreeConfigurationWrapper patternSubtreeConfigurationWrapper0 = new PatternSubtreeConfigurationWrapper(dynamicCombinedConfiguration0, "mk%E8m3+'ripI=C");
      FileHandler fileHandler0 = new FileHandler(patternSubtreeConfigurationWrapper0);
      RowOutputBinary180 rowOutputBinary180_0 = new RowOutputBinary180((-716), 2408);
      try { 
        fileHandler0.save((OutputStream) rowOutputBinary180_0, "mk%E8m3+'ripI=C");
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // The requested encoding is not supported, try the default encoding.
         //
         verifyException("org.apache.commons.configuration2.io.FileHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XMLPropertiesConfiguration xMLPropertiesConfiguration0 = new XMLPropertiesConfiguration();
      FileHandler fileHandler0 = new FileHandler(xMLPropertiesConfiguration0);
      RowOutputBinary rowOutputBinary0 = new RowOutputBinary((-670), (-670));
      rowOutputBinary0.setSize((-670));
      // Undeclared exception!
      try { 
        fileHandler0.save((OutputStream) rowOutputBinary0, "UTF-8");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      byte[] byteArray0 = new byte[2];
      RowOutputBinary rowOutputBinary0 = new RowOutputBinary(byteArray0);
      try { 
        fileHandler0.save((OutputStream) rowOutputBinary0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // No content available!
         //
         verifyException("org.apache.commons.configuration2.io.FileHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DynamicCombinedConfiguration dynamicCombinedConfiguration0 = new DynamicCombinedConfiguration();
      PatternSubtreeConfigurationWrapper patternSubtreeConfigurationWrapper0 = new PatternSubtreeConfigurationWrapper(dynamicCombinedConfiguration0, ">?9vvI^JK");
      XMLConfiguration xMLConfiguration0 = new XMLConfiguration(patternSubtreeConfigurationWrapper0);
      FileHandler fileHandler0 = new FileHandler(xMLConfiguration0);
      // Undeclared exception!
      try { 
        fileHandler0.save((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XMLConfiguration xMLConfiguration0 = new XMLConfiguration();
      xMLConfiguration0.setProperty("Lw<i{-`tSDqFu", "Lw<i{-`tSDqFu");
      FileHandler fileHandler0 = new FileHandler(xMLConfiguration0);
      MockFile mockFile0 = new MockFile(":9F:pOQpMVb}m# `");
      // Undeclared exception!
      try { 
        fileHandler0.save((File) mockFile0);
        fail("Expecting exception: DOMException");
      } catch(DOMException e) {
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PropertiesConfiguration propertiesConfiguration0 = new PropertiesConfiguration();
      Hashtable<String, CompositeConfiguration> hashtable0 = new Hashtable<String, CompositeConfiguration>();
      FileHandler fileHandler0 = FileHandler.fromMap(hashtable0);
      FileHandler fileHandler1 = new FileHandler(propertiesConfiguration0, fileHandler0);
      // Undeclared exception!
      try { 
        fileHandler1.save((File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      try { 
        fileHandler0.load("");
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // No content available!
         //
         verifyException("org.apache.commons.configuration2.io.FileHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XMLPropertiesConfiguration xMLPropertiesConfiguration0 = new XMLPropertiesConfiguration();
      FileHandler fileHandler0 = new FileHandler(xMLPropertiesConfiguration0);
      // Undeclared exception!
      try { 
        fileHandler0.load((InputStream) null, "d(k(n-uXuW7t_");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Hashtable<String, XMLConfiguration> hashtable0 = new Hashtable<String, XMLConfiguration>();
      FileHandler fileHandler0 = FileHandler.fromMap(hashtable0);
      fileHandler0.setFileName("oracle.jdbc.replay.OracleDataSourceImpl");
      File file0 = fileHandler0.getFile();
      try { 
        fileHandler0.load(file0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // No content available!
         //
         verifyException("org.apache.commons.configuration2.io.FileHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileHandler fileHandler0 = FileHandler.fromMap((Map<String, ?>) null);
      try { 
        fileHandler0.load();
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // No content available!
         //
         verifyException("org.apache.commons.configuration2.io.FileHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      MockFile mockFile0 = new MockFile("Exception when closing ");
      fileHandler0.setFile(mockFile0);
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Hashtable<String, AbstractYAMLBasedConfiguration> hashtable0 = new Hashtable<String, AbstractYAMLBasedConfiguration>();
      FileHandler fileHandler0 = FileHandler.fromMap(hashtable0);
      URL uRL0 = MockURL.getHttpExample();
      fileHandler0.setURL(uRL0);
      URL uRL1 = fileHandler0.getURL();
      ;
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      FileHandler fileHandler0 = new FileHandler(iNIConfiguration0);
      FileHandlerListenerAdapter fileHandlerListenerAdapter0 = new FileHandlerListenerAdapter();
      fileHandler0.setPath("\"");
      fileHandler0.addFileHandlerListener(fileHandlerListenerAdapter0);
      fileHandler0.save();
      assertNotNull(fileHandler0.getEncoding());
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XMLConfiguration xMLConfiguration0 = new XMLConfiguration();
      FileHandler fileHandler0 = new FileHandler(xMLConfiguration0);
      FileHandlerListenerAdapter fileHandlerListenerAdapter0 = new FileHandlerListenerAdapter();
      fileHandler0.addFileHandlerListener(fileHandlerListenerAdapter0);
      fileHandler0.setFileName("zgL?S[WzbP{<o-Xp");
      assertNotNull(fileHandler0.getEncoding());
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler((FileBased) null);
      fileHandler0.resetFileSystem();
      ;
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      try { 
        fileHandler0.load((InputStream) null, "v7Q#pU#]gatPUy<#4q");
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // No content available!
         //
         verifyException("org.apache.commons.configuration2.io.FileHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler((FileBased) null);
      FileHandlerListenerAdapter fileHandlerListenerAdapter0 = new FileHandlerListenerAdapter();
      fileHandler0.removeFileHandlerListener(fileHandlerListenerAdapter0);
      assertNotNull(fileHandler0.getEncoding());
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      FileHandler fileHandler0 = new FileHandler(iNIConfiguration0);
      try { 
        fileHandler0.load(".BnqG'_nexlm9&");
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Unable to load the configuration from the URL file:/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-configuration2-2.8.0-src/.BnqG'_nexlm9&
         //
         verifyException("org.apache.commons.configuration2.io.DefaultFileSystem", e);
      }
  }
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      // Undeclared exception!
      try { 
        fileHandler0.setFileLocator((FileLocator) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // FileLocator must not be null!
         //
         verifyException("org.apache.commons.configuration2.io.FileHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler((FileBased) null);
      FileLocator fileLocator0 = fileHandler0.getFileLocator();
      fileHandler0.setFileLocator(fileLocator0);
      assertNotNull(fileHandler0.getEncoding());
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      XMLPropertiesConfiguration xMLPropertiesConfiguration0 = new XMLPropertiesConfiguration();
      FileHandler fileHandler0 = new FileHandler(xMLPropertiesConfiguration0);
      FileUtil fileUtil0 = FileUtil.getFileUtil();
      OutputStream outputStream0 = fileUtil0.openOutputStreamElementAppend("file://");
      fileHandler0.save(outputStream0, "UTF-8");
      assertNotNull(fileHandler0.getEncoding());
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      FileHandler fileHandler0 = new FileHandler(iNIConfiguration0);
      try { 
        fileHandler0.save();
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // No file location has been set!
         //
         verifyException("org.apache.commons.configuration2.io.FileHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      XMLPropertiesConfiguration xMLPropertiesConfiguration0 = new XMLPropertiesConfiguration();
      FileHandler fileHandler0 = new FileHandler();
      FileHandler fileHandler1 = new FileHandler(xMLPropertiesConfiguration0, fileHandler0);
      fileHandler1.setEncoding("UTF-8");
      // Undeclared exception!
      try { 
        fileHandler1.load((InputStream) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      Hashtable<String, XMLConfiguration> hashtable0 = new Hashtable<String, XMLConfiguration>();
      FileHandler fileHandler0 = FileHandler.fromMap(hashtable0);
      FileHandler fileHandler1 = new FileHandler(iNIConfiguration0, fileHandler0);
      fileHandler1.save("KPDSS_SESSSTATE_APPCONT_ENABLED");
      ;
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      URL uRL0 = fileHandler0.getURL();
      assertNotNull(uRL0);
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      YAMLConfiguration yAMLConfiguration0 = new YAMLConfiguration();
      FileHandler fileHandler0 = new FileHandler(yAMLConfiguration0);
      String string0 = fileHandler0.getFileName();
      ;
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      URL uRL0 = MockURL.getHttpExample();
      fileHandler0.setURL(uRL0);
      String string0 = fileHandler0.getBasePath();
      ;
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      MockFile mockFile0 = new MockFile("file:y:", "file:y:");
      fileHandler0.setFile(mockFile0);
      String string0 = fileHandler0.getBasePath();
      ;
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      MockFile mockFile0 = new MockFile("file:y:", "file:y:");
      fileHandler0.setFile(mockFile0);
      String string0 = fileHandler0.getBasePath();
      ;
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Hashtable<String, XMLConfiguration> hashtable0 = new Hashtable<String, XMLConfiguration>();
      FileHandler fileHandler0 = FileHandler.fromMap(hashtable0);
      String string0 = fileHandler0.getBasePath();
      ;
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      PropertiesConfiguration propertiesConfiguration0 = new PropertiesConfiguration();
      FileHandler fileHandler0 = new FileHandler();
      FileHandler fileHandler1 = new FileHandler(propertiesConfiguration0, fileHandler0);
      PipedReader pipedReader0 = new PipedReader();
      FileHandlerListenerAdapter fileHandlerListenerAdapter0 = new FileHandlerListenerAdapter();
      fileHandler1.addFileHandlerListener(fileHandlerListenerAdapter0);
      try { 
        fileHandler1.load((Reader) pipedReader0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.configuration2.PropertiesConfigurationLayout", e);
      }
  }
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Hashtable<String, FileLocator> hashtable0 = new Hashtable<String, FileLocator>();
      FileHandler fileHandler0 = FileHandler.fromMap(hashtable0);
      // Undeclared exception!
      try { 
        fileHandler0.addFileHandlerListener((FileHandlerListener) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Listener must not be null!
         //
         verifyException("org.apache.commons.configuration2.io.FileHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileHandler fileHandler0 = FileHandler.fromMap((Map<String, ?>) null);
      fileHandler0.setFileName("file://");
      assertNotNull(fileHandler0.getEncoding());
}
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Hashtable<String, XMLConfiguration> hashtable0 = new Hashtable<String, XMLConfiguration>();
      FileHandler fileHandler0 = FileHandler.fromMap(hashtable0);
      fileHandler0.setFileName("..");
      File file0 = fileHandler0.getFile();
      assertNotNull(file0.toString());
}
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Hashtable<String, AQEnqueueOptions.VisibilityOption> hashtable0 = new Hashtable<String, AQEnqueueOptions.VisibilityOption>();
      FileHandler fileHandler0 = FileHandler.fromMap(hashtable0);
      fileHandler0.setFileName((String) null);
      assertNotNull(fileHandler0.getEncoding());
}
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      MockFile mockFile0 = new MockFile("file:y:", "file:y:");
      fileHandler0.setFile(mockFile0);
      String string0 = fileHandler0.getPath();
      ;
}
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      URL uRL0 = MockURL.getHttpExample();
      fileHandler0.setURL(uRL0);
      File file0 = fileHandler0.getFile();
      ;
}
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler((FileBased) null);
      String string0 = fileHandler0.getPath();
      ;
}
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FileHandler fileHandler0 = null;
      try {
        fileHandler0 = new FileHandler((FileBased) null, (FileHandler) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // FileHandler to assign must not be null!
         //
         verifyException("org.apache.commons.configuration2.io.FileHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      PropertiesConfiguration propertiesConfiguration0 = new PropertiesConfiguration();
      FileHandler fileHandler0 = new FileHandler(propertiesConfiguration0);
      RowOutputBinary180 rowOutputBinary180_0 = new RowOutputBinary180((-915), 3905);
      fileHandler0.save((OutputStream) rowOutputBinary180_0);
      ;
}
 @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      FileHandler fileHandler0 = new FileHandler(iNIConfiguration0);
      fileHandler0.setPath("\"");
      fileHandler0.save();
      File file0 = fileHandler0.getFile();
      ;
}
 @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      FileHandler fileHandler0 = new FileHandler(iNIConfiguration0);
      fileHandler0.setPath("\"");
      fileHandler0.save();
      File file0 = fileHandler0.getFile();
      assertNotNull(file0.toString());
}
 @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      fileHandler0.clearLocation();
      assertNotNull(fileHandler0.getEncoding());
}
 @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      // Undeclared exception!
      try { 
        fileHandler0.load((File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.configuration2.io.FileLocatorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      YAMLConfiguration yAMLConfiguration0 = new YAMLConfiguration();
      FileHandler fileHandler0 = new FileHandler(yAMLConfiguration0);
      try { 
        fileHandler0.load();
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Could not locate: FileLocator [basePath=null, encoding=null, fileName=null, fileSystem=null, locationStrategy=null, sourceURL=null, urlConnectionOptions=null]
         //
         verifyException("org.apache.commons.configuration2.io.FileLocatorUtils", e);
      }
  }
 @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      XMLPropertiesConfiguration xMLPropertiesConfiguration0 = new XMLPropertiesConfiguration();
      FileHandler fileHandler0 = new FileHandler(xMLPropertiesConfiguration0);
      FileLocationStrategy fileLocationStrategy0 = fileHandler0.getLocationStrategy();
      ;
}
 @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      INIConfiguration iNIConfiguration0 = new INIConfiguration();
      FileHandler fileHandler0 = new FileHandler(iNIConfiguration0);
      // Undeclared exception!
      try { 
        fileHandler0.save((URL) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }
 @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Hashtable<String, XMLConfiguration> hashtable0 = new Hashtable<String, XMLConfiguration>();
      FileHandler fileHandler0 = FileHandler.fromMap(hashtable0);
      try { 
        fileHandler0.save("orcle.jdbc.replay.OMacleDataSourceImpl");
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // No content available!
         //
         verifyException("org.apache.commons.configuration2.io.FileHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FileHandler fileHandler0 = FileHandler.fromMap((Map<String, ?>) null);
      FileSystem fileSystem0 = fileHandler0.getFileSystem();
      ;
}
 @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONConfiguration jSONConfiguration0 = new JSONConfiguration();
      FileHandler fileHandler0 = new FileHandler();
      FileHandler fileHandler1 = new FileHandler(jSONConfiguration0, fileHandler0);
      try { 
        fileHandler1.load((InputStream) null);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Unable to load the configuration
         //
         verifyException("org.apache.commons.configuration2.AbstractYAMLBasedConfiguration", e);
      }
  }
 @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      PropertiesConfiguration propertiesConfiguration0 = new PropertiesConfiguration();
      FileHandler fileHandler0 = new FileHandler(propertiesConfiguration0);
      // Undeclared exception!
      try { 
        fileHandler0.load((Reader) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }
 @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      XMLConfiguration xMLConfiguration0 = new XMLConfiguration();
      FileHandler fileHandler0 = new FileHandler(xMLConfiguration0);
      MockFile mockFile0 = new MockFile(":9F:pOQpMVb}m# `");
      fileHandler0.save((File) mockFile0);
      ;
}
 @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      MergeCombiner mergeCombiner0 = new MergeCombiner();
      DynamicCombinedConfiguration dynamicCombinedConfiguration0 = new DynamicCombinedConfiguration(mergeCombiner0);
      PatternSubtreeConfigurationWrapper patternSubtreeConfigurationWrapper0 = new PatternSubtreeConfigurationWrapper(dynamicCombinedConfiguration0, "");
      FileHandler fileHandler0 = new FileHandler(patternSubtreeConfigurationWrapper0);
      // Undeclared exception!
      try { 
        fileHandler0.save((OutputStream) null, "@mR8U=w$");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }
 @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DynamicCombinedConfiguration dynamicCombinedConfiguration0 = new DynamicCombinedConfiguration();
      JSONConfiguration jSONConfiguration0 = new JSONConfiguration(dynamicCombinedConfiguration0);
      FileHandler fileHandler0 = new FileHandler(jSONConfiguration0);
      try { 
        fileHandler0.load((URL) null);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Unable to load the configuration from the URL null
         //
         verifyException("org.apache.commons.configuration2.io.DefaultFileSystem", e);
      }
  }
 @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      YAMLConfiguration yAMLConfiguration0 = new YAMLConfiguration();
      FileHandler fileHandler0 = new FileHandler(yAMLConfiguration0);
      boolean boolean0 = fileHandler0.isLocationDefined();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      fileHandler0.setBasePath("file:y:");
      ;
}
 @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      BasePathLocationStrategy basePathLocationStrategy0 = new BasePathLocationStrategy();
      fileHandler0.setLocationStrategy(basePathLocationStrategy0);
      assertNotNull(fileHandler0.getEncoding());
}
 @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      URL uRL0 = MockURL.getFtpExample();
      URLConnectionOptions uRLConnectionOptions0 = URLConnectionOptions.DEFAULT;
      fileHandler0.setURL(uRL0, uRLConnectionOptions0);
      String string0 = fileHandler0.getFileName();
      ;
}
}
