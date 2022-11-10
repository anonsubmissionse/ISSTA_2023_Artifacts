/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 21:02:47 GMT 2022
 */

package org.apache.commons.net.nntp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.net.nntp.ReplyIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReplyIterator_ESTest extends ReplyIterator_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReplyIterator replyIterator0 = null;
      try {
        replyIterator0 = new ReplyIterator((BufferedReader) null, false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.ReplyIterator", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 1);
      stringReader0.close();
      ReplyIterator replyIterator0 = null;
      try {
        replyIterator0 = new ReplyIterator(bufferedReader0, false);
        fail("Expecting exception: IOException");
      } catch(Throwable e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringReader stringReader0 = new StringReader("4@2}ES!:m1ItsCdnT");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 720);
      bufferedReader0.close();
      ReplyIterator replyIterator0 = null;
      try {
        replyIterator0 = new ReplyIterator(bufferedReader0);
        fail("Expecting exception: IOException");
      } catch(Throwable e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedReader", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.netio.Uil");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 640);
      ReplyIterator replyIterator0 = new ReplyIterator(bufferedReader0);
      replyIterator0.next();
      try { 
        replyIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.ReplyIterator", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringReader stringReader0 = new StringReader("jD");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 4181);
      ReplyIterator replyIterator0 = new ReplyIterator(bufferedReader0, false);
      bufferedReader0.close();
      replyIterator0.next();
      try { 
        replyIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
         //
         // java.io.IOException: Stream closed
         //
         verifyException("org.apache.commons.net.nntp.ReplyIterator", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.netio.Uil");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 640);
      ReplyIterator replyIterator0 = new ReplyIterator(bufferedReader0);
      replyIterator0.next();
      boolean boolean0 = replyIterator0.hasNext();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringReader stringReader0 = new StringReader("0E#,59");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 4203);
      ReplyIterator replyIterator0 = new ReplyIterator(bufferedReader0, false);
      bufferedReader0.close();
      replyIterator0.next();
      // Undeclared exception!
      try { 
        replyIterator0.hasNext();
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
         //
         // java.io.IOException: Stream closed
         //
         verifyException("org.apache.commons.net.nntp.ReplyIterator", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.netio.Uil");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 640);
      ReplyIterator replyIterator0 = new ReplyIterator(bufferedReader0);
      boolean boolean0 = replyIterator0.hasNext();
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StringReader stringReader0 = new StringReader("..+8CCjNa|6=Y\"(*c@");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 1);
      ReplyIterator replyIterator0 = new ReplyIterator(bufferedReader0, false);
      stringReader0.reset();
      String string0 = replyIterator0.next();
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      ReplyIterator replyIterator0 = new ReplyIterator(bufferedReader0);
      // Undeclared exception!
      try { 
        replyIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.nntp.ReplyIterator", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.netio.Uil");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 640);
      ReplyIterator replyIterator0 = new ReplyIterator(bufferedReader0);
      Iterator<String> iterator0 = replyIterator0.iterator();
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ReplyIterator replyIterator0 = null;
      try {
        replyIterator0 = new ReplyIterator((BufferedReader) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }
}
