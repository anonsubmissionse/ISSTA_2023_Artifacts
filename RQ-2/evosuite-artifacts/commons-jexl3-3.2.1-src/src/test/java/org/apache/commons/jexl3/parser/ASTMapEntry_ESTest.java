/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 18:19:45 GMT 2022
 */

package org.apache.commons.jexl3.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.jexl3.JexlFeatures;
import org.apache.commons.jexl3.parser.ASTMapEntry;
import org.apache.commons.jexl3.parser.FeatureController;
import org.apache.commons.jexl3.parser.OperatorController;
import org.apache.commons.jexl3.parser.Parser;
import org.apache.commons.jexl3.parser.ParserVisitor;
import org.apache.commons.jexl3.parser.StringProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ASTMapEntry_ESTest extends ASTMapEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringProvider stringProvider0 = new StringProvider("");
      Parser parser0 = new Parser(stringProvider0);
      ASTMapEntry aSTMapEntry0 = new ASTMapEntry(parser0, 0);
      OperatorController operatorController0 = OperatorController.INSTANCE;
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Object object0 = aSTMapEntry0.jjtAccept(operatorController0, sequenceInputStream0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ASTMapEntry aSTMapEntry0 = new ASTMapEntry((-1));
      // Undeclared exception!
      try { 
        aSTMapEntry0.jjtAccept((ParserVisitor) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jexl3.parser.ASTMapEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ASTMapEntry aSTMapEntry0 = new ASTMapEntry((Parser) null, 1);
      FeatureController featureController0 = new FeatureController((JexlFeatures) null);
      Object object0 = aSTMapEntry0.jjtAccept(featureController0, (Object) null);
      assertNull(object0);
  }
}
