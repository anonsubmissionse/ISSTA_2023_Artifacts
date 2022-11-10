/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:10:07 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.LocalVariable;
import org.apache.bcel.generic.ARETURN;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.BasicType;
import org.apache.bcel.generic.CompoundInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.DREM;
import org.apache.bcel.generic.DUP;
import org.apache.bcel.generic.FCONST;
import org.apache.bcel.generic.FDIV;
import org.apache.bcel.generic.FSTORE;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LCONST;
import org.apache.bcel.generic.LDIV;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.MONITOREXIT;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.RET;
import org.apache.bcel.generic.ReferenceType;
import org.apache.bcel.generic.ReturnaddressType;
import org.apache.bcel.generic.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocalVariableGen_ESTest extends LocalVariableGen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicType basicType0 = Type.VOID;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(0, "!", basicType0, (InstructionHandle) null, (InstructionHandle) null);
      LocalVariableGen localVariableGen1 = new LocalVariableGen(15, "!", basicType0.CLASS, (InstructionHandle) null, (InstructionHandle) null);
      boolean boolean0 = localVariableGen0.equals(localVariableGen1);
      assertFalse(boolean0);
      assertEquals(15, localVariableGen1.getOrigIndex());
      assertTrue(localVariableGen1.getLiveToEnd());
      assertFalse(localVariableGen1.equals((Object)localVariableGen0));
      assertEquals(15, localVariableGen1.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicType basicType0 = Type.VOID;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(0, "}", basicType0.STRINGBUFFER, (InstructionHandle) null, (InstructionHandle) null);
      String string0 = localVariableGen0.toString();
      assertEquals("LocalVariableGen(}, java.lang.StringBuffer, null, null)", string0);
      assertTrue(localVariableGen0.getLiveToEnd());
      assertEquals(0, localVariableGen0.getOrigIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalVariableGen localVariableGen0 = new LocalVariableGen(0, ", but {", (Type) null, (InstructionHandle) null, (InstructionHandle) null, (-224));
      localVariableGen0.getType();
      assertEquals((-224), localVariableGen0.getOrigIndex());
      assertEquals(0, localVariableGen0.getIndex());
      assertTrue(localVariableGen0.getLiveToEnd());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicType basicType0 = Type.INT;
      MONITOREXIT mONITOREXIT0 = (MONITOREXIT)InstructionConstants.MONITOREXIT;
      InstructionList instructionList0 = new InstructionList(mONITOREXIT0);
      InstructionHandle instructionHandle0 = instructionList0.append(instructionList0);
      LocalVariableGen localVariableGen0 = new LocalVariableGen(1946, "$", basicType0, instructionHandle0, (InstructionHandle) null);
      assertTrue(instructionHandle0.hasTargeters());
      
      instructionHandle0.removeTargeter(localVariableGen0);
      localVariableGen0.getStart();
      assertEquals(1946, localVariableGen0.getOrigIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RET rET0 = new RET(0);
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = rET0.getType(constantPoolGen0);
      InstructionList instructionList0 = new InstructionList(rET0);
      instructionList0.getByteCode();
      InstructionHandle instructionHandle0 = instructionList0.getStart();
      LocalVariableGen localVariableGen0 = new LocalVariableGen(306, "Code", type0, instructionHandle0, instructionHandle0);
      localVariableGen0.getStart();
      assertEquals(306, localVariableGen0.getOrigIndex());
      assertEquals(306, localVariableGen0.getIndex());
      assertFalse(localVariableGen0.getLiveToEnd());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicType basicType0 = Type.BOOLEAN;
      MONITOREXIT mONITOREXIT0 = (MONITOREXIT)InstructionConstants.MONITOREXIT;
      InstructionList instructionList0 = new InstructionList(mONITOREXIT0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, "$");
      InstructionHandle instructionHandle0 = instructionList0.insert((CompoundInstruction) pUSH0);
      instructionHandle0.updatePosition(950, 950);
      LocalVariableGen localVariableGen0 = new LocalVariableGen(1946, "$", basicType0, instructionHandle0, (InstructionHandle) null);
      localVariableGen0.getStart();
      assertTrue(instructionHandle0.hasTargeters());
      assertTrue(localVariableGen0.getLiveToEnd());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicType basicType0 = Type.VOID;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(0, "!", basicType0, (InstructionHandle) null, (InstructionHandle) null);
      int int0 = localVariableGen0.getOrigIndex();
      assertEquals(0, int0);
      assertTrue(localVariableGen0.getLiveToEnd());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicType basicType0 = Type.CHAR;
      String[] stringArray0 = new String[0];
      InstructionList instructionList0 = new InstructionList();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = new MethodGen((-3831), basicType0, basicType0.NO_ARGS, stringArray0, "    method.addExceptionHandler(ih_", "    method.addExceptionHandler(ih_", instructionList0, constantPoolGen0);
      LocalVariableGen localVariableGen0 = methodGen0.addLocalVariable("    method.addExceptionHandler(ih_", (Type) basicType0, 1036, (InstructionHandle) null, (InstructionHandle) null);
      int int0 = localVariableGen0.getOrigIndex();
      assertEquals(1036, int0);
      assertEquals(1036, localVariableGen0.getIndex());
      assertTrue(localVariableGen0.getLiveToEnd());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ReferenceType referenceType0 = Type.NULL;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(165, ")", referenceType0, (InstructionHandle) null, (InstructionHandle) null, 165);
      localVariableGen0.setName((String) null);
      localVariableGen0.getName();
      assertEquals(165, localVariableGen0.getIndex());
      assertEquals(165, localVariableGen0.getOrigIndex());
      assertTrue(localVariableGen0.getLiveToEnd());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicType basicType0 = Type.BOOLEAN;
      MONITOREXIT mONITOREXIT0 = (MONITOREXIT)InstructionConstants.MONITOREXIT;
      InstructionList instructionList0 = new InstructionList(mONITOREXIT0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, "$");
      InstructionHandle instructionHandle0 = instructionList0.insert((CompoundInstruction) pUSH0);
      LocalVariableGen localVariableGen0 = new LocalVariableGen(1946, "$", basicType0, instructionHandle0, (InstructionHandle) null);
      localVariableGen0.getName();
      assertTrue(instructionHandle0.hasTargeters());
      assertEquals(1946, localVariableGen0.getOrigIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicType basicType0 = Type.VOID;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(0, "}", basicType0, (InstructionHandle) null, (InstructionHandle) null, (-16));
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      LocalVariable localVariable0 = localVariableGen0.getLocalVariable(constantPoolGen0);
      assertTrue(localVariableGen0.getLiveToEnd());
      assertEquals(0, localVariable0.getLength());
      assertEquals(0, localVariable0.getStartPC());
      assertEquals(0, localVariable0.getIndex());
      assertEquals(1, localVariable0.getNameIndex());
      assertEquals((-16), localVariable0.getOrigIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicType basicType0 = Type.INT;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(0, "!", basicType0, (InstructionHandle) null, (InstructionHandle) null);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      LocalVariable localVariable0 = localVariableGen0.getLocalVariable(constantPoolGen0);
      assertEquals(0, localVariable0.getOrigIndex());
      assertEquals(0, localVariable0.getStartPC());
      assertEquals(0, localVariable0.getIndex());
      assertEquals(1, localVariable0.getNameIndex());
      assertEquals(0, localVariable0.getLength());
      assertTrue(localVariableGen0.getLiveToEnd());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicType basicType0 = Type.VOID;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(0, "!", basicType0, (InstructionHandle) null, (InstructionHandle) null);
      localVariableGen0.setIndex((-434));
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      localVariableGen0.getLocalVariable(constantPoolGen0);
      assertEquals((-434), localVariableGen0.getIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicType basicType0 = Type.VOID;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(0, "!", basicType0, (InstructionHandle) null, (InstructionHandle) null);
      localVariableGen0.setIndex((-434));
      int int0 = localVariableGen0.getIndex();
      assertEquals((-434), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicType basicType0 = Type.LONG;
      String[] stringArray0 = new String[0];
      InstructionList instructionList0 = new InstructionList();
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      MethodGen methodGen0 = new MethodGen((-3831), basicType0, basicType0.NO_ARGS, stringArray0, "org.apache.bcel.generic.BIPUSH", "org.apache.bcel.generic.BIPUSH", instructionList0, constantPoolGen0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, 35.479F);
      LDIV lDIV0 = (LDIV)InstructionConstants.LDIV;
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(lDIV0);
      InstructionHandle instructionHandle1 = instructionList0.insert((CompoundInstruction) pUSH0);
      LocalVariableGen localVariableGen0 = methodGen0.addLocalVariable("org.apache.bcel.generic.BIPUSH", (Type) basicType0, 1002, (InstructionHandle) null, instructionHandle1);
      // Undeclared exception!
      try { 
        localVariableGen0.updateTarget(instructionHandle0, instructionHandle0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not targeting   -1: ldiv[109](1), but {null,   -1: ldc[18](2) 1}
         //
         verifyException("org.apache.bcel.generic.LocalVariableGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicType basicType0 = Type.BOOLEAN;
      LDIV lDIV0 = (LDIV)InstructionConstants.LDIV;
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(lDIV0);
      LocalVariableGen localVariableGen0 = new LocalVariableGen(1036, "    method.addExceptionHandler(ih_", basicType0, instructionHandle0, instructionHandle0, (-3831));
      String string0 = localVariableGen0.toString();
      assertFalse(localVariableGen0.getLiveToEnd());
      assertEquals("LocalVariableGen(    method.addExceptionHandler(ih_, boolean,   -1: ldiv[109](1),   -1: ldiv[109](1))", string0);
      assertEquals(1036, localVariableGen0.getIndex());
      assertEquals((-3831), localVariableGen0.getOrigIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FDIV fDIV0 = new FDIV();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(fDIV0);
      LocalVariableGen localVariableGen0 = null;
      try {
        localVariableGen0 = new LocalVariableGen(1, ", ", (Type) null, instructionHandle0, instructionHandle0, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.LocalVariableGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, 1);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      DREM dREM0 = (DREM)InstructionConstants.DREM;
      InstructionHandle instructionHandle0 = instructionList0.append((Instruction) dREM0);
      LocalVariableGen localVariableGen0 = null;
      try {
        localVariableGen0 = new LocalVariableGen(1, "gm;x@oY_zLjX9Cw3C", (Type) null, instructionHandle0, instructionHandle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.LocalVariableGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicType basicType0 = Type.VOID;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(0, "!", basicType0, (InstructionHandle) null, (InstructionHandle) null);
      LocalVariableGen localVariableGen1 = (LocalVariableGen)localVariableGen0.clone();
      localVariableGen1.setIndex((-3399));
      boolean boolean0 = localVariableGen0.equals(localVariableGen1);
      assertEquals((-3399), localVariableGen1.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicType basicType0 = Type.INT;
      MONITOREXIT mONITOREXIT0 = (MONITOREXIT)InstructionConstants.MONITOREXIT;
      InstructionList instructionList0 = new InstructionList(mONITOREXIT0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      InstructionHandle instructionHandle0 = instructionList0.getStart();
      LocalVariableGen localVariableGen0 = new LocalVariableGen(950, "$", basicType0, instructionHandle0, instructionHandle0, 950);
      assertFalse(localVariableGen0.getLiveToEnd());
      
      localVariableGen0.setLiveToEnd(true);
      localVariableGen0.getLocalVariable(constantPoolGen0);
      assertTrue(localVariableGen0.getLiveToEnd());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ARETURN aRETURN0 = new ARETURN();
      Type type0 = aRETURN0.getType();
      LocalVariableGen localVariableGen0 = new LocalVariableGen(1, "r}E*V:$v~?-FP cxh", type0, (InstructionHandle) null, (InstructionHandle) null, (-3264));
      // Undeclared exception!
      try { 
        localVariableGen0.getLocalVariable((ConstantPoolGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.LocalVariableGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DUP dUP0 = new DUP();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = dUP0.getType(constantPoolGen0);
      LocalVariableGen localVariableGen0 = null;
      try {
        localVariableGen0 = new LocalVariableGen((-1), "gNT\"-K42HO", type0, (InstructionHandle) null, (InstructionHandle) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid index index: -1
         //
         verifyException("org.apache.bcel.generic.LocalVariableGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ARETURN aRETURN0 = new ARETURN();
      Type type0 = aRETURN0.getType();
      LocalVariableGen localVariableGen0 = new LocalVariableGen(1, "r}E*V:$v~?-FP cxh", type0, (InstructionHandle) null, (InstructionHandle) null, (-3264));
      int int0 = localVariableGen0.getOrigIndex();
      assertEquals(1, localVariableGen0.getIndex());
      assertTrue(localVariableGen0.getLiveToEnd());
      assertEquals((-3264), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ReferenceType referenceType0 = Type.NULL;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(154, "'O}{p", referenceType0, (InstructionHandle) null, (InstructionHandle) null, 154);
      localVariableGen0.getEnd();
      assertTrue(localVariableGen0.getLiveToEnd());
      assertEquals(154, localVariableGen0.getIndex());
      assertEquals(154, localVariableGen0.getOrigIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicType basicType0 = Type.INT;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(0, "!", basicType0, (InstructionHandle) null, (InstructionHandle) null);
      localVariableGen0.setEnd((InstructionHandle) null);
      assertEquals(0, localVariableGen0.getOrigIndex());
      assertTrue(localVariableGen0.getLiveToEnd());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ReferenceType referenceType0 = Type.NULL;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(154, "'O}{p", referenceType0, (InstructionHandle) null, (InstructionHandle) null, 154);
      localVariableGen0.getStart();
      assertTrue(localVariableGen0.getLiveToEnd());
      assertEquals(154, localVariableGen0.getIndex());
      assertEquals(154, localVariableGen0.getOrigIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ReferenceType referenceType0 = Type.NULL;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(154, "'O}{p", referenceType0, (InstructionHandle) null, (InstructionHandle) null, 154);
      localVariableGen0.hashCode();
      assertEquals(154, localVariableGen0.getIndex());
      assertEquals(154, localVariableGen0.getOrigIndex());
      assertTrue(localVariableGen0.getLiveToEnd());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ReferenceType referenceType0 = Type.NULL;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(154, "'O}{p", referenceType0, (InstructionHandle) null, (InstructionHandle) null, 154);
      localVariableGen0.setStart((InstructionHandle) null);
      assertEquals(154, localVariableGen0.getIndex());
      assertEquals(154, localVariableGen0.getOrigIndex());
      assertTrue(localVariableGen0.getLiveToEnd());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LCONST lCONST0 = new LCONST();
      BasicType basicType0 = Type.VOID;
      InstructionList instructionList0 = new InstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((Instruction) lCONST0);
      LocalVariableGen localVariableGen0 = new LocalVariableGen(3118, "", basicType0, instructionHandle0, instructionHandle0, 3118);
      LocalVariableGen localVariableGen1 = new LocalVariableGen(3118, "", basicType0, instructionHandle0, instructionHandle0, 3118);
      assertEquals(3118, localVariableGen1.getIndex());
      assertEquals(3118, localVariableGen1.getOrigIndex());
      assertFalse(localVariableGen1.getLiveToEnd());
      assertTrue(localVariableGen1.equals((Object)localVariableGen0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BasicType basicType0 = Type.INT;
      MONITOREXIT mONITOREXIT0 = (MONITOREXIT)InstructionConstants.MONITOREXIT;
      InstructionList instructionList0 = new InstructionList(mONITOREXIT0);
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList0);
      LocalVariableGen localVariableGen0 = new LocalVariableGen(950, "$", basicType0, instructionHandle0, (InstructionHandle) null);
      Object object0 = localVariableGen0.clone();
      assertTrue(instructionHandle0.hasTargeters());
      
      localVariableGen0.dispose();
      boolean boolean0 = localVariableGen0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BasicType basicType0 = Type.VOID;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(0, "!", basicType0, (InstructionHandle) null, (InstructionHandle) null);
      boolean boolean0 = localVariableGen0.equals(localVariableGen0);
      assertTrue(localVariableGen0.getLiveToEnd());
      assertTrue(boolean0);
      assertEquals(0, localVariableGen0.getOrigIndex());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BasicType basicType0 = Type.VOID;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(0, "!", basicType0, (InstructionHandle) null, (InstructionHandle) null);
      boolean boolean0 = localVariableGen0.equals(basicType0);
      assertFalse(boolean0);
      assertEquals(0, localVariableGen0.getOrigIndex());
      assertTrue(localVariableGen0.getLiveToEnd());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BasicType basicType0 = Type.BOOLEAN;
      String[] stringArray0 = new String[0];
      InstructionList instructionList0 = new InstructionList();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = new MethodGen((-3840), basicType0, basicType0.NO_ARGS, stringArray0, "    method.addExceptionHandler(ih_", "    method.addExceptionHandler(ih_", instructionList0, constantPoolGen0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, (-3840));
      LDIV lDIV0 = new LDIV();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(lDIV0);
      InstructionHandle instructionHandle1 = instructionList0.insert((CompoundInstruction) pUSH0);
      LocalVariableGen localVariableGen0 = methodGen0.addLocalVariable("    method.addExceptionHandler(ih_", (Type) basicType0, 1026, instructionHandle0, instructionHandle1);
      boolean boolean0 = localVariableGen0.containsTarget(instructionHandle1);
      assertTrue(instructionHandle1.hasTargeters());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BasicType basicType0 = Type.VOID;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(0, "!", basicType0, (InstructionHandle) null, (InstructionHandle) null);
      boolean boolean0 = localVariableGen0.containsTarget((InstructionHandle) null);
      assertTrue(localVariableGen0.getLiveToEnd());
      assertTrue(boolean0);
      assertEquals(0, localVariableGen0.getOrigIndex());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RET rET0 = new RET(0);
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = rET0.getType(constantPoolGen0);
      InstructionList instructionList0 = new InstructionList(rET0);
      InstructionHandle instructionHandle0 = instructionList0.getStart();
      LocalVariableGen localVariableGen0 = new LocalVariableGen(306, "Code", type0, instructionHandle0, instructionHandle0);
      localVariableGen0.updateTarget(instructionHandle0, instructionHandle0);
      assertEquals(306, localVariableGen0.getIndex());
      assertEquals(306, localVariableGen0.getOrigIndex());
      assertFalse(localVariableGen0.getLiveToEnd());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BasicType basicType0 = Type.LONG;
      String[] stringArray0 = new String[0];
      InstructionList instructionList0 = new InstructionList();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = new MethodGen((-3831), basicType0, basicType0.NO_ARGS, stringArray0, "    method.addExceptionHandler(ih_", "    method.addExceptionHandler(ih_", instructionList0, constantPoolGen0);
      LDIV lDIV0 = new LDIV();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(lDIV0);
      LocalVariableGen localVariableGen0 = methodGen0.addLocalVariable("    method.addExceptionHandler(ih_", (Type) basicType0, 1002, (InstructionHandle) null, (InstructionHandle) null);
      // Undeclared exception!
      try { 
        localVariableGen0.updateTarget(instructionHandle0, instructionHandle0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not targeting   -1: ldiv[109](1), but {null, null}
         //
         verifyException("org.apache.bcel.generic.LocalVariableGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BasicType basicType0 = Type.BOOLEAN;
      String[] stringArray0 = new String[0];
      InstructionList instructionList0 = new InstructionList();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = new MethodGen((-3840), basicType0, basicType0.NO_ARGS, stringArray0, "    method.addExceptionHandler(ih_", "    method.addExceptionHandler(ih_", instructionList0, constantPoolGen0);
      LDIV lDIV0 = new LDIV();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(lDIV0);
      InstructionHandle instructionHandle1 = instructionList0.insert(instructionHandle0, (Instruction) lDIV0);
      LocalVariableGen localVariableGen0 = methodGen0.addLocalVariable("    method.addExceptionHandler(ih_", (Type) basicType0, 1026, instructionHandle1, instructionHandle1);
      LocalVariable localVariable0 = localVariableGen0.getLocalVariable(constantPoolGen0);
      assertEquals(0, localVariable0.getLength());
      assertEquals((-1), localVariable0.getStartPC());
      assertEquals(1, localVariable0.getNameIndex());
      assertEquals(1026, localVariable0.getOrigIndex());
      assertFalse(localVariableGen0.getLiveToEnd());
      assertEquals(1026, localVariable0.getIndex());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BasicType basicType0 = Type.INT;
      MONITOREXIT mONITOREXIT0 = (MONITOREXIT)InstructionConstants.MONITOREXIT;
      InstructionList instructionList0 = new InstructionList(mONITOREXIT0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList0);
      LocalVariableGen localVariableGen0 = new LocalVariableGen(950, "$", basicType0, instructionHandle0, (InstructionHandle) null);
      LocalVariable localVariable0 = localVariableGen0.getLocalVariable(constantPoolGen0);
      assertTrue(instructionHandle0.hasTargeters());
      assertEquals(0, localVariable0.getLength());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BasicType basicType0 = Type.BOOLEAN;
      String[] stringArray0 = new String[0];
      InstructionList instructionList0 = new InstructionList();
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      MethodGen methodGen0 = new MethodGen((-3851), basicType0, basicType0.NO_ARGS, stringArray0, "    method.addExceptionHandler(ih_", "    method.addExceptionHandler(ih_", instructionList0, constantPoolGen0);
      FSTORE fSTORE0 = new FSTORE();
      instructionList0.append((Instruction) fSTORE0);
      MethodGen methodGen1 = methodGen0.copy("z${<Y\"vc", constantPoolGen0);
      assertEquals(1, methodGen1.getMaxLocals());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ReturnaddressType returnaddressType0 = new ReturnaddressType((InstructionHandle) null);
      LocalVariableGen localVariableGen0 = null;
      try {
        localVariableGen0 = new LocalVariableGen(65553, "RhE)A(:s", returnaddressType0, (InstructionHandle) null, (InstructionHandle) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid index index: 65553
         //
         verifyException("org.apache.bcel.generic.LocalVariableGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BasicType basicType0 = Type.FLOAT;
      LocalVariableGen localVariableGen0 = null;
      try {
        localVariableGen0 = new LocalVariableGen((-431), "cE2D}ir+3?es", basicType0, (InstructionHandle) null, (InstructionHandle) null, (-431));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid index index: -431
         //
         verifyException("org.apache.bcel.generic.LocalVariableGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BasicType basicType0 = Type.CHAR;
      String[] stringArray0 = new String[0];
      InstructionList instructionList0 = new InstructionList();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = new MethodGen((-3831), basicType0, basicType0.NO_ARGS, stringArray0, "    method.addExceptionHandler(ih_", "    method.addExceptionHandler(ih_", instructionList0, constantPoolGen0);
      LocalVariableGen localVariableGen0 = methodGen0.addLocalVariable("    method.addExceptionHandler(ih_", (Type) basicType0, 1036, (InstructionHandle) null, (InstructionHandle) null);
      localVariableGen0.setType(basicType0);
      assertEquals(1036, localVariableGen0.getIndex());
      assertEquals(1036, localVariableGen0.getOrigIndex());
      assertTrue(localVariableGen0.getLiveToEnd());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BasicType basicType0 = Type.VOID;
      LocalVariableGen localVariableGen0 = new LocalVariableGen(0, "!", basicType0, (InstructionHandle) null, (InstructionHandle) null);
      localVariableGen0.getType();
      assertTrue(localVariableGen0.getLiveToEnd());
      assertEquals(0, localVariableGen0.getOrigIndex());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ArrayType arrayType0 = new ArrayType("", 180);
      LocalVariableGen localVariableGen0 = new LocalVariableGen(180, "", arrayType0, (InstructionHandle) null, (InstructionHandle) null);
      boolean boolean0 = localVariableGen0.getLiveToEnd();
      assertTrue(boolean0);
      assertEquals(180, localVariableGen0.getIndex());
      assertEquals(180, localVariableGen0.getOrigIndex());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LCONST lCONST0 = new LCONST();
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = lCONST0.getType(constantPoolGen0);
      FCONST fCONST0 = new FCONST();
      Number number0 = fCONST0.getValue();
      PUSH pUSH0 = new PUSH(constantPoolGen0, number0);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((Instruction) lCONST0);
      LocalVariableGen localVariableGen0 = new LocalVariableGen(3118, "", type0, instructionHandle0, instructionHandle0);
      // Undeclared exception!
      try { 
        localVariableGen0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LCONST lCONST0 = new LCONST();
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = lCONST0.getType(constantPoolGen0);
      FCONST fCONST0 = new FCONST();
      Number number0 = fCONST0.getValue();
      PUSH pUSH0 = new PUSH(constantPoolGen0, number0);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((Instruction) lCONST0);
      LocalVariableGen localVariableGen0 = new LocalVariableGen(3118, "", type0, instructionHandle0, instructionHandle0);
      localVariableGen0.getName();
      assertEquals(3118, localVariableGen0.getOrigIndex());
      assertEquals(3118, localVariableGen0.getIndex());
      assertFalse(localVariableGen0.getLiveToEnd());
  }
}
