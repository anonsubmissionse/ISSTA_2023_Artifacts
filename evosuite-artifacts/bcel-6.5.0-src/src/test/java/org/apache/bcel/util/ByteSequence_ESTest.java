/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:48:58 GMT 2022
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.util.ByteSequence;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteSequence_ESTest extends ByteSequence_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      byteSequence0.skipBytes((byte)80);
      byteSequence0.unreadByte();
      assertEquals(1, byteSequence0.getIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      byteSequence0.readUnsignedByte();
      int int0 = byteSequence0.getIndex();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ByteSequence byteSequence0 = null;
      try {
        byteSequence0 = new ByteSequence((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      byteSequence0.unreadByte();
      assertEquals(0, byteSequence0.getIndex());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      int int0 = byteSequence0.getIndex();
      assertEquals(0, int0);
  }
}
