/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:09:44 GMT 2022
 */

package org.apache.commons.dbutils.handlers.columns;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.ResultSet;
import java.sql.SQLXML;
import org.apache.commons.dbutils.handlers.columns.SQLXMLColumnHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SQLXMLColumnHandler_ESTest extends SQLXMLColumnHandler_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SQLXMLColumnHandler sQLXMLColumnHandler0 = new SQLXMLColumnHandler();
      SQLXML sQLXML0 = mock(SQLXML.class, new ViolatedAssumptionAnswer());
      doReturn("").when(sQLXML0).toString();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(sQLXML0).when(resultSet0).getSQLXML(anyInt());
      Object object0 = sQLXMLColumnHandler0.apply(resultSet0, 0);
      assertNotNull(object0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SQLXMLColumnHandler sQLXMLColumnHandler0 = new SQLXMLColumnHandler();
      // Undeclared exception!
      try { 
        sQLXMLColumnHandler0.match((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.handlers.columns.SQLXMLColumnHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SQLXMLColumnHandler sQLXMLColumnHandler0 = new SQLXMLColumnHandler();
      // Undeclared exception!
      try { 
        sQLXMLColumnHandler0.apply((ResultSet) null, (-688));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.handlers.columns.SQLXMLColumnHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<String> class0 = String.class;
      SQLXMLColumnHandler sQLXMLColumnHandler0 = new SQLXMLColumnHandler();
      boolean boolean0 = sQLXMLColumnHandler0.match(class0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SQLXMLColumnHandler sQLXMLColumnHandler0 = new SQLXMLColumnHandler();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((SQLXML) null).when(resultSet0).getSQLXML(anyInt());
      Object object0 = sQLXMLColumnHandler0.apply(resultSet0, 0);
      assertNotNull(object0);
}
}
