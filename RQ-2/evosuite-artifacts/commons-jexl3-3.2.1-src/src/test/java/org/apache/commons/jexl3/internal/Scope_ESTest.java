/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 17:46:05 GMT 2022
 */

package org.apache.commons.jexl3.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jexl3.internal.Frame;
import org.apache.commons.jexl3.internal.Scope;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Scope_ESTest extends Scope_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("G6$");
      scope0.declareVariable("13B>%9^`P#+zY");
      String[] stringArray1 = scope0.getParameters((-1));
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("G6$");
      Scope scope1 = new Scope(scope0, stringArray0);
      scope1.declareVariable("G6$");
      Integer integer0 = scope1.getCaptured(36);
      assertNotNull(integer0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("13B>%9^`P#+zY");
      Frame frame0 = new Frame((Scope) null, stringArray0, 0);
      Frame frame1 = scope0.createFrame(frame0, stringArray0);
      Scope scope1 = new Scope(scope0, stringArray0);
      scope1.declareVariable("G6$");
      scope1.declareVariable("13B>%9^`P#+zY");
      Frame frame2 = scope1.createFrame(frame1, (Object[]) null);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("13B>%9^`P#+zY");
      Frame frame0 = new Frame((Scope) null, stringArray0, 0);
      Scope scope1 = new Scope(scope0, stringArray0);
      scope1.declareVariable("G6$");
      scope1.declareVariable("13B>%9^`P#+zY");
      // Undeclared exception!
      try { 
        scope1.createFrame(frame0, (Object[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jexl3.internal.Frame", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      String[] stringArray1 = new String[0];
      Scope scope1 = new Scope((Scope) null, stringArray1);
      boolean boolean0 = scope0.equals(scope1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareParameter("org.apache.commons.jexl3.internal.Frame");
      scope0.hashCode();
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      String[] stringArray1 = scope0.getParameters();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("");
      scope0.declareVariable("1S_G`AU@ d}H3Spi[");
      Scope scope1 = new Scope(scope0, (String[]) null);
      scope1.getSymbol("1S_G`AU@ d}H3Spi[");
      scope1.declareVariable("");
      Integer integer0 = scope1.getCaptured(0);
      assertEquals(0, scope1.getArgCount());
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("");
      scope0.declareVariable("1S_G`AU@ d}H3Spi[");
      Scope scope1 = new Scope(scope0, (String[]) null);
      scope1.getSymbol("1S_G`AU@ d}H3Spi[");
      scope1.declareVariable("");
      Integer integer0 = scope1.getCaptured(0);
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("");
      scope0.declareVariable("1S_G`AU@ d}H3Spi[");
      Scope scope1 = new Scope(scope0, (String[]) null);
      scope1.getSymbol("1S_G`AU@ d}H3Spi[");
      scope1.declareVariable("");
      Integer integer0 = scope1.getCaptured(0);
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      scope0.declareVariable("=sy{%||ITCZGxs+*6");
      String[] stringArray0 = scope0.getLocalVariables();
      Scope scope1 = new Scope(scope0, stringArray0);
      int int0 = scope1.declareParameter("");
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      scope0.declareVariable("=sy{%||ITCZGxs+*6");
      String[] stringArray0 = scope0.getLocalVariables();
      Scope scope1 = new Scope(scope0, stringArray0);
      int int0 = scope1.declareParameter("");
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "|y1";
      stringArray0[3] = ".(";
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("7q@Oz6*S8~Vi:yx9");
      // Undeclared exception!
      try { 
        scope0.getParameters(4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jexl3.internal.Scope", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("");
      Frame frame0 = new Frame((Scope) null, (Object[]) null, 1);
      Scope scope1 = new Scope(scope0, stringArray0);
      scope1.getSymbol("");
      // Undeclared exception!
      try { 
        scope1.createFrame(frame0, stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.internal.Frame", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      scope0.getParameters(0);
      assertEquals(0, scope0.getArgCount());
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      String[] stringArray1 = scope0.getParameters(2487);
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("G6$");
      Scope scope1 = new Scope(scope0, stringArray0);
      scope1.declareVariable("!5B5r(dAlN5QB;9`b^5");
      scope1.declareVariable("G6$");
      String[] stringArray1 = scope1.getLocalVariables();
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("G6$");
      Scope scope1 = new Scope(scope0, stringArray0);
      scope1.declareVariable("G6$");
      String[] stringArray1 = scope1.getLocalVariables();
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[8];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      String[] stringArray1 = scope0.getLocalVariables();
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      scope0.getSymbols();
      assertEquals(0, scope0.getArgCount());
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("G6$");
      Scope scope1 = new Scope(scope0, stringArray0);
      scope1.declareVariable("G6$");
      Integer integer0 = scope1.getCaptured(0);
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      Integer integer0 = scope0.getCaptured(0);
      assertNotNull(integer0);
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("G6$");
      Scope scope1 = new Scope(scope0, stringArray0);
      String[] stringArray1 = scope0.getSymbols();
      scope1.declareVariable("G6$");
      Frame frame0 = new Frame(scope1, stringArray1, 2);
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("G6$");
      Scope scope1 = new Scope(scope0, stringArray0);
      String[] stringArray1 = scope0.getSymbols();
      scope1.declareVariable("G6$");
      Frame frame0 = new Frame(scope1, stringArray1, 2);
      Frame frame1 = scope1.createFrame(frame0, stringArray1);
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      Frame frame0 = scope0.createFrame((Frame) null, stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      Frame frame0 = new Frame(scope0, (Object[]) null, (-45));
      scope0.createFrame(frame0, (Object[]) null);
      assertEquals(1, scope0.getArgCount());
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      assertEquals(0, scope0.getArgCount());
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      Frame frame0 = new Frame((Scope) null, stringArray0, 0);
      Frame frame1 = scope0.createFrame(frame0, stringArray0);
      ;
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      Frame frame0 = new Frame((Scope) null, stringArray0, 0);
      Frame frame1 = scope0.createFrame(frame0, stringArray0);
      String[] stringArray1 = frame1.getUnboundParameters();
      ;
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("G6$");
      int int0 = scope0.declareVariable("G6$");
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      Scope scope0 = new Scope((Scope) null, stringArray0);
      int int0 = scope0.declareParameter("");
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      Scope scope0 = new Scope((Scope) null, stringArray0);
      int int0 = scope0.declareParameter("");
      assertEquals(1, scope0.getArgCount());
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("G6$");
      // Undeclared exception!
      try { 
        scope0.declareParameter("G6$");
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
         //
         // cant declare parameters after variables
         //
         verifyException("org.apache.commons.jexl3.internal.Scope", e);
      }
  }
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      scope0.declareParameter(";N4rO%%Iz4t[wWSl");
      int int0 = scope0.getArgCount();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("G6$");
      Scope scope1 = new Scope(scope0, stringArray0);
      scope1.declareVariable("G6$");
      boolean boolean0 = scope1.isCapturedSymbol(0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("org.apache.commons.jexl3.internal.Frame");
      Scope scope1 = new Scope(scope0, (String[]) null);
      scope1.getSymbol("org.apache.commons.jexl3.internal.Frame");
      boolean boolean0 = scope1.isCapturedSymbol(2);
      ;
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("org.apache.commons.jexl3.internal.Frame");
      Scope scope1 = new Scope(scope0, (String[]) null);
      scope1.getSymbol("org.apache.commons.jexl3.internal.Frame");
      boolean boolean0 = scope1.isCapturedSymbol(2);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      boolean boolean0 = scope0.isCapturedSymbol(0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("G6$");
      Scope scope1 = new Scope(scope0, stringArray0);
      scope1.declareVariable("G6$");
      scope0.declareVariable("");
      scope1.getSymbol("");
      ;
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      Scope scope1 = new Scope(scope0, (String[]) null);
      Integer integer0 = scope1.getSymbol("1S_G`AU@ d}H3Spi[");
      ;
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      Scope scope1 = new Scope(scope0, (String[]) null);
      Integer integer0 = scope1.getSymbol("1S_G`AU@ d}H3Spi[");
      assertEquals(0, scope1.getArgCount());
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      Scope scope1 = new Scope((Scope) null, (String[]) null);
      boolean boolean0 = scope0.equals(scope1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      Scope scope1 = new Scope((Scope) null, (String[]) null);
      boolean boolean0 = scope0.equals(scope1);
      assertEquals(0, scope1.getArgCount());
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      scope0.declareVariable("=sy{%||ITCZGxs+*6");
      String[] stringArray0 = scope0.getLocalVariables();
      Scope scope1 = new Scope(scope0, stringArray0);
      boolean boolean0 = scope0.equals(scope1);
      ;
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      scope0.declareVariable("=sy{%||ITCZGxs+*6");
      String[] stringArray0 = scope0.getLocalVariables();
      Scope scope1 = new Scope(scope0, stringArray0);
      boolean boolean0 = scope0.equals(scope1);
      ;
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      scope0.declareVariable("=sy{%||ITCZGxs+*6");
      String[] stringArray0 = scope0.getLocalVariables();
      Scope scope1 = new Scope(scope0, stringArray0);
      boolean boolean0 = scope0.equals(scope1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      Object object0 = new Object();
      boolean boolean0 = scope0.equals(object0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      Object object0 = new Object();
      boolean boolean0 = scope0.equals(object0);
      assertEquals(0, scope0.getArgCount());
}
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      boolean boolean0 = scope0.equals(scope0);
      assertEquals(1, scope0.getArgCount());
}
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      boolean boolean0 = scope0.equals(scope0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      String[] stringArray0 = scope0.getLocalVariables();
      Scope scope1 = new Scope((Scope) null, stringArray0);
      boolean boolean0 = scope0.equals(scope1);
      assertEquals(0, scope0.getArgCount());
}
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      String[] stringArray0 = scope0.getLocalVariables();
      Scope scope1 = new Scope((Scope) null, stringArray0);
      boolean boolean0 = scope0.equals(scope1);
      ;
}
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      String[] stringArray0 = scope0.getLocalVariables();
      Scope scope1 = new Scope((Scope) null, stringArray0);
      boolean boolean0 = scope0.equals(scope1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      scope0.hashCode();
      assertEquals(0, scope0.getArgCount());
}
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      scope0.declareVariable("lW(G^y^x+qJ");
      String[] stringArray1 = scope0.getLocalVariables();
      ;
}
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      Scope scope1 = new Scope(scope0, (String[]) null);
      boolean boolean0 = scope0.equals(scope1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Scope scope0 = new Scope((Scope) null, stringArray0);
      Scope scope1 = new Scope(scope0, (String[]) null);
      boolean boolean0 = scope0.equals(scope1);
      assertEquals(0, scope1.getArgCount());
}
 @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      int int0 = scope0.getArgCount();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Scope scope0 = new Scope((Scope) null, (String[]) null);
      scope0.getParameters();
      assertEquals(1, scope0.getArgCount());
}
}
