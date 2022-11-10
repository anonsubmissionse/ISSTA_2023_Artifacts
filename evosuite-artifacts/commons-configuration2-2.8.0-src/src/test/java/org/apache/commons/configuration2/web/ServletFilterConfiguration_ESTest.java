/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 01:10:27 GMT 2022
 */

package org.apache.commons.configuration2.web;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.mockobjects.servlet.MockFilterConfig;
import javax.servlet.FilterConfig;
import org.apache.commons.configuration2.web.ServletFilterConfiguration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ServletFilterConfiguration_ESTest extends ServletFilterConfiguration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFilterConfig mockFilterConfig0 = new MockFilterConfig();
      ServletFilterConfiguration servletFilterConfiguration0 = new ServletFilterConfiguration(mockFilterConfig0);
      Object object0 = servletFilterConfiguration0.getPropertyInternal((String) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ServletFilterConfiguration servletFilterConfiguration0 = new ServletFilterConfiguration((FilterConfig) null);
      // Undeclared exception!
      try { 
        servletFilterConfiguration0.getPropertyInternal("oracle.jdbc.plsqlVarcharParameter4KOnly");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.configuration2.web.ServletFilterConfiguration", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockFilterConfig mockFilterConfig0 = new MockFilterConfig();
      ServletFilterConfiguration servletFilterConfiguration0 = new ServletFilterConfiguration(mockFilterConfig0);
      // Undeclared exception!
      try { 
        servletFilterConfiguration0.getKeysInternal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }
}
