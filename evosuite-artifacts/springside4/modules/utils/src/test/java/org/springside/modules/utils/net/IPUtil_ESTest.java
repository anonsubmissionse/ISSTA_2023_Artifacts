/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 07 03:58:20 GMT 2022
 */

package org.springside.modules.utils.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.junit.runner.RunWith;
import org.springside.modules.utils.net.IPUtil;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IPUtil_ESTest extends IPUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("com.google.common.base.CharMatcher");
      assertNull(inet4Address0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = IPUtil.intToIpv4String((-536870912));
      assertEquals("224.0.0.0", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      int int0 = IPUtil.toInt(inetAddress0);
      assertEquals(2130706433, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      int int0 = IPUtil.toInt(inetAddress0);
      assertEquals((-1062731478), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = IPUtil.ipv4StringToInt("255.255.243.62");
      assertEquals((-3266), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("192.168.1.42");
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertNotNull(inet4Address0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("224.0.0.0");
      assertNotNull(inet4Address0);
      assertTrue(inet4Address0.isMCLinkLocal());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("230.84.107.102");
      assertEquals("230.84.107.102", inet4Address0.getHostAddress());
      assertNotNull(inet4Address0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("127.0.0.1");
      assertNotNull(inet4Address0);
      assertEquals("/127.0.0.1", inet4Address0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("0.0.0.0");
      assertNotNull(inet4Address0);
      assertTrue(inet4Address0.isAnyLocalAddress());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InetAddress inetAddress0 = IPUtil.fromIpString("192.168.1.42");
      assertFalse(inetAddress0.isMulticastAddress());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InetAddress inetAddress0 = IPUtil.fromIpString("230.84.107.100");
      assertFalse(inetAddress0.isMCNodeLocal());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InetAddress inetAddress0 = IPUtil.fromIpString("127.0.1.1");
      assertFalse(inetAddress0.isMCGlobal());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InetAddress inetAddress0 = IPUtil.fromIpString("0.0.0.0");
      assertEquals("/0.0.0.0", inetAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InetAddress inetAddress0 = IPUtil.fromIpString("224.0.0.0");
      assertFalse(inetAddress0.isAnyLocalAddress());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromInt((-1062731478));
      assertEquals("/192.168.1.42", inet4Address0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromInt((-536870912));
      assertEquals("224.0.0.0", inet4Address0.getHostAddress());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromInt((-430675098));
      assertEquals("230.84.107.102", inet4Address0.getHostAddress());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromInt(2130706433);
      assertEquals("127.0.0.1", inet4Address0.getHostAddress());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromInt(0);
      assertEquals("/0.0.0.0", inet4Address0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        IPUtil.toString((InetAddress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        IPUtil.toInt((InetAddress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        IPUtil.ipv4StringToInt("comgoogle.common.base.CommonPattern");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"comgoogle\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        IPUtil.fromIpv4String("W*5~.~.f.z>OUC");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"W*5~\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        IPUtil.fromIpString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.net.InetAddresses", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        IPUtil.fromIpString("::");
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // java.net.UnknownHostException: Not IPv4: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = IPUtil.ipv4StringToInt((String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = IPUtil.ipv4StringToInt("Not a valid URI IP literal: '%s'");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = IPUtil.ipv4StringToInt("0.0.0.255");
      assertEquals(255, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IPUtil iPUtil0 = new IPUtil();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      String string0 = IPUtil.toString(inetAddress0);
      assertEquals("127.0.0.1", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        IPUtil.fromIpString("r_R_PUB");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'r_R_PUB' is not an IP string literal.
         //
         verifyException("com.google.common.net.InetAddresses", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = MockInetAddress.getByAddress("r~Ls(M2", byteArray0);
      int int0 = IPUtil.toInt(inetAddress0);
      assertEquals(0, int0);
  }
}
