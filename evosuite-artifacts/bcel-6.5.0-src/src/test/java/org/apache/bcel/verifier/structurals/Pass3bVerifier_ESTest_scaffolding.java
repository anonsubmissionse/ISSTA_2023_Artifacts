/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Oct 09 21:36:13 GMT 2022
 */

package org.apache.bcel.verifier.structurals;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Pass3bVerifier_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.bcel.verifier.structurals.Pass3bVerifier"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("user.dir", "/media/ISSTA_USER/extradrive1/toga-eval-issta-2023/toga-eval/artifacts/bcel-6.5.0-src"); 
    java.lang.System.setProperty("user.home", "/home/ISSTA_USER"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ISSTA_USER"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
    java.lang.System.setProperty("sun.boot.class.path", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jfr.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/classes"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Pass3bVerifier_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.bcel.generic.ISTORE",
      "org.apache.bcel.util.ClassLoaderRepository",
      "org.apache.bcel.generic.LXOR",
      "org.apache.bcel.generic.InstructionList",
      "org.apache.bcel.generic.FDIV",
      "org.apache.bcel.classfile.Module",
      "org.apache.bcel.classfile.ConstantLong",
      "org.apache.bcel.Const",
      "org.apache.bcel.generic.ReturnaddressType",
      "org.apache.bcel.generic.INVOKESTATIC",
      "org.apache.bcel.generic.FREM",
      "org.apache.bcel.verifier.exc.VerificationException",
      "org.apache.bcel.generic.LLOAD",
      "org.apache.bcel.generic.ConstantPoolGen",
      "org.apache.bcel.classfile.Node",
      "org.apache.bcel.generic.SALOAD",
      "org.apache.bcel.generic.IF_ICMPEQ",
      "org.apache.bcel.classfile.ClassFormatException",
      "org.apache.bcel.generic.MethodGen",
      "org.apache.bcel.generic.IFEQ",
      "org.apache.bcel.classfile.ModuleProvides",
      "org.apache.bcel.generic.IF_ICMPGE",
      "org.apache.bcel.generic.CHECKCAST",
      "org.apache.bcel.generic.SIPUSH",
      "org.apache.bcel.classfile.SourceFile",
      "org.apache.bcel.classfile.MethodParameters",
      "org.apache.bcel.classfile.ParameterAnnotations",
      "org.apache.bcel.util.ByteSequence",
      "org.apache.bcel.generic.BasicType",
      "org.apache.bcel.generic.ConversionInstruction",
      "org.apache.bcel.generic.FADD",
      "org.apache.bcel.generic.UnconditionalBranch",
      "org.apache.bcel.generic.LocalVariableInstruction",
      "org.apache.bcel.generic.GETFIELD",
      "org.apache.bcel.classfile.NestMembers",
      "org.apache.bcel.generic.INVOKEDYNAMIC",
      "org.apache.bcel.generic.GOTO_W",
      "org.apache.bcel.generic.InstructionHandle",
      "org.apache.bcel.verifier.exc.VerifierConstraintViolatedException",
      "org.apache.bcel.generic.ConstantPoolGen$Index",
      "org.apache.bcel.util.ClassPath$Module",
      "org.apache.bcel.generic.FieldGenOrMethodGen",
      "org.apache.bcel.generic.INEG",
      "org.apache.bcel.generic.ALOAD",
      "org.apache.bcel.classfile.Unknown",
      "org.apache.bcel.classfile.RuntimeVisibleParameterAnnotations",
      "org.apache.bcel.classfile.EnumElementValue",
      "org.apache.bcel.classfile.ConstantInteger",
      "org.apache.bcel.generic.DUP2",
      "org.apache.bcel.verifier.structurals.ExecutionVisitor",
      "org.apache.bcel.generic.LOR",
      "org.apache.bcel.classfile.ConstantDouble",
      "org.apache.bcel.verifier.structurals.InstructionContext",
      "org.apache.bcel.util.ClassPath$JrtModules",
      "org.apache.bcel.classfile.InnerClasses",
      "org.apache.bcel.generic.FSUB",
      "org.apache.bcel.verifier.structurals.OperandStack",
      "org.apache.bcel.generic.SASTORE",
      "org.apache.bcel.verifier.structurals.ControlFlowGraph",
      "org.apache.bcel.util.ClassPath$JrtModule",
      "org.apache.bcel.generic.MONITORENTER",
      "org.apache.bcel.generic.IF_ICMPGT",
      "org.apache.bcel.generic.FALOAD",
      "org.apache.bcel.generic.LASTORE",
      "org.apache.bcel.generic.LALOAD",
      "org.apache.bcel.generic.ClassGenException",
      "org.apache.bcel.verifier.VerificationResult",
      "org.apache.bcel.classfile.ModuleRequires",
      "org.apache.bcel.verifier.exc.StructuralCodeConstraintException",
      "org.apache.bcel.generic.POP2",
      "org.apache.bcel.classfile.ConstantClass",
      "org.apache.bcel.generic.BranchInstruction",
      "org.apache.bcel.classfile.Utility$1",
      "org.apache.bcel.util.ModularRuntimeImage",
      "org.apache.bcel.util.LruCacheClassPathRepository$1",
      "org.apache.bcel.classfile.ConstantString",
      "org.apache.bcel.verifier.structurals.UninitializedObjectType",
      "org.apache.bcel.generic.LSUB",
      "org.apache.bcel.generic.MethodGen$BranchTarget",
      "org.apache.bcel.generic.F2D",
      "org.apache.bcel.generic.EmptyVisitor",
      "org.apache.bcel.generic.F2I",
      "org.apache.bcel.generic.PopInstruction",
      "org.apache.bcel.generic.EnumElementValueGen",
      "org.apache.bcel.generic.CPInstruction",
      "org.apache.bcel.generic.IF_ACMPNE",
      "org.apache.bcel.generic.F2L",
      "org.apache.bcel.generic.ReturnInstruction",
      "org.apache.bcel.util.ClassPath$ClassFile",
      "org.apache.bcel.classfile.ConstantUtf8$Cache$1",
      "org.apache.bcel.generic.I2S",
      "org.apache.bcel.generic.IMPDEP1",
      "org.apache.bcel.generic.MethodGen$BranchStack",
      "org.apache.bcel.classfile.PMGClass",
      "org.apache.bcel.generic.RETURN",
      "org.apache.bcel.generic.ReferenceType",
      "org.apache.bcel.generic.LAND",
      "org.apache.bcel.generic.MULTIANEWARRAY",
      "org.apache.bcel.classfile.AccessFlags",
      "org.apache.bcel.classfile.StackMapType",
      "org.apache.bcel.classfile.AnnotationElementValue",
      "org.apache.bcel.generic.IRETURN",
      "org.apache.bcel.classfile.NestHost",
      "org.apache.bcel.generic.IMPDEP2",
      "org.apache.bcel.classfile.ConstantInterfaceMethodref",
      "org.apache.bcel.generic.FASTORE",
      "org.apache.bcel.classfile.BootstrapMethod",
      "org.apache.bcel.classfile.ModuleOpens",
      "org.apache.bcel.classfile.LineNumberTable",
      "org.apache.bcel.generic.RET",
      "org.apache.bcel.classfile.ConstantUtf8$1",
      "org.apache.bcel.generic.ICONST",
      "org.apache.bcel.generic.LOOKUPSWITCH",
      "org.apache.bcel.classfile.ConstantPackage",
      "org.apache.bcel.util.AbstractClassPathRepository",
      "org.apache.bcel.generic.FieldInstruction",
      "org.apache.bcel.generic.ILOAD",
      "org.apache.bcel.generic.FieldOrMethod",
      "org.apache.bcel.verifier.structurals.GenericArray",
      "org.apache.bcel.util.ClassPath$AbstractPathEntry",
      "org.apache.bcel.classfile.RuntimeInvisibleAnnotations",
      "org.apache.bcel.classfile.SimpleElementValue",
      "org.apache.bcel.classfile.Signature",
      "org.apache.bcel.generic.I2C",
      "org.apache.bcel.generic.I2B",
      "org.apache.bcel.verifier.structurals.ExceptionHandler",
      "org.apache.bcel.generic.CodeExceptionGen",
      "org.apache.bcel.generic.IndexedInstruction",
      "org.apache.bcel.generic.I2F",
      "org.apache.bcel.generic.BIPUSH",
      "org.apache.bcel.generic.LineNumberGen",
      "org.apache.bcel.generic.I2D",
      "org.apache.bcel.classfile.ConstantPool",
      "org.apache.bcel.generic.TABLESWITCH",
      "org.apache.bcel.generic.SimpleElementValueGen",
      "org.apache.bcel.generic.PushInstruction",
      "org.apache.bcel.generic.DALOAD",
      "org.apache.bcel.generic.I2L",
      "org.apache.bcel.generic.LocalVariableGen",
      "org.apache.bcel.generic.FCMPG",
      "org.apache.bcel.generic.IF_ICMPLE",
      "org.apache.bcel.generic.InstructionConstants",
      "org.apache.bcel.generic.DDIV",
      "org.apache.bcel.classfile.FieldOrMethod",
      "org.apache.bcel.generic.FCMPL",
      "org.apache.bcel.generic.ISHL",
      "org.apache.bcel.util.ByteSequence$ByteArrayStream",
      "org.apache.bcel.generic.ISHR",
      "org.apache.bcel.generic.NOP",
      "org.apache.bcel.classfile.ClassParser",
      "org.apache.bcel.generic.DREM",
      "org.apache.bcel.generic.ConstantPushInstruction",
      "org.apache.bcel.generic.IFNULL",
      "org.apache.bcel.generic.ASTORE",
      "org.apache.bcel.generic.StackInstruction",
      "org.apache.bcel.classfile.ConstantObject",
      "org.apache.bcel.generic.ATHROW",
      "org.apache.bcel.generic.ArrayInstruction",
      "org.apache.bcel.generic.LoadClass",
      "org.apache.bcel.generic.FMUL",
      "org.apache.bcel.classfile.Method$1",
      "org.apache.bcel.classfile.CodeException",
      "org.apache.bcel.generic.IASTORE",
      "org.apache.bcel.util.ClassPath$AbstractZip",
      "org.apache.bcel.classfile.JavaClass",
      "org.apache.bcel.generic.LNEG",
      "org.apache.bcel.classfile.Deprecated",
      "org.apache.bcel.classfile.ElementValuePair",
      "org.apache.bcel.classfile.Code",
      "org.apache.bcel.classfile.RuntimeInvisibleParameterAnnotations",
      "org.apache.bcel.generic.FRETURN",
      "org.apache.bcel.generic.LDC_W",
      "org.apache.bcel.generic.InstructionList$1",
      "org.apache.bcel.verifier.structurals.Frame",
      "org.apache.bcel.generic.LMUL",
      "org.apache.bcel.generic.DLOAD",
      "org.apache.bcel.classfile.UnknownAttributeReader",
      "org.apache.bcel.generic.IF_ICMPLT",
      "org.apache.bcel.generic.DADD",
      "org.apache.bcel.classfile.ModuleExports",
      "org.apache.bcel.classfile.InnerClass",
      "org.apache.bcel.verifier.structurals.Pass3bVerifier",
      "org.apache.bcel.generic.CompoundInstruction",
      "org.apache.bcel.classfile.ExceptionTable",
      "org.apache.bcel.generic.FNEG",
      "org.apache.bcel.verifier.structurals.InstConstraintVisitor",
      "org.apache.bcel.generic.IOR",
      "org.apache.bcel.classfile.Method",
      "org.apache.bcel.generic.StackProducer",
      "org.apache.bcel.classfile.Signature$MyByteArrayInputStream",
      "org.apache.bcel.classfile.ConstantMethodType",
      "org.apache.bcel.classfile.ConstantModule",
      "org.apache.bcel.generic.DSUB",
      "org.apache.bcel.generic.LoadInstruction",
      "org.apache.bcel.generic.Select",
      "org.apache.bcel.verifier.structurals.ExceptionHandlers",
      "org.apache.bcel.generic.StoreInstruction",
      "org.apache.bcel.generic.LCMP",
      "org.apache.bcel.generic.Instruction",
      "org.apache.bcel.generic.GOTO",
      "org.apache.bcel.generic.Type",
      "org.apache.bcel.generic.IALOAD",
      "org.apache.bcel.generic.IF_ICMPNE",
      "org.apache.bcel.util.BCELComparator",
      "org.apache.bcel.classfile.AnnotationEntry",
      "org.apache.bcel.generic.IFLT",
      "org.apache.bcel.generic.ARRAYLENGTH",
      "org.apache.bcel.generic.ClassElementValueGen",
      "org.apache.bcel.generic.InstructionListObserver",
      "org.apache.bcel.generic.TargetLostException",
      "org.apache.bcel.generic.INVOKESPECIAL",
      "org.apache.bcel.classfile.JavaClass$1",
      "org.apache.bcel.generic.LDC",
      "org.apache.bcel.generic.IFNE",
      "org.apache.bcel.generic.VariableLengthInstruction",
      "org.apache.bcel.classfile.Visitor",
      "org.apache.bcel.generic.ArithmeticInstruction",
      "org.apache.bcel.generic.IREM",
      "org.apache.bcel.generic.InstructionTargeter",
      "org.apache.bcel.generic.PUTSTATIC",
      "org.apache.bcel.classfile.ElementValue",
      "org.apache.bcel.generic.SWAP",
      "org.apache.bcel.generic.IADD",
      "org.apache.bcel.verifier.exc.AssertionViolatedException",
      "org.apache.bcel.verifier.structurals.LocalVariables",
      "org.apache.bcel.verifier.Verifier",
      "org.apache.bcel.Repository",
      "org.apache.bcel.generic.DUP2_X2",
      "org.apache.bcel.generic.DUP2_X1",
      "org.apache.bcel.classfile.MethodParameter",
      "org.apache.bcel.generic.DUP",
      "org.apache.bcel.generic.JsrInstruction",
      "org.apache.bcel.generic.IDIV",
      "org.apache.bcel.generic.LSTORE",
      "org.apache.bcel.generic.JSR",
      "org.apache.bcel.classfile.Utility",
      "org.apache.bcel.classfile.Synthetic",
      "org.apache.bcel.generic.BREAKPOINT",
      "org.apache.bcel.generic.POP",
      "org.apache.bcel.generic.GotoInstruction",
      "org.apache.bcel.generic.ISUB",
      "org.apache.bcel.classfile.StackMapEntry",
      "org.apache.bcel.generic.MONITOREXIT",
      "org.apache.bcel.classfile.StackMap",
      "org.apache.bcel.generic.DRETURN",
      "org.apache.bcel.generic.LUSHR",
      "org.apache.bcel.generic.BranchHandle",
      "org.apache.bcel.generic.IFNONNULL",
      "org.apache.bcel.generic.NamedAndTyped",
      "org.apache.bcel.generic.InstructionComparator",
      "org.apache.bcel.classfile.ConstantDynamic",
      "org.apache.bcel.classfile.Constant$1",
      "org.apache.bcel.generic.PUSH",
      "org.apache.bcel.util.ClassPath$Jar",
      "org.apache.bcel.classfile.Field$1",
      "org.apache.bcel.generic.DASTORE",
      "org.apache.bcel.generic.ObjectType",
      "org.apache.bcel.generic.IF_ACMPEQ",
      "org.apache.bcel.verifier.PassVerifier",
      "org.apache.bcel.generic.StackConsumer",
      "org.apache.bcel.generic.MethodObserver",
      "org.apache.bcel.classfile.ParameterAnnotationEntry",
      "org.apache.bcel.classfile.LocalVariableTable",
      "org.apache.bcel.generic.IXOR",
      "org.apache.bcel.classfile.ConstantUtf8",
      "org.apache.bcel.generic.IFLE",
      "org.apache.bcel.util.ClassPathRepository",
      "org.apache.bcel.classfile.ConstantValue",
      "org.apache.bcel.classfile.ConstantInvokeDynamic",
      "org.apache.bcel.generic.DCONST",
      "org.apache.bcel.classfile.ConstantCP",
      "org.apache.bcel.classfile.ConstantMethodHandle",
      "org.apache.bcel.classfile.LineNumber",
      "org.apache.bcel.classfile.ArrayElementValue",
      "org.apache.bcel.generic.Visitor",
      "org.apache.bcel.classfile.ConstantFloat",
      "org.apache.bcel.generic.FSTORE",
      "org.apache.bcel.generic.ACONST_NULL",
      "org.apache.bcel.classfile.Field",
      "org.apache.bcel.generic.AnnotationEntryGen",
      "org.apache.bcel.util.LruCacheClassPathRepository",
      "org.apache.bcel.verifier.exc.CodeConstraintException",
      "org.apache.bcel.generic.CASTORE",
      "org.apache.bcel.generic.BALOAD",
      "org.apache.bcel.generic.LDC2_W",
      "org.apache.bcel.ExceptionConst$1",
      "org.apache.bcel.generic.ElementValueGen",
      "org.apache.bcel.generic.TypedInstruction",
      "org.apache.bcel.Constants",
      "org.apache.bcel.generic.InvokeInstruction",
      "org.apache.bcel.util.SyntheticRepository",
      "org.apache.bcel.generic.DSTORE",
      "org.apache.bcel.generic.ANEWARRAY",
      "org.apache.bcel.classfile.DescendingVisitor",
      "org.apache.bcel.generic.CALOAD",
      "org.apache.bcel.classfile.Annotations",
      "org.apache.bcel.generic.InstructionConstants$Clinit",
      "org.apache.bcel.generic.DMUL",
      "org.apache.bcel.classfile.ConstantUtf8$Cache",
      "org.apache.bcel.util.MemorySensitiveClassPathRepository",
      "org.apache.bcel.generic.LRETURN",
      "org.apache.bcel.generic.NEW",
      "org.apache.bcel.classfile.BootstrapMethods",
      "org.apache.bcel.generic.JSR_W",
      "org.apache.bcel.generic.InstructionConst",
      "org.apache.bcel.generic.ARETURN",
      "org.apache.bcel.generic.ArrayType",
      "org.apache.bcel.generic.Type$2",
      "org.apache.bcel.generic.Type$1",
      "org.apache.bcel.util.Repository",
      "org.apache.bcel.generic.DUP_X1",
      "org.apache.bcel.classfile.ConstantFieldref",
      "org.apache.bcel.generic.DUP_X2",
      "org.apache.bcel.generic.Type$3",
      "org.apache.bcel.classfile.AnnotationDefault",
      "org.apache.bcel.classfile.ModuleMainClass",
      "org.apache.bcel.generic.MethodGen$1",
      "org.apache.bcel.generic.AALOAD",
      "org.apache.bcel.generic.ElementValuePairGen",
      "org.apache.bcel.util.ClassPath",
      "org.apache.bcel.verifier.structurals.Subroutines",
      "org.apache.bcel.generic.LREM",
      "org.apache.bcel.generic.FLOAD",
      "org.apache.bcel.generic.DNEG",
      "org.apache.bcel.util.ClassPath$Dir",
      "org.apache.bcel.ExceptionConst$EXCS",
      "org.apache.bcel.generic.ArrayElementValueGen",
      "org.apache.bcel.generic.LADD",
      "org.apache.bcel.classfile.ModulePackages",
      "org.apache.bcel.generic.INVOKEVIRTUAL",
      "org.apache.bcel.generic.INSTANCEOF",
      "org.apache.bcel.verifier.structurals.Subroutine",
      "org.apache.bcel.generic.INVOKEINTERFACE",
      "org.apache.bcel.generic.AllocationInstruction",
      "org.apache.bcel.generic.NEWARRAY",
      "org.apache.bcel.generic.AASTORE",
      "org.apache.bcel.generic.LDIV",
      "org.apache.bcel.classfile.Attribute",
      "org.apache.bcel.classfile.Constant",
      "org.apache.bcel.generic.DCMPG",
      "org.apache.bcel.generic.SWITCH",
      "org.apache.bcel.generic.GETSTATIC",
      "org.apache.bcel.generic.FCONST",
      "org.apache.bcel.generic.AnnotationElementValueGen",
      "org.apache.bcel.generic.IFGT",
      "org.apache.bcel.classfile.EnclosingMethod",
      "org.apache.bcel.generic.LSHL",
      "org.apache.bcel.generic.LCONST",
      "org.apache.bcel.generic.DCMPL",
      "org.apache.bcel.generic.IAND",
      "org.apache.bcel.generic.BASTORE",
      "org.apache.bcel.classfile.AttributeReader",
      "org.apache.bcel.generic.LSHR",
      "org.apache.bcel.classfile.ClassElementValue",
      "org.apache.bcel.classfile.LocalVariable",
      "org.apache.bcel.ExceptionConst",
      "org.apache.bcel.generic.IINC",
      "org.apache.bcel.generic.IFGE",
      "org.apache.bcel.generic.IMUL",
      "org.apache.bcel.generic.D2F",
      "org.apache.bcel.generic.PUTFIELD",
      "org.apache.bcel.classfile.LocalVariableTypeTable",
      "org.apache.bcel.generic.D2L",
      "org.apache.bcel.generic.L2D",
      "org.apache.bcel.classfile.RuntimeVisibleAnnotations",
      "org.apache.bcel.classfile.ConstantMethodref",
      "org.apache.bcel.verifier.structurals.Pass3bVerifier$InstructionContextQueue",
      "org.apache.bcel.generic.D2I",
      "org.apache.bcel.generic.ExceptionThrower",
      "org.apache.bcel.classfile.ConstantNameAndType",
      "org.apache.bcel.generic.IUSHR",
      "org.apache.bcel.generic.L2F",
      "org.apache.bcel.generic.IfInstruction",
      "org.apache.bcel.generic.L2I"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.bcel.verifier.VerificationResult", false, Pass3bVerifier_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.bcel.verifier.Verifier", false, Pass3bVerifier_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Pass3bVerifier_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.bcel.verifier.PassVerifier",
      "org.apache.bcel.verifier.structurals.Pass3bVerifier",
      "org.apache.bcel.verifier.structurals.Pass3bVerifier$InstructionContextQueue",
      "org.apache.bcel.generic.BasicType",
      "org.apache.bcel.Const",
      "org.apache.bcel.generic.ReferenceType",
      "org.apache.bcel.generic.ObjectType",
      "org.apache.bcel.generic.Type$1",
      "org.apache.bcel.generic.Type$2",
      "org.apache.bcel.generic.Type$3",
      "org.apache.bcel.generic.Type",
      "org.apache.bcel.verifier.VerificationResult",
      "org.apache.bcel.util.ClassPath",
      "org.apache.bcel.util.AbstractClassPathRepository",
      "org.apache.bcel.util.MemorySensitiveClassPathRepository",
      "org.apache.bcel.util.SyntheticRepository",
      "org.apache.bcel.Repository",
      "org.apache.bcel.verifier.structurals.Frame",
      "org.apache.bcel.verifier.Verifier",
      "org.apache.bcel.classfile.Utility$1",
      "org.apache.bcel.classfile.Utility",
      "org.apache.bcel.classfile.ClassFormatException",
      "org.apache.bcel.generic.InstructionComparator",
      "org.apache.bcel.generic.Instruction",
      "org.apache.bcel.generic.ACONST_NULL",
      "org.apache.bcel.classfile.ConstantPool",
      "org.apache.bcel.generic.ConstantPoolGen",
      "org.apache.bcel.generic.CPInstruction",
      "org.apache.bcel.generic.FieldOrMethod",
      "org.apache.bcel.generic.FieldInstruction",
      "org.apache.bcel.generic.GETFIELD",
      "org.apache.bcel.generic.ClassGenException",
      "org.apache.bcel.util.ClassLoaderRepository",
      "org.apache.bcel.classfile.ClassParser",
      "org.apache.bcel.classfile.Constant$1",
      "org.apache.bcel.classfile.Constant",
      "org.apache.bcel.classfile.ConstantClass",
      "org.apache.bcel.classfile.ConstantCP",
      "org.apache.bcel.classfile.ConstantMethodref",
      "org.apache.bcel.classfile.ConstantInterfaceMethodref",
      "org.apache.bcel.classfile.ConstantUtf8$Cache$1",
      "org.apache.bcel.classfile.ConstantUtf8$Cache",
      "org.apache.bcel.classfile.ConstantUtf8",
      "org.apache.bcel.classfile.ConstantNameAndType",
      "org.apache.bcel.classfile.AccessFlags",
      "org.apache.bcel.classfile.FieldOrMethod",
      "org.apache.bcel.classfile.Method$1",
      "org.apache.bcel.classfile.Method",
      "org.apache.bcel.classfile.Attribute",
      "org.apache.bcel.classfile.Code",
      "org.apache.bcel.classfile.LineNumberTable",
      "org.apache.bcel.classfile.LineNumber",
      "org.apache.bcel.classfile.LocalVariableTable",
      "org.apache.bcel.classfile.LocalVariable",
      "org.apache.bcel.classfile.SourceFile",
      "org.apache.bcel.classfile.JavaClass$1",
      "org.apache.bcel.classfile.JavaClass",
      "org.apache.bcel.util.ClassPathRepository",
      "org.apache.bcel.generic.INSTANCEOF",
      "org.apache.bcel.generic.InvokeInstruction",
      "org.apache.bcel.generic.INVOKEDYNAMIC",
      "org.apache.bcel.classfile.ConstantMethodType",
      "org.apache.bcel.verifier.exc.VerifierConstraintViolatedException",
      "org.apache.bcel.verifier.exc.VerificationException",
      "org.apache.bcel.verifier.exc.CodeConstraintException",
      "org.apache.bcel.verifier.exc.StructuralCodeConstraintException",
      "org.apache.bcel.generic.FCONST",
      "org.apache.bcel.generic.FCMPG",
      "org.apache.bcel.classfile.ConstantLong",
      "org.apache.bcel.generic.FieldGenOrMethodGen",
      "org.apache.bcel.generic.MethodGen$1",
      "org.apache.bcel.generic.MethodGen",
      "org.apache.bcel.classfile.ConstantFloat",
      "org.apache.bcel.generic.ArrayInstruction",
      "org.apache.bcel.generic.AALOAD",
      "org.apache.bcel.generic.ArrayType",
      "org.apache.bcel.generic.InstructionList",
      "org.apache.bcel.classfile.ConstantString",
      "org.apache.bcel.classfile.ConstantInteger",
      "org.apache.bcel.classfile.Signature",
      "org.apache.bcel.classfile.StackMap",
      "org.apache.bcel.classfile.StackMapEntry",
      "org.apache.bcel.classfile.StackMapType",
      "org.apache.bcel.classfile.ExceptionTable",
      "org.apache.bcel.classfile.ConstantPackage",
      "org.apache.bcel.classfile.ConstantModule",
      "org.apache.bcel.classfile.ConstantDynamic",
      "org.apache.bcel.verifier.structurals.UninitializedObjectType",
      "org.apache.bcel.generic.NOP",
      "org.apache.bcel.generic.ICONST",
      "org.apache.bcel.generic.LCONST",
      "org.apache.bcel.generic.DCONST",
      "org.apache.bcel.generic.IALOAD",
      "org.apache.bcel.generic.LALOAD",
      "org.apache.bcel.generic.FALOAD",
      "org.apache.bcel.generic.DALOAD",
      "org.apache.bcel.generic.BALOAD",
      "org.apache.bcel.generic.CALOAD",
      "org.apache.bcel.generic.SALOAD",
      "org.apache.bcel.generic.IASTORE",
      "org.apache.bcel.generic.LASTORE",
      "org.apache.bcel.generic.FASTORE",
      "org.apache.bcel.generic.DASTORE",
      "org.apache.bcel.generic.AASTORE",
      "org.apache.bcel.generic.BASTORE",
      "org.apache.bcel.generic.CASTORE",
      "org.apache.bcel.generic.SASTORE",
      "org.apache.bcel.generic.StackInstruction",
      "org.apache.bcel.generic.POP",
      "org.apache.bcel.generic.POP2",
      "org.apache.bcel.generic.DUP",
      "org.apache.bcel.generic.DUP_X1",
      "org.apache.bcel.generic.DUP_X2",
      "org.apache.bcel.generic.DUP2",
      "org.apache.bcel.generic.DUP2_X1",
      "org.apache.bcel.generic.DUP2_X2",
      "org.apache.bcel.generic.SWAP",
      "org.apache.bcel.generic.ArithmeticInstruction",
      "org.apache.bcel.generic.IADD",
      "org.apache.bcel.generic.LADD",
      "org.apache.bcel.generic.FADD",
      "org.apache.bcel.generic.DADD",
      "org.apache.bcel.generic.ISUB",
      "org.apache.bcel.generic.LSUB",
      "org.apache.bcel.generic.FSUB",
      "org.apache.bcel.generic.DSUB",
      "org.apache.bcel.generic.IMUL",
      "org.apache.bcel.generic.LMUL",
      "org.apache.bcel.generic.FMUL",
      "org.apache.bcel.generic.DMUL",
      "org.apache.bcel.generic.IDIV",
      "org.apache.bcel.generic.LDIV",
      "org.apache.bcel.generic.FDIV",
      "org.apache.bcel.generic.DDIV",
      "org.apache.bcel.generic.IREM",
      "org.apache.bcel.generic.LREM",
      "org.apache.bcel.generic.FREM",
      "org.apache.bcel.generic.DREM",
      "org.apache.bcel.generic.INEG",
      "org.apache.bcel.generic.LNEG",
      "org.apache.bcel.generic.FNEG",
      "org.apache.bcel.generic.DNEG",
      "org.apache.bcel.generic.ISHL",
      "org.apache.bcel.generic.LSHL",
      "org.apache.bcel.generic.ISHR",
      "org.apache.bcel.generic.LSHR",
      "org.apache.bcel.generic.IUSHR",
      "org.apache.bcel.generic.LUSHR",
      "org.apache.bcel.generic.IAND",
      "org.apache.bcel.generic.LAND",
      "org.apache.bcel.generic.IOR",
      "org.apache.bcel.generic.LOR",
      "org.apache.bcel.generic.IXOR",
      "org.apache.bcel.generic.LXOR",
      "org.apache.bcel.generic.ConversionInstruction",
      "org.apache.bcel.generic.I2L",
      "org.apache.bcel.generic.I2F",
      "org.apache.bcel.generic.I2D",
      "org.apache.bcel.generic.L2I",
      "org.apache.bcel.generic.L2F",
      "org.apache.bcel.generic.L2D",
      "org.apache.bcel.generic.F2I",
      "org.apache.bcel.generic.F2L",
      "org.apache.bcel.generic.F2D",
      "org.apache.bcel.generic.D2I",
      "org.apache.bcel.generic.D2L",
      "org.apache.bcel.generic.D2F",
      "org.apache.bcel.generic.I2B",
      "org.apache.bcel.generic.I2C",
      "org.apache.bcel.generic.I2S",
      "org.apache.bcel.generic.LCMP",
      "org.apache.bcel.generic.FCMPL",
      "org.apache.bcel.generic.DCMPL",
      "org.apache.bcel.generic.DCMPG",
      "org.apache.bcel.generic.ReturnInstruction",
      "org.apache.bcel.generic.IRETURN",
      "org.apache.bcel.generic.LRETURN",
      "org.apache.bcel.generic.FRETURN",
      "org.apache.bcel.generic.DRETURN",
      "org.apache.bcel.generic.ARETURN",
      "org.apache.bcel.generic.RETURN",
      "org.apache.bcel.generic.ARRAYLENGTH",
      "org.apache.bcel.generic.ATHROW",
      "org.apache.bcel.generic.MONITORENTER",
      "org.apache.bcel.generic.MONITOREXIT",
      "org.apache.bcel.generic.LocalVariableInstruction",
      "org.apache.bcel.generic.LoadInstruction",
      "org.apache.bcel.generic.ALOAD",
      "org.apache.bcel.generic.ILOAD",
      "org.apache.bcel.generic.StoreInstruction",
      "org.apache.bcel.generic.ASTORE",
      "org.apache.bcel.generic.ISTORE",
      "org.apache.bcel.generic.InstructionConstants$Clinit",
      "org.apache.bcel.generic.InstructionConstants",
      "org.apache.bcel.generic.InstructionHandle",
      "org.apache.bcel.generic.PUSH",
      "org.apache.bcel.generic.LDC2_W",
      "org.apache.bcel.generic.LocalVariableGen",
      "org.apache.bcel.generic.BranchInstruction",
      "org.apache.bcel.util.ByteSequence",
      "org.apache.bcel.util.ByteSequence$ByteArrayStream",
      "org.apache.bcel.generic.InstructionConst",
      "org.apache.bcel.generic.IMPDEP2",
      "org.apache.bcel.generic.CHECKCAST",
      "org.apache.bcel.classfile.ConstantInvokeDynamic",
      "org.apache.bcel.generic.NEWARRAY",
      "org.apache.bcel.classfile.ConstantMethodHandle",
      "org.apache.bcel.generic.ANEWARRAY",
      "org.apache.bcel.classfile.ConstantDouble",
      "org.apache.bcel.verifier.structurals.LocalVariables",
      "org.apache.bcel.generic.MULTIANEWARRAY",
      "org.apache.bcel.classfile.ConstantFieldref",
      "org.apache.bcel.classfile.Field$1",
      "org.apache.bcel.classfile.Field",
      "org.apache.bcel.classfile.ConstantValue",
      "org.apache.bcel.classfile.Annotations",
      "org.apache.bcel.classfile.RuntimeVisibleAnnotations",
      "org.apache.bcel.classfile.AnnotationEntry",
      "org.apache.bcel.classfile.CodeException",
      "org.apache.bcel.classfile.InnerClasses",
      "org.apache.bcel.classfile.InnerClass",
      "org.apache.bcel.verifier.structurals.OperandStack",
      "org.apache.bcel.generic.ConstantPoolGen$Index",
      "org.apache.bcel.generic.NEW",
      "org.apache.bcel.generic.EmptyVisitor",
      "org.apache.bcel.verifier.structurals.InstConstraintVisitor",
      "org.apache.bcel.verifier.exc.AssertionViolatedException",
      "org.apache.bcel.generic.FLOAD",
      "org.apache.bcel.classfile.Synthetic",
      "org.apache.bcel.generic.BIPUSH",
      "org.apache.bcel.util.LruCacheClassPathRepository",
      "org.apache.bcel.util.LruCacheClassPathRepository$1",
      "org.apache.bcel.generic.ReturnaddressType",
      "org.apache.bcel.classfile.Deprecated",
      "org.apache.bcel.generic.IfInstruction",
      "org.apache.bcel.generic.IFLT",
      "org.apache.bcel.generic.BranchHandle",
      "org.apache.bcel.verifier.structurals.ExecutionVisitor",
      "org.apache.bcel.generic.GotoInstruction",
      "org.apache.bcel.generic.GOTO_W",
      "org.apache.bcel.generic.SIPUSH",
      "org.apache.bcel.generic.DSTORE",
      "org.apache.bcel.generic.SWITCH",
      "org.apache.bcel.generic.Select",
      "org.apache.bcel.generic.LOOKUPSWITCH",
      "org.apache.bcel.util.ClassPath$AbstractPathEntry",
      "org.apache.bcel.util.ClassPath$Dir",
      "org.apache.bcel.generic.IF_ICMPNE",
      "org.apache.bcel.generic.IF_ICMPEQ",
      "org.apache.bcel.generic.IINC",
      "org.apache.bcel.ExceptionConst$EXCS",
      "org.apache.bcel.ExceptionConst",
      "org.apache.bcel.ExceptionConst$1",
      "org.apache.bcel.generic.RET",
      "org.apache.bcel.generic.FSTORE",
      "org.apache.bcel.generic.LSTORE",
      "org.apache.bcel.classfile.ModuleMainClass",
      "org.apache.bcel.classfile.PMGClass",
      "org.apache.bcel.generic.LDC",
      "org.apache.bcel.generic.LDC_W",
      "org.apache.bcel.util.ModularRuntimeImage",
      "org.apache.bcel.util.ClassPath$AbstractZip",
      "org.apache.bcel.util.ClassPath$Jar",
      "org.apache.bcel.generic.IF_ICMPGE",
      "org.apache.bcel.generic.IF_ICMPLT",
      "org.apache.bcel.generic.JsrInstruction",
      "org.apache.bcel.generic.JSR_W",
      "org.apache.bcel.classfile.ParameterAnnotations",
      "org.apache.bcel.classfile.RuntimeInvisibleParameterAnnotations",
      "org.apache.bcel.classfile.ParameterAnnotationEntry",
      "org.apache.bcel.classfile.NestHost",
      "org.apache.bcel.classfile.NestMembers",
      "org.apache.bcel.classfile.Unknown",
      "org.apache.bcel.generic.LLOAD",
      "org.apache.bcel.generic.INVOKEINTERFACE",
      "org.apache.bcel.Constants",
      "org.apache.bcel.generic.AnnotationEntryGen",
      "org.apache.bcel.generic.IFNE",
      "org.apache.bcel.classfile.ModulePackages",
      "org.apache.bcel.generic.IFGE",
      "org.apache.bcel.classfile.RuntimeVisibleParameterAnnotations",
      "org.apache.bcel.classfile.BootstrapMethod",
      "org.apache.bcel.classfile.BootstrapMethods",
      "org.apache.bcel.generic.INVOKESTATIC",
      "org.apache.bcel.generic.JSR",
      "org.apache.bcel.generic.IFEQ",
      "org.apache.bcel.generic.GOTO",
      "org.apache.bcel.generic.BREAKPOINT",
      "org.apache.bcel.generic.IF_ACMPNE",
      "org.apache.bcel.generic.IFGT",
      "org.apache.bcel.classfile.LocalVariableTypeTable",
      "org.apache.bcel.generic.TABLESWITCH",
      "org.apache.bcel.generic.DLOAD",
      "org.apache.bcel.generic.IFNULL",
      "org.apache.bcel.generic.IF_ICMPLE",
      "org.apache.bcel.generic.PUTSTATIC",
      "org.apache.bcel.generic.InstructionList$1",
      "org.apache.bcel.classfile.RuntimeInvisibleAnnotations",
      "org.apache.bcel.generic.INVOKEVIRTUAL",
      "org.apache.bcel.generic.IFLE",
      "org.apache.bcel.generic.IFNONNULL",
      "org.apache.bcel.generic.IF_ACMPEQ",
      "org.apache.bcel.classfile.DescendingVisitor",
      "org.apache.bcel.generic.INVOKESPECIAL",
      "org.apache.bcel.generic.LineNumberGen",
      "org.apache.bcel.generic.CodeExceptionGen",
      "org.apache.bcel.generic.IF_ICMPGT",
      "org.apache.bcel.generic.IMPDEP1",
      "org.apache.bcel.generic.ElementValueGen",
      "org.apache.bcel.generic.ArrayElementValueGen",
      "org.apache.bcel.classfile.ElementValue",
      "org.apache.bcel.classfile.ArrayElementValue",
      "org.apache.bcel.classfile.AnnotationElementValue",
      "org.apache.bcel.classfile.ElementValuePair",
      "org.apache.bcel.classfile.EnumElementValue",
      "org.apache.bcel.generic.GETSTATIC",
      "org.apache.bcel.classfile.AnnotationDefault",
      "org.apache.bcel.classfile.ClassElementValue",
      "org.apache.bcel.generic.PUTFIELD",
      "org.apache.bcel.generic.SimpleElementValueGen",
      "org.apache.bcel.classfile.SimpleElementValue",
      "org.apache.bcel.generic.MethodGen$BranchStack",
      "org.apache.bcel.generic.ClassElementValueGen",
      "org.apache.bcel.classfile.EnclosingMethod"
    );
  }
}
