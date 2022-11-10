/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:08:40 GMT 2022
 */

package org.apache.commons.dbutils.handlers.columns;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.ResultSet;
import java.sql.Timestamp;
import org.apache.commons.dbutils.handlers.columns.TimestampColumnHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimestampColumnHandler_ESTest extends TimestampColumnHandler_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimestampColumnHandler timestampColumnHandler0 = new TimestampColumnHandler();
      Class<Timestamp> class0 = Timestamp.class;
      boolean boolean0 = timestampColumnHandler0.match(class0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TimestampColumnHandler timestampColumnHandler0 = new TimestampColumnHandler();
      Timestamp timestamp0 = new Timestamp((-1L));
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(timestamp0).when(resultSet0).getTimestamp(anyInt());
      Object object0 = timestampColumnHandler0.apply(resultSet0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimestampColumnHandler timestampColumnHandler0 = new TimestampColumnHandler();
      // Undeclared exception!
      try { 
        timestampColumnHandler0.apply((ResultSet) null, 2253);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.handlers.columns.TimestampColumnHandler", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TimestampColumnHandler timestampColumnHandler0 = new TimestampColumnHandler();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((Timestamp) null).when(resultSet0).getTimestamp(anyInt());
      Object object0 = timestampColumnHandler0.apply(resultSet0, 0);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TimestampColumnHandler timestampColumnHandler0 = new TimestampColumnHandler();
      Class<Object> class0 = Object.class;
      boolean boolean0 = timestampColumnHandler0.match(class0);
      assertTrue(boolean0);
}
}
