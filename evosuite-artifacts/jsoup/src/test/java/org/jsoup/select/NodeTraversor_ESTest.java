/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 06 15:29:59 GMT 2022
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.select.Collector;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.StructuralEvaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeTraversor_ESTest extends NodeTraversor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeTraversor.traverse(nodeVisitor0, (Elements) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      Document document0 = Document.createShell("OlK05UZ`uCEN8?");
      Elements elements0 = document0.getElementsByAttribute("OlK05UZ`uCEN8?");
      document0.prependChild(document0);
      elements0.add((Element) document0);
      // Undeclared exception!
      NodeTraversor.traverse(nodeVisitor0, elements0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DataNode dataNode0 = new DataNode("JTh'");
      // Undeclared exception!
      try { 
        NodeTraversor.traverse((NodeVisitor) null, (Node) dataNode0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document document0 = Parser.parse("application/x-www-form-urlencoded", "Content-Type");
      document0.appendChild(document0);
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      NodeTraversor.traverse(nodeVisitor0, (Node) document0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = Document.createShell("vY{/fhjy{CDp'Q");
      Elements elements0 = document0.parents();
      // Undeclared exception!
      try { 
        NodeTraversor.filter((NodeFilter) null, elements0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Evaluator.IsNthLastOfType evaluator_IsNthLastOfType0 = new Evaluator.IsNthLastOfType((-2799), (-2799));
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_IsNthLastOfType0);
      Document document0 = Document.createShell("");
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      document0.appendTo(document0);
      Elements elements0 = document0.children();
      // Undeclared exception!
      NodeTraversor.filter((NodeFilter) collector_FirstFinder0, elements0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has((Evaluator) null);
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      Parser parser0 = Parser.htmlParser();
      Document document0 = parser0.parseInput("", "z0C}7M>T2=7xP$");
      Elements elements0 = document0.getElementsMatchingText("");
      // Undeclared exception!
      try { 
        NodeTraversor.filter((NodeFilter) collector_FirstFinder0, elements0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Document document0 = new Document("OlK05UZ`uCtN8?");
      Evaluator.Attribute evaluator_Attribute0 = new Evaluator.Attribute((String) null);
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder(evaluator_Attribute0);
      // Undeclared exception!
      try { 
        NodeTraversor.filter((NodeFilter) collector_FirstFinder0, (Node) document0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document document0 = Parser.parse("OlK05UZ`uCEN8?", "F#_Q>x'*l3C2O");
      document0.appendChild(document0);
      ArrayDeque<Evaluator> arrayDeque0 = new ArrayDeque<Evaluator>();
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(arrayDeque0);
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder(combiningEvaluator_Or0);
      // Undeclared exception!
      NodeTraversor.filter((NodeFilter) collector_FirstFinder0, (Node) document0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = Parser.parse(">@_TNJY<V:3", ">@_TNJY<V:3");
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(combiningEvaluator_Or0);
      combiningEvaluator_Or0.num = 1078;
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      // Undeclared exception!
      try { 
        NodeTraversor.filter((NodeFilter) collector_FirstFinder0, (Node) document0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Evaluator.IsLastOfType evaluator_IsLastOfType0 = new Evaluator.IsLastOfType();
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_IsLastOfType0);
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      Document document0 = Document.createShell("org.jsoup.select.NodeTraversor");
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeTraversor.filter((NodeFilter) collector_FirstFinder0, (Node) document0);
      assertEquals(NodeFilter.FilterResult.STOP, nodeFilter_FilterResult0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      Document document0 = Document.createShell("OlK05UZ`uCEN8?");
      Elements elements0 = document0.getElementsByAttribute("OlK05UZ`uCEN8?");
      elements0.add((Element) document0);
      NodeTraversor.traverse(nodeVisitor0, elements0);
      assertEquals(1, elements0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Evaluator.IsNthLastOfType evaluator_IsNthLastOfType0 = new Evaluator.IsNthLastOfType((-2799), (-2799));
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_IsNthLastOfType0);
      Document document0 = Parser.parse("|", "|");
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      Elements elements0 = document0.children();
      NodeTraversor.filter((NodeFilter) collector_FirstFinder0, elements0);
      assertFalse(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Evaluator.IsNthLastOfType evaluator_IsNthLastOfType0 = new Evaluator.IsNthLastOfType((-2799), (-2799));
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_IsNthLastOfType0);
      Document document0 = Parser.parse("|", "|");
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      NodeTraversor.filter((NodeFilter) collector_FirstFinder0, (Node) document0);
      assertEquals(1, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Evaluator.IsFirstChild evaluator_IsFirstChild0 = new Evaluator.IsFirstChild();
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_IsFirstChild0);
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      Document document0 = Parser.parse("N**]=-", "N**]=-");
      Elements elements0 = document0.getElementsByIndexGreaterThan((-2230));
      NodeTraversor.filter((NodeFilter) collector_FirstFinder0, elements0);
      assertEquals(4, elements0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      Document document0 = parser0.parseInput("'", "'");
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder((Evaluator) null);
      // Undeclared exception!
      try { 
        NodeTraversor.filter((NodeFilter) collector_FirstFinder0, (Node) document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Evaluator.IsNthLastOfType evaluator_IsNthLastOfType0 = new Evaluator.IsNthLastOfType((-2799), (-2799));
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_IsNthLastOfType0);
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeTraversor.filter((NodeFilter) collector_FirstFinder0, (Node) null);
      assertEquals(NodeFilter.FilterResult.CONTINUE, nodeFilter_FilterResult0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Document document0 = Parser.parse("|", "|");
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      NodeTraversor.traverse(nodeVisitor0, (Node) document0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NodeTraversor nodeTraversor0 = new NodeTraversor();
  }
}
