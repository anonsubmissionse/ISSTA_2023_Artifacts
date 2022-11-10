/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:53:36 GMT 2022
 */

package org.apache.commons.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.validator.Field;
import org.apache.commons.validator.ValidatorResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ValidatorResult_ESTest extends ValidatorResult_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ValidatorResult validatorResult0 = new ValidatorResult((Field) null);
      validatorResult0.add("org.apache.commons.collections.FastHashMap", true);
      boolean boolean0 = validatorResult0.isValid("org.apache.commons.collections.FastHashMap");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      Object object0 = new Object();
      validatorResult0.add("[]", true, object0);
      Object object1 = validatorResult0.getResult("[]");
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      field0.setIndexedListProperty("#yMIq@'H@m`@%R6X}d");
      Field field1 = validatorResult0.getField();
      assertFalse(field1.isIndexed());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      field0.setPage(1805);
      Field field1 = validatorResult0.getField();
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      field0.setPage((-1442));
      Field field1 = validatorResult0.getField();
      assertFalse(field1.isClientValidation());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      Field field1 = validatorResult0.getField();
      field1.clientValidation = false;
      Field field2 = validatorResult0.getField();
      assertFalse(field2.isIndexed());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Field field0 = new Field();
      field0.fieldOrder = 1;
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      Field field1 = validatorResult0.getField();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      field0.setFieldOrder((-1442));
      Field field1 = validatorResult0.getField();
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ValidatorResult validatorResult0 = new ValidatorResult((Field) null);
      validatorResult0.hAction = null;
      // Undeclared exception!
      try { 
        validatorResult0.isValid((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResult", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      validatorResult0.hAction = null;
      // Undeclared exception!
      try { 
        validatorResult0.getResult("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResult", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      validatorResult0.hAction = null;
      // Undeclared exception!
      try { 
        validatorResult0.getActions();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      validatorResult0.hAction = null;
      // Undeclared exception!
      try { 
        validatorResult0.getActionMap();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      validatorResult0.hAction = null;
      // Undeclared exception!
      try { 
        validatorResult0.containsAction("Cannot call setJsFunction() after calling setJavascript()");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ValidatorResult validatorResult0 = new ValidatorResult((Field) null);
      Map<String, ValidatorResult.ResultStatus> map0 = validatorResult0.getActionMap();
      ValidatorResult validatorResult1 = new ValidatorResult((Field) null);
      validatorResult1.hAction = map0;
      // Undeclared exception!
      try { 
        validatorResult1.add("IL,EvsaUx|M.8j^s/:", true, (Object) "^pLK'|\"VVv9!");
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      validatorResult0.hAction = null;
      // Undeclared exception!
      try { 
        validatorResult0.add("s+i|=X/ut", false, (Object) "[]");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResult", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      validatorResult0.hAction = null;
      // Undeclared exception!
      try { 
        validatorResult0.add((String) null, false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResult", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ValidatorResult.ResultStatus validatorResult_ResultStatus0 = new ValidatorResult.ResultStatus(false, (Object) null);
      validatorResult_ResultStatus0.getResult();
      assertTrue(validatorResult_ResultStatus0.isValid());
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ValidatorResult.ResultStatus validatorResult_ResultStatus0 = new ValidatorResult.ResultStatus(true, (Object) null);
      boolean boolean0 = validatorResult_ResultStatus0.isValid();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      Object object0 = validatorResult0.getResult("[]");
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ValidatorResult validatorResult0 = new ValidatorResult((Field) null);
      boolean boolean0 = validatorResult0.isValid("l8~D'E-");
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ValidatorResult validatorResult0 = new ValidatorResult((Field) null);
      validatorResult0.add((String) null, false);
      boolean boolean0 = validatorResult0.containsAction((String) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      boolean boolean0 = validatorResult0.containsAction("[]");
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ValidatorResult validatorResult0 = new ValidatorResult((Field) null);
      Field field0 = validatorResult0.getField();
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ValidatorResult validatorResult0 = new ValidatorResult((Field) null);
      Iterator<String> iterator0 = validatorResult0.getActions();
      assertNotNull(iterator0);
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ValidatorResult validatorResult0 = new ValidatorResult((Field) null);
      Map<String, ValidatorResult.ResultStatus> map0 = validatorResult0.getActionMap();
      validatorResult0.hAction = map0;
      // Undeclared exception!
      try { 
        validatorResult0.add((String) null, true);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult.ResultStatus validatorResult_ResultStatus0 = new ValidatorResult.ResultStatus(true, field0);
      Object object0 = new Object();
      validatorResult_ResultStatus0.setResult(object0);
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ValidatorResult.ResultStatus validatorResult_ResultStatus0 = new ValidatorResult.ResultStatus(false, (Object) null);
      assertTrue(validatorResult_ResultStatus0.isValid());
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ValidatorResult.ResultStatus validatorResult_ResultStatus0 = new ValidatorResult.ResultStatus(false, (Object) null);
      validatorResult_ResultStatus0.setValid(true);
      assertTrue(validatorResult_ResultStatus0.isValid());
}
}
