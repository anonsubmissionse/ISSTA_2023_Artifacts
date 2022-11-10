/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 14:59:31 GMT 2022
 */

package org.apache.commons.dbutils.handlers.properties;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Timestamp;
import org.apache.commons.dbutils.handlers.properties.DatePropertyHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DatePropertyHandler_ESTest extends DatePropertyHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DatePropertyHandler datePropertyHandler0 = new DatePropertyHandler();
      Class<Object> class0 = Object.class;
      Object object0 = datePropertyHandler0.apply(class0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DatePropertyHandler datePropertyHandler0 = new DatePropertyHandler();
      Timestamp timestamp0 = new Timestamp((-893L));
      // Undeclared exception!
      try { 
        datePropertyHandler0.match((Class<?>) null, timestamp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.handlers.properties.DatePropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DatePropertyHandler datePropertyHandler0 = new DatePropertyHandler();
      Class<Timestamp> class0 = Timestamp.class;
      // Undeclared exception!
      try { 
        datePropertyHandler0.apply(class0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.handlers.properties.DatePropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DatePropertyHandler datePropertyHandler0 = new DatePropertyHandler();
      Class<Timestamp> class0 = Timestamp.class;
      // Undeclared exception!
      try { 
        datePropertyHandler0.apply(class0, class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Class cannot be cast to java.sql.Timestamp
         //
         verifyException("org.apache.commons.dbutils.handlers.properties.DatePropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DatePropertyHandler datePropertyHandler0 = new DatePropertyHandler();
      Class<Timestamp> class0 = Timestamp.class;
      Timestamp timestamp0 = new Timestamp(16L);
      Timestamp timestamp1 = (Timestamp)datePropertyHandler0.apply(class0, timestamp0);
      assertNotSame(timestamp1, timestamp0);
      assertEquals(16000000, timestamp1.getNanos());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DatePropertyHandler datePropertyHandler0 = new DatePropertyHandler();
      Class<Timestamp> class0 = Timestamp.class;
      Timestamp timestamp0 = new Timestamp(16L);
      boolean boolean0 = datePropertyHandler0.match(class0, timestamp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DatePropertyHandler datePropertyHandler0 = new DatePropertyHandler();
      Class<Integer> class0 = Integer.class;
      Timestamp timestamp0 = new Timestamp((-1819L));
      boolean boolean0 = datePropertyHandler0.match(class0, timestamp0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DatePropertyHandler datePropertyHandler0 = new DatePropertyHandler();
      Class<Integer> class0 = Integer.class;
      Object object0 = datePropertyHandler0.apply(class0, class0);
      Class<String> class1 = String.class;
      boolean boolean0 = datePropertyHandler0.match(class1, object0);
      assertFalse(boolean0);
  }
}
