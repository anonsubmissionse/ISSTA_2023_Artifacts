/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 21:59:34 GMT 2022
 */

package org.apache.commons.jcs3.auxiliary.disk;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.commons.jcs3.auxiliary.disk.behavior.IDiskCacheAttributes;
import org.apache.commons.jcs3.auxiliary.disk.block.BlockDiskCacheAttributes;
import org.apache.commons.jcs3.auxiliary.disk.indexed.IndexedDiskCacheAttributes;
import org.apache.commons.jcs3.auxiliary.disk.jdbc.JDBCDiskCacheAttributes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractDiskCacheAttributes_ESTest extends AbstractDiskCacheAttributes_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      assertFalse(jDBCDiskCacheAttributes0.isAllowRemoveAll());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      jDBCDiskCacheAttributes0.setAllowRemoveAll(false);
      boolean boolean0 = jDBCDiskCacheAttributes0.isAllowRemoveAll();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IndexedDiskCacheAttributes indexedDiskCacheAttributes0 = new IndexedDiskCacheAttributes();
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IndexedDiskCacheAttributes indexedDiskCacheAttributes0 = new IndexedDiskCacheAttributes();
      indexedDiskCacheAttributes0.setShutdownSpoolTimeLimit(0);
      int int0 = indexedDiskCacheAttributes0.getShutdownSpoolTimeLimit();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      jDBCDiskCacheAttributes0.setShutdownSpoolTimeLimit((-551));
      int int0 = jDBCDiskCacheAttributes0.getShutdownSpoolTimeLimit();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      assertEquals(0, blockDiskCacheAttributes0.getMaxPurgatorySize());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      blockDiskCacheAttributes0.setMaxPurgatorySize(0);
      int int0 = blockDiskCacheAttributes0.getMaxPurgatorySize();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      blockDiskCacheAttributes0.setMaxPurgatorySize((-199));
      int int0 = blockDiskCacheAttributes0.getMaxPurgatorySize();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      IndexedDiskCacheAttributes indexedDiskCacheAttributes0 = new IndexedDiskCacheAttributes();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("IndexedDiskCacheAttributes \n diskPath = null\n maxPurgatorySize   = 5000\n maxKeySize  = 5000\n optimizeAtRemoveCount  = -1\n shutdownSpoolTimeLimit  = 60\n optimizeOnShutdown  = true\n clearDiskOnStartup  = false");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "IndexedDiskCacheAttributes \n diskPath = null\n maxPurgatorySize   = 5000\n maxKeySize  = 5000\n optimizeAtRemoveCount  = -1\n shutdownSpoolTimeLimit  = 60\n optimizeOnShutdown  = true\n clearDiskOnStartup  = false");
      MockFile mockFile0 = new MockFile("IndexedDiskCacheAttributes \n diskPath = null\n maxPurgatorySize   = 5000\n maxKeySize  = 5000\n optimizeAtRemoveCount  = -1\n shutdownSpoolTimeLimit  = 60\n optimizeOnShutdown  = true\n clearDiskOnStartup  = false");
      indexedDiskCacheAttributes0.setDiskPath((File) mockFile0);
      indexedDiskCacheAttributes0.getDiskPath();
      assertTrue(indexedDiskCacheAttributes0.isAllowRemoveAll());
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      IndexedDiskCacheAttributes indexedDiskCacheAttributes0 = new IndexedDiskCacheAttributes();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("IndexedDiskCacheAttributes \n diskPath = null\n maxPurgatorySize   = 5000\n maxKeySize  = 5000\n optimizeAtRemoveCount  = -1\n shutdownSpoolTimeLimit  = 60\n optimizeOnShutdown  = true\n clearDiskOnStartup  = false");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "IndexedDiskCacheAttributes \n diskPath = null\n maxPurgatorySize   = 5000\n maxKeySize  = 5000\n optimizeAtRemoveCount  = -1\n shutdownSpoolTimeLimit  = 60\n optimizeOnShutdown  = true\n clearDiskOnStartup  = false");
      MockFile mockFile0 = new MockFile("IndexedDiskCacheAttributes \n diskPath = null\n maxPurgatorySize   = 5000\n maxKeySize  = 5000\n optimizeAtRemoveCount  = -1\n shutdownSpoolTimeLimit  = 60\n optimizeOnShutdown  = true\n clearDiskOnStartup  = false");
      indexedDiskCacheAttributes0.setDiskPath((File) mockFile0);
      indexedDiskCacheAttributes0.getDiskPath();
      assertEquals(0, indexedDiskCacheAttributes0.getMaxPurgatorySize());
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IndexedDiskCacheAttributes indexedDiskCacheAttributes0 = new IndexedDiskCacheAttributes();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("IndexedDiskCacheAttributes \n diskPath = null\n maxPurgatorySize   = 5000\n maxKeySize  = 5000\n optimizeAtRemoveCount  = -1\n shutdownSpoolTimeLimit  = 60\n optimizeOnShutdown  = true\n clearDiskOnStartup  = false");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "IndexedDiskCacheAttributes \n diskPath = null\n maxPurgatorySize   = 5000\n maxKeySize  = 5000\n optimizeAtRemoveCount  = -1\n shutdownSpoolTimeLimit  = 60\n optimizeOnShutdown  = true\n clearDiskOnStartup  = false");
      MockFile mockFile0 = new MockFile("IndexedDiskCacheAttributes \n diskPath = null\n maxPurgatorySize   = 5000\n maxKeySize  = 5000\n optimizeAtRemoveCount  = -1\n shutdownSpoolTimeLimit  = 60\n optimizeOnShutdown  = true\n clearDiskOnStartup  = false");
      indexedDiskCacheAttributes0.setDiskPath((File) mockFile0);
      indexedDiskCacheAttributes0.getDiskPath();
      assertEquals(0, indexedDiskCacheAttributes0.getShutdownSpoolTimeLimit());
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      blockDiskCacheAttributes0.setDiskPath(".Br]LEmg0");
      File file0 = blockDiskCacheAttributes0.getDiskPath();
      assertEquals(0, blockDiskCacheAttributes0.getMaxPurgatorySize());
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      blockDiskCacheAttributes0.setDiskPath(".Br]LEmg0");
      File file0 = blockDiskCacheAttributes0.getDiskPath();
      assertEquals(0, blockDiskCacheAttributes0.getShutdownSpoolTimeLimit());
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      blockDiskCacheAttributes0.setDiskPath(".Br]LEmg0");
      File file0 = blockDiskCacheAttributes0.getDiskPath();
      assertTrue(blockDiskCacheAttributes0.isAllowRemoveAll());
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      blockDiskCacheAttributes0.setDiskPath(".Br]LEmg0");
      File file0 = blockDiskCacheAttributes0.getDiskPath();
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      File file0 = MockFile.createTempFile("MJ);V3Y=Jp(QfOQ{y", "wn$3J?pIm}Vra");
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      blockDiskCacheAttributes0.setDiskPath(file0);
      blockDiskCacheAttributes0.getDiskPath();
      assertEquals(0, blockDiskCacheAttributes0.getMaxPurgatorySize());
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      File file0 = MockFile.createTempFile("MJ);V3Y=Jp(QfOQ{y", "wn$3J?pIm}Vra");
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      blockDiskCacheAttributes0.setDiskPath(file0);
      blockDiskCacheAttributes0.getDiskPath();
      assertEquals(0, blockDiskCacheAttributes0.getShutdownSpoolTimeLimit());
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      File file0 = MockFile.createTempFile("MJ);V3Y=Jp(QfOQ{y", "wn$3J?pIm}Vra");
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      blockDiskCacheAttributes0.setDiskPath(file0);
      blockDiskCacheAttributes0.getDiskPath();
      assertTrue(blockDiskCacheAttributes0.isAllowRemoveAll());
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile((File) null, "jcs");
      jDBCDiskCacheAttributes0.setDiskPath((File) mockFile0);
      jDBCDiskCacheAttributes0.getDiskPath();
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile((File) null, "jcs");
      jDBCDiskCacheAttributes0.setDiskPath((File) mockFile0);
      jDBCDiskCacheAttributes0.getDiskPath();
      assertEquals(0, jDBCDiskCacheAttributes0.getMaxPurgatorySize());
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile((File) null, "jcs");
      jDBCDiskCacheAttributes0.setDiskPath((File) mockFile0);
      jDBCDiskCacheAttributes0.getDiskPath();
      assertTrue(jDBCDiskCacheAttributes0.isAllowRemoveAll());
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      jDBCDiskCacheAttributes0.setDiskLimitType((IDiskCacheAttributes.DiskLimitType) null);
      jDBCDiskCacheAttributes0.getDiskLimitType();
      assertEquals(0, jDBCDiskCacheAttributes0.getMaxPurgatorySize());
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      jDBCDiskCacheAttributes0.setDiskLimitType((IDiskCacheAttributes.DiskLimitType) null);
      jDBCDiskCacheAttributes0.getDiskLimitType();
      assertTrue(jDBCDiskCacheAttributes0.isAllowRemoveAll());
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      jDBCDiskCacheAttributes0.setDiskLimitType((IDiskCacheAttributes.DiskLimitType) null);
      jDBCDiskCacheAttributes0.getDiskLimitType();
      assertEquals(0, jDBCDiskCacheAttributes0.getShutdownSpoolTimeLimit());
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IndexedDiskCacheAttributes indexedDiskCacheAttributes0 = new IndexedDiskCacheAttributes();
      // Undeclared exception!
      try { 
        indexedDiskCacheAttributes0.setDiskPath((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      // Undeclared exception!
      try { 
        blockDiskCacheAttributes0.setDiskPath((File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCacheAttributes", e);
      }
  }
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IndexedDiskCacheAttributes indexedDiskCacheAttributes0 = new IndexedDiskCacheAttributes();
      MockFile mockFile0 = new MockFile("", "");
      indexedDiskCacheAttributes0.setDiskPath((File) mockFile0);
      indexedDiskCacheAttributes0.getDiskPath();
      ;
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IndexedDiskCacheAttributes indexedDiskCacheAttributes0 = new IndexedDiskCacheAttributes();
      MockFile mockFile0 = new MockFile("", "");
      indexedDiskCacheAttributes0.setDiskPath((File) mockFile0);
      indexedDiskCacheAttributes0.getDiskPath();
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IndexedDiskCacheAttributes indexedDiskCacheAttributes0 = new IndexedDiskCacheAttributes();
      MockFile mockFile0 = new MockFile("", "");
      indexedDiskCacheAttributes0.setDiskPath((File) mockFile0);
      indexedDiskCacheAttributes0.getDiskPath();
      assertEquals(0, indexedDiskCacheAttributes0.getMaxPurgatorySize());
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      int int0 = blockDiskCacheAttributes0.getShutdownSpoolTimeLimit();
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      int int0 = blockDiskCacheAttributes0.getShutdownSpoolTimeLimit();
      assertTrue(blockDiskCacheAttributes0.isAllowRemoveAll());
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      int int0 = blockDiskCacheAttributes0.getShutdownSpoolTimeLimit();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      boolean boolean0 = jDBCDiskCacheAttributes0.isAllowRemoveAll();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      boolean boolean0 = jDBCDiskCacheAttributes0.isAllowRemoveAll();
      assertEquals(0, jDBCDiskCacheAttributes0.getMaxPurgatorySize());
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      boolean boolean0 = jDBCDiskCacheAttributes0.isAllowRemoveAll();
      assertEquals(0, jDBCDiskCacheAttributes0.getShutdownSpoolTimeLimit());
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      jDBCDiskCacheAttributes0.getDiskPath();
      assertTrue(jDBCDiskCacheAttributes0.isAllowRemoveAll());
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      jDBCDiskCacheAttributes0.getDiskPath();
      assertEquals(0, jDBCDiskCacheAttributes0.getMaxPurgatorySize());
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      jDBCDiskCacheAttributes0.getDiskPath();
      assertEquals(0, jDBCDiskCacheAttributes0.getShutdownSpoolTimeLimit());
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      int int0 = blockDiskCacheAttributes0.getMaxPurgatorySize();
      ;
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      int int0 = blockDiskCacheAttributes0.getMaxPurgatorySize();
      ;
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      int int0 = blockDiskCacheAttributes0.getMaxPurgatorySize();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      // Undeclared exception!
      try { 
        jDBCDiskCacheAttributes0.setDiskLimitTypeName("jcs");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.apache.commons.jcs3.auxiliary.disk.behavior.IDiskCacheAttributes.DiskLimitType.jcs
         //
         verifyException("java.lang.Enum", e);
      }
  }
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      blockDiskCacheAttributes0.setDiskLimitTypeName((String) null);
      assertEquals(0, blockDiskCacheAttributes0.getMaxPurgatorySize());
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      blockDiskCacheAttributes0.setDiskLimitTypeName((String) null);
      assertTrue(blockDiskCacheAttributes0.isAllowRemoveAll());
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BlockDiskCacheAttributes blockDiskCacheAttributes0 = new BlockDiskCacheAttributes();
      blockDiskCacheAttributes0.setDiskLimitTypeName((String) null);
      assertEquals(0, blockDiskCacheAttributes0.getShutdownSpoolTimeLimit());
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IndexedDiskCacheAttributes indexedDiskCacheAttributes0 = new IndexedDiskCacheAttributes();
      indexedDiskCacheAttributes0.getDiskLimitType();
      ;
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IndexedDiskCacheAttributes indexedDiskCacheAttributes0 = new IndexedDiskCacheAttributes();
      indexedDiskCacheAttributes0.getDiskLimitType();
      assertEquals(0, indexedDiskCacheAttributes0.getMaxPurgatorySize());
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IndexedDiskCacheAttributes indexedDiskCacheAttributes0 = new IndexedDiskCacheAttributes();
      indexedDiskCacheAttributes0.getDiskLimitType();
      assertEquals(0, indexedDiskCacheAttributes0.getShutdownSpoolTimeLimit());
}
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      String string0 = jDBCDiskCacheAttributes0.toString();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      String string0 = jDBCDiskCacheAttributes0.toString();
      assertEquals(0, jDBCDiskCacheAttributes0.getMaxPurgatorySize());
}
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JDBCDiskCacheAttributes jDBCDiskCacheAttributes0 = new JDBCDiskCacheAttributes();
      String string0 = jDBCDiskCacheAttributes0.toString();
      assertEquals(0, jDBCDiskCacheAttributes0.getShutdownSpoolTimeLimit());
}
}
