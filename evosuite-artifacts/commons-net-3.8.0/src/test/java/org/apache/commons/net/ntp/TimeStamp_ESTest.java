/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 10 20:50:50 GMT 2022
 */

package org.apache.commons.net.ntp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.apache.commons.net.ntp.TimeStamp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeStamp_ESTest extends TimeStamp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
      timeStamp0.hashCode();
      assertEquals((-2978857094563003106L), timeStamp0.ntpValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = TimeStamp.toNtpTime((-8959209424988982477L));
      assertEquals((-2048699400L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long long0 = TimeStamp.getTime(2085978496000L);
      assertEquals(2085978981680L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long long0 = TimeStamp.toNtpTime(2085978496000L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long long0 = TimeStamp.toNtpTime(2085978496839L);
      assertEquals(3603477561L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.parseNtpString("");
      TimeStamp timeStamp1 = TimeStamp.getNtpTime(0L);
      boolean boolean0 = timeStamp1.equals(timeStamp0);
      assertEquals((-8959209420479266816L), timeStamp1.ntpValue());
      assertFalse(timeStamp0.equals((Object)timeStamp1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.parseNtpString("83aa7e80.00000000");
      assertEquals((-8959209420479266816L), timeStamp0.ntpValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.parseNtpString("83aa7e7d.a872b020");
      assertEquals((-2342L), timeStamp0.getTime());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeStamp timeStamp0 = new TimeStamp(0L);
      long long0 = timeStamp0.ntpValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeStamp timeStamp0 = new TimeStamp(2645L);
      long long0 = timeStamp0.ntpValue();
      assertEquals(2645L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long long0 = TimeStamp.getTime((-8959209420479266816L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      long long0 = TimeStamp.getTime((-8959209420530806424L));
      assertEquals((-12L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.getNtpTime(0L);
      long long0 = timeStamp0.getTime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.getNtpTime((-1874L));
      long long0 = timeStamp0.getTime();
      assertEquals(541165879L, timeStamp0.getFraction());
      assertEquals((-1874L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeStamp timeStamp0 = new TimeStamp(0L);
      long long0 = timeStamp0.getSeconds();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.getNtpTime(2085978496839L);
      assertEquals(3603477561L, timeStamp0.ntpValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.getNtpTime(2085978496000L);
      assertEquals(0L, timeStamp0.ntpValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), 63, (-1053), (-1), 24, 1126);
      TimeStamp timeStamp0 = new TimeStamp(mockDate0);
      long long0 = timeStamp0.getFraction();
      assertEquals(0L, long0);
      assertEquals((-9038947146186883072L), timeStamp0.ntpValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      System.setCurrentTimeMillis(2085978820196L);
      TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
      assertEquals(1392411217494L, timeStamp0.ntpValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      System.setCurrentTimeMillis((-5559L));
      TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
      assertEquals((-8959209444354990015L), timeStamp0.ntpValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      System.setCurrentTimeMillis(2085978496000L);
      TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
      assertEquals(0L, timeStamp0.ntpValue());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
      assertEquals(0L, timeStamp0.getTime());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      long long0 = TimeStamp.decodeNtpHexString("");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      long long0 = TimeStamp.decodeNtpHexString("+F");
      assertEquals(64424509440L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long long0 = TimeStamp.decodeNtpHexString("d6a8f941.51eb851e");
      assertEquals((-2978857094563003106L), long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      try { 
        TimeStamp.decodeNtpHexString("null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"null\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeStamp timeStamp0 = null;
      try {
        timeStamp0 = new TimeStamp("91\"");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"91\"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      long long0 = TimeStamp.getTime((-567L));
      assertEquals(2085978496000L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeStamp timeStamp0 = new TimeStamp(2645L);
      Date date0 = timeStamp0.getDate();
      assertEquals(2085978496000L, timeStamp0.getTime());
      assertEquals("Thu Feb 07 06:28:16 GMT 2036", date0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
      long long0 = timeStamp0.ntpValue();
      assertEquals((-2978857094563003106L), long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
      TimeStamp timeStamp1 = TimeStamp.getNtpTime(0L);
      int int0 = timeStamp0.compareTo(timeStamp1);
      assertEquals(1, int0);
      assertEquals((-2978857094563003106L), timeStamp0.ntpValue());
      assertEquals((-8959209420479266816L), timeStamp1.ntpValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
      MockDate mockDate0 = new MockDate(1266, 1266, 1266, 1266, 1266, 1266);
      TimeStamp timeStamp1 = new TimeStamp(mockDate0);
      int int0 = timeStamp0.compareTo(timeStamp1);
      assertEquals((-2978857094563003106L), timeStamp0.ntpValue());
      assertEquals(2530501962000L, timeStamp1.getTime());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
      int int0 = timeStamp0.compareTo(timeStamp0);
      assertEquals((-2978857094563003106L), timeStamp0.ntpValue());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
      timeStamp0.toUTCString();
      String string0 = timeStamp0.toUTCString();
      assertEquals("Fri, Feb 14 2014 20:21:21.320 UTC", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.parseNtpString("00000000.00000cb1");
      boolean boolean0 = timeStamp0.equals("00000000.00000cb1");
      assertFalse(boolean0);
      assertEquals(3249L, timeStamp0.getFraction());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.parseNtpString("7");
      TimeStamp timeStamp1 = TimeStamp.getCurrentTime();
      boolean boolean0 = timeStamp0.equals(timeStamp1);
      assertEquals((-2978857094563003106L), timeStamp1.ntpValue());
      assertFalse(boolean0);
      assertFalse(timeStamp1.equals((Object)timeStamp0));
      assertEquals(30064771072L, timeStamp0.ntpValue());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      try { 
        TimeStamp.parseNtpString((String) null);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("org.apache.commons.net.ntp.TimeStamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TimeStamp timeStamp0 = new TimeStamp((Date) null);
      // Undeclared exception!
      try { 
        timeStamp0.compareTo((TimeStamp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.ntp.TimeStamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.parseNtpString("00000000.00000cb1");
      long long0 = timeStamp0.getTime();
      assertEquals(2085978496000L, long0);
      assertEquals(3249L, timeStamp0.ntpValue());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
      long long0 = timeStamp0.getSeconds();
      assertEquals((-2978857094563003106L), timeStamp0.ntpValue());
      assertEquals(3601398081L, long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.parseNtpString("00000000.00000cb1");
      String string0 = timeStamp0.toString();
      assertEquals("00000000.00000cb1", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
      long long0 = timeStamp0.getFraction();
      assertEquals(1374389534L, long0);
      assertEquals((-2978857094563003106L), timeStamp0.ntpValue());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TimeStamp timeStamp0 = new TimeStamp("");
      boolean boolean0 = timeStamp0.equals(timeStamp0);
      assertEquals(0L, timeStamp0.ntpValue());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = TimeStamp.toString((-1L));
      assertEquals("ffffffff.ffffffff", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
      timeStamp0.toDateString();
      String string0 = timeStamp0.toDateString();
      assertEquals((-2978857094563003106L), timeStamp0.ntpValue());
      assertEquals("Fri, Feb 14 2014 20:21:21.320", string0);
  }
}
