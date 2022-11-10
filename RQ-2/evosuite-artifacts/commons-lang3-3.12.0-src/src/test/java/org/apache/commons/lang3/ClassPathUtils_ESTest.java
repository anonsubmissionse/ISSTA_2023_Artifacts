/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:24:44 GMT 2022
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import org.apache.commons.lang3.ClassPathUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassPathUtils_ESTest extends ClassPathUtils_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        ClassPathUtils.toFullyQualifiedPath(class0, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // resourceName
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        ClassPathUtils.toFullyQualifiedName(class0, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // resourceName
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassPathUtils.toFullyQualifiedPath((Package) null, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // context
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassPathUtils.toFullyQualifiedName((Package) null, "blank_blank_blank_2014");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // context
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassPathUtils classPathUtils0 = new ClassPathUtils();
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      String string0 = ClassPathUtils.toFullyQualifiedName(class0, "java/lang/annotation/=E]");
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      String string0 = ClassPathUtils.toFullyQualifiedPath(class0, "=E]");
      ;
}
}
