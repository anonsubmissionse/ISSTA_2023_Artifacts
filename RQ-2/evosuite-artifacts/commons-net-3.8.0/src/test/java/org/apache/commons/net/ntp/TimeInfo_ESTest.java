/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 20:38:35 GMT 2022
 */

package org.apache.commons.net.ntp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.time.ZoneId;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.net.ntp.NtpV3Impl;
import org.apache.commons.net.ntp.NtpV3Packet;
import org.apache.commons.net.ntp.TimeInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeInfo_ESTest extends TimeInfo_ESTest_scaffolding {

 @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 3841L);
      List<String> list0 = timeInfo0.getComments();
      assertNotNull(list0);
}
 @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 3841L);
      List<String> list0 = timeInfo0.getComments();
      TimeInfo timeInfo1 = new TimeInfo(ntpV3Impl0, 0L, list0, false);
      boolean boolean0 = timeInfo0.equals(timeInfo1);
      ;
}
 @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 3841L);
      List<String> list0 = timeInfo0.getComments();
      TimeInfo timeInfo1 = new TimeInfo(ntpV3Impl0, 0L, list0, false);
      boolean boolean0 = timeInfo0.equals(timeInfo1);
      ;
}
 @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 3841L);
      List<String> list0 = timeInfo0.getComments();
      TimeInfo timeInfo1 = new TimeInfo(ntpV3Impl0, 0L, list0, false);
      boolean boolean0 = timeInfo0.equals(timeInfo1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 3841L);
      List<String> list0 = timeInfo0.getComments();
      TimeInfo timeInfo1 = new TimeInfo(ntpV3Impl0, 0L, list0, false);
      boolean boolean0 = timeInfo0.equals(timeInfo1);
      assertEquals(0, timeInfo0.getReturnTime());
}
 @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 0L, linkedList0);
      timeInfo0.getReturnTime();
      assertEquals(1, linkedList0.size());
}
 @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-2715L), linkedList0, true);
      long long0 = timeInfo0.getReturnTime();
      assertEquals(0, linkedList0.size());
}
 @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-2715L), linkedList0, true);
      long long0 = timeInfo0.getReturnTime();
      assertEquals(1, long0);
}
 @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.CHINA;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 1896L, list0, false);
      List<String> list1 = timeInfo0.getComments();
      assertEquals(1, timeInfo0.getReturnTime());
}
 @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.CHINA;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 1896L, list0, false);
      List<String> list1 = timeInfo0.getComments();
      assertEquals(0, list1.size());
}
 @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 0L, linkedList0);
      DatagramPacket datagramPacket0 = ntpV3Impl0.getDatagramPacket();
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress((InetAddress) null, 427);
      datagramPacket0.setSocketAddress(mockInetSocketAddress0);
      timeInfo0.getAddress();
      assertEquals(0, linkedList0.size());
}
 @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 110L);
      DatagramPacket datagramPacket0 = ntpV3Impl0.getDatagramPacket();
      SocketAddress socketAddress0 = datagramPacket0.getSocketAddress();
      datagramPacket0.setSocketAddress(socketAddress0);
      InetAddress inetAddress0 = timeInfo0.getAddress();
      assertEquals(1, timeInfo0.getReturnTime());
}
 @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 110L);
      DatagramPacket datagramPacket0 = ntpV3Impl0.getDatagramPacket();
      SocketAddress socketAddress0 = datagramPacket0.getSocketAddress();
      datagramPacket0.setSocketAddress(socketAddress0);
      InetAddress inetAddress0 = timeInfo0.getAddress();
      assertNotNull(inetAddress0);
}
 @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      DatagramPacket datagramPacket0 = ntpV3Impl0.getDatagramPacket();
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      datagramPacket0.setAddress(inetAddress0);
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-1103L), false);
      InetAddress inetAddress1 = timeInfo0.getAddress();
      ;
}
 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      DatagramPacket datagramPacket0 = ntpV3Impl0.getDatagramPacket();
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      datagramPacket0.setAddress(inetAddress0);
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-1103L), false);
      InetAddress inetAddress1 = timeInfo0.getAddress();
      assertEquals(1, timeInfo0.getReturnTime());
}
 @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeInfo timeInfo0 = null;
      try {
        timeInfo0 = new TimeInfo((NtpV3Packet) null, (-185L), false);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // message cannot be null
         //
         verifyException("org.apache.commons.net.ntp.TimeInfo", e);
      }
  }
 @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeInfo timeInfo0 = null;
      try {
        timeInfo0 = new TimeInfo((NtpV3Packet) null, (-1406L));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // message cannot be null
         //
         verifyException("org.apache.commons.net.ntp.TimeInfo", e);
      }
  }
 @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 222L, linkedList0, false);
      timeInfo0.computeDetails();
      ;
}
 @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      TimeInfo timeInfo0 = null;
      try {
        timeInfo0 = new TimeInfo((NtpV3Packet) null, (-2455L), list0, false);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // message cannot be null
         //
         verifyException("org.apache.commons.net.ntp.TimeInfo", e);
      }
  }
 @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-2208988800011L), false);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      TimeInfo timeInfo1 = new TimeInfo(ntpV3Impl0, 303L, linkedList0);
      boolean boolean0 = timeInfo0.equals(timeInfo1);
      assertEquals(0, linkedList0.size());
}
 @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-2208988800011L), false);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      TimeInfo timeInfo1 = new TimeInfo(ntpV3Impl0, 303L, linkedList0);
      boolean boolean0 = timeInfo0.equals(timeInfo1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 221L);
      List<String> list0 = timeInfo0.getComments();
      assertNotNull(list0);
}
 @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 221L);
      List<String> list0 = timeInfo0.getComments();
      boolean boolean0 = timeInfo0.equals(list0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 221L);
      List<String> list0 = timeInfo0.getComments();
      boolean boolean0 = timeInfo0.equals(list0);
      ;
}
 @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 221L);
      List<String> list0 = timeInfo0.getComments();
      boolean boolean0 = timeInfo0.equals(list0);
      assertEquals(1, timeInfo0.getReturnTime());
}
 @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 222L, linkedList0, false);
      TimeInfo timeInfo1 = new TimeInfo(ntpV3Impl0, 222L, linkedList0);
      boolean boolean0 = timeInfo0.equals(timeInfo1);
      assertEquals(0, linkedList0.size());
}
 @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 222L, linkedList0, false);
      TimeInfo timeInfo1 = new TimeInfo(ntpV3Impl0, 222L, linkedList0);
      boolean boolean0 = timeInfo0.equals(timeInfo1);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-2583L), linkedList0, true);
      boolean boolean0 = timeInfo0.equals(timeInfo0);
      assertEquals(0, linkedList0.size());
}
 @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-2583L), linkedList0, true);
      boolean boolean0 = timeInfo0.equals(timeInfo0);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 0L);
      boolean boolean0 = timeInfo0.equals((Object) null);
      assertTrue(boolean0);
}
 @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-1L), false);
      timeInfo0.getAddress();
      assertEquals(0, timeInfo0.getReturnTime());
}
 @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-1L), false);
      timeInfo0.computeDetails();
      timeInfo0.computeDetails();
      assertEquals(1, timeInfo0.getReturnTime());
}
 @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-2208988800011L), false);
      timeInfo0.addComment("[3hyH&(\"-");
      assertEquals(0, timeInfo0.getReturnTime());
}
 @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-1L), false);
      timeInfo0.computeDetails();
      timeInfo0.addComment("The list of prefixes must not be null");
      assertEquals(0, timeInfo0.getReturnTime());
}
 @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      TimeInfo timeInfo0 = null;
      try {
        timeInfo0 = new TimeInfo((NtpV3Packet) null, (-3051L), linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
         //
         // message cannot be null
         //
         verifyException("org.apache.commons.net.ntp.TimeInfo", e);
      }
  }
 @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 221L);
      timeInfo0.getDelay();
      assertEquals(0, timeInfo0.getReturnTime());
}
 @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-1L), false);
      List<String> list0 = timeInfo0.getComments();
      assertEquals(0, timeInfo0.getReturnTime());
}
 @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-1L), false);
      List<String> list0 = timeInfo0.getComments();
      assertNotNull(list0);
}
 @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-2583L), linkedList0, true);
      timeInfo0.hashCode();
      ;
}
 @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 965L);
      timeInfo0.getMessage();
      assertEquals(1, timeInfo0.getReturnTime());
}
 @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, (-2583L), linkedList0, true);
      timeInfo0.getOffset();
      assertEquals(0, linkedList0.size());
}
 @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NtpV3Impl ntpV3Impl0 = new NtpV3Impl();
      TimeInfo timeInfo0 = new TimeInfo(ntpV3Impl0, 965L);
      long long0 = timeInfo0.getReturnTime();
      assertEquals(1, long0);
}
}
