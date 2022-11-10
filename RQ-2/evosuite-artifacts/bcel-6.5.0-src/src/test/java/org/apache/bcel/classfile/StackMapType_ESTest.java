/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:18:20 GMT 2022
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.StackMapType;
import org.apache.bcel.util.ClassLoaderRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StackMapType_ESTest extends StackMapType_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)0, 1352, (ConstantPool) null);
      stackMapType0.setType((byte)0);
      assertNotNull(stackMapType0.getType());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)0, 1352, (ConstantPool) null);
      stackMapType0.setType((byte)0);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      StackMapType stackMapType0 = new StackMapType((byte)0, (byte)0, constantPool0);
      stackMapType0.getType();
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      StackMapType stackMapType0 = new StackMapType((byte)0, (byte)0, constantPool0);
      int int0 = stackMapType0.getIndex();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      StackMapType stackMapType0 = new StackMapType((byte)0, (byte)0, constantPool0);
      stackMapType0.getConstantPool();
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Constant[] constantArray0 = new Constant[7];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      StackMapType stackMapType0 = new StackMapType((byte)0, (byte)0, constantPool0);
      stackMapType0.getConstantPool();
      assertEquals(0, stackMapType0.getIndex());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)0, 1352, (ConstantPool) null);
      StackMapType stackMapType1 = stackMapType0.copy();
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      stackMapType0.setIndex((-2261));
      stackMapType0.copy();
      assertEquals(1, stackMapType0.getIndex());
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)7, (byte)7, (ConstantPool) null);
      // Undeclared exception!
      try { 
        stackMapType0.toString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.StackMapType", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Constant[] constantArray0 = new Constant[7];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      StackMapType stackMapType0 = new StackMapType((byte)0, (byte)0, constantPool0);
      // Undeclared exception!
      try { 
        stackMapType0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.StackMapType", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        stackMapType0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StackMapType stackMapType0 = null;
      try {
        stackMapType0 = new StackMapType((DataInput) null, (ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.StackMapType", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), (byte)1);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      StackMapType stackMapType0 = null;
      try {
        stackMapType0 = new StackMapType(dataInputStream0, (ConstantPool) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      StackMapType stackMapType0 = null;
      try {
        stackMapType0 = new StackMapType(dataInputStream0, constantPool0);
        fail("Expecting exception: IOException");
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)17, (byte) (-48));
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      StackMapType stackMapType0 = null;
      try {
        stackMapType0 = new StackMapType(dataInputStream0, (ConstantPool) null);
        fail("Expecting exception: EOFException");
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      StackMapType stackMapType0 = new StackMapType((byte)7, (byte)7, constantPool0);
      stackMapType0.hasIndex();
      assertEquals(0, stackMapType0.getIndex());
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      boolean boolean0 = stackMapType0.hasIndex();
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      boolean boolean0 = stackMapType0.hasIndex();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)0, 1352, (ConstantPool) null);
      stackMapType0.hasIndex();
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      StackMapType stackMapType0 = null;
      try {
        stackMapType0 = new StackMapType((byte)32, 7, constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal type for StackMapType: 32
         //
         verifyException("org.apache.bcel.classfile.StackMapType", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)1);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      StackMapType stackMapType0 = new StackMapType(dataInputStream0, (ConstantPool) null);
      int int0 = stackMapType0.getIndex();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      StackMapType stackMapType0 = new StackMapType((byte)0, (byte)0, constantPool0);
      String string0 = stackMapType0.toString();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      StackMapType stackMapType0 = new StackMapType((byte)0, (byte)0, constantPool0);
      String string0 = stackMapType0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      StackMapType stackMapType0 = new StackMapType((byte)7, 24, constantPool0);
      stackMapType0.setIndex((-377));
      stackMapType0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      StackMapType stackMapType0 = new StackMapType((byte)7, 24, constantPool0);
      // Undeclared exception!
      try { 
        stackMapType0.toString();
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 24. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream(141);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0, (byte)8);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      stackMapType0.dump(dataOutputStream0);
      assertTrue(stackMapType0.hasIndex());
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream(141);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0, (byte)8);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      stackMapType0.dump(dataOutputStream0);
      assertEquals(0, stackMapType0.getIndex());
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      StackMapType stackMapType0 = new StackMapType((byte)0, (byte)0, constantPool0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      stackMapType0.dump(dataOutputStream0);
      assertNotNull(byteArrayOutputStream0.toString());
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      StackMapType stackMapType0 = new StackMapType((byte)0, (byte)0, constantPool0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      stackMapType0.dump(dataOutputStream0);
      assertTrue(stackMapType0.hasIndex());
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, (byte)8, (ConstantPool) null);
      // Undeclared exception!
      try { 
        stackMapType0.setType((byte)50);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal type for StackMapType: 50
         //
         verifyException("org.apache.bcel.classfile.StackMapType", e);
      }
  }
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      stackMapType0.setType((byte)8);
      assertEquals(0, stackMapType0.getIndex());
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      stackMapType0.setType((byte)8);
      ;
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      // Undeclared exception!
      try { 
        stackMapType0.setType((byte) (-111));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal type for StackMapType: -111
         //
         verifyException("org.apache.bcel.classfile.StackMapType", e);
      }
  }
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)23;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)1);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      StackMapType stackMapType0 = null;
      try {
        stackMapType0 = new StackMapType(dataInputStream0, (ConstantPool) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal type for StackMapType: 23
         //
         verifyException("org.apache.bcel.classfile.StackMapType", e);
      }
  }
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StackMapType stackMapType0 = null;
      try {
        stackMapType0 = new StackMapType((byte) (-119), (byte) (-119), (ConstantPool) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal type for StackMapType: -119
         //
         verifyException("org.apache.bcel.classfile.StackMapType", e);
      }
  }
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<StackMapType> class0 = StackMapType.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      ;
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      ;
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      String string0 = stackMapType0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      byte byte0 = stackMapType0.getType();
      assertEquals(0, stackMapType0.getIndex());
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      byte byte0 = stackMapType0.getType();
      ;
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      int int0 = stackMapType0.getIndex();
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      int int0 = stackMapType0.getIndex();
      ;
}
 @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      stackMapType0.getConstantPool();
      assertEquals(0, stackMapType0.getIndex());
}
 @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      stackMapType0.getConstantPool();
      ;
}
 @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      stackMapType0.setConstantPool((ConstantPool) null);
      assertEquals(1, stackMapType0.getIndex());
}
 @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StackMapType stackMapType0 = new StackMapType((byte)8, 262, (ConstantPool) null);
      stackMapType0.setConstantPool((ConstantPool) null);
      assertNotNull(stackMapType0.getType());
}
 @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Constant[] constantArray0 = new Constant[7];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      StackMapType stackMapType0 = new StackMapType((byte)0, (byte)0, constantPool0);
      StackMapType stackMapType1 = stackMapType0.copy();
      ;
}
 @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Constant[] constantArray0 = new Constant[7];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      StackMapType stackMapType0 = new StackMapType((byte)0, (byte)0, constantPool0);
      StackMapType stackMapType1 = stackMapType0.copy();
      assertNotNull(stackMapType1.getType());
}
}
