/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 18:19:25 GMT 2022
 */

package org.apache.commons.jexl3.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlFeatures;
import org.apache.commons.jexl3.parser.ASTBreak;
import org.apache.commons.jexl3.parser.FeatureController;
import org.apache.commons.jexl3.parser.Parser;
import org.apache.commons.jexl3.parser.ParserVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ASTBreak_ESTest extends ASTBreak_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ASTBreak aSTBreak0 = new ASTBreak((-107));
      JexlFeatures jexlFeatures0 = JexlEngine.DEFAULT_FEATURES;
      FeatureController featureController0 = new FeatureController(jexlFeatures0);
      Object object0 = aSTBreak0.jjtAccept(featureController0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ASTBreak aSTBreak0 = new ASTBreak(42);
      // Undeclared exception!
      try { 
        aSTBreak0.jjtAccept((ParserVisitor) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.parser.ASTBreak", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ASTBreak aSTBreak0 = new ASTBreak((-107));
      JexlFeatures jexlFeatures0 = JexlEngine.DEFAULT_FEATURES;
      FeatureController featureController0 = new FeatureController(jexlFeatures0);
      Object object0 = aSTBreak0.jjtAccept(featureController0, featureController0);
      assertSame(object0, featureController0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Parser parser0 = new Parser("org.apache.commons.jexl3.parser.ASTBitwiseXorNode");
      ASTBreak aSTBreak0 = new ASTBreak(parser0, 0);
      assertEquals(0, aSTBreak0.jjtGetNumChildren());
  }
}
