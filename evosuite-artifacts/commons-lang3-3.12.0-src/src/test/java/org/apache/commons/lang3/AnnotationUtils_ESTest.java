/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 18:01:29 GMT 2022
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import org.apache.commons.lang3.AnnotationUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnnotationUtils_ESTest extends AnnotationUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Annotation annotation0 = mock(Annotation.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(annotation0).toString();
      doReturn((Class) null).when(annotation0).annotationType();
      Annotation annotation1 = mock(Annotation.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(annotation1).annotationType();
      // Undeclared exception!
      try { 
        AnnotationUtils.equals(annotation0, annotation1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Annotation null with null annotationType()
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        AnnotationUtils.hashCode((Annotation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.AnnotationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<String> class0 = String.class;
      boolean boolean0 = AnnotationUtils.isValidAnnotationMemberType(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = AnnotationUtils.isValidAnnotationMemberType(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = AnnotationUtils.isValidAnnotationMemberType((Class<?>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Annotation annotation0 = mock(Annotation.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(annotation0).annotationType();
      // Undeclared exception!
      try { 
        AnnotationUtils.hashCode(annotation0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Annotation annotation0 = mock(Annotation.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(annotation0).annotationType();
      Annotation annotation1 = mock(Annotation.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(annotation1).annotationType();
      boolean boolean0 = AnnotationUtils.equals(annotation0, annotation1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Annotation annotation0 = mock(Annotation.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = AnnotationUtils.equals((Annotation) null, annotation0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = AnnotationUtils.equals((Annotation) null, (Annotation) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Annotation annotation0 = mock(Annotation.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = AnnotationUtils.equals(annotation0, (Annotation) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Annotation annotation0 = mock(Annotation.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(annotation0).toString();
      doReturn(class0, (Class) null).when(annotation0).annotationType();
      String string0 = AnnotationUtils.toString(annotation0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Annotation annotation0 = mock(Annotation.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(annotation0).annotationType();
      // Undeclared exception!
      try { 
        AnnotationUtils.toString(annotation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AnnotationUtils annotationUtils0 = new AnnotationUtils();
  }
}
