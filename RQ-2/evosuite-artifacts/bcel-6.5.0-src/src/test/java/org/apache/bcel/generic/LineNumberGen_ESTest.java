/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:35:13 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.LineNumber;
import org.apache.bcel.generic.BranchHandle;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.DASTORE;
import org.apache.bcel.generic.FADD;
import org.apache.bcel.generic.FRETURN;
import org.apache.bcel.generic.FSUB;
import org.apache.bcel.generic.GOTO;
import org.apache.bcel.generic.ICONST;
import org.apache.bcel.generic.IFLT;
import org.apache.bcel.generic.IfInstruction;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LCMP;
import org.apache.bcel.generic.LOOKUPSWITCH;
import org.apache.bcel.generic.LineNumberGen;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LineNumberGen_ESTest extends LineNumberGen_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FRETURN fRETURN0 = new FRETURN();
      InstructionList instructionList0 = new InstructionList(fRETURN0);
      InstructionHandle instructionHandle0 = instructionList0.append(instructionList0);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, (-264));
      lineNumberGen0.setInstruction(instructionHandle0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FADD fADD0 = new FADD();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(fADD0);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, 0);
      int int0 = lineNumberGen0.getSourceLine();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LCMP lCMP0 = new LCMP();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(lCMP0);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, 1549);
      int int0 = lineNumberGen0.getSourceLine();
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FSUB fSUB0 = new FSUB();
      InstructionHandle instructionHandle0 = new InstructionHandle(fSUB0);
      IFLT iFLT0 = new IFLT(instructionHandle0);
      IfInstruction ifInstruction0 = iFLT0.negate();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) ifInstruction0);
      BranchHandle branchHandle0 = instructionList0.append(instructionHandle0, (BranchInstruction) iFLT0);
      LineNumberGen lineNumberGen0 = new LineNumberGen(branchHandle0, 0);
      LineNumber lineNumber0 = lineNumberGen0.getLineNumber();
      assertEquals(1, lineNumber0.getLineNumber());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Type type0 = Type.UNKNOWN;
      DASTORE dASTORE0 = new DASTORE();
      InstructionHandle instructionHandle0 = new InstructionHandle(dASTORE0);
      GOTO gOTO0 = new GOTO(instructionHandle0);
      InstructionList instructionList0 = new InstructionList((BranchInstruction) gOTO0);
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      MethodGen methodGen0 = new MethodGen(1116, type0, type0.NO_ARGS, (String[]) null, "D", "D", instructionList0, constantPoolGen0);
      LineNumberGen lineNumberGen0 = methodGen0.addLineNumber(instructionHandle0, 1763);
      instructionHandle0.removeAllTargeters();
      lineNumberGen0.getInstruction();
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LCMP lCMP0 = new LCMP();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(lCMP0);
      instructionHandle0.setPosition((byte)116);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, 1549);
      lineNumberGen0.getInstruction();
      assertEquals(0, lineNumberGen0.getSourceLine());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      InstructionList instructionList1 = new InstructionList((BranchInstruction) lOOKUPSWITCH0);
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList1);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, 0);
      // Undeclared exception!
      try { 
        lineNumberGen0.updateTarget(instructionHandle0, (InstructionHandle) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // instructionHandle
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DASTORE dASTORE0 = new DASTORE();
      InstructionHandle instructionHandle0 = new InstructionHandle(dASTORE0);
      GOTO gOTO0 = new GOTO();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) gOTO0);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, 1116);
      InstructionHandle instructionHandle1 = instructionList0.append(instructionList0);
      // Undeclared exception!
      try { 
        lineNumberGen0.updateTarget(instructionHandle1, instructionHandle0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LineNumberGen lineNumberGen0 = null;
      try {
        lineNumberGen0 = new LineNumberGen((InstructionHandle) null, (-1575));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // instructionHandle
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LCMP lCMP0 = new LCMP();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(lCMP0);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, 1549);
      // Undeclared exception!
      try { 
        lineNumberGen0.setInstruction((InstructionHandle) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // instructionHandle
         //
         verifyException("java.util.Objects", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LCMP lCMP0 = new LCMP();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(lCMP0);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, 1549);
      lineNumberGen0.setSourceLine((-1));
      assertEquals(0, lineNumberGen0.getSourceLine());
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ICONST iCONST0 = new ICONST(0);
      InstructionList instructionList0 = new InstructionList(iCONST0);
      InstructionHandle instructionHandle0 = instructionList0.append((Instruction) iCONST0);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, 0);
      // Undeclared exception!
      try { 
        lineNumberGen0.updateTarget((InstructionHandle) null, instructionHandle0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Not targeting null, but   -1: iconst_0[3](1)}
         //
         verifyException("org.apache.bcel.generic.LineNumberGen", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LCMP lCMP0 = new LCMP();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(lCMP0);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, (byte) (-97));
      lineNumberGen0.updateTarget(instructionHandle0, instructionHandle0);
      assertEquals(0, lineNumberGen0.getSourceLine());
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LCMP lCMP0 = new LCMP();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(lCMP0);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, (byte) (-97));
      boolean boolean0 = lineNumberGen0.containsTarget(instructionHandle0);
      assertEquals(0, lineNumberGen0.getSourceLine());
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LCMP lCMP0 = new LCMP();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(lCMP0);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, (byte) (-97));
      boolean boolean0 = lineNumberGen0.containsTarget(instructionHandle0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      InstructionList instructionList1 = new InstructionList((BranchInstruction) lOOKUPSWITCH0);
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList1);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, 96);
      boolean boolean0 = lineNumberGen0.containsTarget((InstructionHandle) null);
      ;
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      InstructionList instructionList1 = new InstructionList((BranchInstruction) lOOKUPSWITCH0);
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList1);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, 96);
      boolean boolean0 = lineNumberGen0.containsTarget((InstructionHandle) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LCMP lCMP0 = new LCMP();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(lCMP0);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, (byte) (-97));
      LineNumber lineNumber0 = lineNumberGen0.getLineNumber();
      assertEquals(1, lineNumber0.getLineNumber());
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LCMP lCMP0 = new LCMP();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(lCMP0);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, (byte) (-97));
      int int0 = lineNumberGen0.getSourceLine();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      InstructionList instructionList1 = new InstructionList((BranchInstruction) lOOKUPSWITCH0);
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList1);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, 96);
      LineNumberGen lineNumberGen1 = (LineNumberGen)lineNumberGen0.clone();
      assertEquals(0, lineNumberGen1.getSourceLine());
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      InstructionList instructionList1 = new InstructionList((BranchInstruction) lOOKUPSWITCH0);
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList1);
      LineNumberGen lineNumberGen0 = new LineNumberGen(instructionHandle0, 96);
      lineNumberGen0.getInstruction();
      ;
}
}
