/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 11 18:21:50 GMT 2022
 */

package org.apache.commons.jexl3.parser;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ASTSetXorNode_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.jexl3.parser.ASTSetXorNode"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/commons-jexl3-3.2.1-src"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ASTSetXorNode_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.jexl3.introspection.JexlUberspect$ResolverStrategy",
      "org.apache.commons.jexl3.parser.ASTNSWNode",
      "org.apache.commons.jexl3.parser.ASTJexlLambda",
      "org.apache.commons.jexl3.JxltEngine",
      "org.apache.commons.jexl3.JexlException$Continue",
      "org.apache.commons.jexl3.JexlArithmetic",
      "org.apache.commons.jexl3.parser.AbstractCharStream",
      "org.apache.commons.jexl3.parser.ASTJexlScript",
      "org.apache.commons.jexl3.parser.ASTReturnStatement",
      "org.apache.commons.jexl3.introspection.JexlMethod",
      "org.apache.commons.jexl3.internal.Scope$2",
      "org.apache.commons.jexl3.internal.Scope$1",
      "org.apache.commons.jexl3.parser.ASTDoWhileStatement",
      "org.apache.commons.jexl3.parser.ASTBitwiseXorNode",
      "org.apache.commons.jexl3.parser.ASTWhileStatement",
      "org.apache.commons.jexl3.JexlException$Ambiguous",
      "org.apache.commons.jexl3.parser.ASTSetSubNode",
      "org.apache.commons.jexl3.parser.ASTAndNode",
      "org.apache.commons.jexl3.parser.ASTBreak",
      "org.apache.commons.jexl3.parser.ASTJxltLiteral",
      "org.apache.commons.jexl3.parser.ASTAnnotatedStatement",
      "org.apache.commons.jexl3.JexlContext$NamespaceResolver",
      "org.apache.commons.jexl3.JexlEngine",
      "org.apache.commons.jexl3.parser.ASTGTNode",
      "org.apache.commons.jexl3.parser.Parser$LookaheadSuccess",
      "org.apache.commons.jexl3.JexlException$Operator",
      "org.apache.commons.jexl3.introspection.JexlPropertyGet",
      "org.apache.commons.jexl3.parser.JexlNode$Constant",
      "org.apache.commons.jexl3.introspection.JexlPropertySet",
      "org.apache.commons.jexl3.parser.Node",
      "org.apache.commons.jexl3.parser.ASTSetMultNode",
      "org.apache.commons.jexl3.JexlContext",
      "org.apache.commons.jexl3.parser.ASTIdentifierAccessJxlt",
      "org.apache.commons.jexl3.JexlArithmetic$Uberspect",
      "org.apache.commons.jexl3.parser.ASTUnaryMinusNode",
      "org.apache.commons.jexl3.parser.StringProvider",
      "org.apache.commons.jexl3.parser.ASTMapEntry",
      "org.apache.commons.jexl3.parser.JexlLexicalNode",
      "org.apache.commons.jexl3.parser.ASTSetAddNode",
      "org.apache.commons.jexl3.parser.ASTModNode",
      "org.apache.commons.jexl3.parser.ASTEQNode",
      "org.apache.commons.jexl3.JexlEngine$EmptyContext",
      "org.apache.commons.jexl3.parser.ASTNumberLiteral",
      "org.apache.commons.jexl3.JexlEngine$Options",
      "org.apache.commons.jexl3.parser.SimpleNode",
      "org.apache.commons.jexl3.parser.ASTSizeFunction",
      "org.apache.commons.jexl3.JexlException$VariableIssue",
      "org.apache.commons.jexl3.parser.SimpleCharStream",
      "org.apache.commons.jexl3.JexlException$StackOverflow",
      "org.apache.commons.jexl3.parser.ASTStringLiteral",
      "org.apache.commons.jexl3.parser.Provider",
      "org.apache.commons.jexl3.JexlOptions",
      "org.apache.commons.jexl3.parser.ASTAddNode",
      "org.apache.commons.jexl3.JexlException$Method",
      "org.apache.commons.jexl3.parser.ASTForeachStatement",
      "org.apache.commons.jexl3.parser.ParserVisitor",
      "org.apache.commons.jexl3.parser.ASTUnaryPlusNode",
      "org.apache.commons.jexl3.JexlException$Cancel",
      "org.apache.commons.jexl3.internal.Frame",
      "org.apache.commons.jexl3.parser.ASTFalseNode",
      "org.apache.commons.jexl3.parser.ASTArrayAccess",
      "org.apache.commons.jexl3.parser.ASTAssignment",
      "org.apache.commons.jexl3.JexlException$Annotation",
      "org.apache.commons.jexl3.JexlException$Parsing",
      "org.apache.commons.jexl3.parser.ASTExtendedLiteral",
      "org.apache.commons.jexl3.parser.TokenMgrException",
      "org.apache.commons.jexl3.parser.StringParser",
      "org.apache.commons.jexl3.JexlException",
      "org.apache.commons.jexl3.parser.ASTRegexLiteral",
      "org.apache.commons.jexl3.parser.ASTConstructorNode",
      "org.apache.commons.jexl3.parser.StreamProvider",
      "org.apache.commons.jexl3.parser.ASTContinue",
      "org.apache.commons.jexl3.parser.ASTNENode",
      "org.apache.commons.jexl3.parser.ASTSubNode",
      "org.apache.commons.jexl3.parser.ASTSetLiteral",
      "org.apache.commons.jexl3.parser.ASTSetOrNode",
      "org.apache.commons.jexl3.introspection.JexlUberspect$PropertyResolver",
      "org.apache.commons.jexl3.parser.ASTDivNode",
      "org.apache.commons.jexl3.JexlEngine$FailObject",
      "org.apache.commons.jexl3.parser.ASTBlock",
      "org.apache.commons.jexl3.JexlException$Feature",
      "org.apache.commons.jexl3.parser.JavaccError",
      "org.apache.commons.jexl3.parser.JJTParserState",
      "org.apache.commons.jexl3.internal.ScriptVisitor",
      "org.apache.commons.jexl3.parser.ASTNullpNode",
      "org.apache.commons.jexl3.JexlException$Property",
      "org.apache.commons.jexl3.JexlException$Variable",
      "org.apache.commons.jexl3.parser.ASTSetXorNode",
      "org.apache.commons.jexl3.introspection.JexlUberspect",
      "org.apache.commons.jexl3.parser.ParserConstants",
      "org.apache.commons.jexl3.JexlException$Return",
      "org.apache.commons.jexl3.parser.ParserTokenManager",
      "org.apache.commons.jexl3.parser.ASTReference",
      "org.apache.commons.jexl3.parser.ASTArrayLiteral",
      "org.apache.commons.jexl3.JexlArithmetic$MapBuilder",
      "org.apache.commons.jexl3.JxltEngine$Expression",
      "org.apache.commons.jexl3.parser.NumberParser",
      "org.apache.commons.jexl3.JexlException$1",
      "org.apache.commons.jexl3.parser.ASTEWNode",
      "org.apache.commons.jexl3.JexlArithmetic$ArrayBuilder",
      "org.apache.commons.jexl3.JexlFeatures",
      "org.apache.commons.jexl3.parser.ASTIdentifier",
      "org.apache.commons.jexl3.parser.ASTBitwiseAndNode",
      "org.apache.commons.jexl3.JexlInfo$Detail",
      "org.apache.commons.jexl3.parser.ASTTrueNode",
      "org.apache.commons.jexl3.parser.ASTNotNode",
      "org.apache.commons.jexl3.parser.JexlNode",
      "org.apache.commons.jexl3.parser.ASTEmptyFunction",
      "org.apache.commons.jexl3.parser.FeatureController",
      "org.apache.commons.jexl3.JexlException$TryFailed",
      "org.apache.commons.jexl3.JexlContext$ThreadLocal",
      "org.apache.commons.jexl3.parser.OperatorController",
      "org.apache.commons.jexl3.parser.ParseException",
      "org.apache.commons.jexl3.parser.ASTNRNode",
      "org.apache.commons.jexl3.parser.ASTLTNode",
      "org.apache.commons.jexl3.parser.Token",
      "org.apache.commons.jexl3.JexlExpression",
      "org.apache.commons.jexl3.parser.Parser",
      "org.apache.commons.jexl3.JexlInfo",
      "org.apache.commons.jexl3.parser.ASTNamespaceIdentifier",
      "org.apache.commons.jexl3.parser.ASTERNode",
      "org.apache.commons.jexl3.parser.ASTOrNode",
      "org.apache.commons.jexl3.parser.ASTArguments",
      "org.apache.commons.jexl3.parser.ASTGENode",
      "org.apache.commons.jexl3.JexlException$Break",
      "org.apache.commons.jexl3.parser.ASTSetModNode",
      "org.apache.commons.jexl3.parser.ASTSWNode",
      "org.apache.commons.jexl3.internal.LexicalScope",
      "org.apache.commons.jexl3.parser.ParserTreeConstants",
      "org.apache.commons.jexl3.parser.ASTLENode",
      "org.apache.commons.jexl3.parser.JexlNode$Info",
      "org.apache.commons.jexl3.parser.ASTSetDivNode",
      "org.apache.commons.jexl3.parser.ASTMulNode",
      "org.apache.commons.jexl3.parser.JexlParser",
      "org.apache.commons.jexl3.JexlOperator",
      "org.apache.commons.jexl3.parser.ASTBitwiseOrNode",
      "org.apache.commons.jexl3.parser.ASTTernaryNode",
      "org.apache.commons.jexl3.JexlArithmetic$NullOperand",
      "org.apache.commons.jexl3.parser.ASTMethodNode",
      "org.apache.commons.jexl3.parser.ASTFunctionNode",
      "org.apache.commons.jexl3.parser.ASTNEWNode",
      "org.apache.commons.jexl3.introspection.JexlUberspect$JexlResolver",
      "org.apache.commons.jexl3.JexlArithmetic$SetBuilder",
      "org.apache.commons.jexl3.JxltEngine$Template",
      "org.apache.commons.jexl3.parser.ASTSetAndNode",
      "org.apache.commons.jexl3.parser.ASTAnnotation",
      "org.apache.commons.jexl3.JexlException$Assignment",
      "org.apache.commons.jexl3.parser.ASTReferenceExpression",
      "org.apache.commons.jexl3.parser.ASTVar",
      "org.apache.commons.jexl3.parser.ASTMapLiteral",
      "org.apache.commons.jexl3.internal.Scope",
      "org.apache.commons.jexl3.parser.JexlParser$LexicalUnit",
      "org.apache.commons.jexl3.parser.ASTIdentifierAccessSafe",
      "org.apache.commons.jexl3.JexlScript",
      "org.apache.commons.jexl3.parser.ASTNullLiteral",
      "org.apache.commons.jexl3.JexlEngine$EmptyNamespaceResolver",
      "org.apache.commons.jexl3.parser.ASTBitwiseComplNode",
      "org.apache.commons.jexl3.parser.ASTIfStatement",
      "org.apache.commons.jexl3.parser.ASTIdentifierAccess",
      "org.apache.commons.jexl3.parser.ASTRangeNode",
      "org.apache.commons.jexl3.parser.ASTIdentifierAccessSafeJxlt",
      "org.apache.commons.jexl3.parser.CharStream",
      "org.apache.commons.jexl3.parser.ASTAmbiguous"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ASTSetXorNode_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.jexl3.parser.SimpleNode",
      "org.apache.commons.jexl3.parser.JexlNode",
      "org.apache.commons.jexl3.parser.ASTSetXorNode",
      "org.apache.commons.jexl3.parser.StreamProvider",
      "org.apache.commons.jexl3.parser.StringParser",
      "org.apache.commons.jexl3.parser.JexlParser",
      "org.apache.commons.jexl3.parser.Parser",
      "org.apache.commons.jexl3.parser.StringProvider",
      "org.apache.commons.jexl3.parser.ParserVisitor",
      "org.apache.commons.jexl3.internal.ScriptVisitor",
      "org.apache.commons.jexl3.parser.FeatureController",
      "org.apache.commons.jexl3.JexlEngine$FailObject",
      "org.apache.commons.jexl3.JexlFeatures",
      "org.apache.commons.jexl3.JexlEngine$EmptyContext",
      "org.apache.commons.jexl3.JexlEngine$EmptyNamespaceResolver",
      "org.apache.commons.jexl3.JexlEngine",
      "org.apache.commons.jexl3.parser.JJTParserState",
      "org.apache.commons.jexl3.parser.Parser$LookaheadSuccess",
      "org.apache.commons.jexl3.parser.AbstractCharStream",
      "org.apache.commons.jexl3.parser.SimpleCharStream",
      "org.apache.commons.jexl3.parser.ParserTokenManager",
      "org.apache.commons.jexl3.parser.Token",
      "org.apache.commons.jexl3.parser.ParseException",
      "org.apache.commons.jexl3.parser.TokenMgrException",
      "org.apache.commons.jexl3.parser.JexlLexicalNode",
      "org.apache.commons.jexl3.parser.ASTJexlScript",
      "org.apache.commons.jexl3.parser.ASTJexlLambda",
      "org.apache.commons.jexl3.parser.OperatorController",
      "org.apache.commons.jexl3.parser.ParserTreeConstants",
      "org.apache.commons.jexl3.parser.ASTMethodNode",
      "org.apache.commons.jexl3.parser.ASTNumberLiteral",
      "org.apache.commons.jexl3.parser.NumberParser",
      "org.apache.commons.jexl3.parser.ParserConstants",
      "org.apache.commons.jexl3.parser.ASTGENode",
      "org.apache.commons.jexl3.parser.ASTIdentifierAccess",
      "org.apache.commons.jexl3.parser.ASTAnnotation",
      "org.apache.commons.jexl3.parser.ASTSetMultNode",
      "org.apache.commons.jexl3.parser.ASTAmbiguous",
      "org.apache.commons.jexl3.parser.ASTJxltLiteral",
      "org.apache.commons.jexl3.JexlInfo",
      "org.apache.commons.jexl3.parser.ASTWhileStatement",
      "org.apache.commons.jexl3.parser.ASTArrayLiteral",
      "org.apache.commons.jexl3.parser.ASTReference",
      "org.apache.commons.jexl3.parser.ASTBitwiseAndNode",
      "org.apache.commons.jexl3.parser.ASTBlock",
      "org.apache.commons.jexl3.internal.Scope$1",
      "org.apache.commons.jexl3.internal.Scope$2",
      "org.apache.commons.jexl3.internal.Scope",
      "org.apache.commons.jexl3.parser.ASTArrayAccess",
      "org.apache.commons.jexl3.parser.ASTSetOrNode",
      "org.apache.commons.jexl3.parser.ASTIdentifier",
      "org.apache.commons.jexl3.parser.ASTBitwiseComplNode",
      "org.apache.commons.jexl3.parser.ASTMapLiteral",
      "org.apache.commons.jexl3.parser.ASTLENode",
      "org.apache.commons.jexl3.parser.ASTVar",
      "org.apache.commons.jexl3.parser.ASTNamespaceIdentifier",
      "org.apache.commons.jexl3.parser.ASTIdentifierAccessJxlt",
      "org.apache.commons.jexl3.parser.ASTDoWhileStatement",
      "org.apache.commons.jexl3.parser.ASTSetAddNode",
      "org.apache.commons.jexl3.parser.ASTMapEntry",
      "org.apache.commons.jexl3.JexlException",
      "org.apache.commons.jexl3.JexlException$Parsing",
      "org.apache.commons.jexl3.JexlException$Feature",
      "org.apache.commons.jexl3.parser.ASTIdentifierAccessSafeJxlt",
      "org.apache.commons.jexl3.parser.ASTNEWNode",
      "org.apache.commons.jexl3.parser.ASTExtendedLiteral"
    );
  }
}
