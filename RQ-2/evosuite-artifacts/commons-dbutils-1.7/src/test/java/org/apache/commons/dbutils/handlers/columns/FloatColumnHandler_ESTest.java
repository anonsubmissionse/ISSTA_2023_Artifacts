/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:04:07 GMT 2022
 */

package org.apache.commons.dbutils.handlers.columns;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.ResultSet;
import org.apache.commons.dbutils.handlers.columns.FloatColumnHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FloatColumnHandler_ESTest extends FloatColumnHandler_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FloatColumnHandler floatColumnHandler0 = new FloatColumnHandler();
      // Undeclared exception!
      try { 
        floatColumnHandler0.match((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.handlers.columns.FloatColumnHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FloatColumnHandler floatColumnHandler0 = new FloatColumnHandler();
      // Undeclared exception!
      try { 
        floatColumnHandler0.apply((ResultSet) null, 4331);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.handlers.columns.FloatColumnHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FloatColumnHandler floatColumnHandler0 = new FloatColumnHandler();
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = floatColumnHandler0.match(class0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FloatColumnHandler floatColumnHandler0 = new FloatColumnHandler();
      Class<Float> class0 = Float.class;
      boolean boolean0 = floatColumnHandler0.match(class0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FloatColumnHandler floatColumnHandler0 = new FloatColumnHandler();
      Class<Float> class0 = Float.TYPE;
      boolean boolean0 = floatColumnHandler0.match(class0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FloatColumnHandler floatColumnHandler0 = new FloatColumnHandler();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(0.0F).when(resultSet0).getFloat(anyInt());
      Object object0 = floatColumnHandler0.apply(resultSet0, (-5500));
      ;
}
}
