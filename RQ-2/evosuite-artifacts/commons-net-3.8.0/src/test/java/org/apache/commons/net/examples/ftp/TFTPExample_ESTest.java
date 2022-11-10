/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 20:47:52 GMT 2022
 */

package org.apache.commons.net.examples.ftp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.examples.ftp.TFTPExample;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TFTPExample_ESTest extends TFTPExample_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = ",2N*V3^P&:Q7 $<.F:~";
      stringArray0[1] = "-Error: could not open local file for reading.";
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-s";
      stringArray0[1] = "Usage: tftp [options] hostname localfile remotefile\n\nhostname   - The name of the remote host [:port]\nlocalfile  - The name of the local file to send or the name to use for\n\tthe received file\nremotefile - The name of the remote file to receive or the name for\n\tthe remote server to use to name the local file being sent.\n\noptions: (The default is to assume -r -b)\n\t-t timeout in seconds (default 60s)\n\t-s Send a local file\n\t-r Receive a remote file\n\t-a Use ASCII transfer mode\n\t-b Use binary transfer mode\n\t-v Verbose (trace packets)\n";
      stringArray0[2] = "Connection timed out.";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Connection timed out.");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Connection timed out.");
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-v";
      stringArray0[1] = "Bg8/YDD?8f{ByQ)AxT*";
      stringArray0[2] = "Bg8/YDD?8f{ByQ)AxT*";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Bg8");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "A");
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Error: could not open local file for writing.
         //
         verifyException("org.apache.commons.net.examples.ftp.TFTPExample", e);
      }
  }
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(" Sent: ");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = " Sent: ";
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = " Sent: ";
      stringArray0[2] = "lw<U].JF[\"ukg>>q";
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-s";
      stringArray0[1] = "Error: coul no, resolve hstate.";
      stringArray0[2] = "-s";
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
         //
         // Error: could not open local file for reading.
         //
         verifyException("org.apache.commons.net.examples.ftp.TFTPExample", e);
      }
  }
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-r";
      stringArray0[1] = "-t";
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "kI7P`$iqj #+D/MK!OC";
      stringArray0[1] = "ijYY74yA)_o?";
      stringArray0[2] = "Usage: tftp [options] hostname localfile remotefile\n\nhostname   - The name of the remote host [:port]\nlocalfile  - The name of the local file to send or the name to use for\n\tthe received file\nremotefile - The name of the remote file to receive or the name for\n\tthe remote server to use to name the local file being sent.\n\noptions: (The default is to assume -r -b)\n\t-t timeout in seconds (default 60s)\n\t-s Send a local file\n\t-r Receive a remote file\n\t-a Use ASCII transfer mode\n\t-b Use binary transfer mode\n\t-v Verbose (trace packets)\n";
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Eu:ould not o;en locl UP ockt.";
      stringArray0[1] = "Eu:ould not o;en locl UP ockt.";
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
         //
         // For input string: \"ould not o;en locl UP ockt.\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-s";
      stringArray0[1] = "Error: could not resolve hostname.";
      stringArray0[2] = "Connection timed out.";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Connection timed out.");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Connection timed out.");
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
         //
         // For input string: \" could not resolve hostname.\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-s";
      stringArray0[1] = "MS{]kxdoGi=SX";
      stringArray0[2] = "Connection timed out.";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Connection timed out.");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Connection timed out.");
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-a";
      stringArray0[1] = "Fvle write kailed.";
      stringArray0[2] = "";
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-s";
      stringArray0[1] = "Error: could not resolve hostname.";
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-u";
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-t";
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.net.examples.ftp.TFTPExample", e);
      }
  }
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-r";
      stringArray0[1] = "-r";
      stringArray0[2] = "-b";
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TFTPExample tFTPExample0 = new TFTPExample();
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-v";
      stringArray0[1] = "Bg8/YDD?8f{ByQ)AxT*";
      stringArray0[2] = "Bg8/YDD?8f{ByQ)AxT*";
      // Undeclared exception!
      try { 
        TFTPExample.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }
}
