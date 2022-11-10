/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 17:12:25 GMT 2022
 */

package spark.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.utils.Assert;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Assert_ESTest extends Assert_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Assert.notNull((Object) "=", "");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        Assert.notNull((Object) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.utils.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Assert.state(false, "[Assertion failed] - this argument is required; it must not be null");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // [Assertion failed] - this argument is required; it must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Assert.state(true, "M");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Assert.notEmpty((Object[]) null, "<4x._*wU$'UPF4");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // <4x._*wU$'UPF4
         //
         verifyException("spark.utils.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      Assert.notEmpty(objectArray0, "");
      assertEquals(3, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Assert.hasLength("", "V2mp.kwp]-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // V2mp.kwp]-
         //
         verifyException("spark.utils.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Assert.hasLength("8uX ,6v", "8uX ,6v");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Assert.notNull((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // [Assertion failed] - this argument is required; it must not be null
         //
         verifyException("spark.utils.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Assert.isTrue(false, "R9J$9lbH7GJ=9H");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // R9J$9lbH7GJ=9H
         //
         verifyException("spark.utils.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Assert.isTrue(true, "M");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Assert.notNull((Object) "M");
  }
}
