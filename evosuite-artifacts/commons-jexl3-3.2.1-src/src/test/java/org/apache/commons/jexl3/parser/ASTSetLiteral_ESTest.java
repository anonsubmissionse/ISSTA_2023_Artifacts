/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 18:17:21 GMT 2022
 */

package org.apache.commons.jexl3.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlFeatures;
import org.apache.commons.jexl3.parser.ASTAssignment;
import org.apache.commons.jexl3.parser.ASTSetAddNode;
import org.apache.commons.jexl3.parser.ASTSetLiteral;
import org.apache.commons.jexl3.parser.FeatureController;
import org.apache.commons.jexl3.parser.JexlLexicalNode;
import org.apache.commons.jexl3.parser.JexlNode;
import org.apache.commons.jexl3.parser.OperatorController;
import org.apache.commons.jexl3.parser.Parser;
import org.apache.commons.jexl3.parser.ParserVisitor;
import org.apache.commons.jexl3.parser.StringProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ASTSetLiteral_ESTest extends ASTSetLiteral_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ASTSetLiteral aSTSetLiteral0 = new ASTSetLiteral((-1385));
      JexlNode[] jexlNodeArray0 = new JexlNode[4];
      jexlNodeArray0[0] = (JexlNode) aSTSetLiteral0;
      jexlNodeArray0[1] = (JexlNode) aSTSetLiteral0;
      jexlNodeArray0[2] = (JexlNode) aSTSetLiteral0;
      jexlNodeArray0[3] = (JexlNode) aSTSetLiteral0;
      aSTSetLiteral0.jjtSetChildren(jexlNodeArray0);
      aSTSetLiteral0.jjtClose();
      // Undeclared exception!
      try { 
        aSTSetLiteral0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ASTSetLiteral aSTSetLiteral0 = new ASTSetLiteral(0);
      assertFalse(aSTSetLiteral0.isConstant());
      
      JexlFeatures jexlFeatures0 = JexlEngine.DEFAULT_FEATURES;
      FeatureController featureController0 = new FeatureController(jexlFeatures0);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      aSTSetLiteral0.jjtClose();
      Locale.FilteringMode.values();
      aSTSetLiteral0.jjtAccept(featureController0, locale_FilteringMode0);
      boolean boolean0 = aSTSetLiteral0.isConstant(true);
      assertTrue(aSTSetLiteral0.isConstant());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ASTSetLiteral aSTSetLiteral0 = new ASTSetLiteral((-1));
      JexlFeatures jexlFeatures0 = JexlEngine.DEFAULT_FEATURES;
      FeatureController featureController0 = new FeatureController(jexlFeatures0);
      Integer integer0 = new Integer(12);
      aSTSetLiteral0.jjtAccept(featureController0, integer0);
      assertFalse(aSTSetLiteral0.isConstant());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringProvider stringProvider0 = new StringProvider("");
      Parser parser0 = new Parser(stringProvider0);
      ASTSetLiteral aSTSetLiteral0 = new ASTSetLiteral(parser0, 0);
      FeatureController featureController0 = parser0.featureController;
      aSTSetLiteral0.jjtGetValue();
      aSTSetLiteral0.childrenAccept(featureController0, (Object) null);
      aSTSetLiteral0.jjtAccept(featureController0, (Object) null);
      assertFalse(aSTSetLiteral0.isConstant());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ASTSetLiteral aSTSetLiteral0 = new ASTSetLiteral(60);
      aSTSetLiteral0.jjtClose();
      aSTSetLiteral0.isLocalVar();
      aSTSetLiteral0.jjtSetChildren((JexlNode[]) null);
      boolean boolean0 = false;
      aSTSetLiteral0.isSafeLhs(false);
      aSTSetLiteral0.toString();
      aSTSetLiteral0.isSafeLhs(false);
      ASTAssignment aSTAssignment0 = new ASTAssignment(60);
      aSTSetLiteral0.jjtAddChild(aSTAssignment0, 1080);
      // Undeclared exception!
      try { 
        aSTSetLiteral0.jjtClose();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.parser.ASTSetLiteral", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ASTSetLiteral aSTSetLiteral0 = new ASTSetLiteral(0);
      aSTSetLiteral0.clearCache();
      JexlLexicalNode jexlLexicalNode0 = new JexlLexicalNode((-1734));
      jexlLexicalNode0.jjtClose();
      jexlLexicalNode0.clearCache();
      aSTSetLiteral0.jjtAddChild(jexlLexicalNode0, 112);
      // Undeclared exception!
      try { 
        aSTSetLiteral0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.internal.Debugger", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parser parser0 = new Parser("org.apache.commons.jexl3.parser.ASTSetLiteral");
      parser0.ReInit("org.apache.commons.jexl3.parser.ASTSetLiteral");
      ASTSetLiteral aSTSetLiteral0 = new ASTSetLiteral(parser0, (-1));
      ParserVisitor parserVisitor0 = null;
      // Undeclared exception!
      try { 
        aSTSetLiteral0.jjtAccept((ParserVisitor) null, "org.apache.commons.jexl3.parser.ASTSetLiteral");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.parser.ASTSetLiteral", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ASTSetLiteral aSTSetLiteral0 = new ASTSetLiteral((-1227));
      OperatorController operatorController0 = new OperatorController();
      aSTSetLiteral0.jjtAccept(operatorController0, operatorController0);
      assertFalse(aSTSetLiteral0.isConstant());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parser parser0 = new Parser("");
      ASTSetLiteral aSTSetLiteral0 = new ASTSetLiteral(parser0, 0);
      assertFalse(aSTSetLiteral0.isConstant());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ASTSetLiteral aSTSetLiteral0 = new ASTSetLiteral(0);
      aSTSetLiteral0.toString();
      assertFalse(aSTSetLiteral0.isConstant());
      
      aSTSetLiteral0.jjtClose();
      assertTrue(aSTSetLiteral0.isConstant());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ASTSetLiteral aSTSetLiteral0 = new ASTSetLiteral(669);
      JexlNode[] jexlNodeArray0 = new JexlNode[7];
      jexlNodeArray0[0] = (JexlNode) aSTSetLiteral0;
      jexlNodeArray0[1] = (JexlNode) aSTSetLiteral0;
      jexlNodeArray0[2] = (JexlNode) aSTSetLiteral0;
      jexlNodeArray0[3] = (JexlNode) aSTSetLiteral0;
      jexlNodeArray0[4] = (JexlNode) aSTSetLiteral0;
      ASTSetAddNode aSTSetAddNode0 = new ASTSetAddNode((Parser) null, 669);
      jexlNodeArray0[5] = (JexlNode) aSTSetAddNode0;
      jexlNodeArray0[6] = (JexlNode) aSTSetLiteral0;
      aSTSetLiteral0.jjtSetChildren(jexlNodeArray0);
      aSTSetLiteral0.jexlInfo();
      aSTSetLiteral0.isConstant(false);
      aSTSetLiteral0.jjtClose();
      assertFalse(aSTSetLiteral0.isConstant());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parser parser0 = new Parser("");
      ASTSetLiteral aSTSetLiteral0 = new ASTSetLiteral(parser0, (-476));
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-476));
      Object object0 = new Object();
  }
}
