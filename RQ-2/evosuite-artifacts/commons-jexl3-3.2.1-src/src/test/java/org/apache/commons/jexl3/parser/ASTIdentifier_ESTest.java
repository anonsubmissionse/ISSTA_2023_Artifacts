/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 18:17:15 GMT 2022
 */

package org.apache.commons.jexl3.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlFeatures;
import org.apache.commons.jexl3.parser.ASTIdentifier;
import org.apache.commons.jexl3.parser.ASTNamespaceIdentifier;
import org.apache.commons.jexl3.parser.ASTVar;
import org.apache.commons.jexl3.parser.FeatureController;
import org.apache.commons.jexl3.parser.OperatorController;
import org.apache.commons.jexl3.parser.Parser;
import org.apache.commons.jexl3.parser.ParserTokenManager;
import org.apache.commons.jexl3.parser.ParserVisitor;
import org.apache.commons.jexl3.parser.SimpleCharStream;
import org.apache.commons.jexl3.parser.StringProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ASTIdentifier_ESTest extends ASTIdentifier_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier((-930));
      aSTNamespaceIdentifier0.setCaptured(false);
      assertTrue(aSTNamespaceIdentifier0.isRedefined());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier((-930));
      aSTNamespaceIdentifier0.setCaptured(false);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier((-930));
      aSTNamespaceIdentifier0.setCaptured(false);
      assertFalse(aSTNamespaceIdentifier0.isShaded());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier((-930));
      aSTNamespaceIdentifier0.setCaptured(false);
      assertFalse(aSTNamespaceIdentifier0.isCaptured());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(0);
      aSTIdentifier0.setCaptured(true);
      boolean boolean0 = aSTIdentifier0.isShaded();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(0);
      aSTIdentifier0.setCaptured(true);
      boolean boolean0 = aSTIdentifier0.isShaded();
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier(58);
      aSTNamespaceIdentifier0.setShaded(false);
      assertEquals(0, aSTNamespaceIdentifier0.getSymbol());
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier(58);
      aSTNamespaceIdentifier0.setShaded(false);
      assertTrue(aSTNamespaceIdentifier0.isRedefined());
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier(58);
      aSTNamespaceIdentifier0.setShaded(false);
      assertFalse(aSTNamespaceIdentifier0.isShaded());
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier(58);
      aSTNamespaceIdentifier0.setRedefined(true);
      assertTrue(aSTNamespaceIdentifier0.isRedefined());
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier(58);
      aSTNamespaceIdentifier0.setRedefined(true);
      aSTNamespaceIdentifier0.setRedefined(false);
      assertTrue(aSTNamespaceIdentifier0.isRedefined());
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ASTVar aSTVar0 = new ASTVar(0);
      aSTVar0.setShaded(true);
      aSTVar0.setShaded(true);
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier((-930));
      aSTNamespaceIdentifier0.setSymbol("\"return\"");
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier((-930));
      aSTNamespaceIdentifier0.setSymbol("\"return\"");
      assertEquals(0, aSTNamespaceIdentifier0.getSymbol());
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier(58);
      aSTNamespaceIdentifier0.setNamespace("Oj", "}iKCE?Gu)vGOiOw;xo");
      aSTNamespaceIdentifier0.toString();
      assertEquals(0, aSTNamespaceIdentifier0.getSymbol());
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier(58);
      aSTNamespaceIdentifier0.setNamespace("Oj", "}iKCE?Gu)vGOiOw;xo");
      aSTNamespaceIdentifier0.toString();
      assertTrue(aSTNamespaceIdentifier0.isRedefined());
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier(58);
      aSTNamespaceIdentifier0.setSymbol(1153, "");
      aSTNamespaceIdentifier0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier((Parser) null, 9);
      JexlFeatures jexlFeatures0 = JexlEngine.DEFAULT_FEATURES;
      FeatureController featureController0 = new FeatureController(jexlFeatures0);
      aSTIdentifier0.jjtAccept(featureController0, (Object) null);
      assertTrue(aSTIdentifier0.isRedefined());
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier((Parser) null, 9);
      JexlFeatures jexlFeatures0 = JexlEngine.DEFAULT_FEATURES;
      FeatureController featureController0 = new FeatureController(jexlFeatures0);
      aSTIdentifier0.jjtAccept(featureController0, (Object) null);
      assertEquals(0, aSTIdentifier0.getSymbol());
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier((-930));
      ;
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier((-930));
      aSTNamespaceIdentifier0.setRedefined(true);
      boolean boolean0 = aSTNamespaceIdentifier0.isRedefined();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Parser parser0 = new Parser("");
      ASTVar aSTVar0 = new ASTVar(parser0, 0);
      assertEquals(0, aSTVar0.getSymbol());
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Parser parser0 = new Parser("");
      ASTVar aSTVar0 = new ASTVar(parser0, 0);
      aSTVar0.setSymbol(0, "");
      int int0 = aSTVar0.getSymbol();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringProvider stringProvider0 = new StringProvider("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringProvider0, 1472, 1472);
      ParserTokenManager parserTokenManager0 = new ParserTokenManager(simpleCharStream0);
      Parser parser0 = new Parser(parserTokenManager0);
      ASTVar aSTVar0 = new ASTVar(parser0, 1472);
      aSTVar0.setSymbol(35, "");
      int int0 = aSTVar0.getSymbol();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier(58);
      aSTNamespaceIdentifier0.setNamespace("}iKCE?Gu)vGOiOw;xo", "");
      aSTNamespaceIdentifier0.getNamespace();
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier(58);
      aSTNamespaceIdentifier0.setNamespace("}iKCE?Gu)vGOiOw;xo", "");
      aSTNamespaceIdentifier0.getNamespace();
      assertEquals(0, aSTNamespaceIdentifier0.getSymbol());
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier((-930));
      aSTNamespaceIdentifier0.setNamespace("", "IUr[Q2oA");
      aSTNamespaceIdentifier0.getNamespace();
      assertTrue(aSTNamespaceIdentifier0.isRedefined());
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier((-930));
      aSTNamespaceIdentifier0.setNamespace("", "IUr[Q2oA");
      aSTNamespaceIdentifier0.getNamespace();
      assertEquals(0, aSTNamespaceIdentifier0.getSymbol());
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier(58);
      aSTNamespaceIdentifier0.setNamespace("Oj", "}iKCE?Gu)vGOiOw;xo");
      aSTNamespaceIdentifier0.getName();
      assertEquals(0, aSTNamespaceIdentifier0.getSymbol());
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier(58);
      aSTNamespaceIdentifier0.setNamespace("Oj", "}iKCE?Gu)vGOiOw;xo");
      aSTNamespaceIdentifier0.getName();
      ;
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringProvider stringProvider0 = new StringProvider("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringProvider0, 1472, 1472);
      ParserTokenManager parserTokenManager0 = new ParserTokenManager(simpleCharStream0);
      Parser parser0 = new Parser(parserTokenManager0);
      ASTVar aSTVar0 = new ASTVar(parser0, 1472);
      aSTVar0.setSymbol(35, "");
      aSTVar0.getName();
      assertEquals(0, aSTVar0.getSymbol());
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(123);
      // Undeclared exception!
      try { 
        aSTIdentifier0.setSymbol("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(0);
      // Undeclared exception!
      try { 
        aSTIdentifier0.setSymbol((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.parser.ASTIdentifier", e);
      }
  }
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(253);
      // Undeclared exception!
      try { 
        aSTIdentifier0.jjtAccept((ParserVisitor) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.parser.ASTIdentifier", e);
      }
  }
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier(58);
      OperatorController operatorController0 = OperatorController.INSTANCE;
      Integer integer0 = new Integer(0);
      aSTNamespaceIdentifier0.jjtAccept(operatorController0, integer0);
      assertEquals(0, aSTNamespaceIdentifier0.getSymbol());
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ASTNamespaceIdentifier aSTNamespaceIdentifier0 = new ASTNamespaceIdentifier(58);
      OperatorController operatorController0 = OperatorController.INSTANCE;
      Integer integer0 = new Integer(0);
      aSTNamespaceIdentifier0.jjtAccept(operatorController0, integer0);
      ;
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(0);
      aSTIdentifier0.toString();
      assertFalse(aSTIdentifier0.isRedefined());
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(0);
      aSTIdentifier0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ASTVar aSTVar0 = new ASTVar(2906);
      assertFalse(aSTVar0.isShaded());
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ASTVar aSTVar0 = new ASTVar(2906);
      aSTVar0.flags = 2906;
      boolean boolean0 = aSTVar0.isShaded();
      ;
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ASTVar aSTVar0 = new ASTVar(2906);
      aSTVar0.setSymbol("org.apache.commns.jexl3.parser.ASTdentifier");
      assertTrue(aSTVar0.isRedefined());
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ASTVar aSTVar0 = new ASTVar(2906);
      aSTVar0.setSymbol("org.apache.commns.jexl3.parser.ASTdentifier");
      ;
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(0);
      boolean boolean0 = aSTIdentifier0.isCaptured();
      ;
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(0);
      boolean boolean0 = aSTIdentifier0.isCaptured();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(0);
      boolean boolean0 = aSTIdentifier0.isCaptured();
      assertFalse(aSTIdentifier0.isRedefined());
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ASTVar aSTVar0 = new ASTVar(2906);
      boolean boolean0 = aSTVar0.isRedefined();
      assertEquals(0, aSTVar0.getSymbol());
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ASTVar aSTVar0 = new ASTVar(2906);
      boolean boolean0 = aSTVar0.isRedefined();
      ;
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(0);
      int int0 = aSTIdentifier0.getSymbol();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(0);
      int int0 = aSTIdentifier0.getSymbol();
      ;
}
 @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(0);
      assertTrue(aSTIdentifier0.isCaptured());
}
 @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(0);
      aSTIdentifier0.setCaptured(true);
      boolean boolean0 = aSTIdentifier0.isCaptured();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(3573);
      aSTIdentifier0.getName();
      ;
}
 @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(3573);
      aSTIdentifier0.getName();
      assertEquals(0, aSTIdentifier0.getSymbol());
}
 @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier((Parser) null, 75);
      // Undeclared exception!
      try { 
        aSTIdentifier0.setSymbol("#)DJmP");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
         //
         // For input string: \")DJmP\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
 @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(0);
      aSTIdentifier0.getNamespace();
      assertEquals(0, aSTIdentifier0.getSymbol());
}
 @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ASTIdentifier aSTIdentifier0 = new ASTIdentifier(0);
      aSTIdentifier0.getNamespace();
      assertTrue(aSTIdentifier0.isRedefined());
}
}
