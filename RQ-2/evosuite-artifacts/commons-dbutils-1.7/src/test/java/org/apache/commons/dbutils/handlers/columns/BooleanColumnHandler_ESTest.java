/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:04:03 GMT 2022
 */

package org.apache.commons.dbutils.handlers.columns;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.ResultSet;
import org.apache.commons.dbutils.handlers.columns.BooleanColumnHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BooleanColumnHandler_ESTest extends BooleanColumnHandler_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BooleanColumnHandler booleanColumnHandler0 = new BooleanColumnHandler();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(resultSet0).getBoolean(anyInt());
      Object object0 = booleanColumnHandler0.apply(resultSet0, (-1));
      //TOGA error assertFalse(object0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BooleanColumnHandler booleanColumnHandler0 = new BooleanColumnHandler();
      // Undeclared exception!
      try { 
        booleanColumnHandler0.match((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.handlers.columns.BooleanColumnHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BooleanColumnHandler booleanColumnHandler0 = new BooleanColumnHandler();
      Class<String> class0 = String.class;
      boolean boolean0 = booleanColumnHandler0.match(class0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BooleanColumnHandler booleanColumnHandler0 = new BooleanColumnHandler();
      Class<Boolean> class0 = Boolean.class;
      boolean boolean0 = booleanColumnHandler0.match(class0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BooleanColumnHandler booleanColumnHandler0 = new BooleanColumnHandler();
      Class<Boolean> class0 = Boolean.TYPE;
      boolean boolean0 = booleanColumnHandler0.match(class0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BooleanColumnHandler booleanColumnHandler0 = new BooleanColumnHandler();
      // Undeclared exception!
      try { 
        booleanColumnHandler0.apply((ResultSet) null, (-1));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.handlers.columns.BooleanColumnHandler", e);
      }
  }
}
