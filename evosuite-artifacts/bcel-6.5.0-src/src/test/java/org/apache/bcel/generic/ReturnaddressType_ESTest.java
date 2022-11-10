/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:29:30 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.GOTO;
import org.apache.bcel.generic.IF_ICMPGE;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.ReturnaddressType;
import org.apache.bcel.generic.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReturnaddressType_ESTest extends ReturnaddressType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList0);
      ReturnaddressType returnaddressType0 = new ReturnaddressType(instructionHandle0);
      ReturnaddressType returnaddressType1 = new ReturnaddressType(instructionHandle0);
      boolean boolean0 = returnaddressType0.equals(returnaddressType1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ReturnaddressType returnaddressType0 = ReturnaddressType.NO_TARGET;
      byte[] byteArray0 = new byte[7];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList0);
      ReturnaddressType returnaddressType1 = new ReturnaddressType(instructionHandle0);
      boolean boolean0 = returnaddressType0.equals(returnaddressType1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ReturnaddressType returnaddressType0 = ReturnaddressType.NO_TARGET;
      InstructionHandle instructionHandle0 = returnaddressType0.getTarget();
      assertNull(instructionHandle0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ObjectType objectType0 = Type.THROWABLE;
      PUSH pUSH0 = new PUSH(constantPoolGen0, objectType0);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.getStart();
      IF_ICMPGE iF_ICMPGE0 = new IF_ICMPGE();
      instructionHandle0.addTargeter(iF_ICMPGE0);
      ReturnaddressType returnaddressType0 = new ReturnaddressType(instructionHandle0);
      InstructionHandle instructionHandle1 = returnaddressType0.getTarget();
      assertEquals((-1), instructionHandle1.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GOTO gOTO0 = new GOTO();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) gOTO0);
      byte[] byteArray0 = new byte[4];
      InstructionList instructionList1 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList1);
      ReturnaddressType returnaddressType0 = new ReturnaddressType(instructionHandle0);
      InstructionHandle instructionHandle1 = returnaddressType0.getTarget();
      assertSame(instructionHandle0, instructionHandle1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.getStart();
      instructionHandle0.setPosition((byte)16);
      ReturnaddressType returnaddressType0 = new ReturnaddressType(instructionHandle0);
      InstructionHandle instructionHandle1 = returnaddressType0.getTarget();
      assertSame(instructionHandle1, instructionHandle0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList0);
      instructionHandle0.dispose();
      ReturnaddressType returnaddressType0 = null;
      try {
        returnaddressType0 = new ReturnaddressType(instructionHandle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.InstructionHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GOTO gOTO0 = new GOTO();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) gOTO0);
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList0);
      ReturnaddressType returnaddressType0 = null;
      try {
        returnaddressType0 = new ReturnaddressType(instructionHandle0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ReturnaddressType returnaddressType0 = ReturnaddressType.NO_TARGET;
      byte[] byteArray0 = new byte[7];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList0);
      ReturnaddressType returnaddressType1 = new ReturnaddressType(instructionHandle0);
      boolean boolean0 = returnaddressType1.equals(returnaddressType0);
      assertFalse(returnaddressType0.equals((Object)returnaddressType1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.getStart();
      ReturnaddressType returnaddressType0 = new ReturnaddressType(instructionHandle0);
      boolean boolean0 = returnaddressType0.equals(instructionHandle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ReturnaddressType returnaddressType0 = ReturnaddressType.NO_TARGET;
      boolean boolean0 = returnaddressType0.equals(returnaddressType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ReturnaddressType returnaddressType0 = ReturnaddressType.NO_TARGET;
      returnaddressType0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ObjectType objectType0 = Type.THROWABLE;
      PUSH pUSH0 = new PUSH(constantPoolGen0, objectType0);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.getStart();
      ReturnaddressType returnaddressType0 = new ReturnaddressType(instructionHandle0);
      returnaddressType0.hashCode();
  }
}
