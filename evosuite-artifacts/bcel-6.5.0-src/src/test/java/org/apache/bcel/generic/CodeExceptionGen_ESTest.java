/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:21:32 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.CodeException;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.ATHROW;
import org.apache.bcel.generic.BranchHandle;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.CodeExceptionGen;
import org.apache.bcel.generic.CompoundInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.ICONST;
import org.apache.bcel.generic.IF_ICMPGT;
import org.apache.bcel.generic.IF_ICMPLT;
import org.apache.bcel.generic.IfInstruction;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.JSR_W;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodeExceptionGen_ESTest extends CodeExceptionGen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ASTORE aSTORE0 = new ASTORE();
      InstructionList instructionList0 = new InstructionList(aSTORE0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, 0L);
      InstructionHandle instructionHandle0 = instructionList0.insert((Instruction) aSTORE0, (CompoundInstruction) pUSH0);
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, instructionHandle0, instructionHandle0, (ObjectType) null);
      instructionHandle0.removeTargeter(codeExceptionGen0);
      InstructionHandle instructionHandle1 = codeExceptionGen0.getStartPC();
      assertFalse(instructionHandle1.hasTargeters());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, false);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      IF_ICMPLT iF_ICMPLT0 = new IF_ICMPLT();
      IfInstruction ifInstruction0 = iF_ICMPLT0.negate();
      InstructionList instructionList1 = new InstructionList((BranchInstruction) ifInstruction0);
      InstructionHandle instructionHandle1 = instructionList0.insert(instructionHandle0, instructionList1);
      ObjectType objectType0 = Type.STRING;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, instructionHandle0, instructionHandle0, objectType0);
      codeExceptionGen0.updateTarget(instructionHandle0, instructionHandle1);
      codeExceptionGen0.getStartPC();
      assertFalse(instructionHandle0.hasTargeters());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, 0);
      InstructionList instructionList0 = new InstructionList(pUSH0);
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      ObjectType objectType0 = Type.OBJECT;
      instructionList0.getByteCode();
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, instructionHandle0, instructionHandle0, objectType0);
      InstructionHandle instructionHandle1 = codeExceptionGen0.getStartPC();
      assertEquals(1, instructionHandle1.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectType objectType0 = Type.CLASS;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen((InstructionHandle) null, (InstructionHandle) null, (InstructionHandle) null, objectType0);
      InstructionHandle instructionHandle0 = codeExceptionGen0.getHandlerPC();
      assertNull(instructionHandle0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, false);
      InstructionList instructionList0 = new InstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      IF_ICMPLT iF_ICMPLT0 = new IF_ICMPLT();
      BranchHandle branchHandle0 = instructionList0.append(instructionHandle0, (BranchInstruction) iF_ICMPLT0);
      ObjectType objectType0 = Type.CLASS;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, instructionHandle0, instructionHandle0, objectType0);
      codeExceptionGen0.setStartPC(branchHandle0);
      InstructionHandle instructionHandle1 = codeExceptionGen0.getHandlerPC();
      assertEquals((-1), instructionHandle1.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, false);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      IF_ICMPLT iF_ICMPLT0 = new IF_ICMPLT();
      IfInstruction ifInstruction0 = iF_ICMPLT0.negate();
      InstructionList instructionList1 = new InstructionList((BranchInstruction) ifInstruction0);
      InstructionHandle instructionHandle1 = instructionList0.insert(instructionHandle0, instructionList1);
      ObjectType objectType0 = Type.STRING;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle1, instructionHandle1, instructionHandle0, objectType0);
      assertTrue(instructionHandle0.hasTargeters());
      
      codeExceptionGen0.updateTarget(instructionHandle0, instructionHandle1);
      codeExceptionGen0.getHandlerPC();
      assertFalse(instructionHandle0.hasTargeters());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, false);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      instructionHandle0.updatePosition(225, 2504);
      ObjectType objectType0 = Type.STRING;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, instructionHandle0, instructionHandle0, objectType0);
      InstructionHandle instructionHandle1 = codeExceptionGen0.getHandlerPC();
      assertTrue(instructionHandle1.hasTargeters());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen((InstructionHandle) null, (InstructionHandle) null, (InstructionHandle) null, objectType0);
      InstructionHandle instructionHandle0 = codeExceptionGen0.getEndPC();
      assertNull(instructionHandle0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, false);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      InstructionHandle instructionHandle1 = instructionList0.insert(instructionHandle0, instructionList0);
      ObjectType objectType0 = Type.STRING;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, instructionHandle0, instructionHandle0, objectType0);
      codeExceptionGen0.setStartPC(instructionHandle1);
      InstructionHandle instructionHandle2 = codeExceptionGen0.getEndPC();
      assertFalse(instructionHandle2.equals((Object)instructionHandle1));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, false);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      IF_ICMPLT iF_ICMPLT0 = new IF_ICMPLT();
      IfInstruction ifInstruction0 = iF_ICMPLT0.negate();
      InstructionList instructionList1 = new InstructionList((BranchInstruction) ifInstruction0);
      InstructionHandle instructionHandle1 = instructionList0.insert(instructionHandle0, instructionList1);
      ObjectType objectType0 = Type.STRING;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle1, instructionHandle1, instructionHandle0, objectType0);
      codeExceptionGen0.getEndPC();
      assertTrue(instructionHandle0.hasTargeters());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, false);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      instructionHandle0.updatePosition(225, 2504);
      ObjectType objectType0 = Type.STRING;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, instructionHandle0, instructionHandle0, objectType0);
      InstructionHandle instructionHandle1 = codeExceptionGen0.getEndPC();
      assertEquals(224, instructionHandle1.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ASTORE aSTORE0 = new ASTORE();
      InstructionList instructionList0 = new InstructionList(aSTORE0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      InstructionHandle instructionHandle0 = instructionList0.getEnd();
      instructionHandle0.setPosition(1);
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, instructionHandle0, instructionHandle0, (ObjectType) null);
      CodeException codeException0 = codeExceptionGen0.getCodeException(constantPoolGen0);
      assertEquals(2, codeException0.getEndPC());
      assertEquals(0, codeException0.getCatchType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, 30);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.getEnd();
      IF_ICMPGT iF_ICMPGT0 = new IF_ICMPGT();
      BranchHandle branchHandle0 = instructionList0.insert(instructionHandle0, (BranchInstruction) iF_ICMPGT0);
      ObjectType objectType0 = Type.STRING;
      iF_ICMPGT0.updatePosition((-2391), (-2391));
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(branchHandle0, branchHandle0, branchHandle0, objectType0);
      CodeException codeException0 = codeExceptionGen0.getCodeException(constantPoolGen0);
      assertEquals((-2390), codeException0.getEndPC());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, 30);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.getEnd();
      IF_ICMPGT iF_ICMPGT0 = new IF_ICMPGT();
      BranchHandle branchHandle0 = instructionList0.insert(instructionHandle0, (BranchInstruction) iF_ICMPGT0);
      ObjectType objectType0 = Type.STRING;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(branchHandle0, branchHandle0, branchHandle0, objectType0);
      CodeException codeException0 = codeExceptionGen0.getCodeException(constantPoolGen0);
      assertEquals(1, codeException0.getEndPC());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, 30);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.getEnd();
      IF_ICMPGT iF_ICMPGT0 = new IF_ICMPGT();
      BranchHandle branchHandle0 = instructionList0.insert(instructionHandle0, (BranchInstruction) iF_ICMPGT0);
      ObjectType objectType0 = Type.STRING;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(branchHandle0, branchHandle0, branchHandle0, objectType0);
      ObjectType objectType1 = codeExceptionGen0.getCatchType();
      assertEquals(1, objectType1.getSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, false);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      InstructionHandle instructionHandle1 = instructionList0.insert(instructionHandle0, instructionList0);
      ObjectType objectType0 = Type.STRING;
      instructionList0.delete(instructionHandle1);
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, instructionHandle0, instructionHandle0, objectType0);
      // Undeclared exception!
      try { 
        codeExceptionGen0.updateTarget(instructionHandle1, instructionHandle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.InstructionHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, false);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      IF_ICMPLT iF_ICMPLT0 = new IF_ICMPLT();
      InstructionHandle instructionHandle1 = instructionList0.insert(instructionHandle0, instructionList0);
      BranchHandle branchHandle0 = instructionList0.append(instructionHandle1, (BranchInstruction) iF_ICMPLT0);
      ObjectType objectType0 = Type.STRING;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(branchHandle0, branchHandle0, instructionHandle0, objectType0);
      // Undeclared exception!
      try { 
        codeExceptionGen0.updateTarget(instructionHandle1, instructionHandle1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ICONST iCONST0 = (ICONST)InstructionConstants.ICONST_2;
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(iCONST0);
      instructionHandle0.dispose();
      ObjectType objectType0 = Type.STRING;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, instructionHandle0, instructionHandle0, objectType0);
      // Undeclared exception!
      try { 
        codeExceptionGen0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.InstructionHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ATHROW aTHROW0 = (ATHROW)InstructionConstants.ATHROW;
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(aTHROW0);
      ObjectType objectType0 = Type.STRING;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, instructionHandle0, instructionHandle0, objectType0);
      String string0 = codeExceptionGen0.toString();
      assertEquals("CodeExceptionGen(  -1: athrow[191](1),   -1: athrow[191](1),   -1: athrow[191](1))", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen((InstructionHandle) null, (InstructionHandle) null, (InstructionHandle) null, (ObjectType) null);
      codeExceptionGen0.setEndPC((InstructionHandle) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, 30);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.getEnd();
      IF_ICMPGT iF_ICMPGT0 = new IF_ICMPGT();
      BranchHandle branchHandle0 = instructionList0.insert(instructionHandle0, (BranchInstruction) iF_ICMPGT0);
      ObjectType objectType0 = Type.STRING;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(branchHandle0, branchHandle0, branchHandle0, objectType0);
      codeExceptionGen0.setHandlerPC(instructionHandle0);
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, false);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      InstructionHandle instructionHandle1 = instructionList0.insert(instructionHandle0, instructionList0);
      ObjectType objectType0 = Type.STRING;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, instructionHandle0, instructionHandle0, objectType0);
      boolean boolean0 = codeExceptionGen0.containsTarget(instructionHandle1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ASTORE aSTORE0 = (ASTORE)InstructionConstants.ASTORE_1;
      InstructionHandle instructionHandle0 = new InstructionHandle(aSTORE0);
      JSR_W jSR_W0 = new JSR_W(instructionHandle0);
      InstructionList instructionList0 = new InstructionList((BranchInstruction) jSR_W0);
      BranchHandle branchHandle0 = instructionList0.append(instructionHandle0, (BranchInstruction) jSR_W0);
      ObjectType objectType0 = Type.OBJECT;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, branchHandle0, instructionHandle0, objectType0);
      codeExceptionGen0.setStartPC((InstructionHandle) null);
      boolean boolean0 = codeExceptionGen0.containsTarget(instructionHandle0);
      assertTrue(branchHandle0.hasTargeters());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ASTORE aSTORE0 = (ASTORE)InstructionConstants.ASTORE_1;
      InstructionHandle instructionHandle0 = new InstructionHandle(aSTORE0);
      JSR_W jSR_W0 = new JSR_W(instructionHandle0);
      InstructionList instructionList0 = new InstructionList((BranchInstruction) jSR_W0);
      BranchHandle branchHandle0 = instructionList0.append(instructionHandle0, (BranchInstruction) jSR_W0);
      ObjectType objectType0 = Type.OBJECT;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, branchHandle0, instructionHandle0, objectType0);
      boolean boolean0 = codeExceptionGen0.containsTarget(branchHandle0);
      assertTrue(branchHandle0.hasTargeters());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, false);
      InstructionList instructionList0 = new InstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      IF_ICMPLT iF_ICMPLT0 = new IF_ICMPLT();
      BranchHandle branchHandle0 = instructionList0.append(instructionHandle0, (BranchInstruction) iF_ICMPLT0);
      ObjectType objectType0 = Type.CLASS;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, instructionHandle0, instructionHandle0, objectType0);
      codeExceptionGen0.setStartPC(branchHandle0);
      boolean boolean0 = codeExceptionGen0.containsTarget(branchHandle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, false);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      InstructionHandle instructionHandle1 = instructionList0.insert(instructionHandle0, instructionList0);
      ObjectType objectType0 = Type.STRING;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, instructionHandle0, instructionHandle0, objectType0);
      // Undeclared exception!
      try { 
        codeExceptionGen0.updateTarget(instructionHandle1, instructionHandle1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not targeting   -1: iconst_0[3](1), but {  -1: iconst_0[3](1),   -1: iconst_0[3](1),   -1: iconst_0[3](1)}
         //
         verifyException("org.apache.bcel.generic.CodeExceptionGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ASTORE aSTORE0 = new ASTORE();
      InstructionList instructionList0 = new InstructionList(aSTORE0);
      InstructionHandle instructionHandle0 = instructionList0.getStart();
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, instructionHandle0, instructionHandle0, (ObjectType) null);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      CodeException codeException0 = codeExceptionGen0.getCodeException(constantPoolGen0);
      assertEquals(0, codeException0.getCatchType());
      assertEquals(0, codeException0.getEndPC());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ASTORE aSTORE0 = new ASTORE();
      InstructionHandle instructionHandle0 = new InstructionHandle(aSTORE0);
      JSR_W jSR_W0 = new JSR_W();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) jSR_W0);
      BranchHandle branchHandle0 = instructionList0.append(instructionHandle0, (BranchInstruction) jSR_W0);
      ObjectType objectType0 = Type.CLASS;
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen(instructionHandle0, branchHandle0, instructionHandle0, objectType0);
      // Undeclared exception!
      try { 
        codeExceptionGen0.getCodeException((ConstantPoolGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.CodeExceptionGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen((InstructionHandle) null, (InstructionHandle) null, (InstructionHandle) null, (ObjectType) null);
      String string0 = codeExceptionGen0.toString();
      assertEquals("CodeExceptionGen(null, null, null)", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen((InstructionHandle) null, (InstructionHandle) null, (InstructionHandle) null, (ObjectType) null);
      Object object0 = codeExceptionGen0.clone();
      assertFalse(object0.equals((Object)codeExceptionGen0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen((InstructionHandle) null, (InstructionHandle) null, (InstructionHandle) null, (ObjectType) null);
      InstructionHandle instructionHandle0 = codeExceptionGen0.getStartPC();
      assertNull(instructionHandle0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen((InstructionHandle) null, (InstructionHandle) null, (InstructionHandle) null, (ObjectType) null);
      codeExceptionGen0.setCatchType((ObjectType) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CodeExceptionGen codeExceptionGen0 = new CodeExceptionGen((InstructionHandle) null, (InstructionHandle) null, (InstructionHandle) null, (ObjectType) null);
      ObjectType objectType0 = codeExceptionGen0.getCatchType();
      assertNull(objectType0);
  }
}
