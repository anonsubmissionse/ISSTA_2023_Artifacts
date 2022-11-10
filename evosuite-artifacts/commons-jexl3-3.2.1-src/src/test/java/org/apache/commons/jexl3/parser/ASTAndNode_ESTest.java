/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 18:19:13 GMT 2022
 */

package org.apache.commons.jexl3.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlFeatures;
import org.apache.commons.jexl3.parser.ASTAndNode;
import org.apache.commons.jexl3.parser.FeatureController;
import org.apache.commons.jexl3.parser.OperatorController;
import org.apache.commons.jexl3.parser.Parser;
import org.apache.commons.jexl3.parser.ParserVisitor;
import org.apache.commons.jexl3.parser.StreamProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ASTAndNode_ESTest extends ASTAndNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ASTAndNode aSTAndNode0 = new ASTAndNode(0);
      OperatorController operatorController0 = OperatorController.INSTANCE;
      Object object0 = aSTAndNode0.jjtAccept(operatorController0, operatorController0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ASTAndNode aSTAndNode0 = new ASTAndNode((-3830));
      // Undeclared exception!
      try { 
        aSTAndNode0.jjtAccept((ParserVisitor) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.parser.ASTAndNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ow!Nz>SZ");
      StreamProvider streamProvider0 = new StreamProvider(stringReader0);
      Parser parser0 = new Parser(streamProvider0);
      ASTAndNode aSTAndNode0 = new ASTAndNode(parser0, 0);
      JexlFeatures jexlFeatures0 = JexlEngine.DEFAULT_FEATURES;
      FeatureController featureController0 = new FeatureController(jexlFeatures0);
      Object object0 = aSTAndNode0.jjtAccept(featureController0, (Object) null);
      assertNull(object0);
  }
}
