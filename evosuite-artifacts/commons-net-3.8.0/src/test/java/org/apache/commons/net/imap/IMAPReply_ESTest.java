/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 21:02:07 GMT 2022
 */

package org.apache.commons.net.imap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.commons.net.imap.IMAPReply;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IMAPReply_ESTest extends IMAPReply_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = IMAPReply.isContinuation(1085);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = IMAPReply.isSuccess(434);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = IMAPReply.isUntagged("* ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = IMAPReply.isUntagged("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = IMAPReply.isContinuation("+N|/M$^EiA");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = IMAPReply.getReplyCode("+");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        IMAPReply.literalCount((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        IMAPReply.isContinuation((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        IMAPReply.getUntaggedReplyCode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        IMAPReply.getReplyCode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = IMAPReply.isContinuation("org.apache.commons.net.MalformedServerReplyException");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = IMAPReply.isContinuation(3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = IMAPReply.isContinuation((-2173));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = IMAPReply.isSuccess(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = IMAPReply.isSuccess((-749));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = IMAPReply.getUntaggedReplyCode("+");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = IMAPReply.literalCount("+");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        IMAPReply.getReplyCode("Jc\u0000");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Received unexpected IMAP protocol response from server: 'Jc\u0000'.
         //
         verifyException("org.apache.commons.net.imap.IMAPReply", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        IMAPReply.getUntaggedReplyCode("org.apache.commons.net.MalformedServerReplyException");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Received unexpected IMAP protocol response from server: 'org.apache.commons.net.MalformedServerReplyException'.
         //
         verifyException("org.apache.commons.net.imap.IMAPReply", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        IMAPReply.isUntagged((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
