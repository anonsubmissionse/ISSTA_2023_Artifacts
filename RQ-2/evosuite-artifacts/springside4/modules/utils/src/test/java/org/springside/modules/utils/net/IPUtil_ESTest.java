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
  public void test0()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("com.google.common.base.CharMatcher");
      assertNotNull(inet4Address0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = IPUtil.intToIpv4String((-536870912));
      assertNotNull(string0);
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      int int0 = IPUtil.toInt(inetAddress0);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      int int0 = IPUtil.toInt(inetAddress0);
      assertEquals(1, int0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = IPUtil.ipv4StringToInt("255.255.243.62");
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("192.168.1.42");
      ;
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("192.168.1.42");
      ;
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("224.0.0.0");
      ;
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("224.0.0.0");
      ;
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("230.84.107.102");
      ;
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("230.84.107.102");
      ;
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("127.0.0.1");
      ;
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("127.0.0.1");
      ;
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("0.0.0.0");
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromIpv4String("0.0.0.0");
      ;
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InetAddress inetAddress0 = IPUtil.fromIpString("192.168.1.42");
      assertFalse(inetAddress0.isMulticastAddress());
}
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InetAddress inetAddress0 = IPUtil.fromIpString("230.84.107.100");
      assertTrue(inetAddress0.isMCNodeLocal());
}
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InetAddress inetAddress0 = IPUtil.fromIpString("127.0.1.1");
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InetAddress inetAddress0 = IPUtil.fromIpString("0.0.0.0");
      ;
}
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InetAddress inetAddress0 = IPUtil.fromIpString("224.0.0.0");
      assertFalse(inetAddress0.isAnyLocalAddress());
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromInt((-1062731478));
      ;
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromInt((-536870912));
      ;
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromInt((-430675098));
      ;
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromInt(2130706433);
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Inet4Address inet4Address0 = IPUtil.fromInt(0);
      assertNotNull(inet4Address0.toString());
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      int int0 = IPUtil.ipv4StringToInt((String) null);
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = IPUtil.ipv4StringToInt("Not a valid URI IP literal: '%s'");
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = IPUtil.ipv4StringToInt("0.0.0.255");
      assertEquals(0, int0);
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IPUtil iPUtil0 = new IPUtil();
  }
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      String string0 = IPUtil.toString(inetAddress0);
      ;
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = MockInetAddress.getByAddress("r~Ls(M2", byteArray0);
      int int0 = IPUtil.toInt(inetAddress0);
      ;
}
}
