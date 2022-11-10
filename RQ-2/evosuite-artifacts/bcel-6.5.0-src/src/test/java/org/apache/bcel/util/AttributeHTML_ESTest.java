/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:07:09 GMT 2022
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import org.apache.bcel.classfile.AnnotationDefault;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.ClassElementValue;
import org.apache.bcel.classfile.Code;
import org.apache.bcel.classfile.CodeException;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantValue;
import org.apache.bcel.classfile.ExceptionTable;
import org.apache.bcel.classfile.InnerClass;
import org.apache.bcel.classfile.InnerClasses;
import org.apache.bcel.classfile.LineNumber;
import org.apache.bcel.classfile.LineNumberTable;
import org.apache.bcel.classfile.LocalVariable;
import org.apache.bcel.classfile.LocalVariableTable;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.classfile.NestHost;
import org.apache.bcel.classfile.PMGClass;
import org.apache.bcel.classfile.SourceFile;
import org.apache.bcel.util.AttributeHTML;
import org.apache.bcel.util.ConstantHTML;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AttributeHTML_ESTest extends AttributeHTML_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Constant[] constantArray0 = new Constant[9];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AttributeHTML attributeHTML0 = new AttributeHTML("^>SM_fT7 n", "n", constantPool0, (ConstantHTML) null);
      byte[] byteArray0 = new byte[8];
      CodeException[] codeExceptionArray0 = new CodeException[1];
      CodeException codeException0 = new CodeException((byte)0, (byte)124, (byte)0, (byte)0);
      codeExceptionArray0[0] = codeException0;
      Code code0 = new Code(10, 2134, 2134, 2134, byteArray0, codeExceptionArray0, (Attribute[]) null, constantPool0);
      attributeHTML0.writeAttribute(code0, "n", (-27));
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Method[] methodArray0 = new Method[1];
      Attribute[] attributeArray0 = new Attribute[9];
      InnerClass[] innerClassArray0 = new InnerClass[7];
      InnerClass innerClass0 = new InnerClass(0, (-1), (-1), 0);
      innerClassArray0[0] = innerClass0;
      InnerClasses innerClasses0 = new InnerClasses(0, 1066, innerClassArray0, constantPool0);
      attributeArray0[8] = (Attribute) innerClasses0;
      ConstantHTML constantHTML0 = new ConstantHTML(", handled at line ", "Q<]o#XJ!W", "", methodArray0, constantPool0);
      AttributeHTML attributeHTML0 = new AttributeHTML(")zI9v", ")zI9v", constantPool0, constantHTML0);
      // Undeclared exception!
      try { 
        attributeHTML0.writeAttribute(attributeArray0[8], "Q<]o#XJ!W", 265);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.util.ConstantHTML", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AttributeHTML attributeHTML0 = new AttributeHTML("</TABLE></BODY></HTML>", "</TABLE></BODY></HTML>", (ConstantPool) null, (ConstantHTML) null);
      LocalVariable[] localVariableArray0 = new LocalVariable[2];
      LocalVariable localVariable0 = new LocalVariable(1848, 1848, 1848, 371, (-3553), (ConstantPool) null);
      localVariableArray0[0] = localVariable0;
      LocalVariableTable localVariableTable0 = new LocalVariableTable(1848, 1848, localVariableArray0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        attributeHTML0.writeAttribute(localVariableTable0, "</TABLE></BODY></HTML>", (-1118));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.AttributeHTML", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Method[] methodArray0 = new Method[0];
      ConstantHTML constantHTML0 = new ConstantHTML("SAME_LOCALS_1_STACK_EXTENDED", (String) null, "SAME_LOCALS_1_STACK_EXTENDED", methodArray0, constantPool0);
      AttributeHTML attributeHTML0 = new AttributeHTML("<H4><A NAME=\"", "SAME_LOCALS_1_STACK_EXTENDED", constantPool0, constantHTML0);
      byte[] byteArray0 = new byte[4];
      CodeException[] codeExceptionArray0 = new CodeException[8];
      CodeException codeException0 = new CodeException(813, 246, 124, 813);
      codeExceptionArray0[0] = codeException0;
      Attribute[] attributeArray0 = new Attribute[3];
      NestHost nestHost0 = new NestHost((byte)4, (byte) (-36), 23, constantPool0);
      attributeArray0[0] = (Attribute) nestHost0;
      ClassElementValue classElementValue0 = new ClassElementValue((byte) (-36), (-693), constantPool0);
      AnnotationDefault annotationDefault0 = new AnnotationDefault((byte)4, 9, classElementValue0, constantPool0);
      attributeArray0[1] = (Attribute) annotationDefault0;
      attributeArray0[2] = (Attribute) nestHost0;
      Code code0 = new Code(813, 813, 23, 62, byteArray0, codeExceptionArray0, attributeArray0, constantPool0);
      // Undeclared exception!
      try { 
        attributeHTML0.writeAttribute(code0, "U*G", (byte) (-36));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 813
         //
         verifyException("org.apache.bcel.util.ConstantHTML", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AttributeHTML attributeHTML0 = new AttributeHTML("fneg", "fneg", constantPool0, (ConstantHTML) null);
      // Undeclared exception!
      try { 
        attributeHTML0.writeAttribute((Attribute) null, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.AttributeHTML", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Constant[] constantArray0 = new Constant[6];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("CONSTANT_DynamicCONSTANT_Dynamic_attributes.html");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AttributeHTML attributeHTML0 = null;
      try {
        attributeHTML0 = new AttributeHTML("CONSTANT_Dynamic", "CONSTANT_Dynamic", constantPool0, (ConstantHTML) null);
        fail("Expecting exception: FileNotFoundException");
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Method[] methodArray0 = new Method[1];
      Attribute[] attributeArray0 = new Attribute[12];
      InnerClass[] innerClassArray0 = new InnerClass[7];
      InnerClass innerClass0 = new InnerClass(8, 1066, 1066, 8);
      innerClassArray0[0] = innerClass0;
      InnerClasses innerClasses0 = new InnerClasses(0, 1066, innerClassArray0, constantPool0);
      attributeArray0[8] = (Attribute) innerClasses0;
      ConstantHTML constantHTML0 = new ConstantHTML(", handled at line ", "Q<]o#XJ!W", "", methodArray0, constantPool0);
      AttributeHTML attributeHTML0 = new AttributeHTML(")II9v", ")II9v", constantPool0, constantHTML0);
      // Undeclared exception!
      try { 
        attributeHTML0.writeAttribute(attributeArray0[8], "Q<]o#XJ!W", 1066);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 1066. Constant pool size is: 6
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AttributeHTML attributeHTML0 = new AttributeHTML("pTTS*", "pTTS*", (ConstantPool) null, (ConstantHTML) null);
      LineNumber[] lineNumberArray0 = new LineNumber[2];
      LineNumber lineNumber0 = new LineNumber(2, 2);
      lineNumberArray0[0] = lineNumber0;
      lineNumberArray0[1] = lineNumber0;
      LineNumberTable lineNumberTable0 = new LineNumberTable(2, 2, lineNumberArray0, (ConstantPool) null);
      attributeHTML0.writeAttribute(lineNumberTable0, "pTTS*", 2);
      assertEquals(0, lineNumberTable0.getTableLength());
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Constant[] constantArray0 = new Constant[9];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AttributeHTML attributeHTML0 = new AttributeHTML("^>SM_fT7 n", "", constantPool0, (ConstantHTML) null);
      byte[] byteArray0 = new byte[8];
      Code code0 = new Code(10, 2134, 2134, 2134, byteArray0, (CodeException[]) null, (Attribute[]) null, constantPool0);
      attributeHTML0.writeAttribute(code0, "<TR BGCLOR=\"#C0C0C0\"><TD>", 3);
      assertEquals(1, code0.getMaxStack());
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Method[] methodArray0 = new Method[1];
      ConstantHTML constantHTML0 = new ConstantHTML("", "", "", methodArray0, constantPool0);
      AttributeHTML attributeHTML0 = new AttributeHTML("cuY;own z z5Jn", "Vzb<", constantPool0, constantHTML0);
      PMGClass pMGClass0 = new PMGClass(17, (-1077), 0, 0, constantPool0);
      // Undeclared exception!
      try { 
        attributeHTML0.writeAttribute(pMGClass0, "\" TARGET=Code>Byte code</A></LI></UL>\n");
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Constant pool at index 0 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[5];
      ExceptionTable exceptionTable0 = new ExceptionTable((-3941), (-3941), intArray0, (ConstantPool) null);
      AttributeHTML attributeHTML0 = new AttributeHTML("pT2TS*", "pT2TS*", (ConstantPool) null, (ConstantHTML) null);
      attributeHTML0.writeAttribute(exceptionTable0, "pT2TS*", (-3941));
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantHTML constantHTML0 = new ConstantHTML(")</A>\n", ")</A>\n", ")</A>\n", (Method[]) null, constantPool0);
      AttributeHTML attributeHTML0 = new AttributeHTML(")</A>\n", ")</A>\n", constantPool0, constantHTML0);
      ConstantValue constantValue0 = new ConstantValue(30, 30, 30, constantPool0);
      attributeHTML0.writeAttribute(constantValue0, ")</A>\n", 30);
      assertEquals(1, constantValue0.getLength());
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AttributeHTML attributeHTML0 = new AttributeHTML("</TOWLE></BODY>2/HTML>", "</TOWLE></BODY>2/HTML>", (ConstantPool) null, (ConstantHTML) null);
      LocalVariable[] localVariableArray0 = new LocalVariable[2];
      LocalVariableTable localVariableTable0 = new LocalVariableTable(1848, 1848, localVariableArray0, (ConstantPool) null);
      LocalVariable[] localVariableArray1 = new LocalVariable[0];
      localVariableTable0.setLocalVariableTable(localVariableArray1);
      attributeHTML0.writeAttribute(localVariableTable0, "</TOWLE></BODY>2/HTML>", 1848);
      SourceFile sourceFile0 = new SourceFile(1848, 1848, (-607), (ConstantPool) null);
      attributeHTML0.writeAttribute(sourceFile0, "</TOWLE></BODY>2/HTML>", 1848);
      assertEquals(0, sourceFile0.getSourceFileIndex());
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AttributeHTML attributeHTML0 = new AttributeHTML("pTTS*", "pTTS*", (ConstantPool) null, (ConstantHTML) null);
      InnerClasses innerClasses0 = new InnerClasses(853, 1478, (InnerClass[]) null, (ConstantPool) null);
      attributeHTML0.writeAttribute(innerClasses0, "pTTS*");
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AttributeHTML attributeHTML0 = new AttributeHTML("</TOWLE></BODY>2/HTML>", "</TOWLE></BODY>2/HTML>", (ConstantPool) null, (ConstantHTML) null);
      attributeHTML0.close();
  }
}
