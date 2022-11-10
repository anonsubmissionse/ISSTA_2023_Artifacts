/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 18:24:01 GMT 2022
 */

package org.apache.commons.jexl3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jexl3.JexlOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JexlOperator_ESTest extends JexlOperator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JexlOperator[] jexlOperatorArray0 = JexlOperator.values();
      assertEquals(36, jexlOperatorArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JexlOperator jexlOperator0 = JexlOperator.valueOf("PROPERTY_SET");
      assertEquals(3, jexlOperator0.getArity());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JexlOperator jexlOperator0 = JexlOperator.ASSIGN;
      String string0 = jexlOperator0.getMethodName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JexlOperator jexlOperator0 = JexlOperator.SELF_AND;
      JexlOperator jexlOperator1 = jexlOperator0.getBaseOperator();
      assertEquals(JexlOperator.AND, jexlOperator1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JexlOperator jexlOperator0 = JexlOperator.AND;
      String string0 = jexlOperator0.getOperatorSymbol();
      assertEquals("&", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JexlOperator jexlOperator0 = JexlOperator.AND;
      int int0 = jexlOperator0.getArity();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JexlOperator jexlOperator0 = JexlOperator.AND;
      jexlOperator0.getBaseOperator();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JexlOperator jexlOperator0 = JexlOperator.AND;
      String string0 = jexlOperator0.getMethodName();
      assertEquals("and", string0);
  }
}
