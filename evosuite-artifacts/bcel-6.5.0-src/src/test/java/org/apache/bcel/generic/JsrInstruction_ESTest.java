/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:28:31 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.generic.BranchHandle;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.IFGE;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.JSR;
import org.apache.bcel.generic.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsrInstruction_ESTest extends JsrInstruction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      IFGE iFGE0 = new IFGE();
      iFGE0.updatePosition((byte)52, (byte)57);
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) iFGE0);
      BranchHandle branchHandle1 = instructionList0.insert((InstructionHandle) branchHandle0, (BranchInstruction) iFGE0);
      JSR jSR0 = new JSR(branchHandle1);
      instructionList0.append((InstructionHandle) branchHandle1, (BranchInstruction) jSR0);
      InstructionHandle instructionHandle0 = jSR0.physicalSuccessor();
      assertEquals(52, instructionHandle0.getPosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      IFGE iFGE0 = new IFGE();
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) iFGE0);
      BranchHandle branchHandle1 = instructionList0.insert((InstructionHandle) branchHandle0, (BranchInstruction) iFGE0);
      JSR jSR0 = new JSR(branchHandle0);
      iFGE0.setPosition((-877));
      BranchHandle branchHandle2 = instructionList0.append((InstructionHandle) branchHandle1, (BranchInstruction) jSR0);
      InstructionHandle instructionHandle0 = jSR0.physicalSuccessor();
      assertNotSame(instructionHandle0, branchHandle2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      IFGE iFGE0 = new IFGE();
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) iFGE0);
      JSR jSR0 = new JSR(branchHandle0);
      instructionList0.append((BranchInstruction) jSR0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = jSR0.getType(constantPoolGen0);
      assertEquals("<return address targeting null>", type0.getSignature());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      IFGE iFGE0 = new IFGE();
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) iFGE0);
      JSR jSR0 = new JSR(branchHandle0);
      instructionList0.append(instructionList0);
      // Undeclared exception!
      jSR0.physicalSuccessor();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      IFGE iFGE0 = new IFGE();
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) iFGE0);
      JSR jSR0 = new JSR(branchHandle0);
      instructionList0.insert((BranchInstruction) jSR0);
      instructionList0.append((BranchInstruction) jSR0);
      // Undeclared exception!
      try { 
        jSR0.physicalSuccessor();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // physicalSuccessor() called on a shared JsrInstruction.
         //
         verifyException("org.apache.bcel.generic.JsrInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      IFGE iFGE0 = new IFGE();
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) iFGE0);
      JSR jSR0 = new JSR(branchHandle0);
      BranchHandle branchHandle1 = instructionList0.append((BranchInstruction) jSR0);
      instructionList0.append((InstructionHandle) branchHandle1, (BranchInstruction) jSR0);
      // Undeclared exception!
      try { 
        jSR0.getType((ConstantPoolGen) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // physicalSuccessor() called on a shared JsrInstruction.
         //
         verifyException("org.apache.bcel.generic.JsrInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      IFGE iFGE0 = new IFGE();
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) iFGE0);
      BranchHandle branchHandle1 = instructionList0.insert((InstructionHandle) branchHandle0, (BranchInstruction) iFGE0);
      JSR jSR0 = new JSR(branchHandle1);
      instructionList0.append((InstructionHandle) branchHandle1, (BranchInstruction) jSR0);
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      // Undeclared exception!
      try { 
        jSR0.getType(constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      IFGE iFGE0 = new IFGE();
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) iFGE0);
      JSR jSR0 = new JSR(branchHandle0);
      instructionList0.insert((BranchInstruction) jSR0);
      jSR0.setOpcode((byte)0);
      InstructionHandle instructionHandle0 = jSR0.physicalSuccessor();
      assertSame(instructionHandle0, branchHandle0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      IFGE iFGE0 = new IFGE();
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) iFGE0);
      JSR jSR0 = new JSR(branchHandle0);
      instructionList0.append((BranchInstruction) jSR0);
      InstructionHandle instructionHandle0 = jSR0.physicalSuccessor();
      assertNull(instructionHandle0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[50];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      IFGE iFGE0 = new IFGE();
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) iFGE0);
      JSR jSR0 = new JSR(branchHandle0);
      jSR0.setOpcode((byte)0);
      // Undeclared exception!
      try { 
        jSR0.physicalSuccessor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      IFGE iFGE0 = new IFGE();
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) iFGE0);
      JSR jSR0 = new JSR(branchHandle0);
      instructionList0.append(instructionList0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      jSR0.getType(constantPoolGen0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSR jSR0 = new JSR();
      assertEquals(1, jSR0.getLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      IFGE iFGE0 = new IFGE();
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) iFGE0);
      JSR jSR0 = new JSR(branchHandle0);
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      // Undeclared exception!
      try { 
        jSR0.getType(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
