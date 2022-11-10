/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:03:23 GMT 2022
 */

package org.apache.commons.dbutils.handlers.columns;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.ResultSet;
import org.apache.commons.dbutils.handlers.columns.IntegerColumnHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IntegerColumnHandler_ESTest extends IntegerColumnHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IntegerColumnHandler integerColumnHandler0 = new IntegerColumnHandler();
      // Undeclared exception!
      try { 
        integerColumnHandler0.match((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.handlers.columns.IntegerColumnHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IntegerColumnHandler integerColumnHandler0 = new IntegerColumnHandler();
      // Undeclared exception!
      try { 
        integerColumnHandler0.apply((ResultSet) null, 2249);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.handlers.columns.IntegerColumnHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IntegerColumnHandler integerColumnHandler0 = new IntegerColumnHandler();
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = integerColumnHandler0.match(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IntegerColumnHandler integerColumnHandler0 = new IntegerColumnHandler();
      Class<Object> class0 = Object.class;
      boolean boolean0 = integerColumnHandler0.match(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IntegerColumnHandler integerColumnHandler0 = new IntegerColumnHandler();
      Class<Integer> class0 = Integer.TYPE;
      boolean boolean0 = integerColumnHandler0.match(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IntegerColumnHandler integerColumnHandler0 = new IntegerColumnHandler();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSet0).getInt(anyInt());
      Object object0 = integerColumnHandler0.apply(resultSet0, 1);
      assertEquals(0, object0);
  }
}
