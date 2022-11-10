/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 21:09:06 GMT 2022
 */

package org.apache.commons.net.ftp.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.parser.EnterpriseUnixFTPEntryParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EnterpriseUnixFTPEntryParser_ESTest extends EnterpriseUnixFTPEntryParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EnterpriseUnixFTPEntryParser enterpriseUnixFTPEntryParser0 = new EnterpriseUnixFTPEntryParser();
      // Undeclared exception!
      try { 
        enterpriseUnixFTPEntryParser0.parseFTPEntry((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EnterpriseUnixFTPEntryParser enterpriseUnixFTPEntryParser0 = new EnterpriseUnixFTPEntryParser();
      enterpriseUnixFTPEntryParser0.setRegex("Ss1a", 0);
      // Undeclared exception!
      try { 
        enterpriseUnixFTPEntryParser0.parseFTPEntry("Ss1a");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // No group 14
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EnterpriseUnixFTPEntryParser enterpriseUnixFTPEntryParser0 = new EnterpriseUnixFTPEntryParser();
      FTPFile fTPFile0 = enterpriseUnixFTPEntryParser0.parseFTPEntry("Ss1a");
      assertNull(fTPFile0);
  }
}
