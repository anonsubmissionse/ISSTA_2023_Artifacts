/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 21:10:19 GMT 2022
 */

package org.apache.commons.net.nntp;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.net.nntp.SimpleNNTPHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNNTPHeader_ESTest extends SimpleNNTPHeader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNNTPHeader simpleNNTPHeader0 = new SimpleNNTPHeader((String) null, (String) null);
      simpleNNTPHeader0.addHeaderField("T\"\nEeVd7Hh", (String) null);
      assertNull(simpleNNTPHeader0.getSubject());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNNTPHeader simpleNNTPHeader0 = new SimpleNNTPHeader((String) null, (String) null);
      String string0 = simpleNNTPHeader0.getSubject();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNNTPHeader simpleNNTPHeader0 = new SimpleNNTPHeader("", "");
      String string0 = simpleNNTPHeader0.getSubject();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNNTPHeader simpleNNTPHeader0 = new SimpleNNTPHeader("VN}", "VN}");
      simpleNNTPHeader0.addNewsgroup("From: VN}\nNewsgroups: \nSubject: VN}\n\n");
      simpleNNTPHeader0.getNewsgroups();
      assertEquals("From: VN}\nNewsgroups: \nSubject: VN}\n\n", simpleNNTPHeader0.getNewsgroups());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNNTPHeader simpleNNTPHeader0 = new SimpleNNTPHeader((String) null, (String) null);
      String string0 = simpleNNTPHeader0.getFromAddress();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNNTPHeader simpleNNTPHeader0 = new SimpleNNTPHeader("", "SR#:3t$Mt4G_2w");
      String string0 = simpleNNTPHeader0.getFromAddress();
      assertEquals("SR#:3t$Mt4G_2w", simpleNNTPHeader0.getSubject());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNNTPHeader simpleNNTPHeader0 = new SimpleNNTPHeader("VN}", "VN}");
      String string0 = simpleNNTPHeader0.toString();
      assertEquals("From: VN}\nNewsgroups: \nSubject: VN}\n\n", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNNTPHeader simpleNNTPHeader0 = new SimpleNNTPHeader("VN}", "VN}");
      simpleNNTPHeader0.addNewsgroup("From: VN}\nNewsgroups: \nSubject: VN}\n\n");
      simpleNNTPHeader0.addNewsgroup("VN}");
      assertEquals("From: VN}\nNewsgroups: \nSubject: VN}\n\n,VN}", simpleNNTPHeader0.getNewsgroups());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNNTPHeader simpleNNTPHeader0 = new SimpleNNTPHeader("VN}", "VN}");
      simpleNNTPHeader0.addHeaderField("VN}", "VN}");
      String string0 = simpleNNTPHeader0.toString();
      assertEquals("From: VN}\nNewsgroups: \nSubject: VN}\nVN}: VN}\n\n", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNNTPHeader simpleNNTPHeader0 = new SimpleNNTPHeader("VN}", "VN}");
      String string0 = simpleNNTPHeader0.getSubject();
      assertEquals("VN}", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNNTPHeader simpleNNTPHeader0 = new SimpleNNTPHeader("VN}", "VN}");
      String string0 = simpleNNTPHeader0.getFromAddress();
      assertEquals("VN}", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNNTPHeader simpleNNTPHeader0 = new SimpleNNTPHeader("VN}", "VN}");
      String string0 = simpleNNTPHeader0.getNewsgroups();
      assertEquals("", string0);
  }
}
