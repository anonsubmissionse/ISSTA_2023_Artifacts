/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:14:32 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.generic.ARRAYLENGTH;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.BranchHandle;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.CALOAD;
import org.apache.bcel.generic.CompoundInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.D2I;
import org.apache.bcel.generic.DUP2;
import org.apache.bcel.generic.FADD;
import org.apache.bcel.generic.FASTORE;
import org.apache.bcel.generic.FMUL;
import org.apache.bcel.generic.GOTO;
import org.apache.bcel.generic.GOTO_W;
import org.apache.bcel.generic.I2F;
import org.apache.bcel.generic.I2S;
import org.apache.bcel.generic.IASTORE;
import org.apache.bcel.generic.IFEQ;
import org.apache.bcel.generic.IFGE;
import org.apache.bcel.generic.IFGT;
import org.apache.bcel.generic.IFLT;
import org.apache.bcel.generic.IF_ACMPEQ;
import org.apache.bcel.generic.IF_ACMPNE;
import org.apache.bcel.generic.IF_ICMPEQ;
import org.apache.bcel.generic.IF_ICMPGE;
import org.apache.bcel.generic.IF_ICMPLT;
import org.apache.bcel.generic.IF_ICMPNE;
import org.apache.bcel.generic.ILOAD;
import org.apache.bcel.generic.INEG;
import org.apache.bcel.generic.INVOKEVIRTUAL;
import org.apache.bcel.generic.IREM;
import org.apache.bcel.generic.IfInstruction;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.JSR;
import org.apache.bcel.generic.L2F;
import org.apache.bcel.generic.LOOKUPSWITCH;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.SWITCH;
import org.apache.bcel.generic.TABLESWITCH;
import org.apache.bcel.generic.Visitor;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InstructionHandle_ESTest extends InstructionHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.getEnd();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instructionHandle0.accept(instConstraintVisitor0);
      assertEquals(18, instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FMUL fMUL0 = new FMUL();
      InstructionList instructionList0 = new InstructionList(fMUL0);
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) lOOKUPSWITCH0);
      int int0 = branchHandle0.updatePosition((-705), (-705));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      L2F l2F0 = (L2F)InstructionConstants.L2F;
      InstructionHandle instructionHandle0 = new InstructionHandle(l2F0);
      instructionHandle0.dispose();
      Instruction instruction0 = instructionHandle0.swapInstruction(l2F0);
      assertNull(instruction0);
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.getEnd();
      GOTO_W gOTO_W0 = new GOTO_W(instructionHandle0);
      instructionHandle0.swapInstruction(gOTO_W0);
      assertEquals(3, instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      INVOKEVIRTUAL iNVOKEVIRTUAL0 = new INVOKEVIRTUAL();
      InstructionHandle instructionHandle0 = new InstructionHandle(iNVOKEVIRTUAL0);
      instructionHandle0.swapInstruction(iNVOKEVIRTUAL0);
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, (-1.29806687666841));
      InstructionList instructionList0 = pUSH0.getInstructionList();
      FASTORE fASTORE0 = new FASTORE();
      fASTORE0.setLength(0);
      InstructionHandle instructionHandle0 = instructionList0.insert((Instruction) fASTORE0);
      instructionHandle0.swapInstruction(fASTORE0);
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ARRAYLENGTH aRRAYLENGTH0 = new ARRAYLENGTH();
      InstructionList instructionList0 = new InstructionList(aRRAYLENGTH0);
      InstructionHandle instructionHandle0 = instructionList0.append((Instruction) aRRAYLENGTH0, (Instruction) aRRAYLENGTH0);
      instructionHandle0.setPrev((InstructionHandle) null);
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      INEG iNEG0 = (INEG)InstructionConstants.INEG;
      InstructionList instructionList0 = new InstructionList(iNEG0);
      Boolean boolean0 = new Boolean(";~b{I");
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, boolean0);
      InstructionHandle instructionHandle0 = instructionList0.insert((CompoundInstruction) pUSH0);
      IF_ICMPNE iF_ICMPNE0 = new IF_ICMPNE();
      BranchHandle branchHandle0 = BranchHandle.getBranchHandle(iF_ICMPNE0);
      instructionHandle0.setPrev(branchHandle0);
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      GOTO_W gOTO_W0 = new GOTO_W();
      BranchHandle branchHandle0 = instructionList0.append((BranchInstruction) gOTO_W0);
      IFGT iFGT0 = new IFGT(branchHandle0);
      BranchHandle branchHandle1 = instructionList0.insert((BranchInstruction) iFGT0);
      instructionList0.setPositions();
      InstructionHandle instructionHandle0 = branchHandle1.setPrev(branchHandle0);
      assertTrue(instructionHandle0.hasTargeters());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IFEQ iFEQ0 = new IFEQ();
      IfInstruction ifInstruction0 = iFEQ0.negate();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) ifInstruction0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, 0L);
      InstructionHandle instructionHandle0 = instructionList0.insert((Instruction) ifInstruction0, (CompoundInstruction) pUSH0);
      InstructionHandle instructionHandle1 = instructionHandle0.setPrev(instructionHandle0);
      assertEquals((-1), instructionHandle1.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, true);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList0);
      InstructionHandle instructionHandle1 = instructionHandle0.setNext((InstructionHandle) null);
      assertEquals((-1), instructionHandle0.getPosition());
      assertNull(instructionHandle1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.getEnd();
      GOTO_W gOTO_W0 = new GOTO_W(instructionHandle0);
      InstructionHandle instructionHandle1 = instructionHandle0.setNext(instructionHandle0);
      assertEquals(18, instructionHandle1.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IFLT iFLT0 = new IFLT();
      IfInstruction ifInstruction0 = iFLT0.negate();
      BranchHandle branchHandle0 = BranchHandle.getBranchHandle(ifInstruction0);
      InstructionHandle instructionHandle0 = branchHandle0.setNext(branchHandle0);
      assertSame(instructionHandle0, branchHandle0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      I2S i2S0 = new I2S();
      InstructionList instructionList0 = new InstructionList(i2S0);
      InstructionHandle instructionHandle0 = instructionList0.insert((Instruction) i2S0);
      InstructionHandle instructionHandle1 = instructionHandle0.setNext(instructionHandle0);
      assertEquals((-1), instructionHandle1.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ASTORE aSTORE0 = new ASTORE(199);
      InstructionHandle instructionHandle0 = new InstructionHandle(aSTORE0);
      instructionHandle0.getPrev();
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      I2F i2F0 = new I2F();
      InstructionHandle instructionHandle0 = new InstructionHandle(i2F0);
      GOTO gOTO0 = new GOTO(instructionHandle0);
      InstructionList instructionList0 = new InstructionList((BranchInstruction) gOTO0);
      InstructionHandle instructionHandle1 = instructionList0.append(instructionHandle0, instructionList0);
      InstructionHandle instructionHandle2 = instructionHandle1.getPrev();
      assertEquals((-1), instructionHandle2.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ARRAYLENGTH aRRAYLENGTH0 = new ARRAYLENGTH();
      InstructionList instructionList0 = new InstructionList(aRRAYLENGTH0);
      InstructionHandle instructionHandle0 = instructionList0.append((Instruction) aRRAYLENGTH0, (Instruction) aRRAYLENGTH0);
      InstructionHandle instructionHandle1 = instructionList0.getStart();
      instructionHandle1.setPosition(0);
      assertEquals(0, instructionHandle1.getPosition());
      
      instructionHandle0.getPrev();
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      Character character0 = new Character('S');
      PUSH pUSH0 = new PUSH(constantPoolGen0, character0);
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      InstructionHandle instructionHandle1 = instructionHandle0.getPrev();
      assertEquals(2, instructionHandle1.getPosition());
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IF_ICMPLT iF_ICMPLT0 = new IF_ICMPLT();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) iF_ICMPLT0);
      BranchHandle branchHandle0 = instructionList0.append((BranchInstruction) iF_ICMPLT0);
      int int0 = branchHandle0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      L2F l2F0 = (L2F)InstructionConstants.L2F;
      InstructionHandle instructionHandle0 = new InstructionHandle(l2F0);
      instructionHandle0.updatePosition(2, (-2159));
      int int0 = instructionHandle0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DUP2 dUP2_0 = new DUP2();
      InstructionList instructionList0 = new InstructionList(dUP2_0);
      InstructionHandle instructionHandle0 = instructionList0.getEnd();
      instructionHandle0.getNext();
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ILOAD iLOAD0 = (ILOAD)InstructionConstants.ILOAD_1;
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(iLOAD0);
      IF_ICMPEQ iF_ICMPEQ0 = new IF_ICMPEQ(instructionHandle0);
      IfInstruction ifInstruction0 = iF_ICMPEQ0.negate();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) ifInstruction0);
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) ifInstruction0);
      instructionList0.setPositions();
      instructionHandle0.setNext(branchHandle0);
      instructionHandle0.getNext();
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IASTORE iASTORE0 = (IASTORE)InstructionConstants.IASTORE;
      InstructionList instructionList0 = new InstructionList(iASTORE0);
      InstructionHandle instructionHandle0 = instructionList0.append((Instruction) iASTORE0);
      IF_ICMPNE iF_ICMPNE0 = new IF_ICMPNE(instructionHandle0);
      BranchHandle branchHandle0 = instructionList0.insert(instructionHandle0, (BranchInstruction) iF_ICMPNE0);
      instructionList0.append((InstructionHandle) branchHandle0, instructionList0);
      InstructionHandle instructionHandle1 = instructionHandle0.getNext();
      assertEquals((-1), instructionHandle1.getPosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.getEnd();
      instructionHandle0.getInstruction();
      assertEquals(5, instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ARRAYLENGTH aRRAYLENGTH0 = (ARRAYLENGTH)InstructionConstants.ARRAYLENGTH;
      InstructionHandle instructionHandle0 = new InstructionHandle(aRRAYLENGTH0);
      instructionHandle0.getInstruction();
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DUP2 dUP2_0 = (DUP2)InstructionConstants.DUP2;
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(dUP2_0);
      instructionHandle0.getInstruction();
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ARRAYLENGTH aRRAYLENGTH0 = new ARRAYLENGTH();
      InstructionList instructionList0 = new InstructionList(aRRAYLENGTH0);
      InstructionHandle instructionHandle0 = instructionList0.append((Instruction) aRRAYLENGTH0, (Instruction) aRRAYLENGTH0);
      Integer integer0 = new Integer(0);
      instructionHandle0.addAttribute(integer0, instructionHandle0);
      InstructionHandle instructionHandle1 = (InstructionHandle)instructionHandle0.getAttribute(integer0);
      assertEquals((-1), instructionHandle1.getPosition());
      assertNotNull(instructionHandle1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSR jSR0 = new JSR();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) jSR0);
      BranchHandle branchHandle0 = (BranchHandle)instructionList0.getStart();
      // Undeclared exception!
      try { 
        branchHandle0.updatePosition(28, 1217);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IFGE iFGE0 = new IFGE();
      BranchHandle branchHandle0 = BranchHandle.getBranchHandle(iFGE0);
      // Undeclared exception!
      try { 
        branchHandle0.toString(false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CALOAD cALOAD0 = new CALOAD();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(cALOAD0);
      IF_ICMPGE iF_ICMPGE0 = new IF_ICMPGE(instructionHandle0);
      IfInstruction ifInstruction0 = iF_ICMPGE0.negate();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) ifInstruction0);
      int[] intArray0 = new int[6];
      intArray0[0] = (-3249);
      intArray0[2] = 4293;
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[9];
      SWITCH sWITCH0 = new SWITCH(intArray0, instructionHandleArray0, (InstructionHandle) null, 4293);
      InstructionList instructionList1 = sWITCH0.getInstructionList();
      InstructionHandle instructionHandle1 = instructionList0.insert(instructionList1);
      // Undeclared exception!
      instructionHandle1.toString();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ARRAYLENGTH aRRAYLENGTH0 = new ARRAYLENGTH();
      InstructionList instructionList0 = new InstructionList(aRRAYLENGTH0);
      InstructionHandle instructionHandle0 = instructionList0.append((Instruction) aRRAYLENGTH0, (Instruction) aRRAYLENGTH0);
      instructionHandle0.dispose();
      // Undeclared exception!
      try { 
        instructionHandle0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.InstructionHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IFGE iFGE0 = new IFGE();
      BranchHandle branchHandle0 = BranchHandle.getBranchHandle(iFGE0);
      // Undeclared exception!
      try { 
        branchHandle0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      BranchHandle branchHandle0 = instructionList0.append((BranchInstruction) tABLESWITCH0);
      // Undeclared exception!
      try { 
        branchHandle0.setInstruction(tABLESWITCH0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ILOAD iLOAD0 = (ILOAD)InstructionConstants.ILOAD_1;
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(iLOAD0);
      IF_ICMPEQ iF_ICMPEQ0 = new IF_ICMPEQ(instructionHandle0);
      // Undeclared exception!
      try { 
        InstructionHandle.getInstructionHandle(iF_ICMPEQ0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Assigning branch instruction if_icmpeq[159](3) -> -1 to plain handle
         //
         verifyException("org.apache.bcel.generic.InstructionHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IFGT iFGT0 = new IFGT();
      // Undeclared exception!
      try { 
        InstructionHandle.getInstructionHandle(iFGT0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IREM iREM0 = (IREM)InstructionConstants.IREM;
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(iREM0);
      instructionHandle0.dispose();
      // Undeclared exception!
      try { 
        instructionHandle0.dispose();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.InstructionHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DUP2 dUP2_0 = (DUP2)InstructionConstants.DUP2;
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(dUP2_0);
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        instructionHandle0.accept(instConstraintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InstructionHandle instructionHandle0 = null;
      try {
        instructionHandle0 = new InstructionHandle((Instruction) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Assigning null to handle
         //
         verifyException("org.apache.bcel.generic.InstructionHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSR jSR0 = new JSR();
      InstructionHandle instructionHandle0 = null;
      try {
        instructionHandle0 = new InstructionHandle(jSR0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      L2F l2F0 = (L2F)InstructionConstants.L2F;
      InstructionHandle instructionHandle0 = new InstructionHandle(l2F0);
      IFGE iFGE0 = new IFGE(instructionHandle0);
      assertTrue(instructionHandle0.hasTargeters());
      
      instructionHandle0.dispose();
      boolean boolean0 = instructionHandle0.hasTargeters();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ARRAYLENGTH aRRAYLENGTH0 = (ARRAYLENGTH)InstructionConstants.ARRAYLENGTH;
      InstructionHandle instructionHandle0 = new InstructionHandle(aRRAYLENGTH0);
      boolean boolean0 = instructionHandle0.hasTargeters();
      assertEquals((-1), instructionHandle0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IFEQ iFEQ0 = new IFEQ();
      IfInstruction ifInstruction0 = iFEQ0.negate();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) ifInstruction0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, 0L);
      InstructionHandle instructionHandle0 = instructionList0.insert((Instruction) ifInstruction0, (CompoundInstruction) pUSH0);
      IF_ACMPEQ iF_ACMPEQ0 = new IF_ACMPEQ(instructionHandle0);
      boolean boolean0 = instructionHandle0.hasTargeters();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      INVOKEVIRTUAL iNVOKEVIRTUAL0 = new INVOKEVIRTUAL();
      InstructionHandle instructionHandle0 = new InstructionHandle(iNVOKEVIRTUAL0);
      IF_ACMPNE iF_ACMPNE0 = new IF_ACMPNE(instructionHandle0);
      instructionHandle0.addTargeter(iF_ACMPNE0);
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IFEQ iFEQ0 = new IFEQ();
      IfInstruction ifInstruction0 = iFEQ0.negate();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) ifInstruction0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, 0L);
      InstructionHandle instructionHandle0 = instructionList0.insert((Instruction) ifInstruction0, (CompoundInstruction) pUSH0);
      instructionHandle0.addTargeter(ifInstruction0);
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IF_ICMPLT iF_ICMPLT0 = new IF_ICMPLT();
      IfInstruction ifInstruction0 = iF_ICMPLT0.negate();
      BranchHandle branchHandle0 = BranchHandle.getBranchHandle(ifInstruction0);
      branchHandle0.removeTargeter(ifInstruction0);
      assertFalse(branchHandle0.hasTargeters());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ARRAYLENGTH aRRAYLENGTH0 = new ARRAYLENGTH();
      InstructionList instructionList0 = new InstructionList(aRRAYLENGTH0);
      InstructionHandle instructionHandle0 = instructionList0.append((Instruction) aRRAYLENGTH0, (Instruction) aRRAYLENGTH0);
      instructionHandle0.removeAllTargeters();
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      L2F l2F0 = (L2F)InstructionConstants.L2F;
      InstructionHandle instructionHandle0 = new InstructionHandle(l2F0);
      instructionHandle0.dispose();
      instructionHandle0.setInstruction(l2F0);
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IFEQ iFEQ0 = new IFEQ();
      IfInstruction ifInstruction0 = iFEQ0.negate();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) ifInstruction0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, 0L);
      InstructionHandle instructionHandle0 = instructionList0.insert((Instruction) ifInstruction0, (CompoundInstruction) pUSH0);
      String string0 = instructionHandle0.toString(false);
      assertEquals("  -1: lconst_0", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IFEQ iFEQ0 = new IFEQ();
      IfInstruction ifInstruction0 = iFEQ0.negate();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) ifInstruction0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, 0L);
      InstructionHandle instructionHandle0 = instructionList0.insert((Instruction) ifInstruction0, (CompoundInstruction) pUSH0);
      instructionHandle0.getNext();
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      L2F l2F0 = new L2F();
      InstructionHandle instructionHandle0 = new InstructionHandle(l2F0);
      instructionHandle0.getAttributes();
      instructionHandle0.getAttributes();
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      L2F l2F0 = (L2F)InstructionConstants.L2F;
      InstructionHandle instructionHandle0 = new InstructionHandle(l2F0);
      instructionHandle0.getAttributes();
      IFGE iFGE0 = new IFGE(instructionHandle0);
      instructionHandle0.getAttribute(iFGE0);
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DUP2 dUP2_0 = (DUP2)InstructionConstants.DUP2;
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(dUP2_0);
      Integer integer0 = new Integer(77);
      instructionHandle0.getAttribute(integer0);
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ARRAYLENGTH aRRAYLENGTH0 = (ARRAYLENGTH)InstructionConstants.ARRAYLENGTH;
      InstructionHandle instructionHandle0 = new InstructionHandle(aRRAYLENGTH0);
      instructionHandle0.getAttributes();
      instructionHandle0.removeAttribute(aRRAYLENGTH0);
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      L2F l2F0 = (L2F)InstructionConstants.L2F;
      InstructionHandle instructionHandle0 = new InstructionHandle(l2F0);
      byte[] byteArray0 = new byte[3];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      instructionHandle0.removeAttribute(byteSequence0);
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      L2F l2F0 = new L2F();
      InstructionHandle instructionHandle0 = new InstructionHandle(l2F0);
      instructionHandle0.getAttributes();
      JSR jSR0 = new JSR();
      instructionHandle0.addAttribute(jSR0, l2F0);
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      L2F l2F0 = new L2F();
      InstructionHandle instructionHandle0 = new InstructionHandle(l2F0);
      IFGE iFGE0 = new IFGE(instructionHandle0);
      assertTrue(instructionHandle0.hasTargeters());
      
      instructionHandle0.dispose();
      instructionHandle0.getTargeters();
      assertFalse(instructionHandle0.hasTargeters());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      L2F l2F0 = new L2F();
      InstructionHandle instructionHandle0 = new InstructionHandle(l2F0);
      IFGE iFGE0 = new IFGE(instructionHandle0);
      instructionHandle0.getTargeters();
      assertTrue(instructionHandle0.hasTargeters());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ARRAYLENGTH aRRAYLENGTH0 = new ARRAYLENGTH();
      InstructionList instructionList0 = new InstructionList(aRRAYLENGTH0);
      InstructionHandle instructionHandle0 = instructionList0.append((Instruction) aRRAYLENGTH0, (Instruction) aRRAYLENGTH0);
      IFEQ iFEQ0 = new IFEQ(instructionHandle0);
      instructionHandle0.removeTargeter(iFEQ0);
      assertFalse(instructionHandle0.hasTargeters());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ARRAYLENGTH aRRAYLENGTH0 = new ARRAYLENGTH();
      InstructionList instructionList0 = new InstructionList(aRRAYLENGTH0);
      InstructionHandle instructionHandle0 = instructionList0.append(instructionList0);
      instructionHandle0.setInstruction(aRRAYLENGTH0);
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      L2F l2F0 = (L2F)InstructionConstants.L2F;
      InstructionHandle instructionHandle0 = new InstructionHandle(l2F0);
      IFGE iFGE0 = new IFGE();
      // Undeclared exception!
      try { 
        instructionHandle0.setInstruction(iFGE0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FADD fADD0 = new FADD();
      InstructionList instructionList0 = new InstructionList(fADD0);
      InstructionHandle instructionHandle0 = instructionList0.getStart();
      GOTO gOTO0 = new GOTO(instructionHandle0);
      BranchHandle branchHandle0 = instructionList0.insert(instructionHandle0, (BranchInstruction) gOTO0);
      // Undeclared exception!
      try { 
        branchHandle0.updatePosition(2091, 2091);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid branch target position offset for goto[167](3):-1:  -1: fadd[98](1)
         //
         verifyException("org.apache.bcel.generic.BranchInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      L2F l2F0 = new L2F();
      InstructionHandle instructionHandle0 = new InstructionHandle(l2F0);
      // Undeclared exception!
      try { 
        instructionHandle0.setInstruction((Instruction) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Assigning null to handle
         //
         verifyException("org.apache.bcel.generic.InstructionHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, (-6.539597787916757));
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.getStart();
      instructionHandle0.addHandle();
      assertEquals((-1), instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      D2I d2I0 = (D2I)InstructionConstants.D2I;
      InstructionHandle instructionHandle0 = new InstructionHandle(d2I0);
      String string0 = instructionHandle0.toString();
      assertEquals("  -1: d2i[142](1)", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Constant[] constantArray0 = new Constant[10];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, false);
      InstructionList instructionList0 = new InstructionList(pUSH0);
      InstructionHandle instructionHandle0 = instructionList0.getEnd();
      // Undeclared exception!
      try { 
        instructionHandle0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ICONST", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      D2I d2I0 = (D2I)InstructionConstants.D2I;
      InstructionHandle instructionHandle0 = new InstructionHandle(d2I0);
      int int0 = instructionHandle0.getPosition();
      assertEquals((-1), int0);
  }
}
