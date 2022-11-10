/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 01:08:51 GMT 2022
 */

package org.apache.commons.configuration2.interpol;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.configuration2.interpol.ConstantLookup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantLookup_ESTest extends ConstantLookup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConstantLookup constantLookup0 = new ConstantLookup();
      Class<?> class0 = constantLookup0.fetchClass("short");
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConstantLookup constantLookup0 = new ConstantLookup();
      Class<?> class0 = constantLookup0.fetchClass("org.apache.commons.configuration2.interpol.ConstantLookup");
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConstantLookup constantLookup0 = new ConstantLookup();
      try { 
        constantLookup0.resolveField((String) null, ",;");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConstantLookup constantLookup0 = new ConstantLookup();
      try { 
        constantLookup0.resolveField("org.apache.commons.configuration2.interpol.ConstantLookup", "");
        fail("Expecting exception: NoSuchFieldException");
      
      } catch(NoSuchFieldException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConstantLookup constantLookup0 = new ConstantLookup();
      // Undeclared exception!
      try { 
        constantLookup0.fetchClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ConstantLookup constantLookup0 = new ConstantLookup();
      try { 
        constantLookup0.fetchClass("cIzyf&]+");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ConstantLookup constantLookup0 = new ConstantLookup();
      Object object0 = constantLookup0.lookup((String) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ConstantLookup constantLookup0 = new ConstantLookup();
      Object object0 = constantLookup0.lookup("org.apache.commons.configuration2.interpol.ConstantLookup");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ConstantLookup.clear();
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ConstantLookup constantLookup0 = new ConstantLookup();
      try { 
        constantLookup0.resolveField(" `3G[%X`QA3D;7&A/,w", " `3G[%X`QA3D;7&A/,w");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }
}
