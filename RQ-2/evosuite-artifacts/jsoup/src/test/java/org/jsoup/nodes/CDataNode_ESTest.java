/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 15:40:46 GMT 2022
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CDataNode_ESTest extends CDataNode_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("OV>)fy8* X>q{S!,8");
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "OV>)fy8* X>q{S!,8");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      cDataNode0.outerHtmlTail(stringBuilder0, 1602, document_OutputSettings0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("");
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      cDataNode0.outerHtmlHead(stringBuffer0, (-760), document_OutputSettings0);
      assertEquals(0, stringBuffer0.length());
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("");
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      cDataNode0.outerHtmlHead(stringBuffer0, (-760), document_OutputSettings0);
      assertNotNull(stringWriter0.toString());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode((String) null);
      cDataNode0.text();
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("<![CDATA[");
      cDataNode0.text();
      assertNotNull(cDataNode0.nodeName());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("zv@e@y71");
      Document document0 = Document.createShell("zv@e@y71");
      cDataNode0.parentNode = (Node) document0;
      CDataNode cDataNode1 = cDataNode0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("ewv_w(=3z,PnKUh4z}c");
      Object object0 = new Object();
      cDataNode0.value = object0;
      // Undeclared exception!
      try { 
        cDataNode0.text();
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("org.jsoup.nodes.LeafNode", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      CDataNode cDataNode0 = new CDataNode((String) null);
      // Undeclared exception!
      try { 
        cDataNode0.outerHtmlTail(pipedWriter0, (-776), document_OutputSettings0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.jsoup.nodes.CDataNode", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("G&ENpnsJX>9R");
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        cDataNode0.outerHtmlTail(charBuffer0, 0, document_OutputSettings0);
        fail("Expecting exception: BufferOverflowException");
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("uH7y)mCqO");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        cDataNode0.outerHtmlTail((Appendable) null, (-4316), document_OutputSettings0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.CDataNode", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("gRz.}6m'>f");
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        cDataNode0.outerHtmlHead(charBuffer0, 800, document_OutputSettings0);
        fail("Expecting exception: BufferOverflowException");
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("output");
      // Undeclared exception!
      try { 
        cDataNode0.outerHtmlHead((Appendable) null, 0, (Document.OutputSettings) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.CDataNode", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("fillable {}");
      PipedWriter pipedWriter0 = new PipedWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      try { 
        cDataNode0.outerHtmlHead(pipedWriter0, (-2492), document_OutputSettings0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("7>?#[/");
      cDataNode0.setParentNode(cDataNode0);
      // Undeclared exception!
      cDataNode0.clone();
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("ewv_w(=3z,PnKUh4z}c");
      String string0 = cDataNode0.nodeName();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("");
      CDataNode cDataNode1 = cDataNode0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("");
      cDataNode0.text();
      assertNotNull(cDataNode0.nodeName());
}
}
