/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 09 18:26:51 GMT 2022
 */

package org.apache.commons.beanutils.converters;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.beanutils.converters.CharacterArrayConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CharacterArrayConverter_ESTest extends CharacterArrayConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharacterArrayConverter characterArrayConverter0 = new CharacterArrayConverter("");
      Class<Object> class0 = Object.class;
      Object object0 = new Object();
      Object object1 = characterArrayConverter0.convert(class0, object0);
      assertEquals("", object1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharacterArrayConverter characterArrayConverter0 = new CharacterArrayConverter();
      Class<Integer> class0 = Integer.class;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        characterArrayConverter0.convert(class0, object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.Object@0000000002
         //
         verifyException("org.apache.commons.beanutils.converters.CharacterArrayConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<String> class0 = String.class;
      CharacterArrayConverter characterArrayConverter0 = new CharacterArrayConverter(class0);
      Class class1 = (Class)characterArrayConverter0.convert(class0, (Object) null);
      assertFalse(class1.isEnum());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CharacterArrayConverter characterArrayConverter0 = new CharacterArrayConverter();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        characterArrayConverter0.convert(class0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value specified
         //
         verifyException("org.apache.commons.beanutils.converters.CharacterArrayConverter", e);
      }
  }
}
