/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 11 21:59:39 GMT 2022
 */

package org.apache.commons.jcs3.utils.config;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jcs3.utils.config.PropertySetterException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertySetterException_ESTest extends PropertySetterException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PropertySetterException propertySetterException0 = new PropertySetterException((String) null);
      String string0 = propertySetterException0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PropertySetterException propertySetterException0 = new PropertySetterException("Nl;\"3rTy^uvq(");
      String string0 = propertySetterException0.getMessage();
      assertEquals("Nl;\"3rTy^uvq(", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PropertySetterException propertySetterException0 = new PropertySetterException("Nl;\"3rTy^uvq(");
      PropertySetterException propertySetterException1 = new PropertySetterException(propertySetterException0);
      String string0 = propertySetterException1.getMessage();
      assertEquals("Nl;\"3rTy^uvq(", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PropertySetterException propertySetterException0 = new PropertySetterException("");
      String string0 = propertySetterException0.getMessage();
      assertEquals("", string0);
  }
}
