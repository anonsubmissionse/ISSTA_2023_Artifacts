/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 20:33:12 GMT 2022
 */

package org.apache.commons.net.examples.mail;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.commons.net.examples.mail.IMAPImportMbox;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IMAPImportMbox_ESTest extends IMAPImportMbox_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        IMAPImportMbox.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "From S+ +S+ (S+)  ?(S+) (S+) (S+)";
      try { 
        IMAPImportMbox.main(stringArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot read mailbox file: From S+ +S+ (S+)  ?(S+) (S+) (S+)
         //
         verifyException("org.apache.commons.net.examples.mail.IMAPImportMbox", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "[#_";
      // Undeclared exception!
      try { 
        IMAPImportMbox.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in path at index 0: [#_
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[4];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("0");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "SP\"c@(BlorSnw7}9(K&");
      stringArray0[0] = "0";
      stringArray0[1] = "0";
      stringArray0[2] = "0";
      stringArray0[3] = "";
      // Undeclared exception!
      try { 
        IMAPImportMbox.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing userInfo details
         //
         verifyException("org.apache.commons.net.examples.mail.IMAPUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      try { 
        IMAPImportMbox.main(stringArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot read mailbox file: 
         //
         verifyException("org.apache.commons.net.examples.mail.IMAPImportMbox", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        IMAPImportMbox.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IMAPImportMbox iMAPImportMbox0 = new IMAPImportMbox();
  }
}
