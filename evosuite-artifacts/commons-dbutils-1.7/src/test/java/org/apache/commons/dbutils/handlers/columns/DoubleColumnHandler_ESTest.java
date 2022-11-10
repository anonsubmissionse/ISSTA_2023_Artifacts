/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:01:53 GMT 2022
 */

package org.apache.commons.dbutils.handlers.columns;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.ResultSet;
import org.apache.commons.dbutils.handlers.columns.DoubleColumnHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DoubleColumnHandler_ESTest extends DoubleColumnHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DoubleColumnHandler doubleColumnHandler0 = new DoubleColumnHandler();
      // Undeclared exception!
      try { 
        doubleColumnHandler0.match((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.handlers.columns.DoubleColumnHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoubleColumnHandler doubleColumnHandler0 = new DoubleColumnHandler();
      // Undeclared exception!
      try { 
        doubleColumnHandler0.apply((ResultSet) null, (-2038));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.handlers.columns.DoubleColumnHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoubleColumnHandler doubleColumnHandler0 = new DoubleColumnHandler();
      Class<Double> class0 = Double.class;
      boolean boolean0 = doubleColumnHandler0.match(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DoubleColumnHandler doubleColumnHandler0 = new DoubleColumnHandler();
      Class<Object> class0 = Object.class;
      boolean boolean0 = doubleColumnHandler0.match(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DoubleColumnHandler doubleColumnHandler0 = new DoubleColumnHandler();
      Class<Double> class0 = Double.TYPE;
      boolean boolean0 = doubleColumnHandler0.match(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DoubleColumnHandler doubleColumnHandler0 = new DoubleColumnHandler();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((-1117.6)).when(resultSet0).getDouble(anyInt());
      Object object0 = doubleColumnHandler0.apply(resultSet0, 0);
      assertEquals((-1117.6), object0);
  }
}
