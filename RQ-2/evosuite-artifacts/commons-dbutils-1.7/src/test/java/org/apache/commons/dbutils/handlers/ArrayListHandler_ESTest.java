/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:08:27 GMT 2022
 */

package org.apache.commons.dbutils.handlers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArrayListHandler_ESTest extends ArrayListHandler_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicRowProcessor basicRowProcessor0 = new BasicRowProcessor();
      ArrayListHandler arrayListHandler0 = new ArrayListHandler(basicRowProcessor0);
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(1535).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(resultSet0).getObject(anyInt());
      Object[] objectArray0 = arrayListHandler0.handleRow(resultSet0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicRowProcessor basicRowProcessor0 = new BasicRowProcessor();
      ArrayListHandler arrayListHandler0 = new ArrayListHandler(basicRowProcessor0);
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      Object[] objectArray0 = arrayListHandler0.handleRow(resultSet0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicRowProcessor basicRowProcessor0 = new BasicRowProcessor();
      ArrayListHandler arrayListHandler0 = new ArrayListHandler(basicRowProcessor0);
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-2405)).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      // Undeclared exception!
      try { 
        arrayListHandler0.handleRow(resultSet0);
        fail("Expecting exception: NegativeArraySizeException");
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.BasicRowProcessor", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayListHandler arrayListHandler0 = new ArrayListHandler();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      // Undeclared exception!
      try { 
        arrayListHandler0.handleRow(resultSet0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.BasicRowProcessor", e);
      }
  }
}
