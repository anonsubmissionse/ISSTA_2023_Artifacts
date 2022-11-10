/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:50:40 GMT 2022
 */

package org.apache.bcel.verifier.structurals;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.DUP2_X1;
import org.apache.bcel.generic.GOTO;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.Type;
import org.apache.bcel.verifier.structurals.ExceptionHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExceptionHandler_ESTest extends ExceptionHandler_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectType objectType0 = ObjectType.getInstance("it<0 d");
      DUP2_X1 dUP2_X1_0 = new DUP2_X1();
      InstructionList instructionList0 = new InstructionList(dUP2_X1_0);
      InstructionHandle instructionHandle0 = instructionList0.insert((Instruction) dUP2_X1_0);
      GOTO gOTO0 = new GOTO(instructionHandle0);
      ExceptionHandler exceptionHandler0 = new ExceptionHandler(objectType0, instructionHandle0);
      InstructionHandle instructionHandle1 = exceptionHandler0.getHandlerStart();
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectType objectType0 = Type.STRING;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, false);
      InstructionList instructionList0 = new InstructionList(pUSH0);
      byte[] byteArray0 = new byte[6];
      InstructionList instructionList1 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList1);
      ExceptionHandler exceptionHandler0 = new ExceptionHandler(objectType0, instructionHandle0);
      InstructionHandle instructionHandle1 = exceptionHandler0.getHandlerStart();
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.getEnd();
      ExceptionHandler exceptionHandler0 = new ExceptionHandler((ObjectType) null, instructionHandle0);
      InstructionHandle instructionHandle1 = exceptionHandler0.getHandlerStart();
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.getEnd();
      ExceptionHandler exceptionHandler0 = new ExceptionHandler((ObjectType) null, instructionHandle0);
      ObjectType objectType0 = exceptionHandler0.getExceptionType();
      assertNotNull(objectType0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ObjectType objectType0 = Type.STRING;
      ExceptionHandler exceptionHandler0 = new ExceptionHandler(objectType0, (InstructionHandle) null);
      ObjectType objectType1 = exceptionHandler0.getExceptionType();
      assertEquals(0, objectType1.getSize());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectType objectType0 = Type.STRING;
      ExceptionHandler exceptionHandler0 = new ExceptionHandler(objectType0, (InstructionHandle) null);
      InstructionHandle instructionHandle0 = exceptionHandler0.getHandlerStart();
      assertNotNull(instructionHandle0);
}
}
