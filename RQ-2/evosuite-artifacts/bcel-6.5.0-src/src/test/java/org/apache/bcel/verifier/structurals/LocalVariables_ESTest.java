/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 21:56:19 GMT 2022
 */

package org.apache.bcel.verifier.structurals;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.BasicType;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.ReturnaddressType;
import org.apache.bcel.generic.Type;
import org.apache.bcel.verifier.structurals.LocalVariables;
import org.apache.bcel.verifier.structurals.UninitializedObjectType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocalVariables_ESTest extends LocalVariables_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(66);
      LocalVariables localVariables1 = new LocalVariables(1744);
      // Undeclared exception!
      try { 
        localVariables0.merge(localVariables1);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: Merging LocalVariables of different size?!? From different methods or what?!?
         //
         verifyException("org.apache.bcel.verifier.structurals.LocalVariables", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(240);
      LocalVariables localVariables1 = new LocalVariables(784);
      boolean boolean0 = localVariables0.equals(localVariables1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(0);
      String string0 = localVariables0.toString();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(0);
      int int0 = localVariables0.maxLocals();
      ;
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(0);
      LocalVariables localVariables1 = localVariables0.getClone();
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(1876);
      ObjectType objectType0 = Type.STRINGBUFFER;
      localVariables0.set(176, objectType0);
      Type type0 = localVariables0.get(176);
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(1864);
      LocalVariables localVariables1 = localVariables0.getClone();
      boolean boolean0 = localVariables1.equals(localVariables0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(779);
      // Undeclared exception!
      try { 
        localVariables0.set(779, (Type) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 779
         //
         verifyException("org.apache.bcel.verifier.structurals.LocalVariables", e);
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(2958);
      LocalVariables localVariables1 = localVariables0.getClone();
      // Undeclared exception!
      localVariables1.merge(localVariables0);
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(1);
      localVariables0.set(0, (Type) null);
      // Undeclared exception!
      try { 
        localVariables0.merge(localVariables0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(4700);
      LocalVariables localVariables1 = localVariables0.getClone();
      // Undeclared exception!
      localVariables1.getClone();
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(2594);
      LocalVariables localVariables1 = localVariables0.getClone();
      localVariables1.equals(localVariables0);
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(6366);
      // Undeclared exception!
      localVariables0.clone();
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(32767);
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalVariables localVariables0 = null;
      try {
        localVariables0 = new LocalVariables((-353));
        fail("Expecting exception: NegativeArraySizeException");
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.LocalVariables", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(298);
      localVariables0.set(13, (Type) null);
      // Undeclared exception!
      try { 
        localVariables0.initializeObject((UninitializedObjectType) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.LocalVariables", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(298);
      String string0 = localVariables0.toString();
      ;
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(298);
      LocalVariables localVariables1 = localVariables0.getClone();
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(298);
      LocalVariables localVariables1 = localVariables0.getClone();
      ReturnaddressType returnaddressType0 = ReturnaddressType.NO_TARGET;
      localVariables1.set(0, returnaddressType0);
      localVariables0.merge(localVariables1);
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(82);
      LocalVariables localVariables1 = new LocalVariables(258);
      // Undeclared exception!
      try { 
        localVariables1.merge(localVariables0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: Merging LocalVariables of different size?!? From different methods or what?!?
         //
         verifyException("org.apache.bcel.verifier.structurals.LocalVariables", e);
      }
  }
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(298);
      Object object0 = localVariables0.clone();
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(298);
      Object object0 = localVariables0.clone();
      ReturnaddressType returnaddressType0 = ReturnaddressType.NO_TARGET;
      localVariables0.set(0, returnaddressType0);
      boolean boolean0 = localVariables0.equals(object0);
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(298);
      Object object0 = localVariables0.clone();
      ReturnaddressType returnaddressType0 = ReturnaddressType.NO_TARGET;
      localVariables0.set(0, returnaddressType0);
      boolean boolean0 = localVariables0.equals(object0);
      assertEquals(1, localVariables0.maxLocals());
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(298);
      Object object0 = localVariables0.clone();
      ReturnaddressType returnaddressType0 = ReturnaddressType.NO_TARGET;
      localVariables0.set(0, returnaddressType0);
      boolean boolean0 = localVariables0.equals(object0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(2102);
      LocalVariables localVariables1 = new LocalVariables(839);
      boolean boolean0 = localVariables0.equals(localVariables1);
      ;
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(2102);
      LocalVariables localVariables1 = new LocalVariables(839);
      boolean boolean0 = localVariables0.equals(localVariables1);
      assertEquals(0, localVariables1.maxLocals());
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(2102);
      LocalVariables localVariables1 = new LocalVariables(839);
      boolean boolean0 = localVariables0.equals(localVariables1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(82);
      boolean boolean0 = localVariables0.equals((Object) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(82);
      boolean boolean0 = localVariables0.equals((Object) null);
      assertEquals(0, localVariables0.maxLocals());
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(576);
      BasicType basicType0 = Type.CHAR;
      // Undeclared exception!
      try { 
        localVariables0.set(3699, basicType0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: LocalVariables do not know about 'char'. Use Type.INT instead.
         //
         verifyException("org.apache.bcel.verifier.structurals.LocalVariables", e);
      }
  }
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(1068);
      BasicType basicType0 = Type.BOOLEAN;
      // Undeclared exception!
      try { 
        localVariables0.set(1068, basicType0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: LocalVariables do not know about 'boolean'. Use Type.INT instead.
         //
         verifyException("org.apache.bcel.verifier.structurals.LocalVariables", e);
      }
  }
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(52);
      BasicType basicType0 = Type.SHORT;
      // Undeclared exception!
      try { 
        localVariables0.set(52, basicType0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: LocalVariables do not know about 'short'. Use Type.INT instead.
         //
         verifyException("org.apache.bcel.verifier.structurals.LocalVariables", e);
      }
  }
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(0);
      BasicType basicType0 = Type.BYTE;
      // Undeclared exception!
      try { 
        localVariables0.set((-2120), basicType0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: LocalVariables do not know about 'byte'. Use Type.INT instead.
         //
         verifyException("org.apache.bcel.verifier.structurals.LocalVariables", e);
      }
  }
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(298);
      localVariables0.hashCode();
      assertEquals(1, localVariables0.maxLocals());
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(298);
      // Undeclared exception!
      try { 
        localVariables0.get(298);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 298
         //
         verifyException("org.apache.bcel.verifier.structurals.LocalVariables", e);
      }
  }
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalVariables localVariables0 = new LocalVariables(109);
      int int0 = localVariables0.maxLocals();
      assertEquals(0, int0);
}
}
