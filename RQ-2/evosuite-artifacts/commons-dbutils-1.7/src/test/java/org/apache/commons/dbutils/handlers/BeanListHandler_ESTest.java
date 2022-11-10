/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:08:32 GMT 2022
 */

package org.apache.commons.dbutils.handlers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.List;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BeanListHandler_ESTest extends BeanListHandler_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<String> class0 = String.class;
      BasicRowProcessor basicRowProcessor0 = new BasicRowProcessor();
      BeanListHandler<Object> beanListHandler0 = new BeanListHandler<Object>(class0, basicRowProcessor0);
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(true, false).when(resultSet0).next();
      List<Object> list0 = beanListHandler0.handle(resultSet0);
      assertTrue(list0.isEmpty());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<String> class0 = String.class;
      BasicRowProcessor basicRowProcessor0 = new BasicRowProcessor();
      BeanListHandler<Object> beanListHandler0 = new BeanListHandler<Object>(class0, basicRowProcessor0);
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-1254)).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(true).when(resultSet0).next();
      // Undeclared exception!
      try { 
        beanListHandler0.handle(resultSet0);
        fail("Expecting exception: NegativeArraySizeException");
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.BeanProcessor", e);
      }
  }
}
