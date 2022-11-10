/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:09:10 GMT 2022
 */

package org.apache.commons.dbutils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.CallableStatement;
import org.apache.commons.dbutils.OutParameter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OutParameter_ESTest extends OutParameter_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<String> class0 = String.class;
      OutParameter<String> outParameter0 = new OutParameter<String>(0, class0);
      outParameter0.toString();
      outParameter0.toString();
      CallableStatement callableStatement0 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      outParameter0.toString();
      outParameter0.register(callableStatement0, 0);
      outParameter0.getSqlType();
      Class<Object> class1 = Object.class;
      OutParameter<Object> outParameter1 = new OutParameter<Object>(0, class1);
      Object object0 = new Object();
      OutParameter<Object> outParameter2 = new OutParameter<Object>(0, class1, object0);
      CallableStatement callableStatement1 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      outParameter2.register(callableStatement1, 0);
      CallableStatement callableStatement2 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      outParameter1.register(callableStatement2, 0);
      Object object1 = new Object();
      CallableStatement callableStatement3 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      doReturn(object1).when(callableStatement3).getObject(anyInt());
      outParameter2.setValue("OutParameter{sqlType=0, javaType=class java.lang.String, value=null}");
      CallableStatement callableStatement4 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      CallableStatement callableStatement5 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(callableStatement5).getObject(anyInt());
      outParameter2.setValue(callableStatement5, 4057);
      outParameter2.register(callableStatement4, 0);
      outParameter2.setValue(callableStatement3, 125);
      Integer integer0 = new Integer((-1082));
      OutParameter<Integer> outParameter3 = new OutParameter<Integer>(125, (Class<Integer>) null, integer0);
      outParameter3.getJavaType();
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = 1;
      Class<String> class0 = String.class;
      OutParameter<String> outParameter0 = new OutParameter<String>(1, class0, "_xiDP-BU=r_s`p!Y`4[");
      CallableStatement callableStatement0 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      CallableStatement callableStatement1 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      doReturn("").when(callableStatement1).getObject(anyInt());
      outParameter0.toString();
      outParameter0.setValue(callableStatement1, 0);
      outParameter0.toString();
      outParameter0.register(callableStatement0, 0);
      outParameter0.getSqlType();
      Class<Object> class1 = Object.class;
      OutParameter<Object> outParameter1 = new OutParameter<Object>(0, class1);
      CallableStatement callableStatement2 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      doReturn("").when(callableStatement2).getObject(anyInt());
      outParameter1.setValue(callableStatement2, 0);
      outParameter0.toString();
      outParameter0.toString();
      outParameter0.getSqlType();
      int int1 = (-1);
      Class<Integer> class2 = Integer.class;
      OutParameter<Integer> outParameter2 = new OutParameter<Integer>((-1), class2);
      CallableStatement callableStatement3 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(callableStatement3).getObject(anyInt());
      // Undeclared exception!
      try { 
        outParameter2.setValue(callableStatement3, (-1));
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OutParameter<Object> outParameter0 = new OutParameter<Object>((-4136), class0);
      outParameter0.setValue(class0);
      outParameter0.setValue(class0);
      int int0 = outParameter0.getSqlType();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OutParameter<Object> outParameter0 = new OutParameter<Object>((-4136), class0);
      outParameter0.setValue(class0);
      outParameter0.setValue(class0);
      int int0 = outParameter0.getSqlType();
      Class<String> class1 = String.class;
      OutParameter<String> outParameter1 = new OutParameter<String>(0, class1);
      outParameter1.setValue(",x{e#\"BU");
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      OutParameter<Integer> outParameter0 = new OutParameter<Integer>(967, class0);
      CallableStatement callableStatement0 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      outParameter0.register(callableStatement0, 0);
      outParameter0.getSqlType();
      int int0 = 0;
      Class<Object> class1 = Object.class;
      OutParameter<Object> outParameter1 = new OutParameter<Object>(0, class1, (Object) null);
      outParameter1.setValue(class1);
      Class<String> class2 = String.class;
      CallableStatement callableStatement1 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callableStatement1).getObject(anyInt());
      outParameter1.setValue(callableStatement1, 0);
      OutParameter<String> outParameter2 = new OutParameter<String>(0, class2);
      outParameter2.setValue("[ULY3>CpEH");
      outParameter2.getJavaType();
      outParameter1.getValue();
      outParameter1.toString();
      CallableStatement callableStatement2 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        outParameter2.setValue((CallableStatement) null, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.OutParameter", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Integer integer0 = new Integer(0);
      OutParameter<Object> outParameter0 = new OutParameter<Object>(0, class0, integer0);
      Class<Integer> class1 = Integer.class;
      OutParameter<Integer> outParameter1 = new OutParameter<Integer>(0, class1, integer0);
      Object object0 = outParameter1.getValue();
      outParameter0.setValue(object0);
      int int0 = outParameter0.getSqlType();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<String> class0 = String.class;
      OutParameter<String> outParameter0 = new OutParameter<String>(0, class0);
      String string0 = outParameter0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<String> class0 = String.class;
      OutParameter<String> outParameter0 = new OutParameter<String>(0, class0);
      String string0 = outParameter0.toString();
      outParameter0.getValue();
      Class<Object> class1 = Object.class;
      OutParameter<Object> outParameter1 = new OutParameter<Object>(0, class1);
      outParameter1.getValue();
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Class<String> class0 = String.class;
      OutParameter<String> outParameter0 = new OutParameter<String>(0, class0, "");
      assertEquals(0, outParameter0.getSqlType());
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Class<String> class0 = String.class;
      OutParameter<String> outParameter0 = new OutParameter<String>(0, class0, "");
      Class<Object> class1 = Object.class;
      OutParameter<Object> outParameter1 = new OutParameter<Object>((-1726), class1);
      String string0 = outParameter1.toString();
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OutParameter<Object> outParameter0 = new OutParameter<Object>(0, class0);
      Integer integer0 = new Integer(0);
      outParameter0.setValue(integer0);
      outParameter0.getJavaType();
      Class<String> class1 = String.class;
      OutParameter<String> outParameter1 = new OutParameter<String>(0, class1);
      outParameter1.getJavaType();
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OutParameter<Object> outParameter0 = new OutParameter<Object>(4051, class0);
      outParameter0.setValue(class0);
      Class<Integer> class1 = Integer.class;
      OutParameter<Integer> outParameter1 = new OutParameter<Integer>(0, class1);
      Integer integer0 = new Integer((-45));
      outParameter1.setValue(integer0);
      outParameter1.toString();
      int int0 = outParameter0.getSqlType();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OutParameter<Object> outParameter0 = new OutParameter<Object>(4051, class0);
      outParameter0.setValue(class0);
      Class<Integer> class1 = Integer.class;
      OutParameter<Integer> outParameter1 = new OutParameter<Integer>(0, class1);
      Integer integer0 = new Integer((-45));
      outParameter1.setValue(integer0);
      outParameter1.toString();
      int int0 = outParameter0.getSqlType();
      outParameter1.toString();
      Class<String> class2 = String.class;
      OutParameter<String> outParameter2 = new OutParameter<String>(4051, class2);
      String string0 = outParameter2.toString();
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<String> class0 = String.class;
      OutParameter<String> outParameter0 = new OutParameter<String>(0, class0);
      outParameter0.getSqlType();
      CallableStatement callableStatement0 = null;
      // Undeclared exception!
      try { 
        outParameter0.register((CallableStatement) null, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.OutParameter", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<String> class0 = String.class;
      OutParameter<String> outParameter0 = new OutParameter<String>(676, class0, "`N!v  y.O-&ASK");
      CallableStatement callableStatement0 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      outParameter0.register(callableStatement0, 676);
      assertEquals(0, outParameter0.getSqlType());
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OutParameter<Object> outParameter0 = new OutParameter<Object>(0, class0, class0);
      outParameter0.setValue(class0);
      assertEquals(1, outParameter0.getSqlType());
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<String> class0 = String.class;
      OutParameter<String> outParameter0 = new OutParameter<String>(2334, class0);
      String string0 = outParameter0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<String> class0 = String.class;
      OutParameter<String> outParameter0 = new OutParameter<String>((-1), class0);
      CallableStatement callableStatement0 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      outParameter0.register(callableStatement0, (-1));
      assertEquals(0, outParameter0.getSqlType());
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = 0;
      Class<String> class0 = String.class;
      OutParameter<String> outParameter0 = new OutParameter<String>(0, class0, "B(BcN}WM_p eVA65");
      CallableStatement callableStatement0 = null;
      // Undeclared exception!
      try { 
        outParameter0.register((CallableStatement) null, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.OutParameter", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<String> class0 = String.class;
      OutParameter<String> outParameter0 = new OutParameter<String>(1115, class0);
      CallableStatement callableStatement0 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callableStatement0).getObject(anyInt());
      outParameter0.setValue(callableStatement0, 1115);
      assertEquals(0, outParameter0.getSqlType());
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OutParameter<Object> outParameter0 = new OutParameter<Object>(5816, class0);
      // Undeclared exception!
      try { 
        outParameter0.setValue((CallableStatement) null, 5816);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.dbutils.OutParameter", e);
      }
  }
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OutParameter<Object> outParameter0 = new OutParameter<Object>(125, class0);
      outParameter0.getValue();
      assertEquals(0, outParameter0.getSqlType());
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OutParameter<Object> outParameter0 = new OutParameter<Object>((-911), class0, class0);
      outParameter0.getJavaType();
      assertEquals(1, outParameter0.getSqlType());
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OutParameter<Object> outParameter0 = new OutParameter<Object>(3673, class0);
      int int0 = outParameter0.getSqlType();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OutParameter<Object> outParameter0 = new OutParameter<Object>(472, class0);
      assertEquals(0, outParameter0.getSqlType());
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<String> class0 = String.class;
      OutParameter<String> outParameter0 = new OutParameter<String>((-3564), class0);
      String string0 = outParameter0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<String> class0 = String.class;
      OutParameter<String> outParameter0 = new OutParameter<String>((-3564), class0);
      String string0 = outParameter0.toString();
      outParameter0.getSqlType();
      Class<Object> class1 = Object.class;
      OutParameter<Object> outParameter1 = new OutParameter<Object>((-3564), class1);
      outParameter1.getValue();
      OutParameter<Object> outParameter2 = new OutParameter<Object>((-3564), class1, (Object) null);
      CallableStatement callableStatement0 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      outParameter2.register(callableStatement0, (-3564));
      outParameter2.setValue("OutParameter{sqlType=-3564, javaType=class java.lang.String, value=null}");
      CallableStatement callableStatement1 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(callableStatement1).getObject(anyInt());
      CallableStatement callableStatement2 = mock(CallableStatement.class, new ViolatedAssumptionAnswer());
      outParameter2.register(callableStatement2, (-3564));
      outParameter2.setValue(callableStatement1, (-3564));
      outParameter2.getJavaType();
      ;
}
}
