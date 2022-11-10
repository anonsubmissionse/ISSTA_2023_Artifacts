/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 18:08:39 GMT 2022
 */

package org.apache.commons.jexl3.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlFeatures;
import org.apache.commons.jexl3.parser.ASTIdentifierAccess;
import org.apache.commons.jexl3.parser.ASTIdentifierAccessJxlt;
import org.apache.commons.jexl3.parser.ASTIdentifierAccessSafe;
import org.apache.commons.jexl3.parser.ASTIdentifierAccessSafeJxlt;
import org.apache.commons.jexl3.parser.FeatureController;
import org.apache.commons.jexl3.parser.OperatorController;
import org.apache.commons.jexl3.parser.Parser;
import org.apache.commons.jexl3.parser.ParserVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ASTIdentifierAccess_ESTest extends ASTIdentifierAccess_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Parser parser0 = new Parser("]'bZYNkqseaYPde \"V");
      ASTIdentifierAccess aSTIdentifierAccess0 = new ASTIdentifierAccess(parser0, 57);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ASTIdentifierAccessJxlt aSTIdentifierAccessJxlt0 = new ASTIdentifierAccessJxlt(601);
      aSTIdentifierAccessJxlt0.setIdentifier("0000");
      String string0 = aSTIdentifierAccessJxlt0.toString();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ASTIdentifierAccess aSTIdentifierAccess0 = new ASTIdentifierAccess(0);
      aSTIdentifierAccess0.setIdentifier("");
      String string0 = aSTIdentifierAccess0.toString();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = ASTIdentifierAccess.parseIdentifier("49");
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = ASTIdentifierAccess.parseIdentifier("49");
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Integer integer0 = ASTIdentifierAccess.parseIdentifier("3801");
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Integer integer0 = ASTIdentifierAccess.parseIdentifier("3801");
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ASTIdentifierAccessJxlt aSTIdentifierAccessJxlt0 = new ASTIdentifierAccessJxlt(0);
      JexlFeatures jexlFeatures0 = JexlEngine.DEFAULT_FEATURES;
      FeatureController featureController0 = new FeatureController(jexlFeatures0);
      Object object0 = aSTIdentifierAccessJxlt0.jjtAccept(featureController0, (Object) null);
      assertNotNull(object0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ASTIdentifierAccessSafe aSTIdentifierAccessSafe0 = new ASTIdentifierAccessSafe((-1));
      boolean boolean0 = aSTIdentifierAccessSafe0.isSafe();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ASTIdentifierAccessJxlt aSTIdentifierAccessJxlt0 = new ASTIdentifierAccessJxlt(0);
      boolean boolean0 = aSTIdentifierAccessJxlt0.isExpression();
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ASTIdentifierAccessJxlt aSTIdentifierAccessJxlt0 = new ASTIdentifierAccessJxlt(601);
      aSTIdentifierAccessJxlt0.setIdentifier("0000");
      String string0 = aSTIdentifierAccessJxlt0.getName();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ASTIdentifierAccess aSTIdentifierAccess0 = new ASTIdentifierAccess(0);
      aSTIdentifierAccess0.setIdentifier("");
      String string0 = aSTIdentifierAccess0.getName();
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ASTIdentifierAccessJxlt aSTIdentifierAccessJxlt0 = new ASTIdentifierAccessJxlt((-425));
      // Undeclared exception!
      try { 
        aSTIdentifierAccessJxlt0.jjtAccept((ParserVisitor) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.parser.ASTIdentifierAccess", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = ASTIdentifierAccess.parseIdentifier("");
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = ASTIdentifierAccess.parseIdentifier((String) null);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ASTIdentifierAccess aSTIdentifierAccess0 = new ASTIdentifierAccess(0);
      boolean boolean0 = aSTIdentifierAccess0.isExpression();
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ASTIdentifierAccessJxlt aSTIdentifierAccessJxlt0 = new ASTIdentifierAccessJxlt((-2603));
      boolean boolean0 = aSTIdentifierAccessJxlt0.isSafe();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ASTIdentifierAccessSafeJxlt aSTIdentifierAccessSafeJxlt0 = new ASTIdentifierAccessSafeJxlt(1961);
      aSTIdentifierAccessSafeJxlt0.setIdentifier("");
      Object object0 = aSTIdentifierAccessSafeJxlt0.getIdentifier();
      assertEquals(0, object0);
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ASTIdentifierAccess aSTIdentifierAccess0 = new ASTIdentifierAccess(1569);
      Object object0 = aSTIdentifierAccess0.getIdentifier();
      assertNotNull(object0);
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Integer integer0 = ASTIdentifierAccess.parseIdentifier(")D\"~Tn+dbb_c@");
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = ASTIdentifierAccess.parseIdentifier("380r");
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = ASTIdentifierAccess.parseIdentifier("0");
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer integer0 = ASTIdentifierAccess.parseIdentifier("0");
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer integer0 = ASTIdentifierAccess.parseIdentifier("0}DB,IAF8wirMMR");
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ASTIdentifierAccessJxlt aSTIdentifierAccessJxlt0 = new ASTIdentifierAccessJxlt(332);
      boolean boolean0 = aSTIdentifierAccessJxlt0.isGlobalVar();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ASTIdentifierAccessJxlt aSTIdentifierAccessJxlt0 = new ASTIdentifierAccessJxlt(332);
      boolean boolean0 = aSTIdentifierAccessJxlt0.isGlobalVar();
      ;
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ASTIdentifierAccessSafeJxlt aSTIdentifierAccessSafeJxlt0 = new ASTIdentifierAccessSafeJxlt(1961);
      boolean boolean0 = aSTIdentifierAccessSafeJxlt0.isGlobalVar();
      ;
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ASTIdentifierAccessJxlt aSTIdentifierAccessJxlt0 = new ASTIdentifierAccessJxlt((-2603));
      String string0 = aSTIdentifierAccessJxlt0.toString();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ASTIdentifierAccessJxlt aSTIdentifierAccessJxlt0 = new ASTIdentifierAccessJxlt((-2603));
      String string0 = aSTIdentifierAccessJxlt0.getName();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ASTIdentifierAccess aSTIdentifierAccess0 = new ASTIdentifierAccess(1569);
      OperatorController operatorController0 = new OperatorController();
      Object object0 = aSTIdentifierAccess0.jjtAccept(operatorController0, "");
//TOGA incorrect assertion       assertTrue(object0);
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ASTIdentifierAccess aSTIdentifierAccess0 = new ASTIdentifierAccess(1569);
      boolean boolean0 = aSTIdentifierAccess0.isGlobalVar();
      ;
}
}
