/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 18:09:18 GMT 2022
 */

package org.apache.commons.jexl3.internal.introspection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import org.apache.commons.jexl3.internal.introspection.DuckGetExecutor;
import org.apache.commons.jexl3.internal.introspection.Introspector;
import org.apache.commons.jexl3.internal.introspection.Permissions;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.SimpleLog;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DuckGetExecutor_ESTest extends DuckGetExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        DuckGetExecutor.discover((Introspector) null, class0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.internal.introspection.DuckGetExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Introspector introspector0 = new Introspector((Log) null, classLoader0);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        DuckGetExecutor.discover(introspector0, class0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.internal.introspection.ClassMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Permissions permissions0 = new Permissions();
      SimpleLog simpleLog0 = new SimpleLog("<jgc`k^>~%?");
      Class<Annotation> class0 = Annotation.class;
      Introspector introspector0 = new Introspector(simpleLog0, classLoader0, permissions0);
      DuckGetExecutor duckGetExecutor0 = DuckGetExecutor.discover(introspector0, class0, simpleLog0);
      assertNull(duckGetExecutor0);
  }
}
