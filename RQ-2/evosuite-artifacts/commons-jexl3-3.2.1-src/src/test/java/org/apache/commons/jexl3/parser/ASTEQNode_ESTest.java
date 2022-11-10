/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 18:19:58 GMT 2022
 */

package org.apache.commons.jexl3.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import org.apache.commons.jexl3.parser.ASTEQNode;
import org.apache.commons.jexl3.parser.OperatorController;
import org.apache.commons.jexl3.parser.Parser;
import org.apache.commons.jexl3.parser.ParserTokenManager;
import org.apache.commons.jexl3.parser.ParserVisitor;
import org.apache.commons.jexl3.parser.SimpleCharStream;
import org.apache.commons.jexl3.parser.StreamProvider;
import org.apache.commons.jexl3.parser.StringProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ASTEQNode_ESTest extends ASTEQNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ASTEQNode aSTEQNode0 = new ASTEQNode(3434);
      OperatorController operatorController0 = new OperatorController();
      Object object0 = aSTEQNode0.jjtAccept(operatorController0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      StreamProvider streamProvider0 = new StreamProvider(stringReader0);
      Parser parser0 = new Parser(streamProvider0);
      ASTEQNode aSTEQNode0 = new ASTEQNode(parser0, 0);
      // Undeclared exception!
      try { 
        aSTEQNode0.jjtAccept((ParserVisitor) null, parser0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.parser.ASTEQNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringProvider stringProvider0 = new StringProvider("tN:mq");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringProvider0, 0, 108);
      ParserTokenManager parserTokenManager0 = new ParserTokenManager(simpleCharStream0);
      Parser parser0 = new Parser(parserTokenManager0);
      ASTEQNode aSTEQNode0 = new ASTEQNode(parser0, 108);
      OperatorController operatorController0 = OperatorController.INSTANCE;
      Object object0 = aSTEQNode0.jjtAccept(operatorController0, simpleCharStream0.DEFAULT_BUF_SIZE);
      assertEquals(4096, object0);
  }
}
