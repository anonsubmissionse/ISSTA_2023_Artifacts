/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 17:46:47 GMT 2022
 */

package org.apache.commons.jexl3.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlInfo;
import org.apache.commons.jexl3.JxltEngine;
import org.apache.commons.jexl3.internal.Engine;
import org.apache.commons.jexl3.internal.TemplateDebugger;
import org.apache.commons.jexl3.internal.TemplateEngine;
import org.apache.commons.jexl3.internal.TemplateScript;
import org.apache.commons.jexl3.parser.ASTBlock;
import org.apache.commons.jexl3.parser.ASTFalseNode;
import org.apache.commons.jexl3.parser.ASTJexlScript;
import org.apache.commons.jexl3.parser.ASTMapEntry;
import org.apache.commons.jexl3.parser.ASTNumberLiteral;
import org.apache.commons.jexl3.parser.ASTSetAddNode;
import org.apache.commons.jexl3.parser.JexlLexicalNode;
import org.apache.commons.jexl3.parser.JexlNode;
import org.apache.commons.jexl3.parser.Parser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TemplateDebugger_ESTest extends TemplateDebugger_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      Engine engine0 = new Engine();
      TemplateEngine templateEngine0 = engine0.jxlt();
      StringReader stringReader0 = new StringReader("");
      JxltEngine.Template jxltEngine_Template0 = templateEngine0.createTemplate("", (Reader) stringReader0, (String[]) null);
      templateDebugger0.debug(jxltEngine_Template0);
      ASTBlock aSTBlock0 = new ASTBlock(0);
      ASTFalseNode aSTFalseNode0 = new ASTFalseNode(0);
      aSTBlock0.jjtAddChild(aSTFalseNode0, 0);
      aSTBlock0.jjtAddChild(aSTBlock0, 10);
      TemplateEngine.ImmediateExpression templateEngine_ImmediateExpression0 = templateEngine0.new ImmediateExpression("", aSTBlock0, (TemplateEngine.TemplateExpression) null);
      // Undeclared exception!
      try { 
        templateDebugger0.debug((JxltEngine.Expression) templateEngine_ImmediateExpression0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.internal.Debugger", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      templateDebugger0.indent = (-540);
      ASTBlock aSTBlock0 = new ASTBlock((-540));
      JexlBuilder jexlBuilder0 = new JexlBuilder();
      Engine engine0 = new Engine(jexlBuilder0);
      TemplateEngine templateEngine0 = engine0.jxlt();
      JxltEngine.Template jxltEngine_Template0 = templateEngine0.createTemplate("=$");
      templateDebugger0.debug(jxltEngine_Template0);
      templateDebugger0.visit(aSTBlock0, "(pTFQ=pYb$P");
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      Parser parser0 = new Parser("Block");
      ASTSetAddNode aSTSetAddNode0 = new ASTSetAddNode(parser0, (-807));
      JexlBuilder jexlBuilder0 = new JexlBuilder();
      Engine engine0 = new Engine(jexlBuilder0);
      TemplateEngine templateEngine0 = engine0.jxlt();
      TemplateEngine.NestedExpression templateEngine_NestedExpression0 = templateEngine0.new NestedExpression("Block", aSTSetAddNode0, (TemplateEngine.TemplateExpression) null);
      boolean boolean0 = templateDebugger0.debug((JxltEngine.Expression) templateEngine_NestedExpression0);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      ASTBlock aSTBlock0 = new ASTBlock((-507));
      templateDebugger0.visit(aSTBlock0, (Object) null);
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      ASTBlock aSTBlock0 = new ASTBlock(1462);
      templateDebugger0.acceptStatement(aSTBlock0, (Object) null);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      templateDebugger0.indentLevel = 2715;
      Parser parser0 = new Parser("");
      ASTBlock aSTBlock0 = new ASTBlock(parser0, 2715);
      aSTBlock0.jjtAccept(templateDebugger0, "");
      // Undeclared exception!
      templateDebugger0.visit(aSTBlock0, aSTBlock0);
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      // Undeclared exception!
      try { 
        templateDebugger0.visit((ASTBlock) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.internal.Debugger", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      JexlBuilder jexlBuilder0 = new JexlBuilder();
      Engine engine0 = new Engine(jexlBuilder0);
      TemplateEngine templateEngine0 = new TemplateEngine(engine0, false, (-3194), '$', 'h');
      TemplateEngine.Block[] templateEngine_BlockArray0 = new TemplateEngine.Block[6];
      TemplateEngine.TemplateExpression[] templateEngine_TemplateExpressionArray0 = new TemplateEngine.TemplateExpression[7];
      TemplateScript templateScript0 = new TemplateScript(templateEngine0, "", templateEngine_BlockArray0, (ASTJexlScript) null, templateEngine_TemplateExpressionArray0);
      // Undeclared exception!
      try { 
        templateDebugger0.debug((JxltEngine.Template) templateScript0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.internal.TemplateDebugger", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      JexlLexicalNode jexlLexicalNode0 = new JexlLexicalNode((Parser) null, (-1532));
      // Undeclared exception!
      try { 
        templateDebugger0.acceptStatement(jexlLexicalNode0, (Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // JexlLexicalNode : not supported yet.
         //
         verifyException("org.apache.commons.jexl3.parser.ParserVisitor", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      // Undeclared exception!
      try { 
        templateDebugger0.acceptStatement((JexlNode) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.internal.Debugger", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      Engine engine0 = new Engine();
      TemplateEngine templateEngine0 = engine0.createJxltEngine(true, (-6472), 'z', 'z');
      StringBuilder stringBuilder0 = new StringBuilder("_;JdztAe");
      Parser parser0 = new Parser("_;JdztAe");
      ASTMapEntry aSTMapEntry0 = new ASTMapEntry(parser0, (-3814));
      TemplateEngine.DeferredExpression templateEngine_DeferredExpression0 = templateEngine0.new DeferredExpression(stringBuilder0, aSTMapEntry0, (TemplateEngine.TemplateExpression) null);
      // Undeclared exception!
      try { 
        templateDebugger0.debug((JxltEngine.Expression) templateEngine_DeferredExpression0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      JexlBuilder jexlBuilder0 = new JexlBuilder();
      Engine engine0 = new Engine(jexlBuilder0);
      TemplateEngine templateEngine0 = engine0.createJxltEngine(false, 2185, '/', '/');
      JxltEngine.Template jxltEngine_Template0 = templateEngine0.createTemplate("K]%p(L#+");
      templateDebugger0.debug(jxltEngine_Template0);
      ASTBlock aSTBlock0 = new ASTBlock(1462);
      templateDebugger0.visit(aSTBlock0, templateEngine0);
      TemplateEngine.ConstantExpression templateEngine_ConstantExpression0 = templateEngine0.new ConstantExpression(jexlBuilder0, (TemplateEngine.TemplateExpression) null);
      templateDebugger0.acceptStatement(aSTBlock0, templateEngine_ConstantExpression0);
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      JexlBuilder jexlBuilder0 = new JexlBuilder();
      Engine engine0 = new Engine(jexlBuilder0);
      TemplateEngine templateEngine0 = engine0.createJxltEngine(false, 2185, '/', '/');
      JxltEngine.Template jxltEngine_Template0 = templateEngine0.createTemplate("K]%p(L#+");
      templateDebugger0.debug(jxltEngine_Template0);
      ASTBlock aSTBlock0 = new ASTBlock(1462);
      TemplateEngine.ConstantExpression templateEngine_ConstantExpression0 = templateEngine0.new ConstantExpression(jexlBuilder0, (TemplateEngine.TemplateExpression) null);
      ASTNumberLiteral aSTNumberLiteral0 = mock(ASTNumberLiteral.class, new ViolatedAssumptionAnswer());
      doReturn("vu=k9;:C_").when(aSTNumberLiteral0).toString();
      templateDebugger0.visit(aSTNumberLiteral0, aSTBlock0);
      templateDebugger0.acceptStatement(aSTBlock0, templateEngine_ConstantExpression0);
      assertEquals(0, templateDebugger0.end());
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      JexlBuilder jexlBuilder0 = new JexlBuilder();
      Engine engine0 = new Engine();
      TemplateEngine templateEngine0 = engine0.jxlt();
      JxltEngine.Template jxltEngine_Template0 = templateEngine0.createTemplate("K]%p(L#+");
      templateDebugger0.debug(jxltEngine_Template0);
      ASTBlock aSTBlock0 = new ASTBlock('/');
      templateDebugger0.indentLevel = 75;
      TemplateEngine.ConstantExpression templateEngine_ConstantExpression0 = templateEngine0.new ConstantExpression(jexlBuilder0, (TemplateEngine.TemplateExpression) null);
      templateDebugger0.visit(aSTBlock0, templateEngine_ConstantExpression0);
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      Engine engine0 = new Engine();
      TemplateEngine templateEngine0 = engine0.jxlt();
      StringReader stringReader0 = new StringReader("");
      JxltEngine.Template jxltEngine_Template0 = templateEngine0.createTemplate("", (Reader) stringReader0, (String[]) null);
      templateDebugger0.debug(jxltEngine_Template0);
      ASTBlock aSTBlock0 = new ASTBlock(0);
      ASTFalseNode aSTFalseNode0 = new ASTFalseNode(0);
      aSTBlock0.jjtAddChild(aSTFalseNode0, 0);
      TemplateEngine.ImmediateExpression templateEngine_ImmediateExpression0 = templateEngine0.new ImmediateExpression("", aSTBlock0, (TemplateEngine.TemplateExpression) null);
      templateDebugger0.debug((JxltEngine.Expression) templateEngine_ImmediateExpression0);
      assertNotNull(templateDebugger0.toString());
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      Engine engine0 = new Engine();
      templateDebugger0.indentation((-1419));
      ASTBlock aSTBlock0 = new ASTBlock((-1419));
      TemplateEngine templateEngine0 = engine0.jxlt();
      JexlInfo jexlInfo0 = new JexlInfo();
      String[] stringArray0 = new String[3];
      JxltEngine.Template jxltEngine_Template0 = templateEngine0.createTemplate(jexlInfo0, "r;Ik,k;qi.a%b^~-|0", stringArray0);
      templateDebugger0.debug(jxltEngine_Template0);
      templateDebugger0.visit(aSTBlock0, "r;Ik,k;qi.a%b^~-|0");
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      Engine engine0 = new Engine();
      TemplateEngine templateEngine0 = new TemplateEngine(engine0, false, 5, 'I', 'I');
      StringReader stringReader0 = new StringReader("ses");
      String[] stringArray0 = new String[3];
      JxltEngine.Template jxltEngine_Template0 = templateEngine0.createTemplate("", (Reader) stringReader0, stringArray0);
      boolean boolean0 = templateDebugger0.debug(jxltEngine_Template0);
      assertNotNull(templateDebugger0.toString());
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      Engine engine0 = new Engine();
      TemplateEngine templateEngine0 = new TemplateEngine(engine0, false, 5, 'I', 'I');
      StringReader stringReader0 = new StringReader("ses");
      String[] stringArray0 = new String[3];
      JxltEngine.Template jxltEngine_Template0 = templateEngine0.createTemplate("", (Reader) stringReader0, stringArray0);
      boolean boolean0 = templateDebugger0.debug(jxltEngine_Template0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      TemplateEngine.Block[] templateEngine_BlockArray0 = new TemplateEngine.Block[1];
      ASTJexlScript aSTJexlScript0 = new ASTJexlScript((byte)2);
      TemplateScript templateScript0 = new TemplateScript((TemplateEngine) null, "", templateEngine_BlockArray0, aSTJexlScript0, (TemplateEngine.TemplateExpression[]) null);
      boolean boolean0 = templateDebugger0.debug((JxltEngine.Template) templateScript0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      TemplateEngine.Block[] templateEngine_BlockArray0 = new TemplateEngine.Block[1];
      ASTJexlScript aSTJexlScript0 = new ASTJexlScript((byte)2);
      TemplateScript templateScript0 = new TemplateScript((TemplateEngine) null, "", templateEngine_BlockArray0, aSTJexlScript0, (TemplateEngine.TemplateExpression[]) null);
      boolean boolean0 = templateDebugger0.debug((JxltEngine.Template) templateScript0);
      assertEquals(1, templateDebugger0.start());
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      boolean boolean0 = templateDebugger0.debug((JxltEngine.Template) null);
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      boolean boolean0 = templateDebugger0.debug((JxltEngine.Expression) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      templateDebugger0.reset();
      assertNotNull(templateDebugger0.toString());
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      Engine engine0 = new Engine();
      TemplateEngine templateEngine0 = new TemplateEngine(engine0, false, (-507), 'A', '<');
      String[] stringArray0 = new String[6];
      JxltEngine.Template jxltEngine_Template0 = templateEngine0.createTemplate("<{null} /*= null */", stringArray0);
      boolean boolean0 = templateDebugger0.debug(jxltEngine_Template0);
      assertEquals(0, templateDebugger0.end());
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TemplateDebugger templateDebugger0 = new TemplateDebugger();
      Engine engine0 = new Engine();
      TemplateEngine templateEngine0 = new TemplateEngine(engine0, false, (-507), 'A', '<');
      String[] stringArray0 = new String[6];
      JxltEngine.Template jxltEngine_Template0 = templateEngine0.createTemplate("<{null} /*= null */", stringArray0);
      boolean boolean0 = templateDebugger0.debug(jxltEngine_Template0);
      assertTrue(boolean0);
}
}
