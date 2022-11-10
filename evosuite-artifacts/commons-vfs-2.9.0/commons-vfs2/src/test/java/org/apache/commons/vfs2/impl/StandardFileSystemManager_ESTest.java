/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 04:08:49 GMT 2022
 */

package org.apache.commons.vfs2.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.URL;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.commons.vfs2.CacheStrategy;
import org.apache.commons.vfs2.impl.DefaultFileReplicator;
import org.apache.commons.vfs2.impl.StandardFileSystemManager;
import org.apache.hadoop.util.Daemon;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StandardFileSystemManager_ESTest extends StandardFileSystemManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StandardFileSystemManager standardFileSystemManager0 = new StandardFileSystemManager();
      standardFileSystemManager0.configurePlugins();
      assertNull(standardFileSystemManager0.getCacheStrategy());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StandardFileSystemManager standardFileSystemManager0 = new StandardFileSystemManager();
      standardFileSystemManager0.setConfiguration("http://java.sun.com/xml/stream/properties/implementation-name");
      assertNull(standardFileSystemManager0.getCacheStrategy());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StandardFileSystemManager standardFileSystemManager0 = new StandardFileSystemManager();
      DefaultFileReplicator defaultFileReplicator0 = standardFileSystemManager0.createDefaultFileReplicator();
      assertNotNull(defaultFileReplicator0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StandardFileSystemManager standardFileSystemManager0 = new StandardFileSystemManager();
      standardFileSystemManager0.setLogger((Log) null);
      // Undeclared exception!
      try { 
        standardFileSystemManager0.setConfiguration("J7b8H");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.vfs2.impl.StandardFileSystemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StandardFileSystemManager standardFileSystemManager0 = new StandardFileSystemManager();
      Log4JLogger log4JLogger0 = new Log4JLogger();
      standardFileSystemManager0.setLogger(log4JLogger0);
      // Undeclared exception!
      try { 
        standardFileSystemManager0.setConfiguration("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.log4j.CategoryKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StandardFileSystemManager standardFileSystemManager0 = new StandardFileSystemManager();
      Log4JLogger log4JLogger0 = new Log4JLogger();
      standardFileSystemManager0.setLogger(log4JLogger0);
      // Undeclared exception!
      try { 
        standardFileSystemManager0.init();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.log4j.CategoryKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StandardFileSystemManager standardFileSystemManager0 = new StandardFileSystemManager();
      URL uRL0 = MockURL.getHttpExample();
      standardFileSystemManager0.setConfiguration(uRL0);
      try { 
        standardFileSystemManager0.init();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not load VFS configuration from \"http://www.someFakeButWellFormedURL.org/fooExample\".
         //
         verifyException("org.apache.commons.vfs2.impl.StandardFileSystemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StandardFileSystemManager standardFileSystemManager0 = new StandardFileSystemManager();
      standardFileSystemManager0.init();
      try { 
        standardFileSystemManager0.init();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not load VFS configuration from \"file:/home/ISSTA_USER/Documents/toga-evaluation/toga-eval-issta-2023/artifacts/commons-vfs-2.9.0/commons-vfs2/target/classes/org/apache/commons/vfs2/impl/providers.xml\".
         //
         verifyException("org.apache.commons.vfs2.impl.StandardFileSystemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StandardFileSystemManager standardFileSystemManager0 = new StandardFileSystemManager();
      Daemon.DaemonFactory daemon_DaemonFactory0 = new Daemon.DaemonFactory();
      ClassLoader classLoader0 = daemon_DaemonFactory0.getContextClassLoader();
      standardFileSystemManager0.setClassLoader(classLoader0);
      standardFileSystemManager0.init();
      assertEquals(CacheStrategy.ON_RESOLVE, standardFileSystemManager0.getCacheStrategy());
  }
}
