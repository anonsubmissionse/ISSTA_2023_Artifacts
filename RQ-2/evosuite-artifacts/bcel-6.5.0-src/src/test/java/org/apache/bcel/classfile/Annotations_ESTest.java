/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 22:31:05 GMT 2022
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInput;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.RuntimeInvisibleAnnotations;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Annotations_ESTest extends Annotations_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Constant[] constantArray0 = new Constant[4];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      RuntimeInvisibleAnnotations runtimeInvisibleAnnotations0 = null;
      try {
        runtimeInvisibleAnnotations0 = new RuntimeInvisibleAnnotations((-1519), (-1519), (DataInput) null, constantPool0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Annotations", e);
      }
  }
}
