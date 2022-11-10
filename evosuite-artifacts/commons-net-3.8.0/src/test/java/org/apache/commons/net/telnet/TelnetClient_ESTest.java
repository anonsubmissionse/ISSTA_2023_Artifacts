/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 20:55:09 GMT 2022
 */

package org.apache.commons.net.telnet;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.net.examples.telnet.TelnetClientExample;
import org.apache.commons.net.telnet.SimpleOptionHandler;
import org.apache.commons.net.telnet.TelnetClient;
import org.apache.commons.net.telnet.TelnetInputListener;
import org.apache.commons.net.telnet.TelnetOptionHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TelnetClient_ESTest extends TelnetClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      telnetClient0.setDo(70);
      boolean boolean0 = telnetClient0.getRemoteOptionState(70);
      assertTrue(telnetClient0.getReaderThread());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient("");
      SimpleOptionHandler simpleOptionHandler0 = new SimpleOptionHandler(81);
      telnetClient0.addOptionHandler(simpleOptionHandler0);
      telnetClient0.deleteOptionHandler(81);
      assertTrue(telnetClient0.getReaderThread());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      assertTrue(telnetClient0.getReaderThread());
      
      telnetClient0.setReaderThread(false);
      boolean boolean0 = telnetClient0.getReaderThread();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient((-1397));
      // Undeclared exception!
      try { 
        telnetClient0.getRemoteOptionState((-1397));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1397
         //
         verifyException("org.apache.commons.net.telnet.Telnet", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient(2635);
      // Undeclared exception!
      try { 
        telnetClient0.getLocalOptionState(2635);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2635
         //
         verifyException("org.apache.commons.net.telnet.Telnet", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      // Undeclared exception!
      try { 
        telnetClient0.deleteOptionHandler((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.net.telnet.Telnet", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient("j YK'Fk3+%\"D7@' ");
      SimpleOptionHandler simpleOptionHandler0 = new SimpleOptionHandler(1438);
      try { 
        telnetClient0.addOptionHandler(simpleOptionHandler0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid Option Code: 1438
         //
         verifyException("org.apache.commons.net.telnet.Telnet", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient("~H_.b", 0);
      // Undeclared exception!
      try { 
        telnetClient0.addOptionHandler((TelnetOptionHandler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.telnet.Telnet", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient("V_sU17TrlY~?)K(1");
      SimpleOptionHandler simpleOptionHandler0 = new SimpleOptionHandler((-1));
      // Undeclared exception!
      try { 
        telnetClient0.addOptionHandler(simpleOptionHandler0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.net.telnet.Telnet", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient("5NVDqH&2l\",8l-");
      // Undeclared exception!
      try { 
        telnetClient0._connectAction_();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.SocketClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      TelnetInputListener telnetInputListener0 = mock(TelnetInputListener.class, new ViolatedAssumptionAnswer());
      telnetClient0.registerInputListener(telnetInputListener0);
      telnetClient0.notifyInputListener();
      assertTrue(telnetClient0.getReaderThread());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient(0);
      telnetClient0.notifyInputListener();
      assertTrue(telnetClient0.getReaderThread());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      int[] intArray0 = new int[0];
      try { 
        telnetClient0.sendSubnegotiation(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero length message
         //
         verifyException("org.apache.commons.net.telnet.TelnetClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient(243);
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        telnetClient0.sendSubnegotiation(intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.telnet.Telnet", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      boolean boolean0 = telnetClient0.getRemoteOptionState(0);
      assertTrue(telnetClient0.getReaderThread());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      telnetClient0.setWill(38);
      boolean boolean0 = telnetClient0.getLocalOptionState(38);
      assertTrue(telnetClient0.getReaderThread());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      boolean boolean0 = telnetClient0.getLocalOptionState(3);
      assertFalse(boolean0);
      assertTrue(telnetClient0.getReaderThread());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      telnetClient0.disconnect();
      assertTrue(telnetClient0.getReaderThread());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      telnetClient0.closeOutputStream();
      assertTrue(telnetClient0.getReaderThread());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      try { 
        telnetClient0.flushOutputStream();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("org.apache.commons.net.telnet.TelnetClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      TelnetClientExample telnetClientExample0 = new TelnetClientExample();
      telnetClient0.registerNotifHandler(telnetClientExample0);
      assertTrue(telnetClient0.getReaderThread());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      boolean boolean0 = telnetClient0.getReaderThread();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      telnetClient0.setReaderThread(true);
      assertTrue(telnetClient0.getReaderThread());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      telnetClient0.getOutputStream();
      assertTrue(telnetClient0.getReaderThread());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      telnetClient0.unregisterNotifHandler();
      assertTrue(telnetClient0.getReaderThread());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      telnetClient0.unregisterInputListener();
      assertTrue(telnetClient0.getReaderThread());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      telnetClient0.getInputStream();
      assertTrue(telnetClient0.getReaderThread());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      // Undeclared exception!
      try { 
        telnetClient0.sendAYT(58);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.telnet.Telnet", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      telnetClient0.registerSpyStream((OutputStream) null);
      assertTrue(telnetClient0.getReaderThread());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient("org.apache.commons.io.filefilter.SizeFileFilter");
      try { 
        telnetClient0.deleteOptionHandler(0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unregistered option: 0
         //
         verifyException("org.apache.commons.net.telnet.Telnet", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient();
      telnetClient0.stopSpyStream();
      assertTrue(telnetClient0.getReaderThread());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TelnetClient telnetClient0 = new TelnetClient(0);
      // Undeclared exception!
      try { 
        telnetClient0.sendCommand((byte) (-49));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.telnet.Telnet", e);
      }
  }
}
