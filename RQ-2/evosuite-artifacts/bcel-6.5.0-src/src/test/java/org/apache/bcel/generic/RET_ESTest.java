/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:25:52 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.PipedOutputStream;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.RET;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RET_ESTest extends RET_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RET rET0 = new RET(255);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RET rET0 = new RET(255);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RET rET0 = new RET();
      byte[] byteArray0 = new byte[15];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      rET0.initFromFile(byteSequence0, true);
      assertEquals(0, byteSequence0.getIndex());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RET rET0 = new RET();
      byte[] byteArray0 = new byte[15];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      rET0.initFromFile(byteSequence0, true);
      assertEquals(0, rET0.getLength());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RET rET0 = new RET(42);
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      rET0.accept(executionVisitor0);
      assertEquals(0, rET0.getIndex());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RET rET0 = new RET(42);
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      rET0.accept(executionVisitor0);
      assertEquals(1, rET0.getLength());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RET rET0 = new RET();
      rET0.setIndex(711);
      int int0 = rET0.getIndex();
      assertEquals(0, rET0.getLength());
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RET rET0 = new RET();
      rET0.setIndex(711);
      int int0 = rET0.getIndex();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RET rET0 = new RET();
      // Undeclared exception!
      try { 
        rET0.toString(false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      RET rET0 = new RET(0);
      byte[] byteArray0 = new byte[0];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      try { 
        rET0.initFromFile(byteSequence0, true);
        fail("Expecting exception: EOFException");
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RET rET0 = new RET();
      // Undeclared exception!
      try { 
        rET0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.RET", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RET rET0 = new RET(262);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        rET0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RET rET0 = null;
      try {
        rET0 = new RET((-1010));
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Negative index value: -1010
         //
         verifyException("org.apache.bcel.generic.RET", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RET rET0 = new RET(50);
      // Undeclared exception!
      try { 
        rET0.setIndex((-385));
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Negative index value: -385
         //
         verifyException("org.apache.bcel.generic.RET", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RET rET0 = new RET(1960);
      // Undeclared exception!
      try { 
        rET0.initFromFile((ByteSequence) null, true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.RET", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RET rET0 = new RET(0);
      byte[] byteArray0 = new byte[6];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      rET0.initFromFile(byteSequence0, false);
      assertEquals(0, byteSequence0.getIndex());
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RET rET0 = new RET(0);
      byte[] byteArray0 = new byte[6];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      rET0.initFromFile(byteSequence0, false);
      assertEquals(0, rET0.getLength());
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RET rET0 = new RET(1298);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      rET0.dump(dataOutputStream0);
      assertNotNull(byteArrayOutputStream0.toString());
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RET rET0 = new RET(1298);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      rET0.dump(dataOutputStream0);
      assertEquals(0, rET0.getLength());
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RET rET0 = new RET();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      rET0.dump(dataOutputStream0);
      assertNotNull(byteArrayOutputStream0.toString());
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RET rET0 = new RET();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      rET0.dump(dataOutputStream0);
      assertEquals(0, byteArrayOutputStream0.size());
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RET rET0 = new RET();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        rET0.accept(instConstraintVisitor0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RET rET0 = new RET(0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      rET0.getType(constantPoolGen0);
      assertEquals(1, rET0.getLength());
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RET rET0 = new RET(0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      rET0.getType(constantPoolGen0);
      assertEquals(0, rET0.getIndex());
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RET rET0 = new RET();
      int int0 = rET0.getIndex();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RET rET0 = new RET(0);
      String string0 = rET0.toString(true);
      assertNotNull(string0);
}
}
