/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:14:18 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.bcel.generic.BranchHandle;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.CompoundInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.I2D;
import org.apache.bcel.generic.IFNE;
import org.apache.bcel.generic.IF_ICMPEQ;
import org.apache.bcel.generic.IMUL;
import org.apache.bcel.generic.IfInstruction;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LOOKUPSWITCH;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.TABLESWITCH;
import org.apache.bcel.util.ByteSequence;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Select_ESTest extends Select_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[2];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[2];
      InstructionList instructionList0 = new InstructionList();
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0]);
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, true);
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) lOOKUPSWITCH0);
      lOOKUPSWITCH0.setTarget(branchHandle0);
      InstructionHandle instructionHandle0 = instructionList0.insert((CompoundInstruction) pUSH0);
      boolean boolean0 = lOOKUPSWITCH0.containsTarget(instructionHandle0);
      assertEquals(25, lOOKUPSWITCH0.getLength());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[2];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[2];
      InstructionList instructionList0 = new InstructionList();
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0]);
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, false);
      InstructionHandle instructionHandle0 = instructionList0.insert((CompoundInstruction) pUSH0);
      InstructionHandle instructionHandle1 = instructionList0.append((CompoundInstruction) pUSH0);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.updateTarget(instructionHandle0, instructionHandle1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not targeting   -1: iconst_0[3](1)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[2];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[2];
      InstructionList instructionList0 = new InstructionList();
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0]);
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) lOOKUPSWITCH0);
      lOOKUPSWITCH0.setTarget(branchHandle0);
      lOOKUPSWITCH0.updateTarget(instructionHandleArray0[0], instructionHandleArray0[0]);
      assertEquals(25, lOOKUPSWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[2];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[2];
      InstructionList instructionList0 = new InstructionList();
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0]);
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) lOOKUPSWITCH0);
      lOOKUPSWITCH0.updateTarget((InstructionHandle) null, branchHandle0);
      assertEquals(25, lOOKUPSWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      tABLESWITCH0.padding = (-247);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        tABLESWITCH0.dump(dataOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      lOOKUPSWITCH0.setIndex(1243);
      int int0 = lOOKUPSWITCH0.updatePosition((-1231), 0);
      assertEquals(2, lOOKUPSWITCH0.getLength());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int int0 = tABLESWITCH0.setMatch_length(6);
      assertEquals(6, int0);
      
      int int1 = tABLESWITCH0.updatePosition(6, 4);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int[] intArray0 = new int[6];
      tABLESWITCH0.setMatches(intArray0);
      tABLESWITCH0.setMatch(0, 2489);
      assertEquals(1, tABLESWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      byte[] byteArray0 = new byte[16];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      tABLESWITCH0.initFromFile(byteSequence0, false);
      assertEquals(17, tABLESWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      MockFile mockFile0 = new MockFile("51L*0Y");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      InstructionList instructionList0 = new InstructionList();
      BranchHandle branchHandle0 = instructionList0.append((BranchInstruction) lOOKUPSWITCH0);
      lOOKUPSWITCH0.setTarget(branchHandle0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      lOOKUPSWITCH0.dump(dataOutputStream0);
      assertEquals(9L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int int0 = lOOKUPSWITCH0.updatePosition(79, 79);
      assertEquals(0, lOOKUPSWITCH0.getLength());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int int0 = lOOKUPSWITCH0.setMatch_length(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int[] intArray0 = new int[6];
      tABLESWITCH0.indices = intArray0;
      int int0 = tABLESWITCH0.setIndices(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[2];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[2];
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0]);
      int int0 = lOOKUPSWITCH0.setIndices(0, (-355));
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals((-355), int0);
      assertEquals(25, lOOKUPSWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[2];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[2];
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0]);
      lOOKUPSWITCH0.getTargets();
      assertEquals(25, lOOKUPSWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[0];
      lOOKUPSWITCH0.setTargets(instructionHandleArray0);
      InstructionHandle[] instructionHandleArray1 = lOOKUPSWITCH0.getTargets();
      assertEquals(0, instructionHandleArray1.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[2];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[2];
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0]);
      lOOKUPSWITCH0.getTarget(1);
      assertEquals(25, lOOKUPSWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[5];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[5];
      IMUL iMUL0 = (IMUL)InstructionConstants.IMUL;
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(iMUL0);
      IFNE iFNE0 = new IFNE(instructionHandle0);
      InstructionList instructionList0 = new InstructionList((BranchInstruction) iFNE0);
      BranchHandle branchHandle0 = instructionList0.append(instructionHandle0, (BranchInstruction) iFNE0);
      instructionHandleArray0[0] = (InstructionHandle) branchHandle0;
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, branchHandle0);
      InstructionHandle instructionHandle1 = lOOKUPSWITCH0.getTarget(0);
      assertNotNull(instructionHandle1);
      assertEquals(49, lOOKUPSWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int int0 = lOOKUPSWITCH0.getPadding();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      lOOKUPSWITCH0.updatePosition((-1231), 0);
      int int0 = lOOKUPSWITCH0.getPadding();
      assertEquals(2, lOOKUPSWITCH0.getLength());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      tABLESWITCH0.padding = (int) (byte) (-78);
      int int0 = tABLESWITCH0.getPadding();
      assertEquals((-78), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int[] intArray0 = new int[1];
      tABLESWITCH0.setMatches(intArray0);
      int[] intArray1 = tABLESWITCH0.getMatchs();
      assertEquals(1, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int int0 = tABLESWITCH0.getMatch_length();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int int0 = tABLESWITCH0.setMatch_length(16);
      int int1 = tABLESWITCH0.getMatch_length();
      assertEquals(16, int1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int int0 = tABLESWITCH0.setMatch_length((-574));
      int int1 = tABLESWITCH0.getMatch_length();
      assertEquals((-574), int1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int[] intArray0 = new int[6];
      tABLESWITCH0.setMatches(intArray0);
      int int0 = tABLESWITCH0.getMatch(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int[] intArray0 = new int[3];
      intArray0[1] = 173;
      lOOKUPSWITCH0.match = intArray0;
      int int0 = lOOKUPSWITCH0.getMatch(1);
      assertEquals(173, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int[] intArray0 = new int[3];
      tABLESWITCH0.indices = intArray0;
      int int0 = tABLESWITCH0.getIndices(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int[] intArray0 = new int[3];
      intArray0[0] = 1852;
      tABLESWITCH0.indices = intArray0;
      int int0 = tABLESWITCH0.getIndices(0);
      assertEquals(1852, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int[] intArray0 = new int[4];
      lOOKUPSWITCH0.setIndices(intArray0);
      int[] intArray1 = lOOKUPSWITCH0.getIndices();
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int[] intArray0 = new int[0];
      lOOKUPSWITCH0.indices = intArray0;
      int[] intArray1 = lOOKUPSWITCH0.getIndices();
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      lOOKUPSWITCH0.setFixed_length(25);
      int int0 = lOOKUPSWITCH0.getFixed_length();
      assertEquals(25, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      lOOKUPSWITCH0.setFixed_length((-21));
      int int0 = lOOKUPSWITCH0.getFixed_length();
      assertEquals((-21), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = new int[2];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[2];
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0]);
      LOOKUPSWITCH lOOKUPSWITCH1 = (LOOKUPSWITCH)lOOKUPSWITCH0.clone();
      assertEquals(25, lOOKUPSWITCH1.getLength());
      assertNotSame(lOOKUPSWITCH1, lOOKUPSWITCH0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      byte[] byteArray0 = new byte[1];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      BranchHandle branchHandle0 = instructionList0.append((BranchInstruction) tABLESWITCH0);
      // Undeclared exception!
      try { 
        tABLESWITCH0.updateTarget(branchHandle0, (InstructionHandle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[0];
      lOOKUPSWITCH0.targets = instructionHandleArray0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, true);
      InstructionList instructionList0 = new InstructionList(pUSH0);
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) lOOKUPSWITCH0);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.updateTarget(branchHandle0, branchHandle0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      // Undeclared exception!
      try { 
        tABLESWITCH0.toString(false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.setTarget(1035, (InstructionHandle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[1];
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      lOOKUPSWITCH0.targets = instructionHandleArray0;
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.setTarget((-445), (InstructionHandle) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -445
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int[] intArray0 = new int[0];
      lOOKUPSWITCH0.setMatches(intArray0);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.setMatch((-1296), (-1296));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1296
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.setIndices((-1166), (-1166));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int[] intArray0 = new int[6];
      tABLESWITCH0.setIndices(intArray0);
      // Undeclared exception!
      try { 
        tABLESWITCH0.setIndices(1985, (-1359));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1985
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      // Undeclared exception!
      try { 
        tABLESWITCH0.initFromFile((ByteSequence) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      byte[] byteArray0 = new byte[13];
      byteArray0[4] = (byte)19;
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      // Undeclared exception!
      try { 
        tABLESWITCH0.initFromFile(byteSequence0, false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.TABLESWITCH", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[0];
      lOOKUPSWITCH0.setTargets(instructionHandleArray0);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.getTarget((-1770));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1770
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int[] intArray0 = new int[0];
      lOOKUPSWITCH0.match = intArray0;
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.getMatch(135);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 135
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int[] intArray0 = new int[9];
      tABLESWITCH0.indices = intArray0;
      // Undeclared exception!
      try { 
        tABLESWITCH0.getIndices(97);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 97
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int[] intArray0 = new int[0];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[0];
      I2D i2D0 = new I2D();
      InstructionList instructionList0 = new InstructionList(i2D0);
      InstructionHandle instructionHandle0 = instructionList0.getStart();
      IF_ICMPEQ iF_ICMPEQ0 = new IF_ICMPEQ(instructionHandle0);
      IfInstruction ifInstruction0 = iF_ICMPEQ0.negate();
      BranchHandle branchHandle0 = instructionList0.append(instructionHandle0, (BranchInstruction) ifInstruction0);
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, branchHandle0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.dump(dataOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        tABLESWITCH0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int[] intArray0 = new int[2];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[2];
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0]);
      String string0 = lOOKUPSWITCH0.toString(true);
      assertEquals("lookupswitch[171](25) -> null(0, null = {0})(0, null = {0})", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      int[] intArray0 = new int[2];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[2];
      InstructionList instructionList0 = new InstructionList();
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0]);
      PUSH pUSH0 = new PUSH((ConstantPoolGen) null, true);
      InstructionHandle instructionHandle0 = instructionList0.insert((CompoundInstruction) pUSH0);
      lOOKUPSWITCH0.setTarget(1, instructionHandle0);
      assertTrue(instructionHandle0.hasTargeters());
      assertEquals(25, lOOKUPSWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      int[] intArray0 = new int[2];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[2];
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0]);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.dispose();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[0];
      lOOKUPSWITCH0.targets = instructionHandleArray0;
      lOOKUPSWITCH0.dispose();
      assertEquals(1, lOOKUPSWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      boolean boolean0 = tABLESWITCH0.containsTarget((InstructionHandle) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, true);
      InstructionList instructionList0 = new InstructionList(pUSH0);
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) lOOKUPSWITCH0);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.containsTarget(branchHandle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      int[] intArray0 = new int[2];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[2];
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0]);
      String string0 = lOOKUPSWITCH0.toString(false);
      assertEquals(25, lOOKUPSWITCH0.getLength());
      assertEquals("lookupswitch -> null ...", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      byte[] byteArray0 = new byte[4];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      byteSequence0.readShort();
      try { 
        tABLESWITCH0.initFromFile(byteSequence0, false);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("=v3M.W(RkVI@");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      tABLESWITCH0.updatePosition((byte) (-72), (byte) (-72));
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        tABLESWITCH0.dump(dataOutputStream0);
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
      int[] intArray0 = new int[2];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[2];
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0]);
      File file0 = MockFile.createTempFile("The 'value' is not of a ReferenceType but of type ", "lookupswitch[171](25) -> null(0, null = {0})(3172, null = {0})");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.dump(dataOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Target of lookupswitch[171](25) is invalid null handle
         //
         verifyException("org.apache.bcel.generic.BranchInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int[] intArray0 = new int[17];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[3];
      LOOKUPSWITCH lOOKUPSWITCH0 = null;
      try {
        lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, (InstructionHandle) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Match and target array have not the same length: Match length: 17 Target length: 3
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.setMatch((-1296), (-1296));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int int0 = tABLESWITCH0.getFixed_length();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      InstructionHandle[] instructionHandleArray0 = lOOKUPSWITCH0.getTargets();
      assertNull(instructionHandleArray0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      int[] intArray0 = new int[2];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[2];
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0]);
      int int0 = lOOKUPSWITCH0.setIndices(0, 3186);
      assertEquals(25, lOOKUPSWITCH0.getLength());
      assertEquals(3186, int0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.getMatch(135);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int[] intArray0 = lOOKUPSWITCH0.getIndices();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.getTarget(115);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int[] intArray0 = lOOKUPSWITCH0.getMatchs();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.getIndices(701);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }
}
