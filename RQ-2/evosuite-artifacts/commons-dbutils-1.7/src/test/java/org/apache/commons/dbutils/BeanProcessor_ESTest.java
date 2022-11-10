/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:14:32 GMT 2022
 */

package org.apache.commons.dbutils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.rowset.RowSetMetaDataImpl;
import org.apache.commons.dbutils.BeanProcessor;
import org.apache.commons.dbutils.handlers.columns.BooleanColumnHandler;
import org.apache.commons.dbutils.handlers.columns.DoubleColumnHandler;
import org.apache.commons.dbutils.handlers.columns.FloatColumnHandler;
import org.apache.commons.dbutils.handlers.columns.LongColumnHandler;
import org.apache.commons.dbutils.handlers.columns.SQLXMLColumnHandler;
import org.apache.commons.dbutils.handlers.columns.ShortColumnHandler;
import org.apache.commons.dbutils.handlers.columns.StringColumnHandler;
import org.apache.commons.dbutils.handlers.properties.StringEnumPropertyHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BeanProcessor_ESTest extends BeanProcessor_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BeanProcessor beanProcessor0 = new BeanProcessor(hashMap0);
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      Class<SQLXMLColumnHandler> class0 = SQLXMLColumnHandler.class;
      SQLXMLColumnHandler sQLXMLColumnHandler0 = beanProcessor0.toBean(resultSet0, (Class<? extends SQLXMLColumnHandler>) class0);
      assertNotNull(sQLXMLColumnHandler0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BeanProcessor beanProcessor0 = new BeanProcessor();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(resultSet0).getObject(anyInt());
      Class<DoubleColumnHandler> class0 = DoubleColumnHandler.class;
      Object object0 = beanProcessor0.processColumn(resultSet0, 0, class0);
      assertNotNull(object0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BeanProcessor beanProcessor0 = new BeanProcessor();
      RowSetMetaDataImpl rowSetMetaDataImpl0 = new RowSetMetaDataImpl();
      int[] intArray0 = beanProcessor0.mapColumnsToProperties(rowSetMetaDataImpl0, (PropertyDescriptor[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BeanProcessor beanProcessor0 = new BeanProcessor();
      Integer integer0 = new Integer((-3190));
      Class<String> class0 = String.class;
      PropertyDescriptor propertyDescriptor0 = new PropertyDescriptor("XwO)f,\"k\rj} ", class0, (String) null, (String) null);
      LongColumnHandler longColumnHandler0 = new LongColumnHandler();
      Method method0 = beanProcessor0.getWriteMethod(integer0, propertyDescriptor0, longColumnHandler0);
      assertNotNull(method0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BeanProcessor beanProcessor0 = new BeanProcessor();
      Class<DoubleColumnHandler> class0 = DoubleColumnHandler.class;
      beanProcessor0.newInstance(class0);
      Class<FloatColumnHandler> class1 = FloatColumnHandler.class;
      RowSetMetaDataImpl rowSetMetaDataImpl0 = new RowSetMetaDataImpl();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(rowSetMetaDataImpl0).when(resultSet0).getMetaData();
      doReturn(true, false).when(resultSet0).next();
      Class<SQLXMLColumnHandler> class2 = SQLXMLColumnHandler.class;
      List<SQLXMLColumnHandler> list0 = beanProcessor0.toBeanList(resultSet0, (Class<? extends SQLXMLColumnHandler>) class2);
      assertTrue(list0.isEmpty());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BeanProcessor beanProcessor0 = new BeanProcessor();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      Class<Annotation> class0 = Annotation.class;
      try { 
        beanProcessor0.toBean(resultSet0, (Class<? extends Annotation>) class0);
        fail("Expecting exception: SQLException");
      } catch(SQLException e) {
         //
         // Cannot create java.lang.annotation.Annotation: java.lang.annotation.Annotation
         //
         verifyException("org.apache.commons.dbutils.BeanProcessor", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BeanProcessor beanProcessor0 = new BeanProcessor();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        beanProcessor0.toBean(resultSet0, (Class<? extends String>) class0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BeanProcessor beanProcessor0 = new BeanProcessor();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-658)).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        beanProcessor0.toBean(resultSet0, (Class<? extends String>) class0);
        fail("Expecting exception: NegativeArraySizeException");
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.BeanProcessor", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      BeanProcessor beanProcessor0 = new BeanProcessor();
      Class<LongColumnHandler> class0 = LongColumnHandler.class;
      // Undeclared exception!
      try { 
        beanProcessor0.processColumn((ResultSet) null, 0, class0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      BeanProcessor beanProcessor0 = new BeanProcessor();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(6378).when(resultSetMetaData0).getColumnCount();
      doReturn("", "ifexists", "", "", "M|eyud").when(resultSetMetaData0).getColumnLabel(anyInt());
      doReturn("", "class", "06Xhi:k*?Zrj").when(resultSetMetaData0).getColumnName(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      BooleanColumnHandler booleanColumnHandler0 = new BooleanColumnHandler();
      // Undeclared exception!
      beanProcessor0.populateBean(resultSet0, booleanColumnHandler0);
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BeanProcessor beanProcessor0 = new BeanProcessor();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        beanProcessor0.populateBean(resultSet0, object0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BeanProcessor beanProcessor0 = new BeanProcessor(hashMap0);
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-2564)).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      StringColumnHandler stringColumnHandler0 = new StringColumnHandler();
      // Undeclared exception!
      try { 
        beanProcessor0.populateBean(resultSet0, (Object) stringColumnHandler0);
        fail("Expecting exception: NegativeArraySizeException");
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.BeanProcessor", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BeanProcessor beanProcessor0 = new BeanProcessor(hashMap0);
      Class<Annotation> class0 = Annotation.class;
      try { 
        beanProcessor0.newInstance(class0);
        fail("Expecting exception: SQLException");
      } catch(SQLException e) {
         //
         // Cannot create java.lang.annotation.Annotation: java.lang.annotation.Annotation
         //
         verifyException("org.apache.commons.dbutils.BeanProcessor", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BeanProcessor beanProcessor0 = new BeanProcessor();
      // Undeclared exception!
      try { 
        beanProcessor0.newInstance((Class<ShortColumnHandler>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BeanProcessor beanProcessor0 = new BeanProcessor();
      PropertyDescriptor[] propertyDescriptorArray0 = new PropertyDescriptor[1];
      // Undeclared exception!
      try { 
        beanProcessor0.mapColumnsToProperties((ResultSetMetaData) null, propertyDescriptorArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BeanProcessor beanProcessor0 = new BeanProcessor(hashMap0);
      // Undeclared exception!
      try { 
        beanProcessor0.getWriteMethod((Object) null, (PropertyDescriptor) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BeanProcessor beanProcessor0 = new BeanProcessor();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(beanProcessor0).when(resultSet0).getObject(anyInt());
      Class<LongColumnHandler> class0 = LongColumnHandler.class;
      Object object0 = beanProcessor0.processColumn(resultSet0, 2121, class0);
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>(967, 1.0F);
      BeanProcessor beanProcessor0 = new BeanProcessor(hashMap0);
      hashMap0.put((String) null, "NCjz~4j)O ivw#Bc");
      RowSetMetaDataImpl rowSetMetaDataImpl0 = new RowSetMetaDataImpl();
      rowSetMetaDataImpl0.setColumnCount(967);
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(rowSetMetaDataImpl0).when(resultSet0).getMetaData();
      doReturn(true, true, false).when(resultSet0).next();
      Class<StringEnumPropertyHandler> class0 = StringEnumPropertyHandler.class;
      List<StringEnumPropertyHandler> list0 = beanProcessor0.toBeanList(resultSet0, (Class<? extends StringEnumPropertyHandler>) class0);
      assertEquals(1, list0.size());
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BeanProcessor beanProcessor0 = new BeanProcessor();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(1304).when(resultSetMetaData0).getColumnCount();
      doReturn("", "ifexists", "", "", "M|eyud").when(resultSetMetaData0).getColumnLabel(anyInt());
      doReturn("", "class", "06Xhi:k*?Zrj").when(resultSetMetaData0).getColumnName(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn((Object) null).when(resultSet0).getObject(anyInt());
      BooleanColumnHandler booleanColumnHandler0 = new BooleanColumnHandler();
      BooleanColumnHandler booleanColumnHandler1 = beanProcessor0.populateBean(resultSet0, booleanColumnHandler0);
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>(967, 1.0F);
      BeanProcessor beanProcessor0 = new BeanProcessor(hashMap0);
      RowSetMetaDataImpl rowSetMetaDataImpl0 = new RowSetMetaDataImpl();
      rowSetMetaDataImpl0.setColumnCount(967);
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(rowSetMetaDataImpl0).when(resultSet0).getMetaData();
      doReturn(true).when(resultSet0).next();
      Class<StringEnumPropertyHandler> class0 = StringEnumPropertyHandler.class;
      // Undeclared exception!
      try { 
        beanProcessor0.toBeanList(resultSet0, (Class<? extends StringEnumPropertyHandler>) class0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>(967, 1.0F);
      BeanProcessor beanProcessor0 = new BeanProcessor(hashMap0);
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(resultSet0).next();
      Class<Integer> class0 = Integer.class;
      List<Integer> list0 = beanProcessor0.toBeanList(resultSet0, (Class<? extends Integer>) class0);
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BeanProcessor beanProcessor0 = null;
      try {
        beanProcessor0 = new BeanProcessor((Map<String, String>) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // columnToPropertyOverrides map cannot be null
         //
         verifyException("org.apache.commons.dbutils.BeanProcessor", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>(967, 1.0F);
      BeanProcessor beanProcessor0 = new BeanProcessor(hashMap0);
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(true).when(resultSet0).next();
      Class<Integer> class0 = Integer.class;
      try { 
        beanProcessor0.toBeanList(resultSet0, (Class<? extends Integer>) class0);
        fail("Expecting exception: SQLException");
      } catch(SQLException e) {
         //
         // Cannot create java.lang.Integer: java.lang.Integer
         //
         verifyException("org.apache.commons.dbutils.BeanProcessor", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BeanProcessor beanProcessor0 = new BeanProcessor();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(2121).when(resultSetMetaData0).getColumnCount();
      doReturn("CZ')E\"|jk({1%Cv", "class", "org.hsqldb.jdbc.jdbcdriver", "empty", "empty").when(resultSetMetaData0).getColumnLabel(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(resultSet0).getBoolean(anyInt());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(resultSet0).getObject(anyInt());
      Class<String> class0 = String.class;
      String string0 = beanProcessor0.toBean(resultSet0, (Class<? extends String>) class0);
      assertNotNull(string0);
}
}
