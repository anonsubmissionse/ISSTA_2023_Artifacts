/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:18:35 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.ARRAYLENGTH;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LSHL;
import org.apache.bcel.generic.SIPUSH;
import org.apache.bcel.generic.SWITCH;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SWITCH_ESTest extends SWITCH_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[9];
      int[] intArray0 = new int[6];
      intArray0[0] = 1367;
      intArray0[1] = 1367;
      SWITCH sWITCH0 = new SWITCH(intArray0, instructionHandleArray0, (InstructionHandle) null, 3240);
      assertArrayEquals(new int[] {1367, 1367, 0, 0, 0, 0}, intArray0);
      assertEquals(9, instructionHandleArray0.length);
      assertEquals(6, intArray0.length);
      assertNotNull(sWITCH0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[3] = 65536;
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[7];
      LSHL lSHL0 = (LSHL)InstructionConstants.LSHL;
      assertEquals((short)121, lSHL0.getOpcode());
      assertEquals(1, lSHL0.getLength());
      assertNotNull(lSHL0);
      
      InstructionHandle instructionHandle0 = new InstructionHandle(lSHL0);
      assertEquals((short)121, lSHL0.getOpcode());
      assertEquals(1, lSHL0.getLength());
      assertFalse(instructionHandle0.hasTargeters());
      assertEquals((-1), instructionHandle0.getPosition());
      assertNotNull(instructionHandle0);
      
      SWITCH sWITCH0 = null;
      try {
        sWITCH0 = new SWITCH(intArray0, instructionHandleArray0, instructionHandle0, 1521);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Match and target array have not the same length: Match length: 4 Target length: 7
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[8];
      SWITCH sWITCH0 = null;
      try {
        sWITCH0 = new SWITCH(intArray0, (InstructionHandle[]) null, (InstructionHandle) null, 22);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.SWITCH", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[5];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[0];
      SWITCH sWITCH0 = null;
      try {
        sWITCH0 = new SWITCH(intArray0, instructionHandleArray0, (InstructionHandle) null, 175);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.bcel.generic.SWITCH", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[1];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[7];
      SWITCH sWITCH0 = null;
      try {
        sWITCH0 = new SWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[2]);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Match and target array have not the same length: Match length: 1 Target length: 7
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[7];
      SWITCH sWITCH0 = null;
      try {
        sWITCH0 = new SWITCH(intArray0, (InstructionHandle[]) null, (InstructionHandle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.SWITCH", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[5];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[0];
      ARRAYLENGTH aRRAYLENGTH0 = (ARRAYLENGTH)InstructionConstants.ARRAYLENGTH;
      assertEquals((short)190, aRRAYLENGTH0.getOpcode());
      assertEquals(1, aRRAYLENGTH0.getLength());
      assertNotNull(aRRAYLENGTH0);
      
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(aRRAYLENGTH0);
      assertEquals((short)190, aRRAYLENGTH0.getOpcode());
      assertEquals(1, aRRAYLENGTH0.getLength());
      assertEquals((-1), instructionHandle0.getPosition());
      assertFalse(instructionHandle0.hasTargeters());
      assertNotNull(instructionHandle0);
      
      SWITCH sWITCH0 = null;
      try {
        sWITCH0 = new SWITCH(intArray0, instructionHandleArray0, instructionHandle0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.bcel.generic.SWITCH", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 3448;
      intArray0[2] = (-369);
      intArray0[3] = (-2710);
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[6];
      InstructionList instructionList0 = new InstructionList();
      assertEquals(0, instructionList0.size());
      assertTrue(instructionList0.isEmpty());
      assertEquals(0, instructionList0.getLength());
      assertNotNull(instructionList0);
      
      SIPUSH sIPUSH0 = new SIPUSH((short) (-3973));
      assertEquals((short)17, sIPUSH0.getOpcode());
      assertEquals(3, sIPUSH0.getLength());
      assertNotNull(sIPUSH0);
      
      InstructionHandle instructionHandle0 = instructionList0.insert((Instruction) sIPUSH0);
      assertFalse(instructionList0.isEmpty());
      assertEquals(1, instructionList0.size());
      assertEquals(1, instructionList0.getLength());
      assertEquals((short)17, sIPUSH0.getOpcode());
      assertEquals(3, sIPUSH0.getLength());
      assertFalse(instructionHandle0.hasTargeters());
      assertEquals((-1), instructionHandle0.getPosition());
      assertNotNull(instructionHandle0);
      
      SWITCH sWITCH0 = new SWITCH(intArray0, instructionHandleArray0, instructionHandle0, (-369));
      assertArrayEquals(new int[] {3448, 0, (-369), (-2710), 0, 0}, intArray0);
      assertEquals(6, intArray0.length);
      assertEquals(6, instructionHandleArray0.length);
      assertFalse(instructionList0.isEmpty());
      assertEquals(1, instructionList0.size());
      assertEquals(1, instructionList0.getLength());
      assertEquals((short)17, sIPUSH0.getOpcode());
      assertEquals(3, sIPUSH0.getLength());
      assertTrue(instructionHandle0.hasTargeters());
      assertEquals((-1), instructionHandle0.getPosition());
      assertNotNull(sWITCH0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = (-1);
      intArray0[2] = 1521;
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[7];
      SWITCH sWITCH0 = new SWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0], 1521);
      assertArrayEquals(new int[] {0, (-1), 1521, 0}, intArray0);
      assertEquals(4, intArray0.length);
      assertEquals(7, instructionHandleArray0.length);
      assertNotNull(sWITCH0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[0];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[0];
      SWITCH sWITCH0 = new SWITCH(intArray0, instructionHandleArray0, (InstructionHandle) null, 5467);
      assertArrayEquals(new int[] {}, intArray0);
      assertEquals(0, intArray0.length);
      assertEquals(0, instructionHandleArray0.length);
      assertNotNull(sWITCH0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[9];
      int[] intArray0 = new int[6];
      intArray0[0] = 1367;
      SWITCH sWITCH0 = new SWITCH(intArray0, instructionHandleArray0, (InstructionHandle) null, 3240);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[0];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[0];
      SWITCH sWITCH0 = new SWITCH(intArray0, instructionHandleArray0, (InstructionHandle) null);
      InstructionList instructionList0 = sWITCH0.getInstructionList();
      assertEquals(1, instructionList0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[9];
      int[] intArray0 = new int[6];
      SWITCH sWITCH0 = new SWITCH(intArray0, instructionHandleArray0, (InstructionHandle) null, 3240);
      Instruction instruction0 = sWITCH0.getInstruction();
      assertEquals(37, instruction0.getLength());
  }
}
