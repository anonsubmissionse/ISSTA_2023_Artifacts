/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 18:20:46 GMT 2022
 */

package org.apache.commons.jexl3.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import org.apache.commons.jexl3.JexlFeatures;
import org.apache.commons.jexl3.parser.ASTArrayAccess;
import org.apache.commons.jexl3.parser.FeatureController;
import org.apache.commons.jexl3.parser.Parser;
import org.apache.commons.jexl3.parser.ParserVisitor;
import org.apache.commons.jexl3.parser.StreamProvider;
import org.apache.commons.jexl3.parser.StringProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ASTArrayAccess_ESTest extends ASTArrayAccess_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ASTArrayAccess aSTArrayAccess0 = new ASTArrayAccess(0);
      JexlFeatures jexlFeatures0 = new JexlFeatures();
      FeatureController featureController0 = new FeatureController(jexlFeatures0);
      Object object0 = aSTArrayAccess0.jjtAccept(featureController0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      StreamProvider streamProvider0 = new StreamProvider(stringReader0);
      Parser parser0 = new Parser(streamProvider0);
      ASTArrayAccess aSTArrayAccess0 = new ASTArrayAccess(parser0, (-1));
      // Undeclared exception!
      try { 
        aSTArrayAccess0.jjtAccept((ParserVisitor) null, stringReader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.parser.ASTArrayAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ASTArrayAccess aSTArrayAccess0 = new ASTArrayAccess((-1));
      StringProvider stringProvider0 = new StringProvider("VdcrZk%:5J88i");
      Parser parser0 = new Parser(stringProvider0);
      FeatureController featureController0 = parser0.featureController;
      Object object0 = aSTArrayAccess0.jjtAccept(featureController0, "VdcrZk%:5J88i");
      assertEquals("VdcrZk%:5J88i", object0);
  }
}
