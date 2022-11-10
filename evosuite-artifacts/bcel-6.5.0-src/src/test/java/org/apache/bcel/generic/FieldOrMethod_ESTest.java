/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:32:55 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantDouble;
import org.apache.bcel.classfile.ConstantDynamic;
import org.apache.bcel.classfile.ConstantFieldref;
import org.apache.bcel.classfile.ConstantInteger;
import org.apache.bcel.classfile.ConstantLong;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.GETFIELD;
import org.apache.bcel.generic.GETSTATIC;
import org.apache.bcel.generic.INVOKEDYNAMIC;
import org.apache.bcel.generic.INVOKEINTERFACE;
import org.apache.bcel.generic.INVOKESPECIAL;
import org.apache.bcel.generic.INVOKESTATIC;
import org.apache.bcel.generic.INVOKEVIRTUAL;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.PUTFIELD;
import org.apache.bcel.generic.ReferenceType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldOrMethod_ESTest extends FieldOrMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GETSTATIC gETSTATIC0 = new GETSTATIC();
      Constant[] constantArray0 = new Constant[4];
      ConstantDynamic constantDynamic0 = new ConstantDynamic(70, 70);
      constantArray0[0] = (Constant) constantDynamic0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        gETSTATIC0.produceStack(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      INVOKEVIRTUAL iNVOKEVIRTUAL0 = new INVOKEVIRTUAL();
      Constant[] constantArray0 = new Constant[1];
      ConstantFieldref constantFieldref0 = new ConstantFieldref(1, 31);
      constantArray0[0] = (Constant) constantFieldref0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKEVIRTUAL0.getName(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ReferenceType referenceType0 = iNVOKEDYNAMIC0.getReferenceType(constantPoolGen0);
      assertEquals((byte)14, referenceType0.getType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      INVOKESPECIAL iNVOKESPECIAL0 = new INVOKESPECIAL(655);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKESPECIAL0.getSignature(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 655. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GETSTATIC gETSTATIC0 = new GETSTATIC();
      Constant[] constantArray0 = new Constant[1];
      ConstantLong constantLong0 = new ConstantLong(0L);
      constantArray0[0] = (Constant) constantLong0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        gETSTATIC0.getSignature(constantPoolGen0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantLong cannot be cast to org.apache.bcel.classfile.ConstantCP
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      INVOKEVIRTUAL iNVOKEVIRTUAL0 = new INVOKEVIRTUAL(299);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKEVIRTUAL0.getReferenceType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 299. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PUTFIELD pUTFIELD0 = new PUTFIELD(0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        pUTFIELD0.getReferenceType(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GETSTATIC gETSTATIC0 = new GETSTATIC(0);
      Constant[] constantArray0 = new Constant[5];
      ConstantInteger constantInteger0 = new ConstantInteger((-1088));
      constantArray0[0] = (Constant) constantInteger0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      // Undeclared exception!
      try { 
        gETSTATIC0.getReferenceType(constantPoolGen0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantInteger cannot be cast to org.apache.bcel.classfile.ConstantCP
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PUTFIELD pUTFIELD0 = new PUTFIELD(1930);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        pUTFIELD0.getName(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 1930. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      INVOKEVIRTUAL iNVOKEVIRTUAL0 = new INVOKEVIRTUAL();
      Constant[] constantArray0 = new Constant[3];
      ConstantDouble constantDouble0 = new ConstantDouble(0.0);
      constantArray0[0] = (Constant) constantDouble0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKEVIRTUAL0.getName(constantPoolGen0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantDouble cannot be cast to org.apache.bcel.classfile.ConstantCP
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant[] constantArray0 = new Constant[12];
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE();
      ConstantDynamic constantDynamic0 = new ConstantDynamic(184, 184);
      constantArray0[0] = (Constant) constantDynamic0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKEINTERFACE0.getLoadClassType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 184 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      INVOKESPECIAL iNVOKESPECIAL0 = new INVOKESPECIAL();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKESPECIAL0.getLoadClassType(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      INVOKEVIRTUAL iNVOKEVIRTUAL0 = new INVOKEVIRTUAL();
      Constant[] constantArray0 = new Constant[4];
      ConstantClass constantClass0 = new ConstantClass(2577);
      constantArray0[0] = (Constant) constantClass0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKEVIRTUAL0.getLoadClassType(constantPoolGen0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantClass cannot be cast to org.apache.bcel.classfile.ConstantCP
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      INVOKESTATIC iNVOKESTATIC0 = new INVOKESTATIC(0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKESTATIC0.getClassType(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.InvokeInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE();
      Constant[] constantArray0 = new Constant[1];
      ConstantInteger constantInteger0 = new ConstantInteger(21);
      constantArray0[0] = (Constant) constantInteger0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKEINTERFACE0.getClassType(constantPoolGen0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantInteger cannot be cast to org.apache.bcel.classfile.ConstantCP
         //
         verifyException("org.apache.bcel.generic.InvokeInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PUTFIELD pUTFIELD0 = new PUTFIELD();
      Constant[] constantArray0 = new Constant[1];
      ConstantDynamic constantDynamic0 = new ConstantDynamic(165, 165);
      constantArray0[0] = (Constant) constantDynamic0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        pUTFIELD0.getClassName(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 165 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GETFIELD gETFIELD0 = new GETFIELD(0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        gETFIELD0.getClassName(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ObjectType objectType0 = iNVOKEDYNAMIC0.getLoadClassType(constantPoolGen0);
      assertEquals((byte)14, objectType0.getType());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE();
      // Undeclared exception!
      try { 
        iNVOKEINTERFACE0.getSignature((ConstantPoolGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC(0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKEDYNAMIC0.getClassType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 0 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
}
