/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:49:10 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantFloat;
import org.apache.bcel.classfile.ConstantInteger;
import org.apache.bcel.classfile.ConstantInvokeDynamic;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.INVOKEDYNAMIC;
import org.apache.bcel.generic.ReferenceType;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class INVOKEDYNAMIC_ESTest extends INVOKEDYNAMIC_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC(3342);
      byte[] byteArray0 = new byte[6];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      iNVOKEDYNAMIC0.initFromFile(byteSequence0, true);
      Constant[] constantArray0 = new Constant[1];
      ConstantFloat constantFloat0 = new ConstantFloat(0.0F);
      constantArray0[0] = (Constant) constantFloat0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      iNVOKEDYNAMIC0.toString(constantPool0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      Constant[] constantArray0 = new Constant[8];
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic((-1889), (-1));
      constantArray0[0] = (Constant) constantInvokeDynamic0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKEDYNAMIC0.toString(constantPool0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -1. Constant pool size is: 8
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      Constant[] constantArray0 = new Constant[5];
      ConstantInteger constantInteger0 = new ConstantInteger(477);
      constantArray0[0] = (Constant) constantInteger0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKEDYNAMIC0.toString(constantPool0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      // Undeclared exception!
      try { 
        iNVOKEDYNAMIC0.initFromFile((ByteSequence) null, true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      byte[] byteArray0 = new byte[3];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      try { 
        iNVOKEDYNAMIC0.initFromFile(byteSequence0, false);
        fail("Expecting exception: EOFException");
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      // Undeclared exception!
      try { 
        iNVOKEDYNAMIC0.getClassName((ConstantPoolGen) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.INVOKEDYNAMIC", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      Constant[] constantArray0 = new Constant[1];
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(1027, 0);
      constantArray0[0] = (Constant) constantInvokeDynamic0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKEDYNAMIC0.getClassName(constantPoolGen0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantInvokeDynamic cannot be cast to org.apache.bcel.classfile.ConstantNameAndType
         //
         verifyException("org.apache.bcel.generic.INVOKEDYNAMIC", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      // Undeclared exception!
      try { 
        iNVOKEDYNAMIC0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.INVOKEDYNAMIC", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Q5$}=&ut{! G4n", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dataOutputStream0.close();
      try { 
        iNVOKEDYNAMIC0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = null;
      try {
        iNVOKEDYNAMIC0 = new INVOKEDYNAMIC((-1775));
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Negative index value: -1775
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      Class<?>[] classArray0 = iNVOKEDYNAMIC0.getExceptions();
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      Constant[] constantArray0 = new Constant[8];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKEDYNAMIC0.toString(constantPool0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC(0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKEDYNAMIC0.getClassName(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Constant pool at index 0 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        iNVOKEDYNAMIC0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ReferenceType referenceType0 = iNVOKEDYNAMIC0.getReferenceType(constantPoolGen0);
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Q5$}=&ut{! G4n", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      iNVOKEDYNAMIC0.dump(dataOutputStream0);
      ;
}
}
