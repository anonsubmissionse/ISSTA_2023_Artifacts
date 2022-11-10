/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 17:50:42 GMT 2022
 */

package org.apache.commons.jexl3.internal.introspection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.apache.commons.jexl3.internal.introspection.Permissions;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Permissions_ESTest extends Permissions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Permissions permissions0 = Permissions.DEFAULT;
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = permissions0.allow(class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Permissions permissions0 = Permissions.DEFAULT;
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        permissions0.allow(class0, (Method) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.internal.introspection.Permissions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Permissions permissions0 = new Permissions();
      boolean boolean0 = permissions0.allow((Class<?>) null, (Method) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Permissions permissions0 = Permissions.DEFAULT;
      Class<String> class0 = String.class;
      boolean boolean0 = permissions0.allow(class0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Permissions permissions0 = new Permissions();
      boolean boolean0 = permissions0.allow((Class<?>) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Permissions permissions0 = Permissions.DEFAULT;
      boolean boolean0 = permissions0.allow((Method) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Permissions permissions0 = new Permissions();
      boolean boolean0 = permissions0.allow((Field) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Permissions permissions0 = Permissions.DEFAULT;
      boolean boolean0 = permissions0.allow((Constructor<?>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Permissions permissions0 = new Permissions();
      boolean boolean0 = permissions0.allow((Class<?>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Permissions permissions0 = Permissions.DEFAULT;
      Class<String> class0 = String.class;
      boolean boolean0 = permissions0.DEFAULT.allow(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Permissions permissions0 = new Permissions();
      boolean boolean0 = permissions0.allow((Package) null);
      assertFalse(boolean0);
  }
}
