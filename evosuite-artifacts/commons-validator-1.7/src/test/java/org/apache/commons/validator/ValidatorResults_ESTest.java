/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:51:20 GMT 2022
 */

package org.apache.commons.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.commons.validator.Field;
import org.apache.commons.validator.ValidatorAction;
import org.apache.commons.validator.ValidatorResult;
import org.apache.commons.validator.ValidatorResults;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ValidatorResults_ESTest extends ValidatorResults_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      Field field0 = new Field();
      validatorResults0.add(field0, "[]", true);
      ValidatorResult validatorResult0 = validatorResults0.getValidatorResult((String) null);
      assertNotNull(validatorResult0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      // Undeclared exception!
      try { 
        validatorResults0.merge((ValidatorResults) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Field field0 = new Field();
      HashMap<String, ValidatorAction> hashMap0 = new HashMap<String, ValidatorAction>();
      ValidatorResults validatorResults0 = field0.validate((Map<String, Object>) null, hashMap0);
      validatorResults0.hResults = null;
      // Undeclared exception!
      try { 
        validatorResults0.isEmpty();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      validatorResults0.hResults = null;
      // Undeclared exception!
      try { 
        validatorResults0.getValidatorResult((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      HashMap<String, ValidatorResult> hashMap0 = new HashMap<String, ValidatorResult>();
      validatorResults0.hResults = (Map<String, ValidatorResult>) hashMap0;
      hashMap0.put((String) null, (ValidatorResult) null);
      // Undeclared exception!
      try { 
        validatorResults0.getResultValueMap();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      HashMap<String, ValidatorResult> hashMap0 = new HashMap<String, ValidatorResult>();
      validatorResults0.hResults = (Map<String, ValidatorResult>) hashMap0;
      validatorResults0.hResults = null;
      // Undeclared exception!
      try { 
        validatorResults0.getPropertyNames();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      validatorResults0.hResults = null;
      // Undeclared exception!
      try { 
        validatorResults0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        validatorResults0.add((Field) null, "aqBH,<^v^*Q23k(4", false, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      ValidatorResult validatorResult0 = validatorResults0.getValidatorResult(".np4>m1W{6j1H}SaPC");
      assertNull(validatorResult0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      Field field0 = new Field();
      Boolean boolean0 = Boolean.valueOf("[]");
      validatorResults0.add(field0, "[]", false, (Object) boolean0);
      Map<String, Object> map0 = validatorResults0.getResultValueMap();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      Field field0 = new Field();
      validatorResults0.add(field0, "[]", false);
      Map<String, Object> map0 = validatorResults0.getResultValueMap();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      Field field0 = new Field();
      validatorResults0.add(field0, "[]", true, (Object) field0);
      Map<String, Object> map0 = validatorResults0.getResultValueMap();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      boolean boolean0 = validatorResults0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      assertTrue(validatorResults0.isEmpty());
      
      Field field0 = new Field();
      validatorResults0.add(field0, "[]", true, (Object) field0);
      boolean boolean0 = validatorResults0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      Field field0 = new Field();
      validatorResults0.add(field0, "[]", false);
      Boolean boolean0 = Boolean.valueOf("[]");
      validatorResults0.add(field0, "[]", false, (Object) boolean0);
      assertNull(field0.getIndexedProperty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      validatorResults0.clear();
      assertTrue(validatorResults0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      // Undeclared exception!
      try { 
        validatorResults0.add((Field) null, "  key=", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      validatorResults0.merge(validatorResults0);
      assertTrue(validatorResults0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ValidatorResults validatorResults0 = new ValidatorResults();
      Set<String> set0 = validatorResults0.getPropertyNames();
      assertEquals(0, set0.size());
  }
}
