/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 15:54:16 GMT 2022
 */

package org.apache.commons.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.validator.Arg;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Arg_ESTest extends Arg_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Arg arg0 = new Arg();
      arg0.key = "fRP2";
      String string0 = arg0.toString();
      assertEquals("Arg: name=null  key=fRP2  position=-1  bundle=null  resource=true\n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Arg arg0 = new Arg();
      arg0.name = "E.6[& `:!sk)&foPP`";
      String string0 = arg0.toString();
      assertEquals("Arg: name=E.6[& `:!sk)&foPP`  key=null  position=-1  bundle=null  resource=true\n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Arg arg0 = new Arg();
      assertEquals((-1), arg0.getPosition());
      
      arg0.position = 0;
      int int0 = arg0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Arg arg0 = new Arg();
      assertEquals((-1), arg0.getPosition());
      
      arg0.setPosition(1);
      int int0 = arg0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Arg arg0 = new Arg();
      arg0.setName("");
      String string0 = arg0.getName();
      assertNotNull(string0);
      assertEquals((-1), arg0.getPosition());
      assertTrue(arg0.isResource());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Arg arg0 = new Arg();
      arg0.key = "fRP2";
      String string0 = arg0.getKey();
      assertEquals((-1), arg0.getPosition());
      assertNotNull(string0);
      assertTrue(arg0.isResource());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Arg arg0 = new Arg();
      arg0.setKey("");
      String string0 = arg0.getKey();
      assertTrue(arg0.isResource());
      assertEquals((-1), arg0.getPosition());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Arg arg0 = new Arg();
      arg0.setBundle("Arg: name=null  key=null  position=-1  bundle=null  resource=true\n");
      String string0 = arg0.getBundle();
      assertEquals((-1), arg0.getPosition());
      assertTrue(arg0.isResource());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Arg arg0 = new Arg();
      arg0.setBundle("");
      String string0 = arg0.getBundle();
      assertEquals((-1), arg0.getPosition());
      assertNotNull(string0);
      assertTrue(arg0.isResource());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Arg arg0 = new Arg();
      int int0 = arg0.getPosition();
      assertEquals((-1), int0);
      assertTrue(arg0.isResource());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Arg arg0 = new Arg();
      arg0.setName("qN|pu*");
      String string0 = arg0.getName();
      assertNotNull(string0);
      assertTrue(arg0.isResource());
      assertEquals((-1), arg0.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Arg arg0 = new Arg();
      arg0.getBundle();
      assertTrue(arg0.isResource());
      assertEquals((-1), arg0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Arg arg0 = new Arg();
      arg0.getName();
      assertEquals((-1), arg0.getPosition());
      assertTrue(arg0.isResource());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Arg arg0 = new Arg();
      Arg arg1 = (Arg)arg0.clone();
      assertTrue(arg1.isResource());
      assertEquals((-1), arg1.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Arg arg0 = new Arg();
      boolean boolean0 = arg0.isResource();
      assertEquals((-1), arg0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Arg arg0 = new Arg();
      arg0.getKey();
      assertTrue(arg0.isResource());
      assertEquals((-1), arg0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Arg arg0 = new Arg();
      assertTrue(arg0.isResource());
      
      arg0.setResource(false);
      boolean boolean0 = arg0.isResource();
      assertFalse(boolean0);
  }
}
