/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 05:13:11 GMT 2022
 */

package org.apache.commons.vfs2.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.vfs2.util.URIUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class URIUtils_ESTest extends URIUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = URIUtils.encodePath("", "data may not be null");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = URIUtils.encodePath(">#w");
      assertEquals("%3E%23w", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = URIUtils.encodePath("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        URIUtils.encodePath((String) null, "/~vZ40]?9U0G0avO#em");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The string to encode may not be null.
         //
         verifyException("org.apache.commons.vfs2.util.URIUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = URIUtils.encodePath("5p9MO^XC", " ^M@");
      assertEquals("5p9MO%5EXC", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        URIUtils.encodePath("The Hiearchy.overrideAsNeeded method has been deprecated.", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset may not be null or empty
         //
         verifyException("org.apache.commons.vfs2.util.URIUtils$EncodingUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        URIUtils.encodePath((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The string to encode may not be null.
         //
         verifyException("org.apache.commons.vfs2.util.URIUtils", e);
      }
  }
}
