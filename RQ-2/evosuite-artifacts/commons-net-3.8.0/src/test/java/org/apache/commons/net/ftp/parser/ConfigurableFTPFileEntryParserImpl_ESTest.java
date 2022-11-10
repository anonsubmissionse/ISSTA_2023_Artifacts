/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 21:08:07 GMT 2022
 */

package org.apache.commons.net.ftp.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.util.Calendar;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.parser.MVSFTPEntryParser;
import org.apache.commons.net.ftp.parser.NTFTPEntryParser;
import org.apache.commons.net.ftp.parser.OS2FTPEntryParser;
import org.apache.commons.net.ftp.parser.OS400FTPEntryParser;
import org.apache.commons.net.ftp.parser.UnixFTPEntryParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConfigurableFTPFileEntryParserImpl_ESTest extends ConfigurableFTPFileEntryParserImpl_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FTPClientConfig fTPClientConfig0 = new FTPClientConfig("", "", (String) null);
      OS400FTPEntryParser oS400FTPEntryParser0 = new OS400FTPEntryParser(fTPClientConfig0);
      Calendar calendar0 = oS400FTPEntryParser0.parseTimestamp("");
      assertTrue(calendar0.isLenient());
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FTPClientConfig fTPClientConfig0 = UnixFTPEntryParser.NUMERIC_DATE_CONFIG;
      UnixFTPEntryParser unixFTPEntryParser0 = new UnixFTPEntryParser(fTPClientConfig0, false);
      // Undeclared exception!
      try { 
        unixFTPEntryParser0.parseTimestamp((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MVSFTPEntryParser mVSFTPEntryParser0 = new MVSFTPEntryParser();
      FTPClientConfig fTPClientConfig0 = new FTPClientConfig((String) null, "~TKsQX6m584\"y0pHC", "FzG$f$R]vl}]", "", "", "PnfqBpJMK*,n2m#5@", false, false);
      // Undeclared exception!
      try { 
        mVSFTPEntryParser0.configure(fTPClientConfig0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // expecting a pipe-delimited string containing 12 tokens
         //
         verifyException("org.apache.commons.net.ftp.FTPClientConfig", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NTFTPEntryParser nTFTPEntryParser0 = new NTFTPEntryParser();
      FTPClientConfig fTPClientConfig0 = new FTPClientConfig("");
      nTFTPEntryParser0.configure(fTPClientConfig0);
      assertFalse(fTPClientConfig0.getUnparseableEntries());
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OS2FTPEntryParser oS2FTPEntryParser0 = new OS2FTPEntryParser();
      oS2FTPEntryParser0.configure((FTPClientConfig) null);
      ;
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NTFTPEntryParser nTFTPEntryParser0 = new NTFTPEntryParser();
      FTPClientConfig fTPClientConfig0 = new FTPClientConfig("org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl", "org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl", "org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl");
      // Undeclared exception!
      try { 
        nTFTPEntryParser0.configure(fTPClientConfig0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'o'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FTPClientConfig fTPClientConfig0 = new FTPClientConfig();
      UnixFTPEntryParser unixFTPEntryParser0 = new UnixFTPEntryParser(fTPClientConfig0);
      try { 
        unixFTPEntryParser0.parseTimestamp("The size must be non-negative");
        fail("Expecting exception: ParseException");
      } catch(ParseException e) {
         //
         // Timestamp 'The size must be non-negative' could not be parsed using a server time of Fri Feb 14 20:21:21 GMT 2014
         //
         verifyException("org.apache.commons.net.ftp.parser.FTPTimestampParserImpl", e);
      }
  }
}
