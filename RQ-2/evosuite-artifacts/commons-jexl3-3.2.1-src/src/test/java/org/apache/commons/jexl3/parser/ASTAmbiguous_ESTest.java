/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 18:25:16 GMT 2022
 */

package org.apache.commons.jexl3.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jexl3.parser.ASTAmbiguous;
import org.apache.commons.jexl3.parser.ASTIdentifierAccess;
import org.apache.commons.jexl3.parser.OperatorController;
import org.apache.commons.jexl3.parser.Parser;
import org.apache.commons.jexl3.parser.ParserVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ASTAmbiguous_ESTest extends ASTAmbiguous_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ASTAmbiguous aSTAmbiguous0 = new ASTAmbiguous(3841);
      // Undeclared exception!
      try { 
        aSTAmbiguous0.jjtAccept((ParserVisitor) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.parser.ASTAmbiguous", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ASTAmbiguous aSTAmbiguous0 = new ASTAmbiguous(0);
      OperatorController operatorController0 = new OperatorController();
      Integer integer0 = ASTIdentifierAccess.parseIdentifier("");
      // Undeclared exception!
      try { 
        aSTAmbiguous0.jjtAccept(operatorController0, integer0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // unexpected type of node
         //
         verifyException("org.apache.commons.jexl3.parser.ParserVisitor", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Parser parser0 = new Parser("");
      ASTAmbiguous aSTAmbiguous0 = new ASTAmbiguous(parser0, 0);
      ;
}
}
