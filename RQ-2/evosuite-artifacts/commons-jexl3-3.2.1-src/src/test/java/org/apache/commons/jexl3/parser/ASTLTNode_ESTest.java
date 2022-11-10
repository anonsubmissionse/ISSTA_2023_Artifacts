/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 18:22:17 GMT 2022
 */

package org.apache.commons.jexl3.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.util.Enumeration;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlFeatures;
import org.apache.commons.jexl3.parser.ASTLTNode;
import org.apache.commons.jexl3.parser.FeatureController;
import org.apache.commons.jexl3.parser.Parser;
import org.apache.commons.jexl3.parser.ParserVisitor;
import org.apache.commons.jexl3.parser.StreamProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ASTLTNode_ESTest extends ASTLTNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Parser parser0 = new Parser("Q~|)B\"gAPS-+;wQ2KA");
      ASTLTNode aSTLTNode0 = new ASTLTNode(parser0, (-907));
      FeatureController featureController0 = new FeatureController((JexlFeatures) null);
      Object object0 = aSTLTNode0.jjtAccept(featureController0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Charset charset0 = Charset.defaultCharset();
      StreamProvider streamProvider0 = new StreamProvider(sequenceInputStream0, charset0);
      Parser parser0 = new Parser(streamProvider0);
      ASTLTNode aSTLTNode0 = new ASTLTNode(parser0, 0);
      // Undeclared exception!
      try { 
        aSTLTNode0.jjtAccept((ParserVisitor) null, charset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.parser.ASTLTNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ASTLTNode aSTLTNode0 = new ASTLTNode(4349);
      JexlFeatures jexlFeatures0 = JexlEngine.DEFAULT_FEATURES;
      FeatureController featureController0 = new FeatureController(jexlFeatures0);
      JexlFeatures jexlFeatures1 = (JexlFeatures)aSTLTNode0.jjtAccept(featureController0, jexlFeatures0);
      assertFalse(jexlFeatures1.supportsExpression());
  }
}
