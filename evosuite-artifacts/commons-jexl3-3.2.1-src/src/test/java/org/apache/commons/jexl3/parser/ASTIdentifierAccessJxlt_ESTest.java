/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 18:20:55 GMT 2022
 */

package org.apache.commons.jexl3.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jexl3.JxltEngine;
import org.apache.commons.jexl3.parser.ASTIdentifierAccessJxlt;
import org.apache.commons.jexl3.parser.ASTIdentifierAccessSafeJxlt;
import org.apache.commons.jexl3.parser.Parser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ASTIdentifierAccessJxlt_ESTest extends ASTIdentifierAccessJxlt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Parser parser0 = new Parser("true");
      ASTIdentifierAccessJxlt aSTIdentifierAccessJxlt0 = new ASTIdentifierAccessJxlt(parser0, 1205);
      assertEquals(1048575, aSTIdentifierAccessJxlt0.getLine());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ASTIdentifierAccessJxlt aSTIdentifierAccessJxlt0 = new ASTIdentifierAccessJxlt(0);
      assertNull(aSTIdentifierAccessJxlt0.getName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ASTIdentifierAccessSafeJxlt aSTIdentifierAccessSafeJxlt0 = new ASTIdentifierAccessSafeJxlt((Parser) null, (-12));
      boolean boolean0 = aSTIdentifierAccessSafeJxlt0.isExpression();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ASTIdentifierAccessSafeJxlt aSTIdentifierAccessSafeJxlt0 = new ASTIdentifierAccessSafeJxlt(2708);
      aSTIdentifierAccessSafeJxlt0.setExpression((JxltEngine.Expression) null);
      assertEquals(0, aSTIdentifierAccessSafeJxlt0.jjtGetNumChildren());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ASTIdentifierAccessSafeJxlt aSTIdentifierAccessSafeJxlt0 = new ASTIdentifierAccessSafeJxlt(2708);
      JxltEngine.Expression jxltEngine_Expression0 = aSTIdentifierAccessSafeJxlt0.getExpression();
      assertNull(jxltEngine_Expression0);
  }
}
