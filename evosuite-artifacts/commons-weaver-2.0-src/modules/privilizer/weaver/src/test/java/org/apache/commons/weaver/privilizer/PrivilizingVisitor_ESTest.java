/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 17:01:48 GMT 2022
 */

package org.apache.commons.weaver.privilizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.weaver.privilizer.Privilizer;
import org.apache.commons.weaver.privilizer.PrivilizingVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;
import org.objectweb.asm.tree.MethodNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrivilizingVisitor_ESTest extends PrivilizingVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Method method0 = new Method("?P&zE1", type0, typeArray0);
      String[] stringArray0 = new String[3];
      MethodNode methodNode0 = new MethodNode(1, "fzTwwtmOIjD", (String) null, "03%$'5}SGmBhl<", stringArray0);
      GeneratorAdapter generatorAdapter0 = new GeneratorAdapter(54, method0, methodNode0);
      PrivilizingVisitor.checkSecurityManager(generatorAdapter0);
      assertEquals(156, GeneratorAdapter.GE);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrivilizingVisitor privilizingVisitor0 = null;
      try {
        privilizingVisitor0 = new PrivilizingVisitor((Privilizer) null, (ClassVisitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.weaver.privilizer.PrivilizingVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrivilizingVisitor.checkSecurityManager((GeneratorAdapter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.weaver.privilizer.PrivilizingVisitor", e);
      }
  }
}
