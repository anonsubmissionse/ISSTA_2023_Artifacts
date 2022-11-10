/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 18:13:33 GMT 2022
 */

package org.apache.commons.jexl3.internal.introspection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import org.apache.commons.jexl3.internal.introspection.FieldGetExecutor;
import org.apache.commons.jexl3.internal.introspection.Introspector;
import org.apache.commons.jexl3.introspection.JexlPropertyGet;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Jdk14Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldGetExecutor_ESTest extends FieldGetExecutor_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        FieldGetExecutor.discover((Introspector) null, class0, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.internal.introspection.FieldGetExecutor", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Introspector introspector0 = new Introspector((Log) null, classLoader0);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        FieldGetExecutor.discover(introspector0, class0, ":x:,'7f1,,t09F_^V");
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
      Jdk14Logger jdk14Logger0 = new Jdk14Logger("5");
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Introspector introspector0 = new Introspector(jdk14Logger0, classLoader0);
      Class<Object> class0 = Object.class;
      JexlPropertyGet jexlPropertyGet0 = FieldGetExecutor.discover(introspector0, class0, "5");
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Jdk14Logger jdk14Logger0 = new Jdk14Logger("5");
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Introspector introspector0 = new Introspector(jdk14Logger0, classLoader0);
      Class<Object> class0 = Object.class;
      JexlPropertyGet jexlPropertyGet0 = FieldGetExecutor.discover(introspector0, class0, (String) null);
      ;
}
}
