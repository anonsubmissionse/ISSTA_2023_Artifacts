/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:43:58 GMT 2022
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.classfile.Annotations;
import org.apache.bcel.classfile.CodeException;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantDouble;
import org.apache.bcel.classfile.ConstantDynamic;
import org.apache.bcel.classfile.ConstantFieldref;
import org.apache.bcel.classfile.ConstantFloat;
import org.apache.bcel.classfile.ConstantInterfaceMethodref;
import org.apache.bcel.classfile.ConstantInvokeDynamic;
import org.apache.bcel.classfile.ConstantLong;
import org.apache.bcel.classfile.ConstantMethodHandle;
import org.apache.bcel.classfile.ConstantMethodType;
import org.apache.bcel.classfile.ConstantMethodref;
import org.apache.bcel.classfile.ConstantModule;
import org.apache.bcel.classfile.ConstantNameAndType;
import org.apache.bcel.classfile.ConstantPackage;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantString;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.classfile.Deprecated;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.ExceptionTable;
import org.apache.bcel.classfile.InnerClass;
import org.apache.bcel.classfile.InnerClasses;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.LineNumber;
import org.apache.bcel.classfile.LocalVariable;
import org.apache.bcel.classfile.LocalVariableTable;
import org.apache.bcel.classfile.LocalVariableTypeTable;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.classfile.MethodParameter;
import org.apache.bcel.classfile.MethodParameters;
import org.apache.bcel.classfile.ModuleExports;
import org.apache.bcel.classfile.ModuleMainClass;
import org.apache.bcel.classfile.NestHost;
import org.apache.bcel.classfile.NestMembers;
import org.apache.bcel.classfile.ParameterAnnotationEntry;
import org.apache.bcel.classfile.ParameterAnnotations;
import org.apache.bcel.classfile.Signature;
import org.apache.bcel.classfile.SourceFile;
import org.apache.bcel.classfile.StackMapEntry;
import org.apache.bcel.classfile.Synthetic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmptyVisitor_ESTest extends EmptyVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantClass constantClass0 = new ConstantClass(0);
      emptyVisitor0.visitConstantClass(constantClass0);
      assertEquals((byte)7, constantClass0.getTag());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantFloat constantFloat0 = new ConstantFloat((-366.533F));
      emptyVisitor0.visitConstantFloat(constantFloat0);
      assertEquals((byte)4, constantFloat0.getTag());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      Method method0 = new Method();
      emptyVisitor0.visitMethod(method0);
      assertFalse(method0.isSynthetic());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantString constantString0 = new ConstantString(237);
      emptyVisitor0.visitConstantString(constantString0);
      assertEquals((byte)8, constantString0.getTag());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitConstantNameAndType((ConstantNameAndType) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitSynthetic((Synthetic) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      ModuleMainClass moduleMainClass0 = new ModuleMainClass((-1849), (-1849), (-1849), constantPool0);
      emptyVisitor0.visitModuleMainClass(moduleMainClass0);
      assertEquals((-1849), moduleMainClass0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitLocalVariableTypeTable((LocalVariableTypeTable) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitParameterAnnotation((ParameterAnnotations) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantPackage constantPackage0 = new ConstantPackage(126);
      emptyVisitor0.visitConstantPackage(constantPackage0);
      assertEquals((byte)20, constantPackage0.getTag());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitInnerClass((InnerClass) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("");
      emptyVisitor0.visitConstantUtf8(constantUtf8_0);
      assertEquals((byte)1, constantUtf8_0.getTag());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantModule constantModule0 = new ConstantModule(82);
      emptyVisitor0.visitConstantModule(constantModule0);
      assertEquals(82, constantModule0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      NestHost nestHost0 = new NestHost(0, 0, 43, (ConstantPool) null);
      emptyVisitor0.visitNestHost(nestHost0);
      assertEquals(43, nestHost0.getHostClassIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitLineNumber((LineNumber) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantDouble constantDouble0 = new ConstantDouble(3448.8194918);
      emptyVisitor0.visitConstantDouble(constantDouble0);
      assertEquals((byte)6, constantDouble0.getTag());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitParameterAnnotationEntry((ParameterAnnotationEntry) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitInnerClasses((InnerClasses) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitConstantPool((ConstantPool) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      MethodParameter methodParameter0 = new MethodParameter();
      emptyVisitor0.visitMethodParameter(methodParameter0);
      assertFalse(methodParameter0.isFinal());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      LocalVariable localVariable0 = new LocalVariable(106, 106, 0, (-1), (-1), (ConstantPool) null, 0);
      emptyVisitor0.visitLocalVariable(localVariable0);
      assertEquals((-1), localVariable0.getIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      CodeException codeException0 = new CodeException((byte)1, (-1638), (-1401), 1);
      emptyVisitor0.visitCodeException(codeException0);
      assertEquals((-1401), codeException0.getHandlerPC());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitJavaClass((JavaClass) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitStackMapEntry((StackMapEntry) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantLong constantLong0 = new ConstantLong((-844L));
      emptyVisitor0.visitConstantLong(constantLong0);
      assertEquals((-844L), constantLong0.getBytes());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitAnnotation((Annotations) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantDynamic constantDynamic0 = new ConstantDynamic(1000, 1000);
      emptyVisitor0.visitConstantDynamic(constantDynamic0);
      assertEquals(1000, constantDynamic0.getBootstrapMethodAttrIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      byte[] byteArray0 = new byte[0];
      Deprecated deprecated0 = new Deprecated((-1), (-208), byteArray0, (ConstantPool) null);
      emptyVisitor0.visitDeprecated(deprecated0);
      assertEquals((-208), deprecated0.getLength());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantFieldref constantFieldref0 = new ConstantFieldref(0, (-275));
      emptyVisitor0.visitConstantFieldref(constantFieldref0);
      assertEquals(0, constantFieldref0.getClassIndex());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(0, (-2008));
      emptyVisitor0.visitConstantInvokeDynamic(constantInvokeDynamic0);
      assertEquals(0, constantInvokeDynamic0.getBootstrapMethodAttrIndex());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitLocalVariableTable((LocalVariableTable) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      SourceFile sourceFile0 = new SourceFile((-2008), 0, (-991), (ConstantPool) null);
      emptyVisitor0.visitSourceFile(sourceFile0);
      assertEquals((-2008), sourceFile0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitNestMembers((NestMembers) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitMethodParameters((MethodParameters) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantInterfaceMethodref constantInterfaceMethodref0 = new ConstantInterfaceMethodref(0, (-3706));
      emptyVisitor0.visitConstantInterfaceMethodref(constantInterfaceMethodref0);
      assertEquals(0, constantInterfaceMethodref0.getClassIndex());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitConstantMethodHandle((ConstantMethodHandle) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitModuleExports((ModuleExports) null);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantMethodType constantMethodType0 = new ConstantMethodType(0);
      emptyVisitor0.visitConstantMethodType(constantMethodType0);
      assertEquals(0, constantMethodType0.getDescriptorIndex());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitSignature((Signature) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      int[] intArray0 = new int[5];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ExceptionTable exceptionTable0 = new ExceptionTable(1, (-686), intArray0, constantPool0);
      emptyVisitor0.visitExceptionTable(exceptionTable0);
      assertEquals((byte)3, exceptionTable0.getTag());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantMethodref constantMethodref0 = new ConstantMethodref(0, 0);
      emptyVisitor0.visitConstantMethodref(constantMethodref0);
      assertEquals(0, constantMethodref0.getClassIndex());
  }
}
