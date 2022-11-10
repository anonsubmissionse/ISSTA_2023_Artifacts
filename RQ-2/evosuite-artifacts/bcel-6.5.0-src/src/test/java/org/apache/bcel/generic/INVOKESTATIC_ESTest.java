/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:40:18 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.bcel.generic.INVOKESTATIC;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class INVOKESTATIC_ESTest extends INVOKESTATIC_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      INVOKESTATIC iNVOKESTATIC0 = new INVOKESTATIC(231);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        iNVOKESTATIC0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      INVOKESTATIC iNVOKESTATIC0 = new INVOKESTATIC();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        iNVOKESTATIC0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      INVOKESTATIC iNVOKESTATIC0 = null;
      try {
        iNVOKESTATIC0 = new INVOKESTATIC((-1934));
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Negative index value: -1934
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      INVOKESTATIC iNVOKESTATIC0 = new INVOKESTATIC(1382);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.bcel.generic.INVOKESTATIC");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      iNVOKESTATIC0.dump(dataOutputStream0);
      assertEquals(1, iNVOKESTATIC0.getLength());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      INVOKESTATIC iNVOKESTATIC0 = new INVOKESTATIC();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        iNVOKESTATIC0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      INVOKESTATIC iNVOKESTATIC0 = new INVOKESTATIC();
      Class<?>[] classArray0 = iNVOKESTATIC0.getExceptions();
      ;
}
}
