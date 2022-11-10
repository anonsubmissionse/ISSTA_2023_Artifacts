/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 18:19:25 GMT 2022
 */

package org.apache.commons.beanutils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.sql.rowset.RowSetMetaDataImpl;
import org.apache.commons.beanutils.DynaClass;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.beanutils.LazyDynaMap;
import org.apache.commons.beanutils.RowSetDynaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LazyDynaMap_ESTest extends LazyDynaMap_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DynaProperty[] dynaPropertyArray0 = new DynaProperty[0];
      LazyDynaMap lazyDynaMap0 = new LazyDynaMap(dynaPropertyArray0);
      assertTrue(lazyDynaMap0.isReturnNull());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DynaProperty[] dynaPropertyArray0 = new DynaProperty[0];
      LazyDynaMap lazyDynaMap0 = new LazyDynaMap(dynaPropertyArray0);
      assertNotNull(lazyDynaMap0.getName());
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RowSetMetaDataImpl rowSetMetaDataImpl0 = new RowSetMetaDataImpl();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(rowSetMetaDataImpl0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).next();
      RowSetDynaClass rowSetDynaClass0 = new RowSetDynaClass(resultSet0, true, true);
      LazyDynaMap lazyDynaMap0 = new LazyDynaMap(rowSetDynaClass0);
      assertNotNull(lazyDynaMap0.getName());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RowSetMetaDataImpl rowSetMetaDataImpl0 = new RowSetMetaDataImpl();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(rowSetMetaDataImpl0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).next();
      RowSetDynaClass rowSetDynaClass0 = new RowSetDynaClass(resultSet0, true, true);
      LazyDynaMap lazyDynaMap0 = new LazyDynaMap(rowSetDynaClass0);
      assertTrue(lazyDynaMap0.isReturnNull());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      LazyDynaMap lazyDynaMap0 = new LazyDynaMap(hashMap0);
      assertTrue(lazyDynaMap0.isReturnNull());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      LazyDynaMap lazyDynaMap0 = new LazyDynaMap(hashMap0);
      assertNotNull(lazyDynaMap0.getName());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DynaProperty[] dynaPropertyArray0 = new DynaProperty[3];
      LazyDynaMap lazyDynaMap0 = null;
      try {
        lazyDynaMap0 = new LazyDynaMap("'T}C##nQV%4C7Fe9P#", dynaPropertyArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.beanutils.LazyDynaMap", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      LazyDynaMap lazyDynaMap0 = new LazyDynaMap("]fGE<U\"I3Jc", hashMap0);
      assertNotNull(lazyDynaMap0.getName());
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      LazyDynaMap lazyDynaMap0 = new LazyDynaMap("]fGE<U\"I3Jc", hashMap0);
      assertTrue(lazyDynaMap0.isReturnNull());
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LazyDynaMap lazyDynaMap0 = new LazyDynaMap("");
      assertNotNull(lazyDynaMap0.getName());
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LazyDynaMap lazyDynaMap0 = new LazyDynaMap("");
      assertTrue(lazyDynaMap0.isReturnNull());
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LazyDynaMap lazyDynaMap0 = new LazyDynaMap();
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LazyDynaMap lazyDynaMap0 = new LazyDynaMap();
      assertTrue(lazyDynaMap0.isReturnNull());
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LazyDynaMap lazyDynaMap0 = null;
      try {
        lazyDynaMap0 = new LazyDynaMap((DynaClass) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.beanutils.LazyDynaMap", e);
      }
  }
}
