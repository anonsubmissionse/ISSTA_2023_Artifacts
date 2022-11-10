/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:11:41 GMT 2022
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PipedOutputStream;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantDouble;
import org.apache.bcel.classfile.ConstantFloat;
import org.apache.bcel.classfile.ConstantInteger;
import org.apache.bcel.classfile.ConstantLong;
import org.apache.bcel.classfile.ConstantMethodref;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.LDC;
import org.apache.bcel.generic.LDC_W;
import org.apache.bcel.generic.Type;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LDC_ESTest extends LDC_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      MockPrintStream mockPrintStream0 = new MockPrintStream("pJQnM)");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      lDC_W0.dump(dataOutputStream0);
      ;
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W(255);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W(255);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      lDC_W0.setSize();
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LDC lDC0 = new LDC(3029);
      // Undeclared exception!
      try { 
        lDC0.setIndex((-1352));
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Negative index value: -1352
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LDC lDC0 = new LDC();
      // Undeclared exception!
      try { 
        lDC0.initFromFile((ByteSequence) null, false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      byte[] byteArray0 = new byte[1];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      try { 
        lDC_W0.initFromFile(byteSequence0, false);
        fail("Expecting exception: EOFException");
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      Constant[] constantArray0 = new Constant[3];
      ConstantClass constantClass0 = new ConstantClass((-10));
      constantArray0[0] = (Constant) constantClass0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        lDC_W0.getValue(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -10. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LDC lDC0 = new LDC();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        lDC0.getValue(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LDC lDC0 = new LDC(659);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        lDC0.getType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 659. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LDC lDC0 = new LDC();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        lDC0.getType(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LDC lDC0 = new LDC(19);
      // Undeclared exception!
      try { 
        lDC0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LDC lDC0 = new LDC();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        lDC0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LDC lDC0 = new LDC();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        lDC0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LDC lDC0 = null;
      try {
        lDC0 = new LDC((-128));
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Negative index value: -128
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LDC lDC0 = new LDC();
      Constant[] constantArray0 = new Constant[1];
      ConstantMethodref constantMethodref0 = new ConstantMethodref((-9), (-9));
      constantArray0[0] = (Constant) constantMethodref0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      // Undeclared exception!
      try { 
        lDC0.getType(constantPoolGen0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Unknown or invalid constant type at 0
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      Constant[] constantArray0 = new Constant[3];
      ConstantClass constantClass0 = new ConstantClass(0);
      constantArray0[0] = (Constant) constantClass0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = lDC_W0.getType(constantPoolGen0);
      assertNotNull(type0.getSignature());
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantDouble constantDouble0 = new ConstantDouble((-1357));
      constantArray0[0] = (Constant) constantDouble0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      LDC lDC0 = new LDC();
      // Undeclared exception!
      try { 
        lDC0.getType(constantPoolGen0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Unknown or invalid constant type at 0
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LDC lDC0 = new LDC();
      lDC0.setIndex(1);
      Constant[] constantArray0 = new Constant[5];
      ConstantLong constantLong0 = new ConstantLong((byte) (-99));
      constantArray0[1] = (Constant) constantLong0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        lDC0.getType(constantPoolGen0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Unknown or invalid constant type at 1
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      lDC_W0.setIndex(1);
      ConstantFloat constantFloat0 = new ConstantFloat(1);
      Constant[] constantArray0 = new Constant[5];
      constantArray0[1] = (Constant) constantFloat0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      lDC_W0.getType(constantPoolGen0);
      assertEquals(1, lDC_W0.getLength());
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LDC lDC0 = new LDC();
      Constant[] constantArray0 = new Constant[2];
      ConstantInteger constantInteger0 = new ConstantInteger(8);
      constantArray0[0] = (Constant) constantInteger0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      Type type0 = lDC0.getType(constantPoolGen0);
      assertNotNull(type0.getSignature());
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      Constant[] constantArray0 = new Constant[1];
      ConstantMethodref constantMethodref0 = new ConstantMethodref((-1729), (-1729));
      constantArray0[0] = (Constant) constantMethodref0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      // Undeclared exception!
      try { 
        lDC_W0.getValue(constantPoolGen0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Unknown or invalid constant type at 0
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      Constant[] constantArray0 = new Constant[3];
      ConstantClass constantClass0 = new ConstantClass(0);
      constantArray0[0] = (Constant) constantClass0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        lDC_W0.getValue(constantPoolGen0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantClass cannot be cast to org.apache.bcel.classfile.ConstantUtf8
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantDouble constantDouble0 = new ConstantDouble((-1367));
      constantArray0[0] = (Constant) constantDouble0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      LDC lDC0 = new LDC();
      // Undeclared exception!
      try { 
        lDC0.getValue(constantPoolGen0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Unknown or invalid constant type at 0
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      lDC_W0.setIndex(1);
      ConstantFloat constantFloat0 = new ConstantFloat(1);
      Constant[] constantArray0 = new Constant[5];
      constantArray0[1] = (Constant) constantFloat0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      lDC_W0.getValue(constantPoolGen0);
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LDC lDC0 = new LDC();
      lDC0.setIndex(1);
      Constant[] constantArray0 = new Constant[5];
      ConstantLong constantLong0 = new ConstantLong((byte) (-99));
      constantArray0[1] = (Constant) constantLong0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        lDC0.getValue(constantPoolGen0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Unknown or invalid constant type at 1
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LDC lDC0 = new LDC();
      Constant[] constantArray0 = new Constant[2];
      ConstantInteger constantInteger0 = new ConstantInteger(8);
      constantArray0[0] = (Constant) constantInteger0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      Object object0 = lDC0.getValue(constantPoolGen0);
      ;
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W(2216);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      lDC_W0.dump(dataOutputStream0);
      assertEquals(0, lDC_W0.getIndex());
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W(2216);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      lDC_W0.dump(dataOutputStream0);
      ;
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W(2216);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      lDC_W0.dump(dataOutputStream0);
      assertEquals(1, lDC_W0.getLength());
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LDC lDC0 = new LDC();
      byte[] byteArray0 = new byte[1];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      lDC0.initFromFile(byteSequence0, false);
      ;
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LDC lDC0 = new LDC();
      Class<?>[] classArray0 = lDC0.getExceptions();
      ;
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W(159);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Y(qxe>IdqKy3");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(objectOutputStream0);
      lDC_W0.dump(dataOutputStream0);
      assertEquals(1, lDC_W0.getLength());
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W(159);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Y(qxe>IdqKy3");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(objectOutputStream0);
      lDC_W0.dump(dataOutputStream0);
      assertEquals(0, lDC_W0.getIndex());
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W(159);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Y(qxe>IdqKy3");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(objectOutputStream0);
      lDC_W0.dump(dataOutputStream0);
      ;
}
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        lDC_W0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }
}
