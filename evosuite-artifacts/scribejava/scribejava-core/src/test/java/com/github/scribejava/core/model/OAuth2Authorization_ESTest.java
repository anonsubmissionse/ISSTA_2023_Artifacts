/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 03:10:00 GMT 2022
 */

package com.github.scribejava.core.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.scribejava.core.model.OAuth2Authorization;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuth2Authorization_ESTest extends OAuth2Authorization_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OAuth2Authorization oAuth2Authorization0 = new OAuth2Authorization();
      oAuth2Authorization0.setState("*le\"pB}3}VUZ{T");
      String string0 = oAuth2Authorization0.getState();
      assertEquals("*le\"pB}3}VUZ{T", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OAuth2Authorization oAuth2Authorization0 = new OAuth2Authorization();
      oAuth2Authorization0.setState("");
      String string0 = oAuth2Authorization0.getState();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OAuth2Authorization oAuth2Authorization0 = new OAuth2Authorization();
      oAuth2Authorization0.setCode("$:3>s");
      String string0 = oAuth2Authorization0.getCode();
      assertEquals("$:3>s", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OAuth2Authorization oAuth2Authorization0 = new OAuth2Authorization();
      oAuth2Authorization0.setCode("");
      String string0 = oAuth2Authorization0.getCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OAuth2Authorization oAuth2Authorization0 = new OAuth2Authorization();
      String string0 = oAuth2Authorization0.getState();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OAuth2Authorization oAuth2Authorization0 = new OAuth2Authorization();
      String string0 = oAuth2Authorization0.getCode();
      assertNull(string0);
  }
}
