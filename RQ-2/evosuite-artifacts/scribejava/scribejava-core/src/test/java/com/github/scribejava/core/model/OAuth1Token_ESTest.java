/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 12 03:07:00 GMT 2022
 */

package com.github.scribejava.core.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.scribejava.core.model.OAuth1AccessToken;
import com.github.scribejava.core.model.OAuth1RequestToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OAuth1Token_ESTest extends OAuth1Token_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OAuth1RequestToken oAuth1RequestToken0 = new OAuth1RequestToken("", "");
      oAuth1RequestToken0.getTokenSecret();
      assertTrue(oAuth1RequestToken0.isEmpty());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OAuth1RequestToken oAuth1RequestToken0 = new OAuth1RequestToken("kfi]+1", "kfi]+1");
      String string0 = oAuth1RequestToken0.getToken();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OAuth1RequestToken oAuth1RequestToken0 = new OAuth1RequestToken("", "");
      oAuth1RequestToken0.getToken();
      assertFalse(oAuth1RequestToken0.isEmpty());
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OAuth1RequestToken oAuth1RequestToken0 = new OAuth1RequestToken("", "");
      boolean boolean0 = oAuth1RequestToken0.isEmpty();
      assertFalse(boolean0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("", "f", "f");
      boolean boolean0 = oAuth1AccessToken0.isEmpty();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("", "f", "f");
      boolean boolean0 = oAuth1AccessToken0.isEmpty();
      assertNotNull(oAuth1AccessToken0.getToken());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OAuth1RequestToken oAuth1RequestToken0 = new OAuth1RequestToken(".", ".", ".");
      boolean boolean0 = oAuth1RequestToken0.isEmpty();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("", "f", "f");
      String string0 = oAuth1AccessToken0.getTokenSecret();
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      OAuth1AccessToken oAuth1AccessToken0 = new OAuth1AccessToken("", "f", "f");
      String string0 = oAuth1AccessToken0.getTokenSecret();
      assertNotNull(oAuth1AccessToken0.getToken());
}
}
