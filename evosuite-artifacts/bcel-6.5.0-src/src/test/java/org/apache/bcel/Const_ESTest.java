/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:48:22 GMT 2022
 */

package org.apache.bcel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.Const;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Const_ESTest extends Const_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Const.getOperandType(110, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Const.getProduceStack(110);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Const.getProduceStack(233);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long long0 = Const.getOperandTypeCount(157);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      short short0 = Const.getOperandType(156, 0);
      assertEquals((short)9, short0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      short short0 = Const.getNoOfOperands(4);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      short short0 = Const.getNoOfOperands(17);
      assertEquals((short)2, short0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      short short0 = Const.getNoOfOperands(209);
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = Const.getMethodHandleName(1);
      assertEquals("getField", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = Const.getItemName(0);
      assertEquals("Bogus", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = Const.getConsumeStack(129);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = Const.getConsumeStack(255);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = Const.getConstantName(1);
      assertEquals("CONSTANT_Utf8", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Const.getTypeName((-361));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -361
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Const.getShortTypeName((-1768));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1768
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Const.getProduceStack((-1827));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1827
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Const.getOperandTypeCount(1300);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1300
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Const.getOpcodeName(300);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 300
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Const.getMethodHandleName(414);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 414
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Const.getConsumeStack(3171);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3171
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Const.getConstantName(21);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 21
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Const.getClassTypeName((-1008));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1008
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Const.getAttributeName(235);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 235
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Const.getAccessName((-272));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -272
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = Const.getConstantName(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = Const.getMethodHandleName(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = Const.getTypeName(4);
      assertEquals("boolean", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = Const.getClassTypeName(0);
      assertEquals("<illegal type>", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Iterable<String> iterable0 = Const.getInterfacesImplementedByArrays();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = Const.getProduceStack(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        Const.getItemName((-2298));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2298
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = Const.getAttributeName(0);
      assertEquals("SourceFile", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      long long0 = Const.getOperandTypeCount(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = Const.getShortTypeName(4);
      assertEquals("Z", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = Const.getOpcodeName(4);
      assertEquals("iconst_1", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = Const.getConsumeStack(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = Const.getAccessName(0);
      assertEquals("public", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        Const.getNoOfOperands((-244));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -244
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }
}
